package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class s5k extends zdk {
    private static final s5k zzb;
    private int zzd;
    private s7k zze;
    private s7k zzf;
    private int zzg;

    static {
        s5k s5kVar = new s5k();
        zzb = s5kVar;
        zdk.f(s5k.class, s5kVar);
    }

    @Override // defpackage.zdk
    public final Object j(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new glk(zzb, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003᠌\u0002", new Object[]{"zzd", "zze", "zzf", "zzg", x7k.b});
        }
        if (i2 == 3) {
            return new s5k();
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
