package com.anthropic.claude.app;

import com.anthropic.claude.app.ClaudeAppOverlay;
import com.anthropic.claude.types.strings.ChatSnapshotId;
import defpackage.bc3;
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
public final /* synthetic */ class d1 implements w28 {
    public static final d1 a;
    private static final SerialDescriptor descriptor;

    static {
        d1 d1Var = new d1();
        a = d1Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.app.ClaudeAppOverlay.SharedChatFullScreen", d1Var, 1);
        pluginGeneratedSerialDescriptor.j("snapshotId", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{bc3.a};
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        vnf vnfVar = null;
        Object[] objArr = 0;
        Object[] objArr2 = true;
        int i = 0;
        String strM991unboximpl = null;
        while (objArr2 != false) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                objArr2 = false;
            } else {
                if (iX != 0) {
                    sz6.e(iX);
                    return null;
                }
                ChatSnapshotId chatSnapshotId = (ChatSnapshotId) ud4VarC.l(serialDescriptor, 0, bc3.a, strM991unboximpl != null ? ChatSnapshotId.m985boximpl(strM991unboximpl) : null);
                strM991unboximpl = chatSnapshotId != null ? chatSnapshotId.m991unboximpl() : null;
                i = 1;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new ClaudeAppOverlay.SharedChatFullScreen(i, strM991unboximpl, vnfVar, objArr == true ? 1 : 0);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        ClaudeAppOverlay.SharedChatFullScreen sharedChatFullScreen = (ClaudeAppOverlay.SharedChatFullScreen) obj;
        encoder.getClass();
        sharedChatFullScreen.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        vd4VarC.r(serialDescriptor, 0, bc3.a, ChatSnapshotId.m985boximpl(sharedChatFullScreen.snapshotId));
        vd4VarC.b(serialDescriptor);
    }
}
