package defpackage;

import android.os.Build;
import com.pvporbit.freetype.FreeTypeConstants;

/* JADX INFO: loaded from: classes.dex */
public final class itk extends zdk {
    private static final itk zzb;
    private int zzd;
    private int zzh;
    private long zzi;
    private long zzj;
    private boolean zzk;
    private int zzl;
    private int zzm;
    private long zzn;
    private int zzs;
    private String zze = "";
    private String zzf = "";
    private String zzg = "";
    private String zzo = "";
    private String zzp = "";
    private String zzq = "";
    private String zzr = "";

    static {
        itk itkVar = new itk();
        zzb = itkVar;
        zdk.f(itk.class, itkVar);
    }

    public static /* synthetic */ void A(itk itkVar, int i) {
        itkVar.zzd |= FreeTypeConstants.FT_LOAD_PEDANTIC;
        itkVar.zzl = i;
    }

    public static /* synthetic */ void B(itk itkVar, int i) {
        itkVar.zzd |= FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING;
        itkVar.zzm = i;
    }

    public static /* synthetic */ void C(itk itkVar, int i) {
        itkVar.zzd |= 8;
        itkVar.zzh = i;
    }

    public static /* synthetic */ void D(itk itkVar, long j) {
        itkVar.zzd |= 16;
        itkVar.zzi = j;
    }

    public static /* synthetic */ void E(itk itkVar, long j) {
        itkVar.zzd |= 32;
        itkVar.zzj = j;
    }

    public static /* synthetic */ void p(itk itkVar) {
        itkVar.zzd |= 512;
        itkVar.zzn = 846465066L;
    }

    public static /* synthetic */ void q(itk itkVar, String str) {
        str.getClass();
        itkVar.zzd |= 4;
        itkVar.zzg = str;
    }

    public static /* synthetic */ void r(itk itkVar) {
        String str = Build.BRAND;
        str.getClass();
        itkVar.zzd |= FreeTypeConstants.FT_LOAD_NO_RECURSE;
        itkVar.zzo = str;
    }

    public static /* synthetic */ void s(itk itkVar) {
        String str = Build.FINGERPRINT;
        str.getClass();
        itkVar.zzd |= FreeTypeConstants.FT_LOAD_LINEAR_DESIGN;
        itkVar.zzr = str;
    }

    public static /* synthetic */ void t(itk itkVar) {
        String str = Build.MANUFACTURER;
        str.getClass();
        itkVar.zzd |= FreeTypeConstants.FT_LOAD_MONOCHROME;
        itkVar.zzq = str;
    }

    public static /* synthetic */ void u(itk itkVar) {
        String str = Build.MODEL;
        str.getClass();
        itkVar.zzd |= FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM;
        itkVar.zzp = str;
    }

    public static /* synthetic */ void v(itk itkVar, int i) {
        itkVar.zzd |= 16384;
        itkVar.zzs = i;
    }

    public static /* synthetic */ void w(itk itkVar, boolean z) {
        itkVar.zzd |= 64;
        itkVar.zzk = z;
    }

    public static /* synthetic */ void x(itk itkVar) {
        itkVar.zzd |= 1;
        itkVar.zze = "8.3.0";
    }

    public static /* synthetic */ void y(itk itkVar, String str) {
        itkVar.zzd |= 2;
        itkVar.zzf = str;
    }

    public static atk z() {
        return (atk) zzb.k();
    }

    @Override // defpackage.zdk
    public final Object j(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new glk(zzb, "\u0004\u000f\u0000\u0001\u0001\u000f\u000f\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0002\u0003င\u0003\u0004ဂ\u0004\u0005ဈ\u0001\u0006ဂ\u0005\u0007ဇ\u0006\bင\u0007\tင\b\nဂ\t\u000bဈ\n\fဈ\u000b\rဈ\f\u000eဈ\r\u000fင\u000e", new Object[]{"zzd", "zze", "zzg", "zzh", "zzi", "zzf", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzq", "zzr", "zzs"});
        }
        if (i2 == 3) {
            return new itk();
        }
        if (i2 == 4) {
            return new atk(zzb);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }
}
