package defpackage;

import com.anthropic.claude.sessions.types.SdkNonAssistantMessage;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class qbf implements w28 {
    public static final qbf a;
    private static final SerialDescriptor descriptor;

    static {
        qbf qbfVar = new qbf();
        a = qbfVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.sessions.types.SdkNonAssistantMessage", qbfVar, 2);
        pluginGeneratedSerialDescriptor.j("role", false);
        pluginGeneratedSerialDescriptor.j("content", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{srg.a, pfb.a};
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
        List list = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                strV = ud4VarC.v(serialDescriptor, 0);
                i |= 1;
            } else {
                if (iX != 1) {
                    sz6.e(iX);
                    return null;
                }
                list = (List) ud4VarC.l(serialDescriptor, 1, pfb.a, list);
                i |= 2;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new SdkNonAssistantMessage(i, strV, list, vnfVar);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        SdkNonAssistantMessage sdkNonAssistantMessage = (SdkNonAssistantMessage) obj;
        encoder.getClass();
        sdkNonAssistantMessage.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        SdkNonAssistantMessage.write$Self$sessions(sdkNonAssistantMessage, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
