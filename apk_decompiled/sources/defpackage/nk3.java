package defpackage;

import android.app.Activity;
import android.view.View;
import com.anthropic.claude.app.n0;

/* JADX INFO: loaded from: classes.dex */
public final class nk3 implements lp7 {
    public final /* synthetic */ pl3 E;
    public final /* synthetic */ View F;
    public final /* synthetic */ x89 G;
    public final /* synthetic */ nwb H;
    public final /* synthetic */ nwb I;
    public final /* synthetic */ nwb J;
    public final /* synthetic */ Activity K;
    public final /* synthetic */ j8f L;
    public final /* synthetic */ nwb M;

    public nk3(pl3 pl3Var, View view, x89 x89Var, nwb nwbVar, nwb nwbVar2, nwb nwbVar3, Activity activity, j8f j8fVar, nwb nwbVar4) {
        this.E = pl3Var;
        this.F = view;
        this.G = x89Var;
        this.H = nwbVar;
        this.I = nwbVar2;
        this.J = nwbVar3;
        this.K = activity;
        this.L = j8fVar;
        this.M = nwbVar4;
    }

    @Override // defpackage.lp7
    public final Object g(Object obj, tp4 tp4Var) {
        this.E.a(this.F);
        nwb nwbVar = this.H;
        boolean zBooleanValue = ((Boolean) nwbVar.getValue()).booleanValue();
        iei ieiVar = iei.a;
        if (!zBooleanValue && !((Boolean) this.I.getValue()).booleanValue()) {
            if (this.G.a()) {
                nwbVar.setValue(Boolean.TRUE);
                return ieiVar;
            }
            if (!((Boolean) ((zy7) this.J.getValue()).a()).booleanValue()) {
                return n0.p(this.K, this.L, this.M, tp4Var);
            }
        }
        return ieiVar;
    }
}
