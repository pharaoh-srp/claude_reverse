package com.anthropic.claude.tasks.ui;

import com.anthropic.claude.tasks.ui.TasksBottomSheetDestination;
import com.anthropic.claude.types.strings.TaskId;
import defpackage.bz7;
import defpackage.iei;
import defpackage.t4g;

/* JADX INFO: loaded from: classes2.dex */
public final class j implements bz7 {
    public final /* synthetic */ t4g E;

    public j(t4g t4gVar) {
        this.E = t4gVar;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        String strM1134unboximpl = ((TaskId) obj).m1134unboximpl();
        strM1134unboximpl.getClass();
        this.E.d(new TasksBottomSheetDestination.TaskDetail(strM1134unboximpl, null));
        return iei.a;
    }
}
