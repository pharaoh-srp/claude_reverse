package defpackage;

import com.anthropic.claude.analytics.events.CodeEvents$RefusalFallbackPromptChoice;
import com.anthropic.claude.analytics.events.CodeEvents$RefusalFallbackPromptResponseFailed;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class wu3 implements w28 {
    public static final wu3 a;
    private static final SerialDescriptor descriptor;

    static {
        wu3 wu3Var = new wu3();
        a = wu3Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("claudeai.code.refusal_fallback_prompt.response_failed", wu3Var, 3);
        pluginGeneratedSerialDescriptor.j("organization_uuid", false);
        qy1.z(pluginGeneratedSerialDescriptor, "session_id", false, "choice", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        kw9[] kw9VarArr = CodeEvents$RefusalFallbackPromptResponseFailed.$childSerializers;
        srg srgVar = srg.a;
        return new KSerializer[]{srgVar, srgVar, kw9VarArr[2].getValue()};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr = CodeEvents$RefusalFallbackPromptResponseFailed.$childSerializers;
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
        return new CodeEvents$RefusalFallbackPromptResponseFailed(i, strV, strV2, codeEvents$RefusalFallbackPromptChoice, null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        CodeEvents$RefusalFallbackPromptResponseFailed codeEvents$RefusalFallbackPromptResponseFailed = (CodeEvents$RefusalFallbackPromptResponseFailed) obj;
        encoder.getClass();
        codeEvents$RefusalFallbackPromptResponseFailed.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        CodeEvents$RefusalFallbackPromptResponseFailed.write$Self$analytics(codeEvents$RefusalFallbackPromptResponseFailed, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
