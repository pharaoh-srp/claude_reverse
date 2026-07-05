package defpackage;

import com.anthropic.claude.analytics.events.ProUpsellEvents$StoreViewPurchaseError;
import com.anthropic.claude.analytics.events.ProUpsellEvents$StoreViewPurchaseErrorKind;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class rgd implements w28 {
    public static final rgd a;
    private static final SerialDescriptor descriptor;

    static {
        rgd rgdVar = new rgd();
        a = rgdVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("mobile.iap.pro.store_view.purchase.error", rgdVar, 5);
        pluginGeneratedSerialDescriptor.j("apple_product_id", true);
        pluginGeneratedSerialDescriptor.j("error_message", true);
        pluginGeneratedSerialDescriptor.j("error_kind", true);
        pluginGeneratedSerialDescriptor.j("google_product_id", true);
        pluginGeneratedSerialDescriptor.j("google_base_plan_id", true);
        pluginGeneratedSerialDescriptor.k(new xmb(5));
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        kw9[] kw9VarArr = ProUpsellEvents$StoreViewPurchaseError.$childSerializers;
        srg srgVar = srg.a;
        return new KSerializer[]{d4c.S(srgVar), d4c.S(srgVar), d4c.S((KSerializer) kw9VarArr[2].getValue()), d4c.S(srgVar), d4c.S(srgVar)};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr = ProUpsellEvents$StoreViewPurchaseError.$childSerializers;
        boolean z = true;
        int i = 0;
        String str = null;
        String str2 = null;
        ProUpsellEvents$StoreViewPurchaseErrorKind proUpsellEvents$StoreViewPurchaseErrorKind = null;
        String str3 = null;
        String str4 = null;
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
            } else if (iX == 3) {
                str3 = (String) ud4VarC.m(serialDescriptor, 3, srg.a, str3);
                i |= 8;
            } else {
                if (iX != 4) {
                    sz6.e(iX);
                    return null;
                }
                str4 = (String) ud4VarC.m(serialDescriptor, 4, srg.a, str4);
                i |= 16;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new ProUpsellEvents$StoreViewPurchaseError(i, str, str2, proUpsellEvents$StoreViewPurchaseErrorKind, str3, str4, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        ProUpsellEvents$StoreViewPurchaseError proUpsellEvents$StoreViewPurchaseError = (ProUpsellEvents$StoreViewPurchaseError) obj;
        encoder.getClass();
        proUpsellEvents$StoreViewPurchaseError.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        ProUpsellEvents$StoreViewPurchaseError.write$Self$analytics(proUpsellEvents$StoreViewPurchaseError, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
