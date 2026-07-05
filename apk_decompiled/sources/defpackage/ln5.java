package defpackage;

import kotlinx.datetime.DateTimePeriod;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: loaded from: classes3.dex */
public final class ln5 implements KSerializer {
    public static final ln5 b = new ln5();
    public static final rfd c = j8.h("kotlinx.datetime.DateTimePeriod", kfd.t);
    public final /* synthetic */ kn5 a = kn5.a;

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        this.a.getClass();
        in5 in5Var = DateTimePeriod.Companion;
        String strS = decoder.s();
        in5Var.getClass();
        return in5.a(strS);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return c;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        DateTimePeriod dateTimePeriod = (DateTimePeriod) obj;
        encoder.getClass();
        dateTimePeriod.getClass();
        this.a.getClass();
        encoder.F(dateTimePeriod.toString());
    }
}
