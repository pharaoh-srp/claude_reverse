package defpackage;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class o81 {
    public final String a;
    public final Integer b;
    public final bn6 c;
    public final long d;
    public final long e;
    public final Map f;

    public o81(String str, Integer num, bn6 bn6Var, long j, long j2, HashMap map) {
        this.a = str;
        this.b = num;
        this.c = bn6Var;
        this.d = j;
        this.e = j2;
        this.f = map;
    }

    public final String a(String str) {
        String str2 = (String) this.f.get(str);
        return str2 == null ? "" : str2;
    }

    public final int b(String str) {
        String str2 = (String) this.f.get(str);
        if (str2 == null) {
            return 0;
        }
        return Integer.valueOf(str2).intValue();
    }

    public final rl c() {
        rl rlVar = new rl();
        String str = this.a;
        if (str == null) {
            mr9.h("Null transportName");
            return null;
        }
        rlVar.E = str;
        rlVar.F = this.b;
        bn6 bn6Var = this.c;
        if (bn6Var == null) {
            mr9.h("Null encodedPayload");
            return null;
        }
        rlVar.G = bn6Var;
        rlVar.H = Long.valueOf(this.d);
        rlVar.I = Long.valueOf(this.e);
        rlVar.J = new HashMap(this.f);
        return rlVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof o81) {
            o81 o81Var = (o81) obj;
            if (this.a.equals(o81Var.a)) {
                Integer num = o81Var.b;
                Integer num2 = this.b;
                if (num2 != null ? num2.equals(num) : num == null) {
                    if (this.c.equals(o81Var.c) && this.d == o81Var.d && this.e == o81Var.e && this.f.equals(o81Var.f)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        Integer num = this.b;
        int iHashCode2 = (((iHashCode ^ (num == null ? 0 : num.hashCode())) * 1000003) ^ this.c.hashCode()) * 1000003;
        long j = this.d;
        int i = (iHashCode2 ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j2 = this.e;
        return this.f.hashCode() ^ ((i ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EventInternal{transportName=");
        sb.append(this.a);
        sb.append(", code=");
        sb.append(this.b);
        sb.append(", encodedPayload=");
        sb.append(this.c);
        sb.append(", eventMillis=");
        sb.append(this.d);
        sb.append(", uptimeMillis=");
        sb.append(this.e);
        sb.append(", autoMetadata=");
        return qy1.i(sb, this.f, "}");
    }
}
