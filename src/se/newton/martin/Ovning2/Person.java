package se.newton.martin.Ovning2;

public class Person {
    //Instance variabler
    private Hus hus;
    private int age;
    //Klass variabler
    public  static int count = 0;

    public static int getCount()
    {
        return count;
    }

    public Person(Hus hus) {
        this.setHus(hus);
        count++;
    }

    public Hus getHus() {
        return hus;
    }

    public void setHus(Hus hus) {
        this.hus = hus;
    }

    public void increaseAgeByOneYear(){
        setAge(getAge() + 1);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
