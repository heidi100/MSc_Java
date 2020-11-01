/*
 * Conways Game Of Life Simulation.
 * The first tile-based and animated graphics work.   
 */
package conwaygof;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * @author Heidi Portwine (S6110438)
 */
public class ConwayGOF extends JFrame
{
    // Creates a World object
    private World world = new World();
    
    /**
     * Setup of GUI.
     */
    public ConwayGOF()
    {
        // Text displayed on the Window Title.
        super("Conways Game of Life");

        // Adds the world to a border layout in the center.
        add(world, BorderLayout.CENTER);

        // Calls the menuBar and the pack methods.
        menuBar();
        pack();
        
        // Sets up window to be fixed size, visible etc.
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);	
    }

    /**
     * Creates the menu at the top of the GUI Window.
     */
    private void menuBar() 
    {
        // Creates a new JMenuBar called menu.
        JMenuBar menu = new JMenuBar();

        // Creates the menu buttons on the GUI Menu Bar.
        final JMenuItem start = new JMenuItem("Start");
        final JMenuItem pause = new JMenuItem("Pause");
        final JMenuItem speed = new JMenuItem("Speed Up");
        final JMenuItem reset = new JMenuItem("Reset");
        JMenuItem close = new JMenuItem("Close");

        // Adds the buttons to the Menu.
        menu.add(start);
        menu.add(pause);
        menu.add(speed);
        menu.add(reset);
        menu.add(close);

        // Sets the Menu Bar on the GUI to the menu created.
        setJMenuBar(menu);
        
        // Calls repaint on the world
        world.repaint();

        // Action Listener for the Start Button on the Menu.
        start.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent ae) 
            {	
                // Calls the startButton method from the world class.
                world.startButton();
            }
        });
        // Action Listener for the Pause Button on the Menu.
        pause.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent ae) 
            {	
                // Calls the pause method from the world class.
                world.pauseButton();
            }
        });
        // Action Listener for the Speed Button on the Menu.
        speed.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent ae) 
            {	
                // Calls the speed method from the world class.
                world.speedButton();
            }
        });
        // Action Listener for the Reset Button on the Menu.
        reset.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent ae) 
            {
                // Calls the resetButton method from the world class.
                world.resetButton();
            }
        });
        // Action Listener for the Close Button on the Menu.
        close.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent ae) 
            {
                // Closes the GUI.
                System.exit(0);
            }
        });
    }

    /**
     * Main Method that calls the ConwayGOF method on start up.
     * @param args 
     */
    public static void main(String[] args)
    {
        new ConwayGOF();
    }
}
