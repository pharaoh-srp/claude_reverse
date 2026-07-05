package defpackage;

import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class q4a implements b4a, v3a {
    public Set E;
    public z3a F;

    @Override // defpackage.b4a
    public final z3a a() {
        return this.F;
    }

    @Override // defpackage.v3a
    public final void b() {
        e(z3a.H);
        this.F = z3a.G;
        Iterator it = w44.c1(this.E).iterator();
        while (it.hasNext()) {
            ((v3a) it.next()).b();
        }
    }

    @Override // defpackage.v3a
    public final void c() {
        e(z3a.G);
        this.F = z3a.H;
        Iterator it = this.E.iterator();
        while (it.hasNext()) {
            ((v3a) it.next()).c();
        }
    }

    @Override // defpackage.b4a
    public final void d(v3a v3aVar) {
        v3aVar.getClass();
        this.E = dxf.n0(this.E, v3aVar);
    }

    public final void e(z3a z3aVar) {
        if (this.F == z3aVar) {
            return;
        }
        StringBuilder sb = new StringBuilder("Expected state ");
        sb.append(z3aVar);
        z3a z3aVar2 = this.F;
        sb.append(" but was ");
        sb.append(z3aVar2);
        throw new IllegalStateException(sb.toString().toString());
    }

    @Override // defpackage.b4a
    public final void l(v3a v3aVar) {
        if (this.E.contains(v3aVar)) {
            sz6.j("Already subscribed");
            return;
        }
        this.E = dxf.q0(this.E, v3aVar);
        z3a z3aVar = this.F;
        if (z3aVar.compareTo(z3a.G) >= 0) {
            v3aVar.onCreate();
        }
        if (z3aVar.compareTo(z3a.H) >= 0) {
            v3aVar.c();
        }
        if (z3aVar.compareTo(z3a.I) >= 0) {
            v3aVar.onResume();
        }
    }

    @Override // defpackage.v3a
    public final void onCreate() {
        e(z3a.F);
        this.F = z3a.G;
        Iterator it = this.E.iterator();
        while (it.hasNext()) {
            ((v3a) it.next()).onCreate();
        }
    }

    @Override // defpackage.v3a
    public final void onDestroy() {
        e(z3a.G);
        this.F = z3a.E;
        Iterator it = w44.c1(this.E).iterator();
        while (it.hasNext()) {
            ((v3a) it.next()).onDestroy();
        }
        this.E = um6.E;
    }

    @Override // defpackage.v3a
    public final void onPause() {
        e(z3a.I);
        this.F = z3a.H;
        Iterator it = w44.c1(this.E).iterator();
        while (it.hasNext()) {
            ((v3a) it.next()).onPause();
        }
    }

    @Override // defpackage.v3a
    public final void onResume() {
        e(z3a.H);
        this.F = z3a.I;
        Iterator it = this.E.iterator();
        while (it.hasNext()) {
            ((v3a) it.next()).onResume();
        }
    }
}
