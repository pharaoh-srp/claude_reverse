package defpackage;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.Objects;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class bdj {
    public static final bdj b;
    public final xcj a;

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            b = vcj.x;
        } else if (i >= 30) {
            b = tcj.w;
        } else {
            b = xcj.b;
        }
    }

    public bdj(bdj bdjVar) {
        if (bdjVar == null) {
            this.a = new xcj(this);
            return;
        }
        xcj xcjVar = bdjVar.a;
        int i = Build.VERSION.SDK_INT;
        if (i >= 35 && (xcjVar instanceof wcj)) {
            this.a = new wcj(this, (wcj) xcjVar);
        } else if (i >= 34 && (xcjVar instanceof vcj)) {
            this.a = new vcj(this, (vcj) xcjVar);
        } else if (i >= 31 && (xcjVar instanceof ucj)) {
            this.a = new ucj(this, (ucj) xcjVar);
        } else if (i >= 30 && (xcjVar instanceof tcj)) {
            this.a = new tcj(this, (tcj) xcjVar);
        } else if (i >= 29 && (xcjVar instanceof rcj)) {
            this.a = new rcj(this, (rcj) xcjVar);
        } else if (i >= 28 && (xcjVar instanceof qcj)) {
            this.a = new qcj(this, (qcj) xcjVar);
        } else if (xcjVar instanceof pcj) {
            this.a = new pcj(this, (pcj) xcjVar);
        } else if (xcjVar instanceof ocj) {
            this.a = new ocj(this, (ocj) xcjVar);
        } else {
            this.a = new xcj(this);
        }
        xcjVar.e(this);
    }

    public static f59 a(f59 f59Var, int i, int i2, int i3, int i4) {
        int iMax = Math.max(0, f59Var.a - i);
        int iMax2 = Math.max(0, f59Var.b - i2);
        int iMax3 = Math.max(0, f59Var.c - i3);
        int iMax4 = Math.max(0, f59Var.d - i4);
        return (iMax == i && iMax2 == i2 && iMax3 == i3 && iMax4 == i4) ? f59Var : f59.c(iMax, iMax2, iMax3, iMax4);
    }

    public static bdj c(WindowInsets windowInsets, View view) {
        windowInsets.getClass();
        bdj bdjVar = new bdj(windowInsets);
        if (view != null && view.isAttachedToWindow()) {
            WeakHashMap weakHashMap = mvi.a;
            bdj bdjVarA = gvi.a(view);
            xcj xcjVar = bdjVar.a;
            xcjVar.y(bdjVarA);
            View rootView = view.getRootView();
            xcjVar.d(rootView);
            xcjVar.p(rootView);
            xcjVar.q();
            xcjVar.A(view.getWindowSystemUiVisibility());
        }
        return bdjVar;
    }

    public final WindowInsets b() {
        xcj xcjVar = this.a;
        if (xcjVar instanceof ocj) {
            return ((ocj) xcjVar).c;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof bdj) {
            return Objects.equals(this.a, ((bdj) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        xcj xcjVar = this.a;
        if (xcjVar == null) {
            return 0;
        }
        return xcjVar.hashCode();
    }

    public bdj(WindowInsets windowInsets) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 35) {
            this.a = new wcj(this, windowInsets);
            return;
        }
        if (i >= 34) {
            this.a = new vcj(this, windowInsets);
            return;
        }
        if (i >= 31) {
            this.a = new ucj(this, windowInsets);
            return;
        }
        if (i >= 30) {
            this.a = new tcj(this, windowInsets);
            return;
        }
        if (i >= 29) {
            this.a = new rcj(this, windowInsets);
        } else if (i >= 28) {
            this.a = new qcj(this, windowInsets);
        } else {
            this.a = new pcj(this, windowInsets);
        }
    }
}
