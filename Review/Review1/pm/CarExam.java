package pm;

public class CarExam {
    public static void main(String[] args) {
        // Car c1 = new Car("소방차");
        // Car c2 = new Car();
        // Car c3 = new Car("구급차",1111);

        Car car = new Car("포니",1234);

        System.out.println("name: "+car.name);
        System.out.println("number: "+car.number);
    }
    
}
