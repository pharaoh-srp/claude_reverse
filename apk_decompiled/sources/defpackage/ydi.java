package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ydi extends n7f {
    public final ThreadLocal K;
    private volatile boolean threadLocalIsSet;

    /* JADX WARN: Illegal instructions before constructor call */
    public ydi(tp4 tp4Var, c45 c45Var) {
        cb2 cb2Var = cb2.H;
        super(tp4Var, c45Var.x0(cb2Var) == null ? c45Var.r0(cb2Var) : c45Var);
        this.K = new ThreadLocal();
        if (tp4Var.getContext().x0(a5.G) instanceof e45) {
            return;
        }
        Object objC = qnh.c(c45Var, null);
        qnh.a(c45Var, objC);
        C0(c45Var, objC);
    }

    public final void A0() {
        if (this.threadLocalIsSet) {
            cpc cpcVar = (cpc) this.K.get();
            if (cpcVar != null) {
                qnh.a((c45) cpcVar.E, cpcVar.F);
            }
            this.K.remove();
        }
    }

    public final void C0(c45 c45Var, Object obj) {
        this.threadLocalIsSet = true;
        this.K.set(new cpc(c45Var, obj));
    }

    @Override // defpackage.n7f, defpackage.vf9
    public final void v(Object obj) {
        A0();
        Object objL = dgj.L(obj);
        tp4 tp4Var = this.J;
        c45 context = tp4Var.getContext();
        Object objC = qnh.c(context, null);
        ydi ydiVarD0 = objC != qnh.a ? zni.d0(tp4Var, context, objC) : null;
        try {
            tp4Var.resumeWith(objL);
            if (ydiVarD0 == null || ydiVarD0.z0()) {
                qnh.a(context, objC);
            }
        } catch (Throwable th) {
            if (ydiVarD0 == null || ydiVarD0.z0()) {
                qnh.a(context, objC);
            }
            throw th;
        }
    }

    @Override // defpackage.n7f
    public final void y0() {
        A0();
    }

    public final boolean z0() {
        boolean z = this.threadLocalIsSet && this.K.get() == null;
        this.K.remove();
        return !z;
    }
}
