package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes2.dex */
public final class tt5 extends AnimatorListenerAdapter {
    public final /* synthetic */ ViewGroup a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ ut5 c;

    public tt5(ViewGroup viewGroup, boolean z, rgg rggVar, ut5 ut5Var) {
        this.a = viewGroup;
        this.b = z;
        this.c = ut5Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        animator.getClass();
        this.a.endViewTransition(null);
        if (!this.b) {
            throw null;
        }
        throw null;
    }
}
