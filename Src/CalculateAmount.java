public class CalculateAmount {

    public static double calTaxAmount(double bill, double taxRate) {
        return bill * (taxRate / 100);
    }

    public static double calTipAmount(double bill, double tipRate) {
        return bill * (tipRate / 100);
    }

    public static double totalRawBill(double bill, double tipAmount, double taxAmount) {
        return bill + tipAmount + taxAmount;
    }

    public static long totalRoundBill(double bill, double tipAmount, double taxAmount){
        return Math.round(bill + tipAmount + taxAmount);
    }
}
