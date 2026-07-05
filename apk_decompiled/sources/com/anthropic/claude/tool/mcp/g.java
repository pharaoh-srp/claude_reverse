package com.anthropic.claude.tool.mcp;

import com.anthropic.claude.api.mcp.McpAuthStatus;
import com.anthropic.claude.types.strings.McpServerId;
import com.pvporbit.freetype.FreeTypeConstants;
import defpackage.d4c;
import defpackage.e0b;
import defpackage.kw9;
import defpackage.p3b;
import defpackage.s06;
import defpackage.srg;
import defpackage.sz6;
import defpackage.ud4;
import defpackage.vd4;
import defpackage.w28;
import defpackage.zt1;
import java.util.Set;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g implements w28 {
    public static final g a;
    private static final SerialDescriptor descriptor;

    static {
        g gVar = new g();
        a = gVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.tool.mcp.ServerBaseFrame", gVar, 9);
        pluginGeneratedSerialDescriptor.j("uuid", false);
        pluginGeneratedSerialDescriptor.j("name", false);
        pluginGeneratedSerialDescriptor.j("url", true);
        pluginGeneratedSerialDescriptor.j("custom_oauth_client_id", true);
        pluginGeneratedSerialDescriptor.j("connected", true);
        pluginGeneratedSerialDescriptor.j("usedAuthentication", true);
        pluginGeneratedSerialDescriptor.j("authStatus", true);
        pluginGeneratedSerialDescriptor.j("iconUrl", true);
        pluginGeneratedSerialDescriptor.j("cai_flags", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        kw9[] kw9VarArr = ServerBaseFrame.$childSerializers;
        srg srgVar = srg.a;
        zt1 zt1Var = zt1.a;
        return new KSerializer[]{p3b.a, srgVar, d4c.S(srgVar), d4c.S(srgVar), d4c.S(zt1Var), d4c.S(zt1Var), d4c.S(e0b.d), d4c.S(srgVar), kw9VarArr[8].getValue()};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr = ServerBaseFrame.$childSerializers;
        Object obj = null;
        boolean z = true;
        String str = null;
        String strM1035unboximpl = null;
        Set set = null;
        String str2 = null;
        String str3 = null;
        Boolean bool = null;
        Boolean bool2 = null;
        McpAuthStatus mcpAuthStatus = null;
        String strV = null;
        int i = 0;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            switch (iX) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    McpServerId mcpServerId = (McpServerId) ud4VarC.l(serialDescriptor, 0, p3b.a, strM1035unboximpl != null ? McpServerId.m1029boximpl(strM1035unboximpl) : null);
                    i |= 1;
                    strM1035unboximpl = mcpServerId != null ? mcpServerId.m1035unboximpl() : null;
                    break;
                case 1:
                    strV = ud4VarC.v(serialDescriptor, 1);
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
                    bool = (Boolean) ud4VarC.m(serialDescriptor, 4, zt1.a, bool);
                    i |= 16;
                    break;
                case 5:
                    bool2 = (Boolean) ud4VarC.m(serialDescriptor, 5, zt1.a, bool2);
                    i |= 32;
                    break;
                case 6:
                    mcpAuthStatus = (McpAuthStatus) ud4VarC.m(serialDescriptor, 6, e0b.d, mcpAuthStatus);
                    i |= 64;
                    break;
                case 7:
                    str = (String) ud4VarC.m(serialDescriptor, 7, srg.a, str);
                    i |= FreeTypeConstants.FT_LOAD_PEDANTIC;
                    break;
                case 8:
                    set = (Set) ud4VarC.l(serialDescriptor, 8, (s06) kw9VarArr[8].getValue(), set);
                    i |= FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING;
                    break;
                default:
                    sz6.e(iX);
                    return obj;
            }
            obj = null;
        }
        ud4VarC.b(serialDescriptor);
        return new ServerBaseFrame(i, strM1035unboximpl, strV, str2, str3, bool, bool2, mcpAuthStatus, str, set, null, null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        ServerBaseFrame serverBaseFrame = (ServerBaseFrame) obj;
        encoder.getClass();
        serverBaseFrame.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        ServerBaseFrame.write$Self$tool(serverBaseFrame, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
