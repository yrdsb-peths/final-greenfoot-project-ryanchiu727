import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Rocket here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Rocket extends SpaceObjects
{
    /**
     * Act - do whatever the Rocket wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int horizontalSpeed = 0;
    int verticalSpeed = 0;
    boolean fired = false;
    boolean hitRock = false;
    public Rocket()
    {
        getImage().scale(getImage().getWidth()/2,getImage().getHeight()/2);
    }
    public void act()
    {
        turnCommand();
        moveOnCommand();
        setLocation(getX() + horizontalSpeed/2, getY() + verticalSpeed/2);
        //wrapAtEdge();
        bounceAtEdge();
        shootOnCommand();
        hitRocks();
    }
    public void turnCommand()
    {
        if (Greenfoot.isKeyDown("up"))
        {
            setRotation(270);
        }
        if (Greenfoot.isKeyDown("right"))
        {
            setRotation(0);
        }
                if (Greenfoot.isKeyDown("left"))
        {
            setRotation(180);
        }
                if (Greenfoot.isKeyDown("down"))
        {
            setRotation(90);
        }
    }
    public void moveOnCommand()
    {
        if (Greenfoot.isKeyDown("space"))
        {
            if (getRotation() == 0)
            {
                horizontalSpeed++;
            }
                        if (getRotation() == 180)
            {
                horizontalSpeed--;
            }
                        if (getRotation() == 90)
            {
                verticalSpeed++;
            }
                        if (getRotation() == 270)
            {
                verticalSpeed--;
            }
        }
    }
    public void bounceAtEdge()
    {
                if (getX() == 0)
        {
            horizontalSpeed = -horizontalSpeed;
        }
        if (getY() == 0)
        {
            verticalSpeed = -verticalSpeed;
        }
        if (getX() == 899)
        {
            horizontalSpeed = -horizontalSpeed;
        }
        if (getY() == 649)
        {
            verticalSpeed = -verticalSpeed;
        }
    }
    public void shootOnCommand()
    {
        Projectile projectile = new Projectile();
        if (Greenfoot.isKeyDown("f") && fired == false)
        {
            getWorld().addObject(projectile, getX(), getY());
            projectile.setRotation(getRotation());
            fired = true;
        }
        if (!Greenfoot.isKeyDown("f"))
        {
            fired = false;
        }
    }
    public void hitRocks()
    {
        if(isTouching(AllRocks.class)&& hitRock == false)
        {
            MyWorld myWorld = (MyWorld)getWorld();
            HealthBar healthbar = myWorld.getHealthBar();
            healthbar.health--;
            hitRock = true;
        }
        else if (!isTouching(AllRocks.class))
        {
            hitRock = false;
        }
    }
}
