package com.anthropic.claude.app;

import com.anthropic.claude.app.ClaudeAppOverlay;
import com.anthropic.claude.types.strings.ChatSnapshotId;
import defpackage.bz7;
import defpackage.iei;
import defpackage.j83;
import defpackage.mj3;
import defpackage.rwe;

/* JADX INFO: loaded from: classes2.dex */
public final class f0 implements bz7 {
    public final /* synthetic */ rwe E;

    public f0(rwe rweVar) {
        this.E = rweVar;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        String strM991unboximpl = ((ChatSnapshotId) obj).m991unboximpl();
        strM991unboximpl.getClass();
        mj3 mj3Var = new mj3(new ClaudeAppOverlay.SharedChatFullScreen(strM991unboximpl, null), 0);
        j83 j83Var = new j83(17);
        rwe rweVar = this.E;
        rweVar.getClass();
        rweVar.E.m(mj3Var, j83Var);
        return iei.a;
    }
}
