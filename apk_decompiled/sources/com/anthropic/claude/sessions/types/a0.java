package com.anthropic.claude.sessions.types;

import com.anthropic.claude.sessions.types.CreateCoworkRemoteSessionResponse;
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
public final /* synthetic */ class a0 implements w28 {
    public static final a0 a;
    private static final SerialDescriptor descriptor;

    static {
        a0 a0Var = new a0();
        a = a0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("CreateDramaticShrimpSessionResponse", a0Var, 1);
        pluginGeneratedSerialDescriptor.j("session", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{b0.a};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        vnf vnfVar = null;
        boolean z = true;
        int i = 0;
        CreateCoworkRemoteSessionResponse.CoworkRemoteSessionRef coworkRemoteSessionRef = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else {
                if (iX != 0) {
                    sz6.e(iX);
                    return null;
                }
                coworkRemoteSessionRef = (CreateCoworkRemoteSessionResponse.CoworkRemoteSessionRef) ud4VarC.l(serialDescriptor, 0, b0.a, coworkRemoteSessionRef);
                i = 1;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new CreateCoworkRemoteSessionResponse(i, coworkRemoteSessionRef, vnfVar);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        CreateCoworkRemoteSessionResponse createCoworkRemoteSessionResponse = (CreateCoworkRemoteSessionResponse) obj;
        encoder.getClass();
        createCoworkRemoteSessionResponse.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        vd4VarC.r(serialDescriptor, 0, b0.a, createCoworkRemoteSessionResponse.session);
        vd4VarC.b(serialDescriptor);
    }
}
