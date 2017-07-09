import java.io.*;

public class nuke2{

  /** Prompts the user for the name X of a company (a single string), opens
   *  the Web site corresponding to www.X.com, and prints the first five lines
   *  of the Web page in reverse order.
   *  @param arg is not used.
   *  @exception Exception thrown if there are any problems parsing the 
   *             user's input or opening the connection.
   */
  public static void main(String[] arg){
  	String news = null;
  	if (arg!=null){
  		news=arg[0]+""+arg[1];
  	}


  	System.out.print(news);

  }
}