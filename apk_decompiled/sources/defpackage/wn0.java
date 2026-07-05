package defpackage;

import com.anthropic.claude.api.tasks.ApproveTaskAgentOverrides;
import com.anthropic.claude.api.tasks.ApproveTaskRequest;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class wn0 implements w28 {
    public static final wn0 a;
    private static final SerialDescriptor descriptor;

    static {
        wn0 wn0Var = new wn0();
        a = wn0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.api.tasks.ApproveTaskRequest", wn0Var, 1);
        pluginGeneratedSerialDescriptor.j("agent_overrides", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{d4c.S(un0.a)};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        vnf vnfVar = null;
        boolean z = true;
        int i = 0;
        ApproveTaskAgentOverrides approveTaskAgentOverrides = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else {
                if (iX != 0) {
                    sz6.e(iX);
                    return null;
                }
                approveTaskAgentOverrides = (ApproveTaskAgentOverrides) ud4VarC.m(serialDescriptor, 0, un0.a, approveTaskAgentOverrides);
                i = 1;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new ApproveTaskRequest(i, approveTaskAgentOverrides, vnfVar);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        ApproveTaskRequest approveTaskRequest = (ApproveTaskRequest) obj;
        encoder.getClass();
        approveTaskRequest.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        ApproveTaskRequest.write$Self$api(approveTaskRequest, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
