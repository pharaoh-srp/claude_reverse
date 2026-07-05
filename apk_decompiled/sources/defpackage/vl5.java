package defpackage;

import kotlinx.datetime.DatePeriod;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: loaded from: classes3.dex */
public final class vl5 implements KSerializer {
    public static final vl5 b = new vl5();
    public static final rfd c = j8.h("kotlinx.datetime.DatePeriod", kfd.t);
    public final /* synthetic */ ul5 a = ul5.a;

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        return this.a.deserialize(decoder);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return c;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        DatePeriod datePeriod = (DatePeriod) obj;
        encoder.getClass();
        datePeriod.getClass();
        this.a.getClass();
        encoder.F(datePeriod.toString());
    }
}
