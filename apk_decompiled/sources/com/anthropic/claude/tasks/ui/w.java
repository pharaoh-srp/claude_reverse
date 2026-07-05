package com.anthropic.claude.tasks.ui;

import com.anthropic.claude.tasks.ui.TasksListOverlay;
import com.anthropic.claude.types.strings.TaskId;
import defpackage.hyf;
import defpackage.iei;
import defpackage.pz7;
import defpackage.rwe;
import defpackage.t4g;
import defpackage.u3a;

/* JADX INFO: loaded from: classes3.dex */
public final class w implements pz7 {
    public final /* synthetic */ t4g E;
    public final /* synthetic */ rwe F;

    public w(t4g t4gVar, rwe rweVar) {
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
        u3a u3aVar = new u3a(22, new TasksListOverlay.BrowserTakeover(str, strM1134unboximpl, null));
        hyf hyfVar = new hyf(29);
        rwe rweVar = this.F;
        rweVar.getClass();
        rweVar.E.m(u3aVar, hyfVar);
        return iei.a;
    }
}
