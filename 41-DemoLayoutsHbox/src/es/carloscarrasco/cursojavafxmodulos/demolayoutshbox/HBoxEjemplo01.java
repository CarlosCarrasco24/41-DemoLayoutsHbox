package es.carloscarrasco.cursojavafxmodulos.demolayoutshbox;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class HBoxEjemplo01 extends Application {

	@Override
	public void start(Stage primaryStage) {
		Button btn1 = new Button("Boton 1");
		Button btn2 = new Button("Boton 2");
		Button btn3 = new Button("Boton 3");
		
		HBox hbox=new HBox();
		hbox.getChildren().addAll(btn1,btn2,btn3);
		
		hbox.setSpacing(10);
		hbox.setPadding(new Insets(10,20,10,20));
		hbox.setMargin(btn2, new Insets(30));
		
		Scene scene =new Scene(hbox,450,350);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Layout HBox");
		primaryStage.show();
		
	}

	public static void main(String[] args) {
		launch(args);
	}
}
