package defpackage;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zx6 {
    public static final DateTimeFormatter a;
    public static final DateTimeFormatter b;

    static {
        DateTimeFormatter dateTimeFormatterOfPattern = DateTimeFormatter.ofPattern("EEE MMM d yyyy");
        dateTimeFormatterOfPattern.getClass();
        a = dateTimeFormatterOfPattern;
        DateTimeFormatter dateTimeFormatterOfPattern2 = DateTimeFormatter.ofPattern("EEE MMM d yyyy • h:mma");
        dateTimeFormatterOfPattern2.getClass();
        b = dateTimeFormatterOfPattern2;
    }

    public static final String a(OffsetDateTime offsetDateTime, OffsetDateTime offsetDateTime2) {
        offsetDateTime.getClass();
        DateTimeFormatter dateTimeFormatter = a;
        String str = dateTimeFormatter.format(offsetDateTime);
        String str2 = offsetDateTime2 != null ? dateTimeFormatter.format(offsetDateTime2) : null;
        if (str2 != null && !x44.r(str, str2)) {
            return ij0.C(str, " - ", str2);
        }
        str.getClass();
        return str;
    }

    public static final String b(OffsetDateTime offsetDateTime, OffsetDateTime offsetDateTime2) {
        offsetDateTime.getClass();
        DateTimeFormatter dateTimeFormatterOfPattern = DateTimeFormatter.ofPattern("h:mm");
        DateTimeFormatter dateTimeFormatterOfPattern2 = DateTimeFormatter.ofPattern("h:mma");
        if (offsetDateTime2 == null) {
            String str = dateTimeFormatterOfPattern2.format(offsetDateTime);
            str.getClass();
            String lowerCase = str.toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            return lowerCase;
        }
        String str2 = dateTimeFormatterOfPattern.format(offsetDateTime);
        String str3 = dateTimeFormatterOfPattern.format(offsetDateTime2);
        String str4 = DateTimeFormatter.ofPattern("a").format(offsetDateTime);
        String str5 = DateTimeFormatter.ofPattern("a").format(offsetDateTime2);
        if (x44.r(str4, str5)) {
            str5.getClass();
            String lowerCase2 = str5.toLowerCase(Locale.ROOT);
            lowerCase2.getClass();
            return str2 + " - " + str3 + lowerCase2;
        }
        str4.getClass();
        Locale locale = Locale.ROOT;
        String lowerCase3 = str4.toLowerCase(locale);
        lowerCase3.getClass();
        str5.getClass();
        String lowerCase4 = str5.toLowerCase(locale);
        lowerCase4.getClass();
        return str2 + lowerCase3 + " - " + str3 + lowerCase4;
    }
}
