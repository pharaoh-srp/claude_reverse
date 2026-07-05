package defpackage;

import com.anthropic.claude.api.chat.tool.UnknownDisplayContent;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class rei implements w28 {
    public static final rei a;
    private static final SerialDescriptor descriptor;

    static {
        rei reiVar = new rei();
        a = reiVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.api.chat.tool.UnknownDisplayContent", reiVar, 0);
        pluginGeneratedSerialDescriptor.k(new gl0(13));
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
            return new UnknownDisplayContent(0, vnfVar);
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
        UnknownDisplayContent unknownDisplayContent = (UnknownDisplayContent) obj;
        encoder.getClass();
        unknownDisplayContent.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        UnknownDisplayContent.write$Self$api(unknownDisplayContent, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
