package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ztb {
    public final long a;
    public final xhf b;
    public final xhf c;
    public yjh e;
    public final ztb d = this;
    public int f = -1;

    public ztb(long j, xhf xhfVar, xhf xhfVar2) {
        this.a = j;
        this.b = xhfVar;
        this.c = xhfVar2;
    }

    public final float a(int i) {
        qtb qtbVar;
        int iD;
        yjh yjhVar = (yjh) this.c.a();
        if (yjhVar == null || (iD = (qtbVar = yjhVar.b).d(i)) >= qtbVar.f) {
            return -1.0f;
        }
        float f = qtbVar.f(iD);
        return ((qtbVar.b(iD) - f) / 2.0f) + f;
    }

    public final long b(ohf ohfVar, boolean z) {
        yjh yjhVar;
        nhf nhfVar = ohfVar.b;
        nhf nhfVar2 = ohfVar.a;
        long j = this.a;
        if (z && nhfVar2.c != j) {
            return 9205357640488583168L;
        }
        if ((!z && nhfVar.c != j) || e() == null || (yjhVar = (yjh) this.c.a()) == null) {
            return 9205357640488583168L;
        }
        return dqk.f(yjhVar, wd6.e0(z ? nhfVar2.b : nhfVar.b, 0, d(yjhVar)), z, ohfVar.c);
    }

    public final int c() {
        yjh yjhVar = (yjh) this.c.a();
        if (yjhVar == null) {
            return 0;
        }
        return d(yjhVar);
    }

    public final int d(yjh yjhVar) {
        int i;
        synchronized (this.d) {
            try {
                if (this.e != yjhVar) {
                    qtb qtbVar = yjhVar.b;
                    boolean z = qtbVar.c;
                    int i2 = 0;
                    if (!(z || ((float) ((int) (yjhVar.c & 4294967295L))) < qtbVar.e) || z) {
                        i2 = qtbVar.f - 1;
                    } else {
                        int iE = qtbVar.e((int) (yjhVar.c & 4294967295L));
                        int i3 = yjhVar.b.f - 1;
                        if (iE > i3) {
                            iE = i3;
                        }
                        while (iE >= 0 && yjhVar.b.f(iE) >= ((int) (yjhVar.c & 4294967295L))) {
                            iE--;
                        }
                        if (iE >= 0) {
                            i2 = iE;
                        }
                    }
                    this.f = yjhVar.b.c(i2, true);
                    this.e = yjhVar;
                }
                i = this.f;
            } catch (Throwable th) {
                throw th;
            }
        }
        return i;
    }

    public final cu9 e() {
        cu9 cu9Var = (cu9) this.b.a();
        if (cu9Var == null || !cu9Var.n()) {
            return null;
        }
        return cu9Var;
    }

    public final float f(int i) {
        qtb qtbVar;
        int iD;
        yjh yjhVar = (yjh) this.c.a();
        if (yjhVar != null && (iD = (qtbVar = yjhVar.b).d(i)) < qtbVar.f) {
            return yjhVar.f(iD);
        }
        return -1.0f;
    }

    public final float g(int i) {
        qtb qtbVar;
        int iD;
        yjh yjhVar = (yjh) this.c.a();
        if (yjhVar != null && (iD = (qtbVar = yjhVar.b).d(i)) < qtbVar.f) {
            return yjhVar.g(iD);
        }
        return -1.0f;
    }

    public final long h(int i) {
        yjh yjhVar = (yjh) this.c.a();
        if (yjhVar == null) {
            return kkh.b;
        }
        qtb qtbVar = yjhVar.b;
        int iD = d(yjhVar);
        if (iD < 1) {
            return kkh.b;
        }
        int iD2 = qtbVar.d(wd6.e0(i, 0, iD - 1));
        return mwa.m(yjhVar.h(iD2), qtbVar.c(iD2, true));
    }

    public final zb0 i() {
        yjh yjhVar = (yjh) this.c.a();
        return yjhVar == null ? new zb0("") : yjhVar.a.a;
    }
}
