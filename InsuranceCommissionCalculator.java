import java.util.Scanner;
public class InsuranceCommissionCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the sales amount: ");
        double salesAmount = scanner.nextDouble();
        
        double commission = calculateCommission(salesAmount);
        
        System.out.println("The commission for the insurance agent is: " + commission);
        
        scanner.close();
    }
    
    public static double calculateCommission(double salesAmount) {
        double commissionRate;
        
        if (salesAmount >=0 & salesAmount<=10000) {
            commissionRate = 0;
        } else if (salesAmount >= 10001 & salesAmount<=20000) {
            commissionRate = 0.10;
        } else if (salesAmount >=20001 & salesAmount <= 30000) {
            commissionRate = 0.15;
        } else {
            commissionRate = 0.20;
        }
        
        return salesAmount * commissionRate;
    }
}