import java.util.Scanner;

public class TipTaxCalculator {

    public static void main(String[] args) {
        Scanner answer = new Scanner(System.in);

        System.out.println("Input Bill Amount: ");
        double billAmount = answer.nextDouble();

        System.out.println("Input Tax rate as a percentage: ");
        double taxRate = answer.nextDouble();

        System.out.println("Input Tip rate as a percentage: ");
        double tipRate = answer.nextDouble();

        answer.close();

        double tax = CalculateAmount.calTaxAmount(billAmount,taxRate);
        double tip = CalculateAmount.calTipAmount(billAmount,tipRate);

        System.out.println(
                "Bill amount: " + billAmount + "\nTax Amount: " + CalculateAmount.calTaxAmount(billAmount,taxRate)
        + "\nTip Amount: "+ CalculateAmount.calTipAmount(billAmount,tipRate) +
                        "\nTotal (raw): " +
                CalculateAmount.totalRawBill(billAmount,tip,tax)+ "\nTotal (rounded): " +
                CalculateAmount.totalRoundBill(billAmount,tip,tax));
    }
}
