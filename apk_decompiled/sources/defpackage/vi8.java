package defpackage;

import com.anthropic.claude.models.organization.configtypes.HealthConnectQueryQueriesItemAggregationDescription;
import com.anthropic.claude.models.organization.configtypes.HealthConnectQueryQueriesItemDescription;
import com.anthropic.claude.models.organization.configtypes.HealthConnectQueryQueriesItemRecordsDescription;
import com.anthropic.claude.models.organization.configtypes.HealthConnectQueryQueriesItemTimeRangeDescription;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class vi8 implements w28 {
    public static final vi8 a;
    private static final SerialDescriptor descriptor;

    static {
        vi8 vi8Var = new vi8();
        a = vi8Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.models.organization.configtypes.HealthConnectQueryQueriesItemDescription", vi8Var, 5);
        pluginGeneratedSerialDescriptor.j("description", false);
        pluginGeneratedSerialDescriptor.j("aggregation", false);
        pluginGeneratedSerialDescriptor.j("identifier", false);
        pluginGeneratedSerialDescriptor.j("records", false);
        pluginGeneratedSerialDescriptor.j("time_range", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        srg srgVar = srg.a;
        return new KSerializer[]{srgVar, ti8.a, srgVar, xi8.a, zi8.a};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        boolean z = true;
        int i = 0;
        String strV = null;
        HealthConnectQueryQueriesItemAggregationDescription healthConnectQueryQueriesItemAggregationDescription = null;
        String strV2 = null;
        HealthConnectQueryQueriesItemRecordsDescription healthConnectQueryQueriesItemRecordsDescription = null;
        HealthConnectQueryQueriesItemTimeRangeDescription healthConnectQueryQueriesItemTimeRangeDescription = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                strV = ud4VarC.v(serialDescriptor, 0);
                i |= 1;
            } else if (iX == 1) {
                healthConnectQueryQueriesItemAggregationDescription = (HealthConnectQueryQueriesItemAggregationDescription) ud4VarC.l(serialDescriptor, 1, ti8.a, healthConnectQueryQueriesItemAggregationDescription);
                i |= 2;
            } else if (iX == 2) {
                strV2 = ud4VarC.v(serialDescriptor, 2);
                i |= 4;
            } else if (iX == 3) {
                healthConnectQueryQueriesItemRecordsDescription = (HealthConnectQueryQueriesItemRecordsDescription) ud4VarC.l(serialDescriptor, 3, xi8.a, healthConnectQueryQueriesItemRecordsDescription);
                i |= 8;
            } else {
                if (iX != 4) {
                    sz6.e(iX);
                    return null;
                }
                healthConnectQueryQueriesItemTimeRangeDescription = (HealthConnectQueryQueriesItemTimeRangeDescription) ud4VarC.l(serialDescriptor, 4, zi8.a, healthConnectQueryQueriesItemTimeRangeDescription);
                i |= 16;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new HealthConnectQueryQueriesItemDescription(i, strV, healthConnectQueryQueriesItemAggregationDescription, strV2, healthConnectQueryQueriesItemRecordsDescription, healthConnectQueryQueriesItemTimeRangeDescription, null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        HealthConnectQueryQueriesItemDescription healthConnectQueryQueriesItemDescription = (HealthConnectQueryQueriesItemDescription) obj;
        encoder.getClass();
        healthConnectQueryQueriesItemDescription.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        HealthConnectQueryQueriesItemDescription.write$Self$models(healthConnectQueryQueriesItemDescription, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
