package pradyunjava;

public class ScopeCheck {
    public int publicVar = 0;
    private int var1 = 1;

    public ScopeCheck() {
        System.out.println("Scope Check created, publicVar = " + publicVar
                + " var1 = " + var1);
    }

    public int getVar1() {
        return var1;
    }

    public void timesTwo() {
        int var2 = 2;
        for(int i = 0; i<10;i++){
            System.out.println(i + " time 2 is " + i*var2);
        }
    }

    public void useInner(){
        InnerClass innerClass = new InnerClass();
        System.out.println("var3 from outer class: " + innerClass.var3);
    }

    public class InnerClass {
        private int var3 = 3;

        public InnerClass() {
            System.out.println("Inner Class created, var1 is " + var1
            + "var3 is " + var3);
        }

        public void timesTwo() {
            for (int i = 0; i < 10; i++) {
                System.out.println(i + " time 2 is " + i * var3);
            }
        }
    }
}
