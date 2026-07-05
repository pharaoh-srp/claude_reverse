package defpackage;

import com.anthropic.claude.analytics.events.ChatEvents$AddPrepopulatedText;
import com.anthropic.claude.analytics.events.ChatEvents$AttachmentSource;
import com.anthropic.claude.analytics.events.ScreenSource;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class sn2 implements w28 {
    public static final sn2 a;
    private static final SerialDescriptor descriptor;

    static {
        sn2 sn2Var = new sn2();
        a = sn2Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("mobile_add_prepopulated_text", sn2Var, 4);
        pluginGeneratedSerialDescriptor.j("organization_uuid", false);
        pluginGeneratedSerialDescriptor.j("conversation_uuid", false);
        qy1.u(pluginGeneratedSerialDescriptor, "source", false, "screen_source", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        kw9[] kw9VarArr = ChatEvents$AddPrepopulatedText.$childSerializers;
        srg srgVar = srg.a;
        return new KSerializer[]{srgVar, srgVar, kw9VarArr[2].getValue(), kw9VarArr[3].getValue()};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr = ChatEvents$AddPrepopulatedText.$childSerializers;
        boolean z = true;
        int i = 0;
        String strV = null;
        String strV2 = null;
        ChatEvents$AttachmentSource chatEvents$AttachmentSource = null;
        ScreenSource screenSource = null;
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
                chatEvents$AttachmentSource = (ChatEvents$AttachmentSource) ud4VarC.l(serialDescriptor, 2, (s06) kw9VarArr[2].getValue(), chatEvents$AttachmentSource);
                i |= 4;
            } else {
                if (iX != 3) {
                    sz6.e(iX);
                    return null;
                }
                screenSource = (ScreenSource) ud4VarC.l(serialDescriptor, 3, (s06) kw9VarArr[3].getValue(), screenSource);
                i |= 8;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new ChatEvents$AddPrepopulatedText(i, strV, strV2, chatEvents$AttachmentSource, screenSource, null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        ChatEvents$AddPrepopulatedText chatEvents$AddPrepopulatedText = (ChatEvents$AddPrepopulatedText) obj;
        encoder.getClass();
        chatEvents$AddPrepopulatedText.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        ChatEvents$AddPrepopulatedText.write$Self$analytics(chatEvents$AddPrepopulatedText, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
