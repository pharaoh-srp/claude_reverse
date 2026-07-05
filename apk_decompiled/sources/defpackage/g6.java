package defpackage;

import android.view.accessibility.AccessibilityNodeInfo;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class g6 implements w9c {
    public Object E;

    public g6() {
        this.E = new Object();
    }

    public static zq5 a(xpk xpkVar) {
        new epk(20);
        xpkVar.getClass();
        new HashMap();
        throw null;
    }

    public static g6 c(float f, float f2, float f3) {
        return new g6(AccessibilityNodeInfo.RangeInfo.obtain(1, f, f2, f3));
    }

    public static g6 d(int i, int i2) {
        return new g6(AccessibilityNodeInfo.CollectionInfo.obtain(i, i2, false, 0));
    }

    @Override // defpackage.w9c
    public String Z() {
        return "attempted to overwrite the existing value '" + this.E + '\'';
    }

    public Object b() {
        return this.E;
    }

    public /* synthetic */ g6(Object obj) {
        this.E = obj;
    }
}
