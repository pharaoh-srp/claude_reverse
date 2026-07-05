package defpackage;

import android.content.Context;
import android.view.Window;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class xj5 {
    public final kf9[] a;
    public final m4c b;
    public final sb c;
    public final h99 d;

    public xj5(kf9[] kf9VarArr, m4c m4cVar, sb sbVar, h99 h99Var) {
        h99Var.getClass();
        this.a = kf9VarArr;
        this.b = m4cVar;
        this.c = sbVar;
        this.d = h99Var;
    }

    public final void a(Window window, Context context, k99 k99Var) {
        k99Var.getClass();
        if (window == null) {
            return;
        }
        Window.Callback callback = window.getCallback();
        if (callback == null) {
            callback = new v4c();
        }
        WeakReference weakReference = new WeakReference(window);
        WeakReference weakReference2 = new WeakReference(context);
        kf9[] kf9VarArr = this.a;
        m4c m4cVar = this.b;
        window.setCallback(new lbj(window, k99Var, callback, new q28(context, new f38(k99Var, weakReference, kf9VarArr, m4cVar, weakReference2, this.d, this.c)), m4cVar, kf9VarArr, this.d));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!xj5.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        return Arrays.equals(this.a, ((xj5) obj).a) && m4c.class.equals(m4c.class);
    }

    public final int hashCode() {
        int iHashCode = Arrays.hashCode(this.a) + 544;
        return m4c.class.hashCode() + (iHashCode * 31) + iHashCode;
    }

    public final String toString() {
        return ij0.j("DatadogGesturesTracker(", mp0.M0(this.a, null, null, null, null, 63), ")");
    }
}
