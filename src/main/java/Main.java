import org.apache.commons.codec.digest.Crypt;

public class Main {
  public static void main(String[] args) {
    HelloWorld hw = new HelloWorld();
    System.out.println(hw.helloWithPrefix());
    System.out.println(new Crypt().crypt("aaa"));
  }
}
