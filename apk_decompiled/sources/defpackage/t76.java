package defpackage;

import com.anthropic.claude.analytics.events.DispatchEvents$TabSelected;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class t76 implements w28 {
    public static final t76 a;
    private static final SerialDescriptor descriptor;

    static {
        t76 t76Var = new t76();
        a = t76Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("dispatch.tab.selected", t76Var, 0);
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
            return new DispatchEvents$TabSelected(0, vnfVar);
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
        DispatchEvents$TabSelected dispatchEvents$TabSelected = (DispatchEvents$TabSelected) obj;
        encoder.getClass();
        dispatchEvents$TabSelected.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        DispatchEvents$TabSelected.write$Self$analytics(dispatchEvents$TabSelected, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
