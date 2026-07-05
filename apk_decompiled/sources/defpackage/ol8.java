package defpackage;

import com.anthropic.claude.models.organization.configtypes.HealthConnectDataTypesInputDescriptions;
import com.anthropic.claude.models.organization.configtypes.HealthConnectQueryInputDescriptions;
import com.anthropic.claude.tool.model.HealthToolsConfig;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ol8 implements w28 {
    public static final ol8 a;
    private static final SerialDescriptor descriptor;

    static {
        ol8 ol8Var = new ol8();
        a = ol8Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.tool.model.HealthToolsConfig", ol8Var, 2);
        pluginGeneratedSerialDescriptor.j("health_connect_data_types_v0", false);
        pluginGeneratedSerialDescriptor.j("health_connect_query_v0", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{d4c.S(uh8.a), d4c.S(pi8.a)};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        vnf vnfVar = null;
        boolean z = true;
        int i = 0;
        HealthConnectDataTypesInputDescriptions healthConnectDataTypesInputDescriptions = null;
        HealthConnectQueryInputDescriptions healthConnectQueryInputDescriptions = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                healthConnectDataTypesInputDescriptions = (HealthConnectDataTypesInputDescriptions) ud4VarC.m(serialDescriptor, 0, uh8.a, healthConnectDataTypesInputDescriptions);
                i |= 1;
            } else {
                if (iX != 1) {
                    sz6.e(iX);
                    return null;
                }
                healthConnectQueryInputDescriptions = (HealthConnectQueryInputDescriptions) ud4VarC.m(serialDescriptor, 1, pi8.a, healthConnectQueryInputDescriptions);
                i |= 2;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new HealthToolsConfig(i, healthConnectDataTypesInputDescriptions, healthConnectQueryInputDescriptions, vnfVar);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        HealthToolsConfig healthToolsConfig = (HealthToolsConfig) obj;
        encoder.getClass();
        healthToolsConfig.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        HealthToolsConfig.write$Self$tool(healthToolsConfig, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
