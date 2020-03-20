import java.util.Scanner;

public class BankMoney {
    public static void main(String[] args) {
        Scanner inputData = new Scanner(System.in);

        double interestMoney=0, firstMoney, rate;
        int month;

        System.out.print("Nhap so tien gui : ");
        firstMoney = inputData.nextFloat();

        System.out.print("Nhap so thang gui : ");
        month = inputData.nextInt();

        System.out.print("Nhap lai suat : ");
        rate = inputData.nextFloat();

        for (int i = 1; i <= month; i++) {
            interestMoney = firstMoney * (rate/100)/12 * month;
        }
        System.out.printf("Tien lai : %-6fl", interestMoney);
    }
}
