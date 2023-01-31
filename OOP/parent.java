class Parent {
    private int num1;
    private int num2;

    public Parent(){
        System.out.println("parent default constructor");
        num1 = num2 = 0;
    }
    public Parent(int a){
        System.out.println("parent one arg parameter constructor");
        num1 = num2 = a;
    }
    public Parent(int a, int b){
        System.out.println("parent two arg parameter constructor");
        num1 = a;
        num2 = b;
    }

    public void setNum1(int n){num1 = n;}
    public void setNum2(int n){num2 = n;}

    
    public int getNum1(){return num1; }
    public int getNum2(){return num2; }

    public int sum(){
        return num1+num2;
    }

}


class Child extends Parent{
    private int num3;

    public Child(){
        System.out.println("child default constructor");
        num3 = 0;
    }
    public Child(int a){
        super(a);
        System.out.println("child one parameter constructor");
        num3 = 0;
    }
    public Child(int a, int b){
        super(a,a);
        System.out.println("child two parameters constructor");
        num3 = b;
    }
    public Child(int a, int b, int c){
        super(a,b);
        System.out.println("child three parameters constructor");
        num3 = c;
    }


    public void setNum1(int n){num3 = n;}
    public int getNum2(){return num3; }

    // overridding the function of the parent
    public int sum(){
        return super.sum() + this.num3;
    }

}
class Main {
    public static void main(String[] args) {
        Child c1 = new Child();
        Child c2 = new Child(1);
        Child c3 = new Child(1,2);
        Child c4 = new Child(1,2,3);


        System.out.println(c1.sum());
        
        System.out.println(c2.sum());
        
        System.out.println(c3.sum());
        
        System.out.println(c4.sum());



    }
}
