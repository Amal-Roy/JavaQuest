
class Car{
    private String model;
    public Car(String model){
        this.model=model;

    }

    public void showModel(){
        System.out.println("Model: "+model);
    }
}
public class CarDemo {
    public static void main(String[] args) {
        String model="Alto";
        Car ob= new Car(model);
        ob.showModel();

    }
}




    

