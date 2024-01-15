import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author Ryan
 * @version December 2023
 */
public class MyWorld extends World
{
    Counter counter = new Counter();
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(900, 650, 1);
        prepare();
    }
    public Counter getCounter()
    {
        return counter;
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Rocket rocket = new Rocket();
        addObject(rocket,450,325);
        Rocks rocks = new Rocks();
        addObject(rocks, Greenfoot.getRandomNumber(900), Greenfoot.getRandomNumber(650));
        Rocks rocks2 = new Rocks();
        addObject(rocks2, Greenfoot.getRandomNumber(900), Greenfoot.getRandomNumber(650));
        Rocks rocks3 = new Rocks();
        addObject(rocks3, Greenfoot.getRandomNumber(900), Greenfoot.getRandomNumber(650));
        Rocks rocks4= new Rocks();
        addObject(rocks4, Greenfoot.getRandomNumber(900), Greenfoot.getRandomNumber(650));
        Rocks rocks5= new Rocks();
        addObject(rocks5, Greenfoot.getRandomNumber(900), Greenfoot.getRandomNumber(650));
        Rocks rocks6= new Rocks();
        addObject(rocks6, Greenfoot.getRandomNumber(900), Greenfoot.getRandomNumber(650));
        Rocks rocks7= new Rocks();
        addObject(rocks7, Greenfoot.getRandomNumber(900), Greenfoot.getRandomNumber(650));
        addObject(counter,75,40);
        
    }
}
