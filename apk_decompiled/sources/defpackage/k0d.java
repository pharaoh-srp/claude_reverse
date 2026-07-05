package defpackage;

import com.anthropic.claude.tool.model.PhoneCallCompletedOutputTranscriptItem;
import com.anthropic.claude.tool.model.PhoneCallCompletedOutputTranscriptItemSpeaker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class k0d implements w28 {
    public static final k0d a;
    private static final SerialDescriptor descriptor;

    static {
        k0d k0dVar = new k0d();
        a = k0dVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.tool.model.PhoneCallCompletedOutputTranscriptItem", k0dVar, 3);
        pluginGeneratedSerialDescriptor.j("relative_ms", true);
        pluginGeneratedSerialDescriptor.j("speaker", false);
        pluginGeneratedSerialDescriptor.j("text", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{d4c.S(e79.a), n0d.d, srg.a};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        boolean z = true;
        int i = 0;
        Integer num = null;
        PhoneCallCompletedOutputTranscriptItemSpeaker phoneCallCompletedOutputTranscriptItemSpeaker = null;
        String strV = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                num = (Integer) ud4VarC.m(serialDescriptor, 0, e79.a, num);
                i |= 1;
            } else if (iX == 1) {
                phoneCallCompletedOutputTranscriptItemSpeaker = (PhoneCallCompletedOutputTranscriptItemSpeaker) ud4VarC.l(serialDescriptor, 1, n0d.d, phoneCallCompletedOutputTranscriptItemSpeaker);
                i |= 2;
            } else {
                if (iX != 2) {
                    sz6.e(iX);
                    return null;
                }
                strV = ud4VarC.v(serialDescriptor, 2);
                i |= 4;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new PhoneCallCompletedOutputTranscriptItem(i, num, phoneCallCompletedOutputTranscriptItemSpeaker, strV, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        PhoneCallCompletedOutputTranscriptItem phoneCallCompletedOutputTranscriptItem = (PhoneCallCompletedOutputTranscriptItem) obj;
        encoder.getClass();
        phoneCallCompletedOutputTranscriptItem.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        PhoneCallCompletedOutputTranscriptItem.write$Self$Claude_tool_model(phoneCallCompletedOutputTranscriptItem, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
