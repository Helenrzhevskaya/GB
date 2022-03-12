package GB;
/*
 *Java 1. Home work #7
 *
 * @author Elena Rzhevskaya
 * version 12.03.2022
 *
 */

class HomeWork7 {
    public static void main(String[] args) {
        Cat3[] cats = new Cat3[3];
        cats[0] = new Cat3("Bars", 5);
        cats[1] = new Cat3("Murka", 10);
        cats[2] = new Cat3("Mashka", 14);

        Plate plate = new Plate(25, 50);
        System.out.println(plate);

        for (Cat3 cat3 : cats) {
            cat3.eat(plate);
            System.out.println(cat3);
        }

        System.out.println(plate);
        plate.add(19);
        System.out.println(plate);

        for (Cat3 cat3 : cats) {
            cat3.setFullness(false);
            cat3.eat(plate);
            System.out.println(cat3);
        }
        System.out.println(plate);
    }
}

class Cat3 {
    private String name;
    private int appetite;
    private boolean fullness;

    Cat3(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        fullness = false;
    }

    void setFullness(boolean status) {
        fullness = status;
    }

    void eat(Plate p) {
        if(!fullness) {
            fullness = p.decreaseFood(appetite);
        }

    }

    @Override
    public String toString() {
        return "{Cat: " + name + ", appetite: " + appetite + ", fullness=" + fullness + "}";
    }
}

class Plate {
    private int food;
    private int maxVolume;


    Plate(int food, int maxVolume) {
        this.food = food;
        this.maxVolume = maxVolume;
    }

    boolean decreaseFood(int portion) {
        if (food < portion) {
            return false;
        }
        food -= portion;
        return true;
    }

    void add(int food) {
        if(this.food + food <= maxVolume) {
            this.food += food;
        }
    }



    @Override
    public String toString() {
        return "Plate: " + food;
    }


}