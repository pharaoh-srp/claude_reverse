package defpackage;

import java.io.IOException;
import okio.RealBufferedSource;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class tjj implements pz7 {
    public final /* synthetic */ int E = 1;
    public final /* synthetic */ dae F;
    public final /* synthetic */ RealBufferedSource G;
    public final /* synthetic */ dae H;
    public final /* synthetic */ dae I;

    public /* synthetic */ tjj(dae daeVar, RealBufferedSource realBufferedSource, dae daeVar2, dae daeVar3) {
        this.F = daeVar;
        this.G = realBufferedSource;
        this.H = daeVar2;
        this.I = daeVar3;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) throws IOException {
        int i = this.E;
        iei ieiVar = iei.a;
        dae daeVar = this.I;
        dae daeVar2 = this.H;
        RealBufferedSource realBufferedSource = this.G;
        dae daeVar3 = this.F;
        switch (i) {
            case 0:
                int iIntValue = ((Integer) obj).intValue();
                long jLongValue = ((Long) obj2).longValue();
                if (iIntValue == 21589) {
                    if (jLongValue >= 1) {
                        byte b = realBufferedSource.readByte();
                        boolean z = (b & 1) == 1;
                        boolean z2 = (b & 2) == 2;
                        boolean z3 = (b & 4) == 4;
                        long j = z ? 5L : 1L;
                        if (z2) {
                            j += 4;
                        }
                        if (z3) {
                            j += 4;
                        }
                        if (jLongValue >= j) {
                            if (z) {
                                daeVar3.E = Integer.valueOf(realBufferedSource.q0());
                            }
                            if (z2) {
                                daeVar2.E = Integer.valueOf(realBufferedSource.q0());
                            }
                            if (z3) {
                                daeVar.E = Integer.valueOf(realBufferedSource.q0());
                            }
                        } else {
                            xh6.c("bad zip: extended timestamp extra too short");
                        }
                    } else {
                        xh6.c("bad zip: extended timestamp extra too short");
                    }
                }
                break;
            default:
                int iIntValue2 = ((Integer) obj).intValue();
                long jLongValue2 = ((Long) obj2).longValue();
                if (iIntValue2 == 1) {
                    if (daeVar3.E != null) {
                        xh6.c("bad zip: NTFS extra attribute tag 0x0001 repeated");
                    } else if (jLongValue2 == 24) {
                        daeVar3.E = Long.valueOf(realBufferedSource.C0());
                        daeVar2.E = Long.valueOf(realBufferedSource.C0());
                        daeVar.E = Long.valueOf(realBufferedSource.C0());
                    } else {
                        xh6.c("bad zip: NTFS extra attribute tag 0x0001 size != 24");
                    }
                }
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ tjj(RealBufferedSource realBufferedSource, dae daeVar, dae daeVar2, dae daeVar3) {
        this.G = realBufferedSource;
        this.F = daeVar;
        this.H = daeVar2;
        this.I = daeVar3;
    }
}
