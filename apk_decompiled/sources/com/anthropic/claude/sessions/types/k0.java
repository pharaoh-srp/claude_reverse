package com.anthropic.claude.sessions.types;

import com.anthropic.claude.sessions.types.GetOrCreateDispatchSessionResponse;
import defpackage.sz6;
import defpackage.ud4;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.w28;
import defpackage.zt1;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class k0 implements w28 {
    public static final k0 a;
    private static final SerialDescriptor descriptor;

    static {
        k0 k0Var = new k0();
        a = k0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.sessions.types.GetOrCreateDispatchSessionResponse", k0Var, 2);
        pluginGeneratedSerialDescriptor.j("session", false);
        pluginGeneratedSerialDescriptor.j("created", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{l0.a, zt1.a};
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
        GetOrCreateDispatchSessionResponse.DispatchSessionRef dispatchSessionRef = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                dispatchSessionRef = (GetOrCreateDispatchSessionResponse.DispatchSessionRef) ud4VarC.l(serialDescriptor, 0, l0.a, dispatchSessionRef);
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
        return new GetOrCreateDispatchSessionResponse(i, dispatchSessionRef, zU, vnfVar);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        GetOrCreateDispatchSessionResponse getOrCreateDispatchSessionResponse = (GetOrCreateDispatchSessionResponse) obj;
        encoder.getClass();
        getOrCreateDispatchSessionResponse.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        GetOrCreateDispatchSessionResponse.write$Self$sessions(getOrCreateDispatchSessionResponse, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
