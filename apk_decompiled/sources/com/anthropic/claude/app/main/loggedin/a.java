package com.anthropic.claude.app.main.loggedin;

import com.anthropic.claude.app.main.loggedin.BootstrapScreen;
import com.anthropic.claude.types.strings.OrganizationId;
import defpackage.fkc;
import defpackage.jj;
import defpackage.kw9;
import defpackage.s06;
import defpackage.sz6;
import defpackage.ud4;
import defpackage.vd4;
import defpackage.w28;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements w28 {
    public static final a a;
    private static final SerialDescriptor descriptor;

    static {
        a aVar = new a();
        a = aVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.app.main.loggedin.BootstrapScreen.Bootstrapped", aVar, 2);
        pluginGeneratedSerialDescriptor.j("organizationId", false);
        pluginGeneratedSerialDescriptor.j("ageSignalsResult", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{fkc.a, BootstrapScreen.Bootstrapped.$childSerializers[1].getValue()};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr = BootstrapScreen.Bootstrapped.$childSerializers;
        boolean z = true;
        int i = 0;
        String strM1071unboximpl = null;
        jj jjVar = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                OrganizationId organizationId = (OrganizationId) ud4VarC.l(serialDescriptor, 0, fkc.a, strM1071unboximpl != null ? OrganizationId.m1065boximpl(strM1071unboximpl) : null);
                strM1071unboximpl = organizationId != null ? organizationId.m1071unboximpl() : null;
                i |= 1;
            } else {
                if (iX != 1) {
                    sz6.e(iX);
                    return null;
                }
                jjVar = (jj) ud4VarC.l(serialDescriptor, 1, (s06) kw9VarArr[1].getValue(), jjVar);
                i |= 2;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new BootstrapScreen.Bootstrapped(i, strM1071unboximpl, jjVar, null, null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        BootstrapScreen.Bootstrapped bootstrapped = (BootstrapScreen.Bootstrapped) obj;
        encoder.getClass();
        bootstrapped.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        BootstrapScreen.Bootstrapped.write$Self$app(bootstrapped, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
