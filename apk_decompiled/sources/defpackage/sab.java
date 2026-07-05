package defpackage;

import com.anthropic.claude.analytics.events.MemoryEvents$MemoryEditOnWeb;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class sab implements w28 {
    public static final sab a;
    private static final SerialDescriptor descriptor;

    static {
        sab sabVar = new sab();
        a = sabVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("memory_edit_on_web", sabVar, 0);
        pluginGeneratedSerialDescriptor.k(new pi(26));
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
            return new MemoryEvents$MemoryEditOnWeb(0, vnfVar);
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
        MemoryEvents$MemoryEditOnWeb memoryEvents$MemoryEditOnWeb = (MemoryEvents$MemoryEditOnWeb) obj;
        encoder.getClass();
        memoryEvents$MemoryEditOnWeb.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        MemoryEvents$MemoryEditOnWeb.write$Self$analytics(memoryEvents$MemoryEditOnWeb, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
