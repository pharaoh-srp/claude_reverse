package defpackage;

import android.os.Build;
import android.view.ViewConfiguration;

/* JADX INFO: loaded from: classes.dex */
public final class e70 implements ovi {
    public final ViewConfiguration a;

    public e70(ViewConfiguration viewConfiguration) {
        this.a = viewConfiguration;
    }

    @Override // defpackage.ovi
    public final long a() {
        return ViewConfiguration.getDoubleTapTimeout();
    }

    @Override // defpackage.ovi
    public final long b() {
        return ViewConfiguration.getLongPressTimeout();
    }

    @Override // defpackage.ovi
    public final float c() {
        if (Build.VERSION.SDK_INT >= 34) {
            return trk.g(this.a);
        }
        return 2.0f;
    }

    @Override // defpackage.ovi
    public final float e() {
        return this.a.getScaledMaximumFlingVelocity();
    }

    @Override // defpackage.ovi
    public final float f() {
        return this.a.getScaledTouchSlop();
    }

    @Override // defpackage.ovi
    public final float g() {
        if (Build.VERSION.SDK_INT >= 34) {
            return trk.f(this.a);
        }
        return 16.0f;
    }
}
