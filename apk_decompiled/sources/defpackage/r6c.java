package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class r6c {
    public final gh3 a;
    public final List b;

    public r6c(gh3 gh3Var, List list) {
        gh3Var.getClass();
        this.a = gh3Var;
        this.b = list;
    }

    public final gh3 a() {
        return this.a;
    }

    public final List b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r6c)) {
            return false;
        }
        r6c r6cVar = (r6c) obj;
        return x44.r(this.a, r6cVar.a) && this.b.equals(r6cVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ClassRequest(classId=" + this.a + ", typeParametersCount=" + this.b + ')';
    }
}
