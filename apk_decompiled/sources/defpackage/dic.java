package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class dic extends ln7 {
    public static final dic d = new dic(0, 2, 1);

    @Override // defpackage.ln7
    public final void c(gjc gjcVar, hn0 hn0Var, vag vagVar, p60 p60Var, fjc fjcVar) {
        int i;
        d79 d79Var = (d79) gjcVar.b(0);
        int iC = vagVar.c((y08) gjcVar.b(1));
        if (vagVar.t >= iC) {
            pd4.a("Check failed");
        }
        wvk.l(vagVar, hn0Var, iC);
        int i2 = vagVar.t;
        int iE = vagVar.v;
        while (iE >= 0 && !vagVar.y(iE)) {
            iE = vagVar.E(iE, vagVar.b);
        }
        int iU = iE + 1;
        int iL = 0;
        while (iU < i2) {
            if (vagVar.v(i2, iU)) {
                if (vagVar.y(iU)) {
                    iL = 0;
                }
                iU++;
            } else {
                iL += vagVar.y(iU) ? 1 : vagVar.b[(vagVar.r(iU) * 5) + 1] & 67108863;
                iU += vagVar.u(iU);
            }
        }
        while (true) {
            i = vagVar.t;
            if (i >= iC) {
                break;
            }
            if (vagVar.v(iC, i)) {
                int i3 = vagVar.t;
                if (i3 < vagVar.u && (vagVar.b[(vagVar.r(i3) * 5) + 1] & 1073741824) != 0) {
                    hn0Var.b(vagVar.D(vagVar.t));
                    iL = 0;
                }
                vagVar.P();
            } else {
                iL += vagVar.L();
            }
        }
        if (i != iC) {
            pd4.a("Check failed");
        }
        d79Var.a = iL;
    }
}
