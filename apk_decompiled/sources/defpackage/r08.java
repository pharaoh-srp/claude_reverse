package defpackage;

/* JADX INFO: loaded from: classes.dex */
public interface r08 extends kp7 {
    static /* synthetic */ kp7 c(r08 r08Var, c45 c45Var, int i, py1 py1Var, int i2) {
        if ((i2 & 1) != 0) {
            c45Var = im6.E;
        }
        if ((i2 & 2) != 0) {
            i = -3;
        }
        if ((i2 & 4) != 0) {
            py1Var = py1.E;
        }
        return r08Var.b(c45Var, i, py1Var);
    }

    kp7 b(c45 c45Var, int i, py1 py1Var);
}
