package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class b52 implements cz5 {
    public gz1 E = efk.G;
    public ax5 F;

    public final ax5 a(bz7 bz7Var) {
        return b(new a52(0, bz7Var));
    }

    public final ax5 b(bz7 bz7Var) {
        ax5 ax5Var = new ax5(2, false);
        ax5Var.F = bz7Var;
        this.F = ax5Var;
        return ax5Var;
    }

    @Override // defpackage.cz5
    public final float getDensity() {
        return this.E.getDensity().getDensity();
    }

    @Override // defpackage.cz5
    public final float k0() {
        return this.E.getDensity().k0();
    }
}
