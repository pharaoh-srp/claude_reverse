package defpackage;

import com.anthropic.claude.analytics.events.LoginEvents$EmailLoginSSOVerifyingCallback;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class gia implements w28 {
    public static final gia a;
    private static final SerialDescriptor descriptor;

    static {
        gia giaVar = new gia();
        a = giaVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("mobile.login.email.sso_verifying_callback", giaVar, 0);
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
            return new LoginEvents$EmailLoginSSOVerifyingCallback(0, vnfVar);
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
        LoginEvents$EmailLoginSSOVerifyingCallback loginEvents$EmailLoginSSOVerifyingCallback = (LoginEvents$EmailLoginSSOVerifyingCallback) obj;
        encoder.getClass();
        loginEvents$EmailLoginSSOVerifyingCallback.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        LoginEvents$EmailLoginSSOVerifyingCallback.write$Self$analytics(loginEvents$EmailLoginSSOVerifyingCallback, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
