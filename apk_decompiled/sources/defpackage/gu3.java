package defpackage;

import com.anthropic.claude.analytics.events.CodeEvents$PlanModeSelected;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class gu3 implements w28 {
    public static final gu3 a;
    private static final SerialDescriptor descriptor;

    static {
        gu3 gu3Var = new gu3();
        a = gu3Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("mobile_code_plan_mode_selected", gu3Var, 3);
        pluginGeneratedSerialDescriptor.j("organization_uuid", false);
        qy1.z(pluginGeneratedSerialDescriptor, "session_id", true, "mode", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        srg srgVar = srg.a;
        return new KSerializer[]{srgVar, d4c.S(srgVar), srgVar};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        boolean z = true;
        int i = 0;
        String strV = null;
        String str = null;
        String strV2 = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                strV = ud4VarC.v(serialDescriptor, 0);
                i |= 1;
            } else if (iX == 1) {
                str = (String) ud4VarC.m(serialDescriptor, 1, srg.a, str);
                i |= 2;
            } else {
                if (iX != 2) {
                    sz6.e(iX);
                    return null;
                }
                strV2 = ud4VarC.v(serialDescriptor, 2);
                i |= 4;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new CodeEvents$PlanModeSelected(i, strV, str, strV2, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        CodeEvents$PlanModeSelected codeEvents$PlanModeSelected = (CodeEvents$PlanModeSelected) obj;
        encoder.getClass();
        codeEvents$PlanModeSelected.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        CodeEvents$PlanModeSelected.write$Self$analytics(codeEvents$PlanModeSelected, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
