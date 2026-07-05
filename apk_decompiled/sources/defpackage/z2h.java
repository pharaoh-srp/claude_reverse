package defpackage;

import android.os.Build;
import android.view.View;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public abstract class z2h {
    public int a;
    public int b;
    public int c;
    public Object d;

    public z2h() {
        if (yl4.E == null) {
            yl4.E = new yl4();
        }
    }

    public int a(int i) {
        if (i < this.c) {
            return ((ByteBuffer) this.d).getShort(this.b + i);
        }
        return 0;
    }

    public abstract Object b(View view);

    public abstract void c(View view, Object obj);

    public Object d(View view) {
        if (Build.VERSION.SDK_INT >= this.b) {
            return b(view);
        }
        Object tag = view.getTag(this.a);
        if (((Class) this.d).isInstance(tag)) {
            return tag;
        }
        return null;
    }

    public void e(View view, Object obj) {
        if (Build.VERSION.SDK_INT >= this.b) {
            c(view, obj);
            return;
        }
        if (f(d(view), obj)) {
            View.AccessibilityDelegate accessibilityDelegateC = mvi.c(view);
            h5 h5Var = accessibilityDelegateC == null ? null : accessibilityDelegateC instanceof g5 ? ((g5) accessibilityDelegateC).a : new h5(accessibilityDelegateC);
            if (h5Var == null) {
                h5Var = new h5();
            }
            mvi.h(view, h5Var);
            view.setTag(this.a, obj);
            mvi.e(view, this.c);
        }
    }

    public abstract boolean f(Object obj, Object obj2);

    public z2h(int i, Class cls, int i2, int i3) {
        this.a = i;
        this.d = cls;
        this.c = i2;
        this.b = i3;
    }
}
