package defpackage;

import android.app.NotificationManager;
import android.content.Context;
import android.os.Build;
import androidx.compose.foundation.layout.b;
import androidx.credentials.exceptions.publickeycredential.CreatePublicKeyCredentialDomException;
import androidx.credentials.exceptions.publickeycredential.GetPublicKeyCredentialDomException;
import androidx.credentials.internal.FrameworkClassParsingException;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.R;
import com.anthropic.claude.api.chat.citation.Citation;
import com.anthropic.claude.api.chat.citation.CitationSource;
import com.anthropic.claude.api.chat.tool.GenericSourceMetadata;
import com.anthropic.claude.api.chat.tool.GoogleDocMetadata;
import com.anthropic.claude.api.chat.tool.SourceMetadata;
import com.anthropic.claude.api.chat.tool.ToolResultKnowledge;
import com.anthropic.claude.api.chat.tool.UnknownSourceMetadata;
import com.anthropic.claude.api.chat.tool.WebpageMetadata;
import com.anthropic.claude.tool.model.KnowledgeSource;
import com.pvporbit.freetype.FreeTypeConstants;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class jpi {
    public static final ta4 b = new ta4(1782627951, false, new m14(17));
    public static final xb c = new xb(7);
    public final /* synthetic */ int a;

    public /* synthetic */ jpi(int i) {
        this.a = i;
    }

    public static final void a(int i, ld4 ld4Var) {
        NotificationManager notificationManager;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(733899393);
        int i2 = 0;
        int i3 = 1;
        if (e18Var.Q(i & 1, i != 0)) {
            Context context = (Context) e18Var.j(w00.b);
            wxc wxcVarO = oq5.O(e18Var);
            wxc wxcVarW0 = wd6.w0("android.permission.ACCESS_COARSE_LOCATION", null, e18Var, 6, 2);
            wxc wxcVarW02 = wd6.w0("android.permission.READ_CALENDAR", null, e18Var, 6, 2);
            Object objN = e18Var.N();
            lz1 lz1Var = jd4.a;
            if (objN == lz1Var) {
                context.getClass();
                objN = mpk.P(Boolean.valueOf(Build.VERSION.SDK_INT < 33 ? !((notificationManager = (NotificationManager) context.getSystemService(NotificationManager.class)) == null || !notificationManager.areNotificationsEnabled()) : x44.x(context, "android.permission.POST_NOTIFICATIONS") == 0));
                e18Var.k0(objN);
            }
            nwb nwbVar = (nwb) objN;
            Object objN2 = e18Var.N();
            if (objN2 == lz1Var) {
                objN2 = mpk.P(Boolean.valueOf(x44.x(context, "android.permission.ACCESS_COARSE_LOCATION") == 0));
                e18Var.k0(objN2);
            }
            nwb nwbVar2 = (nwb) objN2;
            Object objN3 = e18Var.N();
            if (objN3 == lz1Var) {
                objN3 = mpk.P(Boolean.valueOf(x44.x(context, "android.permission.READ_CALENDAR") == 0));
                e18Var.k0(objN3);
            }
            nwb nwbVar3 = (nwb) objN3;
            boolean zH = e18Var.h(context);
            Object objN4 = e18Var.N();
            if (zH || objN4 == lz1Var) {
                objN4 = new wvc(context, nwbVar, nwbVar2, nwbVar3);
                e18Var.k0(objN4);
            }
            mwa.d(iei.a, null, (bz7) objN4, e18Var, 6);
            boolean zBooleanValue = ((Boolean) nwbVar.getValue()).booleanValue();
            boolean zBooleanValue2 = ((Boolean) nwbVar2.getValue()).booleanValue();
            boolean zBooleanValue3 = ((Boolean) nwbVar3.getValue()).booleanValue();
            boolean zH2 = e18Var.h(context) | e18Var.f(wxcVarO);
            Object objN5 = e18Var.N();
            if (zH2 || objN5 == lz1Var) {
                objN5 = new pxc(context, wxcVarO, i2);
                e18Var.k0(objN5);
            }
            zy7 zy7Var = (zy7) objN5;
            boolean zH3 = e18Var.h(context) | e18Var.f(wxcVarW0);
            Object objN6 = e18Var.N();
            if (zH3 || objN6 == lz1Var) {
                objN6 = new pxc(context, wxcVarW0, i3);
                e18Var.k0(objN6);
            }
            zy7 zy7Var2 = (zy7) objN6;
            boolean zH4 = e18Var.h(context) | e18Var.f(wxcVarW02);
            Object objN7 = e18Var.N();
            if (zH4 || objN7 == lz1Var) {
                objN7 = new pxc(context, wxcVarW02, 2);
                e18Var.k0(objN7);
            }
            d(zBooleanValue, zBooleanValue2, zBooleanValue3, zy7Var, zy7Var2, (zy7) objN7, null, e18Var, 0);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new oua(i, 20);
        }
    }

    public static final void b(ggc ggcVar, iqb iqbVar, ld4 ld4Var, int i) {
        int i2;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(588771856);
        if ((i & 6) == 0) {
            i2 = (e18Var.f(ggcVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= e18Var.f(iqbVar) ? 32 : 16;
        }
        if (e18Var.Q(i2 & 1, (i2 & 19) != 18)) {
            nvk.d(d4c.j0(R.string.onboarding_v2_permission_title, e18Var), d4c.j0(R.string.onboarding_v2_permission_subtitle, e18Var), d4c.j0(R.string.onboarding_v2_continue, e18Var), ggcVar.b, iqbVar.B(b.c), false, false, false, null, null, prk.a, e18Var, 0, 992);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new ob9(ggcVar, iqbVar, i, 1);
        }
    }

    public static final void c(ud0 ud0Var, String str, String str2, boolean z, zy7 zy7Var, iqb iqbVar, ld4 ld4Var, int i) {
        int i2;
        String str3;
        String str4;
        e18 e18Var;
        iqb iqbVar2;
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(-82439402);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? e18Var2.f(ud0Var) : e18Var2.h(ud0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            str3 = str;
            i2 |= e18Var2.f(str3) ? 32 : 16;
        } else {
            str3 = str;
        }
        if ((i & 384) == 0) {
            str4 = str2;
            i2 |= e18Var2.f(str4) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        } else {
            str4 = str2;
        }
        if ((i & 3072) == 0) {
            i2 |= e18Var2.g(z) ? 2048 : FreeTypeConstants.FT_LOAD_NO_RECURSE;
        }
        if ((i & 24576) == 0) {
            i2 |= e18Var2.h(zy7Var) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN;
        }
        int i3 = i2 | 196608;
        if (e18Var2.Q(i3 & 1, (74899 & i3) != 74898)) {
            boolean z2 = ((i3 & 7168) == 2048) | ((57344 & i3) == 16384);
            Object objN = e18Var2.N();
            if (z2 || objN == jd4.a) {
                objN = new sp(z, zy7Var, 3);
                e18Var2.k0(objN);
            }
            iqbVar2 = fqb.E;
            e18Var = e18Var2;
            ghk.a((zy7) objN, iqbVar2, null, null, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, null, fd9.q0(-1084310417, new qe(ud0Var, str3, z, str4, 7), e18Var2), e18Var, ((i3 >> 12) & 112) | 100663296, 252);
        } else {
            e18Var = e18Var2;
            e18Var.T();
            iqbVar2 = iqbVar;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new pg1(ud0Var, str, str2, z, zy7Var, iqbVar2, i, 10);
        }
    }

    public static final void d(boolean z, boolean z2, boolean z3, zy7 zy7Var, zy7 zy7Var2, zy7 zy7Var3, iqb iqbVar, ld4 ld4Var, int i) {
        int i2;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(350707468);
        if ((i & 6) == 0) {
            i2 = (e18Var.g(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= e18Var.g(z2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= e18Var.g(z3) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        if ((i & 3072) == 0) {
            i2 |= e18Var.h(zy7Var) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE;
        }
        if ((i & 24576) == 0) {
            i2 |= e18Var.h(zy7Var2) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN;
        }
        if ((196608 & i) == 0) {
            i2 |= e18Var.h(zy7Var3) ? 131072 : 65536;
        }
        int i3 = i2 | 1572864;
        if (e18Var.Q(i3 & 1, (599187 & i3) != 599186)) {
            ho0 ho0Var = new ho0(12.0f, true, new sz6(1));
            fqb fqbVar = fqb.E;
            iqb iqbVarL = gb9.L(b.c(fqbVar, 1.0f), 24.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 2);
            q64 q64VarA = p64.a(ho0Var, lja.S, e18Var, 6);
            iqbVar = fqbVar;
            int iHashCode = Long.hashCode(e18Var.T);
            hyc hycVarL = e18Var.l();
            iqb iqbVarE = kxk.E(e18Var, iqbVarL);
            dd4.e.getClass();
            re4 re4Var = cd4.b;
            e18Var.e0();
            if (e18Var.S) {
                e18Var.k(re4Var);
            } else {
                e18Var.n0();
            }
            d4c.i0(e18Var, cd4.f, q64VarA);
            d4c.i0(e18Var, cd4.e, hycVarL);
            d4c.i0(e18Var, cd4.g, Integer.valueOf(iHashCode));
            d4c.h0(e18Var, cd4.h);
            d4c.i0(e18Var, cd4.d, iqbVarE);
            int i4 = i3 << 3;
            c(ud0.S0, d4c.j0(R.string.onboarding_v2_permission_notifications_title, e18Var), d4c.j0(R.string.onboarding_v2_permission_notifications_subtitle, e18Var), z, zy7Var, null, e18Var, (i4 & 57344) | ((i3 << 9) & 7168));
            c(ud0.G0, d4c.j0(R.string.onboarding_v2_permission_location_title, e18Var), d4c.j0(R.string.onboarding_v2_permission_location_subtitle, e18Var), z2, zy7Var2, null, e18Var, ((i3 << 6) & 7168) | (i3 & 57344));
            c(ud0.z, d4c.j0(R.string.onboarding_v2_permission_calendar_title, e18Var), d4c.j0(R.string.onboarding_v2_permission_calendar_subtitle, e18Var), z3, zy7Var3, null, e18Var, (i4 & 7168) | ((i3 >> 3) & 57344));
            e18Var.p(true);
        } else {
            e18Var.T();
        }
        iqb iqbVar2 = iqbVar;
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new zj1(z, z2, z3, zy7Var, zy7Var2, zy7Var3, iqbVar2, i, 1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:122:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0312  */
    /* JADX WARN: Removed duplicated region for block: B:127:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00fc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void e(defpackage.u3g r39, defpackage.x3g r40, java.lang.String r41, boolean r42, defpackage.bz7 r43, defpackage.ta4 r44, defpackage.zy7 r45, defpackage.mnc r46, defpackage.iqb r47, boolean r48, defpackage.ld4 r49, int r50, int r51) {
        /*
            Method dump skipped, instruction units count: 808
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jpi.e(u3g, x3g, java.lang.String, boolean, bz7, ta4, zy7, mnc, iqb, boolean, ld4, int, int):void");
    }

    public static final Exception f(r rVar, String str, Exception exc) {
        if (exc instanceof CreatePublicKeyCredentialDomException) {
            return new CreatePublicKeyCredentialDomException(rVar, str);
        }
        if (exc instanceof GetPublicKeyCredentialDomException) {
            return new GetPublicKeyCredentialDomException(rVar, str);
        }
        throw new FrameworkClassParsingException();
    }

    public static final String g(List list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        return w44.S0(list, " · ", null, null, null, 62);
    }

    public static final String h(SourceMetadata sourceMetadata) {
        if (sourceMetadata instanceof GoogleDocMetadata) {
            Context context = x44.d;
            if (context != null) {
                return context.getString(R.string.file_type_doc);
            }
            sz6.j("Context not initialized");
            return null;
        }
        if ((sourceMetadata instanceof WebpageMetadata) || (sourceMetadata instanceof GenericSourceMetadata) || (sourceMetadata instanceof UnknownSourceMetadata) || sourceMetadata == null) {
            return null;
        }
        wg6.i();
        return null;
    }

    public static final String i(SourceMetadata sourceMetadata) {
        String source;
        if (sourceMetadata instanceof GoogleDocMetadata) {
            Context context = x44.d;
            if (context == null) {
                sz6.j("Context not initialized");
                return null;
            }
            source = context.getString(R.string.google_doc);
        } else if (sourceMetadata instanceof WebpageMetadata) {
            WebpageMetadata webpageMetadata = (WebpageMetadata) sourceMetadata;
            String site_name = webpageMetadata.getSite_name();
            source = site_name == null ? webpageMetadata.getSite_domain() : site_name;
        } else if (sourceMetadata instanceof GenericSourceMetadata) {
            source = ((GenericSourceMetadata) sourceMetadata).getSource();
        } else {
            if (!(sourceMetadata instanceof UnknownSourceMetadata) && sourceMetadata != null) {
                wg6.i();
                return null;
            }
            source = null;
        }
        if (source != null) {
            return source;
        }
        Context context2 = x44.d;
        if (context2 == null) {
            sz6.j("Context not initialized");
            return null;
        }
        String string = context2.getString(R.string.generic_unknown);
        string.getClass();
        return string;
    }

    public static final List j(Citation citation) {
        citation.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (citation.isGrouped()) {
            List<CitationSource> sources = citation.getSources();
            if (sources != null) {
                for (CitationSource citationSource : sources) {
                    wq9 wq9Var = KnowledgeSource.Companion;
                    boolean zIsTrusted = citation.isTrusted();
                    wq9Var.getClass();
                    KnowledgeSource knowledgeSourceB = wq9.b(citationSource, zIsTrusted);
                    linkedHashMap.putIfAbsent(knowledgeSourceB.getKey(), knowledgeSourceB);
                }
            }
        } else {
            KnowledgeSource.Companion.getClass();
            KnowledgeSource knowledgeSourceA = wq9.a(citation);
            linkedHashMap.putIfAbsent(knowledgeSourceA.getKey(), knowledgeSourceA);
        }
        Collection collectionValues = linkedHashMap.values();
        collectionValues.getClass();
        return w44.p1(collectionValues);
    }

    public static final List k(ArrayList arrayList) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ToolResultKnowledge toolResultKnowledge = (ToolResultKnowledge) it.next();
            KnowledgeSource.Companion.getClass();
            KnowledgeSource knowledgeSourceD = wq9.d(toolResultKnowledge);
            linkedHashMap.putIfAbsent(knowledgeSourceD.getKey(), knowledgeSourceD);
        }
        Collection collectionValues = linkedHashMap.values();
        collectionValues.getClass();
        return w44.p1(collectionValues);
    }

    public static final m12 m(p8b p8bVar, ByteArrayOutputStream byteArrayOutputStream) {
        byteArrayOutputStream.getClass();
        return new m12(p8bVar, byteArrayOutputStream);
    }

    public static int n(long j, byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            jpi jpiVar = kpi.a;
            if (i > -12) {
                return -1;
            }
            return i;
        }
        if (i2 == 1) {
            return kpi.b(i, wgi.g(bArr, j));
        }
        if (i2 == 2) {
            return kpi.c(i, wgi.g(bArr, j), wgi.g(bArr, j + 1));
        }
        mr9.u();
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:71:0x00f9, code lost:
    
        return -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int l(byte[] r22, int r23, int r24) {
        /*
            Method dump skipped, instruction units count: 390
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jpi.l(byte[], int, int):int");
    }
}
