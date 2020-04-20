public class Test {
    public static void main(String[] args) {
        BotChienGion botChienGion = new BotChienGion(300,1005,"Aji-Quick",20,10,2019,200);
        System.out.println(botChienGion);
        System.out.println("Hạn sử dụng: "+botChienGion.hanSuDung());
        Meat meat = new Meat(1,0.3,2005,"Thịt lợn",19,4,2020,80000);
        System.out.println(meat);
        System.out.println("Hạn sử dụng: "+meat.hanSuDung());
    }
}
