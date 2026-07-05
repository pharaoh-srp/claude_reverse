package defpackage;

import com.anthropic.claude.models.organization.configtypes.RegionSupport;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class nde implements w28 {
    public static final nde a;
    private static final SerialDescriptor descriptor;

    static {
        nde ndeVar = new nde();
        a = ndeVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.models.organization.configtypes.RegionSupport", ndeVar, 2);
        pluginGeneratedSerialDescriptor.j("claudeai_supported", true);
        pluginGeneratedSerialDescriptor.j("phone_verification_supported", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        zt1 zt1Var = zt1.a;
        return new KSerializer[]{zt1Var, zt1Var};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        boolean z = true;
        int i = 0;
        boolean zU = false;
        boolean zU2 = false;
        while (true) {
            vnf vnfVar = null;
            if (!z) {
                ud4VarC.b(serialDescriptor);
                return new RegionSupport(i, zU, zU2, vnfVar);
            }
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                zU = ud4VarC.u(serialDescriptor, 0);
                i |= 1;
            } else {
                if (iX != 1) {
                    sz6.e(iX);
                    return null;
                }
                zU2 = ud4VarC.u(serialDescriptor, 1);
                i |= 2;
            }
        }
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        RegionSupport regionSupport = (RegionSupport) obj;
        encoder.getClass();
        regionSupport.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        RegionSupport.write$Self$models(regionSupport, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
