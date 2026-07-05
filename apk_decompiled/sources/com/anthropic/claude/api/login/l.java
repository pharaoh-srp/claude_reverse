package com.anthropic.claude.api.login;

import com.anthropic.claude.api.account.Account;
import com.anthropic.claude.api.login.VerifyResponse;
import defpackage.k7;
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
public final /* synthetic */ class l implements w28 {
    public static final l a;
    private static final SerialDescriptor descriptor;

    static {
        l lVar = new l();
        a = lVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("authenticated", lVar, 1);
        pluginGeneratedSerialDescriptor.j("account", false);
        pluginGeneratedSerialDescriptor.k(new g(VerifyResponse.AuthenticationState.DISCRIMINATOR));
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{k7.a};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        vnf vnfVar = null;
        boolean z = true;
        int i = 0;
        Account account = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else {
                if (iX != 0) {
                    sz6.e(iX);
                    return null;
                }
                account = (Account) ud4VarC.l(serialDescriptor, 0, k7.a, account);
                i = 1;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new VerifyResponse.AuthenticationState.Authenticated(i, account, vnfVar);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        VerifyResponse.AuthenticationState.Authenticated authenticated = (VerifyResponse.AuthenticationState.Authenticated) obj;
        encoder.getClass();
        authenticated.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        vd4VarC.r(serialDescriptor, 0, k7.a, authenticated.account);
        vd4VarC.b(serialDescriptor);
    }
}
