package snackBar;

public class Customer{
  private static int maxId = 0;
  private int id;
  private String name;
  private double handCash;

  public Customer(String name, double handCash){
    maxId++;
    id = maxId;
    this.name = name;
    this.handCash = handCash;
  }

  public int getId(){
    return id;
  }
  public double getHandCash(){
    return handCash;
  }
  
  public void setName(String name){
    this.name = name;
  }

  public void addCash(double amount){
    handCash += amount;
  }
  public void buy(Snack snack, int quantity){
    handCash -= snack.getTotalCost(quantity);
    snack.addQuantity(-quantity);
  }
}