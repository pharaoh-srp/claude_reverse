package defpackage;

import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.pvporbit.freetype.FreeTypeConstants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public abstract class cx7 implements ComponentCallbacks, View.OnCreateContextMenuListener, m4a, eyi, tf8, u5f {
    public static final Object x0 = new Object();
    public Bundle F;
    public SparseArray G;
    public Bundle H;
    public Bundle J;
    public cx7 K;
    public int M;
    public boolean O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public boolean S;
    public boolean T;
    public boolean U;
    public boolean V;
    public int W;
    public rx7 X;
    public ex7 Y;
    public cx7 a0;
    public int b0;
    public int c0;
    public String d0;
    public boolean e0;
    public boolean f0;
    public boolean g0;
    public boolean i0;
    public ViewGroup j0;
    public boolean k0;
    public bx7 m0;
    public boolean n0;
    public boolean o0;
    public String p0;
    public a4a q0;
    public p4a r0;
    public ay7 s0;
    public final bvb t0;
    public q28 u0;
    public final ArrayList v0;
    public final ax7 w0;
    public int E = -1;
    public String I = UUID.randomUUID().toString();
    public String L = null;
    public Boolean N = null;
    public rx7 Z = new rx7();
    public final boolean h0 = true;
    public boolean l0 = true;

    public cx7() {
        new k51(7, this);
        this.q0 = a4a.I;
        this.t0 = new bvb();
        new AtomicInteger();
        this.v0 = new ArrayList();
        this.w0 = new ax7(this);
        n();
    }

    public void A() {
        this.i0 = true;
    }

    public void B(Bundle bundle) {
    }

    public abstract void C();

    public abstract void D();

    public void E(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.Z.Q();
        this.V = true;
        ay7 ay7Var = new ay7(this, f(), new fc(23, this));
        this.s0 = ay7Var;
        if (ay7Var.e()) {
            sz6.j("Called getViewLifecycleOwner() but onCreateView() returned null");
        } else {
            this.s0 = null;
        }
    }

    public final Context F() {
        Context contextJ = j();
        if (contextJ != null) {
            return contextJ;
        }
        xh6.b(this, " not attached to a context.", "Fragment ");
        return null;
    }

    public final void G(int i, int i2, int i3, int i4) {
        if (this.m0 == null && i == 0 && i2 == 0 && i3 == 0 && i4 == 0) {
            return;
        }
        e().b = i;
        e().c = i2;
        e().d = i3;
        e().e = i4;
    }

    @Override // defpackage.m4a
    public final c4a a() {
        return this.r0;
    }

    public d4c b() {
        return new z26(this);
    }

    @Override // defpackage.tf8
    public final sub d() {
        Application application;
        Context applicationContext = F().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            }
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            }
            applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
        }
        if (application == null && rx7.J(3)) {
            Objects.toString(F().getApplicationContext());
        }
        sub subVar = new sub(0);
        LinkedHashMap linkedHashMap = subVar.a;
        if (application != null) {
            linkedHashMap.put(yxi.d, application);
        }
        linkedHashMap.put(o5f.a, this);
        linkedHashMap.put(o5f.b, this);
        Bundle bundle = this.J;
        if (bundle != null) {
            linkedHashMap.put(o5f.c, bundle);
        }
        return subVar;
    }

    public final bx7 e() {
        if (this.m0 == null) {
            this.m0 = new bx7();
        }
        return this.m0;
    }

    public final boolean equals(Object obj) {
        return this == obj;
    }

    @Override // defpackage.eyi
    public final dyi f() {
        if (this.X == null) {
            sz6.j("Can't access ViewModels from detached fragment");
            return null;
        }
        if (k() == 1) {
            sz6.j("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
            return null;
        }
        HashMap map = this.X.O.d;
        dyi dyiVar = (dyi) map.get(this.I);
        if (dyiVar != null) {
            return dyiVar;
        }
        dyi dyiVar2 = new dyi();
        map.put(this.I, dyiVar2);
        return dyiVar2;
    }

    @Override // defpackage.u5f
    public final q28 g() {
        return (q28) this.u0.G;
    }

    public final fx7 h() {
        ex7 ex7Var = this.Y;
        if (ex7Var == null) {
            return null;
        }
        return ex7Var.M;
    }

    public final rx7 i() {
        if (this.Y != null) {
            return this.Z;
        }
        xh6.b(this, " has not been attached yet.", "Fragment ");
        return null;
    }

    public final Context j() {
        ex7 ex7Var = this.Y;
        if (ex7Var == null) {
            return null;
        }
        return ex7Var.N;
    }

    public final int k() {
        a4a a4aVar = this.q0;
        return (a4aVar == a4a.F || this.a0 == null) ? a4aVar.ordinal() : Math.min(a4aVar.ordinal(), this.a0.k());
    }

    public final rx7 l() {
        rx7 rx7Var = this.X;
        if (rx7Var != null) {
            return rx7Var;
        }
        xh6.b(this, " not associated with a fragment manager.", "Fragment ");
        return null;
    }

    public final String m(int i) {
        return F().getResources().getString(i);
    }

    public final void n() {
        this.r0 = new p4a(this, true);
        this.u0 = new q28(new t5f(this, new p3f(4, this)), 29);
        ArrayList arrayList = this.v0;
        ax7 ax7Var = this.w0;
        if (arrayList.contains(ax7Var)) {
            return;
        }
        if (this.E >= 0) {
            ax7Var.a();
        } else {
            arrayList.add(ax7Var);
        }
    }

    public final void o() {
        n();
        this.p0 = this.I;
        this.I = UUID.randomUUID().toString();
        this.O = false;
        this.P = false;
        this.R = false;
        this.S = false;
        this.U = false;
        this.W = 0;
        this.X = null;
        this.Z = new rx7();
        this.Y = null;
        this.b0 = 0;
        this.c0 = 0;
        this.d0 = null;
        this.e0 = false;
        this.f0 = false;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        this.i0 = true;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        fx7 fx7VarH = h();
        if (fx7VarH != null) {
            fx7VarH.onCreateContextMenu(contextMenu, view, contextMenuInfo);
        } else {
            xh6.b(this, " not attached to an activity.", "Fragment ");
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        this.i0 = true;
    }

    public final boolean p() {
        return this.Y != null && this.O;
    }

    public final boolean q() {
        if (this.e0) {
            return true;
        }
        rx7 rx7Var = this.X;
        if (rx7Var != null) {
            cx7 cx7Var = this.a0;
            rx7Var.getClass();
            if (cx7Var == null ? false : cx7Var.q()) {
                return true;
            }
        }
        return false;
    }

    public final boolean r() {
        return this.W > 0;
    }

    public void s() {
        this.i0 = true;
    }

    public void t(int i, int i2, Intent intent) {
        if (rx7.J(2)) {
            Log.v("FragmentManager", "Fragment " + this + " received the following in onActivityResult(): requestCode: " + i + " resultCode: " + i2 + " data: " + intent);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(FreeTypeConstants.FT_LOAD_PEDANTIC);
        sb.append(getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} (");
        sb.append(this.I);
        if (this.b0 != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.b0));
        }
        if (this.d0 != null) {
            sb.append(" tag=");
            sb.append(this.d0);
        }
        sb.append(")");
        return sb.toString();
    }

    public void u(Context context) {
        this.i0 = true;
        ex7 ex7Var = this.Y;
        if ((ex7Var == null ? null : ex7Var.M) != null) {
            this.i0 = true;
        }
    }

    public void v(Bundle bundle) {
        Bundle bundle2;
        this.i0 = true;
        Bundle bundle3 = this.F;
        if (bundle3 != null && (bundle2 = bundle3.getBundle("childFragmentManager")) != null) {
            this.Z.W(bundle2);
            rx7 rx7Var = this.Z;
            rx7Var.H = false;
            rx7Var.I = false;
            rx7Var.O.g = false;
            rx7Var.u(1);
        }
        rx7 rx7Var2 = this.Z;
        if (rx7Var2.v >= 1) {
            return;
        }
        rx7Var2.H = false;
        rx7Var2.I = false;
        rx7Var2.O.g = false;
        rx7Var2.u(1);
    }

    public void w() {
        this.i0 = true;
    }

    public void x() {
        this.i0 = true;
    }

    public LayoutInflater y(Bundle bundle) {
        ex7 ex7Var = this.Y;
        if (ex7Var == null) {
            sz6.j("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
            return null;
        }
        fx7 fx7Var = ex7Var.Q;
        LayoutInflater layoutInflaterCloneInContext = fx7Var.getLayoutInflater().cloneInContext(fx7Var);
        quj.o(layoutInflaterCloneInContext, this.Z.f);
        return layoutInflaterCloneInContext;
    }

    public void z() {
        this.i0 = true;
    }
}
