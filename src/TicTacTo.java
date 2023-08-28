import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class TicTacTo {

    static JButton button0;
    static JButton button1;
    static JButton button2;
    static JButton button3;
    static JButton button4;
    static JButton button5;
    static JButton button6;
    static JButton button7;
    static JButton button8;
    static int turn = 1;
    static int[] choices = new int[]{0,1,2,3,4,5,6,7,8};
    static int k = 0;


    public static void main(String[] args) {
        createStructure();
    }

    static void createStructure(){

        JFrame frame = new JFrame();
        frame.setTitle("Tic Tac To");
        frame.setSize(450,450);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        JPanel panel0 = new JPanel();

        button0 = new JButton("0");
        button0.addActionListener(e -> selectionButtonPressed(0));

        button1 = new JButton("1");
        button1.addActionListener(e -> selectionButtonPressed(1));

        button2 = new JButton("2");
        button2.addActionListener(e -> selectionButtonPressed(2));

        button3 = new JButton("3");
        button3.addActionListener(e -> selectionButtonPressed(3));

        button4 = new JButton("4");
        button4.addActionListener(e -> selectionButtonPressed(4));

        button5 = new JButton("5");
        button5.addActionListener(e -> selectionButtonPressed(5));

        button6 = new JButton("6");
        button6.addActionListener(e -> selectionButtonPressed(6));

        button7 = new JButton("7");
        button7.addActionListener(e -> selectionButtonPressed(7));

        button8 = new JButton("8");
        button8.addActionListener(e -> selectionButtonPressed(8));


        panel0.add(button0);
        panel0.add(button1);
        panel0.add(button2);
        panel0.add(button3);
        panel0.add(button4);
        panel0.add(button5);
        panel0.add(button6);
        panel0.add(button7);
        panel0.add(button8);

        panel0.setLayout(new GridLayout(3,3));

        frame.add(panel0);

        frame.setVisible(true);

        if(!(turn % 2 == 0)){
            computersTurn();
            turn++;
        }

    }

    static void selectionButtonPressed(int button){

        if(!(turn % 2 == 0)){
            computersTurn();
            turn++;
        }

        if(turn % 2 == 0){ //set so if turn is divisible by 2 its teh players turn so it puts the X
            switch(button){
                case 0:
                    button0.setText("X");
                    choices[0] = 10;
                    break;
                case 1:
                    button1.setText("X");
                    choices[1] = 10;
                    break;
                case 2:
                    button2.setText("X");
                    choices[2] = 10;
                    break;
                case 3:
                    button3.setText("X");
                    choices[3] = 10;
                    break;
                case 4:
                    button4.setText("X");
                    choices[4] = 10;
                    break;
                case 5:
                    button5.setText("X");
                    choices[5] = 10;
                    break;
                case 6:
                    button6.setText("X");
                    choices[6] = 10;
                    break;
                case 7:
                    button7.setText("X");
                    choices[7] = 10;
                    break;
                case 8:
                    button8.setText("X");
                    choices[8] = 10;
                    break;

            }
            turn++;
        }


    }

    static void computersTurn(){

        Random rand = new Random();


        k = rand.nextInt(9);

        while(choices[k] == 10){
            k = rand.nextInt(9);
        }



        switch(choices[k]){
            case 0:
                button0.setText("O");
                break;
            case 1:
                button1.setText("O");
                break;
            case 2:
                button2.setText("O");
                break;
            case 3:
                button3.setText("O");
                break;
            case 4:
                button4.setText("O");
                break;
            case 5:
                button5.setText("O");
                break;
            case 6:
                button6.setText("O");
                break;
            case 7:
                button7.setText("O");
                break;
            case 8:
                button8.setText("O");
                break;
        }



    }

}
