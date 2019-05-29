package ishkhan;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class IshPrompt {
    private JButton agreeButton;
    private JPanel mainPanel;
    private JLabel imageLabel;

    public IshPrompt() {
        agreeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("IshPrompt");
        frame.setContentPane(new IshPrompt().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setExtendedState(JFrame.ICONIFIED);
        boolean fullscreen;
        fullscreen = false;
        frame.setExtendedState(fullscreen ? JFrame.MAXIMIZED_BOTH : JFrame.NORMAL);
        frame.setVisible(true);
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
        imageLabel = new JLabel(new ImageIcon("/Users/gilbert/IdeaProjects/IshPrompt/src/resources/images/DuoforaJob_logo_lowres-01.jpg"));
    }
}
