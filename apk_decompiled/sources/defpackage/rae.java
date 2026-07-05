package defpackage;

import com.anthropic.claude.analytics.events.ReferralEvents$GuestPassReferralUpsellShown;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class rae implements w28 {
    public static final rae a;
    private static final SerialDescriptor descriptor;

    static {
        rae raeVar = new rae();
        a = raeVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("claudeai.referral.guest_pass.upsell.shown", raeVar, 0);
        pluginGeneratedSerialDescriptor.k(new xmb(9));
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
            return new ReferralEvents$GuestPassReferralUpsellShown(0, vnfVar);
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
        ReferralEvents$GuestPassReferralUpsellShown referralEvents$GuestPassReferralUpsellShown = (ReferralEvents$GuestPassReferralUpsellShown) obj;
        encoder.getClass();
        referralEvents$GuestPassReferralUpsellShown.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        ReferralEvents$GuestPassReferralUpsellShown.write$Self$analytics(referralEvents$GuestPassReferralUpsellShown, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
