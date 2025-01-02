class firstNprime {
    public static void main(String args[]) {
        int count = 0, flag, i, j, a=0;
        for (i=2; i<=100; i++) {
            flag = 0;
            for (j=2; j<=i/2; j++) {
                if (i%j == 0) {
                    flag = 1;
                    break;
                }
            }
            if (count < 15) {
                if (flag == 0) {
                    a = a + i;
                    count++;                        
                }
            }
        }
        System.out.println("addition = "+a);
    }
}