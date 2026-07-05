package defpackage;

import com.anthropic.claude.analytics.events.UpdateEvents$FlexibleUpdateAccepted;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class uhi implements w28 {
    public static final uhi a;
    private static final SerialDescriptor descriptor;

    static {
        uhi uhiVar = new uhi();
        a = uhiVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("mobile.flexible_update.accepted", uhiVar, 0);
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
            return new UpdateEvents$FlexibleUpdateAccepted(0, vnfVar);
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
        UpdateEvents$FlexibleUpdateAccepted updateEvents$FlexibleUpdateAccepted = (UpdateEvents$FlexibleUpdateAccepted) obj;
        encoder.getClass();
        updateEvents$FlexibleUpdateAccepted.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        UpdateEvents$FlexibleUpdateAccepted.write$Self$analytics(updateEvents$FlexibleUpdateAccepted, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
