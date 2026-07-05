package defpackage;

import com.anthropic.claude.analytics.events.ProUpsellEvents$PlayBillingCallFailed;
import com.anthropic.claude.analytics.events.ProUpsellEvents$StoreViewPurchaseErrorKind;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ngd implements w28 {
    public static final ngd a;
    private static final SerialDescriptor descriptor;

    static {
        ngd ngdVar = new ngd();
        a = ngdVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("claudeai.iap.play_billing.call_failed", ngdVar, 3);
        pluginGeneratedSerialDescriptor.j("call", true);
        pluginGeneratedSerialDescriptor.j("google_response_code", true);
        pluginGeneratedSerialDescriptor.j("error_kind", true);
        pluginGeneratedSerialDescriptor.k(new xmb(5));
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{d4c.S(srg.a), d4c.S(e79.a), d4c.S((KSerializer) ProUpsellEvents$PlayBillingCallFailed.$childSerializers[2].getValue())};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr = ProUpsellEvents$PlayBillingCallFailed.$childSerializers;
        boolean z = true;
        int i = 0;
        String str = null;
        Integer num = null;
        ProUpsellEvents$StoreViewPurchaseErrorKind proUpsellEvents$StoreViewPurchaseErrorKind = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                str = (String) ud4VarC.m(serialDescriptor, 0, srg.a, str);
                i |= 1;
            } else if (iX == 1) {
                num = (Integer) ud4VarC.m(serialDescriptor, 1, e79.a, num);
                i |= 2;
            } else {
                if (iX != 2) {
                    sz6.e(iX);
                    return null;
                }
                proUpsellEvents$StoreViewPurchaseErrorKind = (ProUpsellEvents$StoreViewPurchaseErrorKind) ud4VarC.m(serialDescriptor, 2, (s06) kw9VarArr[2].getValue(), proUpsellEvents$StoreViewPurchaseErrorKind);
                i |= 4;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new ProUpsellEvents$PlayBillingCallFailed(i, str, num, proUpsellEvents$StoreViewPurchaseErrorKind, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        ProUpsellEvents$PlayBillingCallFailed proUpsellEvents$PlayBillingCallFailed = (ProUpsellEvents$PlayBillingCallFailed) obj;
        encoder.getClass();
        proUpsellEvents$PlayBillingCallFailed.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        ProUpsellEvents$PlayBillingCallFailed.write$Self$analytics(proUpsellEvents$PlayBillingCallFailed, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
