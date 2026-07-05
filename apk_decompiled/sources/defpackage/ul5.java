package defpackage;

import kotlinx.datetime.DatePeriod;
import kotlinx.datetime.DateTimePeriod;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: loaded from: classes3.dex */
public final class ul5 implements KSerializer {
    public static final ul5 a = new ul5();
    public static final rfd b = j8.h("kotlinx.datetime.DatePeriod/ISO", kfd.t);

    @Override // defpackage.s06
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final DatePeriod deserialize(Decoder decoder) {
        decoder.getClass();
        in5 in5Var = DateTimePeriod.Companion;
        String strS = decoder.s();
        in5Var.getClass();
        DateTimePeriod dateTimePeriodA = in5.a(strS);
        if (dateTimePeriodA instanceof DatePeriod) {
            return (DatePeriod) dateTimePeriodA;
        }
        throw new SerializationException(dateTimePeriodA + " is not a date-based period");
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        DatePeriod datePeriod = (DatePeriod) obj;
        encoder.getClass();
        datePeriod.getClass();
        encoder.F(datePeriod.toString());
    }
}
