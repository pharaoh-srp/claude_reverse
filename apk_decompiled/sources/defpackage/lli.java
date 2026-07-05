package defpackage;

import com.anthropic.claude.analytics.events.ProUpsellEvents$StoreViewPurchaseErrorKind;
import com.anthropic.claude.analytics.events.UsageCreditsEvents$CreditPackPurchaseFailed;
import com.anthropic.claude.analytics.events.UsageCreditsEvents$CreditPackPurchaseStage;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class lli implements w28 {
    public static final lli a;
    private static final SerialDescriptor descriptor;

    static {
        lli lliVar = new lli();
        a = lliVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("credit_pack_purchase_failed", lliVar, 4);
        pluginGeneratedSerialDescriptor.j("apple_product_id", true);
        pluginGeneratedSerialDescriptor.j("google_product_id", true);
        pluginGeneratedSerialDescriptor.j("error_kind", true);
        pluginGeneratedSerialDescriptor.j("stage", true);
        pluginGeneratedSerialDescriptor.k(new xmb(19));
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        kw9[] kw9VarArr = UsageCreditsEvents$CreditPackPurchaseFailed.$childSerializers;
        srg srgVar = srg.a;
        return new KSerializer[]{d4c.S(srgVar), d4c.S(srgVar), d4c.S((KSerializer) kw9VarArr[2].getValue()), d4c.S((KSerializer) kw9VarArr[3].getValue())};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr = UsageCreditsEvents$CreditPackPurchaseFailed.$childSerializers;
        boolean z = true;
        int i = 0;
        String str = null;
        String str2 = null;
        ProUpsellEvents$StoreViewPurchaseErrorKind proUpsellEvents$StoreViewPurchaseErrorKind = null;
        UsageCreditsEvents$CreditPackPurchaseStage usageCreditsEvents$CreditPackPurchaseStage = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                str = (String) ud4VarC.m(serialDescriptor, 0, srg.a, str);
                i |= 1;
            } else if (iX == 1) {
                str2 = (String) ud4VarC.m(serialDescriptor, 1, srg.a, str2);
                i |= 2;
            } else if (iX == 2) {
                proUpsellEvents$StoreViewPurchaseErrorKind = (ProUpsellEvents$StoreViewPurchaseErrorKind) ud4VarC.m(serialDescriptor, 2, (s06) kw9VarArr[2].getValue(), proUpsellEvents$StoreViewPurchaseErrorKind);
                i |= 4;
            } else {
                if (iX != 3) {
                    sz6.e(iX);
                    return null;
                }
                usageCreditsEvents$CreditPackPurchaseStage = (UsageCreditsEvents$CreditPackPurchaseStage) ud4VarC.m(serialDescriptor, 3, (s06) kw9VarArr[3].getValue(), usageCreditsEvents$CreditPackPurchaseStage);
                i |= 8;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new UsageCreditsEvents$CreditPackPurchaseFailed(i, str, str2, proUpsellEvents$StoreViewPurchaseErrorKind, usageCreditsEvents$CreditPackPurchaseStage, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        UsageCreditsEvents$CreditPackPurchaseFailed usageCreditsEvents$CreditPackPurchaseFailed = (UsageCreditsEvents$CreditPackPurchaseFailed) obj;
        encoder.getClass();
        usageCreditsEvents$CreditPackPurchaseFailed.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        UsageCreditsEvents$CreditPackPurchaseFailed.write$Self$analytics(usageCreditsEvents$CreditPackPurchaseFailed, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
