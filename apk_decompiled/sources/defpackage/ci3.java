package defpackage;

import androidx.health.platform.client.proto.g;
import com.anthropic.claude.analytics.events.ClaudeAiMessageEvents$MessagePerceivedTTFT;
import com.anthropic.claude.analytics.events.ClaudeAiMessageEvents$ResearchMode;
import com.pvporbit.freetype.FreeTypeConstants;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ci3 implements w28 {
    public static final ci3 a;
    private static final SerialDescriptor descriptor;

    static {
        ci3 ci3Var = new ci3();
        a = ci3Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("claudeai.message.perceived_ttft", ci3Var, 19);
        pluginGeneratedSerialDescriptor.j("perceived_ttft_ms", false);
        pluginGeneratedSerialDescriptor.j("conversation_uuid", false);
        pluginGeneratedSerialDescriptor.j("human_message_uuid", false);
        pluginGeneratedSerialDescriptor.j("assistant_message_uuid", false);
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
        kw9[] kw9VarArr = ClaudeAiMessageEvents$MessagePerceivedTTFT.$childSerializers;
        xka xkaVar = xka.a;
        srg srgVar = srg.a;
        e79 e79Var = e79.a;
        zt1 zt1Var = zt1.a;
        return new KSerializer[]{xkaVar, srgVar, srgVar, srgVar, d4c.S(srgVar), e79Var, e79Var, zt1Var, zt1Var, zt1Var, zt1Var, d4c.S(srgVar), kw9VarArr[12].getValue(), e79Var, e79Var, e79Var, xkaVar, zt1Var, d4c.S(srgVar)};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        int i;
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr = ClaudeAiMessageEvents$MessagePerceivedTTFT.$childSerializers;
        long j = 0;
        long j2 = 0;
        boolean z = true;
        String str = null;
        String str2 = null;
        ClaudeAiMessageEvents$ResearchMode claudeAiMessageEvents$ResearchMode = null;
        int i2 = 0;
        String strV = null;
        String strV2 = null;
        String strV3 = null;
        String str3 = null;
        int iR = 0;
        int iR2 = 0;
        boolean zU = false;
        boolean zU2 = false;
        boolean zU3 = false;
        boolean zU4 = false;
        int iR3 = 0;
        int iR4 = 0;
        int iR5 = 0;
        boolean zU5 = false;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            switch (iX) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    j = ud4VarC.j(serialDescriptor, 0);
                    i2 |= 1;
                    continue;
                case 1:
                    strV = ud4VarC.v(serialDescriptor, 1);
                    i2 |= 2;
                    continue;
                case 2:
                    strV2 = ud4VarC.v(serialDescriptor, 2);
                    i2 |= 4;
                    continue;
                case 3:
                    strV3 = ud4VarC.v(serialDescriptor, 3);
                    i2 |= 8;
                    continue;
                case 4:
                    str3 = (String) ud4VarC.m(serialDescriptor, 4, srg.a, str3);
                    i2 |= 16;
                    continue;
                case 5:
                    iR = ud4VarC.r(serialDescriptor, 5);
                    i2 |= 32;
                    continue;
                case 6:
                    iR2 = ud4VarC.r(serialDescriptor, 6);
                    i2 |= 64;
                    continue;
                case 7:
                    zU = ud4VarC.u(serialDescriptor, 7);
                    i2 |= FreeTypeConstants.FT_LOAD_PEDANTIC;
                    continue;
                case 8:
                    zU2 = ud4VarC.u(serialDescriptor, 8);
                    i2 |= FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING;
                    continue;
                case 9:
                    zU3 = ud4VarC.u(serialDescriptor, 9);
                    i2 |= 512;
                    continue;
                case 10:
                    zU4 = ud4VarC.u(serialDescriptor, 10);
                    i2 |= FreeTypeConstants.FT_LOAD_NO_RECURSE;
                    continue;
                case 11:
                    str = (String) ud4VarC.m(serialDescriptor, 11, srg.a, str);
                    i2 |= FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM;
                    continue;
                case 12:
                    claudeAiMessageEvents$ResearchMode = (ClaudeAiMessageEvents$ResearchMode) ud4VarC.l(serialDescriptor, 12, (s06) kw9VarArr[12].getValue(), claudeAiMessageEvents$ResearchMode);
                    i2 |= FreeTypeConstants.FT_LOAD_MONOCHROME;
                    continue;
                case 13:
                    iR3 = ud4VarC.r(serialDescriptor, 13);
                    i2 |= FreeTypeConstants.FT_LOAD_LINEAR_DESIGN;
                    continue;
                case 14:
                    iR4 = ud4VarC.r(serialDescriptor, 14);
                    i2 |= 16384;
                    continue;
                case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                    iR5 = ud4VarC.r(serialDescriptor, 15);
                    i = FreeTypeConstants.FT_LOAD_NO_AUTOHINT;
                    break;
                case 16:
                    j2 = ud4VarC.j(serialDescriptor, 16);
                    i = 65536;
                    break;
                case g.MAX_FIELD_NUMBER /* 17 */:
                    zU5 = ud4VarC.u(serialDescriptor, 17);
                    i = 131072;
                    break;
                case g.AVG_FIELD_NUMBER /* 18 */:
                    str2 = (String) ud4VarC.m(serialDescriptor, 18, srg.a, str2);
                    i = 262144;
                    break;
                default:
                    sz6.e(iX);
                    return null;
            }
            i2 |= i;
        }
        ud4VarC.b(serialDescriptor);
        return new ClaudeAiMessageEvents$MessagePerceivedTTFT(i2, j, strV, strV2, strV3, str3, iR, iR2, zU, zU2, zU3, zU4, str, claudeAiMessageEvents$ResearchMode, iR3, iR4, iR5, j2, zU5, str2, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        ClaudeAiMessageEvents$MessagePerceivedTTFT claudeAiMessageEvents$MessagePerceivedTTFT = (ClaudeAiMessageEvents$MessagePerceivedTTFT) obj;
        encoder.getClass();
        claudeAiMessageEvents$MessagePerceivedTTFT.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        ClaudeAiMessageEvents$MessagePerceivedTTFT.write$Self$analytics(claudeAiMessageEvents$MessagePerceivedTTFT, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
