package defpackage;

import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class db1 extends qdc {
    public final /* synthetic */ int d;
    public final Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public db1(wp5 wp5Var) {
        super(wp5Var.e());
        this.d = 2;
        this.e = wp5Var;
        wp5Var.c = dxf.q0(wp5Var.c, new tz9(11, this));
    }

    public static za1 g(ab1 ab1Var) {
        float fA = ab1Var.a();
        int iB = ab1Var.b();
        return new za1(fA, iB != 0 ? iB != 1 ? ya1.E : ya1.G : ya1.F, ab1Var.c(), ab1Var.d());
    }

    @Override // defpackage.qdc
    public final void a() {
        wa1 wa1VarB0;
        int i = this.d;
        Object obj = this.e;
        switch (i) {
            case 0:
                ((eb1) obj).c();
                break;
            case 1:
                rx7 rx7Var = (rx7) obj;
                if (rx7.J(3)) {
                    Objects.toString(rx7Var);
                }
                if (rx7.J(3)) {
                    Objects.toString(rx7Var.h);
                }
                tb1 tb1Var = rx7Var.h;
                if (tb1Var != null) {
                    tb1Var.r = false;
                    tb1Var.d();
                    tb1 tb1Var2 = rx7Var.h;
                    fc fcVar = new fc(24, rx7Var);
                    if (tb1Var2.p == null) {
                        tb1Var2.p = new ArrayList();
                    }
                    tb1Var2.p.add(fcVar);
                    rx7Var.h.e(false, true);
                    rx7Var.i = true;
                    rx7Var.A(true);
                    Iterator it = rx7Var.e().iterator();
                    while (it.hasNext()) {
                        ((yt5) it.next()).f();
                    }
                    rx7Var.i = false;
                    rx7Var.h = null;
                }
                break;
            default:
                wp5 wp5Var = (wp5) obj;
                i49 i49Var = wp5Var.b;
                if (i49Var != null && (wa1VarB0 = i49Var.B0()) != null) {
                    wa1VarB0.b();
                }
                wp5Var.b = null;
                break;
        }
    }

    @Override // defpackage.qdc
    public final void b() {
        int i = this.d;
        Object obj = this.e;
        switch (i) {
            case 0:
                ((eb1) obj).d();
                return;
            case 1:
                rx7 rx7Var = (rx7) obj;
                if (rx7.J(3)) {
                    Objects.toString(rx7Var);
                }
                db1 db1Var = rx7Var.j;
                ArrayList arrayList = rx7Var.n;
                rx7Var.i = true;
                rx7Var.A(true);
                rx7Var.i = false;
                if (rx7Var.h == null) {
                    if (db1Var.b) {
                        rx7.J(3);
                        rx7Var.R();
                        return;
                    } else {
                        rx7.J(3);
                        rx7Var.g.b().a();
                        return;
                    }
                }
                if (!arrayList.isEmpty()) {
                    LinkedHashSet linkedHashSet = new LinkedHashSet(rx7.E(rx7Var.h));
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ij0.x(it.next());
                        Iterator it2 = linkedHashSet.iterator();
                        if (it2.hasNext()) {
                            throw null;
                        }
                    }
                }
                Iterator it3 = rx7Var.h.a.iterator();
                while (it3.hasNext()) {
                    cx7 cx7Var = ((zx7) it3.next()).b;
                    if (cx7Var != null) {
                        cx7Var.Q = false;
                    }
                }
                Iterator it4 = rx7Var.f(new ArrayList(Collections.singletonList(rx7Var.h)), 0, 1).iterator();
                while (it4.hasNext()) {
                    ((yt5) it4.next()).c();
                }
                Iterator it5 = rx7Var.h.a.iterator();
                while (it5.hasNext()) {
                    cx7 cx7Var2 = ((zx7) it5.next()).b;
                    if (cx7Var2 != null && cx7Var2.j0 == null) {
                        rx7Var.g(cx7Var2).k();
                    }
                }
                rx7Var.h = null;
                rx7Var.g0();
                if (rx7.J(3)) {
                    boolean z = db1Var.b;
                    rx7Var.toString();
                    return;
                }
                return;
            default:
                ((wp5) obj).d();
                return;
        }
    }

    @Override // defpackage.qdc
    public final void c(ab1 ab1Var) {
        int i = this.d;
        Object obj = this.e;
        switch (i) {
            case 0:
                ((eb1) obj).e(ab1Var);
                return;
            case 1:
                rx7 rx7Var = (rx7) obj;
                if (rx7.J(2)) {
                    Log.v("FragmentManager", "handleOnBackProgressed. PREDICTIVE_BACK = true fragment manager " + rx7Var);
                }
                if (rx7Var.h != null) {
                    Iterator it = rx7Var.f(new ArrayList(Collections.singletonList(rx7Var.h)), 0, 1).iterator();
                    while (it.hasNext()) {
                        ((yt5) it.next()).k(ab1Var);
                    }
                    Iterator it2 = rx7Var.n.iterator();
                    if (it2.hasNext()) {
                        ij0.x(it2.next());
                        throw null;
                    }
                    return;
                }
                return;
            default:
                ((wp5) obj).g(g(ab1Var));
                return;
        }
    }

    @Override // defpackage.qdc
    public final void d(ab1 ab1Var) {
        int i = this.d;
        Object obj = this.e;
        switch (i) {
            case 0:
                ((eb1) obj).f();
                break;
            case 1:
                rx7 rx7Var = (rx7) obj;
                if (rx7.J(3)) {
                    Objects.toString(rx7Var);
                }
                rx7Var.x();
                rx7Var.y(new qx7(rx7Var), false);
                break;
            default:
                wp5 wp5Var = (wp5) obj;
                za1 za1VarG = g(ab1Var);
                wp5Var.getClass();
                wa1 wa1VarF = uuj.f(wp5Var.a);
                if (wa1VarF != null) {
                    wp5Var.b = new i49(za1VarG, wa1VarF);
                    wa1VarF.d(za1VarG);
                    break;
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ db1(int i, Object obj) {
        super(false);
        this.d = i;
        this.e = obj;
    }
}
