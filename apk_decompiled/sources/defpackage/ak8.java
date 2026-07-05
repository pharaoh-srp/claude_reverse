package defpackage;

import com.anthropic.claude.tool.model.HealthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItem;
import com.anthropic.claude.tool.model.HealthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItemError;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ak8 implements w28 {
    public static final ak8 a;
    private static final SerialDescriptor descriptor;

    static {
        ak8 ak8Var = new ak8();
        a = ak8Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.tool.model.HealthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItem", ak8Var, 6);
        pluginGeneratedSerialDescriptor.j("aggregations", true);
        pluginGeneratedSerialDescriptor.j("error", true);
        pluginGeneratedSerialDescriptor.j("has_more_records", true);
        pluginGeneratedSerialDescriptor.j("page_token", true);
        pluginGeneratedSerialDescriptor.j("record_type", false);
        pluginGeneratedSerialDescriptor.j("records", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        kw9[] kw9VarArr = HealthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItem.$childSerializers;
        KSerializer kSerializerS = d4c.S((KSerializer) kw9VarArr[0].getValue());
        KSerializer kSerializerS2 = d4c.S(ik8.a);
        KSerializer kSerializerS3 = d4c.S(zt1.a);
        srg srgVar = srg.a;
        return new KSerializer[]{kSerializerS, kSerializerS2, kSerializerS3, d4c.S(srgVar), srgVar, d4c.S((KSerializer) kw9VarArr[5].getValue())};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr = HealthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItem.$childSerializers;
        boolean z = true;
        int i = 0;
        List list = null;
        HealthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItemError healthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItemError = null;
        Boolean bool = null;
        String str = null;
        String strV = null;
        List list2 = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            switch (iX) {
                case -1:
                    z = false;
                    break;
                case 0:
                    list = (List) ud4VarC.m(serialDescriptor, 0, (s06) kw9VarArr[0].getValue(), list);
                    i |= 1;
                    break;
                case 1:
                    healthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItemError = (HealthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItemError) ud4VarC.m(serialDescriptor, 1, ik8.a, healthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItemError);
                    i |= 2;
                    break;
                case 2:
                    bool = (Boolean) ud4VarC.m(serialDescriptor, 2, zt1.a, bool);
                    i |= 4;
                    break;
                case 3:
                    str = (String) ud4VarC.m(serialDescriptor, 3, srg.a, str);
                    i |= 8;
                    break;
                case 4:
                    strV = ud4VarC.v(serialDescriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    list2 = (List) ud4VarC.m(serialDescriptor, 5, (s06) kw9VarArr[5].getValue(), list2);
                    i |= 32;
                    break;
                default:
                    sz6.e(iX);
                    return null;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new HealthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItem(i, list, healthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItemError, bool, str, strV, list2, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        HealthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItem healthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItem = (HealthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItem) obj;
        encoder.getClass();
        healthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItem.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        HealthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItem.write$Self$Claude_tool_model(healthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItem, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
