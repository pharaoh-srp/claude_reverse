package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class z57 extends e67 {
    public final jad a;
    public final jad b;

    public z57(jad jadVar, jad jadVar2) {
        this.a = jadVar;
        this.b = jadVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z57)) {
            return false;
        }
        z57 z57Var = (z57) obj;
        return this.a.equals(z57Var.a) && this.b.equals(z57Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "PowerTarget(minPower=" + this.a + ", maxPower=" + this.b + ')';
    }
}
