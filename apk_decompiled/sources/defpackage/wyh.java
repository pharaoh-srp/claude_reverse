package defpackage;

import com.anthropic.claude.api.chat.tool.SourceMetadata;
import com.anthropic.claude.api.chat.tool.ToolResultKnowledge;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class wyh implements w28 {
    public static final wyh a;
    private static final SerialDescriptor descriptor;

    static {
        wyh wyhVar = new wyh();
        a = wyhVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("knowledge", wyhVar, 3);
        pluginGeneratedSerialDescriptor.j("title", false);
        pluginGeneratedSerialDescriptor.j("url", true);
        pluginGeneratedSerialDescriptor.j("metadata", false);
        pluginGeneratedSerialDescriptor.k(new gl0(14));
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        kw9[] kw9VarArr = ToolResultKnowledge.$childSerializers;
        srg srgVar = srg.a;
        return new KSerializer[]{srgVar, d4c.S(srgVar), kw9VarArr[2].getValue()};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr = ToolResultKnowledge.$childSerializers;
        boolean z = true;
        int i = 0;
        String strV = null;
        String str = null;
        SourceMetadata sourceMetadata = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                strV = ud4VarC.v(serialDescriptor, 0);
                i |= 1;
            } else if (iX == 1) {
                str = (String) ud4VarC.m(serialDescriptor, 1, srg.a, str);
                i |= 2;
            } else {
                if (iX != 2) {
                    sz6.e(iX);
                    return null;
                }
                sourceMetadata = (SourceMetadata) ud4VarC.l(serialDescriptor, 2, (s06) kw9VarArr[2].getValue(), sourceMetadata);
                i |= 4;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new ToolResultKnowledge(i, strV, str, sourceMetadata, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        ToolResultKnowledge toolResultKnowledge = (ToolResultKnowledge) obj;
        encoder.getClass();
        toolResultKnowledge.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        ToolResultKnowledge.write$Self$api(toolResultKnowledge, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
