package PET;

public abstract class Pet {
    private String name;
    private boolean sex;
    public Pet(){

    }

    public Pet(String name,boolean sex){
        this.name = name;
        this.sex = sex;
    }

    void talk(){
        System.out.println("宠物叫");
    }
    void eat(){
        System.out.println("宠物吃");
    }

}
