package defpackage;

import com.anthropic.claude.analytics.events.ChatEvents$AddImageSuccess;
import com.anthropic.claude.analytics.events.ChatEvents$AttachmentSource;
import com.anthropic.claude.analytics.events.ChatEvents$UploadSource;
import com.anthropic.claude.analytics.events.ScreenSource;
import com.pvporbit.freetype.FreeTypeConstants;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class qn2 implements w28 {
    public static final qn2 a;
    private static final SerialDescriptor descriptor;

    static {
        qn2 qn2Var = new qn2();
        a = qn2Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("mobile_add_attachment_to_conversation_image_success", qn2Var, 10);
        pluginGeneratedSerialDescriptor.j("organization_uuid", false);
        pluginGeneratedSerialDescriptor.j("conversation_uuid", false);
        pluginGeneratedSerialDescriptor.j("uti", false);
        pluginGeneratedSerialDescriptor.j("source", false);
        pluginGeneratedSerialDescriptor.j("screen_source", false);
        pluginGeneratedSerialDescriptor.j("is_wiggle_upload", true);
        pluginGeneratedSerialDescriptor.j("retry_count", true);
        pluginGeneratedSerialDescriptor.j("upload_source", false);
        qy1.u(pluginGeneratedSerialDescriptor, "is_app_backgrounded", true, "wm_run_attempt", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        kw9[] kw9VarArr = ChatEvents$AddImageSuccess.$childSerializers;
        srg srgVar = srg.a;
        zt1 zt1Var = zt1.a;
        e79 e79Var = e79.a;
        return new KSerializer[]{srgVar, srgVar, srgVar, kw9VarArr[3].getValue(), kw9VarArr[4].getValue(), d4c.S(zt1Var), d4c.S(e79Var), kw9VarArr[7].getValue(), d4c.S(zt1Var), d4c.S(e79Var)};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        kw9[] kw9VarArr;
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr2 = ChatEvents$AddImageSuccess.$childSerializers;
        Integer num = null;
        Boolean bool = null;
        boolean z = true;
        ChatEvents$UploadSource chatEvents$UploadSource = null;
        int i = 0;
        String strV = null;
        String strV2 = null;
        String strV3 = null;
        ChatEvents$AttachmentSource chatEvents$AttachmentSource = null;
        ScreenSource screenSource = null;
        Boolean bool2 = null;
        Integer num2 = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            switch (iX) {
                case -1:
                    kw9VarArr = kw9VarArr2;
                    z = false;
                    break;
                case 0:
                    kw9VarArr = kw9VarArr2;
                    strV = ud4VarC.v(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    kw9VarArr = kw9VarArr2;
                    strV2 = ud4VarC.v(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    kw9VarArr = kw9VarArr2;
                    strV3 = ud4VarC.v(serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    kw9VarArr = kw9VarArr2;
                    chatEvents$AttachmentSource = (ChatEvents$AttachmentSource) ud4VarC.l(serialDescriptor, 3, (s06) kw9VarArr[3].getValue(), chatEvents$AttachmentSource);
                    i |= 8;
                    break;
                case 4:
                    kw9VarArr = kw9VarArr2;
                    screenSource = (ScreenSource) ud4VarC.l(serialDescriptor, 4, (s06) kw9VarArr[4].getValue(), screenSource);
                    i |= 16;
                    break;
                case 5:
                    kw9VarArr = kw9VarArr2;
                    bool2 = (Boolean) ud4VarC.m(serialDescriptor, 5, zt1.a, bool2);
                    i |= 32;
                    break;
                case 6:
                    kw9VarArr = kw9VarArr2;
                    num2 = (Integer) ud4VarC.m(serialDescriptor, 6, e79.a, num2);
                    i |= 64;
                    break;
                case 7:
                    kw9VarArr = kw9VarArr2;
                    chatEvents$UploadSource = (ChatEvents$UploadSource) ud4VarC.l(serialDescriptor, 7, (s06) kw9VarArr[7].getValue(), chatEvents$UploadSource);
                    i |= FreeTypeConstants.FT_LOAD_PEDANTIC;
                    break;
                case 8:
                    kw9VarArr = kw9VarArr2;
                    bool = (Boolean) ud4VarC.m(serialDescriptor, 8, zt1.a, bool);
                    i |= FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING;
                    break;
                case 9:
                    kw9VarArr = kw9VarArr2;
                    num = (Integer) ud4VarC.m(serialDescriptor, 9, e79.a, num);
                    i |= 512;
                    break;
                default:
                    sz6.e(iX);
                    return null;
            }
            kw9VarArr2 = kw9VarArr;
        }
        ud4VarC.b(serialDescriptor);
        return new ChatEvents$AddImageSuccess(i, strV, strV2, strV3, chatEvents$AttachmentSource, screenSource, bool2, num2, chatEvents$UploadSource, bool, num, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        ChatEvents$AddImageSuccess chatEvents$AddImageSuccess = (ChatEvents$AddImageSuccess) obj;
        encoder.getClass();
        chatEvents$AddImageSuccess.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        ChatEvents$AddImageSuccess.write$Self$analytics(chatEvents$AddImageSuccess, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
