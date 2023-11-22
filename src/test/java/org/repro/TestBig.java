package org.repro;

import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.List;

@RunWith(Parameterized.class)
public class TestBig extends TestBase {

    @Parameterized.Parameters(name = "{0}")
    public static List<String> parameters() {
        return List.of(
                "an",
                "entire",
                "book",
                "worth",
                "of",
                "strings"
        );
    }

    public TestBig(String parameter) {
        super(parameter);
    }
}
