class Student{
    int id;
    String name;
    static int counter = 0;
    
    public Student(int id, String name){
        this.id = id;
        this.name = name;
        ++ counter;
    }

    public static void main(String[] args) {      
        Student s1 = new Student(1, "A");
        Student s2 = new Student(2, "B");
        System.out.println(s1.counter); // object referencing / class 
    }
}