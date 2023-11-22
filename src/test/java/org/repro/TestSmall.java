package org.repro;

import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.List;

@RunWith(Parameterized.class)
public class TestSmall extends TestBase {

    @Parameterized.Parameters(name = "{0}")
    public static List<String> parameters() {
        return List.of(
                "just one"
        );
    }

    public TestSmall(String parameter) {
        super(parameter);
    }
}
