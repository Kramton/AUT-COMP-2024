package chapter1;

/**
   A class which demonstrates a race condition and the need
   for code synchronization
   @author Andrew Ensor
*/
import java.util.Random;

public class MoneyMover implements Runnable
{
   private int accountA, accountB; // dollar amounts between 0 and 10
   private final int SUM = 10; // total amount of money
   private Random generator;
   
   public MoneyMover()
   {  accountA = 5;
      accountB = SUM-accountA;
      generator = new Random();
      Thread threadA = new Thread(this);
      Thread threadB = new Thread(this);
      threadA.start();
      threadB.start();
   }
   
   public void run()
   {  // should loop forever unless money disappears or appears
      while (isSumCorrect())
      {  // randomly either transfer from A to B or from B to A
         if (generator.nextInt(2)==0)
            transferAToB();
         else
            transferBToA();
      }
      System.out.println("Problem: account A = " + accountA + 
         ", account B = " + accountB);
   }
   
   // transfer one dollar from account A to account B
   // note this method needs to be synchronized
   private synchronized void transferAToB()
   {  System.out.println("Transfering A to B");
        if (accountA>0)
       {  accountA--;
          accountB++;
       }
   }

   // transfer one dollar from account B to account A
   // note this method needs to be synchronized
   private synchronized void transferBToA()
   {  System.out.println("Transfering B to A");
       if (accountB>0)
      {  accountB--;
         accountA++;
      }
   }
   
   // checks whether the total amount is correct
   // note this method needs to be synchronized
   private synchronized boolean isSumCorrect()
   {  return (accountA+accountB==SUM);
   }
   
   public static void main(String[] args)
   {  new MoneyMover();
   }
}
