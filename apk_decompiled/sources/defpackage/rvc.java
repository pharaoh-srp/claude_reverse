package defpackage;

import android.os.Trace;
import androidx.compose.runtime.d;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.KotlinNothingValueException;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes2.dex */
public final class rvc {
    public final le4 a;
    public final ge4 b;
    public final e18 c;
    public final pz7 d;
    public final boolean e;
    public final a0 f;
    public final Object g;
    public final AtomicReference h = new AtomicReference(tvc.G);
    public long i = zni.q();
    public fwb j;
    public final p60 k;
    public final d l;

    public rvc(le4 le4Var, ge4 ge4Var, e18 e18Var, iwb iwbVar, pz7 pz7Var, boolean z, a0 a0Var, Object obj) {
        this.a = le4Var;
        this.b = ge4Var;
        this.c = e18Var;
        this.d = pz7Var;
        this.e = z;
        this.f = a0Var;
        this.g = obj;
        fwb fwbVar = v6f.a;
        fwbVar.getClass();
        this.j = fwbVar;
        p60 p60Var = new p60();
        p60Var.p(iwbVar, e18Var.B());
        this.k = p60Var;
        this.l = new d(a0Var.G);
    }

    public final void a() throws Exception {
        AtomicReference atomicReference = this.h;
        try {
            switch (((tvc) atomicReference.get()).ordinal()) {
                case 0:
                    throw new IllegalStateException("The paused composition is invalid because of a previous exception");
                case 1:
                    throw new IllegalStateException("The paused composition has been cancelled");
                case 2:
                case 3:
                case 4:
                    throw new IllegalStateException("The paused composition has not completed yet");
                case 5:
                    b();
                    tvc tvcVar = tvc.J;
                    tvc tvcVar2 = tvc.K;
                    while (!atomicReference.compareAndSet(tvcVar, tvcVar2)) {
                        if (atomicReference.get() != tvcVar) {
                            zad.b("Unexpected state change from: " + tvcVar + " to: " + tvcVar2 + '.');
                            return;
                        }
                    }
                    return;
                case 6:
                    throw new IllegalStateException("The paused composition has already been applied");
                default:
                    throw new NoWhenBranchMatchedException();
            }
        } catch (Exception e) {
            atomicReference.set(tvc.E);
            throw e;
        }
    }

    public final void b() {
        Trace.beginSection("PausedComposition:applyChanges");
        try {
            synchronized (this.g) {
                try {
                    this.l.l(this.f, this.k);
                    this.k.l();
                    this.k.m();
                } finally {
                    this.k.k();
                    this.a.U = null;
                }
            }
        } finally {
            Trace.endSection();
        }
    }

    public final void c() {
        fwb fwbVar;
        this.h.set(tvc.F);
        p60 p60Var = this.k;
        if (((fwb) p60Var.H).i()) {
            fwbVar = (fwb) p60Var.H;
            fwb fwbVar2 = v6f.a;
            p60Var.H = new fwb();
            ((wwb) p60Var.G).h();
        } else {
            fwbVar = null;
        }
        p60Var.k();
        le4 le4Var = this.a;
        le4Var.U = null;
        if (fwbVar != null) {
            le4Var.Y.O = fwbVar;
            le4Var.a0 = 2;
        }
    }

    public final d d() {
        return this.l;
    }

    public final p60 e() {
        return this.k;
    }

    public final boolean f() {
        return ((tvc) this.h.get()).compareTo(tvc.J) >= 0;
    }

    public final boolean g() {
        return this.h.get() == tvc.I && this.i == zni.q();
    }

    public final void h() {
        tvc tvcVar;
        tvc tvcVar2;
        boolean z;
        while (true) {
            AtomicReference atomicReference = this.h;
            tvcVar = tvc.H;
            tvcVar2 = tvc.J;
            if (atomicReference.compareAndSet(tvcVar, tvcVar2)) {
                z = true;
                break;
            } else if (atomicReference.get() != tvcVar) {
                z = false;
                break;
            }
        }
        if (z) {
            return;
        }
        zad.b("Unexpected state change from: " + tvcVar + " to: " + tvcVar2 + '.');
    }

    public final void i() {
        AtomicReference atomicReference;
        tvc tvcVar;
        do {
            atomicReference = this.h;
            tvcVar = tvc.J;
            if (atomicReference.compareAndSet(tvcVar, tvc.H)) {
                return;
            }
        } while (atomicReference.get() == tvcVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final boolean j(k5g k5gVar) throws Exception {
        tvc tvcVar = tvc.I;
        AtomicReference atomicReference = this.h;
        try {
            int iOrdinal = ((tvc) atomicReference.get()).ordinal();
            tvc tvcVar2 = tvc.H;
            le4 le4Var = this.a;
            ge4 ge4Var = this.b;
            switch (iOrdinal) {
                case 0:
                    throw new IllegalStateException("The paused composition is invalid because of a previous exception");
                case 1:
                    throw new IllegalStateException("The paused composition has been cancelled");
                case 2:
                    e18 e18Var = this.c;
                    boolean z = this.e;
                    if (z) {
                        e18Var.z = 0;
                        e18Var.y = true;
                    }
                    try {
                        this.j = ge4Var.b(le4Var, k5gVar, this.d);
                        tvc tvcVar3 = tvc.G;
                        while (true) {
                            if (!atomicReference.compareAndSet(tvcVar3, tvcVar2)) {
                                if (atomicReference.get() != tvcVar3) {
                                    zad.b("Unexpected state change from: " + tvcVar3 + " to: " + tvcVar2 + '.');
                                }
                            }
                        }
                        if (this.j.h()) {
                            h();
                        }
                        return f();
                    } finally {
                        if (z) {
                            e18Var.t();
                        }
                    }
                case 3:
                    while (true) {
                        if (!atomicReference.compareAndSet(tvcVar2, tvcVar)) {
                            if (atomicReference.get() != tvcVar2) {
                                zad.b("Unexpected state change from: " + tvcVar2 + " to: " + tvcVar + '.');
                            }
                        }
                    }
                    long j = this.i;
                    try {
                        this.i = zni.q();
                        this.j = ge4Var.n(le4Var, k5gVar, this.j);
                        this.i = j;
                        while (true) {
                            if (!atomicReference.compareAndSet(tvcVar, tvcVar2)) {
                                if (atomicReference.get() != tvcVar) {
                                    zad.b("Unexpected state change from: " + tvcVar + " to: " + tvcVar2 + '.');
                                }
                            }
                        }
                        if (this.j.h()) {
                            h();
                        }
                        return f();
                    } catch (Throwable th) {
                        this.i = j;
                        while (true) {
                            if (!atomicReference.compareAndSet(tvcVar, tvcVar2)) {
                                if (atomicReference.get() != tvcVar) {
                                    zad.b("Unexpected state change from: " + tvcVar + " to: " + tvcVar2 + '.');
                                }
                            }
                        }
                        throw th;
                    }
                case 4:
                    pd4.b("Recursive call to resume()");
                    throw new KotlinNothingValueException();
                case 5:
                    throw new IllegalStateException("Pausable composition is complete and apply() should be applied");
                case 6:
                    throw new IllegalStateException("The paused composition has been applied");
                default:
                    throw new NoWhenBranchMatchedException();
            }
        } catch (Exception e) {
            atomicReference.set(tvc.E);
            throw e;
        }
    }
}
