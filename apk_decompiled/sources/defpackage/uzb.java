package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class uzb {
    public final int a;
    public final long b;
    public final Long c;
    public final String d;
    public final String e;
    public final String f;

    public uzb(int i, long j, Long l, String str, String str2, String str3) {
        this.a = i;
        this.b = j;
        this.c = l;
        this.d = str;
        this.e = str2;
        this.f = str3;
    }

    public final String a() {
        return this.d;
    }

    public final String b() {
        return this.f;
    }

    public final Long c() {
        return this.c;
    }

    public final long d() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uzb)) {
            return false;
        }
        uzb uzbVar = (uzb) obj;
        return this.a == uzbVar.a && this.b == uzbVar.b && x44.r(this.c, uzbVar.c) && this.d.equals(uzbVar.d) && this.e.equals(uzbVar.e) && this.f.equals(uzbVar.f);
    }

    public final int hashCode() {
        int iE = vb7.e(Integer.hashCode(this.a) * 31, 31, this.b);
        Long l = this.c;
        return this.f.hashCode() + kgh.l(kgh.l((iE + (l == null ? 0 : l.hashCode())) * 31, 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NdkCrashLog(signal=");
        sb.append(this.a);
        sb.append(", timestamp=");
        sb.append(this.b);
        sb.append(", timeSinceAppStartMs=");
        sb.append(this.c);
        sb.append(", signalName=");
        sb.append(this.d);
        kgh.u(sb, ", message=", this.e, ", stacktrace=", this.f);
        sb.append(")");
        return sb.toString();
    }
}
