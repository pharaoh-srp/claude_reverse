package defpackage;

import androidx.health.platform.client.proto.g;
import com.anthropic.claude.analytics.events.ClaudeAiMessageEvents$FailureStage;
import com.anthropic.claude.analytics.events.ClaudeAiMessageEvents$FailureType;
import com.anthropic.claude.analytics.events.ClaudeAiMessageEvents$MessageResponseFailed;
import com.anthropic.claude.analytics.events.ClaudeAiMessageEvents$ResearchMode;
import com.pvporbit.freetype.FreeTypeConstants;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class hi3 implements w28 {
    public static final hi3 a;
    private static final SerialDescriptor descriptor;

    static {
        hi3 hi3Var = new hi3();
        a = hi3Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("claudeai.message.response_failed", hi3Var, 25);
        pluginGeneratedSerialDescriptor.j("time_to_failure_ms", false);
        pluginGeneratedSerialDescriptor.j("conversation_uuid", true);
        pluginGeneratedSerialDescriptor.j("human_message_uuid", false);
        pluginGeneratedSerialDescriptor.j("model", true);
        pluginGeneratedSerialDescriptor.j("message_index", false);
        pluginGeneratedSerialDescriptor.j("message_length", false);
        pluginGeneratedSerialDescriptor.j("is_new_conversation", false);
        pluginGeneratedSerialDescriptor.j("is_retry", false);
        pluginGeneratedSerialDescriptor.j("is_incognito", false);
        pluginGeneratedSerialDescriptor.j("is_yukon_gold", false);
        pluginGeneratedSerialDescriptor.j("thinking_mode", true);
        pluginGeneratedSerialDescriptor.j("research_mode", false);
        pluginGeneratedSerialDescriptor.j("document_attachment_count", false);
        pluginGeneratedSerialDescriptor.j("image_attachment_count", false);
        pluginGeneratedSerialDescriptor.j("tool_count", false);
        pluginGeneratedSerialDescriptor.j("failure_stage", false);
        pluginGeneratedSerialDescriptor.j("failure_type", false);
        pluginGeneratedSerialDescriptor.j("http_status_code", true);
        pluginGeneratedSerialDescriptor.j("error_code", true);
        pluginGeneratedSerialDescriptor.j("error_type", true);
        pluginGeneratedSerialDescriptor.j("error_message", true);
        pluginGeneratedSerialDescriptor.j("time_in_background_ms", false);
        pluginGeneratedSerialDescriptor.j("used_inline_conversation_create", false);
        pluginGeneratedSerialDescriptor.j("project_id", true);
        pluginGeneratedSerialDescriptor.j("is_foreground_at_failure", false);
        pluginGeneratedSerialDescriptor.k(new pi(14));
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        kw9[] kw9VarArr = ClaudeAiMessageEvents$MessageResponseFailed.$childSerializers;
        xka xkaVar = xka.a;
        srg srgVar = srg.a;
        e79 e79Var = e79.a;
        zt1 zt1Var = zt1.a;
        return new KSerializer[]{xkaVar, d4c.S(srgVar), srgVar, d4c.S(srgVar), e79Var, e79Var, zt1Var, zt1Var, zt1Var, zt1Var, d4c.S(srgVar), kw9VarArr[11].getValue(), e79Var, e79Var, e79Var, kw9VarArr[15].getValue(), kw9VarArr[16].getValue(), d4c.S(e79Var), d4c.S(srgVar), d4c.S(srgVar), d4c.S(srgVar), xkaVar, zt1Var, d4c.S(srgVar), zt1Var};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        String str;
        int i;
        String str2;
        int i2;
        int i3;
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr = ClaudeAiMessageEvents$MessageResponseFailed.$childSerializers;
        long j = 0;
        long j2 = 0;
        String str3 = null;
        Integer num = null;
        ClaudeAiMessageEvents$FailureType claudeAiMessageEvents$FailureType = null;
        String str4 = null;
        String str5 = null;
        ClaudeAiMessageEvents$FailureStage claudeAiMessageEvents$FailureStage = null;
        ClaudeAiMessageEvents$ResearchMode claudeAiMessageEvents$ResearchMode = null;
        int i4 = 0;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String strV = null;
        String str9 = null;
        int iR = 0;
        int iR2 = 0;
        boolean zU = false;
        boolean zU2 = false;
        boolean zU3 = false;
        boolean zU4 = false;
        int iR3 = 0;
        int iR4 = 0;
        int iR5 = 0;
        boolean z = true;
        boolean zU5 = false;
        boolean zU6 = false;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            switch (iX) {
                case -1:
                    str = strV;
                    z = false;
                    strV = str;
                    break;
                case 0:
                    str2 = strV;
                    i2 = iR;
                    j = ud4VarC.j(serialDescriptor, 0);
                    i4 |= 1;
                    strV = str2;
                    iR = i2;
                    break;
                case 1:
                    str2 = strV;
                    i2 = iR;
                    str8 = (String) ud4VarC.m(serialDescriptor, 1, srg.a, str8);
                    i4 |= 2;
                    strV = str2;
                    iR = i2;
                    break;
                case 2:
                    strV = ud4VarC.v(serialDescriptor, 2);
                    i4 |= 4;
                    break;
                case 3:
                    str2 = strV;
                    i2 = iR;
                    str9 = (String) ud4VarC.m(serialDescriptor, 3, srg.a, str9);
                    i4 |= 8;
                    strV = str2;
                    iR = i2;
                    break;
                case 4:
                    str = strV;
                    iR = ud4VarC.r(serialDescriptor, 4);
                    i4 |= 16;
                    strV = str;
                    break;
                case 5:
                    str = strV;
                    iR2 = ud4VarC.r(serialDescriptor, 5);
                    i4 |= 32;
                    strV = str;
                    break;
                case 6:
                    str = strV;
                    zU = ud4VarC.u(serialDescriptor, 6);
                    i4 |= 64;
                    strV = str;
                    break;
                case 7:
                    str = strV;
                    zU2 = ud4VarC.u(serialDescriptor, 7);
                    i4 |= FreeTypeConstants.FT_LOAD_PEDANTIC;
                    strV = str;
                    break;
                case 8:
                    str = strV;
                    zU3 = ud4VarC.u(serialDescriptor, 8);
                    i4 |= FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING;
                    strV = str;
                    break;
                case 9:
                    str = strV;
                    zU4 = ud4VarC.u(serialDescriptor, 9);
                    i4 |= 512;
                    strV = str;
                    break;
                case 10:
                    str2 = strV;
                    i2 = iR;
                    str5 = (String) ud4VarC.m(serialDescriptor, 10, srg.a, str5);
                    i4 |= FreeTypeConstants.FT_LOAD_NO_RECURSE;
                    strV = str2;
                    iR = i2;
                    break;
                case 11:
                    str2 = strV;
                    i2 = iR;
                    claudeAiMessageEvents$ResearchMode = (ClaudeAiMessageEvents$ResearchMode) ud4VarC.l(serialDescriptor, 11, (s06) kw9VarArr[11].getValue(), claudeAiMessageEvents$ResearchMode);
                    i4 |= FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM;
                    strV = str2;
                    iR = i2;
                    break;
                case 12:
                    str = strV;
                    iR3 = ud4VarC.r(serialDescriptor, 12);
                    i4 |= FreeTypeConstants.FT_LOAD_MONOCHROME;
                    strV = str;
                    break;
                case 13:
                    str = strV;
                    iR4 = ud4VarC.r(serialDescriptor, 13);
                    i4 |= FreeTypeConstants.FT_LOAD_LINEAR_DESIGN;
                    strV = str;
                    break;
                case 14:
                    str = strV;
                    iR5 = ud4VarC.r(serialDescriptor, 14);
                    i4 |= 16384;
                    strV = str;
                    break;
                case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                    str2 = strV;
                    i2 = iR;
                    claudeAiMessageEvents$FailureStage = (ClaudeAiMessageEvents$FailureStage) ud4VarC.l(serialDescriptor, 15, (s06) kw9VarArr[15].getValue(), claudeAiMessageEvents$FailureStage);
                    i3 = FreeTypeConstants.FT_LOAD_NO_AUTOHINT;
                    i4 |= i3;
                    strV = str2;
                    iR = i2;
                    break;
                case 16:
                    str2 = strV;
                    i2 = iR;
                    claudeAiMessageEvents$FailureType = (ClaudeAiMessageEvents$FailureType) ud4VarC.l(serialDescriptor, 16, (s06) kw9VarArr[16].getValue(), claudeAiMessageEvents$FailureType);
                    i3 = 65536;
                    i4 |= i3;
                    strV = str2;
                    iR = i2;
                    break;
                case g.MAX_FIELD_NUMBER /* 17 */:
                    str2 = strV;
                    i2 = iR;
                    num = (Integer) ud4VarC.m(serialDescriptor, 17, e79.a, num);
                    i3 = 131072;
                    i4 |= i3;
                    strV = str2;
                    iR = i2;
                    break;
                case g.AVG_FIELD_NUMBER /* 18 */:
                    str2 = strV;
                    i2 = iR;
                    str3 = (String) ud4VarC.m(serialDescriptor, 18, srg.a, str3);
                    i3 = 262144;
                    i4 |= i3;
                    strV = str2;
                    iR = i2;
                    break;
                case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                    str2 = strV;
                    i2 = iR;
                    str4 = (String) ud4VarC.m(serialDescriptor, 19, srg.a, str4);
                    i3 = 524288;
                    i4 |= i3;
                    strV = str2;
                    iR = i2;
                    break;
                case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                    str2 = strV;
                    i2 = iR;
                    str6 = (String) ud4VarC.m(serialDescriptor, 20, srg.a, str6);
                    i3 = FreeTypeConstants.FT_LOAD_COLOR;
                    i4 |= i3;
                    strV = str2;
                    iR = i2;
                    break;
                case 21:
                    str = strV;
                    j2 = ud4VarC.j(serialDescriptor, 21);
                    i = FreeTypeConstants.FT_LOAD_COMPUTE_METRICS;
                    i4 |= i;
                    strV = str;
                    break;
                case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                    str = strV;
                    zU5 = ud4VarC.u(serialDescriptor, 22);
                    i = 4194304;
                    i4 |= i;
                    strV = str;
                    break;
                case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                    str2 = strV;
                    i2 = iR;
                    str7 = (String) ud4VarC.m(serialDescriptor, 23, srg.a, str7);
                    i3 = 8388608;
                    i4 |= i3;
                    strV = str2;
                    iR = i2;
                    break;
                case 24:
                    str = strV;
                    zU6 = ud4VarC.u(serialDescriptor, 24);
                    i = 16777216;
                    i4 |= i;
                    strV = str;
                    break;
                default:
                    sz6.e(iX);
                    return null;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new ClaudeAiMessageEvents$MessageResponseFailed(i4, j, str8, strV, str9, iR, iR2, zU, zU2, zU3, zU4, str5, claudeAiMessageEvents$ResearchMode, iR3, iR4, iR5, claudeAiMessageEvents$FailureStage, claudeAiMessageEvents$FailureType, num, str3, str4, str6, j2, zU5, str7, zU6, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        ClaudeAiMessageEvents$MessageResponseFailed claudeAiMessageEvents$MessageResponseFailed = (ClaudeAiMessageEvents$MessageResponseFailed) obj;
        encoder.getClass();
        claudeAiMessageEvents$MessageResponseFailed.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        ClaudeAiMessageEvents$MessageResponseFailed.write$Self$analytics(claudeAiMessageEvents$MessageResponseFailed, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
