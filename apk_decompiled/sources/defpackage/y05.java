package defpackage;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

/* JADX INFO: loaded from: classes2.dex */
public abstract class y05 {
    public static final Duration a = Duration.ofHours(1);

    public static final String a(Instant instant, Instant instant2, ZoneId zoneId) {
        instant2.getClass();
        ZonedDateTime zonedDateTimeAtZone = instant.atZone(zoneId);
        LocalDate localDate = zonedDateTimeAtZone.toLocalDate();
        LocalDate localDate2 = instant2.atZone(zoneId).toLocalDate();
        if (x44.r(localDate, localDate2)) {
            String str = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT).format(zonedDateTimeAtZone);
            str.getClass();
            return str;
        }
        if (localDate.isAfter(localDate2.minusDays(7L))) {
            return ij0.C(DateTimeFormatter.ofPattern("EEEE").format(zonedDateTimeAtZone), " ", DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT).format(zonedDateTimeAtZone));
        }
        String str2 = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM).format(zonedDateTimeAtZone);
        str2.getClass();
        return str2;
    }

    public static String b(Instant instant, Instant instant2, Instant instant3) {
        ZoneId zoneIdSystemDefault = ZoneId.systemDefault();
        zoneIdSystemDefault.getClass();
        instant3.getClass();
        if (instant != null && x44.r(instant.atZone(zoneIdSystemDefault).toLocalDate(), instant2.atZone(zoneIdSystemDefault).toLocalDate()) && Duration.between(instant, instant2).compareTo(a) <= 0) {
            return null;
        }
        return a(instant2, instant3, zoneIdSystemDefault);
    }
}
