package defpackage;

import com.anthropic.claude.analytics.events.ChatEvents$AddFileSuccess;
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
public final /* synthetic */ class ln2 implements w28 {
    public static final ln2 a;
    private static final SerialDescriptor descriptor;

    static {
        ln2 ln2Var = new ln2();
        a = ln2Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("mobile_add_attachment_to_conversation_file_success", ln2Var, 11);
        pluginGeneratedSerialDescriptor.j("organization_uuid", false);
        pluginGeneratedSerialDescriptor.j("conversation_uuid", false);
        pluginGeneratedSerialDescriptor.j("uti", false);
        pluginGeneratedSerialDescriptor.j("source", false);
        pluginGeneratedSerialDescriptor.j("extracted_file_size", false);
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
        kw9[] kw9VarArr = ChatEvents$AddFileSuccess.$childSerializers;
        srg srgVar = srg.a;
        zt1 zt1Var = zt1.a;
        e79 e79Var = e79.a;
        return new KSerializer[]{srgVar, srgVar, srgVar, kw9VarArr[3].getValue(), xka.a, kw9VarArr[5].getValue(), d4c.S(zt1Var), d4c.S(e79Var), kw9VarArr[8].getValue(), d4c.S(zt1Var), d4c.S(e79Var)};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        String str;
        boolean z;
        boolean z2;
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr = ChatEvents$AddFileSuccess.$childSerializers;
        long j = 0;
        Integer num = null;
        Boolean bool = null;
        ChatEvents$UploadSource chatEvents$UploadSource = null;
        Integer num2 = null;
        boolean z3 = true;
        ScreenSource screenSource = null;
        Boolean bool2 = null;
        int i = 0;
        String strV = null;
        String strV2 = null;
        String strV3 = null;
        ChatEvents$AttachmentSource chatEvents$AttachmentSource = null;
        while (z3) {
            int iX = ud4VarC.x(serialDescriptor);
            switch (iX) {
                case -1:
                    str = strV;
                    z3 = false;
                    strV = str;
                    break;
                case 0:
                    z2 = z3;
                    i |= 1;
                    strV = ud4VarC.v(serialDescriptor, 0);
                    z3 = z2;
                    break;
                case 1:
                    z2 = z3;
                    strV2 = ud4VarC.v(serialDescriptor, 1);
                    i |= 2;
                    z3 = z2;
                    break;
                case 2:
                    z2 = z3;
                    strV3 = ud4VarC.v(serialDescriptor, 2);
                    i |= 4;
                    z3 = z2;
                    break;
                case 3:
                    z = z3;
                    str = strV;
                    chatEvents$AttachmentSource = (ChatEvents$AttachmentSource) ud4VarC.l(serialDescriptor, 3, (s06) kw9VarArr[3].getValue(), chatEvents$AttachmentSource);
                    i |= 8;
                    z3 = z;
                    strV = str;
                    break;
                case 4:
                    z2 = z3;
                    j = ud4VarC.j(serialDescriptor, 4);
                    i |= 16;
                    z3 = z2;
                    break;
                case 5:
                    z = z3;
                    str = strV;
                    screenSource = (ScreenSource) ud4VarC.l(serialDescriptor, 5, (s06) kw9VarArr[5].getValue(), screenSource);
                    i |= 32;
                    z3 = z;
                    strV = str;
                    break;
                case 6:
                    z = z3;
                    str = strV;
                    bool2 = (Boolean) ud4VarC.m(serialDescriptor, 6, zt1.a, bool2);
                    i |= 64;
                    z3 = z;
                    strV = str;
                    break;
                case 7:
                    z = z3;
                    str = strV;
                    num2 = (Integer) ud4VarC.m(serialDescriptor, 7, e79.a, num2);
                    i |= FreeTypeConstants.FT_LOAD_PEDANTIC;
                    z3 = z;
                    strV = str;
                    break;
                case 8:
                    z = z3;
                    str = strV;
                    chatEvents$UploadSource = (ChatEvents$UploadSource) ud4VarC.l(serialDescriptor, 8, (s06) kw9VarArr[8].getValue(), chatEvents$UploadSource);
                    i |= FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING;
                    z3 = z;
                    strV = str;
                    break;
                case 9:
                    z = z3;
                    str = strV;
                    bool = (Boolean) ud4VarC.m(serialDescriptor, 9, zt1.a, bool);
                    i |= 512;
                    z3 = z;
                    strV = str;
                    break;
                case 10:
                    z = z3;
                    str = strV;
                    num = (Integer) ud4VarC.m(serialDescriptor, 10, e79.a, num);
                    i |= FreeTypeConstants.FT_LOAD_NO_RECURSE;
                    z3 = z;
                    strV = str;
                    break;
                default:
                    sz6.e(iX);
                    return null;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new ChatEvents$AddFileSuccess(i, strV, strV2, strV3, chatEvents$AttachmentSource, j, screenSource, bool2, num2, chatEvents$UploadSource, bool, num, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        ChatEvents$AddFileSuccess chatEvents$AddFileSuccess = (ChatEvents$AddFileSuccess) obj;
        encoder.getClass();
        chatEvents$AddFileSuccess.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        ChatEvents$AddFileSuccess.write$Self$analytics(chatEvents$AddFileSuccess, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
