import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.junit.*;

public class MainTest {
  @Test
  public void testMain() {
    try {
      String[] args = {};
      Main.main(args);
    } catch(Exception e) {
      fail();
    }
  }
}
