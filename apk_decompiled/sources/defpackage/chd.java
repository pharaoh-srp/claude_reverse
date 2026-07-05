package defpackage;

import com.anthropic.claude.analytics.events.ProUpsellEvents$TappedRestorePurchases;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class chd implements w28 {
    public static final chd a;
    private static final SerialDescriptor descriptor;

    static {
        chd chdVar = new chd();
        a = chdVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("mobile.iap.tapped_restore_purchases", chdVar, 0);
        pluginGeneratedSerialDescriptor.k(new xmb(5));
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
            return new ProUpsellEvents$TappedRestorePurchases(0, vnfVar);
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
        ProUpsellEvents$TappedRestorePurchases proUpsellEvents$TappedRestorePurchases = (ProUpsellEvents$TappedRestorePurchases) obj;
        encoder.getClass();
        proUpsellEvents$TappedRestorePurchases.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        ProUpsellEvents$TappedRestorePurchases.write$Self$analytics(proUpsellEvents$TappedRestorePurchases, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
