public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        if(5%-1==0){

            System.out.println("yess meri jaan ...");
        }
        Male m=new Male();
        m.sayS();
        Human ml=new Human() {
            @Override
            public void sayS() {
                System.out.println("hello ");
            }
        };
        ml.sayS();
    }
}