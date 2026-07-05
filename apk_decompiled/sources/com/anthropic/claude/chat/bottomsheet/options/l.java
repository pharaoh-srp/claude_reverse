package com.anthropic.claude.chat.bottomsheet.options;

import com.anthropic.claude.chat.bottomsheet.options.ChatOptionsBottomSheetDestination;
import com.anthropic.claude.types.strings.McpServerId;
import com.anthropic.claude.types.strings.McpToolKey;
import defpackage.m4b;
import defpackage.p3b;
import defpackage.sz6;
import defpackage.ud4;
import defpackage.vd4;
import defpackage.w28;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class l implements w28 {
    public static final l a;
    private static final SerialDescriptor descriptor;

    static {
        l lVar = new l();
        a = lVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.chat.bottomsheet.options.ChatOptionsBottomSheetDestination.McpToolPermission", lVar, 2);
        pluginGeneratedSerialDescriptor.j("serverId", false);
        pluginGeneratedSerialDescriptor.j("toolKey", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{p3b.a, m4b.a};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        boolean z = true;
        int i = 0;
        String strM1035unboximpl = null;
        String strM1050unboximpl = null;
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
                McpToolKey mcpToolKey = (McpToolKey) ud4VarC.l(serialDescriptor, 1, m4b.a, strM1050unboximpl != null ? McpToolKey.m1043boximpl(strM1050unboximpl) : null);
                strM1050unboximpl = mcpToolKey != null ? mcpToolKey.m1050unboximpl() : null;
                i |= 2;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new ChatOptionsBottomSheetDestination.McpToolPermission(i, strM1035unboximpl, strM1050unboximpl, null, null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        ChatOptionsBottomSheetDestination.McpToolPermission mcpToolPermission = (ChatOptionsBottomSheetDestination.McpToolPermission) obj;
        encoder.getClass();
        mcpToolPermission.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        ChatOptionsBottomSheetDestination.McpToolPermission.write$Self$chat(mcpToolPermission, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
