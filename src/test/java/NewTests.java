import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;

public class NewTests {
    @Test
    void newSuccessfulSearchTest() {
        open("https://www.yandex.ru/");
    }
}
