package defpackage;

import com.anthropic.claude.api.chat.UpdatableChatConversationSettings;
import com.anthropic.claude.types.strings.ResearchMode;
import com.anthropic.claude.types.strings.ThinkingEffort;
import com.anthropic.claude.types.strings.ThinkingMode;
import com.anthropic.claude.types.strings.ToolSearchMode;
import com.pvporbit.freetype.FreeTypeConstants;
import java.util.Map;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ihi implements w28 {
    public static final ihi a;
    private static final SerialDescriptor descriptor;

    static {
        ihi ihiVar = new ihi();
        a = ihiVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.api.chat.UpdatableChatConversationSettings", ihiVar, 8);
        pluginGeneratedSerialDescriptor.j("enabled_mcp_tools", true);
        pluginGeneratedSerialDescriptor.j("enabled_web_search", true);
        pluginGeneratedSerialDescriptor.j("enabled_monkeys_in_a_barrel", true);
        pluginGeneratedSerialDescriptor.j("compass_mode", true);
        pluginGeneratedSerialDescriptor.j("paprika_mode", true);
        pluginGeneratedSerialDescriptor.j("tool_search_mode", true);
        pluginGeneratedSerialDescriptor.j("thinking_mode", true);
        pluginGeneratedSerialDescriptor.j("effort_level", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        KSerializer kSerializerS = d4c.S((KSerializer) UpdatableChatConversationSettings.$childSerializers[0].getValue());
        zt1 zt1Var = zt1.a;
        KSerializer kSerializerS2 = d4c.S(zt1Var);
        KSerializer kSerializerS3 = d4c.S(zt1Var);
        KSerializer kSerializerS4 = d4c.S(rle.a);
        emh emhVar = emh.a;
        return new KSerializer[]{kSerializerS, kSerializerS2, kSerializerS3, kSerializerS4, d4c.S(emhVar), d4c.S(qzh.a), d4c.S(emhVar), d4c.S(zlh.a)};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr = UpdatableChatConversationSettings.$childSerializers;
        ThinkingEffort thinkingEffortM1135boximpl = null;
        boolean z = true;
        Map map = null;
        Boolean bool = null;
        Boolean bool2 = null;
        String strM1099unboximpl = null;
        String strM1149unboximpl = null;
        String strM1156unboximpl = null;
        String strM1149unboximpl2 = null;
        String strM1141unboximpl = null;
        int i = 0;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            switch (iX) {
                case -1:
                    z = false;
                    break;
                case 0:
                    map = (Map) ud4VarC.m(serialDescriptor, 0, (s06) kw9VarArr[0].getValue(), map);
                    i |= 1;
                    break;
                case 1:
                    bool = (Boolean) ud4VarC.m(serialDescriptor, 1, zt1.a, bool);
                    i |= 2;
                    break;
                case 2:
                    bool2 = (Boolean) ud4VarC.m(serialDescriptor, 2, zt1.a, bool2);
                    i |= 4;
                    break;
                case 3:
                    ResearchMode researchMode = (ResearchMode) ud4VarC.m(serialDescriptor, 3, rle.a, strM1099unboximpl != null ? ResearchMode.m1093boximpl(strM1099unboximpl) : null);
                    strM1099unboximpl = researchMode != null ? researchMode.m1099unboximpl() : null;
                    i |= 8;
                    break;
                case 4:
                    ThinkingMode thinkingMode = (ThinkingMode) ud4VarC.m(serialDescriptor, 4, emh.a, strM1149unboximpl != null ? ThinkingMode.m1142boximpl(strM1149unboximpl) : null);
                    strM1149unboximpl = thinkingMode != null ? thinkingMode.m1149unboximpl() : null;
                    i |= 16;
                    break;
                case 5:
                    ToolSearchMode toolSearchMode = (ToolSearchMode) ud4VarC.m(serialDescriptor, 5, qzh.a, strM1156unboximpl != null ? ToolSearchMode.m1150boximpl(strM1156unboximpl) : null);
                    strM1156unboximpl = toolSearchMode != null ? toolSearchMode.m1156unboximpl() : null;
                    i |= 32;
                    break;
                case 6:
                    ThinkingMode thinkingMode2 = (ThinkingMode) ud4VarC.m(serialDescriptor, 6, emh.a, strM1149unboximpl2 != null ? ThinkingMode.m1142boximpl(strM1149unboximpl2) : null);
                    strM1149unboximpl2 = thinkingMode2 != null ? thinkingMode2.m1149unboximpl() : null;
                    i |= 64;
                    break;
                case 7:
                    zlh zlhVar = zlh.a;
                    if (strM1141unboximpl != null) {
                        thinkingEffortM1135boximpl = ThinkingEffort.m1135boximpl(strM1141unboximpl);
                    }
                    ThinkingEffort thinkingEffort = (ThinkingEffort) ud4VarC.m(serialDescriptor, 7, zlhVar, thinkingEffortM1135boximpl);
                    strM1141unboximpl = thinkingEffort != null ? thinkingEffort.m1141unboximpl() : null;
                    i |= FreeTypeConstants.FT_LOAD_PEDANTIC;
                    break;
                default:
                    sz6.e(iX);
                    return thinkingEffortM1135boximpl;
            }
            thinkingEffortM1135boximpl = null;
        }
        ud4VarC.b(serialDescriptor);
        return new UpdatableChatConversationSettings(i, map, bool, bool2, strM1099unboximpl, strM1149unboximpl, strM1156unboximpl, strM1149unboximpl2, strM1141unboximpl, null, null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        UpdatableChatConversationSettings updatableChatConversationSettings = (UpdatableChatConversationSettings) obj;
        encoder.getClass();
        updatableChatConversationSettings.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        UpdatableChatConversationSettings.write$Self$api(updatableChatConversationSettings, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
