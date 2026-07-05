package com.anthropic.claude.api.login;

import com.anthropic.claude.api.account.Account;
import com.anthropic.claude.api.login.VerifyResponse;
import defpackage.d4c;
import defpackage.k7;
import defpackage.kw9;
import defpackage.s06;
import defpackage.srg;
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

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class k implements w28 {
    public static final k a;
    private static final SerialDescriptor descriptor;

    static {
        k kVar = new k();
        a = kVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.api.login.VerifyResponse", kVar, 6);
        pluginGeneratedSerialDescriptor.j("success", false);
        pluginGeneratedSerialDescriptor.j("account", true);
        pluginGeneratedSerialDescriptor.j("secret", true);
        pluginGeneratedSerialDescriptor.j("sso_url", true);
        pluginGeneratedSerialDescriptor.j("state", true);
        pluginGeneratedSerialDescriptor.j("created", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        kw9[] kw9VarArr = VerifyResponse.$childSerializers;
        zt1 zt1Var = zt1.a;
        KSerializer kSerializerS = d4c.S(k7.a);
        srg srgVar = srg.a;
        return new KSerializer[]{zt1Var, kSerializerS, d4c.S(srgVar), d4c.S(srgVar), d4c.S((KSerializer) kw9VarArr[4].getValue()), d4c.S(zt1Var)};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr = VerifyResponse.$childSerializers;
        boolean z = true;
        int i = 0;
        boolean zU = false;
        Account account = null;
        String str = null;
        String str2 = null;
        VerifyResponse.AuthenticationState authenticationState = null;
        Boolean bool = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            switch (iX) {
                case -1:
                    z = false;
                    break;
                case 0:
                    zU = ud4VarC.u(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    account = (Account) ud4VarC.m(serialDescriptor, 1, k7.a, account);
                    i |= 2;
                    break;
                case 2:
                    str = (String) ud4VarC.m(serialDescriptor, 2, srg.a, str);
                    i |= 4;
                    break;
                case 3:
                    str2 = (String) ud4VarC.m(serialDescriptor, 3, srg.a, str2);
                    i |= 8;
                    break;
                case 4:
                    authenticationState = (VerifyResponse.AuthenticationState) ud4VarC.m(serialDescriptor, 4, (s06) kw9VarArr[4].getValue(), authenticationState);
                    i |= 16;
                    break;
                case 5:
                    bool = (Boolean) ud4VarC.m(serialDescriptor, 5, zt1.a, bool);
                    i |= 32;
                    break;
                default:
                    sz6.e(iX);
                    return null;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new VerifyResponse(i, zU, account, str, str2, authenticationState, bool, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        VerifyResponse verifyResponse = (VerifyResponse) obj;
        encoder.getClass();
        verifyResponse.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        VerifyResponse.write$Self$api(verifyResponse, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
