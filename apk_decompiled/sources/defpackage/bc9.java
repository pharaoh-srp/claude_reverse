package defpackage;

import java.time.Instant;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Date;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: loaded from: classes.dex */
public final class bc9 implements KSerializer {
    public static final bc9 a = new bc9();
    public static final rfd b = j8.h("Date", kfd.t);

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        Instant instant;
        decoder.getClass();
        DateTimeFormatter dateTimeFormatter = ac9.a;
        String strS = decoder.s();
        strS.getClass();
        try {
            instant = Instant.parse(strS);
        } catch (DateTimeParseException unused) {
            instant = OffsetDateTime.parse(strS).toInstant();
        }
        Date dateFrom = Date.from(instant);
        dateFrom.getClass();
        return dateFrom;
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        Date date = (Date) obj;
        encoder.getClass();
        date.getClass();
        String str = ac9.a.format(date.toInstant().atOffset(ZoneOffset.UTC));
        str.getClass();
        encoder.F(str);
    }
}
