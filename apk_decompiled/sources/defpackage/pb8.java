package defpackage;

import com.anthropic.claude.analytics.events.GroveEvents$GroveLocation;
import com.anthropic.claude.analytics.events.GroveEvents$GrovePolicyToggled;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class pb8 implements w28 {
    public static final pb8 a;
    private static final SerialDescriptor descriptor;

    static {
        pb8 pb8Var = new pb8();
        a = pb8Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("grove_policy_toggled", pb8Var, 2);
        pluginGeneratedSerialDescriptor.j("state", false);
        pluginGeneratedSerialDescriptor.j("location", false);
        pluginGeneratedSerialDescriptor.k(new pi(22));
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{zt1.a, GroveEvents$GrovePolicyToggled.$childSerializers[1].getValue()};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr = GroveEvents$GrovePolicyToggled.$childSerializers;
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
                zU = ud4VarC.u(serialDescriptor, 0);
                i |= 1;
            } else {
                if (iX != 1) {
                    sz6.e(iX);
                    return null;
                }
                groveEvents$GroveLocation = (GroveEvents$GroveLocation) ud4VarC.l(serialDescriptor, 1, (s06) kw9VarArr[1].getValue(), groveEvents$GroveLocation);
                i |= 2;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new GroveEvents$GrovePolicyToggled(i, zU, groveEvents$GroveLocation, vnfVar);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        GroveEvents$GrovePolicyToggled groveEvents$GrovePolicyToggled = (GroveEvents$GrovePolicyToggled) obj;
        encoder.getClass();
        groveEvents$GrovePolicyToggled.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        GroveEvents$GrovePolicyToggled.write$Self$analytics(groveEvents$GrovePolicyToggled, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
