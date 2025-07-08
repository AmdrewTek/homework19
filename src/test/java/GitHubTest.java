import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;
import static org.assertj.core.api.Assertions.assertThat;

public class GitHubTest extends TestBase {

  @Test
  void checkTitle() {
    open("https://github.com");
    String title = title();
    assertThat(title).contains("Build and ship software");
  }
}