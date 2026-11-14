public class Assignment01Q03 {
    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]);
        System.out.println("The first " + x + " Fibonacci numbers are:");

        int a = 1;
        int b = 1;
        
        int numOdd = 0;
        for (int i = 0; i < x; i++) {
            System.out.print(a);
            if (i < x - 1) 
                System.out.print(" ");
            if (a % 2 == 1){
                numOdd++;
            }
            int next = a + b;
            a = b;
            b = next;   
            
        }
        System.out.println();
        
        System.out.println("The number of odd numbers is: " + numOdd);
    }
}
