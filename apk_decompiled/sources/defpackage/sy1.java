package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public final class sy1 implements x5j {
    public Object E = bz1.p;
    public ua2 F;
    public final /* synthetic */ zy1 G;

    public sy1(zy1 zy1Var) {
        this.G = zy1Var;
    }

    @Override // defpackage.x5j
    public final void a(lff lffVar, int i) {
        ua2 ua2Var = this.F;
        if (ua2Var != null) {
            ua2Var.a(lffVar, i);
        }
    }

    public final Object b(tp4 tp4Var) {
        bi2 bi2VarT;
        Object obj = this.E;
        boolean z = true;
        if (obj == bz1.p || obj == bz1.l) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = zy1.K;
            zy1 zy1Var = this.G;
            bi2 bi2Var = (bi2) atomicReferenceFieldUpdater.get(zy1Var);
            while (true) {
                if (zy1Var.a()) {
                    this.E = bz1.l;
                    Throwable thV = zy1Var.v();
                    if (thV != null) {
                        int i = vjg.a;
                        throw thV;
                    }
                    z = false;
                } else {
                    long andIncrement = zy1.G.getAndIncrement(zy1Var);
                    long j = bz1.b;
                    long j2 = andIncrement / j;
                    int i2 = (int) (andIncrement % j);
                    if (bi2Var.I != j2) {
                        bi2VarT = zy1Var.t(j2, bi2Var);
                        if (bi2VarT == null) {
                            continue;
                        }
                    } else {
                        bi2VarT = bi2Var;
                    }
                    Object objR = zy1Var.R(bi2VarT, i2, andIncrement, null);
                    sqb sqbVar = bz1.m;
                    if (objR == sqbVar) {
                        sz6.j("unreachable");
                        return null;
                    }
                    sqb sqbVar2 = bz1.o;
                    if (objR == sqbVar2) {
                        if (andIncrement < zy1Var.y()) {
                            bi2VarT.a();
                        }
                        bi2Var = bi2VarT;
                    } else {
                        if (objR == bz1.n) {
                            zy1 zy1Var2 = this.G;
                            ua2 ua2VarT = yb5.t(zni.I(tp4Var));
                            try {
                                this.F = ua2VarT;
                                Object objR2 = zy1Var2.R(bi2VarT, i2, andIncrement, this);
                                if (objR2 == sqbVar) {
                                    a(bi2VarT, i2);
                                } else {
                                    if (objR2 == sqbVar2) {
                                        if (andIncrement < zy1Var2.y()) {
                                            bi2VarT.a();
                                        }
                                        bi2 bi2Var2 = (bi2) zy1.K.get(zy1Var2);
                                        while (true) {
                                            if (zy1Var2.a()) {
                                                ua2 ua2Var = this.F;
                                                ua2Var.getClass();
                                                this.F = null;
                                                this.E = bz1.l;
                                                Throwable thV2 = zy1Var.v();
                                                if (thV2 == null) {
                                                    ua2Var.resumeWith(Boolean.FALSE);
                                                } else {
                                                    ua2Var.resumeWith(new hre(thV2));
                                                }
                                            } else {
                                                long andIncrement2 = zy1.G.getAndIncrement(zy1Var2);
                                                long j3 = bz1.b;
                                                long j4 = andIncrement2 / j3;
                                                int i3 = (int) (andIncrement2 % j3);
                                                if (bi2Var2.I != j4) {
                                                    bi2 bi2VarT2 = zy1Var2.t(j4, bi2Var2);
                                                    if (bi2VarT2 != null) {
                                                        bi2Var2 = bi2VarT2;
                                                    }
                                                }
                                                Object objR3 = zy1Var2.R(bi2Var2, i3, andIncrement2, this);
                                                if (objR3 == bz1.m) {
                                                    a(bi2Var2, i3);
                                                    break;
                                                }
                                                if (objR3 == bz1.o) {
                                                    if (andIncrement2 < zy1Var2.y()) {
                                                        bi2Var2.a();
                                                    }
                                                } else {
                                                    if (objR3 == bz1.n) {
                                                        throw new IllegalStateException("unexpected");
                                                    }
                                                    bi2Var2.a();
                                                    this.E = objR3;
                                                    this.F = null;
                                                }
                                            }
                                        }
                                    } else {
                                        bi2VarT.a();
                                        this.E = objR2;
                                        this.F = null;
                                    }
                                    ua2VarT.o(Boolean.TRUE, null);
                                }
                                return ua2VarT.r();
                            } catch (Throwable th) {
                                ua2VarT.C();
                                throw th;
                            }
                        }
                        bi2VarT.a();
                        this.E = objR;
                    }
                }
            }
        }
        return Boolean.valueOf(z);
    }

    public final Object c() {
        Object obj = this.E;
        sqb sqbVar = bz1.p;
        if (obj == sqbVar) {
            sz6.j("`hasNext()` has not been invoked");
            return null;
        }
        this.E = sqbVar;
        if (obj != bz1.l) {
            return obj;
        }
        Throwable thW = this.G.w();
        int i = vjg.a;
        throw thW;
    }
}
