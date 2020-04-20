import java.time.LocalDate;

public abstract class Material {
    private int id;
    private String name;
    private int cost;
    private int ngaySanXuat = 0;
    private int thangSanXuat = 0;
    private int namSanXuat = 0;
    public Material() {
    }
    public Material(int id,String name,int ngaySanXuat,int thangSanXuat,int namSanXuat,int cost) {
        this.id = id;
        this.name = name;
        this.ngaySanXuat = ngaySanXuat;
        this.thangSanXuat = thangSanXuat;
        this.namSanXuat = namSanXuat;
        this.cost = cost;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getNgaySanXuat() {
        return ngaySanXuat;
    }
    public void setNgaySanXuat(int ngaySanXuat) {
        this.ngaySanXuat = ngaySanXuat;
    }
    public int getThangSanXuat() {
        return thangSanXuat;
    }
    public void setThangSanXuat(int thangSanXuat) {
        this.thangSanXuat = thangSanXuat;
    }
    public int getNamSanXuat() {
        return namSanXuat;
    }
    public void setNamSanXuat(int namSanXuat) {
        this.namSanXuat = namSanXuat;
    }
    public int getCost() {
        return cost;
    }
    public void setCost(int cost) {
        this.cost = cost;
    }
    public abstract double tinhtien();
    public abstract LocalDate hanSuDung();
}
