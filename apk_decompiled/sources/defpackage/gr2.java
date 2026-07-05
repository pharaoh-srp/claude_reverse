package defpackage;

import com.anthropic.claude.analytics.events.ChatEvents$StopCompletion;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class gr2 implements w28 {
    public static final gr2 a;
    private static final SerialDescriptor descriptor;

    static {
        gr2 gr2Var = new gr2();
        a = gr2Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("mobile_conversation_stop_completion", gr2Var, 4);
        pluginGeneratedSerialDescriptor.j("organization_uuid", false);
        pluginGeneratedSerialDescriptor.j("conversation_uuid", false);
        qy1.u(pluginGeneratedSerialDescriptor, "is_temporary_chat", true, "project_id", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        srg srgVar = srg.a;
        return new KSerializer[]{srgVar, srgVar, d4c.S(zt1.a), d4c.S(srgVar)};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        boolean z = true;
        int i = 0;
        String strV = null;
        String strV2 = null;
        Boolean bool = null;
        String str = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                strV = ud4VarC.v(serialDescriptor, 0);
                i |= 1;
            } else if (iX == 1) {
                strV2 = ud4VarC.v(serialDescriptor, 1);
                i |= 2;
            } else if (iX == 2) {
                bool = (Boolean) ud4VarC.m(serialDescriptor, 2, zt1.a, bool);
                i |= 4;
            } else {
                if (iX != 3) {
                    sz6.e(iX);
                    return null;
                }
                str = (String) ud4VarC.m(serialDescriptor, 3, srg.a, str);
                i |= 8;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new ChatEvents$StopCompletion(i, strV, strV2, bool, str, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        ChatEvents$StopCompletion chatEvents$StopCompletion = (ChatEvents$StopCompletion) obj;
        encoder.getClass();
        chatEvents$StopCompletion.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        ChatEvents$StopCompletion.write$Self$analytics(chatEvents$StopCompletion, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
