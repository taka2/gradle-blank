import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.*;
import org.junit.Test;

public class HelloWorldTest {
  @Test
  public void testHello() {
    HelloWorld hw = new HelloWorld();
    assertThat("HelloWorld.hello test", "Hello, World!", is(hw.hello()));
  }
}
