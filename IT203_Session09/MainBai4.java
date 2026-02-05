class Animal1 {
    public void sound() {
        System.out.println("Động vật phát ra âm thanh");
    }
}

class Dog1 extends Animal1 {
    @Override
    public void sound() {
        System.out.println("Chó sủa: Gâu gâu");
    }

    public void wagTail() {
        System.out.println("Chó vẫy đuôi");
    }
}

public class MainBai4 {
    public static void main(String[] args) {
        Animal1 animal = new Dog1();
        animal.sound();
        if (animal instanceof Dog1) {
            Dog1 dog = (Dog1) animal;
        }
    }
}
