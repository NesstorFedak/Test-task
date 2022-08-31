package zadanie3.servicee;

import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import java.io.IOException;

public class HttpClientService {
    private final CloseableHttpClient httpClient = HttpClients.createDefault();

    public <T> T get(String url, Class<T> clazz) {
        HttpGet request = new HttpGet(url);
        String result = new String();
        try (CloseableHttpResponse response = httpClient.execute(request)) {
            HttpEntity entity = response.getEntity();
            if (entity != null) {
                result = EntityUtils.toString(entity);
            }
            return (T) result;
        } catch (IOException e) {
            throw new RuntimeException("Can't get info from url" + url);
        }
    }
}
