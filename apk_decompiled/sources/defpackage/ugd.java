package defpackage;

import com.anthropic.claude.analytics.events.ProUpsellEvents$StoreViewPurchaseSuccess;
import com.pvporbit.freetype.FreeTypeConstants;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ugd implements w28 {
    public static final ugd a;
    private static final SerialDescriptor descriptor;

    static {
        ugd ugdVar = new ugd();
        a = ugdVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("mobile.iap.pro.store_view.purchase.success", ugdVar, 8);
        pluginGeneratedSerialDescriptor.j("apple_original_transaction_id", true);
        pluginGeneratedSerialDescriptor.j("apple_product_id", true);
        pluginGeneratedSerialDescriptor.j("apple_app_account_token", true);
        pluginGeneratedSerialDescriptor.j("apple_expiration_date", true);
        pluginGeneratedSerialDescriptor.j("apple_ownership_type", true);
        pluginGeneratedSerialDescriptor.j("apple_environment", true);
        pluginGeneratedSerialDescriptor.j("google_product_id", true);
        pluginGeneratedSerialDescriptor.j("google_base_plan_id", true);
        pluginGeneratedSerialDescriptor.k(new xmb(5));
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        srg srgVar = srg.a;
        return new KSerializer[]{d4c.S(srgVar), d4c.S(srgVar), d4c.S(srgVar), d4c.S(srgVar), d4c.S(srgVar), d4c.S(srgVar), d4c.S(srgVar), d4c.S(srgVar)};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        Object obj = null;
        boolean z = true;
        int i = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            switch (iX) {
                case -1:
                    z = false;
                    continue;
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
                case 6:
                    str7 = (String) ud4VarC.m(serialDescriptor, 6, srg.a, str7);
                    i |= 64;
                    break;
                case 7:
                    str8 = (String) ud4VarC.m(serialDescriptor, 7, srg.a, str8);
                    i |= FreeTypeConstants.FT_LOAD_PEDANTIC;
                    break;
                default:
                    sz6.e(iX);
                    return obj;
            }
            obj = null;
        }
        ud4VarC.b(serialDescriptor);
        return new ProUpsellEvents$StoreViewPurchaseSuccess(i, str, str2, str3, str4, str5, str6, str7, str8, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        ProUpsellEvents$StoreViewPurchaseSuccess proUpsellEvents$StoreViewPurchaseSuccess = (ProUpsellEvents$StoreViewPurchaseSuccess) obj;
        encoder.getClass();
        proUpsellEvents$StoreViewPurchaseSuccess.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        ProUpsellEvents$StoreViewPurchaseSuccess.write$Self$analytics(proUpsellEvents$StoreViewPurchaseSuccess, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
