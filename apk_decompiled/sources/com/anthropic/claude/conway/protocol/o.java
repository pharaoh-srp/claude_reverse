package com.anthropic.claude.conway.protocol;

import com.anthropic.claude.conway.protocol.ContentBlock;
import defpackage.d4c;
import defpackage.eh9;
import defpackage.srg;
import defpackage.sz6;
import defpackage.ud4;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.w28;
import defpackage.zt1;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.json.JsonElement;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class o implements w28 {
    public static final o a;
    private static final SerialDescriptor descriptor;

    static {
        o oVar = new o();
        a = oVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.conway.protocol.ContentBlock.ToolResult", oVar, 3);
        pluginGeneratedSerialDescriptor.j("tool_use_id", false);
        pluginGeneratedSerialDescriptor.j("content", true);
        pluginGeneratedSerialDescriptor.j("is_error", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{srg.a, d4c.S(eh9.a), zt1.a};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        boolean z = true;
        int i = 0;
        boolean zU = false;
        String strV = null;
        JsonElement jsonElement = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                strV = ud4VarC.v(serialDescriptor, 0);
                i |= 1;
            } else if (iX == 1) {
                jsonElement = (JsonElement) ud4VarC.m(serialDescriptor, 1, eh9.a, jsonElement);
                i |= 2;
            } else {
                if (iX != 2) {
                    sz6.e(iX);
                    return null;
                }
                zU = ud4VarC.u(serialDescriptor, 2);
                i |= 4;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new ContentBlock.ToolResult(i, strV, jsonElement, zU, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        ContentBlock.ToolResult toolResult = (ContentBlock.ToolResult) obj;
        encoder.getClass();
        toolResult.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        ContentBlock.ToolResult.write$Self$conway(toolResult, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
