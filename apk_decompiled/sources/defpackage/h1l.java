package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.content.pm.Signature;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.text.TextUtils;
import com.pvporbit.freetype.FreeTypeConstants;
import java.io.ByteArrayInputStream;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.Random;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicLong;
import javax.security.auth.x500.X500Principal;

/* JADX INFO: loaded from: classes.dex */
public final class h1l extends pqk {
    public static final String[] M = {"firebase_", "google_", "ga_"};
    public static final String[] N = {"_err"};
    public SecureRandom G;
    public final AtomicLong H;
    public int I;
    public u5b J;
    public Boolean K;
    public Integer L;

    public h1l(umk umkVar) {
        super(umkVar);
        this.L = null;
        this.H = new AtomicLong(0L);
    }

    public static byte[] A1(Parcelable parcelable) {
        if (parcelable == null) {
            return null;
        }
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelable.writeToParcel(parcelObtain, 0);
            return parcelObtain.marshall();
        } finally {
            parcelObtain.recycle();
        }
    }

    public static boolean C1(Context context) {
        ServiceInfo serviceInfo;
        dgj.v(context);
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null && (serviceInfo = packageManager.getServiceInfo(new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementJobService"), 0)) != null) {
                if (serviceInfo.enabled) {
                    return true;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return false;
    }

    public static ArrayList F1(List list) {
        if (list == null) {
            return new ArrayList(0);
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            kqj kqjVar = (kqj) it.next();
            Bundle bundle = new Bundle();
            bundle.putString("app_id", kqjVar.E);
            bundle.putString("origin", kqjVar.F);
            bundle.putLong("creation_timestamp", kqjVar.H);
            bundle.putString("name", kqjVar.G.F);
            Object objZza = kqjVar.G.zza();
            dgj.v(objZza);
            ask.o(bundle, objZza);
            bundle.putBoolean("active", kqjVar.I);
            String str = kqjVar.J;
            if (str != null) {
                bundle.putString("trigger_event_name", str);
            }
            rvj rvjVar = kqjVar.K;
            if (rvjVar != null) {
                bundle.putString("timed_out_event_name", rvjVar.E);
                avj avjVar = rvjVar.F;
                if (avjVar != null) {
                    bundle.putBundle("timed_out_event_params", avjVar.x0());
                }
            }
            bundle.putLong("trigger_timeout", kqjVar.L);
            rvj rvjVar2 = kqjVar.M;
            if (rvjVar2 != null) {
                bundle.putString("triggered_event_name", rvjVar2.E);
                avj avjVar2 = rvjVar2.F;
                if (avjVar2 != null) {
                    bundle.putBundle("triggered_event_params", avjVar2.x0());
                }
            }
            bundle.putLong("triggered_timestamp", kqjVar.G.G);
            bundle.putLong("time_to_live", kqjVar.N);
            rvj rvjVar3 = kqjVar.O;
            if (rvjVar3 != null) {
                bundle.putString("expired_event_name", rvjVar3.E);
                avj avjVar3 = rvjVar3.F;
                if (avjVar3 != null) {
                    bundle.putBundle("expired_event_params", avjVar3.x0());
                }
            }
            arrayList.add(bundle);
        }
        return arrayList;
    }

    public static boolean G1(int i, Bundle bundle) {
        if (bundle == null || bundle.getLong("_err") != 0) {
            return false;
        }
        bundle.putLong("_err", i);
        return true;
    }

    public static boolean N1(String str) {
        String str2 = (String) zvj.x0.a(null);
        return str2.equals("*") || Arrays.asList(str2.split(",")).contains(str);
    }

    public static boolean P1(String str) {
        return !TextUtils.isEmpty(str) && str.startsWith("_");
    }

    public static long R0(avj avjVar) {
        long length = 0;
        if (avjVar == null) {
            return 0L;
        }
        Bundle bundle = avjVar.E;
        Iterator<String> it = bundle.keySet().iterator();
        while (it.hasNext()) {
            Object obj = bundle.get(it.next());
            if (obj instanceof Parcelable[]) {
                length += (long) ((Parcelable[]) obj).length;
            }
        }
        return length;
    }

    public static boolean R1(String str) {
        dgj.s(str);
        return str.charAt(0) != '_' || str.equals("_ep");
    }

    public static long S0(byte[] bArr) {
        dgj.v(bArr);
        int i = 0;
        dgj.y(bArr.length > 0);
        long j = 0;
        for (int length = bArr.length - 1; length >= 0 && length >= bArr.length - 8; length--) {
            j += (((long) bArr[length]) & 255) << i;
            i += 8;
        }
        return j;
    }

    public static int T1(String str) {
        return "_ldl".equals(str) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : "_id".equals(str) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : "_lgclid".equals(str) ? 100 : 36;
    }

    public static Bundle V0(List list) {
        Bundle bundle = new Bundle();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                e1l e1lVar = (e1l) it.next();
                String str = e1lVar.I;
                String str2 = e1lVar.F;
                if (str != null) {
                    bundle.putString(str2, str);
                } else {
                    Long l = e1lVar.H;
                    if (l != null) {
                        bundle.putLong(str2, l.longValue());
                    } else {
                        Double d = e1lVar.K;
                        if (d != null) {
                            bundle.putDouble(str2, d.doubleValue());
                        }
                    }
                }
            }
        }
        return bundle;
    }

    public static MessageDigest W1() {
        MessageDigest messageDigest;
        for (int i = 0; i < 2; i++) {
            try {
                messageDigest = MessageDigest.getInstance("MD5");
            } catch (NoSuchAlgorithmException unused) {
            }
            if (messageDigest != null) {
                return messageDigest;
            }
        }
        return null;
    }

    public static String Y0(String str, int i, boolean z) {
        if (str != null) {
            if (str.codePointCount(0, str.length()) <= i) {
                return str;
            }
            if (z) {
                return str.substring(0, str.offsetByCodePoints(0, i)).concat("...");
            }
        }
        return null;
    }

    public static void b1(Bundle bundle, int i, String str, Object obj) {
        if (G1(i, bundle)) {
            bundle.putString("_ev", Y0(str, 40, true));
            if (obj != null) {
                if ((obj instanceof String) || (obj instanceof CharSequence)) {
                    bundle.putLong("_el", String.valueOf(obj).length());
                }
            }
        }
    }

    public static void n1(xxk xxkVar, Bundle bundle, boolean z) {
        if (bundle == null || xxkVar == null || (bundle.containsKey("_sc") && !z)) {
            if (bundle != null && xxkVar == null && z) {
                bundle.remove("_sn");
                bundle.remove("_sc");
                bundle.remove("_si");
                return;
            }
            return;
        }
        String str = xxkVar.a;
        if (str != null) {
            bundle.putString("_sn", str);
        } else {
            bundle.remove("_sn");
        }
        String str2 = xxkVar.b;
        if (str2 != null) {
            bundle.putString("_sc", str2);
        } else {
            bundle.remove("_sc");
        }
        bundle.putLong("_si", xxkVar.c);
    }

    public static void o1(g1l g1lVar, String str, int i, String str2, String str3, int i2) {
        Bundle bundle = new Bundle();
        G1(i, bundle);
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            bundle.putString(str2, str3);
        }
        if (i == 6 || i == 7 || i == 2) {
            bundle.putLong("_el", i2);
        }
        g1lVar.c(str, "_err", bundle);
    }

    public static boolean r1(Context context) {
        ActivityInfo receiverInfo;
        dgj.v(context);
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null && (receiverInfo = packageManager.getReceiverInfo(new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementReceiver"), 0)) != null) {
                if (receiverInfo.enabled) {
                    return true;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return false;
    }

    public static boolean s1(Intent intent) {
        String stringExtra = intent.getStringExtra("android.intent.extra.REFERRER_NAME");
        return "android-app://com.google.android.googlequicksearchbox/https/www.google.com".equals(stringExtra) || "https://www.google.com".equals(stringExtra) || "android-app://com.google.appcrawler".equals(stringExtra);
    }

    public static boolean t1(Object obj) {
        return (obj instanceof Parcelable[]) || (obj instanceof ArrayList) || (obj instanceof Bundle);
    }

    public static boolean x1(String str, String str2, String str3, String str4) {
        boolean zIsEmpty = TextUtils.isEmpty(str);
        boolean zIsEmpty2 = TextUtils.isEmpty(str2);
        if (!zIsEmpty && !zIsEmpty2) {
            dgj.v(str);
            return !str.equals(str2);
        }
        if (zIsEmpty && zIsEmpty2) {
            return (TextUtils.isEmpty(str3) || TextUtils.isEmpty(str4)) ? !TextUtils.isEmpty(str4) : !str3.equals(str4);
        }
        if (zIsEmpty || !zIsEmpty2) {
            return TextUtils.isEmpty(str3) || !str3.equals(str4);
        }
        if (TextUtils.isEmpty(str4)) {
            return false;
        }
        return TextUtils.isEmpty(str3) || !str3.equals(str4);
    }

    public static boolean y1(String str, String[] strArr) {
        dgj.v(strArr);
        for (String str2 : strArr) {
            if (Objects.equals(str, str2)) {
                return true;
            }
        }
        return false;
    }

    public final boolean B1(int i) {
        Boolean bool = ((umk) this.E).n().I;
        if (O1() < i / 1000) {
            return (bool == null || bool.booleanValue()) ? false : true;
        }
        return true;
    }

    public final int D1(String str) {
        if (!I1("user property", str)) {
            return 6;
        }
        if (z1("user property", tik.c, null, str)) {
            return !u1("user property", 24, str) ? 6 : 0;
        }
        return 15;
    }

    public final Object E1(String str, Object obj) {
        umk umkVar = (umk) this.E;
        if ("_ev".equals(str)) {
            return X0(Math.max(umkVar.K.M0(null, false), FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING), obj, true, true);
        }
        return X0(P1(str) ? Math.max(umkVar.K.M0(null, false), FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING) : umkVar.K.M0(null, false), obj, false, true);
    }

    public final boolean H1(Context context, String str) {
        Signature[] signatureArr;
        X500Principal x500Principal = new X500Principal("CN=Android Debug,O=Android,C=US");
        try {
            PackageInfo packageInfoE = nij.a(context).E(64, str);
            if (packageInfoE == null || (signatureArr = packageInfoE.signatures) == null || signatureArr.length <= 0) {
                return true;
            }
            return ((X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(signatureArr[0].toByteArray()))).getSubjectX500Principal().equals(x500Principal);
        } catch (PackageManager.NameNotFoundException e) {
            this.b0().J.c("Package name not found", e);
            return true;
        } catch (CertificateException e2) {
            this.b0().J.c("Error obtaining certificate", e2);
            return true;
        }
    }

    public final boolean I1(String str, String str2) {
        if (str2 == null) {
            b0().L.c("Name is required and can't be null. Type", str);
            return false;
        }
        if (str2.length() == 0) {
            b0().L.c("Name is required and can't be empty. Type", str);
            return false;
        }
        int iCodePointAt = str2.codePointAt(0);
        if (!Character.isLetter(iCodePointAt) && iCodePointAt != 95) {
            b0().L.a(str, str2, "Name must start with a letter or _ (underscore). Type, name");
            return false;
        }
        int length = str2.length();
        int iCharCount = Character.charCount(iCodePointAt);
        while (iCharCount < length) {
            int iCodePointAt2 = str2.codePointAt(iCharCount);
            if (iCodePointAt2 != 95 && !Character.isLetterOrDigit(iCodePointAt2)) {
                b0().L.a(str, str2, "Name must consist of letters, digits or _ (underscores). Type, name");
                return false;
            }
            iCharCount += Character.charCount(iCodePointAt2);
        }
        return true;
    }

    public final Object J1(String str, Object obj) {
        return "_ldl".equals(str) ? X0(T1(str), obj, true, false) : X0(T1(str), obj, false, false);
    }

    public final boolean K1(String str, String str2) {
        if (str2 == null) {
            b0().L.c("Name is required and can't be null. Type", str);
            return false;
        }
        if (str2.length() == 0) {
            b0().L.c("Name is required and can't be empty. Type", str);
            return false;
        }
        int iCodePointAt = str2.codePointAt(0);
        if (!Character.isLetter(iCodePointAt)) {
            b0().L.a(str, str2, "Name must start with a letter. Type, name");
            return false;
        }
        int length = str2.length();
        int iCharCount = Character.charCount(iCodePointAt);
        while (iCharCount < length) {
            int iCodePointAt2 = str2.codePointAt(iCharCount);
            if (iCodePointAt2 != 95 && !Character.isLetterOrDigit(iCodePointAt2)) {
                b0().L.a(str, str2, "Name must consist of letters, digits or _ (underscores). Type, name");
                return false;
            }
            iCharCount += Character.charCount(iCodePointAt2);
        }
        return true;
    }

    public final boolean L1(String str, String str2) {
        i4l.a();
        umk umkVar = (umk) this.E;
        if (umkVar.K.X0(null, zvj.w0) && !TextUtils.isEmpty(str2)) {
            return true;
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return umkVar.K.N0("debug.firebase.analytics.app").equals(str);
    }

    public final boolean M1(String str) {
        K0();
        if (((Context) nij.a(((umk) this.E).E).F).checkCallingOrSelfPermission(str) == 0) {
            return true;
        }
        b0().Q.c("Permission not granted", str);
        return false;
    }

    @Override // defpackage.pqk
    public final boolean N0() {
        return true;
    }

    public final int O0(String str) {
        if (!I1("event", str)) {
            return 2;
        }
        if (z1("event", v40.k, v40.l, str)) {
            return !u1("event", 40, str) ? 2 : 0;
        }
        return 13;
    }

    public final int O1() {
        if (this.L == null) {
            g88 g88Var = g88.b;
            Context context = ((umk) this.E).E;
            g88Var.getClass();
            this.L = Integer.valueOf(g88.a(context) / 1000);
        }
        return this.L.intValue();
    }

    public final int P0(String str, Object obj) {
        return "_ldl".equals(str) ? w1("user property referrer", str, T1(str), obj) : w1("user property", str, T1(str), obj) ? 0 : 7;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0096  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int Q0(java.lang.String r12, java.lang.String r13, java.lang.Object r14, android.os.Bundle r15, java.util.List r16, boolean r17, boolean r18) {
        /*
            Method dump skipped, instruction units count: 321
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h1l.Q0(java.lang.String, java.lang.String, java.lang.Object, android.os.Bundle, java.util.List, boolean, boolean):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x00e0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long Q1() {
        /*
            Method dump skipped, instruction units count: 235
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h1l.Q1():long");
    }

    public final boolean S1(String str) {
        List<ResolveInfo> listQueryIntentActivities;
        return (TextUtils.isEmpty(str) || (listQueryIntentActivities = ((umk) this.E).E.getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse(str)), 0)) == null || listQueryIntentActivities.isEmpty()) ? false : true;
    }

    public final Bundle T0(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                Object objE1 = E1(str, bundle.get(str));
                if (objE1 == null) {
                    b0().O.c("Param value can't be null", ((umk) this.E).Q.f(str));
                } else {
                    e1(bundle2, str, objE1);
                }
            }
        }
        return bundle2;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0096  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.os.Bundle U0(java.lang.String r18, android.os.Bundle r19, java.util.List r20, boolean r21) {
        /*
            Method dump skipped, instruction units count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h1l.U0(java.lang.String, android.os.Bundle, java.util.List, boolean):android.os.Bundle");
    }

    public final long U1() {
        long andIncrement;
        long j;
        long j2 = this.H.get();
        AtomicLong atomicLong = this.H;
        if (j2 != 0) {
            synchronized (atomicLong) {
                this.H.compareAndSet(-1L, 1L);
                andIncrement = this.H.getAndIncrement();
            }
            return andIncrement;
        }
        synchronized (atomicLong) {
            long jNanoTime = System.nanoTime();
            ((umk) this.E).R.getClass();
            long jNextLong = new Random(jNanoTime ^ System.currentTimeMillis()).nextLong();
            int i = this.I + 1;
            this.I = i;
            j = jNextLong + ((long) i);
        }
        return j;
    }

    public final String V1() {
        byte[] bArr = new byte[16];
        X1().nextBytes(bArr);
        return String.format(Locale.US, "%032x", new BigInteger(1, bArr));
    }

    public final Bundle W0(boolean z, Uri uri) {
        String queryParameter;
        String queryParameter2;
        String queryParameter3;
        String queryParameter4;
        String queryParameter5;
        String queryParameter6;
        String queryParameter7;
        String queryParameter8;
        String queryParameter9;
        String str;
        if (uri == null) {
            return null;
        }
        try {
            if (uri.isHierarchical()) {
                queryParameter = uri.getQueryParameter("utm_campaign");
                queryParameter2 = uri.getQueryParameter("utm_source");
                queryParameter3 = uri.getQueryParameter("utm_medium");
                queryParameter4 = uri.getQueryParameter("gclid");
                queryParameter5 = z ? uri.getQueryParameter("gbraid") : null;
                queryParameter6 = uri.getQueryParameter("utm_id");
                queryParameter7 = uri.getQueryParameter("dclid");
                queryParameter8 = uri.getQueryParameter("srsltid");
                queryParameter9 = uri.getQueryParameter("sfmc_id");
            } else {
                queryParameter = null;
                queryParameter2 = null;
                queryParameter3 = null;
                queryParameter4 = null;
                queryParameter5 = null;
                queryParameter6 = null;
                queryParameter7 = null;
                queryParameter8 = null;
                queryParameter9 = null;
            }
            if (TextUtils.isEmpty(queryParameter) && TextUtils.isEmpty(queryParameter2) && TextUtils.isEmpty(queryParameter3) && TextUtils.isEmpty(queryParameter4) && ((!z || TextUtils.isEmpty(queryParameter5)) && TextUtils.isEmpty(queryParameter6) && TextUtils.isEmpty(queryParameter7) && TextUtils.isEmpty(queryParameter8) && TextUtils.isEmpty(queryParameter9))) {
                return null;
            }
            Bundle bundle = new Bundle();
            if (TextUtils.isEmpty(queryParameter)) {
                str = "sfmc_id";
            } else {
                str = "sfmc_id";
                bundle.putString("campaign", queryParameter);
            }
            if (!TextUtils.isEmpty(queryParameter2)) {
                bundle.putString("source", queryParameter2);
            }
            if (!TextUtils.isEmpty(queryParameter3)) {
                bundle.putString("medium", queryParameter3);
            }
            if (!TextUtils.isEmpty(queryParameter4)) {
                bundle.putString("gclid", queryParameter4);
            }
            if (z && !TextUtils.isEmpty(queryParameter5)) {
                bundle.putString("gbraid", queryParameter5);
            }
            String queryParameter10 = uri.getQueryParameter("gad_source");
            if (z && !TextUtils.isEmpty(queryParameter10)) {
                bundle.putString("gad_source", queryParameter10);
            }
            String queryParameter11 = uri.getQueryParameter("utm_term");
            if (!TextUtils.isEmpty(queryParameter11)) {
                bundle.putString("term", queryParameter11);
            }
            String queryParameter12 = uri.getQueryParameter("utm_content");
            if (!TextUtils.isEmpty(queryParameter12)) {
                bundle.putString("content", queryParameter12);
            }
            String queryParameter13 = uri.getQueryParameter("aclid");
            if (!TextUtils.isEmpty(queryParameter13)) {
                bundle.putString("aclid", queryParameter13);
            }
            String queryParameter14 = uri.getQueryParameter("cp1");
            if (!TextUtils.isEmpty(queryParameter14)) {
                bundle.putString("cp1", queryParameter14);
            }
            String queryParameter15 = uri.getQueryParameter("anid");
            if (!TextUtils.isEmpty(queryParameter15)) {
                bundle.putString("anid", queryParameter15);
            }
            if (!TextUtils.isEmpty(queryParameter6)) {
                bundle.putString("campaign_id", queryParameter6);
            }
            if (!TextUtils.isEmpty(queryParameter7)) {
                bundle.putString("dclid", queryParameter7);
            }
            String queryParameter16 = uri.getQueryParameter("utm_source_platform");
            if (!TextUtils.isEmpty(queryParameter16)) {
                bundle.putString("source_platform", queryParameter16);
            }
            String queryParameter17 = uri.getQueryParameter("utm_creative_format");
            if (!TextUtils.isEmpty(queryParameter17)) {
                bundle.putString("creative_format", queryParameter17);
            }
            String queryParameter18 = uri.getQueryParameter("utm_marketing_tactic");
            if (!TextUtils.isEmpty(queryParameter18)) {
                bundle.putString("marketing_tactic", queryParameter18);
            }
            if (!TextUtils.isEmpty(queryParameter8)) {
                bundle.putString("srsltid", queryParameter8);
            }
            if (!TextUtils.isEmpty(queryParameter9)) {
                bundle.putString(str, queryParameter9);
            }
            return bundle;
        } catch (UnsupportedOperationException e) {
            b0().M.c("Install referrer url isn't a hierarchical URI", e);
            return null;
        }
    }

    public final Object X0(int i, Object obj, boolean z, boolean z2) {
        if (obj == null) {
            return null;
        }
        if ((obj instanceof Long) || (obj instanceof Double)) {
            return obj;
        }
        if (obj instanceof Integer) {
            return Long.valueOf(((Integer) obj).intValue());
        }
        if (obj instanceof Byte) {
            return Long.valueOf(((Byte) obj).byteValue());
        }
        if (obj instanceof Short) {
            return Long.valueOf(((Short) obj).shortValue());
        }
        if (obj instanceof Boolean) {
            return Long.valueOf(((Boolean) obj).booleanValue() ? 1L : 0L);
        }
        if (obj instanceof Float) {
            return Double.valueOf(((Float) obj).doubleValue());
        }
        if ((obj instanceof String) || (obj instanceof Character) || (obj instanceof CharSequence)) {
            return Y0(String.valueOf(obj), i, z);
        }
        if (!z2) {
            return null;
        }
        if (!(obj instanceof Bundle[]) && !(obj instanceof Parcelable[])) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Parcelable parcelable : (Parcelable[]) obj) {
            if (parcelable instanceof Bundle) {
                Bundle bundleT0 = T0((Bundle) parcelable);
                if (!bundleT0.isEmpty()) {
                    arrayList.add(bundleT0);
                }
            }
        }
        return arrayList.toArray(new Bundle[arrayList.size()]);
    }

    public final SecureRandom X1() {
        K0();
        if (this.G == null) {
            this.G = new SecureRandom();
        }
        return this.G;
    }

    public final rvj Z0(String str, Bundle bundle, String str2, long j, boolean z) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (O0(str) != 0) {
            b0().J.c("Invalid conditional property event name", ((umk) this.E).Q.g(str));
            mr9.y();
            return null;
        }
        Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
        bundle2.putString("_o", str2);
        Bundle bundleU0 = U0(str, bundle2, Collections.singletonList("_o"), true);
        if (z) {
            bundleU0 = T0(bundleU0);
        }
        dgj.v(bundleU0);
        return new rvj(str, new avj(bundleU0), str2, j);
    }

    public final void a1(ak6 ak6Var, int i) {
        umk umkVar = (umk) this.E;
        Bundle bundle = (Bundle) ak6Var.e;
        int i2 = 0;
        for (String str : new TreeSet(bundle.keySet())) {
            if (R1(str) && (i2 = i2 + 1) > i) {
                b0().L.a(umkVar.Q.b((String) ak6Var.c), umkVar.Q.a(bundle), grc.u("Event can't contain more than ", i, " params"));
                G1(5, bundle);
                bundle.remove(str);
            }
        }
    }

    public final void c1(Bundle bundle, long j) {
        long j2 = bundle.getLong("_et");
        if (j2 != 0) {
            b0().M.c("Params already contained engagement", Long.valueOf(j2));
        }
        bundle.putLong("_et", j + j2);
    }

    public final void d1(Bundle bundle, Bundle bundle2) {
        if (bundle2 == null) {
            return;
        }
        for (String str : bundle2.keySet()) {
            if (!bundle.containsKey(str)) {
                J0().e1(bundle, str, bundle2.get(str));
            }
        }
    }

    public final void e1(Bundle bundle, String str, Object obj) {
        if (bundle == null) {
            return;
        }
        if (obj instanceof Long) {
            bundle.putLong(str, ((Long) obj).longValue());
            return;
        }
        if (obj instanceof String) {
            bundle.putString(str, String.valueOf(obj));
            return;
        }
        if (obj instanceof Double) {
            bundle.putDouble(str, ((Double) obj).doubleValue());
        } else if (obj instanceof Bundle[]) {
            bundle.putParcelableArray(str, (Bundle[]) obj);
        } else if (str != null) {
            b0().O.a(((umk) this.E).Q.f(str), obj != null ? obj.getClass().getSimpleName() : null, "Not putting event parameter. Invalid value type. name, type");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f1(java.lang.String r18, java.lang.String r19, android.os.Bundle r20, java.util.List r21, boolean r22) {
        /*
            Method dump skipped, instruction units count: 373
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h1l.f1(java.lang.String, java.lang.String, android.os.Bundle, java.util.List, boolean):void");
    }

    public final void g1(String str, x4k x4kVar) {
        Bundle bundle = new Bundle();
        bundle.putString("r", str);
        try {
            x4kVar.f(bundle);
        } catch (RemoteException e) {
            qgk qgkVar = ((umk) this.E).M;
            umk.d(qgkVar);
            qgkVar.M.c("Error returning string value to wrapper", e);
        }
    }

    public final void h1(x4k x4kVar, int i) {
        Bundle bundle = new Bundle();
        bundle.putInt("r", i);
        try {
            x4kVar.f(bundle);
        } catch (RemoteException e) {
            qgk qgkVar = ((umk) this.E).M;
            umk.d(qgkVar);
            qgkVar.M.c("Error returning int value to wrapper", e);
        }
    }

    public final void i1(x4k x4kVar, long j) {
        Bundle bundle = new Bundle();
        bundle.putLong("r", j);
        try {
            x4kVar.f(bundle);
        } catch (RemoteException e) {
            qgk qgkVar = ((umk) this.E).M;
            umk.d(qgkVar);
            qgkVar.M.c("Error returning long value to wrapper", e);
        }
    }

    public final void j1(x4k x4kVar, Bundle bundle) {
        try {
            x4kVar.f(bundle);
        } catch (RemoteException e) {
            qgk qgkVar = ((umk) this.E).M;
            umk.d(qgkVar);
            qgkVar.M.c("Error returning bundle value to wrapper", e);
        }
    }

    public final void k1(x4k x4kVar, ArrayList arrayList) {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("r", arrayList);
        try {
            x4kVar.f(bundle);
        } catch (RemoteException e) {
            qgk qgkVar = ((umk) this.E).M;
            umk.d(qgkVar);
            qgkVar.M.c("Error returning bundle list to wrapper", e);
        }
    }

    public final void l1(x4k x4kVar, boolean z) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("r", z);
        try {
            x4kVar.f(bundle);
        } catch (RemoteException e) {
            qgk qgkVar = ((umk) this.E).M;
            umk.d(qgkVar);
            qgkVar.M.c("Error returning boolean value to wrapper", e);
        }
    }

    public final void m1(x4k x4kVar, byte[] bArr) {
        Bundle bundle = new Bundle();
        bundle.putByteArray("r", bArr);
        try {
            x4kVar.f(bundle);
        } catch (RemoteException e) {
            qgk qgkVar = ((umk) this.E).M;
            umk.d(qgkVar);
            qgkVar.M.c("Error returning byte array to wrapper", e);
        }
    }

    public final void p1(Parcelable[] parcelableArr, int i, boolean z) {
        umk umkVar = (umk) this.E;
        dgj.v(parcelableArr);
        for (Parcelable parcelable : parcelableArr) {
            Bundle bundle = (Bundle) parcelable;
            int i2 = 0;
            for (String str : new TreeSet(bundle.keySet())) {
                if (R1(str) && !y1(str, sik.f) && (i2 = i2 + 1) > i) {
                    if (z) {
                        b0().L.a(umkVar.Q.f(str), umkVar.Q.a(bundle), grc.u("Param can't contain more than ", i, " item-scoped custom parameters"));
                        G1(28, bundle);
                    } else {
                        b0().L.a(umkVar.Q.f(str), umkVar.Q.a(bundle), "Param cannot contain item-scoped custom parameters");
                        G1(23, bundle);
                    }
                    bundle.remove(str);
                }
            }
        }
    }

    public final boolean q1(double d, String str) {
        try {
            SharedPreferences.Editor editorEdit = ((umk) this.E).E.getSharedPreferences("google.analytics.deferred.deeplink.prefs", 0).edit();
            editorEdit.putString("deeplink", str);
            editorEdit.putLong("timestamp", Double.doubleToRawLongBits(d));
            return editorEdit.commit();
        } catch (RuntimeException e) {
            this.b0().J.c("Failed to persist Deferred Deep Link. exception", e);
            return false;
        }
    }

    public final boolean u1(String str, int i, String str2) {
        if (str2 == null) {
            b0().L.c("Name is required and can't be null. Type", str);
            return false;
        }
        if (str2.codePointCount(0, str2.length()) <= i) {
            return true;
        }
        b0().L.d("Name is too long. Type, maximum supported length, name", str, Integer.valueOf(i), str2);
        return false;
    }

    public final boolean v1(String str, String str2) {
        umk umkVar = (umk) this.E;
        if (!TextUtils.isEmpty(str)) {
            dgj.v(str);
            if (str.matches("^(1:\\d+:android:[a-f0-9]+|ca-app-pub-.*)$")) {
                return true;
            }
            if (TextUtils.isEmpty(umkVar.F)) {
                b0().L.c("Invalid google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI. provided id", qgk.Q0(str));
                return false;
            }
        } else {
            if (!TextUtils.isEmpty(str2)) {
                dgj.v(str2);
                if (str2.matches("^(1:\\d+:android:[a-f0-9]+|ca-app-pub-.*)$")) {
                    return true;
                }
                b0().L.c("Invalid admob_app_id. Analytics disabled.", qgk.Q0(str2));
                return false;
            }
            if (TextUtils.isEmpty(umkVar.F)) {
                b0().L.b("Missing google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI");
            }
        }
        return false;
    }

    public final boolean w1(String str, String str2, int i, Object obj) {
        if (obj == null || (obj instanceof Long) || (obj instanceof Float) || (obj instanceof Integer) || (obj instanceof Byte) || (obj instanceof Short) || (obj instanceof Boolean) || (obj instanceof Double)) {
            return true;
        }
        if (!(obj instanceof String) && !(obj instanceof Character) && !(obj instanceof CharSequence)) {
            return false;
        }
        String strValueOf = String.valueOf(obj);
        if (strValueOf.codePointCount(0, strValueOf.length()) <= i) {
            return true;
        }
        b0().O.d("Value is too long; discarded. Value kind, name, value length", str, str2, Integer.valueOf(strValueOf.length()));
        return false;
    }

    public final boolean z1(String str, String[] strArr, String[] strArr2, String str2) {
        if (str2 == null) {
            b0().L.c("Name is required and can't be null. Type", str);
            return false;
        }
        for (int i = 0; i < 3; i++) {
            if (str2.startsWith(M[i])) {
                b0().L.a(str, str2, "Name starts with reserved prefix. Type, name");
                return false;
            }
        }
        if (strArr == null || !y1(str2, strArr)) {
            return true;
        }
        if (strArr2 != null && y1(str2, strArr2)) {
            return true;
        }
        b0().L.a(str, str2, "Name is reserved. Type, name");
        return false;
    }
}
