package defpackage;

import com.anthropic.claude.api.chat.CreateChatRequest;
import com.anthropic.claude.types.strings.ChatId;
import com.anthropic.claude.types.strings.ModelId;
import com.anthropic.claude.types.strings.ProjectId;
import com.anthropic.claude.types.strings.ResearchMode;
import com.anthropic.claude.types.strings.ThinkingMode;
import com.pvporbit.freetype.FreeTypeConstants;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class x55 implements w28 {
    public static final x55 a;
    private static final SerialDescriptor descriptor;

    static {
        x55 x55Var = new x55();
        a = x55Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.api.chat.CreateChatRequest", x55Var, 10);
        pluginGeneratedSerialDescriptor.j("uuid", false);
        pluginGeneratedSerialDescriptor.j("name", false);
        pluginGeneratedSerialDescriptor.j("summary", true);
        pluginGeneratedSerialDescriptor.j("model", true);
        pluginGeneratedSerialDescriptor.j("project_uuid", true);
        pluginGeneratedSerialDescriptor.j("paprika_mode", true);
        pluginGeneratedSerialDescriptor.j("compass_mode", true);
        pluginGeneratedSerialDescriptor.j("is_temporary", true);
        pluginGeneratedSerialDescriptor.j("include_conversation_preferences", true);
        pluginGeneratedSerialDescriptor.j("enabled_imagine", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        srg srgVar = srg.a;
        KSerializer kSerializerS = d4c.S(srgVar);
        KSerializer kSerializerS2 = d4c.S(vnb.a);
        KSerializer kSerializerS3 = d4c.S(emd.a);
        KSerializer kSerializerS4 = d4c.S(emh.a);
        KSerializer kSerializerS5 = d4c.S(rle.a);
        zt1 zt1Var = zt1.a;
        return new KSerializer[]{vs2.a, srgVar, kSerializerS, kSerializerS2, kSerializerS3, kSerializerS4, kSerializerS5, zt1Var, d4c.S(zt1Var), d4c.S(zt1Var)};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        Object obj = null;
        boolean z = true;
        Boolean bool = null;
        String strM984unboximpl = null;
        Boolean bool2 = null;
        String str = null;
        String strM1064unboximpl = null;
        String strM1085unboximpl = null;
        String strM1149unboximpl = null;
        String strM1099unboximpl = null;
        String strV = null;
        int i = 0;
        boolean zU = false;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            switch (iX) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    ChatId chatId = (ChatId) ud4VarC.l(serialDescriptor, 0, vs2.a, strM984unboximpl != null ? ChatId.m978boximpl(strM984unboximpl) : null);
                    i |= 1;
                    strM984unboximpl = chatId != null ? chatId.m984unboximpl() : null;
                    break;
                case 1:
                    strV = ud4VarC.v(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    str = (String) ud4VarC.m(serialDescriptor, 2, srg.a, str);
                    i |= 4;
                    break;
                case 3:
                    ModelId modelId = (ModelId) ud4VarC.m(serialDescriptor, 3, vnb.a, strM1064unboximpl != null ? ModelId.m1058boximpl(strM1064unboximpl) : null);
                    strM1064unboximpl = modelId != null ? modelId.m1064unboximpl() : null;
                    i |= 8;
                    break;
                case 4:
                    ProjectId projectId = (ProjectId) ud4VarC.m(serialDescriptor, 4, emd.a, strM1085unboximpl != null ? ProjectId.m1079boximpl(strM1085unboximpl) : null);
                    strM1085unboximpl = projectId != null ? projectId.m1085unboximpl() : null;
                    i |= 16;
                    break;
                case 5:
                    ThinkingMode thinkingMode = (ThinkingMode) ud4VarC.m(serialDescriptor, 5, emh.a, strM1149unboximpl != null ? ThinkingMode.m1142boximpl(strM1149unboximpl) : null);
                    strM1149unboximpl = thinkingMode != null ? thinkingMode.m1149unboximpl() : null;
                    i |= 32;
                    break;
                case 6:
                    ResearchMode researchMode = (ResearchMode) ud4VarC.m(serialDescriptor, 6, rle.a, strM1099unboximpl != null ? ResearchMode.m1093boximpl(strM1099unboximpl) : null);
                    strM1099unboximpl = researchMode != null ? researchMode.m1099unboximpl() : null;
                    i |= 64;
                    break;
                case 7:
                    zU = ud4VarC.u(serialDescriptor, 7);
                    i |= FreeTypeConstants.FT_LOAD_PEDANTIC;
                    break;
                case 8:
                    bool = (Boolean) ud4VarC.m(serialDescriptor, 8, zt1.a, bool);
                    i |= FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING;
                    break;
                case 9:
                    bool2 = (Boolean) ud4VarC.m(serialDescriptor, 9, zt1.a, bool2);
                    i |= 512;
                    break;
                default:
                    sz6.e(iX);
                    return obj;
            }
            obj = null;
        }
        ud4VarC.b(serialDescriptor);
        return new CreateChatRequest(i, strM984unboximpl, strV, str, strM1064unboximpl, strM1085unboximpl, strM1149unboximpl, strM1099unboximpl, zU, bool, bool2, null, null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        CreateChatRequest createChatRequest = (CreateChatRequest) obj;
        encoder.getClass();
        createChatRequest.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        CreateChatRequest.write$Self$api(createChatRequest, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
