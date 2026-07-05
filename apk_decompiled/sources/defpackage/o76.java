package defpackage;

import com.anthropic.claude.analytics.events.DispatchEvents$StarterIntroCompleted;
import com.anthropic.claude.analytics.events.DispatchEvents$StarterIntroDismissReason;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class o76 implements w28 {
    public static final o76 a;
    private static final SerialDescriptor descriptor;

    static {
        o76 o76Var = new o76();
        a = o76Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("dispatch.starter_intro.completed", o76Var, 1);
        pluginGeneratedSerialDescriptor.j("reason", false);
        pluginGeneratedSerialDescriptor.k(new pi(18));
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{DispatchEvents$StarterIntroCompleted.$childSerializers[0].getValue()};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr = DispatchEvents$StarterIntroCompleted.$childSerializers;
        vnf vnfVar = null;
        boolean z = true;
        int i = 0;
        DispatchEvents$StarterIntroDismissReason dispatchEvents$StarterIntroDismissReason = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else {
                if (iX != 0) {
                    sz6.e(iX);
                    return null;
                }
                dispatchEvents$StarterIntroDismissReason = (DispatchEvents$StarterIntroDismissReason) ud4VarC.l(serialDescriptor, 0, (s06) kw9VarArr[0].getValue(), dispatchEvents$StarterIntroDismissReason);
                i = 1;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new DispatchEvents$StarterIntroCompleted(i, dispatchEvents$StarterIntroDismissReason, vnfVar);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        DispatchEvents$StarterIntroCompleted dispatchEvents$StarterIntroCompleted = (DispatchEvents$StarterIntroCompleted) obj;
        encoder.getClass();
        dispatchEvents$StarterIntroCompleted.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        vd4VarC.r(serialDescriptor, 0, (znf) DispatchEvents$StarterIntroCompleted.$childSerializers[0].getValue(), dispatchEvents$StarterIntroCompleted.reason);
        vd4VarC.b(serialDescriptor);
    }
}
