package defpackage;

import java.util.Date;

/* JADX INFO: loaded from: classes.dex */
public final class s52 {
    public final String a;
    public final Date b;
    public final String c;

    public s52(String str, Date date, String str2) {
        str.getClass();
        date.getClass();
        str2.getClass();
        this.a = str;
        this.b = date;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s52)) {
            return false;
        }
        s52 s52Var = (s52) obj;
        return x44.r(this.a, s52Var.a) && x44.r(this.b, s52Var.b) && x44.r(this.c, s52Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ebh.j(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CachedConversation(uuid=");
        sb.append(this.a);
        sb.append(", updated_at=");
        sb.append(this.b);
        sb.append(", conversation_json=");
        return ij0.m(sb, this.c, ")");
    }
}
