package defpackage;

import com.anthropic.claude.api.mcp.McpTool;
import com.anthropic.claude.api.mcp.McpToolAnnotations;
import com.anthropic.claude.api.mcp.McpToolMaxPermission;
import com.anthropic.claude.api.mcp.McpToolMeta;
import com.anthropic.claude.types.strings.McpToolKey;
import com.pvporbit.freetype.FreeTypeConstants;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d4b implements w28 {
    public static final d4b a;
    private static final SerialDescriptor descriptor;

    static {
        d4b d4bVar = new d4b();
        a = d4bVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.api.mcp.McpTool", d4bVar, 10);
        pluginGeneratedSerialDescriptor.j("name", false);
        pluginGeneratedSerialDescriptor.j("description", true);
        pluginGeneratedSerialDescriptor.j("display_description", true);
        pluginGeneratedSerialDescriptor.j("displayName", true);
        pluginGeneratedSerialDescriptor.j("annotations", true);
        pluginGeneratedSerialDescriptor.j("enabled_key", true);
        pluginGeneratedSerialDescriptor.j("always_approved_key", true);
        pluginGeneratedSerialDescriptor.j("_meta", true);
        pluginGeneratedSerialDescriptor.j("effective_max_permission", true);
        pluginGeneratedSerialDescriptor.j("default_user_permission", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        srg srgVar = srg.a;
        KSerializer kSerializerS = d4c.S(srgVar);
        KSerializer kSerializerS2 = d4c.S(srgVar);
        KSerializer kSerializerS3 = d4c.S(srgVar);
        KSerializer kSerializerS4 = d4c.S(f4b.a);
        m4b m4bVar = m4b.a;
        KSerializer kSerializerS5 = d4c.S(m4bVar);
        KSerializer kSerializerS6 = d4c.S(m4bVar);
        KSerializer kSerializerS7 = d4c.S(q4b.a);
        p4b p4bVar = p4b.d;
        return new KSerializer[]{srgVar, kSerializerS, kSerializerS2, kSerializerS3, kSerializerS4, kSerializerS5, kSerializerS6, kSerializerS7, d4c.S(p4bVar), d4c.S(p4bVar)};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        Object obj = null;
        boolean z = true;
        McpToolMaxPermission mcpToolMaxPermission = null;
        McpToolMaxPermission mcpToolMaxPermission2 = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        McpToolAnnotations mcpToolAnnotations = null;
        String strM1050unboximpl = null;
        String strM1050unboximpl2 = null;
        McpToolMeta mcpToolMeta = null;
        String strV = null;
        int i = 0;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            switch (iX) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    strV = ud4VarC.v(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    str = (String) ud4VarC.m(serialDescriptor, 1, srg.a, str);
                    i |= 2;
                    break;
                case 2:
                    str2 = (String) ud4VarC.m(serialDescriptor, 2, srg.a, str2);
                    i |= 4;
                    break;
                case 3:
                    str3 = (String) ud4VarC.m(serialDescriptor, 3, srg.a, str3);
                    i |= 8;
                    break;
                case 4:
                    mcpToolAnnotations = (McpToolAnnotations) ud4VarC.m(serialDescriptor, 4, f4b.a, mcpToolAnnotations);
                    i |= 16;
                    break;
                case 5:
                    McpToolKey mcpToolKey = (McpToolKey) ud4VarC.m(serialDescriptor, 5, m4b.a, strM1050unboximpl != null ? McpToolKey.m1043boximpl(strM1050unboximpl) : null);
                    strM1050unboximpl = mcpToolKey != null ? mcpToolKey.m1050unboximpl() : null;
                    i |= 32;
                    break;
                case 6:
                    McpToolKey mcpToolKey2 = (McpToolKey) ud4VarC.m(serialDescriptor, 6, m4b.a, strM1050unboximpl2 != null ? McpToolKey.m1043boximpl(strM1050unboximpl2) : null);
                    strM1050unboximpl2 = mcpToolKey2 != null ? mcpToolKey2.m1050unboximpl() : null;
                    i |= 64;
                    break;
                case 7:
                    mcpToolMeta = (McpToolMeta) ud4VarC.m(serialDescriptor, 7, q4b.a, mcpToolMeta);
                    i |= FreeTypeConstants.FT_LOAD_PEDANTIC;
                    break;
                case 8:
                    mcpToolMaxPermission = (McpToolMaxPermission) ud4VarC.m(serialDescriptor, 8, p4b.d, mcpToolMaxPermission);
                    i |= FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING;
                    break;
                case 9:
                    mcpToolMaxPermission2 = (McpToolMaxPermission) ud4VarC.m(serialDescriptor, 9, p4b.d, mcpToolMaxPermission2);
                    i |= 512;
                    break;
                default:
                    sz6.e(iX);
                    return obj;
            }
            obj = null;
        }
        ud4VarC.b(serialDescriptor);
        return new McpTool(i, strV, str, str2, str3, mcpToolAnnotations, strM1050unboximpl, strM1050unboximpl2, mcpToolMeta, mcpToolMaxPermission, mcpToolMaxPermission2, null, null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        McpTool mcpTool = (McpTool) obj;
        encoder.getClass();
        mcpTool.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        McpTool.write$Self$api(mcpTool, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
