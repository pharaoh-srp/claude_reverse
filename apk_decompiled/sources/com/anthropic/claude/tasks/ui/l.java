package com.anthropic.claude.tasks.ui;

import com.anthropic.claude.tasks.ui.TasksBottomSheetDestination;
import defpackage.iei;
import defpackage.l5h;
import defpackage.m45;
import defpackage.pz7;
import defpackage.sf5;
import defpackage.sz6;
import defpackage.t4g;
import defpackage.tp4;
import defpackage.xzg;

/* JADX INFO: loaded from: classes3.dex */
public final class l extends xzg implements pz7 {
    public int E;
    public /* synthetic */ Object F;
    public final /* synthetic */ l5h G;
    public final /* synthetic */ TasksBottomSheetDestination H;
    public final /* synthetic */ t4g I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(l5h l5hVar, TasksBottomSheetDestination tasksBottomSheetDestination, t4g t4gVar, tp4 tp4Var) {
        super(2, tp4Var);
        this.G = l5hVar;
        this.H = tasksBottomSheetDestination;
        this.I = t4gVar;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        l lVar = new l(this.G, this.H, this.I, tp4Var);
        lVar.F = obj;
        return lVar;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        return ((l) create((String) obj, (tp4) obj2)).invokeSuspend(iei.a);
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        String str = (String) this.F;
        int i = this.E;
        if (i == 0) {
            sf5.h0(obj);
            String strM898getTaskIdFxcw9s = ((TasksBottomSheetDestination.FormInput) this.H).m898getTaskIdFxcw9s();
            this.F = null;
            this.E = 1;
            obj = this.G.O(strM898getTaskIdFxcw9s, str, this);
            m45 m45Var = m45.E;
            if (obj == m45Var) {
                return m45Var;
            }
        } else {
            if (i != 1) {
                sz6.j("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            sf5.h0(obj);
        }
        if (((Boolean) obj).booleanValue()) {
            this.I.c();
        }
        return obj;
    }
}
