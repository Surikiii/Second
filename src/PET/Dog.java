package PET;

class Dog extends Pet {
    String name;
    boolean sex;
    private String color;

    Dog(){

    }

   Dog(String name,boolean sex,String color){
       this.name=name;
       this.sex=sex;
       this.color=color;
   }

    @Override
    void talk() {
        System.out.println("汪汪汪");
    }

    @Override
    void eat() {
        System.out.println("狗狗吃吃");
    }
}