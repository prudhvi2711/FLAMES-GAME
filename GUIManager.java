import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GUIManager {
    private JFrame frame;
    private JTextField name1Field, name2Field;
    private JLabel resultLabel;
    private FLAMESGame game = new FLAMESGame();
    private Validator validator = new NameValidator();

    public void init() {
        frame = new JFrame("FLAMES Game");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(new GridLayout(5, 1));

        name1Field = new JTextField();
        name2Field = new JTextField();
        JButton playButton = new JButton("Play");
        resultLabel = new JLabel("Enter names to play FLAMES", SwingConstants.CENTER);

        frame.add(new JLabel("Your Name:"));
        frame.add(name1Field);
        frame.add(new JLabel("Partner's Name:"));
        frame.add(name2Field);
        frame.add(playButton);
        frame.add(resultLabel);

        playButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name1 = name1Field.getText();
                String name2 = name2Field.getText();

                if (validator.validateInput(name1, name2)) {
                    String resultChar = game.play(name1, name2);
                    String result = game.displayResult(resultChar);
                    resultLabel.setText("Result: " + result);
                } else {
                    resultLabel.setText("Invalid input. Try again.");
                }
            }
        });

        frame.setVisible(true);
    }
}