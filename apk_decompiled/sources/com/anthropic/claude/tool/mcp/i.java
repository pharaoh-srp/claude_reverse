package com.anthropic.claude.tool.mcp;

import com.anthropic.claude.tool.mcp.ServerListFrame;
import com.anthropic.claude.types.strings.McpServerId;
import defpackage.d4c;
import defpackage.kw9;
import defpackage.p3b;
import defpackage.s06;
import defpackage.srg;
import defpackage.sz6;
import defpackage.ud4;
import defpackage.vd4;
import defpackage.w28;
import java.util.Set;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i implements w28 {
    public static final i a;
    private static final SerialDescriptor descriptor;

    static {
        i iVar = new i();
        a = iVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.tool.mcp.ServerListFrame.ServerStub", iVar, 4);
        pluginGeneratedSerialDescriptor.j("uuid", false);
        pluginGeneratedSerialDescriptor.j("name", false);
        pluginGeneratedSerialDescriptor.j("url", true);
        pluginGeneratedSerialDescriptor.j("cai_flags", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        kw9[] kw9VarArr = ServerListFrame.ServerStub.$childSerializers;
        srg srgVar = srg.a;
        return new KSerializer[]{p3b.a, srgVar, d4c.S(srgVar), kw9VarArr[3].getValue()};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr = ServerListFrame.ServerStub.$childSerializers;
        boolean z = true;
        int i = 0;
        String strM1035unboximpl = null;
        String strV = null;
        String str = null;
        Set set = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                McpServerId mcpServerId = (McpServerId) ud4VarC.l(serialDescriptor, 0, p3b.a, strM1035unboximpl != null ? McpServerId.m1029boximpl(strM1035unboximpl) : null);
                strM1035unboximpl = mcpServerId != null ? mcpServerId.m1035unboximpl() : null;
                i |= 1;
            } else if (iX == 1) {
                strV = ud4VarC.v(serialDescriptor, 1);
                i |= 2;
            } else if (iX == 2) {
                str = (String) ud4VarC.m(serialDescriptor, 2, srg.a, str);
                i |= 4;
            } else {
                if (iX != 3) {
                    sz6.e(iX);
                    return null;
                }
                set = (Set) ud4VarC.l(serialDescriptor, 3, (s06) kw9VarArr[3].getValue(), set);
                i |= 8;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new ServerListFrame.ServerStub(i, strM1035unboximpl, strV, str, set, null, null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        ServerListFrame.ServerStub serverStub = (ServerListFrame.ServerStub) obj;
        encoder.getClass();
        serverStub.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        ServerListFrame.ServerStub.write$Self$tool(serverStub, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
