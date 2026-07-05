package defpackage;

import android.graphics.drawable.BitmapDrawable;

/* JADX INFO: loaded from: classes2.dex */
public final class lo5 {
    public final BitmapDrawable a;
    public final boolean b;

    public lo5(BitmapDrawable bitmapDrawable, boolean z) {
        this.a = bitmapDrawable;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lo5)) {
            return false;
        }
        lo5 lo5Var = (lo5) obj;
        return this.a.equals(lo5Var.a) && this.b == lo5Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
