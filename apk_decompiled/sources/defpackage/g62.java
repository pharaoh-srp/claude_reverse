package defpackage;

import java.util.Date;

/* JADX INFO: loaded from: classes3.dex */
public final class g62 {
    public final String a;
    public final Date b;
    public final String c;

    public g62(String str, Date date, String str2) {
        str.getClass();
        date.getClass();
        str2.getClass();
        this.a = str;
        this.b = date;
        this.c = str2;
    }

    public final String a() {
        return this.c;
    }

    public final Date b() {
        return this.b;
    }

    public final String c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g62)) {
            return false;
        }
        g62 g62Var = (g62) obj;
        return x44.r(this.a, g62Var.a) && x44.r(this.b, g62Var.b) && x44.r(this.c, g62Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ebh.j(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CachedProject(uuid=");
        sb.append(this.a);
        sb.append(", updated_at=");
        sb.append(this.b);
        sb.append(", project_json=");
        return ij0.m(sb, this.c, ")");
    }
}
