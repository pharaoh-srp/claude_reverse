package defpackage;

import com.anthropic.claude.analytics.events.MemoryEvents$MemoryStyleSelected;
import com.anthropic.claude.analytics.events.MemoryEvents$MemoryStyleSelectedStyle;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class cbb implements w28 {
    public static final cbb a;
    private static final SerialDescriptor descriptor;

    static {
        cbb cbbVar = new cbb();
        a = cbbVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("claudeai.memory.style.selected", cbbVar, 1);
        pluginGeneratedSerialDescriptor.j("style", false);
        pluginGeneratedSerialDescriptor.k(new pi(26));
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{MemoryEvents$MemoryStyleSelected.$childSerializers[0].getValue()};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr = MemoryEvents$MemoryStyleSelected.$childSerializers;
        vnf vnfVar = null;
        boolean z = true;
        int i = 0;
        MemoryEvents$MemoryStyleSelectedStyle memoryEvents$MemoryStyleSelectedStyle = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else {
                if (iX != 0) {
                    sz6.e(iX);
                    return null;
                }
                memoryEvents$MemoryStyleSelectedStyle = (MemoryEvents$MemoryStyleSelectedStyle) ud4VarC.l(serialDescriptor, 0, (s06) kw9VarArr[0].getValue(), memoryEvents$MemoryStyleSelectedStyle);
                i = 1;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new MemoryEvents$MemoryStyleSelected(i, memoryEvents$MemoryStyleSelectedStyle, vnfVar);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        MemoryEvents$MemoryStyleSelected memoryEvents$MemoryStyleSelected = (MemoryEvents$MemoryStyleSelected) obj;
        encoder.getClass();
        memoryEvents$MemoryStyleSelected.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        vd4VarC.r(serialDescriptor, 0, (znf) MemoryEvents$MemoryStyleSelected.$childSerializers[0].getValue(), memoryEvents$MemoryStyleSelected.style);
        vd4VarC.b(serialDescriptor);
    }
}
