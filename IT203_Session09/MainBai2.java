class Animal {
    public void sound() {
        System.out.println("Động vật phát ra âm thanh");
    }
}

class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("Chó sủa: Gâu gâu");
    }
}

class Cat extends Animal {
    @Override
    public void sound() {
        System.out.println("Mèo kêu: Meo meo");
    }
}

public class MainBai2 {
    public static void main(String[] args) {
        Animal a1 = new Dog();
        Animal a2 = new Cat();
        a1.sound();
        a2.sound();
    }
}
