package defpackage;

import android.graphics.Path;
import android.os.IInterface;
import android.os.Parcel;
import com.caverock.androidsvg.SVGParseException;
import com.google.android.gms.internal.play_billing.zzgc;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class poc implements zd7, gm4, d0g, lz7, bp9 {
    public final /* synthetic */ int E;

    public /* synthetic */ poc(int i) {
        this.E = i;
    }

    public static Integer b(IInterface iInterface) {
        qt8 qt8Var = (qt8) ((st8) iInterface);
        qt8Var.getClass();
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.health.platform.client.service.IHealthDataService");
            qt8Var.i.transact(1, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            int i = parcelObtain2.readInt();
            parcelObtain2.recycle();
            parcelObtain.recycle();
            return Integer.valueOf(i);
        } catch (Throwable th) {
            parcelObtain2.recycle();
            parcelObtain.recycle();
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void c(int i, int i2) {
        throw new ArrayIndexOutOfBoundsException("Failed writing " + ((char) i) + ((Object) " at index ") + i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void e(int i, long j) {
        throw new ArrayIndexOutOfBoundsException("Failed writing " + ((char) i) + ((Object) " at index ") + j);
    }

    public static /* synthetic */ void g(int i, Object obj, Object obj2, int i2) {
        StringBuilder sb = new StringBuilder();
        sb.append(obj);
        sb.append(obj2);
        sb.append(i);
        sb.append((Object) " parameters found ");
        sb.append(i2);
        throw new IllegalArgumentException(sb.toString());
    }

    public static /* synthetic */ void i(int i, Object obj, Object obj2, String str) {
        throw new IllegalStateException(str + i + obj + obj2);
    }

    public static /* synthetic */ void j(int i, StringBuilder sb) {
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    public static /* synthetic */ void k(Object obj, Object obj2, String str) throws GeneralSecurityException {
        throw new GeneralSecurityException(str + obj + obj2);
    }

    public static /* synthetic */ void l(String str) throws SVGParseException {
        throw new SVGParseException(str);
    }

    public static /* synthetic */ void m(String str, Object obj) throws GeneralSecurityException {
        throw new GeneralSecurityException(str + obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void n(String str, Object obj, Object obj2, int i, int i2) {
        throw new IllegalArgumentException((str + obj + obj2 + i + ((char) i2)).toString());
    }

    public static /* synthetic */ void o(String str, Object obj, Object obj2, Object obj3) {
        throw new IllegalArgumentException((str + obj + obj2 + obj3).toString());
    }

    public static /* synthetic */ void p(String str, Object obj, Throwable th) {
        throw new RuntimeException(str + obj, th);
    }

    public static /* synthetic */ void q(Throwable th) {
        throw new RuntimeRemoteException(th);
    }

    public static /* synthetic */ void r(int i, int i2) {
        throw new IllegalArgumentException("Length too large: " + i + i2);
    }

    public static /* synthetic */ void s(String str) throws zzgc {
        throw new zzgc(str);
    }

    public static /* synthetic */ void t(String str, Object obj) {
        throw new UnsupportedOperationException(str + obj);
    }

    @Override // defpackage.d0g
    public void a(w5b w5bVar, Path path, float f, float f2, float f3, float f4) {
        w5bVar.getClass();
        path.getClass();
        path.moveTo(f, f2);
        path.lineTo(f3, f2);
        path.lineTo(f3, f4);
        path.lineTo(f, f4);
        path.close();
    }

    @Override // defpackage.gm4
    public void accept(Object obj) {
        ((z3f) obj).b.getClass();
    }

    @Override // defpackage.lz7
    public Object apply(Object obj) {
        return Integer.valueOf(((v3i) obj).c);
    }

    @Override // defpackage.zd7
    public wd7[] d() {
        switch (this.E) {
            case 3:
                return new wd7[]{new pvd()};
            case 16:
                frh frhVar = new frh(0L);
                iz8 iz8Var = nz8.F;
                return new wd7[]{new p8i(1, bxg.q, frhVar, new ig2(vde.I))};
            default:
                return new wd7[]{new l6j()};
        }
    }

    @Override // defpackage.bp9
    public ybi h(jud judVar) throws GeneralSecurityException {
        wg wgVar;
        if (!((String) judVar.b).equals("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key")) {
            sz6.p("Wrong type URL in call to XChaCha20Poly1305Parameters.parseParameters");
            return null;
        }
        try {
            uij uijVarB = uij.B((k22) judVar.d, mc7.a());
            if (uijVarB.z() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            bmc bmcVar = (bmc) judVar.f;
            int iOrdinal = bmcVar.ordinal();
            if (iOrdinal == 1) {
                wgVar = wg.X;
            } else if (iOrdinal == 2) {
                wgVar = wg.Y;
            } else if (iOrdinal == 3) {
                wgVar = wg.Z;
            } else {
                if (iOrdinal != 4) {
                    throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + bmcVar.b());
                }
                wgVar = wg.Y;
            }
            return vij.v(wgVar, new xzd(9, n22.a(uijVarB.y().h())), (Integer) judVar.g);
        } catch (InvalidProtocolBufferException unused) {
            rl7.j("Parsing XChaCha20Poly1305Key failed");
            return null;
        }
    }
}
