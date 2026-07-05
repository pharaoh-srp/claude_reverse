package defpackage;

import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes2.dex */
public final class xtb extends rok {
    public final ewb F;
    public final ArrayList G;
    public final fwb H;
    public final ewb I;
    public final cd J;

    public xtb() {
        super(5);
        this.F = x44.C();
        this.G = new ArrayList();
        fwb fwbVar = v6f.a;
        this.H = new fwb();
        this.I = new ewb();
        ska skaVar = new ska(9, this);
        ycg.e(ycg.a);
        synchronized (ycg.c) {
            ycg.h = w44.b1(ycg.h, skaVar);
        }
        this.J = new cd(15, skaVar);
    }

    public final void L0(mkf mkfVar, Object obj) {
        this.G.add(new utb(mkfVar, obj));
    }

    @Override // defpackage.rok
    public final void l0(mkf mkfVar) {
        this.G.add(new vtb(mkfVar));
    }

    @Override // defpackage.rok
    public final void m0() {
        synchronized (this.E) {
            try {
                ArrayList arrayList = this.G;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    wtb wtbVar = (wtb) arrayList.get(i);
                    if (wtbVar instanceof utb) {
                        x44.m(this.F, ((utb) wtbVar).a, ((utb) wtbVar).b);
                    } else {
                        if (!(wtbVar instanceof vtb)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        x44.j0(this.F, ((vtb) wtbVar).a);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.G.clear();
    }

    @Override // defpackage.rok
    public final void o0() {
        this.J.h();
        this.G.clear();
        this.I.a();
        synchronized (this.E) {
            this.F.a();
        }
    }

    @Override // defpackage.rok
    public final bz7 v0(mkf mkfVar) {
        ewb ewbVar = this.I;
        bz7 b4bVar = (bz7) ewbVar.g(mkfVar);
        if (b4bVar == null) {
            b4bVar = new b4b(this, 2, mkfVar);
            int iF = ewbVar.f(mkfVar);
            if (iF < 0) {
                iF = ~iF;
            }
            Object[] objArr = ewbVar.c;
            Object obj = objArr[iF];
            ewbVar.b[iF] = mkfVar;
            objArr[iF] = b4bVar;
        }
        return b4bVar;
    }

    @Override // defpackage.rok
    public final void w0(gh2 gh2Var) {
        this.I.k(gh2Var);
        l0(gh2Var);
        m0();
    }
}
