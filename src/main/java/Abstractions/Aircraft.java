package Abstractions;

public abstract class Aircraft extends Machine
{

    public void launch()
    {
        System.out.println("Двигатель" + this.engine.getName() + "запущен.");
        this.start();
    }

    public void start()
    {
        System.out.println("Turn a key!");
        this.engine.start();
        fuel -= 50;
    }

    public void stop()
    {
        this.engine.stop();
        System.out.println("Stopped.");
    }

}
