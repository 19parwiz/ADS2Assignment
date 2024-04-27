package Tests;

import MyCollections.Stack.MyStack;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class MyStackTest {

    private MyStack<Integer> stack;

    @Before
    public void setUp() {
        stack = new MyStack<>();
    }

    @Test
    public void testAddAndPop() {
        stack.add(1);
        stack.add(2);
        stack.add(3);

        assertEquals(3, stack.size());
        assertEquals(Integer.valueOf(3), stack.pop());
        assertEquals(Integer.valueOf(2), stack.pop());
        assertEquals(Integer.valueOf(1), stack.pop());
    }

    @Test
    public void testIsEmptyAndSize() {
        assertTrue(stack.isEmpty());
        assertEquals(0, stack.size());

        stack.add(1);
        assertFalse(stack.isEmpty());
        assertEquals(1, stack.size());

        stack.pop();
        assertTrue(stack.isEmpty());
        assertEquals(0, stack.size());
    }

}
