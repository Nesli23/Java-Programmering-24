package exercises.solutions.E3.Constructors;

public class Fish {
    String name;
    String species;
    double weight;
    int age;

    Fish (){ //kontruktor
        this.name = "Lilla fisken";
        this.species = "Gucci";
        this.weight = 3.2;
        this.age = 2;


    }

    Fish (String name, String species, double weight, int age){ // Kontruktor chain
        this.name = name;
        this.species = species;
        this.weight = weight;
        this.age = age;

    } 

    Fish (String name, int age) {
        this.name = name;
        this.age = age;
        this. species = "Clown fish";
        this.weight = 0.42;
    }

    public static void main(String[] args) { // metod
        Fish firren = new Fish();
        Fish firrevippen new Fish(name:"Firrevippen", species = "Lax", weight = 23.0, age = 10);
        Fish inteNemo = new Fish (name; "Inte Nemo", age:2);

        System.out.println(firren);
        System.out.println(firrevippen);
        System.out.println(inteNemo);
    

    }

}
