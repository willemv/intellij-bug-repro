package org.repro;

import org.junit.Assert;
import org.junit.Test;

public abstract class TestBase {

    private final String parameter;

    public TestBase(String parameter) {
        this.parameter = parameter;
    }

    @Test
    public void testParameterNotEmpty() {
        Assert.assertFalse("bogus assertion", parameter.isEmpty());
    }
}
