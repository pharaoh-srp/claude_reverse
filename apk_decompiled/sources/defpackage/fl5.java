package defpackage;

import java.util.Date;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: loaded from: classes2.dex */
public final class fl5 implements KSerializer {
    public static final fl5 a = new fl5();
    public static final rfd b = j8.h("com.anthropic.claude.api.common.DateAsSeconds", kfd.r);

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        long jT = decoder.t();
        lz1 lz1Var = uh6.F;
        return new Date(uh6.f(v40.R(jT, zh6.SECONDS)));
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        Date date = (Date) obj;
        encoder.getClass();
        date.getClass();
        encoder.A(date.getTime() / 1000);
    }
}
