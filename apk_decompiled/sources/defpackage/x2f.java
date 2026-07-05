package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class x2f extends vp4 implements lp7 {
    public final lp7 E;
    public final c45 F;
    public final int G;
    public c45 H;
    public tp4 I;

    public x2f(lp7 lp7Var, c45 c45Var) {
        super(d94.G, im6.E);
        this.E = lp7Var;
        this.F = c45Var;
        this.G = ((Number) c45Var.K(new k8d((byte) 0, 14), 0)).intValue();
    }

    public final Object d(tp4 tp4Var, Object obj) {
        c45 context = tp4Var.getContext();
        knk.u(context);
        c45 c45Var = this.H;
        if (c45Var != context) {
            if (c45Var instanceof ua6) {
                throw new IllegalStateException(csg.V("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + ((ua6) c45Var).F + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ").toString());
            }
            if (((Number) context.K(new a21(20, this), 0)).intValue() != this.G) {
                throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + this.F + ",\n\t\tbut emission happened in " + context + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
            }
            this.H = context;
        }
        this.I = tp4Var;
        rz7 rz7Var = z2f.a;
        lp7 lp7Var = this.E;
        lp7Var.getClass();
        Object objInvoke = rz7Var.invoke(lp7Var, obj, this);
        if (!x44.r(objInvoke, m45.E)) {
            this.I = null;
        }
        return objInvoke;
    }

    @Override // defpackage.lp7
    public final Object g(Object obj, tp4 tp4Var) {
        try {
            Object objD = d(tp4Var, obj);
            return objD == m45.E ? objD : iei.a;
        } catch (Throwable th) {
            this.H = new ua6(tp4Var.getContext(), th);
            throw th;
        }
    }

    @Override // defpackage.vd1, defpackage.n45
    public final n45 getCallerFrame() {
        tp4 tp4Var = this.I;
        if (tp4Var instanceof n45) {
            return (n45) tp4Var;
        }
        return null;
    }

    @Override // defpackage.vp4, defpackage.tp4
    public final c45 getContext() {
        c45 c45Var = this.H;
        return c45Var == null ? im6.E : c45Var;
    }

    @Override // defpackage.vd1
    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        Throwable thA = jre.a(obj);
        if (thA != null) {
            this.H = new ua6(getContext(), thA);
        }
        tp4 tp4Var = this.I;
        if (tp4Var != null) {
            tp4Var.resumeWith(obj);
        }
        return m45.E;
    }
}
