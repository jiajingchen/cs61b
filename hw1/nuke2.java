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
  	String news = "";
    String extract = "";
  	if (arg!=null){
  		news=arg[0];
      extract = news.substring(0,1)+news.substring(2,news.length());
  	}


  	//System.out.println(news);
    System.out.println(extract);

  }
}