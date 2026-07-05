package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.res.ColorStateList;
import android.view.View;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class q9 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public q9(iyi iyiVar, View view) {
        this.a = 2;
        this.b = iyiVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) obj;
                actionBarOverlayLayout.d0 = null;
                actionBarOverlayLayout.N = false;
                break;
            case 1:
            default:
                super.onAnimationCancel(animator);
                break;
            case 2:
                ((iyi) obj).a();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) obj;
                actionBarOverlayLayout.d0 = null;
                actionBarOverlayLayout.N = false;
                break;
            case 1:
                z90 z90Var = (z90) obj;
                ArrayList arrayList = new ArrayList(z90Var.I);
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ColorStateList colorStateList = ((xva) arrayList.get(i2)).b.S;
                    if (colorStateList != null) {
                        z90Var.setTintList(colorStateList);
                    }
                }
                break;
            default:
                ((iyi) obj).c();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 1:
                z90 z90Var = (z90) obj;
                ArrayList arrayList = new ArrayList(z90Var.I);
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((xva) arrayList.get(i2)).a(z90Var);
                }
                break;
            case 2:
                ((iyi) obj).b();
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public /* synthetic */ q9(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }
}
