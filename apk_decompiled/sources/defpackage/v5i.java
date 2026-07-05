package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;

/* JADX INFO: loaded from: classes.dex */
public final class v5i implements wlg {
    public final c9i E;
    public final lsc F;
    public final lsc G;
    public final lsc H;
    public zef I;
    public a5h J;
    public final lsc K;
    public final hsc L;
    public boolean M;
    public final lsc N;
    public sb0 O;
    public final jsc P;
    public boolean Q;
    public final yig R;
    public final /* synthetic */ a6i S;

    public v5i(a6i a6iVar, Object obj, sb0 sb0Var, c9i c9iVar) {
        this.S = a6iVar;
        this.E = c9iVar;
        lsc lscVarP = mpk.P(obj);
        this.F = lscVarP;
        Object objInvoke = null;
        lsc lscVarP2 = mpk.P(kxk.K(MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, null, 7));
        this.G = lscVarP2;
        this.H = mpk.P(new a5h((kl7) lscVarP2.getValue(), c9iVar, obj, lscVarP.getValue(), sb0Var));
        this.K = mpk.P(Boolean.TRUE);
        this.L = new hsc(-1.0f);
        this.N = mpk.P(obj);
        this.O = sb0Var;
        this.P = new jsc(a().b());
        Float f = (Float) nzi.b.get(c9iVar);
        if (f != null) {
            float fFloatValue = f.floatValue();
            sb0 sb0Var2 = (sb0) c9iVar.a().invoke(obj);
            int iB = sb0Var2.b();
            for (int i = 0; i < iB; i++) {
                sb0Var2.e(i, fFloatValue);
            }
            objInvoke = this.E.b().invoke(sb0Var2);
        }
        this.R = kxk.K(MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, objInvoke, 3);
    }

    public final a5h a() {
        return (a5h) this.H.getValue();
    }

    public final void d(long j) {
        if (this.L.h() == -1.0f) {
            this.Q = true;
            if (x44.r(a().c, a().d)) {
                e(a().c);
            } else {
                e(a().f(j));
                this.O = a().d(j);
            }
        }
    }

    public final void e(Object obj) {
        this.N.setValue(obj);
    }

    public final void f(Object obj, boolean z) {
        a5h a5hVar = this.J;
        Object obj2 = a5hVar != null ? a5hVar.c : null;
        lsc lscVar = this.F;
        boolean zR = x44.r(obj2, lscVar.getValue());
        jsc jscVar = this.P;
        lsc lscVar2 = this.H;
        kl7 kl7Var = this.R;
        if (zR) {
            lscVar2.setValue(new a5h(kl7Var, this.E, obj, obj, this.O.c()));
            this.M = true;
            jscVar.i(a().b());
            return;
        }
        lsc lscVar3 = this.G;
        if (!z || this.Q || (((kl7) lscVar3.getValue()) instanceof yig)) {
            kl7Var = (kl7) lscVar3.getValue();
        }
        a6i a6iVar = this.S;
        long jE = a6iVar.e();
        lsc lscVar4 = a6iVar.h;
        lscVar2.setValue(new a5h(jE <= 0 ? kl7Var : new clg(kl7Var, a6iVar.e()), this.E, obj, lscVar.getValue(), this.O));
        jscVar.i(a().b());
        this.M = false;
        lscVar4.setValue(Boolean.TRUE);
        if (a6iVar.g()) {
            kdg kdgVar = a6iVar.i;
            int size = kdgVar.size();
            long jMax = 0;
            for (int i = 0; i < size; i++) {
                v5i v5iVar = (v5i) kdgVar.get(i);
                jMax = Math.max(jMax, v5iVar.P.h());
                v5iVar.d(0L);
            }
            lscVar4.setValue(Boolean.FALSE);
        }
    }

    public final void g(Object obj, Object obj2, kl7 kl7Var) {
        this.F.setValue(obj2);
        this.G.setValue(kl7Var);
        if (x44.r(a().d, obj) && x44.r(a().c, obj2)) {
            return;
        }
        f(obj, false);
    }

    @Override // defpackage.wlg
    public final Object getValue() {
        return this.N.getValue();
    }

    public final void h(Object obj, kl7 kl7Var) {
        if (this.M) {
            a5h a5hVar = this.J;
            if (x44.r(obj, a5hVar != null ? a5hVar.c : null)) {
                return;
            }
        }
        lsc lscVar = this.F;
        boolean zR = x44.r(lscVar.getValue(), obj);
        hsc hscVar = this.L;
        if (zR && hscVar.h() == -1.0f) {
            return;
        }
        lscVar.setValue(obj);
        this.G.setValue(kl7Var);
        Object value = hscVar.h() == -3.0f ? obj : this.N.getValue();
        lsc lscVar2 = this.K;
        f(value, !((Boolean) lscVar2.getValue()).booleanValue());
        lscVar2.setValue(Boolean.valueOf(hscVar.h() == -3.0f));
        if (hscVar.h() >= MTTypesetterKt.kLineSkipLimitMultiplier) {
            e(a().f((long) (hscVar.h() * a().b())));
        } else if (hscVar.h() == -3.0f) {
            e(obj);
        }
        this.M = false;
        hscVar.i(-1.0f);
    }

    public final String toString() {
        return "current value: " + this.N.getValue() + ", target: " + this.F.getValue() + ", spec: " + ((kl7) this.G.getValue());
    }
}
