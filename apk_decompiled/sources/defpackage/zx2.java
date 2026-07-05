package defpackage;

import com.anthropic.claude.analytics.events.ChatListEvents$ReviewPromptShown;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class zx2 implements w28 {
    public static final zx2 a;
    private static final SerialDescriptor descriptor;

    static {
        zx2 zx2Var = new zx2();
        a = zx2Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("mobile.chat_list.app_store_review_prompt_shown", zx2Var, 0);
        pluginGeneratedSerialDescriptor.k(new pi(11));
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        return new KSerializer[0];
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        int iX = ud4VarC.x(serialDescriptor);
        vnf vnfVar = null;
        if (iX == -1) {
            ud4VarC.b(serialDescriptor);
            return new ChatListEvents$ReviewPromptShown(0, vnfVar);
        }
        sz6.e(iX);
        return null;
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        ChatListEvents$ReviewPromptShown chatListEvents$ReviewPromptShown = (ChatListEvents$ReviewPromptShown) obj;
        encoder.getClass();
        chatListEvents$ReviewPromptShown.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        ChatListEvents$ReviewPromptShown.write$Self$analytics(chatListEvents$ReviewPromptShown, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
