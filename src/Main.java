public class Main
{

    public static void main(String[] args)
    {
     double creditCardBal = 5000.0;
     double interestRate = .17;
     double oneMonth = 0;
     double totalOne =0;
     double twoMonth = 0;
     double totalTwo = 0;

     oneMonth = creditCardBal * interestRate;
     totalOne = oneMonth + creditCardBal;
     twoMonth = totalOne * interestRate;
     totalTwo = twoMonth + totalOne;

     System.out.println("The interest due after one month is " + oneMonth + " and after two months it is " + twoMonth);
     System.out.println("The total balance after one month is " + totalOne + " and after two months is " + totalTwo);
    }
}
