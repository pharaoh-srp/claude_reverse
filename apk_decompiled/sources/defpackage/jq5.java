package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class jq5 implements bb1 {
    public static final /* synthetic */ wn9[] e = {jce.a.e(new bwb(jq5.class, "isEnabled", "isEnabled()Z", 0))};
    public final bb1 a;
    public final wp5 b;
    public final xa1 c;
    public final va1 d;

    public jq5(bb1 bb1Var, boolean z, int i) {
        wp5 wp5Var = new wp5();
        bb1Var.getClass();
        this.a = bb1Var;
        this.b = wp5Var;
        int i2 = 1;
        int i3 = 0;
        int i4 = 9;
        this.c = new xa1(false, i, new hq5(i2, wp5Var, wp5.class, "startPredictiveBack", "startPredictiveBack(Lcom/arkivanov/essenty/backhandler/BackEvent;)Z", 8, 0), new n0(i2, wp5Var, wp5.class, "progressPredictiveBack", "progressPredictiveBack(Lcom/arkivanov/essenty/backhandler/BackEvent;)V", i3, i4), new dm(0, wp5Var, wp5.class, "cancelPredictiveBack", "cancelPredictiveBack()V", i3, i4), new iq5(0, 8, wp5.class, wp5Var, "back", "back()Z"));
        this.d = new va1(Boolean.valueOf(z), 1, this);
        wp5Var.c = dxf.q0(wp5Var.c, new a2(24, this));
    }

    @Override // defpackage.bb1
    public final void a(wa1 wa1Var) {
        wa1Var.getClass();
        this.b.a(wa1Var);
    }

    @Override // defpackage.bb1
    public final boolean b(xa1 xa1Var) {
        xa1Var.getClass();
        wp5 wp5Var = this.b;
        wp5Var.getClass();
        return wp5Var.a.contains(xa1Var);
    }

    @Override // defpackage.bb1
    public final void c(wa1 wa1Var) {
        wa1Var.getClass();
        this.b.c(wa1Var);
    }

    public final void d() {
        bb1 bb1Var = this.a;
        xa1 xa1Var = this.c;
        if (bb1Var.b(xa1Var)) {
            return;
        }
        bb1Var.a(xa1Var);
    }

    public final void e() {
        bb1 bb1Var = this.a;
        xa1 xa1Var = this.c;
        if (bb1Var.b(xa1Var)) {
            bb1Var.c(xa1Var);
        }
    }

    public final void f() {
        wn9 wn9Var = e[0];
        va1 va1Var = this.d;
        va1Var.getClass();
        wn9Var.getClass();
        boolean z = ((Boolean) va1Var.a).booleanValue() && this.b.e();
        xa1 xa1Var = this.c;
        xa1Var.c.a(xa1Var, wa1.d[0], Boolean.valueOf(z));
    }
}
