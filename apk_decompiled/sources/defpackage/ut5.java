package defpackage;

import android.animation.AnimatorSet;
import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes2.dex */
public final class ut5 extends qgg {
    public final st5 b;
    public AnimatorSet c;

    public ut5(st5 st5Var) {
        this.b = st5Var;
    }

    @Override // defpackage.qgg
    public final void a(ViewGroup viewGroup) {
        viewGroup.getClass();
        AnimatorSet animatorSet = this.c;
        animatorSet.getClass();
        animatorSet.start();
        if (rx7.J(2)) {
            Log.v("FragmentManager", "Animator from operation " + ((Object) null) + " has started.");
        }
    }

    @Override // defpackage.qgg
    public final void b(ab1 ab1Var, ViewGroup viewGroup) {
        viewGroup.getClass();
        this.c.getClass();
        if (Build.VERSION.SDK_INT >= 34) {
            throw null;
        }
    }

    @Override // defpackage.qgg
    public final void c(ViewGroup viewGroup) {
        viewGroup.getClass();
        st5 st5Var = this.b;
        if (st5Var.o()) {
            return;
        }
        Context context = viewGroup.getContext();
        context.getClass();
        i49 i49VarP = st5Var.p(context);
        this.c = i49VarP != null ? (AnimatorSet) i49VarP.G : null;
        throw null;
    }
}
