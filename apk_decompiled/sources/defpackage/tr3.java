package defpackage;

import com.anthropic.claude.analytics.events.CodeEvents$BranchSelected;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class tr3 implements w28 {
    public static final tr3 a;
    private static final SerialDescriptor descriptor;

    static {
        tr3 tr3Var = new tr3();
        a = tr3Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("mobile_code_branch_selected", tr3Var, 2);
        pluginGeneratedSerialDescriptor.j("organization_uuid", false);
        qy1.t(pluginGeneratedSerialDescriptor, "available_count", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{srg.a, d4c.S(e79.a)};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        vnf vnfVar = null;
        boolean z = true;
        int i = 0;
        String strV = null;
        Integer num = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                strV = ud4VarC.v(serialDescriptor, 0);
                i |= 1;
            } else {
                if (iX != 1) {
                    sz6.e(iX);
                    return null;
                }
                num = (Integer) ud4VarC.m(serialDescriptor, 1, e79.a, num);
                i |= 2;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new CodeEvents$BranchSelected(i, strV, num, vnfVar);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        CodeEvents$BranchSelected codeEvents$BranchSelected = (CodeEvents$BranchSelected) obj;
        encoder.getClass();
        codeEvents$BranchSelected.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        CodeEvents$BranchSelected.write$Self$analytics(codeEvents$BranchSelected, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
