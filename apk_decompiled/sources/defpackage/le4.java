package defpackage;

import android.os.Trace;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class le4 implements fe4 {
    public final ge4 E;
    public final a0 F;
    public final AtomicReference G = new AtomicReference(null);
    public final Object H = new Object();
    public final iwb I;
    public final sag J;
    public final ewb K;
    public final fwb L;
    public final fwb M;
    public final ewb N;
    public final ch2 O;
    public final ch2 P;
    public final ewb Q;
    public ewb R;
    public boolean S;
    public k5g T;
    public rvc U;
    public le4 V;
    public int W;
    public final n78 X;
    public final p60 Y;
    public final e18 Z;
    public int a0;

    public le4(ge4 ge4Var, a0 a0Var) {
        this.E = ge4Var;
        this.F = a0Var;
        fwb fwbVar = new fwb();
        iwb iwbVar = fwbVar.e;
        if (iwbVar == null) {
            iwbVar = new iwb(fwbVar);
            fwbVar.e = iwbVar;
        }
        iwb iwbVar2 = iwbVar;
        this.I = iwbVar2;
        sag sagVar = new sag();
        if (ge4Var.d()) {
            sagVar.O = new xub();
        }
        if (ge4Var.f()) {
            sagVar.e();
        }
        this.J = sagVar;
        this.K = x44.C();
        this.L = new fwb();
        this.M = new fwb();
        this.N = x44.C();
        ch2 ch2Var = new ch2();
        this.O = ch2Var;
        ch2 ch2Var2 = new ch2();
        this.P = ch2Var2;
        this.Q = x44.C();
        this.R = x44.C();
        n78 n78Var = new n78(9, ge4Var);
        this.X = n78Var;
        this.Y = new p60();
        e18 e18Var = new e18(a0Var, ge4Var, uag.d(sagVar), iwbVar2, ch2Var, ch2Var2, n78Var, this);
        ge4Var.p(e18Var);
        this.Z = e18Var;
    }

    public final void A(pz7 pz7Var) {
        boolean zJ = j();
        q();
        ge4 ge4Var = this.E;
        if (!zJ) {
            ge4Var.a(this, pz7Var);
            return;
        }
        e18 e18Var = this.Z;
        e18Var.z = 0;
        e18Var.y = true;
        ge4Var.a(this, pz7Var);
        e18Var.t();
    }

    @Override // defpackage.fe4
    public final void a() {
        synchronized (this.H) {
            try {
                if (this.Z.F) {
                    zad.b("Composition is disposed while composing. If dispose is triggered by a call in @Composable function, consider wrapping it with SideEffect block.");
                }
                if (this.a0 != 3) {
                    this.a0 = 3;
                    ch2 ch2Var = this.Z.L;
                    if (ch2Var != null) {
                        f(ch2Var);
                    }
                    boolean z = this.J.F == 0;
                    if (!z || !this.I.E.h()) {
                        p60 p60Var = this.Y;
                        try {
                            p60Var.p(this.I, this.Z.B());
                            if (!z) {
                                sag sagVar = this.J;
                                p60 p60Var2 = this.Y;
                                vag vagVarH = sagVar.h();
                                try {
                                    vagVarH.n(vagVarH.t, new a21(7, p60Var2));
                                    vagVarH.H();
                                    vagVarH.e(true);
                                    this.F.f();
                                    this.F.i();
                                    p60Var.l();
                                } catch (Throwable th) {
                                    vagVarH.e(false);
                                    throw th;
                                }
                            }
                            p60Var.k();
                            p60Var.j();
                        } catch (Throwable th2) {
                            p60Var.j();
                            throw th2;
                        }
                    }
                    e18 e18Var = this.Z;
                    e18Var.getClass();
                    Trace.beginSection("Compose:Composer.dispose");
                    try {
                        e18Var.b.u(e18Var);
                        e18Var.E.clear();
                        e18Var.s.clear();
                        e18Var.e.f.X();
                        e18Var.v = null;
                        e18Var.a.f();
                        Trace.endSection();
                    } catch (Throwable th3) {
                        Trace.endSection();
                        throw th3;
                    }
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        this.E.v(this);
    }

    public final void b() {
        this.G.set(null);
        this.O.f.X();
        this.P.f.X();
        iwb iwbVar = this.I;
        if (iwbVar.E.h()) {
            return;
        }
        p60 p60Var = this.Y;
        try {
            p60Var.p(iwbVar, this.Z.B());
            p60Var.k();
        } finally {
            p60Var.j();
        }
    }

    public final void c(Object obj, boolean z) {
        Object objG = this.K.g(obj);
        if (objG == null) {
            return;
        }
        boolean z2 = objG instanceof fwb;
        ub9 ub9Var = ub9.E;
        fwb fwbVar = this.L;
        fwb fwbVar2 = this.M;
        ewb ewbVar = this.Q;
        if (!z2) {
            r7e r7eVar = (r7e) objG;
            if (x44.i0(ewbVar, obj, r7eVar) || r7eVar.b(obj) == ub9Var) {
                return;
            }
            if (r7eVar.g == null || z) {
                fwbVar.a(r7eVar);
                return;
            } else {
                fwbVar2.a(r7eVar);
                return;
            }
        }
        fwb fwbVar3 = (fwb) objG;
        Object[] objArr = fwbVar3.b;
        long[] jArr = fwbVar3.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        r7e r7eVar2 = (r7e) objArr[(i << 3) + i3];
                        if (!x44.i0(ewbVar, obj, r7eVar2) && r7eVar2.b(obj) != ub9Var) {
                            if (r7eVar2.g == null || z) {
                                fwbVar.a(r7eVar2);
                            } else {
                                fwbVar2.a(r7eVar2);
                            }
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:73:0x0183 A[EDGE_INSN: B:73:0x0183->B:220:0x0122 BREAK  A[LOOP:13: B:63:0x0151->B:74:0x0185]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(java.util.Set r32, boolean r33) {
        /*
            Method dump skipped, instruction units count: 892
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.le4.d(java.util.Set, boolean):void");
    }

    public final void e() {
        synchronized (this.H) {
            try {
                f(this.O);
                o();
            } catch (Throwable th) {
                try {
                    if (!this.I.E.h()) {
                        p60 p60Var = this.Y;
                        try {
                            p60Var.p(this.I, this.Z.B());
                            p60Var.k();
                            p60Var.j();
                        } catch (Throwable th2) {
                            p60Var.j();
                            throw th2;
                        }
                    }
                    throw th;
                } catch (Throwable th3) {
                    b();
                    throw th3;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:80:0x0136  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(defpackage.ch2 r34) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 497
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.le4.f(ch2):void");
    }

    public final void g() {
        synchronized (this.H) {
            try {
                ch2 ch2Var = this.P;
                ch2Var.getClass();
                if (!ch2Var.f.Z()) {
                    f(this.P);
                }
            } catch (Throwable th) {
                try {
                    if (!this.I.E.h()) {
                        p60 p60Var = this.Y;
                        try {
                            p60Var.p(this.I, this.Z.B());
                            p60Var.k();
                            p60Var.j();
                        } catch (Throwable th2) {
                            p60Var.j();
                            throw th2;
                        }
                    }
                    throw th;
                } finally {
                }
            }
        }
    }

    public final void h() {
        p60 p60Var;
        synchronized (this.H) {
            try {
                this.Z.v = null;
                if (!this.I.E.h()) {
                    p60Var = this.Y;
                    try {
                        p60Var.p(this.I, this.Z.B());
                        p60Var.k();
                        p60Var.j();
                    } finally {
                    }
                }
            } catch (Throwable th) {
                try {
                    if (!this.I.E.h()) {
                        p60Var = this.Y;
                        try {
                            p60Var.p(this.I, this.Z.B());
                            p60Var.k();
                            p60Var.j();
                        } finally {
                        }
                    }
                    throw th;
                } catch (Throwable th2) {
                    b();
                    throw th2;
                }
            }
        }
    }

    public final void i() {
        long j;
        char c;
        long j2;
        long j3;
        long[] jArr;
        long[] jArr2;
        int i;
        int i2;
        long j4;
        char c2;
        long j5;
        long j6;
        int i3;
        boolean zH;
        int i4;
        int i5;
        ewb ewbVar = this.N;
        long[] jArr3 = ewbVar.a;
        int length = jArr3.length - 2;
        long j7 = 255;
        char c3 = 7;
        long j8 = -9187201950435737472L;
        int i6 = 8;
        if (length >= 0) {
            int i7 = 0;
            while (true) {
                long j9 = jArr3[i7];
                j3 = 128;
                if ((((~j9) << c3) & j9 & j8) != j8) {
                    int i8 = 8 - ((~(i7 - length)) >>> 31);
                    int i9 = 0;
                    while (i9 < i8) {
                        if ((j9 & j7) < 128) {
                            j4 = j7;
                            int i10 = (i7 << 3) + i9;
                            Object obj = ewbVar.b[i10];
                            Object obj2 = ewbVar.c[i10];
                            c2 = c3;
                            boolean z = obj2 instanceof fwb;
                            j5 = j8;
                            ewb ewbVar2 = this.K;
                            if (z) {
                                fwb fwbVar = (fwb) obj2;
                                Object[] objArr = fwbVar.b;
                                long[] jArr4 = fwbVar.a;
                                int length2 = jArr4.length - 2;
                                if (length2 >= 0) {
                                    int i11 = i6;
                                    j6 = j9;
                                    int i12 = 0;
                                    while (true) {
                                        long j10 = jArr4[i12];
                                        jArr2 = jArr3;
                                        i = length;
                                        if ((((~j10) << c2) & j10 & j5) != j5) {
                                            int i13 = 8 - ((~(i12 - length2)) >>> 31);
                                            int i14 = 0;
                                            while (i14 < i13) {
                                                if ((j10 & j4) < 128) {
                                                    i4 = i14;
                                                    int i15 = (i12 << 3) + i4;
                                                    i5 = i9;
                                                    if (!ewbVar2.c((wz5) objArr[i15])) {
                                                        fwbVar.n(i15);
                                                    }
                                                } else {
                                                    i4 = i14;
                                                    i5 = i9;
                                                }
                                                j10 >>= i11;
                                                i14 = i4 + 1;
                                                i9 = i5;
                                            }
                                            i2 = i9;
                                            if (i13 != i11) {
                                                break;
                                            }
                                        } else {
                                            i2 = i9;
                                        }
                                        if (i12 == length2) {
                                            break;
                                        }
                                        i12++;
                                        jArr3 = jArr2;
                                        length = i;
                                        i9 = i2;
                                        i11 = 8;
                                    }
                                } else {
                                    jArr2 = jArr3;
                                    i = length;
                                    i2 = i9;
                                    j6 = j9;
                                }
                                zH = fwbVar.h();
                            } else {
                                jArr2 = jArr3;
                                i = length;
                                i2 = i9;
                                j6 = j9;
                                obj2.getClass();
                                zH = !ewbVar2.c((wz5) obj2);
                            }
                            if (zH) {
                                ewbVar.l(i10);
                            }
                            i3 = 8;
                        } else {
                            jArr2 = jArr3;
                            i = length;
                            i2 = i9;
                            j4 = j7;
                            c2 = c3;
                            j5 = j8;
                            j6 = j9;
                            i3 = i6;
                        }
                        j9 = j6 >> i3;
                        i9 = i2 + 1;
                        i6 = i3;
                        c3 = c2;
                        j7 = j4;
                        j8 = j5;
                        jArr3 = jArr2;
                        length = i;
                    }
                    jArr = jArr3;
                    int i16 = length;
                    j = j7;
                    c = c3;
                    j2 = j8;
                    if (i8 != i6) {
                        break;
                    } else {
                        length = i16;
                    }
                } else {
                    jArr = jArr3;
                    j = j7;
                    c = c3;
                    j2 = j8;
                }
                if (i7 == length) {
                    break;
                }
                i7++;
                c3 = c;
                j7 = j;
                j8 = j2;
                jArr3 = jArr;
                i6 = 8;
            }
        } else {
            j = 255;
            c = 7;
            j2 = -9187201950435737472L;
            j3 = 128;
        }
        fwb fwbVar2 = this.M;
        if (!fwbVar2.i()) {
            return;
        }
        Object[] objArr2 = fwbVar2.b;
        long[] jArr5 = fwbVar2.a;
        int length3 = jArr5.length - 2;
        if (length3 < 0) {
            return;
        }
        int i17 = 0;
        while (true) {
            long j11 = jArr5[i17];
            if ((((~j11) << c) & j11 & j2) != j2) {
                int i18 = 8 - ((~(i17 - length3)) >>> 31);
                for (int i19 = 0; i19 < i18; i19++) {
                    if ((j11 & j) < j3) {
                        int i20 = (i17 << 3) + i19;
                        if (((r7e) objArr2[i20]).g == null) {
                            fwbVar2.n(i20);
                        }
                    }
                    j11 >>= 8;
                }
                if (i18 != 8) {
                    return;
                }
            }
            if (i17 == length3) {
                return;
            } else {
                i17++;
            }
        }
    }

    public final boolean j() {
        boolean z;
        synchronized (this.H) {
            z = true;
            if (this.a0 != 1) {
                z = false;
            }
            if (z) {
                this.a0 = 0;
            }
        }
        return z;
    }

    public final void k(pz7 pz7Var) {
        try {
            synchronized (this.H) {
                n();
                ewb ewbVar = this.R;
                this.R = x44.C();
                try {
                    e18 e18Var = this.Z;
                    k5g k5gVar = this.T;
                    if (!e18Var.e.f.Z()) {
                        pd4.a("Expected applyChanges() to have been called");
                    }
                    e18Var.P = k5gVar;
                    try {
                        e18Var.n(ewbVar, pz7Var);
                    } finally {
                        e18Var.P = null;
                    }
                } catch (Throwable th) {
                    this.R = ewbVar;
                    throw th;
                }
            }
        } catch (Throwable th2) {
            try {
                if (!this.I.E.h()) {
                    p60 p60Var = this.Y;
                    try {
                        p60Var.p(this.I, this.Z.B());
                        p60Var.k();
                        p60Var.j();
                    } catch (Throwable th3) {
                        p60Var.j();
                        throw th3;
                    }
                }
                throw th2;
            } catch (Throwable th4) {
                b();
                throw th4;
            }
        }
    }

    public final rvc l(boolean z, pz7 pz7Var) {
        if (this.U != null) {
            zad.b("A pausable composition is in progress");
        }
        rvc rvcVar = new rvc(this, this.E, this.Z, this.I, pz7Var, z, this.F, this.H);
        this.U = rvcVar;
        return rvcVar;
    }

    public final void m() {
        synchronized (this.H) {
            try {
                if (this.U != null) {
                    zad.b("Deactivate is not supported while pausable composition is in progress");
                }
                boolean z = this.J.F == 0;
                if (!z || !this.I.E.h()) {
                    Trace.beginSection("Compose:deactivate");
                    try {
                        p60 p60Var = this.Y;
                        try {
                            p60Var.p(this.I, this.Z.B());
                            if (!z) {
                                sag sagVar = this.J;
                                p60 p60Var2 = this.Y;
                                vag vagVarH = sagVar.h();
                                try {
                                    vagVarH.n(vagVarH.t, new um5(p60Var2, 16, vagVarH));
                                    vagVarH.e(true);
                                    this.F.i();
                                    p60Var.l();
                                } catch (Throwable th) {
                                    vagVarH.e(false);
                                    throw th;
                                }
                            }
                            p60Var.k();
                            p60Var.j();
                        } catch (Throwable th2) {
                            p60Var.j();
                            throw th2;
                        }
                    } finally {
                        Trace.endSection();
                    }
                }
                this.K.a();
                this.N.a();
                this.R.a();
                this.O.f.X();
                this.P.f.X();
                e18 e18Var = this.Z;
                e18Var.E.clear();
                e18Var.s.clear();
                e18Var.e.f.X();
                e18Var.v = null;
                this.a0 = 1;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final void n() {
        Object obj = ez1.e;
        AtomicReference atomicReference = this.G;
        Object andSet = atomicReference.getAndSet(obj);
        if (andSet != null) {
            if (andSet.equals(obj)) {
                pd4.b("pending composition has not been applied");
                sz6.r();
                return;
            }
            if (andSet instanceof Set) {
                d((Set) andSet, true);
                return;
            }
            if (!(andSet instanceof Object[])) {
                pd4.b("corrupt pendingModifications drain: " + atomicReference);
                sz6.r();
                return;
            }
            for (Set set : (Set[]) andSet) {
                d(set, true);
            }
        }
    }

    public final void o() {
        AtomicReference atomicReference = this.G;
        Object andSet = atomicReference.getAndSet(null);
        if (x44.r(andSet, ez1.e)) {
            return;
        }
        if (andSet instanceof Set) {
            d((Set) andSet, false);
            return;
        }
        if (andSet instanceof Object[]) {
            for (Set set : (Set[]) andSet) {
                d(set, false);
            }
            return;
        }
        if (andSet == null) {
            if (this.U == null) {
                pd4.a("calling recordModificationsOf and applyChanges concurrently is not supported");
            }
        } else {
            pd4.b("corrupt pendingModifications drain: " + atomicReference);
            sz6.r();
        }
    }

    public final void p() {
        um6 um6Var = um6.E;
        AtomicReference atomicReference = this.G;
        Object andSet = atomicReference.getAndSet(um6Var);
        if (x44.r(andSet, ez1.e) || andSet == null) {
            return;
        }
        if (andSet instanceof Set) {
            d((Set) andSet, false);
            return;
        }
        if (!(andSet instanceof Object[])) {
            pd4.b("corrupt pendingModifications drain: " + atomicReference);
            sz6.r();
            return;
        }
        for (Set set : (Set[]) andSet) {
            d(set, false);
        }
    }

    public final void q() {
        int i = this.a0;
        if (i != 0) {
            zad.b(i != 1 ? i != 2 ? i != 3 ? "" : "The composition is disposed" : "A previous pausable composition for this composition was cancelled. This composition must be disposed." : "The composition should be activated before setting content.");
        }
        if (this.U == null) {
            return;
        }
        zad.b("A pausable composition is in progress");
    }

    public final void r(ArrayList arrayList) {
        iwb iwbVar = this.I;
        e18 e18Var = this.Z;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i < size) {
                if (!((ksb) ((cpc) arrayList.get(i)).E).b().equals(this)) {
                    pd4.a("Check failed");
                    break;
                }
                i++;
            }
        }
        try {
            e18Var.getClass();
            Trace.beginSection("Compose:insertMovableContent");
            try {
                try {
                    e18Var.D(arrayList);
                    e18Var.i();
                } catch (Throwable th) {
                    e18Var.a();
                    throw th;
                }
            } finally {
                Trace.endSection();
            }
        } catch (Throwable th2) {
            try {
                if (!iwbVar.E.h()) {
                    p60 p60Var = this.Y;
                    try {
                        p60Var.p(iwbVar, e18Var.B());
                        p60Var.k();
                        p60Var.j();
                    } catch (Throwable th3) {
                        p60Var.j();
                        throw th3;
                    }
                }
                throw th2;
            } catch (Throwable th4) {
                b();
                throw th4;
            }
        }
    }

    public final ub9 s(r7e r7eVar, Object obj) {
        le4 le4Var;
        int i = r7eVar.b;
        if ((i & 2) != 0) {
            r7eVar.b = i | 4;
        }
        y08 y08Var = r7eVar.c;
        if (y08Var == null || !y08Var.a()) {
            return ub9.E;
        }
        sag sagVar = this.J;
        sagVar.getClass();
        y08 y08Var2 = r7eVar.c;
        if (y08Var2 != null && sagVar.k(yfd.m(y08Var2))) {
            if (r7eVar.d == null) {
                return ub9.E;
            }
            ub9 ub9VarT = t(r7eVar, y08Var, obj);
            if (ub9VarT != ub9.E) {
                this.X.E();
            }
            return ub9VarT;
        }
        synchronized (this.H) {
            le4Var = this.V;
        }
        if (le4Var != null) {
            e18 e18Var = le4Var.Z;
            if (e18Var.F && e18Var.g0(r7eVar, obj)) {
                return ub9.H;
            }
        }
        return ub9.E;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00c9 A[Catch: all -> 0x0044, EDGE_INSN: B:79:0x00c9->B:64:0x00c9 BREAK  A[LOOP:0: B:48:0x008a->B:60:0x00c1], EDGE_INSN: B:80:0x00c9->B:64:0x00c9 BREAK  A[LOOP:0: B:48:0x008a->B:60:0x00c1], TRY_LEAVE, TryCatch #0 {all -> 0x0044, blocks: (B:4:0x0009, B:6:0x000e, B:8:0x0016, B:10:0x001d, B:14:0x0027, B:16:0x0031, B:13:0x0022, B:25:0x0049, B:27:0x004f, B:32:0x005a, B:36:0x0060, B:37:0x0068, B:40:0x006e, B:41:0x0074, B:43:0x007a, B:45:0x007e, B:48:0x008a, B:50:0x009a, B:52:0x00a6, B:54:0x00af, B:57:0x00b9, B:60:0x00c1, B:61:0x00c4, B:64:0x00c9), top: B:77:0x0009 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.ub9 t(defpackage.r7e r20, defpackage.y08 r21, java.lang.Object r22) {
        /*
            Method dump skipped, instruction units count: 235
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.le4.t(r7e, y08, java.lang.Object):ub9");
    }

    public final void u(Object obj) {
        Object objG = this.K.g(obj);
        if (objG == null) {
            return;
        }
        boolean z = objG instanceof fwb;
        ub9 ub9Var = ub9.H;
        ewb ewbVar = this.Q;
        if (!z) {
            r7e r7eVar = (r7e) objG;
            if (r7eVar.b(obj) == ub9Var) {
                x44.m(ewbVar, obj, r7eVar);
                return;
            }
            return;
        }
        fwb fwbVar = (fwb) objG;
        Object[] objArr = fwbVar.b;
        long[] jArr = fwbVar.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        r7e r7eVar2 = (r7e) objArr[(i << 3) + i3];
                        if (r7eVar2.b(obj) == ub9Var) {
                            x44.m(ewbVar, obj, r7eVar2);
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0052, code lost:
    
        return true;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean v(java.util.Set r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            boolean r2 = r1 instanceof defpackage.w6f
            ewb r3 = r0.N
            ewb r0 = r0.K
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L5e
            w6f r1 = (defpackage.w6f) r1
            fwb r1 = r1.E
            java.lang.Object[] r2 = r1.b
            long[] r1 = r1.a
            int r6 = r1.length
            int r6 = r6 + (-2)
            if (r6 < 0) goto L7b
            r7 = r4
        L1c:
            r8 = r1[r7]
            long r10 = ~r8
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L59
            int r10 = r7 - r6
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = r4
        L36:
            if (r12 >= r10) goto L57
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.3E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L53
            int r13 = r7 << 3
            int r13 = r13 + r12
            r13 = r2[r13]
            boolean r14 = r0.c(r13)
            if (r14 != 0) goto L52
            boolean r13 = r3.c(r13)
            if (r13 == 0) goto L53
        L52:
            return r5
        L53:
            long r8 = r8 >> r11
            int r12 = r12 + 1
            goto L36
        L57:
            if (r10 != r11) goto L7b
        L59:
            if (r7 == r6) goto L7b
            int r7 = r7 + 1
            goto L1c
        L5e:
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r1 = r1.iterator()
        L64:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L7b
            java.lang.Object r2 = r1.next()
            boolean r6 = r0.c(r2)
            if (r6 != 0) goto L7a
            boolean r2 = r3.c(r2)
            if (r2 == 0) goto L64
        L7a:
            return r5
        L7b:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.le4.v(java.util.Set):boolean");
    }

    public final boolean w() {
        synchronized (this.H) {
            rvc rvcVar = this.U;
            boolean z = false;
            if (rvcVar != null && !rvcVar.g()) {
                rvcVar.i();
                rvcVar.d().f();
                return false;
            }
            n();
            try {
                ewb ewbVar = this.R;
                this.R = x44.C();
                try {
                    e18 e18Var = this.Z;
                    k5g k5gVar = this.T;
                    hjc hjcVar = e18Var.e.f;
                    if (!hjcVar.Z()) {
                        pd4.a("Expected applyChanges() to have been called");
                    }
                    if (ewbVar.e > 0 || !e18Var.s.isEmpty()) {
                        e18Var.P = k5gVar;
                        try {
                            e18Var.n(ewbVar, null);
                            e18Var.P = null;
                            z = !hjcVar.Z();
                        } catch (Throwable th) {
                            e18Var.P = null;
                            throw th;
                        }
                    }
                    if (!z) {
                        o();
                    }
                    return z;
                } catch (Throwable th2) {
                    this.R = ewbVar;
                    throw th2;
                }
            } catch (Throwable th3) {
                try {
                    if (!this.I.E.h()) {
                        p60 p60Var = this.Y;
                        try {
                            p60Var.p(this.I, this.Z.B());
                            p60Var.k();
                            p60Var.j();
                        } catch (Throwable th4) {
                            p60Var.j();
                            throw th4;
                        }
                    }
                    throw th3;
                } catch (Throwable th5) {
                    b();
                    throw th5;
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void x(w6f w6fVar) {
        Object obj;
        while (true) {
            Object obj2 = this.G.get();
            if (obj2 == null || obj2.equals(ez1.e)) {
                obj = w6fVar;
            } else if (obj2 instanceof Set) {
                obj = new Set[]{obj2, w6fVar};
            } else {
                if (!(obj2 instanceof Object[])) {
                    sz6.k("corrupt pendingModifications: ", this.G);
                    return;
                }
                Set[] setArr = (Set[]) obj2;
                int length = setArr.length;
                Object[] objArrCopyOf = Arrays.copyOf(setArr, length + 1);
                objArrCopyOf[length] = w6fVar;
                obj = objArrCopyOf;
            }
            AtomicReference atomicReference = this.G;
            while (!atomicReference.compareAndSet(obj2, obj)) {
                if (atomicReference.get() != obj2) {
                    break;
                }
            }
            if (obj2 == null) {
                synchronized (this.H) {
                    o();
                }
                return;
            }
            return;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void y(java.lang.Object r21) {
        /*
            Method dump skipped, instruction units count: 217
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.le4.y(java.lang.Object):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void z(java.lang.Object r15) {
        /*
            r14 = this;
            java.lang.Object r0 = r14.H
            monitor-enter(r0)
            r14.u(r15)     // Catch: java.lang.Throwable -> L4f
            ewb r1 = r14.N     // Catch: java.lang.Throwable -> L4f
            java.lang.Object r15 = r1.g(r15)     // Catch: java.lang.Throwable -> L4f
            if (r15 == 0) goto L61
            boolean r1 = r15 instanceof defpackage.fwb     // Catch: java.lang.Throwable -> L4f
            if (r1 == 0) goto L5c
            fwb r15 = (defpackage.fwb) r15     // Catch: java.lang.Throwable -> L4f
            java.lang.Object[] r1 = r15.b     // Catch: java.lang.Throwable -> L4f
            long[] r15 = r15.a     // Catch: java.lang.Throwable -> L4f
            int r2 = r15.length     // Catch: java.lang.Throwable -> L4f
            int r2 = r2 + (-2)
            if (r2 < 0) goto L61
            r3 = 0
            r4 = r3
        L1f:
            r5 = r15[r4]     // Catch: java.lang.Throwable -> L4f
            long r7 = ~r5     // Catch: java.lang.Throwable -> L4f
            r9 = 7
            long r7 = r7 << r9
            long r7 = r7 & r5
            r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r7 & r9
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 == 0) goto L57
            int r7 = r4 - r2
            int r7 = ~r7     // Catch: java.lang.Throwable -> L4f
            int r7 = r7 >>> 31
            r8 = 8
            int r7 = 8 - r7
            r9 = r3
        L39:
            if (r9 >= r7) goto L55
            r10 = 255(0xff, double:1.26E-321)
            long r10 = r10 & r5
            r12 = 128(0x80, double:6.3E-322)
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 >= 0) goto L51
            int r10 = r4 << 3
            int r10 = r10 + r9
            r10 = r1[r10]     // Catch: java.lang.Throwable -> L4f
            wz5 r10 = (defpackage.wz5) r10     // Catch: java.lang.Throwable -> L4f
            r14.u(r10)     // Catch: java.lang.Throwable -> L4f
            goto L51
        L4f:
            r14 = move-exception
            goto L63
        L51:
            long r5 = r5 >> r8
            int r9 = r9 + 1
            goto L39
        L55:
            if (r7 != r8) goto L61
        L57:
            if (r4 == r2) goto L61
            int r4 = r4 + 1
            goto L1f
        L5c:
            wz5 r15 = (defpackage.wz5) r15     // Catch: java.lang.Throwable -> L4f
            r14.u(r15)     // Catch: java.lang.Throwable -> L4f
        L61:
            monitor-exit(r0)
            return
        L63:
            monitor-exit(r0)
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.le4.z(java.lang.Object):void");
    }
}
