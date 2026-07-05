package defpackage;

import com.anthropic.claude.api.chat.messages.ToolUseBlock;
import com.anthropic.claude.api.chat.tool.ToolDisplayContent;
import com.anthropic.claude.api.chat.tool.ToolUseInput;
import com.pvporbit.freetype.FreeTypeConstants;
import java.util.Date;
import java.util.List;
import java.util.Set;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class w0i implements w28 {
    public static final w0i a;
    private static final SerialDescriptor descriptor;

    static {
        w0i w0iVar = new w0i();
        a = w0iVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("tool_use", w0iVar, 14);
        pluginGeneratedSerialDescriptor.j("start_timestamp", true);
        pluginGeneratedSerialDescriptor.j("stop_timestamp", true);
        pluginGeneratedSerialDescriptor.j("name", false);
        pluginGeneratedSerialDescriptor.j("id", false);
        pluginGeneratedSerialDescriptor.j("input", false);
        pluginGeneratedSerialDescriptor.j("message", true);
        pluginGeneratedSerialDescriptor.j("display_content", true);
        pluginGeneratedSerialDescriptor.j("integration_name", true);
        pluginGeneratedSerialDescriptor.j("integration_icon_url", true);
        pluginGeneratedSerialDescriptor.j("icon_name", true);
        pluginGeneratedSerialDescriptor.j("approval_key", true);
        pluginGeneratedSerialDescriptor.j("approval_options", true);
        pluginGeneratedSerialDescriptor.j("is_mcp_app", true);
        pluginGeneratedSerialDescriptor.j("flags", true);
        pluginGeneratedSerialDescriptor.k(new gl0(2));
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        kw9[] kw9VarArr = ToolUseBlock.$childSerializers;
        bc9 bc9Var = bc9.a;
        KSerializer kSerializerS = d4c.S(bc9Var);
        KSerializer kSerializerS2 = d4c.S(bc9Var);
        srg srgVar = srg.a;
        return new KSerializer[]{kSerializerS, kSerializerS2, srgVar, d4c.S(srgVar), f1i.a, d4c.S(srgVar), d4c.S((KSerializer) kw9VarArr[6].getValue()), d4c.S(srgVar), d4c.S(srgVar), d4c.S(srgVar), d4c.S(srgVar), d4c.S((KSerializer) kw9VarArr[11].getValue()), d4c.S(zt1.a), d4c.S((KSerializer) kw9VarArr[13].getValue())};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        Date date;
        Date date2;
        List list;
        String str;
        Date date3;
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr = ToolUseBlock.$childSerializers;
        List list2 = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        Boolean bool = null;
        String str5 = null;
        int i = 0;
        Date date4 = null;
        Date date5 = null;
        Set set = null;
        String str6 = null;
        ToolUseInput toolUseInput = null;
        String str7 = null;
        ToolDisplayContent toolDisplayContent = null;
        boolean z = true;
        String strV = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            switch (iX) {
                case -1:
                    list = list2;
                    str = str2;
                    z = false;
                    list2 = list;
                    str2 = str;
                    break;
                case 0:
                    list = list2;
                    str = str2;
                    date4 = (Date) ud4VarC.m(serialDescriptor, 0, bc9.a, date4);
                    i |= 1;
                    list2 = list;
                    str2 = str;
                    break;
                case 1:
                    date3 = date4;
                    date5 = (Date) ud4VarC.m(serialDescriptor, 1, bc9.a, date5);
                    i |= 2;
                    list2 = list2;
                    date4 = date3;
                    break;
                case 2:
                    date3 = date4;
                    strV = ud4VarC.v(serialDescriptor, 2);
                    i |= 4;
                    date4 = date3;
                    break;
                case 3:
                    date = date4;
                    date2 = date5;
                    str6 = (String) ud4VarC.m(serialDescriptor, 3, srg.a, str6);
                    i |= 8;
                    date4 = date;
                    date5 = date2;
                    break;
                case 4:
                    date = date4;
                    date2 = date5;
                    toolUseInput = (ToolUseInput) ud4VarC.l(serialDescriptor, 4, f1i.a, toolUseInput);
                    i |= 16;
                    date4 = date;
                    date5 = date2;
                    break;
                case 5:
                    date = date4;
                    date2 = date5;
                    str7 = (String) ud4VarC.m(serialDescriptor, 5, srg.a, str7);
                    i |= 32;
                    date4 = date;
                    date5 = date2;
                    break;
                case 6:
                    date = date4;
                    date2 = date5;
                    toolDisplayContent = (ToolDisplayContent) ud4VarC.m(serialDescriptor, 6, (s06) kw9VarArr[6].getValue(), toolDisplayContent);
                    i |= 64;
                    date4 = date;
                    date5 = date2;
                    break;
                case 7:
                    date = date4;
                    date2 = date5;
                    str5 = (String) ud4VarC.m(serialDescriptor, 7, srg.a, str5);
                    i |= FreeTypeConstants.FT_LOAD_PEDANTIC;
                    date4 = date;
                    date5 = date2;
                    break;
                case 8:
                    date = date4;
                    date2 = date5;
                    str4 = (String) ud4VarC.m(serialDescriptor, 8, srg.a, str4);
                    i |= FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING;
                    date4 = date;
                    date5 = date2;
                    break;
                case 9:
                    date = date4;
                    date2 = date5;
                    str3 = (String) ud4VarC.m(serialDescriptor, 9, srg.a, str3);
                    i |= 512;
                    date4 = date;
                    date5 = date2;
                    break;
                case 10:
                    date = date4;
                    date2 = date5;
                    str2 = (String) ud4VarC.m(serialDescriptor, 10, srg.a, str2);
                    i |= FreeTypeConstants.FT_LOAD_NO_RECURSE;
                    date4 = date;
                    date5 = date2;
                    break;
                case 11:
                    date = date4;
                    date2 = date5;
                    list2 = (List) ud4VarC.m(serialDescriptor, 11, (s06) kw9VarArr[11].getValue(), list2);
                    i |= FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM;
                    date4 = date;
                    date5 = date2;
                    break;
                case 12:
                    date = date4;
                    date2 = date5;
                    bool = (Boolean) ud4VarC.m(serialDescriptor, 12, zt1.a, bool);
                    i |= FreeTypeConstants.FT_LOAD_MONOCHROME;
                    date4 = date;
                    date5 = date2;
                    break;
                case 13:
                    date = date4;
                    date2 = date5;
                    set = (Set) ud4VarC.m(serialDescriptor, 13, (s06) kw9VarArr[13].getValue(), set);
                    i |= FreeTypeConstants.FT_LOAD_LINEAR_DESIGN;
                    date4 = date;
                    date5 = date2;
                    break;
                default:
                    sz6.e(iX);
                    return null;
            }
        }
        String str8 = str2;
        ud4VarC.b(serialDescriptor);
        return new ToolUseBlock(i, date4, date5, strV, str6, toolUseInput, str7, toolDisplayContent, str5, str4, str3, str8, list2, bool, set, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        ToolUseBlock toolUseBlock = (ToolUseBlock) obj;
        encoder.getClass();
        toolUseBlock.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        ToolUseBlock.write$Self$api(toolUseBlock, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
