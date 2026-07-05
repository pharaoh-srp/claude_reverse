package defpackage;

import com.anthropic.claude.analytics.events.AppStartEvents$DeviceClockSkew;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class el0 implements w28 {
    public static final el0 a;
    private static final SerialDescriptor descriptor;

    static {
        el0 el0Var = new el0();
        a = el0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("mobile.app_start.device_clock_skew", el0Var, 2);
        pluginGeneratedSerialDescriptor.j("offset_ms", false);
        pluginGeneratedSerialDescriptor.j("round_trip_ms", false);
        pluginGeneratedSerialDescriptor.k(new gl0(0));
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        xka xkaVar = xka.a;
        return new KSerializer[]{xkaVar, xkaVar};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        int i = 0;
        long j = 0;
        long j2 = 0;
        boolean z = true;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                j = ud4VarC.j(serialDescriptor, 0);
                i |= 1;
            } else {
                if (iX != 1) {
                    sz6.e(iX);
                    return null;
                }
                j2 = ud4VarC.j(serialDescriptor, 1);
                i |= 2;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new AppStartEvents$DeviceClockSkew(i, j, j2, null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        AppStartEvents$DeviceClockSkew appStartEvents$DeviceClockSkew = (AppStartEvents$DeviceClockSkew) obj;
        encoder.getClass();
        appStartEvents$DeviceClockSkew.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        AppStartEvents$DeviceClockSkew.write$Self$analytics(appStartEvents$DeviceClockSkew, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
