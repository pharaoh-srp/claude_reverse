package defpackage;

import com.anthropic.claude.tool.model.HealthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItemError;
import com.anthropic.claude.tool.model.HealthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItemErrorErrorType;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ik8 implements w28 {
    public static final ik8 a;
    private static final SerialDescriptor descriptor;

    static {
        ik8 ik8Var = new ik8();
        a = ik8Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.tool.model.HealthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItemError", ik8Var, 2);
        pluginGeneratedSerialDescriptor.j("error_type", false);
        pluginGeneratedSerialDescriptor.j("message", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{lk8.d, d4c.S(srg.a)};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        vnf vnfVar = null;
        boolean z = true;
        int i = 0;
        HealthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItemErrorErrorType healthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItemErrorErrorType = null;
        String str = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                healthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItemErrorErrorType = (HealthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItemErrorErrorType) ud4VarC.l(serialDescriptor, 0, lk8.d, healthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItemErrorErrorType);
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
        return new HealthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItemError(i, healthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItemErrorErrorType, str, vnfVar);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        HealthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItemError healthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItemError = (HealthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItemError) obj;
        encoder.getClass();
        healthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItemError.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        HealthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItemError.write$Self$Claude_tool_model(healthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItemError, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
