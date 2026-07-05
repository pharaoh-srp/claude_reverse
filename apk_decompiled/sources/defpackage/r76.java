package defpackage;

import com.anthropic.claude.analytics.events.DispatchEvents$StarterIntroViewed;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class r76 implements w28 {
    public static final r76 a;
    private static final SerialDescriptor descriptor;

    static {
        r76 r76Var = new r76();
        a = r76Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("dispatch.starter_intro.viewed", r76Var, 0);
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
            return new DispatchEvents$StarterIntroViewed(0, vnfVar);
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
        DispatchEvents$StarterIntroViewed dispatchEvents$StarterIntroViewed = (DispatchEvents$StarterIntroViewed) obj;
        encoder.getClass();
        dispatchEvents$StarterIntroViewed.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        DispatchEvents$StarterIntroViewed.write$Self$analytics(dispatchEvents$StarterIntroViewed, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
