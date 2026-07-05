package com.anthropic.claude.settings;

import com.anthropic.claude.api.account.RavenType;
import com.anthropic.claude.settings.SettingsAppScreen;
import defpackage.d4c;
import defpackage.kw9;
import defpackage.pvg;
import defpackage.s06;
import defpackage.sz6;
import defpackage.ud4;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.w1e;
import defpackage.w28;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class c implements w28 {
    public static final c a;
    private static final SerialDescriptor descriptor;

    static {
        c cVar = new c();
        a = cVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.settings.SettingsAppScreen.BillingScreen", cVar, 2);
        pluginGeneratedSerialDescriptor.j("subscriptionLevel", false);
        pluginGeneratedSerialDescriptor.j("ravenType", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{SettingsAppScreen.BillingScreen.$childSerializers[0].getValue(), d4c.S(w1e.d)};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr = SettingsAppScreen.BillingScreen.$childSerializers;
        vnf vnfVar = null;
        boolean z = true;
        int i = 0;
        pvg pvgVar = null;
        RavenType ravenType = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                pvgVar = (pvg) ud4VarC.l(serialDescriptor, 0, (s06) kw9VarArr[0].getValue(), pvgVar);
                i |= 1;
            } else {
                if (iX != 1) {
                    sz6.e(iX);
                    return null;
                }
                ravenType = (RavenType) ud4VarC.m(serialDescriptor, 1, w1e.d, ravenType);
                i |= 2;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new SettingsAppScreen.BillingScreen(i, pvgVar, ravenType, vnfVar);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        SettingsAppScreen.BillingScreen billingScreen = (SettingsAppScreen.BillingScreen) obj;
        encoder.getClass();
        billingScreen.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        SettingsAppScreen.BillingScreen.write$Self$settings(billingScreen, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
