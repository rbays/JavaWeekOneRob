package dayTwo.animalsTask;

/**
 * Created by student on 28-Jun-16.
 */
public abstract class Animal {
    private boolean spine;
    private int lifeExpectancy;
    public String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLifeExpectancy(int life){lifeExpectancy = life;}
    public int getLifeExpectancy(){return lifeExpectancy;}

    public boolean hasSpine() {return spine;}

    public void setSpine(boolean hasSpine) {this.spine = hasSpine;
    }

    public Animal(){}

    public abstract void move();
    public abstract void eat();
    public abstract void reproduce();


}
