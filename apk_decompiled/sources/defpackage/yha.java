package defpackage;

import com.anthropic.claude.analytics.events.LoginEvents$EmailLoginSSOExternalBrowserOpened;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class yha implements w28 {
    public static final yha a;
    private static final SerialDescriptor descriptor;

    static {
        yha yhaVar = new yha();
        a = yhaVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("mobile.login.email.sso_external_browser_opened", yhaVar, 0);
        pluginGeneratedSerialDescriptor.k(new pi(24));
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
            return new LoginEvents$EmailLoginSSOExternalBrowserOpened(0, vnfVar);
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
        LoginEvents$EmailLoginSSOExternalBrowserOpened loginEvents$EmailLoginSSOExternalBrowserOpened = (LoginEvents$EmailLoginSSOExternalBrowserOpened) obj;
        encoder.getClass();
        loginEvents$EmailLoginSSOExternalBrowserOpened.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        LoginEvents$EmailLoginSSOExternalBrowserOpened.write$Self$analytics(loginEvents$EmailLoginSSOExternalBrowserOpened, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
