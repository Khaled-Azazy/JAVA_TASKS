class Student{
    private String name;
    private int age;
    private String track;

    public Student(String n, int a, String t){
        name = n;
        age = a;
        track = t;
    }
    public void setName(String n){
        name = n;
    }
    public void setage(int a){
        age = a;
    }
    public void setTrack(String t){
        track = t;
    }

    public String getName(){ return name; }
    public int getage(){ return age; }
    public String getTrack(){ return track;}


    public static void print(Student s){
        System.out.println("the Student Name is " + s.getName());
        System.out.println("the Student age is " + s.getage());
        System.out.println("the Student Track is " + s.getTrack());
    }

    public void printl(){
        System.out.println("the Student Name is " + name);
        System.out.println("the Student age is " + age);
        System.out.println("the Student Track is " + track);
    }




}


class Main {
    public static void main(String[] args) {
        Student s1 = new Student("khaled", 23, "Data Science");
        Student.print(s1);
        s1.printl();
    }
}