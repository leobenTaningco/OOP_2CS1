public class Order {
    public String item;
    public int quantity;
    public double unitPrice;
    public double totalAmount = 0.0;
    private PaymentMode specific;

    public void setSpecific(PaymentMode specific){
        this.specific = specific;
    }

    public PaymentMode getSpecific(){
        return specific;
    }

    public void setItem(String item){
        this.item = item;
    }

    public String getItem(){
        return item;
    }

    public void setQuantity(int quantity){
        this.quantity = quantity;
    }

    public int getQuantity(){
        return quantity;
    }

    public void setUnitPrice(double unitPrice){
        this.unitPrice = unitPrice;
    }

    public double getUnitPrice(){
        return unitPrice;
    }

    public void setTotalAmount(double unitPrice, int quantity){
        totalAmount = unitPrice * quantity;
    }

    public double getTotalAmount(){
        return totalAmount;
    }

    public Order(){

    }

    public Order(String item, double unitPrice, int quantity){
        this.item = item;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
        setTotalAmount(unitPrice, quantity);
    }

}
