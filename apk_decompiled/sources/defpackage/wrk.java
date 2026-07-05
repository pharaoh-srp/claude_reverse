package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class wrk extends zdk {
    private static final wrk zzb;
    private int zzd;
    private int zze;
    private int zzg;
    private int zzi;
    private int zzj;
    private String zzf = "";
    private String zzh = "";

    static {
        wrk wrkVar = new wrk();
        zzb = wrkVar;
        zdk.f(wrk.class, wrkVar);
    }

    public static /* synthetic */ void p(wrk wrkVar, int i) {
        wrkVar.zzd |= 1;
        wrkVar.zze = i;
    }

    public static lrk q() {
        return (lrk) zzb.k();
    }

    public static /* synthetic */ void r(wrk wrkVar, String str) {
        wrkVar.zzd |= 8;
        wrkVar.zzh = str;
    }

    public static /* synthetic */ void s(wrk wrkVar, String str) {
        str.getClass();
        wrkVar.zzd |= 2;
        wrkVar.zzf = str;
    }

    public static /* synthetic */ void t(wrk wrkVar) {
        wrkVar.zzd |= 32;
        wrkVar.zzj = 0;
    }

    public static /* synthetic */ void u(wrk wrkVar, int i) {
        wrkVar.zzd |= 16;
        wrkVar.zzi = i;
    }

    public static void v(wrk wrkVar, int i) {
        wrkVar.zzg = gkk.b(i);
        wrkVar.zzd |= 4;
    }

    @Override // defpackage.zdk
    public final Object j(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new glk(zzb, "\u0004\u0006\u0000\u0001\u0001\b\u0006\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0004᠌\u0002\u0005ဈ\u0003\u0007င\u0004\bင\u0005", new Object[]{"zzd", "zze", "zzf", "zzg", oqk.c, "zzh", "zzi", "zzj"});
        }
        if (i2 == 3) {
            return new wrk();
        }
        if (i2 == 4) {
            return new lrk(zzb);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }
}
