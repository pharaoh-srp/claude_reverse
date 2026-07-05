package defpackage;

import com.anthropic.claude.api.experience.ExperienceToggle;
import com.anthropic.claude.tool.model.HealthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItemAggregationsItemValuesItem;
import com.anthropic.claude.tool.model.HealthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItemAggregationsItemValuesItemAggregationType;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ek8 implements w28 {
    public static final ek8 a;
    private static final SerialDescriptor descriptor;

    static {
        ek8 ek8Var = new ek8();
        a = ek8Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.tool.model.HealthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItemAggregationsItemValuesItem", ek8Var, 2);
        pluginGeneratedSerialDescriptor.j("aggregation_type", true);
        pluginGeneratedSerialDescriptor.j(ExperienceToggle.DEFAULT_PARAM_KEY, false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{d4c.S(hk8.d), na6.a};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        int i = 0;
        HealthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItemAggregationsItemValuesItemAggregationType healthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItemAggregationsItemValuesItemAggregationType = null;
        double dZ = 0.0d;
        boolean z = true;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                healthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItemAggregationsItemValuesItemAggregationType = (HealthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItemAggregationsItemValuesItemAggregationType) ud4VarC.m(serialDescriptor, 0, hk8.d, healthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItemAggregationsItemValuesItemAggregationType);
                i |= 1;
            } else {
                if (iX != 1) {
                    sz6.e(iX);
                    return null;
                }
                dZ = ud4VarC.z(serialDescriptor, 1);
                i |= 2;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new HealthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItemAggregationsItemValuesItem(i, healthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItemAggregationsItemValuesItemAggregationType, dZ, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        HealthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItemAggregationsItemValuesItem healthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItemAggregationsItemValuesItem = (HealthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItemAggregationsItemValuesItem) obj;
        encoder.getClass();
        healthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItemAggregationsItemValuesItem.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        HealthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItemAggregationsItemValuesItem.write$Self$Claude_tool_model(healthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItemAggregationsItemValuesItem, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
