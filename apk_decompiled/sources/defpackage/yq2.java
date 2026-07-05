package defpackage;

import androidx.health.platform.client.proto.g;
import com.anthropic.claude.analytics.events.ChatEvents$SendMessageFailed;
import com.anthropic.claude.analytics.events.ChatEvents$SendMessageFailureReason;
import com.anthropic.claude.analytics.events.ChatEvents$StreamingEndpointType;
import com.anthropic.claude.analytics.events.ChatEvents$StreamingErrorSource;
import com.pvporbit.freetype.FreeTypeConstants;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import siftscience.android.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class yq2 implements w28 {
    public static final yq2 a;
    private static final SerialDescriptor descriptor;

    static {
        yq2 yq2Var = new yq2();
        a = yq2Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("mobile_send_message_failed", yq2Var, 32);
        pluginGeneratedSerialDescriptor.j("organization_uuid", false);
        pluginGeneratedSerialDescriptor.j("conversation_uuid", false);
        pluginGeneratedSerialDescriptor.j("document_attachment_count", false);
        pluginGeneratedSerialDescriptor.j("image_attachment_count", false);
        pluginGeneratedSerialDescriptor.j("mm_document_count", false);
        pluginGeneratedSerialDescriptor.j("reason", false);
        pluginGeneratedSerialDescriptor.j("is_retry_message", false);
        pluginGeneratedSerialDescriptor.j("is_partial_response", false);
        pluginGeneratedSerialDescriptor.j("cause", false);
        pluginGeneratedSerialDescriptor.j("model", true);
        pluginGeneratedSerialDescriptor.j("edit_message_id", true);
        pluginGeneratedSerialDescriptor.j("project_id", true);
        pluginGeneratedSerialDescriptor.j("auto_recovered", true);
        pluginGeneratedSerialDescriptor.j("error_message", true);
        pluginGeneratedSerialDescriptor.j("error_type", true);
        pluginGeneratedSerialDescriptor.j("error_http_code", true);
        pluginGeneratedSerialDescriptor.j("stop_reason", true);
        pluginGeneratedSerialDescriptor.j("was_in_background", true);
        pluginGeneratedSerialDescriptor.j("error_source", true);
        pluginGeneratedSerialDescriptor.j("endpoint_type", true);
        pluginGeneratedSerialDescriptor.j("message_uuid", true);
        pluginGeneratedSerialDescriptor.j("content_block_count", true);
        pluginGeneratedSerialDescriptor.j("total_content_length", true);
        pluginGeneratedSerialDescriptor.j("time_to_first_token_ms", true);
        pluginGeneratedSerialDescriptor.j("total_time_ms", true);
        pluginGeneratedSerialDescriptor.j("total_conversation_messages", true);
        pluginGeneratedSerialDescriptor.j("total_conversation_content_length_estimate", true);
        pluginGeneratedSerialDescriptor.j("is_free_tier", true);
        pluginGeneratedSerialDescriptor.j("time_in_background_ms", true);
        pluginGeneratedSerialDescriptor.j("is_temporary_chat", true);
        qy1.u(pluginGeneratedSerialDescriptor, "error_code", true, "error_request_id", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        kw9[] kw9VarArr = ChatEvents$SendMessageFailed.$childSerializers;
        srg srgVar = srg.a;
        e79 e79Var = e79.a;
        zt1 zt1Var = zt1.a;
        xka xkaVar = xka.a;
        return new KSerializer[]{srgVar, srgVar, e79Var, e79Var, e79Var, kw9VarArr[5].getValue(), zt1Var, zt1Var, srgVar, d4c.S(srgVar), d4c.S(srgVar), d4c.S(srgVar), d4c.S(zt1Var), d4c.S(srgVar), d4c.S(srgVar), d4c.S(e79Var), d4c.S(srgVar), d4c.S(zt1Var), d4c.S((KSerializer) kw9VarArr[18].getValue()), d4c.S((KSerializer) kw9VarArr[19].getValue()), d4c.S(srgVar), d4c.S(e79Var), d4c.S(e79Var), d4c.S(xkaVar), d4c.S(xkaVar), d4c.S(e79Var), d4c.S(e79Var), d4c.S(zt1Var), d4c.S(xkaVar), d4c.S(zt1Var), d4c.S(srgVar), d4c.S(srgVar)};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        Long l;
        ChatEvents$StreamingErrorSource chatEvents$StreamingErrorSource;
        ChatEvents$StreamingEndpointType chatEvents$StreamingEndpointType;
        int i;
        String str;
        Integer num;
        Integer num2;
        ChatEvents$StreamingErrorSource chatEvents$StreamingErrorSource2;
        String str2;
        Integer num3;
        int i2;
        ChatEvents$StreamingErrorSource chatEvents$StreamingErrorSource3;
        int i3;
        int i4;
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr = ChatEvents$SendMessageFailed.$childSerializers;
        Long l2 = null;
        Integer num4 = null;
        Integer num5 = null;
        Long l3 = null;
        Boolean bool = null;
        Integer num6 = null;
        Boolean bool2 = null;
        Long l4 = null;
        String str3 = null;
        String str4 = null;
        ChatEvents$StreamingErrorSource chatEvents$StreamingErrorSource4 = null;
        ChatEvents$StreamingEndpointType chatEvents$StreamingEndpointType2 = null;
        String str5 = null;
        Integer num7 = null;
        boolean zU = false;
        boolean zU2 = false;
        String strV = null;
        boolean z = true;
        String strV2 = null;
        String strV3 = null;
        int iR = 0;
        int iR2 = 0;
        int iR3 = 0;
        ChatEvents$SendMessageFailureReason chatEvents$SendMessageFailureReason = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        Boolean bool3 = null;
        String str9 = null;
        int i5 = 0;
        String str10 = null;
        Integer num8 = null;
        String str11 = null;
        Boolean bool4 = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            switch (iX) {
                case -1:
                    l = l2;
                    chatEvents$StreamingErrorSource = chatEvents$StreamingErrorSource4;
                    chatEvents$StreamingEndpointType = chatEvents$StreamingEndpointType2;
                    i = i5;
                    str = str10;
                    num = num4;
                    z = false;
                    num4 = num;
                    str10 = str;
                    i5 = i;
                    chatEvents$StreamingErrorSource4 = chatEvents$StreamingErrorSource;
                    chatEvents$StreamingEndpointType2 = chatEvents$StreamingEndpointType;
                    l2 = l;
                    break;
                case 0:
                    l = l2;
                    chatEvents$StreamingErrorSource = chatEvents$StreamingErrorSource4;
                    chatEvents$StreamingEndpointType = chatEvents$StreamingEndpointType2;
                    int i6 = i5;
                    str = str10;
                    num = num4;
                    i = i6 | 1;
                    strV2 = ud4VarC.v(serialDescriptor, 0);
                    num4 = num;
                    str10 = str;
                    i5 = i;
                    chatEvents$StreamingErrorSource4 = chatEvents$StreamingErrorSource;
                    chatEvents$StreamingEndpointType2 = chatEvents$StreamingEndpointType;
                    l2 = l;
                    break;
                case 1:
                    l = l2;
                    chatEvents$StreamingErrorSource = chatEvents$StreamingErrorSource4;
                    chatEvents$StreamingEndpointType = chatEvents$StreamingEndpointType2;
                    int i7 = i5;
                    str = str10;
                    i = i7 | 2;
                    strV3 = ud4VarC.v(serialDescriptor, 1);
                    num4 = num4;
                    str10 = str;
                    i5 = i;
                    chatEvents$StreamingErrorSource4 = chatEvents$StreamingErrorSource;
                    chatEvents$StreamingEndpointType2 = chatEvents$StreamingEndpointType;
                    l2 = l;
                    break;
                case 2:
                    l = l2;
                    chatEvents$StreamingErrorSource = chatEvents$StreamingErrorSource4;
                    chatEvents$StreamingEndpointType = chatEvents$StreamingEndpointType2;
                    int i8 = i5;
                    str = str10;
                    num2 = num4;
                    i = i8 | 4;
                    iR = ud4VarC.r(serialDescriptor, 2);
                    num4 = num2;
                    str10 = str;
                    i5 = i;
                    chatEvents$StreamingErrorSource4 = chatEvents$StreamingErrorSource;
                    chatEvents$StreamingEndpointType2 = chatEvents$StreamingEndpointType;
                    l2 = l;
                    break;
                case 3:
                    l = l2;
                    chatEvents$StreamingErrorSource2 = chatEvents$StreamingErrorSource4;
                    chatEvents$StreamingEndpointType = chatEvents$StreamingEndpointType2;
                    int i9 = i5;
                    str2 = str10;
                    num3 = num4;
                    i2 = i9 | 8;
                    iR2 = ud4VarC.r(serialDescriptor, 3);
                    num4 = num3;
                    chatEvents$StreamingErrorSource4 = chatEvents$StreamingErrorSource2;
                    str10 = str2;
                    i5 = i2;
                    chatEvents$StreamingEndpointType2 = chatEvents$StreamingEndpointType;
                    l2 = l;
                    break;
                case 4:
                    l = l2;
                    chatEvents$StreamingErrorSource = chatEvents$StreamingErrorSource4;
                    chatEvents$StreamingEndpointType = chatEvents$StreamingEndpointType2;
                    int i10 = i5;
                    str = str10;
                    num2 = num4;
                    i = i10 | 16;
                    iR3 = ud4VarC.r(serialDescriptor, 4);
                    num4 = num2;
                    str10 = str;
                    i5 = i;
                    chatEvents$StreamingErrorSource4 = chatEvents$StreamingErrorSource;
                    chatEvents$StreamingEndpointType2 = chatEvents$StreamingEndpointType;
                    l2 = l;
                    break;
                case 5:
                    l = l2;
                    chatEvents$StreamingErrorSource3 = chatEvents$StreamingErrorSource4;
                    chatEvents$StreamingEndpointType = chatEvents$StreamingEndpointType2;
                    int i11 = i5;
                    i5 = i11 | 32;
                    num4 = num4;
                    str10 = str10;
                    chatEvents$SendMessageFailureReason = (ChatEvents$SendMessageFailureReason) ud4VarC.l(serialDescriptor, 5, (s06) kw9VarArr[5].getValue(), chatEvents$SendMessageFailureReason);
                    chatEvents$StreamingErrorSource4 = chatEvents$StreamingErrorSource3;
                    chatEvents$StreamingEndpointType2 = chatEvents$StreamingEndpointType;
                    l2 = l;
                    break;
                case 6:
                    l = l2;
                    chatEvents$StreamingErrorSource2 = chatEvents$StreamingErrorSource4;
                    chatEvents$StreamingEndpointType = chatEvents$StreamingEndpointType2;
                    int i12 = i5;
                    str2 = str10;
                    num3 = num4;
                    zU = ud4VarC.u(serialDescriptor, 6);
                    i2 = i12 | 64;
                    num4 = num3;
                    chatEvents$StreamingErrorSource4 = chatEvents$StreamingErrorSource2;
                    str10 = str2;
                    i5 = i2;
                    chatEvents$StreamingEndpointType2 = chatEvents$StreamingEndpointType;
                    l2 = l;
                    break;
                case 7:
                    l = l2;
                    chatEvents$StreamingErrorSource2 = chatEvents$StreamingErrorSource4;
                    chatEvents$StreamingEndpointType = chatEvents$StreamingEndpointType2;
                    int i13 = i5;
                    str2 = str10;
                    num3 = num4;
                    zU2 = ud4VarC.u(serialDescriptor, 7);
                    i2 = i13 | FreeTypeConstants.FT_LOAD_PEDANTIC;
                    num4 = num3;
                    chatEvents$StreamingErrorSource4 = chatEvents$StreamingErrorSource2;
                    str10 = str2;
                    i5 = i2;
                    chatEvents$StreamingEndpointType2 = chatEvents$StreamingEndpointType;
                    l2 = l;
                    break;
                case 8:
                    l = l2;
                    chatEvents$StreamingErrorSource2 = chatEvents$StreamingErrorSource4;
                    chatEvents$StreamingEndpointType = chatEvents$StreamingEndpointType2;
                    int i14 = i5;
                    str2 = str10;
                    num3 = num4;
                    strV = ud4VarC.v(serialDescriptor, 8);
                    i2 = i14 | FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING;
                    num4 = num3;
                    chatEvents$StreamingErrorSource4 = chatEvents$StreamingErrorSource2;
                    str10 = str2;
                    i5 = i2;
                    chatEvents$StreamingEndpointType2 = chatEvents$StreamingEndpointType;
                    l2 = l;
                    break;
                case 9:
                    l = l2;
                    chatEvents$StreamingErrorSource3 = chatEvents$StreamingErrorSource4;
                    chatEvents$StreamingEndpointType = chatEvents$StreamingEndpointType2;
                    int i15 = i5;
                    i5 = i15 | 512;
                    num4 = num4;
                    str10 = str10;
                    str6 = (String) ud4VarC.m(serialDescriptor, 9, srg.a, str6);
                    chatEvents$StreamingErrorSource4 = chatEvents$StreamingErrorSource3;
                    chatEvents$StreamingEndpointType2 = chatEvents$StreamingEndpointType;
                    l2 = l;
                    break;
                case 10:
                    l = l2;
                    chatEvents$StreamingErrorSource3 = chatEvents$StreamingErrorSource4;
                    chatEvents$StreamingEndpointType = chatEvents$StreamingEndpointType2;
                    int i16 = i5;
                    String str12 = (String) ud4VarC.m(serialDescriptor, 10, srg.a, str7);
                    i5 = i16 | FreeTypeConstants.FT_LOAD_NO_RECURSE;
                    num4 = num4;
                    str10 = str10;
                    str7 = str12;
                    chatEvents$StreamingErrorSource4 = chatEvents$StreamingErrorSource3;
                    chatEvents$StreamingEndpointType2 = chatEvents$StreamingEndpointType;
                    l2 = l;
                    break;
                case 11:
                    l = l2;
                    chatEvents$StreamingErrorSource3 = chatEvents$StreamingErrorSource4;
                    chatEvents$StreamingEndpointType = chatEvents$StreamingEndpointType2;
                    int i17 = i5;
                    String str13 = (String) ud4VarC.m(serialDescriptor, 11, srg.a, str8);
                    i5 = i17 | FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM;
                    num4 = num4;
                    str10 = str10;
                    str8 = str13;
                    chatEvents$StreamingErrorSource4 = chatEvents$StreamingErrorSource3;
                    chatEvents$StreamingEndpointType2 = chatEvents$StreamingEndpointType;
                    l2 = l;
                    break;
                case 12:
                    l = l2;
                    chatEvents$StreamingErrorSource3 = chatEvents$StreamingErrorSource4;
                    chatEvents$StreamingEndpointType = chatEvents$StreamingEndpointType2;
                    int i18 = i5;
                    Boolean bool5 = (Boolean) ud4VarC.m(serialDescriptor, 12, zt1.a, bool3);
                    i5 = i18 | FreeTypeConstants.FT_LOAD_MONOCHROME;
                    num4 = num4;
                    str10 = str10;
                    bool3 = bool5;
                    chatEvents$StreamingErrorSource4 = chatEvents$StreamingErrorSource3;
                    chatEvents$StreamingEndpointType2 = chatEvents$StreamingEndpointType;
                    l2 = l;
                    break;
                case 13:
                    l = l2;
                    chatEvents$StreamingErrorSource2 = chatEvents$StreamingErrorSource4;
                    chatEvents$StreamingEndpointType = chatEvents$StreamingEndpointType2;
                    int i19 = i5;
                    str2 = str10;
                    num3 = num4;
                    String str14 = (String) ud4VarC.m(serialDescriptor, 13, srg.a, str9);
                    i2 = i19 | FreeTypeConstants.FT_LOAD_LINEAR_DESIGN;
                    str9 = str14;
                    num4 = num3;
                    chatEvents$StreamingErrorSource4 = chatEvents$StreamingErrorSource2;
                    str10 = str2;
                    i5 = i2;
                    chatEvents$StreamingEndpointType2 = chatEvents$StreamingEndpointType;
                    l2 = l;
                    break;
                case 14:
                    l = l2;
                    chatEvents$StreamingErrorSource3 = chatEvents$StreamingErrorSource4;
                    chatEvents$StreamingEndpointType = chatEvents$StreamingEndpointType2;
                    i3 = i5 | 16384;
                    str10 = (String) ud4VarC.m(serialDescriptor, 14, srg.a, str10);
                    i5 = i3;
                    chatEvents$StreamingErrorSource4 = chatEvents$StreamingErrorSource3;
                    chatEvents$StreamingEndpointType2 = chatEvents$StreamingEndpointType;
                    l2 = l;
                    break;
                case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                    l = l2;
                    chatEvents$StreamingErrorSource3 = chatEvents$StreamingErrorSource4;
                    chatEvents$StreamingEndpointType = chatEvents$StreamingEndpointType2;
                    Integer num9 = (Integer) ud4VarC.m(serialDescriptor, 15, e79.a, num8);
                    i3 = i5 | FreeTypeConstants.FT_LOAD_NO_AUTOHINT;
                    num8 = num9;
                    i5 = i3;
                    chatEvents$StreamingErrorSource4 = chatEvents$StreamingErrorSource3;
                    chatEvents$StreamingEndpointType2 = chatEvents$StreamingEndpointType;
                    l2 = l;
                    break;
                case 16:
                    l = l2;
                    chatEvents$StreamingErrorSource3 = chatEvents$StreamingErrorSource4;
                    chatEvents$StreamingEndpointType = chatEvents$StreamingEndpointType2;
                    i3 = i5 | 65536;
                    str11 = (String) ud4VarC.m(serialDescriptor, 16, srg.a, str11);
                    i5 = i3;
                    chatEvents$StreamingErrorSource4 = chatEvents$StreamingErrorSource3;
                    chatEvents$StreamingEndpointType2 = chatEvents$StreamingEndpointType;
                    l2 = l;
                    break;
                case g.MAX_FIELD_NUMBER /* 17 */:
                    l = l2;
                    chatEvents$StreamingEndpointType = chatEvents$StreamingEndpointType2;
                    chatEvents$StreamingErrorSource3 = chatEvents$StreamingErrorSource4;
                    i3 = i5 | 131072;
                    bool4 = (Boolean) ud4VarC.m(serialDescriptor, 17, zt1.a, bool4);
                    i5 = i3;
                    chatEvents$StreamingErrorSource4 = chatEvents$StreamingErrorSource3;
                    chatEvents$StreamingEndpointType2 = chatEvents$StreamingEndpointType;
                    l2 = l;
                    break;
                case g.AVG_FIELD_NUMBER /* 18 */:
                    l = l2;
                    chatEvents$StreamingEndpointType = chatEvents$StreamingEndpointType2;
                    chatEvents$StreamingErrorSource4 = (ChatEvents$StreamingErrorSource) ud4VarC.m(serialDescriptor, 18, (s06) kw9VarArr[18].getValue(), chatEvents$StreamingErrorSource4);
                    i5 |= 262144;
                    chatEvents$StreamingEndpointType2 = chatEvents$StreamingEndpointType;
                    l2 = l;
                    break;
                case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                    chatEvents$StreamingErrorSource3 = chatEvents$StreamingErrorSource4;
                    l = l2;
                    i5 |= 524288;
                    chatEvents$StreamingEndpointType = (ChatEvents$StreamingEndpointType) ud4VarC.m(serialDescriptor, 19, (s06) kw9VarArr[19].getValue(), chatEvents$StreamingEndpointType2);
                    chatEvents$StreamingErrorSource4 = chatEvents$StreamingErrorSource3;
                    chatEvents$StreamingEndpointType2 = chatEvents$StreamingEndpointType;
                    l2 = l;
                    break;
                case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                    chatEvents$StreamingErrorSource3 = chatEvents$StreamingErrorSource4;
                    chatEvents$StreamingEndpointType = chatEvents$StreamingEndpointType2;
                    str5 = (String) ud4VarC.m(serialDescriptor, 20, srg.a, str5);
                    i4 = FreeTypeConstants.FT_LOAD_COLOR;
                    i3 = i5 | i4;
                    l = l2;
                    i5 = i3;
                    chatEvents$StreamingErrorSource4 = chatEvents$StreamingErrorSource3;
                    chatEvents$StreamingEndpointType2 = chatEvents$StreamingEndpointType;
                    l2 = l;
                    break;
                case 21:
                    chatEvents$StreamingErrorSource3 = chatEvents$StreamingErrorSource4;
                    chatEvents$StreamingEndpointType = chatEvents$StreamingEndpointType2;
                    num7 = (Integer) ud4VarC.m(serialDescriptor, 21, e79.a, num7);
                    i4 = FreeTypeConstants.FT_LOAD_COMPUTE_METRICS;
                    i3 = i5 | i4;
                    l = l2;
                    i5 = i3;
                    chatEvents$StreamingErrorSource4 = chatEvents$StreamingErrorSource3;
                    chatEvents$StreamingEndpointType2 = chatEvents$StreamingEndpointType;
                    l2 = l;
                    break;
                case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                    chatEvents$StreamingErrorSource3 = chatEvents$StreamingErrorSource4;
                    chatEvents$StreamingEndpointType = chatEvents$StreamingEndpointType2;
                    num6 = (Integer) ud4VarC.m(serialDescriptor, 22, e79.a, num6);
                    i4 = 4194304;
                    i3 = i5 | i4;
                    l = l2;
                    i5 = i3;
                    chatEvents$StreamingErrorSource4 = chatEvents$StreamingErrorSource3;
                    chatEvents$StreamingEndpointType2 = chatEvents$StreamingEndpointType;
                    l2 = l;
                    break;
                case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                    chatEvents$StreamingErrorSource3 = chatEvents$StreamingErrorSource4;
                    chatEvents$StreamingEndpointType = chatEvents$StreamingEndpointType2;
                    l4 = (Long) ud4VarC.m(serialDescriptor, 23, xka.a, l4);
                    i4 = 8388608;
                    i3 = i5 | i4;
                    l = l2;
                    i5 = i3;
                    chatEvents$StreamingErrorSource4 = chatEvents$StreamingErrorSource3;
                    chatEvents$StreamingEndpointType2 = chatEvents$StreamingEndpointType;
                    l2 = l;
                    break;
                case 24:
                    chatEvents$StreamingErrorSource3 = chatEvents$StreamingErrorSource4;
                    chatEvents$StreamingEndpointType = chatEvents$StreamingEndpointType2;
                    l3 = (Long) ud4VarC.m(serialDescriptor, 24, xka.a, l3);
                    i4 = 16777216;
                    i3 = i5 | i4;
                    l = l2;
                    i5 = i3;
                    chatEvents$StreamingErrorSource4 = chatEvents$StreamingErrorSource3;
                    chatEvents$StreamingEndpointType2 = chatEvents$StreamingEndpointType;
                    l2 = l;
                    break;
                case BuildConfig.VERSION_CODE /* 25 */:
                    chatEvents$StreamingErrorSource3 = chatEvents$StreamingErrorSource4;
                    chatEvents$StreamingEndpointType = chatEvents$StreamingEndpointType2;
                    num5 = (Integer) ud4VarC.m(serialDescriptor, 25, e79.a, num5);
                    i4 = 33554432;
                    i3 = i5 | i4;
                    l = l2;
                    i5 = i3;
                    chatEvents$StreamingErrorSource4 = chatEvents$StreamingErrorSource3;
                    chatEvents$StreamingEndpointType2 = chatEvents$StreamingEndpointType;
                    l2 = l;
                    break;
                case 26:
                    chatEvents$StreamingErrorSource3 = chatEvents$StreamingErrorSource4;
                    chatEvents$StreamingEndpointType = chatEvents$StreamingEndpointType2;
                    num4 = (Integer) ud4VarC.m(serialDescriptor, 26, e79.a, num4);
                    i4 = 67108864;
                    i3 = i5 | i4;
                    l = l2;
                    i5 = i3;
                    chatEvents$StreamingErrorSource4 = chatEvents$StreamingErrorSource3;
                    chatEvents$StreamingEndpointType2 = chatEvents$StreamingEndpointType;
                    l2 = l;
                    break;
                case 27:
                    chatEvents$StreamingErrorSource3 = chatEvents$StreamingErrorSource4;
                    chatEvents$StreamingEndpointType = chatEvents$StreamingEndpointType2;
                    bool2 = (Boolean) ud4VarC.m(serialDescriptor, 27, zt1.a, bool2);
                    i4 = 134217728;
                    i3 = i5 | i4;
                    l = l2;
                    i5 = i3;
                    chatEvents$StreamingErrorSource4 = chatEvents$StreamingErrorSource3;
                    chatEvents$StreamingEndpointType2 = chatEvents$StreamingEndpointType;
                    l2 = l;
                    break;
                case 28:
                    chatEvents$StreamingErrorSource3 = chatEvents$StreamingErrorSource4;
                    chatEvents$StreamingEndpointType = chatEvents$StreamingEndpointType2;
                    l2 = (Long) ud4VarC.m(serialDescriptor, 28, xka.a, l2);
                    i4 = 268435456;
                    i3 = i5 | i4;
                    l = l2;
                    i5 = i3;
                    chatEvents$StreamingErrorSource4 = chatEvents$StreamingErrorSource3;
                    chatEvents$StreamingEndpointType2 = chatEvents$StreamingEndpointType;
                    l2 = l;
                    break;
                case 29:
                    chatEvents$StreamingErrorSource3 = chatEvents$StreamingErrorSource4;
                    chatEvents$StreamingEndpointType = chatEvents$StreamingEndpointType2;
                    bool = (Boolean) ud4VarC.m(serialDescriptor, 29, zt1.a, bool);
                    i4 = 536870912;
                    i3 = i5 | i4;
                    l = l2;
                    i5 = i3;
                    chatEvents$StreamingErrorSource4 = chatEvents$StreamingErrorSource3;
                    chatEvents$StreamingEndpointType2 = chatEvents$StreamingEndpointType;
                    l2 = l;
                    break;
                case 30:
                    chatEvents$StreamingErrorSource3 = chatEvents$StreamingErrorSource4;
                    chatEvents$StreamingEndpointType = chatEvents$StreamingEndpointType2;
                    str3 = (String) ud4VarC.m(serialDescriptor, 30, srg.a, str3);
                    i4 = 1073741824;
                    i3 = i5 | i4;
                    l = l2;
                    i5 = i3;
                    chatEvents$StreamingErrorSource4 = chatEvents$StreamingErrorSource3;
                    chatEvents$StreamingEndpointType2 = chatEvents$StreamingEndpointType;
                    l2 = l;
                    break;
                case 31:
                    chatEvents$StreamingErrorSource3 = chatEvents$StreamingErrorSource4;
                    chatEvents$StreamingEndpointType = chatEvents$StreamingEndpointType2;
                    str4 = (String) ud4VarC.m(serialDescriptor, 31, srg.a, str4);
                    i4 = Integer.MIN_VALUE;
                    i3 = i5 | i4;
                    l = l2;
                    i5 = i3;
                    chatEvents$StreamingErrorSource4 = chatEvents$StreamingErrorSource3;
                    chatEvents$StreamingEndpointType2 = chatEvents$StreamingEndpointType;
                    l2 = l;
                    break;
                default:
                    sz6.e(iX);
                    return null;
            }
        }
        ChatEvents$StreamingErrorSource chatEvents$StreamingErrorSource5 = chatEvents$StreamingErrorSource4;
        ChatEvents$StreamingEndpointType chatEvents$StreamingEndpointType3 = chatEvents$StreamingEndpointType2;
        int i20 = i5;
        String str15 = str10;
        Integer num10 = num4;
        ChatEvents$SendMessageFailureReason chatEvents$SendMessageFailureReason2 = chatEvents$SendMessageFailureReason;
        ud4VarC.b(serialDescriptor);
        return new ChatEvents$SendMessageFailed(i20, 0, strV2, strV3, iR, iR2, iR3, chatEvents$SendMessageFailureReason2, zU, zU2, strV, str6, str7, str8, bool3, str9, str15, num8, str11, bool4, chatEvents$StreamingErrorSource5, chatEvents$StreamingEndpointType3, str5, num7, num6, l4, l3, num5, num10, bool2, l2, bool, str3, str4, null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        ChatEvents$SendMessageFailed chatEvents$SendMessageFailed = (ChatEvents$SendMessageFailed) obj;
        encoder.getClass();
        chatEvents$SendMessageFailed.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        ChatEvents$SendMessageFailed.write$Self$analytics(chatEvents$SendMessageFailed, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
