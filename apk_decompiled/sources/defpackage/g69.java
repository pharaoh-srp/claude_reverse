package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: loaded from: classes.dex */
public final class g69 implements KSerializer {
    public static final g69 a = new g69();
    public static final rfd b = new rfd("kotlin.time.Instant", kfd.t);

    /* JADX WARN: Removed duplicated region for block: B:195:0x046b  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0481  */
    @Override // defpackage.s06
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object deserialize(kotlinx.serialization.encoding.Decoder r26) {
        /*
            Method dump skipped, instruction units count: 1176
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g69.deserialize(kotlinx.serialization.encoding.Decoder):java.lang.Object");
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        c69 c69Var = (c69) obj;
        encoder.getClass();
        c69Var.getClass();
        encoder.F(c69Var.toString());
    }
}
