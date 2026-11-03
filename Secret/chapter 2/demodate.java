import java.util.*;

public class demodate {

    public static void main(String[] args) {
        Date d1=new Date();
        int date1=d1.getDate();
        int mon=d1.getMonth()+1;
        int yr=d1.getYear()+1900;
        System.out.println(date1+"/"+mon+"/"+yr);
    }
}

/* 
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class demodate {

    public static void main(String[] args) {
        // Captures the current date
        LocalDate d1 = LocalDate.now();
        
        // Formats the date directly to DD/MM/YYYY
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        
        // Output: 08/06/2026
        System.out.println(d1.format(formatter));
    }
}*/
