package defpackage;

import com.anthropic.claude.sessions.api.ControlRequestContent;
import com.pvporbit.freetype.FreeTypeConstants;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.json.JsonElement;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class yp4 implements w28 {
    public static final yp4 a;
    private static final SerialDescriptor descriptor;

    static {
        yp4 yp4Var = new yp4();
        a = yp4Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.sessions.api.ControlRequestContent", yp4Var, 11);
        pluginGeneratedSerialDescriptor.j("subtype", true);
        pluginGeneratedSerialDescriptor.j("tool_use_id", true);
        pluginGeneratedSerialDescriptor.j("tool_name", true);
        pluginGeneratedSerialDescriptor.j("display_name", true);
        pluginGeneratedSerialDescriptor.j("title", true);
        pluginGeneratedSerialDescriptor.j("description", true);
        pluginGeneratedSerialDescriptor.j("input", true);
        pluginGeneratedSerialDescriptor.j("permission_suggestions", true);
        pluginGeneratedSerialDescriptor.j("mcp_server_name", true);
        pluginGeneratedSerialDescriptor.j("message", true);
        pluginGeneratedSerialDescriptor.j("requested_schema", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        kw9[] kw9VarArr = ControlRequestContent.$childSerializers;
        srg srgVar = srg.a;
        return new KSerializer[]{d4c.S(srgVar), d4c.S(srgVar), d4c.S(srgVar), d4c.S(srgVar), d4c.S(srgVar), d4c.S(srgVar), kw9VarArr[6].getValue(), d4c.S((KSerializer) kw9VarArr[7].getValue()), d4c.S(srgVar), d4c.S(srgVar), d4c.S(eh9.a)};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        kw9[] kw9VarArr;
        boolean z;
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr2 = ControlRequestContent.$childSerializers;
        JsonElement jsonElement = null;
        String str = null;
        String str2 = null;
        boolean z2 = true;
        List list = null;
        int i = 0;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        Map map = null;
        while (z2) {
            int iX = ud4VarC.x(serialDescriptor);
            switch (iX) {
                case -1:
                    z2 = false;
                    continue;
                case 0:
                    kw9VarArr = kw9VarArr2;
                    z = z2;
                    str3 = (String) ud4VarC.m(serialDescriptor, 0, srg.a, str3);
                    i |= 1;
                    break;
                case 1:
                    kw9VarArr = kw9VarArr2;
                    z = z2;
                    str4 = (String) ud4VarC.m(serialDescriptor, 1, srg.a, str4);
                    i |= 2;
                    break;
                case 2:
                    kw9VarArr = kw9VarArr2;
                    z = z2;
                    str5 = (String) ud4VarC.m(serialDescriptor, 2, srg.a, str5);
                    i |= 4;
                    break;
                case 3:
                    kw9VarArr = kw9VarArr2;
                    z = z2;
                    str6 = (String) ud4VarC.m(serialDescriptor, 3, srg.a, str6);
                    i |= 8;
                    break;
                case 4:
                    kw9VarArr = kw9VarArr2;
                    z = z2;
                    str7 = (String) ud4VarC.m(serialDescriptor, 4, srg.a, str7);
                    i |= 16;
                    break;
                case 5:
                    kw9VarArr = kw9VarArr2;
                    z = z2;
                    str8 = (String) ud4VarC.m(serialDescriptor, 5, srg.a, str8);
                    i |= 32;
                    break;
                case 6:
                    kw9VarArr = kw9VarArr2;
                    z = z2;
                    map = (Map) ud4VarC.l(serialDescriptor, 6, (s06) kw9VarArr[6].getValue(), map);
                    i |= 64;
                    break;
                case 7:
                    kw9VarArr = kw9VarArr2;
                    z = z2;
                    list = (List) ud4VarC.m(serialDescriptor, 7, (s06) kw9VarArr[7].getValue(), list);
                    i |= FreeTypeConstants.FT_LOAD_PEDANTIC;
                    break;
                case 8:
                    kw9VarArr = kw9VarArr2;
                    z = z2;
                    str2 = (String) ud4VarC.m(serialDescriptor, 8, srg.a, str2);
                    i |= FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING;
                    break;
                case 9:
                    kw9VarArr = kw9VarArr2;
                    z = z2;
                    str = (String) ud4VarC.m(serialDescriptor, 9, srg.a, str);
                    i |= 512;
                    break;
                case 10:
                    kw9VarArr = kw9VarArr2;
                    z = z2;
                    jsonElement = (JsonElement) ud4VarC.m(serialDescriptor, 10, eh9.a, jsonElement);
                    i |= FreeTypeConstants.FT_LOAD_NO_RECURSE;
                    break;
                default:
                    sz6.e(iX);
                    return null;
            }
            kw9VarArr2 = kw9VarArr;
            z2 = z;
        }
        ud4VarC.b(serialDescriptor);
        return new ControlRequestContent(i, str3, str4, str5, str6, str7, str8, map, list, str2, str, jsonElement, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        ControlRequestContent controlRequestContent = (ControlRequestContent) obj;
        encoder.getClass();
        controlRequestContent.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        ControlRequestContent.write$Self$sessions(controlRequestContent, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
