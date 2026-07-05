package defpackage;

import android.graphics.Rect;
import android.view.View;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes2.dex */
public final class y20 implements x5d {
    public e2a a;
    public fkg b;
    public n2a c;
    public n2g d;

    @Override // defpackage.x5d
    public final void a() {
        j(null);
    }

    @Override // defpackage.x5d
    public final void b() {
        beg begVar;
        e2a e2aVar = this.a;
        if (e2aVar == null || (begVar = (beg) yb5.o(e2aVar, ve4.r)) == null) {
            return;
        }
        ((fx5) begVar).b();
    }

    @Override // defpackage.x5d
    public final void c() throws Throwable {
        fkg fkgVar = this.b;
        if (fkgVar != null) {
            fkgVar.d(null);
        }
        this.b = null;
        jwb jwbVarI = i();
        if (jwbVarI != null) {
            ((n2g) jwbVarI).e();
        }
    }

    @Override // defpackage.x5d
    public final void d(cjh cjhVar, xy8 xy8Var, f2d f2dVar, u25 u25Var) {
        j(new w20(cjhVar, this, xy8Var, f2dVar, u25Var, 0));
    }

    @Override // defpackage.x5d
    public final void e(cjh cjhVar, cjh cjhVar2) {
        n2a n2aVar = this.c;
        if (n2aVar != null) {
            boolean z = (kkh.c(n2aVar.L.b, cjhVar2.b) && x44.r(n2aVar.L.c, cjhVar2.c)) ? false : true;
            n2aVar.L = cjhVar2;
            int size = n2aVar.N.size();
            for (int i = 0; i < size; i++) {
                h9e h9eVar = (h9e) ((WeakReference) n2aVar.N.get(i)).get();
                if (h9eVar != null) {
                    h9eVar.g = cjhVar2;
                }
            }
            f2a f2aVar = n2aVar.Q;
            synchronized (f2aVar.c) {
                f2aVar.j = null;
                f2aVar.l = null;
                f2aVar.k = null;
                f2aVar.m = null;
                f2aVar.n = null;
            }
            if (x44.r(cjhVar, cjhVar2)) {
                if (z) {
                    i49 i49Var = n2aVar.F;
                    int iG = kkh.g(cjhVar2.b);
                    int iF = kkh.f(cjhVar2.b);
                    kkh kkhVar = n2aVar.L.c;
                    int iG2 = kkhVar != null ? kkh.g(kkhVar.a) : -1;
                    kkh kkhVar2 = n2aVar.L.c;
                    i49Var.D0().updateSelection((View) i49Var.F, iG, iF, iG2, kkhVar2 != null ? kkh.f(kkhVar2.a) : -1);
                    return;
                }
                return;
            }
            if (cjhVar != null && (!x44.r(cjhVar.a.F, cjhVar2.a.F) || (kkh.c(cjhVar.b, cjhVar2.b) && !x44.r(cjhVar.c, cjhVar2.c)))) {
                i49 i49Var2 = n2aVar.F;
                i49Var2.D0().restartInput((View) i49Var2.F);
                return;
            }
            int size2 = n2aVar.N.size();
            for (int i2 = 0; i2 < size2; i2++) {
                h9e h9eVar2 = (h9e) ((WeakReference) n2aVar.N.get(i2)).get();
                if (h9eVar2 != null) {
                    cjh cjhVar3 = n2aVar.L;
                    i49 i49Var3 = n2aVar.F;
                    if (h9eVar2.k) {
                        h9eVar2.g = cjhVar3;
                        if (h9eVar2.i) {
                            i49Var3.D0().updateExtractedText((View) i49Var3.F, h9eVar2.h, mkk.f(cjhVar3));
                        }
                        kkh kkhVar3 = cjhVar3.c;
                        long j = cjhVar3.b;
                        int iG3 = kkhVar3 != null ? kkh.g(kkhVar3.a) : -1;
                        kkh kkhVar4 = cjhVar3.c;
                        i49Var3.D0().updateSelection((View) i49Var3.F, kkh.g(j), kkh.f(j), iG3, kkhVar4 != null ? kkh.f(kkhVar4.a) : -1);
                    }
                }
            }
        }
    }

    @Override // defpackage.x5d
    public final void f(cjh cjhVar, occ occVar, yjh yjhVar, u3a u3aVar, l9e l9eVar, l9e l9eVar2) {
        n2a n2aVar = this.c;
        if (n2aVar != null) {
            f2a f2aVar = n2aVar.Q;
            synchronized (f2aVar.c) {
                try {
                    f2aVar.j = cjhVar;
                    f2aVar.l = occVar;
                    f2aVar.k = yjhVar;
                    f2aVar.m = l9eVar;
                    f2aVar.n = l9eVar2;
                    if (f2aVar.e || f2aVar.d) {
                        f2aVar.a();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // defpackage.x5d
    public final void g() {
        beg begVar;
        e2a e2aVar = this.a;
        if (e2aVar == null || (begVar = (beg) yb5.o(e2aVar, ve4.r)) == null) {
            return;
        }
        ((fx5) begVar).a();
    }

    @Override // defpackage.x5d
    public final void h(l9e l9eVar) {
        Rect rect;
        n2a n2aVar = this.c;
        if (n2aVar != null) {
            n2aVar.P = new Rect(mwa.L(l9eVar.a), mwa.L(l9eVar.b), mwa.L(l9eVar.c), mwa.L(l9eVar.d));
            if (!n2aVar.N.isEmpty() || (rect = n2aVar.P) == null) {
                return;
            }
            n2aVar.E.requestRectangleOnScreen(new Rect(rect));
        }
    }

    public final jwb i() {
        n2g n2gVar = this.d;
        if (n2gVar != null) {
            return n2gVar;
        }
        if (!tug.a) {
            return null;
        }
        n2g n2gVarB = o2g.b(0, 2, py1.G);
        this.d = n2gVarB;
        return n2gVarB;
    }

    public final void j(w20 w20Var) {
        e2a e2aVar = this.a;
        if (e2aVar == null) {
            return;
        }
        fkg fkgVarD = null;
        cm cmVar = new cm(w20Var, this, e2aVar, fkgVarD, 1);
        if (e2aVar.R) {
            fkgVarD = gb9.D(e2aVar.d1(), null, o45.H, new ix5(e2aVar, cmVar, fkgVarD, 22), 1);
        }
        this.b = fkgVarD;
    }

    public final void k(e2a e2aVar) {
        if (!(this.a == e2aVar)) {
            e39.c("Expected textInputModifierNode to be " + e2aVar + " but was " + this.a);
        }
        this.a = null;
    }
}
