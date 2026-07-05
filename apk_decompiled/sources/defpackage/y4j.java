package defpackage;

import com.anthropic.claude.bell.api.VoiceSelection;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class y4j implements w28 {
    public static final y4j a;
    private static final SerialDescriptor descriptor;

    static {
        y4j y4jVar = new y4j();
        a = y4jVar;
        x29 x29Var = new x29("com.anthropic.claude.bell.api.VoiceSelection", y4jVar);
        x29Var.j("id", false);
        descriptor = x29Var;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{srg.a};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        return VoiceSelection.m573boximpl(VoiceSelection.m574constructorimpl(decoder.y(descriptor).s()));
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        String strM579unboximpl = ((VoiceSelection) obj).m579unboximpl();
        encoder.getClass();
        strM579unboximpl.getClass();
        Encoder encoderX = encoder.x(descriptor);
        if (encoderX == null) {
            return;
        }
        encoderX.F(strM579unboximpl);
    }
}
