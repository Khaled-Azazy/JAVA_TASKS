// free floating block
class Main {
    public static void main(String[] args) {
		if (args.length < 3){
			System.out.println("Not enough arguments"); 
            return ;
		}
        else if (args.length > 3){
            System.out.println("more than 3 arguments are enterd "); 
            return ;
        }
        calculator c = new calculator(args);
        double ans = c.calc();
        System.out.println("the answer = " + ans);
    }
}


class calculator {

    private String[] arg_list;

    public calculator (String[] args){
        arg_list = new String[3];
        arg_list = args;
    }

    private double add(double a, double b){
        return a + b;
    }

    private double sub(double a, double b){
        return a - b;
    }
    private double mul(double a, double b){
        return a * b;
    }
    private double div(double a, double b){
        return a / b;
    }

    private double convert(String val){
        return Double.parseDouble(val);
    }

    public double calc(){
        double firstNum = convert(arg_list[0]);
        double secondNum = convert(arg_list[2]);
        double res = 0.0;
        if (arg_list[1].equals("+")){
            res = add(firstNum, secondNum);
        }
        else if (arg_list[1].equals("-")){
            res = sub(firstNum, secondNum);

        }
        else if (arg_list[1].equals("x")){
            res = mul(firstNum, secondNum);

        }
        else if (arg_list[1].equals("/")){
            res = div(firstNum, secondNum);

        }
        else {
            System.out.println("illegal operation");
        }
        return res;
    }




}
