package defpackage;

import java.io.IOException;
import java.io.Serializable;
import okio.RealBufferedSource;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class vm5 implements pz7 {
    public final /* synthetic */ int E = 0;
    public final /* synthetic */ long F;
    public final /* synthetic */ Serializable G;
    public final /* synthetic */ Object H;
    public final /* synthetic */ Object I;
    public final /* synthetic */ Object J;
    public final /* synthetic */ Object K;
    public final /* synthetic */ Object L;
    public final /* synthetic */ Object M;
    public final /* synthetic */ Object N;

    public /* synthetic */ vm5(z9e z9eVar, long j, cae caeVar, RealBufferedSource realBufferedSource, cae caeVar2, cae caeVar3, dae daeVar, dae daeVar2, dae daeVar3) {
        this.G = z9eVar;
        this.F = j;
        this.H = caeVar;
        this.I = realBufferedSource;
        this.J = caeVar2;
        this.K = caeVar3;
        this.L = daeVar;
        this.M = daeVar2;
        this.N = daeVar3;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) throws IOException {
        int i = this.E;
        iei ieiVar = iei.a;
        Object obj3 = this.N;
        Object obj4 = this.M;
        Object obj5 = this.L;
        Object obj6 = this.K;
        Object obj7 = this.J;
        Object obj8 = this.I;
        Object obj9 = this.H;
        Serializable serializable = this.G;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                cn5.c((Long) serializable, this.F, (bz7) obj9, (bz7) obj8, (o72) obj7, (b79) obj6, (am5) obj5, (xl5) obj4, (wl5) obj3, (ld4) obj, x44.p0(1));
                break;
            default:
                z9e z9eVar = (z9e) serializable;
                cae caeVar = (cae) obj9;
                RealBufferedSource realBufferedSource = (RealBufferedSource) obj8;
                cae caeVar2 = (cae) obj7;
                cae caeVar3 = (cae) obj6;
                dae daeVar = (dae) obj5;
                dae daeVar2 = (dae) obj4;
                dae daeVar3 = (dae) obj3;
                int iIntValue = ((Integer) obj).intValue();
                long jLongValue = ((Long) obj2).longValue();
                if (iIntValue == 1) {
                    if (z9eVar.E) {
                        xh6.c("bad zip: zip64 extra repeated");
                    } else {
                        z9eVar.E = true;
                        if (jLongValue >= this.F) {
                            long jC0 = caeVar.E;
                            if (jC0 == 4294967295L) {
                                jC0 = realBufferedSource.C0();
                            }
                            caeVar.E = jC0;
                            caeVar2.E = caeVar2.E == 4294967295L ? realBufferedSource.C0() : 0L;
                            caeVar3.E = caeVar3.E == 4294967295L ? realBufferedSource.C0() : 0L;
                        } else {
                            xh6.c("bad zip: zip64 extra too short");
                        }
                    }
                    break;
                } else if (iIntValue == 10) {
                    if (jLongValue >= 4) {
                        realBufferedSource.skip(4L);
                        ujj.e(realBufferedSource, (int) (jLongValue - 4), new tjj(daeVar, realBufferedSource, daeVar2, daeVar3));
                    } else {
                        xh6.c("bad zip: NTFS extra too short");
                    }
                    break;
                }
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ vm5(Long l, long j, bz7 bz7Var, bz7 bz7Var2, o72 o72Var, b79 b79Var, am5 am5Var, xl5 xl5Var, wl5 wl5Var, int i) {
        this.G = l;
        this.F = j;
        this.H = bz7Var;
        this.I = bz7Var2;
        this.J = o72Var;
        this.K = b79Var;
        this.L = am5Var;
        this.M = xl5Var;
        this.N = wl5Var;
    }
}
