package browserService;

import java.io.IOException;
import java.util.Properties;

public class ReadNewProperties {
    protected Properties properties;

    public ReadNewProperties() {
        properties = new Properties();
        try {
            properties.load(getClass().getClassLoader().getResourceAsStream("newConfig.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getURL() {
        return properties.getProperty("URL");
    }

    public String getApiURL() {
        return properties.getProperty("apiURL");
    }

    public String getBrowserName() {
        return properties.getProperty(  "browserType");
    }

    public boolean isHeadless() {
        return properties.getProperty("headless").equalsIgnoreCase("true");
    }

    public int getTimeOut() {
        return Integer.parseInt(properties.getProperty("timeout"));
    }

}
