package com.anthropic.claude.login;

import com.anthropic.claude.login.LoginScreens;
import defpackage.d4c;
import defpackage.kw9;
import defpackage.s06;
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

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e implements w28 {
    public static final e a;
    private static final SerialDescriptor descriptor;

    static {
        e eVar = new e();
        a = eVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.login.LoginScreens.Welcome", eVar, 1);
        pluginGeneratedSerialDescriptor.j("notice", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{d4c.S((KSerializer) LoginScreens.Welcome.$childSerializers[0].getValue())};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr = LoginScreens.Welcome.$childSerializers;
        vnf vnfVar = null;
        boolean z = true;
        int i = 0;
        WelcomeNotice welcomeNotice = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else {
                if (iX != 0) {
                    sz6.e(iX);
                    return null;
                }
                welcomeNotice = (WelcomeNotice) ud4VarC.m(serialDescriptor, 0, (s06) kw9VarArr[0].getValue(), welcomeNotice);
                i = 1;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new LoginScreens.Welcome(i, welcomeNotice, vnfVar);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        LoginScreens.Welcome welcome = (LoginScreens.Welcome) obj;
        encoder.getClass();
        welcome.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        LoginScreens.Welcome.write$Self$app(welcome, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
