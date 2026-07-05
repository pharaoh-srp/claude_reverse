package defpackage;

import com.anthropic.claude.analytics.events.AnonymousEvents$AccountCreationSucceeded;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class dd0 implements w28 {
    public static final dd0 a;
    private static final SerialDescriptor descriptor;

    static {
        dd0 dd0Var = new dd0();
        a = dd0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("mobile.anonymous.account_creation.succeeded", dd0Var, 1);
        pluginGeneratedSerialDescriptor.j("elapsed_time_ms", true);
        pluginGeneratedSerialDescriptor.k(new pi(4));
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{d4c.S(xka.a)};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        vnf vnfVar = null;
        boolean z = true;
        int i = 0;
        Long l = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else {
                if (iX != 0) {
                    sz6.e(iX);
                    return null;
                }
                l = (Long) ud4VarC.m(serialDescriptor, 0, xka.a, l);
                i = 1;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new AnonymousEvents$AccountCreationSucceeded(i, l, vnfVar);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        AnonymousEvents$AccountCreationSucceeded anonymousEvents$AccountCreationSucceeded = (AnonymousEvents$AccountCreationSucceeded) obj;
        encoder.getClass();
        anonymousEvents$AccountCreationSucceeded.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        AnonymousEvents$AccountCreationSucceeded.write$Self$analytics(anonymousEvents$AccountCreationSucceeded, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
