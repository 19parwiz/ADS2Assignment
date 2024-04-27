package Tests;

import MyCollections.Queue.MyQueue;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class MyQueueTest {

    private MyQueue<Integer> queue;

    @Before
    public void setUp() {
        queue = new MyQueue<>();
    }

    @Test
    public void testAddAndPop() {
        queue.add(1);
        queue.add(2);
        queue.add(3);

        assertEquals(3, queue.size());
        assertEquals(Integer.valueOf(3), queue.pop());
        assertEquals(Integer.valueOf(2), queue.pop());
        assertEquals(Integer.valueOf(1), queue.pop());
    }

    @Test
    public void testAddLeftAndPopLeft() {
        queue.addLeft(1);
        queue.addLeft(2);
        queue.addLeft(3);

        assertEquals(3, queue.size());
        assertEquals(Integer.valueOf(3), queue.popLeft());
        assertEquals(Integer.valueOf(2), queue.popLeft());
        assertEquals(Integer.valueOf(1), queue.popLeft());
    }

    @Test
    public void testSizeAndIsEmpty() {
        assertTrue(queue.isEmpty());
        assertEquals(0, queue.size());

        queue.add(1);
        assertFalse(queue.isEmpty());
        assertEquals(1, queue.size());

        queue.pop();
        assertTrue(queue.isEmpty());
        assertEquals(0, queue.size());
    }

}
