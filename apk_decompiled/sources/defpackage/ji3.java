package defpackage;

import androidx.health.platform.client.proto.g;
import com.anthropic.claude.analytics.events.ClaudeAiMessageEvents$MessageSent;
import com.anthropic.claude.analytics.events.ClaudeAiMessageEvents$ResearchMode;
import com.pvporbit.freetype.FreeTypeConstants;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ji3 implements w28 {
    public static final ji3 a;
    private static final SerialDescriptor descriptor;

    static {
        ji3 ji3Var = new ji3();
        a = ji3Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("claudeai.message.sent", ji3Var, 21);
        pluginGeneratedSerialDescriptor.j("conversation_uuid", false);
        pluginGeneratedSerialDescriptor.j("model", true);
        pluginGeneratedSerialDescriptor.j("has_attachments", false);
        pluginGeneratedSerialDescriptor.j("has_files", false);
        pluginGeneratedSerialDescriptor.j("has_sync_sources", false);
        pluginGeneratedSerialDescriptor.j("message_length", false);
        pluginGeneratedSerialDescriptor.j("is_new_conversation", false);
        pluginGeneratedSerialDescriptor.j("has_personalized_style", false);
        pluginGeneratedSerialDescriptor.j("include_profile_preferences", false);
        pluginGeneratedSerialDescriptor.j("is_incognito", false);
        pluginGeneratedSerialDescriptor.j("is_yukon_gold", false);
        pluginGeneratedSerialDescriptor.j("text_formatting", false);
        pluginGeneratedSerialDescriptor.j("multiple_newline_count", false);
        pluginGeneratedSerialDescriptor.j("single_newline_count", false);
        pluginGeneratedSerialDescriptor.j("message_index", true);
        pluginGeneratedSerialDescriptor.j("document_attachment_count", true);
        pluginGeneratedSerialDescriptor.j("image_attachment_count", true);
        pluginGeneratedSerialDescriptor.j("tool_count", true);
        pluginGeneratedSerialDescriptor.j("thinking_mode", true);
        pluginGeneratedSerialDescriptor.j("research_mode", false);
        pluginGeneratedSerialDescriptor.j("project_id", true);
        pluginGeneratedSerialDescriptor.k(new pi(14));
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        kw9[] kw9VarArr = ClaudeAiMessageEvents$MessageSent.$childSerializers;
        srg srgVar = srg.a;
        zt1 zt1Var = zt1.a;
        e79 e79Var = e79.a;
        return new KSerializer[]{srgVar, d4c.S(srgVar), zt1Var, zt1Var, zt1Var, e79Var, zt1Var, zt1Var, zt1Var, zt1Var, zt1Var, srgVar, e79Var, e79Var, d4c.S(e79Var), d4c.S(e79Var), d4c.S(e79Var), d4c.S(e79Var), d4c.S(srgVar), kw9VarArr[19].getValue(), d4c.S(srgVar)};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        boolean z;
        boolean z2;
        int i;
        boolean z3;
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr = ClaudeAiMessageEvents$MessageSent.$childSerializers;
        String str = null;
        Integer num = null;
        Integer num2 = null;
        Integer num3 = null;
        ClaudeAiMessageEvents$ResearchMode claudeAiMessageEvents$ResearchMode = null;
        Integer num4 = null;
        int i2 = 0;
        String str2 = null;
        String str3 = null;
        boolean zU = false;
        boolean zU2 = false;
        boolean zU3 = false;
        int iR = 0;
        boolean zU4 = false;
        boolean zU5 = false;
        boolean zU6 = false;
        boolean zU7 = false;
        boolean zU8 = false;
        String strV = null;
        int iR2 = 0;
        int iR3 = 0;
        boolean z4 = true;
        String strV2 = null;
        while (z4) {
            int iX = ud4VarC.x(serialDescriptor);
            switch (iX) {
                case -1:
                    z3 = zU;
                    z4 = false;
                    zU = z3;
                    break;
                case 0:
                    z = zU;
                    z2 = zU2;
                    strV2 = ud4VarC.v(serialDescriptor, 0);
                    i2 |= 1;
                    zU = z;
                    zU2 = z2;
                    break;
                case 1:
                    z = zU;
                    z2 = zU2;
                    str3 = (String) ud4VarC.m(serialDescriptor, 1, srg.a, str3);
                    i2 |= 2;
                    zU = z;
                    zU2 = z2;
                    break;
                case 2:
                    zU = ud4VarC.u(serialDescriptor, 2);
                    i2 |= 4;
                    break;
                case 3:
                    z3 = zU;
                    zU2 = ud4VarC.u(serialDescriptor, 3);
                    i2 |= 8;
                    zU = z3;
                    break;
                case 4:
                    z3 = zU;
                    zU3 = ud4VarC.u(serialDescriptor, 4);
                    i2 |= 16;
                    zU = z3;
                    break;
                case 5:
                    z3 = zU;
                    iR = ud4VarC.r(serialDescriptor, 5);
                    i2 |= 32;
                    zU = z3;
                    break;
                case 6:
                    z3 = zU;
                    zU4 = ud4VarC.u(serialDescriptor, 6);
                    i2 |= 64;
                    zU = z3;
                    break;
                case 7:
                    z3 = zU;
                    zU5 = ud4VarC.u(serialDescriptor, 7);
                    i2 |= FreeTypeConstants.FT_LOAD_PEDANTIC;
                    zU = z3;
                    break;
                case 8:
                    z3 = zU;
                    zU6 = ud4VarC.u(serialDescriptor, 8);
                    i2 |= FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING;
                    zU = z3;
                    break;
                case 9:
                    z3 = zU;
                    zU7 = ud4VarC.u(serialDescriptor, 9);
                    i2 |= 512;
                    zU = z3;
                    break;
                case 10:
                    z3 = zU;
                    zU8 = ud4VarC.u(serialDescriptor, 10);
                    i2 |= FreeTypeConstants.FT_LOAD_NO_RECURSE;
                    zU = z3;
                    break;
                case 11:
                    z3 = zU;
                    strV = ud4VarC.v(serialDescriptor, 11);
                    i2 |= FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM;
                    zU = z3;
                    break;
                case 12:
                    z3 = zU;
                    iR2 = ud4VarC.r(serialDescriptor, 12);
                    i2 |= FreeTypeConstants.FT_LOAD_MONOCHROME;
                    zU = z3;
                    break;
                case 13:
                    z3 = zU;
                    iR3 = ud4VarC.r(serialDescriptor, 13);
                    i2 |= FreeTypeConstants.FT_LOAD_LINEAR_DESIGN;
                    zU = z3;
                    break;
                case 14:
                    z = zU;
                    z2 = zU2;
                    num4 = (Integer) ud4VarC.m(serialDescriptor, 14, e79.a, num4);
                    i2 |= 16384;
                    zU = z;
                    zU2 = z2;
                    break;
                case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                    z = zU;
                    z2 = zU2;
                    num3 = (Integer) ud4VarC.m(serialDescriptor, 15, e79.a, num3);
                    i = FreeTypeConstants.FT_LOAD_NO_AUTOHINT;
                    i2 |= i;
                    zU = z;
                    zU2 = z2;
                    break;
                case 16:
                    z = zU;
                    z2 = zU2;
                    num2 = (Integer) ud4VarC.m(serialDescriptor, 16, e79.a, num2);
                    i = 65536;
                    i2 |= i;
                    zU = z;
                    zU2 = z2;
                    break;
                case g.MAX_FIELD_NUMBER /* 17 */:
                    z = zU;
                    z2 = zU2;
                    num = (Integer) ud4VarC.m(serialDescriptor, 17, e79.a, num);
                    i = 131072;
                    i2 |= i;
                    zU = z;
                    zU2 = z2;
                    break;
                case g.AVG_FIELD_NUMBER /* 18 */:
                    z = zU;
                    z2 = zU2;
                    str = (String) ud4VarC.m(serialDescriptor, 18, srg.a, str);
                    i = 262144;
                    i2 |= i;
                    zU = z;
                    zU2 = z2;
                    break;
                case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                    z = zU;
                    z2 = zU2;
                    claudeAiMessageEvents$ResearchMode = (ClaudeAiMessageEvents$ResearchMode) ud4VarC.l(serialDescriptor, 19, (s06) kw9VarArr[19].getValue(), claudeAiMessageEvents$ResearchMode);
                    i = 524288;
                    i2 |= i;
                    zU = z;
                    zU2 = z2;
                    break;
                case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                    z = zU;
                    z2 = zU2;
                    str2 = (String) ud4VarC.m(serialDescriptor, 20, srg.a, str2);
                    i = FreeTypeConstants.FT_LOAD_COLOR;
                    i2 |= i;
                    zU = z;
                    zU2 = z2;
                    break;
                default:
                    sz6.e(iX);
                    return null;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new ClaudeAiMessageEvents$MessageSent(i2, strV2, str3, zU, zU2, zU3, iR, zU4, zU5, zU6, zU7, zU8, strV, iR2, iR3, num4, num3, num2, num, str, claudeAiMessageEvents$ResearchMode, str2, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        ClaudeAiMessageEvents$MessageSent claudeAiMessageEvents$MessageSent = (ClaudeAiMessageEvents$MessageSent) obj;
        encoder.getClass();
        claudeAiMessageEvents$MessageSent.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        ClaudeAiMessageEvents$MessageSent.write$Self$analytics(claudeAiMessageEvents$MessageSent, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
