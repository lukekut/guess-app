import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;


import java.lang.String;

public class GuessingGUI extends JFrame{
    private JPanel mainPanel;
    private JLabel inputLabel;
    private JLabel outputLabel;
    private JTextField inputTextField;
    private JButton checkMeButton;
    private JButton restartButton;
    private JLabel guesesLabel;
    private JLabel spaceLabel;

    public GuessingGUI(String title) {
        super(title);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(mainPanel);
        this.pack();
               checkMeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

                int numberGuessed = (int) (Double.parseDouble(inputTextField.getText()));
                guesesLabel.setText("You guessed " + numberGuessed);

                if (numberGuessed <=100 && numberGuessed > 0){
                if (numberGuessed < myRand()) {

                    outputLabel.setText("Your guess is too low!");
                } else if (numberGuessed > myRand()) {

                    outputLabel.setText("Your guess is too high!");

                } else {
                    outputLabel.setText("This is an Excellent guess!");

                }
                }
                else {
                    outputLabel.setText("Invalid input");
                }

               // if (numberGuessed == myRand())
              //  numberGuessed;
                }
        });
        restartButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                Integer number=0;
            String numGuessed = inputTextField.toString();

//                String numGuessed = "";
//                if (String.valueOf(true) {
//                } else {
//                    return;
//                }
                String numberGuessed = (String) ((inputTextField.getText()));
                inputTextField.setText("");



            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new GuessingGUI("My Guessing App");
        frame.setVisible(true);


    }

        public static int myRand() {
            int max = 100;
            int min = 0;
            Random randomNum = new Random();
            int Guess = min + randomNum.nextInt(max);

            return Guess;
        }

        public static void myRand(String[] args) {
            myRand();
        }

}
