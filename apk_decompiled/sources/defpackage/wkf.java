package defpackage;

import com.anthropic.claude.api.login.SendMagicLinkRequest;
import com.anthropic.claude.types.strings.EmailAddress;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class wkf implements w28 {
    public static final wkf a;
    private static final SerialDescriptor descriptor;

    static {
        wkf wkfVar = new wkf();
        a = wkfVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.api.login.SendMagicLinkRequest", wkfVar, 7);
        pluginGeneratedSerialDescriptor.j("email_address", false);
        pluginGeneratedSerialDescriptor.j("recaptcha_token", true);
        pluginGeneratedSerialDescriptor.j("recaptcha_site_key", true);
        pluginGeneratedSerialDescriptor.j("utc_offset", false);
        pluginGeneratedSerialDescriptor.j("source", true);
        pluginGeneratedSerialDescriptor.j("client", true);
        pluginGeneratedSerialDescriptor.j("login_intent", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        srg srgVar = srg.a;
        return new KSerializer[]{ok6.a, srgVar, srgVar, e79.a, srgVar, srgVar, d4c.S(srgVar)};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        boolean z = true;
        int i = 0;
        int iR = 0;
        String strM1013unboximpl = null;
        String strV = null;
        String strV2 = null;
        String strV3 = null;
        String strV4 = null;
        String str = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            switch (iX) {
                case -1:
                    z = false;
                    break;
                case 0:
                    EmailAddress emailAddress = (EmailAddress) ud4VarC.l(serialDescriptor, 0, ok6.a, strM1013unboximpl != null ? EmailAddress.m1006boximpl(strM1013unboximpl) : null);
                    strM1013unboximpl = emailAddress != null ? emailAddress.m1013unboximpl() : null;
                    i |= 1;
                    break;
                case 1:
                    strV = ud4VarC.v(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    strV2 = ud4VarC.v(serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    iR = ud4VarC.r(serialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    strV3 = ud4VarC.v(serialDescriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    strV4 = ud4VarC.v(serialDescriptor, 5);
                    i |= 32;
                    break;
                case 6:
                    str = (String) ud4VarC.m(serialDescriptor, 6, srg.a, str);
                    i |= 64;
                    break;
                default:
                    sz6.e(iX);
                    return null;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new SendMagicLinkRequest(i, strM1013unboximpl, strV, strV2, iR, strV3, strV4, str, null, null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        SendMagicLinkRequest sendMagicLinkRequest = (SendMagicLinkRequest) obj;
        encoder.getClass();
        sendMagicLinkRequest.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        SendMagicLinkRequest.write$Self$api(sendMagicLinkRequest, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
