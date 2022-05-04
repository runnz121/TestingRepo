package com.example.demo.test;

import org.assertj.core.api.Assert;
import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest
public class TestCase {

    private static final Long sampleLong = 1L;
    private static final Integer sampleInteger = 1;
    private static final int sampleInt = 2;
    private static final long samplelong = 2L;
    private static final Long underScore = 2_00L;
    private static final Long nonUnderScore = 200L;

    @DisplayName("Numeric underscore test")
    @Test
    public void underScore() {
        assertThat(underScore).isEqualTo(200);
        assertThat(nonUnderScore).isEqualTo(2_00);
    }
}
