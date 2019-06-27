package gui.topPanels;

import gui.CustomColors;
import jiconfont.icons.google_material_design_icons.GoogleMaterialDesignIcons;
import jiconfont.swing.IconFontSwing;
import mdlaf.animation.MaterialUIMovement;
import mdlaf.utils.MaterialColors;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class RightButtons extends JPanel {
    public RightButtons() {
        //Padding to Button Section
        Insets padding = new Insets(10, 20, 10, 10);
        setBorder(new EmptyBorder(padding));

        //padding prepare for buttons
        Border paddingForElements = new EmptyBorder(new Insets(5, 5, 5, 5));

        // prepare insets for margin of buttons
        Insets marginInsets = new Insets(5,10,5,10); //this and set margin method is useless :D

        //setting Grid Bag Layout to this Panel
        GridBagLayout gridBagLayout = new GridBagLayout();
        setLayout(gridBagLayout);


        JButton addSongButton = new JButton("Add Song");
        Icon addSongButtonIcon = IconFontSwing.buildIcon(GoogleMaterialDesignIcons.ADD_TO_PHOTOS, 25, CustomColors.PRIMARY);
        addSongButton.setIcon(addSongButtonIcon);
        addSongButton.setBorder(paddingForElements);
        addSongButton.setMargin(marginInsets);
        add(addSongButton);

        JButton playListsButton = new JButton("Play Lists");
        Icon playListsButtonIcon = IconFontSwing.buildIcon(GoogleMaterialDesignIcons.FORMAT_LIST_BULLETED, 25, new Color(0, 0, 0));
        playListsButton.setIcon(playListsButtonIcon);
        playListsButton.setBorder(paddingForElements);
        playListsButton.setMargin(marginInsets);
        add(playListsButton);

        JButton favoritePlayListButton = new JButton("Favorite Songs");
        Icon favoritePlayListButtonIcon = IconFontSwing.buildIcon(GoogleMaterialDesignIcons.FAVORITE, 25, new Color(0, 0, 0));
        favoritePlayListButton.setIcon(favoritePlayListButtonIcon);
        favoritePlayListButton.setBorder(paddingForElements);
        favoritePlayListButton.setMargin(marginInsets);
        add(favoritePlayListButton);

        JButton songsButton = new JButton("Songs");
        Icon songsButtonIcon = IconFontSwing.buildIcon(GoogleMaterialDesignIcons.LIBRARY_MUSIC, 25, new Color(0, 0, 0));
        songsButton.setIcon(songsButtonIcon);
        songsButton.setBorder(paddingForElements);
        songsButton.setMargin(marginInsets);
        add(songsButton);

        JButton albumsButton = new JButton("Albums");
        Icon albumsButtonIcon = IconFontSwing.buildIcon(GoogleMaterialDesignIcons.RECENT_ACTORS, 25, new Color(0, 0, 0));
        albumsButton.setIcon(albumsButtonIcon);
        albumsButton.setBorder(paddingForElements);
        albumsButton.setMargin(marginInsets);
        add(albumsButton);

        JButton artistButton = new JButton("Artist");
        Icon artistButtonIcon = IconFontSwing.buildIcon(GoogleMaterialDesignIcons.PERSON, 25, new Color(0, 0, 0));
        artistButton.setIcon(artistButtonIcon);
        artistButton.setBorder(paddingForElements);
        artistButton.setMargin(marginInsets);
        add(artistButton);


        JButton videoButton = new JButton("Videos");
        Icon videoButtonIcon = IconFontSwing.buildIcon(GoogleMaterialDesignIcons.VIDEO_LIBRARY, 25, new Color(0, 0, 0));
        videoButton.setIcon(videoButtonIcon);
        videoButton.addMouseListener(MaterialUIMovement.getMovement(videoButton, MaterialColors.ORANGE_50));
        videoButton.setBorder(paddingForElements);
        videoButton.setMargin(marginInsets);
        add(videoButton);
    }
}
