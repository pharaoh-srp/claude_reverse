package defpackage;

import com.anthropic.claude.analytics.events.AnonymousEvents$UserSessionLoadFailed;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ld0 implements w28 {
    public static final ld0 a;
    private static final SerialDescriptor descriptor;

    static {
        ld0 ld0Var = new ld0();
        a = ld0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("mobile.anonymous.user_session_load_failed", ld0Var, 0);
        pluginGeneratedSerialDescriptor.k(new pi(4));
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
            return new AnonymousEvents$UserSessionLoadFailed(0, vnfVar);
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
        AnonymousEvents$UserSessionLoadFailed anonymousEvents$UserSessionLoadFailed = (AnonymousEvents$UserSessionLoadFailed) obj;
        encoder.getClass();
        anonymousEvents$UserSessionLoadFailed.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        AnonymousEvents$UserSessionLoadFailed.write$Self$analytics(anonymousEvents$UserSessionLoadFailed, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
