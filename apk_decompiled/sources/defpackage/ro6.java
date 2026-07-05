package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import android.util.SparseArray;
import android.view.inputmethod.InputContentInfo;
import android.webkit.WebView;
import android.widget.TextView;
import androidx.media3.common.ParserException;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.R;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.google.crypto.tink.shaded.protobuf.a;
import com.google.crypto.tink.shaded.protobuf.e;
import com.google.crypto.tink.shaded.protobuf.f;
import java.io.IOException;
import java.net.ProtocolException;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.MissingFormatArgumentException;
import java.util.Optional;
import java.util.UUID;
import java.util.concurrent.ExecutionException;
import java.util.regex.Pattern;
import okio.Okio;
import okio.RealBufferedSource;
import okio.Source;
import org.chromium.net.UrlRequest;
import org.chromium.net.UrlResponseInfo;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: loaded from: classes3.dex */
public class ro6 implements g08, kbc, see, i7j, br4, sr9, s08 {
    public final /* synthetic */ int E;
    public Object F;

    public ro6(yf yfVar, Class cls) {
        this.E = 6;
        if (yfVar.b.keySet().contains(cls) || Void.class.equals(cls)) {
            this.F = yfVar;
        } else {
            sz6.p(ij0.k("Given internalKeyMananger ", yfVar.toString(), " does not support primitive class ", cls.getName()));
            throw null;
        }
    }

    public static boolean W(Bundle bundle) {
        return "1".equals(bundle.getString("gcm.n.e")) || "1".equals(bundle.getString("gcm.n.e".replace("gcm.n.", "gcm.notification.")));
    }

    public static xzd Y() {
        return new xzd(0, false);
    }

    public static String e0(String str) {
        return str.startsWith("gcm.n.") ? str.substring(6) : str;
    }

    public synchronized cq9 A(ro9 ro9Var, bmc bmcVar) {
        int iA;
        synchronized (this) {
            iA = rpi.a();
            while (X(iA)) {
                iA = rpi.a();
            }
        }
        return (cq9) bq9VarF.b();
        if (bmcVar == bmc.UNKNOWN_PREFIX) {
            throw new GeneralSecurityException("unknown output prefix type");
        }
        bq9 bq9VarF = cq9.F();
        bq9VarF.f();
        cq9.w((cq9) bq9VarF.F, ro9Var);
        bq9VarF.f();
        cq9.z((cq9) bq9VarF.F, iA);
        bq9VarF.f();
        cq9.y((cq9) bq9VarF.F);
        bq9VarF.f();
        cq9.x((cq9) bq9VarF.F, bmcVar);
        return (cq9) bq9VarF.b();
    }

    /* JADX WARN: Code restructure failed: missing block: B:180:0x0314, code lost:
    
        r3 = r7.length / 2;
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x0318, code lost:
    
        if (r7 >= r3) goto L272;
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x031a, code lost:
    
        r9 = ((r3 - r7) / 2) + r7;
        r30 = r3;
        r3 = r2.d;
        r31 = r9 * 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x0329, code lost:
    
        if (r3[r31] > r4) goto L189;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x032f, code lost:
    
        if (r4 > r3[r31 + 1]) goto L188;
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x034b, code lost:
    
        r7 = r11;
        r11 = r14;
        r14 = r18;
        r3 = r29;
        r18 = r13;
        r13 = r7;
        r7 = r9 + 1;
        r9 = r30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x035a, code lost:
    
        r3 = r13;
        r13 = r11;
        r11 = r14;
        r14 = r18;
        r18 = r3;
        r3 = r29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x0363, code lost:
    
        r29 = r14;
        r14 = r11;
        r11 = r13;
        r13 = r18;
        r18 = r29;
        r29 = r3;
        r3 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00f8, code lost:
    
        r23 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00fa, code lost:
    
        r10 = r9;
        r14 = r18;
        r4 = 0;
     */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x038b  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x039d  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x03a7  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x03db  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0403  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0408  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0414  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x041e  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x00fa A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:262:0x03c0 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:265:0x03ac A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00b3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean B() {
        /*
            Method dump skipped, instruction units count: 1128
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ro6.B():boolean");
    }

    public boolean C(String str) {
        String strS = S(str);
        return "1".equals(strS) || Boolean.parseBoolean(strS);
    }

    public Integer D(String str) {
        String strS = S(str);
        if (TextUtils.isEmpty(strS)) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt(strS));
        } catch (NumberFormatException unused) {
            Log.w("NotificationParams", "Couldn't parse value of " + e0(str) + "(" + strS + ") into an int");
            return null;
        }
    }

    public ArrayList E(z zVar) {
        t44 t44Var;
        p0a p0aVar = (p0a) this.F;
        ukc ukcVar = p0aVar.p;
        boolean z = p0aVar.o;
        int iOrdinal = ukcVar.ordinal();
        ArrayList arrayList = null;
        if (iOrdinal == 0) {
            t44Var = new t44(zVar.c, zVar.d);
        } else {
            if (iOrdinal != 1) {
                wg6.i();
                return null;
            }
            t44Var = new t44(zVar.a, zVar.b);
        }
        if (z) {
            t44Var = new t44(t44Var.b, t44Var.a);
        } else if (z) {
            wg6.i();
            return null;
        }
        u8f u8fVarR = R(t44Var);
        float f = u8fVarR.a;
        float f2 = u8fVarR.b;
        int iOrdinal2 = ((p0a) this.F).p.ordinal();
        if (iOrdinal2 == 0) {
            ArrayList arrayListU = U();
            arrayList = new ArrayList();
            for (Object obj : arrayListU) {
                bhe bheVar = (bhe) obj;
                if (((int) (bheVar.d() & 4294967295L)) >= f && ((int) (bheVar.d() & 4294967295L)) + ((int) (bheVar.e() & 4294967295L)) <= f2) {
                    arrayList.add(obj);
                }
            }
        } else if (iOrdinal2 == 1) {
            ArrayList arrayListU2 = U();
            arrayList = new ArrayList();
            for (Object obj2 : arrayListU2) {
                bhe bheVar2 = (bhe) obj2;
                if (((int) (bheVar2.d() >> 32)) >= f && ((int) (bheVar2.d() >> 32)) + ((int) (bheVar2.e() >> 32)) <= f2) {
                    arrayList.add(obj2);
                }
            }
        } else {
            wg6.i();
        }
        return arrayList;
    }

    public JSONArray F(String str) {
        String strS = S(str);
        if (TextUtils.isEmpty(strS)) {
            return null;
        }
        try {
            return new JSONArray(strS);
        } catch (JSONException unused) {
            Log.w("NotificationParams", "Malformed JSON for key " + e0(str) + ": " + strS + ", falling back to default");
            return null;
        }
    }

    @Override // defpackage.kbc
    public void G(Object obj) {
        Integer num = (Integer) obj;
        gl7 gl7Var = (gl7) this.F;
        Handler handler = gl7Var.O0;
        k51 k51Var = gl7Var.P0;
        handler.removeCallbacks(k51Var);
        int iIntValue = num.intValue();
        if (gl7Var.T0 != null) {
            int i = gl7Var.Q0.w;
            Context contextJ = gl7Var.j();
            Drawable drawable = null;
            if (contextJ == null) {
                Log.w("FingerprintFragment", "Unable to get asset. Context is null.");
            } else {
                int i2 = R.drawable.fingerprint_dialog_fp_icon;
                if (i == 0 && iIntValue == 1) {
                    drawable = contextJ.getDrawable(i2);
                } else {
                    if (i == 1 && iIntValue == 2) {
                        i2 = 2131231226;
                    } else if ((i == 2 && iIntValue == 1) || (i == 1 && iIntValue == 3)) {
                    }
                    drawable = contextJ.getDrawable(i2);
                }
            }
            if (drawable != null) {
                gl7Var.T0.setImageDrawable(drawable);
                if ((i != 0 || iIntValue != 1) && ((i == 1 && iIntValue == 2) || (i == 2 && iIntValue == 1))) {
                    el7.a(drawable);
                }
                gl7Var.Q0.w = iIntValue;
            }
        }
        int iIntValue2 = num.intValue();
        TextView textView = gl7Var.U0;
        if (textView != null) {
            textView.setTextColor(iIntValue2 == 2 ? gl7Var.R0 : gl7Var.S0);
        }
        handler.postDelayed(k51Var, 2000L);
    }

    public synchronized xv8 H() {
        return xv8.m((dq9) ((aq9) this.F).b());
    }

    public int[] I() {
        JSONArray jSONArrayF = F("gcm.n.light_settings");
        if (jSONArrayF == null) {
            return null;
        }
        int[] iArr = new int[3];
        try {
            if (jSONArrayF.length() != 3) {
                throw new JSONException("lightSettings don't have all three fields");
            }
            int color = Color.parseColor(jSONArrayF.optString(0));
            if (color == -16777216) {
                throw new IllegalArgumentException("Transparent color is invalid");
            }
            iArr[0] = color;
            iArr[1] = jSONArrayF.optInt(1);
            iArr[2] = jSONArrayF.optInt(2);
            return iArr;
        } catch (IllegalArgumentException e) {
            Log.w("NotificationParams", "LightSettings is invalid: " + jSONArrayF + ". " + e.getMessage() + ". Skipping setting LightSettings");
            return null;
        } catch (JSONException unused) {
            Log.w("NotificationParams", "LightSettings is invalid: " + jSONArrayF + ". Skipping setting LightSettings");
            return null;
        }
    }

    public Object[] J(String str) {
        JSONArray jSONArrayF = F(str.concat("_loc_args"));
        if (jSONArrayF == null) {
            return null;
        }
        int length = jSONArrayF.length();
        String[] strArr = new String[length];
        for (int i = 0; i < length; i++) {
            strArr[i] = jSONArrayF.optString(i);
        }
        return strArr;
    }

    public String K(String str) {
        return S(str.concat("_loc_key"));
    }

    public Long L() {
        String strS = S("gcm.n.event_time");
        if (TextUtils.isEmpty(strS)) {
            return null;
        }
        try {
            return Long.valueOf(Long.parseLong(strS));
        } catch (NumberFormatException unused) {
            Log.w("NotificationParams", "Couldn't parse value of " + e0("gcm.n.event_time") + "(" + strS + ") into a long");
            return null;
        }
    }

    public ukc M() {
        return ((p0a) this.F).p;
    }

    public Pattern N(String str) {
        Object obj;
        at atVar = (at) this.F;
        synchronized (atVar) {
            obj = ((hw4) atVar.G).get(str);
        }
        Pattern pattern = (Pattern) obj;
        if (pattern != null) {
            return pattern;
        }
        Pattern patternCompile = Pattern.compile(str);
        at atVar2 = (at) this.F;
        synchronized (atVar2) {
            ((hw4) atVar2.G).put(str, patternCompile);
        }
        return patternCompile;
    }

    public String O(Resources resources, String str, String str2) {
        String strS = S(str2);
        if (!TextUtils.isEmpty(strS)) {
            return strS;
        }
        String strK = K(str2);
        if (TextUtils.isEmpty(strK)) {
            return null;
        }
        int identifier = resources.getIdentifier(strK, "string", str);
        if (identifier == 0) {
            Log.w("NotificationParams", e0(str2.concat("_loc_key")) + " resource not found: " + str2 + " Default value will be used.");
            return null;
        }
        Object[] objArrJ = J(str2);
        if (objArrJ == null) {
            return resources.getString(identifier);
        }
        try {
            return resources.getString(identifier, objArrJ);
        } catch (MissingFormatArgumentException e) {
            Log.w("NotificationParams", "Missing format argument for " + e0(str2) + ": " + Arrays.toString(objArrJ) + " Default value will be used.", e);
            return null;
        }
    }

    public pqe P() throws IOException {
        long j;
        p8b p8bVarD;
        List<String> list;
        lrb lrbVar = (lrb) this.F;
        sqe sqeVar = ((cke) lrbVar.H).c;
        kie kieVar = (kie) lrbVar.F;
        bdc bdcVar = (bdc) lrbVar.G;
        qqe qqeVar = rqe.E;
        gmf gmfVar = new gmf(16);
        exf exfVar = bdcVar.e;
        qz8 qz8Var = sqe.a;
        try {
            UrlResponseInfo urlResponseInfo = (UrlResponseInfo) x41.n(exfVar);
            List<String> list2 = urlResponseInfo.getAllHeaders().get("Content-Type");
            String str = (list2 == null || list2.isEmpty()) ? null : (String) qwk.l(list2);
            ArrayList arrayList = new ArrayList();
            Map<String, List<String>> allHeaders = urlResponseInfo.getAllHeaders();
            List<String> list3 = Collections.EMPTY_LIST;
            List<String> list4 = allHeaders.get("Content-Encoding");
            if (list4 == null) {
                list3.getClass();
            } else {
                list3 = list4;
            }
            for (String str2 : list3) {
                m11 m11Var = sqe.b;
                m11Var.getClass();
                str2.getClass();
                Iterable z5cVar = new z5c(m11Var, str2);
                if (z5cVar instanceof Collection) {
                    arrayList.addAll((Collection) z5cVar);
                } else {
                    Iterator it = z5cVar.iterator();
                    while (true) {
                        sig sigVar = (sig) it;
                        if (sigVar.hasNext()) {
                            arrayList.add(sigVar.next());
                        }
                    }
                }
            }
            boolean z = arrayList.isEmpty() || !sqe.a.containsAll(arrayList);
            String str3 = (!z || (list = urlResponseInfo.getAllHeaders().get("Content-Length")) == null || list.isEmpty()) ? null : (String) qwk.l(list);
            int httpStatusCode = urlResponseInfo.getHttpStatusCode();
            try {
                Source source = (Source) x41.n(bdcVar.a);
                if (kieVar.b.equals("HEAD")) {
                    j = 0;
                } else {
                    j = -1;
                    if (str3 != null) {
                        try {
                            j = Long.parseLong(str3);
                        } catch (NumberFormatException unused) {
                        }
                    }
                }
                if ((httpStatusCode == 204 || httpStatusCode == 205) && j > 0) {
                    throw new ProtocolException(vb7.k(httpStatusCode, "HTTP ", " had non-zero Content-Length: ", str3));
                }
                if (str != null) {
                    ide ideVar = p8b.e;
                    try {
                        p8bVarD = nai.D(str);
                    } catch (IllegalArgumentException unused2) {
                        p8bVarD = null;
                    }
                } else {
                    p8bVarD = null;
                }
                RealBufferedSource realBufferedSourceC = Okio.c(source);
                qqe qqeVar2 = rqe.E;
                qqe qqeVar3 = new qqe(p8bVarD, j, realBufferedSourceC);
                boolean z2 = z;
                int httpStatusCode2 = urlResponseInfo.getHttpStatusCode();
                String httpStatusText = urlResponseInfo.getHttpStatusText();
                httpStatusText.getClass();
                String negotiatedProtocol = urlResponseInfo.getNegotiatedProtocol();
                boolean zContains = negotiatedProtocol.contains("quic");
                bvd bvdVar = bvd.QUIC;
                if (!zContains && !negotiatedProtocol.contains("h3")) {
                    boolean zContains2 = negotiatedProtocol.contains("spdy");
                    bvdVar = bvd.HTTP_2;
                    if (!zContains2 && !negotiatedProtocol.contains("h2")) {
                        bvdVar = negotiatedProtocol.contains("http1.1") ? bvd.HTTP_1_1 : bvd.HTTP_1_0;
                    }
                }
                for (Map.Entry<String, String> entry : urlResponseInfo.getAllHeadersAsList()) {
                    if (z2 || (!auk.e(entry.getKey(), "Content-Length") && !auk.e(entry.getKey(), "Content-Encoding"))) {
                        String key = entry.getKey();
                        String value = entry.getValue();
                        key.getClass();
                        value.getClass();
                        gmfVar.s(key, value);
                    }
                }
                if (httpStatusCode2 >= 0) {
                    return new pqe(kieVar, bvdVar, httpStatusText, httpStatusCode2, null, gmfVar.v(), qqeVar3, null, null, null, null, 0L, 0L, null, t4i.t);
                }
                mr9.f(grc.p(httpStatusCode2, "code < 0: "));
                return null;
            } catch (ExecutionException e) {
                throw new IOException(e);
            }
        } catch (ExecutionException e2) {
            throw new IOException(e2);
        }
    }

    public boolean Q() {
        return ((p0a) this.F).o;
    }

    public u8f R(t44 t44Var) {
        long jG;
        float f = t44Var.a;
        float f2 = t44Var.b;
        p0a p0aVar = (p0a) this.F;
        int iOrdinal = p0aVar.p.ordinal();
        if (iOrdinal == 0) {
            jG = p0aVar.g() & 4294967295L;
        } else {
            if (iOrdinal != 1) {
                wg6.i();
                return null;
            }
            jG = p0aVar.g() >> 32;
        }
        return new u8f(f, ((int) jG) - f2);
    }

    public String S(String str) {
        Bundle bundle = (Bundle) this.F;
        if (!bundle.containsKey(str) && str.startsWith("gcm.n.")) {
            String strReplace = !str.startsWith("gcm.n.") ? str : str.replace("gcm.n.", "gcm.notification.");
            if (bundle.containsKey(strReplace)) {
                str = strReplace;
            }
        }
        return bundle.getString(str);
    }

    public long[] T() {
        JSONArray jSONArrayF = F("gcm.n.vibrate_timings");
        if (jSONArrayF == null) {
            return null;
        }
        try {
            if (jSONArrayF.length() <= 1) {
                throw new JSONException("vibrateTimings have invalid length");
            }
            int length = jSONArrayF.length();
            long[] jArr = new long[length];
            for (int i = 0; i < length; i++) {
                jArr[i] = jSONArrayF.optLong(i);
            }
            return jArr;
        } catch (NumberFormatException | JSONException unused) {
            Log.w("NotificationParams", "User defined vibrateTimings is invalid: " + jSONArrayF + ". Skipping setting vibrateTimings.");
            return null;
        }
    }

    public ArrayList U() {
        p0a p0aVar = (p0a) this.F;
        List list = p0aVar.k;
        ArrayList arrayList = new ArrayList(x44.y(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new bhe((q0a) it.next(), p0aVar.p));
        }
        return arrayList;
    }

    public void V(int i, long j) throws ParserException {
        rwa rwaVar = (rwa) this.F;
        if (i == 240) {
            if (rwaVar.z) {
                return;
            }
            rwaVar.g(i);
            if (rwaVar.H == -1) {
                rwaVar.H = j;
                return;
            }
            return;
        }
        if (i == 241) {
            if (rwaVar.z) {
                return;
            }
            rwaVar.g(i);
            if (rwaVar.G == -1) {
                rwaVar.G = j;
                return;
            }
            return;
        }
        if (i == 20529) {
            if (j == 0) {
                return;
            }
            throw ParserException.a(null, "ContentEncodingOrder " + j + " not supported");
        }
        if (i == 20530) {
            if (j == 1) {
                return;
            }
            throw ParserException.a(null, "ContentEncodingScope " + j + " not supported");
        }
        switch (i) {
            case 131:
                int i2 = (int) j;
                if (i2 == 1) {
                    rwaVar.h(i);
                    rwaVar.y.e = 2;
                    return;
                }
                if (i2 == 2) {
                    rwaVar.h(i);
                    rwaVar.y.e = 1;
                    return;
                } else if (i2 == 17) {
                    rwaVar.h(i);
                    rwaVar.y.e = 3;
                    return;
                } else if (i2 != 33) {
                    rwaVar.h(i);
                    rwaVar.y.e = -1;
                    return;
                } else {
                    rwaVar.h(i);
                    rwaVar.y.e = 5;
                    return;
                }
            case 136:
                rwaVar.h(i);
                rwaVar.y.Y = j == 1;
                return;
            case 155:
                rwaVar.Q = rwaVar.n(j);
                return;
            case 159:
                rwaVar.h(i);
                rwaVar.y.Q = (int) j;
                return;
            case 176:
                rwaVar.h(i);
                rwaVar.y.n = (int) j;
                return;
            case 179:
                if (rwaVar.z) {
                    return;
                }
                rwaVar.g(i);
                rwaVar.E = rwaVar.n(j);
                return;
            case 186:
                rwaVar.h(i);
                rwaVar.y.o = (int) j;
                return;
            case 215:
                rwaVar.h(i);
                rwaVar.y.d = (int) j;
                return;
            case 231:
                rwaVar.M = rwaVar.n(j);
                return;
            case 238:
                rwaVar.X = (int) j;
                return;
            case 247:
                if (rwaVar.z) {
                    return;
                }
                rwaVar.g(i);
                rwaVar.F = (int) j;
                return;
            case 251:
                rwaVar.Y = true;
                return;
            case 16871:
                rwaVar.h(i);
                rwaVar.y.h = (int) j;
                return;
            case 16980:
                if (j == 3) {
                    return;
                }
                throw ParserException.a(null, "ContentCompAlgo " + j + " not supported");
            case 17029:
                if (j < 1 || j > 2) {
                    throw ParserException.a(null, "DocTypeReadVersion " + j + " not supported");
                }
                return;
            case 17143:
                if (j == 1) {
                    return;
                }
                throw ParserException.a(null, "EBMLReadVersion " + j + " not supported");
            case 18401:
                if (j == 5) {
                    return;
                }
                throw ParserException.a(null, "ContentEncAlgo " + j + " not supported");
            case 18408:
                if (j == 1) {
                    return;
                }
                throw ParserException.a(null, "AESSettingsCipherMode " + j + " not supported");
            case 21420:
                rwaVar.B = j + rwaVar.s;
                return;
            case 21432:
                int i3 = (int) j;
                rwaVar.h(i);
                if (i3 == 0) {
                    rwaVar.y.y = 0;
                    return;
                }
                if (i3 == 1) {
                    rwaVar.y.y = 2;
                    return;
                } else if (i3 == 3) {
                    rwaVar.y.y = 1;
                    return;
                } else {
                    if (i3 != 15) {
                        return;
                    }
                    rwaVar.y.y = 3;
                    return;
                }
            case 21680:
                rwaVar.h(i);
                rwaVar.y.q = (int) j;
                return;
            case 21682:
                rwaVar.h(i);
                rwaVar.y.s = (int) j;
                return;
            case 21690:
                rwaVar.h(i);
                rwaVar.y.r = (int) j;
                return;
            case 21930:
                rwaVar.h(i);
                rwaVar.y.X = j == 1;
                return;
            case 21938:
                rwaVar.h(i);
                qwa qwaVar = rwaVar.y;
                qwaVar.z = true;
                qwaVar.p = (int) j;
                return;
            case 21998:
                rwaVar.h(i);
                rwaVar.y.g = (int) j;
                return;
            case 22186:
                rwaVar.h(i);
                rwaVar.y.T = j;
                return;
            case 22203:
                rwaVar.h(i);
                rwaVar.y.U = j;
                return;
            case 25188:
                rwaVar.h(i);
                rwaVar.y.R = (int) j;
                return;
            case 30114:
                rwaVar.Z = j;
                return;
            case 30321:
                rwaVar.h(i);
                int i4 = (int) j;
                if (i4 == 0) {
                    rwaVar.y.t = 0;
                    return;
                }
                if (i4 == 1) {
                    rwaVar.y.t = 1;
                    return;
                } else if (i4 == 2) {
                    rwaVar.y.t = 2;
                    return;
                } else {
                    if (i4 != 3) {
                        return;
                    }
                    rwaVar.y.t = 3;
                    return;
                }
            case 2352003:
                rwaVar.h(i);
                rwaVar.y.f = (int) j;
                return;
            case 2807729:
                rwaVar.t = j;
                return;
            default:
                switch (i) {
                    case 21945:
                        rwaVar.h(i);
                        int i5 = (int) j;
                        if (i5 == 1) {
                            rwaVar.y.C = 2;
                            return;
                        } else {
                            if (i5 != 2) {
                                return;
                            }
                            rwaVar.y.C = 1;
                            return;
                        }
                    case 21946:
                        rwaVar.h(i);
                        int iG = f54.g((int) j);
                        if (iG != -1) {
                            rwaVar.y.B = iG;
                            return;
                        }
                        return;
                    case 21947:
                        rwaVar.h(i);
                        rwaVar.y.z = true;
                        int iF = f54.f((int) j);
                        if (iF != -1) {
                            rwaVar.y.A = iF;
                            return;
                        }
                        return;
                    case 21948:
                        rwaVar.h(i);
                        rwaVar.y.D = (int) j;
                        return;
                    case 21949:
                        rwaVar.h(i);
                        rwaVar.y.E = (int) j;
                        return;
                    default:
                        return;
                }
        }
    }

    public synchronized boolean X(int i) {
        Iterator it = Collections.unmodifiableList(((dq9) ((aq9) this.F).F).A()).iterator();
        while (it.hasNext()) {
            if (((cq9) it.next()).B() == i) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.g08
    public g08 a(List list) {
        return this;
    }

    public ro9 a0(k22 k22Var) throws GeneralSecurityException {
        yf yfVar = (yf) this.F;
        try {
            t3 t3VarG = yfVar.g();
            a aVarM = t3VarG.m(k22Var);
            t3VarG.o(aVarM);
            a aVarH = t3VarG.h(aVarM);
            po9 po9VarD = ro9.D();
            String strF = yfVar.f();
            po9VarD.f();
            ro9.w((ro9) po9VarD.F, strF);
            try {
                int iB = ((f) aVarH).b(null);
                byte[] bArr = new byte[iB];
                e eVar = new e(bArr, iB);
                aVarH.f(eVar);
                if (eVar.c - eVar.d != 0) {
                    throw new IllegalStateException("Did not write as much data as expected.");
                }
                g22 g22Var = new g22(bArr);
                po9VarD.f();
                ro9.x((ro9) po9VarD.F, g22Var);
                int i = yfVar.d;
                qo9 qo9Var = qo9.REMOTE;
                qo9 qo9Var2 = qo9.SYMMETRIC;
                switch (i) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    default:
                        qo9Var = qo9Var2;
                        break;
                    case 8:
                    case 9:
                        break;
                }
                po9VarD.f();
                ro9.y((ro9) po9VarD.F, qo9Var);
                return (ro9) po9VarD.b();
            } catch (IOException e) {
                throw new RuntimeException(aVarH.c("ByteString"), e);
            }
        } catch (InvalidProtocolBufferException e2) {
            throw new GeneralSecurityException("Unexpected proto", e2);
        }
    }

    @Override // defpackage.see
    public void accept(Object obj, Object obj2) {
        e48 e48Var = (e48) this.F;
        j99 j99Var = new j99(1, (j5h) obj2);
        mu8 mu8Var = (mu8) ((ou8) ((dre) obj).t());
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken("com.google.android.gms.auth.blockstore.restorecredential.internal.IRestoreCredentialService");
        int i = wyj.a;
        parcelObtain.writeInt(1);
        e48Var.writeToParcel(parcelObtain, 0);
        parcelObtain.writeStrongBinder(j99Var);
        mu8Var.b(parcelObtain, 2);
    }

    @Override // defpackage.g08
    public g08 b(ow5 ow5Var) {
        ow5Var.getClass();
        return this;
    }

    public Bundle b0() {
        Bundle bundle = (Bundle) this.F;
        Bundle bundle2 = new Bundle(bundle);
        for (String str : bundle.keySet()) {
            if (!str.startsWith("google.c.a.") && !str.equals("from")) {
                bundle2.remove(str);
            }
        }
        return bundle2;
    }

    @Override // defpackage.g08
    public h08 build() {
        return (lt6) this.F;
    }

    @Override // defpackage.g08
    public g08 c(int i) {
        if (i != 0) {
            return this;
        }
        throw null;
    }

    public void c0(long j, int i, long j2) throws ParserException {
        rwa rwaVar = (rwa) this.F;
        rwaVar.j0.getClass();
        if (i == 160) {
            rwaVar.Y = false;
            rwaVar.Z = 0L;
            return;
        }
        if (i == 174) {
            qwa qwaVar = new qwa();
            qwaVar.n = -1;
            qwaVar.o = -1;
            qwaVar.p = -1;
            qwaVar.q = -1;
            qwaVar.r = -1;
            qwaVar.s = 0;
            qwaVar.t = -1;
            qwaVar.u = MTTypesetterKt.kLineSkipLimitMultiplier;
            qwaVar.v = MTTypesetterKt.kLineSkipLimitMultiplier;
            qwaVar.w = MTTypesetterKt.kLineSkipLimitMultiplier;
            qwaVar.x = null;
            qwaVar.y = -1;
            qwaVar.z = false;
            qwaVar.A = -1;
            qwaVar.B = -1;
            qwaVar.C = -1;
            qwaVar.D = 1000;
            qwaVar.E = 200;
            qwaVar.F = -1.0f;
            qwaVar.G = -1.0f;
            qwaVar.H = -1.0f;
            qwaVar.I = -1.0f;
            qwaVar.J = -1.0f;
            qwaVar.K = -1.0f;
            qwaVar.L = -1.0f;
            qwaVar.M = -1.0f;
            qwaVar.N = -1.0f;
            qwaVar.O = -1.0f;
            qwaVar.Q = 1;
            qwaVar.R = -1;
            qwaVar.S = 8000;
            qwaVar.T = 0L;
            qwaVar.U = 0L;
            qwaVar.W = false;
            qwaVar.Y = true;
            qwaVar.Z = "eng";
            rwaVar.y = qwaVar;
            qwaVar.a = rwaVar.w;
            return;
        }
        if (i == 183) {
            if (rwaVar.z) {
                return;
            }
            rwaVar.g(i);
            rwaVar.F = -1;
            rwaVar.G = -1L;
            rwaVar.H = -1L;
            return;
        }
        if (i == 187) {
            if (rwaVar.z) {
                return;
            }
            rwaVar.g(i);
            rwaVar.E = -9223372036854775807L;
            return;
        }
        if (i == 19899) {
            rwaVar.A = -1;
            rwaVar.B = -1L;
            return;
        }
        if (i == 20533) {
            rwaVar.h(i);
            rwaVar.y.i = true;
            return;
        }
        if (i == 21968) {
            rwaVar.h(i);
            rwaVar.y.z = true;
            return;
        }
        if (i == 408125543) {
            long j3 = rwaVar.s;
            if (j3 != -1 && j3 != j) {
                throw ParserException.a(null, "Multiple Segment elements not supported");
            }
            rwaVar.s = j;
            rwaVar.r = j2;
            return;
        }
        if (i == 475249515) {
            if (rwaVar.z) {
                return;
            }
            rwaVar.D = true;
        } else if (i == 524531317 && !rwaVar.z) {
            if (rwaVar.d && rwaVar.K != -1) {
                rwaVar.J = true;
            } else {
                rwaVar.j0.q(new z91(rwaVar.v));
                rwaVar.z = true;
            }
        }
    }

    @Override // defpackage.g08
    public g08 d() {
        return this;
    }

    public void d0(int i, String str) throws ParserException {
        rwa rwaVar = (rwa) this.F;
        if (i == 134) {
            rwaVar.h(i);
            rwaVar.y.c = str;
            return;
        }
        if (i == 17026) {
            if ("webm".equals(str) || "matroska".equals(str)) {
                rwaVar.w = str.equals("webm");
                return;
            }
            throw ParserException.a(null, "DocType " + str + " not supported");
        }
        if (i == 21358) {
            rwaVar.h(i);
            rwaVar.y.b = str;
        } else {
            if (i != 2274716) {
                return;
            }
            rwaVar.h(i);
            rwaVar.y.Z = str;
        }
    }

    @Override // defpackage.g08
    public g08 e(l6e l6eVar) {
        return this;
    }

    @Override // defpackage.g08
    public g08 f() {
        return this;
    }

    @Override // defpackage.g08
    public g08 g() {
        return this;
    }

    @Override // defpackage.br4
    public Object h(Object obj) {
        return Optional.ofNullable(((br4) this.F).h((rqe) obj));
    }

    @Override // defpackage.g08
    public g08 i(wc0 wc0Var) {
        wc0Var.getClass();
        return this;
    }

    @Override // defpackage.sr9, defpackage.tr9
    public void j() {
    }

    @Override // defpackage.sr9
    public void k(sxb sxbVar, Object obj) {
        l3e l3eVar = (l3e) this.F;
        String strB = sxbVar.b();
        if ("version".equals(strB)) {
            if (obj instanceof int[]) {
                l3eVar.E = (int[]) obj;
            }
        } else if ("multifileClassName".equals(strB)) {
            l3eVar.F = obj instanceof String ? (String) obj : null;
        }
    }

    @Override // defpackage.g08
    public g08 l() {
        return this;
    }

    @Override // defpackage.g08
    public g08 m() {
        return this;
    }

    @Override // defpackage.g08
    public g08 n(yr9 yr9Var) {
        yr9Var.getClass();
        return this;
    }

    @Override // defpackage.s08
    public void o(Throwable th) {
        jji jjiVar = ((vie) this.F).F;
        jjiVar.G.set(th);
        Pair pair = (Pair) jjiVar.E.poll();
        if (pair != null) {
            ((exf) pair.second).m(th);
        }
    }

    @Override // defpackage.i7j
    public void o0(WebView webView, ep1 ep1Var, Uri uri, boolean z, oe9 oe9Var) {
        webView.getClass();
        uri.getClass();
        oe9Var.getClass();
        String strB = ep1Var.b();
        if (strB != null) {
            ((sza) this.F).E.a(strB);
        }
    }

    @Override // defpackage.s08
    public void onSuccess(Object obj) {
    }

    @Override // defpackage.g08
    public g08 p() {
        return this;
    }

    @Override // defpackage.sr9
    public void q(sxb sxbVar, jh3 jh3Var) {
    }

    @Override // defpackage.g08
    public g08 r(bo5 bo5Var) {
        bo5Var.getClass();
        return this;
    }

    @Override // defpackage.g08
    public g08 s(sxb sxbVar) {
        sxbVar.getClass();
        return this;
    }

    @Override // defpackage.sr9
    public tr9 t(sxb sxbVar) {
        String strB = sxbVar.b();
        if ("data".equals(strB) || "filePartClassNames".equals(strB)) {
            return new k3e(this, 0);
        }
        if ("strings".equals(strB)) {
            return new k3e(this, 1);
        }
        return null;
    }

    @Override // defpackage.sr9
    public void u(sxb sxbVar, gh3 gh3Var, sxb sxbVar2) {
    }

    @Override // defpackage.g08
    public g08 v(int i) {
        if (i != 0) {
            return this;
        }
        throw null;
    }

    @Override // defpackage.g08
    public g08 w() {
        return this;
    }

    public synchronized void x(fp9 fp9Var) {
        cq9 cq9VarA;
        synchronized (this) {
            cq9VarA = A(tde.e(fp9Var), fp9Var.A());
        }
        aq9 aq9Var = (aq9) this.F;
        aq9Var.f();
        dq9.x((dq9) aq9Var.F, cq9VarA);
    }

    public void y(int i, int i2, xd7 xd7Var) throws ParserException {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        long j;
        int i9;
        int i10;
        int[] iArr;
        int i11;
        int i12;
        rwa rwaVar = (rwa) this.F;
        kri kriVar = rwaVar.b;
        SparseArray sparseArray = rwaVar.c;
        ssc sscVar = rwaVar.k;
        ssc sscVar2 = rwaVar.i;
        int i13 = 2;
        int i14 = 0;
        if (i != 161 && i != 163) {
            if (i == 165) {
                if (rwaVar.O != 2) {
                    return;
                }
                qwa qwaVar = (qwa) sparseArray.get(rwaVar.U);
                int i15 = rwaVar.X;
                ssc sscVar3 = rwaVar.p;
                if (i15 != 4 || !"V_VP9".equals(qwaVar.c)) {
                    xd7Var.l(i2);
                    return;
                } else {
                    sscVar3.J(i2);
                    xd7Var.readFully(sscVar3.a, 0, i2);
                    return;
                }
            }
            if (i == 16877) {
                rwaVar.h(i);
                qwa qwaVar2 = rwaVar.y;
                int i16 = qwaVar2.h;
                if (i16 != 1685485123 && i16 != 1685480259) {
                    xd7Var.l(i2);
                    return;
                }
                byte[] bArr = new byte[i2];
                qwaVar2.P = bArr;
                xd7Var.readFully(bArr, 0, i2);
                return;
            }
            if (i == 16981) {
                rwaVar.h(i);
                byte[] bArr2 = new byte[i2];
                rwaVar.y.j = bArr2;
                xd7Var.readFully(bArr2, 0, i2);
                return;
            }
            if (i == 18402) {
                byte[] bArr3 = new byte[i2];
                xd7Var.readFully(bArr3, 0, i2);
                rwaVar.h(i);
                rwaVar.y.k = new x3i(1, 0, 0, bArr3);
                return;
            }
            if (i == 21419) {
                Arrays.fill(sscVar.a, (byte) 0);
                xd7Var.readFully(sscVar.a, 4 - i2, i2);
                sscVar.M(0);
                rwaVar.A = (int) sscVar.B();
                return;
            }
            if (i == 25506) {
                rwaVar.h(i);
                byte[] bArr4 = new byte[i2];
                rwaVar.y.l = bArr4;
                xd7Var.readFully(bArr4, 0, i2);
                return;
            }
            if (i != 30322) {
                throw ParserException.a(null, "Unexpected id: " + i);
            }
            rwaVar.h(i);
            byte[] bArr5 = new byte[i2];
            rwaVar.y.x = bArr5;
            xd7Var.readFully(bArr5, 0, i2);
            return;
        }
        int i17 = 8;
        if (rwaVar.O == 0) {
            rwaVar.U = (int) kriVar.h(xd7Var, false, true, 8);
            rwaVar.V = kriVar.c;
            rwaVar.Q = -9223372036854775807L;
            rwaVar.O = 1;
            sscVar2.J(0);
        }
        qwa qwaVar3 = (qwa) sparseArray.get(rwaVar.U);
        if (qwaVar3 == null) {
            xd7Var.l(i2 - rwaVar.V);
            rwaVar.O = 0;
            return;
        }
        qwaVar3.a0.getClass();
        if (rwaVar.O == 1) {
            rwaVar.l(xd7Var, 3);
            int i18 = (sscVar2.a[2] & 6) >> 1;
            if (i18 == 0) {
                rwaVar.S = 1;
                int[] iArr2 = rwaVar.T;
                if (iArr2 == null) {
                    iArr2 = new int[1];
                } else if (iArr2.length < 1) {
                    iArr2 = new int[Math.max(iArr2.length * 2, 1)];
                }
                rwaVar.T = iArr2;
                iArr2[0] = (i2 - rwaVar.V) - 3;
            } else {
                rwaVar.l(xd7Var, 4);
                int i19 = (sscVar2.a[3] & 255) + 1;
                rwaVar.S = i19;
                int[] iArr3 = rwaVar.T;
                if (iArr3 == null) {
                    iArr3 = new int[i19];
                    i3 = 4;
                } else {
                    i3 = 4;
                    if (iArr3.length < i19) {
                        iArr3 = new int[Math.max(iArr3.length * 2, i19)];
                    }
                }
                rwaVar.T = iArr3;
                if (i18 == 2) {
                    int i20 = (i2 - rwaVar.V) - 4;
                    int i21 = rwaVar.S;
                    Arrays.fill(iArr3, 0, i21, i20 / i21);
                } else {
                    if (i18 != 1) {
                        if (i18 != 3) {
                            throw ParserException.a(null, "Unexpected lacing value: " + i18);
                        }
                        int i22 = 0;
                        int i23 = 0;
                        int i24 = i3;
                        while (true) {
                            int i25 = rwaVar.S - 1;
                            int[] iArr4 = rwaVar.T;
                            if (i22 >= i25) {
                                i4 = i13;
                                i5 = i14;
                                iArr4[i25] = ((i2 - rwaVar.V) - i24) - i23;
                                break;
                            }
                            iArr4[i22] = i14;
                            int i26 = i24 + 1;
                            rwaVar.l(xd7Var, i26);
                            if (sscVar2.a[i24] == 0) {
                                throw ParserException.a(null, "No valid varint length mask found");
                            }
                            int i27 = i14;
                            while (true) {
                                if (i27 >= i17) {
                                    i6 = i17;
                                    i7 = i13;
                                    i8 = i14;
                                    j = 0;
                                    i9 = i26;
                                    break;
                                }
                                i6 = i17;
                                int i28 = 1 << (7 - i27);
                                i8 = i14;
                                if ((sscVar2.a[i24] & i28) != 0) {
                                    i9 = i26 + i27;
                                    rwaVar.l(xd7Var, i9);
                                    i7 = i13;
                                    j = (~i28) & sscVar2.a[i24] & 255;
                                    while (i26 < i9) {
                                        j = (j << i6) | ((long) (sscVar2.a[i26] & 255));
                                        i26++;
                                    }
                                    if (i22 > 0) {
                                        j -= (1 << ((i27 * 7) + 6)) - 1;
                                    }
                                } else {
                                    i27++;
                                    i14 = i8;
                                    i17 = i6;
                                }
                            }
                            if (j < -2147483648L || j > 2147483647L) {
                                break;
                            }
                            int i29 = (int) j;
                            int[] iArr5 = rwaVar.T;
                            if (i22 != 0) {
                                i29 += iArr5[i22 - 1];
                            }
                            iArr5[i22] = i29;
                            i23 += i29;
                            i22++;
                            i24 = i9;
                            i14 = i8;
                            i17 = i6;
                            i13 = i7;
                        }
                        throw ParserException.a(null, "EBML lacing sample size out of range.");
                    }
                    int i30 = 0;
                    int i31 = 0;
                    int i32 = i3;
                    while (true) {
                        i10 = rwaVar.S - 1;
                        iArr = rwaVar.T;
                        if (i30 >= i10) {
                            break;
                        }
                        iArr[i30] = 0;
                        while (true) {
                            i11 = i32 + 1;
                            rwaVar.l(xd7Var, i11);
                            int i33 = sscVar2.a[i32] & 255;
                            int[] iArr6 = rwaVar.T;
                            i12 = iArr6[i30] + i33;
                            iArr6[i30] = i12;
                            if (i33 != 255) {
                                break;
                            } else {
                                i32 = i11;
                            }
                        }
                        i31 += i12;
                        i30++;
                        i32 = i11;
                    }
                    iArr[i10] = ((i2 - rwaVar.V) - i32) - i31;
                }
            }
            i4 = 2;
            i5 = 0;
            byte[] bArr6 = sscVar2.a;
            rwaVar.P = rwaVar.n((bArr6[1] & 255) | (bArr6[i5] << 8)) + rwaVar.M;
            rwaVar.W = (qwaVar3.e == 1 || (i == 163 && (sscVar2.a[i4] & 128) == 128)) ? 1 : i5;
            rwaVar.O = i4;
            rwaVar.R = i5;
        }
        if (i == 163) {
            while (true) {
                int i34 = rwaVar.R;
                if (i34 >= rwaVar.S) {
                    rwaVar.O = 0;
                    return;
                } else {
                    rwaVar.i(qwaVar3, ((long) ((rwaVar.R * qwaVar3.f) / 1000)) + rwaVar.P, rwaVar.W, rwaVar.o(xd7Var, qwaVar3, rwaVar.T[i34], false), 0);
                    rwaVar.R++;
                }
            }
        } else {
            while (true) {
                int i35 = rwaVar.R;
                if (i35 >= rwaVar.S) {
                    return;
                }
                int[] iArr7 = rwaVar.T;
                iArr7[i35] = rwaVar.o(xd7Var, qwaVar3, iArr7[i35], true);
                rwaVar.R++;
            }
        }
    }

    @Override // defpackage.sr9
    public sr9 z(gh3 gh3Var, sxb sxbVar) {
        return null;
    }

    public /* synthetic */ ro6(int i, Object obj) {
        this.E = i;
        this.F = obj;
    }

    public /* synthetic */ ro6(xzd xzdVar) {
        this.E = 21;
        this.F = (txj) xzdVar.F;
    }

    public ro6(int i) {
        this.E = 26;
        at atVar = new at(10, false);
        atVar.F = i;
        atVar.G = new hw4(atVar, grc.m(i, 4, 3, 1));
        this.F = atVar;
    }

    public /* synthetic */ ro6(byte b, int i) {
        this.E = i;
    }

    public ro6(Bundle bundle) {
        this.E = 17;
        if (bundle != null) {
            this.F = new Bundle(bundle);
        } else {
            mr9.h("data");
            throw null;
        }
    }

    public ro6(Object obj) {
        this.E = 4;
        this.F = (InputContentInfo) obj;
    }

    public ro6(UrlRequest urlRequest, lrb lrbVar) {
        this.E = 29;
        this.F = lrbVar;
    }

    public ro6(UUID uuid, int i, byte[] bArr, UUID[] uuidArr) {
        this.E = 20;
        this.F = uuid;
    }

    public ro6(ComponentName componentName, ComponentName componentName2, ComponentName componentName3, ComponentName componentName4) {
        this.E = 3;
        this.F = componentName2;
    }
}
