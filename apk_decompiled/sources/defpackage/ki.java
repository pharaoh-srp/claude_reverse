package defpackage;

import com.anthropic.claude.analytics.events.AgeSignalsEvents$AgeSignalsApiError;
import com.anthropic.claude.analytics.events.AgeSignalsEvents$AgeSignalsErrorType;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ki implements w28 {
    public static final ki a;
    private static final SerialDescriptor descriptor;

    static {
        ki kiVar = new ki();
        a = kiVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("mobile.age_signals.api_error", kiVar, 3);
        pluginGeneratedSerialDescriptor.j("error_code", false);
        pluginGeneratedSerialDescriptor.j("error_type", false);
        pluginGeneratedSerialDescriptor.j("attempt_number", false);
        pluginGeneratedSerialDescriptor.k(new pi(0));
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        kw9[] kw9VarArr = AgeSignalsEvents$AgeSignalsApiError.$childSerializers;
        e79 e79Var = e79.a;
        return new KSerializer[]{e79Var, kw9VarArr[1].getValue(), e79Var};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr = AgeSignalsEvents$AgeSignalsApiError.$childSerializers;
        boolean z = true;
        int i = 0;
        int iR = 0;
        int iR2 = 0;
        AgeSignalsEvents$AgeSignalsErrorType ageSignalsEvents$AgeSignalsErrorType = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                iR = ud4VarC.r(serialDescriptor, 0);
                i |= 1;
            } else if (iX == 1) {
                ageSignalsEvents$AgeSignalsErrorType = (AgeSignalsEvents$AgeSignalsErrorType) ud4VarC.l(serialDescriptor, 1, (s06) kw9VarArr[1].getValue(), ageSignalsEvents$AgeSignalsErrorType);
                i |= 2;
            } else {
                if (iX != 2) {
                    sz6.e(iX);
                    return null;
                }
                iR2 = ud4VarC.r(serialDescriptor, 2);
                i |= 4;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new AgeSignalsEvents$AgeSignalsApiError(i, iR, ageSignalsEvents$AgeSignalsErrorType, iR2, null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        AgeSignalsEvents$AgeSignalsApiError ageSignalsEvents$AgeSignalsApiError = (AgeSignalsEvents$AgeSignalsApiError) obj;
        encoder.getClass();
        ageSignalsEvents$AgeSignalsApiError.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        AgeSignalsEvents$AgeSignalsApiError.write$Self$analytics(ageSignalsEvents$AgeSignalsApiError, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
