package weather;

import com.google.api.client.http.HttpTransport;
import com.google.api.client.http.javanet.NetHttpTransport;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.json.jackson2.JacksonFactory;

/**
 * Write a description of class weather here
 *
 * @author Matthew
 * @version 1/28/2017
 */
public class WeatherFetcher
{

    private static final String API_KEY = "b78e47464fc1efb5ecd7bb06549343a5";

    static final HttpTransport HTTP_TRANSPORT = new NetHttpTransport();
    static final JsonFactory JSON_FACTORY = new JacksonFactory();

    public WeatherFetcher()
    {
    }
}
