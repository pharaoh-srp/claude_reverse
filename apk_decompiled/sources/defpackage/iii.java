package defpackage;

import com.anthropic.claude.analytics.events.UpdateEvents$RequiredUpdateStalled;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class iii implements w28 {
    public static final iii a;
    private static final SerialDescriptor descriptor;

    static {
        iii iiiVar = new iii();
        a = iiiVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("mobile.required_update.stalled", iiiVar, 0);
        pluginGeneratedSerialDescriptor.k(new xmb(18));
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
            return new UpdateEvents$RequiredUpdateStalled(0, vnfVar);
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
        UpdateEvents$RequiredUpdateStalled updateEvents$RequiredUpdateStalled = (UpdateEvents$RequiredUpdateStalled) obj;
        encoder.getClass();
        updateEvents$RequiredUpdateStalled.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        UpdateEvents$RequiredUpdateStalled.write$Self$analytics(updateEvents$RequiredUpdateStalled, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
