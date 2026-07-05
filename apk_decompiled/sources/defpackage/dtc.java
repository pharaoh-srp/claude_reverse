package defpackage;

import com.anthropic.claude.api.chat.tool.ToolDisplayContent;
import com.anthropic.claude.chat.parse.MemoryToolSummary;
import com.anthropic.claude.chat.parse.ParsedContentBlock$McpToolInvocation;
import com.anthropic.claude.chat.parse.ParsedContentBlockId;
import com.pvporbit.freetype.FreeTypeConstants;
import java.util.Set;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.json.JsonObject;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class dtc implements w28 {
    public static final dtc a;
    private static final SerialDescriptor descriptor;

    static {
        dtc dtcVar = new dtc();
        a = dtcVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.chat.parse.ParsedContentBlock.McpToolInvocation", dtcVar, 15);
        pluginGeneratedSerialDescriptor.j("id", false);
        pluginGeneratedSerialDescriptor.j("toolName", false);
        pluginGeneratedSerialDescriptor.j("messageText", true);
        pluginGeneratedSerialDescriptor.j("iconName", true);
        pluginGeneratedSerialDescriptor.j("integrationName", true);
        pluginGeneratedSerialDescriptor.j("integrationIconUrl", true);
        pluginGeneratedSerialDescriptor.j("inputDisplayContent", true);
        pluginGeneratedSerialDescriptor.j("outputDisplayContent", true);
        pluginGeneratedSerialDescriptor.j("isComplete", true);
        pluginGeneratedSerialDescriptor.j("isError", true);
        pluginGeneratedSerialDescriptor.j("flags", true);
        pluginGeneratedSerialDescriptor.j("inputArgs", true);
        pluginGeneratedSerialDescriptor.j("memorySummary", true);
        pluginGeneratedSerialDescriptor.j("body", true);
        pluginGeneratedSerialDescriptor.j("messageSubText", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        kw9[] kw9VarArr = ParsedContentBlock$McpToolInvocation.$childSerializers;
        srg srgVar = srg.a;
        zt1 zt1Var = zt1.a;
        return new KSerializer[]{ntc.a, srgVar, d4c.S(srgVar), d4c.S(srgVar), d4c.S(srgVar), d4c.S(srgVar), d4c.S((KSerializer) kw9VarArr[6].getValue()), d4c.S((KSerializer) kw9VarArr[7].getValue()), zt1Var, zt1Var, kw9VarArr[10].getValue(), d4c.S(uh9.a), d4c.S(lcb.a), srgVar, d4c.S(y6c.a)};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        boolean z;
        String str;
        boolean z2;
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr = ParsedContentBlock$McpToolInvocation.$childSerializers;
        Void r2 = null;
        MemoryToolSummary memoryToolSummary = null;
        JsonObject jsonObject = null;
        Set set = null;
        boolean z3 = true;
        ToolDisplayContent toolDisplayContent = null;
        int i = 0;
        ParsedContentBlockId parsedContentBlockId = null;
        String strV = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        ToolDisplayContent toolDisplayContent2 = null;
        boolean zU = false;
        boolean zU2 = false;
        String strV2 = null;
        while (z3) {
            int iX = ud4VarC.x(serialDescriptor);
            switch (iX) {
                case -1:
                    z3 = false;
                    break;
                case 0:
                    z = z3;
                    str = strV;
                    parsedContentBlockId = (ParsedContentBlockId) ud4VarC.l(serialDescriptor, 0, ntc.a, parsedContentBlockId);
                    i |= 1;
                    z3 = z;
                    strV = str;
                    break;
                case 1:
                    z2 = z3;
                    strV = ud4VarC.v(serialDescriptor, 1);
                    i |= 2;
                    z3 = z2;
                    break;
                case 2:
                    z = z3;
                    str = strV;
                    str2 = (String) ud4VarC.m(serialDescriptor, 2, srg.a, str2);
                    i |= 4;
                    z3 = z;
                    strV = str;
                    break;
                case 3:
                    z = z3;
                    str = strV;
                    str3 = (String) ud4VarC.m(serialDescriptor, 3, srg.a, str3);
                    i |= 8;
                    z3 = z;
                    strV = str;
                    break;
                case 4:
                    z = z3;
                    str = strV;
                    str4 = (String) ud4VarC.m(serialDescriptor, 4, srg.a, str4);
                    i |= 16;
                    z3 = z;
                    strV = str;
                    break;
                case 5:
                    z = z3;
                    str = strV;
                    str5 = (String) ud4VarC.m(serialDescriptor, 5, srg.a, str5);
                    i |= 32;
                    z3 = z;
                    strV = str;
                    break;
                case 6:
                    z = z3;
                    str = strV;
                    toolDisplayContent2 = (ToolDisplayContent) ud4VarC.m(serialDescriptor, 6, (s06) kw9VarArr[6].getValue(), toolDisplayContent2);
                    i |= 64;
                    z3 = z;
                    strV = str;
                    break;
                case 7:
                    z = z3;
                    str = strV;
                    toolDisplayContent = (ToolDisplayContent) ud4VarC.m(serialDescriptor, 7, (s06) kw9VarArr[7].getValue(), toolDisplayContent);
                    i |= FreeTypeConstants.FT_LOAD_PEDANTIC;
                    z3 = z;
                    strV = str;
                    break;
                case 8:
                    z2 = z3;
                    zU = ud4VarC.u(serialDescriptor, 8);
                    i |= FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING;
                    z3 = z2;
                    break;
                case 9:
                    z2 = z3;
                    zU2 = ud4VarC.u(serialDescriptor, 9);
                    i |= 512;
                    z3 = z2;
                    break;
                case 10:
                    z = z3;
                    str = strV;
                    set = (Set) ud4VarC.l(serialDescriptor, 10, (s06) kw9VarArr[10].getValue(), set);
                    i |= FreeTypeConstants.FT_LOAD_NO_RECURSE;
                    z3 = z;
                    strV = str;
                    break;
                case 11:
                    z = z3;
                    str = strV;
                    jsonObject = (JsonObject) ud4VarC.m(serialDescriptor, 11, uh9.a, jsonObject);
                    i |= FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM;
                    z3 = z;
                    strV = str;
                    break;
                case 12:
                    z = z3;
                    str = strV;
                    memoryToolSummary = (MemoryToolSummary) ud4VarC.m(serialDescriptor, 12, lcb.a, memoryToolSummary);
                    i |= FreeTypeConstants.FT_LOAD_MONOCHROME;
                    z3 = z;
                    strV = str;
                    break;
                case 13:
                    z2 = z3;
                    strV2 = ud4VarC.v(serialDescriptor, 13);
                    i |= FreeTypeConstants.FT_LOAD_LINEAR_DESIGN;
                    z3 = z2;
                    break;
                case 14:
                    z = z3;
                    str = strV;
                    r2 = (Void) ud4VarC.m(serialDescriptor, 14, y6c.a, r2);
                    i |= 16384;
                    z3 = z;
                    strV = str;
                    break;
                default:
                    sz6.e(iX);
                    return null;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new ParsedContentBlock$McpToolInvocation(i, parsedContentBlockId, strV, str2, str3, str4, str5, toolDisplayContent2, toolDisplayContent, zU, zU2, set, jsonObject, memoryToolSummary, strV2, r2, null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        ParsedContentBlock$McpToolInvocation parsedContentBlock$McpToolInvocation = (ParsedContentBlock$McpToolInvocation) obj;
        encoder.getClass();
        parsedContentBlock$McpToolInvocation.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        ParsedContentBlock$McpToolInvocation.write$Self$Claude_chat_parse(parsedContentBlock$McpToolInvocation, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
