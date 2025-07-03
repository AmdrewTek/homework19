import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;
import static org.assertj.core.api.Assertions.assertThat;

public class GitHubTest {

  @Test
  void checkTitle() {
    open("https://github.com");
    String title = title();
    assertThat(title).isEqualTo("GitHub · Build and ship software on a single, collaborative platform · GitHub");
  }
}