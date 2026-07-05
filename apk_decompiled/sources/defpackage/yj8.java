package defpackage;

import com.anthropic.claude.tool.model.HealthConnectQueryV0OutputHealthConnectQueryResult;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class yj8 implements w28 {
    public static final yj8 a;
    private static final SerialDescriptor descriptor;

    static {
        yj8 yj8Var = new yj8();
        a = yj8Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("success", yj8Var, 2);
        pluginGeneratedSerialDescriptor.j("message", true);
        pluginGeneratedSerialDescriptor.j("query_results", false);
        pluginGeneratedSerialDescriptor.k(new gl0(1));
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{d4c.S(srg.a), HealthConnectQueryV0OutputHealthConnectQueryResult.$childSerializers[1].getValue()};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr = HealthConnectQueryV0OutputHealthConnectQueryResult.$childSerializers;
        vnf vnfVar = null;
        boolean z = true;
        int i = 0;
        String str = null;
        List list = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                str = (String) ud4VarC.m(serialDescriptor, 0, srg.a, str);
                i |= 1;
            } else {
                if (iX != 1) {
                    sz6.e(iX);
                    return null;
                }
                list = (List) ud4VarC.l(serialDescriptor, 1, (s06) kw9VarArr[1].getValue(), list);
                i |= 2;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new HealthConnectQueryV0OutputHealthConnectQueryResult(i, str, list, vnfVar);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        HealthConnectQueryV0OutputHealthConnectQueryResult healthConnectQueryV0OutputHealthConnectQueryResult = (HealthConnectQueryV0OutputHealthConnectQueryResult) obj;
        encoder.getClass();
        healthConnectQueryV0OutputHealthConnectQueryResult.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        HealthConnectQueryV0OutputHealthConnectQueryResult.write$Self$Claude_tool_model(healthConnectQueryV0OutputHealthConnectQueryResult, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
