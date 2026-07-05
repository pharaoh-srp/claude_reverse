package defpackage;

import java.util.Date;

/* JADX INFO: loaded from: classes.dex */
public final class pfa {
    public final int a;
    public final String b;
    public final Date c;

    public pfa(int i, String str) {
        Date date = new Date();
        sq6.a(i);
        this.a = i;
        this.b = str;
        this.c = date;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pfa)) {
            return false;
        }
        pfa pfaVar = (pfa) obj;
        return this.a == pfaVar.a && x44.r(this.b, pfaVar.b) && x44.r(this.c, pfaVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + kgh.l(sq6.F(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        return "LogMessage(kind=" + y6a.w(this.a) + ", message=" + this.b + ", dateTime=" + this.c + ')';
    }
}
