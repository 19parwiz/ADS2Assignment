package Tests;

import MyCollections.ArrayList.MyArrayList;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MyArrayListTest {

    private MyArrayList<Integer> list;

    @Before
    public void setUp() {
        list = new MyArrayList<>();
    }

    @Test
    public void testAddAndGet() {
        list.add(0, 1);
        list.add(1, 2);
        list.add(2, 3);

        assertEquals(3, list.size());
        assertEquals(Integer.valueOf(1), list.get(0));
        assertEquals(Integer.valueOf(2), list.get(1));
        assertEquals(Integer.valueOf(3), list.get(2));
    }

    @Test
    public void testAddFirstAndLast() {
        list.addFirst(1);
        list.addFirst(2);
        list.addLast(3);

        assertEquals(3, list.size());
        assertEquals(Integer.valueOf(2), list.getFirst());
        assertEquals(Integer.valueOf(1), list.get(1));
        assertEquals(Integer.valueOf(3), list.getLast());
    }

    @Test
    public void testRemove() {
        list.add(0, 1);
        list.add(1, 2);
        list.add(2, 3);

        list.remove(1);

        assertEquals(2, list.size());
        assertEquals(Integer.valueOf(1), list.get(0));
        assertEquals(Integer.valueOf(3), list.get(1));
    }

    @Test
    public void testRemoveFirst() {
        list.add(0, 1);
        list.add(1, 2);
        list.add(2, 3);

        list.removeFirst();

        assertEquals(2, list.size());
        assertEquals(Integer.valueOf(2), list.get(0));
        assertEquals(Integer.valueOf(3), list.get(1));
    }

    @Test
    public void testRemoveLast() {
        list.add(0, 1);
        list.add(1, 2);
        list.add(2, 3);

        list.removeLast();

        assertEquals(2, list.size());
        assertEquals(Integer.valueOf(1), list.get(0));
        assertEquals(Integer.valueOf(2), list.get(1));
    }

    @Test
    public void testSort() {
        list.add(0, 3);
        list.add(1, 1);
        list.add(2, 2);

        list.sort();

        assertEquals(Integer.valueOf(1), list.get(0));
        assertEquals(Integer.valueOf(2), list.get(1));
        assertEquals(Integer.valueOf(3), list.get(2));
    }

    @Test
    public void testIndexOf() {
        list.add(0, 1);
        list.add(1, 2);
        list.add(2, 3);

        assertEquals(1, list.indexOf(2));
        assertEquals(-1, list.indexOf(4));
    }

    @Test
    public void testLastIndexOf() {
        list.add(0, 1);
        list.add(1, 2);
        list.add(2, 2);

        assertEquals(2, list.lastIndexOf(2));
        assertEquals(-1, list.lastIndexOf(4));
    }

    @Test
    public void testExists() {
        list.add(0, 1);
        list.add(1, 2);
        list.add(2, 3);

        assertTrue(list.exists(2));
        assertFalse(list.exists(4));
    }

    @Test
    public void testToArray() {
        list.add(0, 1);
        list.add(1, 2);
        list.add(2, 3);

        Object[] arr = list.toArray();

        assertEquals(3, arr.length);
        assertEquals(Integer.valueOf(1), arr[0]);
        assertEquals(Integer.valueOf(2), arr[1]);
        assertEquals(Integer.valueOf(3), arr[2]);
    }

    @Test
    public void testClear() {
        list.add(0, 1);
        list.add(1, 2);
        list.add(2, 3);

        list.clear();

        assertEquals(0, list.size());
    }

    @Test
    public void testSet() {
        list.add(0, 1);
        list.add(1, 2);
        list.add(2, 3);

        list.set(1, 5);

        assertEquals(Integer.valueOf(5), list.get(1));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testIndexOutOfBoundsException() {
        list.add(1, 1);
    }

}
