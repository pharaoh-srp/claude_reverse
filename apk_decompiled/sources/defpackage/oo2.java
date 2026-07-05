package defpackage;

import com.anthropic.claude.analytics.events.ChatEvents$ContinueChatButtonPressed;
import com.anthropic.claude.analytics.events.ChatEvents$ContinueChatButtonPressedSource;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class oo2 implements w28 {
    public static final oo2 a;
    private static final SerialDescriptor descriptor;

    static {
        oo2 oo2Var = new oo2();
        a = oo2Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("mobile_continue_chat_button_pressed", oo2Var, 4);
        pluginGeneratedSerialDescriptor.j("organization_uuid", false);
        pluginGeneratedSerialDescriptor.j("conversation_uuid", false);
        qy1.u(pluginGeneratedSerialDescriptor, "source", false, "is_temporary_chat", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        kw9[] kw9VarArr = ChatEvents$ContinueChatButtonPressed.$childSerializers;
        srg srgVar = srg.a;
        return new KSerializer[]{srgVar, srgVar, kw9VarArr[2].getValue(), d4c.S(zt1.a)};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr = ChatEvents$ContinueChatButtonPressed.$childSerializers;
        boolean z = true;
        int i = 0;
        String strV = null;
        String strV2 = null;
        ChatEvents$ContinueChatButtonPressedSource chatEvents$ContinueChatButtonPressedSource = null;
        Boolean bool = null;
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
                chatEvents$ContinueChatButtonPressedSource = (ChatEvents$ContinueChatButtonPressedSource) ud4VarC.l(serialDescriptor, 2, (s06) kw9VarArr[2].getValue(), chatEvents$ContinueChatButtonPressedSource);
                i |= 4;
            } else {
                if (iX != 3) {
                    sz6.e(iX);
                    return null;
                }
                bool = (Boolean) ud4VarC.m(serialDescriptor, 3, zt1.a, bool);
                i |= 8;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new ChatEvents$ContinueChatButtonPressed(i, strV, strV2, chatEvents$ContinueChatButtonPressedSource, bool, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        ChatEvents$ContinueChatButtonPressed chatEvents$ContinueChatButtonPressed = (ChatEvents$ContinueChatButtonPressed) obj;
        encoder.getClass();
        chatEvents$ContinueChatButtonPressed.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        ChatEvents$ContinueChatButtonPressed.write$Self$analytics(chatEvents$ContinueChatButtonPressed, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
