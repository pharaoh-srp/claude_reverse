package defpackage;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.chrono.IsoChronology;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.format.DateTimeParseException;
import java.time.format.ResolverStyle;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: loaded from: classes3.dex */
public final class ay6 implements KSerializer {
    public static final ay6 a = new ay6();
    public static final DateTimeFormatter b;
    public static final rfd c;

    static {
        DateTimeFormatter dateTimeFormatterWithChronology = new DateTimeFormatterBuilder().parseCaseInsensitive().append(DateTimeFormatter.ISO_LOCAL_DATE_TIME).optionalStart().appendOffsetId().optionalEnd().optionalStart().appendOffset("+HHMMss", "Z").optionalEnd().toFormatter().withResolverStyle(ResolverStyle.STRICT).withChronology(IsoChronology.INSTANCE);
        dateTimeFormatterWithChronology.getClass();
        b = dateTimeFormatterWithChronology;
        c = j8.h("OffsetDateTime", kfd.t);
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [java.time.ZonedDateTime] */
    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        OffsetDateTime offsetDateTime;
        decoder.getClass();
        String string = bsg.k1(decoder.s()).toString();
        try {
            try {
                OffsetDateTime offsetDateTime2 = OffsetDateTime.parse(string, b);
                offsetDateTime2.getClass();
                return offsetDateTime2;
            } catch (DateTimeParseException unused) {
                offsetDateTime = LocalDateTime.parse(string).atZone(ZoneId.systemDefault()).toOffsetDateTime();
                offsetDateTime.getClass();
                return offsetDateTime;
            }
        } catch (DateTimeParseException unused2) {
            offsetDateTime = LocalDate.parse(string).atStartOfDay(ZoneId.systemDefault()).toOffsetDateTime();
            offsetDateTime.getClass();
            return offsetDateTime;
        }
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return c;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        OffsetDateTime offsetDateTime = (OffsetDateTime) obj;
        encoder.getClass();
        offsetDateTime.getClass();
        String string = offsetDateTime.toString();
        string.getClass();
        encoder.F(string);
    }
}
