package defpackage;

import com.anthropic.claude.types.strings.ThinkingMode;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: loaded from: classes.dex */
public final class emh implements KSerializer {
    public static final emh a = new emh();
    public static final rfd b = j8.h("ThinkingMode", kfd.t);

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        return ThinkingMode.m1142boximpl(ThinkingMode.m1143constructorimpl(decoder.s()));
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        String strM1149unboximpl = ((ThinkingMode) obj).m1149unboximpl();
        encoder.getClass();
        strM1149unboximpl.getClass();
        if (ThinkingMode.m1147isNonThinkingModeimpl(strM1149unboximpl)) {
            encoder.e();
        } else {
            encoder.F(strM1149unboximpl);
        }
    }
}
