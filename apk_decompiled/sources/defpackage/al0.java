package defpackage;

import com.anthropic.claude.analytics.events.AppStartEvents$BootstrapRedirectToLogin;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class al0 implements w28 {
    public static final al0 a;
    private static final SerialDescriptor descriptor;

    static {
        al0 al0Var = new al0();
        a = al0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("mobile.app_start.bootstrap.redirect_to_login", al0Var, 1);
        pluginGeneratedSerialDescriptor.j("error_description", true);
        pluginGeneratedSerialDescriptor.k(new gl0(0));
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{d4c.S(srg.a)};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        vnf vnfVar = null;
        boolean z = true;
        int i = 0;
        String str = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else {
                if (iX != 0) {
                    sz6.e(iX);
                    return null;
                }
                str = (String) ud4VarC.m(serialDescriptor, 0, srg.a, str);
                i = 1;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new AppStartEvents$BootstrapRedirectToLogin(i, str, vnfVar);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        AppStartEvents$BootstrapRedirectToLogin appStartEvents$BootstrapRedirectToLogin = (AppStartEvents$BootstrapRedirectToLogin) obj;
        encoder.getClass();
        appStartEvents$BootstrapRedirectToLogin.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        AppStartEvents$BootstrapRedirectToLogin.write$Self$analytics(appStartEvents$BootstrapRedirectToLogin, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
