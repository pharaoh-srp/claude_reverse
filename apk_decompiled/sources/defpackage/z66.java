package defpackage;

import com.anthropic.claude.analytics.events.DispatchEvents$OnboardingIntroViewed;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class z66 implements w28 {
    public static final z66 a;
    private static final SerialDescriptor descriptor;

    static {
        z66 z66Var = new z66();
        a = z66Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("dispatch.onboarding.intro.viewed", z66Var, 0);
        pluginGeneratedSerialDescriptor.k(new pi(18));
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
            return new DispatchEvents$OnboardingIntroViewed(0, vnfVar);
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
        DispatchEvents$OnboardingIntroViewed dispatchEvents$OnboardingIntroViewed = (DispatchEvents$OnboardingIntroViewed) obj;
        encoder.getClass();
        dispatchEvents$OnboardingIntroViewed.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        DispatchEvents$OnboardingIntroViewed.write$Self$analytics(dispatchEvents$OnboardingIntroViewed, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
