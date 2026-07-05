package defpackage;

import com.anthropic.claude.analytics.events.ChatEvents$BusyContainerSendRetryCompleted;
import com.anthropic.claude.analytics.events.ChatEvents$BusyContainerSendRetryOutcome;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class yn2 implements w28 {
    public static final yn2 a;
    private static final SerialDescriptor descriptor;

    static {
        yn2 yn2Var = new yn2();
        a = yn2Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("claudeai.chat.busy_container_send_retry.completed", yn2Var, 6);
        pluginGeneratedSerialDescriptor.j("outcome", false);
        pluginGeneratedSerialDescriptor.j("attempts", false);
        pluginGeneratedSerialDescriptor.j("duration_ms", false);
        pluginGeneratedSerialDescriptor.j("conversation_uuid", false);
        qy1.u(pluginGeneratedSerialDescriptor, "organization_uuid", false, "human_message_uuid", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        srg srgVar = srg.a;
        return new KSerializer[]{ChatEvents$BusyContainerSendRetryCompleted.$childSerializers[0].getValue(), e79.a, xka.a, srgVar, srgVar, srgVar};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr = ChatEvents$BusyContainerSendRetryCompleted.$childSerializers;
        int i = 0;
        int iR = 0;
        ChatEvents$BusyContainerSendRetryOutcome chatEvents$BusyContainerSendRetryOutcome = null;
        String strV = null;
        String strV2 = null;
        String strV3 = null;
        long j = 0;
        boolean z = true;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            switch (iX) {
                case -1:
                    z = false;
                    break;
                case 0:
                    chatEvents$BusyContainerSendRetryOutcome = (ChatEvents$BusyContainerSendRetryOutcome) ud4VarC.l(serialDescriptor, 0, (s06) kw9VarArr[0].getValue(), chatEvents$BusyContainerSendRetryOutcome);
                    i |= 1;
                    break;
                case 1:
                    iR = ud4VarC.r(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    j = ud4VarC.j(serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    strV = ud4VarC.v(serialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    strV2 = ud4VarC.v(serialDescriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    strV3 = ud4VarC.v(serialDescriptor, 5);
                    i |= 32;
                    break;
                default:
                    sz6.e(iX);
                    return null;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new ChatEvents$BusyContainerSendRetryCompleted(i, chatEvents$BusyContainerSendRetryOutcome, iR, j, strV, strV2, strV3, null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        ChatEvents$BusyContainerSendRetryCompleted chatEvents$BusyContainerSendRetryCompleted = (ChatEvents$BusyContainerSendRetryCompleted) obj;
        encoder.getClass();
        chatEvents$BusyContainerSendRetryCompleted.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        ChatEvents$BusyContainerSendRetryCompleted.write$Self$analytics(chatEvents$BusyContainerSendRetryCompleted, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
