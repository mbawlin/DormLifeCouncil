import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.NoSuchElementException;
import java.util.Scanner;
 
public class Match {
 
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Student[] person; 
        person = new Student[100]; 
        int personNum, v=0; 
        String change; 
        for (int a=0; a<100; a++) { 
            person[a] = new Student(); 
        } 
 
 
        Scanner input = new Scanner(System.in); 
        System.out.print("File to load: "); 
        String filename; 
        filename = input.next(); 
        try { 
            Scanner in = new Scanner(new FileReader(filename +".txt")); 
            int a = 0; 
            while (in.hasNextLine() && a<100) { 
                Scanner data = new Scanner(in.nextLine()).useDelimiter("[\t-]"); 
                if (data.hasNext()){ 
                    person[a].StudentName = data.next(); 
                } 
                if (data.hasNext()){ 
                    change = data.next(); 
                    person[a].StudentGender = change.charAt(0); 
                } 
                if (data.hasNext()){ 
                    person[a].birthDay.month = data.nextInt(); 
                    person[a].birthDay.day = data.nextInt(); 
                    person[a].birthDay.year = data.nextInt(); 
                } 
 
                int music =0;
                int reading= 0;
                int chatting = 0;
                int quietTime =0 ;
 
                if (data.hasNext()) 
                    quietTime= data.nextInt(); 
                if (data.hasNext()) 
                    music= data.nextInt(); 
                if (data.hasNext()) 
                    reading= data.nextInt(); 
                if (data.hasNext()) 
                    chatting= data.nextInt(); 
                person[a].pref = new Preferences (quietTime, music, reading, chatting);
                a++; 
            } 
            input.close(); 
        }catch (NoSuchElementException e) { 
            System.out.println(e); 
        }catch (FileNotFoundException e) { 
            System.out.println(e); 
        } 
        for (personNum=0; person[personNum].StudentName !=""; personNum++) { 
        } 
        String[] match = new String[personNum]; 
        int[] results = new int[1000]; 
        v=0; 
        int marker = 0; 
        for (int a=0; a<personNum; a++) { 
            for (v=a+1; v<personNum; v++) { 
                if (person[a].matched==false) { 
                    if (person[a].StudentGender == person[v].StudentGender) { 
 
                        if (person[a].Compatibility(person[v])>results[a]) { 
                            results[a] = person[a].Compatibility(person[v]); 
                            match[a]=person[v].StudentName; 
                            marker = v; 
 
                        } 
                    } 
 
                    else{ 
 
                    } 
                } 
                if (v == personNum-1) { 
                    if (results[a]>0) { 
                        person[a].matched=true; 
                        person[marker].matched=true; 
 
                    } 
                } 
            } 
        } 
 
 
 
        for (int a=0; a<match.length; a++) { 
            for (int b=0; b<match.length; b++) { 
                if (b != a) { 
                    if (match[a] == match[b]) {  
                    } 
                } 
            } 
        } 
 
 
        for (int a=0; a<personNum; a++) { 
            if (match[a] != null) { 
 
                System.out.println(person[a].StudentName + " matches with " + match[a] + " with the score " +results[a]); 
 
            } 
            else { 
 
                System.out.println(person[a].StudentName + " has no matches"); 
            } 
 
 
 
 
        } 
 
 
 
    } 
}