// https://www.codecademy.com/courses/learn-java/projects/loan-payment-calculator
// A program that calculates car payment.
public class CarLoan {
    public static void main(String[] args) {
        // Q1 - Q4
        int carLoan = 10000;
        int loanLength = 3;
        int interestRate = 5;
        int downPayment = 2000;

        // Q5
        if (loanLength <= 0 || interestRate <= 0) {
            // Q6
            System.out.println("Error! You must take out a valid car loan.");
        } else if (downPayment >= carLoan) { // Q7 - Q15
            System.out.println("The car can be paid in full.");
        } else { // Q9 Q10
            int remainingBalance = carLoan - downPayment;
            int months = loanLength * 12;
            int monthlyBalance = remainingBalance / months;
            int interest = (monthlyBalance * interestRate) / 100;
            int monthlyPayment = monthlyBalance + interest;
            System.out.println(monthlyPayment);
        }



    }
}