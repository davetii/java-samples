package software.daveturner.samples.enums;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EnumSingeltonUnitTest {


    @Test
    public void ensureNameIsEqualInBothInstances() {
        EnumSingleton s1 = EnumSingleton.INSTANCE;
        EnumSingleton s2 = EnumSingleton.INSTANCE;
        s1.setName("Bob");
        assertEquals(s1.getName(), "Bob");
        assertEquals(s2.getName(), "Bob");
    }

}
