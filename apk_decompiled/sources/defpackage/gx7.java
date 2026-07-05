package defpackage;

import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Transformation;

/* JADX INFO: loaded from: classes2.dex */
public final class gx7 extends AnimationSet implements Runnable {
    public final ViewGroup E;
    public boolean F;
    public boolean G;
    public boolean H;

    public gx7(Animation animation, ViewGroup viewGroup) {
        super(false);
        this.H = true;
        this.E = viewGroup;
        addAnimation(animation);
        viewGroup.post(this);
    }

    @Override // android.view.animation.AnimationSet, android.view.animation.Animation
    public final boolean getTransformation(long j, Transformation transformation) {
        this.H = true;
        if (this.F) {
            return !this.G;
        }
        if (!super.getTransformation(j, transformation)) {
            this.F = true;
            sgc.a(this.E, this);
        }
        return true;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z = this.F;
        ViewGroup viewGroup = this.E;
        if (z || !this.H) {
            viewGroup.endViewTransition(null);
            this.G = true;
        } else {
            this.H = false;
            viewGroup.post(this);
        }
    }

    @Override // android.view.animation.Animation
    public final boolean getTransformation(long j, Transformation transformation, float f) {
        this.H = true;
        if (this.F) {
            return !this.G;
        }
        if (!super.getTransformation(j, transformation, f)) {
            this.F = true;
            sgc.a(this.E, this);
        }
        return true;
    }
}
