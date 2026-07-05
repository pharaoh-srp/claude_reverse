package defpackage;

import java.time.format.DateTimeParseException;
import kotlinx.datetime.DateTimeFormatException;
import kotlinx.datetime.LocalDateTime;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: loaded from: classes3.dex */
public final class lda implements KSerializer {
    public static final lda a = new lda();
    public static final rfd b = j8.h("kotlinx.datetime.LocalDateTime", kfd.t);

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        gda gdaVar = LocalDateTime.Companion;
        String strS = decoder.s();
        jda jdaVar = hda.a;
        gdaVar.getClass();
        strS.getClass();
        jdaVar.getClass();
        try {
            String string = strS.toString();
            string.getClass();
            return new LocalDateTime(java.time.LocalDateTime.parse(otj.m(12, string)));
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
        LocalDateTime localDateTime = (LocalDateTime) obj;
        encoder.getClass();
        localDateTime.getClass();
        encoder.F(localDateTime.toString());
    }
}
