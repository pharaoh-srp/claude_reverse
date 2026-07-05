package defpackage;

import com.anthropic.claude.analytics.events.ChatEvents$SendMessage;
import com.pvporbit.freetype.FreeTypeConstants;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class vq2 implements w28 {
    public static final vq2 a;
    private static final SerialDescriptor descriptor;

    static {
        vq2 vq2Var = new vq2();
        a = vq2Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("mobile_conversation_send_message", vq2Var, 10);
        pluginGeneratedSerialDescriptor.j("organization_uuid", false);
        pluginGeneratedSerialDescriptor.j("conversation_uuid", false);
        pluginGeneratedSerialDescriptor.j("document_attachment_count", false);
        pluginGeneratedSerialDescriptor.j("image_attachment_count", false);
        pluginGeneratedSerialDescriptor.j("mm_document_count", false);
        pluginGeneratedSerialDescriptor.j("model", true);
        pluginGeneratedSerialDescriptor.j("edit_message_id", true);
        pluginGeneratedSerialDescriptor.j("is_temporary_chat", true);
        qy1.u(pluginGeneratedSerialDescriptor, "project_id", true, "was_restored_draft", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        srg srgVar = srg.a;
        KSerializer kSerializerS = d4c.S(srgVar);
        KSerializer kSerializerS2 = d4c.S(srgVar);
        zt1 zt1Var = zt1.a;
        KSerializer kSerializerS3 = d4c.S(zt1Var);
        KSerializer kSerializerS4 = d4c.S(srgVar);
        KSerializer kSerializerS5 = d4c.S(zt1Var);
        e79 e79Var = e79.a;
        return new KSerializer[]{srgVar, srgVar, e79Var, e79Var, e79Var, kSerializerS, kSerializerS2, kSerializerS3, kSerializerS4, kSerializerS5};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        Boolean bool = null;
        boolean z = true;
        String str = null;
        int i = 0;
        String strV = null;
        String strV2 = null;
        int iR = 0;
        int iR2 = 0;
        int iR3 = 0;
        String str2 = null;
        String str3 = null;
        Boolean bool2 = null;
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
                    iR = ud4VarC.r(serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    iR2 = ud4VarC.r(serialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    iR3 = ud4VarC.r(serialDescriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    str2 = (String) ud4VarC.m(serialDescriptor, 5, srg.a, str2);
                    i |= 32;
                    break;
                case 6:
                    str3 = (String) ud4VarC.m(serialDescriptor, 6, srg.a, str3);
                    i |= 64;
                    break;
                case 7:
                    bool2 = (Boolean) ud4VarC.m(serialDescriptor, 7, zt1.a, bool2);
                    i |= FreeTypeConstants.FT_LOAD_PEDANTIC;
                    break;
                case 8:
                    str = (String) ud4VarC.m(serialDescriptor, 8, srg.a, str);
                    i |= FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING;
                    break;
                case 9:
                    bool = (Boolean) ud4VarC.m(serialDescriptor, 9, zt1.a, bool);
                    i |= 512;
                    break;
                default:
                    sz6.e(iX);
                    return null;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new ChatEvents$SendMessage(i, strV, strV2, iR, iR2, iR3, str2, str3, bool2, str, bool, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        ChatEvents$SendMessage chatEvents$SendMessage = (ChatEvents$SendMessage) obj;
        encoder.getClass();
        chatEvents$SendMessage.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        ChatEvents$SendMessage.write$Self$analytics(chatEvents$SendMessage, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
