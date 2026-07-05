package com.anthropic.claude.sessions.types;

import com.anthropic.claude.api.login.VerifyResponse;
import com.anthropic.claude.sessions.types.StdoutMessage;
import defpackage.cq4;
import defpackage.srg;
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
public final /* synthetic */ class s1 implements w28 {
    public static final s1 a;
    private static final SerialDescriptor descriptor;

    static {
        s1 s1Var = new s1();
        a = s1Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.sessions.types.StdoutMessage.ControlResponse", s1Var, 2);
        pluginGeneratedSerialDescriptor.j(VerifyResponse.AuthenticationState.DISCRIMINATOR, true);
        pluginGeneratedSerialDescriptor.j("response", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{srg.a, cq4.a};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        vnf vnfVar = null;
        boolean z = true;
        int i = 0;
        String strV = null;
        ControlResponseData controlResponseData = null;
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
                controlResponseData = (ControlResponseData) ud4VarC.l(serialDescriptor, 1, cq4.a, controlResponseData);
                i |= 2;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new StdoutMessage.ControlResponse(i, strV, controlResponseData, vnfVar);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        StdoutMessage.ControlResponse controlResponse = (StdoutMessage.ControlResponse) obj;
        encoder.getClass();
        controlResponse.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        StdoutMessage.ControlResponse.write$Self$sessions(controlResponse, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
