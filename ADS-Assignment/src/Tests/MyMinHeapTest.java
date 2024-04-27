package Tests;

import MyCollections.MinHeap.MyMinHeap;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class MyMinHeapTest {

    private MyMinHeap<Integer> minHeap;

    @Before
    public void setUp() {
        minHeap = new MyMinHeap<>();
    }

    @Test
    public void testInsertAndExtractMin() {
        minHeap.insert(3);
        minHeap.insert(2);
        minHeap.insert(4);
        minHeap.insert(1);

        assertEquals(1, (int) minHeap.extractMin());
        assertEquals(2, (int) minHeap.extractMin());
        assertEquals(3, (int) minHeap.extractMin());
        assertEquals(4, (int) minHeap.extractMin());
    }

    @Test
    public void testPeekMin() {
        minHeap.insert(3);
        minHeap.insert(2);
        minHeap.insert(4);
        minHeap.insert(1);

        assertEquals(1, (int) minHeap.peekMin());
        minHeap.extractMin();
        assertEquals(2, (int) minHeap.peekMin());
        minHeap.extractMin();
        assertEquals(3, (int) minHeap.peekMin());
        minHeap.extractMin();
        assertEquals(4, (int) minHeap.peekMin());
    }

    @Test
    public void testIsEmptyAndSize() {
        assertTrue(minHeap.isEmpty());
        assertEquals(0, minHeap.size());

        minHeap.insert(3);
        assertFalse(minHeap.isEmpty());
        assertEquals(1, minHeap.size());

        minHeap.extractMin();
        assertTrue(minHeap.isEmpty());
        assertEquals(0, minHeap.size());
    }

}
