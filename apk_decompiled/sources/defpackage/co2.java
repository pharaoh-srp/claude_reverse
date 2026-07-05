package defpackage;

import com.anthropic.claude.analytics.events.ChatEvents$ChatFeedbackSentWebCompat;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class co2 implements w28 {
    public static final co2 a;
    private static final SerialDescriptor descriptor;

    static {
        co2 co2Var = new co2();
        a = co2Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("claudeai.conversation.feedback.sent", co2Var, 6);
        pluginGeneratedSerialDescriptor.j("message_uuid", false);
        pluginGeneratedSerialDescriptor.j("conversation_uuid", false);
        pluginGeneratedSerialDescriptor.j("artifacts_enabled", false);
        pluginGeneratedSerialDescriptor.j("conversation_has_artifacts", false);
        qy1.u(pluginGeneratedSerialDescriptor, "type", false, "input_mode", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        srg srgVar = srg.a;
        KSerializer kSerializerS = d4c.S(srgVar);
        zt1 zt1Var = zt1.a;
        return new KSerializer[]{srgVar, srgVar, zt1Var, zt1Var, srgVar, kSerializerS};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        boolean z = true;
        int i = 0;
        boolean zU = false;
        boolean zU2 = false;
        String strV = null;
        String strV2 = null;
        String strV3 = null;
        String str = null;
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
                    strV2 = ud4VarC.v(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    zU = ud4VarC.u(serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    zU2 = ud4VarC.u(serialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    strV3 = ud4VarC.v(serialDescriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    str = (String) ud4VarC.m(serialDescriptor, 5, srg.a, str);
                    i |= 32;
                    break;
                default:
                    sz6.e(iX);
                    return null;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new ChatEvents$ChatFeedbackSentWebCompat(i, strV, strV2, zU, zU2, strV3, str, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        ChatEvents$ChatFeedbackSentWebCompat chatEvents$ChatFeedbackSentWebCompat = (ChatEvents$ChatFeedbackSentWebCompat) obj;
        encoder.getClass();
        chatEvents$ChatFeedbackSentWebCompat.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        ChatEvents$ChatFeedbackSentWebCompat.write$Self$analytics(chatEvents$ChatFeedbackSentWebCompat, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
