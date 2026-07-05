package defpackage;

import androidx.health.platform.client.proto.g;
import com.anthropic.claude.analytics.events.ChatEvents$StreamingEndpointType;
import com.anthropic.claude.analytics.events.ChatEvents$StreamingResponseSuccess;
import com.pvporbit.freetype.FreeTypeConstants;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class nr2 implements w28 {
    public static final nr2 a;
    private static final SerialDescriptor descriptor;

    static {
        nr2 nr2Var = new nr2();
        a = nr2Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("mobile_streaming_response_success", nr2Var, 18);
        pluginGeneratedSerialDescriptor.j("organization_uuid", false);
        pluginGeneratedSerialDescriptor.j("conversation_uuid", false);
        pluginGeneratedSerialDescriptor.j("message_id", false);
        pluginGeneratedSerialDescriptor.j("endpoint_type", false);
        pluginGeneratedSerialDescriptor.j("was_in_background", false);
        pluginGeneratedSerialDescriptor.j("content_block_count", false);
        pluginGeneratedSerialDescriptor.j("total_content_length", false);
        pluginGeneratedSerialDescriptor.j("stop_reason", true);
        pluginGeneratedSerialDescriptor.j("document_attachment_count", true);
        pluginGeneratedSerialDescriptor.j("image_attachment_count", true);
        pluginGeneratedSerialDescriptor.j("mm_document_count", true);
        pluginGeneratedSerialDescriptor.j("model", true);
        pluginGeneratedSerialDescriptor.j("time_to_first_token_ms", true);
        pluginGeneratedSerialDescriptor.j("total_time_ms", true);
        pluginGeneratedSerialDescriptor.j("is_free_tier", true);
        pluginGeneratedSerialDescriptor.j("time_in_background_ms", true);
        qy1.u(pluginGeneratedSerialDescriptor, "is_temporary_chat", true, "project_id", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        kw9[] kw9VarArr = ChatEvents$StreamingResponseSuccess.$childSerializers;
        srg srgVar = srg.a;
        zt1 zt1Var = zt1.a;
        e79 e79Var = e79.a;
        xka xkaVar = xka.a;
        return new KSerializer[]{srgVar, srgVar, srgVar, kw9VarArr[3].getValue(), zt1Var, e79Var, e79Var, d4c.S(srgVar), d4c.S(e79Var), d4c.S(e79Var), d4c.S(e79Var), d4c.S(srgVar), d4c.S(xkaVar), d4c.S(xkaVar), d4c.S(zt1Var), d4c.S(xkaVar), d4c.S(zt1Var), d4c.S(srgVar)};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        ChatEvents$StreamingEndpointType chatEvents$StreamingEndpointType;
        int i;
        int i2;
        String str;
        int i3;
        ChatEvents$StreamingEndpointType chatEvents$StreamingEndpointType2;
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr = ChatEvents$StreamingResponseSuccess.$childSerializers;
        String str2 = null;
        Integer num = null;
        Integer num2 = null;
        Integer num3 = null;
        Long l = null;
        String str3 = null;
        int i4 = 0;
        Long l2 = null;
        Boolean bool = null;
        Long l3 = null;
        ChatEvents$StreamingEndpointType chatEvents$StreamingEndpointType3 = null;
        Boolean bool2 = null;
        String str4 = null;
        int iR = 0;
        boolean z = true;
        String strV = null;
        String strV2 = null;
        String strV3 = null;
        boolean zU = false;
        int iR2 = 0;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            switch (iX) {
                case -1:
                    str = str2;
                    i3 = iR;
                    z = false;
                    iR = i3;
                    str2 = str;
                    break;
                case 0:
                    str = str2;
                    i3 = iR;
                    strV = ud4VarC.v(serialDescriptor, 0);
                    i4 |= 1;
                    chatEvents$StreamingEndpointType3 = chatEvents$StreamingEndpointType3;
                    iR = i3;
                    str2 = str;
                    break;
                case 1:
                    str = str2;
                    chatEvents$StreamingEndpointType2 = chatEvents$StreamingEndpointType3;
                    strV2 = ud4VarC.v(serialDescriptor, 1);
                    i4 |= 2;
                    chatEvents$StreamingEndpointType3 = chatEvents$StreamingEndpointType2;
                    str2 = str;
                    break;
                case 2:
                    str = str2;
                    chatEvents$StreamingEndpointType2 = chatEvents$StreamingEndpointType3;
                    strV3 = ud4VarC.v(serialDescriptor, 2);
                    i4 |= 4;
                    chatEvents$StreamingEndpointType3 = chatEvents$StreamingEndpointType2;
                    str2 = str;
                    break;
                case 3:
                    i3 = iR;
                    str = str2;
                    chatEvents$StreamingEndpointType3 = (ChatEvents$StreamingEndpointType) ud4VarC.l(serialDescriptor, 3, (s06) kw9VarArr[3].getValue(), chatEvents$StreamingEndpointType3);
                    i4 |= 8;
                    iR = i3;
                    str2 = str;
                    break;
                case 4:
                    chatEvents$StreamingEndpointType = chatEvents$StreamingEndpointType3;
                    zU = ud4VarC.u(serialDescriptor, 4);
                    i4 |= 16;
                    chatEvents$StreamingEndpointType3 = chatEvents$StreamingEndpointType;
                    break;
                case 5:
                    chatEvents$StreamingEndpointType = chatEvents$StreamingEndpointType3;
                    iR2 = ud4VarC.r(serialDescriptor, 5);
                    i4 |= 32;
                    chatEvents$StreamingEndpointType3 = chatEvents$StreamingEndpointType;
                    break;
                case 6:
                    chatEvents$StreamingEndpointType = chatEvents$StreamingEndpointType3;
                    iR = ud4VarC.r(serialDescriptor, 6);
                    i4 |= 64;
                    chatEvents$StreamingEndpointType3 = chatEvents$StreamingEndpointType;
                    break;
                case 7:
                    chatEvents$StreamingEndpointType = chatEvents$StreamingEndpointType3;
                    i = iR;
                    str3 = (String) ud4VarC.m(serialDescriptor, 7, srg.a, str3);
                    i4 |= FreeTypeConstants.FT_LOAD_PEDANTIC;
                    iR = i;
                    chatEvents$StreamingEndpointType3 = chatEvents$StreamingEndpointType;
                    break;
                case 8:
                    chatEvents$StreamingEndpointType = chatEvents$StreamingEndpointType3;
                    i = iR;
                    num3 = (Integer) ud4VarC.m(serialDescriptor, 8, e79.a, num3);
                    i4 |= FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING;
                    iR = i;
                    chatEvents$StreamingEndpointType3 = chatEvents$StreamingEndpointType;
                    break;
                case 9:
                    chatEvents$StreamingEndpointType = chatEvents$StreamingEndpointType3;
                    i = iR;
                    num2 = (Integer) ud4VarC.m(serialDescriptor, 9, e79.a, num2);
                    i4 |= 512;
                    iR = i;
                    chatEvents$StreamingEndpointType3 = chatEvents$StreamingEndpointType;
                    break;
                case 10:
                    chatEvents$StreamingEndpointType = chatEvents$StreamingEndpointType3;
                    i = iR;
                    num = (Integer) ud4VarC.m(serialDescriptor, 10, e79.a, num);
                    i4 |= FreeTypeConstants.FT_LOAD_NO_RECURSE;
                    iR = i;
                    chatEvents$StreamingEndpointType3 = chatEvents$StreamingEndpointType;
                    break;
                case 11:
                    chatEvents$StreamingEndpointType = chatEvents$StreamingEndpointType3;
                    i = iR;
                    str2 = (String) ud4VarC.m(serialDescriptor, 11, srg.a, str2);
                    i4 |= FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM;
                    iR = i;
                    chatEvents$StreamingEndpointType3 = chatEvents$StreamingEndpointType;
                    break;
                case 12:
                    chatEvents$StreamingEndpointType = chatEvents$StreamingEndpointType3;
                    i = iR;
                    l = (Long) ud4VarC.m(serialDescriptor, 12, xka.a, l);
                    i4 |= FreeTypeConstants.FT_LOAD_MONOCHROME;
                    iR = i;
                    chatEvents$StreamingEndpointType3 = chatEvents$StreamingEndpointType;
                    break;
                case 13:
                    chatEvents$StreamingEndpointType = chatEvents$StreamingEndpointType3;
                    i = iR;
                    l2 = (Long) ud4VarC.m(serialDescriptor, 13, xka.a, l2);
                    i4 |= FreeTypeConstants.FT_LOAD_LINEAR_DESIGN;
                    iR = i;
                    chatEvents$StreamingEndpointType3 = chatEvents$StreamingEndpointType;
                    break;
                case 14:
                    chatEvents$StreamingEndpointType = chatEvents$StreamingEndpointType3;
                    i = iR;
                    bool = (Boolean) ud4VarC.m(serialDescriptor, 14, zt1.a, bool);
                    i4 |= 16384;
                    iR = i;
                    chatEvents$StreamingEndpointType3 = chatEvents$StreamingEndpointType;
                    break;
                case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                    chatEvents$StreamingEndpointType = chatEvents$StreamingEndpointType3;
                    i = iR;
                    l3 = (Long) ud4VarC.m(serialDescriptor, 15, xka.a, l3);
                    i2 = FreeTypeConstants.FT_LOAD_NO_AUTOHINT;
                    i4 |= i2;
                    iR = i;
                    chatEvents$StreamingEndpointType3 = chatEvents$StreamingEndpointType;
                    break;
                case 16:
                    chatEvents$StreamingEndpointType = chatEvents$StreamingEndpointType3;
                    i = iR;
                    bool2 = (Boolean) ud4VarC.m(serialDescriptor, 16, zt1.a, bool2);
                    i2 = 65536;
                    i4 |= i2;
                    iR = i;
                    chatEvents$StreamingEndpointType3 = chatEvents$StreamingEndpointType;
                    break;
                case g.MAX_FIELD_NUMBER /* 17 */:
                    i = iR;
                    chatEvents$StreamingEndpointType = chatEvents$StreamingEndpointType3;
                    str4 = (String) ud4VarC.m(serialDescriptor, 17, srg.a, str4);
                    i2 = 131072;
                    i4 |= i2;
                    iR = i;
                    chatEvents$StreamingEndpointType3 = chatEvents$StreamingEndpointType;
                    break;
                default:
                    sz6.e(iX);
                    return null;
            }
        }
        String str5 = str2;
        ud4VarC.b(serialDescriptor);
        Boolean bool3 = bool2;
        return new ChatEvents$StreamingResponseSuccess(i4, strV, strV2, strV3, chatEvents$StreamingEndpointType3, zU, iR2, iR, str3, num3, num2, num, str5, l, l2, bool, l3, bool3, str4, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        ChatEvents$StreamingResponseSuccess chatEvents$StreamingResponseSuccess = (ChatEvents$StreamingResponseSuccess) obj;
        encoder.getClass();
        chatEvents$StreamingResponseSuccess.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        ChatEvents$StreamingResponseSuccess.write$Self$analytics(chatEvents$StreamingResponseSuccess, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
