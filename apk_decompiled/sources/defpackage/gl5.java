package defpackage;

import kotlinx.datetime.DateTimeUnit;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: loaded from: classes3.dex */
public final class gl5 extends n3 {
    public static final gl5 a = new gl5();
    public static final kw9 b = yb5.w(w1a.F, new h85(10));

    @Override // defpackage.n3
    public final s06 a(ud4 ud4Var, String str) {
        return ((odf) b.getValue()).a(ud4Var, str);
    }

    @Override // defpackage.n3
    public final znf b(Encoder encoder, Object obj) {
        DateTimeUnit.DateBased dateBased = (DateTimeUnit.DateBased) obj;
        encoder.getClass();
        dateBased.getClass();
        return ((odf) b.getValue()).b(encoder, dateBased);
    }

    @Override // defpackage.n3
    public final pl9 c() {
        return jce.a.b(DateTimeUnit.DateBased.class);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return ((odf) b.getValue()).getDescriptor();
    }
}
