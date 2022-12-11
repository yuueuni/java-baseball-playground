package study;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class StringTest {
    @Test
    void replace() {
        String actual = "abc".replace("b", "d");
        assertThat(actual).isEqualTo("adc");
    }

    @Test
    void replace1() {
        String[] require = "1,2".split(",");
        String[] require1 = "1".split(",");

        assertThat(require).contains("1", "2");
        assertThat(require1).containsExactly("1");
    }

    @Test
    void replace2() {
        String require2 = "(1,2)".replace("(", "").replace(")", "");
        assertThat(require2).isEqualTo("1,2");
    }

    @Test
    void replace3() {
        String requrie3 = "abc";

    }
}
