public class Date {
 
    protected int month;
    protected int day;
    protected int year;
    
    public int Compare;
 
    public Date(){
        month = 0;
        day = 0;
        year = 0;
 
    }
    public Date(int month, int day, int year){
 
        this.month = month;
        this.day = day;
        this.year = year;
    }
 
    public int getyear(){
 
        return year;
    }
    public int getmonth(){
        return month;
    }
    public int getday(){
        return day;
    }
    public int compare(Date dt){
        int totaldays = 0;
        int p1 = ((dayofYear(dt) + dt.year * 365)/ 30);
        int p2 = ((dayofYear(this) + this.year * 365)/30);
        totaldays = Math.abs(p1 - p2);
        if (totaldays > 60)
            totaldays = 60;
        Compare = totaldays;
        return Compare;
    }
 
    public int dayofYear (Date date) { 
        int totalDays = 0; 
 
        switch (date.month) { 
        case 12: totalDays += 30; 
        case 11: totalDays += 31; 
        case 10: totalDays += 30; 
        case 9 : totalDays += 31; 
        case 8 : totalDays += 31; 
        case 7 : totalDays += 30; 
        case 6 : totalDays += 31; 
        case 5 : totalDays += 30; 
        case 4 : totalDays += 31; 
        case 3 : totalDays += 28; 
        case 2 : totalDays += 31; 
        }  totalDays += date.day; 
        return totalDays; 
    } }