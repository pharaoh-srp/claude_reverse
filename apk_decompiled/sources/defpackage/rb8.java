package defpackage;

import com.anthropic.claude.analytics.events.GroveEvents$GroveLocation;
import com.anthropic.claude.analytics.events.GroveEvents$GrovePolicyViewed;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class rb8 implements w28 {
    public static final rb8 a;
    private static final SerialDescriptor descriptor;

    static {
        rb8 rb8Var = new rb8();
        a = rb8Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("grove_policy_viewed", rb8Var, 2);
        pluginGeneratedSerialDescriptor.j("location", false);
        pluginGeneratedSerialDescriptor.j("dismissable", false);
        pluginGeneratedSerialDescriptor.k(new pi(22));
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{GroveEvents$GrovePolicyViewed.$childSerializers[0].getValue(), zt1.a};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr = GroveEvents$GrovePolicyViewed.$childSerializers;
        vnf vnfVar = null;
        boolean z = true;
        int i = 0;
        boolean zU = false;
        GroveEvents$GroveLocation groveEvents$GroveLocation = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                groveEvents$GroveLocation = (GroveEvents$GroveLocation) ud4VarC.l(serialDescriptor, 0, (s06) kw9VarArr[0].getValue(), groveEvents$GroveLocation);
                i |= 1;
            } else {
                if (iX != 1) {
                    sz6.e(iX);
                    return null;
                }
                zU = ud4VarC.u(serialDescriptor, 1);
                i |= 2;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new GroveEvents$GrovePolicyViewed(i, groveEvents$GroveLocation, zU, vnfVar);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        GroveEvents$GrovePolicyViewed groveEvents$GrovePolicyViewed = (GroveEvents$GrovePolicyViewed) obj;
        encoder.getClass();
        groveEvents$GrovePolicyViewed.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        GroveEvents$GrovePolicyViewed.write$Self$analytics(groveEvents$GrovePolicyViewed, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
