package defpackage;

import android.net.Uri;

/* JADX INFO: loaded from: classes3.dex */
public final class pl4 {
    public final Uri a;
    public final boolean b;

    public pl4(boolean z, Uri uri) {
        this.a = uri;
        this.b = z;
    }

    public final Uri a() {
        return this.a;
    }

    public final boolean b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!pl4.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        pl4 pl4Var = (pl4) obj;
        return this.a.equals(pl4Var.a) && this.b == pl4Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
