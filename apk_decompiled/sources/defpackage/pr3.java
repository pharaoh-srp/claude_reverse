package defpackage;

import com.anthropic.claude.analytics.events.CodeEvents$AutoDefaultModeApplied;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class pr3 implements w28 {
    public static final pr3 a;
    private static final SerialDescriptor descriptor;

    static {
        pr3 pr3Var = new pr3();
        a = pr3Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("claudeai.code.auto_default_mode.applied", pr3Var, 2);
        pluginGeneratedSerialDescriptor.j("organization_uuid", false);
        qy1.t(pluginGeneratedSerialDescriptor, "notice_shown", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{srg.a, zt1.a};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        vnf vnfVar = null;
        boolean z = true;
        int i = 0;
        boolean zU = false;
        String strV = null;
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
                zU = ud4VarC.u(serialDescriptor, 1);
                i |= 2;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new CodeEvents$AutoDefaultModeApplied(i, strV, zU, vnfVar);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        CodeEvents$AutoDefaultModeApplied codeEvents$AutoDefaultModeApplied = (CodeEvents$AutoDefaultModeApplied) obj;
        encoder.getClass();
        codeEvents$AutoDefaultModeApplied.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        CodeEvents$AutoDefaultModeApplied.write$Self$analytics(codeEvents$AutoDefaultModeApplied, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
