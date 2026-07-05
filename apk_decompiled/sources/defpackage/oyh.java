package defpackage;

import com.anthropic.claude.api.chat.messages.ToolResultBlock;
import com.anthropic.claude.api.chat.tool.ToolDisplayContent;
import com.pvporbit.freetype.FreeTypeConstants;
import java.util.Date;
import java.util.List;
import java.util.Set;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.json.JsonObject;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class oyh implements w28 {
    public static final oyh a;
    private static final SerialDescriptor descriptor;

    static {
        oyh oyhVar = new oyh();
        a = oyhVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("tool_result", oyhVar, 14);
        pluginGeneratedSerialDescriptor.j("start_timestamp", true);
        pluginGeneratedSerialDescriptor.j("stop_timestamp", true);
        pluginGeneratedSerialDescriptor.j("name", false);
        pluginGeneratedSerialDescriptor.j("tool_use_id", true);
        pluginGeneratedSerialDescriptor.j("content", false);
        pluginGeneratedSerialDescriptor.j("is_error", true);
        pluginGeneratedSerialDescriptor.j("message", true);
        pluginGeneratedSerialDescriptor.j("display_content", true);
        pluginGeneratedSerialDescriptor.j("integration_name", true);
        pluginGeneratedSerialDescriptor.j("integration_icon_url", true);
        pluginGeneratedSerialDescriptor.j("icon_name", true);
        pluginGeneratedSerialDescriptor.j("structured_content", true);
        pluginGeneratedSerialDescriptor.j("meta", true);
        pluginGeneratedSerialDescriptor.j("flags", true);
        pluginGeneratedSerialDescriptor.k(new gl0(2));
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        kw9[] kw9VarArr = ToolResultBlock.$childSerializers;
        bc9 bc9Var = bc9.a;
        srg srgVar = srg.a;
        uh9 uh9Var = uh9.a;
        return new KSerializer[]{d4c.S(bc9Var), d4c.S(bc9Var), srgVar, d4c.S(srgVar), kw9VarArr[4].getValue(), zt1.a, d4c.S(srgVar), d4c.S((KSerializer) kw9VarArr[7].getValue()), d4c.S(srgVar), d4c.S(srgVar), d4c.S(srgVar), d4c.S(uh9Var), d4c.S(uh9Var), d4c.S((KSerializer) kw9VarArr[13].getValue())};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        Date date;
        boolean z;
        JsonObject jsonObject;
        boolean z2;
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr = ToolResultBlock.$childSerializers;
        JsonObject jsonObject2 = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        JsonObject jsonObject3 = null;
        ToolDisplayContent toolDisplayContent = null;
        int i = 0;
        Date date2 = null;
        Date date3 = null;
        Set set = null;
        String str4 = null;
        List list = null;
        boolean zU = false;
        String str5 = null;
        boolean z3 = true;
        String strV = null;
        while (z3) {
            int iX = ud4VarC.x(serialDescriptor);
            switch (iX) {
                case -1:
                    jsonObject = jsonObject2;
                    z2 = zU;
                    z3 = false;
                    zU = z2;
                    jsonObject2 = jsonObject;
                    break;
                case 0:
                    z2 = zU;
                    jsonObject = jsonObject2;
                    date2 = (Date) ud4VarC.m(serialDescriptor, 0, bc9.a, date2);
                    i |= 1;
                    zU = z2;
                    jsonObject2 = jsonObject;
                    break;
                case 1:
                    date = date2;
                    z = zU;
                    date3 = (Date) ud4VarC.m(serialDescriptor, 1, bc9.a, date3);
                    i |= 2;
                    zU = z;
                    date2 = date;
                    break;
                case 2:
                    date = date2;
                    strV = ud4VarC.v(serialDescriptor, 2);
                    i |= 4;
                    date2 = date;
                    break;
                case 3:
                    date = date2;
                    z = zU;
                    str4 = (String) ud4VarC.m(serialDescriptor, 3, srg.a, str4);
                    i |= 8;
                    zU = z;
                    date2 = date;
                    break;
                case 4:
                    date = date2;
                    z = zU;
                    list = (List) ud4VarC.l(serialDescriptor, 4, (s06) kw9VarArr[4].getValue(), list);
                    i |= 16;
                    zU = z;
                    date2 = date;
                    break;
                case 5:
                    date = date2;
                    zU = ud4VarC.u(serialDescriptor, 5);
                    i |= 32;
                    date2 = date;
                    break;
                case 6:
                    date = date2;
                    z = zU;
                    str5 = (String) ud4VarC.m(serialDescriptor, 6, srg.a, str5);
                    i |= 64;
                    zU = z;
                    date2 = date;
                    break;
                case 7:
                    date = date2;
                    z = zU;
                    toolDisplayContent = (ToolDisplayContent) ud4VarC.m(serialDescriptor, 7, (s06) kw9VarArr[7].getValue(), toolDisplayContent);
                    i |= FreeTypeConstants.FT_LOAD_PEDANTIC;
                    zU = z;
                    date2 = date;
                    break;
                case 8:
                    date = date2;
                    z = zU;
                    str3 = (String) ud4VarC.m(serialDescriptor, 8, srg.a, str3);
                    i |= FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING;
                    zU = z;
                    date2 = date;
                    break;
                case 9:
                    date = date2;
                    z = zU;
                    str2 = (String) ud4VarC.m(serialDescriptor, 9, srg.a, str2);
                    i |= 512;
                    zU = z;
                    date2 = date;
                    break;
                case 10:
                    date = date2;
                    z = zU;
                    str = (String) ud4VarC.m(serialDescriptor, 10, srg.a, str);
                    i |= FreeTypeConstants.FT_LOAD_NO_RECURSE;
                    zU = z;
                    date2 = date;
                    break;
                case 11:
                    date = date2;
                    z = zU;
                    jsonObject2 = (JsonObject) ud4VarC.m(serialDescriptor, 11, uh9.a, jsonObject2);
                    i |= FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM;
                    zU = z;
                    date2 = date;
                    break;
                case 12:
                    date = date2;
                    z = zU;
                    jsonObject3 = (JsonObject) ud4VarC.m(serialDescriptor, 12, uh9.a, jsonObject3);
                    i |= FreeTypeConstants.FT_LOAD_MONOCHROME;
                    zU = z;
                    date2 = date;
                    break;
                case 13:
                    z = zU;
                    date = date2;
                    set = (Set) ud4VarC.m(serialDescriptor, 13, (s06) kw9VarArr[13].getValue(), set);
                    i |= FreeTypeConstants.FT_LOAD_LINEAR_DESIGN;
                    zU = z;
                    date2 = date;
                    break;
                default:
                    sz6.e(iX);
                    return null;
            }
        }
        boolean z4 = zU;
        ud4VarC.b(serialDescriptor);
        return new ToolResultBlock(i, date2, date3, strV, str4, list, z4, str5, toolDisplayContent, str3, str2, str, jsonObject2, jsonObject3, set, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        ToolResultBlock toolResultBlock = (ToolResultBlock) obj;
        encoder.getClass();
        toolResultBlock.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        ToolResultBlock.write$Self$api(toolResultBlock, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
