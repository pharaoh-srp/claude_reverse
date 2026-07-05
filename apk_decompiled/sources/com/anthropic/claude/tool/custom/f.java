package com.anthropic.claude.tool.custom;

import com.anthropic.claude.tool.custom.PhoneCallMonitorEvent;
import defpackage.sz6;
import defpackage.ud4;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.w28;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class f implements w28 {
    public static final f a;
    private static final SerialDescriptor descriptor;

    static {
        f fVar = new f();
        a = fVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.tool.custom.PhoneCallMonitorEvent.AgentResponseCorrection", fVar, 1);
        pluginGeneratedSerialDescriptor.j("agent_response_correction_event", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{h.a};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        vnf vnfVar = null;
        boolean z = true;
        int i = 0;
        PhoneCallMonitorEvent.AgentResponseCorrection.Payload payload = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else {
                if (iX != 0) {
                    sz6.e(iX);
                    return null;
                }
                payload = (PhoneCallMonitorEvent.AgentResponseCorrection.Payload) ud4VarC.l(serialDescriptor, 0, h.a, payload);
                i = 1;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new PhoneCallMonitorEvent.AgentResponseCorrection(i, payload, vnfVar);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        PhoneCallMonitorEvent.AgentResponseCorrection agentResponseCorrection = (PhoneCallMonitorEvent.AgentResponseCorrection) obj;
        encoder.getClass();
        agentResponseCorrection.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        vd4VarC.r(serialDescriptor, 0, h.a, agentResponseCorrection.event);
        vd4VarC.b(serialDescriptor);
    }
}
