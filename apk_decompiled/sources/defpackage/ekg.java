package defpackage;

import android.content.Context;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes2.dex */
public final class ekg extends ob implements tcb {
    public Context G;
    public ActionBarContextView H;
    public qb5 I;
    public WeakReference J;
    public boolean K;
    public vcb L;

    @Override // defpackage.tcb
    public final void B(vcb vcbVar) {
        h();
        kb kbVar = this.H.H;
        if (kbVar != null) {
            kbVar.l();
        }
    }

    @Override // defpackage.tcb
    public final boolean a(vcb vcbVar, MenuItem menuItem) {
        return ((c61) this.I.E).A(this, menuItem);
    }

    @Override // defpackage.ob
    public final void b() {
        if (this.K) {
            return;
        }
        this.K = true;
        this.I.s(this);
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
        return this.L;
    }

    @Override // defpackage.ob
    public final xyg e() {
        return new xyg(this.H.getContext());
    }

    @Override // defpackage.ob
    public final CharSequence f() {
        return this.H.getSubtitle();
    }

    @Override // defpackage.ob
    public final CharSequence g() {
        return this.H.getTitle();
    }

    @Override // defpackage.ob
    public final void h() {
        this.I.t(this, this.L);
    }

    @Override // defpackage.ob
    public final boolean i() {
        return this.H.W;
    }

    @Override // defpackage.ob
    public final void j(View view) {
        this.H.setCustomView(view);
        this.J = view != null ? new WeakReference(view) : null;
    }

    @Override // defpackage.ob
    public final void k(int i) {
        l(this.G.getString(i));
    }

    @Override // defpackage.ob
    public final void l(CharSequence charSequence) {
        this.H.setSubtitle(charSequence);
    }

    @Override // defpackage.ob
    public final void m(int i) {
        n(this.G.getString(i));
    }

    @Override // defpackage.ob
    public final void n(CharSequence charSequence) {
        this.H.setTitle(charSequence);
    }

    @Override // defpackage.ob
    public final void o(boolean z) {
        this.F = z;
        this.H.setTitleOptional(z);
    }
}
