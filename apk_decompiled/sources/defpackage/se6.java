package defpackage;

import com.anthropic.claude.analytics.events.DrawerEvents$DrawerColdStartRestored;
import com.anthropic.claude.analytics.events.DrawerEvents$DrawerItem;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class se6 implements w28 {
    public static final se6 a;
    private static final SerialDescriptor descriptor;

    static {
        se6 se6Var = new se6();
        a = se6Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("mobile_drawer_cold_start_restored", se6Var, 1);
        pluginGeneratedSerialDescriptor.j("item", false);
        pluginGeneratedSerialDescriptor.k(new pi(19));
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{DrawerEvents$DrawerColdStartRestored.$childSerializers[0].getValue()};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr = DrawerEvents$DrawerColdStartRestored.$childSerializers;
        vnf vnfVar = null;
        boolean z = true;
        int i = 0;
        DrawerEvents$DrawerItem drawerEvents$DrawerItem = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else {
                if (iX != 0) {
                    sz6.e(iX);
                    return null;
                }
                drawerEvents$DrawerItem = (DrawerEvents$DrawerItem) ud4VarC.l(serialDescriptor, 0, (s06) kw9VarArr[0].getValue(), drawerEvents$DrawerItem);
                i = 1;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new DrawerEvents$DrawerColdStartRestored(i, drawerEvents$DrawerItem, vnfVar);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        DrawerEvents$DrawerColdStartRestored drawerEvents$DrawerColdStartRestored = (DrawerEvents$DrawerColdStartRestored) obj;
        encoder.getClass();
        drawerEvents$DrawerColdStartRestored.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        vd4VarC.r(serialDescriptor, 0, (znf) DrawerEvents$DrawerColdStartRestored.$childSerializers[0].getValue(), drawerEvents$DrawerColdStartRestored.item);
        vd4VarC.b(serialDescriptor);
    }
}
