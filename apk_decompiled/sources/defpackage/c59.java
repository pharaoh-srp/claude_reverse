package defpackage;

import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class c59 {
    public final int a;
    public final int b;
    public final Map c;

    public /* synthetic */ c59(int i, int i2, Map map, int i3) {
        this((i3 & 1) != 0 ? -1 : i, (i3 & 2) != 0 ? -1 : i2, (i3 & 4) != 0 ? nm6.E : map);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c59)) {
            return false;
        }
        c59 c59Var = (c59) obj;
        return this.a == c59Var.a && this.b == c59Var.b && x44.r(this.c, c59Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + vb7.c(this.b, Integer.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        return "InsertedViewInfo(mainViewId=" + this.a + ", complexViewId=" + this.b + ", children=" + this.c + ')';
    }

    public c59(int i, int i2, Map map) {
        this.a = i;
        this.b = i2;
        this.c = map;
    }
}
