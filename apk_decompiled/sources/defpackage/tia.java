package defpackage;

import com.anthropic.claude.analytics.events.LoginEvents$LoginClientErrorKind;
import com.anthropic.claude.analytics.events.LoginEvents$SignInWithAppleFailed;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class tia implements w28 {
    public static final tia a;
    private static final SerialDescriptor descriptor;

    static {
        tia tiaVar = new tia();
        a = tiaVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("mobile.login.apple.failed", tiaVar, 6);
        pluginGeneratedSerialDescriptor.j("error_code", true);
        pluginGeneratedSerialDescriptor.j("error_domain", true);
        pluginGeneratedSerialDescriptor.j("http_status", true);
        pluginGeneratedSerialDescriptor.j("server_error_type", true);
        pluginGeneratedSerialDescriptor.j("server_error_code", true);
        pluginGeneratedSerialDescriptor.j("client_error_kind", true);
        pluginGeneratedSerialDescriptor.k(new pi(24));
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        kw9[] kw9VarArr = LoginEvents$SignInWithAppleFailed.$childSerializers;
        e79 e79Var = e79.a;
        KSerializer kSerializerS = d4c.S(e79Var);
        srg srgVar = srg.a;
        return new KSerializer[]{kSerializerS, d4c.S(srgVar), d4c.S(e79Var), d4c.S(srgVar), d4c.S(srgVar), d4c.S((KSerializer) kw9VarArr[5].getValue())};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr = LoginEvents$SignInWithAppleFailed.$childSerializers;
        boolean z = true;
        int i = 0;
        Integer num = null;
        String str = null;
        Integer num2 = null;
        String str2 = null;
        String str3 = null;
        LoginEvents$LoginClientErrorKind loginEvents$LoginClientErrorKind = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            switch (iX) {
                case -1:
                    z = false;
                    break;
                case 0:
                    num = (Integer) ud4VarC.m(serialDescriptor, 0, e79.a, num);
                    i |= 1;
                    break;
                case 1:
                    str = (String) ud4VarC.m(serialDescriptor, 1, srg.a, str);
                    i |= 2;
                    break;
                case 2:
                    num2 = (Integer) ud4VarC.m(serialDescriptor, 2, e79.a, num2);
                    i |= 4;
                    break;
                case 3:
                    str2 = (String) ud4VarC.m(serialDescriptor, 3, srg.a, str2);
                    i |= 8;
                    break;
                case 4:
                    str3 = (String) ud4VarC.m(serialDescriptor, 4, srg.a, str3);
                    i |= 16;
                    break;
                case 5:
                    loginEvents$LoginClientErrorKind = (LoginEvents$LoginClientErrorKind) ud4VarC.m(serialDescriptor, 5, (s06) kw9VarArr[5].getValue(), loginEvents$LoginClientErrorKind);
                    i |= 32;
                    break;
                default:
                    sz6.e(iX);
                    return null;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new LoginEvents$SignInWithAppleFailed(i, num, str, num2, str2, str3, loginEvents$LoginClientErrorKind, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        LoginEvents$SignInWithAppleFailed loginEvents$SignInWithAppleFailed = (LoginEvents$SignInWithAppleFailed) obj;
        encoder.getClass();
        loginEvents$SignInWithAppleFailed.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        LoginEvents$SignInWithAppleFailed.write$Self$analytics(loginEvents$SignInWithAppleFailed, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
