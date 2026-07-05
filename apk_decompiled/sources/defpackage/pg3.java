package defpackage;

import com.anthropic.claude.api.chat.citation.Citation;
import com.anthropic.claude.api.chat.messages.CitationStartDelta;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class pg3 implements w28 {
    public static final pg3 a;
    private static final SerialDescriptor descriptor;

    static {
        pg3 pg3Var = new pg3();
        a = pg3Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("citation_start_delta", pg3Var, 1);
        pluginGeneratedSerialDescriptor.j("citation", false);
        pluginGeneratedSerialDescriptor.k(new gl0(3));
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{eg3.a};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        vnf vnfVar = null;
        boolean z = true;
        int i = 0;
        Citation citation = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else {
                if (iX != 0) {
                    sz6.e(iX);
                    return null;
                }
                citation = (Citation) ud4VarC.l(serialDescriptor, 0, eg3.a, citation);
                i = 1;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new CitationStartDelta(i, citation, vnfVar);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        CitationStartDelta citationStartDelta = (CitationStartDelta) obj;
        encoder.getClass();
        citationStartDelta.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        vd4VarC.r(serialDescriptor, 0, eg3.a, citationStartDelta.citation);
        vd4VarC.b(serialDescriptor);
    }
}
