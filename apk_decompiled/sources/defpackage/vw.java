package defpackage;

import com.anthropic.claude.tool.model.AnalysisToolInvocation;
import com.anthropic.claude.types.strings.MessageId;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class vw implements w28 {
    public static final vw a;
    private static final SerialDescriptor descriptor;

    static {
        vw vwVar = new vw();
        a = vwVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.tool.model.AnalysisToolInvocation", vwVar, 3);
        pluginGeneratedSerialDescriptor.j("messageId", false);
        pluginGeneratedSerialDescriptor.j("body", false);
        pluginGeneratedSerialDescriptor.j("isComplete", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{ehb.a, srg.a, zt1.a};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        boolean z = true;
        int i = 0;
        boolean zU = false;
        String strM1057unboximpl = null;
        String strV = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                MessageId messageId = (MessageId) ud4VarC.l(serialDescriptor, 0, ehb.a, strM1057unboximpl != null ? MessageId.m1051boximpl(strM1057unboximpl) : null);
                strM1057unboximpl = messageId != null ? messageId.m1057unboximpl() : null;
                i |= 1;
            } else if (iX == 1) {
                strV = ud4VarC.v(serialDescriptor, 1);
                i |= 2;
            } else {
                if (iX != 2) {
                    sz6.e(iX);
                    return null;
                }
                zU = ud4VarC.u(serialDescriptor, 2);
                i |= 4;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new AnalysisToolInvocation(i, strM1057unboximpl, strV, zU, null, null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        AnalysisToolInvocation analysisToolInvocation = (AnalysisToolInvocation) obj;
        encoder.getClass();
        analysisToolInvocation.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        AnalysisToolInvocation.write$Self$Claude_tool_model(analysisToolInvocation, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
