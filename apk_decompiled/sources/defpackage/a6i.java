package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class a6i {
    public final rok a;
    public final a6i b;
    public final String c;
    public final lsc d;
    public final lsc e;
    public final jsc f = new jsc(0);
    public final jsc g = new jsc(Long.MIN_VALUE);
    public final lsc h;
    public final kdg i;
    public final kdg j;
    public final lsc k;
    public final wz5 l;

    public a6i(rok rokVar, a6i a6iVar, String str) {
        this.a = rokVar;
        this.b = a6iVar;
        this.c = str;
        this.d = mpk.P(rokVar.q0());
        this.e = mpk.P(new u5i(rokVar.q0(), rokVar.q0()));
        Boolean bool = Boolean.FALSE;
        this.h = mpk.P(bool);
        this.i = new kdg();
        this.j = new kdg();
        this.k = mpk.P(bool);
        this.l = mpk.w(new o5i(this, 1));
        rokVar.y0(this);
    }

    public final void a(Object obj, ld4 ld4Var, int i) {
        int i2;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-1493585151);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? e18Var.f(obj) : e18Var.h(obj) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= e18Var.f(this) ? 32 : 16;
        }
        int i3 = 0;
        if (!e18Var.Q(i2 & 1, (i2 & 19) != 18)) {
            e18Var.T();
        } else if (g()) {
            e18Var.a0(467722849);
            e18Var.p(false);
        } else {
            e18Var.a0(466062241);
            p(obj);
            int i4 = i2 & 112;
            boolean z = i4 == 32;
            Object objN = e18Var.N();
            lz1 lz1Var = jd4.a;
            if (z || objN == lz1Var) {
                objN = mpk.w(new o5i(this, i3));
                e18Var.k0(objN);
            }
            if (((Boolean) ((wlg) objN).getValue()).booleanValue()) {
                e18Var.a0(466470356);
                Object objN2 = e18Var.N();
                if (objN2 == lz1Var) {
                    objN2 = fd9.O(im6.E, e18Var);
                    e18Var.k0(objN2);
                }
                l45 l45Var = (l45) objN2;
                boolean zH = e18Var.h(l45Var) | (i4 == 32);
                Object objN3 = e18Var.N();
                if (zH || objN3 == lz1Var) {
                    objN3 = new e6f(l45Var, 9, this);
                    e18Var.k0(objN3);
                }
                fd9.e(l45Var, this, (bz7) objN3, e18Var);
                e18Var.p(false);
            } else {
                e18Var.a0(467712929);
                e18Var.p(false);
            }
            e18Var.p(false);
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new kb2(this, obj, i, 15);
        }
    }

    public final long b() {
        kdg kdgVar = this.i;
        int size = kdgVar.size();
        long jMax = 0;
        for (int i = 0; i < size; i++) {
            jMax = Math.max(jMax, ((v5i) kdgVar.get(i)).P.h());
        }
        kdg kdgVar2 = this.j;
        int size2 = kdgVar2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            jMax = Math.max(jMax, ((a6i) kdgVar2.get(i2)).b());
        }
        return jMax;
    }

    public final void c() {
        kdg kdgVar = this.i;
        int size = kdgVar.size();
        for (int i = 0; i < size; i++) {
            v5i v5iVar = (v5i) kdgVar.get(i);
            v5iVar.J = null;
            v5iVar.I = null;
            v5iVar.M = false;
        }
        kdg kdgVar2 = this.j;
        int size2 = kdgVar2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((a6i) kdgVar2.get(i2)).c();
        }
    }

    public final boolean d() {
        kdg kdgVar = this.i;
        int size = kdgVar.size();
        for (int i = 0; i < size; i++) {
            if (((v5i) kdgVar.get(i)).I != null) {
                return true;
            }
        }
        kdg kdgVar2 = this.j;
        int size2 = kdgVar2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            if (((a6i) kdgVar2.get(i2)).d()) {
                return true;
            }
        }
        return false;
    }

    public final long e() {
        a6i a6iVar = this.b;
        return a6iVar != null ? a6iVar.e() : this.f.h();
    }

    public final t5i f() {
        return (t5i) this.e.getValue();
    }

    public final boolean g() {
        return ((Boolean) this.k.getValue()).booleanValue();
    }

    public final void h(long j, boolean z) {
        jsc jscVar = this.g;
        long jH = jscVar.h();
        rok rokVar = this.a;
        if (jH == Long.MIN_VALUE) {
            jscVar.i(j);
            ((lsc) rokVar.E).setValue(Boolean.TRUE);
        } else if (!((Boolean) ((lsc) rokVar.E).getValue()).booleanValue()) {
            ((lsc) rokVar.E).setValue(Boolean.TRUE);
        }
        this.h.setValue(Boolean.FALSE);
        kdg kdgVar = this.i;
        int size = kdgVar.size();
        boolean z2 = true;
        for (int i = 0; i < size; i++) {
            v5i v5iVar = (v5i) kdgVar.get(i);
            lsc lscVar = v5iVar.K;
            lsc lscVar2 = v5iVar.K;
            if (!((Boolean) lscVar.getValue()).booleanValue()) {
                long jB = z ? v5iVar.a().b() : j;
                v5iVar.e(v5iVar.a().f(jB));
                v5iVar.O = v5iVar.a().d(jB);
                if (v5iVar.a().e(jB)) {
                    lscVar2.setValue(Boolean.TRUE);
                }
            }
            if (!((Boolean) lscVar2.getValue()).booleanValue()) {
                z2 = false;
            }
        }
        kdg kdgVar2 = this.j;
        int size2 = kdgVar2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            a6i a6iVar = (a6i) kdgVar2.get(i2);
            lsc lscVar3 = a6iVar.d;
            rok rokVar2 = a6iVar.a;
            if (!x44.r(lscVar3.getValue(), rokVar2.q0())) {
                a6iVar.h(j, z);
            }
            if (!x44.r(a6iVar.d.getValue(), rokVar2.q0())) {
                z2 = false;
            }
        }
        if (z2) {
            i();
        }
    }

    public final void i() {
        this.g.i(Long.MIN_VALUE);
        rok rokVar = this.a;
        if (rokVar instanceof swb) {
            ((swb) rokVar).x0(this.d.getValue());
        }
        n(0L);
        ((lsc) rokVar.E).setValue(Boolean.FALSE);
        kdg kdgVar = this.j;
        int size = kdgVar.size();
        for (int i = 0; i < size; i++) {
            ((a6i) kdgVar.get(i)).i();
        }
    }

    public final void j(float f) {
        kdg kdgVar = this.i;
        int size = kdgVar.size();
        for (int i = 0; i < size; i++) {
            v5i v5iVar = (v5i) kdgVar.get(i);
            v5iVar.getClass();
            if (f == -4.0f || f == -5.0f) {
                a5h a5hVar = v5iVar.J;
                if (a5hVar != null) {
                    v5iVar.a().h(a5hVar.c);
                    v5iVar.I = null;
                    v5iVar.J = null;
                }
                Object obj = f == -4.0f ? v5iVar.a().d : v5iVar.a().c;
                v5iVar.a().h(obj);
                v5iVar.a().i(obj);
                v5iVar.e(obj);
                v5iVar.P.i(v5iVar.a().b());
            } else {
                v5iVar.L.i(f);
            }
        }
        kdg kdgVar2 = this.j;
        int size2 = kdgVar2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((a6i) kdgVar2.get(i2)).j(f);
        }
    }

    public final void k(Object obj, Object obj2) {
        this.g.i(Long.MIN_VALUE);
        rok rokVar = this.a;
        ((lsc) rokVar.E).setValue(Boolean.FALSE);
        boolean zG = g();
        lsc lscVar = this.d;
        if (!zG || !x44.r(rokVar.q0(), obj) || !x44.r(lscVar.getValue(), obj2)) {
            if (!x44.r(rokVar.q0(), obj) && (rokVar instanceof swb)) {
                ((swb) rokVar).x0(obj);
            }
            lscVar.setValue(obj2);
            this.k.setValue(Boolean.TRUE);
            this.e.setValue(new u5i(obj, obj2));
        }
        kdg kdgVar = this.j;
        int size = kdgVar.size();
        for (int i = 0; i < size; i++) {
            a6i a6iVar = (a6i) kdgVar.get(i);
            a6iVar.getClass();
            if (a6iVar.g()) {
                a6iVar.k(a6iVar.a.q0(), a6iVar.d.getValue());
            }
        }
        kdg kdgVar2 = this.i;
        int size2 = kdgVar2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((v5i) kdgVar2.get(i2)).d(0L);
        }
    }

    public final void l(long j) {
        jsc jscVar = this.g;
        if (jscVar.h() == Long.MIN_VALUE) {
            jscVar.i(j);
        }
        n(j);
        this.h.setValue(Boolean.FALSE);
        kdg kdgVar = this.i;
        int size = kdgVar.size();
        for (int i = 0; i < size; i++) {
            ((v5i) kdgVar.get(i)).d(j);
        }
        kdg kdgVar2 = this.j;
        int size2 = kdgVar2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            a6i a6iVar = (a6i) kdgVar2.get(i2);
            if (!x44.r(a6iVar.d.getValue(), a6iVar.a.q0())) {
                a6iVar.l(j);
            }
        }
    }

    public final void m(zef zefVar) {
        kdg kdgVar = this.i;
        int size = kdgVar.size();
        for (int i = 0; i < size; i++) {
            v5i v5iVar = (v5i) kdgVar.get(i);
            lsc lscVar = v5iVar.N;
            if (!x44.r(v5iVar.a().c, v5iVar.a().d)) {
                v5iVar.J = v5iVar.a();
                v5iVar.I = zefVar;
            }
            v5iVar.H.setValue(new a5h(v5iVar.R, v5iVar.E, lscVar.getValue(), lscVar.getValue(), v5iVar.O.c()));
            v5iVar.P.i(v5iVar.a().b());
            v5iVar.M = true;
        }
        kdg kdgVar2 = this.j;
        int size2 = kdgVar2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((a6i) kdgVar2.get(i2)).m(zefVar);
        }
    }

    public final void n(long j) {
        if (this.b == null) {
            this.f.i(j);
        }
    }

    public final void o() {
        a5h a5hVar;
        kdg kdgVar = this.i;
        int size = kdgVar.size();
        for (int i = 0; i < size; i++) {
            v5i v5iVar = (v5i) kdgVar.get(i);
            zef zefVar = v5iVar.I;
            if (zefVar != null && (a5hVar = v5iVar.J) != null) {
                long jM = mwa.M(zefVar.c() * ((double) zefVar.g()));
                Object objF = a5hVar.f(jM);
                if (v5iVar.M) {
                    v5iVar.a().i(objF);
                }
                v5iVar.a().h(objF);
                v5iVar.P.i(v5iVar.a().b());
                if (v5iVar.L.h() == -2.0f || v5iVar.M) {
                    v5iVar.e(objF);
                } else {
                    v5iVar.d(v5iVar.S.e());
                }
                if (jM >= zefVar.c()) {
                    v5iVar.I = null;
                    v5iVar.J = null;
                } else {
                    zefVar.k(false);
                }
            }
        }
        kdg kdgVar2 = this.j;
        int size2 = kdgVar2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((a6i) kdgVar2.get(i2)).o();
        }
    }

    public final void p(Object obj) {
        lsc lscVar = this.d;
        if (x44.r(lscVar.getValue(), obj)) {
            return;
        }
        this.e.setValue(new u5i(lscVar.getValue(), obj));
        rok rokVar = this.a;
        if (!x44.r(rokVar.q0(), lscVar.getValue())) {
            rokVar.x0(lscVar.getValue());
        }
        lscVar.setValue(obj);
        if (this.g.h() == Long.MIN_VALUE) {
            this.h.setValue(Boolean.TRUE);
        }
        kdg kdgVar = this.i;
        int size = kdgVar.size();
        for (int i = 0; i < size; i++) {
            ((v5i) kdgVar.get(i)).L.i(-2.0f);
        }
    }

    public final String toString() {
        kdg kdgVar = this.i;
        int size = kdgVar.size();
        String str = "Transition animation values: ";
        for (int i = 0; i < size; i++) {
            str = str + ((v5i) kdgVar.get(i)) + ", ";
        }
        return str;
    }
}
