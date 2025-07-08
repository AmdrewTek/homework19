import com.codeborne.selenide.WebDriverRunner;
import config.WebDriverProvider;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;

public class TestBase {

  @BeforeEach
  public void startDriver() {
    WebDriver driver = new WebDriverProvider().get();
    WebDriverRunner.setWebDriver(driver);

  }

  @AfterEach
  public void stopDriver() {
    WebDriverRunner.closeWebDriver();
  }
}