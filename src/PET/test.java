package PET;

public class test {
    public static void main(String[] args) {


        Pet p = new Dog("柯基", true, "yellow");
        Pet c = new Cat("三花", false, 12.0);
        p.talk();
        p.eat();
        c.talk();
        c.eat();
    }
}