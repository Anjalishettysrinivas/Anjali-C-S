class Measure extends userInput{
public float[] speed(int n)
{
  ArrayList<float> input = userInput.distanceAndTime;
float ans = new float[n];
for(int i=0;i<n;i++)
{
 ans.add(input[i][0]/input[i][1]);
}
return ans;
}
}