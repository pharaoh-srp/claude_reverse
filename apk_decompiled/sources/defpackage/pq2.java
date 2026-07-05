package defpackage;

import com.anthropic.claude.analytics.events.ChatEvents$RetryCompletion;
import com.anthropic.claude.analytics.events.ChatEvents$RetryCompletionReason;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class pq2 implements w28 {
    public static final pq2 a;
    private static final SerialDescriptor descriptor;

    static {
        pq2 pq2Var = new pq2();
        a = pq2Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("mobile_conversation_retry_completion", pq2Var, 6);
        pluginGeneratedSerialDescriptor.j("organization_uuid", false);
        pluginGeneratedSerialDescriptor.j("conversation_uuid", false);
        pluginGeneratedSerialDescriptor.j("is_temporary_chat", true);
        pluginGeneratedSerialDescriptor.j("reason", true);
        qy1.u(pluginGeneratedSerialDescriptor, "project_id", true, "retried_from_message_uuid", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        kw9[] kw9VarArr = ChatEvents$RetryCompletion.$childSerializers;
        srg srgVar = srg.a;
        return new KSerializer[]{srgVar, srgVar, d4c.S(zt1.a), d4c.S((KSerializer) kw9VarArr[3].getValue()), d4c.S(srgVar), d4c.S(srgVar)};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr = ChatEvents$RetryCompletion.$childSerializers;
        boolean z = true;
        int i = 0;
        String strV = null;
        String strV2 = null;
        Boolean bool = null;
        ChatEvents$RetryCompletionReason chatEvents$RetryCompletionReason = null;
        String str = null;
        String str2 = null;
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
                    bool = (Boolean) ud4VarC.m(serialDescriptor, 2, zt1.a, bool);
                    i |= 4;
                    break;
                case 3:
                    chatEvents$RetryCompletionReason = (ChatEvents$RetryCompletionReason) ud4VarC.m(serialDescriptor, 3, (s06) kw9VarArr[3].getValue(), chatEvents$RetryCompletionReason);
                    i |= 8;
                    break;
                case 4:
                    str = (String) ud4VarC.m(serialDescriptor, 4, srg.a, str);
                    i |= 16;
                    break;
                case 5:
                    str2 = (String) ud4VarC.m(serialDescriptor, 5, srg.a, str2);
                    i |= 32;
                    break;
                default:
                    sz6.e(iX);
                    return null;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new ChatEvents$RetryCompletion(i, strV, strV2, bool, chatEvents$RetryCompletionReason, str, str2, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        ChatEvents$RetryCompletion chatEvents$RetryCompletion = (ChatEvents$RetryCompletion) obj;
        encoder.getClass();
        chatEvents$RetryCompletion.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        ChatEvents$RetryCompletion.write$Self$analytics(chatEvents$RetryCompletion, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
