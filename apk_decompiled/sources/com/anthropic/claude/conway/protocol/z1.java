package com.anthropic.claude.conway.protocol;

import com.anthropic.claude.conway.protocol.UserPart;
import defpackage.d4c;
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

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class z1 implements w28 {
    public static final z1 a;
    private static final SerialDescriptor descriptor;

    static {
        z1 z1Var = new z1();
        a = z1Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.conway.protocol.UserPart.Attachment", z1Var, 3);
        pluginGeneratedSerialDescriptor.j("label", false);
        pluginGeneratedSerialDescriptor.j("content", false);
        pluginGeneratedSerialDescriptor.j("path", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        srg srgVar = srg.a;
        return new KSerializer[]{srgVar, srgVar, d4c.S(srgVar)};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        boolean z = true;
        int i = 0;
        String strV = null;
        String strV2 = null;
        String str = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                strV = ud4VarC.v(serialDescriptor, 0);
                i |= 1;
            } else if (iX == 1) {
                strV2 = ud4VarC.v(serialDescriptor, 1);
                i |= 2;
            } else {
                if (iX != 2) {
                    sz6.e(iX);
                    return null;
                }
                str = (String) ud4VarC.m(serialDescriptor, 2, srg.a, str);
                i |= 4;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new UserPart.Attachment(i, strV, strV2, str, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        UserPart.Attachment attachment = (UserPart.Attachment) obj;
        encoder.getClass();
        attachment.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        UserPart.Attachment.write$Self$conway(attachment, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
