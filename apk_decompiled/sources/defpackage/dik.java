package defpackage;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.anthropic.claude.api.tasks.TaskSessionEvent;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader$ParseException;
import com.google.android.gms.internal.measurement.b0;
import com.google.android.gms.internal.measurement.c;
import com.google.android.gms.internal.measurement.c0;
import com.google.android.gms.internal.measurement.d;
import com.google.android.gms.internal.measurement.e0;
import com.google.android.gms.internal.measurement.f;
import com.google.android.gms.internal.measurement.f0;
import com.google.android.gms.internal.measurement.g0;
import com.google.android.gms.internal.measurement.m;
import com.google.android.gms.internal.measurement.s;
import com.google.android.gms.internal.measurement.u;
import com.google.android.gms.internal.measurement.v;
import com.google.android.gms.internal.measurement.w;
import com.google.android.gms.internal.measurement.x;
import com.google.android.gms.internal.measurement.z;
import com.google.android.gms.internal.measurement.zzlk;
import com.pvporbit.freetype.FreeTypeConstants;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.net.HttpURLConnection;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/* JADX INFO: loaded from: classes.dex */
public final class dik extends k0l {
    public final /* synthetic */ int H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dik(o0l o0lVar, int i) {
        super(o0lVar);
        this.H = i;
    }

    public static int R0(String str, phk phkVar) {
        for (int i = 0; i < ((c0) phkVar.F).t1(); i++) {
            if (str.equals(((c0) phkVar.F).e0(i).C())) {
                return i;
            }
        }
        return -1;
    }

    public static Bundle T0(List list) {
        Bundle bundle = new Bundle();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            z zVar = (z) it.next();
            String strE = zVar.E();
            if (zVar.H()) {
                bundle.putDouble(strE, zVar.p());
            } else if (zVar.I()) {
                bundle.putFloat(strE, zVar.w());
            } else if (zVar.L()) {
                bundle.putString(strE, zVar.F());
            } else if (zVar.J()) {
                bundle.putLong(strE, zVar.B());
            }
        }
        return bundle;
    }

    public static Bundle U0(Map map, boolean z) {
        Bundle bundle = new Bundle();
        for (String str : map.keySet()) {
            Object obj = map.get(str);
            if (obj == null) {
                bundle.putString(str, null);
            } else if (obj instanceof Long) {
                bundle.putLong(str, ((Long) obj).longValue());
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Double) obj).doubleValue());
            } else if (!(obj instanceof ArrayList)) {
                bundle.putString(str, obj.toString());
            } else if (z) {
                ArrayList arrayList = (ArrayList) obj;
                ArrayList arrayList2 = new ArrayList();
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj2 = arrayList.get(i);
                    i++;
                    arrayList2.add(U0((Map) obj2, false));
                }
                bundle.putParcelableArray(str, (Parcelable[]) arrayList2.toArray(new Parcelable[0]));
            }
        }
        return bundle;
    }

    public static z X0(x xVar, String str) {
        for (z zVar : xVar.E()) {
            if (zVar.E().equals(str)) {
                return zVar;
            }
        }
        return null;
    }

    public static String Z0(boolean z, boolean z2, boolean z3) {
        StringBuilder sb = new StringBuilder();
        if (z) {
            sb.append("Dynamic ");
        }
        if (z2) {
            sb.append("Sequence ");
        }
        if (z3) {
            sb.append("Session-Scoped ");
        }
        return sb.toString();
    }

    public static ArrayList a1(BitSet bitSet) {
        int length = (bitSet.length() + 63) / 64;
        ArrayList arrayList = new ArrayList(length);
        for (int i = 0; i < length; i++) {
            long j = 0;
            for (int i2 = 0; i2 < 64; i2++) {
                int i3 = (i << 6) + i2;
                if (i3 < bitSet.length()) {
                    if (bitSet.get(i3)) {
                        j |= 1 << i2;
                    }
                }
            }
            arrayList.add(Long.valueOf(j));
        }
        return arrayList;
    }

    public static HashMap b1(Bundle bundle, boolean z) {
        HashMap map = new HashMap();
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            boolean z2 = obj instanceof Parcelable[];
            if (z2 || (obj instanceof ArrayList) || (obj instanceof Bundle)) {
                if (z) {
                    ArrayList arrayList = new ArrayList();
                    if (z2) {
                        for (Parcelable parcelable : (Parcelable[]) obj) {
                            if (parcelable instanceof Bundle) {
                                arrayList.add(b1((Bundle) parcelable, false));
                            }
                        }
                    } else if (obj instanceof ArrayList) {
                        ArrayList arrayList2 = (ArrayList) obj;
                        int size = arrayList2.size();
                        int i = 0;
                        while (i < size) {
                            Object obj2 = arrayList2.get(i);
                            i++;
                            if (obj2 instanceof Bundle) {
                                arrayList.add(b1((Bundle) obj2, false));
                            }
                        }
                    } else if (obj instanceof Bundle) {
                        arrayList.add(b1((Bundle) obj, false));
                    }
                    map.put(str, arrayList);
                }
            } else if (obj != null) {
                map.put(str, obj);
            }
        }
        return map;
    }

    public static rvj d1(bqj bqjVar) {
        Object obj;
        Bundle bundleU0 = U0(bqjVar.d(), true);
        String string = (!bundleU0.containsKey("_o") || (obj = bundleU0.get("_o")) == null) ? "app" : obj.toString();
        String strB = q7j.b(bqjVar.c(), v40.k, v40.m);
        if (strB == null) {
            strB = bqjVar.c();
        }
        return new rvj(strB, new avj(bundleU0), string, bqjVar.a());
    }

    public static nxk e1(nxk nxkVar, byte[] bArr) throws zzlk {
        fwk fwkVarP;
        fwk fwkVar = fwk.a;
        if (fwkVar == null) {
            synchronized (fwk.class) {
                try {
                    fwkVarP = fwk.a;
                    if (fwkVarP == null) {
                        fwkVarP = kxk.P();
                        fwk.a = fwkVarP;
                    }
                } finally {
                }
            }
            fwkVar = fwkVarP;
        }
        if (fwkVar != null) {
            nxkVar.getClass();
            nxkVar.d(bArr, bArr.length, fwkVar);
            return nxkVar;
        }
        nxkVar.getClass();
        nxkVar.d(bArr, bArr.length, fwk.b);
        return nxkVar;
    }

    public static void g1(int i, StringBuilder sb) {
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("  ");
        }
    }

    public static void h1(Uri.Builder builder, String str, String str2, Set set) {
        if (set.contains(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        builder.appendQueryParameter(str, str2);
    }

    public static void i1(Uri.Builder builder, String[] strArr, Bundle bundle, Set set) {
        for (String str : strArr) {
            String[] strArrSplit = str.split(",");
            String str2 = strArrSplit[0];
            String str3 = strArrSplit[strArrSplit.length - 1];
            String string = bundle.getString(str2);
            if (string != null) {
                h1(builder, str3, string, set);
            }
        }
    }

    public static void k1(StringBuilder sb, int i, String str, d dVar) {
        if (dVar == null) {
            return;
        }
        g1(i, sb);
        sb.append(str);
        sb.append(" {\n");
        if (dVar.v()) {
            l1(sb, i, "comparison_type", fsh.B(dVar.p()));
        }
        if (dVar.x()) {
            l1(sb, i, "match_as_float", Boolean.valueOf(dVar.u()));
        }
        if (dVar.w()) {
            l1(sb, i, "comparison_value", dVar.r());
        }
        if (dVar.z()) {
            l1(sb, i, "min_comparison_value", dVar.t());
        }
        if (dVar.y()) {
            l1(sb, i, "max_comparison_value", dVar.s());
        }
        g1(i, sb);
        sb.append("}\n");
    }

    public static void l1(StringBuilder sb, int i, String str, Object obj) {
        if (obj == null) {
            return;
        }
        g1(i + 1, sb);
        sb.append(str);
        sb.append(": ");
        sb.append(obj);
        sb.append('\n');
    }

    public static void n1(StringBuilder sb, String str, e0 e0Var) {
        if (e0Var == null) {
            return;
        }
        g1(3, sb);
        sb.append(str);
        sb.append(" {\n");
        if (e0Var.s() != 0) {
            g1(4, sb);
            sb.append("results: ");
            int i = 0;
            for (Long l : e0Var.F()) {
                int i2 = i + 1;
                if (i != 0) {
                    sb.append(", ");
                }
                sb.append(l);
                i = i2;
            }
            sb.append('\n');
        }
        if (e0Var.y() != 0) {
            g1(4, sb);
            sb.append("status: ");
            int i3 = 0;
            for (Long l2 : e0Var.H()) {
                int i4 = i3 + 1;
                if (i3 != 0) {
                    sb.append(", ");
                }
                sb.append(l2);
                i3 = i4;
            }
            sb.append('\n');
        }
        if (e0Var.p() != 0) {
            g1(4, sb);
            sb.append("dynamic_filter_timestamps: {");
            int i5 = 0;
            for (w wVar : e0Var.E()) {
                int i6 = i5 + 1;
                if (i5 != 0) {
                    sb.append(", ");
                }
                sb.append(wVar.v() ? Integer.valueOf(wVar.p()) : null);
                sb.append(":");
                sb.append(wVar.u() ? Long.valueOf(wVar.s()) : null);
                i5 = i6;
            }
            sb.append("}\n");
        }
        if (e0Var.v() != 0) {
            g1(4, sb);
            sb.append("sequence_filter_timestamps: {");
            int i7 = 0;
            for (f0 f0Var : e0Var.G()) {
                int i8 = i7 + 1;
                if (i7 != 0) {
                    sb.append(", ");
                }
                sb.append(f0Var.w() ? Integer.valueOf(f0Var.t()) : null);
                sb.append(": [");
                Iterator it = f0Var.v().iterator();
                int i9 = 0;
                while (it.hasNext()) {
                    long jLongValue = ((Long) it.next()).longValue();
                    int i10 = i9 + 1;
                    if (i9 != 0) {
                        sb.append(", ");
                    }
                    sb.append(jLongValue);
                    i9 = i10;
                }
                sb.append("]");
                i7 = i8;
            }
            sb.append("}\n");
        }
        g1(3, sb);
        sb.append("}\n");
    }

    public static void o1(mhk mhkVar, String str, Long l) {
        List listK = mhkVar.k();
        int i = 0;
        while (true) {
            if (i >= listK.size()) {
                i = -1;
                break;
            } else if (str.equals(((z) listK.get(i)).E())) {
                break;
            } else {
                i++;
            }
        }
        nhk nhkVarD = z.D();
        nhkVarD.g(str);
        if (l != null) {
            nhkVarD.f(l.longValue());
        }
        if (i < 0) {
            mhkVar.g(nhkVarD);
        } else {
            mhkVar.c();
            x.u((x) mhkVar.F, i, (z) nhkVarD.b());
        }
    }

    public static boolean t1(ayk aykVar, int i) {
        if (i < (aykVar.size() << 6)) {
            return ((1 << (i % 64)) & ((Long) aykVar.get(i / 64)).longValue()) != 0;
        }
        return false;
    }

    public static byte[] u1(HttpURLConnection httpURLConnection) throws IOException {
        InputStream inputStream = null;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            inputStream = httpURLConnection.getInputStream();
            byte[] bArr = new byte[FreeTypeConstants.FT_LOAD_NO_RECURSE];
            while (true) {
                int i = inputStream.read(bArr);
                if (i <= 0) {
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    inputStream.close();
                    return byteArray;
                }
                byteArrayOutputStream.write(bArr, 0, i);
            }
        } catch (Throwable th) {
            if (inputStream != null) {
                inputStream.close();
            }
            throw th;
        }
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [android.os.Bundle[], java.io.Serializable] */
    public static Serializable v1(x xVar, String str) {
        z zVarX0 = X0(xVar, str);
        if (zVarX0 == null) {
            return null;
        }
        if (zVarX0.L()) {
            return zVarX0.F();
        }
        if (zVarX0.J()) {
            return Long.valueOf(zVarX0.B());
        }
        if (zVarX0.H()) {
            return Double.valueOf(zVarX0.p());
        }
        if (zVarX0.z() > 0) {
            return y1((dyk) zVarX0.G());
        }
        return null;
    }

    public static boolean w1(String str) {
        return str != null && str.matches("([+-])?([0-9]+\\.?[0-9]*|[0-9]*\\.?[0-9]+)") && str.length() <= 310;
    }

    public static Bundle[] y1(dyk dykVar) {
        ArrayList arrayList = new ArrayList();
        Iterator it = dykVar.iterator();
        while (it.hasNext()) {
            z zVar = (z) it.next();
            if (zVar != null) {
                Bundle bundle = new Bundle();
                for (z zVar2 : zVar.G()) {
                    if (zVar2.L()) {
                        bundle.putString(zVar2.E(), zVar2.F());
                    } else if (zVar2.J()) {
                        bundle.putLong(zVar2.E(), zVar2.B());
                    } else if (zVar2.H()) {
                        bundle.putDouble(zVar2.E(), zVar2.p());
                    }
                }
                if (!bundle.isEmpty()) {
                    arrayList.add(bundle);
                }
            }
        }
        return (Bundle[]) arrayList.toArray(new Bundle[arrayList.size()]);
    }

    public byte[] A1(byte[] bArr) throws IOException {
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            GZIPInputStream gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr2 = new byte[FreeTypeConstants.FT_LOAD_NO_RECURSE];
            while (true) {
                int i = gZIPInputStream.read(bArr2);
                if (i <= 0) {
                    gZIPInputStream.close();
                    byteArrayInputStream.close();
                    return byteArrayOutputStream.toByteArray();
                }
                byteArrayOutputStream.write(bArr2, 0, i);
            }
        } catch (IOException e) {
            this.b0().J.c("Failed to ungzip content", e);
            throw e;
        }
    }

    public ArrayList B1() {
        Context context = this.F.P.E;
        List list = zvj.a;
        snk snkVarC = snk.c(context.getContentResolver(), rpk.a("com.google.android.gms.measurement"), new kl6(1));
        Map mapA = snkVarC == null ? Collections.EMPTY_MAP : snkVarC.a();
        if (mapA != null && !mapA.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            int iIntValue = ((Integer) zvj.R.a(null)).intValue();
            for (Map.Entry entry : mapA.entrySet()) {
                if (((String) entry.getKey()).startsWith("measurement.id.")) {
                    try {
                        int i = Integer.parseInt((String) entry.getValue());
                        if (i != 0) {
                            arrayList.add(Integer.valueOf(i));
                            if (arrayList.size() >= iIntValue) {
                                b0().M.c("Too many experiment IDs. Number of IDs", Integer.valueOf(arrayList.size()));
                                break;
                            }
                            continue;
                        } else {
                            continue;
                        }
                    } catch (NumberFormatException e) {
                        b0().M.c("Experiment ID NumberFormatException", e);
                    }
                }
            }
            if (!arrayList.isEmpty()) {
                return arrayList;
            }
        }
        return null;
    }

    public boolean C1() {
        O0();
        ConnectivityManager connectivityManager = (ConnectivityManager) ((umk) this.E).E.getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = null;
        if (connectivityManager != null) {
            try {
                activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            } catch (SecurityException unused) {
            }
        }
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    @Override // defpackage.k0l
    public final boolean Q0() {
        switch (this.H) {
        }
        return false;
    }

    public long S0(byte[] bArr) {
        dgj.v(bArr);
        J0().K0();
        MessageDigest messageDigestW1 = h1l.W1();
        if (messageDigestW1 != null) {
            return h1l.S0(messageDigestW1.digest(bArr));
        }
        b0().J.b("Failed to get MD5");
        return 0L;
    }

    public Parcelable V0(byte[] bArr, Parcelable.Creator creator) {
        if (bArr == null) {
            return null;
        }
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.unmarshall(bArr, 0, bArr.length);
            parcelObtain.setDataPosition(0);
            return (Parcelable) creator.createFromParcel(parcelObtain);
        } catch (SafeParcelReader$ParseException unused) {
            b0().J.b("Failed to load parcelable from buffer");
            return null;
        } finally {
            parcelObtain.recycle();
        }
    }

    public x W0(ruj rujVar) {
        mhk mhkVarC = x.C();
        long j = rujVar.e;
        String str = rujVar.c;
        mhkVarC.c();
        x.s(j, (x) mhkVarC.F);
        avj avjVar = rujVar.f;
        avjVar.getClass();
        Bundle bundle = avjVar.E;
        for (String str2 : bundle.keySet()) {
            nhk nhkVarD = z.D();
            nhkVarD.g(str2);
            Object obj = bundle.get(str2);
            dgj.v(obj);
            p1(nhkVarD, obj);
            mhkVarC.g(nhkVarD);
        }
        if (((umk) this.E).K.X0(null, zvj.l1) && !TextUtils.isEmpty(str) && bundle.get("_o") == null) {
            nhk nhkVarD2 = z.D();
            nhkVarD2.g("_o");
            nhkVarD2.h(str);
            mhkVarC.f((z) nhkVarD2.b());
        }
        return (x) mhkVarC.b();
    }

    public String Y0(b0 b0Var) {
        u uVarB2;
        umk umkVar = (umk) this.E;
        StringBuilder sb = new StringBuilder();
        sb.append("\nbatch {\n");
        i4l.a();
        vqj vqjVar = umkVar.K;
        ogk ogkVar = umkVar.Q;
        vqj vqjVar2 = umkVar.K;
        if (vqjVar.X0(null, zvj.v0) && b0Var.p() > 0) {
            J0();
            if (h1l.N1(b0Var.q().e2())) {
                if (b0Var.C()) {
                    l1(sb, 0, "upload_subdomain", b0Var.z());
                }
                if (b0Var.B()) {
                    l1(sb, 0, "sgtm_join_id", b0Var.y());
                }
            }
        }
        for (c0 c0Var : b0Var.A()) {
            if (c0Var != null) {
                g1(1, sb);
                sb.append("bundle {\n");
                if (c0Var.A0()) {
                    l1(sb, 1, "protocol_version", Integer.valueOf(c0Var.e1()));
                }
                e4l.a();
                if (vqjVar2.X0(c0Var.e2(), zvj.u0) && c0Var.D0()) {
                    l1(sb, 1, "session_stitching_token", c0Var.R());
                }
                l1(sb, 1, "platform", c0Var.P());
                if (c0Var.v0()) {
                    l1(sb, 1, "gmp_version", Long.valueOf(c0Var.N1()));
                }
                if (c0Var.I0()) {
                    l1(sb, 1, "uploading_gmp_version", Long.valueOf(c0Var.Z1()));
                }
                if (c0Var.t0()) {
                    l1(sb, 1, "dynamite_version", Long.valueOf(c0Var.G1()));
                }
                if (c0Var.m0()) {
                    l1(sb, 1, "config_version", Long.valueOf(c0Var.y1()));
                }
                l1(sb, 1, "gmp_app_id", c0Var.M());
                l1(sb, 1, "admob_app_id", c0Var.d2());
                l1(sb, 1, "app_id", c0Var.e2());
                l1(sb, 1, "app_version", c0Var.F());
                if (c0Var.b0()) {
                    l1(sb, 1, "app_version_major", Integer.valueOf(c0Var.d0()));
                }
                l1(sb, 1, "firebase_instance_id", c0Var.L());
                if (c0Var.r0()) {
                    l1(sb, 1, "dev_cert_hash", Long.valueOf(c0Var.C1()));
                }
                l1(sb, 1, "app_store", c0Var.E());
                if (c0Var.H0()) {
                    l1(sb, 1, "upload_timestamp_millis", Long.valueOf(c0Var.X1()));
                }
                if (c0Var.E0()) {
                    l1(sb, 1, "start_timestamp_millis", Long.valueOf(c0Var.T1()));
                }
                if (c0Var.u0()) {
                    l1(sb, 1, "end_timestamp_millis", Long.valueOf(c0Var.K1()));
                }
                if (c0Var.z0()) {
                    l1(sb, 1, "previous_bundle_start_timestamp_millis", Long.valueOf(c0Var.R1()));
                }
                if (c0Var.y0()) {
                    l1(sb, 1, "previous_bundle_end_timestamp_millis", Long.valueOf(c0Var.P1()));
                }
                l1(sb, 1, "app_instance_id", c0Var.D());
                l1(sb, 1, "resettable_device_id", c0Var.Q());
                l1(sb, 1, "ds_id", c0Var.K());
                if (c0Var.x0()) {
                    l1(sb, 1, "limited_ad_tracking", Boolean.valueOf(c0Var.Y()));
                }
                l1(sb, 1, "os_version", c0Var.O());
                l1(sb, 1, "device_model", c0Var.J());
                l1(sb, 1, "user_default_language", c0Var.S());
                if (c0Var.G0()) {
                    l1(sb, 1, "time_zone_offset_minutes", Integer.valueOf(c0Var.o1()));
                }
                if (c0Var.l0()) {
                    l1(sb, 1, "bundle_sequential_index", Integer.valueOf(c0Var.J0()));
                }
                i4l.a();
                J0();
                if (h1l.N1(c0Var.e2()) && vqjVar2.X0(null, zvj.v0) && c0Var.q0()) {
                    l1(sb, 1, "delivery_index", Integer.valueOf(c0Var.S0()));
                }
                if (c0Var.C0()) {
                    l1(sb, 1, "service_upload", Boolean.valueOf(c0Var.Z()));
                }
                l1(sb, 1, "health_monitor", c0Var.N());
                if (c0Var.B0()) {
                    l1(sb, 1, "retry_counter", Integer.valueOf(c0Var.j1()));
                }
                if (c0Var.o0()) {
                    l1(sb, 1, "consent_signals", c0Var.H());
                }
                if (c0Var.w0()) {
                    l1(sb, 1, "is_dma_region", Boolean.valueOf(c0Var.X()));
                }
                if (c0Var.p0()) {
                    l1(sb, 1, "core_platform_services", c0Var.I());
                }
                if (c0Var.n0()) {
                    l1(sb, 1, "consent_diagnostics", c0Var.G());
                }
                if (c0Var.F0()) {
                    l1(sb, 1, "target_os_version", Long.valueOf(c0Var.V1()));
                }
                b4l.a();
                if (vqjVar2.X0(c0Var.e2(), zvj.F0)) {
                    l1(sb, 1, "ad_services_version", Integer.valueOf(c0Var.p()));
                    if (c0Var.c0() && (uVarB2 = c0Var.b2()) != null) {
                        g1(2, sb);
                        sb.append("attribution_eligibility_status {\n");
                        l1(sb, 2, "eligible", Boolean.valueOf(uVarB2.A()));
                        l1(sb, 2, "no_access_adservices_attribution_permission", Boolean.valueOf(uVarB2.D()));
                        l1(sb, 2, "pre_r", Boolean.valueOf(uVarB2.E()));
                        l1(sb, 2, "r_extensions_too_old", Boolean.valueOf(uVarB2.F()));
                        l1(sb, 2, "adservices_extension_too_old", Boolean.valueOf(uVarB2.y()));
                        l1(sb, 2, "ad_storage_not_allowed", Boolean.valueOf(uVarB2.w()));
                        l1(sb, 2, "measurement_manager_disabled", Boolean.valueOf(uVarB2.C()));
                        g1(2, sb);
                        sb.append("}\n");
                    }
                }
                c3l.a();
                if (vqjVar2.X0(null, zvj.S0) && c0Var.a0()) {
                    s sVarA2 = c0Var.a2();
                    g1(2, sb);
                    sb.append("ad_campaign_info {\n");
                    if (sVarA2.Q()) {
                        l1(sb, 2, "deep_link_gclid", sVarA2.K());
                    }
                    if (sVarA2.P()) {
                        l1(sb, 2, "deep_link_gbraid", sVarA2.J());
                    }
                    if (sVarA2.O()) {
                        l1(sb, 2, "deep_link_gad_source", sVarA2.G());
                    }
                    if (sVarA2.R()) {
                        l1(sb, 2, "deep_link_session_millis", Long.valueOf(sVarA2.p()));
                    }
                    if (sVarA2.V()) {
                        l1(sb, 2, "market_referrer_gclid", sVarA2.N());
                    }
                    if (sVarA2.U()) {
                        l1(sb, 2, "market_referrer_gbraid", sVarA2.M());
                    }
                    if (sVarA2.T()) {
                        l1(sb, 2, "market_referrer_gad_source", sVarA2.L());
                    }
                    if (sVarA2.S()) {
                        l1(sb, 2, "market_referrer_click_millis", Long.valueOf(sVarA2.t()));
                    }
                    g1(2, sb);
                    sb.append("}\n");
                }
                dyk<g0> dykVarV = c0Var.V();
                if (dykVarV != null) {
                    for (g0 g0Var : dykVarV) {
                        if (g0Var != null) {
                            g1(2, sb);
                            sb.append("user_property {\n");
                            l1(sb, 2, "set_timestamp_millis", g0Var.H() ? Long.valueOf(g0Var.A()) : null);
                            l1(sb, 2, "name", ogkVar.g(g0Var.C()));
                            l1(sb, 2, "string_value", g0Var.D());
                            l1(sb, 2, "int_value", g0Var.G() ? Long.valueOf(g0Var.y()) : null);
                            l1(sb, 2, "double_value", g0Var.E() ? Double.valueOf(g0Var.p()) : null);
                            g1(2, sb);
                            sb.append("}\n");
                        }
                    }
                }
                dyk<v> dykVarT = c0Var.T();
                if (dykVarT != null) {
                    for (v vVar : dykVarT) {
                        if (vVar != null) {
                            g1(2, sb);
                            sb.append("audience_membership {\n");
                            if (vVar.z()) {
                                l1(sb, 2, "audience_id", Integer.valueOf(vVar.p()));
                            }
                            if (vVar.A()) {
                                l1(sb, 2, "new_audience", Boolean.valueOf(vVar.y()));
                            }
                            n1(sb, "current_data", vVar.w());
                            if (vVar.B()) {
                                n1(sb, "previous_data", vVar.x());
                            }
                            g1(2, sb);
                            sb.append("}\n");
                        }
                    }
                }
                dyk<x> dykVarU = c0Var.U();
                if (dykVarU != null) {
                    for (x xVar : dykVarU) {
                        if (xVar != null) {
                            g1(2, sb);
                            sb.append("event {\n");
                            l1(sb, 2, "name", ogkVar.b(xVar.D()));
                            if (xVar.H()) {
                                l1(sb, 2, "timestamp_millis", Long.valueOf(xVar.B()));
                            }
                            if (xVar.G()) {
                                l1(sb, 2, "previous_timestamp_millis", Long.valueOf(xVar.A()));
                            }
                            if (xVar.F()) {
                                l1(sb, 2, "count", Integer.valueOf(xVar.p()));
                            }
                            if (xVar.y() != 0) {
                                m1(sb, 2, xVar.E());
                            }
                            g1(2, sb);
                            sb.append("}\n");
                        }
                    }
                }
                g1(1, sb);
                sb.append("}\n");
            }
        }
        sb.append("} // End-of-batch\n");
        return sb.toString();
    }

    public List c1(ayk aykVar, List list) {
        int i;
        ArrayList arrayList = new ArrayList(aykVar);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            if (num.intValue() < 0) {
                b0().M.c("Ignoring negative bit index to be cleared", num);
            } else {
                int iIntValue = num.intValue() / 64;
                if (iIntValue >= arrayList.size()) {
                    b0().M.a(num, Integer.valueOf(arrayList.size()), "Ignoring bit index greater than bitSet size");
                } else {
                    arrayList.set(iIntValue, Long.valueOf(((Long) arrayList.get(iIntValue)).longValue() & (~(1 << (num.intValue() % 64)))));
                }
            }
        }
        int size = arrayList.size();
        int size2 = arrayList.size() - 1;
        while (true) {
            int i2 = size2;
            i = size;
            size = i2;
            if (size < 0 || ((Long) arrayList.get(size)).longValue() != 0) {
                break;
            }
            size2 = size - 1;
        }
        return arrayList.subList(0, i);
    }

    public f0l f1(String str, phk phkVar, mhk mhkVar, String str2) {
        int iIndexOf;
        b4l.a();
        umk umkVar = (umk) this.E;
        vqj vqjVar = umkVar.K;
        vqj vqjVar2 = umkVar.K;
        if (!vqjVar.X0(str, zvj.F0)) {
            return null;
        }
        umkVar.R.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        String[] strArrSplit = vqjVar2.U0(str, zvj.g0).split(",");
        HashSet hashSet = new HashSet(strArrSplit.length);
        for (String str3 : strArrSplit) {
            Objects.requireNonNull(str3);
            if (!hashSet.add(str3)) {
                xh6.k("duplicate element: ", str3);
                return null;
            }
        }
        Set setUnmodifiableSet = Collections.unmodifiableSet(hashSet);
        j0l j0lVar = this.F.N;
        pkk pkkVarN0 = j0lVar.N0();
        umk umkVar2 = (umk) j0lVar.E;
        String strG1 = pkkVarN0.g1(str);
        Uri.Builder builder = new Uri.Builder();
        vqj vqjVar3 = umkVar2.K;
        vqj vqjVar4 = umkVar2.K;
        builder.scheme(vqjVar3.U0(str, zvj.Z));
        if (TextUtils.isEmpty(strG1)) {
            builder.authority(vqjVar4.U0(str, zvj.a0));
        } else {
            builder.authority(strG1 + "." + vqjVar4.U0(str, zvj.a0));
        }
        builder.path(vqjVar4.U0(str, zvj.b0));
        h1(builder, "gmp_app_id", ((c0) phkVar.F).M(), setUnmodifiableSet);
        h1(builder, "gmp_version", "102001", setUnmodifiableSet);
        String strD = ((c0) phkVar.F).D();
        yek yekVar = zvj.I0;
        if (vqjVar2.X0(str, yekVar) && N0().h1(str)) {
            strD = "";
        }
        h1(builder, "app_instance_id", strD, setUnmodifiableSet);
        h1(builder, "rdid", ((c0) phkVar.F).Q(), setUnmodifiableSet);
        h1(builder, "bundle_id", phkVar.U(), setUnmodifiableSet);
        String strJ = mhkVar.j();
        String strB = q7j.b(strJ, v40.m, v40.k);
        if (!TextUtils.isEmpty(strB)) {
            strJ = strB;
        }
        h1(builder, "app_event_name", strJ, setUnmodifiableSet);
        h1(builder, "app_version", String.valueOf(((c0) phkVar.F).d0()), setUnmodifiableSet);
        String strO = ((c0) phkVar.F).O();
        if (vqjVar2.X0(str, yekVar) && N0().i1(str) && !TextUtils.isEmpty(strO) && (iIndexOf = strO.indexOf(".")) != -1) {
            strO = strO.substring(0, iIndexOf);
        }
        h1(builder, "os_version", strO, setUnmodifiableSet);
        h1(builder, "timestamp", String.valueOf(mhkVar.i()), setUnmodifiableSet);
        if (((c0) phkVar.F).Y()) {
            h1(builder, "lat", "1", setUnmodifiableSet);
        }
        h1(builder, "privacy_sandbox_version", String.valueOf(((c0) phkVar.F).p()), setUnmodifiableSet);
        h1(builder, "trigger_uri_source", "1", setUnmodifiableSet);
        h1(builder, "trigger_uri_timestamp", String.valueOf(jCurrentTimeMillis), setUnmodifiableSet);
        h1(builder, "request_uuid", str2, setUnmodifiableSet);
        List<z> listK = mhkVar.k();
        Bundle bundle = new Bundle();
        for (z zVar : listK) {
            String strE = zVar.E();
            if (zVar.H()) {
                bundle.putString(strE, String.valueOf(zVar.p()));
            } else if (zVar.I()) {
                bundle.putString(strE, String.valueOf(zVar.w()));
            } else if (zVar.L()) {
                bundle.putString(strE, zVar.F());
            } else if (zVar.J()) {
                bundle.putString(strE, String.valueOf(zVar.B()));
            }
        }
        i1(builder, vqjVar2.U0(str, zvj.f0).split("\\|"), bundle, setUnmodifiableSet);
        List<g0> listUnmodifiableList = Collections.unmodifiableList(((c0) phkVar.F).V());
        Bundle bundle2 = new Bundle();
        for (g0 g0Var : listUnmodifiableList) {
            String strC = g0Var.C();
            if (g0Var.E()) {
                bundle2.putString(strC, String.valueOf(g0Var.p()));
            } else if (g0Var.F()) {
                bundle2.putString(strC, String.valueOf(g0Var.u()));
            } else if (g0Var.I()) {
                bundle2.putString(strC, g0Var.D());
            } else if (g0Var.G()) {
                bundle2.putString(strC, String.valueOf(g0Var.y()));
            }
        }
        i1(builder, vqjVar2.U0(str, zvj.e0).split("\\|"), bundle2, setUnmodifiableSet);
        h1(builder, "dma", ((c0) phkVar.F).X() ? "1" : TaskSessionEvent.REPLAY_FROM_START, setUnmodifiableSet);
        if (!((c0) phkVar.F).I().isEmpty()) {
            h1(builder, "dma_cps", ((c0) phkVar.F).I(), setUnmodifiableSet);
        }
        if (vqjVar2.X0(null, zvj.K0) && ((c0) phkVar.F).a0()) {
            s sVarA2 = ((c0) phkVar.F).a2();
            if (!sVarA2.K().isEmpty()) {
                h1(builder, "dl_gclid", sVarA2.K(), setUnmodifiableSet);
            }
            if (!sVarA2.J().isEmpty()) {
                h1(builder, "dl_gbraid", sVarA2.J(), setUnmodifiableSet);
            }
            if (!sVarA2.G().isEmpty()) {
                h1(builder, "dl_gs", sVarA2.G(), setUnmodifiableSet);
            }
            if (sVarA2.p() > 0) {
                h1(builder, "dl_ss_ts", String.valueOf(sVarA2.p()), setUnmodifiableSet);
            }
            if (!sVarA2.N().isEmpty()) {
                h1(builder, "mr_gclid", sVarA2.N(), setUnmodifiableSet);
            }
            if (!sVarA2.M().isEmpty()) {
                h1(builder, "mr_gbraid", sVarA2.M(), setUnmodifiableSet);
            }
            if (!sVarA2.L().isEmpty()) {
                h1(builder, "mr_gs", sVarA2.L(), setUnmodifiableSet);
            }
            if (sVarA2.t() > 0) {
                h1(builder, "mr_click_ts", String.valueOf(sVarA2.t()), setUnmodifiableSet);
            }
        }
        return new f0l(builder.build().toString(), jCurrentTimeMillis, 1);
    }

    public void j1(StringBuilder sb, int i, c cVar) {
        if (cVar == null) {
            return;
        }
        g1(i, sb);
        sb.append("filter {\n");
        if (cVar.v()) {
            l1(sb, i, "complement", Boolean.valueOf(cVar.u()));
        }
        if (cVar.x()) {
            l1(sb, i, "param_name", ((umk) this.E).Q.f(cVar.t()));
        }
        if (cVar.y()) {
            int i2 = i + 1;
            f fVarS = cVar.s();
            if (fVarS != null) {
                g1(i2, sb);
                sb.append("string_filter");
                sb.append(" {\n");
                if (fVarS.x()) {
                    l1(sb, i2, "match_type", fsh.C(fVarS.q()));
                }
                if (fVarS.w()) {
                    l1(sb, i2, "expression", fVarS.s());
                }
                if (fVarS.v()) {
                    l1(sb, i2, "case_sensitive", Boolean.valueOf(fVarS.u()));
                }
                if (fVarS.p() > 0) {
                    g1(i + 2, sb);
                    sb.append("expression_list {\n");
                    for (String str : fVarS.t()) {
                        g1(i + 3, sb);
                        sb.append(str);
                        sb.append("\n");
                    }
                    sb.append("}\n");
                }
                g1(i2, sb);
                sb.append("}\n");
            }
        }
        if (cVar.w()) {
            k1(sb, i + 1, "number_filter", cVar.r());
        }
        g1(i, sb);
        sb.append("}\n");
    }

    public void m1(StringBuilder sb, int i, dyk dykVar) {
        if (dykVar == null) {
            return;
        }
        int i2 = i + 1;
        Iterator it = dykVar.iterator();
        while (it.hasNext()) {
            z zVar = (z) it.next();
            if (zVar != null) {
                g1(i2, sb);
                sb.append("param {\n");
                l1(sb, i2, "name", zVar.K() ? ((umk) this.E).Q.f(zVar.E()) : null);
                l1(sb, i2, "string_value", zVar.L() ? zVar.F() : null);
                l1(sb, i2, "int_value", zVar.J() ? Long.valueOf(zVar.B()) : null);
                l1(sb, i2, "double_value", zVar.H() ? Double.valueOf(zVar.p()) : null);
                if (zVar.z() > 0) {
                    m1(sb, i2, (dyk) zVar.G());
                }
                g1(i2, sb);
                sb.append("}\n");
            }
        }
    }

    public void p1(nhk nhkVar, Object obj) {
        nhkVar.c();
        z.C((z) nhkVar.F);
        nhkVar.c();
        z.x((z) nhkVar.F);
        nhkVar.c();
        z.v((z) nhkVar.F);
        nhkVar.c();
        z.A((z) nhkVar.F);
        if (obj instanceof String) {
            nhkVar.h((String) obj);
            return;
        }
        if (obj instanceof Long) {
            nhkVar.f(((Long) obj).longValue());
            return;
        }
        if (obj instanceof Double) {
            double dDoubleValue = ((Double) obj).doubleValue();
            nhkVar.c();
            z.q((z) nhkVar.F, dDoubleValue);
            return;
        }
        if (!(obj instanceof Bundle[])) {
            b0().J.c("Ignoring invalid (type) event param value", obj);
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (Bundle bundle : (Bundle[]) obj) {
            if (bundle != null) {
                nhk nhkVarD = z.D();
                for (String str : bundle.keySet()) {
                    nhk nhkVarD2 = z.D();
                    nhkVarD2.g(str);
                    Object obj2 = bundle.get(str);
                    if (obj2 instanceof Long) {
                        nhkVarD2.f(((Long) obj2).longValue());
                    } else if (obj2 instanceof String) {
                        nhkVarD2.h((String) obj2);
                    } else if (obj2 instanceof Double) {
                        double dDoubleValue2 = ((Double) obj2).doubleValue();
                        nhkVarD2.c();
                        z.q((z) nhkVarD2.F, dDoubleValue2);
                    }
                    nhkVarD.c();
                    z.s((z) nhkVarD.F, (z) nhkVarD2.b());
                }
                if (((z) nhkVarD.F).z() > 0) {
                    arrayList.add((z) nhkVarD.b());
                }
            }
        }
        nhkVar.c();
        z.u((z) nhkVar.F, arrayList);
    }

    public void q1(phk phkVar) {
        b0().R.b("Checking account type status for ad personalization signals");
        if (z1(phkVar.U())) {
            b0().Q.b("Turning off ad personalization due to account type");
            shk shkVarB = g0.B();
            shkVarB.c();
            g0.s((g0) shkVarB.F, "_npa");
            wuj wujVarI = ((umk) this.E).i();
            wujVarI.K0();
            long j = wujVarI.K;
            shkVarB.c();
            g0.w((g0) shkVarB.F, j);
            shkVarB.c();
            g0.r((g0) shkVarB.F, 1L);
            g0 g0Var = (g0) shkVarB.b();
            int i = 0;
            while (true) {
                if (i >= ((c0) phkVar.F).t1()) {
                    phkVar.c();
                    c0.z((c0) phkVar.F, g0Var);
                    break;
                } else {
                    if ("_npa".equals(((c0) phkVar.F).e0(i).C())) {
                        phkVar.c();
                        c0.u((c0) phkVar.F, i, g0Var);
                        break;
                    }
                    i++;
                }
            }
            xzd xzdVarK = xzd.K(((c0) phkVar.F).G());
            xzdVarK.N(ork.AD_PERSONALIZATION, rrj.CHILD_ACCOUNT);
            String string = xzdVarK.toString();
            phkVar.c();
            c0.i1((c0) phkVar.F, string);
        }
    }

    public void r1(shk shkVar, Object obj) {
        dgj.v(obj);
        shkVar.c();
        g0.z((g0) shkVar.F);
        shkVar.c();
        g0.v((g0) shkVar.F);
        shkVar.c();
        g0.t((g0) shkVar.F);
        if (obj instanceof String) {
            shkVar.c();
            g0.x((g0) shkVar.F, (String) obj);
        } else if (obj instanceof Long) {
            long jLongValue = ((Long) obj).longValue();
            shkVar.c();
            g0.r((g0) shkVar.F, jLongValue);
        } else {
            if (!(obj instanceof Double)) {
                b0().J.c("Ignoring invalid (type) user attribute value", obj);
                return;
            }
            double dDoubleValue = ((Double) obj).doubleValue();
            shkVar.c();
            g0.q((g0) shkVar.F, dDoubleValue);
        }
    }

    public boolean s1(long j, long j2) {
        if (j == 0 || j2 <= 0) {
            return true;
        }
        ((umk) this.E).R.getClass();
        return Math.abs(System.currentTimeMillis() - j) > j2;
    }

    public byte[] x1(byte[] bArr) throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.close();
            byteArrayOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            this.b0().J.c("Failed to gzip content", e);
            throw e;
        }
    }

    public boolean z1(String str) {
        Account[] result;
        boolean zBooleanValue;
        f2l.a();
        umk umkVar = (umk) this.E;
        if (!umkVar.K.X0(null, zvj.U0)) {
            dgj.v(str);
            mjk mjkVarG1 = M0().G1(str);
            if (mjkVarG1 != null) {
                wuj wujVarI = umkVar.i();
                wujVarI.K0();
                umk umkVar2 = (umk) wujVarI.E;
                ql8 ql8Var = umkVar2.R;
                Context context = umkVar2.E;
                ql8Var.getClass();
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (jCurrentTimeMillis - wujVarI.K > 86400000) {
                    wujVarI.J = null;
                }
                Boolean bool = wujVarI.J;
                if (bool != null) {
                    zBooleanValue = bool.booleanValue();
                } else {
                    if (x44.x(context, "android.permission.GET_ACCOUNTS") != 0) {
                        wujVarI.b0().N.b("Permission error checking for dasher/unicorn accounts");
                        wujVarI.K = jCurrentTimeMillis;
                        wujVarI.J = Boolean.FALSE;
                    } else {
                        if (wujVarI.I == null) {
                            wujVarI.I = AccountManager.get(context);
                        }
                        try {
                            result = wujVarI.I.getAccountsByTypeAndFeatures("com.google", new String[]{"service_HOSTED"}, null, null).getResult();
                        } catch (AuthenticatorException e) {
                            e = e;
                            wujVarI.b0().K.c("Exception checking account types", e);
                        } catch (OperationCanceledException e2) {
                            e = e2;
                            wujVarI.b0().K.c("Exception checking account types", e);
                        } catch (IOException e3) {
                            e = e3;
                            wujVarI.b0().K.c("Exception checking account types", e);
                        }
                        if (result == null || result.length <= 0) {
                            Account[] result2 = wujVarI.I.getAccountsByTypeAndFeatures("com.google", new String[]{"service_uca"}, null, null).getResult();
                            if (result2 != null && result2.length > 0) {
                                wujVarI.J = Boolean.TRUE;
                                wujVarI.K = jCurrentTimeMillis;
                            }
                            wujVarI.K = jCurrentTimeMillis;
                            wujVarI.J = Boolean.FALSE;
                        } else {
                            wujVarI.J = Boolean.TRUE;
                            wujVarI.K = jCurrentTimeMillis;
                        }
                        zBooleanValue = true;
                    }
                    zBooleanValue = false;
                }
                if (zBooleanValue && mjkVarG1.n()) {
                    pkk pkkVarN0 = N0();
                    pkkVarN0.K0();
                    m mVarC1 = pkkVarN0.c1(str);
                    if (mVarC1 == null ? false : mVarC1.F()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
