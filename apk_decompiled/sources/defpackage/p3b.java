package defpackage;

import com.anthropic.claude.api.experience.ExperienceToggle;
import com.anthropic.claude.types.strings.McpServerId;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class p3b implements w28 {
    public static final p3b a;
    private static final SerialDescriptor descriptor;

    static {
        p3b p3bVar = new p3b();
        a = p3bVar;
        x29 x29Var = new x29("com.anthropic.claude.types.strings.McpServerId", p3bVar);
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
        return McpServerId.m1029boximpl(McpServerId.m1030constructorimpl(decoder.y(descriptor).s()));
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        String strM1035unboximpl = ((McpServerId) obj).m1035unboximpl();
        encoder.getClass();
        strM1035unboximpl.getClass();
        Encoder encoderX = encoder.x(descriptor);
        if (encoderX == null) {
            return;
        }
        encoderX.F(strM1035unboximpl);
    }
}
