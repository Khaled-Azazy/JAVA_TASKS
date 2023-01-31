import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) {
        String s = args[0];
        IPCutter ip = new IPCutter(s);
        //ip.splitUsinSplit();
        //ip.splitUsingToknizer();
        ip.splitUsingsubstr(); 
    }
}

class IPCutter{
    private String IP;
    public IPCutter(String s){
        this.IP = s;
    }

    void splitUsingToknizer(){
        StringTokenizer st = new StringTokenizer(IP,".");
        while (st.hasMoreTokens()){
            System.out.println(st.nextToken());
        }
    }


    public void splitUsinSplit(){
        String[] parts = IP.split("\\.");
        for (int i = 0; i < parts.length; ++i){
            System.out.println(parts[i]);
        }
    }
    public void splitUsingsubstr(){
        int start_ind = 0;
        while (start_ind < IP.length()){
            // indexof(char, start index)
            int i = IP.indexOf('.', start_ind);
            if (i == -1) {
                System.out.println(IP.substring(start_ind));
                break;
            }
            else {
                System.out.println(IP.substring(start_ind, i));
            }
            start_ind = i+1;
        }
    }


}