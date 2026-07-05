package defpackage;

import android.app.Activity;
import android.content.Context;
import android.graphics.Shader;
import android.net.Uri;
import android.util.Base64;
import android.webkit.DownloadListener;
import android.webkit.WebView;
import androidx.compose.foundation.layout.b;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.R;
import com.anthropic.claude.api.errors.ClaudeApiError$CloudflareChallengeError;
import com.anthropic.claude.api.errors.ClaudeApiError$CloudflareWaitingRoomError;
import com.anthropic.claude.api.errors.ClaudeApiError$UnknownPermissionError;
import com.anthropic.claude.tool.model.HealthConnectQueryV0Input;
import com.anthropic.claude.tool.model.HealthConnectQueryV0InputQueriesItem;
import com.anthropic.claude.tool.model.HealthConnectQueryV0Output;
import com.anthropic.claude.tool.model.HealthConnectQueryV0OutputHealthConnectQueryError;
import com.anthropic.claude.tool.model.HealthConnectQueryV0OutputHealthConnectQueryErrorErrorType;
import com.pvporbit.freetype.FreeTypeConstants;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ksk {
    public static final ta4 a = new ta4(-74290013, false, new wb4(9));
    public static final ta4 b = new ta4(-710737530, false, new vb4(20));
    public static final ta4 c = new ta4(-1591843843, false, new vb4(21));

    public static final void a(npg npgVar, hi6 hi6Var, String str, rz7 rz7Var, iqb iqbVar, ld4 ld4Var, int i) {
        iqb iqbVar2;
        float f;
        lz1 lz1Var = jd4.a;
        npgVar.getClass();
        hi6Var.getClass();
        str.getClass();
        rz7Var.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-1031132932);
        int i2 = i | (e18Var.h(npgVar) ? 4 : 2) | (e18Var.h(hi6Var) ? 32 : 16) | (e18Var.f(str) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC) | (e18Var.h(rz7Var) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE) | 24576;
        if (e18Var.Q(i2 & 1, (i2 & 9363) != 9362)) {
            fqb fqbVar = fqb.E;
            Context context = (Context) e18Var.j(w00.b);
            jl3 jl3VarA = gm3.a(e18Var);
            boolean zF = e18Var.f(jl3VarA);
            Object objN = e18Var.N();
            if (zF || objN == lz1Var) {
                objN = new qw4(g(jl3VarA.M), g(jl3VarA.N), g(jl3VarA.a), g(jl3VarA.p), g(jl3VarA.u));
                e18Var.k0(objN);
            }
            qw4 qw4Var = (qw4) objN;
            String str2 = npgVar.b;
            context.getClass();
            ((HashSet) hi6Var.F).add(str2);
            hw4 hw4Var = (hw4) hi6Var.K;
            Object obj = hw4Var.get(str2);
            if (obj == null) {
                qo0 qo0Var = (qo0) hi6Var.H;
                m9d m9dVar = (m9d) (qo0Var.isEmpty() ? null : qo0Var.removeFirst());
                if (m9dVar == null) {
                    Context applicationContext = context.getApplicationContext();
                    applicationContext.getClass();
                    gm8 gm8Var = new gm8();
                    final w6a w6aVar = new w6a();
                    WebView webView = new WebView(applicationContext);
                    webView.setBackgroundColor(0);
                    webView.setVerticalScrollBarEnabled(false);
                    webView.setHorizontalScrollBarEnabled(true);
                    webView.getSettings().setJavaScriptEnabled(true);
                    webView.addJavascriptInterface(gm8Var, "ConwayNative");
                    webView.setWebViewClient(w6aVar);
                    webView.setDownloadListener(new DownloadListener() { // from class: gw4
                        @Override // android.webkit.DownloadListener
                        public final void onDownloadStart(String str3, String str4, String str5, String str6, long j) {
                            rz7 rz7Var2 = w6aVar.a;
                            if (rz7Var2 != null) {
                                Uri uri = Uri.parse(str3);
                                uri.getClass();
                                rz7Var2.invoke(uri, str5, str6);
                            }
                        }
                    });
                    ((HashMap) hi6Var.I).put(webView, gm8Var);
                    ((HashMap) hi6Var.J).put(webView, w6aVar);
                    m9dVar = new m9d(webView, gm8Var, w6aVar);
                }
                WebView webView2 = m9dVar.a;
                Integer num = (Integer) ((HashMap) hi6Var.G).get(str2);
                iw4 iw4Var = new iw4(webView2, num != null ? num.intValue() : 0);
                m9dVar.b.a = new l6(hi6Var, iw4Var, str2, 28);
                m9dVar.c.a = rz7Var;
                hw4Var.put(str2, iw4Var);
                obj = iw4Var;
            }
            iw4 iw4Var2 = (iw4) obj;
            w6a w6aVar2 = (w6a) ((HashMap) hi6Var.J).get(iw4Var2.a);
            if (w6aVar2 != null) {
                w6aVar2.a = rz7Var;
            }
            String str3 = npgVar.b;
            int i3 = i2 & 14;
            boolean zH = e18Var.h(hi6Var) | (i3 == 4 || e18Var.h(npgVar));
            Object objN2 = e18Var.N();
            if (zH || objN2 == lz1Var) {
                objN2 = new lj2(hi6Var, 23, npgVar);
                e18Var.k0(objN2);
            }
            fd9.d(str3, (bz7) objN2, e18Var);
            if (iw4Var2.b.h() > 0) {
                int iH = iw4Var2.b.h();
                if (iH > 5000) {
                    iH = 5000;
                }
                f = iH;
            } else {
                f = 80.0f;
            }
            iqb iqbVarE = b.e(b.c(fqbVar, 1.0f), f);
            boolean zH2 = e18Var.h(iw4Var2);
            Object objN3 = e18Var.N();
            if (zH2 || objN3 == lz1Var) {
                objN3 = new py3(3, iw4Var2);
                e18Var.k0(objN3);
            }
            bz7 bz7Var = (bz7) objN3;
            Object objN4 = e18Var.N();
            if (objN4 == lz1Var) {
                objN4 = new fc4(24);
                e18Var.k0(objN4);
            }
            bz7 bz7Var2 = (bz7) objN4;
            boolean zH3 = e18Var.h(iw4Var2) | (i3 == 4 || e18Var.h(npgVar)) | e18Var.h(qw4Var) | ((i2 & 896) == 256);
            Object objN5 = e18Var.N();
            if (zH3 || objN5 == lz1Var) {
                fe feVar = new fe(iw4Var2, npgVar, qw4Var, str, 17);
                e18Var.k0(feVar);
                objN5 = feVar;
            }
            uj5.b(bz7Var, iqbVarE, null, bz7Var2, (bz7) objN5, e18Var, 3072, 4);
            iqbVar2 = fqbVar;
        } else {
            e18Var.T();
            iqbVar2 = iqbVar;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new uo(npgVar, hi6Var, str, rz7Var, iqbVar2, i, 12);
        }
    }

    public static final void b(HealthConnectQueryV0Input healthConnectQueryV0Input, boolean z, boolean z2, zy7 zy7Var, ld4 ld4Var, int i) throws IOException {
        e18 e18Var;
        int i2;
        boolean z3;
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(772523963);
        int i3 = i | (e18Var2.f(healthConnectQueryV0Input) ? 4 : 2) | (e18Var2.g(z) ? 32 : 16) | (e18Var2.g(z2) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC) | (e18Var2.h(zy7Var) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE);
        if (e18Var2.Q(i3 & 1, (i3 & 1171) != 1170)) {
            Context context = (Context) e18Var2.j(w00.b);
            boolean z4 = (i3 & 14) == 4;
            Object objN = e18Var2.N();
            if (z4 || objN == jd4.a) {
                List<HealthConnectQueryV0InputQueriesItem> queries = healthConnectQueryV0Input.getQueries();
                ArrayList arrayList = new ArrayList();
                for (HealthConnectQueryV0InputQueriesItem healthConnectQueryV0InputQueriesItem : queries) {
                    u0h u0hVar = sk8.h;
                    sk8 sk8VarD = gsk.d(healthConnectQueryV0InputQueriesItem.getIdentifier());
                    if (sk8VarD != null) {
                        arrayList.add(sk8VarD);
                    }
                }
                objN = w44.S0(w44.p1(w44.s1(arrayList)), ", ", null, null, new nl1(context, 3), 30);
                e18Var2.k0(objN);
            }
            String str = (String) objN;
            fqb fqbVar = fqb.E;
            iqb iqbVarC = b.c(fqbVar, 1.0f);
            q64 q64VarA = p64.a(ko0.c, lja.S, e18Var2, 0);
            int iHashCode = Long.hashCode(e18Var2.T);
            hyc hycVarL = e18Var2.l();
            iqb iqbVarE = kxk.E(e18Var2, iqbVarC);
            dd4.e.getClass();
            re4 re4Var = cd4.b;
            e18Var2.e0();
            if (e18Var2.S) {
                e18Var2.k(re4Var);
            } else {
                e18Var2.n0();
            }
            d4c.i0(e18Var2, cd4.f, q64VarA);
            d4c.i0(e18Var2, cd4.e, hycVarL);
            d4c.i0(e18Var2, cd4.g, Integer.valueOf(iHashCode));
            d4c.h0(e18Var2, cd4.h);
            d4c.i0(e18Var2, cd4.d, iqbVarE);
            if (bsg.I0(str)) {
                i2 = i3;
                e18Var = e18Var2;
                z3 = false;
                e18Var.a0(-1694778243);
                e18Var.p(false);
            } else {
                e18Var2.a0(-1695086724);
                tkh tkhVar = ((jm3) gm3.c(e18Var2).e.E).i;
                i2 = i3;
                z3 = false;
                tjh.b(str, gb9.L(b.c(fqbVar, 1.0f), 42.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 2), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, tkhVar, e18Var2, 48, 0, 131068);
                e18Var = e18Var2;
                grc.z(fqbVar, 8.0f, e18Var, false);
            }
            if (z && z2) {
                e18Var.a0(-1694718165);
                ztk.d((i2 >> 6) & 112, e18Var, zy7Var, null, d4c.j0(R.string.permission_health_connect_system_disabled, e18Var));
                e18Var.p(z3);
            } else {
                e18Var.a0(-1694516355);
                e18Var.p(z3);
            }
            e18Var.p(true);
        } else {
            e18Var = e18Var2;
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new q32(healthConnectQueryV0Input, z, z2, zy7Var, i, 7);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r18v5 */
    /* JADX WARN: Type inference failed for: r18v6, types: [rz7] */
    /* JADX WARN: Type inference failed for: r18v7 */
    public static final void c(dlb dlbVar, boolean z, boolean z2, zy7 zy7Var, iqb iqbVar, ld4 ld4Var, int i) {
        iqb iqbVar2;
        e18 e18Var;
        HealthConnectQueryV0OutputHealthConnectQueryErrorErrorType healthConnectQueryV0OutputHealthConnectQueryErrorErrorType;
        iub yl4Var;
        boolean z3;
        lz1 lz1Var;
        ?? r18;
        dlbVar.getClass();
        Object obj = dlbVar.b;
        zy7Var.getClass();
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(-329944113);
        int i2 = (i & 6) == 0 ? ((i & 8) == 0 ? e18Var2.f(dlbVar) : e18Var2.h(dlbVar) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= e18Var2.d(R.drawable.health_connect) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= e18Var2.g(z) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        if ((i & 3072) == 0) {
            i2 |= e18Var2.g(z2) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE;
        }
        if ((i & 24576) == 0) {
            i2 |= e18Var2.h(zy7Var) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN;
        }
        if ((196608 & i) == 0) {
            iqbVar2 = iqbVar;
            i2 |= e18Var2.f(iqbVar2) ? 131072 : 65536;
        } else {
            iqbVar2 = iqbVar;
        }
        int i3 = 0;
        final boolean z4 = false;
        if (e18Var2.Q(i2 & 1, (74899 & i2) != 74898)) {
            HealthConnectQueryV0Input healthConnectQueryV0Input = (HealthConnectQueryV0Input) dlbVar.a;
            e18Var2.a0(-591881732);
            lz1 lz1Var2 = jd4.a;
            if (healthConnectQueryV0Input == null) {
                e18Var2.p(false);
                healthConnectQueryV0OutputHealthConnectQueryErrorErrorType = null;
            } else {
                boolean zF = e18Var2.f(healthConnectQueryV0Input);
                Object objN = e18Var2.N();
                Object obj2 = objN;
                if (zF || objN == lz1Var2) {
                    List<HealthConnectQueryV0InputQueriesItem> queries = healthConnectQueryV0Input.getQueries();
                    ArrayList<sk8> arrayList = new ArrayList();
                    for (HealthConnectQueryV0InputQueriesItem healthConnectQueryV0InputQueriesItem : queries) {
                        u0h u0hVar = sk8.h;
                        sk8 sk8VarD = gsk.d(healthConnectQueryV0InputQueriesItem.getIdentifier());
                        if (sk8VarD != null) {
                            arrayList.add(sk8VarD);
                        }
                    }
                    ArrayList arrayList2 = new ArrayList(x44.y(arrayList, 10));
                    for (sk8 sk8Var : arrayList) {
                        Map map = jl8.a;
                        arrayList2.add(hsk.f(sk8Var.c));
                    }
                    List listP1 = w44.p1(w44.s1(arrayList2));
                    e18Var2.k0(listP1);
                    obj2 = listP1;
                }
                List list = (List) obj2;
                list.getClass();
                e18Var2.a0(-57132327);
                e18Var2.a0(1644423904);
                Object objN2 = e18Var2.N();
                Object obj3 = objN2;
                if (objN2 == lz1Var2) {
                    jua juaVar = new jua(21);
                    e18Var2.k0(juaVar);
                    obj3 = juaVar;
                }
                bz7 bz7Var = (bz7) obj3;
                e18Var2.p(false);
                e18Var2.a0(-2117184311);
                if (((Boolean) e18Var2.j(p59.a)).booleanValue()) {
                    yl4Var = new yl4();
                    ArrayList arrayList3 = new ArrayList(list.size());
                    int size = list.size();
                    while (i3 < size) {
                        arrayList3.add(new wed((String) list.get(i3), yxc.a));
                        i3++;
                        yl4Var = yl4Var;
                    }
                    healthConnectQueryV0OutputHealthConnectQueryErrorErrorType = null;
                    z3 = false;
                } else {
                    e18Var2.a0(-2044770427);
                    e18Var2.a0(992349447);
                    Context context = (Context) e18Var2.j(w00.b);
                    Activity activityX = oq5.x(context);
                    e18Var2.a0(2043410185);
                    boolean zF2 = e18Var2.f(list);
                    Object objN3 = e18Var2.N();
                    Object obj4 = objN3;
                    if (zF2 || objN3 == lz1Var2) {
                        ArrayList arrayList4 = new ArrayList(x44.y(list, 10));
                        for (Iterator it = r13.iterator(); it.hasNext(); it = it) {
                            arrayList4.add(new wvb((String) it.next(), context, activityX));
                        }
                        e18Var2.k0(arrayList4);
                        obj4 = arrayList4;
                    }
                    List list2 = (List) obj4;
                    e18Var2.p(false);
                    Iterator it2 = list2.iterator();
                    while (it2.hasNext()) {
                        wvb wvbVar = (wvb) it2.next();
                        e18Var2.X(2043417954, wvbVar.a);
                        vc vcVar = new vc(1);
                        e18Var2.a0(2043425179);
                        boolean zF3 = e18Var2.f(wvbVar);
                        Iterator it3 = it2;
                        Object objN4 = e18Var2.N();
                        Object obj5 = objN4;
                        if (zF3 || objN4 == lz1Var2) {
                            tl8 tl8Var = new tl8(18, wvbVar);
                            e18Var2.k0(tl8Var);
                            obj5 = tl8Var;
                        }
                        e18Var2.p(false);
                        xpa xpaVarD0 = sf5.d0(vcVar, (bz7) obj5, e18Var2, 0);
                        e18Var2.a0(2043428887);
                        boolean zF4 = e18Var2.f(wvbVar) | e18Var2.h(xpaVarD0);
                        Object objN5 = e18Var2.N();
                        if (zF4 || objN5 == lz1Var2) {
                            objN5 = new b4b(wvbVar, 5, xpaVarD0);
                            e18Var2.k0(objN5);
                        }
                        e18Var2.p(false);
                        fd9.d(xpaVarD0, (bz7) objN5, e18Var2);
                        e18Var2.p(false);
                        it2 = it3;
                    }
                    e18Var2.p(false);
                    healthConnectQueryV0OutputHealthConnectQueryErrorErrorType = null;
                    oq5.h(list2, null, e18Var2, 0);
                    e18Var2.a0(-1913570181);
                    boolean zF5 = e18Var2.f(list);
                    Object objN6 = e18Var2.N();
                    Object obj6 = objN6;
                    if (zF5 || objN6 == lz1Var2) {
                        lvb lvbVar = new lvb(list2);
                        e18Var2.k0(lvbVar);
                        obj6 = lvbVar;
                    }
                    yl4Var = (lvb) obj6;
                    e18Var2.p(false);
                    vc vcVar2 = new vc(0);
                    e18Var2.a0(-1913560327);
                    boolean zF6 = e18Var2.f(yl4Var) | e18Var2.f(bz7Var);
                    Object objN7 = e18Var2.N();
                    Object obj7 = objN7;
                    if (zF6 || objN7 == lz1Var2) {
                        b4b b4bVar = new b4b(yl4Var, 4, bz7Var);
                        e18Var2.k0(b4bVar);
                        obj7 = b4bVar;
                    }
                    e18Var2.p(false);
                    xpa xpaVarD02 = sf5.d0(vcVar2, (bz7) obj7, e18Var2, 0);
                    e18Var2.a0(-1913553647);
                    boolean zF7 = e18Var2.f(yl4Var) | e18Var2.h(xpaVarD02);
                    Object objN8 = e18Var2.N();
                    Object obj8 = objN8;
                    if (zF7 || objN8 == lz1Var2) {
                        tl8 tl8Var2 = new tl8(yl4Var, 17, xpaVarD02);
                        e18Var2.k0(tl8Var2);
                        obj8 = tl8Var2;
                    }
                    z3 = false;
                    e18Var2.p(false);
                    fd9.e(yl4Var, xpaVarD02, (bz7) obj8, e18Var2);
                    e18Var2.p(false);
                }
                e18Var2.p(z3);
                e18Var2.p(z3);
                boolean zJ = yl4Var.j();
                e18Var2.p(z3);
                z4 = zJ;
            }
            HealthConnectQueryV0Output healthConnectQueryV0Output = (HealthConnectQueryV0Output) obj;
            boolean zF8 = e18Var2.f(healthConnectQueryV0Output) | e18Var2.g(z4);
            Object objN9 = e18Var2.N();
            Object obj9 = objN9;
            if (zF8 || objN9 == lz1Var2) {
                dj8 dj8Var = new dj8(healthConnectQueryV0Output);
                e18Var2.k0(dj8Var);
                obj9 = dj8Var;
            }
            dj8 dj8Var2 = (dj8) obj9;
            HealthConnectQueryV0OutputHealthConnectQueryError healthConnectQueryV0OutputHealthConnectQueryError = obj instanceof HealthConnectQueryV0OutputHealthConnectQueryError ? (HealthConnectQueryV0OutputHealthConnectQueryError) obj : healthConnectQueryV0OutputHealthConnectQueryErrorErrorType;
            final boolean z5 = (healthConnectQueryV0OutputHealthConnectQueryError != null ? healthConnectQueryV0OutputHealthConnectQueryError.getError_type() : healthConnectQueryV0OutputHealthConnectQueryErrorErrorType) == HealthConnectQueryV0OutputHealthConnectQueryErrorErrorType.SYSTEM_PERMISSION_DENIED;
            boolean zG = e18Var2.g(z5) | e18Var2.g(z4);
            Object objN10 = e18Var2.N();
            Object obj10 = objN10;
            if (zG || objN10 == lz1Var2) {
                zy7 zy7Var2 = new zy7() { // from class: ml8
                    @Override // defpackage.zy7
                    public final Object a() {
                        return Boolean.valueOf(z5 && !z4);
                    }
                };
                e18Var2.k0(zy7Var2);
                obj10 = zy7Var2;
            }
            wz5 wz5VarW = mpk.w((zy7) obj10);
            long j = d54.h;
            if (healthConnectQueryV0Input != null) {
                e18Var2.a0(1816179250);
                lz1Var = lz1Var2;
                ta4 ta4VarQ0 = fd9.q0(1425365974, new qe(healthConnectQueryV0Input, z, zy7Var, wz5VarW, 4), e18Var2);
                e18Var2.p(false);
                r18 = ta4VarQ0;
            } else {
                lz1Var = lz1Var2;
                e18Var2.a0(1816494551);
                e18Var2.p(false);
                r18 = healthConnectQueryV0OutputHealthConnectQueryErrorErrorType;
            }
            Object objN11 = e18Var2.N();
            Object obj11 = objN11;
            if (objN11 == lz1Var) {
                oob oobVar = new oob(19);
                e18Var2.k0(oobVar);
                obj11 = oobVar;
            }
            e18 e18Var3 = e18Var2;
            auk.b(dj8Var2, R.drawable.health_connect, z, z2, (zy7) obj11, iqbVar2, false, j, false, null, r18, e18Var3, (i2 & 112) | 14180352 | (i2 & 896) | (i2 & 7168) | (458752 & i2), 0, 768);
            e18Var = e18Var3;
        } else {
            e18 e18Var4 = e18Var2;
            e18Var4.T();
            e18Var = e18Var4;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new ey3(dlbVar, z, z2, zy7Var, iqbVar, i);
        }
    }

    public static lte d(String str, Map map) {
        str.getClass();
        map.getClass();
        String strR0 = bsg.R0(str, "format:");
        Object obj = null;
        if (strR0 != str) {
            Object obj2 = map.get(strR0);
            if (obj2 instanceof lte) {
                return (lte) obj2;
            }
            return null;
        }
        Iterator it = ((List) lte.c.getValue()).iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (x44.r(((lte) next).a, str)) {
                obj = next;
                break;
            }
        }
        return (lte) obj;
    }

    public static jkb e(jkb jkbVar, fu9 fu9Var, tkh tkhVar, cz5 cz5Var, wt7 wt7Var) {
        if (jkbVar != null && fu9Var == jkbVar.a && yfd.Y(tkhVar, fu9Var).equals(jkbVar.b) && cz5Var.getDensity() == jkbVar.c.E && wt7Var == jkbVar.d) {
            return jkbVar;
        }
        jkb jkbVar2 = jkb.h;
        if (jkbVar2 != null && fu9Var == jkbVar2.a && yfd.Y(tkhVar, fu9Var).equals(jkbVar2.b) && cz5Var.getDensity() == jkbVar2.c.E && wt7Var == jkbVar2.d) {
            return jkbVar2;
        }
        jkb jkbVar3 = new jkb(fu9Var, yfd.Y(tkhVar, fu9Var), new fz5(cz5Var.getDensity(), cz5Var.k0()), wt7Var);
        jkb.h = jkbVar3;
        return jkbVar3;
    }

    public static Shader.TileMode f() {
        return Shader.TileMode.DECAL;
    }

    public static final String g(long j) {
        int iN0 = d4c.n0(j);
        int i = (iN0 >>> 24) & 255;
        gb9.q(16);
        String string = Integer.toString(iN0 & 16777215, 16);
        string.getClass();
        Locale locale = Locale.ROOT;
        String upperCase = string.toUpperCase(locale);
        upperCase.getClass();
        String strI = ij0.i("#", bsg.O0(6, upperCase));
        if (i == 255) {
            return strI;
        }
        gb9.q(16);
        String string2 = Integer.toString(i, 16);
        string2.getClass();
        String upperCase2 = string2.toUpperCase(locale);
        upperCase2.getClass();
        return kgh.o(strI, bsg.O0(2, upperCase2));
    }

    public static final String h(bj3 bj3Var, Integer num) {
        bj3Var.getClass();
        String f = bj3Var.getG();
        Integer numValueOf = null;
        if (f != null) {
            if (f.length() == 0) {
                f = null;
            }
            if (f != null) {
                return f;
            }
        }
        if (bj3Var instanceof ClaudeApiError$CloudflareChallengeError) {
            return "cloudflare_challenge_" + Integer.valueOf(((ClaudeApiError$CloudflareChallengeError) bj3Var).b);
        }
        if (bj3Var instanceof ClaudeApiError$CloudflareWaitingRoomError) {
            return "cloudflare_waiting_room_" + Integer.valueOf(((ClaudeApiError$CloudflareWaitingRoomError) bj3Var).b);
        }
        if (bj3Var instanceof ClaudeApiError$UnknownPermissionError) {
            return "cloudflare_blocked_" + Integer.valueOf(((ClaudeApiError$UnknownPermissionError) bj3Var).b);
        }
        String c2 = bj3Var.getD();
        if (c2 == null || c2.length() == 0) {
            c2 = null;
        }
        if (c2 != null) {
            xi3.G.getClass();
            xi3 xi3Var = (xi3) xi3.H.get(c2);
            if (xi3Var != null) {
                numValueOf = Integer.valueOf(xi3Var.F);
            }
        }
        if (num != null && num.intValue() == 500 && numValueOf != null && numValueOf.intValue() != 500) {
            num = numValueOf;
        }
        if (num == null) {
            return c2;
        }
        int iIntValue = num.intValue();
        if (c2 == null) {
            c2 = "api_error";
        }
        return c2 + "_" + iIntValue;
    }

    public static String j(byte[] bArr) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(bArr);
            return Base64.encodeToString(messageDigest.digest(), 11);
        } catch (NoSuchAlgorithmException unused) {
            return "";
        }
    }
}
