package defpackage;

import java.time.format.DateTimeParseException;
import kotlinx.datetime.DateTimeFormatException;
import kotlinx.datetime.LocalTime;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: loaded from: classes3.dex */
public final class dea implements KSerializer {
    public static final dea a = new dea();
    public static final rfd b = j8.h("kotlinx.datetime.LocalTime", kfd.t);

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        yda ydaVar = LocalTime.Companion;
        String strS = decoder.s();
        u0h u0hVar = bea.a;
        aea aeaVar = (aea) u0hVar.getValue();
        ydaVar.getClass();
        strS.getClass();
        aeaVar.getClass();
        if (aeaVar != ((aea) u0hVar.getValue())) {
            return (LocalTime) aeaVar.c(strS);
        }
        try {
            return new LocalTime(java.time.LocalTime.parse(strS));
        } catch (DateTimeParseException e) {
            throw new DateTimeFormatException(e);
        }
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        LocalTime localTime = (LocalTime) obj;
        encoder.getClass();
        localTime.getClass();
        encoder.F(localTime.toString());
    }
}
