package defpackage;

import com.anthropic.claude.tool.model.HealthConnectQueryV0Input;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ej8 implements w28 {
    public static final ej8 a;
    private static final SerialDescriptor descriptor;

    static {
        ej8 ej8Var = new ej8();
        a = ej8Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.tool.model.HealthConnectQueryV0Input", ej8Var, 1);
        pluginGeneratedSerialDescriptor.j("queries", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{HealthConnectQueryV0Input.$childSerializers[0].getValue()};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr = HealthConnectQueryV0Input.$childSerializers;
        vnf vnfVar = null;
        boolean z = true;
        int i = 0;
        List list = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else {
                if (iX != 0) {
                    sz6.e(iX);
                    return null;
                }
                list = (List) ud4VarC.l(serialDescriptor, 0, (s06) kw9VarArr[0].getValue(), list);
                i = 1;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new HealthConnectQueryV0Input(i, list, vnfVar);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        HealthConnectQueryV0Input healthConnectQueryV0Input = (HealthConnectQueryV0Input) obj;
        encoder.getClass();
        healthConnectQueryV0Input.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        vd4VarC.r(serialDescriptor, 0, (znf) HealthConnectQueryV0Input.$childSerializers[0].getValue(), healthConnectQueryV0Input.queries);
        vd4VarC.b(serialDescriptor);
    }
}
