package GB;
/*
 *Java 1. Home work #6
 *
 * @author Elena Rzhevskaya
 * version 09.03.2022
 *
 */
class HomeWork6 {
    public static void main(String[] args) {
        IAnimal2[] animals2 = {
                new Cat2(200, 0),
                new Dog2(500, 10)
        };

        for (IAnimal2 animal2 : animals2) {
            System.out.println(animal2);
            System.out.println(animal2.run(100));
            System.out.println(animal2.run(200));
            System.out.println(animal2.run(501));
            System.out.println(animal2.swim(9));
            System.out.println(animal2.swim(10));
            System.out.println(animal2.swim(11));
        }
        System.out.println("Animals were created: " + Animal2.getCountOfAnimals());
    }
}

class Cat2 extends Animal2 {
    Cat2(int runMax, int swimMax) {
        super(runMax, swimMax);
    }

    @Override
    public String swim(int distance) {
        return getClassName() + "can't swim";
    }
}
class Dog2 extends Animal2 {
    Dog2(int runMax, int swimMax) {
        super(runMax, swimMax);
    }
}

abstract class Animal2 implements IAnimal2 {
    protected int runMax;
    protected int swimMax;
    protected String className;
    protected static int countOfAnimals = 0;


    Animal2(int runMax, int swimMax) {
        this.runMax = runMax;
        this.swimMax = swimMax;
        className = getClass().getSimpleName();
        countOfAnimals++;
    }
    public String getClassName() {
        return className;
    }
    public static int getCountOfAnimals() {
        return countOfAnimals;
    }

    @Override
    public String run(int distance) {
        if (distance > runMax) {
            return className + " didn't run " + distance;
        } else {
            return className + " ran " + distance;
        }
    }

    @Override
    public String swim(int distance) {
        if (distance > swimMax) {
            return className + " didn't swim " + distance;
        } else {
            return className + " swam " + distance;
        }
    }
    @Override
    public String toString() {
        return className + ", runMax: " + runMax + ", swimMax: " + swimMax;
    }

}
interface IAnimal2 {
    String run(int distance);
    String swim(int distance);

}