package org.apache.jmh;

import cn.hutool.json.JSONUtil;
import com.google.protobuf.InvalidProtocolBufferException;
import org.apache.commons.io.FileUtils;
import org.apache.skywalking.apm.network.language.agent.v3.SegmentObject;
import org.apache.skywalking.apm.network.language.agent.v3.SpanObject;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;

@SpringBootApplication
public class JmhApplication {


    public static void main(String[] args) {

        String dir = System.getProperty("user.dir");

        //读取jmh_trace.json
        String json = null;
        try {
            json = FileUtils.readFileToString(new File(dir + "/test-results/trace/jmh_trace.json"), Charset.defaultCharset());
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("json: " + json);
        List<String> list = JSONUtil.parseArray(json).toList(String.class);
        List<SegmentObject> segmentObjects = new ArrayList<>();
        for (String dataBinary : list) {
            byte[] bytes = Base64.getDecoder().decode(dataBinary);
            SegmentObject segmentObject;
            try {
                segmentObject = SegmentObject.parseFrom(bytes);
            } catch (InvalidProtocolBufferException e) {
                throw new RuntimeException(e);
            }

            segmentObjects.add(segmentObject);

            String traceId = segmentObject.getTraceId();
            System.out.println("traceId: " + traceId);
            List<SpanObject> spansList = segmentObject.getSpansList();
            for (SpanObject spanObject : spansList) {
                System.out.println("spanObject: " + spanObject.getSpanId());
            }
        }

        // 写回/test-results/trace/jmh_trace_result.json
        try {
            FileUtils.write(new File(dir + "/test-results/trace/jmh_trace_result.json"), JSONUtil.toJsonStr(segmentObjects), Charset.defaultCharset(), false);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
