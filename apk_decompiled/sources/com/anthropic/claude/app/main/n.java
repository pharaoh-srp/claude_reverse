package com.anthropic.claude.app.main;

import com.anthropic.claude.app.main.MainAppScreens;
import com.anthropic.claude.types.strings.AccountId;
import com.anthropic.claude.types.strings.OrganizationId;
import defpackage.d4c;
import defpackage.fkc;
import defpackage.jj;
import defpackage.kw9;
import defpackage.s06;
import defpackage.sz6;
import defpackage.ud4;
import defpackage.vd4;
import defpackage.w28;
import defpackage.z7;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n implements w28 {
    public static final n a;
    private static final SerialDescriptor descriptor;

    static {
        n nVar = new n();
        a = nVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.app.main.MainAppScreens.LoggedIn", nVar, 3);
        pluginGeneratedSerialDescriptor.j("accountId", false);
        pluginGeneratedSerialDescriptor.j("initialOrganizationId", false);
        pluginGeneratedSerialDescriptor.j("ageSignalsResult", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{z7.a, d4c.S(fkc.a), MainAppScreens.LoggedIn.$childSerializers[2].getValue()};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr = MainAppScreens.LoggedIn.$childSerializers;
        boolean z = true;
        int i = 0;
        String strM949unboximpl = null;
        String strM1071unboximpl = null;
        jj jjVar = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                AccountId accountId = (AccountId) ud4VarC.l(serialDescriptor, 0, z7.a, strM949unboximpl != null ? AccountId.m943boximpl(strM949unboximpl) : null);
                strM949unboximpl = accountId != null ? accountId.m949unboximpl() : null;
                i |= 1;
            } else if (iX == 1) {
                OrganizationId organizationId = (OrganizationId) ud4VarC.m(serialDescriptor, 1, fkc.a, strM1071unboximpl != null ? OrganizationId.m1065boximpl(strM1071unboximpl) : null);
                strM1071unboximpl = organizationId != null ? organizationId.m1071unboximpl() : null;
                i |= 2;
            } else {
                if (iX != 2) {
                    sz6.e(iX);
                    return null;
                }
                jjVar = (jj) ud4VarC.l(serialDescriptor, 2, (s06) kw9VarArr[2].getValue(), jjVar);
                i |= 4;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new MainAppScreens.LoggedIn(i, strM949unboximpl, strM1071unboximpl, jjVar, null, null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        MainAppScreens.LoggedIn loggedIn = (MainAppScreens.LoggedIn) obj;
        encoder.getClass();
        loggedIn.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        MainAppScreens.LoggedIn.write$Self$app(loggedIn, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
