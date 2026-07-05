package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class irk extends zdk {
    private static final irk zzb;
    private int zzd;
    private int zze = 0;
    private Object zzf;
    private int zzg;
    private int zzh;

    static {
        irk irkVar = new irk();
        zzb = irkVar;
        zdk.f(irk.class, irkVar);
    }

    public static /* synthetic */ void p(irk irkVar, int i) {
        irkVar.zzg = i - 1;
        irkVar.zzd |= 1;
    }

    public static qqk q() {
        return (qqk) zzb.k();
    }

    public static void t(irk irkVar, isk iskVar) {
        irkVar.zzh = iskVar.E;
        irkVar.zzd |= 2;
    }

    public static /* synthetic */ void u(irk irkVar, avk avkVar) {
        irkVar.zzf = avkVar;
        irkVar.zze = 4;
    }

    public static /* synthetic */ void v(irk irkVar, swk swkVar) {
        irkVar.zzf = swkVar;
        irkVar.zze = 3;
    }

    @Override // defpackage.zdk
    public final Object j(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new glk(zzb, "\u0004\u0005\u0001\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001᠌\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005᠌\u0001", new Object[]{"zzf", "zze", "zzd", "zzg", oqk.b, buk.class, swk.class, avk.class, "zzh", oqk.d});
        }
        if (i2 == 3) {
            return new irk();
        }
        if (i2 == 4) {
            return new qqk();
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }

    public final avk s() {
        return this.zze == 4 ? (avk) this.zzf : avk.q();
    }
}
