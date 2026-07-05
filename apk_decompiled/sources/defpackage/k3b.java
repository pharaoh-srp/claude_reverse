package defpackage;

import com.anthropic.claude.api.mcp.McpAuthStatus;
import com.anthropic.claude.api.mcp.McpServer;
import com.anthropic.claude.types.strings.McpServerId;
import com.pvporbit.freetype.FreeTypeConstants;
import java.util.List;
import java.util.Set;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class k3b implements w28 {
    public static final k3b a;
    private static final SerialDescriptor descriptor;

    static {
        k3b k3bVar = new k3b();
        a = k3bVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.api.mcp.McpServer", k3bVar, 13);
        pluginGeneratedSerialDescriptor.j("uuid", false);
        pluginGeneratedSerialDescriptor.j("name", false);
        pluginGeneratedSerialDescriptor.j("url", true);
        pluginGeneratedSerialDescriptor.j("custom_oauth_client_id", true);
        pluginGeneratedSerialDescriptor.j("connected", true);
        pluginGeneratedSerialDescriptor.j("usedAuthentication", true);
        pluginGeneratedSerialDescriptor.j("authStatus", true);
        pluginGeneratedSerialDescriptor.j("iconUrl", true);
        pluginGeneratedSerialDescriptor.j("tools", true);
        pluginGeneratedSerialDescriptor.j("prompts", true);
        pluginGeneratedSerialDescriptor.j("resources", true);
        pluginGeneratedSerialDescriptor.j("allowed_link_domains", true);
        pluginGeneratedSerialDescriptor.j("cai_flags", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        kw9[] kw9VarArr = McpServer.$childSerializers;
        srg srgVar = srg.a;
        zt1 zt1Var = zt1.a;
        return new KSerializer[]{p3b.a, srgVar, d4c.S(srgVar), d4c.S(srgVar), d4c.S(zt1Var), d4c.S(zt1Var), d4c.S(e0b.d), d4c.S(srgVar), d4c.S((KSerializer) kw9VarArr[8].getValue()), d4c.S((KSerializer) kw9VarArr[9].getValue()), d4c.S((KSerializer) kw9VarArr[10].getValue()), d4c.S((KSerializer) kw9VarArr[11].getValue()), kw9VarArr[12].getValue()};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        boolean z;
        String str;
        Set set;
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr = McpServer.$childSerializers;
        Set set2 = null;
        List list = null;
        List list2 = null;
        List list3 = null;
        boolean z2 = true;
        String str2 = null;
        int i = 0;
        String strM1035unboximpl = null;
        List list4 = null;
        String str3 = null;
        String str4 = null;
        Boolean bool = null;
        Boolean bool2 = null;
        McpAuthStatus mcpAuthStatus = null;
        String strV = null;
        while (z2) {
            int iX = ud4VarC.x(serialDescriptor);
            switch (iX) {
                case -1:
                    set = set2;
                    z2 = false;
                    set2 = set;
                    break;
                case 0:
                    boolean z3 = z2;
                    String str5 = strM1035unboximpl;
                    set = set2;
                    McpServerId mcpServerId = (McpServerId) ud4VarC.l(serialDescriptor, 0, p3b.a, str5 != null ? McpServerId.m1029boximpl(str5) : null);
                    strM1035unboximpl = mcpServerId != null ? mcpServerId.m1035unboximpl() : null;
                    i |= 1;
                    z2 = z3;
                    set2 = set;
                    break;
                case 1:
                    strV = ud4VarC.v(serialDescriptor, 1);
                    i |= 2;
                    z2 = z2;
                    break;
                case 2:
                    z = z2;
                    str = strM1035unboximpl;
                    str3 = (String) ud4VarC.m(serialDescriptor, 2, srg.a, str3);
                    i |= 4;
                    z2 = z;
                    strM1035unboximpl = str;
                    break;
                case 3:
                    z = z2;
                    str = strM1035unboximpl;
                    str4 = (String) ud4VarC.m(serialDescriptor, 3, srg.a, str4);
                    i |= 8;
                    z2 = z;
                    strM1035unboximpl = str;
                    break;
                case 4:
                    z = z2;
                    str = strM1035unboximpl;
                    bool = (Boolean) ud4VarC.m(serialDescriptor, 4, zt1.a, bool);
                    i |= 16;
                    z2 = z;
                    strM1035unboximpl = str;
                    break;
                case 5:
                    z = z2;
                    str = strM1035unboximpl;
                    bool2 = (Boolean) ud4VarC.m(serialDescriptor, 5, zt1.a, bool2);
                    i |= 32;
                    z2 = z;
                    strM1035unboximpl = str;
                    break;
                case 6:
                    z = z2;
                    str = strM1035unboximpl;
                    mcpAuthStatus = (McpAuthStatus) ud4VarC.m(serialDescriptor, 6, e0b.d, mcpAuthStatus);
                    i |= 64;
                    z2 = z;
                    strM1035unboximpl = str;
                    break;
                case 7:
                    z = z2;
                    str = strM1035unboximpl;
                    str2 = (String) ud4VarC.m(serialDescriptor, 7, srg.a, str2);
                    i |= FreeTypeConstants.FT_LOAD_PEDANTIC;
                    z2 = z;
                    strM1035unboximpl = str;
                    break;
                case 8:
                    z = z2;
                    str = strM1035unboximpl;
                    list4 = (List) ud4VarC.m(serialDescriptor, 8, (s06) kw9VarArr[8].getValue(), list4);
                    i |= FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING;
                    z2 = z;
                    strM1035unboximpl = str;
                    break;
                case 9:
                    z = z2;
                    str = strM1035unboximpl;
                    list3 = (List) ud4VarC.m(serialDescriptor, 9, (s06) kw9VarArr[9].getValue(), list3);
                    i |= 512;
                    z2 = z;
                    strM1035unboximpl = str;
                    break;
                case 10:
                    z = z2;
                    str = strM1035unboximpl;
                    list2 = (List) ud4VarC.m(serialDescriptor, 10, (s06) kw9VarArr[10].getValue(), list2);
                    i |= FreeTypeConstants.FT_LOAD_NO_RECURSE;
                    z2 = z;
                    strM1035unboximpl = str;
                    break;
                case 11:
                    z = z2;
                    str = strM1035unboximpl;
                    list = (List) ud4VarC.m(serialDescriptor, 11, (s06) kw9VarArr[11].getValue(), list);
                    i |= FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM;
                    z2 = z;
                    strM1035unboximpl = str;
                    break;
                case 12:
                    z = z2;
                    str = strM1035unboximpl;
                    set2 = (Set) ud4VarC.l(serialDescriptor, 12, (s06) kw9VarArr[12].getValue(), set2);
                    i |= FreeTypeConstants.FT_LOAD_MONOCHROME;
                    z2 = z;
                    strM1035unboximpl = str;
                    break;
                default:
                    sz6.e(iX);
                    return null;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new McpServer(i, strM1035unboximpl, strV, str3, str4, bool, bool2, mcpAuthStatus, str2, list4, list3, list2, list, set2, null, null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        McpServer mcpServer = (McpServer) obj;
        encoder.getClass();
        mcpServer.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        McpServer.write$Self$api(mcpServer, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
