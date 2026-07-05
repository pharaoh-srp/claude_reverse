package defpackage;

import com.anthropic.claude.api.login.CodeConfiguration;
import com.anthropic.claude.api.login.a;
import com.anthropic.claude.login.MagicLinkSentConfig;
import com.anthropic.claude.types.strings.EmailAddress;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class moa implements w28 {
    public static final moa a;
    private static final SerialDescriptor descriptor;

    static {
        moa moaVar = new moa();
        a = moaVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.login.MagicLinkSentConfig", moaVar, 4);
        pluginGeneratedSerialDescriptor.j("email", false);
        pluginGeneratedSerialDescriptor.j("codeLength", false);
        pluginGeneratedSerialDescriptor.j("codeCharset", false);
        pluginGeneratedSerialDescriptor.j("codeShowInputAfterDelay", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        e79 e79Var = e79.a;
        return new KSerializer[]{ok6.a, d4c.S(e79Var), d4c.S(a.d), d4c.S(e79Var)};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        boolean z = true;
        int i = 0;
        String strM1013unboximpl = null;
        Integer num = null;
        CodeConfiguration.CharSet charSet = null;
        Integer num2 = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                EmailAddress emailAddress = (EmailAddress) ud4VarC.l(serialDescriptor, 0, ok6.a, strM1013unboximpl != null ? EmailAddress.m1006boximpl(strM1013unboximpl) : null);
                strM1013unboximpl = emailAddress != null ? emailAddress.m1013unboximpl() : null;
                i |= 1;
            } else if (iX == 1) {
                num = (Integer) ud4VarC.m(serialDescriptor, 1, e79.a, num);
                i |= 2;
            } else if (iX == 2) {
                charSet = (CodeConfiguration.CharSet) ud4VarC.m(serialDescriptor, 2, a.d, charSet);
                i |= 4;
            } else {
                if (iX != 3) {
                    sz6.e(iX);
                    return null;
                }
                num2 = (Integer) ud4VarC.m(serialDescriptor, 3, e79.a, num2);
                i |= 8;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new MagicLinkSentConfig(i, strM1013unboximpl, num, charSet, num2, null, null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        MagicLinkSentConfig magicLinkSentConfig = (MagicLinkSentConfig) obj;
        encoder.getClass();
        magicLinkSentConfig.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        MagicLinkSentConfig.write$Self$app(magicLinkSentConfig, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
