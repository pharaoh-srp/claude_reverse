package defpackage;

import com.anthropic.claude.api.login.VerifyGoogleMobileRequest;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class bti implements w28 {
    public static final bti a;
    private static final SerialDescriptor descriptor;

    static {
        bti btiVar = new bti();
        a = btiVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.api.login.VerifyGoogleMobileRequest", btiVar, 7);
        pluginGeneratedSerialDescriptor.j("token", false);
        pluginGeneratedSerialDescriptor.j("join_token", true);
        pluginGeneratedSerialDescriptor.j("login_token", true);
        pluginGeneratedSerialDescriptor.j("recaptcha_token", false);
        pluginGeneratedSerialDescriptor.j("recaptcha_site_key", false);
        pluginGeneratedSerialDescriptor.j("play_integrity_token", false);
        pluginGeneratedSerialDescriptor.j("source", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        srg srgVar = srg.a;
        return new KSerializer[]{srgVar, d4c.S(srgVar), d4c.S(srgVar), srgVar, srgVar, d4c.S(srgVar), srgVar};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        boolean z = true;
        int i = 0;
        String strV = null;
        String str = null;
        String str2 = null;
        String strV2 = null;
        String strV3 = null;
        String str3 = null;
        String strV4 = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            switch (iX) {
                case -1:
                    z = false;
                    break;
                case 0:
                    strV = ud4VarC.v(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    str = (String) ud4VarC.m(serialDescriptor, 1, srg.a, str);
                    i |= 2;
                    break;
                case 2:
                    str2 = (String) ud4VarC.m(serialDescriptor, 2, srg.a, str2);
                    i |= 4;
                    break;
                case 3:
                    strV2 = ud4VarC.v(serialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    strV3 = ud4VarC.v(serialDescriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    str3 = (String) ud4VarC.m(serialDescriptor, 5, srg.a, str3);
                    i |= 32;
                    break;
                case 6:
                    strV4 = ud4VarC.v(serialDescriptor, 6);
                    i |= 64;
                    break;
                default:
                    sz6.e(iX);
                    return null;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new VerifyGoogleMobileRequest(i, strV, str, str2, strV2, strV3, str3, strV4, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        VerifyGoogleMobileRequest verifyGoogleMobileRequest = (VerifyGoogleMobileRequest) obj;
        encoder.getClass();
        verifyGoogleMobileRequest.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        VerifyGoogleMobileRequest.write$Self$api(verifyGoogleMobileRequest, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
