package defpackage;

import com.anthropic.claude.api.experience.ExperienceToggle;
import com.anthropic.claude.types.strings.ForkId;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class aw7 implements w28 {
    public static final aw7 a;
    private static final SerialDescriptor descriptor;

    static {
        aw7 aw7Var = new aw7();
        a = aw7Var;
        x29 x29Var = new x29("com.anthropic.claude.types.strings.ForkId", aw7Var);
        x29Var.j(ExperienceToggle.DEFAULT_PARAM_KEY, false);
        descriptor = x29Var;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{srg.a};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        return ForkId.m1021boximpl(ForkId.m1022constructorimpl(decoder.y(descriptor).s()));
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        String strM1028unboximpl = ((ForkId) obj).m1028unboximpl();
        encoder.getClass();
        strM1028unboximpl.getClass();
        Encoder encoderX = encoder.x(descriptor);
        if (encoderX == null) {
            return;
        }
        encoderX.F(strM1028unboximpl);
    }
}
