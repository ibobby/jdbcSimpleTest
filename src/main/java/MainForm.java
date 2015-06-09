import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by b.istomin on 09.06.2015.
 */
public class MainForm extends JFrame {
    private JButton goButton;
    private JRadioButton radioButton1;
    private JPanel rootPanel;
    private JProgressBar progressBar1;

    public MainForm() throws HeadlessException {
        super("some jdbc testing");
        pack();
        setContentPane(rootPanel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        goButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                OldJdbc.addStudentJdbc();
            }
        });

        this.setVisible(true);
    }
}
