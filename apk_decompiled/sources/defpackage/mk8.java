package defpackage;

import com.anthropic.claude.api.experience.ExperienceToggle;
import com.anthropic.claude.tool.model.HealthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItemRecordsItem;
import java.time.OffsetDateTime;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class mk8 implements w28 {
    public static final mk8 a;
    private static final SerialDescriptor descriptor;

    static {
        mk8 mk8Var = new mk8();
        a = mk8Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.tool.model.HealthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItemRecordsItem", mk8Var, 4);
        pluginGeneratedSerialDescriptor.j("end_time", true);
        pluginGeneratedSerialDescriptor.j("start_time", false);
        pluginGeneratedSerialDescriptor.j("unit", true);
        pluginGeneratedSerialDescriptor.j(ExperienceToggle.DEFAULT_PARAM_KEY, false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        ay6 ay6Var = ay6.a;
        KSerializer kSerializerS = d4c.S(ay6Var);
        srg srgVar = srg.a;
        return new KSerializer[]{kSerializerS, ay6Var, d4c.S(srgVar), srgVar};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        boolean z = true;
        int i = 0;
        OffsetDateTime offsetDateTime = null;
        OffsetDateTime offsetDateTime2 = null;
        String str = null;
        String strV = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                offsetDateTime = (OffsetDateTime) ud4VarC.m(serialDescriptor, 0, ay6.a, offsetDateTime);
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
                strV = ud4VarC.v(serialDescriptor, 3);
                i |= 8;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new HealthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItemRecordsItem(i, offsetDateTime, offsetDateTime2, str, strV, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        HealthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItemRecordsItem healthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItemRecordsItem = (HealthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItemRecordsItem) obj;
        encoder.getClass();
        healthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItemRecordsItem.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        HealthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItemRecordsItem.write$Self$Claude_tool_model(healthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItemRecordsItem, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
