package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class vp4 extends vd1 {
    private final c45 _context;
    private transient tp4<Object> intercepted;

    public vp4(tp4 tp4Var) {
        this(tp4Var, tp4Var != null ? tp4Var.getContext() : null);
    }

    @Override // defpackage.tp4
    public c45 getContext() {
        c45 c45Var = this._context;
        c45Var.getClass();
        return c45Var;
    }

    public final tp4<Object> intercepted() {
        tp4<Object> tp4Var = this.intercepted;
        if (tp4Var != null) {
            return tp4Var;
        }
        e45 e45Var = (e45) getContext().x0(a5.G);
        tp4<Object> z76Var = e45Var != null ? new z76(e45Var, this) : this;
        this.intercepted = z76Var;
        return z76Var;
    }

    @Override // defpackage.vd1
    public void releaseIntercepted() {
        tp4<Object> tp4Var = this.intercepted;
        if (tp4Var != null && tp4Var != this) {
            a45 a45VarX0 = getContext().x0(a5.G);
            a45VarX0.getClass();
            z76 z76Var = (z76) tp4Var;
            z76Var.i();
            ua2 ua2VarK = z76Var.k();
            if (ua2VarK != null) {
                ua2VarK.l();
            }
        }
        this.intercepted = d94.F;
    }

    public vp4(tp4 tp4Var, c45 c45Var) {
        super(tp4Var);
        this._context = c45Var;
    }
}
