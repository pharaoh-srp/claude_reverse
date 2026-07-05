package defpackage;

import com.anthropic.claude.analytics.events.UsageCreditsEvents$CreditPackPurchaseInitiated;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class nli implements w28 {
    public static final nli a;
    private static final SerialDescriptor descriptor;

    static {
        nli nliVar = new nli();
        a = nliVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("credit_pack_purchase_initiated", nliVar, 2);
        pluginGeneratedSerialDescriptor.j("apple_product_id", true);
        pluginGeneratedSerialDescriptor.j("google_product_id", true);
        pluginGeneratedSerialDescriptor.k(new xmb(19));
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        srg srgVar = srg.a;
        return new KSerializer[]{d4c.S(srgVar), d4c.S(srgVar)};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        vnf vnfVar = null;
        boolean z = true;
        int i = 0;
        String str = null;
        String str2 = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                str = (String) ud4VarC.m(serialDescriptor, 0, srg.a, str);
                i |= 1;
            } else {
                if (iX != 1) {
                    sz6.e(iX);
                    return null;
                }
                str2 = (String) ud4VarC.m(serialDescriptor, 1, srg.a, str2);
                i |= 2;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new UsageCreditsEvents$CreditPackPurchaseInitiated(i, str, str2, vnfVar);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        UsageCreditsEvents$CreditPackPurchaseInitiated usageCreditsEvents$CreditPackPurchaseInitiated = (UsageCreditsEvents$CreditPackPurchaseInitiated) obj;
        encoder.getClass();
        usageCreditsEvents$CreditPackPurchaseInitiated.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        UsageCreditsEvents$CreditPackPurchaseInitiated.write$Self$analytics(usageCreditsEvents$CreditPackPurchaseInitiated, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
