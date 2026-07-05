package defpackage;

import java.time.DayOfWeek;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.format.DateTimeParseException;
import java.time.format.TextStyle;
import java.time.temporal.WeekFields;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final class o72 {
    public static final ZoneId e = ZoneId.of("UTC");
    public final Locale a;
    public final LinkedHashMap b = new LinkedHashMap();
    public final int c;
    public final ArrayList d;

    public o72(Locale locale) {
        this.a = locale;
        this.c = WeekFields.of(locale).getFirstDayOfWeek().getValue();
        gq6 gq6Var = n72.a;
        ArrayList arrayList = new ArrayList(gq6Var.size());
        int size = gq6Var.size();
        for (int i = 0; i < size; i++) {
            DayOfWeek dayOfWeek = (DayOfWeek) gq6Var.get(i);
            arrayList.add(new cpc(dayOfWeek.getDisplayName(TextStyle.FULL_STANDALONE, locale), dayOfWeek.getDisplayName(TextStyle.NARROW_STANDALONE, locale)));
        }
        this.d = arrayList;
    }

    public final q62 a(long j) {
        LocalDate localDate = Instant.ofEpochMilli(j).atZone(e).toLocalDate();
        return new q62(localDate.getYear(), localDate.getMonthValue(), localDate.getDayOfMonth(), 1000 * localDate.atStartOfDay().toEpochSecond(ZoneOffset.UTC));
    }

    public final u72 b(long j) {
        return c(Instant.ofEpochMilli(j).atZone(e).withDayOfMonth(1).toLocalDate());
    }

    public final u72 c(LocalDate localDate) {
        int value = localDate.getDayOfWeek().getValue() - this.c;
        if (value < 0) {
            value += 7;
        }
        return new u72(localDate.atTime(LocalTime.MIDNIGHT).atZone(e).toInstant().toEpochMilli(), localDate.getYear(), localDate.getMonthValue(), localDate.lengthOfMonth(), value);
    }

    public final q62 d() {
        LocalDate localDateNow = LocalDate.now();
        return new q62(localDateNow.getYear(), localDateNow.getMonthValue(), localDateNow.getDayOfMonth(), localDateNow.atTime(LocalTime.MIDNIGHT).atZone(e).toInstant().toEpochMilli());
    }

    public final q62 e(String str, String str2, Locale locale) {
        try {
            LocalDate localDate = LocalDate.parse(str, kvj.c(str2, locale, this.b));
            return new q62(localDate.getYear(), localDate.getMonth().getValue(), localDate.getDayOfMonth(), localDate.atTime(LocalTime.MIDNIGHT).atZone(e).toInstant().toEpochMilli());
        } catch (DateTimeParseException unused) {
            return null;
        }
    }

    public final String toString() {
        return "CalendarModel";
    }
}
