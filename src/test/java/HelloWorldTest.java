import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.junit.*;

public class HelloWorldTest {
  private HelloWorld hw;

  @Before
  public void before() {
    hw = new HelloWorld();
  }

  @Test
  public void testHello() {
    assertThat("HelloWorld.hello test", "Hello, World!", is(hw.hello()));
  }

  @Test
  public void testStringEqualsAbc() {
    assertThat("HelloWorld.stringEqualsAbc test", true, is(hw.stringEqualsAbc("abc")));
  }
}
