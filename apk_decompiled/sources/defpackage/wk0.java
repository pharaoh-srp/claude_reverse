package defpackage;

import com.anthropic.claude.analytics.events.AppStartEvents$BootstrapExpiredCookie;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class wk0 implements w28 {
    public static final wk0 a;
    private static final SerialDescriptor descriptor;

    static {
        wk0 wk0Var = new wk0();
        a = wk0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("mobile.app_start.bootstrap.expired_cookie", wk0Var, 0);
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
            return new AppStartEvents$BootstrapExpiredCookie(0, vnfVar);
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
        AppStartEvents$BootstrapExpiredCookie appStartEvents$BootstrapExpiredCookie = (AppStartEvents$BootstrapExpiredCookie) obj;
        encoder.getClass();
        appStartEvents$BootstrapExpiredCookie.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        AppStartEvents$BootstrapExpiredCookie.write$Self$analytics(appStartEvents$BootstrapExpiredCookie, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
