package defpackage;

import android.os.Build;
import android.view.animation.Interpolator;

/* JADX INFO: loaded from: classes.dex */
public final class ecj {
    public dcj a;

    public ecj(int i, Interpolator interpolator, long j) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.a = new ccj(a6.m(i, interpolator, j));
        } else {
            this.a = new acj(i, interpolator, j);
        }
    }
}
