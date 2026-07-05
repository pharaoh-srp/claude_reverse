package defpackage;

import com.anthropic.claude.analytics.events.AgeSignalsEvents$AgeSignalsRetry;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ui implements w28 {
    public static final ui a;
    private static final SerialDescriptor descriptor;

    static {
        ui uiVar = new ui();
        a = uiVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("mobile.age_signals.retry", uiVar, 0);
        pluginGeneratedSerialDescriptor.k(new pi(0));
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        return new KSerializer[0];
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        int iX = ud4VarC.x(serialDescriptor);
        vnf vnfVar = null;
        if (iX == -1) {
            ud4VarC.b(serialDescriptor);
            return new AgeSignalsEvents$AgeSignalsRetry(0, vnfVar);
        }
        sz6.e(iX);
        return null;
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        AgeSignalsEvents$AgeSignalsRetry ageSignalsEvents$AgeSignalsRetry = (AgeSignalsEvents$AgeSignalsRetry) obj;
        encoder.getClass();
        ageSignalsEvents$AgeSignalsRetry.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        AgeSignalsEvents$AgeSignalsRetry.write$Self$analytics(ageSignalsEvents$AgeSignalsRetry, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
