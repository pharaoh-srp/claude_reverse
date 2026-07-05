package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class uoh {
    public final int a;
    public final ha1 b;
    public final l0 c;
    public uoh d;
    public long e;
    public long f;
    public long g = Long.MIN_VALUE;
    public final /* synthetic */ voh h;

    public uoh(voh vohVar, int i, ha1 ha1Var, l0 l0Var) {
        this.h = vohVar;
        this.a = i;
        this.b = ha1Var;
        this.c = l0Var;
    }

    public final void a(long j, long j2, long j3, long j4, float[] fArr) {
        fee feeVarE = bsk.e(j, j2, j3, j4, this.h.f, this.b, fArr);
        if (feeVarE == null) {
            return;
        }
        this.c.invoke(feeVarE);
    }

    public final void b() {
        voh vohVar = this.h;
        xub xubVar = vohVar.a;
        int i = this.a;
        uoh uohVar = (uoh) xubVar.g(i);
        if (uohVar != null) {
            if (uohVar == this) {
                uoh uohVar2 = this.d;
                this.d = null;
                if (uohVar2 == null) {
                    av9 av9VarW = yfd.W(this.b.E);
                    if (av9VarW.K) {
                        dv9.a(av9VarW).getRectManager().b.i(av9VarW.F, false);
                        return;
                    }
                    return;
                }
                int iD = xubVar.d(i);
                Object[] objArr = xubVar.c;
                Object obj = objArr[iD];
                xubVar.b[iD] = i;
                objArr[iD] = uohVar2;
                return;
            }
            int iD2 = xubVar.d(i);
            Object[] objArr2 = xubVar.c;
            Object obj2 = objArr2[iD2];
            xubVar.b[iD2] = i;
            objArr2[iD2] = uohVar;
            while (true) {
                uoh uohVar3 = uohVar.d;
                if (uohVar3 == null) {
                    break;
                }
                if (uohVar3 == this) {
                    uohVar.d = this.d;
                    this.d = null;
                    return;
                }
                uohVar = uohVar3;
            }
        }
        uoh uohVar4 = vohVar.b;
        if (uohVar4 == this) {
            vohVar.b = uohVar4.d;
            this.d = null;
            return;
        }
        uoh uohVar5 = uohVar4 != null ? uohVar4.d : null;
        while (true) {
            uoh uohVar6 = uohVar4;
            uohVar4 = uohVar5;
            if (uohVar4 == null) {
                return;
            }
            if (uohVar4 == this) {
                if (uohVar6 != null) {
                    uohVar6.d = uohVar4.d;
                }
                this.d = null;
                return;
            }
            uohVar5 = uohVar4.d;
        }
    }
}
