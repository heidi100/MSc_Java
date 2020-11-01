/*
 * Conways Game Of Life World Creation Class.
 */
package conwaygof;

import java.awt.*;
import java.awt.geom.Line2D;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.*;


/**
 * @author Heidi Portwine (S6110438)
 */
public class World extends JComponent
{
    // Variables and attributes declared.
    public static final int gridSize = 20;
    private static final int animationDelay = 20;
    private static final int lifeUpdateDelay = 33;
    public static Life[][] cellsArray;
    public static Life[][] copyOfCells;
    private Timer timer;
    private int rows = Life.size, columns = Life.size;
    private int frame;
    
    // Booleans created to decided true or false depending on state.
    boolean start;
    boolean reset;

    /**
     * Constructor for World. Calls makeWorld() method 
     * and sets the dimensions of the world.
     */
    public World()
    {
        super();
        this.setPreferredSize(new Dimension(550,550));
        makeWorld();
    }

    /**
     * Creates a new world for the game.
     */
    public void makeWorld()
    {
        cellsArray = new Life[rows][columns];
        
        for(int i = 0; i < rows; i++)
        {
            for(int j = 0; j < columns; j++)
            {
                cellsArray[i][j] = new Life(i,j,(Math.random()<0.1));
            }
        }
    }

    /**
     * Start Button method that creates a new timer object and calls Animation().
     * Sets start to true, reset to false and finally calls the updateWorld() method.
     */
    public void startButton() 
    {
        timer = new Timer();
        timer.schedule(new Animation(),0,animationDelay);
        start = true;	
        reset = false;
        updateWorld();
    }
    
    /**
     * Reset Button method that cancels the time if it is not already null. 
     * Sets start to false and reset to true. Lastly calls the method makeWorld().
     */
    public void resetButton() 
    {
        if(timer != null)
        {
            timer.cancel();
        }
        start = false;
        reset = true;
        makeWorld();	  
    }
    
    /**
     * Pause Button method stops the timer until the start button is pressed.
     */
    public void pauseButton() 
    {
        if(timer != null)
        {
            timer.cancel();
        } 
    }
    
    /**
     * Speed Button method that increments the speed of the game 
     * every time the button is pressed.
     */
    public void speedButton() 
    {
        timer.schedule(new Animation(),0,animationDelay);	
    }
    
    /**
     * Updates the world created according to the game rules.
     */
    public void updateWorld()
    {
        // Creates an array of rows and columns.
        copyOfCells = new Life[rows][columns];
        
        for(int i = 0; i < rows; i++)
        {
            for(int j = 0; j < columns; j++)
            {
                copyOfCells[i][j] = cellsArray[i][j];
            }
        }
        for(int i = 0; i < rows; i++)
        {
            for(int j = 0; j < columns; j++)
            {
                checkGameRules(cellsArray[i][j], copyOfCells[i][j]);
            }
        }
        for(int i = 0; i < rows; i++)
        {
            for(int j = 0; j < columns; j++)
            {
                cellsArray[i][j] = copyOfCells[i][j];
            }
        }
        // Calls the repaint() method to update the component.
        this.repaint();	
    }

    /**
     * Method that defines the rules of the game.
     * @param cell
     * @param cell1 
     */
    public void checkGameRules(Life cell, Life cell1)
    {       
        // Checks the neighbours of the current cell and counts the live ones.
        int lNeighbours = checkCellNeighbours(cell);
        
        // Checks if the cell is currently alive. 
        if(cell.isCellAlive())
        {
            // If so then it checks if the cell has less than 2 or more than 3 live neighbours.
            if(lNeighbours < 2 || lNeighbours > 3)
            {
                // If the cell has more than 3 live neighbours then the cell dies.
                copyOfCells[cell.getRow()][cell.getColumn()].setCellAlive(false);	
            }
        }
        // Else if the cell has 3 live neighbours, then the cell becomes alive.
        else if(lNeighbours == 3)
        {
            copyOfCells[cell.getRow()][cell.getColumn()].setCellAlive(true);
        }
    }

    /**
     * Method that is used to check on a cell's neighbours.
     * @param cell
     * @return neighbours
     */
    private int checkCellNeighbours(Life cell) 
    {
        // Initialises variables as integers.
        int neighbours = 0;
        int topY;
        int bottomY;
        int rightX;
        int leftX;
        
        // Checking for top cell by getting the column number minus 1.
        if(cell.getColumn()-1 >= 0)
        {
            // If its greater than or equal to 0 then its the top cell.
            topY = cell.getColumn()-1;
        }
        else
        {
            topY = cell.getColumn();
        }
        
        // Checking for bottom cell by getting the column number plus 1. 
        
        if(cell.getColumn()+1 < Life.size)
        {
            // If it less than the life size then its the bottom cell.
            bottomY = cell.getColumn()+1;
        }
        else
        {
            bottomY = cell.getColumn();
        }
        
        // Checking for right cell by getting the row number plus 1.
        if(cell.getRow()+1 < Life.size)
        {
            // If its less than the life size then its the right cell.
            rightX = cell.getRow()+1;
        }
        else
        {
            rightX = cell.getRow();
        }
        
        // Checking for left cell by getting the row number minus 1.
        if(cell.getRow()-1 >= 0)
        {
            // If its greater than or equal to 0 then its the left cell.
            leftX = cell.getRow()-1;
        }
        else
        {
            leftX = cell.getRow();
        }

        for(int x = leftX; x <= rightX; x++)
        {
            for(int y = topY; y <= bottomY; y++)
            {
                if(cellsArray[x][y].isCellAlive() && !(x == cell.getRow() && y == cell.getColumn()))
                {
                    neighbours++;
                }
            }
        }
        return neighbours;
    }

    /**
     * Method that deals with the Graphics of the GUI. 
     * Sets the colours of squares and lines.
    Puts the cellsArray on the board.
     * @param gr 
     */
    @Override
    protected void paintComponent(Graphics gr)
    {
        // Defines a basic set of rendering attributes for the outlines of graphics primitives.
        Graphics2D gr2 = (Graphics2D)gr;
        gr2.setColor(Color.BLACK);
        gr2.setStroke(new BasicStroke(3));
           
        // Drawing the lines on the grid.
        for(int i=0; i<=Life.size; i++)
        {
            Line2D hLine = new Line2D.Double(0,i*gridSize,590,i*gridSize);
            Line2D vLine = new Line2D.Double(i*gridSize,0,i*gridSize,590);
            gr2.draw(hLine);
            gr2.draw(vLine);
        }

        for(int i=0; i<rows; i++)
        {
            for(int j=0; j<columns; j++)
            {
                if(cellsArray[i][j].isCellAlive())
                {
                    cellsArray[i][j].draw(gr2);
                }
            }
        }
    }
    
    /**
     * Animation Class that deals with the timer during run time. 
     * It sets the frame to 0 and during run() checks the booleans 
     * previously created to see which step to execute.
     */
    private class Animation extends TimerTask
    {
        /**
         * Sets the frame to 0.
         */
        public Animation()
        {
            frame = 0;
        }
        
        /**
         * Deals with the application while running.
         */
        @Override
        public void run() 
        {
            // Check if the boolean reset is true
            if(reset)
            {
                // Sets the timer to null.
                timer = null;
                // Cancels the current timer.
                timer.cancel();
                return;
            }
            
            // If the boolean reset is false then it excecutes the code below.
            // Increaments the tick 
            frame++;
            
            // Divides the frame number by the lifeUpdateDelay 
            // and checks if its equal to 0. (% finds the remainder)
            if(frame % lifeUpdateDelay == 0)
            {
                // Calls the update world method 
                updateWorld();
            }
            // Calls the repaint() method to update component.
            repaint(); 
        }
    }
}
