package defpackage;

import com.anthropic.claude.analytics.events.CodeEvents$CodeComposerSurface;
import com.anthropic.claude.analytics.events.CodeEvents$ModelSelectorPersistFailed;
import com.anthropic.claude.analytics.events.CodeEvents$ModelSelectorPersistTrigger;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class xt3 implements w28 {
    public static final xt3 a;
    private static final SerialDescriptor descriptor;

    static {
        xt3 xt3Var = new xt3();
        a = xt3Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("claudeai.code.model_selector.persist_failed", xt3Var, 2);
        pluginGeneratedSerialDescriptor.j("surface", false);
        qy1.t(pluginGeneratedSerialDescriptor, "trigger", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        kw9[] kw9VarArr = CodeEvents$ModelSelectorPersistFailed.$childSerializers;
        return new KSerializer[]{kw9VarArr[0].getValue(), kw9VarArr[1].getValue()};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr = CodeEvents$ModelSelectorPersistFailed.$childSerializers;
        vnf vnfVar = null;
        boolean z = true;
        int i = 0;
        CodeEvents$CodeComposerSurface codeEvents$CodeComposerSurface = null;
        CodeEvents$ModelSelectorPersistTrigger codeEvents$ModelSelectorPersistTrigger = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                codeEvents$CodeComposerSurface = (CodeEvents$CodeComposerSurface) ud4VarC.l(serialDescriptor, 0, (s06) kw9VarArr[0].getValue(), codeEvents$CodeComposerSurface);
                i |= 1;
            } else {
                if (iX != 1) {
                    sz6.e(iX);
                    return null;
                }
                codeEvents$ModelSelectorPersistTrigger = (CodeEvents$ModelSelectorPersistTrigger) ud4VarC.l(serialDescriptor, 1, (s06) kw9VarArr[1].getValue(), codeEvents$ModelSelectorPersistTrigger);
                i |= 2;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new CodeEvents$ModelSelectorPersistFailed(i, codeEvents$CodeComposerSurface, codeEvents$ModelSelectorPersistTrigger, vnfVar);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        CodeEvents$ModelSelectorPersistFailed codeEvents$ModelSelectorPersistFailed = (CodeEvents$ModelSelectorPersistFailed) obj;
        encoder.getClass();
        codeEvents$ModelSelectorPersistFailed.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        CodeEvents$ModelSelectorPersistFailed.write$Self$analytics(codeEvents$ModelSelectorPersistFailed, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
