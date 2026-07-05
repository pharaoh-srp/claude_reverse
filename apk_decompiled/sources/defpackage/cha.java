package defpackage;

import com.anthropic.claude.analytics.events.LoginEvents$AccountLoggedOut;
import com.anthropic.claude.analytics.events.LoginEvents$LogoutReason;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class cha implements w28 {
    public static final cha a;
    private static final SerialDescriptor descriptor;

    static {
        cha chaVar = new cha();
        a = chaVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("mobile.login.logged_out", chaVar, 2);
        pluginGeneratedSerialDescriptor.j("reason", false);
        pluginGeneratedSerialDescriptor.j("seconds_since_last_valid", true);
        pluginGeneratedSerialDescriptor.k(new pi(24));
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{LoginEvents$AccountLoggedOut.$childSerializers[0].getValue(), d4c.S(xka.a)};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr = LoginEvents$AccountLoggedOut.$childSerializers;
        vnf vnfVar = null;
        boolean z = true;
        int i = 0;
        LoginEvents$LogoutReason loginEvents$LogoutReason = null;
        Long l = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                loginEvents$LogoutReason = (LoginEvents$LogoutReason) ud4VarC.l(serialDescriptor, 0, (s06) kw9VarArr[0].getValue(), loginEvents$LogoutReason);
                i |= 1;
            } else {
                if (iX != 1) {
                    sz6.e(iX);
                    return null;
                }
                l = (Long) ud4VarC.m(serialDescriptor, 1, xka.a, l);
                i |= 2;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new LoginEvents$AccountLoggedOut(i, loginEvents$LogoutReason, l, vnfVar);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        LoginEvents$AccountLoggedOut loginEvents$AccountLoggedOut = (LoginEvents$AccountLoggedOut) obj;
        encoder.getClass();
        loginEvents$AccountLoggedOut.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        LoginEvents$AccountLoggedOut.write$Self$analytics(loginEvents$AccountLoggedOut, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
