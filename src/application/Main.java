package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.SplitPane;
import javafx.stage.Stage;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("Main.fxml")); // fxml파일의 정보를 가진 객체
			SplitPane root = (SplitPane)loader.load(); // 태그에 접근할 수 있는 객체
			Scene scene = new Scene(root,770,400); // 윈도우 창 안에 실제 내용이 들어가는 부분
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm()); // 화면꾸미기. 스타일시트 문법으로 css파일에서 작성한다.
			primaryStage.setScene(scene); // Stage객체(윈도우 창 자체)인 primaryStage에 scene를 넣은 것
			
			primaryStage.setTitle("BoardApp");
			primaryStage.show();
			
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
