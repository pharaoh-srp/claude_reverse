package defpackage;

import com.anthropic.claude.tool.model.HealthConnectQueryV0InputQueriesItemAggregation;
import com.anthropic.claude.tool.model.HealthConnectQueryV0InputQueriesItemAggregationBucketBy;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class jj8 implements w28 {
    public static final jj8 a;
    private static final SerialDescriptor descriptor;

    static {
        jj8 jj8Var = new jj8();
        a = jj8Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.tool.model.HealthConnectQueryV0InputQueriesItemAggregation", jj8Var, 4);
        pluginGeneratedSerialDescriptor.j("aggregation_types", true);
        pluginGeneratedSerialDescriptor.j("bucket_by", true);
        pluginGeneratedSerialDescriptor.j("bucket_duration_minutes", true);
        pluginGeneratedSerialDescriptor.j("bucket_period_days", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        KSerializer kSerializerS = d4c.S((KSerializer) HealthConnectQueryV0InputQueriesItemAggregation.$childSerializers[0].getValue());
        KSerializer kSerializerS2 = d4c.S(oj8.d);
        e79 e79Var = e79.a;
        return new KSerializer[]{kSerializerS, kSerializerS2, d4c.S(e79Var), d4c.S(e79Var)};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr = HealthConnectQueryV0InputQueriesItemAggregation.$childSerializers;
        boolean z = true;
        int i = 0;
        List list = null;
        HealthConnectQueryV0InputQueriesItemAggregationBucketBy healthConnectQueryV0InputQueriesItemAggregationBucketBy = null;
        Integer num = null;
        Integer num2 = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                list = (List) ud4VarC.m(serialDescriptor, 0, (s06) kw9VarArr[0].getValue(), list);
                i |= 1;
            } else if (iX == 1) {
                healthConnectQueryV0InputQueriesItemAggregationBucketBy = (HealthConnectQueryV0InputQueriesItemAggregationBucketBy) ud4VarC.m(serialDescriptor, 1, oj8.d, healthConnectQueryV0InputQueriesItemAggregationBucketBy);
                i |= 2;
            } else if (iX == 2) {
                num = (Integer) ud4VarC.m(serialDescriptor, 2, e79.a, num);
                i |= 4;
            } else {
                if (iX != 3) {
                    sz6.e(iX);
                    return null;
                }
                num2 = (Integer) ud4VarC.m(serialDescriptor, 3, e79.a, num2);
                i |= 8;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new HealthConnectQueryV0InputQueriesItemAggregation(i, list, healthConnectQueryV0InputQueriesItemAggregationBucketBy, num, num2, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        HealthConnectQueryV0InputQueriesItemAggregation healthConnectQueryV0InputQueriesItemAggregation = (HealthConnectQueryV0InputQueriesItemAggregation) obj;
        encoder.getClass();
        healthConnectQueryV0InputQueriesItemAggregation.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        HealthConnectQueryV0InputQueriesItemAggregation.write$Self$Claude_tool_model(healthConnectQueryV0InputQueriesItemAggregation, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
