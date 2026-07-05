package defpackage;

import com.anthropic.claude.analytics.events.CodeEvents$RefusalFallbackPromptShown;
import com.anthropic.claude.analytics.events.CodeEvents$RefusalFallbackPromptTrigger;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class yu3 implements w28 {
    public static final yu3 a;
    private static final SerialDescriptor descriptor;

    static {
        yu3 yu3Var = new yu3();
        a = yu3Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("claudeai.code.refusal_fallback_prompt.shown", yu3Var, 5);
        pluginGeneratedSerialDescriptor.j("organization_uuid", false);
        pluginGeneratedSerialDescriptor.j("session_id", false);
        pluginGeneratedSerialDescriptor.j("original_model", false);
        qy1.z(pluginGeneratedSerialDescriptor, "fallback_model", false, "trigger", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        kw9[] kw9VarArr = CodeEvents$RefusalFallbackPromptShown.$childSerializers;
        srg srgVar = srg.a;
        return new KSerializer[]{srgVar, srgVar, srgVar, srgVar, kw9VarArr[4].getValue()};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr = CodeEvents$RefusalFallbackPromptShown.$childSerializers;
        boolean z = true;
        int i = 0;
        String strV = null;
        String strV2 = null;
        String strV3 = null;
        String strV4 = null;
        CodeEvents$RefusalFallbackPromptTrigger codeEvents$RefusalFallbackPromptTrigger = null;
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
            } else if (iX == 2) {
                strV3 = ud4VarC.v(serialDescriptor, 2);
                i |= 4;
            } else if (iX == 3) {
                strV4 = ud4VarC.v(serialDescriptor, 3);
                i |= 8;
            } else {
                if (iX != 4) {
                    sz6.e(iX);
                    return null;
                }
                codeEvents$RefusalFallbackPromptTrigger = (CodeEvents$RefusalFallbackPromptTrigger) ud4VarC.l(serialDescriptor, 4, (s06) kw9VarArr[4].getValue(), codeEvents$RefusalFallbackPromptTrigger);
                i |= 16;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new CodeEvents$RefusalFallbackPromptShown(i, strV, strV2, strV3, strV4, codeEvents$RefusalFallbackPromptTrigger, null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        CodeEvents$RefusalFallbackPromptShown codeEvents$RefusalFallbackPromptShown = (CodeEvents$RefusalFallbackPromptShown) obj;
        encoder.getClass();
        codeEvents$RefusalFallbackPromptShown.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        CodeEvents$RefusalFallbackPromptShown.write$Self$analytics(codeEvents$RefusalFallbackPromptShown, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
