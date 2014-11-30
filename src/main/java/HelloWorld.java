import java.io.IOException;

public class HelloWorld {
  public String hello() {
    return "Hello, World!";
  }
  
  public String helloWithPrefix() {
    String prefix = "";
    try {
      prefix = AppProperties.getInstance().getHelloWorldPrefix();
    } catch(IOException e) {
      // ignore 
    }
    return prefix + hello();
  }

  public boolean stringEqualsAbc(String str) {
    return "abc" == str;
  }
}
