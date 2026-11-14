public class Assignment01Q02 {
    public static void main(String[] args) {
        double actualPi = Math.PI;
        double approxPi = 0;
        int n = Integer.parseInt(args[0]);
        int count = 1;
        for (int i = 0; i < n; i++){
            if (i % 2 == 0){
                approxPi = approxPi + ((double) 1 / count);    
            } else{
                approxPi = approxPi - ((double) 1 / count);
            }
            count += 2;
        }
        approxPi = approxPi * 4;
        System.out.println(approxPi + " " + actualPi);
    }
}
