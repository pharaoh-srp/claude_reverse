package defpackage;

import com.anthropic.claude.analytics.events.PushEvents$FailureCause;
import com.anthropic.claude.analytics.events.PushEvents$PushRegistrationFailure;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ryd implements w28 {
    public static final ryd a;
    private static final SerialDescriptor descriptor;

    static {
        ryd rydVar = new ryd();
        a = rydVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("mobile.push.registration_failure", rydVar, 3);
        pluginGeneratedSerialDescriptor.j("failure_cause", false);
        pluginGeneratedSerialDescriptor.j("http_error_code", true);
        pluginGeneratedSerialDescriptor.j("error_message", true);
        pluginGeneratedSerialDescriptor.k(new gl0(9));
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{PushEvents$PushRegistrationFailure.$childSerializers[0].getValue(), d4c.S(e79.a), d4c.S(srg.a)};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr = PushEvents$PushRegistrationFailure.$childSerializers;
        boolean z = true;
        int i = 0;
        PushEvents$FailureCause pushEvents$FailureCause = null;
        Integer num = null;
        String str = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                pushEvents$FailureCause = (PushEvents$FailureCause) ud4VarC.l(serialDescriptor, 0, (s06) kw9VarArr[0].getValue(), pushEvents$FailureCause);
                i |= 1;
            } else if (iX == 1) {
                num = (Integer) ud4VarC.m(serialDescriptor, 1, e79.a, num);
                i |= 2;
            } else {
                if (iX != 2) {
                    sz6.e(iX);
                    return null;
                }
                str = (String) ud4VarC.m(serialDescriptor, 2, srg.a, str);
                i |= 4;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new PushEvents$PushRegistrationFailure(i, pushEvents$FailureCause, num, str, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        PushEvents$PushRegistrationFailure pushEvents$PushRegistrationFailure = (PushEvents$PushRegistrationFailure) obj;
        encoder.getClass();
        pushEvents$PushRegistrationFailure.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        PushEvents$PushRegistrationFailure.write$Self$analytics(pushEvents$PushRegistrationFailure, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
