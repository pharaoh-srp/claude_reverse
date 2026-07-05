package defpackage;

import android.util.Log;
import android.view.ViewGroup;
import android.view.animation.Animation;

/* JADX INFO: loaded from: classes2.dex */
public final class qt5 implements Animation.AnimationListener {
    public final /* synthetic */ ViewGroup a;
    public final /* synthetic */ rt5 b;

    public qt5(rgg rggVar, ViewGroup viewGroup, rt5 rt5Var) {
        this.a = viewGroup;
        this.b = rt5Var;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        animation.getClass();
        ViewGroup viewGroup = this.a;
        viewGroup.post(new fd(viewGroup, 28, this.b));
        if (rx7.J(2)) {
            Log.v("FragmentManager", "Animation from operation " + ((Object) null) + " has ended.");
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
        animation.getClass();
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        animation.getClass();
        if (rx7.J(2)) {
            Log.v("FragmentManager", "Animation from operation " + ((Object) null) + " has reached onAnimationStart.");
        }
    }
}
