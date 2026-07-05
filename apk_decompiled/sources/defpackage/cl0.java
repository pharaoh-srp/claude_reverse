package defpackage;

import com.anthropic.claude.analytics.events.AppStartEvents$BootstrapValidCookie;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class cl0 implements w28 {
    public static final cl0 a;
    private static final SerialDescriptor descriptor;

    static {
        cl0 cl0Var = new cl0();
        a = cl0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("mobile.app_start.bootstrap.valid_cookie", cl0Var, 0);
        pluginGeneratedSerialDescriptor.k(new gl0(0));
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        return new KSerializer[0];
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        int iX = ud4VarC.x(serialDescriptor);
        vnf vnfVar = null;
        if (iX == -1) {
            ud4VarC.b(serialDescriptor);
            return new AppStartEvents$BootstrapValidCookie(0, vnfVar);
        }
        sz6.e(iX);
        return null;
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        AppStartEvents$BootstrapValidCookie appStartEvents$BootstrapValidCookie = (AppStartEvents$BootstrapValidCookie) obj;
        encoder.getClass();
        appStartEvents$BootstrapValidCookie.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        AppStartEvents$BootstrapValidCookie.write$Self$analytics(appStartEvents$BootstrapValidCookie, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
