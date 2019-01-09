import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class GoogleBillboard extends PApplet {

public final static String e = "2718281828459045235360287471352662497757247093699959574966967627724076630353547594571382178525166427427466391932003059";  
public void setup()  
{
  double ans = 0;           
  for(int i = 0; i < 100; i++) {
    if(isPrime(Double.parseDouble(e.substring(i, i+10)))) {
      ans = Double.parseDouble(e.substring(i, i+10));
      break;
    }
  }
  System.out.println(ans);
}  
public void draw()  
{   

}  
public boolean isPrime(double num)  
{   
  if(num <= 1) {
      return false;
  }
  for(int i = 2; i <= Math.sqrt(num); i++) {
    if(num%i == 0) {
      return false;
    }
  }
  return true;
} 
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "GoogleBillboard" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
