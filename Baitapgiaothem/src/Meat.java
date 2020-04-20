import java.time.LocalDate;

public class Meat extends Material {
    private int donVi;
    private double weight;
    public Meat() {
    }
    public Meat(int donVi,double weight,int id,String name,int ngaySanXuat,int thangSanXuat,int namSanXuat,int cost) {
        super(id, name, ngaySanXuat, thangSanXuat, namSanXuat, cost);
        this.donVi = donVi;
        this.weight = weight;
    }
    public int getDonVi() {
        return this.donVi;
    }
    public void setDonVi(int donVi) {
        this.donVi = donVi;
    }
    public double getWeight() {
        return this.weight;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }
    @Override
    public double tinhtien() {
        return this.weight*super.getCost()*this.donVi;
    }

    @Override
    public LocalDate hanSuDung() {
        LocalDate ngayXeThit = LocalDate.of(getNamSanXuat(),getThangSanXuat(),getNgaySanXuat());
        LocalDate ngayHetHan = ngayXeThit.plusDays(15);
        return ngayHetHan;
    }
    public String toString() {
        return "Thịt "+getName()
                +", khối lượng: "+getWeight()+" kg"
                +", có giá: "+tinhtien()+" VND"
                +", ngày xẻ thịt : "+getNgaySanXuat()+"-"+getThangSanXuat()+"-"+getNamSanXuat();
    }
}
