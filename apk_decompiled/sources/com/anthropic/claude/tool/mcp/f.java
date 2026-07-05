package com.anthropic.claude.tool.mcp;

import com.anthropic.claude.types.strings.McpServerId;
import defpackage.kw9;
import defpackage.p3b;
import defpackage.s06;
import defpackage.sz6;
import defpackage.ud4;
import defpackage.vd4;
import defpackage.w28;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f implements w28 {
    public static final f a;
    private static final SerialDescriptor descriptor;

    static {
        f fVar = new f();
        a = fVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.tool.mcp.ResourcesFrame", fVar, 2);
        pluginGeneratedSerialDescriptor.j("server_uuid", false);
        pluginGeneratedSerialDescriptor.j("resources", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{p3b.a, ResourcesFrame.$childSerializers[1].getValue()};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr = ResourcesFrame.$childSerializers;
        boolean z = true;
        int i = 0;
        String strM1035unboximpl = null;
        List list = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                McpServerId mcpServerId = (McpServerId) ud4VarC.l(serialDescriptor, 0, p3b.a, strM1035unboximpl != null ? McpServerId.m1029boximpl(strM1035unboximpl) : null);
                strM1035unboximpl = mcpServerId != null ? mcpServerId.m1035unboximpl() : null;
                i |= 1;
            } else {
                if (iX != 1) {
                    sz6.e(iX);
                    return null;
                }
                list = (List) ud4VarC.l(serialDescriptor, 1, (s06) kw9VarArr[1].getValue(), list);
                i |= 2;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new ResourcesFrame(i, strM1035unboximpl, list, null, null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        ResourcesFrame resourcesFrame = (ResourcesFrame) obj;
        encoder.getClass();
        resourcesFrame.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        ResourcesFrame.write$Self$tool(resourcesFrame, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
