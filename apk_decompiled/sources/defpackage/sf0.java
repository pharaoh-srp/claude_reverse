package defpackage;

import com.anthropic.claude.sessions.types.ApiUserMessage;
import com.anthropic.claude.sessions.types.ApiUserMessageContent;
import com.anthropic.claude.sessions.types.e;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class sf0 implements w28 {
    public static final sf0 a;
    private static final SerialDescriptor descriptor;

    static {
        sf0 sf0Var = new sf0();
        a = sf0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.sessions.types.ApiUserMessage", sf0Var, 2);
        pluginGeneratedSerialDescriptor.j("content", false);
        pluginGeneratedSerialDescriptor.j("role", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{e.a, srg.a};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        vnf vnfVar = null;
        boolean z = true;
        int i = 0;
        ApiUserMessageContent apiUserMessageContent = null;
        String strV = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                apiUserMessageContent = (ApiUserMessageContent) ud4VarC.l(serialDescriptor, 0, e.a, apiUserMessageContent);
                i |= 1;
            } else {
                if (iX != 1) {
                    sz6.e(iX);
                    return null;
                }
                strV = ud4VarC.v(serialDescriptor, 1);
                i |= 2;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new ApiUserMessage(i, apiUserMessageContent, strV, vnfVar);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        ApiUserMessage apiUserMessage = (ApiUserMessage) obj;
        encoder.getClass();
        apiUserMessage.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        ApiUserMessage.write$Self$sessions(apiUserMessage, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
