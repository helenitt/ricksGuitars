public class Guitar {

  private String serialNumber;
  private Builder builder;
  private String model;
  private Type type;
  private Wood backWood;
  private Wood topWood;
  private double price;

  public Guitar(String serialNumber, double price,
                Builder builder, String model, Type type,
                Wood backWood, Wood topWood) {
    this.setSerialNumber(serialNumber);
    this.setPrice(price);
    this.setBuilder(builder);
    this.setModel(model);
    this.setType(type);
    this.setBackWood(backWood);
    this.setTopWood(topWood);
  }

  public String getSerialNumber() {
    return serialNumber;
  }

  public double getPrice() {
    return price;
  }
  public void setPrice(float newPrice) {
    this.price = newPrice;
  }
  public Builder getBuilder() {
    return builder;
  }
  public String getModel() {
    return model;
  }
  public Type getType() {
    return type;
  }
  public Wood getBackWood() {
    return backWood;
  }
  public Wood getTopWood() {
    return topWood;
  }

  public void setSerialNumber(String serialNumber) {
    this.serialNumber = serialNumber;
  }

  public void setBuilder(Builder builder) {
    this.builder = builder;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public void setType(Type type) {
    this.type = type;
  }

  public void setBackWood(Wood backWood) {
    this.backWood = backWood;
  }

  public void setTopWood(Wood topWood) {
    this.topWood = topWood;
  }

  public void setPrice(double price) {
    this.price = price;
  }
}
