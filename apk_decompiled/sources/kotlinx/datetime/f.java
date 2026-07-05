package kotlinx.datetime;

import java.time.DateTimeException;
import kotlinx.datetime.DateTimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public abstract class f {
    public static final long a = java.time.LocalDate.MIN.toEpochDay();
    public static final long b = java.time.LocalDate.MAX.toEpochDay();

    public static final LocalDate a(LocalDate localDate, long j, DateTimeUnit.DayBased dayBased) {
        try {
            long jAddExact = Math.addExact(localDate.getValue().toEpochDay(), Math.multiplyExact(j, dayBased.getDays()));
            long j2 = a;
            if (jAddExact <= b && j2 <= jAddExact) {
                java.time.LocalDate localDateOfEpochDay = java.time.LocalDate.ofEpochDay(jAddExact);
                localDateOfEpochDay.getClass();
                return new LocalDate(localDateOfEpochDay);
            }
            throw new DateTimeException("The resulting day " + jAddExact + " is out of supported LocalDate range.");
        } catch (Exception e) {
            if (!(e instanceof DateTimeException) && !(e instanceof ArithmeticException)) {
                throw e;
            }
            throw new DateTimeArithmeticException("The result of adding " + j + " of " + dayBased + " to " + localDate + " is out of LocalDate range.", e);
        }
    }
}
