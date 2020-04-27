
public class ScopeCheck {
    public int publicVar = 0;
    private int var1 = 1;

    public ScopeCheck() {
        System.out.println("ScopeCheck created, publicVar = " + publicVar + ": privateVar = " + var1);
    }

    public int getVar1() {
        return var1;
    }

    public void timesTwo() {
        int var2 = 2;

        for (int i = 0; i < 10; i++) {
            System.out.println(i + " times two is " + i * var2);
        }
        System.out.println("============================");
        for (int i = 0; i < 10; i++) {
            System.out.println(i + " times two is " + i * this.var1);
        }
    }

    //the containing class has access to all of the methods and fields of a contained class even if they're marked as private
    //So from Scopecheck() we have access to the variables inside InsideClass()
    public void useInner() {
        InnerClass innerClass = new InnerClass();

        System.out.println("acessing varThree while in the outer class: " + innerClass.var3);
    }

    public class InnerClass {
        public int var3 = 3;

        public InnerClass() {
            System.out.println("InnerClass created, var1 is " + var1 + " and var3 is " + var3);
        }

        public void timesTwo() {
            System.out.println("varOne is still available here " + var1);
            for (int i = 0; i < 10; i++) {
                System.out.println(i + " times two is " + i * var3);
//                We can also use the privateVar from the Outer Class as well
//                System.out.println(i + " times two is " + i * ScopeCheck.this.privateVar);
            }
        }
    }
}
