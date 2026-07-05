package defpackage;

import com.anthropic.claude.api.chat.tool.TextDisplayContent;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class xeh implements w28 {
    public static final xeh a;
    private static final SerialDescriptor descriptor;

    static {
        xeh xehVar = new xeh();
        a = xehVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("text", xehVar, 1);
        pluginGeneratedSerialDescriptor.j("text", false);
        pluginGeneratedSerialDescriptor.k(new gl0(13));
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{srg.a};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        vnf vnfVar = null;
        boolean z = true;
        int i = 0;
        String strV = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else {
                if (iX != 0) {
                    sz6.e(iX);
                    return null;
                }
                strV = ud4VarC.v(serialDescriptor, 0);
                i = 1;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new TextDisplayContent(i, strV, vnfVar);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        TextDisplayContent textDisplayContent = (TextDisplayContent) obj;
        encoder.getClass();
        textDisplayContent.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        vd4VarC.q(serialDescriptor, 0, textDisplayContent.text);
        vd4VarC.b(serialDescriptor);
    }
}
