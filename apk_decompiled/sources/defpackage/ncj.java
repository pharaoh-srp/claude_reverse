package defpackage;

import android.graphics.Rect;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class ncj {
    public final bdj a;
    public f59[] b;
    public final Rect[][] c;
    public final Rect[][] d;

    public ncj(bdj bdjVar) {
        this.c = new Rect[10][];
        this.d = new Rect[10][];
        this.a = bdjVar;
        c(bdjVar);
    }

    public final void a() {
        f59[] f59VarArr = this.b;
        if (f59VarArr != null) {
            f59 f59VarI = f59VarArr[0];
            f59 f59VarI2 = f59VarArr[1];
            bdj bdjVar = this.a;
            if (f59VarI2 == null) {
                f59VarI2 = bdjVar.a.i(2);
            }
            if (f59VarI == null) {
                f59VarI = bdjVar.a.i(1);
            }
            h(f59.a(f59VarI, f59VarI2));
            f59 f59Var = this.b[ycj.b(16)];
            if (f59Var != null) {
                g(f59Var);
            }
            f59 f59Var2 = this.b[ycj.b(32)];
            if (f59Var2 != null) {
                e(f59Var2);
            }
            f59 f59Var3 = this.b[ycj.b(64)];
            if (f59Var3 != null) {
                i(f59Var3);
            }
        }
    }

    public abstract bdj b();

    public void c(bdj bdjVar) {
        for (int i = 1; i <= 512; i <<= 1) {
            List<Rect> listF = bdjVar.a.f(i);
            int iB = ycj.b(i);
            this.c[iB] = (Rect[]) listF.toArray(new Rect[listF.size()]);
            if (i != 8) {
                List<Rect> listG = bdjVar.a.g(i);
                this.d[iB] = (Rect[]) listG.toArray(new Rect[listG.size()]);
            }
        }
    }

    public void d(int i, f59 f59Var) {
        if (this.b == null) {
            this.b = new f59[10];
        }
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            if ((i & i2) != 0) {
                this.b[ycj.b(i2)] = f59Var;
            }
        }
    }

    public void e(f59 f59Var) {
    }

    public abstract void f(f59 f59Var);

    public void g(f59 f59Var) {
    }

    public abstract void h(f59 f59Var);

    public void i(f59 f59Var) {
    }

    public ncj() {
        this(new bdj((bdj) null));
    }
}
