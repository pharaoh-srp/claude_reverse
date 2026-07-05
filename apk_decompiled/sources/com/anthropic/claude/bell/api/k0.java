package com.anthropic.claude.bell.api;

import com.anthropic.claude.bell.api.BellApiServerMessage;
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

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class k0 implements w28 {
    public static final k0 a;
    private static final SerialDescriptor descriptor;

    static {
        k0 k0Var = new k0();
        a = k0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("message_complete", k0Var, 1);
        pluginGeneratedSerialDescriptor.j("data", false);
        pluginGeneratedSerialDescriptor.k(new j());
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{m0.a};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        vnf vnfVar = null;
        boolean z = true;
        int i = 0;
        BellApiServerMessage.MessageCompleteData messageCompleteData = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else {
                if (iX != 0) {
                    sz6.e(iX);
                    return null;
                }
                messageCompleteData = (BellApiServerMessage.MessageCompleteData) ud4VarC.l(serialDescriptor, 0, m0.a, messageCompleteData);
                i = 1;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new BellApiServerMessage.MessageComplete(i, messageCompleteData, vnfVar);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        BellApiServerMessage.MessageComplete messageComplete = (BellApiServerMessage.MessageComplete) obj;
        encoder.getClass();
        messageComplete.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        vd4VarC.r(serialDescriptor, 0, m0.a, messageComplete.data);
        vd4VarC.b(serialDescriptor);
    }
}
