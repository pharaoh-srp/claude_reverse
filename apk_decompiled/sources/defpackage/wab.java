package defpackage;

import com.anthropic.claude.analytics.events.MemoryEvents$MemoryFileLinkOpened;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class wab implements w28 {
    public static final wab a;
    private static final SerialDescriptor descriptor;

    static {
        wab wabVar = new wab();
        a = wabVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("claudeai.memory.file.link.opened", wabVar, 1);
        pluginGeneratedSerialDescriptor.j("resolved", false);
        pluginGeneratedSerialDescriptor.k(new pi(26));
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{zt1.a};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        boolean z = true;
        int i = 0;
        boolean zU = false;
        while (true) {
            vnf vnfVar = null;
            if (!z) {
                ud4VarC.b(serialDescriptor);
                return new MemoryEvents$MemoryFileLinkOpened(i, zU, vnfVar);
            }
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else {
                if (iX != 0) {
                    sz6.e(iX);
                    return null;
                }
                zU = ud4VarC.u(serialDescriptor, 0);
                i = 1;
            }
        }
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        MemoryEvents$MemoryFileLinkOpened memoryEvents$MemoryFileLinkOpened = (MemoryEvents$MemoryFileLinkOpened) obj;
        encoder.getClass();
        memoryEvents$MemoryFileLinkOpened.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        vd4VarC.p(serialDescriptor, 0, memoryEvents$MemoryFileLinkOpened.resolved);
        vd4VarC.b(serialDescriptor);
    }
}
