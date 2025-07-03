import com.codeborne.selenide.WebDriverRunner;
import config.WebDriverProvider;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

public class TestBase {

  @BeforeEach
  public void startDriver() {
    new WebDriverProvider().get();
  }

  @AfterEach
  public void stopDriver() {
    WebDriverRunner.closeWebDriver();
  }
}