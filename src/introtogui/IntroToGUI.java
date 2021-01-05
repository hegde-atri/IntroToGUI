
package introtogui;

import java.awt.Toolkit;


public class IntroToGUI {

    
    public static void main(String[] args) {
        LogIn l = new LogIn();
        
        Toolkit tk = Toolkit.getDefaultToolkit();
        int xSize = (int)tk.getScreenSize().getWidth();
        int ySize = (int)tk.getScreenSize().getHeight();
        
        
        
        l.setSize(460, 269);
        l.setVisible(true);
    }
    
}
