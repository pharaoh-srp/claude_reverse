package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class avk extends zdk {
    private static final avk zzb;
    private int zzd;
    private xek zze = clk.e();
    private String zzf = "";
    private boolean zzg;

    static {
        avk avkVar = new avk();
        zzb = avkVar;
        zdk.f(avk.class, avkVar);
    }

    public static avk q() {
        return zzb;
    }

    public static /* synthetic */ void r(avk avkVar, boolean z) {
        avkVar.zzd |= 2;
        avkVar.zzg = z;
    }

    @Override // defpackage.zdk
    public final Object j(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new glk(zzb, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000\u0003ဇ\u0001", new Object[]{"zzd", "zze", tuk.class, "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new avk();
        }
        if (i2 == 4) {
            return new guk();
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }
}
