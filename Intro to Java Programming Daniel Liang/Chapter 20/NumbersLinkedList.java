package chapter20;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import java.util.Collections;
import java.util.LinkedList;


public class NumbersLinkedList extends Application {
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setScene(new Scene(new NumberLinkedListPane()));
		
	}
	
	/** Private class NumberLinkedListPane */
	private class NumberLinkedListPane extends BorderPane {
		
		/** Data fields */
		private TextArea areaField;
		private TextField textFieldNumber;
		private Label labelNumber;
		private Label nonLabelNumber;
		
		private LinkedList<Integer> javaIntegerList;
		
		private Button buttonSort;
		private Button buttonReverse;
		private Button buttonShuffle;
		
		
		NumberLinkedListPane() {
			
			javaIntegerList = new LinkedList<>();
			
			labelNumber = new Label("Enter a number:");
			nonLabelNumber = new Label();
			nonLabelNumber.setVisible(false);
			
			textFieldNumber = new TextField();
			textFieldNumber.setPrefColumnCount(4);
			
            HBox javaHBox = new HBox(10, labelNumber, textFieldNumber, nonLabelNumber);
            javaHBox.setAlignment(Pos.CENTER);
            javaHBox.setPadding(new Insets(5));
            setTop(javaHBox);
            
            areaField = new TextArea();
            ScrollPane javaScrollPane = new ScrollPane(areaField);
            javaScrollPane.setPrefHeight(100);
            setCenter(javaScrollPane);
            
            buttonSort = new Button("Sort");
            buttonReverse = new Button("Reverse");
            buttonShuffle = new Button("Shuffle");
            javaHBox = new HBox(20, buttonSort, buttonReverse, buttonShuffle);
            javaHBox.setAlignment(Pos.BASELINE_CENTER);
            javaHBox.setPadding(new Insets(5));
			
            setBottom(javaHBox);
            
            
            /** Listeners */
            textFieldNumber.setOnKeyPressed(e-> {
            	if(e.getCode() == KeyCode.ENTER) {
            		int javaNumber;
            		
            		try {
            			javaNumber = Integer.parseInt(textFieldNumber.getText());
            			
            			if(nonLabelNumber.isVisible()) {
            				nonLabelNumber.setVisible(false);
            			}
            			
            			if(!javaIntegerList.contains(javaNumber)) {
            				javaIntegerList.add(javaNumber);
            				appendTextArea();
            				
            			} else {
            				nonLabelNumber.setText("It is a duplicate Number!");
            				nonLabelNumber.setVisible(true);
            			}
            			
            		} catch (NumberFormatException ie) {
            			nonLabelNumber.setText("Not a number!");
            			nonLabelNumber.setVisible(true);
            		}
            	}
            });
            
            buttonShuffle.setOnMouseClicked(e-> {
                Collections.shuffle(javaIntegerList);
                updateTextArea();
            });
            
            buttonSort.setOnMouseClicked(e-> {
                Collections.sort(javaIntegerList);
                updateTextArea();
            });
            
            buttonReverse.setOnMouseClicked(e-> {
                Collections.reverse(javaIntegerList);
                updateTextArea();
            });
			
		}
		
        private void updateTextArea() {
            String string = "";
            
            for (Integer intValue : javaIntegerList) {
                string += intValue + " ";
            }
            
            areaField.setText(string);
        }
		
        private void appendTextArea() {
            areaField.appendText(" " + javaIntegerList.getLast());
        }
		
		
	}
	
	
	public static void main(String[] args) {
		Application.launch(args);
	}

}
