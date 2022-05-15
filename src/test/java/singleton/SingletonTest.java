package singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SingletonTest {

    @Test
    void shouldCreateOnlyOneInstance() throws InterruptedException {
        Singleton singleton = Singleton.getInstance();
        Thread.sleep(1000);
        Singleton singleton2 = Singleton.getInstance();
        assertEquals(singleton.getEpoch(), singleton2.getEpoch());
    }
}