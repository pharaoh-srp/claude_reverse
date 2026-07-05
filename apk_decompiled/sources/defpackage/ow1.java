package defpackage;

import android.webkit.URLUtil;
import androidx.compose.foundation.layout.b;
import androidx.health.platform.client.proto.g;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.R;
import com.anthropic.claude.app.ClaudeAppOverlay;
import com.anthropic.claude.app.n0;
import com.anthropic.claude.artifact.details.ArtifactFullScreenParams;
import com.anthropic.claude.artifact.model.ArtifactMetadata;
import com.anthropic.claude.chat.bottomsheet.ChatScreenArtifactSheetDestination;
import com.anthropic.claude.design.icon.a;
import com.anthropic.claude.project.details.ProjectDetailsScreenParams;
import com.anthropic.claude.types.strings.ChatId;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import siftscience.android.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ow1 implements pz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ Object F;
    public final /* synthetic */ Object G;

    public /* synthetic */ ow1(ta4 ta4Var, Object obj, int i) {
        this.E = i;
        this.F = ta4Var;
        this.G = obj;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        fqb fqbVar = fqb.E;
        int i2 = 6;
        int i3 = 16;
        int i4 = 7;
        mq5 mq5Var = null;
        lz1 lz1Var = jd4.a;
        boolean z = true;
        iei ieiVar = iei.a;
        Object obj3 = this.F;
        Object obj4 = this.G;
        switch (i) {
            case 0:
                gvg gvgVar = (gvg) obj;
                rl4 rl4Var = (rl4) obj2;
                break;
            case 1:
                ta4 ta4Var = (ta4) obj3;
                qw1 qw1Var = (qw1) obj4;
                ld4 ld4Var = (ld4) obj;
                int iIntValue = ((Integer) obj2).intValue();
                e18 e18Var = (e18) ld4Var;
                if (!e18Var.Q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    e18Var.T();
                } else {
                    ta4Var.invoke(qw1Var, e18Var, 0);
                }
                break;
            case 2:
                mnc mncVar = (mnc) obj4;
                rz7 rz7Var = (rz7) obj3;
                ld4 ld4Var2 = (ld4) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                e18 e18Var2 = (e18) ld4Var2;
                if (!e18Var2.Q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    e18Var2.T();
                } else {
                    iqb iqbVarI = gb9.I(b.a(fqbVar, q02.d, q02.e), mncVar);
                    cxe cxeVarA = axe.a(ko0.e, lja.Q, e18Var2, 54);
                    int iHashCode = Long.hashCode(e18Var2.T);
                    hyc hycVarL = e18Var2.l();
                    iqb iqbVarE = kxk.E(e18Var2, iqbVarI);
                    dd4.e.getClass();
                    re4 re4Var = cd4.b;
                    e18Var2.e0();
                    if (e18Var2.S) {
                        e18Var2.k(re4Var);
                    } else {
                        e18Var2.n0();
                    }
                    d4c.i0(e18Var2, cd4.f, cxeVarA);
                    d4c.i0(e18Var2, cd4.e, hycVarL);
                    d4c.i0(e18Var2, cd4.g, Integer.valueOf(iHashCode));
                    d4c.h0(e18Var2, cd4.h);
                    d4c.i0(e18Var2, cd4.d, iqbVarE);
                    rz7Var.invoke(fxe.a, e18Var2, 6);
                    e18Var2.p(true);
                }
                break;
            case 3:
                dxe dxeVar = (dxe) obj4;
                zy7 zy7Var = (zy7) obj3;
                ld4 ld4Var3 = (ld4) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                e18 e18Var3 = (e18) ld4Var3;
                if (!e18Var3.Q(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    e18Var3.T();
                } else {
                    d4c.d(a.a(ud0.N0, e18Var3), d4c.j0(R.string.chat_input_start_speech_input, e18Var3), dxeVar.b(fqbVar, lja.R), false, gm3.a(e18Var3).N, 20.0f, zy7Var, e18Var3, 196616, 8);
                }
                break;
            case 4:
                ((Integer) obj2).getClass();
                ((zu2) obj4).k((ta4) obj3, (ld4) obj, x44.p0(7));
                break;
            case 5:
                szh szhVar = (szh) obj4;
                bz7 bz7Var = (bz7) obj3;
                ld4 ld4Var4 = (ld4) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                e18 e18Var4 = (e18) ld4Var4;
                if (!e18Var4.Q(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    e18Var4.T();
                } else {
                    d4c.k(a.a(ud0.i1, e18Var4), d4c.j0(R.string.advanced_research_title, e18Var4), szhVar.c, bz7Var, gb9.N(fqb.E, 8.0f, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, 14), szhVar.b(), e18Var4, 24584, 0);
                }
                break;
            case 6:
                ArtifactMetadata artifactMetadata = (ArtifactMetadata) obj;
                artifactMetadata.getClass();
                ((String) obj2).getClass();
                ((rwe) obj4).E.m(new t23(new ChatScreenArtifactSheetDestination.ViewArtifact(((t53) obj3).x0(artifactMetadata)), false ? 1 : 0), new p23(7));
                break;
            case 7:
                t53 t53Var = (t53) obj4;
                t4g t4gVar = (t4g) obj3;
                ld4 ld4Var5 = (ld4) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                e18 e18Var5 = (e18) ld4Var5;
                if (!e18Var5.Q(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    e18Var5.T();
                } else {
                    String str = (String) t53Var.g0.x.getValue();
                    String strJ0 = d4c.j0(R.string.chat_select_model, e18Var5);
                    boolean zF = e18Var5.f(t53Var) | e18Var5.h(t4gVar);
                    Object objN = e18Var5.N();
                    Object obj5 = objN;
                    if (zF || objN == lz1Var) {
                        ik1 ik1Var = new ik1(t53Var, 15, t4gVar);
                        e18Var5.k0(ik1Var);
                        obj5 = ik1Var;
                    }
                    zy7 zy7Var2 = (zy7) obj5;
                    boolean zF2 = e18Var5.f(t53Var) | e18Var5.f(zy7Var2);
                    Object objN2 = e18Var5.N();
                    Object obj6 = objN2;
                    if (zF2 || objN2 == lz1Var) {
                        ik1 ik1Var2 = new ik1(t53Var, i3, zy7Var2);
                        e18Var5.k0(ik1Var2);
                        obj6 = ik1Var2;
                    }
                    zy7 zy7Var3 = (zy7) obj6;
                    w1i w1iVar = (w1i) t53Var.i2.getValue();
                    boolean zF3 = e18Var5.f(t53Var);
                    Object objN3 = e18Var5.N();
                    Object obj7 = objN3;
                    if (zF3 || objN3 == lz1Var) {
                        a33 a33Var = new a33(t53Var, i2);
                        e18Var5.k0(a33Var);
                        obj7 = a33Var;
                    }
                    bz7 bz7Var2 = (bz7) obj7;
                    boolean zF4 = e18Var5.f(t53Var);
                    Object objN4 = e18Var5.N();
                    Object obj8 = objN4;
                    if (zF4 || objN4 == lz1Var) {
                        a33 a33Var2 = new a33(t53Var, i4);
                        e18Var5.k0(a33Var2);
                        obj8 = a33Var2;
                    }
                    bz7 bz7Var3 = (bz7) obj8;
                    boolean zF5 = e18Var5.f(t53Var);
                    Object objN5 = e18Var5.N();
                    Object obj9 = objN5;
                    if (zF5 || objN5 == lz1Var) {
                        a33 a33Var3 = new a33(t53Var, 8);
                        e18Var5.k0(a33Var3);
                        obj9 = a33Var3;
                    }
                    knk.k(w1iVar, zy7Var2, strJ0, bz7Var2, bz7Var3, (bz7) obj9, null, fd9.q0(-1536396049, new fn(t53Var, str, zy7Var3, strJ0, 14), e18Var5), e18Var5, 12582912);
                }
                break;
            case 8:
                eli eliVar = (eli) obj4;
                t53 t53Var2 = (t53) obj3;
                String str2 = (String) obj;
                Boolean bool = (Boolean) obj2;
                if (str2 != null && URLUtil.isValidUrl(str2)) {
                    if (!x44.r(bool, Boolean.FALSE)) {
                        eliVar.a(str2);
                    } else {
                        t53Var2.U1.setValue(str2);
                    }
                }
                break;
            case 9:
                skd skdVar = (skd) obj4;
                bz7 bz7Var4 = (bz7) obj3;
                ld4 ld4Var6 = (ld4) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                e18 e18Var6 = (e18) ld4Var6;
                if (!e18Var6.Q(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    e18Var6.T();
                } else if (skdVar == null) {
                    e18Var6.a0(-1421083693);
                    e18Var6.p(false);
                } else {
                    e18Var6.a0(-1421279737);
                    String str3 = skdVar.b;
                    boolean zF6 = e18Var6.f(bz7Var4) | e18Var6.f(skdVar);
                    Object objN6 = e18Var6.N();
                    if (zF6 || objN6 == lz1Var) {
                        objN6 = new l80(bz7Var4, i3, skdVar);
                        e18Var6.k0(objN6);
                    }
                    ljk.a(0, e18Var6, (zy7) objN6, null, str3);
                    e18Var6.p(false);
                }
                break;
            case 10:
                ((Integer) obj2).getClass();
                yb5.I((z4f) obj4, (HashSet) obj3, (ld4) obj, x44.p0(1));
                break;
            case 11:
                rwe rweVar = (rwe) obj4;
                ProjectDetailsScreenParams projectDetailsScreenParams = (ProjectDetailsScreenParams) obj3;
                String str4 = (String) obj;
                Date date = (Date) obj2;
                if (str4 != null && date != null) {
                    rj3 rj3Var = new rj3(new ClaudeAppOverlay.MemoryPreview(str4, date, projectDetailsScreenParams.m789getProjectId5pmjbU(), mq5Var), false ? 1 : 0);
                    j83 j83Var = new j83(22);
                    rweVar.getClass();
                    rweVar.E.m(rj3Var, j83Var);
                }
                break;
            case 12:
                ((Integer) obj2).getClass();
                n0.j((qhc) obj4, (bz7) obj3, (ld4) obj, x44.p0(1));
                break;
            case 13:
                ((Integer) obj2).getClass();
                n0.f((ehc) obj4, (zy7) obj3, (ld4) obj, x44.p0(1));
                break;
            case 14:
                ((Integer) obj2).getClass();
                n0.l((uhc) obj4, (bz7) obj3, (ld4) obj, x44.p0(1));
                break;
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                ((Integer) obj2).getClass();
                n0.k((shc) obj4, (bz7) obj3, (ld4) obj, x44.p0(1));
                break;
            case 16:
                ((Integer) obj2).getClass();
                n0.h((hhc) obj4, (zy7) obj3, (ld4) obj, x44.p0(1));
                break;
            case g.MAX_FIELD_NUMBER /* 17 */:
                ((Integer) obj2).getClass();
                n0.m((whc) obj4, (pz7) obj3, (ld4) obj, x44.p0(1));
                break;
            case g.AVG_FIELD_NUMBER /* 18 */:
                ((Integer) obj2).getClass();
                n0.b((qua) obj4, (bzd) obj3, (ld4) obj, x44.p0(1));
                break;
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                ClaudeAppOverlay claudeAppOverlay = (ClaudeAppOverlay) obj4;
                rwe rweVar2 = (rwe) obj3;
                ld4 ld4Var7 = (ld4) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                e18 e18Var7 = (e18) ld4Var7;
                if (!e18Var7.Q(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    e18Var7.T();
                } else {
                    String strM484getInitialSelectedIdivCCbqw = ((ClaudeAppOverlay.ImageGalleryFullScreen) claudeAppOverlay).m484getInitialSelectedIdivCCbqw();
                    boolean zH = e18Var7.h(rweVar2);
                    Object objN7 = e18Var7.N();
                    if (zH || objN7 == lz1Var) {
                        objN7 = new av(rweVar2, 4);
                        e18Var7.k0(objN7);
                    }
                    tw8.e(strM484getInitialSelectedIdivCCbqw, (zy7) objN7, b.c, null, null, e18Var7, 384);
                }
                break;
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                lq0 lq0Var = (lq0) obj4;
                ArtifactMetadata artifactMetadata2 = (ArtifactMetadata) obj;
                String str5 = (String) obj2;
                artifactMetadata2.getClass();
                str5.getClass();
                ChatId.Companion.getClass();
                String strA = ws2.a();
                kq0 kq0Var = new kq0(strA, str5, artifactMetadata2);
                lq0Var.getClass();
                lq0Var.a.S(kq0Var);
                ((rwe) obj3).E.m(new mk3(new ClaudeAppOverlay.ArtifactFullScreen(new ArtifactFullScreenParams.LoadedArtifactFullScreenParams(artifactMetadata2.getUuid().getValue(), strA, z, mq5Var)), true ? 1 : 0), new tj3(23));
                break;
            case 21:
                ((Integer) obj2).getClass();
                wk3.a((kqc) obj4, (bz7) obj3, (ld4) obj, x44.p0(1));
                break;
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                ((Integer) obj2).getClass();
                ((lt5) obj4).a((a8g) obj3, (ld4) obj, x44.p0(1));
                break;
            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                ((Integer) obj2).getClass();
                ((tu5) obj4).a((g5c) obj3, (ld4) obj, x44.p0(1));
                break;
            case 24:
                pe6 pe6Var = (pe6) obj4;
                int iIntValue8 = ((Integer) obj).intValue();
                int iIntValue9 = ((Integer) obj2).intValue();
                List list = (List) obj3;
                ArrayList arrayList = new ArrayList(x44.y(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((rf6) it.next()).a);
                }
                uf6 uf6VarD = pe6Var.b().d(arrayList, iIntValue8, iIntValue9);
                if (!uf6VarD.equals(pe6Var.b())) {
                    pe6Var.d(uf6VarD);
                    pf6 pf6Var = (pf6) w44.N0(uf6VarD.a);
                    if (pf6Var != null) {
                        pe6Var.d.invoke(pf6Var);
                    }
                }
                break;
            case BuildConfig.VERSION_CODE /* 25 */:
                ((Integer) obj2).getClass();
                gr9.a((er9) obj4, (ta4) obj3, (ld4) obj, x44.p0(49));
                break;
            case 26:
                jz9 jz9Var = (jz9) obj4;
                iz9 iz9Var = (iz9) obj3;
                ld4 ld4Var8 = (ld4) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                e18 e18Var8 = (e18) ld4Var8;
                if (!e18Var8.Q(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    e18Var8.T();
                } else {
                    kz9 kz9Var = (kz9) jz9Var.b.a();
                    int iE = iz9Var.c;
                    Object obj10 = iz9Var.a;
                    if ((iE >= kz9Var.a() || !kz9Var.c(iE).equals(obj10)) && (iE = kz9Var.e(obj10)) != -1) {
                        iz9Var.c = iE;
                    }
                    int i5 = iE;
                    if (i5 != -1) {
                        e18Var8.a0(-1664741271);
                        v40.e(kz9Var, jz9Var.a, i5, iz9Var.a, e18Var8, 0);
                        e18Var8.p(false);
                    } else {
                        e18Var8.a0(-1664505826);
                        e18Var8.p(false);
                    }
                    boolean zH2 = e18Var8.h(iz9Var);
                    Object objN8 = e18Var8.N();
                    if (zH2 || objN8 == lz1Var) {
                        objN8 = new a2(29, iz9Var);
                        e18Var8.k0(objN8);
                    }
                    fd9.d(obj10, (bz7) objN8, e18Var8);
                }
                break;
            case 27:
                break;
            case 28:
                ta4 ta4Var2 = (ta4) obj3;
                f1a f1aVar = (f1a) obj4;
                ld4 ld4Var9 = (ld4) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                e18 e18Var9 = (e18) ld4Var9;
                if (!e18Var9.Q(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    e18Var9.T();
                } else {
                    ta4Var2.invoke(f1aVar, e18Var9, 0);
                }
                break;
            default:
                fca fcaVar = (fca) obj4;
                zy7 zy7Var4 = (zy7) obj3;
                ld4 ld4Var10 = (ld4) obj;
                int iIntValue12 = ((Integer) obj2).intValue();
                e18 e18Var10 = (e18) ld4Var10;
                if (!e18Var10.Q(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    e18Var10.T();
                } else {
                    eg0.a(j8.b, gb9.N(fqb.E, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, 13), null, fd9.q0(-141559318, new bu2(fcaVar, 3, zy7Var4), e18Var10), MTTypesetterKt.kLineSkipLimitMultiplier, null, zh4.n(0L, e18Var10, 1), null, e18Var10, 3078, 436);
                }
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ ow1(Object obj, int i, Object obj2) {
        this.E = i;
        this.G = obj;
        this.F = obj2;
    }

    public /* synthetic */ ow1(Object obj, Object obj2, int i, int i2) {
        this.E = i2;
        this.G = obj;
        this.F = obj2;
    }
}
