package gui;

import javax.swing.*;

public class ImageLabel extends JLabel {

    public ImageLabel(String img) {
        this(new ImageIcon(img));
    }

    public ImageLabel(ImageIcon icon) {
        setIcon(icon);
        // setMargin(new Insets(0,0,0,0));
        setIconTextGap(0);
        // setBorderPainted(false);
        setBorder(null);
        setText(null);
        setSize(icon.getImage().getWidth(null), icon.getImage().getHeight(null));
    }

}
