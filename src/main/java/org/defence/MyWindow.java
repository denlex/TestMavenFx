package org.defence;

import javax.swing.*;
import java.awt.*;

/**
 * Created by root on 22.07.15.
 */
public class MyWindow extends JFrame {
    public MyWindow() throws HeadlessException {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(600, 480);
        setTitle("Test Frame");
        setVisible(true);
    }
}
