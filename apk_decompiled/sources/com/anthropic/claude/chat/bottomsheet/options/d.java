package com.anthropic.claude.chat.bottomsheet.options;

import com.anthropic.claude.api.mcp.DirectoryServer;
import com.anthropic.claude.chat.bottomsheet.options.ChatOptionsBottomSheetDestination;
import defpackage.sz6;
import defpackage.ud4;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.w28;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements w28 {
    public static final d a;
    private static final SerialDescriptor descriptor;

    static {
        d dVar = new d();
        a = dVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.chat.bottomsheet.options.ChatOptionsBottomSheetDestination.ConnectorDirectoryDetail", dVar, 1);
        pluginGeneratedSerialDescriptor.j("server", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{com.anthropic.claude.api.mcp.a.a};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        vnf vnfVar = null;
        boolean z = true;
        int i = 0;
        DirectoryServer directoryServer = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else {
                if (iX != 0) {
                    sz6.e(iX);
                    return null;
                }
                directoryServer = (DirectoryServer) ud4VarC.l(serialDescriptor, 0, com.anthropic.claude.api.mcp.a.a, directoryServer);
                i = 1;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new ChatOptionsBottomSheetDestination.ConnectorDirectoryDetail(i, directoryServer, vnfVar);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        ChatOptionsBottomSheetDestination.ConnectorDirectoryDetail connectorDirectoryDetail = (ChatOptionsBottomSheetDestination.ConnectorDirectoryDetail) obj;
        encoder.getClass();
        connectorDirectoryDetail.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        vd4VarC.r(serialDescriptor, 0, com.anthropic.claude.api.mcp.a.a, connectorDirectoryDetail.server);
        vd4VarC.b(serialDescriptor);
    }
}
