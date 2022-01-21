public class Shirt {
  public int shirtID = 51242;
  public String description = "Футболка для бігу";
  public String colorCode = "red";
  public double price = 10.0; 
  public int quantityInStock = 17;
  

  public void displayShirtInformation() {
    System.out.println("Shirt ID: " + shirtID);
    System.out.println("Shirt description:" + description);
    System.out.println("Color Code: " + colorCode);
    System.out.println("Shirt price: $" + price);
    System.out.println("Quantity in stock: " + quantityInStock);
  }
} 