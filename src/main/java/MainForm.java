import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by b.istomin on 09.06.2015.
 */
public class MainForm extends JFrame {
    private JButton goButton;
    private JRadioButton oldJdbc;
    private JPanel rootPanel;
    private JProgressBar progressBar1;
    private JRadioButton springJdbcTemplate;

    public MainForm() throws HeadlessException {
        super("some jdbc testing");
        pack();
        setContentPane(rootPanel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 500);

        goButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (oldJdbc.isSelected()) {
                    OldJdbc.addStudent();
                } else if (springJdbcTemplate.isSelected()) {
                    SpringJdbc.addStudent();
                }
            }
        });

        this.setVisible(true);
    }
}
