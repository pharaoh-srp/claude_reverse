package defpackage;

import com.anthropic.claude.api.referral.ReferralEligibility;
import com.anthropic.claude.api.referral.ReferrerReward;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class hae implements w28 {
    public static final hae a;
    private static final SerialDescriptor descriptor;

    static {
        hae haeVar = new hae();
        a = haeVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.api.referral.ReferralEligibility", haeVar, 6);
        pluginGeneratedSerialDescriptor.j("eligible", false);
        pluginGeneratedSerialDescriptor.j("remaining_passes", true);
        pluginGeneratedSerialDescriptor.j("limit", true);
        pluginGeneratedSerialDescriptor.j("share_link", true);
        pluginGeneratedSerialDescriptor.j("terms_url", true);
        pluginGeneratedSerialDescriptor.j("referrer_reward", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        e79 e79Var = e79.a;
        KSerializer kSerializerS = d4c.S(e79Var);
        KSerializer kSerializerS2 = d4c.S(e79Var);
        srg srgVar = srg.a;
        return new KSerializer[]{zt1.a, kSerializerS, kSerializerS2, d4c.S(srgVar), d4c.S(srgVar), d4c.S(vae.a)};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        boolean z = true;
        int i = 0;
        boolean zU = false;
        Integer num = null;
        Integer num2 = null;
        String str = null;
        String str2 = null;
        ReferrerReward referrerReward = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            switch (iX) {
                case -1:
                    z = false;
                    break;
                case 0:
                    zU = ud4VarC.u(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    num = (Integer) ud4VarC.m(serialDescriptor, 1, e79.a, num);
                    i |= 2;
                    break;
                case 2:
                    num2 = (Integer) ud4VarC.m(serialDescriptor, 2, e79.a, num2);
                    i |= 4;
                    break;
                case 3:
                    str = (String) ud4VarC.m(serialDescriptor, 3, srg.a, str);
                    i |= 8;
                    break;
                case 4:
                    str2 = (String) ud4VarC.m(serialDescriptor, 4, srg.a, str2);
                    i |= 16;
                    break;
                case 5:
                    referrerReward = (ReferrerReward) ud4VarC.m(serialDescriptor, 5, vae.a, referrerReward);
                    i |= 32;
                    break;
                default:
                    sz6.e(iX);
                    return null;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new ReferralEligibility(i, zU, num, num2, str, str2, referrerReward, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        ReferralEligibility referralEligibility = (ReferralEligibility) obj;
        encoder.getClass();
        referralEligibility.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        ReferralEligibility.write$Self$api(referralEligibility, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
