package defpackage;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class l1e {
    public final int a;
    public final int b;
    public final int c;

    public l1e(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && l1e.class == obj.getClass()) {
            l1e l1eVar = (l1e) obj;
            if (this.a == l1eVar.a && this.b == l1eVar.b && this.c == l1eVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.a), Integer.valueOf(this.b), Integer.valueOf(this.c));
    }

    public final String toString() {
        return this.b + "," + this.c + ":" + this.a;
    }
}
