import edu.princeton.cs.algs4.Queue;

import org.junit.Test;
import static org.junit.Assert.*;

public class TestSortAlgs {

    @Test
    public void testQuickSort() {

    }

    @Test
    public void testMergeSort() {
        Queue<Integer> nums = new Queue<>();
        nums.enqueue(10);
        nums.enqueue(30);
        nums.enqueue(25);
        nums.enqueue(15);
        nums.enqueue(5);
        Queue<Integer> sorted = MergeSort.mergeSort(nums);

        assertEquals(5, (int) sorted.dequeue());
        assertEquals(10, (int) sorted.dequeue());
        assertEquals(15, (int) sorted.dequeue());
        assertEquals(25, (int) sorted.dequeue());
        assertEquals(30, (int) sorted.dequeue());

        Queue<String> tas = new Queue<>();
        tas.enqueue("Joe");
        tas.enqueue("Omar");
        tas.enqueue("Itai");
        Queue<String> sortedTas = MergeSort.mergeSort(tas);

        assertEquals("Itai", sortedTas.dequeue());
        assertEquals("Joe", sortedTas.dequeue());
        assertEquals("Omar", sortedTas.dequeue());

    }

    /**
     * Returns whether a Queue is sorted or not.
     *
     * @param items  A Queue of items
     * @return       true/false - whether "items" is sorted
     */
    private <Item extends Comparable> boolean isSorted(Queue<Item> items) {
        if (items.size() <= 1) {
            return true;
        }
        Item curr = items.dequeue();
        Item prev = curr;
        while (!items.isEmpty()) {
            prev = curr;
            curr = items.dequeue();
            if (curr.compareTo(prev) < 0) {
                return false;
            }
        }
        return true;
    }
}