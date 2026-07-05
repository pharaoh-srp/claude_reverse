package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class guj implements Runnable {
    public final /* synthetic */ int E;
    public final /* synthetic */ String F;
    public final /* synthetic */ long G;
    public final /* synthetic */ xoj H;

    public /* synthetic */ guj(xoj xojVar, String str, long j, int i) {
        this.E = i;
        this.F = str;
        this.G = j;
        this.H = xojVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.E;
        long j = this.G;
        String str = this.F;
        xoj xojVar = this.H;
        switch (i) {
            case 0:
                xojVar.K0();
                bp0 bp0Var = xojVar.F;
                dgj.s(str);
                bp0 bp0Var2 = xojVar.G;
                Integer num = (Integer) bp0Var2.get(str);
                if (num == null) {
                    xojVar.b0().J.c("Call to endAdUnitExposure for unknown ad unit id", str);
                } else {
                    xxk xxkVarS0 = xojVar.M0().S0(false);
                    int iIntValue = num.intValue() - 1;
                    if (iIntValue != 0) {
                        bp0Var2.put(str, Integer.valueOf(iIntValue));
                    } else {
                        bp0Var2.remove(str);
                        Long l = (Long) bp0Var.get(str);
                        if (l == null) {
                            xojVar.b0().J.b("First ad unit exposure time was never set");
                        } else {
                            long jLongValue = j - l.longValue();
                            bp0Var.remove(str);
                            xojVar.R0(str, jLongValue, xxkVarS0);
                        }
                        if (bp0Var2.isEmpty()) {
                            long j2 = xojVar.H;
                            if (j2 != 0) {
                                xojVar.Q0(j - j2, xxkVarS0);
                                xojVar.H = 0L;
                            } else {
                                xojVar.b0().J.b("First ad exposure time was never set");
                            }
                        }
                    }
                }
                break;
            default:
                xojVar.K0();
                dgj.s(str);
                bp0 bp0Var3 = xojVar.G;
                if (bp0Var3.isEmpty()) {
                    xojVar.H = j;
                }
                Integer num2 = (Integer) bp0Var3.get(str);
                if (num2 != null) {
                    bp0Var3.put(str, Integer.valueOf(num2.intValue() + 1));
                } else if (bp0Var3.G < 100) {
                    bp0Var3.put(str, 1);
                    xojVar.F.put(str, Long.valueOf(j));
                } else {
                    xojVar.b0().M.b("Too many ads visible");
                }
                break;
        }
    }
}
