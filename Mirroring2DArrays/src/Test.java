public class Test {

    public void test(){
        int a = 1;
        a = changer(a);
        System.out.println(a);
    }

    public int changer(int a){
        a++;
        return a;

    }
}
