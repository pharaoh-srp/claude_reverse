package defpackage;

import androidx.health.platform.client.proto.g;
import com.agog.mathdisplay.parse.MathDisplayException;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.squareup.moshi.JsonDataException;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import kotlin.reflect.jvm.internal.KotlinReflectionInternalError;
import siftscience.android.BuildConfig;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class rl7 implements cec, zd7, lz7, txd, smi, jfd, bp9, yz7, k5g, gm4, r6b, j5i {
    public final /* synthetic */ int E;

    public static /* synthetic */ void i(int i, int i2) {
        throw new IndexOutOfBoundsException("position=" + i + ((Object) ", limit=") + i2);
    }

    public static /* synthetic */ void j(String str) throws GeneralSecurityException {
        throw new GeneralSecurityException(str);
    }

    public static /* synthetic */ void k(String str, Object obj) {
        throw new KotlinReflectionInternalError(str + obj);
    }

    public static /* synthetic */ void l(String str, Object obj, Object obj2, Object obj3) {
        throw new JsonDataException(str + obj + obj2 + obj3);
    }

    public static /* synthetic */ void m(StringBuilder sb, Object obj, Object obj2) {
        sb.append(obj);
        sb.append(obj2);
        throw new JsonDataException(sb.toString());
    }

    public static /* synthetic */ void n(String str, Object obj) {
        throw new KotlinReflectionInternalError(str + obj);
    }

    public static /* synthetic */ void o(String str, Object obj) throws MathDisplayException {
        throw new MathDisplayException(str + obj);
    }

    @Override // defpackage.smi
    public Set a() {
        return um6.E;
    }

    @Override // defpackage.gm4
    public void accept(Object obj) {
        ((ExecutorService) obj).shutdown();
    }

    @Override // defpackage.lz7
    public Object apply(Object obj) {
        StringBuilder sb;
        switch (this.E) {
            case 3:
                rs9 rs9Var = (rs9) obj;
                return rs9Var.a + ": " + rs9Var.b;
            case 4:
                return (o3i) obj;
            case 9:
                dpc dpcVar = (dpc) obj;
                CharSequence charSequence = (CharSequence) dpcVar.b;
                if (charSequence == null) {
                    return ks8.d;
                }
                CharSequence charSequence2 = (CharSequence) dpcVar.a;
                if (charSequence2 == null) {
                    sb = new StringBuilder(charSequence.length());
                } else {
                    StringBuilder sb2 = new StringBuilder(charSequence2.length() + charSequence.length() + 1);
                    sb2.append(charSequence2);
                    for (int i = 0; i < sb2.length(); i++) {
                        sb2.setCharAt(i, Character.toUpperCase(sb2.charAt(i)));
                    }
                    sb2.append(' ');
                    sb = sb2;
                }
                int length = charSequence.length() - 1;
                if (ks8.h == null) {
                    ks8.h = new ks8();
                }
                if (ks8.h.c && length > 0 && charSequence.charAt(length) == '/') {
                    sb.append(charSequence, 0, length);
                } else {
                    sb.append(charSequence);
                }
                return adi.a(sb);
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return Long.valueOf(((hd5) obj).b);
            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return Long.valueOf(((hd5) obj).c);
            case 24:
                return nz8.q(ywj.l(((s7b) obj).m().b, new poc(15)));
            case BuildConfig.VERSION_CODE /* 25 */:
                djb djbVar = (djb) obj;
                djbVar.getClass();
                lrb lrbVar = eud.a;
                lrbVar.getClass();
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    lrbVar.t(djbVar, byteArrayOutputStream);
                    break;
                } catch (IOException unused) {
                }
                return byteArrayOutputStream.toByteArray();
            default:
                return (o3i) obj;
        }
    }

    @Override // defpackage.k5g
    public boolean b() {
        return false;
    }

    @Override // defpackage.jfd
    public Object c(ybi ybiVar) throws GeneralSecurityException {
        xf3 xf3Var = new xf3();
        if (gid.b(2)) {
            return xf3Var;
        }
        j("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
        return null;
    }

    @Override // defpackage.zd7
    public wd7[] d() {
        switch (this.E) {
            case 1:
                return new wd7[]{new wm7()};
            case 2:
                return new wd7[]{new tr7()};
            case 28:
                return new wd7[]{new zsb(bxg.q, 16)};
            default:
                return new wd7[]{new tcc()};
        }
    }

    @Override // defpackage.r6b
    public int e(Object obj) {
        String str = ((g6b) obj).a;
        return (str.startsWith("OMX.google") || str.startsWith("c2.android")) ? 1 : 0;
    }

    @Override // defpackage.txd
    public void g(hp1 hp1Var, List list) {
        hp1Var.getClass();
    }

    @Override // defpackage.bp9
    public ybi h(jud judVar) throws GeneralSecurityException {
        if (!((String) judVar.b).equals("type.googleapis.com/google.crypto.tink.HmacKey")) {
            sz6.p("Wrong type URL in call to HmacProtoSerialization.parseKey");
            return null;
        }
        try {
            fn8 fn8VarE = fn8.E((k22) judVar.d, mc7.a());
            if (fn8VarE.C() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            c61 c61Var = new c61(12, false);
            c61Var.F = null;
            c61Var.G = null;
            c61Var.H = null;
            c61Var.I = wg.W;
            c61Var.F = Integer.valueOf(fn8VarE.A().size());
            c61Var.G = Integer.valueOf(fn8VarE.B().A());
            c61Var.H = mn8.a(fn8VarE.B().z());
            c61Var.I = mn8.b((bmc) judVar.f);
            jn8 jn8VarI = c61Var.i();
            xv8 xv8Var = new xv8(22);
            xv8Var.G = null;
            xv8Var.H = null;
            xv8Var.F = jn8VarI;
            xv8Var.G = new xzd(9, n22.a(fn8VarE.A().h()));
            xv8Var.H = (Integer) judVar.g;
            return xv8Var.h();
        } catch (InvalidProtocolBufferException | IllegalArgumentException unused) {
            j("Parsing HmacKey failed");
            return null;
        }
    }

    @Override // defpackage.cec
    public void onFailure(Exception exc) {
        List list = xah.a;
        xah.e(6, "FCM deleteToken failed: " + exc.getMessage(), null, null);
    }

    public /* synthetic */ rl7(int i) {
        this.E = i;
    }
}
