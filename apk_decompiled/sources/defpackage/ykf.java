package defpackage;

import com.anthropic.claude.api.login.CodeConfiguration;
import com.anthropic.claude.api.login.SendMagicLinkResponse;
import com.anthropic.claude.api.login.b;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ykf implements w28 {
    public static final ykf a;
    private static final SerialDescriptor descriptor;

    static {
        ykf ykfVar = new ykf();
        a = ykfVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.api.login.SendMagicLinkResponse", ykfVar, 4);
        pluginGeneratedSerialDescriptor.j("fallback_code_configuration", true);
        pluginGeneratedSerialDescriptor.j("sent", false);
        pluginGeneratedSerialDescriptor.j("sso_url", true);
        pluginGeneratedSerialDescriptor.j("magic_link_intent_available", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        KSerializer kSerializerS = d4c.S(b.a);
        zt1 zt1Var = zt1.a;
        return new KSerializer[]{kSerializerS, zt1Var, d4c.S(srg.a), d4c.S(zt1Var)};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        boolean z = true;
        int i = 0;
        boolean zU = false;
        CodeConfiguration codeConfiguration = null;
        String str = null;
        Boolean bool = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                codeConfiguration = (CodeConfiguration) ud4VarC.m(serialDescriptor, 0, b.a, codeConfiguration);
                i |= 1;
            } else if (iX == 1) {
                zU = ud4VarC.u(serialDescriptor, 1);
                i |= 2;
            } else if (iX == 2) {
                str = (String) ud4VarC.m(serialDescriptor, 2, srg.a, str);
                i |= 4;
            } else {
                if (iX != 3) {
                    sz6.e(iX);
                    return null;
                }
                bool = (Boolean) ud4VarC.m(serialDescriptor, 3, zt1.a, bool);
                i |= 8;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new SendMagicLinkResponse(i, codeConfiguration, zU, str, bool, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        SendMagicLinkResponse sendMagicLinkResponse = (SendMagicLinkResponse) obj;
        encoder.getClass();
        sendMagicLinkResponse.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        SendMagicLinkResponse.write$Self$api(sendMagicLinkResponse, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
