package defpackage;

import com.anthropic.claude.analytics.events.AppStartEvents$BootstrapNoCookie;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class yk0 implements w28 {
    public static final yk0 a;
    private static final SerialDescriptor descriptor;

    static {
        yk0 yk0Var = new yk0();
        a = yk0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("mobile.app_start.bootstrap.no_cookie", yk0Var, 0);
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
            return new AppStartEvents$BootstrapNoCookie(0, vnfVar);
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
        AppStartEvents$BootstrapNoCookie appStartEvents$BootstrapNoCookie = (AppStartEvents$BootstrapNoCookie) obj;
        encoder.getClass();
        appStartEvents$BootstrapNoCookie.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        AppStartEvents$BootstrapNoCookie.write$Self$analytics(appStartEvents$BootstrapNoCookie, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
