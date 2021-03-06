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
        private JList resultList;
        private JButton getButton;
    private JScrollBar scrollBar1;

    public MainForm() throws HeadlessException {
            super("some jdbc testing");
            pack();

            setContentPane(rootPanel);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setSize(350, 350);

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

            getButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    resultList.setListData(SpringJdbc.getStudents().toArray());
                }
            });

            this.setVisible(true);
        }
}
