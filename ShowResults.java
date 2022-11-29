class ShowResults extends Measure
{   
   public void print(n)
  { 
    float[] ans = Measure.speed(n);
     for(int i=0;i<n;i++)
{
  System.out.println("speed : " + " " + ans[i]);
}
  }
}