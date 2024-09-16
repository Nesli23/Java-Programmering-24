package Java_playground;

class StudentClass {
    private String title;
    private int age;
    private double grade;

    public StudentClass(String name, int age, double grade){
        this.name = name;
        this.age = age;
        this.grade = grade;


    }
    
    public void printDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Grade:" + grade);
    }

    public static void main(String[] args) {
        Student student = new StudentClass("Alice", 18, 90.5);
        
    }




    
    
}
