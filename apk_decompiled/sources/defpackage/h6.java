package defpackage;

import android.view.accessibility.AccessibilityNodeInfo;

/* JADX INFO: loaded from: classes2.dex */
public final class h6 {
    public Object a;

    public /* synthetic */ h6(Object obj) {
        this.a = obj;
    }

    public static h6 c(boolean z, int i, int i2, int i3, int i4) {
        return new h6(AccessibilityNodeInfo.CollectionItemInfo.obtain(i, i2, i3, i4, false, z));
    }

    public void a(v79 v79Var) {
        Object obj = this.a;
        if (obj == null) {
            this.a = v79Var;
            return;
        }
        if (obj instanceof fwb) {
            ((fwb) obj).a(v79Var);
            return;
        }
        if (obj.equals(v79Var)) {
            return;
        }
        fwb fwbVar = v6f.a;
        fwb fwbVar2 = new fwb(2);
        fwbVar2.l((v79) obj);
        fwbVar2.l(v79Var);
        this.a = fwbVar2;
    }

    public boolean b() {
        return this.a != null;
    }

    public void d(v79 v79Var) {
        Object obj = this.a;
        if (x44.r(obj, v79Var)) {
            this.a = null;
            return;
        }
        if (obj instanceof fwb) {
            fwb fwbVar = (fwb) obj;
            fwbVar.m(v79Var);
            int i = fwbVar.d;
            if (i == 0) {
                this.a = null;
            } else {
                if (i != 1) {
                    return;
                }
                this.a = fwbVar.f();
            }
        }
    }
}
