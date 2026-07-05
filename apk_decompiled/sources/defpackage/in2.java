package defpackage;

import com.anthropic.claude.analytics.events.ChatEvents$AddFileFailed;
import com.anthropic.claude.analytics.events.ChatEvents$AddFileFailureReason;
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
public final /* synthetic */ class in2 implements w28 {
    public static final in2 a;
    private static final SerialDescriptor descriptor;

    static {
        in2 in2Var = new in2();
        a = in2Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("mobile_add_attachment_to_conversation_file_failed", in2Var, 12);
        pluginGeneratedSerialDescriptor.j("organization_uuid", false);
        pluginGeneratedSerialDescriptor.j("conversation_uuid", false);
        pluginGeneratedSerialDescriptor.j("uti", false);
        pluginGeneratedSerialDescriptor.j("source", false);
        pluginGeneratedSerialDescriptor.j("screen_source", false);
        pluginGeneratedSerialDescriptor.j("is_wiggle_upload", true);
        pluginGeneratedSerialDescriptor.j("retry_count", true);
        pluginGeneratedSerialDescriptor.j("upload_source", false);
        pluginGeneratedSerialDescriptor.j("reason", false);
        pluginGeneratedSerialDescriptor.j("is_app_backgrounded", true);
        qy1.u(pluginGeneratedSerialDescriptor, "wm_run_attempt", true, "http_status_code", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        kw9[] kw9VarArr = ChatEvents$AddFileFailed.$childSerializers;
        srg srgVar = srg.a;
        zt1 zt1Var = zt1.a;
        e79 e79Var = e79.a;
        return new KSerializer[]{srgVar, srgVar, srgVar, kw9VarArr[3].getValue(), kw9VarArr[4].getValue(), d4c.S(zt1Var), d4c.S(e79Var), kw9VarArr[7].getValue(), kw9VarArr[8].getValue(), d4c.S(zt1Var), d4c.S(e79Var), d4c.S(e79Var)};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        String str;
        boolean z;
        boolean z2;
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr = ChatEvents$AddFileFailed.$childSerializers;
        Integer num = null;
        Integer num2 = null;
        Boolean bool = null;
        ChatEvents$AddFileFailureReason chatEvents$AddFileFailureReason = null;
        boolean z3 = true;
        ChatEvents$UploadSource chatEvents$UploadSource = null;
        int i = 0;
        String strV = null;
        String strV2 = null;
        String strV3 = null;
        ChatEvents$AttachmentSource chatEvents$AttachmentSource = null;
        ScreenSource screenSource = null;
        Boolean bool2 = null;
        Integer num3 = null;
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
                    z = z3;
                    str = strV;
                    screenSource = (ScreenSource) ud4VarC.l(serialDescriptor, 4, (s06) kw9VarArr[4].getValue(), screenSource);
                    i |= 16;
                    z3 = z;
                    strV = str;
                    break;
                case 5:
                    z = z3;
                    str = strV;
                    bool2 = (Boolean) ud4VarC.m(serialDescriptor, 5, zt1.a, bool2);
                    i |= 32;
                    z3 = z;
                    strV = str;
                    break;
                case 6:
                    z = z3;
                    str = strV;
                    num3 = (Integer) ud4VarC.m(serialDescriptor, 6, e79.a, num3);
                    i |= 64;
                    z3 = z;
                    strV = str;
                    break;
                case 7:
                    z = z3;
                    str = strV;
                    chatEvents$UploadSource = (ChatEvents$UploadSource) ud4VarC.l(serialDescriptor, 7, (s06) kw9VarArr[7].getValue(), chatEvents$UploadSource);
                    i |= FreeTypeConstants.FT_LOAD_PEDANTIC;
                    z3 = z;
                    strV = str;
                    break;
                case 8:
                    z = z3;
                    str = strV;
                    chatEvents$AddFileFailureReason = (ChatEvents$AddFileFailureReason) ud4VarC.l(serialDescriptor, 8, (s06) kw9VarArr[8].getValue(), chatEvents$AddFileFailureReason);
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
                    num2 = (Integer) ud4VarC.m(serialDescriptor, 10, e79.a, num2);
                    i |= FreeTypeConstants.FT_LOAD_NO_RECURSE;
                    z3 = z;
                    strV = str;
                    break;
                case 11:
                    z = z3;
                    str = strV;
                    num = (Integer) ud4VarC.m(serialDescriptor, 11, e79.a, num);
                    i |= FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM;
                    z3 = z;
                    strV = str;
                    break;
                default:
                    sz6.e(iX);
                    return null;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new ChatEvents$AddFileFailed(i, strV, strV2, strV3, chatEvents$AttachmentSource, screenSource, bool2, num3, chatEvents$UploadSource, chatEvents$AddFileFailureReason, bool, num2, num, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        ChatEvents$AddFileFailed chatEvents$AddFileFailed = (ChatEvents$AddFileFailed) obj;
        encoder.getClass();
        chatEvents$AddFileFailed.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        ChatEvents$AddFileFailed.write$Self$analytics(chatEvents$AddFileFailed, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
