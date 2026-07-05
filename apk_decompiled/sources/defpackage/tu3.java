package defpackage;

import com.anthropic.claude.analytics.events.CodeEvents$RefusalFallbackPromptAnswered;
import com.anthropic.claude.analytics.events.CodeEvents$RefusalFallbackPromptChoice;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class tu3 implements w28 {
    public static final tu3 a;
    private static final SerialDescriptor descriptor;

    static {
        tu3 tu3Var = new tu3();
        a = tu3Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("claudeai.code.refusal_fallback_prompt.answered", tu3Var, 3);
        pluginGeneratedSerialDescriptor.j("organization_uuid", false);
        qy1.z(pluginGeneratedSerialDescriptor, "session_id", false, "choice", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        kw9[] kw9VarArr = CodeEvents$RefusalFallbackPromptAnswered.$childSerializers;
        srg srgVar = srg.a;
        return new KSerializer[]{srgVar, srgVar, kw9VarArr[2].getValue()};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr = CodeEvents$RefusalFallbackPromptAnswered.$childSerializers;
        boolean z = true;
        int i = 0;
        String strV = null;
        String strV2 = null;
        CodeEvents$RefusalFallbackPromptChoice codeEvents$RefusalFallbackPromptChoice = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                strV = ud4VarC.v(serialDescriptor, 0);
                i |= 1;
            } else if (iX == 1) {
                strV2 = ud4VarC.v(serialDescriptor, 1);
                i |= 2;
            } else {
                if (iX != 2) {
                    sz6.e(iX);
                    return null;
                }
                codeEvents$RefusalFallbackPromptChoice = (CodeEvents$RefusalFallbackPromptChoice) ud4VarC.l(serialDescriptor, 2, (s06) kw9VarArr[2].getValue(), codeEvents$RefusalFallbackPromptChoice);
                i |= 4;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new CodeEvents$RefusalFallbackPromptAnswered(i, strV, strV2, codeEvents$RefusalFallbackPromptChoice, null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        CodeEvents$RefusalFallbackPromptAnswered codeEvents$RefusalFallbackPromptAnswered = (CodeEvents$RefusalFallbackPromptAnswered) obj;
        encoder.getClass();
        codeEvents$RefusalFallbackPromptAnswered.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        CodeEvents$RefusalFallbackPromptAnswered.write$Self$analytics(codeEvents$RefusalFallbackPromptAnswered, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
