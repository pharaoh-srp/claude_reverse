package com.anthropic.claude.tasks.ui;

import com.anthropic.claude.tasks.ui.TasksBottomSheetDestination;
import defpackage.b3f;
import defpackage.iei;
import defpackage.kah;
import defpackage.l33;
import defpackage.l45;
import defpackage.l5h;
import defpackage.m45;
import defpackage.pz7;
import defpackage.sf5;
import defpackage.sz6;
import defpackage.tp4;
import defpackage.xzg;

/* JADX INFO: loaded from: classes3.dex */
public final class m extends xzg implements pz7 {
    public int E;
    public final /* synthetic */ l5h F;
    public final /* synthetic */ TasksBottomSheetDestination G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(l5h l5hVar, TasksBottomSheetDestination tasksBottomSheetDestination, tp4 tp4Var) {
        super(2, tp4Var);
        this.F = l5hVar;
        this.G = tasksBottomSheetDestination;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        return new m(this.F, this.G, tp4Var);
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        return ((m) create((l45) obj, (tp4) obj2)).invokeSuspend(iei.a);
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.E;
        if (i == 0) {
            sf5.h0(obj);
            String strM907getTaskIdFxcw9s = ((TasksBottomSheetDestination.TaskDetail) this.G).m907getTaskIdFxcw9s();
            l5h l5hVar = this.F;
            l5hVar.getClass();
            strM907getTaskIdFxcw9s.getClass();
            b3f b3fVarA = kah.a(l5hVar.b, strM907getTaskIdFxcw9s);
            l33 l33Var = l33.H;
            this.E = 1;
            Object objA = b3fVarA.a(l33Var, this);
            m45 m45Var = m45.E;
            if (objA == m45Var) {
                return m45Var;
            }
        } else {
            if (i != 1) {
                sz6.j("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            sf5.h0(obj);
        }
        return iei.a;
    }
}
