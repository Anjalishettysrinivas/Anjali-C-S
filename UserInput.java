import java.util.ArrayList;
import java.util.Arrays;
class userInput{     
    public ArrayList<float>[][]  distanceAndTime(int n,int N)
{       
    System.out.print("Enter User" + (n+1) +"Distance:");       
     float distance = userIn.nextFloat();    
     System.out.print("Enter user" + (n+1) + " Time");        
     float time = userIn.nextfloat();    
     ArrayList<float>[][] input = new ArrayList[N][2];
     input[n][0].add(distance);
     input[n][1].add(time);
     return input;
}
}


