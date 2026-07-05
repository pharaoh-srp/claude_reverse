package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class buk extends zdk {
    private static final buk zzb;
    private int zzd;
    private int zze;

    static {
        buk bukVar = new buk();
        zzb = bukVar;
        zdk.f(buk.class, bukVar);
    }

    @Override // defpackage.zdk
    public final Object j(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new glk(zzb, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"zzd", "zze", x7k.d});
        }
        if (i2 == 3) {
            return new buk();
        }
        int i3 = 5;
        if (i2 == 4) {
            return new n5k(i3);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }
}
