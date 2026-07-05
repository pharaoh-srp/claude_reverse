package defpackage;

import com.anthropic.claude.tool.model.HealthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItemAggregationsItem;
import java.time.OffsetDateTime;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ck8 implements w28 {
    public static final ck8 a;
    private static final SerialDescriptor descriptor;

    static {
        ck8 ck8Var = new ck8();
        a = ck8Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.tool.model.HealthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItemAggregationsItem", ck8Var, 4);
        pluginGeneratedSerialDescriptor.j("period_end", false);
        pluginGeneratedSerialDescriptor.j("period_start", false);
        pluginGeneratedSerialDescriptor.j("unit", true);
        pluginGeneratedSerialDescriptor.j("values", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        kw9[] kw9VarArr = HealthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItemAggregationsItem.$childSerializers;
        ay6 ay6Var = ay6.a;
        return new KSerializer[]{ay6Var, ay6Var, d4c.S(srg.a), kw9VarArr[3].getValue()};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr = HealthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItemAggregationsItem.$childSerializers;
        boolean z = true;
        int i = 0;
        OffsetDateTime offsetDateTime = null;
        OffsetDateTime offsetDateTime2 = null;
        String str = null;
        List list = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                offsetDateTime = (OffsetDateTime) ud4VarC.l(serialDescriptor, 0, ay6.a, offsetDateTime);
                i |= 1;
            } else if (iX == 1) {
                offsetDateTime2 = (OffsetDateTime) ud4VarC.l(serialDescriptor, 1, ay6.a, offsetDateTime2);
                i |= 2;
            } else if (iX == 2) {
                str = (String) ud4VarC.m(serialDescriptor, 2, srg.a, str);
                i |= 4;
            } else {
                if (iX != 3) {
                    sz6.e(iX);
                    return null;
                }
                list = (List) ud4VarC.l(serialDescriptor, 3, (s06) kw9VarArr[3].getValue(), list);
                i |= 8;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new HealthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItemAggregationsItem(i, offsetDateTime, offsetDateTime2, str, list, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        HealthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItemAggregationsItem healthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItemAggregationsItem = (HealthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItemAggregationsItem) obj;
        encoder.getClass();
        healthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItemAggregationsItem.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        HealthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItemAggregationsItem.write$Self$Claude_tool_model(healthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItemAggregationsItem, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
