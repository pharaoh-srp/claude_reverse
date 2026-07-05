package defpackage;

import com.anthropic.claude.analytics.events.ChatMessageActionEvents$ActionSource;
import com.anthropic.claude.analytics.events.ChatMessageActionEvents$ChatMessageAction;
import com.anthropic.claude.analytics.events.ChatMessageActionEvents$ChatMessageActionClicked;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class yy2 implements w28 {
    public static final yy2 a;
    private static final SerialDescriptor descriptor;

    static {
        yy2 yy2Var = new yy2();
        a = yy2Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("chat_message_action_clicked", yy2Var, 6);
        pluginGeneratedSerialDescriptor.j("organization_uuid", false);
        pluginGeneratedSerialDescriptor.j("chat_uuid", false);
        pluginGeneratedSerialDescriptor.j("message_uuid", false);
        pluginGeneratedSerialDescriptor.j("action_source", false);
        pluginGeneratedSerialDescriptor.j("action", false);
        pluginGeneratedSerialDescriptor.j("input_mode", true);
        pluginGeneratedSerialDescriptor.k(new pi(12));
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        kw9[] kw9VarArr = ChatMessageActionEvents$ChatMessageActionClicked.$childSerializers;
        srg srgVar = srg.a;
        return new KSerializer[]{srgVar, srgVar, srgVar, kw9VarArr[3].getValue(), kw9VarArr[4].getValue(), d4c.S(srgVar)};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr = ChatMessageActionEvents$ChatMessageActionClicked.$childSerializers;
        boolean z = true;
        int i = 0;
        String strV = null;
        String strV2 = null;
        String strV3 = null;
        ChatMessageActionEvents$ActionSource chatMessageActionEvents$ActionSource = null;
        ChatMessageActionEvents$ChatMessageAction chatMessageActionEvents$ChatMessageAction = null;
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
                    strV3 = ud4VarC.v(serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    chatMessageActionEvents$ActionSource = (ChatMessageActionEvents$ActionSource) ud4VarC.l(serialDescriptor, 3, (s06) kw9VarArr[3].getValue(), chatMessageActionEvents$ActionSource);
                    i |= 8;
                    break;
                case 4:
                    chatMessageActionEvents$ChatMessageAction = (ChatMessageActionEvents$ChatMessageAction) ud4VarC.l(serialDescriptor, 4, (s06) kw9VarArr[4].getValue(), chatMessageActionEvents$ChatMessageAction);
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
        return new ChatMessageActionEvents$ChatMessageActionClicked(i, strV, strV2, strV3, chatMessageActionEvents$ActionSource, chatMessageActionEvents$ChatMessageAction, str, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        ChatMessageActionEvents$ChatMessageActionClicked chatMessageActionEvents$ChatMessageActionClicked = (ChatMessageActionEvents$ChatMessageActionClicked) obj;
        encoder.getClass();
        chatMessageActionEvents$ChatMessageActionClicked.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        ChatMessageActionEvents$ChatMessageActionClicked.write$Self$analytics(chatMessageActionEvents$ChatMessageActionClicked, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
