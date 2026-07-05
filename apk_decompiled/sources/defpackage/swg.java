package defpackage;

import com.anthropic.claude.analytics.events.SubscriptionSyncEvents$IapEntitlementSynced;
import com.pvporbit.freetype.FreeTypeConstants;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class swg implements w28 {
    public static final swg a;
    private static final SerialDescriptor descriptor;

    static {
        swg swgVar = new swg();
        a = swgVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("mobile.iap.entitlement.synced", swgVar, 9);
        pluginGeneratedSerialDescriptor.j("apple_original_transaction_id", true);
        pluginGeneratedSerialDescriptor.j("apple_product_id", true);
        pluginGeneratedSerialDescriptor.j("apple_app_account_token", true);
        pluginGeneratedSerialDescriptor.j("sync_version", true);
        pluginGeneratedSerialDescriptor.j("apple_expiration_date", true);
        pluginGeneratedSerialDescriptor.j("apple_revocation_date", true);
        pluginGeneratedSerialDescriptor.j("apple_ownership_type", true);
        pluginGeneratedSerialDescriptor.j("apple_environment", true);
        pluginGeneratedSerialDescriptor.j("is_unfinished", true);
        pluginGeneratedSerialDescriptor.k(new xmb(16));
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        srg srgVar = srg.a;
        return new KSerializer[]{d4c.S(srgVar), d4c.S(srgVar), d4c.S(srgVar), d4c.S(e79.a), d4c.S(srgVar), d4c.S(srgVar), d4c.S(srgVar), d4c.S(srgVar), d4c.S(zt1.a)};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        Object obj = null;
        boolean z = true;
        Boolean bool = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        Integer num = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        int i = 0;
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
                    num = (Integer) ud4VarC.m(serialDescriptor, 3, e79.a, num);
                    i |= 8;
                    break;
                case 4:
                    str4 = (String) ud4VarC.m(serialDescriptor, 4, srg.a, str4);
                    i |= 16;
                    break;
                case 5:
                    str5 = (String) ud4VarC.m(serialDescriptor, 5, srg.a, str5);
                    i |= 32;
                    break;
                case 6:
                    str6 = (String) ud4VarC.m(serialDescriptor, 6, srg.a, str6);
                    i |= 64;
                    break;
                case 7:
                    str7 = (String) ud4VarC.m(serialDescriptor, 7, srg.a, str7);
                    i |= FreeTypeConstants.FT_LOAD_PEDANTIC;
                    break;
                case 8:
                    bool = (Boolean) ud4VarC.m(serialDescriptor, 8, zt1.a, bool);
                    i |= FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING;
                    break;
                default:
                    sz6.e(iX);
                    return obj;
            }
            obj = null;
        }
        ud4VarC.b(serialDescriptor);
        return new SubscriptionSyncEvents$IapEntitlementSynced(i, str, str2, str3, num, str4, str5, str6, str7, bool, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        SubscriptionSyncEvents$IapEntitlementSynced subscriptionSyncEvents$IapEntitlementSynced = (SubscriptionSyncEvents$IapEntitlementSynced) obj;
        encoder.getClass();
        subscriptionSyncEvents$IapEntitlementSynced.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        SubscriptionSyncEvents$IapEntitlementSynced.write$Self$analytics(subscriptionSyncEvents$IapEntitlementSynced, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
