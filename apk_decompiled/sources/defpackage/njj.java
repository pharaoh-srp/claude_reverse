package defpackage;

import java.time.format.DateTimeParseException;
import kotlinx.datetime.DateTimeFormatException;
import kotlinx.datetime.YearMonth;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: loaded from: classes3.dex */
public final class njj implements KSerializer {
    public static final njj a = new njj();
    public static final rfd b = j8.h("kotlinx.datetime.YearMonth", kfd.t);

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        djj djjVar = YearMonth.Companion;
        String strS = decoder.s();
        u0h u0hVar = kjj.b;
        f1 f1Var = (f1) u0hVar.getValue();
        djjVar.getClass();
        strS.getClass();
        f1Var.getClass();
        if (f1Var != ((f1) u0hVar.getValue())) {
            return (YearMonth) f1Var.c(strS);
        }
        try {
            String string = strS.toString();
            string.getClass();
            return new YearMonth(java.time.YearMonth.parse(otj.m(3, string)));
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
        YearMonth yearMonth = (YearMonth) obj;
        encoder.getClass();
        yearMonth.getClass();
        encoder.F(yearMonth.toString());
    }
}
