package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class et1 implements wd7 {
    public final /* synthetic */ int a;
    public final wd7 b;

    public et1(byte b, int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = new b8g(35152, 2, "image/png");
                break;
            default:
                this.b = new b8g(16973, 2, "image/bmp");
                break;
        }
    }

    private final void g() {
    }

    private final void h() {
    }

    @Override // defpackage.wd7
    public final void a() {
        switch (this.a) {
            case 0:
            case 1:
                break;
            default:
                this.b.a();
                break;
        }
    }

    @Override // defpackage.wd7
    public final int b(xd7 xd7Var, xm7 xm7Var) {
        int i = this.a;
        wd7 wd7Var = this.b;
        switch (i) {
            case 0:
                return ((b8g) wd7Var).b(xd7Var, xm7Var);
            case 1:
                return ((b8g) wd7Var).b(xd7Var, xm7Var);
            default:
                return wd7Var.b(xd7Var, xm7Var);
        }
    }

    @Override // defpackage.wd7
    public final boolean c(xd7 xd7Var) {
        int i = this.a;
        wd7 wd7Var = this.b;
        switch (i) {
            case 0:
                return ((b8g) wd7Var).c(xd7Var);
            case 1:
                return ((b8g) wd7Var).c(xd7Var);
            default:
                return wd7Var.c(xd7Var);
        }
    }

    @Override // defpackage.wd7
    public final void d(long j, long j2) {
        int i = this.a;
        wd7 wd7Var = this.b;
        switch (i) {
            case 0:
                ((b8g) wd7Var).d(j, j2);
                break;
            case 1:
                ((b8g) wd7Var).d(j, j2);
                break;
            default:
                wd7Var.d(j, j2);
                break;
        }
    }

    @Override // defpackage.wd7
    public final void f(yd7 yd7Var) {
        int i = this.a;
        wd7 wd7Var = this.b;
        switch (i) {
            case 0:
                ((b8g) wd7Var).f(yd7Var);
                break;
            case 1:
                ((b8g) wd7Var).f(yd7Var);
                break;
            default:
                wd7Var.f(yd7Var);
                break;
        }
    }

    public et1(int i) {
        this.a = 2;
        if ((i & 1) != 0) {
            this.b = new b8g(65496, 2, "image/jpeg");
        } else {
            this.b = new yf9();
        }
    }
}
