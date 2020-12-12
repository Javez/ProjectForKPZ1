import java.io.Serializable;

public class Car implements Comparable, Serializable {
    private String model;
    private String mark;
    private String creator;
    private String type;
    private int idNum;
    private boolean driveState;

    public Car(String Model, String Mark, String Creator, String Type, int IdNum) {
        model = Model;
        mark = Mark;
        creator = Creator;
        type = Type;
        idNum = IdNum;
    }

    public boolean isCarDriving() {
        return driveState;
    }

    public void StartDriveOnCar() {
        if(isCarDriving() == false) {
            System.out.print("Okay let's go to work ;'( ");
            driveState = true;
        }
        else { System.out.print("We arleady driving chief ;("); }
    }

    public void StopDriveOnCar() {
        if(isCarDriving() == true) {
            System.out.print("Okay let's from work ;)) ");
            driveState = false;
        }
        else { System.out.print("We arleady chilling chief ;)"); }
    }

    public String getModel() {
        return model;
    }

    public String getMark() {
        return mark;
    }

    public String getCreator() {
        return creator;
    }

    public String getType() {
        return type;
    }

    public String getSizeOfGasTank() {
        return mark;
    }

    public boolean equals(Car car) {
        return (this == car);
    }

    public Car clone(Car car) {
        return new Car(car.model, car.mark, car.creator, car.type, idNum);
    }

    @Override
    public int hashCode() {
        return (int) idNum * model.hashCode() * mark.hashCode();
    }

    @Override
    public String toString() {
        return model + "," + mark + "," + creator + "," + type + "," + idNum;
    }

    @Override
    public int compareTo(Object o) {
        Car car = (Car) o;
        if(car.equals(this)) return 1;
        return 0;
    }
}
