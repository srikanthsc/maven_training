package fr.lernejo;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.function.BiFunction;

import static org.junit.jupiter.api.Assertions.*;
import static java.util.function.Predicate.isEqual;


class SampleTest {

    @Test
    void add_test() {
        Sample s = new Sample();
        Sample.Operation operation = Sample.Operation.ADD;
        int a = 10;
        int b = 10;

        int result = s.op(operation, a, b);

        Assertions.assertThat(result)
        .isEqualTo(20);
    }

    @Test
    void mult_test(){
        Sample s = new Sample();
        Sample.Operation operation = Sample.Operation.MULT;
        int a = 2;
        int b = 3;

        int result = s.op(operation, a, b);

        Assertions.assertThat(result)
        .isEqualTo(6);
    }

    @Test
    void test_factorielle() {
        Sample s = new Sample();
        int n = 10;
        int result = s.fact(n);
        Assertions.assertThat(result).as("fact of ten")
            .isEqualTo(3628800);
    }

    @Test
    void bad_arg() {
        Sample s = new Sample();
        int n = -1;
        org.assertj.core.api.Assertions.assertThatExceptionOfType(IllegalArgumentException.class)
            .isThrownBy(() -> s.fact(n));
    }
    }
