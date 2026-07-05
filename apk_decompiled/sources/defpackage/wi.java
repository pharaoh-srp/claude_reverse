package defpackage;

import com.anthropic.claude.analytics.events.AgeSignalsEvents$AgeSignalsBlockingPoint;
import com.anthropic.claude.analytics.events.AgeSignalsEvents$AgeSignalsUserBlocked;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class wi implements w28 {
    public static final wi a;
    private static final SerialDescriptor descriptor;

    static {
        wi wiVar = new wi();
        a = wiVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("mobile.age_signals.user_blocked", wiVar, 2);
        pluginGeneratedSerialDescriptor.j("blocking_point", false);
        pluginGeneratedSerialDescriptor.j("is_debug_override", false);
        pluginGeneratedSerialDescriptor.k(new pi(0));
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{AgeSignalsEvents$AgeSignalsUserBlocked.$childSerializers[0].getValue(), zt1.a};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr = AgeSignalsEvents$AgeSignalsUserBlocked.$childSerializers;
        vnf vnfVar = null;
        boolean z = true;
        int i = 0;
        boolean zU = false;
        AgeSignalsEvents$AgeSignalsBlockingPoint ageSignalsEvents$AgeSignalsBlockingPoint = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                ageSignalsEvents$AgeSignalsBlockingPoint = (AgeSignalsEvents$AgeSignalsBlockingPoint) ud4VarC.l(serialDescriptor, 0, (s06) kw9VarArr[0].getValue(), ageSignalsEvents$AgeSignalsBlockingPoint);
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
        return new AgeSignalsEvents$AgeSignalsUserBlocked(i, ageSignalsEvents$AgeSignalsBlockingPoint, zU, vnfVar);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        AgeSignalsEvents$AgeSignalsUserBlocked ageSignalsEvents$AgeSignalsUserBlocked = (AgeSignalsEvents$AgeSignalsUserBlocked) obj;
        encoder.getClass();
        ageSignalsEvents$AgeSignalsUserBlocked.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        AgeSignalsEvents$AgeSignalsUserBlocked.write$Self$analytics(ageSignalsEvents$AgeSignalsUserBlocked, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
