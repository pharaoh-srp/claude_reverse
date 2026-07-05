package defpackage;

import android.graphics.Bitmap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class pab {
    public final Bitmap a;
    public final Map b;

    public pab(Bitmap bitmap, Map map) {
        this.a = bitmap;
        this.b = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pab)) {
            return false;
        }
        pab pabVar = (pab) obj;
        return this.a.equals(pabVar.a) && x44.r(this.b, pabVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Value(bitmap=" + this.a + ", extras=" + this.b + ')';
    }
}
