import java.time.LocalDate;

public class BotChienGion extends Material {
    private int quantity;
    public BotChienGion() {
    }
    public BotChienGion(int quantity,int id,String name,int ngaySanXuat,int thangSanXuat,int namSanXuat,int cost) {
        super(id, name, ngaySanXuat, thangSanXuat, namSanXuat, cost);
        this.quantity = quantity;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    @Override
    public double tinhtien() {
        return getQuantity()*super.getCost();
    }

    @Override
    public LocalDate hanSuDung() {
        LocalDate ngaySanXuat = LocalDate.of(getNamSanXuat(),getThangSanXuat(),getNgaySanXuat());
        LocalDate ngayHetHan = ngaySanXuat.plusDays(365);
        return ngayHetHan;
    }

    @Override
    public String toString() {
        return "Bột chiên giòn "+getName()
                +", loại "+getQuantity()+" g"
                +", có giá: "+tinhtien()+" VND"
                +", Ngày sản xuất: "+getNgaySanXuat()+"-"+getThangSanXuat()+"-"+getNamSanXuat();
    }
}
