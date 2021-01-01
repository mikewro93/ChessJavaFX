package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Main extends Application {

	GridPane root = new GridPane();
	final int size = 10;

	public void start(Stage primaryStage) {

		for (int row = 0; row < size - 2; row++) {
			for (int col = 0; col < size - 2; col++) {
				Rectangle square = new Rectangle();
				Color color;
//           parzystoœæ sum kolorów decyduje o kolorze, parzysty jest bia³y
				if ((row + col) % 2 == 0)
					color = Color.WHITE;
				else
					color = Color.BLACK;
				square.setFill(color);

				root.add(square, col, row);
				// Setting size for the pane
				root.setMinSize(400, 400);

				// Setting the padding
				root.setPadding(new Insets(20, 20, 20, 20));

//				// Setting the vertical and horizontal gaps between the columns
//				root.setVgap(15);
//				root.setHgap(5);

				// Setting the Grid alignment
				root.setAlignment(Pos.CENTER);

				square.widthProperty().bind(root.widthProperty().divide(size));
				square.heightProperty().bind(root.heightProperty().divide(size));
			}
		}

		root.add(new Button("Reset/New"), 3, 11);

//		root.getChildren().addAll(new Rectangle(800,800,Color.ANTIQUEWHITE), new );

		primaryStage.setScene(new Scene(root, 800, 800));
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}

}