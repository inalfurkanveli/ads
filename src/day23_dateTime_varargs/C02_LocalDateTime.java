package day23_dateTime_varargs;

import java.time.LocalDateTime;
import java.time.ZoneId;

public class C02_LocalDateTime {
    public static void main(String[] args) throws InterruptedException {

        LocalDateTime ldt=LocalDateTime.now(ZoneId.of("Turkey")); // 2022-12-20T12:29:27.479837
        System.out.println(ldt);


        ldt=LocalDateTime.now();
        System.out.println(ldt); // 2022-12-20T12:30:14.448249700

        System.out.println(ldt.getDayOfWeek()); // TUESDAY


    }
}
