package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class xsk extends zdk {
    private static final xsk zzb;
    private int zzd;
    private int zzf;
    private wrk zzi;
    private boolean zzj;
    private boolean zzk;
    private String zze = "";
    private tek zzg = dek.g();
    private xek zzh = clk.e();

    static {
        xsk xskVar = new xsk();
        zzb = xskVar;
        zdk.f(xsk.class, xskVar);
    }

    @Override // defpackage.zdk
    public final Object j(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new glk(zzb, "\u0004\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0002\u0000\u0001ဈ\u0000\u0002᠌\u0001\u0003ࠬ\u0004\u001b\u0005ဉ\u0002\u0006ဇ\u0003\u0007ဇ\u0004", new Object[]{"zzd", "zze", "zzf", x7k.c, "zzg", oqk.d, "zzh", pvk.class, "zzi", "zzj", "zzk"});
        }
        int i3 = 3;
        if (i2 == 3) {
            return new xsk();
        }
        if (i2 == 4) {
            return new n5k(i3);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }
}
