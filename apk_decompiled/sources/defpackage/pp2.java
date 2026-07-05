package defpackage;

import com.anthropic.claude.analytics.events.ChatEvents$NewChatButtonPressed;
import com.anthropic.claude.analytics.events.ChatEvents$NewChatButtonPressedSource;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class pp2 implements w28 {
    public static final pp2 a;
    private static final SerialDescriptor descriptor;

    static {
        pp2 pp2Var = new pp2();
        a = pp2Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("mobile_new_chat_button_pressed", pp2Var, 3);
        pluginGeneratedSerialDescriptor.j("organization_uuid", false);
        qy1.u(pluginGeneratedSerialDescriptor, "source", false, "project_id", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        kw9[] kw9VarArr = ChatEvents$NewChatButtonPressed.$childSerializers;
        srg srgVar = srg.a;
        return new KSerializer[]{srgVar, kw9VarArr[1].getValue(), d4c.S(srgVar)};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr = ChatEvents$NewChatButtonPressed.$childSerializers;
        boolean z = true;
        int i = 0;
        String strV = null;
        ChatEvents$NewChatButtonPressedSource chatEvents$NewChatButtonPressedSource = null;
        String str = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                strV = ud4VarC.v(serialDescriptor, 0);
                i |= 1;
            } else if (iX == 1) {
                chatEvents$NewChatButtonPressedSource = (ChatEvents$NewChatButtonPressedSource) ud4VarC.l(serialDescriptor, 1, (s06) kw9VarArr[1].getValue(), chatEvents$NewChatButtonPressedSource);
                i |= 2;
            } else {
                if (iX != 2) {
                    sz6.e(iX);
                    return null;
                }
                str = (String) ud4VarC.m(serialDescriptor, 2, srg.a, str);
                i |= 4;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new ChatEvents$NewChatButtonPressed(i, strV, chatEvents$NewChatButtonPressedSource, str, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        ChatEvents$NewChatButtonPressed chatEvents$NewChatButtonPressed = (ChatEvents$NewChatButtonPressed) obj;
        encoder.getClass();
        chatEvents$NewChatButtonPressed.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        ChatEvents$NewChatButtonPressed.write$Self$analytics(chatEvents$NewChatButtonPressed, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
