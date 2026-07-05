package defpackage;

import com.anthropic.claude.analytics.events.AssistEvents$AssistApproveResult;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class dx0 implements w28 {
    public static final dx0 a;
    private static final SerialDescriptor descriptor;

    static {
        dx0 dx0Var = new dx0();
        a = dx0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("assist.task.approve.result", dx0Var, 2);
        pluginGeneratedSerialDescriptor.j("task_uuid", false);
        pluginGeneratedSerialDescriptor.j("success", false);
        pluginGeneratedSerialDescriptor.k(new pi(9));
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{srg.a, zt1.a};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        vnf vnfVar = null;
        boolean z = true;
        int i = 0;
        boolean zU = false;
        String strV = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                strV = ud4VarC.v(serialDescriptor, 0);
                i |= 1;
            } else {
                if (iX != 1) {
                    sz6.e(iX);
                    return null;
                }
                zU = ud4VarC.u(serialDescriptor, 1);
                i |= 2;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new AssistEvents$AssistApproveResult(i, strV, zU, vnfVar);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        AssistEvents$AssistApproveResult assistEvents$AssistApproveResult = (AssistEvents$AssistApproveResult) obj;
        encoder.getClass();
        assistEvents$AssistApproveResult.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        AssistEvents$AssistApproveResult.write$Self$analytics(assistEvents$AssistApproveResult, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
