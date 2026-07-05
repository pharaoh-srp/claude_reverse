package com.anthropic.claude.api.login;

import com.anthropic.claude.api.login.VerifyResponse;
import com.anthropic.claude.types.strings.EmailAddress;
import defpackage.d4c;
import defpackage.ok6;
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
public final /* synthetic */ class o implements w28 {
    public static final o a;
    private static final SerialDescriptor descriptor;

    static {
        o oVar = new o();
        a = oVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("magic_link", oVar, 2);
        pluginGeneratedSerialDescriptor.j("email", false);
        pluginGeneratedSerialDescriptor.j("fallback_code_configuration", true);
        pluginGeneratedSerialDescriptor.k(new g(VerifyResponse.AuthenticationState.DISCRIMINATOR));
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{ok6.a, d4c.S(b.a)};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        boolean z = true;
        int i = 0;
        String strM1013unboximpl = null;
        CodeConfiguration codeConfiguration = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                EmailAddress emailAddress = (EmailAddress) ud4VarC.l(serialDescriptor, 0, ok6.a, strM1013unboximpl != null ? EmailAddress.m1006boximpl(strM1013unboximpl) : null);
                strM1013unboximpl = emailAddress != null ? emailAddress.m1013unboximpl() : null;
                i |= 1;
            } else {
                if (iX != 1) {
                    sz6.e(iX);
                    return null;
                }
                codeConfiguration = (CodeConfiguration) ud4VarC.m(serialDescriptor, 1, b.a, codeConfiguration);
                i |= 2;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new VerifyResponse.AuthenticationState.MagicLink(i, strM1013unboximpl, codeConfiguration, null, null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        VerifyResponse.AuthenticationState.MagicLink magicLink = (VerifyResponse.AuthenticationState.MagicLink) obj;
        encoder.getClass();
        magicLink.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        VerifyResponse.AuthenticationState.MagicLink.write$Self$api(magicLink, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
