public class ex_5 {
    private String id;
    private String desc;
    private int qty;
    private double unitPrice;

    public ex_5(String id, String desc, int qty, double unitPrice) {
        this.id = id;
        this.desc = desc;
        this.qty = qty;
        this.unitPrice = unitPrice;
    }

    public String getId() {
        return id;
    }

    public String getDesc() {
        return desc;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public double getTotal() {
        return unitPrice * qty;
    }

    @Override
    public String toString() {
        return "ex_5[id=" + id + ",desc=" + desc + ",qty=" + qty + ",unitPrice=" + unitPrice + "]";
    }

    public static void main(String[] args) {
        ex_5 item1 = new ex_5("A001", "Laptop", 2, 999.99);
        System.out.println("item1: " + item1);
        System.out.println("ID: " + item1.getId());
        System.out.println("Description: " + item1.getDesc());
        System.out.println("Quantity: " + item1.getQty());
        System.out.println("Unit Price: " + item1.getUnitPrice());
        System.out.println("Total: " + item1.getTotal());

        ex_5 item2 = new ex_5("B002", "Mouse", 5, 25.50);
        System.out.println("\nitem2: " + item2);
        System.out.println("Total: " + item2.getTotal());


        System.out.println("\nAfter changing quantity:");
        item1.setQty(3);
        System.out.println("New quantity: " + item1.getQty());
        System.out.println("New total: " + item1.getTotal());


        System.out.println("\nAfter changing unit price:");
        item2.setUnitPrice(29.99);
        System.out.println("New unit price: " + item2.getUnitPrice());
        System.out.println("New total: " + item2.getTotal());


        ex_5 item3 = new ex_5("C003", "Keyboard", 1, 79.99);
        System.out.println("\nitem3: " + item3);
        item3.setQty(2);
        item3.setUnitPrice(69.99);
        System.out.println("After changes:");
        System.out.println("Quantity: " + item3.getQty());
        System.out.println("Unit Price: " + item3.getUnitPrice());
        System.out.println("Total: " + item3.getTotal());
    }
}