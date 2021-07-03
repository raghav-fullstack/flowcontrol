public class LabelDemoBreakDemo {
    public static void main(String[] args) {
        int x = 20;

        l1:
        {
            System.out.println("Block begin ");
            if (x == 20) {
                break l1;
            }
            System.out.println("Block ends");

        }
        System.out.println("outside labelled block");
    }
}
