package defpackage;

import com.anthropic.claude.analytics.events.ConwayEvents$ConwayExtensionToggled;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class wt4 implements w28 {
    public static final wt4 a;
    private static final SerialDescriptor descriptor;

    static {
        wt4 wt4Var = new wt4();
        a = wt4Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("conway_extension_toggled", wt4Var, 2);
        pluginGeneratedSerialDescriptor.j("extension_name", false);
        pluginGeneratedSerialDescriptor.j("enabled", false);
        pluginGeneratedSerialDescriptor.k(new pi(17));
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{srg.a, zt1.a};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        vnf vnfVar = null;
        boolean z = true;
        int i = 0;
        boolean zU = false;
        String strV = null;
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
                zU = ud4VarC.u(serialDescriptor, 1);
                i |= 2;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new ConwayEvents$ConwayExtensionToggled(i, strV, zU, vnfVar);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        ConwayEvents$ConwayExtensionToggled conwayEvents$ConwayExtensionToggled = (ConwayEvents$ConwayExtensionToggled) obj;
        encoder.getClass();
        conwayEvents$ConwayExtensionToggled.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        ConwayEvents$ConwayExtensionToggled.write$Self$analytics(conwayEvents$ConwayExtensionToggled, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
