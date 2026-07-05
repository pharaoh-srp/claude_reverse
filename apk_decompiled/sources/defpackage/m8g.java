package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class m8g {
    public final a80 a;
    public long b;

    public m8g(a80 a80Var, long j) {
        this.a = a80Var;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof m8g) {
            m8g m8gVar = (m8g) obj;
            if (this.a == m8gVar.a && g79.b(this.b, m8gVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "AnimData(anim=" + this.a + ", startSize=" + ((Object) g79.c(this.b)) + ')';
    }
}
