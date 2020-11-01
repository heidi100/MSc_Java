/*
 * Conways Game Of Life Cell Life Class.
 */
package conwaygof;

import java.awt.Color;
import java.awt.Graphics2D;

/**
 * @author Heidi Portwine (S6110438)
 */
public class Life 
{
    // Declares variable types.
    public static final int size = 50;
    boolean isCellAlive;
    int X, Y, row, column;

    /**
     * Constructor for cell life. 
     * @param x
     * @param y
     * @param b 
     */
    public Life(int x, int y, boolean b)
    {
        this.row = x;
        this.column = y;
        isCellAlive = b;
    }

    /**
     * Gets the column value.
     * @return column
     */
    public int getColumn()
    {
        return column;
    }
    
    /**
     * Gets the row value.
     * @return row
     */
    public int getRow()
    {
        return row;
    }
    
    /** 
     * Returns the boolean for is Alive.
     * @return isCellAlive
     */
    public boolean isCellAlive() 
    {
        return isCellAlive;
    }

    /**
     * Sets is Alive to boolean.
     * @param b 
     */
    public void setCellAlive(boolean b) 
    {
        isCellAlive = b;
    }

    /**
     * Draw Method to set X and Y as the row and columns for the world (grid) created.
     * Sets the colour of the tiles to black.
     * @param gr2 
     */
    public void draw(Graphics2D gr2)
    {
        X =(int)(row*World.gridSize + World.gridSize/2d)-9;
        Y =(int)(column*World.gridSize + World.gridSize/2d)-9;
        gr2.setColor(Color.BLACK);
        gr2.fillRect(X,Y,19,19);
    }

    /**
     * Repaint Method. Repaints the look of the component. 
     */
    public void repaint() 
    { 
        
    }
}
