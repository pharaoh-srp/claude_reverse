package defpackage;

import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class bqj {
    public static final qz8 d = qz8.o(3, "_syn", "_err", "_el");
    public String a;
    public final long b;
    public final HashMap c;

    public bqj(String str, long j, HashMap map) {
        this.a = str;
        this.b = j;
        HashMap map2 = new HashMap();
        this.c = map2;
        if (map != null) {
            map2.putAll(map);
        }
    }

    public static Object b(Object obj, Object obj2, String str) {
        if (d.contains(str) && (obj2 instanceof Double)) {
            return Long.valueOf(Math.round(((Double) obj2).doubleValue()));
        }
        if (str.startsWith("_")) {
            if (!(obj instanceof String) && obj != null) {
                return obj;
            }
        } else {
            if (obj instanceof Double) {
                return obj2;
            }
            if (obj instanceof Long) {
                return Long.valueOf(Math.round(((Double) obj2).doubleValue()));
            }
            if (obj instanceof String) {
                return obj2.toString();
            }
        }
        return obj2;
    }

    public final long a() {
        return this.b;
    }

    public final String c() {
        return this.a;
    }

    public final /* synthetic */ Object clone() {
        return new bqj(this.a, this.b, new HashMap(this.c));
    }

    public final HashMap d() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bqj)) {
            return false;
        }
        bqj bqjVar = (bqj) obj;
        if (this.b == bqjVar.b && this.a.equals(bqjVar.a)) {
            return this.c.equals(bqjVar.c);
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        long j = this.b;
        return this.c.hashCode() + ((iHashCode + ((int) (j ^ (j >>> 32)))) * 31);
    }

    public final String toString() {
        String str = this.a;
        return kgh.q(vb7.w("Event{name='", str, "', timestamp=", this.b), ", params=", String.valueOf(this.c), "}");
    }
}
