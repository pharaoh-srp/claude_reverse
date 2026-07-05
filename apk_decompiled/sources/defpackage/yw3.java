package defpackage;

import com.anthropic.claude.analytics.events.CodeEvents$ToolPayloadPrettified;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class yw3 implements w28 {
    public static final yw3 a;
    private static final SerialDescriptor descriptor;

    static {
        yw3 yw3Var = new yw3();
        a = yw3Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("claudeai.code.tool_payload.prettified", yw3Var, 0);
        pluginGeneratedSerialDescriptor.k(new pi(16));
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
            return new CodeEvents$ToolPayloadPrettified(0, vnfVar);
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
        CodeEvents$ToolPayloadPrettified codeEvents$ToolPayloadPrettified = (CodeEvents$ToolPayloadPrettified) obj;
        encoder.getClass();
        codeEvents$ToolPayloadPrettified.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        CodeEvents$ToolPayloadPrettified.write$Self$analytics(codeEvents$ToolPayloadPrettified, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
