class Practice2 { 
    public static void main(String[] args) {
        int t1 = 0;
        int t2 = 1;
        int t3 = 2;
        int total = 0;
        while(t1 < 4000000) {
        t1 = t2;
        t2 = t3;
        t3 = t2 + t1;
        System.out.print(t1 + " ");
        
        if(t1%2 == 0) {
            total += t1;
        }
       
    }
    System.out.println("");
     System.out.print(total);
    }
}