package defpackage;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Base64;
import android.util.Xml;
import android.view.KeyEvent;
import androidx.compose.foundation.layout.b;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.mcpapps.transport.HostInfo;
import com.anthropic.claude.sessions.types.ConnectionStatus;
import com.anthropic.claude.sessions.types.PostTurnSummary;
import com.anthropic.claude.sessions.types.RequiresActionDetails;
import com.anthropic.claude.sessions.types.SessionResource;
import com.anthropic.claude.sessions.types.SessionStatus;
import com.anthropic.claude.sessions.types.SummaryStatusCategory;
import com.pvporbit.freetype.FreeTypeConstants;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class gok {
    public static final ta4 a = new ta4(1630690974, false, new tb4(2));

    public static final void a(ml3 ml3Var, bz7 bz7Var, iqb iqbVar, ep epVar, ld4 ld4Var, int i) {
        int i2;
        iqb iqbVar2;
        e18 e18Var;
        ep epVar2;
        ep epVar3;
        int i3;
        bz7Var.getClass();
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(-1717840905);
        int i4 = 2;
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? e18Var2.f(ml3Var) : e18Var2.h(ml3Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= e18Var2.h(bz7Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            iqbVar2 = iqbVar;
            i2 |= e18Var2.f(iqbVar2) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        } else {
            iqbVar2 = iqbVar;
        }
        if ((i & 3072) == 0) {
            i2 |= FreeTypeConstants.FT_LOAD_NO_RECURSE;
        }
        int i5 = 0;
        if (e18Var2.Q(i2 & 1, (i2 & 1171) != 1170)) {
            e18Var2.V();
            int i6 = i & 1;
            lz1 lz1Var = jd4.a;
            if (i6 == 0 || e18Var2.A()) {
                m7f m7fVarB = gr9.b(e18Var2);
                boolean zH = e18Var2.h(m7fVarB);
                Object objN = e18Var2.N();
                if (zH || objN == lz1Var) {
                    objN = new di(m7fVarB, i4);
                    e18Var2.k0(objN);
                }
                kce kceVar = jce.a;
                epVar3 = (ep) fd9.r0(kceVar.b(ep.class), oq5.B(kceVar.b(ep.class)), (bz7) objN, e18Var2);
                i3 = i2 & (-7169);
            } else {
                e18Var2.T();
                i3 = i2 & (-7169);
                epVar3 = epVar;
            }
            e18Var2.q();
            boolean zF = e18Var2.f(epVar3);
            Object objN2 = e18Var2.N();
            if (zF || objN2 == lz1Var) {
                objN2 = new jp(epVar3, null, i5);
                e18Var2.k0(objN2);
            }
            csg.g((bz7) objN2, e18Var2, 0, 1);
            qnc qncVar = n2i.a;
            g77 g77VarA = n2i.a(eg0.h(e18Var2), e18Var2, 14);
            e18Var = e18Var2;
            iqb iqbVar3 = iqbVar2;
            v40.b(iqbVar3, null, fd9.q0(1394874452, new m6(g77VarA, ml3Var, epVar3, 5), e18Var2), null, null, null, 0, 0L, 0L, null, MTTypesetterKt.kLineSkipLimitMultiplier, fd9.q0(552721793, new bn(epVar3, g77VarA, fxd.d(e18Var2), bz7Var, 1), e18Var2), e18Var, ((i3 >> 6) & 14) | 384, 2042);
            epVar2 = epVar3;
        } else {
            e18Var = e18Var2;
            e18Var.T();
            epVar2 = epVar;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new xd(ml3Var, bz7Var, iqbVar, epVar2, i, 3);
        }
    }

    public static final void b(String str, iqb iqbVar, ld4 ld4Var, int i) {
        e18 e18Var;
        iqb iqbVar2;
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(-890390268);
        int i2 = i | (e18Var2.f(str) ? 4 : 2) | 48;
        if (e18Var2.Q(i2 & 1, (i2 & 19) != 18)) {
            tkh tkhVarB = tkh.b(((jm3) gm3.c(e18Var2).e.E).k, 0L, eve.B(13), null, null, null, 0L, null, 0, 0L, null, 0, 16777213);
            long j = gm3.a(e18Var2).O;
            fqb fqbVar = fqb.E;
            e18Var = e18Var2;
            tjh.b(str, gb9.N(fqbVar, 4.0f, 8.0f, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, 12), j, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, tkhVarB, e18Var, i2 & 14, 0, 131064);
            iqbVar2 = fqbVar;
        } else {
            e18Var = e18Var2;
            e18Var.T();
            iqbVar2 = iqbVar;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new ip(str, iqbVar2, i, 0);
        }
    }

    public static final void c(String str, long j, mnc mncVar, iqb iqbVar, ld4 ld4Var, int i) {
        iqb iqbVar2;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(1195948838);
        int i2 = i | (e18Var.f(str) ? 4 : 2) | (e18Var.e(j) ? 32 : 16) | (e18Var.f(mncVar) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC) | 3072;
        if (e18Var.Q(i2 & 1, (i2 & 1171) != 1170)) {
            xo1 xo1Var = lja.K;
            iqb iqbVarI = gb9.I(mpk.b0(b.c, mpk.Y(e18Var), true), mncVar);
            o5b o5bVarD = dw1.d(xo1Var, false);
            int iHashCode = Long.hashCode(e18Var.T);
            hyc hycVarL = e18Var.l();
            iqb iqbVarE = kxk.E(e18Var, iqbVarI);
            dd4.e.getClass();
            re4 re4Var = cd4.b;
            e18Var.e0();
            if (e18Var.S) {
                e18Var.k(re4Var);
            } else {
                e18Var.n0();
            }
            d4c.i0(e18Var, cd4.f, o5bVarD);
            d4c.i0(e18Var, cd4.e, hycVarL);
            d4c.i0(e18Var, cd4.g, Integer.valueOf(iHashCode));
            d4c.h0(e18Var, cd4.h);
            d4c.i0(e18Var, cd4.d, iqbVarE);
            tjh.b(str, null, j, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var).e.E).g, e18Var, (i2 & 14) | ((i2 << 3) & 896), 0, 131066);
            e18Var.p(true);
            iqbVar2 = fqb.E;
        } else {
            e18Var.T();
            iqbVar2 = iqbVar;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new gp(str, j, mncVar, iqbVar2, i);
        }
    }

    public static final void d(Set set, bz7 bz7Var, iqb iqbVar, ld4 ld4Var, int i) {
        int i2;
        iqb iqbVar2;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-1480787268);
        if ((i & 6) == 0) {
            i2 = i | (e18Var.f(set) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= e18Var.h(bz7Var) ? 32 : 16;
        }
        int i3 = i2 | 384;
        int i4 = 0;
        if (e18Var.Q(i3 & 1, (i3 & 147) != 146)) {
            Object[] objArr = new Object[0];
            Object objN = e18Var.N();
            lz1 lz1Var = jd4.a;
            if (objN == lz1Var) {
                objN = new b5(8);
                e18Var.k0(objN);
            }
            nwb nwbVar = (nwb) iuj.I(objArr, (zy7) objN, e18Var, 48);
            o5b o5bVarD = dw1.d(lja.G, false);
            int iHashCode = Long.hashCode(e18Var.T);
            hyc hycVarL = e18Var.l();
            fqb fqbVar = fqb.E;
            iqb iqbVarE = kxk.E(e18Var, fqbVar);
            dd4.e.getClass();
            re4 re4Var = cd4.b;
            e18Var.e0();
            if (e18Var.S) {
                e18Var.k(re4Var);
            } else {
                e18Var.n0();
            }
            d4c.i0(e18Var, cd4.f, o5bVarD);
            d4c.i0(e18Var, cd4.e, hycVarL);
            d4c.i0(e18Var, cd4.g, Integer.valueOf(iHashCode));
            d4c.h0(e18Var, cd4.h);
            d4c.i0(e18Var, cd4.d, iqbVarE);
            boolean zF = e18Var.f(nwbVar);
            Object objN2 = e18Var.N();
            if (zF || objN2 == lz1Var) {
                objN2 = new ve(6, nwbVar);
                e18Var.k0(objN2);
            }
            ez1.e((zy7) objN2, null, false, null, null, fd9.q0(-599593888, new fp(i4, set), e18Var), e18Var, 1572864, 62);
            boolean zBooleanValue = ((Boolean) nwbVar.getValue()).booleanValue();
            boolean zF2 = e18Var.f(nwbVar);
            Object objN3 = e18Var.N();
            if (zF2 || objN3 == lz1Var) {
                objN3 = new ve(5, nwbVar);
                e18Var.k0(objN3);
            }
            j8.b(zBooleanValue, (zy7) objN3, null, 0L, null, null, null, 0L, MTTypesetterKt.kLineSkipLimitMultiplier, fd9.q0(-925570523, new ii(set, 3, bz7Var), e18Var), e18Var, 0, 2044);
            e18Var = e18Var;
            e18Var.p(true);
            iqbVar2 = fqbVar;
        } else {
            e18Var.T();
            iqbVar2 = iqbVar;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new ji(i, 2, iqbVar2, set, bz7Var);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0095 A[PHI: r11
      0x0095: PHI (r11v10 java.lang.String) = (r11v4 java.lang.String), (r11v8 java.lang.String), (r11v12 java.lang.String) binds: [B:50:0x00a5, B:54:0x00c1, B:41:0x0092] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00f4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void e(com.anthropic.claude.sessions.types.SessionResource r16, defpackage.c69 r17, defpackage.zy7 r18, defpackage.iqb r19, defpackage.ld4 r20, int r21) {
        /*
            Method dump skipped, instruction units count: 302
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gok.e(com.anthropic.claude.sessions.types.SessionResource, c69, zy7, iqb, ld4, int):void");
    }

    public static final x76 f(SessionResource sessionResource) {
        sessionResource.getClass();
        List<String> tags = sessionResource.getTags();
        if (tags == null) {
            tags = lm6.E;
        }
        if (tags.contains("cowork-dispatch-child")) {
            return x76.E;
        }
        List<String> list = tags;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (isg.q0((String) it.next(), "cowork", false)) {
                    return x76.F;
                }
            }
        }
        return x76.G;
    }

    public static coe g(qh9 qh9Var) {
        try {
            ArrayList arrayList = qh9Var.s("id").e().E;
            ArrayList arrayList2 = new ArrayList(arrayList.size());
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((bh9) it.next()).m());
            }
            return new coe(arrayList2);
        } catch (IllegalStateException e) {
            pmf.j("Unable to parse json into type Action", e);
            return null;
        } catch (NullPointerException e2) {
            pmf.j("Unable to parse json into type Action", e2);
            return null;
        } catch (NumberFormatException e3) {
            pmf.j("Unable to parse json into type Action", e3);
            return null;
        }
    }

    public static final Object h(int i, ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            sz6.j("Cannot get repeated item from empty collection.");
            return null;
        }
        int size = arrayList.size();
        if (size < 1) {
            size = 1;
        }
        return arrayList.get(i % size);
    }

    public static final HostInfo i() {
        return new HostInfo("ClaudeAndroid", "1.260618.10");
    }

    public static final boolean j(KeyEvent keyEvent) {
        return (keyEvent.getFlags() & 2) == 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13, types: [android.content.res.TypedArray] */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v18, types: [android.content.res.TypedArray] */
    /* JADX WARN: Type inference failed for: r5v25 */
    /* JADX WARN: Type inference failed for: r5v26 */
    public static pu7 k(XmlResourceParser xmlResourceParser, Resources resources) {
        int next;
        int i;
        int i2;
        String str;
        List list;
        ArrayList arrayList;
        int i3;
        ?? r5;
        long j;
        Throwable th;
        ?? r52;
        boolean zIsTerminated;
        boolean zIsTerminated2;
        TimeUnit timeUnit = TimeUnit.DAYS;
        do {
            next = xmlResourceParser.next();
            i = 2;
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        xmlResourceParser.require(2, null, "font-family");
        if (!xmlResourceParser.getName().equals("font-family")) {
            m(xmlResourceParser);
            return null;
        }
        TypedArray typedArrayObtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), p0e.b);
        int i4 = 0;
        String string = typedArrayObtainAttributes.getString(0);
        String string2 = typedArrayObtainAttributes.getString(5);
        String string3 = typedArrayObtainAttributes.getString(6);
        String string4 = typedArrayObtainAttributes.getString(2);
        int resourceId = typedArrayObtainAttributes.getResourceId(1, 0);
        int i5 = 3;
        int integer = typedArrayObtainAttributes.getInteger(3, 1);
        int integer2 = typedArrayObtainAttributes.getInteger(4, 500);
        String string5 = typedArrayObtainAttributes.getString(7);
        typedArrayObtainAttributes.recycle();
        if (string == null || string2 == null) {
            ArrayList arrayList2 = new ArrayList();
            while (xmlResourceParser.next() != 3) {
                if (xmlResourceParser.getEventType() == 2) {
                    if (xmlResourceParser.getName().equals("font")) {
                        TypedArray typedArrayObtainAttributes2 = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), p0e.c);
                        int i6 = typedArrayObtainAttributes2.getInt(typedArrayObtainAttributes2.hasValue(8) ? 8 : 1, 400);
                        boolean z = 1 == typedArrayObtainAttributes2.getInt(typedArrayObtainAttributes2.hasValue(6) ? 6 : 2, 0);
                        int i7 = typedArrayObtainAttributes2.hasValue(9) ? 9 : 3;
                        String string6 = typedArrayObtainAttributes2.getString(typedArrayObtainAttributes2.hasValue(7) ? 7 : 4);
                        int i8 = typedArrayObtainAttributes2.getInt(i7, 0);
                        int i9 = typedArrayObtainAttributes2.hasValue(5) ? 5 : 0;
                        int resourceId2 = typedArrayObtainAttributes2.getResourceId(i9, 0);
                        String string7 = typedArrayObtainAttributes2.getString(i9);
                        typedArrayObtainAttributes2.recycle();
                        while (xmlResourceParser.next() != 3) {
                            m(xmlResourceParser);
                        }
                        arrayList2.add(new ru7(i6, i8, resourceId2, string7, string6, z));
                    } else {
                        m(xmlResourceParser);
                    }
                }
            }
            if (arrayList2.isEmpty()) {
                return null;
            }
            return new qu7((ru7[]) arrayList2.toArray(new ru7[0]));
        }
        List listL = l(resources, resourceId);
        ArrayList arrayList3 = new ArrayList();
        while (xmlResourceParser.next() != i5) {
            if (xmlResourceParser.getEventType() == i) {
                if (xmlResourceParser.getName().equals("fallback")) {
                    TypedArray typedArrayObtainAttributes3 = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), p0e.d);
                    int i10 = integer;
                    try {
                        String string8 = typedArrayObtainAttributes3.getString(i4);
                        String string9 = typedArrayObtainAttributes3.getString(1);
                        try {
                            String string10 = typedArrayObtainAttributes3.getString(i);
                            if (string8 == null) {
                                r5 = typedArrayObtainAttributes3;
                                j = 1;
                                throw new XmlPullParserException("query attribute must be set in fallback element");
                            }
                            while (xmlResourceParser.next() != 3) {
                                try {
                                    try {
                                        m(xmlResourceParser);
                                    } catch (Throwable th2) {
                                        th = th2;
                                        r52 = typedArrayObtainAttributes3;
                                        j = 1;
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    r5 = typedArrayObtainAttributes3;
                                    j = 1;
                                    th = th;
                                    r52 = r5;
                                }
                            }
                            i2 = integer2;
                            str = string5;
                            list = listL;
                            r5 = typedArrayObtainAttributes3;
                            arrayList = arrayList3;
                            i3 = i10;
                            j = 1;
                            try {
                                hu7 hu7Var = new hu7(string, string2, string8, string9, list, string10);
                                if (r5 instanceof AutoCloseable) {
                                    ((AutoCloseable) r5).close();
                                } else if (r5 instanceof ExecutorService) {
                                    ExecutorService executorService = (ExecutorService) r5;
                                    if (executorService != ForkJoinPool.commonPool() && !(zIsTerminated2 = executorService.isTerminated())) {
                                        executorService.shutdown();
                                        boolean z2 = false;
                                        while (!zIsTerminated2) {
                                            try {
                                                zIsTerminated2 = executorService.awaitTermination(1L, timeUnit);
                                            } catch (InterruptedException unused) {
                                                if (!z2) {
                                                    executorService.shutdownNow();
                                                    z2 = true;
                                                }
                                            }
                                        }
                                        if (z2) {
                                            Thread.currentThread().interrupt();
                                        }
                                    }
                                } else {
                                    r5.recycle();
                                }
                                arrayList.add(hu7Var);
                            } catch (Throwable th4) {
                                th = th4;
                            }
                            th = th4;
                        } catch (Throwable th5) {
                            th = th5;
                            r5 = typedArrayObtainAttributes3;
                            j = 1;
                        }
                    } catch (Throwable th6) {
                        th = th6;
                        r5 = typedArrayObtainAttributes3;
                        j = 1;
                    }
                    th = th;
                    r52 = r5;
                    if (r52 == 0) {
                        throw th;
                    }
                    try {
                        if (r52 instanceof AutoCloseable) {
                            ((AutoCloseable) r52).close();
                            throw th;
                        }
                        if (!(r52 instanceof ExecutorService)) {
                            r52.recycle();
                            throw th;
                        }
                        ExecutorService executorService2 = (ExecutorService) r52;
                        if (executorService2 == ForkJoinPool.commonPool() || (zIsTerminated = executorService2.isTerminated())) {
                            throw th;
                        }
                        executorService2.shutdown();
                        boolean z3 = false;
                        while (!zIsTerminated) {
                            try {
                                zIsTerminated = executorService2.awaitTermination(j, timeUnit);
                            } catch (InterruptedException unused2) {
                                if (!z3) {
                                    executorService2.shutdownNow();
                                    z3 = true;
                                }
                            }
                        }
                        if (!z3) {
                            throw th;
                        }
                        Thread.currentThread().interrupt();
                        throw th;
                    } catch (Throwable th7) {
                        th.addSuppressed(th7);
                        throw th;
                    }
                }
                i2 = integer2;
                str = string5;
                list = listL;
                arrayList = arrayList3;
                i3 = integer;
                m(xmlResourceParser);
                arrayList3 = arrayList;
                integer = i3;
                listL = list;
                integer2 = i2;
                string5 = str;
                i = 2;
                i4 = 0;
                i5 = 3;
            }
        }
        int i11 = integer2;
        String str2 = string5;
        List list2 = listL;
        ArrayList arrayList4 = arrayList3;
        int i12 = integer;
        if (!arrayList4.isEmpty()) {
            return new su7(arrayList4, i12, i11, str2);
        }
        if (string3 == null) {
            sz6.p("The provider font XML requires query attribute or fallback children.");
            return null;
        }
        arrayList4.add(new hu7(string, string2, string3, null, list2, null));
        if (string4 != null) {
            arrayList4.add(new hu7(string, string2, string4, null, list2, null));
        }
        return new su7(arrayList4, i12, i11, str2);
    }

    public static List l(Resources resources, int i) {
        if (i == 0) {
            return Collections.EMPTY_LIST;
        }
        TypedArray typedArrayObtainTypedArray = resources.obtainTypedArray(i);
        try {
            if (typedArrayObtainTypedArray.length() == 0) {
                return Collections.EMPTY_LIST;
            }
            ArrayList arrayList = new ArrayList();
            if (typedArrayObtainTypedArray.getType(0) == 1) {
                for (int i2 = 0; i2 < typedArrayObtainTypedArray.length(); i2++) {
                    int resourceId = typedArrayObtainTypedArray.getResourceId(i2, 0);
                    if (resourceId != 0) {
                        String[] stringArray = resources.getStringArray(resourceId);
                        ArrayList arrayList2 = new ArrayList();
                        for (String str : stringArray) {
                            arrayList2.add(Base64.decode(str, 0));
                        }
                        arrayList.add(arrayList2);
                    }
                }
            } else {
                String[] stringArray2 = resources.getStringArray(i);
                ArrayList arrayList3 = new ArrayList();
                for (String str2 : stringArray2) {
                    arrayList3.add(Base64.decode(str2, 0));
                }
                arrayList.add(arrayList3);
            }
            return arrayList;
        } finally {
            typedArrayObtainTypedArray.recycle();
        }
    }

    public static void m(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        int i = 1;
        while (i > 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i++;
            } else if (next == 3) {
                i--;
            }
        }
    }

    public static final y76 n(SessionResource sessionResource) {
        sessionResource.getClass();
        RequiresActionDetails pending_action = sessionResource.getPending_action();
        y76 y76Var = y76.E;
        if (pending_action != null) {
            return pending_action.isAskUserQuestion() ? y76.F : y76Var;
        }
        if (sessionResource.getConnection_status() != ConnectionStatus.DISCONNECTED && (sessionResource.getSession_status() == SessionStatus.RUNNING || sessionResource.getSession_status() == SessionStatus.PENDING)) {
            return y76.G;
        }
        PostTurnSummary post_turn_summary = sessionResource.getPost_turn_summary();
        SummaryStatusCategory status_category = post_turn_summary != null ? post_turn_summary.getStatus_category() : null;
        int i = status_category == null ? -1 : mp.b[status_category.ordinal()];
        y76 y76Var2 = y76.I;
        switch (i) {
            case -1:
            case 6:
            case 7:
                switch (mp.a[sessionResource.getSession_status().ordinal()]) {
                    case 1:
                        return y76Var;
                    case 2:
                        return y76Var2;
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        return y76.K;
                    default:
                        wg6.i();
                        return null;
                }
            case 0:
            default:
                wg6.i();
                return null;
            case 1:
                return y76.J;
            case 2:
                return y76.H;
            case 3:
                return y76Var2;
            case 4:
            case 5:
                return y76Var;
        }
    }

    public static int o(int i) {
        return (int) (((long) Integer.rotateLeft((int) (((long) i) * (-862048943)), 15)) * 461845907);
    }
}
