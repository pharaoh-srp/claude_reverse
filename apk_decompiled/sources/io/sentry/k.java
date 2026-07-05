package io.sentry;

import java.util.Enumeration;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class k extends io.sentry.protocol.e {
    public final io.sentry.protocol.e G;
    public final io.sentry.protocol.e H;
    public final io.sentry.protocol.e I;
    public final l4 J;

    public k(io.sentry.protocol.e eVar, io.sentry.protocol.e eVar2, io.sentry.protocol.e eVar3, l4 l4Var) {
        this.G = eVar;
        this.H = eVar2;
        this.I = eVar3;
        this.J = l4Var;
    }

    @Override // io.sentry.protocol.e
    public final boolean a(Object obj) {
        throw null;
    }

    @Override // io.sentry.protocol.e
    public final Set b() {
        return y().E.entrySet();
    }

    @Override // io.sentry.protocol.e
    public final Object c(Object obj) {
        Object objC = this.I.c(obj);
        if (objC != null) {
            return objC;
        }
        Object objC2 = this.H.c(obj);
        return objC2 != null ? objC2 : this.G.c(obj);
    }

    @Override // io.sentry.protocol.e
    public final io.sentry.protocol.a d() {
        io.sentry.protocol.a aVarD = this.I.d();
        if (aVarD != null) {
            return aVarD;
        }
        io.sentry.protocol.a aVarD2 = this.H.d();
        return aVarD2 != null ? aVarD2 : this.G.d();
    }

    @Override // io.sentry.protocol.e
    public final io.sentry.protocol.h e() {
        io.sentry.protocol.h hVarE = this.I.e();
        if (hVarE != null) {
            return hVarE;
        }
        io.sentry.protocol.h hVarE2 = this.H.e();
        return hVarE2 != null ? hVarE2 : this.G.e();
    }

    @Override // io.sentry.protocol.e
    public final io.sentry.protocol.j f() {
        io.sentry.protocol.j jVarF = this.I.f();
        if (jVarF != null) {
            return jVarF;
        }
        io.sentry.protocol.j jVarF2 = this.H.f();
        return jVarF2 != null ? jVarF2 : this.G.f();
    }

    @Override // io.sentry.protocol.e
    public final io.sentry.protocol.q g() {
        io.sentry.protocol.q qVarG = this.I.g();
        if (qVarG != null) {
            return qVarG;
        }
        io.sentry.protocol.q qVarG2 = this.H.g();
        return qVarG2 != null ? qVarG2 : this.G.g();
    }

    @Override // io.sentry.protocol.e
    public final io.sentry.protocol.y h() {
        io.sentry.protocol.y yVarH = this.I.h();
        if (yVarH != null) {
            return yVarH;
        }
        io.sentry.protocol.y yVarH2 = this.H.h();
        return yVarH2 != null ? yVarH2 : this.G.h();
    }

    @Override // io.sentry.protocol.e
    public final j7 i() {
        j7 j7VarI = this.I.i();
        if (j7VarI != null) {
            return j7VarI;
        }
        j7 j7VarI2 = this.H.i();
        return j7VarI2 != null ? j7VarI2 : this.G.i();
    }

    @Override // io.sentry.protocol.e
    public final Enumeration j() {
        return y().E.keys();
    }

    @Override // io.sentry.protocol.e
    public final Object k(String str, Object obj) {
        return x().k(str, obj);
    }

    @Override // io.sentry.protocol.e
    public final void l(io.sentry.protocol.e eVar) {
        throw null;
    }

    @Override // io.sentry.protocol.e
    public final void m(io.sentry.protocol.a aVar) {
        x().m(aVar);
    }

    @Override // io.sentry.protocol.e
    public final void n(io.sentry.protocol.d dVar) {
        x().n(dVar);
    }

    @Override // io.sentry.protocol.e
    public final void o(io.sentry.protocol.h hVar) {
        x().o(hVar);
    }

    @Override // io.sentry.protocol.e
    public final void p(io.sentry.protocol.j jVar) {
        throw null;
    }

    @Override // io.sentry.protocol.e
    public final void q(io.sentry.protocol.m mVar) {
        x().q(mVar);
    }

    @Override // io.sentry.protocol.e
    public final void r(io.sentry.protocol.q qVar) {
        x().r(qVar);
    }

    @Override // io.sentry.protocol.e
    public final void s(io.sentry.protocol.s sVar) {
        x().s(sVar);
    }

    @Override // io.sentry.protocol.e, io.sentry.m2
    public final void serialize(q3 q3Var, a1 a1Var) {
        y().serialize(q3Var, a1Var);
    }

    @Override // io.sentry.protocol.e
    public final void t(io.sentry.protocol.y yVar) {
        x().t(yVar);
    }

    @Override // io.sentry.protocol.e
    public final void u(io.sentry.protocol.f0 f0Var) {
        x().u(f0Var);
    }

    @Override // io.sentry.protocol.e
    public final void v(j7 j7Var) {
        x().v(j7Var);
    }

    public final io.sentry.protocol.e x() {
        int i = j.a[this.J.ordinal()];
        io.sentry.protocol.e eVar = this.I;
        return i != 1 ? i != 2 ? i != 3 ? eVar : this.G : this.H : eVar;
    }

    public final io.sentry.protocol.e y() {
        io.sentry.protocol.e eVar = new io.sentry.protocol.e();
        eVar.l(this.G);
        eVar.l(this.H);
        eVar.l(this.I);
        return eVar;
    }
}
