package com.anthropic.claude.chat;

import com.anthropic.claude.chat.ChatScreenOverlay;
import com.anthropic.claude.types.strings.TaskId;
import defpackage.iei;
import defpackage.p23;
import defpackage.pz7;
import defpackage.rwe;
import defpackage.t4g;
import defpackage.v73;

/* JADX INFO: loaded from: classes.dex */
public final class e implements pz7 {
    public final /* synthetic */ t4g E;
    public final /* synthetic */ rwe F;

    public e(t4g t4gVar, rwe rweVar) {
        this.E = t4gVar;
        this.F = rweVar;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        String str = (String) obj;
        String strM1134unboximpl = ((TaskId) obj2).m1134unboximpl();
        str.getClass();
        strM1134unboximpl.getClass();
        this.E.a();
        v73 v73Var = new v73(new ChatScreenOverlay.BrowserTakeover(str, strM1134unboximpl, null), 0);
        p23 p23Var = new p23(17);
        rwe rweVar = this.F;
        rweVar.getClass();
        rweVar.E.m(v73Var, p23Var);
        return iei.a;
    }
}
