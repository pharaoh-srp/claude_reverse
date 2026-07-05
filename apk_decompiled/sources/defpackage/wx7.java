package defpackage;

import android.content.res.Resources;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.fragment.app.a;
import androidx.fragment.app.strictmode.WrongFragmentContainerViolation;
import io.sentry.e0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class wx7 {
    public final nyj a;
    public final dpf b;
    public final cx7 c;
    public boolean d = false;
    public int e = -1;

    public wx7(nyj nyjVar, dpf dpfVar, ClassLoader classLoader, lx7 lx7Var, Bundle bundle) {
        this.a = nyjVar;
        this.b = dpfVar;
        vx7 vx7Var = (vx7) bundle.getParcelable("state");
        cx7 cx7VarA = lx7Var.a(vx7Var.E);
        cx7VarA.I = vx7Var.F;
        cx7VarA.R = vx7Var.G;
        cx7VarA.T = vx7Var.H;
        cx7VarA.U = true;
        cx7VarA.b0 = vx7Var.I;
        cx7VarA.c0 = vx7Var.J;
        cx7VarA.d0 = vx7Var.K;
        cx7VarA.g0 = vx7Var.L;
        cx7VarA.P = vx7Var.M;
        cx7VarA.f0 = vx7Var.N;
        cx7VarA.e0 = vx7Var.O;
        cx7VarA.q0 = a4a.values()[vx7Var.P];
        cx7VarA.L = vx7Var.Q;
        cx7VarA.M = vx7Var.R;
        cx7VarA.l0 = vx7Var.S;
        this.c = cx7VarA;
        cx7VarA.F = bundle;
        Bundle bundle2 = bundle.getBundle("arguments");
        if (bundle2 != null) {
            bundle2.setClassLoader(classLoader);
        }
        rx7 rx7Var = cx7VarA.X;
        if (rx7Var != null && rx7Var.O()) {
            sz6.j("Fragment already added and state has been saved");
            throw null;
        }
        cx7VarA.J = bundle2;
        if (rx7.J(2)) {
            Log.v("FragmentManager", "Instantiated fragment " + cx7VarA);
        }
    }

    public final void a() {
        boolean zJ = rx7.J(3);
        cx7 cx7Var = this.c;
        if (zJ) {
            Objects.toString(cx7Var);
        }
        Bundle bundle = cx7Var.F;
        if (bundle != null) {
            bundle.getBundle("savedInstanceState");
        }
        cx7Var.Z.Q();
        cx7Var.E = 3;
        cx7Var.i0 = false;
        cx7Var.s();
        if (!cx7Var.i0) {
            a.a(cx7Var, " did not call through to super.onActivityCreated()");
            return;
        }
        if (rx7.J(3)) {
            cx7Var.toString();
        }
        cx7Var.F = null;
        rx7 rx7Var = cx7Var.Z;
        rx7Var.H = false;
        rx7Var.I = false;
        rx7Var.O.g = false;
        rx7Var.u(4);
        this.a.H(cx7Var, false);
    }

    public final void b() {
        boolean zJ = rx7.J(3);
        cx7 cx7Var = this.c;
        if (zJ) {
            Objects.toString(cx7Var);
        }
        cx7 cx7Var2 = cx7Var.K;
        wx7 wx7Var = null;
        dpf dpfVar = this.b;
        if (cx7Var2 != null) {
            wx7 wx7Var2 = (wx7) ((HashMap) dpfVar.G).get(cx7Var2.I);
            if (wx7Var2 == null) {
                StringBuilder sb = new StringBuilder("Fragment ");
                sb.append(cx7Var);
                cx7 cx7Var3 = cx7Var.K;
                sb.append(" declared target fragment ");
                sb.append(cx7Var3);
                sb.append(" that does not belong to this FragmentManager!");
                throw new IllegalStateException(sb.toString());
            }
            cx7Var.L = cx7Var.K.I;
            cx7Var.K = null;
            wx7Var = wx7Var2;
        } else {
            String str = cx7Var.L;
            if (str != null && (wx7Var = (wx7) ((HashMap) dpfVar.G).get(str)) == null) {
                StringBuilder sb2 = new StringBuilder("Fragment ");
                sb2.append(cx7Var);
                sb2.append(" declared target fragment ");
                sz6.j(ij0.m(sb2, cx7Var.L, " that does not belong to this FragmentManager!"));
                return;
            }
        }
        if (wx7Var != null) {
            wx7Var.k();
        }
        rx7 rx7Var = cx7Var.X;
        cx7Var.Y = rx7Var.w;
        cx7Var.a0 = rx7Var.y;
        nyj nyjVar = this.a;
        nyjVar.N(cx7Var, false);
        ArrayList arrayList = cx7Var.v0;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((ax7) it.next()).a();
        }
        arrayList.clear();
        cx7Var.Z.b(cx7Var.Y, cx7Var.b(), cx7Var);
        cx7Var.E = 0;
        cx7Var.i0 = false;
        cx7Var.u(cx7Var.Y.N);
        if (!cx7Var.i0) {
            a.a(cx7Var, " did not call through to super.onAttach()");
            return;
        }
        Iterator it2 = cx7Var.X.p.iterator();
        while (it2.hasNext()) {
            ((ux7) it2.next()).b();
        }
        rx7 rx7Var2 = cx7Var.Z;
        rx7Var2.H = false;
        rx7Var2.I = false;
        rx7Var2.O.g = false;
        rx7Var2.u(0);
        nyjVar.I(cx7Var, false);
    }

    public final int c() {
        Object obj;
        Object next;
        cx7 cx7Var = this.c;
        if (cx7Var.X == null) {
            return cx7Var.E;
        }
        int iMin = this.e;
        int iOrdinal = cx7Var.q0.ordinal();
        if (iOrdinal == 1) {
            iMin = Math.min(iMin, 0);
        } else if (iOrdinal == 2) {
            iMin = Math.min(iMin, 1);
        } else if (iOrdinal == 3) {
            iMin = Math.min(iMin, 5);
        } else if (iOrdinal != 4) {
            iMin = Math.min(iMin, -1);
        }
        if (cx7Var.R) {
            boolean z = cx7Var.S;
            int i = this.e;
            iMin = z ? Math.max(i, 2) : i < 4 ? Math.min(iMin, cx7Var.E) : Math.min(iMin, 1);
        }
        if (cx7Var.T && cx7Var.j0 == null) {
            iMin = Math.min(iMin, 4);
        }
        if (!cx7Var.O) {
            iMin = Math.min(iMin, 1);
        }
        ViewGroup viewGroup = cx7Var.j0;
        if (viewGroup != null) {
            yt5 yt5VarG = yt5.g(viewGroup, cx7Var.l());
            Iterator it = yt5VarG.b.iterator();
            while (true) {
                obj = null;
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                ((rgg) next).getClass();
                if (x44.r(null, cx7Var)) {
                    break;
                }
            }
            Iterator it2 = yt5VarG.c.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next2 = it2.next();
                ((rgg) next2).getClass();
                if (x44.r(null, cx7Var)) {
                    obj = next2;
                    break;
                }
            }
        }
        if (cx7Var.P) {
            iMin = cx7Var.r() ? Math.min(iMin, 1) : Math.min(iMin, -1);
        }
        if (cx7Var.k0 && cx7Var.E < 5) {
            iMin = Math.min(iMin, 4);
        }
        if (cx7Var.Q) {
            iMin = Math.max(iMin, 3);
        }
        if (rx7.J(2)) {
            Log.v("FragmentManager", "computeExpectedState() of " + iMin + " for " + cx7Var);
        }
        return iMin;
    }

    public final void d() {
        Bundle bundle;
        boolean zJ = rx7.J(3);
        cx7 cx7Var = this.c;
        if (zJ) {
            Objects.toString(cx7Var);
        }
        Bundle bundle2 = cx7Var.F;
        Bundle bundle3 = bundle2 != null ? bundle2.getBundle("savedInstanceState") : null;
        if (cx7Var.o0) {
            cx7Var.E = 1;
            Bundle bundle4 = cx7Var.F;
            if (bundle4 == null || (bundle = bundle4.getBundle("childFragmentManager")) == null) {
                return;
            }
            cx7Var.Z.W(bundle);
            rx7 rx7Var = cx7Var.Z;
            rx7Var.H = false;
            rx7Var.I = false;
            rx7Var.O.g = false;
            rx7Var.u(1);
            return;
        }
        nyj nyjVar = this.a;
        nyjVar.O(cx7Var, false);
        cx7Var.Z.Q();
        cx7Var.E = 1;
        cx7Var.i0 = false;
        cx7Var.r0.a(new wd4(1, cx7Var));
        cx7Var.v(bundle3);
        cx7Var.o0 = true;
        if (!cx7Var.i0) {
            a.a(cx7Var, " did not call through to super.onCreate()");
        } else {
            cx7Var.r0.f(y3a.ON_CREATE);
            nyjVar.J(cx7Var, false);
        }
    }

    public final void e() {
        String resourceName;
        cx7 cx7Var = this.c;
        if (cx7Var.R) {
            return;
        }
        if (rx7.J(3)) {
            Objects.toString(cx7Var);
        }
        Bundle bundle = cx7Var.F;
        ViewGroup viewGroup = null;
        Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
        LayoutInflater layoutInflaterY = cx7Var.y(bundle2);
        ViewGroup viewGroup2 = cx7Var.j0;
        if (viewGroup2 != null) {
            viewGroup = viewGroup2;
        } else {
            int i = cx7Var.c0;
            if (i != 0) {
                if (i == -1) {
                    e0.d(cx7Var, " for a container view with no id", "Cannot create fragment ");
                    return;
                }
                viewGroup = (ViewGroup) cx7Var.X.x.b0(i);
                if (viewGroup == null) {
                    if (!cx7Var.U && !cx7Var.T) {
                        try {
                            resourceName = cx7Var.F().getResources().getResourceName(cx7Var.c0);
                        } catch (Resources.NotFoundException unused) {
                            resourceName = "unknown";
                        }
                        throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(cx7Var.c0) + " (" + resourceName + ") for fragment " + cx7Var);
                    }
                } else if (!(viewGroup instanceof hx7)) {
                    xx7 xx7Var = yx7.a;
                    yx7.b(new WrongFragmentContainerViolation(cx7Var, "Attempting to add fragment " + cx7Var + " to container " + viewGroup + " which is not a FragmentContainerView"));
                    yx7.a(cx7Var).getClass();
                }
            }
        }
        cx7Var.j0 = viewGroup;
        cx7Var.E(layoutInflaterY, viewGroup, bundle2);
        cx7Var.E = 2;
    }

    public final void f() throws Exception {
        boolean z;
        cx7 cx7VarC;
        boolean zJ = rx7.J(3);
        cx7 cx7Var = this.c;
        if (zJ) {
            Objects.toString(cx7Var);
        }
        boolean z2 = cx7Var.P && !cx7Var.r();
        dpf dpfVar = this.b;
        if (z2) {
            dpfVar.U(cx7Var.I, null);
        }
        if (!z2) {
            tx7 tx7Var = (tx7) dpfVar.I;
            if (!((tx7Var.b.containsKey(cx7Var.I) && tx7Var.e) ? tx7Var.f : true)) {
                String str = cx7Var.L;
                if (str != null && (cx7VarC = dpfVar.C(str)) != null && cx7VarC.g0) {
                    cx7Var.K = cx7VarC;
                }
                cx7Var.E = 0;
                return;
            }
        }
        ex7 ex7Var = cx7Var.Y;
        if (ex7Var != null) {
            z = ((tx7) dpfVar.I).f;
        } else {
            z = ex7Var.N != null ? !r7.isChangingConfigurations() : true;
        }
        if (z2 || z) {
            tx7 tx7Var2 = (tx7) dpfVar.I;
            tx7Var2.getClass();
            if (rx7.J(3)) {
                Objects.toString(cx7Var);
            }
            tx7Var2.e(cx7Var.I, false);
        }
        cx7Var.Z.l();
        cx7Var.r0.f(y3a.ON_DESTROY);
        cx7Var.E = 0;
        cx7Var.i0 = false;
        cx7Var.o0 = false;
        cx7Var.i0 = true;
        if (!cx7Var.i0) {
            a.a(cx7Var, " did not call through to super.onDestroy()");
            return;
        }
        this.a.K(cx7Var, false);
        for (wx7 wx7Var : dpfVar.F()) {
            if (wx7Var != null) {
                cx7 cx7Var2 = wx7Var.c;
                if (cx7Var.I.equals(cx7Var2.L)) {
                    cx7Var2.K = cx7Var;
                    cx7Var2.L = null;
                }
            }
        }
        String str2 = cx7Var.L;
        if (str2 != null) {
            cx7Var.K = dpfVar.C(str2);
        }
        dpfVar.R(this);
    }

    public final void g() {
        boolean zJ = rx7.J(3);
        cx7 cx7Var = this.c;
        if (zJ) {
            Objects.toString(cx7Var);
        }
        ViewGroup viewGroup = cx7Var.j0;
        cx7Var.Z.u(1);
        cx7Var.E = 1;
        cx7Var.i0 = false;
        cx7Var.w();
        if (!cx7Var.i0) {
            a.a(cx7Var, " did not call through to super.onDestroyView()");
            return;
        }
        jgg jggVar = ((aca) i49.E0(cx7Var).G).b;
        int i = jggVar.G;
        for (int i2 = 0; i2 < i; i2++) {
            ((yba) jggVar.d(i2)).j();
        }
        cx7Var.V = false;
        this.a.T(cx7Var, false);
        cx7Var.j0 = null;
        cx7Var.s0 = null;
        cx7Var.t0.i(null);
        cx7Var.S = false;
    }

    public final void h() throws Exception {
        boolean zJ = rx7.J(3);
        cx7 cx7Var = this.c;
        if (zJ) {
            Objects.toString(cx7Var);
        }
        cx7Var.E = -1;
        cx7Var.i0 = false;
        cx7Var.x();
        if (!cx7Var.i0) {
            a.a(cx7Var, " did not call through to super.onDetach()");
            return;
        }
        rx7 rx7Var = cx7Var.Z;
        if (!rx7Var.J) {
            rx7Var.l();
            cx7Var.Z = new rx7();
        }
        this.a.L(cx7Var, false);
        cx7Var.E = -1;
        cx7Var.Y = null;
        cx7Var.a0 = null;
        cx7Var.X = null;
        if (!cx7Var.P || cx7Var.r()) {
            tx7 tx7Var = (tx7) this.b.I;
            if (!((tx7Var.b.containsKey(cx7Var.I) && tx7Var.e) ? tx7Var.f : true)) {
                return;
            }
        }
        if (rx7.J(3)) {
            Objects.toString(cx7Var);
        }
        cx7Var.o();
    }

    public final void i() {
        cx7 cx7Var = this.c;
        if (cx7Var.R && cx7Var.S && !cx7Var.V) {
            if (rx7.J(3)) {
                Objects.toString(cx7Var);
            }
            Bundle bundle = cx7Var.F;
            Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
            cx7Var.E(cx7Var.y(bundle2), null, bundle2);
        }
    }

    public final cx7 j() {
        return this.c;
    }

    public final void k() {
        dpf dpfVar = this.b;
        boolean z = this.d;
        cx7 cx7Var = this.c;
        if (z) {
            if (rx7.J(2)) {
                Log.v("FragmentManager", "Ignoring re-entrant call to moveToExpectedState() for " + cx7Var);
                return;
            }
            return;
        }
        try {
            this.d = true;
            boolean z2 = false;
            while (true) {
                int iC = c();
                int i = cx7Var.E;
                if (iC == i) {
                    if (!z2 && i == -1 && cx7Var.P && !cx7Var.r()) {
                        if (rx7.J(3)) {
                            Objects.toString(cx7Var);
                        }
                        tx7 tx7Var = (tx7) dpfVar.I;
                        tx7Var.getClass();
                        if (rx7.J(3)) {
                            Objects.toString(cx7Var);
                        }
                        tx7Var.e(cx7Var.I, true);
                        dpfVar.R(this);
                        if (rx7.J(3)) {
                            Objects.toString(cx7Var);
                        }
                        cx7Var.o();
                    }
                    if (cx7Var.n0) {
                        rx7 rx7Var = cx7Var.X;
                        if (rx7Var != null && cx7Var.O && rx7.K(cx7Var)) {
                            rx7Var.G = true;
                        }
                        cx7Var.n0 = false;
                        cx7Var.Z.o();
                    }
                    this.d = false;
                    return;
                }
                if (iC <= i) {
                    switch (i - 1) {
                        case -1:
                            h();
                            break;
                        case 0:
                            f();
                            break;
                        case 1:
                            g();
                            cx7Var.E = 1;
                            break;
                        case 2:
                            cx7Var.S = false;
                            cx7Var.E = 2;
                            break;
                        case 3:
                            if (rx7.J(3)) {
                                Objects.toString(cx7Var);
                            }
                            cx7Var.E = 3;
                            break;
                        case 4:
                            r();
                            break;
                        case 5:
                            cx7Var.E = 5;
                            break;
                        case 6:
                            l();
                            break;
                    }
                } else {
                    switch (i + 1) {
                        case 0:
                            b();
                            break;
                        case 1:
                            d();
                            break;
                        case 2:
                            i();
                            e();
                            break;
                        case 3:
                            a();
                            break;
                        case 4:
                            cx7Var.E = 4;
                            break;
                        case 5:
                            q();
                            break;
                        case 6:
                            cx7Var.E = 6;
                            break;
                        case 7:
                            n();
                            break;
                    }
                }
                z2 = true;
            }
        } catch (Throwable th) {
            this.d = false;
            throw th;
        }
    }

    public final void l() {
        boolean zJ = rx7.J(3);
        cx7 cx7Var = this.c;
        if (zJ) {
            Objects.toString(cx7Var);
        }
        cx7Var.Z.u(5);
        cx7Var.r0.f(y3a.ON_PAUSE);
        cx7Var.E = 6;
        cx7Var.i0 = false;
        cx7Var.z();
        if (cx7Var.i0) {
            this.a.M(cx7Var, false);
        } else {
            a.a(cx7Var, " did not call through to super.onPause()");
        }
    }

    public final void m(ClassLoader classLoader) {
        cx7 cx7Var = this.c;
        Bundle bundle = cx7Var.F;
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
        if (cx7Var.F.getBundle("savedInstanceState") == null) {
            cx7Var.F.putBundle("savedInstanceState", new Bundle());
        }
        try {
            cx7Var.G = cx7Var.F.getSparseParcelableArray("viewState");
            cx7Var.H = cx7Var.F.getBundle("viewRegistryState");
            vx7 vx7Var = (vx7) cx7Var.F.getParcelable("state");
            if (vx7Var != null) {
                cx7Var.L = vx7Var.Q;
                cx7Var.M = vx7Var.R;
                cx7Var.l0 = vx7Var.S;
            }
            if (cx7Var.l0) {
                return;
            }
            cx7Var.k0 = true;
        } catch (BadParcelableException e) {
            throw new IllegalStateException("Failed to restore view hierarchy state for fragment " + cx7Var, e);
        }
    }

    public final void n() {
        boolean zJ = rx7.J(3);
        cx7 cx7Var = this.c;
        if (zJ) {
            Objects.toString(cx7Var);
        }
        bx7 bx7Var = cx7Var.m0;
        View view = bx7Var == null ? null : bx7Var.j;
        if (view != null) {
            for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
            }
        }
        cx7Var.e().j = null;
        cx7Var.Z.Q();
        cx7Var.Z.A(true);
        cx7Var.E = 7;
        cx7Var.i0 = false;
        cx7Var.A();
        if (!cx7Var.i0) {
            a.a(cx7Var, " did not call through to super.onResume()");
            return;
        }
        cx7Var.r0.f(y3a.ON_RESUME);
        rx7 rx7Var = cx7Var.Z;
        rx7Var.H = false;
        rx7Var.I = false;
        rx7Var.O.g = false;
        rx7Var.u(7);
        this.a.P(cx7Var, false);
        this.b.U(cx7Var.I, null);
        cx7Var.F = null;
        cx7Var.G = null;
        cx7Var.H = null;
    }

    public final Bundle o() {
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        cx7 cx7Var = this.c;
        if (cx7Var.E == -1 && (bundle = cx7Var.F) != null) {
            bundle2.putAll(bundle);
        }
        bundle2.putParcelable("state", new vx7(cx7Var));
        if (cx7Var.E > 0) {
            Bundle bundle3 = new Bundle();
            cx7Var.B(bundle3);
            if (!bundle3.isEmpty()) {
                bundle2.putBundle("savedInstanceState", bundle3);
            }
            this.a.Q(cx7Var, bundle3, false);
            Bundle bundle4 = new Bundle();
            cx7Var.u0.z(bundle4);
            if (!bundle4.isEmpty()) {
                bundle2.putBundle("registryState", bundle4);
            }
            Bundle bundleX = cx7Var.Z.X();
            if (!bundleX.isEmpty()) {
                bundle2.putBundle("childFragmentManager", bundleX);
            }
            SparseArray<? extends Parcelable> sparseArray = cx7Var.G;
            if (sparseArray != null) {
                bundle2.putSparseParcelableArray("viewState", sparseArray);
            }
            Bundle bundle5 = cx7Var.H;
            if (bundle5 != null) {
                bundle2.putBundle("viewRegistryState", bundle5);
            }
        }
        Bundle bundle6 = cx7Var.J;
        if (bundle6 != null) {
            bundle2.putBundle("arguments", bundle6);
        }
        return bundle2;
    }

    public final void p(int i) {
        this.e = i;
    }

    public final void q() {
        boolean zJ = rx7.J(3);
        cx7 cx7Var = this.c;
        if (zJ) {
            Objects.toString(cx7Var);
        }
        cx7Var.Z.Q();
        cx7Var.Z.A(true);
        cx7Var.E = 5;
        cx7Var.i0 = false;
        cx7Var.C();
        if (!cx7Var.i0) {
            a.a(cx7Var, " did not call through to super.onStart()");
            return;
        }
        cx7Var.r0.f(y3a.ON_START);
        rx7 rx7Var = cx7Var.Z;
        rx7Var.H = false;
        rx7Var.I = false;
        rx7Var.O.g = false;
        rx7Var.u(5);
        this.a.R(cx7Var, false);
    }

    public final void r() {
        boolean zJ = rx7.J(3);
        cx7 cx7Var = this.c;
        if (zJ) {
            Objects.toString(cx7Var);
        }
        rx7 rx7Var = cx7Var.Z;
        rx7Var.I = true;
        rx7Var.O.g = true;
        rx7Var.u(4);
        cx7Var.r0.f(y3a.ON_STOP);
        cx7Var.E = 4;
        cx7Var.i0 = false;
        cx7Var.D();
        if (cx7Var.i0) {
            this.a.S(cx7Var, false);
        } else {
            a.a(cx7Var, " did not call through to super.onStop()");
        }
    }

    public wx7(nyj nyjVar, dpf dpfVar, cx7 cx7Var) {
        this.a = nyjVar;
        this.b = dpfVar;
        this.c = cx7Var;
    }

    public wx7(nyj nyjVar, dpf dpfVar, cx7 cx7Var, Bundle bundle) {
        this.a = nyjVar;
        this.b = dpfVar;
        this.c = cx7Var;
        cx7Var.G = null;
        cx7Var.H = null;
        cx7Var.W = 0;
        cx7Var.S = false;
        cx7Var.O = false;
        cx7 cx7Var2 = cx7Var.K;
        cx7Var.L = cx7Var2 != null ? cx7Var2.I : null;
        cx7Var.K = null;
        cx7Var.F = bundle;
        cx7Var.J = bundle.getBundle("arguments");
    }
}
