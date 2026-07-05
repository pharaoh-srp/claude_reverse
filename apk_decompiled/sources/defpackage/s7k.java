package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class s7k extends zdk {
    private static final s7k zzb;
    private int zzd;
    private String zze = "";

    static {
        s7k s7kVar = new s7k();
        zzb = s7kVar;
        zdk.f(s7k.class, s7kVar);
    }

    @Override // defpackage.zdk
    public final Object j(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new glk(zzb, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"zzd", "zze"});
        }
        if (i2 == 3) {
            return new s7k();
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
