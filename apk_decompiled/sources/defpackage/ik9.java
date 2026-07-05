package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ik9 extends fe5 {
    public final String i;
    public final String j;

    public ik9(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.i = str;
        this.j = str2;
    }

    @Override // defpackage.fe5
    public final String c() {
        return this.i + this.j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ik9)) {
            return false;
        }
        ik9 ik9Var = (ik9) obj;
        return x44.r(this.i, ik9Var.i) && x44.r(this.j, ik9Var.j);
    }

    public final int hashCode() {
        return this.j.hashCode() + (this.i.hashCode() * 31);
    }
}
