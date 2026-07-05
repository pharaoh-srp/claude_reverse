package defpackage;

import com.anthropic.claude.analytics.events.CodeEvents$CodeComposerSurface;
import com.anthropic.claude.analytics.events.CodeEvents$ModelSelectorSelected;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class au3 implements w28 {
    public static final au3 a;
    private static final SerialDescriptor descriptor;

    static {
        au3 au3Var = new au3();
        a = au3Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("claudeai.code.model_selector.selected", au3Var, 3);
        pluginGeneratedSerialDescriptor.j("model_id", false);
        qy1.z(pluginGeneratedSerialDescriptor, "surface", false, "has_session", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{srg.a, CodeEvents$ModelSelectorSelected.$childSerializers[1].getValue(), zt1.a};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr = CodeEvents$ModelSelectorSelected.$childSerializers;
        boolean z = true;
        int i = 0;
        boolean zU = false;
        String strV = null;
        CodeEvents$CodeComposerSurface codeEvents$CodeComposerSurface = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                strV = ud4VarC.v(serialDescriptor, 0);
                i |= 1;
            } else if (iX == 1) {
                codeEvents$CodeComposerSurface = (CodeEvents$CodeComposerSurface) ud4VarC.l(serialDescriptor, 1, (s06) kw9VarArr[1].getValue(), codeEvents$CodeComposerSurface);
                i |= 2;
            } else {
                if (iX != 2) {
                    sz6.e(iX);
                    return null;
                }
                zU = ud4VarC.u(serialDescriptor, 2);
                i |= 4;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new CodeEvents$ModelSelectorSelected(i, strV, codeEvents$CodeComposerSurface, zU, null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        CodeEvents$ModelSelectorSelected codeEvents$ModelSelectorSelected = (CodeEvents$ModelSelectorSelected) obj;
        encoder.getClass();
        codeEvents$ModelSelectorSelected.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        CodeEvents$ModelSelectorSelected.write$Self$analytics(codeEvents$ModelSelectorSelected, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
