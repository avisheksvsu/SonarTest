public class DateCalc
{
  public int convert(int d)
  {
    int y=2018;
    
    while (d > 365)
    {
      if (y%400==0 || (y%4==0 && y%100 !=0))
      {
        if (y > 366){
          d-=366;
          y++;
        }
      }
      else
      {
        d-=365;
        y++;
      }
   }
   return y;
  }
}
