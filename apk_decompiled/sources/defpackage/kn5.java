package defpackage;

import kotlinx.datetime.DateTimePeriod;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: loaded from: classes3.dex */
public final class kn5 implements KSerializer {
    public static final kn5 a = new kn5();
    public static final rfd b = j8.h("kotlinx.datetime.DateTimePeriod/ISO", kfd.t);

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        in5 in5Var = DateTimePeriod.Companion;
        String strS = decoder.s();
        in5Var.getClass();
        return in5.a(strS);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        DateTimePeriod dateTimePeriod = (DateTimePeriod) obj;
        encoder.getClass();
        dateTimePeriod.getClass();
        encoder.F(dateTimePeriod.toString());
    }
}
