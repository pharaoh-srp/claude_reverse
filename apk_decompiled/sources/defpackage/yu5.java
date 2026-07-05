package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class yu5 extends ev5 implements Comparable {
    public final int I;
    public final int J;

    public yu5(int i, v3i v3iVar, int i2, bv5 bv5Var, int i3) {
        int i4;
        super(i, v3iVar, i2);
        this.I = pe1.n(i3, bv5Var.B) ? 1 : 0;
        jw7 jw7Var = this.H;
        int i5 = jw7Var.v;
        int i6 = -1;
        if (i5 != -1 && (i4 = jw7Var.w) != -1) {
            i6 = i5 * i4;
        }
        this.J = i6;
    }

    @Override // defpackage.ev5
    public final int a() {
        return this.I;
    }

    @Override // defpackage.ev5
    public final /* bridge */ /* synthetic */ boolean b(ev5 ev5Var) {
        return false;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Integer.compare(this.J, ((yu5) obj).J);
    }
}
