package com.anthropic.claude.app;

import com.anthropic.claude.app.ClaudeAppOverlay;
import com.anthropic.claude.types.strings.ChatSnapshotId;
import defpackage.bz7;
import defpackage.iei;
import defpackage.iv1;
import defpackage.mj3;
import defpackage.rwe;
import defpackage.tj3;

/* JADX INFO: loaded from: classes.dex */
public final class m0 implements bz7 {
    public final /* synthetic */ rwe E;

    public m0(rwe rweVar) {
        this.E = rweVar;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        String strM991unboximpl = ((ChatSnapshotId) obj).m991unboximpl();
        strM991unboximpl.getClass();
        rwe rweVar = this.E;
        ClaudeAppOverlay claudeAppOverlay = (ClaudeAppOverlay) iv1.t(rweVar);
        ClaudeAppOverlay.SharedChatFullScreen sharedChatFullScreen = claudeAppOverlay instanceof ClaudeAppOverlay.SharedChatFullScreen ? (ClaudeAppOverlay.SharedChatFullScreen) claudeAppOverlay : null;
        String strM492getSnapshotIdN1vkeFQ = sharedChatFullScreen != null ? sharedChatFullScreen.m492getSnapshotIdN1vkeFQ() : null;
        if (!(strM492getSnapshotIdN1vkeFQ == null ? false : ChatSnapshotId.m988equalsimpl0(strM492getSnapshotIdN1vkeFQ, strM991unboximpl))) {
            rweVar.E.m(new mj3(new ClaudeAppOverlay.SharedChatFullScreen(strM991unboximpl, null), 1), new tj3(2));
        }
        return iei.a;
    }
}
