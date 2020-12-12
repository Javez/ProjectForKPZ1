import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {
    public static void main(String[] args) {
        Car car = new Car("Continental GT", "Bently", "Уолтер Оуен Бентлі", "coupe", 1223);
        System.out.println(car.toString());
        System.out.println(car.equals(car));
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) { }
}
