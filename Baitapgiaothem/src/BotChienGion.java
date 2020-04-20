public class BotChienGion extends Material {
    private int quantity;
    public BotChienGion() {
    }
    public BotChienGion(int quantity,int id,String name,Date ngaySanXuat,int cost) {
        super(id, name, ngaySanXuat, cost);
        this.quantity = quantity;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    @Override
    public int tinhtien() {
        return this.quantity*super.getCost();
    }

    @Override
    public Date hanSuDung() {
        return null;
    }
}
