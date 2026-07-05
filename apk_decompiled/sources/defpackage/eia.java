package defpackage;

import com.anthropic.claude.analytics.events.LoginEvents$EmailLoginSSOVerificationError;
import com.anthropic.claude.analytics.events.LoginEvents$LoginClientErrorKind;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class eia implements w28 {
    public static final eia a;
    private static final SerialDescriptor descriptor;

    static {
        eia eiaVar = new eia();
        a = eiaVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("mobile.login.email.sso_verification_error", eiaVar, 4);
        pluginGeneratedSerialDescriptor.j("http_status", true);
        pluginGeneratedSerialDescriptor.j("server_error_type", true);
        pluginGeneratedSerialDescriptor.j("server_error_code", true);
        pluginGeneratedSerialDescriptor.j("client_error_kind", true);
        pluginGeneratedSerialDescriptor.k(new pi(24));
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        kw9[] kw9VarArr = LoginEvents$EmailLoginSSOVerificationError.$childSerializers;
        KSerializer kSerializerS = d4c.S(e79.a);
        srg srgVar = srg.a;
        return new KSerializer[]{kSerializerS, d4c.S(srgVar), d4c.S(srgVar), d4c.S((KSerializer) kw9VarArr[3].getValue())};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr = LoginEvents$EmailLoginSSOVerificationError.$childSerializers;
        boolean z = true;
        int i = 0;
        Integer num = null;
        String str = null;
        String str2 = null;
        LoginEvents$LoginClientErrorKind loginEvents$LoginClientErrorKind = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                num = (Integer) ud4VarC.m(serialDescriptor, 0, e79.a, num);
                i |= 1;
            } else if (iX == 1) {
                str = (String) ud4VarC.m(serialDescriptor, 1, srg.a, str);
                i |= 2;
            } else if (iX == 2) {
                str2 = (String) ud4VarC.m(serialDescriptor, 2, srg.a, str2);
                i |= 4;
            } else {
                if (iX != 3) {
                    sz6.e(iX);
                    return null;
                }
                loginEvents$LoginClientErrorKind = (LoginEvents$LoginClientErrorKind) ud4VarC.m(serialDescriptor, 3, (s06) kw9VarArr[3].getValue(), loginEvents$LoginClientErrorKind);
                i |= 8;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new LoginEvents$EmailLoginSSOVerificationError(i, num, str, str2, loginEvents$LoginClientErrorKind, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        LoginEvents$EmailLoginSSOVerificationError loginEvents$EmailLoginSSOVerificationError = (LoginEvents$EmailLoginSSOVerificationError) obj;
        encoder.getClass();
        loginEvents$EmailLoginSSOVerificationError.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        LoginEvents$EmailLoginSSOVerificationError.write$Self$analytics(loginEvents$EmailLoginSSOVerificationError, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
