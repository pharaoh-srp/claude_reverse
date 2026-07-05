package defpackage;

import com.anthropic.claude.analytics.events.ProUpsellEvents$StoreViewRecordPurchaseError;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class wgd implements w28 {
    public static final wgd a;
    private static final SerialDescriptor descriptor;

    static {
        wgd wgdVar = new wgd();
        a = wgdVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("mobile.iap.pro.store_view.record_purchase.error", wgdVar, 6);
        pluginGeneratedSerialDescriptor.j("apple_original_transaction_id", true);
        pluginGeneratedSerialDescriptor.j("apple_product_id", true);
        pluginGeneratedSerialDescriptor.j("apple_app_account_token", true);
        pluginGeneratedSerialDescriptor.j("error_message", true);
        pluginGeneratedSerialDescriptor.j("google_product_id", true);
        pluginGeneratedSerialDescriptor.j("google_base_plan_id", true);
        pluginGeneratedSerialDescriptor.k(new xmb(5));
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        srg srgVar = srg.a;
        return new KSerializer[]{d4c.S(srgVar), d4c.S(srgVar), d4c.S(srgVar), d4c.S(srgVar), d4c.S(srgVar), d4c.S(srgVar)};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        boolean z = true;
        int i = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            switch (iX) {
                case -1:
                    z = false;
                    break;
                case 0:
                    str = (String) ud4VarC.m(serialDescriptor, 0, srg.a, str);
                    i |= 1;
                    break;
                case 1:
                    str2 = (String) ud4VarC.m(serialDescriptor, 1, srg.a, str2);
                    i |= 2;
                    break;
                case 2:
                    str3 = (String) ud4VarC.m(serialDescriptor, 2, srg.a, str3);
                    i |= 4;
                    break;
                case 3:
                    str4 = (String) ud4VarC.m(serialDescriptor, 3, srg.a, str4);
                    i |= 8;
                    break;
                case 4:
                    str5 = (String) ud4VarC.m(serialDescriptor, 4, srg.a, str5);
                    i |= 16;
                    break;
                case 5:
                    str6 = (String) ud4VarC.m(serialDescriptor, 5, srg.a, str6);
                    i |= 32;
                    break;
                default:
                    sz6.e(iX);
                    return null;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new ProUpsellEvents$StoreViewRecordPurchaseError(i, str, str2, str3, str4, str5, str6, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        ProUpsellEvents$StoreViewRecordPurchaseError proUpsellEvents$StoreViewRecordPurchaseError = (ProUpsellEvents$StoreViewRecordPurchaseError) obj;
        encoder.getClass();
        proUpsellEvents$StoreViewRecordPurchaseError.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        ProUpsellEvents$StoreViewRecordPurchaseError.write$Self$analytics(proUpsellEvents$StoreViewRecordPurchaseError, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
