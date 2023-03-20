package cn.feimaotudou.chatgpt.api.test;

import org.apache.http.HttpStatus;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.junit.Test;

import java.io.IOException;

//单元测试
public class ApiTest {
    //@Test
    //public void query_unanswered_questions(){
        /*CloseableHttpClient httpClient = HttpClientBuilder.create().build();

        HttpGet get = new HttpGet("https://api.zsxq.com/v2/groups/15552551144122/topics?scope=unanswered_questions&count=20");

        get.addHeader("cookie", "zsxq_access_token=48DDF5E9-B5BC-CC1A-7013-AA5B4B2D3EDF_1563861C0A38F392; zsxqsessionid=57a1e128ea6489e380d440aca8affbce; abtest_env=product; sensorsdata2015jssdkcross={\"distinct_id\":\"212554421128521\",\"first_id\":\"186e507fef7579-06a07b9c44d41ac-7452547c-1821369-186e507fef8691\",\"props\":{\"$latest_traffic_source_type\":\"直接流量\",\"$latest_search_keyword\":\"未取到值_直接打开\",\"$latest_referrer\":\"\"},\"identities\":\"eyIkaWRlbnRpdHlfY29va2llX2lkIjoiMTg2ZTUwN2ZlZjc1NzktMDZhMDdiOWM0NGQ0MWFjLTc0NTI1NDdjLTE4MjEzNjktMTg2ZTUwN2ZlZjg2OTEiLCIkaWRlbnRpdHlfbG9naW5faWQiOiIyMTI1NTQ0MjExMjg1MjEifQ==\",\"history_login_id\":{\"name\":\"$identity_login_id\",\"value\":\"212554421128521\"},\"$device_id\":\"186e507fef7579-06a07b9c44d41ac-7452547c-1821369-186e507fef8691\"}");
        get.addHeader("Content-Type", "application/json;charset=utf8");

        CloseableHttpResponse response = httpClient.execute(get);
        if (response.getStatusLine().getStatusCode() == HttpStatus.SC_OK) {
            String res = EntityUtils.toString(response.getEntity());
            System.out.println(res);
        } else {
            System.out.println(response.getStatusLine().getStatusCode());
        }*/


    //}
    @Test
    public void query_unanswered_questions() throws IOException {
        CloseableHttpClient httpClient = HttpClientBuilder.create().build();

        HttpGet get = new HttpGet("https://api.zsxq.com/v2/groups/15552551144122/topics?scope=unanswered_questions&count=20");

        get.addHeader("cookie", "zsxq_access_token=48DDF5E9-B5BC-CC1A-7013-AA5B4B2D3EDF_1563861C0A38F392; zsxqsessionid=57a1e128ea6489e380d440aca8affbce; abtest_env=product; sensorsdata2015jssdkcross={\"distinct_id\":\"212554421128521\",\"first_id\":\"186e507fef7579-06a07b9c44d41ac-7452547c-1821369-186e507fef8691\",\"props\":{\"$latest_traffic_source_type\":\"直接流量\",\"$latest_search_keyword\":\"未取到值_直接打开\",\"$latest_referrer\":\"\"},\"identities\":\"eyIkaWRlbnRpdHlfY29va2llX2lkIjoiMTg2ZTUwN2ZlZjc1NzktMDZhMDdiOWM0NGQ0MWFjLTc0NTI1NDdjLTE4MjEzNjktMTg2ZTUwN2ZlZjg2OTEiLCIkaWRlbnRpdHlfbG9naW5faWQiOiIyMTI1NTQ0MjExMjg1MjEifQ==\",\"history_login_id\":{\"name\":\"$identity_login_id\",\"value\":\"212554421128521\"},\"$device_id\":\"186e507fef7579-06a07b9c44d41ac-7452547c-1821369-186e507fef8691\"}");
        get.addHeader("Content-Type", "application/json;charset=utf8");

        CloseableHttpResponse response = httpClient.execute(get);
        if (response.getStatusLine().getStatusCode() == HttpStatus.SC_OK) {
            String res = EntityUtils.toString(response.getEntity());
            System.out.println(res);
        } else {
            System.out.println(response.getStatusLine().getStatusCode());
        }
    }

    @Test
    public void answer() throws IOException {
        CloseableHttpClient httpClient = HttpClientBuilder.create().build();

        HttpPost post = new HttpPost("https://api.zsxq.com/v2/topics/584188545558584/answer");
        post.addHeader("cookie", "zsxq_access_token=48DDF5E9-B5BC-CC1A-7013-AA5B4B2D3EDF_1563861C0A38F392; zsxqsessionid=57a1e128ea6489e380d440aca8affbce; abtest_env=product; sensorsdata2015jssdkcross={\"distinct_id\":\"212554421128521\",\"first_id\":\"186e507fef7579-06a07b9c44d41ac-7452547c-1821369-186e507fef8691\",\"props\":{\"$latest_traffic_source_type\":\"直接流量\",\"$latest_search_keyword\":\"未取到值_直接打开\",\"$latest_referrer\":\"\"},\"identities\":\"eyIkaWRlbnRpdHlfY29va2llX2lkIjoiMTg2ZTUwN2ZlZjc1NzktMDZhMDdiOWM0NGQ0MWFjLTc0NTI1NDdjLTE4MjEzNjktMTg2ZTUwN2ZlZjg2OTEiLCIkaWRlbnRpdHlfbG9naW5faWQiOiIyMTI1NTQ0MjExMjg1MjEifQ==\",\"history_login_id\":{\"name\":\"$identity_login_id\",\"value\":\"212554421128521\"},\"$device_id\":\"186e507fef7579-06a07b9c44d41ac-7452547c-1821369-186e507fef8691\"}");
        post.addHeader("Content-Type", "application/json;charset=utf8");

        String paramJson = "{\n" +
                "  \"req_data\": {\n" +
                "    \"text\": \"自己去百度！\\n\",\n" +
                "    \"image_ids\": [],\n" +
                "    \"silenced\": false\n" +
                "  }\n" +
                "}";

        StringEntity stringEntity = new StringEntity(paramJson, ContentType.create("text/json", "UTF-8"));
        post.setEntity(stringEntity);

        CloseableHttpResponse response = httpClient.execute(post);
        if (response.getStatusLine().getStatusCode() == HttpStatus.SC_OK) {
            String res = EntityUtils.toString(response.getEntity());
            System.out.println(res);
        } else {
            System.out.println(response.getStatusLine().getStatusCode());
        }



    }

    @Test
    public void test_chatGPT() throws IOException{
        CloseableHttpClient httpClient = HttpClientBuilder.create().build();

        HttpPost post = new HttpPost("https://api.openai.com/v1/chat/completions");
        post.addHeader("Content-Type", "application/json");
        post.addHeader("Authorization", "Bearer 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");

        String paramJson = "{\"model\": \"text-davinci-003\", \"prompt\": \"帮我写一个java冒泡排序\", \"temperature\": 0, \"max_tokens\": 1024}";

        StringEntity stringEntity = new StringEntity(paramJson, ContentType.create("text/json", "UTF-8"));
        post.setEntity(stringEntity);

        CloseableHttpResponse response = httpClient.execute(post);
        if (response.getStatusLine().getStatusCode() == HttpStatus.SC_OK) {
            String res = EntityUtils.toString(response.getEntity());
            System.out.println(res);
        } else {
            System.out.println(response.getStatusLine().getStatusCode());
        }

    }


}
