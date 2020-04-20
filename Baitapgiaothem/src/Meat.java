public class Meat extends Material {
    private String donVi;
    private double weight;
    public Meat() {
    }
    public Meat(String donVi,double weight,int id,String name,Date ngaySanXuat,int cost) {
        super(id, name, ngaySanXuat, cost);
        this.donVi = donVi;
        this.weight = weight;
    }
    public String getDonVi() {
        return donVi;
    }
    public void setDonVi(String donVi) {
        this.donVi = donVi;
    }
    public double getWeight() {
        return weight;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }
}
