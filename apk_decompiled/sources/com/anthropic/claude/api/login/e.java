package com.anthropic.claude.api.login;

import com.anthropic.claude.api.login.VerifyMagicLinkRequest;
import com.anthropic.claude.types.strings.EmailAddress;
import defpackage.ok6;
import defpackage.srg;
import defpackage.sz6;
import defpackage.ud4;
import defpackage.vd4;
import defpackage.w28;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class e implements w28 {
    public static final e a;
    private static final SerialDescriptor descriptor;

    static {
        e eVar = new e();
        a = eVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("code", eVar, 2);
        pluginGeneratedSerialDescriptor.j("code", false);
        pluginGeneratedSerialDescriptor.j("email_address", false);
        pluginGeneratedSerialDescriptor.k(new g(VerifyMagicLinkRequest.Credentials.DISCRIMINATOR));
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{srg.a, ok6.a};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        boolean z = true;
        int i = 0;
        String strV = null;
        String strM1013unboximpl = null;
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
                EmailAddress emailAddress = (EmailAddress) ud4VarC.l(serialDescriptor, 1, ok6.a, strM1013unboximpl != null ? EmailAddress.m1006boximpl(strM1013unboximpl) : null);
                strM1013unboximpl = emailAddress != null ? emailAddress.m1013unboximpl() : null;
                i |= 2;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new VerifyMagicLinkRequest.Credentials.Code(i, strV, strM1013unboximpl, null, null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        VerifyMagicLinkRequest.Credentials.Code code = (VerifyMagicLinkRequest.Credentials.Code) obj;
        encoder.getClass();
        code.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        VerifyMagicLinkRequest.Credentials.Code.write$Self$api(code, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
