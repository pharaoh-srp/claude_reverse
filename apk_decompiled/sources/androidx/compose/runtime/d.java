package androidx.compose.runtime;

import defpackage.a0;
import defpackage.hn0;
import defpackage.nai;
import defpackage.p60;
import defpackage.pd4;
import defpackage.pz7;
import defpackage.qvb;
import defpackage.tc4;
import defpackage.wub;
import defpackage.wwb;

/* JADX INFO: loaded from: classes2.dex */
public final class d implements hn0 {
    public final wub E = new wub();
    public final qvb F = new qvb();
    public final Object G;

    public d(Object obj) {
        this.G = obj;
    }

    @Override // defpackage.hn0
    public final void a(int i, Object obj) {
        wub wubVar = this.E;
        wubVar.a(5);
        wubVar.a(i);
        this.F.a(obj);
    }

    @Override // defpackage.hn0
    public final void b(Object obj) {
        this.E.a(1);
        this.F.a(obj);
    }

    @Override // defpackage.hn0
    public final void c() {
        this.E.a(8);
    }

    @Override // defpackage.hn0
    public final void d(int i, int i2, int i3) {
        wub wubVar = this.E;
        wubVar.a(3);
        wubVar.a(i);
        wubVar.a(i2);
        wubVar.a(i3);
    }

    @Override // defpackage.hn0
    public final void e(int i, int i2) {
        wub wubVar = this.E;
        wubVar.a(2);
        wubVar.a(i);
        wubVar.a(i2);
    }

    public final void f() {
        this.E.a(9);
    }

    @Override // defpackage.hn0
    public final void g() {
        this.E.a(0);
    }

    @Override // defpackage.hn0
    public final void h(int i, Object obj) {
        wub wubVar = this.E;
        wubVar.a(6);
        wubVar.a(i);
        this.F.a(obj);
    }

    @Override // defpackage.hn0
    public final Object j() {
        return this.G;
    }

    @Override // defpackage.hn0
    public final void k(pz7 pz7Var, Object obj) {
        this.E.a(7);
        qvb qvbVar = this.F;
        qvbVar.a(pz7Var);
        qvbVar.a(obj);
    }

    public final void l(a0 a0Var, p60 p60Var) {
        Exception exc;
        int i;
        wub wubVar = this.E;
        int i2 = wubVar.b;
        qvb qvbVar = new qvb();
        int i3 = 0;
        int i4 = 0;
        while (true) {
            qvb qvbVar2 = this.F;
            if (i3 >= i2) {
                if (i4 != qvbVar2.b) {
                    pd4.a("Applier operation size mismatch");
                }
                qvbVar2.d();
                wubVar.b = 0;
                a0Var.i();
                return;
            }
            int i5 = i3 + 1;
            try {
                try {
                    switch (wubVar.c(i3)) {
                        case 0:
                            a0Var.g();
                            i3 = i5;
                            break;
                        case 1:
                            int i6 = i4 + 1;
                            a0Var.b(qvbVar2.f(i4));
                            i4 = i6;
                            i3 = i5;
                            break;
                        case 2:
                            int i7 = i3 + 2;
                            i3 += 3;
                            a0Var.e(wubVar.c(i5), wubVar.c(i7));
                            break;
                        case 3:
                            int i8 = i3 + 2;
                            try {
                                int i9 = i3 + 3;
                                try {
                                    i3 += 4;
                                    a0Var.d(wubVar.c(i5), wubVar.c(i8), wubVar.c(i9));
                                } catch (Exception e) {
                                    exc = e;
                                    i3 = i9;
                                }
                            } catch (Exception e2) {
                                exc = e2;
                                i3 = i8;
                            }
                            break;
                        case 4:
                            a0Var.f();
                            i3 = i5;
                            break;
                        case 5:
                            i3 += 2;
                            i = i4 + 1;
                            a0Var.a(wubVar.c(i5), qvbVar2.f(i4));
                            i4 = i;
                            break;
                        case 6:
                            i3 += 2;
                            try {
                                i = i4 + 1;
                                a0Var.h(wubVar.c(i5), qvbVar2.f(i4));
                                i4 = i;
                            } catch (Exception e3) {
                                exc = e3;
                            }
                            break;
                        case 7:
                            int i10 = i4 + 1;
                            Object objF = qvbVar2.f(i4);
                            objF.getClass();
                            nai.n(2, objF);
                            i4 += 2;
                            a0Var.k((pz7) objF, qvbVar2.f(i10));
                            i3 = i5;
                            break;
                        case 8:
                            Object obj = a0Var.G;
                            if (obj instanceof tc4) {
                                tc4 tc4Var = (tc4) obj;
                                if (((wwb) p60Var.J).l(tc4Var)) {
                                    tc4Var.c();
                                }
                            }
                            qvbVar.a(obj);
                            a0Var.c();
                            i3 = i5;
                            break;
                        default:
                            i3 = i5;
                            break;
                    }
                } catch (Exception e4) {
                    exc = e4;
                    i3 = i5;
                }
            } catch (Throwable th) {
                a0Var.i();
                throw th;
            }
            exc = e3;
            throw new ComposePausableCompositionException(qvbVar2, qvbVar, wubVar, i3 - 1, exc);
        }
    }
}
