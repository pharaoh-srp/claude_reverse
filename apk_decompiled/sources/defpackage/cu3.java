package defpackage;

import com.anthropic.claude.analytics.events.CodeEvents$CodeComposerSurface;
import com.anthropic.claude.analytics.events.CodeEvents$ModelSelectorViewed;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class cu3 implements w28 {
    public static final cu3 a;
    private static final SerialDescriptor descriptor;

    static {
        cu3 cu3Var = new cu3();
        a = cu3Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("claudeai.code.model_selector.viewed", cu3Var, 2);
        pluginGeneratedSerialDescriptor.j("surface", false);
        qy1.t(pluginGeneratedSerialDescriptor, "has_session", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{CodeEvents$ModelSelectorViewed.$childSerializers[0].getValue(), zt1.a};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr = CodeEvents$ModelSelectorViewed.$childSerializers;
        vnf vnfVar = null;
        boolean z = true;
        int i = 0;
        boolean zU = false;
        CodeEvents$CodeComposerSurface codeEvents$CodeComposerSurface = null;
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
                zU = ud4VarC.u(serialDescriptor, 1);
                i |= 2;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new CodeEvents$ModelSelectorViewed(i, codeEvents$CodeComposerSurface, zU, vnfVar);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        CodeEvents$ModelSelectorViewed codeEvents$ModelSelectorViewed = (CodeEvents$ModelSelectorViewed) obj;
        encoder.getClass();
        codeEvents$ModelSelectorViewed.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        CodeEvents$ModelSelectorViewed.write$Self$analytics(codeEvents$ModelSelectorViewed, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
