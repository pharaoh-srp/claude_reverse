package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.api.chat.tool.ToolResultKnowledge;
import com.anthropic.claude.artifact.model.ArtifactMetadata;
import com.anthropic.claude.chat.parse.ParsedContentBlock$McpToolInvocation;
import com.anthropic.claude.chat.parse.ParsedContentBlock$Thinking;
import com.anthropic.claude.configs.flags.StreamSmoothingConfig;
import com.anthropic.claude.tool.model.CalendarSearchV0Output;
import com.anthropic.claude.tool.model.CalendarSearchV0OutputCalendarSearchError;
import com.anthropic.claude.tool.model.CalendarSearchV0OutputCalendarSearchResult;
import com.anthropic.claude.types.strings.ResearchTaskId;
import com.pvporbit.freetype.FreeTypeConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class hvj {
    public static final ta4 a = new ta4(1980455762, false, new xa4(2));
    public static final StackTraceElement[] b = new StackTraceElement[0];

    /* JADX WARN: Removed duplicated region for block: B:87:0x0165  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(java.util.Set r19, java.lang.String r20, defpackage.qi3 r21, defpackage.iqb r22, com.anthropic.claude.api.chat.messages.ApiHelpline r23, defpackage.zy7 r24, defpackage.ld4 r25, int r26) {
        /*
            Method dump skipped, instruction units count: 399
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hvj.a(java.util.Set, java.lang.String, qi3, iqb, com.anthropic.claude.api.chat.messages.ApiHelpline, zy7, ld4, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:95:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(defpackage.iqb r17, java.lang.String r18, java.lang.String r19, defpackage.bz7 r20, defpackage.zy7 r21, defpackage.zy7 r22, defpackage.ld4 r23, int r24, int r25) {
        /*
            Method dump skipped, instruction units count: 337
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hvj.b(iqb, java.lang.String, java.lang.String, bz7, zy7, zy7, ld4, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:194:0x02e1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(float r44, int r45, int r46, int r47, defpackage.b20 r48, defpackage.wo1 r49, defpackage.ta4 r50, defpackage.ld4 r51, defpackage.iqb r52, defpackage.yzb r53, defpackage.mnc r54, defpackage.unc r55, defpackage.koc r56, defpackage.kcg r57, defpackage.pcg r58, boolean r59) {
        /*
            Method dump skipped, instruction units count: 1348
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hvj.c(float, int, int, int, b20, wo1, ta4, ld4, iqb, yzb, mnc, unc, koc, kcg, pcg, boolean):void");
    }

    public static final void d(s64 s64Var, mtc mtcVar, kg3 kg3Var, boolean z, boolean z2, g93 g93Var, m83 m83Var, String str, lvh lvhVar, ld4 ld4Var, int i) {
        s64Var.getClass();
        kg3Var.getClass();
        g93Var.getClass();
        str.getClass();
        lvhVar.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-1355399667);
        int i2 = i | (e18Var.f(s64Var) ? 4 : 2) | (e18Var.f(mtcVar) ? 32 : 16) | (e18Var.h(kg3Var) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC) | (e18Var.g(z) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE) | (e18Var.g(z2) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN) | (e18Var.f(g93Var) ? 131072 : 65536) | (e18Var.f(m83Var) ? FreeTypeConstants.FT_LOAD_COLOR : 524288) | (e18Var.f(str) ? 8388608 : 4194304) | (e18Var.f(lvhVar) ? 67108864 : 33554432);
        if (e18Var.Q(i2 & 1, (38347923 & i2) != 38347922)) {
            gwk.a(!((mtcVar instanceof itc) || (mtcVar instanceof atc)), fd9.q0(590730591, new o7g(s64Var, mtcVar, kg3Var, z, z2, g93Var, m83Var, str, lvhVar), e18Var), e18Var, 48, 0);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new o7g(s64Var, mtcVar, kg3Var, z, z2, g93Var, m83Var, str, lvhVar, i, 2);
        }
    }

    public static final void e(s64 s64Var, mtc mtcVar, kg3 kg3Var, boolean z, boolean z2, g93 g93Var, m83 m83Var, String str, lvh lvhVar, ld4 ld4Var, int i) {
        g93 g93Var2;
        m83 m83Var2;
        boolean z3;
        m83 m83Var3;
        m83 m83Var4;
        boolean z4;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(890179250);
        int i2 = i | (e18Var.f(s64Var) ? 4 : 2) | (e18Var.f(mtcVar) ? 32 : 16) | (e18Var.h(kg3Var) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC) | (e18Var.g(z) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE) | (e18Var.g(z2) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN) | (e18Var.f(g93Var) ? 131072 : 65536) | (e18Var.f(m83Var) ? FreeTypeConstants.FT_LOAD_COLOR : 524288) | (e18Var.f(str) ? 8388608 : 4194304) | (e18Var.f(lvhVar) ? 67108864 : 33554432);
        if (e18Var.Q(i2 & 1, (i2 & 38347923) != 38347922)) {
            boolean z5 = mtcVar instanceof itc;
            iqb iqbVar = fqb.E;
            lz1 lz1Var = jd4.a;
            if (z5) {
                e18Var.a0(-2092592123);
                itc itcVar = (itc) mtcVar;
                jz0 jz0Var = itcVar.b;
                boolean zF = ((i2 & 29360128) == 8388608) | e18Var.f(g93Var.C);
                Object objN = e18Var.N();
                if (zF || objN == lz1Var) {
                    objN = mpk.w(new ytf(g93Var, 6, str));
                    e18Var.k0(objN);
                }
                wlg wlgVar = (wlg) objN;
                if (jz0Var == null || ((Integer) wlgVar.getValue()) != null) {
                    m83Var2 = m83Var;
                    e18Var.a0(-2091492522);
                    String str2 = itcVar.a;
                    Integer num = (Integer) wlgVar.getValue();
                    iqb iqbVar2 = e93.a;
                    iqb iqbVarL = gb9.L(iqbVar, 8.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 2);
                    if (!z) {
                        iqbVar = e93.a;
                    }
                    z4 = false;
                    nuk.a(str2, iqbVarL.B(iqbVar), num, e18Var, 0);
                    e18Var.p(false);
                } else {
                    e18Var.a0(-2092259276);
                    boolean z6 = !itcVar.e;
                    StreamSmoothingConfig streamSmoothingConfig = g93Var.e;
                    sq sqVar = new sq(jz0Var, m83Var, z, kg3Var, 17);
                    m83Var2 = m83Var;
                    rqg.a(z6, streamSmoothingConfig, fd9.q0(116377821, sqVar, e18Var), e18Var, 384);
                    e18Var.p(false);
                    z4 = false;
                }
                e18Var.p(z4);
            } else {
                m83Var2 = m83Var;
                if (mtcVar instanceof zsc) {
                    e18Var.a0(-2091106510);
                    zsc zscVar = (zsc) mtcVar;
                    Boolean bool = (Boolean) g93Var.l.get(zscVar.c.getUuid());
                    boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
                    ArtifactMetadata artifactMetadata = zscVar.c;
                    String str3 = zscVar.a;
                    iqb iqbVar3 = e93.a;
                    iqb iqbVarL2 = gb9.L(iqbVar, 20.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 2);
                    if (!z) {
                        iqbVar = e93.a;
                    }
                    iqb iqbVarB = iqbVarL2.B(iqbVar);
                    boolean z7 = ((i2 & 3670016) == 1048576) | ((i2 & 112) == 32);
                    Object objN2 = e18Var.N();
                    if (z7 || objN2 == lz1Var) {
                        objN2 = new p7g(m83Var2, mtcVar, 2);
                        e18Var.k0(objN2);
                    }
                    ur0.b(artifactMetadata, str3, (zy7) objN2, iqbVarB, zBooleanValue, e18Var, 0, 16);
                    e18Var = e18Var;
                    e18Var.p(false);
                } else {
                    int i3 = 3;
                    if (mtcVar instanceof ysc) {
                        e18Var.a0(-2090517138);
                        boolean z8 = !((ysc) mtcVar).d;
                        boolean z9 = ((i2 & 3670016) == 1048576) | ((i2 & 112) == 32);
                        Object objN3 = e18Var.N();
                        if (z9 || objN3 == lz1Var) {
                            objN3 = new p7g(m83Var2, mtcVar, i3);
                            e18Var.k0(objN3);
                        }
                        zy7 zy7Var = (zy7) objN3;
                        iqb iqbVar4 = e93.a;
                        iqb iqbVarL3 = gb9.L(iqbVar, 10.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 2);
                        if (!z) {
                            iqbVar = e93.a;
                        }
                        npk.a(0, 0, e18Var, zy7Var, iqbVarL3.B(iqbVar), z8);
                        e18Var.p(false);
                    } else {
                        int i4 = 0;
                        if (mtcVar instanceof htc) {
                            e18Var.a0(-2090092531);
                            htc htcVar = (htc) mtcVar;
                            List list = htcVar.d;
                            boolean z10 = !htcVar.e;
                            String strR = euk.r(htcVar.b, htcVar.c, z10, e18Var);
                            boolean zF2 = e18Var.f(list);
                            Object objN4 = e18Var.N();
                            if (zF2 || objN4 == lz1Var) {
                                ArrayList arrayList = new ArrayList();
                                Iterator it = list.iterator();
                                while (it.hasNext()) {
                                    Object next = it.next();
                                    Iterator it2 = it;
                                    if (next instanceof ToolResultKnowledge) {
                                        arrayList.add(next);
                                    }
                                    it = it2;
                                }
                                objN4 = jpi.k(arrayList);
                                e18Var.k0(objN4);
                            }
                            List list2 = (List) objN4;
                            boolean z11 = htcVar.f;
                            iqb iqbVar5 = e93.a;
                            iqb iqbVarL4 = gb9.L(iqbVar, 20.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 2);
                            if (!z) {
                                iqbVar = e93.a;
                            }
                            iqb iqbVarB2 = iqbVarL4.B(iqbVar);
                            ta4 ta4VarQ0 = fd9.q0(1416105110, new ska(28, mtcVar), e18Var);
                            boolean zF3 = ((i2 & 3670016) == 1048576) | e18Var.f(strR) | e18Var.h(list2);
                            Object objN5 = e18Var.N();
                            if (zF3 || objN5 == lz1Var) {
                                objN5 = new hya(m83Var2, strR, list2, 26);
                                e18Var.k0(objN5);
                            }
                            m83Var3 = m83Var2;
                            u4b.b(ta4VarQ0, strR, z10, (zy7) objN5, iqbVarB2, false, z11, null, null, e18Var, 6, 928);
                            e18Var.p(false);
                        } else {
                            m83Var3 = m83Var2;
                            if (mtcVar instanceof ParsedContentBlock$McpToolInvocation) {
                                e18Var.a0(-2089135158);
                                ParsedContentBlock$McpToolInvocation parsedContentBlock$McpToolInvocation = (ParsedContentBlock$McpToolInvocation) mtcVar;
                                boolean z12 = ((i2 & 3670016) == 1048576) | ((i2 & 112) == 32);
                                Object objN6 = e18Var.N();
                                if (z12 || objN6 == lz1Var) {
                                    objN6 = new p7g(m83Var3, mtcVar, 4);
                                    e18Var.k0(objN6);
                                }
                                zy7 zy7Var2 = (zy7) objN6;
                                iqb iqbVar6 = e93.a;
                                iqb iqbVarL5 = gb9.L(iqbVar, 20.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 2);
                                if (!z) {
                                    iqbVar = e93.a;
                                }
                                u4b.c(parsedContentBlock$McpToolInvocation, zy7Var2, iqbVarL5.B(iqbVar), e18Var, (i2 >> 3) & 14);
                                e18Var.p(false);
                            } else {
                                if (mtcVar instanceof ctc) {
                                    e18Var.a0(-2088760585);
                                    ctc ctcVar = (ctc) mtcVar;
                                    boolean z13 = z2 && g93Var.h.b();
                                    if (!z) {
                                        iqbVar = e93.a;
                                    }
                                    int i5 = i2 >> 12;
                                    z3 = z;
                                    cok.i(ctcVar, g93Var, m83Var3, z13, iqbVar, null, e18Var, ((i2 >> 3) & 14) | (i5 & 112) | (i5 & 896));
                                    m83Var4 = m83Var3;
                                    e18Var.p(false);
                                } else {
                                    z3 = z;
                                    m83Var4 = m83Var3;
                                    if (mtcVar instanceof btc) {
                                        e18Var.a0(-2088384927);
                                        wd6.H(s64Var, mtcVar.hasSources(), null, null, null, null, fd9.q0(-751789794, new tw(mtcVar, m83Var4, z3, 10), e18Var), e18Var, (i2 & 14) | 1572864, 30);
                                        e18Var.p(false);
                                    } else if (mtcVar instanceof ParsedContentBlock$Thinking) {
                                        e18Var.a0(763946646);
                                        e18Var.p(false);
                                    } else if (mtcVar instanceof atc) {
                                        e18Var.a0(-2087399623);
                                        atc atcVar = (atc) mtcVar;
                                        String str4 = atcVar.a;
                                        String str5 = atcVar.c;
                                        jz0 jz0Var2 = atcVar.b;
                                        iqb iqbVar7 = e93.a;
                                        iqb iqbVarL6 = gb9.L(iqbVar, 8.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 2);
                                        if (!z3) {
                                            iqbVar = e93.a;
                                        }
                                        g93Var2 = g93Var;
                                        m83Var2 = m83Var;
                                        nwk.a(str4, str5, jz0Var2, iqbVarL6.B(iqbVar), e18Var, 0, 0);
                                        e18Var = e18Var;
                                        e18Var.p(false);
                                    } else {
                                        g93Var2 = g93Var;
                                        m83Var2 = m83Var4;
                                        if (mtcVar instanceof gtc) {
                                            e18Var.a0(-2086981371);
                                            List list3 = g93Var2.c;
                                            gtc gtcVar = (gtc) mtcVar;
                                            jme jmeVar = gtcVar.b;
                                            String str6 = jmeVar != null ? jmeVar.a : null;
                                            boolean zG0 = w44.G0(list3, str6 != null ? ResearchTaskId.m1100boximpl(str6) : null);
                                            jme jmeVar2 = gtcVar.b;
                                            boolean z14 = ((i2 & 3670016) == 1048576) | ((i2 & 112) == 32);
                                            Object objN7 = e18Var.N();
                                            if (z14 || objN7 == lz1Var) {
                                                objN7 = new p7g(m83Var2, mtcVar, i4);
                                                e18Var.k0(objN7);
                                            }
                                            zy7 zy7Var3 = jmeVar != null ? (zy7) objN7 : null;
                                            boolean zA = g93Var2.d.a();
                                            iqb iqbVar8 = e93.a;
                                            iqb iqbVarL7 = gb9.L(iqbVar, 20.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 2);
                                            if (!z3) {
                                                iqbVar = e93.a;
                                            }
                                            ime.c(jmeVar2, zG0, iqbVarL7.B(iqbVar), zA, zy7Var3, e18Var, 0);
                                            e18Var = e18Var;
                                            e18Var.p(false);
                                        } else if (mtcVar instanceof ftc) {
                                            e18Var.a0(-2086357434);
                                            ftc ftcVar = (ftc) mtcVar;
                                            if (ftcVar.i instanceof uwh) {
                                                e18Var.a0(-2086275098);
                                                boolean zB = g93Var2.h.b();
                                                iqb iqbVar9 = e93.a;
                                                iqb iqbVarL8 = gb9.L(iqbVar, 20.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 2);
                                                if (!z3) {
                                                    iqbVar = e93.a;
                                                }
                                                osk.l(ftcVar, lvhVar, zB, str, z2, iqbVarL8.B(iqbVar), e18Var, ((i2 >> 3) & 14) | ((i2 >> 21) & 112) | ((i2 >> 12) & 7168) | (57344 & i2));
                                                e18Var.p(false);
                                            } else {
                                                e18Var.a0(-2085773456);
                                                e18Var.p(false);
                                            }
                                            e18Var.p(false);
                                        } else {
                                            if (!(mtcVar instanceof ltc)) {
                                                throw ebh.u(e18Var, 763785097, false);
                                            }
                                            e18Var.a0(-2085706279);
                                            e18Var.p(false);
                                        }
                                    }
                                }
                                g93Var2 = g93Var;
                                m83Var2 = m83Var4;
                            }
                        }
                        g93Var2 = g93Var;
                        m83Var2 = m83Var3;
                        z3 = z;
                    }
                }
            }
            g93Var2 = g93Var;
            z3 = z;
        } else {
            g93Var2 = g93Var;
            m83Var2 = m83Var;
            z3 = z;
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new o7g(s64Var, mtcVar, kg3Var, z3, z2, g93Var2, m83Var2, str, lvhVar, i, 1);
        }
    }

    public static final exh f(CalendarSearchV0Output calendarSearchV0Output) {
        if (calendarSearchV0Output instanceof CalendarSearchV0OutputCalendarSearchResult) {
            return new exh(calendarSearchV0Output, true);
        }
        if (calendarSearchV0Output instanceof CalendarSearchV0OutputCalendarSearchError) {
            return new exh(calendarSearchV0Output, false);
        }
        wg6.i();
        return null;
    }

    public static final boolean g(z7d z7dVar) {
        return (z7dVar.l() || z7dVar.h || !z7dVar.d) ? false : true;
    }

    public static final boolean h(z7d z7dVar) {
        return !z7dVar.h && z7dVar.d;
    }

    public static final boolean i(z7d z7dVar) {
        return (z7dVar.l() || !z7dVar.h || z7dVar.d) ? false : true;
    }

    public static final boolean j(z7d z7dVar) {
        return z7dVar.h && !z7dVar.d;
    }

    public static final boolean k(long j, z7d z7dVar) {
        long j2 = z7dVar.c;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j2 & 4294967295L));
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        return (fIntBitsToFloat2 < MTTypesetterKt.kLineSkipLimitMultiplier) | (fIntBitsToFloat > ((float) i)) | (fIntBitsToFloat < MTTypesetterKt.kLineSkipLimitMultiplier) | (fIntBitsToFloat2 > ((float) i2));
    }

    public static final boolean l(z7d z7dVar, long j, long j2) {
        int i = z7dVar.i == 1 ? 1 : 0;
        long j3 = z7dVar.c;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j3 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j3 & 4294967295L));
        float f = i;
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j2 >> 32)) * f;
        float f2 = ((int) (j >> 32)) + fIntBitsToFloat3;
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (j2 & 4294967295L)) * f;
        return (fIntBitsToFloat > f2) | (fIntBitsToFloat < (-fIntBitsToFloat3)) | (fIntBitsToFloat2 < (-fIntBitsToFloat4)) | (fIntBitsToFloat2 > ((int) (j & 4294967295L)) + fIntBitsToFloat4);
    }

    public static final int m(String str) {
        if (!isg.q0(str, "#", false)) {
            mr9.q("Invalid color value ".concat(str));
            return 0;
        }
        int length = str.length();
        if (length == 4) {
            int iE0 = wd6.E0(str.substring(1));
            return ((iE0 & 15) * 17) | (((iE0 >> 8) & 15) * 1114112) | (((iE0 >> 4) & 15) * 4352) | (-16777216);
        }
        if (length == 5) {
            int iE02 = wd6.E0(str.substring(1));
            return ((iE02 & 15) * 17) | (((iE02 >> 12) & 15) * 285212672) | (((iE02 >> 8) & 15) * 1114112) | (((iE02 >> 4) & 15) * 4352) | (-16777216);
        }
        if (length == 7) {
            return wd6.E0(str.substring(1)) | (-16777216);
        }
        if (length != 9) {
            return -16777216;
        }
        return wd6.E0(str.substring(1));
    }

    public static final float n(String str, cz5 cz5Var) {
        cz5Var.getClass();
        if (str == null) {
            return MTTypesetterKt.kLineSkipLimitMultiplier;
        }
        if (isg.h0(str, "dp", false)) {
            return Float.parseFloat(bsg.T0(str, "dp"));
        }
        if (isg.h0(str, "px", false)) {
            return cz5Var.g0(Float.parseFloat(bsg.T0(str, "px")));
        }
        pmf.n("value should ends with dp or px");
        return MTTypesetterKt.kLineSkipLimitMultiplier;
    }

    public static final int o(String str) {
        int iHashCode = str.hashCode();
        if (iHashCode != -1073910849) {
            if (iHashCode != -436781190) {
                if (iHashCode == 94742715 && str.equals("clamp")) {
                    return 0;
                }
            } else if (str.equals("repeated")) {
                return 1;
            }
        } else if (str.equals("mirror")) {
            return 2;
        }
        pmf.n("unknown tileMode: ".concat(str));
        return 0;
    }

    public static final long p(z7d z7dVar) {
        return r(z7dVar, false);
    }

    public static final long q(z7d z7dVar) {
        return r(z7dVar, true);
    }

    public static final long r(z7d z7dVar, boolean z) {
        long jH = fcc.h(z7dVar.c, z7dVar.g);
        if (z || !z7dVar.l()) {
            return jH;
        }
        return 0L;
    }

    public static final boolean s(z7d z7dVar) {
        return !fcc.c(r(z7dVar, true), 0L);
    }
}
