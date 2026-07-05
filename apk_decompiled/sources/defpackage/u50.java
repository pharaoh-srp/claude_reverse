package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class u50 {
    public e0g a;
    public long b;
    public fu9 c;
    public float d;
    public tzf e;

    public u50(e0g e0gVar, long j, fu9 fu9Var, float f, tzf tzfVar) {
        this.a = e0gVar;
        this.b = j;
        this.c = fu9Var;
        this.d = f;
        this.e = tzfVar;
    }

    public static u50 a(u50 u50Var) {
        return new u50(u50Var.a, u50Var.b, u50Var.c, u50Var.d, u50Var.e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u50)) {
            return false;
        }
        u50 u50Var = (u50) obj;
        return x44.r(this.a, u50Var.a) && k8g.b(this.b, u50Var.b) && this.c == u50Var.c && Float.compare(this.d, u50Var.d) == 0 && x44.r(this.e, u50Var.e);
    }

    public final int hashCode() {
        int iB = vb7.b(this.d, (this.c.hashCode() + vb7.e(this.a.hashCode() * 31, 31, this.b)) * 31, 31);
        tzf tzfVar = this.e;
        return iB + (tzfVar == null ? 0 : tzfVar.hashCode());
    }

    public final String toString() {
        return "ShadowKey(shape=" + this.a + ", size=" + ((Object) k8g.h(this.b)) + ", layoutDirection=" + this.c + ", density=" + this.d + ", shadow=" + this.e + ')';
    }
}
