package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class sd4 extends kd4 {
    public final bg9 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sd4(e99 e99Var, bg9 bg9Var) {
        super(e99Var);
        bg9Var.getClass();
        this.c = bg9Var;
    }

    @Override // defpackage.kd4
    public final void b() {
        this.a = true;
        this.d++;
    }

    @Override // defpackage.kd4
    public final void c() {
        this.a = false;
        e99 e99Var = (e99) this.b;
        e99Var.g("\n");
        int i = this.d;
        for (int i2 = 0; i2 < i; i2++) {
            String str = this.c.a.g;
            str.getClass();
            e99Var.g(str);
        }
    }

    @Override // defpackage.kd4
    public final void d() {
        if (this.a) {
            this.a = false;
        } else {
            c();
        }
    }

    @Override // defpackage.kd4
    public final void l() {
        f(' ');
    }

    @Override // defpackage.kd4
    public final void m() {
        this.d--;
    }
}
