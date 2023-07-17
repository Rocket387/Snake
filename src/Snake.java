import java.awt.EventQueue;
import javax.swing.*;

public class Snake extends JFrame {

    public Snake() {
        initUI();
    }

    private void initUI() {
        add(new Board());

        //need to call setResizable before pack to ensure snake collision works correctly
        setResizable(false);
        pack();

        setTitle("Snake");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {

        EventQueue.invokeLater(() -> {
            JFrame ex = new Snake();
            ex.setVisible(true);
        });
    }
}
