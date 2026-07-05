package defpackage;

import com.anthropic.claude.models.organization.configtypes.HealthConnectQueryQueriesArrayDescription;
import com.anthropic.claude.models.organization.configtypes.HealthConnectQueryQueriesItemDescription;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ri8 implements w28 {
    public static final ri8 a;
    private static final SerialDescriptor descriptor;

    static {
        ri8 ri8Var = new ri8();
        a = ri8Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.models.organization.configtypes.HealthConnectQueryQueriesArrayDescription", ri8Var, 2);
        pluginGeneratedSerialDescriptor.j("description", false);
        pluginGeneratedSerialDescriptor.j("items", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{srg.a, vi8.a};
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
        HealthConnectQueryQueriesItemDescription healthConnectQueryQueriesItemDescription = null;
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
                healthConnectQueryQueriesItemDescription = (HealthConnectQueryQueriesItemDescription) ud4VarC.l(serialDescriptor, 1, vi8.a, healthConnectQueryQueriesItemDescription);
                i |= 2;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new HealthConnectQueryQueriesArrayDescription(i, strV, healthConnectQueryQueriesItemDescription, vnfVar);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        HealthConnectQueryQueriesArrayDescription healthConnectQueryQueriesArrayDescription = (HealthConnectQueryQueriesArrayDescription) obj;
        encoder.getClass();
        healthConnectQueryQueriesArrayDescription.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        HealthConnectQueryQueriesArrayDescription.write$Self$models(healthConnectQueryQueriesArrayDescription, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
