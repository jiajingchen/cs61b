/* OpenCommercial.java */

import java.net.*;
import java.io.*;

/**  A class that provides a main function to read five lines of a commercial
 *   Web page and print them in reverse order, given the name of a company.
 */

class OpenCommercial {

  /** Prompts the user for the name X of a company (a single string), opens
   *  the Web site corresponding to www.X.com, and prints the first five lines
   *  of the Web page in reverse order.
   *  @param arg is not used.
   *  @exception Exception thrown if there are any problems parsing the 
   *             user's input or opening the connection.
   */
  public static void main(String[] arg) throws Exception {

    BufferedReader keyboard;
    String inputLine;

    keyboard = new BufferedReader(new InputStreamReader(System.in));

    System.out.print("Please enter the name of a company (without spaces): ");
    System.out.flush();        /* Make sure the line is printed immediately. */
    inputLine = keyboard.readLine();

    String stringurl="www."+inputLine+".com";
    System.out.print(stringurl);
    URL url = new URL(stringurl);
    try
    {
      URLConnection conn = url.openConnection();
      BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
      String line = null;
      while ((line = reader.readLine()) != null)
      System.out.print(line);
      
      reader.close();
    }
    catch (MalformedURLException e) 
        {
            e.printStackTrace(); 
        }
    catch (IOException e)
        {
            e.printStackTrace(); 
        }
    
    

    

    /* Replace this comment with your solution.  */

  }
}
