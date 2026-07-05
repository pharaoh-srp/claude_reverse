package defpackage;

import io.sentry.e0;
import java.time.DateTimeException;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import kotlinx.datetime.DateTimeFormatException;
import kotlinx.datetime.UtcOffset;

/* JADX INFO: loaded from: classes3.dex */
public abstract class epi {
    public static final u0h a = new u0h(new kdi(23));
    public static final u0h b = new u0h(new kdi(24));
    public static final u0h c = new u0h(new kdi(25));

    public static final UtcOffset a(Integer num, Integer num2, Integer num3) {
        try {
            if (num != null) {
                ZoneOffset zoneOffsetOfHoursMinutesSeconds = ZoneOffset.ofHoursMinutesSeconds(num.intValue(), num2 != null ? num2.intValue() : 0, num3 != null ? num3.intValue() : 0);
                zoneOffsetOfHoursMinutesSeconds.getClass();
                return new UtcOffset(zoneOffsetOfHoursMinutesSeconds);
            }
            if (num2 != null) {
                ZoneOffset zoneOffsetOfHoursMinutesSeconds2 = ZoneOffset.ofHoursMinutesSeconds(num2.intValue() / 60, num2.intValue() % 60, num3 != null ? num3.intValue() : 0);
                zoneOffsetOfHoursMinutesSeconds2.getClass();
                return new UtcOffset(zoneOffsetOfHoursMinutesSeconds2);
            }
            ZoneOffset zoneOffsetOfTotalSeconds = ZoneOffset.ofTotalSeconds(num3 != null ? num3.intValue() : 0);
            zoneOffsetOfTotalSeconds.getClass();
            return new UtcOffset(zoneOffsetOfTotalSeconds);
        } catch (DateTimeException e) {
            e0.i(e);
            return null;
        }
    }

    public static final UtcOffset b(String str, DateTimeFormatter dateTimeFormatter) {
        try {
            return new UtcOffset((ZoneOffset) dateTimeFormatter.parse(str, new dpi()));
        } catch (DateTimeException e) {
            throw new DateTimeFormatException(e);
        }
    }
}
