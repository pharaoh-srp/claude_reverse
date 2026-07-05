package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class p9e implements co4 {
    public final /* synthetic */ int a = 1;
    public final c80 b;
    public final boolean c;
    public final k80 d;
    public final Object e;

    public p9e(String str, c80 c80Var, c80 c80Var2, i80 i80Var, boolean z) {
        this.b = c80Var;
        this.d = c80Var2;
        this.e = i80Var;
        this.c = z;
    }

    @Override // defpackage.co4
    public final ym4 a(pna pnaVar, bna bnaVar, le1 le1Var) {
        switch (this.a) {
            case 0:
                return new o9e(pnaVar, le1Var, this);
            default:
                return new jhe(pnaVar, le1Var, this);
        }
    }

    public String toString() {
        switch (this.a) {
            case 0:
                return "RectangleShape{position=" + this.d + ", size=" + ((k80) this.e) + '}';
            default:
                return super.toString();
        }
    }

    public p9e(String str, k80 k80Var, b80 b80Var, c80 c80Var, boolean z) {
        this.d = k80Var;
        this.e = b80Var;
        this.b = c80Var;
        this.c = z;
    }
}
