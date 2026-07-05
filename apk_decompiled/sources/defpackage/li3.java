package defpackage;

import androidx.health.platform.client.proto.g;
import com.anthropic.claude.analytics.events.ClaudeAiMessageEvents$MessageStreamingAbandoned;
import com.anthropic.claude.analytics.events.ClaudeAiMessageEvents$ResearchMode;
import com.pvporbit.freetype.FreeTypeConstants;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class li3 implements w28 {
    public static final li3 a;
    private static final SerialDescriptor descriptor;

    static {
        li3 li3Var = new li3();
        a = li3Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("claudeai.message.streaming_abandoned", li3Var, 20);
        pluginGeneratedSerialDescriptor.j("time_to_abandonment_ms", false);
        pluginGeneratedSerialDescriptor.j("had_first_token", false);
        pluginGeneratedSerialDescriptor.j("conversation_uuid", false);
        pluginGeneratedSerialDescriptor.j("human_message_uuid", false);
        pluginGeneratedSerialDescriptor.j("assistant_message_uuid", true);
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
        pluginGeneratedSerialDescriptor.j("time_in_background_ms", false);
        pluginGeneratedSerialDescriptor.j("used_inline_conversation_create", false);
        pluginGeneratedSerialDescriptor.j("project_id", true);
        pluginGeneratedSerialDescriptor.k(new pi(14));
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        kw9[] kw9VarArr = ClaudeAiMessageEvents$MessageStreamingAbandoned.$childSerializers;
        xka xkaVar = xka.a;
        zt1 zt1Var = zt1.a;
        srg srgVar = srg.a;
        e79 e79Var = e79.a;
        return new KSerializer[]{xkaVar, zt1Var, srgVar, srgVar, d4c.S(srgVar), d4c.S(srgVar), e79Var, e79Var, zt1Var, zt1Var, zt1Var, zt1Var, d4c.S(srgVar), kw9VarArr[13].getValue(), e79Var, e79Var, e79Var, xkaVar, zt1Var, d4c.S(srgVar)};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        kw9[] kw9VarArr;
        int i;
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr2 = ClaudeAiMessageEvents$MessageStreamingAbandoned.$childSerializers;
        long j = 0;
        long j2 = 0;
        String str = null;
        boolean z = true;
        String str2 = null;
        ClaudeAiMessageEvents$ResearchMode claudeAiMessageEvents$ResearchMode = null;
        String str3 = null;
        int i2 = 0;
        boolean zU = false;
        String strV = null;
        String strV2 = null;
        String str4 = null;
        int iR = 0;
        int iR2 = 0;
        boolean zU2 = false;
        boolean zU3 = false;
        boolean zU4 = false;
        boolean zU5 = false;
        int iR3 = 0;
        int iR4 = 0;
        int iR5 = 0;
        boolean zU6 = false;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            switch (iX) {
                case -1:
                    kw9VarArr = kw9VarArr2;
                    z = false;
                    continue;
                    kw9VarArr2 = kw9VarArr;
                    break;
                case 0:
                    kw9VarArr = kw9VarArr2;
                    j = ud4VarC.j(serialDescriptor, 0);
                    i2 |= 1;
                    continue;
                    kw9VarArr2 = kw9VarArr;
                    break;
                case 1:
                    kw9VarArr = kw9VarArr2;
                    zU = ud4VarC.u(serialDescriptor, 1);
                    i2 |= 2;
                    continue;
                    kw9VarArr2 = kw9VarArr;
                    break;
                case 2:
                    kw9VarArr = kw9VarArr2;
                    strV = ud4VarC.v(serialDescriptor, 2);
                    i2 |= 4;
                    continue;
                    kw9VarArr2 = kw9VarArr;
                    break;
                case 3:
                    kw9VarArr = kw9VarArr2;
                    strV2 = ud4VarC.v(serialDescriptor, 3);
                    i2 |= 8;
                    continue;
                    kw9VarArr2 = kw9VarArr;
                    break;
                case 4:
                    kw9VarArr = kw9VarArr2;
                    str4 = (String) ud4VarC.m(serialDescriptor, 4, srg.a, str4);
                    i2 |= 16;
                    continue;
                    kw9VarArr2 = kw9VarArr;
                    break;
                case 5:
                    kw9VarArr = kw9VarArr2;
                    str2 = (String) ud4VarC.m(serialDescriptor, 5, srg.a, str2);
                    i2 |= 32;
                    continue;
                    kw9VarArr2 = kw9VarArr;
                    break;
                case 6:
                    kw9VarArr = kw9VarArr2;
                    iR = ud4VarC.r(serialDescriptor, 6);
                    i2 |= 64;
                    continue;
                    kw9VarArr2 = kw9VarArr;
                    break;
                case 7:
                    kw9VarArr = kw9VarArr2;
                    iR2 = ud4VarC.r(serialDescriptor, 7);
                    i2 |= FreeTypeConstants.FT_LOAD_PEDANTIC;
                    continue;
                    kw9VarArr2 = kw9VarArr;
                    break;
                case 8:
                    kw9VarArr = kw9VarArr2;
                    zU2 = ud4VarC.u(serialDescriptor, 8);
                    i2 |= FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING;
                    continue;
                    kw9VarArr2 = kw9VarArr;
                    break;
                case 9:
                    kw9VarArr = kw9VarArr2;
                    zU3 = ud4VarC.u(serialDescriptor, 9);
                    i2 |= 512;
                    continue;
                    kw9VarArr2 = kw9VarArr;
                    break;
                case 10:
                    kw9VarArr = kw9VarArr2;
                    zU4 = ud4VarC.u(serialDescriptor, 10);
                    i2 |= FreeTypeConstants.FT_LOAD_NO_RECURSE;
                    continue;
                    kw9VarArr2 = kw9VarArr;
                    break;
                case 11:
                    kw9VarArr = kw9VarArr2;
                    zU5 = ud4VarC.u(serialDescriptor, 11);
                    i2 |= FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM;
                    continue;
                    kw9VarArr2 = kw9VarArr;
                    break;
                case 12:
                    kw9VarArr = kw9VarArr2;
                    str3 = (String) ud4VarC.m(serialDescriptor, 12, srg.a, str3);
                    i2 |= FreeTypeConstants.FT_LOAD_MONOCHROME;
                    continue;
                    kw9VarArr2 = kw9VarArr;
                    break;
                case 13:
                    kw9VarArr = kw9VarArr2;
                    claudeAiMessageEvents$ResearchMode = (ClaudeAiMessageEvents$ResearchMode) ud4VarC.l(serialDescriptor, 13, (s06) kw9VarArr[13].getValue(), claudeAiMessageEvents$ResearchMode);
                    i2 |= FreeTypeConstants.FT_LOAD_LINEAR_DESIGN;
                    continue;
                    kw9VarArr2 = kw9VarArr;
                    break;
                case 14:
                    kw9VarArr = kw9VarArr2;
                    iR3 = ud4VarC.r(serialDescriptor, 14);
                    i2 |= 16384;
                    continue;
                    kw9VarArr2 = kw9VarArr;
                    break;
                case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                    kw9VarArr = kw9VarArr2;
                    iR4 = ud4VarC.r(serialDescriptor, 15);
                    i = FreeTypeConstants.FT_LOAD_NO_AUTOHINT;
                    break;
                case 16:
                    kw9VarArr = kw9VarArr2;
                    iR5 = ud4VarC.r(serialDescriptor, 16);
                    i = 65536;
                    break;
                case g.MAX_FIELD_NUMBER /* 17 */:
                    kw9VarArr = kw9VarArr2;
                    j2 = ud4VarC.j(serialDescriptor, 17);
                    i = 131072;
                    break;
                case g.AVG_FIELD_NUMBER /* 18 */:
                    kw9VarArr = kw9VarArr2;
                    zU6 = ud4VarC.u(serialDescriptor, 18);
                    i = 262144;
                    break;
                case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                    kw9VarArr = kw9VarArr2;
                    str = (String) ud4VarC.m(serialDescriptor, 19, srg.a, str);
                    i = 524288;
                    break;
                default:
                    sz6.e(iX);
                    return null;
            }
            i2 |= i;
            kw9VarArr2 = kw9VarArr;
        }
        ud4VarC.b(serialDescriptor);
        return new ClaudeAiMessageEvents$MessageStreamingAbandoned(i2, j, zU, strV, strV2, str4, str2, iR, iR2, zU2, zU3, zU4, zU5, str3, claudeAiMessageEvents$ResearchMode, iR3, iR4, iR5, j2, zU6, str, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        ClaudeAiMessageEvents$MessageStreamingAbandoned claudeAiMessageEvents$MessageStreamingAbandoned = (ClaudeAiMessageEvents$MessageStreamingAbandoned) obj;
        encoder.getClass();
        claudeAiMessageEvents$MessageStreamingAbandoned.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        ClaudeAiMessageEvents$MessageStreamingAbandoned.write$Self$analytics(claudeAiMessageEvents$MessageStreamingAbandoned, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
