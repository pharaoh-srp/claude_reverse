package defpackage;

import com.anthropic.claude.models.organization.configtypes.HealthConnectQueryInputDescriptions;
import com.anthropic.claude.models.organization.configtypes.HealthConnectQueryQueriesArrayDescription;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class pi8 implements w28 {
    public static final pi8 a;
    private static final SerialDescriptor descriptor;

    static {
        pi8 pi8Var = new pi8();
        a = pi8Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.models.organization.configtypes.HealthConnectQueryInputDescriptions", pi8Var, 2);
        pluginGeneratedSerialDescriptor.j("tool_description", false);
        pluginGeneratedSerialDescriptor.j("queries", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{srg.a, ri8.a};
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
        HealthConnectQueryQueriesArrayDescription healthConnectQueryQueriesArrayDescription = null;
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
                healthConnectQueryQueriesArrayDescription = (HealthConnectQueryQueriesArrayDescription) ud4VarC.l(serialDescriptor, 1, ri8.a, healthConnectQueryQueriesArrayDescription);
                i |= 2;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new HealthConnectQueryInputDescriptions(i, strV, healthConnectQueryQueriesArrayDescription, vnfVar);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        HealthConnectQueryInputDescriptions healthConnectQueryInputDescriptions = (HealthConnectQueryInputDescriptions) obj;
        encoder.getClass();
        healthConnectQueryInputDescriptions.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        HealthConnectQueryInputDescriptions.write$Self$models(healthConnectQueryInputDescriptions, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
