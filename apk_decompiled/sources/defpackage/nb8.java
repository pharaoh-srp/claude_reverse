package defpackage;

import com.anthropic.claude.analytics.events.GroveEvents$GrovePolicySubmitted;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class nb8 implements w28 {
    public static final nb8 a;
    private static final SerialDescriptor descriptor;

    static {
        nb8 nb8Var = new nb8();
        a = nb8Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("grove_policy_submitted", nb8Var, 2);
        pluginGeneratedSerialDescriptor.j("state", false);
        pluginGeneratedSerialDescriptor.j("dismissable", false);
        pluginGeneratedSerialDescriptor.k(new pi(22));
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        zt1 zt1Var = zt1.a;
        return new KSerializer[]{zt1Var, zt1Var};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        boolean z = true;
        int i = 0;
        boolean zU = false;
        boolean zU2 = false;
        while (true) {
            vnf vnfVar = null;
            if (!z) {
                ud4VarC.b(serialDescriptor);
                return new GroveEvents$GrovePolicySubmitted(i, zU, zU2, vnfVar);
            }
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                zU = ud4VarC.u(serialDescriptor, 0);
                i |= 1;
            } else {
                if (iX != 1) {
                    sz6.e(iX);
                    return null;
                }
                zU2 = ud4VarC.u(serialDescriptor, 1);
                i |= 2;
            }
        }
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        GroveEvents$GrovePolicySubmitted groveEvents$GrovePolicySubmitted = (GroveEvents$GrovePolicySubmitted) obj;
        encoder.getClass();
        groveEvents$GrovePolicySubmitted.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        GroveEvents$GrovePolicySubmitted.write$Self$analytics(groveEvents$GrovePolicySubmitted, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
