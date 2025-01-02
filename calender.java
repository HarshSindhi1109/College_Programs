import java.util.Scanner;

public class calender {
    public static void main(String a[]) {
        Scanner sc = new Scanner(System.in);
        int days, months, years, remainDays;
        System.out.print("Enter total number of days=");
        days = sc.nextInt();
        years = days/365;
        if(years < 1) {
            months = days/30;
            remainDays = days%30;
            System.out.println(years+" year, "+months+" months and "+remainDays+" days");
        }
        else {
            months = days/30;
            remainDays = days%30;
            if(months%12 == 0) {
                months = 0;
            }
            else if(months>12) {
                years = months/12;
                months = months%12;
            }
            else {
                months = months - 12;
            }
            System.out.println(years+" years, "+"Months="+months+" Rdays="+remainDays);
            sc.close();
        }
    }
}