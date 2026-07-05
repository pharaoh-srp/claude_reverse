package defpackage;

import com.anthropic.claude.sessions.types.SdkAssistantMessage;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class uaf implements w28 {
    public static final uaf a;
    private static final SerialDescriptor descriptor;

    static {
        uaf uafVar = new uaf();
        a = uafVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.sessions.types.SdkAssistantMessage", uafVar, 7);
        pluginGeneratedSerialDescriptor.j("role", false);
        pluginGeneratedSerialDescriptor.j("id", true);
        pluginGeneratedSerialDescriptor.j("model", true);
        pluginGeneratedSerialDescriptor.j("stop_reason", true);
        pluginGeneratedSerialDescriptor.j("stop_sequence", true);
        pluginGeneratedSerialDescriptor.j("type", true);
        pluginGeneratedSerialDescriptor.j("content", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        srg srgVar = srg.a;
        return new KSerializer[]{srgVar, d4c.S(srgVar), d4c.S(srgVar), d4c.S(srgVar), d4c.S(srgVar), d4c.S(srgVar), pfb.a};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        boolean z = true;
        int i = 0;
        String strV = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        List list = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            switch (iX) {
                case -1:
                    z = false;
                    break;
                case 0:
                    strV = ud4VarC.v(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    str = (String) ud4VarC.m(serialDescriptor, 1, srg.a, str);
                    i |= 2;
                    break;
                case 2:
                    str2 = (String) ud4VarC.m(serialDescriptor, 2, srg.a, str2);
                    i |= 4;
                    break;
                case 3:
                    str3 = (String) ud4VarC.m(serialDescriptor, 3, srg.a, str3);
                    i |= 8;
                    break;
                case 4:
                    str4 = (String) ud4VarC.m(serialDescriptor, 4, srg.a, str4);
                    i |= 16;
                    break;
                case 5:
                    str5 = (String) ud4VarC.m(serialDescriptor, 5, srg.a, str5);
                    i |= 32;
                    break;
                case 6:
                    list = (List) ud4VarC.l(serialDescriptor, 6, pfb.a, list);
                    i |= 64;
                    break;
                default:
                    sz6.e(iX);
                    return null;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new SdkAssistantMessage(i, strV, str, str2, str3, str4, str5, list, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        SdkAssistantMessage sdkAssistantMessage = (SdkAssistantMessage) obj;
        encoder.getClass();
        sdkAssistantMessage.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        SdkAssistantMessage.write$Self$sessions(sdkAssistantMessage, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
