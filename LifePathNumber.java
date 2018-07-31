import java.util.Scanner;

public class LifePathNumber{
  
  private String date;
  private int lifePathNum;
  
      
  public LifePathNumber(String bday){
    date = bday;
    lifePathNum = this.getLifePathNumber();
  }
  
  public int getLifePathNumber(){
    int lifePathNum;
    
    String month1, day1, year1;
    int first, second, monthh, dayy, yearr, total;
    int month = 0, day = 0, year = 0;
    
    first = date.indexOf("/");
    second = date.indexOf("/", first + 1);
    month1 = date.substring(0, first);
    day1 = date.substring(first + 1, second);
    year1 = date.substring(second + 1);

  
    String eleven = Integer.toString(11);
    String twentyTwo = Integer.toString(22);
    
    
    //month  
    if ((month1.equals(eleven)) || month1.equals(twentyTwo)){
      Integer.parseInt(month1);
      month1.equals(monthh);
    } else {
    monthh = Character.getNumericValue(month1.charAt(0)) +
     Character.getNumericValue(month1.charAt(1));
    System.out.println(monthh);
     if (month > 9){
      String monthS = Integer.toString(month);
      monthh = Character.getNumericValue(monthS.charAt(0)) + 
        Character.getNumericValue(monthS.charAt(1));
     }
    }
    System.out.println(monthh);
    
     //day
    if ((day1.equals(eleven)) || day1.equals(twentyTwo)){
      Integer.parseInt(day1);
      day1.equals(dayy);
    } else {         
    dayy = Character.getNumericValue(day1.charAt(0)) +
     Character.getNumericValue(day1.charAt(1));
    if (dayy > 9){
      String dayS = Integer.toString(dayy);
      dayy = Character.getNumericValue(dayS.charAt(0)) + 
        Character.getNumericValue(dayS.charAt(1));
    }
    }
    
 
    System.out.println(dayy);
    
    //year
    yearr = Character.getNumericValue(year1.charAt(0)) + Character.getNumericValue(year1.charAt(1)) + 
      Character.getNumericValue(year1.charAt(2)) + Character.getNumericValue(year1.charAt(3));
    if (yearr > 9){
      String yearS = Integer.toString(yearr);
      yearr = Character.getNumericValue(yearS.charAt(0)) + Character.getNumericValue(yearS.charAt(1));
      if (yearr > 9){
      String yearS2 = Integer.toString(yearr);
      yearr = Character.getNumericValue(yearS2.charAt(0)) + Character.getNumericValue(yearS2.charAt(1));
      }
    }    
    System.out.println(yearr);
    
    total = monthh + dayy + yearr;
    if (total > 9){
      String totalS = Integer.toString(total);
      total = Character.getNumericValue(totalS.charAt(0)) + Character.getNumericValue(totalS.charAt(1));
    }
    System.out.println(total);
    
    lifePathNum = total;
   
    return lifePathNum;
  }
  
  public static String getLifePathMeaning(int lifePathNumb){
    String[] meanings = new String[11];
    
    meanings[0] = "You are a natural born leader.";
    meanings[2] = "You are a peace maker.";
    meanings[3] = "You are a planner.";
    meanings[4] = "You embrace freedom.";
    meanings[5] = "You are a rule breaker";
    meanings[6] = "You are a caring person.";
    meanings[7] = "You are a risk seeker.";
    meanings[8] = "You need to have power and authority.";
    meanings[9] = "You are a problem creater.";
    
    return null;
  }
    
    public String toString(){
      return "Name" + name + " - Birthdate: " + birthdate + " - Life Path Number: " + getLifePathNumber;
  }
}


