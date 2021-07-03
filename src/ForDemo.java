public class ForDemo {

    public static void main(String[] args) {
        int i=5;
        for (System.out.println("This is initialization block of for loop");i<50; System.out.println("\n increment block") ){
            System.out.println("Iteration started : "+i);
            i+=10;
        }
    }
}

