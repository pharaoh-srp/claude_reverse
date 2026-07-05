package defpackage;

import com.anthropic.claude.tool.model.HealthConnectQueryV0OutputHealthConnectQueryError;
import com.anthropic.claude.tool.model.HealthConnectQueryV0OutputHealthConnectQueryErrorErrorType;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class uj8 implements w28 {
    public static final uj8 a;
    private static final SerialDescriptor descriptor;

    static {
        uj8 uj8Var = new uj8();
        a = uj8Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("error", uj8Var, 2);
        pluginGeneratedSerialDescriptor.j("error_type", false);
        pluginGeneratedSerialDescriptor.j("message", true);
        pluginGeneratedSerialDescriptor.k(new gl0(1));
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{xj8.d, d4c.S(srg.a)};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        vnf vnfVar = null;
        boolean z = true;
        int i = 0;
        HealthConnectQueryV0OutputHealthConnectQueryErrorErrorType healthConnectQueryV0OutputHealthConnectQueryErrorErrorType = null;
        String str = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                healthConnectQueryV0OutputHealthConnectQueryErrorErrorType = (HealthConnectQueryV0OutputHealthConnectQueryErrorErrorType) ud4VarC.l(serialDescriptor, 0, xj8.d, healthConnectQueryV0OutputHealthConnectQueryErrorErrorType);
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
        return new HealthConnectQueryV0OutputHealthConnectQueryError(i, healthConnectQueryV0OutputHealthConnectQueryErrorErrorType, str, vnfVar);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        HealthConnectQueryV0OutputHealthConnectQueryError healthConnectQueryV0OutputHealthConnectQueryError = (HealthConnectQueryV0OutputHealthConnectQueryError) obj;
        encoder.getClass();
        healthConnectQueryV0OutputHealthConnectQueryError.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        HealthConnectQueryV0OutputHealthConnectQueryError.write$Self$Claude_tool_model(healthConnectQueryV0OutputHealthConnectQueryError, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
