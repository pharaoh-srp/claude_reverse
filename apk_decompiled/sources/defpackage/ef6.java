package defpackage;

import com.anthropic.claude.analytics.events.DrawerEvents$DrawerOpenSource;
import com.anthropic.claude.analytics.events.DrawerEvents$DrawerOpened;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ef6 implements w28 {
    public static final ef6 a;
    private static final SerialDescriptor descriptor;

    static {
        ef6 ef6Var = new ef6();
        a = ef6Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("claudeai.navigation.opened", ef6Var, 1);
        pluginGeneratedSerialDescriptor.j("source", false);
        pluginGeneratedSerialDescriptor.k(new pi(19));
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{DrawerEvents$DrawerOpened.$childSerializers[0].getValue()};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr = DrawerEvents$DrawerOpened.$childSerializers;
        vnf vnfVar = null;
        boolean z = true;
        int i = 0;
        DrawerEvents$DrawerOpenSource drawerEvents$DrawerOpenSource = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else {
                if (iX != 0) {
                    sz6.e(iX);
                    return null;
                }
                drawerEvents$DrawerOpenSource = (DrawerEvents$DrawerOpenSource) ud4VarC.l(serialDescriptor, 0, (s06) kw9VarArr[0].getValue(), drawerEvents$DrawerOpenSource);
                i = 1;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new DrawerEvents$DrawerOpened(i, drawerEvents$DrawerOpenSource, vnfVar);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        DrawerEvents$DrawerOpened drawerEvents$DrawerOpened = (DrawerEvents$DrawerOpened) obj;
        encoder.getClass();
        drawerEvents$DrawerOpened.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        vd4VarC.r(serialDescriptor, 0, (znf) DrawerEvents$DrawerOpened.$childSerializers[0].getValue(), drawerEvents$DrawerOpened.source);
        vd4VarC.b(serialDescriptor);
    }
}
