package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class swk extends zdk {
    private static final swk zzb;
    private int zzd;
    private int zze;
    private boolean zzf;
    private long zzg;
    private boolean zzh;
    private int zzi;
    private int zzj;

    static {
        swk swkVar = new swk();
        zzb = swkVar;
        zdk.f(swk.class, swkVar);
    }

    public static owk p() {
        return (owk) zzb.k();
    }

    public static /* synthetic */ void q(swk swkVar, boolean z) {
        swkVar.zzd |= 8;
        swkVar.zzh = z;
    }

    public static /* synthetic */ void r(swk swkVar, int i) {
        swkVar.zzd |= 16;
        swkVar.zzi = i;
    }

    public static /* synthetic */ void s(swk swkVar, long j) {
        swkVar.zzd |= 4;
        swkVar.zzg = j;
    }

    public static /* synthetic */ void t(swk swkVar) {
        swkVar.zzd |= 32;
        swkVar.zzj = 0;
    }

    public static /* synthetic */ void u(swk swkVar) {
        swkVar.zzd |= 2;
        swkVar.zzf = true;
    }

    @Override // defpackage.zdk
    public final Object j(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new glk(zzb, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001င\u0000\u0002ဇ\u0001\u0003ဂ\u0002\u0004ဇ\u0003\u0005င\u0004\u0006င\u0005", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        }
        if (i2 == 3) {
            return new swk();
        }
        if (i2 == 4) {
            return new owk(zzb);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }
}
