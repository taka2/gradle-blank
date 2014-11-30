import java.io.InputStream;
import java.io.IOException;
import java.util.Properties;

public class AppProperties {
  private static final String PROPERTY_FILE_NAME = "app.properties";

  private static AppProperties theInstance;
  private Properties props;

  public static synchronized AppProperties getInstance() throws IOException {
    if(theInstance == null) {
      theInstance = new AppProperties();
    }

    return theInstance;
  }

  public AppProperties() throws IOException {
    InputStream is = null;
    try {
      is = ClassLoader.getSystemResourceAsStream(PROPERTY_FILE_NAME);
      if(is == null) {
        throw new IllegalArgumentException("Failed to open app.properties.");
      }

      this.props = new Properties();
      props.load(is);
    } finally {
      if(is != null) {
        is.close();
      }
    }
  }

  public String getHelloWorldPrefix() {
    return this.props.getProperty("helloWorldPrefix");
  }
}
