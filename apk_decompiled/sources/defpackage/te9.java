package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class te9 {
    public final gh3 a;
    public final gh3 b;
    public final gh3 c;

    public te9(gh3 gh3Var, gh3 gh3Var2, gh3 gh3Var3) {
        this.a = gh3Var;
        this.b = gh3Var2;
        this.c = gh3Var3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof te9)) {
            return false;
        }
        te9 te9Var = (te9) obj;
        return this.a.equals(te9Var.a) && this.b.equals(te9Var.b) && this.c.equals(te9Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "PlatformMutabilityMapping(javaClass=" + this.a + ", kotlinReadOnly=" + this.b + ", kotlinMutable=" + this.c + ')';
    }
}
