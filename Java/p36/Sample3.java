import javafix.application.*;
import javafix.stage.*;
import javafix.scene.*;
import javafix.scene.control.*;
import javafix.secene.layout.*;

public class Sample3 extends application
{
    private Label 1b;
    private Button bt;

    public ststic void main(String[] args)
    {
        launch(args);
    }
    public void start(Stage stage)throws Exception
    {
        1b = new Label("いらっしゃいませ。");
        bt = new Button("購入");

        BorderPane bp = new BorderPane();

        bp.setTop(1b);
        bp.setCenter(bt);

        Scene sc = new Scene(bp, 300, 200);

        stage.setScene(sc);

        stage.setTitle("サンプル");
        stage.show();
    }
}
