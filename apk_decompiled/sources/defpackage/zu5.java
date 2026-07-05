package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class zu5 implements Comparable {
    public final boolean E;
    public final boolean F;

    public zu5(jw7 jw7Var, int i) {
        this.E = (jw7Var.e & 1) != 0;
        this.F = pe1.n(i, false);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        zu5 zu5Var = (zu5) obj;
        return s84.a.c(this.F, zu5Var.F).c(this.E, zu5Var.E).e();
    }
}
