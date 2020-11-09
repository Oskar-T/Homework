package com.company;

import java.util.Scanner;
import java.net.URL;
import java.util.ArrayList;

public class ReadViaURL extends Main {

    public static String[] readWords (String urlAddress) {

        ArrayList<String> wordList = new ArrayList<> ();
        try {
            URL url = new URL (urlAddress);

            try (Scanner input = new Scanner (url.openStream ())) {
                while (input.hasNext ())
                    wordList.add (input.next ());

            }
            catch (Exception e) {
                System.out.println ("got exception: " + e);
                System.exit (1);
            }
        }
        catch (Exception e)
        {
            System.out.println ("got exception: " + e);
            System.exit (1);
        }
        return wordList.toArray (new String [0]);
    }
}