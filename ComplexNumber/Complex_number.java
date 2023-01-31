class ComplexNumber {
    private int real;
    private int imaginary;


    public ComplexNumber(int r, int i){
        real = r;
        imaginary = i;
    }

    public void setReal(int r){
        real = r;
    }
    public void setImaginary(int i){
        imaginary = i;
    }
    public int getReal(){ return real; }
    public int getImaginary() { return imaginary; }
    
    // sum 2 complex numbers it is obj method 
    public static ComplexNumber add(ComplexNumber c1,ComplexNumber c2){
        int realPart = c1.getReal() + c2.getReal();
        int imaginaryPart = c1.getImaginary() + c2.getImaginary();
        return new ComplexNumber(realPart, imaginaryPart);
    }

    /*
     public ComplexNumber newadd(ComplexNumber c){
        int relPart = real + c.getReal();
        int imaginaryPart = imaginary + c.getImaginary();
        return new ComplexNumber(relPart, imaginaryPart);
    }
     */
    


    // sub 2 complex numbers it is obj method 
    public static ComplexNumber subtract(ComplexNumber c1,ComplexNumber c2){
        int realPart = c1.getReal() - c2.getReal();
        int imaginaryPart = c1.getImaginary() - c2.getImaginary();
        return new ComplexNumber(realPart, imaginaryPart);
    }
    // print the current object 
    public void print(){
        System.out.println("The Complex Number is : " + real + " + " + imaginary +"i");
    }
    // this is another way of doing the print function
    public static void printC(ComplexNumber c){
        System.out.println("The Complex Number is : " + c.getReal() + " + " + c.getImaginary() +"i");
    }



}
class Main {
    public static void main(String[] args) {
        ComplexNumber c1 = new ComplexNumber(1, 2);
        ComplexNumber c2 = new ComplexNumber(3, 4);


        ComplexNumber result = ComplexNumber.add(c1, c2);
		result.print();
        result = ComplexNumber.subtract(c1, c2);
        result.print();
    }
}