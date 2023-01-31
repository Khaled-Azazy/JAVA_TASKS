public class problem3 {
    public static void main(String[] args) {
        int n = 8;
        int v = 2 * n;
        int spaces = 15;
        for (int i = 1 ; i <= n; ++i){
            for(int j = 0; j < i; ++j){
                System.out.print("* ");
            }
            for(int j = i; j <= v - (2*i) + spaces; ++j){
                System.out.print(" ");
            }
            for (int k = i + v-(2*i)+1; k < i + v-(2*i)+1+i; ++k){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
