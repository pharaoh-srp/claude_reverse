package defpackage;

import java.io.EOFException;
import java.io.InterruptedIOException;

/* JADX INFO: loaded from: classes2.dex */
public final class da1 implements wd7 {
    public final /* synthetic */ int a;
    public final ssc b;
    public final b8g c;

    public da1(int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = new ssc(4);
                this.c = new b8g(-1, -1, "image/webp");
                break;
            default:
                this.b = new ssc(4);
                this.c = new b8g(-1, -1, "image/avif");
                break;
        }
    }

    private final void g() {
    }

    private final void h() {
    }

    @Override // defpackage.wd7
    public final void a() {
        int i = this.a;
    }

    @Override // defpackage.wd7
    public final int b(xd7 xd7Var, xm7 xm7Var) {
        switch (this.a) {
        }
        return this.c.b(xd7Var, xm7Var);
    }

    @Override // defpackage.wd7
    public final boolean c(xd7 xd7Var) throws EOFException, InterruptedIOException {
        int i = this.a;
        ssc sscVar = this.b;
        switch (i) {
            case 0:
                fr5 fr5Var = (fr5) xd7Var;
                fr5Var.j(4, false);
                sscVar.J(4);
                fr5Var.d(sscVar.a, 0, 4, false);
                if (sscVar.B() == 1718909296) {
                    sscVar.J(4);
                    fr5Var.d(sscVar.a, 0, 4, false);
                    if (sscVar.B() == 1635150182) {
                    }
                }
                break;
            default:
                sscVar.J(4);
                fr5 fr5Var2 = (fr5) xd7Var;
                fr5Var2.d(sscVar.a, 0, 4, false);
                if (sscVar.B() == 1380533830) {
                    fr5Var2.j(4, false);
                    sscVar.J(4);
                    fr5Var2.d(sscVar.a, 0, 4, false);
                    if (sscVar.B() == 1464156752) {
                    }
                }
                break;
        }
        return false;
    }

    @Override // defpackage.wd7
    public final void d(long j, long j2) {
        switch (this.a) {
            case 0:
                this.c.d(j, j2);
                break;
            default:
                this.c.d(j, j2);
                break;
        }
    }

    @Override // defpackage.wd7
    public final void f(yd7 yd7Var) {
        int i = this.a;
        b8g b8gVar = this.c;
        switch (i) {
            case 0:
                b8gVar.f(yd7Var);
                break;
            default:
                b8gVar.f(yd7Var);
                break;
        }
    }
}
