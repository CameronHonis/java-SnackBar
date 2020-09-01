package snackBar;

public class Main{
  public static void main(String[] args){
    //Snack(String name, int quantity, double cost, int venderId)
    //VendingMachine(String name)
    //Customer(String name, double handCash)
    Customer c1 = new Customer("Jane", 45.25);
    Customer c2 = new Customer("Bob", 33.14);

    VendingMachine v1 = new VendingMachine("Food");
    VendingMachine v2 = new VendingMachine("Drink");
    VendingMachine v3 = new VendingMachine("Office");

    Snack s1 = new Snack("Chips", 36, 1.75, v1.getId());
    Snack s2 = new Snack("Chocolate Bar", 36, 1, v1.getId());
    Snack s3 = new Snack("Pretzel", 30, 2, v1.getId());
    Snack s4 = new Snack("Soda", 24, 2.5, v2.getId());
    Snack s5 = new Snack("Water", 20, 2.75, v2.getId());

    c1.buy(s4, 3);
    System.out.println(formatDollar(c1.getHandCash()));
    System.out.println(s4.getQuantity());
    c1.buy(s3, 1);
    System.out.println(formatDollar(c1.getHandCash()));
    System.out.println(s3.getQuantity());
    c2.buy(s4, 2);
    System.out.println(formatDollar(c2.getHandCash()));
    System.out.println(s4.getQuantity());
    c1.addCash(10);
    System.out.println(formatDollar(c1.getHandCash()));
    c1.buy(s2, 1);
    System.out.println(formatDollar(c1.getHandCash()));
    System.out.println(s2.getQuantity());
    s3.addQuantity(12);
    System.out.println(s3.getQuantity());
    c2.buy(s3, 3);
    System.out.println(formatDollar(c2.getHandCash()));
    System.out.println(s3.getQuantity());
  }

  public static String formatDollar(double amount){
    amount = (double Math.round(100*amount))/100;
    return "$"+amount;
  }
}