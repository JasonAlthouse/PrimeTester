package edu.up.cs371.primetester;

/**
 * Created by vegdahl on 7/17/2015.
 *
 * The purpose of this class is to define a static method, isPrime, that determines whether an
 * integer is a prime number.
 */
public class PrimeTester {
    /**
     * Tells whether an integer is prime.
     *
     * @param n the number to test
     * @return true iff n is prime
     */
    public static boolean isPrime(long n) {
        // for now, return a random result
        if(n==1 || n==0)
        {
            return false;
        }
        for(long j = (n-1); j>1; j--)
        {
            if(n%j==0)
            {
                return false;
            }

        }
        return true;
    }
}
