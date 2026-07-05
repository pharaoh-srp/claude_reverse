package defpackage;

import com.anthropic.claude.analytics.events.AppStartEvents$AppLaunchCompleted;
import com.anthropic.claude.analytics.events.AppStartEvents$AppLaunchDestination;
import com.anthropic.claude.analytics.events.AppStartEvents$AppLaunchStartType;
import com.anthropic.claude.analytics.events.DrawerEvents$DrawerItem;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class qk0 implements w28 {
    public static final qk0 a;
    private static final SerialDescriptor descriptor;

    static {
        qk0 qk0Var = new qk0();
        a = qk0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("mobile.app_start.launch_completed", qk0Var, 5);
        pluginGeneratedSerialDescriptor.j("start_type", false);
        pluginGeneratedSerialDescriptor.j("duration_ms", false);
        pluginGeneratedSerialDescriptor.j("app_on_create_ms", true);
        pluginGeneratedSerialDescriptor.j("destination", false);
        pluginGeneratedSerialDescriptor.j("initial_tab", true);
        pluginGeneratedSerialDescriptor.k(new gl0(0));
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        kw9[] kw9VarArr = AppStartEvents$AppLaunchCompleted.$childSerializers;
        xka xkaVar = xka.a;
        return new KSerializer[]{kw9VarArr[0].getValue(), xkaVar, d4c.S(xkaVar), kw9VarArr[3].getValue(), d4c.S((KSerializer) kw9VarArr[4].getValue())};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr = AppStartEvents$AppLaunchCompleted.$childSerializers;
        int i = 0;
        AppStartEvents$AppLaunchStartType appStartEvents$AppLaunchStartType = null;
        Long l = null;
        AppStartEvents$AppLaunchDestination appStartEvents$AppLaunchDestination = null;
        DrawerEvents$DrawerItem drawerEvents$DrawerItem = null;
        long j = 0;
        boolean z = true;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                appStartEvents$AppLaunchStartType = (AppStartEvents$AppLaunchStartType) ud4VarC.l(serialDescriptor, 0, (s06) kw9VarArr[0].getValue(), appStartEvents$AppLaunchStartType);
                i |= 1;
            } else if (iX == 1) {
                j = ud4VarC.j(serialDescriptor, 1);
                i |= 2;
            } else if (iX == 2) {
                l = (Long) ud4VarC.m(serialDescriptor, 2, xka.a, l);
                i |= 4;
            } else if (iX == 3) {
                appStartEvents$AppLaunchDestination = (AppStartEvents$AppLaunchDestination) ud4VarC.l(serialDescriptor, 3, (s06) kw9VarArr[3].getValue(), appStartEvents$AppLaunchDestination);
                i |= 8;
            } else {
                if (iX != 4) {
                    sz6.e(iX);
                    return null;
                }
                drawerEvents$DrawerItem = (DrawerEvents$DrawerItem) ud4VarC.m(serialDescriptor, 4, (s06) kw9VarArr[4].getValue(), drawerEvents$DrawerItem);
                i |= 16;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new AppStartEvents$AppLaunchCompleted(i, appStartEvents$AppLaunchStartType, j, l, appStartEvents$AppLaunchDestination, drawerEvents$DrawerItem, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        AppStartEvents$AppLaunchCompleted appStartEvents$AppLaunchCompleted = (AppStartEvents$AppLaunchCompleted) obj;
        encoder.getClass();
        appStartEvents$AppLaunchCompleted.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        AppStartEvents$AppLaunchCompleted.write$Self$analytics(appStartEvents$AppLaunchCompleted, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
