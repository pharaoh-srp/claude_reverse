package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class yvk extends zdk {
    private static final yvk zzb;
    private int zzd;
    private wrk zze;
    private long zzf;

    static {
        yvk yvkVar = new yvk();
        zzb = yvkVar;
        zdk.f(yvk.class, yvkVar);
    }

    public static svk p() {
        return (svk) zzb.k();
    }

    public static /* synthetic */ void r(yvk yvkVar, wrk wrkVar) {
        yvkVar.zze = wrkVar;
        yvkVar.zzd |= 1;
    }

    public static /* synthetic */ void s(yvk yvkVar, long j) {
        yvkVar.zzd |= 2;
        yvkVar.zzf = j;
    }

    @Override // defpackage.zdk
    public final Object j(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new glk(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဂ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new yvk();
        }
        if (i2 == 4) {
            return new svk();
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }
}
