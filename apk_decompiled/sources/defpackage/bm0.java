package defpackage;

import com.anthropic.claude.analytics.events.AppStorePromotionEvents$AppStorePromotionAction;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class bm0 implements w28 {
    public static final bm0 a;
    private static final SerialDescriptor descriptor;

    static {
        bm0 bm0Var = new bm0();
        a = bm0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("mobile_app_store_promotion_action", bm0Var, 2);
        pluginGeneratedSerialDescriptor.j("event_identifier", false);
        pluginGeneratedSerialDescriptor.j("action_type", false);
        pluginGeneratedSerialDescriptor.k(new pi(6));
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        srg srgVar = srg.a;
        return new KSerializer[]{srgVar, srgVar};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        vnf vnfVar = null;
        boolean z = true;
        int i = 0;
        String strV = null;
        String strV2 = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                strV = ud4VarC.v(serialDescriptor, 0);
                i |= 1;
            } else {
                if (iX != 1) {
                    sz6.e(iX);
                    return null;
                }
                strV2 = ud4VarC.v(serialDescriptor, 1);
                i |= 2;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new AppStorePromotionEvents$AppStorePromotionAction(i, strV, strV2, vnfVar);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        AppStorePromotionEvents$AppStorePromotionAction appStorePromotionEvents$AppStorePromotionAction = (AppStorePromotionEvents$AppStorePromotionAction) obj;
        encoder.getClass();
        appStorePromotionEvents$AppStorePromotionAction.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        AppStorePromotionEvents$AppStorePromotionAction.write$Self$analytics(appStorePromotionEvents$AppStorePromotionAction, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
