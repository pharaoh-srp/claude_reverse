package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class pvk extends zdk {
    private static final pvk zzb;
    private int zzd;
    private int zzf;
    private xek zze = clk.e();
    private String zzg = "";

    static {
        pvk pvkVar = new pvk();
        zzb = pvkVar;
        zdk.f(pvk.class, pvkVar);
    }

    @Override // defpackage.zdk
    public final Object j(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new glk(zzb, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001a\u0002င\u0000\u0003ဈ\u0001", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new pvk();
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
