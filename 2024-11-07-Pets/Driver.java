// 8.  First, we tried to use name in the method, but it was a private variable only accessible to the parent class.
// Then, we used the getName method from the superClass and the method worked.
// We noticed that as the getName method updated, so did the speak()
// 10. Animal = new Animal and Brid = new Bird both worked because the classes match
// Bird = new Animal didn't work because animal is not a bird
// Animal = new Bird because the bird class is-a animal and is a subclass of Animal

public class Driver {
    public static void main(String[] args) {
        Animal a1 = new Animal("ying yang", 7, "AZ");
        a1.speak();

        Bird b1 = new Bird("matcha", 18, "AS", 6.3, "green");
        b1.speak();

//        Bird b2 = new Animal("im so funny", 16, "Catherine");
        Animal a2 = new Bird("im eating", 11, "Checed", 68.4, "red");
    }
}
