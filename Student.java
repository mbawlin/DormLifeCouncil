public class Student {
 
    public String StudentName; 
    public char StudentGender; 
    public int Month; 
    public int Day; 
    public int Year; 
    Date birthDay = new Date (); 
    Preferences pref;  
    public boolean matched; 
 
    public Student () { 
    StudentName = ""; 
    StudentGender = 'M'; 
    matched = false; 
    birthDay = new Date (Month, Day, Year); 
 
    } 
 
    public Student (String Name, char Gender, boolean matched, Preferences pref) { 
    this.StudentName = Name; 
    this.StudentGender = Gender; 
    this.matched = matched; 
    birthDay = new Date ( Month, Day, Year); 
    this.pref = pref; 
    } 
 
    public void setGender (char Gender) { 
    this.StudentGender = Gender; 
    } 
 
 
    public void setBirthDay ( int Month, int Day, int Year){ 
    birthDay = new Date (Month, Day, Year); 
    } 
 
    public void setMatched (boolean matched){ 
    this.matched = matched; 
    } 
 
    public void setPref(Preferences pref){
    this.pref = pref;
    }
 
    public char getGender () { 
    return this.StudentGender; 
    }
    public int Compatibility(Student st ){ 
        int score = 0; 
        int preference = Math.abs(pref.Compability (st.pref)); 
        int AgeDifference = Math.abs(birthDay.compare(st.birthDay)); 
        if (this.StudentGender != st.getGender()){ 
        score = 0; 
        } 
        else { 
        score = (40 - preference) + (60 - AgeDifference); 
 
        } 
        return score; 
 
        }
}