package defpackage;

import com.anthropic.claude.analytics.events.OnboardingEvents$DisclaimersStarted;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class gfc implements w28 {
    public static final gfc a;
    private static final SerialDescriptor descriptor;

    static {
        gfc gfcVar = new gfc();
        a = gfcVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("onboarding.disclaimers.started", gfcVar, 2);
        pluginGeneratedSerialDescriptor.j("surface", false);
        pluginGeneratedSerialDescriptor.j("version", false);
        pluginGeneratedSerialDescriptor.k(new xmb(3));
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{srg.a, e79.a};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        vnf vnfVar = null;
        boolean z = true;
        int i = 0;
        int iR = 0;
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
                iR = ud4VarC.r(serialDescriptor, 1);
                i |= 2;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new OnboardingEvents$DisclaimersStarted(i, strV, iR, vnfVar);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        OnboardingEvents$DisclaimersStarted onboardingEvents$DisclaimersStarted = (OnboardingEvents$DisclaimersStarted) obj;
        encoder.getClass();
        onboardingEvents$DisclaimersStarted.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        OnboardingEvents$DisclaimersStarted.write$Self$analytics(onboardingEvents$DisclaimersStarted, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
