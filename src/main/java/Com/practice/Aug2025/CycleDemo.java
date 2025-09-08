package Com.practice.Aug2025;

import java.lang.reflect.InvocationTargetException;

class ListNode {
    int val;
    ListNode next;
    ListNode(int v) { this.val = v; }
}

public class CycleDemo {

    // Detects if a cycle exists
    public static boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) return false;
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;          // 1 step
            fast = fast.next.next;     // 2 steps
            if (slow == fast) return true;
        }
        return false;
    }

    // Returns the entry node of the cycle; null if none
    public static ListNode detectCycleStart(ListNode head) {
        if (head == null || head.next == null) return null;

        ListNode slow = head, fast = head;
        // Phase 1: meet if a cycle exists
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                // Phase 2: find entry
                ListNode p1 = head, p2 = slow;
                while (p1 != p2) {
                    p1 = p1.next;
                    p2 = p2.next;
                }
                return p1; // entry
            }
        }
        return null;
    }

    // Optional: cycle length (k), 0 if no cycle
    public static int cycleLength(ListNode head) {
        if (head == null || head.next == null) return 0;
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                int len = 1;
                fast = fast.next;
                while (fast != slow) {
                    fast = fast.next;
                    len++;
                }
                return len;
            }
        }
        return 0;
    }

    public static void main(String[] args) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
        //testing purpose
    	ListNode head2 = ListNode.class.getDeclaredConstructor().newInstance();
    	// Build: 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        // Create cycle: 5 -> 3
        head.next.next.next = head.next.next; // safe to post inside ```java

        System.out.println("Has cycle? " + hasCycle(head));
        ListNode entry = detectCycleStart(head);
        System.out.println("Cycle starts at: " + (entry != null ? entry.val : "null"));
        System.out.println("Cycle length: " + cycleLength(head));
    }
}
