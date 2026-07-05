package com.anthropic.claude.conway.protocol;

import com.anthropic.claude.api.login.VerifyResponse;
import com.anthropic.claude.conway.protocol.StreamMessage;
import com.anthropic.claude.types.strings.ForkId;
import defpackage.aw7;
import defpackage.d4c;
import defpackage.srg;
import defpackage.sz6;
import defpackage.ud4;
import defpackage.vd4;
import defpackage.w28;
import defpackage.xka;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class c1 implements w28 {
    public static final c1 a;
    private static final SerialDescriptor descriptor;

    static {
        c1 c1Var = new c1();
        a = c1Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.conway.protocol.StreamMessage.ForkCreated", c1Var, 6);
        pluginGeneratedSerialDescriptor.j("seq", true);
        pluginGeneratedSerialDescriptor.j("ts", true);
        pluginGeneratedSerialDescriptor.j("agentId", false);
        pluginGeneratedSerialDescriptor.j("label", true);
        pluginGeneratedSerialDescriptor.j("createdAt", true);
        pluginGeneratedSerialDescriptor.j(VerifyResponse.AuthenticationState.DISCRIMINATOR, true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        srg srgVar = srg.a;
        KSerializer kSerializerS = d4c.S(srgVar);
        KSerializer kSerializerS2 = d4c.S(srgVar);
        xka xkaVar = xka.a;
        return new KSerializer[]{xkaVar, xkaVar, aw7.a, kSerializerS, xkaVar, kSerializerS2};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        Object obj = null;
        int i = 0;
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        String str = null;
        String strM1028unboximpl = null;
        String str2 = null;
        boolean z = true;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            switch (iX) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    j = ud4VarC.j(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    j2 = ud4VarC.j(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    ForkId forkId = (ForkId) ud4VarC.l(serialDescriptor, 2, aw7.a, strM1028unboximpl != null ? ForkId.m1021boximpl(strM1028unboximpl) : null);
                    strM1028unboximpl = forkId != null ? forkId.m1028unboximpl() : null;
                    i |= 4;
                    break;
                case 3:
                    str2 = (String) ud4VarC.m(serialDescriptor, 3, srg.a, str2);
                    i |= 8;
                    break;
                case 4:
                    j3 = ud4VarC.j(serialDescriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    str = (String) ud4VarC.m(serialDescriptor, 5, srg.a, str);
                    i |= 32;
                    break;
                default:
                    sz6.e(iX);
                    return obj;
            }
            obj = null;
        }
        ud4VarC.b(serialDescriptor);
        return new StreamMessage.ForkCreated(i, j, j2, strM1028unboximpl, str2, j3, str, null, null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        StreamMessage.ForkCreated forkCreated = (StreamMessage.ForkCreated) obj;
        encoder.getClass();
        forkCreated.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        StreamMessage.ForkCreated.write$Self$conway(forkCreated, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
