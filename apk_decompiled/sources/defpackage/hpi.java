package defpackage;

import java.time.format.DateTimeFormatter;
import kotlinx.datetime.UtcOffset;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: loaded from: classes3.dex */
public final class hpi implements KSerializer {
    public static final hpi a = new hpi();
    public static final rfd b = j8.h("kotlinx.datetime.UtcOffset", kfd.t);

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        zoi zoiVar = UtcOffset.Companion;
        String strS = decoder.s();
        u0h u0hVar = cpi.a;
        bpi bpiVar = (bpi) u0hVar.getValue();
        zoiVar.getClass();
        strS.getClass();
        bpiVar.getClass();
        if (bpiVar == ((bpi) u0hVar.getValue())) {
            DateTimeFormatter dateTimeFormatter = (DateTimeFormatter) epi.a.getValue();
            dateTimeFormatter.getClass();
            return epi.b(strS, dateTimeFormatter);
        }
        if (bpiVar == ((bpi) cpi.b.getValue())) {
            DateTimeFormatter dateTimeFormatter2 = (DateTimeFormatter) epi.b.getValue();
            dateTimeFormatter2.getClass();
            return epi.b(strS, dateTimeFormatter2);
        }
        if (bpiVar != ((bpi) cpi.c.getValue())) {
            return (UtcOffset) bpiVar.c(strS);
        }
        DateTimeFormatter dateTimeFormatter3 = (DateTimeFormatter) epi.c.getValue();
        dateTimeFormatter3.getClass();
        return epi.b(strS, dateTimeFormatter3);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        UtcOffset utcOffset = (UtcOffset) obj;
        encoder.getClass();
        utcOffset.getClass();
        encoder.F(utcOffset.toString());
    }
}
