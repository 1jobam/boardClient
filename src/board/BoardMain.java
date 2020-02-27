package board;

import board.controller.BoardMainController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class BoardMain extends Application{
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("controller/BoardMainFXML.fxml"));
		Parent root = loader.load();
		
		Scene scene = new Scene(root);
		primaryStage.setScene(scene);
		primaryStage.setTitle("게시글 관리 시스템");
		primaryStage.show();
		
		BoardMainController bom = new BoardMainController();
		bom.setPrimaryStage(primaryStage);
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}