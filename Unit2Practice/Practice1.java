class Practice1 { 
    public static void main(String[] args) {
        int t = 0;
        for(int i = 0; i < 1000; i++) {
            if(i%3 == 0 || i%5 == 0) t += i;
        }
        System.out.print("Answer: ");
        System.out.print(t);
    }
}