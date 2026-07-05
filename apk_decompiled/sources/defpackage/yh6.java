package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: loaded from: classes.dex */
public final class yh6 implements KSerializer {
    public static final yh6 a = new yh6();
    public static final rfd b = new rfd("kotlin.time.Duration", kfd.t);

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        lz1 lz1Var = uh6.F;
        String strS = decoder.s();
        strS.getClass();
        try {
            long jH = v40.H(strS);
            if (uh6.e(jH, uh6.I)) {
                throw new IllegalStateException("invariant failed");
            }
            return new uh6(jH);
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException(ij0.j("Invalid ISO duration string format: '", strS, "'."), e);
        }
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        long j = ((uh6) obj).E;
        encoder.getClass();
        lz1 lz1Var = uh6.F;
        StringBuilder sb = new StringBuilder();
        if (uh6.l(j)) {
            sb.append('-');
        }
        sb.append("PT");
        long jQ = uh6.l(j) ? uh6.q(j) : j;
        long jO = uh6.o(jQ, zh6.HOURS);
        int iH = uh6.h(jQ);
        long j2 = jQ;
        int iJ = uh6.j(j2);
        int i = uh6.i(j2);
        if (uh6.k(j)) {
            jO = 9999999999999L;
        }
        boolean z = false;
        boolean z2 = jO != 0;
        boolean z3 = (iJ == 0 && i == 0) ? false : true;
        if (iH != 0 || (z3 && z2)) {
            z = true;
        }
        if (z2) {
            sb.append(jO);
            sb.append('H');
        }
        if (z) {
            sb.append(iH);
            sb.append('M');
        }
        if (z3 || (!z2 && !z)) {
            uh6.b(sb, iJ, i, 9, "S", true);
        }
        encoder.F(sb.toString());
    }
}
