package defpackage;

import com.anthropic.claude.analytics.events.AgeSignalsEvents$AgeSignalsCheckCompleted;
import com.anthropic.claude.analytics.events.AgeSignalsEvents$AgeSignalsResult;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ni implements w28 {
    public static final ni a;
    private static final SerialDescriptor descriptor;

    static {
        ni niVar = new ni();
        a = niVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("mobile.age_signals.check_completed", niVar, 4);
        pluginGeneratedSerialDescriptor.j("result", false);
        pluginGeneratedSerialDescriptor.j("attempt_count", false);
        pluginGeneratedSerialDescriptor.j("duration_ms", false);
        pluginGeneratedSerialDescriptor.j("is_debug_override", false);
        pluginGeneratedSerialDescriptor.k(new pi(0));
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{AgeSignalsEvents$AgeSignalsCheckCompleted.$childSerializers[0].getValue(), e79.a, xka.a, zt1.a};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr = AgeSignalsEvents$AgeSignalsCheckCompleted.$childSerializers;
        int i = 0;
        int iR = 0;
        boolean zU = false;
        AgeSignalsEvents$AgeSignalsResult ageSignalsEvents$AgeSignalsResult = null;
        long j = 0;
        boolean z = true;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                ageSignalsEvents$AgeSignalsResult = (AgeSignalsEvents$AgeSignalsResult) ud4VarC.l(serialDescriptor, 0, (s06) kw9VarArr[0].getValue(), ageSignalsEvents$AgeSignalsResult);
                i |= 1;
            } else if (iX == 1) {
                iR = ud4VarC.r(serialDescriptor, 1);
                i |= 2;
            } else if (iX == 2) {
                j = ud4VarC.j(serialDescriptor, 2);
                i |= 4;
            } else {
                if (iX != 3) {
                    sz6.e(iX);
                    return null;
                }
                zU = ud4VarC.u(serialDescriptor, 3);
                i |= 8;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new AgeSignalsEvents$AgeSignalsCheckCompleted(i, ageSignalsEvents$AgeSignalsResult, iR, j, zU, null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        AgeSignalsEvents$AgeSignalsCheckCompleted ageSignalsEvents$AgeSignalsCheckCompleted = (AgeSignalsEvents$AgeSignalsCheckCompleted) obj;
        encoder.getClass();
        ageSignalsEvents$AgeSignalsCheckCompleted.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        AgeSignalsEvents$AgeSignalsCheckCompleted.write$Self$analytics(ageSignalsEvents$AgeSignalsCheckCompleted, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
