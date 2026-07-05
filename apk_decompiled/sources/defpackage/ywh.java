package defpackage;

import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class ywh implements axh {
    public final int a;
    public final int b;
    public final Map c;

    public ywh(int i, int i2, Map map) {
        map.getClass();
        this.a = i;
        this.b = i2;
        this.c = map;
    }

    public final Map a() {
        return this.c;
    }

    public final int b() {
        return this.b;
    }

    public final int c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ywh)) {
            return false;
        }
        ywh ywhVar = (ywh) obj;
        return this.a == ywhVar.a && this.b == ywhVar.b && x44.r(this.c, ywhVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + vb7.c(this.b, Integer.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        return qy1.i(vb7.v("PartialFailure(successCount=", ", failureCount=", this.a, this.b, ", errorTypeCounts="), this.c, ")");
    }
}
