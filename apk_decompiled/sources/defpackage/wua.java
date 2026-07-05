package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class wua extends oij {
    public final boolean l;
    public final kqh m;
    public final jqh n;
    public uua o;
    public tua p;
    public boolean q;
    public boolean r;
    public boolean s;

    public wua(me1 me1Var, boolean z) {
        super(me1Var);
        this.l = z && me1Var.h();
        this.m = new kqh();
        this.n = new jqh();
        mqh mqhVarF = me1Var.f();
        if (mqhVarF == null) {
            this.o = new uua(new vua(me1Var.g()), kqh.o, uua.e);
        } else {
            this.o = new uua(mqhVarF, null, null);
            this.s = true;
        }
    }

    @Override // defpackage.oij
    public final void A() {
        if (this.l) {
            return;
        }
        this.q = true;
        z();
    }

    @Override // defpackage.me1
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public final tua a(z7b z7bVar, xv8 xv8Var, long j) {
        tua tuaVar = new tua(z7bVar, xv8Var, j);
        fd9.M(tuaVar.H == null);
        tuaVar.H = this.k;
        if (!this.r) {
            this.p = tuaVar;
            if (!this.q) {
                this.q = true;
                z();
            }
            return tuaVar;
        }
        Object obj = z7bVar.a;
        if (this.o.d != null && obj.equals(uua.e)) {
            obj = this.o.d;
        }
        tuaVar.j(z7bVar.a(obj));
        return tuaVar;
    }

    public final boolean C(long j) {
        tua tuaVar = this.p;
        int iB = this.o.b(tuaVar.E.a);
        if (iB == -1) {
            return false;
        }
        uua uuaVar = this.o;
        jqh jqhVar = this.n;
        uuaVar.f(iB, jqhVar, false);
        long j2 = jqhVar.d;
        if (j2 != -9223372036854775807L && j >= j2) {
            j = Math.max(0L, j2 - 1);
        }
        tuaVar.K = j;
        return true;
    }

    @Override // defpackage.me1
    public final void m(s7b s7bVar) {
        tua tuaVar = (tua) s7bVar;
        if (tuaVar.I != null) {
            me1 me1Var = tuaVar.H;
            me1Var.getClass();
            me1Var.m(tuaVar.I);
        }
        if (s7bVar == this.p) {
            this.p = null;
        }
    }

    @Override // defpackage.ae4, defpackage.me1
    public final void o() {
        this.r = false;
        this.q = false;
        super.o();
    }

    @Override // defpackage.oij, defpackage.me1
    public final void r(j7b j7bVar) {
        if (this.s) {
            uua uuaVar = this.o;
            mqh mqhVar = uuaVar.b;
            this.o = new uua(mqhVar instanceof sqh ? new sqh(((sqh) mqhVar).b, j7bVar) : new sqh(mqhVar, j7bVar), uuaVar.c, uuaVar.d);
        } else {
            this.o = new uua(new vua(j7bVar), kqh.o, uua.e);
        }
        this.k.r(j7bVar);
    }

    @Override // defpackage.oij
    public final z7b x(z7b z7bVar) {
        Object obj = z7bVar.a;
        Object obj2 = this.o.d;
        if (obj2 != null && obj2.equals(obj)) {
            obj = uua.e;
        }
        return z7bVar.a(obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.oij
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void y(defpackage.mqh r13) {
        /*
            Method dump skipped, instruction units count: 213
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wua.y(mqh):void");
    }
}
