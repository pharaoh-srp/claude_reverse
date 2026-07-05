package defpackage;

import com.anthropic.claude.api.chat.messages.ThinkingSummary;
import com.anthropic.claude.api.chat.messages.ThinkingSummaryDelta;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class omh implements w28 {
    public static final omh a;
    private static final SerialDescriptor descriptor;

    static {
        omh omhVar = new omh();
        a = omhVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("thinking_summary_delta", omhVar, 1);
        pluginGeneratedSerialDescriptor.j("summary", false);
        pluginGeneratedSerialDescriptor.k(new gl0(3));
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{mmh.a};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        vnf vnfVar = null;
        boolean z = true;
        int i = 0;
        ThinkingSummary thinkingSummary = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else {
                if (iX != 0) {
                    sz6.e(iX);
                    return null;
                }
                thinkingSummary = (ThinkingSummary) ud4VarC.l(serialDescriptor, 0, mmh.a, thinkingSummary);
                i = 1;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new ThinkingSummaryDelta(i, thinkingSummary, vnfVar);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        ThinkingSummaryDelta thinkingSummaryDelta = (ThinkingSummaryDelta) obj;
        encoder.getClass();
        thinkingSummaryDelta.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        vd4VarC.r(serialDescriptor, 0, mmh.a, thinkingSummaryDelta.summary);
        vd4VarC.b(serialDescriptor);
    }
}
