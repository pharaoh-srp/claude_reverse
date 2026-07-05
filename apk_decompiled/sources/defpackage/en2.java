package defpackage;

import com.anthropic.claude.analytics.events.ChatEvents$AddAttachment;
import com.anthropic.claude.analytics.events.ChatEvents$AttachmentSource;
import com.anthropic.claude.analytics.events.ScreenSource;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class en2 implements w28 {
    public static final en2 a;
    private static final SerialDescriptor descriptor;

    static {
        en2 en2Var = new en2();
        a = en2Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("mobile_add_attachment_to_conversation", en2Var, 6);
        pluginGeneratedSerialDescriptor.j("organization_uuid", false);
        pluginGeneratedSerialDescriptor.j("conversation_uuid", false);
        pluginGeneratedSerialDescriptor.j("uti", false);
        pluginGeneratedSerialDescriptor.j("source", false);
        qy1.u(pluginGeneratedSerialDescriptor, "screen_source", false, "is_wiggle_upload", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        kw9[] kw9VarArr = ChatEvents$AddAttachment.$childSerializers;
        srg srgVar = srg.a;
        return new KSerializer[]{srgVar, srgVar, srgVar, kw9VarArr[3].getValue(), kw9VarArr[4].getValue(), d4c.S(zt1.a)};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr = ChatEvents$AddAttachment.$childSerializers;
        boolean z = true;
        int i = 0;
        String strV = null;
        String strV2 = null;
        String strV3 = null;
        ChatEvents$AttachmentSource chatEvents$AttachmentSource = null;
        ScreenSource screenSource = null;
        Boolean bool = null;
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
                    chatEvents$AttachmentSource = (ChatEvents$AttachmentSource) ud4VarC.l(serialDescriptor, 3, (s06) kw9VarArr[3].getValue(), chatEvents$AttachmentSource);
                    i |= 8;
                    break;
                case 4:
                    screenSource = (ScreenSource) ud4VarC.l(serialDescriptor, 4, (s06) kw9VarArr[4].getValue(), screenSource);
                    i |= 16;
                    break;
                case 5:
                    bool = (Boolean) ud4VarC.m(serialDescriptor, 5, zt1.a, bool);
                    i |= 32;
                    break;
                default:
                    sz6.e(iX);
                    return null;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new ChatEvents$AddAttachment(i, strV, strV2, strV3, chatEvents$AttachmentSource, screenSource, bool, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        ChatEvents$AddAttachment chatEvents$AddAttachment = (ChatEvents$AddAttachment) obj;
        encoder.getClass();
        chatEvents$AddAttachment.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        ChatEvents$AddAttachment.write$Self$analytics(chatEvents$AddAttachment, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
