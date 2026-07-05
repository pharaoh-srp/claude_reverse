package defpackage;

import com.anthropic.claude.tool.model.HealthConnectQueryV0InputQueriesItemRecords;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class pj8 implements w28 {
    public static final pj8 a;
    private static final SerialDescriptor descriptor;

    static {
        pj8 pj8Var = new pj8();
        a = pj8Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.tool.model.HealthConnectQueryV0InputQueriesItemRecords", pj8Var, 2);
        pluginGeneratedSerialDescriptor.j("limit", true);
        pluginGeneratedSerialDescriptor.j("page_token", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{d4c.S(e79.a), d4c.S(srg.a)};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        vnf vnfVar = null;
        boolean z = true;
        int i = 0;
        Integer num = null;
        String str = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                num = (Integer) ud4VarC.m(serialDescriptor, 0, e79.a, num);
                i |= 1;
            } else {
                if (iX != 1) {
                    sz6.e(iX);
                    return null;
                }
                str = (String) ud4VarC.m(serialDescriptor, 1, srg.a, str);
                i |= 2;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new HealthConnectQueryV0InputQueriesItemRecords(i, num, str, vnfVar);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        HealthConnectQueryV0InputQueriesItemRecords healthConnectQueryV0InputQueriesItemRecords = (HealthConnectQueryV0InputQueriesItemRecords) obj;
        encoder.getClass();
        healthConnectQueryV0InputQueriesItemRecords.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        HealthConnectQueryV0InputQueriesItemRecords.write$Self$Claude_tool_model(healthConnectQueryV0InputQueriesItemRecords, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
