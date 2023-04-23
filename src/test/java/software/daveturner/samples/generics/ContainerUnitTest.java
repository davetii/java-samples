package software.daveturner.samples.generics;

import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ContainerUnitTest {

    @Test
    public void ensureUntypedAddFunctionsAsExpected() {
        Container c = new Container();
        c.add("Test 1");
        c.add(4);
        c.add(new HashMap<String, String>());
        assertEquals(3, c.size());

    }

    @Test
    public void ensureTypedAddFunctionsAsExpected() {
        Container<String> c = new Container<>();
        c.add("Test 1");
        c.add("Test 2");
        assertEquals(2, c.size());
    }
}
