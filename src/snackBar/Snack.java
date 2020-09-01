package snackBar;

public class Snack{
  private static int maxId = 0;
  private int id;
  private String name;
  private int quantity;
  private double cost;
  private int venderId;

  public Snack(String name, int quantity, double cost, int venderId){
    maxId++;
    id = maxId;
    this.name = name;
    this.quantity = quantity;
    this.cost = cost;
    this.venderId = venderId;
  }

  public int getId(){
    return id;
  }
  public String getName(){
    return name;
  }
  public int getQuantity(){
    return quantity;
  }
  public double getCost(){
    return cost;
  }
  public int getVenderId(){
    return venderId;
  }
  public void setName(String name){
    this.name = name;
  }
  public void setCost(double cost){
    this.cost = cost;
  }
  public void setVenderId(int venderId){
    this.venderId = venderId;
  }
  public void addQuantity(int increment){
    quantity += increment;
  }
  public double getTotalCost(int quantity){
    return quantity*cost;
  }
}