package defpackage;

import android.os.Bundle;
import android.os.RemoteException;
import android.os.StrictMode;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class k2a implements i4a {
    public final /* synthetic */ int E;
    public final Object F;
    public Object G;

    public k2a(l4a l4aVar) {
        this.E = 2;
        this.F = l4aVar;
        uh3 uh3Var = uh3.c;
        Class<?> cls = l4aVar.getClass();
        sh3 sh3Var = (sh3) uh3Var.a.get(cls);
        this.G = sh3Var == null ? uh3Var.a(cls, null) : sh3Var;
    }

    public void a(y3a y3aVar) {
        kta ktaVar = (kta) this.F;
        x7b x7bVar = ktaVar.E;
        int i = 1;
        switch (ssa.a[y3aVar.ordinal()]) {
            case 1:
                lrb lrbVar = (lrb) x7bVar.a;
                if (lrbVar == null) {
                    x7bVar.l(1);
                } else {
                    try {
                        exk exkVar = (exk) lrbVar.G;
                        exkVar.L(exkVar.H(), 5);
                    } catch (RemoteException e) {
                        poc.q(e);
                        return;
                    }
                }
                break;
            case 2:
                Bundle bundle = new Bundle();
                StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
                StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitAll().build());
                try {
                    x7bVar.getClass();
                    x7bVar.m(bundle, new qmj(x7bVar, bundle));
                    if (((lrb) x7bVar.a) == null) {
                        x7b.k(ktaVar);
                    }
                } finally {
                    StrictMode.setThreadPolicy(threadPolicy);
                }
                break;
            case 3:
                x7bVar.getClass();
                x7bVar.m(null, new fnj(x7bVar, 0));
                break;
            case 4:
                x7bVar.getClass();
                x7bVar.m(null, new fnj(x7bVar, i));
                break;
            case 5:
                lrb lrbVar2 = (lrb) x7bVar.a;
                if (lrbVar2 == null) {
                    x7bVar.l(5);
                } else {
                    try {
                        exk exkVar2 = (exk) lrbVar2.G;
                        exkVar2.L(exkVar2.H(), 4);
                    } catch (RemoteException e2) {
                        poc.q(e2);
                        return;
                    }
                }
                break;
            case 6:
                lrb lrbVar3 = (lrb) x7bVar.a;
                if (lrbVar3 == null) {
                    x7bVar.l(4);
                } else {
                    try {
                        exk exkVar3 = (exk) lrbVar3.G;
                        exkVar3.L(exkVar3.H(), 13);
                    } catch (RemoteException e3) {
                        poc.q(e3);
                        return;
                    }
                }
                break;
            default:
                xh6.d("Unsupported lifecycle event: ", y3aVar);
                return;
        }
        this.G = y3aVar.a();
    }

    public void b(a4a a4aVar) {
        while (true) {
            a4a a4aVar2 = (a4a) this.G;
            if (a4aVar2 == a4aVar) {
                return;
            }
            int iCompareTo = a4aVar2.compareTo(a4aVar);
            a4a a4aVar3 = (a4a) this.G;
            if (iCompareTo < 0) {
                y3a.Companion.getClass();
                y3a y3aVarB = w3a.b(a4aVar3);
                if (y3aVarB == null) {
                    sz6.k("no event up from ", (a4a) this.G);
                    return;
                }
                a(y3aVarB);
            } else if (a4aVar3.compareTo(a4aVar) > 0) {
                w3a w3aVar = y3a.Companion;
                a4a a4aVar4 = (a4a) this.G;
                w3aVar.getClass();
                y3a y3aVarA = w3a.a(a4aVar4);
                if (y3aVarA == null) {
                    sz6.k("no event down from ", (a4a) this.G);
                    return;
                }
                a(y3aVarA);
            } else {
                continue;
            }
        }
    }

    @Override // defpackage.i4a
    public final void d(m4a m4aVar, y3a y3aVar) {
        int i = this.E;
        Object obj = this.F;
        switch (i) {
            case 0:
                if (y3aVar == y3a.ON_START) {
                    ((c4a) obj).c(this);
                    ((q28) this.G).D();
                }
                break;
            case 1:
                if (ssa.a[y3aVar.ordinal()] != 1) {
                    b(y3aVar.a());
                } else {
                    a4a a4aVar = (a4a) this.G;
                    a4a a4aVar2 = a4a.G;
                    if (a4aVar.compareTo(a4aVar2) > 0) {
                        b(a4aVar2);
                    }
                }
                break;
            default:
                HashMap map = ((sh3) this.G).a;
                sh3.a((List) map.get(y3aVar), m4aVar, y3aVar, obj);
                sh3.a((List) map.get(y3a.ON_ANY), m4aVar, y3aVar, obj);
                break;
        }
    }

    public k2a(q28 q28Var, c4a c4aVar) {
        this.E = 0;
        this.F = c4aVar;
        this.G = q28Var;
    }

    public k2a(kta ktaVar) {
        this.E = 1;
        this.F = ktaVar;
        this.G = a4a.F;
    }
}
