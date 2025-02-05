package poly.ex6;

public class SoundFlyMain {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Bird bird = new Bird();
        Chicken chicken = new Chicken();

        soundAnimal(dog);
        soundAnimal(bird);
        soundAnimal(chicken);

        flayAnimal(bird);
        flayAnimal(chicken);
    }


    
    private static void soundAnimal(AbstractAnimal animal){
        System.out.println("동물 테스트 시작");
        animal.sound();
        System.out.println("동물 테스트 종료");
    }
    
    private static void flayAnimal(Fly fly){
        System.out.println("날기 테스트");
        fly.fly();
        System.out.println("날기 종료");
    }
}
