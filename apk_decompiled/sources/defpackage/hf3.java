package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class hf3 implements v3a {
    public final /* synthetic */ int E;
    public final Object F;

    public /* synthetic */ hf3(int i, Object obj) {
        this.E = i;
        this.F = obj;
    }

    private final void a() {
    }

    private final void d() {
    }

    private final void e() {
    }

    private final void f() {
    }

    private final void g() {
    }

    private final void h() {
    }

    private final void i() {
    }

    private final void j() {
    }

    private final void k() {
    }

    private final void l() {
    }

    private final void m() {
    }

    private final void n() {
    }

    private final void o() {
    }

    private final void p() {
    }

    private final void q() {
    }

    @Override // defpackage.v3a
    public final void b() {
        switch (this.E) {
            case 0:
            case 1:
            case 2:
                break;
            default:
                ((bz7) this.F).invoke(z3a.G);
                break;
        }
    }

    @Override // defpackage.v3a
    public final void c() {
        switch (this.E) {
            case 0:
            case 1:
            case 2:
                break;
            default:
                ((bz7) this.F).invoke(z3a.H);
                break;
        }
    }

    @Override // defpackage.v3a
    public final void onCreate() {
        switch (this.E) {
            case 0:
            case 1:
            case 2:
                break;
            default:
                ((bz7) this.F).invoke(z3a.G);
                break;
        }
    }

    @Override // defpackage.v3a
    public final void onDestroy() {
        int i = this.E;
        Object obj = this.F;
        switch (i) {
            case 0:
                ((uwb) obj).a();
                break;
            case 1:
                ArrayList arrayList = ((if3) ((fj0) obj).G).a;
                arrayList.getClass();
                Iterator it = new ese(arrayList).iterator();
                while (true) {
                    dse dseVar = (dse) it;
                    if (!dseVar.hasNext()) {
                        break;
                    } else {
                        qe3 qe3Var = (qe3) dseVar.next();
                        if (!(qe3Var instanceof oe3)) {
                            if (!(qe3Var instanceof pe3)) {
                                mr9.b();
                                break;
                            }
                        } else {
                            oe3 oe3Var = (oe3) qe3Var;
                            oe3Var.g.e();
                            yfd.v(oe3Var.d);
                        }
                    }
                }
                break;
            case 2:
                fd9.z((mp4) obj, null);
                break;
            default:
                ((bz7) obj).invoke(z3a.E);
                break;
        }
    }

    @Override // defpackage.v3a
    public final void onPause() {
        switch (this.E) {
            case 0:
            case 1:
            case 2:
                break;
            default:
                ((bz7) this.F).invoke(z3a.H);
                break;
        }
    }

    @Override // defpackage.v3a
    public final void onResume() {
        switch (this.E) {
            case 0:
            case 1:
            case 2:
                break;
            default:
                ((bz7) this.F).invoke(z3a.I);
                break;
        }
    }
}
