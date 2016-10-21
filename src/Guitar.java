public class Guitar {

  private String serialNumber;
  private double price;
  private GuitarSpec spec;

  public Guitar(String serialNumber, double price, GuitarSpec spec) {
    this.setSerialNumber(serialNumber);
    this.setPrice(price);
    this.spec =spec;
  }

  public String getSerialNumber() {
    return serialNumber;
  }
  public double getPrice() {
    return price;
  }
  public GuitarSpec getSpec() { return spec; }

  public void setPrice(float newPrice) { this.price = newPrice; }
  public void setSerialNumber(String serialNumber) {
    this.serialNumber = serialNumber;
  }
  public void setPrice(double price) {
    this.price = price;
  }
}
