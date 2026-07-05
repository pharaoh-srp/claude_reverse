package defpackage;

import android.content.Context;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes2.dex */
public final class pbj extends ob implements tcb {
    public final Context G;
    public final vcb H;
    public qb5 I;
    public WeakReference J;
    public final /* synthetic */ qbj K;

    public pbj(qbj qbjVar, Context context, qb5 qb5Var) {
        this.K = qbjVar;
        this.G = context;
        this.I = qb5Var;
        vcb vcbVar = new vcb(context);
        vcbVar.l = 1;
        this.H = vcbVar;
        vcbVar.e = this;
    }

    @Override // defpackage.tcb
    public final void B(vcb vcbVar) {
        if (this.I == null) {
            return;
        }
        h();
        kb kbVar = this.K.f.H;
        if (kbVar != null) {
            kbVar.l();
        }
    }

    @Override // defpackage.tcb
    public final boolean a(vcb vcbVar, MenuItem menuItem) {
        qb5 qb5Var = this.I;
        if (qb5Var != null) {
            return ((c61) qb5Var.E).A(this, menuItem);
        }
        return false;
    }

    @Override // defpackage.ob
    public final void b() {
        qbj qbjVar = this.K;
        if (qbjVar.i != this) {
            return;
        }
        if (qbjVar.p) {
            qbjVar.j = this;
            qbjVar.k = this.I;
        } else {
            this.I.s(this);
        }
        this.I = null;
        qbjVar.a(false);
        ActionBarContextView actionBarContextView = qbjVar.f;
        if (actionBarContextView.O == null) {
            actionBarContextView.e();
        }
        qbjVar.c.setHideOnContentScrollEnabled(qbjVar.t);
        qbjVar.i = null;
    }

    @Override // defpackage.ob
    public final View c() {
        WeakReference weakReference = this.J;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // defpackage.ob
    public final vcb d() {
        return this.H;
    }

    @Override // defpackage.ob
    public final xyg e() {
        return new xyg(this.G);
    }

    @Override // defpackage.ob
    public final CharSequence f() {
        return this.K.f.getSubtitle();
    }

    @Override // defpackage.ob
    public final CharSequence g() {
        return this.K.f.getTitle();
    }

    @Override // defpackage.ob
    public final void h() {
        if (this.K.i != this) {
            return;
        }
        vcb vcbVar = this.H;
        vcbVar.w();
        try {
            this.I.t(this, vcbVar);
        } finally {
            vcbVar.v();
        }
    }

    @Override // defpackage.ob
    public final boolean i() {
        return this.K.f.W;
    }

    @Override // defpackage.ob
    public final void j(View view) {
        this.K.f.setCustomView(view);
        this.J = new WeakReference(view);
    }

    @Override // defpackage.ob
    public final void k(int i) {
        l(this.K.a.getResources().getString(i));
    }

    @Override // defpackage.ob
    public final void l(CharSequence charSequence) {
        this.K.f.setSubtitle(charSequence);
    }

    @Override // defpackage.ob
    public final void m(int i) {
        n(this.K.a.getResources().getString(i));
    }

    @Override // defpackage.ob
    public final void n(CharSequence charSequence) {
        this.K.f.setTitle(charSequence);
    }

    @Override // defpackage.ob
    public final void o(boolean z) {
        this.F = z;
        this.K.f.setTitleOptional(z);
    }
}
