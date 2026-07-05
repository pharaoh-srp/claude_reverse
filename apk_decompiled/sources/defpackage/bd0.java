package defpackage;

import com.anthropic.claude.analytics.events.AnonymousEvents$AccountCreationErrorSource;
import com.anthropic.claude.analytics.events.AnonymousEvents$AccountCreationFailed;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class bd0 implements w28 {
    public static final bd0 a;
    private static final SerialDescriptor descriptor;

    static {
        bd0 bd0Var = new bd0();
        a = bd0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("mobile.anonymous.account_creation.failed", bd0Var, 2);
        pluginGeneratedSerialDescriptor.j("error_source", false);
        pluginGeneratedSerialDescriptor.j("elapsed_time_ms", true);
        pluginGeneratedSerialDescriptor.k(new pi(4));
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{AnonymousEvents$AccountCreationFailed.$childSerializers[0].getValue(), d4c.S(xka.a)};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr = AnonymousEvents$AccountCreationFailed.$childSerializers;
        vnf vnfVar = null;
        boolean z = true;
        int i = 0;
        AnonymousEvents$AccountCreationErrorSource anonymousEvents$AccountCreationErrorSource = null;
        Long l = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                anonymousEvents$AccountCreationErrorSource = (AnonymousEvents$AccountCreationErrorSource) ud4VarC.l(serialDescriptor, 0, (s06) kw9VarArr[0].getValue(), anonymousEvents$AccountCreationErrorSource);
                i |= 1;
            } else {
                if (iX != 1) {
                    sz6.e(iX);
                    return null;
                }
                l = (Long) ud4VarC.m(serialDescriptor, 1, xka.a, l);
                i |= 2;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new AnonymousEvents$AccountCreationFailed(i, anonymousEvents$AccountCreationErrorSource, l, vnfVar);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        AnonymousEvents$AccountCreationFailed anonymousEvents$AccountCreationFailed = (AnonymousEvents$AccountCreationFailed) obj;
        encoder.getClass();
        anonymousEvents$AccountCreationFailed.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        AnonymousEvents$AccountCreationFailed.write$Self$analytics(anonymousEvents$AccountCreationFailed, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
