package defpackage;

import java.time.format.DateTimeParseException;
import kotlinx.datetime.DateTimeFormatException;
import kotlinx.datetime.LocalDate;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: loaded from: classes3.dex */
public final class fda implements KSerializer {
    public static final fda a = new fda();
    public static final rfd b = j8.h("kotlinx.datetime.LocalDate", kfd.t);

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        yca ycaVar = LocalDate.Companion;
        String strS = decoder.s();
        int i = zca.a;
        u0h u0hVar = cda.a;
        f1 f1Var = (f1) u0hVar.getValue();
        ycaVar.getClass();
        strS.getClass();
        f1Var.getClass();
        if (f1Var != ((f1) u0hVar.getValue())) {
            return (LocalDate) f1Var.c(strS);
        }
        try {
            String string = strS.toString();
            string.getClass();
            return new LocalDate(java.time.LocalDate.parse(otj.m(6, string)));
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
        LocalDate localDate = (LocalDate) obj;
        encoder.getClass();
        localDate.getClass();
        encoder.F(localDate.toString());
    }
}
