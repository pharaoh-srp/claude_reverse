package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ivk extends zdk {
    private static final ivk zzb;
    private int zzd;
    private int zze = 0;
    private Object zzf;
    private itk zzg;
    private qtk zzh;

    static {
        ivk ivkVar = new ivk();
        zzb = ivkVar;
        zdk.f(ivk.class, ivkVar);
    }

    public static /* synthetic */ void p(ivk ivkVar, kwk kwkVar) {
        ivkVar.zzf = kwkVar;
        ivkVar.zze = 4;
    }

    public static dvk q() {
        return (dvk) zzb.k();
    }

    public static /* synthetic */ void r(ivk ivkVar, lqk lqkVar) {
        ivkVar.zzf = lqkVar;
        ivkVar.zze = 2;
    }

    public static /* synthetic */ void s(ivk ivkVar, irk irkVar) {
        ivkVar.zzf = irkVar;
        ivkVar.zze = 3;
    }

    public static /* synthetic */ void t(ivk ivkVar, dsk dskVar) {
        dskVar.getClass();
        ivkVar.zzf = dskVar;
        ivkVar.zze = 7;
    }

    public static /* synthetic */ void u(ivk ivkVar, itk itkVar) {
        itkVar.getClass();
        ivkVar.zzg = itkVar;
        ivkVar.zzd |= 1;
    }

    public static /* synthetic */ void v(ivk ivkVar, yvk yvkVar) {
        ivkVar.zzf = yvkVar;
        ivkVar.zze = 8;
    }

    @Override // defpackage.zdk
    public final Object j(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new glk(zzb, "\u0004\b\u0001\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဉ\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006ဉ\u0001\u0007<\u0000\b<\u0000", new Object[]{"zzf", "zze", "zzd", "zzg", lqk.class, irk.class, kwk.class, xsk.class, "zzh", dsk.class, yvk.class});
        }
        if (i2 == 3) {
            return new ivk();
        }
        if (i2 == 4) {
            return new dvk(zzb);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }
}
