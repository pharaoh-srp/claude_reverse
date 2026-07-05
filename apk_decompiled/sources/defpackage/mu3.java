package defpackage;

import com.anthropic.claude.analytics.events.CodeEvents$PrAutoMergeToggled;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class mu3 implements w28 {
    public static final mu3 a;
    private static final SerialDescriptor descriptor;

    static {
        mu3 mu3Var = new mu3();
        a = mu3Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("mobile_code_pr_automerge_toggled", mu3Var, 3);
        pluginGeneratedSerialDescriptor.j("organization_uuid", false);
        qy1.z(pluginGeneratedSerialDescriptor, "session_id", false, "enabled", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        srg srgVar = srg.a;
        return new KSerializer[]{srgVar, srgVar, zt1.a};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        boolean z = true;
        int i = 0;
        boolean zU = false;
        String strV = null;
        String strV2 = null;
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
                zU = ud4VarC.u(serialDescriptor, 2);
                i |= 4;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new CodeEvents$PrAutoMergeToggled(i, strV, strV2, zU, null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        CodeEvents$PrAutoMergeToggled codeEvents$PrAutoMergeToggled = (CodeEvents$PrAutoMergeToggled) obj;
        encoder.getClass();
        codeEvents$PrAutoMergeToggled.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        CodeEvents$PrAutoMergeToggled.write$Self$analytics(codeEvents$PrAutoMergeToggled, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
