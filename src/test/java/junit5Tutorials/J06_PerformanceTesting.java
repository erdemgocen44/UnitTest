package junit5Tutorials;

import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertTimeout;

public class J06_PerformanceTesting {

    @Test
    void performance(){
        assertTimeout(Duration.ofSeconds(1),()-> IntStream.rangeClosed(0,1000)).forEach(System.out::print);//Print süreye dahil değil
        assertTimeout(Duration.ofMillis(100),()->IntStream.rangeClosed(0,100)).forEach(System.out::print);
    }
}
