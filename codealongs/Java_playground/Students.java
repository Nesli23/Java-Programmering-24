package codealongs.Java_playground;

public class Students {

    public String name;
    public int age;
    public double grade;

    public Students(){
        name = " Kalle";
        age = 25;
        grade = 1.5;
    }
    
    public void printDetails(){
        System.out.println(" Name" + name);
        System.out.println("Age" + age);
        System.out.println("Grade" + grade);
    }

    public static void main(String[] args) {
        Students students = new Students();
        students.printDetails();
    }
}
