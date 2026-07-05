package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ms8 extends os8 {
    public final x82 d;
    public final boolean e;

    public ms8(nd5 nd5Var, t82 t82Var, br4 br4Var, x82 x82Var, boolean z) {
        super(nd5Var, t82Var, br4Var);
        this.d = x82Var;
        this.e = z;
    }

    @Override // defpackage.os8
    public final Object a(fdc fdcVar, Object[] objArr) {
        u82 u82Var = (u82) this.d.i(fdcVar);
        tp4 tp4Var = (tp4) objArr[objArr.length - 1];
        try {
            try {
                if (!this.e) {
                    return d4c.D(u82Var, tp4Var);
                }
                try {
                    u82Var.getClass();
                    return d4c.F(u82Var, tp4Var);
                } catch (LinkageError e) {
                    throw e;
                } catch (ThreadDeath e2) {
                    throw e2;
                }
            } catch (LinkageError | ThreadDeath | VirtualMachineError e3) {
                throw e3;
            }
        } catch (Throwable th) {
            d4c.m0(th, tp4Var);
            return m45.E;
        }
    }
}
