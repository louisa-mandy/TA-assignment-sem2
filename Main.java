// inheritance, encapsulation , polymorphism

//superclass
class Animal{
    String animalType = "land";

    public void sound(){ // polymorphism
        System.out.println("No sound");
    }
}

//subclass
class Dog extends Animal{ // inheritance
    int legs = 4;


    public void sound(){
        System.out.println("Sound : Woof Woof");
    }//polymorphism

}

class Chicken extends Animal{ //inheritance
    int legs = 2;

    public void sound(){
        System.out.println("Sound : Bawk Bawk");
    }//polymorphism

}

class Spider extends Animal{ //inheritance
    int legs = 6;

}


public class Main {

    static class Animal_Name{

        private void animal1(){  //encapsulation
            System.out.println("Animal : Dog ");
        }

        private void animal2(){ //encapsulation
            System.out.println("Animal : Chicken ");
        }

        private void animal3(){ //encapsulation
            System.out.println("Animal : Spider");
        }

        // Public methods to access private methods
        public void printAnimal1(){
            animal1();
        }

        public void printAnimal2(){
            animal2();
        }

        public void printAnimal3(){
            animal3();
        }

    }


    public static void main(String[] args) {
        Animal_Name animalName = new Animal_Name();



        Dog dog = new Dog();
        animalName.printAnimal1(); // Output: Animal : Dog
        dog.sound();
        System.out.println("Dog - Type : " + dog.animalType
                + "\nLegs : " + dog.legs + "\n");

        Chicken chicken = new Chicken();
        animalName.printAnimal2(); // Output: Animal : Chicken
        chicken.sound();
        System.out.println("Chicken - Type : " + chicken.animalType
                + "\nLegs : " + chicken.legs + "\n");

        Spider spider = new Spider();
        animalName.printAnimal3(); // Output: Animal : Spider
        spider.sound();
        System.out.println("Spider - Type : " + spider.animalType
                + "\nLegs : " + spider.legs + "\n");
    }

}
