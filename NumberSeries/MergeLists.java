
class ListNode {

    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class MergeLists {

    private static ListNode head = null;
    public static java.util.Scanner sc = new java.util.Scanner(System.in);

    public static void addNewNode() {
        System.out.print("Enter Data : ");
        int data = sc.nextInt();
        ListNode newNode = new ListNode(data);
        newNode.next = null;
        if (head == null) {
            head = newNode;
        } else {
            ListNode last = null, temp;
            for (temp = head; temp != null; temp = temp.next) {
                last = temp;
            }
            last.next = newNode;
        }

        System.out.println("New Node Added");
    }

    public static void getTraversal() {
        if (head == null) {
            System.out.println("List is empty!!");
            return;
        }
        ListNode temp = head;
        while (temp != null) {
            System.out.println("Data is " + temp.val);
            System.out.println("--------------------");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        int ch;
        do {
            System.out.println("1. Add new Node");
            System.out.println("2. Traversal ");
            System.out.println("3. Exit");
            System.out.print("Select a choice : ");
            ch = sc.nextInt();
            switch (ch) {
                case 1:
                    addNewNode();
                    break;
                case 2:
                    getTraversal();
                    break;
                default:
                    System.out.println("Exited!!");
                    break;
            }
        } while (ch != 3);
    }

}
