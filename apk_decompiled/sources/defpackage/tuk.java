package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class tuk extends zdk {
    private static final tuk zzb;
    private int zzd;
    private int zze;
    private String zzf = "";

    static {
        tuk tukVar = new tuk();
        zzb = tukVar;
        zdk.f(tuk.class, tukVar);
    }

    @Override // defpackage.zdk
    public final Object j(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new glk(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001", new Object[]{"zzd", "zze", x7k.e, "zzf"});
        }
        if (i2 == 3) {
            return new tuk();
        }
        if (i2 == 4) {
            return new n5k(zzb);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }
}
