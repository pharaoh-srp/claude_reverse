package defpackage;

import android.os.Build;
import android.view.DisplayCutout;

/* JADX INFO: loaded from: classes.dex */
public final class j86 {
    public final DisplayCutout a;

    public j86(DisplayCutout displayCutout) {
        this.a = displayCutout;
    }

    public final f59 a() {
        return Build.VERSION.SDK_INT >= 30 ? f59.d(c6.c(this.a)) : f59.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || j86.class != obj.getClass()) {
            return false;
        }
        return this.a.equals(((j86) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "DisplayCutoutCompat{" + this.a + "}";
    }
}
