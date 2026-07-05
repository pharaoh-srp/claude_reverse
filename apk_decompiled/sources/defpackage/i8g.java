package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class i8g {
    public static final i8g c;
    public final kud a;
    public final kud b;

    static {
        t46 t46Var = t46.M;
        c = new i8g(t46Var, t46Var);
    }

    public i8g(kud kudVar, kud kudVar2) {
        this.a = kudVar;
        this.b = kudVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i8g)) {
            return false;
        }
        i8g i8gVar = (i8g) obj;
        return this.a.equals(i8gVar.a) && this.b.equals(i8gVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Size(width=" + this.a + ", height=" + this.b + ')';
    }
}
