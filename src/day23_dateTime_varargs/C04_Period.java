package day23_dateTime_varargs;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

public class C04_Period {
    public static void main(String[] args) {

        LocalDate dogumTarihi= LocalDate.of(1997,8,1);

        LocalDate bugununTarihi= LocalDate.now();

        Period yas= Period.between(dogumTarihi,bugununTarihi);
        System.out.println(yas); // P25Y4M19D
        System.out.println(yas.getYears()); // 25

        LocalDate atatürk=LocalDate.of(1881,1,4);
        LocalDate now= LocalDate.now();
        Period atatürkYas=Period.between(atatürk,now);
        System.out.println(atatürkYas); // P141Y11M16D


    }
}
