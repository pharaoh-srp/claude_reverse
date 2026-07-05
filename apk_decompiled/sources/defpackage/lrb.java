package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.location.LocationManager;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.webkit.WebView;
import androidx.compose.material3.internal.ripple.RippleNode;
import androidx.work.impl.foreground.SystemForegroundService;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.core.telemetry.SilentException;
import com.google.firebase.encoders.EncodingException;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.locks.ReentrantLock;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import org.json.JSONObject;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes3.dex */
public class lrb implements qef, i7j, cfd, y5c, i1c, br4, xwg, zdc, dn6 {
    public static lrb I;
    public final /* synthetic */ int E;
    public Object F;
    public Object G;
    public Object H;

    public lrb(String str, int i) {
        this.E = i;
        switch (i) {
            case 2:
                iw7 iw7Var = new iw7();
                iw7Var.m = gkb.k("video/mp2t");
                iw7Var.n = gkb.k(str);
                this.F = new jw7(iw7Var);
                break;
            case 24:
                lrb lrbVar = new lrb(23, false);
                this.G = lrbVar;
                this.H = lrbVar;
                this.F = str;
                break;
            case 28:
                dke dkeVar = new dke();
                this.G = dkeVar;
                this.H = dkeVar;
                this.F = str;
                break;
            default:
                epk epkVar = new epk();
                this.G = epkVar;
                this.H = epkVar;
                this.F = str;
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static h1f A(f1f f1fVar, String str) {
        h1f h1fVarA;
        h1f h1fVar = (h1f) f1fVar;
        if (str.equals(h1fVar.c)) {
            return h1fVar;
        }
        for (Object obj : f1fVar.a()) {
            if (obj instanceof h1f) {
                h1f h1fVar2 = (h1f) obj;
                if (str.equals(h1fVar2.c)) {
                    return h1fVar2;
                }
                if ((obj instanceof f1f) && (h1fVarA = A((f1f) obj, str)) != null) {
                    return h1fVarA;
                }
            }
        }
        return null;
    }

    public static lrb P(Context context, AttributeSet attributeSet, int[] iArr, int i) {
        return new lrb(context, context.obtainStyledAttributes(attributeSet, iArr, i, 0));
    }

    public static final void n(lrb lrbVar, Network network, boolean z) {
        iei ieiVar;
        boolean z2;
        Network[] allNetworks = ((ConnectivityManager) lrbVar.F).getAllNetworks();
        int length = allNetworks.length;
        boolean z3 = false;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            Network network2 = allNetworks[i];
            if (x44.r(network2, network)) {
                z2 = z;
            } else {
                NetworkCapabilities networkCapabilities = ((ConnectivityManager) lrbVar.F).getNetworkCapabilities(network2);
                z2 = networkCapabilities != null && networkCapabilities.hasCapability(12);
            }
            if (z2) {
                z3 = true;
                break;
            }
            i++;
        }
        f1h f1hVar = (f1h) lrbVar.G;
        if (((s4e) f1hVar.F.get()) != null) {
            f1hVar.H = z3;
            ieiVar = iei.a;
        } else {
            ieiVar = null;
        }
        if (ieiVar == null) {
            f1hVar.a();
        }
    }

    public int B() {
        if (F().a.isEmpty()) {
            return -1;
        }
        long j = ((long) ((r5b) w44.L0(F().a)).a) - ((long) F().h);
        if (j < 0) {
            j = 0;
        }
        return (int) j;
    }

    public Typeface C(int i, int i2, bi0 bi0Var) {
        bi0 bi0Var2;
        XmlPullParserException xmlPullParserException;
        IOException iOException;
        int resourceId = ((TypedArray) this.G).getResourceId(i, 0);
        if (resourceId != 0) {
            if (((TypedValue) this.H) == null) {
                this.H = new TypedValue();
            }
            Context context = (Context) this.F;
            TypedValue typedValue = (TypedValue) this.H;
            ThreadLocal threadLocal = iqe.a;
            if (!context.isRestricted()) {
                Resources resources = context.getResources();
                resources.getValue(resourceId, typedValue, true);
                CharSequence charSequence = typedValue.string;
                if (charSequence == null) {
                    throw new Resources.NotFoundException("Resource \"" + resources.getResourceName(resourceId) + "\" (" + Integer.toHexString(resourceId) + ") is not a Font: " + typedValue);
                }
                String string = charSequence.toString();
                if (!string.startsWith("res/")) {
                    bi0Var.i(-3);
                    return null;
                }
                int i3 = typedValue.assetCookie;
                zna znaVar = kbi.b;
                Typeface typeface = (Typeface) znaVar.c(kbi.b(resources, resourceId, string, i3, i2));
                int i4 = 23;
                if (typeface != null) {
                    new Handler(Looper.getMainLooper()).post(new yw5(bi0Var, i4, typeface));
                    return typeface;
                }
                try {
                } catch (IOException e) {
                    e = e;
                    bi0Var2 = bi0Var;
                } catch (XmlPullParserException e2) {
                    e = e2;
                    bi0Var2 = bi0Var;
                }
                try {
                    if (!string.toLowerCase().endsWith(".xml")) {
                        int i5 = typedValue.assetCookie;
                        Typeface typefaceI = kbi.a.i(context, resources, resourceId, string);
                        if (typefaceI != null) {
                            znaVar.d(kbi.b(resources, resourceId, string, i5, i2), typefaceI);
                        }
                        if (typefaceI != null) {
                            new Handler(Looper.getMainLooper()).post(new yw5(bi0Var, i4, typefaceI));
                        } else {
                            bi0Var.i(-3);
                        }
                        return typefaceI;
                    }
                    pu7 pu7VarK = gok.k(resources.getXml(resourceId), resources);
                    if (pu7VarK != null) {
                        return kbi.a(context, pu7VarK, resources, resourceId, string, typedValue.assetCookie, i2, bi0Var, true);
                    }
                    try {
                        Log.e("ResourcesCompat", "Failed to find font-family tag");
                        bi0Var.i(-3);
                        return null;
                    } catch (IOException e3) {
                        iOException = e3;
                        bi0Var2 = bi0Var;
                    } catch (XmlPullParserException e4) {
                        xmlPullParserException = e4;
                        bi0Var2 = bi0Var;
                        Log.e("ResourcesCompat", "Failed to parse xml resource ".concat(string), xmlPullParserException);
                        bi0Var2.i(-3);
                        return null;
                    }
                } catch (IOException e5) {
                    e = e5;
                    iOException = e;
                } catch (XmlPullParserException e6) {
                    e = e6;
                    xmlPullParserException = e;
                    Log.e("ResourcesCompat", "Failed to parse xml resource ".concat(string), xmlPullParserException);
                    bi0Var2.i(-3);
                    return null;
                }
                iOException = e;
                Log.e("ResourcesCompat", "Failed to read xml resource ".concat(string), iOException);
                bi0Var2.i(-3);
                return null;
            }
        }
        return null;
    }

    public boolean D() {
        return !F().a.isEmpty();
    }

    public int E() {
        if (F().a.isEmpty()) {
            return -1;
        }
        long j = ((long) ((r5b) w44.U0(F().a)).a) + ((long) F().h);
        long jL = ((long) L()) - 1;
        if (j > jL) {
            j = jL;
        }
        return (int) j;
    }

    public coc F() {
        coc cocVar = (coc) this.G;
        if (cocVar != null) {
            return cocVar;
        }
        x44.o0("layoutInfo");
        throw null;
    }

    public int G() {
        if (F().a.isEmpty()) {
            return 0;
        }
        return Math.abs(((((r5b) w44.U0(F().a)).j + F().b) + F().c) - F().g);
    }

    public int H() {
        if (F().a.isEmpty()) {
            return 0;
        }
        int i = ((r5b) w44.L0(F().a)).j + (-F().f);
        return Math.abs(i <= 0 ? i : 0);
    }

    public void I(r88 r88Var) {
        try {
            exk exkVar = (exk) this.G;
            voj vojVar = new voj(r88Var);
            Parcel parcelH = exkVar.H();
            gyj.d(parcelH, vojVar);
            exkVar.L(parcelH, 9);
        } catch (RemoteException e) {
            poc.q(e);
        }
    }

    public lrb J() {
        return (lrb) this.H;
    }

    public List K(byte[] bArr) {
        List list = (List) ((ConcurrentMap) this.F).get(new tfd(bArr));
        return list != null ? list : Collections.EMPTY_LIST;
    }

    public int L() {
        return ((Number) ((ow8) this.F).a()).intValue();
    }

    public Typeface M() {
        Object obj = this.H;
        obj.getClass();
        return (Typeface) obj;
    }

    public void N(int i) {
        String strValueOf;
        gjk gjkVarG = ((gjk) this.G).g('\n');
        n96 n96Var = (n96) this.H;
        int iMin = i * n96Var.H;
        int i2 = n96Var.I;
        String[] strArr = xrg.a;
        pqi.l("width must be >= 0", iMin >= 0);
        pqi.m(i2 >= -1);
        if (i2 != -1) {
            iMin = Math.min(iMin, i2);
        }
        String[] strArr2 = xrg.a;
        if (iMin < 21) {
            strValueOf = strArr2[iMin];
        } else {
            char[] cArr = new char[iMin];
            for (int i3 = 0; i3 < iMin; i3++) {
                cArr[i3] = ' ';
            }
            strValueOf = String.valueOf(cArr);
        }
        gjkVarG.h(strValueOf);
    }

    public boolean O() {
        if (((wlg) this.F).getValue() != this.H) {
            return true;
        }
        lrb lrbVar = (lrb) this.G;
        return lrbVar != null && lrbVar.O();
    }

    public void Q(Activity activity, odj odjVar) {
        WeakHashMap weakHashMap = (WeakHashMap) this.H;
        activity.getClass();
        ReentrantLock reentrantLock = (ReentrantLock) this.G;
        reentrantLock.lock();
        try {
            if (odjVar.equals((odj) weakHashMap.get(activity))) {
                return;
            }
            reentrantLock.unlock();
            Iterator it = ((a6g) ((fnf) this.F).F).b.iterator();
            it.getClass();
            while (it.hasNext()) {
                z5g z5gVar = (z5g) it.next();
                if (z5gVar.a.equals(activity)) {
                    z5gVar.c = odjVar;
                    z5gVar.b.accept(odjVar);
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public void R(y3a y3aVar) {
        bpf bpfVar = (bpf) this.H;
        if (bpfVar != null) {
            bpfVar.run();
        }
        bpf bpfVar2 = new bpf((p4a) this.F, y3aVar);
        this.H = bpfVar2;
        ((Handler) this.G).postAtFrontOfQueue(bpfVar2);
    }

    public void S() {
        ((TypedArray) this.G).recycle();
    }

    public h1f T(String str) {
        if (str != null) {
            if (str.startsWith("\"") && str.endsWith("\"")) {
                str = str.substring(1, str.length() - 1).replace("\\\"", "\"");
            } else if (str.startsWith("'") && str.endsWith("'")) {
                str = str.substring(1, str.length() - 1).replace("\\'", "'");
            }
            String strReplace = str.replace("\\\n", "").replace("\\A", "\n");
            if (strReplace.length() > 1 && strReplace.startsWith("#")) {
                String strSubstring = strReplace.substring(1);
                HashMap map = (HashMap) this.H;
                if (strSubstring.length() == 0) {
                    return null;
                }
                if (strSubstring.equals(((c1f) this.F).c)) {
                    return (c1f) this.F;
                }
                if (map.containsKey(strSubstring)) {
                    return (h1f) map.get(strSubstring);
                }
                h1f h1fVarA = A((c1f) this.F, strSubstring);
                map.put(strSubstring, h1fVarA);
                return h1fVarA;
            }
        }
        return null;
    }

    public void U(String str, Object obj) {
        lrb lrbVar = new lrb(23, false);
        ((lrb) this.H).H = lrbVar;
        this.H = lrbVar;
        lrbVar.G = obj;
        lrbVar.F = str;
    }

    public bqj V() {
        return (bqj) this.G;
    }

    public List W() {
        return (ArrayList) this.H;
    }

    @Override // defpackage.qef
    public void a(frh frhVar, yd7 yd7Var, t6f t6fVar) {
        this.G = frhVar;
        t6fVar.d();
        t6fVar.i();
        y3i y3iVarN = yd7Var.n(t6fVar.c, 5);
        this.H = y3iVarN;
        y3iVarN.g((jw7) this.F);
    }

    @Override // defpackage.i1c
    public boolean b() {
        ConnectivityManager connectivityManager = (ConnectivityManager) this.F;
        for (Network network : connectivityManager.getAllNetworks()) {
            NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(network);
            if (networkCapabilities != null && networkCapabilities.hasCapability(12)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.qef
    public void c(ssc sscVar) {
        long jD;
        long j;
        ((frh) this.G).getClass();
        String str = tpi.a;
        frh frhVar = (frh) this.G;
        synchronized (frhVar) {
            try {
                long j2 = frhVar.c;
                jD = j2 != -9223372036854775807L ? j2 + frhVar.b : frhVar.d();
            } finally {
            }
        }
        frh frhVar2 = (frh) this.G;
        synchronized (frhVar2) {
            j = frhVar2.b;
        }
        if (jD == -9223372036854775807L || j == -9223372036854775807L) {
            return;
        }
        jw7 jw7Var = (jw7) this.F;
        if (j != jw7Var.t) {
            iw7 iw7VarA = jw7Var.a();
            iw7VarA.s = j;
            jw7 jw7Var2 = new jw7(iw7VarA);
            this.F = jw7Var2;
            ((y3i) this.H).g(jw7Var2);
        }
        int iA = sscVar.a();
        ((y3i) this.H).e(iA, sscVar);
        ((y3i) this.H).a(jD, 1, iA, 0, null);
    }

    public Object clone() {
        switch (this.E) {
            case 21:
                bqj bqjVar = (bqj) ((bqj) this.F).clone();
                lrb lrbVar = new lrb(21, false);
                lrbVar.F = bqjVar;
                lrbVar.G = (bqj) bqjVar.clone();
                lrbVar.H = new ArrayList();
                Iterator it = ((ArrayList) this.H).iterator();
                while (it.hasNext()) {
                    ((ArrayList) lrbVar.H).add((bqj) ((bqj) it.next()).clone());
                }
                return lrbVar;
            default:
                return super.clone();
        }
    }

    @Override // defpackage.xwg
    public int d(long j) {
        long[] jArr = (long[]) this.H;
        int iA = tpi.a(jArr, j, false);
        if (iA < jArr.length) {
            return iA;
        }
        return -1;
    }

    @Override // defpackage.dn6
    public /* bridge */ /* synthetic */ dn6 e(Class cls, tac tacVar) {
        switch (this.E) {
            case 26:
                ((HashMap) this.F).put(cls, tacVar);
                ((HashMap) this.G).remove(cls);
                break;
            default:
                ((HashMap) this.F).put(cls, tacVar);
                ((HashMap) this.G).remove(cls);
                break;
        }
        return this;
    }

    @Override // defpackage.y5c
    public void f(c5c c5cVar, int i) {
        if (c5cVar.getClass() == ikh.class) {
            r((ikh) c5cVar, 0, i);
        } else if (c5cVar instanceof yj6) {
            o((yj6) c5cVar, i);
        } else {
            p((a2a) c5cVar, i);
        }
    }

    @Override // defpackage.xwg
    public long g(int i) {
        long[] jArr = (long[]) this.H;
        fd9.E(i >= 0);
        fd9.E(i < jArr.length);
        return jArr[i];
    }

    @Override // defpackage.br4
    public Object h(Object obj) {
        efe efeVar = (efe) this.H;
        p8b p8bVar = (p8b) this.F;
        String strD = ((bg9) efeVar.F).d(obj, (znf) this.G);
        tie.Companion.getClass();
        return sie.b(strD, p8bVar);
    }

    @Override // defpackage.xwg
    public List i(long j) {
        List list = (List) this.F;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            long[] jArr = (long[]) this.G;
            int i2 = i * 2;
            if (jArr[i2] <= j && j < jArr[i2 + 1]) {
                v8j v8jVar = (v8j) list.get(i);
                dd5 dd5Var = v8jVar.a;
                if (dd5Var.e == -3.4028235E38f) {
                    arrayList2.add(v8jVar);
                } else {
                    arrayList.add(dd5Var);
                }
            }
        }
        Collections.sort(arrayList2, new z31(20));
        for (int i3 = 0; i3 < arrayList2.size(); i3++) {
            dd5 dd5Var2 = ((v8j) arrayList2.get(i3)).a;
            arrayList.add(new dd5(dd5Var2.a, dd5Var2.b, dd5Var2.c, dd5Var2.d, (-1) - i3, 1, dd5Var2.g, dd5Var2.h, dd5Var2.i, dd5Var2.n, dd5Var2.o, dd5Var2.j, dd5Var2.k, dd5Var2.l, dd5Var2.m, dd5Var2.p, dd5Var2.q, dd5Var2.r));
        }
        return arrayList;
    }

    @Override // defpackage.cfd
    public byte[] k(byte[] bArr, int i) throws GeneralSecurityException {
        byte[] bArrL;
        if (i > 16) {
            throw new InvalidAlgorithmParameterException("outputLength too large, max is 16 bytes");
        }
        if (!gid.a(1)) {
            rl7.j("Can not use AES-CMAC in FIPS-mode.");
            return null;
        }
        Cipher cipher = (Cipher) bo6.b.a.u("AES/ECB/NoPadding");
        cipher.init(1, (SecretKeySpec) this.F);
        int iMax = Math.max(1, (int) Math.ceil(((double) bArr.length) / 16.0d));
        if (iMax * 16 == bArr.length) {
            bArrL = ntj.k((iMax - 1) * 16, 0, 16, bArr, (byte[]) this.G);
        } else {
            byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, (iMax - 1) * 16, bArr.length);
            if (bArrCopyOfRange.length >= 16) {
                sz6.p("x must be smaller than a block.");
                return null;
            }
            byte[] bArrCopyOf = Arrays.copyOf(bArrCopyOfRange, 16);
            bArrCopyOf[bArrCopyOfRange.length] = -128;
            bArrL = ntj.l(bArrCopyOf, (byte[]) this.H);
        }
        byte[] bArrDoFinal = new byte[16];
        for (int i2 = 0; i2 < iMax - 1; i2++) {
            bArrDoFinal = cipher.doFinal(ntj.k(0, i2 * 16, 16, bArrDoFinal, bArr));
        }
        return Arrays.copyOf(cipher.doFinal(ntj.l(bArrL, bArrDoFinal)), i);
    }

    @Override // defpackage.xwg
    public int l() {
        return ((long[]) this.H).length;
    }

    @Override // defpackage.y5c
    public void m(c5c c5cVar, int i) {
        if (c5cVar instanceof yj6) {
            q((yj6) c5cVar, i);
        }
    }

    public void o(yj6 yj6Var, int i) {
        yj6Var.E((gjk) this.G, (n96) this.H);
    }

    @Override // defpackage.i7j
    public void o0(WebView webView, ep1 ep1Var, Uri uri, boolean z, oe9 oe9Var) {
        Object hreVar;
        webView.getClass();
        uri.getClass();
        oe9Var.getClass();
        String strB = ep1Var.b();
        if (strB != null) {
            try {
                hreVar = new JSONObject(strB);
            } catch (Throwable th) {
                hreVar = new hre(th);
            }
            if (hreVar instanceof hre) {
                hreVar = null;
            }
            JSONObject jSONObject = (JSONObject) hreVar;
            if (jSONObject == null) {
                return;
            }
            String strOptString = jSONObject.optString("type");
            if (!x44.r(strOptString, "loaded")) {
                if (x44.r(strOptString, "error")) {
                    String strOptString2 = jSONObject.optString("message", "Unknown error");
                    SilentException.a(new SilentException(ij0.i("PDF.js error: ", strOptString2)), null, false, 3);
                    bz7 bz7Var = (bz7) this.G;
                    strOptString2.getClass();
                    bz7Var.invoke(strOptString2);
                    return;
                }
                return;
            }
            int iOptInt = jSONObject.optInt("pageCount");
            zfa.a.getClass();
            if (yfa.b()) {
                CopyOnWriteArrayList copyOnWriteArrayList = yfa.b;
                ArrayList arrayList = new ArrayList();
                for (Object obj : copyOnWriteArrayList) {
                    ((n30) ((zfa) obj)).getClass();
                    arrayList.add(obj);
                }
                if (!arrayList.isEmpty()) {
                    zfa.a.getClass();
                    String str = "PDF.js: first page rendered (" + iOptInt + " pages)";
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((n30) ((zfa) it.next())).b(sfa.DEBUG, "PdfWebView", str);
                    }
                }
            }
            ((nwb) this.H).setValue(Boolean.TRUE);
            ((bz7) this.F).invoke(Integer.valueOf(iOptInt));
        }
    }

    @Override // defpackage.zdc
    public void onComplete(d5h d5hVar) {
        gxe gxeVar = (gxe) this.G;
        String str = (String) this.F;
        ScheduledFuture scheduledFuture = (ScheduledFuture) this.H;
        synchronized (gxeVar.a) {
            gxeVar.a.remove(str);
        }
        scheduledFuture.cancel(false);
    }

    public void p(a2a a2aVar, int i) {
        a2aVar.E((gjk) this.G, (n96) this.H);
    }

    public void q(yj6 yj6Var, int i) {
        yj6Var.h0((gjk) this.G, (n96) this.H);
    }

    public void r(ikh ikhVar, int i, int i2) {
        yp6.c((gjk) this.G, ikhVar.O(), (n96) this.H, i | 1);
    }

    public void s(cv9 cv9Var, zy7 zy7Var, zy7 zy7Var2, final eeg eegVar, knk knkVar) {
        Object l0Var;
        final h2f h2fVar = (h2f) this.F;
        int i = 20;
        final pza pzaVar = new pza(i, this);
        h2fVar.c = zy7Var;
        h2fVar.d = zy7Var2;
        if (!eegVar.equals((eeg) h2fVar.e) || !x44.r(knkVar, (knk) h2fVar.f) || ((bz7) h2fVar.g) == null) {
            h2fVar.e = eegVar;
            h2fVar.f = knkVar;
            if (knkVar instanceof elc) {
                final elc elcVar = (elc) knkVar;
                c40 c40Var = elcVar.k;
                final l9e l9eVarE = c40Var.e();
                if (((poj) h2fVar.b) == null) {
                    h2fVar.b = new poj();
                }
                poj pojVar = (poj) h2fVar.b;
                pojVar.getClass();
                c40 c40VarA = (c40) pojVar.E;
                if (c40VarA == null) {
                    c40VarA = f40.a();
                    pojVar.E = c40VarA;
                }
                final c40 c40Var2 = c40VarA;
                c40Var2.i();
                c40.b(c40Var2, l9eVarE);
                c40Var2.h(c40Var2, c40Var, 0);
                final long jCeil = (((long) ((int) Math.ceil(l9eVarE.c - l9eVarE.a))) << 32) | (((long) ((int) Math.ceil(l9eVarE.d - l9eVarE.b))) & 4294967295L);
                l0Var = new bz7() { // from class: iu1
                    @Override // defpackage.bz7
                    public final Object invoke(Object obj) {
                        long j = jCeil;
                        pza pzaVar2 = pzaVar;
                        c40 c40Var3 = c40Var2;
                        xd6 xd6Var = (xd6) obj;
                        h2f h2fVar2 = h2fVar;
                        zy7 zy7Var3 = (zy7) h2fVar2.c;
                        zy7Var3.getClass();
                        float fCeil = va6.b(((va6) zy7Var3.a()).E, MTTypesetterKt.kLineSkipLimitMultiplier) ? 1.0f : (float) Math.ceil(xd6Var.q0(r5));
                        float fD = k8g.d(xd6Var.g());
                        ((zy7) h2fVar2.d).getClass();
                        float fMin = Math.min(fCeil, (float) Math.ceil((fD - (((float) Math.ceil(xd6Var.q0(((va6) r8.a()).E))) * 2.0f)) / 2.0f));
                        float f = fMin < MTTypesetterKt.kLineSkipLimitMultiplier ? 0.0f : fMin;
                        ((zy7) h2fVar2.d).getClass();
                        float fCeil2 = (float) Math.ceil(xd6Var.q0(((va6) r5.a()).E));
                        elc elcVar2 = elcVar;
                        eeg eegVar2 = eegVar;
                        if (fCeil2 != MTTypesetterKt.kLineSkipLimitMultiplier || 2.0f * f <= k8g.d(xd6Var.g())) {
                            l9e l9eVar = l9eVarE;
                            float f2 = l9eVar.a;
                            float f3 = l9eVar.b;
                            ((efe) xd6Var.B0().E).G(f2, f3);
                            try {
                                ((poj) h2fVar2.b).getClass();
                                ja8 ja8Var = (ja8) pzaVar2.a();
                                la8 la8Var = ja8Var.a;
                                if (la8Var.m() != 1) {
                                    la8Var.G(1);
                                }
                                xd6Var.t(j, new lu1(l9eVar, elcVar2, eegVar2, f, fCeil2, c40Var3), ja8Var);
                                csg.t(xd6Var, ja8Var);
                            } finally {
                                ((efe) xd6Var.B0().E).G(-f2, -f3);
                            }
                        } else {
                            xd6.Y0(xd6Var, elcVar2.k, eegVar2, MTTypesetterKt.kLineSkipLimitMultiplier, null, null, 0, 60);
                        }
                        return iei.a;
                    }
                };
            } else if (knkVar instanceof glc) {
                glc glcVar = (glc) knkVar;
                if (gb9.A(glcVar.k)) {
                    l0Var = new l6(h2fVar, glcVar, eegVar, 11);
                } else {
                    if (((poj) h2fVar.b) == null) {
                        h2fVar.b = new poj();
                    }
                    poj pojVar2 = (poj) h2fVar.b;
                    pojVar2.getClass();
                    c40 c40VarA2 = (c40) pojVar2.E;
                    if (c40VarA2 == null) {
                        c40VarA2 = f40.a();
                        pojVar2.E = c40VarA2;
                    }
                    aae aaeVar = new aae();
                    aaeVar.E = Float.NaN;
                    l0Var = new e7(h2fVar, aaeVar, new dae(), c40VarA2, glcVar, eegVar, 2);
                }
            } else {
                if (!(knkVar instanceof flc)) {
                    wg6.i();
                    return;
                }
                l0Var = new l0(h2fVar, i, eegVar);
            }
            h2fVar.g = l0Var;
        }
        bz7 bz7Var = (bz7) h2fVar.g;
        bz7Var.getClass();
        bz7Var.invoke(cv9Var);
    }

    @Override // defpackage.i1c
    public void shutdown() {
        ((ConnectivityManager) this.F).unregisterNetworkCallback((x19) this.H);
    }

    public void t(Object obj, ByteArrayOutputStream byteArrayOutputStream) {
        HashMap map = (HashMap) this.F;
        zud zudVar = new zud(byteArrayOutputStream, map, (HashMap) this.G, (tac) this.H);
        if (obj == null) {
            return;
        }
        tac tacVar = (tac) map.get(obj.getClass());
        if (tacVar != null) {
            tacVar.a(obj, zudVar);
            return;
        }
        throw new EncodingException("No encoder for " + obj.getClass());
    }

    public String toString() {
        String str = "";
        switch (this.E) {
            case 0:
                StringBuilder sb = new StringBuilder(32);
                sb.append((String) this.F);
                sb.append('{');
                epk epkVar = (epk) ((epk) this.G).F;
                while (epkVar != null) {
                    Object obj = epkVar.E;
                    sb.append(str);
                    if (obj == null || !obj.getClass().isArray()) {
                        sb.append(obj);
                    } else {
                        String strDeepToString = Arrays.deepToString(new Object[]{obj});
                        sb.append((CharSequence) strDeepToString, 1, strDeepToString.length() - 1);
                    }
                    epkVar = (epk) epkVar.F;
                    str = ", ";
                }
                sb.append('}');
                return sb.toString();
            case 24:
                StringBuilder sb2 = new StringBuilder(32);
                sb2.append((String) this.F);
                sb2.append('{');
                lrb lrbVar = (lrb) ((lrb) this.G).H;
                while (lrbVar != null) {
                    Object obj2 = lrbVar.G;
                    sb2.append(str);
                    String str2 = (String) lrbVar.F;
                    if (str2 != null) {
                        sb2.append(str2);
                        sb2.append('=');
                    }
                    if (obj2 == null || !obj2.getClass().isArray()) {
                        sb2.append(obj2);
                    } else {
                        sb2.append((CharSequence) Arrays.deepToString(new Object[]{obj2}), 1, r4.length() - 1);
                    }
                    lrbVar = (lrb) lrbVar.H;
                    str = ", ";
                }
                sb2.append('}');
                return sb2.toString();
            case 28:
                StringBuilder sb3 = new StringBuilder(32);
                sb3.append((String) this.F);
                sb3.append('{');
                dke dkeVar = (dke) ((dke) this.G).F;
                while (dkeVar != null) {
                    Object obj3 = dkeVar.E;
                    sb3.append(str);
                    if (obj3 == null || !obj3.getClass().isArray()) {
                        sb3.append(obj3);
                    } else {
                        sb3.append((CharSequence) Arrays.deepToString(new Object[]{obj3}), 1, r4.length() - 1);
                    }
                    dkeVar = (dke) dkeVar.F;
                    str = ", ";
                }
                sb3.append('}');
                return sb3.toString();
            default:
                return super.toString();
        }
    }

    public List u() {
        return (List) this.G;
    }

    public yh3 v() {
        return (yh3) this.F;
    }

    public ColorStateList w(int i) {
        int resourceId;
        ColorStateList colorStateListK;
        TypedArray typedArray = (TypedArray) this.G;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (colorStateListK = x44.K((Context) this.F, resourceId)) == null) ? typedArray.getColorStateList(i) : colorStateListK;
    }

    public sp0 x() {
        int i;
        float f;
        float fC;
        int i2;
        c1f c1fVar = (c1f) this.F;
        n0f n0fVar = c1fVar.r;
        n0f n0fVar2 = c1fVar.s;
        if (n0fVar == null || n0fVar.h() || (i = n0fVar.F) == 9 || i == 2 || i == 3) {
            return new sp0(-1.0f, -1.0f, -1.0f, -1.0f, 2);
        }
        float fC2 = n0fVar.c();
        if (n0fVar2 == null) {
            sp0 sp0Var = ((c1f) this.F).o;
            if (sp0Var == null) {
                f = fC2;
                return new sp0(MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, fC2, f, 2);
            }
            fC = (sp0Var.e * fC2) / sp0Var.d;
        } else {
            if (n0fVar2.h() || (i2 = n0fVar2.F) == 9 || i2 == 2 || i2 == 3) {
                return new sp0(-1.0f, -1.0f, -1.0f, -1.0f, 2);
            }
            fC = n0fVar2.c();
        }
        f = fC;
        return new sp0(MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, fC2, f, 2);
    }

    public Drawable y(int i) {
        int resourceId;
        TypedArray typedArray = (TypedArray) this.G;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0) ? typedArray.getDrawable(i) : xn5.c0((Context) this.F, resourceId);
    }

    public Drawable z(int i) {
        int resourceId;
        Drawable drawableD;
        if (!((TypedArray) this.G).hasValue(i) || (resourceId = ((TypedArray) this.G).getResourceId(i, 0)) == 0) {
            return null;
        }
        ch0 ch0VarA = ch0.a();
        Context context = (Context) this.F;
        synchronized (ch0VarA) {
            drawableD = ch0VarA.a.d(resourceId, context, true);
        }
        return drawableD;
    }

    public lrb(gj7 gj7Var, bz7 bz7Var, bz7 bz7Var2, nwb nwbVar) {
        this.E = 3;
        this.F = bz7Var;
        this.G = bz7Var2;
        this.H = nwbVar;
    }

    public /* synthetic */ lrb(gxe gxeVar, String str, ScheduledFuture scheduledFuture) {
        this.E = 22;
        this.G = gxeVar;
        this.F = str;
        this.H = scheduledFuture;
    }

    public lrb(jwf jwfVar, String str, h24 h24Var) {
        this.E = 15;
        jwfVar.getClass();
        this.G = jwfVar;
        this.F = str;
        this.H = h24Var;
    }

    public /* synthetic */ lrb(Object obj, Object obj2, Object obj3, int i) {
        this.E = i;
        this.F = obj;
        this.G = obj2;
        this.H = obj3;
    }

    public lrb(int i) {
        this.E = i;
        switch (i) {
            case 27:
                this.F = new HashMap();
                this.G = new HashMap();
                this.H = urj.e;
                break;
            default:
                this.F = new HashMap();
                this.G = new HashMap();
                this.H = urj.d;
                break;
        }
    }

    public lrb(kta ktaVar, exk exkVar) {
        this.E = 25;
        this.G = exkVar;
        dgj.v(ktaVar);
        this.F = ktaVar;
    }

    public lrb(SystemForegroundService systemForegroundService) {
        this.E = 14;
        this.F = new p4a(systemForegroundService, true);
        this.G = new Handler(Looper.getMainLooper());
    }

    public lrb(ArrayList arrayList) {
        this.E = 20;
        this.F = Collections.unmodifiableList(new ArrayList(arrayList));
        this.G = new long[arrayList.size() * 2];
        for (int i = 0; i < arrayList.size(); i++) {
            v8j v8jVar = (v8j) arrayList.get(i);
            int i2 = i * 2;
            long[] jArr = (long[]) this.G;
            jArr[i2] = v8jVar.b;
            jArr[i2 + 1] = v8jVar.c;
        }
        long[] jArr2 = (long[]) this.G;
        long[] jArrCopyOf = Arrays.copyOf(jArr2, jArr2.length);
        this.H = jArrCopyOf;
        Arrays.sort(jArrCopyOf);
    }

    public lrb(byte[] bArr) throws GeneralSecurityException {
        this.E = 5;
        rqi.a(bArr.length);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        this.F = secretKeySpec;
        if (gid.a(1)) {
            Cipher cipher = (Cipher) bo6.b.a.u("AES/ECB/NoPadding");
            cipher.init(1, secretKeySpec);
            byte[] bArrH = lnk.h(cipher.doFinal(new byte[16]));
            this.G = bArrH;
            this.H = lnk.h(bArrH);
            return;
        }
        rl7.j("Can not use AES-CMAC in FIPS-mode.");
        throw null;
    }

    public lrb(ow8 ow8Var) {
        this.E = 1;
        this.F = ow8Var;
    }

    public lrb(yh3 yh3Var, List list, lrb lrbVar) {
        this.E = 4;
        yh3Var.getClass();
        list.getClass();
        this.F = yh3Var;
        this.G = list;
        this.H = lrbVar;
    }

    public lrb(Context context, TypedArray typedArray) {
        this.E = 17;
        this.F = context;
        this.G = typedArray;
    }

    public lrb(Context context, LocationManager locationManager) {
        this.E = 18;
        this.H = new cxg();
        this.F = context;
        this.G = locationManager;
    }

    public lrb(ConnectivityManager connectivityManager, f1h f1hVar) {
        this.E = 9;
        this.F = connectivityManager;
        this.G = f1hVar;
        x19 x19Var = new x19(2, this);
        this.H = x19Var;
        connectivityManager.registerNetworkCallback(new NetworkRequest.Builder().addCapability(12).build(), x19Var);
    }

    public lrb(cke ckeVar, kie kieVar, bdc bdcVar) {
        this.E = 10;
        this.H = ckeVar;
        this.F = kieVar;
        this.G = bdcVar;
    }

    public /* synthetic */ lrb(int i, boolean z) {
        this.E = i;
    }

    public lrb(ubi ubiVar, lrb lrbVar) {
        this.E = 19;
        this.F = ubiVar;
        this.G = lrbVar;
        this.H = ubiVar.getValue();
    }

    public lrb(ConcurrentMap concurrentMap, sfd sfdVar, yqb yqbVar, Class cls) {
        this.E = 6;
        this.F = concurrentMap;
        this.G = sfdVar;
        this.H = yqbVar;
    }

    public lrb(fnf fnfVar) {
        this.E = 16;
        this.F = fnfVar;
        this.G = new ReentrantLock();
        this.H = new WeakHashMap();
    }

    public lrb(RippleNode rippleNode) {
        this.E = 11;
        this.H = rippleNode;
        this.F = new h2f(2);
    }
}
