package defpackage;

import com.anthropic.claude.api.experience.ExperienceToggle;
import com.anthropic.claude.types.strings.FileId;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class oi7 implements w28 {
    public static final oi7 a;
    private static final SerialDescriptor descriptor;

    static {
        oi7 oi7Var = new oi7();
        a = oi7Var;
        x29 x29Var = new x29("com.anthropic.claude.types.strings.FileId", oi7Var);
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
        return FileId.m1014boximpl(FileId.m1015constructorimpl(decoder.y(descriptor).s()));
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        String strM1020unboximpl = ((FileId) obj).m1020unboximpl();
        encoder.getClass();
        strM1020unboximpl.getClass();
        Encoder encoderX = encoder.x(descriptor);
        if (encoderX == null) {
            return;
        }
        encoderX.F(strM1020unboximpl);
    }
}
