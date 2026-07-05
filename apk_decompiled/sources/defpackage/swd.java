package defpackage;

import com.anthropic.claude.api.experience.ExperienceToggle;
import com.anthropic.claude.types.strings.PublishedArtifactId;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class swd implements w28 {
    public static final swd a;
    private static final SerialDescriptor descriptor;

    static {
        swd swdVar = new swd();
        a = swdVar;
        x29 x29Var = new x29("com.anthropic.claude.types.strings.PublishedArtifactId", swdVar);
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
        return PublishedArtifactId.m1086boximpl(PublishedArtifactId.m1087constructorimpl(decoder.y(descriptor).s()));
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        String strM1092unboximpl = ((PublishedArtifactId) obj).m1092unboximpl();
        encoder.getClass();
        strM1092unboximpl.getClass();
        Encoder encoderX = encoder.x(descriptor);
        if (encoderX == null) {
            return;
        }
        encoderX.F(strM1092unboximpl);
    }
}
