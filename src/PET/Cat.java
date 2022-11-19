package PET;

public class Cat extends Pet{
    String name;
    boolean sex;
    private double weight;

    public Cat(String name,boolean sex,double weight){
        this.name =name;
        this.weight=weight;
        this.sex=sex;

    }
    Cat(){

    }
    void talk(){
        System.out.println("喵喵喵");
    }

    void eat(){
        System.out.println("猫猫吃吃");
    }
}
