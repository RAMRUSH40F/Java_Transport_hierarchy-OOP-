package Abstractions;

import InnerObjects.Engine;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public abstract class Machine
{

    protected            String             name;
    static final         int                DEFAULT_HP  = 100;
    protected            Engine             engine;
    private final        int                id;
    private static final ArrayList<Integer> healthPoint = new ArrayList<>(List.of(0));
    protected            int                fuel;

    Machine()
    {
        this.id = healthPoint.size();
        healthPoint.add(DEFAULT_HP);
    }

    public static int getNumOfInstances()
    {
        return healthPoint.size() - 1;
    }

    public static ArrayList<Integer> getHealthPoint()
    {
        return healthPoint;
    }

    public void setHealthPoint(int new_value)
    {
        healthPoint.set(this.getId(), new_value);
    }

    public void fill(int gasAmount)
    {
        System.out.println(this.name + " filled with gas. " + fuel + " -> " + (fuel + 200));
        fuel += 200;

    }

    public void start()
    {
        System.out.println("Turn a key!");
        engine.start();
        fuel -= 50;
    }

//  Getters and setters.


    public void stop()
    {
        engine.stop();
        System.out.println("Stopped.");
    }

    public void info()
    {
        System.out.println("Name: " + this.getName() + ". Fuel: " + this.getFuel());
        if (Objects.nonNull(this.engine))
            System.out.println(
                    "Engine: " + this.engine.getName() + ". Force: " + this.engine.getForce_power());
    }

    public String getName()
    {
        if (Objects.isNull(this.name))
            return "null";
        return name;
    }

    public int getFuel()
    {
        return fuel;
    }

    public int getId()
    {
        return id;
    }

    // Overriding default methods.
    @Override
    public String toString()
    {

        return Objects.toString(this.getClass()).substring(6) + " " + this.getName() + ": " + this.hashCode();
    }

    @Override
    public boolean equals(Object obj)
    {
        if (!(obj instanceof Machine))
            return false;
        return this.hashCode() == obj.hashCode();

    }

    @Override
    public int hashCode()
    {
        return id + 1923;
    }

}

