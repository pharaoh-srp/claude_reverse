package com.anthropic.claude.tasks.ui;

import com.anthropic.claude.tasks.ui.TasksListOverlay;
import defpackage.iei;
import defpackage.l45;
import defpackage.l5h;
import defpackage.m45;
import defpackage.pz7;
import defpackage.sf5;
import defpackage.sz6;
import defpackage.tp4;
import defpackage.xzg;

/* JADX INFO: loaded from: classes3.dex */
public final class x extends xzg implements pz7 {
    public int E;
    public final /* synthetic */ l5h F;
    public final /* synthetic */ TasksListOverlay G;
    public final /* synthetic */ String H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(l5h l5hVar, TasksListOverlay tasksListOverlay, String str, tp4 tp4Var) {
        super(2, tp4Var);
        this.F = l5hVar;
        this.G = tasksListOverlay;
        this.H = str;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        return new x(this.F, this.G, this.H, tp4Var);
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        return ((x) create((l45) obj, (tp4) obj2)).invokeSuspend(iei.a);
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        int i = this.E;
        if (i == 0) {
            sf5.h0(obj);
            String strM911getTaskIdFxcw9s = ((TasksListOverlay.BrowserTakeover) this.G).m911getTaskIdFxcw9s();
            this.E = 1;
            Object objO = this.F.O(strM911getTaskIdFxcw9s, this.H, this);
            m45 m45Var = m45.E;
            if (objO == m45Var) {
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
