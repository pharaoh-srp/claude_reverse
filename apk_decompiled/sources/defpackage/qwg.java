package defpackage;

import com.anthropic.claude.analytics.events.SubscriptionSyncEvents$IapEntitlementSyncFailed;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class qwg implements w28 {
    public static final qwg a;
    private static final SerialDescriptor descriptor;

    static {
        qwg qwgVar = new qwg();
        a = qwgVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("mobile.iap.entitlement.sync_failed", qwgVar, 5);
        pluginGeneratedSerialDescriptor.j("apple_original_transaction_id", true);
        pluginGeneratedSerialDescriptor.j("apple_product_id", true);
        pluginGeneratedSerialDescriptor.j("apple_app_account_token", true);
        pluginGeneratedSerialDescriptor.j("error_message", true);
        pluginGeneratedSerialDescriptor.j("sync_version", true);
        pluginGeneratedSerialDescriptor.k(new xmb(16));
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        srg srgVar = srg.a;
        return new KSerializer[]{d4c.S(srgVar), d4c.S(srgVar), d4c.S(srgVar), d4c.S(srgVar), d4c.S(e79.a)};
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
        Integer num = null;
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
                str3 = (String) ud4VarC.m(serialDescriptor, 2, srg.a, str3);
                i |= 4;
            } else if (iX == 3) {
                str4 = (String) ud4VarC.m(serialDescriptor, 3, srg.a, str4);
                i |= 8;
            } else {
                if (iX != 4) {
                    sz6.e(iX);
                    return null;
                }
                num = (Integer) ud4VarC.m(serialDescriptor, 4, e79.a, num);
                i |= 16;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new SubscriptionSyncEvents$IapEntitlementSyncFailed(i, str, str2, str3, str4, num, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        SubscriptionSyncEvents$IapEntitlementSyncFailed subscriptionSyncEvents$IapEntitlementSyncFailed = (SubscriptionSyncEvents$IapEntitlementSyncFailed) obj;
        encoder.getClass();
        subscriptionSyncEvents$IapEntitlementSyncFailed.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        SubscriptionSyncEvents$IapEntitlementSyncFailed.write$Self$analytics(subscriptionSyncEvents$IapEntitlementSyncFailed, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
