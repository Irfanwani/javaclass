import java.awt.Color;
import javax.swing.*;;

class SwingEx {
    public static void main(String[] args) {
        CreateGui cg = new CreateGui();

        cg.CreateFrame();
    }
}

class CreateGui extends JFrame {
    public void CreateFrame() {
        JFrame j = new JFrame("Learning Swing!");
        j.getContentPane().setBackground(Color.cyan);

        j.setBounds(200, 40, 400, 400);

        j.setVisible(true);
        
    }
}