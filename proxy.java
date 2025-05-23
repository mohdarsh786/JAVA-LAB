class SharedResource {
    String data;
    boolean available = false;

    public synchronized void produce(String value) throws InterruptedException 
    {
        while (available) wait();
        data = value;
        available = true;
        System.out.println("Producer produced: " + data);
        notify();
    }

    public synchronized void consume() throws InterruptedException 
    {
        while (!available) wait();
        System.out.println("Consumer consumed: " + data);
        available = false;
        notify();
    }
}

class Producer extends Thread 
{
    SharedResource res;
    Producer(SharedResource res) 
    {
        this.res = res;
    }

    public void run() 
    {
        try 
        {
            while (true) 
            {
                res.produce("Hello");
                Thread.sleep(1000);
            }
        } 
        catch (InterruptedException e) 
        {
            System.out.println(e);
        }
    }
}

class Consumer extends Thread 
{
    SharedResource res;
    Consumer(SharedResource res) 
    {
        this.res = res;
    }

    public void run() 
    {
        try 
        {
            while (true) 
            {
                res.consume();
                Thread.sleep(1000);
            }
        } 
        catch (InterruptedException e) 
        {
            System.out.println(e);
        }
    }
}

public class proxy 
{
    public static void main(String[] args) 
    {
        SharedResource res = new SharedResource();
        new Producer(res).start();
        new Consumer(res).start();
    }
}
