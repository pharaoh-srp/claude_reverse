package defpackage;

import com.anthropic.claude.api.chat.ChatFeedback;
import com.anthropic.claude.api.chat.ChatFeedbackType;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class wr2 implements w28 {
    public static final wr2 a;
    private static final SerialDescriptor descriptor;

    static {
        wr2 wr2Var = new wr2();
        a = wr2Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.api.chat.ChatFeedback", wr2Var, 2);
        pluginGeneratedSerialDescriptor.j("type", false);
        pluginGeneratedSerialDescriptor.j("reason", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{d4c.S(ps2.d), d4c.S(srg.a)};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        vnf vnfVar = null;
        boolean z = true;
        int i = 0;
        ChatFeedbackType chatFeedbackType = null;
        String str = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                chatFeedbackType = (ChatFeedbackType) ud4VarC.m(serialDescriptor, 0, ps2.d, chatFeedbackType);
                i |= 1;
            } else {
                if (iX != 1) {
                    sz6.e(iX);
                    return null;
                }
                str = (String) ud4VarC.m(serialDescriptor, 1, srg.a, str);
                i |= 2;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new ChatFeedback(i, chatFeedbackType, str, vnfVar);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        ChatFeedback chatFeedback = (ChatFeedback) obj;
        encoder.getClass();
        chatFeedback.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        ChatFeedback.write$Self$api(chatFeedback, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
