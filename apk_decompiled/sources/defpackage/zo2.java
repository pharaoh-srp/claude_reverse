package defpackage;

import com.anthropic.claude.analytics.events.ChatEvents$DraftRestoreTrigger;
import com.anthropic.claude.analytics.events.ChatEvents$DraftRestored;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class zo2 implements w28 {
    public static final zo2 a;
    private static final SerialDescriptor descriptor;

    static {
        zo2 zo2Var = new zo2();
        a = zo2Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("mobile_draft_restored", zo2Var, 3);
        pluginGeneratedSerialDescriptor.j("had_attachments", false);
        qy1.u(pluginGeneratedSerialDescriptor, "age_seconds", false, "trigger", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{zt1.a, e79.a, ChatEvents$DraftRestored.$childSerializers[2].getValue()};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr = ChatEvents$DraftRestored.$childSerializers;
        boolean z = true;
        int i = 0;
        boolean zU = false;
        int iR = 0;
        ChatEvents$DraftRestoreTrigger chatEvents$DraftRestoreTrigger = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                zU = ud4VarC.u(serialDescriptor, 0);
                i |= 1;
            } else if (iX == 1) {
                iR = ud4VarC.r(serialDescriptor, 1);
                i |= 2;
            } else {
                if (iX != 2) {
                    sz6.e(iX);
                    return null;
                }
                chatEvents$DraftRestoreTrigger = (ChatEvents$DraftRestoreTrigger) ud4VarC.l(serialDescriptor, 2, (s06) kw9VarArr[2].getValue(), chatEvents$DraftRestoreTrigger);
                i |= 4;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new ChatEvents$DraftRestored(i, zU, iR, chatEvents$DraftRestoreTrigger, null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        ChatEvents$DraftRestored chatEvents$DraftRestored = (ChatEvents$DraftRestored) obj;
        encoder.getClass();
        chatEvents$DraftRestored.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        ChatEvents$DraftRestored.write$Self$analytics(chatEvents$DraftRestored, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
