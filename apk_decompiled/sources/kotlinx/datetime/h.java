package kotlinx.datetime;

import defpackage.djj;
import defpackage.yca;

/* JADX INFO: loaded from: classes3.dex */
public abstract class h {
    public static final YearMonth a(djj djjVar, long j) {
        djjVar.getClass();
        long j2 = j / 12;
        if ((j ^ 12) < 0 && j2 * 12 != j) {
            j2--;
        }
        yca ycaVar = LocalDate.Companion;
        ycaVar.getClass();
        int year = LocalDate.MIN.getYear();
        ycaVar.getClass();
        if (j2 <= LocalDate.MAX.getYear() && year <= j2) {
            long j3 = j % 12;
            return new YearMonth((int) j2, ((int) (j3 + (12 & (((j3 ^ 12) & ((-j3) | j3)) >> 63)))) + 1);
        }
        ycaVar.getClass();
        int year2 = LocalDate.MIN.getYear();
        ycaVar.getClass();
        throw new IllegalArgumentException(("Year " + j2 + " is out of range: " + year2 + ".." + LocalDate.MAX.getYear()).toString());
    }

    public static final long b(YearMonth yearMonth) {
        return (((long) yearMonth.getYear()) * 12) + ((long) (yearMonth.getMonthNumber$kotlinx_datetime() - 1));
    }
}
