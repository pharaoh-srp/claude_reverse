package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class y4f implements mee {
    public x5f E;
    public c5f F;
    public String G;
    public Object H;
    public Object[] I;
    public b5f J;
    public final p3f K = new p3f(1, this);

    public y4f(x5f x5fVar, c5f c5fVar, String str, Object obj, Object[] objArr) {
        this.E = x5fVar;
        this.F = c5fVar;
        this.G = str;
        this.H = obj;
        this.I = objArr;
    }

    @Override // defpackage.mee
    public final void a() {
        b5f b5fVar = this.J;
        if (b5fVar != null) {
            ((w3c) b5fVar).f();
        }
    }

    @Override // defpackage.mee
    public final void b() {
        b5f b5fVar = this.J;
        if (b5fVar != null) {
            ((w3c) b5fVar).f();
        }
    }

    public final void c() {
        String strX;
        c5f c5fVar = this.F;
        if (this.J != null) {
            xh6.l(this.J, ") is not null", "entry(");
            return;
        }
        if (c5fVar != null) {
            p3f p3fVar = this.K;
            Object objA = p3fVar.a();
            if (objA == null || c5fVar.d(objA)) {
                this.J = c5fVar.b(p3fVar, this.G);
                return;
            }
            if (objA instanceof ddg) {
                ddg ddgVar = (ddg) objA;
                if (ddgVar.c() == ql8.J || ddgVar.c() == a5.N || ddgVar.c() == zp3.X) {
                    strX = "MutableState containing " + ddgVar.getValue() + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it as a stateSaver parameter to rememberSaveable().";
                } else {
                    strX = "If you use a custom SnapshotMutationPolicy for your MutableState you have to write a custom Saver";
                }
            } else {
                strX = iuj.x(objA);
            }
            throw new IllegalArgumentException(strX);
        }
    }

    @Override // defpackage.mee
    public final void g() {
        c();
    }
}
