package defpackage;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes2.dex */
public final class q6b {
    public final String a;
    public final boolean b;
    public final boolean c;

    public q6b(String str, boolean z, boolean z2) {
        this.a = str;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == q6b.class) {
            q6b q6bVar = (q6b) obj;
            if (TextUtils.equals(this.a, q6bVar.a) && this.b == q6bVar.b && this.c == q6bVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((kgh.l(31, 31, this.a) + (this.b ? 1231 : 1237)) * 31) + (this.c ? 1231 : 1237);
    }
}
