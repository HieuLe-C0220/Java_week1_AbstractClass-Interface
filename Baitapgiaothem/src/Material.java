public abstract class Material {
    private int id;
    private String name;
    private Date ngaySanXuat = new Date();
    private int cost;
    public Material() {
    }
    public Material(int id,String name,Date ngaySanXuat,int cost) {
        this.id = id;
        this.name = name;
        this.ngaySanXuat = ngaySanXuat;
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
    public Date getNgaySanXuat() {
        return ngaySanXuat;
    }
    public void setNgaySanXuat(Date ngaySanXuat) {
        this.ngaySanXuat = ngaySanXuat;
    }
    public int getCost() {
        return cost;
    }
    public void setCost(int cost) {
        this.cost = cost;
    }
    public abstract int tinhtien();
    public abstract Date hanSuDung();
}
