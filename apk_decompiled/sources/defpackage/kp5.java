package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class kp5 extends ts9 implements zy7 {
    public final /* synthetic */ int F;
    public final /* synthetic */ mp5 G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kp5(mp5 mp5Var, int i) {
        super(0);
        this.F = i;
        this.G = mp5Var;
    }

    @Override // defpackage.zy7
    public final Object a() {
        int i = this.F;
        mp5 mp5Var = this.G;
        switch (i) {
            case 0:
                boolean zI0 = bsg.I0(mp5Var.g());
                String str = mp5Var.L;
                return (zI0 || bsg.u0(str, mp5Var.g(), false)) ? str : ij0.C(mp5Var.g(), " ", str);
            default:
                return (String) w44.L0(bsg.X0(mp5Var.O, new char[]{'.'}, 6));
        }
    }
}
