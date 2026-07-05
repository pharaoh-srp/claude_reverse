package defpackage;

import com.anthropic.claude.tool.model.HealthConnectQueryV0InputQueriesItemTimeRange;
import java.time.OffsetDateTime;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class rj8 implements w28 {
    public static final rj8 a;
    private static final SerialDescriptor descriptor;

    static {
        rj8 rj8Var = new rj8();
        a = rj8Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.tool.model.HealthConnectQueryV0InputQueriesItemTimeRange", rj8Var, 2);
        pluginGeneratedSerialDescriptor.j("end_time", true);
        pluginGeneratedSerialDescriptor.j("start_time", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        ay6 ay6Var = ay6.a;
        return new KSerializer[]{d4c.S(ay6Var), d4c.S(ay6Var)};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        vnf vnfVar = null;
        boolean z = true;
        int i = 0;
        OffsetDateTime offsetDateTime = null;
        OffsetDateTime offsetDateTime2 = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                offsetDateTime = (OffsetDateTime) ud4VarC.m(serialDescriptor, 0, ay6.a, offsetDateTime);
                i |= 1;
            } else {
                if (iX != 1) {
                    sz6.e(iX);
                    return null;
                }
                offsetDateTime2 = (OffsetDateTime) ud4VarC.m(serialDescriptor, 1, ay6.a, offsetDateTime2);
                i |= 2;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new HealthConnectQueryV0InputQueriesItemTimeRange(i, offsetDateTime, offsetDateTime2, vnfVar);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        HealthConnectQueryV0InputQueriesItemTimeRange healthConnectQueryV0InputQueriesItemTimeRange = (HealthConnectQueryV0InputQueriesItemTimeRange) obj;
        encoder.getClass();
        healthConnectQueryV0InputQueriesItemTimeRange.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        HealthConnectQueryV0InputQueriesItemTimeRange.write$Self$Claude_tool_model(healthConnectQueryV0InputQueriesItemTimeRange, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
