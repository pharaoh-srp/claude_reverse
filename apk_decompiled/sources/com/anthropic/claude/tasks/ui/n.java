package com.anthropic.claude.tasks.ui;

import com.anthropic.claude.tasks.ui.TasksBottomSheetDestination;
import defpackage.iei;
import defpackage.l5h;
import defpackage.m45;
import defpackage.pz7;
import defpackage.sf5;
import defpackage.sz6;
import defpackage.tp4;
import defpackage.xzg;

/* JADX INFO: loaded from: classes3.dex */
public final class n extends xzg implements pz7 {
    public int E;
    public /* synthetic */ Object F;
    public final /* synthetic */ l5h G;
    public final /* synthetic */ TasksBottomSheetDestination H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(l5h l5hVar, TasksBottomSheetDestination tasksBottomSheetDestination, tp4 tp4Var) {
        super(2, tp4Var);
        this.G = l5hVar;
        this.H = tasksBottomSheetDestination;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        n nVar = new n(this.G, this.H, tp4Var);
        nVar.F = obj;
        return nVar;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        return ((n) create((String) obj, (tp4) obj2)).invokeSuspend(iei.a);
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        String str = (String) this.F;
        int i = this.E;
        if (i != 0) {
            if (i == 1) {
                sf5.h0(obj);
                return obj;
            }
            sz6.j("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        sf5.h0(obj);
        String strM893getTaskIdFxcw9s = ((TasksBottomSheetDestination.EventInspector) this.H).m893getTaskIdFxcw9s();
        this.F = null;
        this.E = 1;
        Object objO = this.G.O(strM893getTaskIdFxcw9s, str, this);
        m45 m45Var = m45.E;
        return objO == m45Var ? m45Var : objO;
    }
}
