class Practice3 {
    public static void main(String[] args) {
        int sumSquare = 0;
       // int squareSum = 0;
        int sum = 0;
        for(int i = 0; i <= 100; i++) {
            sumSquare += Math.pow(i, 2);
        }

        for(int j = 0; j <= 100; j++) {
            sum += j;
        }
        
        System.out.println(Math.pow(sum, 2) - sumSquare);
    }
}   