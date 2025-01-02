public class prime {
    public static void main(String a[]) {
        int[] arr = new int[10];
        int count = 0;
        for (int i=2; i<=100; i++) {
            int flag =0;
            for (int j=2; j<=i/2; j++) {
                if (i%j == 0) {
                    flag = 1;
                    break;
                }
            }
            if (count < 10) {
                if (flag==0) {
                    arr[count]=i;
                    count++;
                }
            }
        }
        for (int i=0; i<10; i++) {
            System.out.println(arr[i]);
        }
    }
}