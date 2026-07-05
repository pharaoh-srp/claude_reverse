package defpackage;

import com.anthropic.claude.tool.model.HealthConnectQueryV0InputQueriesItem;
import com.anthropic.claude.tool.model.HealthConnectQueryV0InputQueriesItemAggregation;
import com.anthropic.claude.tool.model.HealthConnectQueryV0InputQueriesItemRecords;
import com.anthropic.claude.tool.model.HealthConnectQueryV0InputQueriesItemTimeRange;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class gj8 implements w28 {
    public static final gj8 a;
    private static final SerialDescriptor descriptor;

    static {
        gj8 gj8Var = new gj8();
        a = gj8Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.tool.model.HealthConnectQueryV0InputQueriesItem", gj8Var, 4);
        pluginGeneratedSerialDescriptor.j("aggregation", true);
        pluginGeneratedSerialDescriptor.j("identifier", false);
        pluginGeneratedSerialDescriptor.j("records", true);
        pluginGeneratedSerialDescriptor.j("time_range", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{d4c.S(jj8.a), srg.a, d4c.S(pj8.a), d4c.S(rj8.a)};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        boolean z = true;
        int i = 0;
        HealthConnectQueryV0InputQueriesItemAggregation healthConnectQueryV0InputQueriesItemAggregation = null;
        String strV = null;
        HealthConnectQueryV0InputQueriesItemRecords healthConnectQueryV0InputQueriesItemRecords = null;
        HealthConnectQueryV0InputQueriesItemTimeRange healthConnectQueryV0InputQueriesItemTimeRange = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                healthConnectQueryV0InputQueriesItemAggregation = (HealthConnectQueryV0InputQueriesItemAggregation) ud4VarC.m(serialDescriptor, 0, jj8.a, healthConnectQueryV0InputQueriesItemAggregation);
                i |= 1;
            } else if (iX == 1) {
                strV = ud4VarC.v(serialDescriptor, 1);
                i |= 2;
            } else if (iX == 2) {
                healthConnectQueryV0InputQueriesItemRecords = (HealthConnectQueryV0InputQueriesItemRecords) ud4VarC.m(serialDescriptor, 2, pj8.a, healthConnectQueryV0InputQueriesItemRecords);
                i |= 4;
            } else {
                if (iX != 3) {
                    sz6.e(iX);
                    return null;
                }
                healthConnectQueryV0InputQueriesItemTimeRange = (HealthConnectQueryV0InputQueriesItemTimeRange) ud4VarC.m(serialDescriptor, 3, rj8.a, healthConnectQueryV0InputQueriesItemTimeRange);
                i |= 8;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new HealthConnectQueryV0InputQueriesItem(i, healthConnectQueryV0InputQueriesItemAggregation, strV, healthConnectQueryV0InputQueriesItemRecords, healthConnectQueryV0InputQueriesItemTimeRange, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        HealthConnectQueryV0InputQueriesItem healthConnectQueryV0InputQueriesItem = (HealthConnectQueryV0InputQueriesItem) obj;
        encoder.getClass();
        healthConnectQueryV0InputQueriesItem.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        HealthConnectQueryV0InputQueriesItem.write$Self$Claude_tool_model(healthConnectQueryV0InputQueriesItem, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
