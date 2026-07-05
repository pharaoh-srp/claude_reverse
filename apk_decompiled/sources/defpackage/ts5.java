package defpackage;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes2.dex */
public final class ts5 implements vef {
    public final /* synthetic */ us5 a;

    public ts5(us5 us5Var) {
        this.a = us5Var;
    }

    @Override // defpackage.vef
    public final boolean b() {
        return true;
    }

    @Override // defpackage.vef
    public final uef e(long j) {
        us5 us5Var = this.a;
        long j2 = (((long) us5Var.H.i) * j) / 1000000;
        long j3 = us5Var.F;
        BigInteger bigIntegerValueOf = BigInteger.valueOf(j2);
        long j4 = us5Var.G;
        xef xefVar = new xef(j, tpi.h((bigIntegerValueOf.multiply(BigInteger.valueOf(j4 - j3)).divide(BigInteger.valueOf(us5Var.J)).longValue() + j3) - 30000, us5Var.F, j4 - 1));
        return new uef(xefVar, xefVar);
    }

    @Override // defpackage.vef
    public final long g() {
        us5 us5Var = this.a;
        return (us5Var.J * 1000000) / ((long) us5Var.H.i);
    }
}
