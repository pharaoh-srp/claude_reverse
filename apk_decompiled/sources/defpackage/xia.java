package defpackage;

import com.anthropic.claude.analytics.events.LoginEvents$SignInWithAppleStarted;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class xia implements w28 {
    public static final xia a;
    private static final SerialDescriptor descriptor;

    static {
        xia xiaVar = new xia();
        a = xiaVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("mobile.login.apple.started", xiaVar, 0);
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
            return new LoginEvents$SignInWithAppleStarted(0, vnfVar);
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
        LoginEvents$SignInWithAppleStarted loginEvents$SignInWithAppleStarted = (LoginEvents$SignInWithAppleStarted) obj;
        encoder.getClass();
        loginEvents$SignInWithAppleStarted.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        LoginEvents$SignInWithAppleStarted.write$Self$analytics(loginEvents$SignInWithAppleStarted, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
