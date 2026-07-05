package defpackage;

import com.google.android.gms.internal.play_billing.zzgc;
import com.google.android.gms.internal.play_billing.zzia;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class lqk extends zdk {
    private static final lqk zzb;
    private int zzd;
    private int zze = 0;
    private Object zzf;
    private int zzg;
    private wrk zzh;
    private int zzi;

    static {
        lqk lqkVar = new lqk();
        zzb = lqkVar;
        zdk.f(lqk.class, lqkVar);
    }

    public static /* synthetic */ void p(lqk lqkVar, avk avkVar) {
        lqkVar.zzf = avkVar;
        lqkVar.zze = 7;
    }

    public static /* synthetic */ void q(lqk lqkVar, swk swkVar) {
        lqkVar.zzf = swkVar;
        lqkVar.zze = 6;
    }

    public static /* synthetic */ void r(lqk lqkVar, int i) {
        lqkVar.zzg = i - 1;
        lqkVar.zzd |= 1;
    }

    public static hqk s() {
        return (hqk) zzb.k();
    }

    public static lqk t(byte[] bArr) throws zzgc {
        zdk zdkVar = zzb;
        int length = bArr.length;
        eck eckVar = eck.a;
        int i = p8k.a;
        eck eckVar2 = eck.a;
        if (length != 0) {
            zdk zdkVarN = zdkVar.n();
            try {
                klk klkVarA = zkk.c.a(zdkVarN.getClass());
                klkVarA.g(zdkVarN, bArr, 0, length, new po0(eckVar2));
                klkVarA.b(zdkVarN);
                zdkVar = zdkVarN;
            } catch (zzgc e) {
                throw e;
            } catch (zzia e2) {
                poc.s(e2.getMessage());
                return null;
            } catch (IOException e3) {
                if (e3.getCause() instanceof zzgc) {
                    throw ((zzgc) e3.getCause());
                }
                throw new zzgc(e3.getMessage(), e3);
            } catch (IndexOutOfBoundsException unused) {
                poc.s("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                return null;
            }
        }
        if (zdkVar == null || zdk.i(zdkVar, true)) {
            return (lqk) zdkVar;
        }
        poc.s(new zzia().getMessage());
        return null;
    }

    public static void v(lqk lqkVar, isk iskVar) {
        lqkVar.zzi = iskVar.E;
        lqkVar.zzd |= 4;
    }

    public static /* synthetic */ void w(lqk lqkVar, wrk wrkVar) {
        lqkVar.zzh = wrkVar;
        lqkVar.zzd |= 2;
    }

    @Override // defpackage.zdk
    public final Object j(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new glk(zzb, "\u0004\u0006\u0001\u0001\u0001\u0007\u0006\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0004<\u0000\u0005᠌\u0002\u0006<\u0000\u0007<\u0000", new Object[]{"zzf", "zze", "zzd", "zzg", oqk.b, "zzh", buk.class, "zzi", oqk.d, swk.class, avk.class});
        }
        if (i2 == 3) {
            return new lqk();
        }
        if (i2 == 4) {
            return new hqk(zzb);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }

    public final avk u() {
        return this.zze == 7 ? (avk) this.zzf : avk.q();
    }
}
