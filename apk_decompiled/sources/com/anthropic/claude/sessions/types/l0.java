package com.anthropic.claude.sessions.types;

import com.anthropic.claude.sessions.types.GetOrCreateDispatchSessionResponse;
import com.anthropic.claude.types.strings.SessionId;
import defpackage.fsf;
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
public final /* synthetic */ class l0 implements w28 {
    public static final l0 a;
    private static final SerialDescriptor descriptor;

    static {
        l0 l0Var = new l0();
        a = l0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.sessions.types.GetOrCreateDispatchSessionResponse.DispatchSessionRef", l0Var, 1);
        pluginGeneratedSerialDescriptor.j("id", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{fsf.a};
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        vnf vnfVar = null;
        Object[] objArr = 0;
        Object[] objArr2 = true;
        int i = 0;
        String strM1120unboximpl = null;
        while (objArr2 != false) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                objArr2 = false;
            } else {
                if (iX != 0) {
                    sz6.e(iX);
                    return null;
                }
                SessionId sessionId = (SessionId) ud4VarC.l(serialDescriptor, 0, fsf.a, strM1120unboximpl != null ? SessionId.m1114boximpl(strM1120unboximpl) : null);
                strM1120unboximpl = sessionId != null ? sessionId.m1120unboximpl() : null;
                i = 1;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new GetOrCreateDispatchSessionResponse.DispatchSessionRef(i, strM1120unboximpl, vnfVar, objArr == true ? 1 : 0);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        GetOrCreateDispatchSessionResponse.DispatchSessionRef dispatchSessionRef = (GetOrCreateDispatchSessionResponse.DispatchSessionRef) obj;
        encoder.getClass();
        dispatchSessionRef.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        vd4VarC.r(serialDescriptor, 0, fsf.a, SessionId.m1114boximpl(dispatchSessionRef.id));
        vd4VarC.b(serialDescriptor);
    }
}
