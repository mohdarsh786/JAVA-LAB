// Program 20
// Write a java program for to solve producer
// consumer problem in which a producer produce a value and consumer consume the value before producer generate the next value.
import java.util.Scanner;
import java.io.*;
class mythread extends Thread
{
    static String filename = "data.txt";
    int choice;

    mythread(int choice)
    {
        this.choice = choice;
    }

    public synchronized void producer()
    {
        try (BufferedReader br = new BufferedReader(new FileReader(filename)))
        {
            FileWriter wr = new FileWriter(filename);
            if ((br.readLine()) == null)
            {
                wr.write("Hello");
                wr.close();
                System.out.println("Producer Produced.... Hello");
                Thread.sleep(1000);
                notify(); 
            }
            else
            {
                wait();
            }
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }

    public synchronized void consumer()
    {
        try (BufferedReader br = new BufferedReader(new FileReader(filename)))
        {
            String h;
            h = br.readLine();
            if (h != null)
            {
                System.out.println("Consumer consumed.... " + h);
                FileWriter wr = new FileWriter(filename);
                wr.write("");
                wr.close();
                Thread.sleep(1000);
                notify();
            }
            else
            {
                wait();
            }
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }

    public void run()
    {
        while (true)
        {
            if (choice == 1)
            {
                producer();
            }
            else if (choice == 2)
            {
                consumer();
            }
        }
    }
}

class Procon
{
    public static void main(String[] st)
    {
        Scanner data = new Scanner(System.in);
        System.out.println("Press 1 for producer or 2 for consumer, 0 to exit");
        while (true)
        {
            int ch = data.nextInt();
            if (ch == 0)
            {
                System.out.println("Exiting...");
                break;
            }
            else if (ch == 1 || ch == 2)
            {
                mythread obj = new mythread(ch);
                obj.start();
            }
            else
            {
                System.out.println("Invalid choice");
            }
        }
        data.close();
    }
}