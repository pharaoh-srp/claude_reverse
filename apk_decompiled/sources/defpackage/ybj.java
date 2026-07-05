package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public final class ybj extends AnimatorListenerAdapter {
    public final /* synthetic */ ecj a;
    public final /* synthetic */ View b;

    public ybj(ecj ecjVar, View view) {
        this.a = ecjVar;
        this.b = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ecj ecjVar = this.a;
        ecjVar.a.e(1.0f);
        acj.f(ecjVar, this.b);
    }
}
