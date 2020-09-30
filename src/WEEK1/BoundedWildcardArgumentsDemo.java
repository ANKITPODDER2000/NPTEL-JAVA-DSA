package WEEK1;

class Animal {
    long lifespan;
    float weight;

    Animal(long years, float kgs) {
        lifespan = years;
        weight = kgs;
    }

    public void print() {
        System.out.println("Maximum longevity: " + lifespan + " in years");
        System.out.println("Maximum weight: " + weight + " in kgs");
    }
}

class Aquatic extends Animal {
    boolean scale;

    Aquatic(long years, float kgs, boolean skin) {
        super(years, kgs);
    }

    public void print() {
        super.print();
        System.out.println("Has scale? " + scale);
    }
}

class Land extends Animal {
    short vision; // 0 = nocturnal, 1 = only day light, 2 = both

    Land(long years, float kgs, short vision) {
        super(years, kgs);
        this.vision = vision;
    }
}

class Pet extends Land {
    String name;

    Pet(long years, float kgs, short vision, String name) {
        super(years, kgs, vision);
        this.name = name;
    }
}

class Wild extends Land {
    float speed; // Maximum running speed in mph.

    Wild(long years, float kgs, short vision, float speed) {
        super(years, kgs, vision);
        this.speed = speed;
    }
}

class AnimalWorld<T extends Animal> {
    T[] listOfAnimals;

    AnimalWorld(T[] list) {
        listOfAnimals = list;
    }
}

class BoundedWildcards {
    void vitality(AnimalWorld<?> animalWorld) {
        for (int i = 0; i < animalWorld.listOfAnimals.length; i++) {
            animalWorld.listOfAnimals[i].print();
        }
        System.out.println();
    }

    void showSea(AnimalWorld<? super Aquatic> animalWorld) {
        for (int i = 0; i < animalWorld.listOfAnimals.length; i++) {
            animalWorld.listOfAnimals[i].print();
        }
        System.out.println();
    }

    void showLand(AnimalWorld<? extends Land> animalWorld) {
        for (int i = 0; i < animalWorld.listOfAnimals.length; i++) {
            animalWorld.listOfAnimals[i].print();
            System.out.println("Vision : " + animalWorld.listOfAnimals[i].vision);
        }
        System.out.println();
    }

    void showPet(AnimalWorld<? extends Pet> animalWorld) {
        for (int i = 0; i < animalWorld.listOfAnimals.length; i++) {
            System.out.println("Pet's name : " + animalWorld.listOfAnimals[i].name);
            animalWorld.listOfAnimals[i].print();
            System.out.println("Vision : " + animalWorld.listOfAnimals[i].vision);
        }
        System.out.println();
    }

    void showWild(AnimalWorld<? extends Wild> animalWorld) {
        for (int i = 0; i < animalWorld.listOfAnimals.length; i++) {
            animalWorld.listOfAnimals[i].print();
            System.out.println("Maximum running speed: " + animalWorld.listOfAnimals[i].speed + " in mph");
            System.out.println("Vision : " + animalWorld.listOfAnimals[i].vision);
        }
        System.out.println();
    }
}

public class BoundedWildcardArgumentsDemo {
    public static void main(String[] args) {
        Animal unknown = new Animal(40, 70);
        Animal[] u = {unknown};
        AnimalWorld<Animal> uList = new AnimalWorld<Animal>(u);

        Aquatic whale = new Aquatic(90, 150000, true);
        Aquatic shark = new Aquatic(400, 2150, true);
        Aquatic[] q = {whale, shark};
        AnimalWorld<Aquatic> qlist = new AnimalWorld<Aquatic>(q);

        Land owl = new Land(3, 1, (short) 0);
        Land[] l = {owl};
        AnimalWorld<Land> lList = new AnimalWorld<Land>(l);

        Pet dog = new Pet(15, 75, (short) 2, "Prince");
        Pet[] p = {dog};
        AnimalWorld<Pet> pList = new AnimalWorld<Pet>(p);

        Wild cheetah = new Wild(15, 75, (short) 2, 70);
        Wild deer = new Wild(10, 50, (short) 1, 35);
        Wild[] w = {cheetah, deer};
        AnimalWorld<Wild> wList = new AnimalWorld<Wild>(w);

        BoundedWildcards b = new BoundedWildcards();

        b.vitality(uList);
        b.vitality(qlist);
        b.vitality(lList);
        b.vitality(pList);
        b.vitality(wList);

        b.showSea(uList);
        b.showSea(qlist);
//        b.showSea(lList);
//        b.showSea(pList);
//        b.showSea(wList);

//        b.showLand(uList);
//        b.showLand(qlist);
        b.showLand(lList);
        b.showLand(pList);
        b.showLand(wList);

//        b.showPet(uList);
//        b.showPet(qlist);
//        b.showPet(lList);
        b.showPet(pList);
//        b.showPet(wList);

//        b.showWild(uList);
//        b.showWild(qlist);
//        b.showWild(lList);
//        b.showWild(pList);
        b.showWild(wList);
    }
}
