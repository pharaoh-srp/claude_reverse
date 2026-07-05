package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.view.View;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.b;
import androidx.health.platform.client.proto.g;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.R;
import com.anthropic.claude.analytics.events.DispatchEvents$OnboardingPairingRetried;
import com.anthropic.claude.analytics.events.DispatchEvents$OnboardingPairingStarted;
import com.anthropic.claude.analytics.events.DispatchEvents$OnboardingSetupStarted;
import com.anthropic.claude.analytics.events.VoiceEvents$VoiceActivationMode;
import com.anthropic.claude.analytics.events.VoiceEvents$VoiceSettingKind;
import com.anthropic.claude.api.account.RavenType;
import com.anthropic.claude.api.conway.WebhookRecord;
import com.anthropic.claude.api.kyc.KycStatusResponse;
import com.anthropic.claude.api.mcp.McpServer;
import com.anthropic.claude.api.model.ModelOption;
import com.anthropic.claude.api.project.Project;
import com.anthropic.claude.api.tasks.TaskResponse;
import com.anthropic.claude.artifact.details.ArtifactFullScreenParams;
import com.anthropic.claude.chat.bottomsheet.options.ChatOptionsBottomSheetDestination;
import com.anthropic.claude.code.remote.c;
import com.anthropic.claude.code.remote.stores.a;
import com.anthropic.claude.conway.f;
import com.anthropic.claude.mainactivity.AssistantOverlayActivity;
import com.anthropic.claude.sessions.types.GitHubBranch;
import com.anthropic.claude.sessions.types.GitHubRepo;
import com.anthropic.claude.settings.internal.e;
import com.anthropic.claude.tasks.ui.o;
import com.anthropic.claude.tasks.ui.q;
import com.anthropic.claude.types.strings.ChatId;
import com.pvporbit.freetype.FreeTypeConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import siftscience.android.BuildConfig;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class xe implements rz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ Object F;
    public final /* synthetic */ Object G;
    public final /* synthetic */ Object H;
    public final /* synthetic */ Object I;
    public final /* synthetic */ Object J;

    public /* synthetic */ xe(Object obj, pl3 pl3Var, View view, Object obj2, Object obj3, int i) {
        this.E = i;
        this.F = obj;
        this.H = pl3Var;
        this.G = view;
        this.I = obj2;
        this.J = obj3;
    }

    private final Object d(Object obj, Object obj2, Object obj3) {
        t53 t53Var = (t53) this.F;
        hw2 hw2Var = (hw2) this.G;
        f03 f03Var = (f03) this.H;
        t4g t4gVar = (t4g) this.I;
        zy7 zy7Var = (zy7) this.J;
        i4g i4gVar = (i4g) obj;
        ld4 ld4Var = (ld4) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        i4gVar.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= ((e18) ld4Var).f(i4gVar) ? 4 : 2;
        }
        e18 e18Var = (e18) ld4Var;
        if (e18Var.Q(iIntValue & 1, (iIntValue & 19) != 18)) {
            ze.a(t53Var, hw2Var, f03Var, t4gVar, zy7Var, i4gVar, null, null, e18Var, 576 | ((iIntValue << 15) & 458752));
        } else {
            e18Var.T();
        }
        return iei.a;
    }

    private final Object e(Object obj, Object obj2, Object obj3) {
        McpServer mcpServer = (McpServer) this.F;
        f03 f03Var = (f03) this.G;
        String str = (String) this.H;
        ChatOptionsBottomSheetDestination chatOptionsBottomSheetDestination = (ChatOptionsBottomSheetDestination) this.I;
        t4g t4gVar = (t4g) this.J;
        i4g i4gVar = (i4g) obj;
        ld4 ld4Var = (ld4) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        i4gVar.getClass();
        int i = 2;
        if ((iIntValue & 6) == 0) {
            iIntValue |= ((e18) ld4Var).f(i4gVar) ? 4 : 2;
        }
        e18 e18Var = (e18) ld4Var;
        if (e18Var.Q(iIntValue & 1, (iIntValue & 19) != 18)) {
            boolean zH = e18Var.h(f03Var) | e18Var.f(str != null ? ChatId.m978boximpl(str) : null);
            Object objN = e18Var.N();
            lz1 lz1Var = jd4.a;
            if (zH || objN == lz1Var) {
                objN = new pe(f03Var, str, i);
                e18Var.k0(objN);
            }
            bz7 bz7Var = (bz7) objN;
            boolean zH2 = e18Var.h(f03Var) | e18Var.f(str != null ? ChatId.m978boximpl(str) : null) | e18Var.h(chatOptionsBottomSheetDestination) | e18Var.h(t4gVar);
            Object objN2 = e18Var.N();
            if (zH2 || objN2 == lz1Var) {
                objN2 = new fe(f03Var, str, chatOptionsBottomSheetDestination, t4gVar, 5);
                e18Var.k0(objN2);
            }
            c4b.c(mcpServer, bz7Var, (bz7) objN2, i4gVar, null, e18Var, (iIntValue << 9) & 7168);
        } else {
            e18Var.T();
        }
        return iei.a;
    }

    private final Object f(Object obj, Object obj2, Object obj3) {
        nwb nwbVar = (nwb) this.F;
        f fVar = (f) this.G;
        nwb nwbVar2 = (nwb) this.H;
        zy7 zy7Var = (zy7) this.I;
        wlg wlgVar = (wlg) this.J;
        ld4 ld4Var = (ld4) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((dxe) obj).getClass();
        int i = 1;
        e18 e18Var = (e18) ld4Var;
        if (e18Var.Q(iIntValue & 1, (iIntValue & 17) != 16)) {
            boolean zIsEmpty = ((List) wlgVar.getValue()).isEmpty();
            lz1 lz1Var = jd4.a;
            if (zIsEmpty) {
                e18Var.a0(655681510);
                e18Var.p(false);
            } else {
                e18Var.a0(655275007);
                boolean zF = e18Var.f(nwbVar);
                Object objN = e18Var.N();
                if (zF || objN == lz1Var) {
                    objN = new vi4(29, nwbVar);
                    e18Var.k0(objN);
                }
                ez1.e((zy7) objN, null, false, null, null, ljk.b, e18Var, 1572864, 62);
                e18Var.p(false);
            }
            boolean zF2 = e18Var.f(fVar) | e18Var.f(nwbVar2);
            Object objN2 = e18Var.N();
            if (zF2 || objN2 == lz1Var) {
                objN2 = new py4(fVar, nwbVar2, i);
                e18Var.k0(objN2);
            }
            ez1.e((zy7) objN2, null, false, null, null, ljk.c, e18Var, 1572864, 62);
            if (zy7Var != null) {
                e18Var.a0(656192235);
                ez1.e(zy7Var, null, false, null, null, ljk.d, e18Var, 1572864, 62);
                e18Var.p(false);
            } else {
                e18Var.a0(656587206);
                e18Var.p(false);
            }
        } else {
            e18Var.T();
        }
        return iei.a;
    }

    private final Object g(Object obj, Object obj2, Object obj3) {
        fz4 fz4Var = (fz4) this.F;
        pz7 pz7Var = (pz7) this.G;
        nwb nwbVar = (nwb) this.H;
        nwb nwbVar2 = (nwb) this.I;
        nwb nwbVar3 = (nwb) this.J;
        ld4 ld4Var = (ld4) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((s64) obj).getClass();
        int i = 0;
        int i2 = 16;
        e18 e18Var = (e18) ld4Var;
        if (!e18Var.Q(iIntValue & 1, (iIntValue & 17) != 16)) {
            e18Var.T();
        } else if (x44.r(fz4Var, ez4.a)) {
            e18Var.a0(1566531433);
            iqb iqbVarJ = gb9.J(b.c(fqb.E, 1.0f), 24.0f);
            o5b o5bVarD = dw1.d(lja.K, false);
            int iHashCode = Long.hashCode(e18Var.T);
            hyc hycVarL = e18Var.l();
            iqb iqbVarE = kxk.E(e18Var, iqbVarJ);
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
            tjd.a(null, gm3.a(e18Var).c, MTTypesetterKt.kLineSkipLimitMultiplier, 0L, 0, MTTypesetterKt.kLineSkipLimitMultiplier, e18Var, 0, 61);
            e18Var.p(true);
            e18Var.p(false);
        } else if (fz4Var instanceof cz4) {
            e18Var.a0(1566538737);
            zsk.b(((cz4) fz4Var).a, null, e18Var, 0);
            e18Var.p(false);
        } else {
            if (!(fz4Var instanceof dz4)) {
                throw ebh.u(e18Var, 1566530001, false);
            }
            e18Var.a0(1566542515);
            Object obj4 = ((dz4) fz4Var).a;
            if (((List) obj4).isEmpty()) {
                e18Var.a0(1318185833);
                zsk.b(d4c.j0(R.string.conway_webhook_empty, e18Var), null, e18Var, 0);
                e18Var.p(false);
            } else {
                e18Var.a0(1318312251);
                int i3 = 0;
                for (Object obj5 : (Iterable) obj4) {
                    int i4 = i3 + 1;
                    if (i3 < 0) {
                        x44.n0();
                        throw null;
                    }
                    WebhookRecord webhookRecord = (WebhookRecord) obj5;
                    if (i3 > 0) {
                        e18Var.a0(-1628789497);
                        iuj.e(null, MTTypesetterKt.kLineSkipLimitMultiplier, gm3.a(e18Var).v, e18Var, 0, 3);
                    } else {
                        e18Var.a0(1047186002);
                    }
                    e18Var.p(false);
                    boolean zF = e18Var.f(pz7Var) | e18Var.h(webhookRecord);
                    Object objN = e18Var.N();
                    lz1 lz1Var = jd4.a;
                    if (zF || objN == lz1Var) {
                        objN = new f25(pz7Var, i, webhookRecord);
                        e18Var.k0(objN);
                    }
                    bz7 bz7Var = (bz7) objN;
                    boolean zF2 = e18Var.f(nwbVar) | e18Var.h(webhookRecord) | e18Var.f(nwbVar2);
                    Object objN2 = e18Var.N();
                    if (zF2 || objN2 == lz1Var) {
                        objN2 = new yg4((Object) webhookRecord, nwbVar, nwbVar2, 8);
                        e18Var.k0(objN2);
                    }
                    zy7 zy7Var = (zy7) objN2;
                    boolean zH = e18Var.h(webhookRecord);
                    Object objN3 = e18Var.N();
                    if (zH || objN3 == lz1Var) {
                        objN3 = new d44(webhookRecord, i2, nwbVar3);
                        e18Var.k0(objN3);
                    }
                    e18 e18Var2 = e18Var;
                    ktk.b(webhookRecord, bz7Var, zy7Var, (zy7) objN3, null, e18Var2, WebhookRecord.$stable);
                    i3 = i4;
                    e18Var = e18Var2;
                }
                e18Var.p(false);
            }
            e18Var.p(false);
        }
        return iei.a;
    }

    private final Object h(Object obj, Object obj2, Object obj3) {
        j9f j9fVar = (j9f) this.F;
        l45 l45Var = (l45) this.G;
        ub8 ub8Var = (ub8) this.H;
        r4g r4gVar = (r4g) this.I;
        wlg wlgVar = (wlg) this.J;
        i4g i4gVar = (i4g) obj;
        ld4 ld4Var = (ld4) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        i4gVar.getClass();
        float f = i4gVar.b;
        if ((iIntValue & 6) == 0) {
            iIntValue |= ((e18) ld4Var).f(i4gVar) ? 4 : 2;
        }
        e18 e18Var = (e18) ld4Var;
        if (e18Var.Q(iIntValue & 1, (iIntValue & 19) != 18)) {
            FillElement fillElement = b.c;
            o5b o5bVarD = dw1.d(lja.G, false);
            int iHashCode = Long.hashCode(e18Var.T);
            hyc hycVarL = e18Var.l();
            iqb iqbVarE = kxk.E(e18Var, fillElement);
            dd4.e.getClass();
            re4 re4Var = cd4.b;
            e18Var.e0();
            if (e18Var.S) {
                e18Var.k(re4Var);
            } else {
                e18Var.n0();
            }
            z80 z80Var = cd4.f;
            d4c.i0(e18Var, z80Var, o5bVarD);
            z80 z80Var2 = cd4.e;
            d4c.i0(e18Var, z80Var2, hycVarL);
            Integer numValueOf = Integer.valueOf(iHashCode);
            z80 z80Var3 = cd4.g;
            d4c.i0(e18Var, z80Var3, numValueOf);
            bx bxVar = cd4.h;
            d4c.h0(e18Var, bxVar);
            z80 z80Var4 = cd4.d;
            d4c.i0(e18Var, z80Var4, iqbVarE);
            iqb iqbVarB0 = mpk.b0(fillElement, j9fVar, true);
            q64 q64VarA = p64.a(ko0.c, lja.S, e18Var, 0);
            int iHashCode2 = Long.hashCode(e18Var.T);
            hyc hycVarL2 = e18Var.l();
            iqb iqbVarE2 = kxk.E(e18Var, iqbVarB0);
            e18Var.e0();
            if (e18Var.S) {
                e18Var.k(re4Var);
            } else {
                e18Var.n0();
            }
            d4c.i0(e18Var, z80Var, q64VarA);
            d4c.i0(e18Var, z80Var2, hycVarL2);
            ij0.t(iHashCode2, e18Var, z80Var3, e18Var, bxVar);
            d4c.i0(e18Var, z80Var4, iqbVarE2);
            rqk.b(ub8Var, r4gVar, e18Var, 64);
            fqb fqbVar = fqb.E;
            kxk.g(e18Var, b.e(fqbVar, f));
            e18Var.p(true);
            if (((Boolean) wlgVar.getValue()).booleanValue()) {
                e18Var.a0(-486753500);
                boolean zH = e18Var.h(l45Var) | e18Var.f(j9fVar);
                Object objN = e18Var.N();
                if (zH || objN == jd4.a) {
                    objN = new w95(l45Var, 19, j9fVar);
                    e18Var.k0(objN);
                }
                rqk.e((zy7) objN, f, nw1.a.a(fqbVar, lja.N), e18Var, 0);
                e18Var.p(false);
            } else {
                e18Var.a0(-485903015);
                e18Var.p(false);
            }
            e18Var.p(true);
        } else {
            e18Var.T();
        }
        return iei.a;
    }

    private final Object n(Object obj, Object obj2, Object obj3) {
        String str = (String) this.F;
        qc8 qc8Var = (qc8) this.G;
        String str2 = (String) this.H;
        String str3 = (String) this.I;
        String str4 = (String) this.J;
        mnc mncVar = (mnc) obj;
        ld4 ld4Var = (ld4) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        mncVar.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= ((e18) ld4Var).f(mncVar) ? 4 : 2;
        }
        e18 e18Var = (e18) ld4Var;
        if (e18Var.Q(iIntValue & 1, (iIntValue & 19) != 18)) {
            fqb fqbVar = fqb.E;
            iqb iqbVarS = knk.s(gb9.I(fqbVar, mncVar), mncVar);
            vo1 vo1Var = lja.S;
            q64 q64VarA = p64.a(ko0.c, vo1Var, e18Var, 0);
            int iHashCode = Long.hashCode(e18Var.T);
            hyc hycVarL = e18Var.l();
            iqb iqbVarE = kxk.E(e18Var, iqbVarS);
            dd4.e.getClass();
            re4 re4Var = cd4.b;
            e18Var.e0();
            if (e18Var.S) {
                e18Var.k(re4Var);
            } else {
                e18Var.n0();
            }
            z80 z80Var = cd4.f;
            d4c.i0(e18Var, z80Var, q64VarA);
            z80 z80Var2 = cd4.e;
            d4c.i0(e18Var, z80Var2, hycVarL);
            Integer numValueOf = Integer.valueOf(iHashCode);
            z80 z80Var3 = cd4.g;
            d4c.i0(e18Var, z80Var3, numValueOf);
            bx bxVar = cd4.h;
            d4c.h0(e18Var, bxVar);
            z80 z80Var4 = cd4.d;
            d4c.i0(e18Var, z80Var4, iqbVarE);
            ho0 ho0Var = new ho0(12.0f, true, new sz6(1));
            iqb iqbVarK = gb9.K(mpk.b0(new hw9(1.0f, true), mpk.Y(e18Var), true), 16.0f, 12.0f);
            q64 q64VarA2 = p64.a(ho0Var, vo1Var, e18Var, 6);
            int iHashCode2 = Long.hashCode(e18Var.T);
            hyc hycVarL2 = e18Var.l();
            iqb iqbVarE2 = kxk.E(e18Var, iqbVarK);
            e18Var.e0();
            if (e18Var.S) {
                e18Var.k(re4Var);
            } else {
                e18Var.n0();
            }
            d4c.i0(e18Var, z80Var, q64VarA2);
            d4c.i0(e18Var, z80Var2, hycVarL2);
            ij0.t(iHashCode2, e18Var, z80Var3, e18Var, bxVar);
            d4c.i0(e18Var, z80Var4, iqbVarE2);
            prk.c(0, e18Var, str3, ((Boolean) qc8Var.e.getValue()).booleanValue());
            prk.i(qc8Var, e18Var, 0);
            prk.g(qc8Var, str, e18Var, 0);
            if (str != null) {
                e18Var.a0(660628358);
                prk.b(d4c.k0(R.string.internal_setting_growthbook_editor_parse_error_prefix, new Object[]{str}, e18Var), e18Var, 0);
                e18Var.p(false);
            } else {
                e18Var.a0(660894555);
                e18Var.p(false);
            }
            if (str4 != null) {
                e18Var.a0(660936312);
                prk.b(str4, e18Var, 0);
                e18Var.p(false);
            } else {
                e18Var.a0(661000699);
                e18Var.p(false);
            }
            grc.z(fqbVar, 8.0f, e18Var, true);
            boolean z = str == null;
            boolean zF = e18Var.f(qc8Var) | e18Var.f(str2);
            Object objN = e18Var.N();
            if (zF || objN == jd4.a) {
                objN = new w95(qc8Var, 20, str2);
                e18Var.k0(objN);
            }
            prk.h(0, e18Var, (zy7) objN, z);
            e18Var.p(true);
        } else {
            e18Var.T();
        }
        return iei.a;
    }

    private final Object o(Object obj, Object obj2, Object obj3) {
        ybg ybgVar = (ybg) this.F;
        fk0 fk0Var = (fk0) this.G;
        um1 um1Var = (um1) this.H;
        a aVar = (a) this.I;
        com.anthropic.claude.code.remote.stores.b bVar = (com.anthropic.claude.code.remote.stores.b) this.J;
        ld4 ld4Var = (ld4) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((s64) obj).getClass();
        e18 e18Var = (e18) ld4Var;
        if (e18Var.Q(iIntValue & 1, (iIntValue & 17) != 16)) {
            oqb oqbVar = fk0.K;
            e.g(ybgVar, fk0Var, um1Var, aVar, bVar, null, e18Var, 4678);
        } else {
            e18Var.T();
        }
        return iei.a;
    }

    private final Object p(Object obj, Object obj2, Object obj3) {
        jz0 jz0Var = (jz0) this.F;
        eua euaVar = (eua) this.G;
        s6a s6aVar = (s6a) this.H;
        lt9 lt9Var = (lt9) this.I;
        dua duaVar = (dua) this.J;
        cte cteVar = (cte) obj;
        ld4 ld4Var = (ld4) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        cteVar.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= ((e18) ld4Var).f(cteVar) ? 4 : 2;
        }
        e18 e18Var = (e18) ld4Var;
        if (e18Var.Q(iIntValue & 1, (iIntValue & 19) != 18)) {
            wvk.a(cteVar, jz0Var, null, euaVar, s6aVar, lt9Var, duaVar, e18Var, iIntValue & 14, 2);
        } else {
            e18Var.T();
        }
        return iei.a;
    }

    private final Object q(Object obj, Object obj2, Object obj3) {
        vza vzaVar = (vza) this.F;
        zy7 zy7Var = (zy7) this.G;
        rz7 rz7Var = (rz7) this.H;
        fj0 fj0Var = (fj0) this.I;
        String str = (String) this.J;
        String str2 = (String) obj;
        Integer num = (Integer) obj2;
        String str3 = (String) obj3;
        str2.getClass();
        str3.getClass();
        if (str2.equals("WebViewError") || str2.equals("WebViewHttpError")) {
            vzaVar.a.post(new yw5(fj0Var, 9, str));
            zy7Var.a();
        }
        if (rz7Var != null) {
            rz7Var.invoke(str2, num, str3);
        }
        return iei.a;
    }

    private final Object r(Object obj, Object obj2, Object obj3) {
        u3c u3cVar = (u3c) this.F;
        String str = (String) this.G;
        c cVar = (c) this.H;
        r4g r4gVar = (r4g) this.I;
        l45 l45Var = (l45) this.J;
        i4g i4gVar = (i4g) obj;
        ld4 ld4Var = (ld4) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        i4gVar.getClass();
        int i = 2;
        if ((iIntValue & 6) == 0) {
            iIntValue |= ((e18) ld4Var).f(i4gVar) ? 4 : 2;
        }
        e18 e18Var = (e18) ld4Var;
        if (e18Var.Q(iIntValue & 1, (iIntValue & 19) != 18)) {
            h80 h80Var = u3cVar.g;
            List list = (List) ((wz5) h80Var.I).getValue();
            boolean zBooleanValue = ((Boolean) ((lsc) h80Var.G).getValue()).booleanValue();
            String str2 = (String) ((lsc) h80Var.H).getValue();
            boolean zF = e18Var.f(cVar) | e18Var.h(r4gVar);
            Object objN = e18Var.N();
            lz1 lz1Var = jd4.a;
            if (zF || objN == lz1Var) {
                objN = new l3c(cVar, r4gVar, i);
                e18Var.k0(objN);
            }
            bz7 bz7Var = (bz7) objN;
            boolean zH = e18Var.h(l45Var) | e18Var.f(u3cVar);
            Object objN2 = e18Var.N();
            if (zH || objN2 == lz1Var) {
                objN2 = new ft9(l45Var, 28, u3cVar);
                e18Var.k0(objN2);
            }
            mok.b(list, zBooleanValue, str2, str, bz7Var, (zy7) objN2, i4gVar, null, e18Var, (iIntValue << 18) & 3670016);
        } else {
            e18Var.T();
        }
        return iei.a;
    }

    private final Object s(Object obj, Object obj2, Object obj3) {
        final c cVar = (c) this.G;
        List list = (List) this.F;
        final u3c u3cVar = (u3c) this.H;
        x0a x0aVar = (x0a) this.I;
        nwb nwbVar = (nwb) this.J;
        i4g i4gVar = (i4g) obj;
        ld4 ld4Var = (ld4) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        i4gVar.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= ((e18) ld4Var).f(i4gVar) ? 4 : 2;
        }
        final int i = 0;
        final int i2 = 1;
        e18 e18Var = (e18) ld4Var;
        if (e18Var.Q(iIntValue & 1, (iIntValue & 19) != 18)) {
            xhe xheVar = cVar.g;
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                linkedHashSet.add(((lhf) it.next()).a.getId());
            }
            boolean zF = e18Var.f(u3cVar) | e18Var.f(cVar);
            Object objN = e18Var.N();
            lz1 lz1Var = jd4.a;
            if (zF || objN == lz1Var) {
                objN = new bz7() { // from class: j3c
                    @Override // defpackage.bz7
                    public final Object invoke(Object obj4) {
                        c8a c8aVar;
                        int i3 = i;
                        iei ieiVar = iei.a;
                        c cVar2 = cVar;
                        u3c u3cVar2 = u3cVar;
                        GitHubRepo gitHubRepo = (GitHubRepo) obj4;
                        switch (i3) {
                            case 0:
                                gitHubRepo.getClass();
                                a aVar = cVar2.i;
                                aVar.getClass();
                                kdg kdgVar = u3cVar2.j;
                                if (kdgVar != null && kdgVar.isEmpty()) {
                                    kdgVar.add(new lhf(gitHubRepo, null));
                                    u3cVar2.d(aVar);
                                    break;
                                } else {
                                    ListIterator listIterator = kdgVar.listIterator();
                                    do {
                                        c8aVar = (c8a) listIterator;
                                        if (!c8aVar.hasNext()) {
                                            kdgVar.add(new lhf(gitHubRepo, null));
                                            u3cVar2.d(aVar);
                                            break;
                                        }
                                    } while (!x44.r(((lhf) c8aVar.next()).a.getId(), gitHubRepo.getId()));
                                }
                                break;
                            default:
                                gitHubRepo.getClass();
                                a aVar2 = cVar2.i;
                                aVar2.getClass();
                                kdg kdgVar2 = u3cVar2.j;
                                if (kdgVar2.size() > 1) {
                                    b54.w0(new tl8(21, gitHubRepo), kdgVar2);
                                    u3cVar2.d(aVar2);
                                }
                                break;
                        }
                        return ieiVar;
                    }
                };
                e18Var.k0(objN);
            }
            bz7 bz7Var = (bz7) objN;
            boolean zF2 = e18Var.f(u3cVar) | e18Var.f(cVar);
            Object objN2 = e18Var.N();
            if (zF2 || objN2 == lz1Var) {
                objN2 = new bz7() { // from class: j3c
                    @Override // defpackage.bz7
                    public final Object invoke(Object obj4) {
                        c8a c8aVar;
                        int i3 = i2;
                        iei ieiVar = iei.a;
                        c cVar2 = cVar;
                        u3c u3cVar2 = u3cVar;
                        GitHubRepo gitHubRepo = (GitHubRepo) obj4;
                        switch (i3) {
                            case 0:
                                gitHubRepo.getClass();
                                a aVar = cVar2.i;
                                aVar.getClass();
                                kdg kdgVar = u3cVar2.j;
                                if (kdgVar != null && kdgVar.isEmpty()) {
                                    kdgVar.add(new lhf(gitHubRepo, null));
                                    u3cVar2.d(aVar);
                                    break;
                                } else {
                                    ListIterator listIterator = kdgVar.listIterator();
                                    do {
                                        c8aVar = (c8a) listIterator;
                                        if (!c8aVar.hasNext()) {
                                            kdgVar.add(new lhf(gitHubRepo, null));
                                            u3cVar2.d(aVar);
                                            break;
                                        }
                                    } while (!x44.r(((lhf) c8aVar.next()).a.getId(), gitHubRepo.getId()));
                                }
                                break;
                            default:
                                gitHubRepo.getClass();
                                a aVar2 = cVar2.i;
                                aVar2.getClass();
                                kdg kdgVar2 = u3cVar2.j;
                                if (kdgVar2.size() > 1) {
                                    b54.w0(new tl8(21, gitHubRepo), kdgVar2);
                                    u3cVar2.d(aVar2);
                                }
                                break;
                        }
                        return ieiVar;
                    }
                };
                e18Var.k0(objN2);
            }
            com.anthropic.claude.code.remote.bottomsheet.a.y(xheVar, i4gVar, linkedHashSet, bz7Var, (bz7) objN2, x0aVar, ((Boolean) nwbVar.getValue()).booleanValue(), e18Var, (iIntValue << 3) & 112);
        } else {
            e18Var.T();
        }
        return iei.a;
    }

    private final Object t(Object obj, Object obj2, Object obj3) {
        GitHubBranch gitHubBranch;
        Object obj4;
        List list = (List) this.F;
        u3c u3cVar = (u3c) this.G;
        bx1 bx1Var = u3cVar.f;
        r4g r4gVar = (r4g) this.H;
        x0a x0aVar = (x0a) this.I;
        nwb nwbVar = (nwb) this.J;
        i4g i4gVar = (i4g) obj;
        ld4 ld4Var = (ld4) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        i4gVar.getClass();
        int i = 2;
        if ((iIntValue & 6) == 0) {
            iIntValue |= ((e18) ld4Var).f(i4gVar) ? 4 : 2;
        }
        e18 e18Var = (e18) ld4Var;
        if (e18Var.Q(iIntValue & 1, (iIntValue & 19) != 18)) {
            lhf lhfVar = (lhf) w44.N0(list);
            if (lhfVar != null) {
                String str = lhfVar.b;
                String default_branch = str == null ? lhfVar.a.getDefault_branch() : str;
                Iterator it = bx1Var.a().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj4 = null;
                        break;
                    }
                    Object next = it.next();
                    if (x44.r(((GitHubBranch) next).getName(), default_branch)) {
                        obj4 = next;
                        break;
                    }
                }
                gitHubBranch = (GitHubBranch) obj4;
                if (gitHubBranch == null) {
                    gitHubBranch = new GitHubBranch(default_branch, "", str == null);
                }
            } else {
                gitHubBranch = null;
            }
            boolean zF = e18Var.f(u3cVar) | e18Var.h(r4gVar);
            Object objN = e18Var.N();
            if (zF || objN == jd4.a) {
                objN = new i3c(u3cVar, r4gVar, i);
                e18Var.k0(objN);
            }
            com.anthropic.claude.code.remote.bottomsheet.a.d(bx1Var, i4gVar, gitHubBranch, (bz7) objN, x0aVar, ((Boolean) nwbVar.getValue()).booleanValue(), e18Var, (iIntValue << 3) & 112);
        } else {
            e18Var.T();
        }
        return iei.a;
    }

    private final Object u(Object obj, Object obj2, Object obj3) {
        boolean z;
        b1i b1iVar = (b1i) this.F;
        ole oleVar = (ole) this.G;
        final c9c c9cVar = (c9c) this.H;
        final pz7 pz7Var = (pz7) this.I;
        i8c i8cVar = (i8c) this.J;
        ld4 ld4Var = (ld4) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((s64) obj).getClass();
        final int i = 1;
        final int i2 = 0;
        e18 e18Var = (e18) ld4Var;
        if (e18Var.Q(iIntValue & 1, (iIntValue & 17) != 16)) {
            boolean zF = b1iVar.f();
            fqb fqbVar = fqb.E;
            lz1 lz1Var = jd4.a;
            if (zF && oleVar.a()) {
                e18Var.a0(1265950670);
                bpc bpcVarA = com.anthropic.claude.design.icon.a.a(ud0.i1, e18Var);
                String strJ0 = d4c.j0(R.string.research_complete_notification_title, e18Var);
                zb0 zb0Var = new zb0(d4c.j0(R.string.research_complete_notification_description, e18Var));
                boolean zBooleanValue = ((Boolean) c9cVar.O(g9c.H).getValue()).booleanValue();
                iqb iqbVarC = b.c(fqbVar, 1.0f);
                boolean zF2 = e18Var.f(pz7Var) | e18Var.f(c9cVar);
                Object objN = e18Var.N();
                if (zF2 || objN == lz1Var) {
                    final int i3 = 5;
                    objN = new bz7() { // from class: d9c
                        @Override // defpackage.bz7
                        public final Object invoke(Object obj4) {
                            int i4 = i3;
                            iei ieiVar = iei.a;
                            final c9c c9cVar2 = c9cVar;
                            pz7 pz7Var2 = pz7Var;
                            Boolean bool = (Boolean) obj4;
                            switch (i4) {
                                case 0:
                                    final boolean zBooleanValue2 = bool.booleanValue();
                                    final int i5 = 1;
                                    pz7Var2.invoke(bool, new zy7() { // from class: e9c
                                        @Override // defpackage.zy7
                                        public final Object a() {
                                            int i6 = i5;
                                            iei ieiVar2 = iei.a;
                                            boolean z2 = zBooleanValue2;
                                            c9c c9cVar3 = c9cVar2;
                                            switch (i6) {
                                                case 0:
                                                    c9cVar3.P(g9c.L, z2);
                                                    break;
                                                case 1:
                                                    c9cVar3.P(g9c.G, z2);
                                                    break;
                                                case 2:
                                                    c9cVar3.P(g9c.H, z2);
                                                    break;
                                                case 3:
                                                    c9cVar3.P(g9c.J, z2);
                                                    break;
                                                case 4:
                                                    c9cVar3.P(g9c.K, z2);
                                                    break;
                                                default:
                                                    c9cVar3.P(g9c.I, z2);
                                                    break;
                                            }
                                            return ieiVar2;
                                        }
                                    });
                                    break;
                                case 1:
                                    final boolean zBooleanValue3 = bool.booleanValue();
                                    final int i6 = 5;
                                    pz7Var2.invoke(bool, new zy7() { // from class: e9c
                                        @Override // defpackage.zy7
                                        public final Object a() {
                                            int i62 = i6;
                                            iei ieiVar2 = iei.a;
                                            boolean z2 = zBooleanValue3;
                                            c9c c9cVar3 = c9cVar2;
                                            switch (i62) {
                                                case 0:
                                                    c9cVar3.P(g9c.L, z2);
                                                    break;
                                                case 1:
                                                    c9cVar3.P(g9c.G, z2);
                                                    break;
                                                case 2:
                                                    c9cVar3.P(g9c.H, z2);
                                                    break;
                                                case 3:
                                                    c9cVar3.P(g9c.J, z2);
                                                    break;
                                                case 4:
                                                    c9cVar3.P(g9c.K, z2);
                                                    break;
                                                default:
                                                    c9cVar3.P(g9c.I, z2);
                                                    break;
                                            }
                                            return ieiVar2;
                                        }
                                    });
                                    break;
                                case 2:
                                    final boolean zBooleanValue4 = bool.booleanValue();
                                    final int i7 = 3;
                                    pz7Var2.invoke(bool, new zy7() { // from class: e9c
                                        @Override // defpackage.zy7
                                        public final Object a() {
                                            int i62 = i7;
                                            iei ieiVar2 = iei.a;
                                            boolean z2 = zBooleanValue4;
                                            c9c c9cVar3 = c9cVar2;
                                            switch (i62) {
                                                case 0:
                                                    c9cVar3.P(g9c.L, z2);
                                                    break;
                                                case 1:
                                                    c9cVar3.P(g9c.G, z2);
                                                    break;
                                                case 2:
                                                    c9cVar3.P(g9c.H, z2);
                                                    break;
                                                case 3:
                                                    c9cVar3.P(g9c.J, z2);
                                                    break;
                                                case 4:
                                                    c9cVar3.P(g9c.K, z2);
                                                    break;
                                                default:
                                                    c9cVar3.P(g9c.I, z2);
                                                    break;
                                            }
                                            return ieiVar2;
                                        }
                                    });
                                    break;
                                case 3:
                                    final boolean zBooleanValue5 = bool.booleanValue();
                                    final int i8 = 4;
                                    pz7Var2.invoke(bool, new zy7() { // from class: e9c
                                        @Override // defpackage.zy7
                                        public final Object a() {
                                            int i62 = i8;
                                            iei ieiVar2 = iei.a;
                                            boolean z2 = zBooleanValue5;
                                            c9c c9cVar3 = c9cVar2;
                                            switch (i62) {
                                                case 0:
                                                    c9cVar3.P(g9c.L, z2);
                                                    break;
                                                case 1:
                                                    c9cVar3.P(g9c.G, z2);
                                                    break;
                                                case 2:
                                                    c9cVar3.P(g9c.H, z2);
                                                    break;
                                                case 3:
                                                    c9cVar3.P(g9c.J, z2);
                                                    break;
                                                case 4:
                                                    c9cVar3.P(g9c.K, z2);
                                                    break;
                                                default:
                                                    c9cVar3.P(g9c.I, z2);
                                                    break;
                                            }
                                            return ieiVar2;
                                        }
                                    });
                                    break;
                                case 4:
                                    final boolean zBooleanValue6 = bool.booleanValue();
                                    final int i9 = 0;
                                    pz7Var2.invoke(bool, new zy7() { // from class: e9c
                                        @Override // defpackage.zy7
                                        public final Object a() {
                                            int i62 = i9;
                                            iei ieiVar2 = iei.a;
                                            boolean z2 = zBooleanValue6;
                                            c9c c9cVar3 = c9cVar2;
                                            switch (i62) {
                                                case 0:
                                                    c9cVar3.P(g9c.L, z2);
                                                    break;
                                                case 1:
                                                    c9cVar3.P(g9c.G, z2);
                                                    break;
                                                case 2:
                                                    c9cVar3.P(g9c.H, z2);
                                                    break;
                                                case 3:
                                                    c9cVar3.P(g9c.J, z2);
                                                    break;
                                                case 4:
                                                    c9cVar3.P(g9c.K, z2);
                                                    break;
                                                default:
                                                    c9cVar3.P(g9c.I, z2);
                                                    break;
                                            }
                                            return ieiVar2;
                                        }
                                    });
                                    break;
                                default:
                                    final boolean zBooleanValue7 = bool.booleanValue();
                                    final int i10 = 2;
                                    pz7Var2.invoke(bool, new zy7() { // from class: e9c
                                        @Override // defpackage.zy7
                                        public final Object a() {
                                            int i62 = i10;
                                            iei ieiVar2 = iei.a;
                                            boolean z2 = zBooleanValue7;
                                            c9c c9cVar3 = c9cVar2;
                                            switch (i62) {
                                                case 0:
                                                    c9cVar3.P(g9c.L, z2);
                                                    break;
                                                case 1:
                                                    c9cVar3.P(g9c.G, z2);
                                                    break;
                                                case 2:
                                                    c9cVar3.P(g9c.H, z2);
                                                    break;
                                                case 3:
                                                    c9cVar3.P(g9c.J, z2);
                                                    break;
                                                case 4:
                                                    c9cVar3.P(g9c.K, z2);
                                                    break;
                                                default:
                                                    c9cVar3.P(g9c.I, z2);
                                                    break;
                                            }
                                            return ieiVar2;
                                        }
                                    });
                                    break;
                            }
                            return ieiVar;
                        }
                    };
                    e18Var.k0(objN);
                }
                yhk.d(bpcVarA, strJ0, zBooleanValue, (bz7) objN, iqbVarC, zb0Var, false, e18Var, 24584, 192);
                e18Var.p(false);
            } else {
                e18Var.a0(1266953086);
                e18Var.p(false);
            }
            if (((Boolean) i8cVar.a.getValue()).booleanValue()) {
                e18Var.a0(1267136575);
                bpc bpcVarA2 = com.anthropic.claude.design.icon.a.a(ud0.K, e18Var);
                String strJ02 = d4c.j0(R.string.chat_completion_notification_settings_title, e18Var);
                boolean zBooleanValue2 = ((Boolean) c9cVar.O(g9c.G).getValue()).booleanValue();
                boolean zF3 = e18Var.f(pz7Var) | e18Var.f(c9cVar);
                Object objN2 = e18Var.N();
                if (zF3 || objN2 == lz1Var) {
                    objN2 = new bz7() { // from class: d9c
                        @Override // defpackage.bz7
                        public final Object invoke(Object obj4) {
                            int i4 = i2;
                            iei ieiVar = iei.a;
                            final c9c c9cVar2 = c9cVar;
                            pz7 pz7Var2 = pz7Var;
                            Boolean bool = (Boolean) obj4;
                            switch (i4) {
                                case 0:
                                    final boolean zBooleanValue22 = bool.booleanValue();
                                    final int i5 = 1;
                                    pz7Var2.invoke(bool, new zy7() { // from class: e9c
                                        @Override // defpackage.zy7
                                        public final Object a() {
                                            int i62 = i5;
                                            iei ieiVar2 = iei.a;
                                            boolean z2 = zBooleanValue22;
                                            c9c c9cVar3 = c9cVar2;
                                            switch (i62) {
                                                case 0:
                                                    c9cVar3.P(g9c.L, z2);
                                                    break;
                                                case 1:
                                                    c9cVar3.P(g9c.G, z2);
                                                    break;
                                                case 2:
                                                    c9cVar3.P(g9c.H, z2);
                                                    break;
                                                case 3:
                                                    c9cVar3.P(g9c.J, z2);
                                                    break;
                                                case 4:
                                                    c9cVar3.P(g9c.K, z2);
                                                    break;
                                                default:
                                                    c9cVar3.P(g9c.I, z2);
                                                    break;
                                            }
                                            return ieiVar2;
                                        }
                                    });
                                    break;
                                case 1:
                                    final boolean zBooleanValue3 = bool.booleanValue();
                                    final int i6 = 5;
                                    pz7Var2.invoke(bool, new zy7() { // from class: e9c
                                        @Override // defpackage.zy7
                                        public final Object a() {
                                            int i62 = i6;
                                            iei ieiVar2 = iei.a;
                                            boolean z2 = zBooleanValue3;
                                            c9c c9cVar3 = c9cVar2;
                                            switch (i62) {
                                                case 0:
                                                    c9cVar3.P(g9c.L, z2);
                                                    break;
                                                case 1:
                                                    c9cVar3.P(g9c.G, z2);
                                                    break;
                                                case 2:
                                                    c9cVar3.P(g9c.H, z2);
                                                    break;
                                                case 3:
                                                    c9cVar3.P(g9c.J, z2);
                                                    break;
                                                case 4:
                                                    c9cVar3.P(g9c.K, z2);
                                                    break;
                                                default:
                                                    c9cVar3.P(g9c.I, z2);
                                                    break;
                                            }
                                            return ieiVar2;
                                        }
                                    });
                                    break;
                                case 2:
                                    final boolean zBooleanValue4 = bool.booleanValue();
                                    final int i7 = 3;
                                    pz7Var2.invoke(bool, new zy7() { // from class: e9c
                                        @Override // defpackage.zy7
                                        public final Object a() {
                                            int i62 = i7;
                                            iei ieiVar2 = iei.a;
                                            boolean z2 = zBooleanValue4;
                                            c9c c9cVar3 = c9cVar2;
                                            switch (i62) {
                                                case 0:
                                                    c9cVar3.P(g9c.L, z2);
                                                    break;
                                                case 1:
                                                    c9cVar3.P(g9c.G, z2);
                                                    break;
                                                case 2:
                                                    c9cVar3.P(g9c.H, z2);
                                                    break;
                                                case 3:
                                                    c9cVar3.P(g9c.J, z2);
                                                    break;
                                                case 4:
                                                    c9cVar3.P(g9c.K, z2);
                                                    break;
                                                default:
                                                    c9cVar3.P(g9c.I, z2);
                                                    break;
                                            }
                                            return ieiVar2;
                                        }
                                    });
                                    break;
                                case 3:
                                    final boolean zBooleanValue5 = bool.booleanValue();
                                    final int i8 = 4;
                                    pz7Var2.invoke(bool, new zy7() { // from class: e9c
                                        @Override // defpackage.zy7
                                        public final Object a() {
                                            int i62 = i8;
                                            iei ieiVar2 = iei.a;
                                            boolean z2 = zBooleanValue5;
                                            c9c c9cVar3 = c9cVar2;
                                            switch (i62) {
                                                case 0:
                                                    c9cVar3.P(g9c.L, z2);
                                                    break;
                                                case 1:
                                                    c9cVar3.P(g9c.G, z2);
                                                    break;
                                                case 2:
                                                    c9cVar3.P(g9c.H, z2);
                                                    break;
                                                case 3:
                                                    c9cVar3.P(g9c.J, z2);
                                                    break;
                                                case 4:
                                                    c9cVar3.P(g9c.K, z2);
                                                    break;
                                                default:
                                                    c9cVar3.P(g9c.I, z2);
                                                    break;
                                            }
                                            return ieiVar2;
                                        }
                                    });
                                    break;
                                case 4:
                                    final boolean zBooleanValue6 = bool.booleanValue();
                                    final int i9 = 0;
                                    pz7Var2.invoke(bool, new zy7() { // from class: e9c
                                        @Override // defpackage.zy7
                                        public final Object a() {
                                            int i62 = i9;
                                            iei ieiVar2 = iei.a;
                                            boolean z2 = zBooleanValue6;
                                            c9c c9cVar3 = c9cVar2;
                                            switch (i62) {
                                                case 0:
                                                    c9cVar3.P(g9c.L, z2);
                                                    break;
                                                case 1:
                                                    c9cVar3.P(g9c.G, z2);
                                                    break;
                                                case 2:
                                                    c9cVar3.P(g9c.H, z2);
                                                    break;
                                                case 3:
                                                    c9cVar3.P(g9c.J, z2);
                                                    break;
                                                case 4:
                                                    c9cVar3.P(g9c.K, z2);
                                                    break;
                                                default:
                                                    c9cVar3.P(g9c.I, z2);
                                                    break;
                                            }
                                            return ieiVar2;
                                        }
                                    });
                                    break;
                                default:
                                    final boolean zBooleanValue7 = bool.booleanValue();
                                    final int i10 = 2;
                                    pz7Var2.invoke(bool, new zy7() { // from class: e9c
                                        @Override // defpackage.zy7
                                        public final Object a() {
                                            int i62 = i10;
                                            iei ieiVar2 = iei.a;
                                            boolean z2 = zBooleanValue7;
                                            c9c c9cVar3 = c9cVar2;
                                            switch (i62) {
                                                case 0:
                                                    c9cVar3.P(g9c.L, z2);
                                                    break;
                                                case 1:
                                                    c9cVar3.P(g9c.G, z2);
                                                    break;
                                                case 2:
                                                    c9cVar3.P(g9c.H, z2);
                                                    break;
                                                case 3:
                                                    c9cVar3.P(g9c.J, z2);
                                                    break;
                                                case 4:
                                                    c9cVar3.P(g9c.K, z2);
                                                    break;
                                                default:
                                                    c9cVar3.P(g9c.I, z2);
                                                    break;
                                            }
                                            return ieiVar2;
                                        }
                                    });
                                    break;
                            }
                            return ieiVar;
                        }
                    };
                    e18Var.k0(objN2);
                }
                yhk.d(bpcVarA2, strJ02, zBooleanValue2, (bz7) objN2, b.c(fqbVar, 1.0f), null, false, e18Var, 24584, 224);
                e18Var.p(false);
            } else {
                e18Var.a0(1267965918);
                e18Var.p(false);
            }
            if (((Boolean) i8cVar.b.getValue()).booleanValue()) {
                e18Var.a0(1268185274);
                ud0 ud0Var = ud0.S;
                bpc bpcVarA3 = com.anthropic.claude.design.icon.a.a(ud0Var, e18Var);
                String strJ03 = d4c.j0(R.string.code_notification_settings_title, e18Var);
                zb0 zb0Var2 = new zb0(d4c.j0(R.string.code_notification_settings_description, e18Var));
                boolean zBooleanValue3 = ((Boolean) c9cVar.O(g9c.I).getValue()).booleanValue();
                iqb iqbVarC2 = b.c(fqbVar, 1.0f);
                boolean zF4 = e18Var.f(pz7Var) | e18Var.f(c9cVar);
                Object objN3 = e18Var.N();
                if (zF4 || objN3 == lz1Var) {
                    objN3 = new bz7() { // from class: d9c
                        @Override // defpackage.bz7
                        public final Object invoke(Object obj4) {
                            int i4 = i;
                            iei ieiVar = iei.a;
                            final c9c c9cVar2 = c9cVar;
                            pz7 pz7Var2 = pz7Var;
                            Boolean bool = (Boolean) obj4;
                            switch (i4) {
                                case 0:
                                    final boolean zBooleanValue22 = bool.booleanValue();
                                    final int i5 = 1;
                                    pz7Var2.invoke(bool, new zy7() { // from class: e9c
                                        @Override // defpackage.zy7
                                        public final Object a() {
                                            int i62 = i5;
                                            iei ieiVar2 = iei.a;
                                            boolean z2 = zBooleanValue22;
                                            c9c c9cVar3 = c9cVar2;
                                            switch (i62) {
                                                case 0:
                                                    c9cVar3.P(g9c.L, z2);
                                                    break;
                                                case 1:
                                                    c9cVar3.P(g9c.G, z2);
                                                    break;
                                                case 2:
                                                    c9cVar3.P(g9c.H, z2);
                                                    break;
                                                case 3:
                                                    c9cVar3.P(g9c.J, z2);
                                                    break;
                                                case 4:
                                                    c9cVar3.P(g9c.K, z2);
                                                    break;
                                                default:
                                                    c9cVar3.P(g9c.I, z2);
                                                    break;
                                            }
                                            return ieiVar2;
                                        }
                                    });
                                    break;
                                case 1:
                                    final boolean zBooleanValue32 = bool.booleanValue();
                                    final int i6 = 5;
                                    pz7Var2.invoke(bool, new zy7() { // from class: e9c
                                        @Override // defpackage.zy7
                                        public final Object a() {
                                            int i62 = i6;
                                            iei ieiVar2 = iei.a;
                                            boolean z2 = zBooleanValue32;
                                            c9c c9cVar3 = c9cVar2;
                                            switch (i62) {
                                                case 0:
                                                    c9cVar3.P(g9c.L, z2);
                                                    break;
                                                case 1:
                                                    c9cVar3.P(g9c.G, z2);
                                                    break;
                                                case 2:
                                                    c9cVar3.P(g9c.H, z2);
                                                    break;
                                                case 3:
                                                    c9cVar3.P(g9c.J, z2);
                                                    break;
                                                case 4:
                                                    c9cVar3.P(g9c.K, z2);
                                                    break;
                                                default:
                                                    c9cVar3.P(g9c.I, z2);
                                                    break;
                                            }
                                            return ieiVar2;
                                        }
                                    });
                                    break;
                                case 2:
                                    final boolean zBooleanValue4 = bool.booleanValue();
                                    final int i7 = 3;
                                    pz7Var2.invoke(bool, new zy7() { // from class: e9c
                                        @Override // defpackage.zy7
                                        public final Object a() {
                                            int i62 = i7;
                                            iei ieiVar2 = iei.a;
                                            boolean z2 = zBooleanValue4;
                                            c9c c9cVar3 = c9cVar2;
                                            switch (i62) {
                                                case 0:
                                                    c9cVar3.P(g9c.L, z2);
                                                    break;
                                                case 1:
                                                    c9cVar3.P(g9c.G, z2);
                                                    break;
                                                case 2:
                                                    c9cVar3.P(g9c.H, z2);
                                                    break;
                                                case 3:
                                                    c9cVar3.P(g9c.J, z2);
                                                    break;
                                                case 4:
                                                    c9cVar3.P(g9c.K, z2);
                                                    break;
                                                default:
                                                    c9cVar3.P(g9c.I, z2);
                                                    break;
                                            }
                                            return ieiVar2;
                                        }
                                    });
                                    break;
                                case 3:
                                    final boolean zBooleanValue5 = bool.booleanValue();
                                    final int i8 = 4;
                                    pz7Var2.invoke(bool, new zy7() { // from class: e9c
                                        @Override // defpackage.zy7
                                        public final Object a() {
                                            int i62 = i8;
                                            iei ieiVar2 = iei.a;
                                            boolean z2 = zBooleanValue5;
                                            c9c c9cVar3 = c9cVar2;
                                            switch (i62) {
                                                case 0:
                                                    c9cVar3.P(g9c.L, z2);
                                                    break;
                                                case 1:
                                                    c9cVar3.P(g9c.G, z2);
                                                    break;
                                                case 2:
                                                    c9cVar3.P(g9c.H, z2);
                                                    break;
                                                case 3:
                                                    c9cVar3.P(g9c.J, z2);
                                                    break;
                                                case 4:
                                                    c9cVar3.P(g9c.K, z2);
                                                    break;
                                                default:
                                                    c9cVar3.P(g9c.I, z2);
                                                    break;
                                            }
                                            return ieiVar2;
                                        }
                                    });
                                    break;
                                case 4:
                                    final boolean zBooleanValue6 = bool.booleanValue();
                                    final int i9 = 0;
                                    pz7Var2.invoke(bool, new zy7() { // from class: e9c
                                        @Override // defpackage.zy7
                                        public final Object a() {
                                            int i62 = i9;
                                            iei ieiVar2 = iei.a;
                                            boolean z2 = zBooleanValue6;
                                            c9c c9cVar3 = c9cVar2;
                                            switch (i62) {
                                                case 0:
                                                    c9cVar3.P(g9c.L, z2);
                                                    break;
                                                case 1:
                                                    c9cVar3.P(g9c.G, z2);
                                                    break;
                                                case 2:
                                                    c9cVar3.P(g9c.H, z2);
                                                    break;
                                                case 3:
                                                    c9cVar3.P(g9c.J, z2);
                                                    break;
                                                case 4:
                                                    c9cVar3.P(g9c.K, z2);
                                                    break;
                                                default:
                                                    c9cVar3.P(g9c.I, z2);
                                                    break;
                                            }
                                            return ieiVar2;
                                        }
                                    });
                                    break;
                                default:
                                    final boolean zBooleanValue7 = bool.booleanValue();
                                    final int i10 = 2;
                                    pz7Var2.invoke(bool, new zy7() { // from class: e9c
                                        @Override // defpackage.zy7
                                        public final Object a() {
                                            int i62 = i10;
                                            iei ieiVar2 = iei.a;
                                            boolean z2 = zBooleanValue7;
                                            c9c c9cVar3 = c9cVar2;
                                            switch (i62) {
                                                case 0:
                                                    c9cVar3.P(g9c.L, z2);
                                                    break;
                                                case 1:
                                                    c9cVar3.P(g9c.G, z2);
                                                    break;
                                                case 2:
                                                    c9cVar3.P(g9c.H, z2);
                                                    break;
                                                case 3:
                                                    c9cVar3.P(g9c.J, z2);
                                                    break;
                                                case 4:
                                                    c9cVar3.P(g9c.K, z2);
                                                    break;
                                                default:
                                                    c9cVar3.P(g9c.I, z2);
                                                    break;
                                            }
                                            return ieiVar2;
                                        }
                                    });
                                    break;
                            }
                            return ieiVar;
                        }
                    };
                    e18Var.k0(objN3);
                }
                yhk.d(bpcVarA3, strJ03, zBooleanValue3, (bz7) objN3, iqbVarC2, zb0Var2, false, e18Var, 24584, 192);
                if (((Boolean) i8cVar.c.getValue()).booleanValue()) {
                    e18Var.a0(1269302607);
                    bpc bpcVarA4 = com.anthropic.claude.design.icon.a.a(ud0Var, e18Var);
                    String strJ04 = d4c.j0(R.string.code_requires_action_notifications_title, e18Var);
                    zb0 zb0Var3 = new zb0(d4c.j0(R.string.code_requires_action_notifications_description, e18Var));
                    boolean zBooleanValue4 = ((Boolean) c9cVar.O(g9c.J).getValue()).booleanValue();
                    iqb iqbVarC3 = b.c(fqbVar, 1.0f);
                    boolean zF5 = e18Var.f(pz7Var) | e18Var.f(c9cVar);
                    Object objN4 = e18Var.N();
                    if (zF5 || objN4 == lz1Var) {
                        final int i4 = 2;
                        objN4 = new bz7() { // from class: d9c
                            @Override // defpackage.bz7
                            public final Object invoke(Object obj4) {
                                int i42 = i4;
                                iei ieiVar = iei.a;
                                final c9c c9cVar2 = c9cVar;
                                pz7 pz7Var2 = pz7Var;
                                Boolean bool = (Boolean) obj4;
                                switch (i42) {
                                    case 0:
                                        final boolean zBooleanValue22 = bool.booleanValue();
                                        final int i5 = 1;
                                        pz7Var2.invoke(bool, new zy7() { // from class: e9c
                                            @Override // defpackage.zy7
                                            public final Object a() {
                                                int i62 = i5;
                                                iei ieiVar2 = iei.a;
                                                boolean z2 = zBooleanValue22;
                                                c9c c9cVar3 = c9cVar2;
                                                switch (i62) {
                                                    case 0:
                                                        c9cVar3.P(g9c.L, z2);
                                                        break;
                                                    case 1:
                                                        c9cVar3.P(g9c.G, z2);
                                                        break;
                                                    case 2:
                                                        c9cVar3.P(g9c.H, z2);
                                                        break;
                                                    case 3:
                                                        c9cVar3.P(g9c.J, z2);
                                                        break;
                                                    case 4:
                                                        c9cVar3.P(g9c.K, z2);
                                                        break;
                                                    default:
                                                        c9cVar3.P(g9c.I, z2);
                                                        break;
                                                }
                                                return ieiVar2;
                                            }
                                        });
                                        break;
                                    case 1:
                                        final boolean zBooleanValue32 = bool.booleanValue();
                                        final int i6 = 5;
                                        pz7Var2.invoke(bool, new zy7() { // from class: e9c
                                            @Override // defpackage.zy7
                                            public final Object a() {
                                                int i62 = i6;
                                                iei ieiVar2 = iei.a;
                                                boolean z2 = zBooleanValue32;
                                                c9c c9cVar3 = c9cVar2;
                                                switch (i62) {
                                                    case 0:
                                                        c9cVar3.P(g9c.L, z2);
                                                        break;
                                                    case 1:
                                                        c9cVar3.P(g9c.G, z2);
                                                        break;
                                                    case 2:
                                                        c9cVar3.P(g9c.H, z2);
                                                        break;
                                                    case 3:
                                                        c9cVar3.P(g9c.J, z2);
                                                        break;
                                                    case 4:
                                                        c9cVar3.P(g9c.K, z2);
                                                        break;
                                                    default:
                                                        c9cVar3.P(g9c.I, z2);
                                                        break;
                                                }
                                                return ieiVar2;
                                            }
                                        });
                                        break;
                                    case 2:
                                        final boolean zBooleanValue42 = bool.booleanValue();
                                        final int i7 = 3;
                                        pz7Var2.invoke(bool, new zy7() { // from class: e9c
                                            @Override // defpackage.zy7
                                            public final Object a() {
                                                int i62 = i7;
                                                iei ieiVar2 = iei.a;
                                                boolean z2 = zBooleanValue42;
                                                c9c c9cVar3 = c9cVar2;
                                                switch (i62) {
                                                    case 0:
                                                        c9cVar3.P(g9c.L, z2);
                                                        break;
                                                    case 1:
                                                        c9cVar3.P(g9c.G, z2);
                                                        break;
                                                    case 2:
                                                        c9cVar3.P(g9c.H, z2);
                                                        break;
                                                    case 3:
                                                        c9cVar3.P(g9c.J, z2);
                                                        break;
                                                    case 4:
                                                        c9cVar3.P(g9c.K, z2);
                                                        break;
                                                    default:
                                                        c9cVar3.P(g9c.I, z2);
                                                        break;
                                                }
                                                return ieiVar2;
                                            }
                                        });
                                        break;
                                    case 3:
                                        final boolean zBooleanValue5 = bool.booleanValue();
                                        final int i8 = 4;
                                        pz7Var2.invoke(bool, new zy7() { // from class: e9c
                                            @Override // defpackage.zy7
                                            public final Object a() {
                                                int i62 = i8;
                                                iei ieiVar2 = iei.a;
                                                boolean z2 = zBooleanValue5;
                                                c9c c9cVar3 = c9cVar2;
                                                switch (i62) {
                                                    case 0:
                                                        c9cVar3.P(g9c.L, z2);
                                                        break;
                                                    case 1:
                                                        c9cVar3.P(g9c.G, z2);
                                                        break;
                                                    case 2:
                                                        c9cVar3.P(g9c.H, z2);
                                                        break;
                                                    case 3:
                                                        c9cVar3.P(g9c.J, z2);
                                                        break;
                                                    case 4:
                                                        c9cVar3.P(g9c.K, z2);
                                                        break;
                                                    default:
                                                        c9cVar3.P(g9c.I, z2);
                                                        break;
                                                }
                                                return ieiVar2;
                                            }
                                        });
                                        break;
                                    case 4:
                                        final boolean zBooleanValue6 = bool.booleanValue();
                                        final int i9 = 0;
                                        pz7Var2.invoke(bool, new zy7() { // from class: e9c
                                            @Override // defpackage.zy7
                                            public final Object a() {
                                                int i62 = i9;
                                                iei ieiVar2 = iei.a;
                                                boolean z2 = zBooleanValue6;
                                                c9c c9cVar3 = c9cVar2;
                                                switch (i62) {
                                                    case 0:
                                                        c9cVar3.P(g9c.L, z2);
                                                        break;
                                                    case 1:
                                                        c9cVar3.P(g9c.G, z2);
                                                        break;
                                                    case 2:
                                                        c9cVar3.P(g9c.H, z2);
                                                        break;
                                                    case 3:
                                                        c9cVar3.P(g9c.J, z2);
                                                        break;
                                                    case 4:
                                                        c9cVar3.P(g9c.K, z2);
                                                        break;
                                                    default:
                                                        c9cVar3.P(g9c.I, z2);
                                                        break;
                                                }
                                                return ieiVar2;
                                            }
                                        });
                                        break;
                                    default:
                                        final boolean zBooleanValue7 = bool.booleanValue();
                                        final int i10 = 2;
                                        pz7Var2.invoke(bool, new zy7() { // from class: e9c
                                            @Override // defpackage.zy7
                                            public final Object a() {
                                                int i62 = i10;
                                                iei ieiVar2 = iei.a;
                                                boolean z2 = zBooleanValue7;
                                                c9c c9cVar3 = c9cVar2;
                                                switch (i62) {
                                                    case 0:
                                                        c9cVar3.P(g9c.L, z2);
                                                        break;
                                                    case 1:
                                                        c9cVar3.P(g9c.G, z2);
                                                        break;
                                                    case 2:
                                                        c9cVar3.P(g9c.H, z2);
                                                        break;
                                                    case 3:
                                                        c9cVar3.P(g9c.J, z2);
                                                        break;
                                                    case 4:
                                                        c9cVar3.P(g9c.K, z2);
                                                        break;
                                                    default:
                                                        c9cVar3.P(g9c.I, z2);
                                                        break;
                                                }
                                                return ieiVar2;
                                            }
                                        });
                                        break;
                                }
                                return ieiVar;
                            }
                        };
                        e18Var.k0(objN4);
                    }
                    yhk.d(bpcVarA4, strJ04, zBooleanValue4, (bz7) objN4, iqbVarC3, zb0Var3, false, e18Var, 24584, 192);
                    z = false;
                    e18Var.p(false);
                } else {
                    z = false;
                    e18Var.a0(1270738558);
                    e18Var.p(false);
                }
                e18Var.p(z);
            } else {
                e18Var.a0(1270772286);
                e18Var.p(false);
            }
            if (((Boolean) i8cVar.d.getValue()).booleanValue()) {
                e18Var.a0(1270978684);
                bpc bpcVarA5 = com.anthropic.claude.design.icon.a.a(ud0.a0, e18Var);
                String strJ05 = d4c.j0(R.string.dispatch_notifications_title, e18Var);
                zb0 zb0Var4 = new zb0(d4c.j0(R.string.dispatch_notifications_description, e18Var));
                boolean zBooleanValue5 = ((Boolean) c9cVar.O(g9c.K).getValue()).booleanValue();
                iqb iqbVarC4 = b.c(fqbVar, 1.0f);
                boolean zF6 = e18Var.f(pz7Var) | e18Var.f(c9cVar);
                Object objN5 = e18Var.N();
                if (zF6 || objN5 == lz1Var) {
                    final int i5 = 3;
                    objN5 = new bz7() { // from class: d9c
                        @Override // defpackage.bz7
                        public final Object invoke(Object obj4) {
                            int i42 = i5;
                            iei ieiVar = iei.a;
                            final c9c c9cVar2 = c9cVar;
                            pz7 pz7Var2 = pz7Var;
                            Boolean bool = (Boolean) obj4;
                            switch (i42) {
                                case 0:
                                    final boolean zBooleanValue22 = bool.booleanValue();
                                    final int i52 = 1;
                                    pz7Var2.invoke(bool, new zy7() { // from class: e9c
                                        @Override // defpackage.zy7
                                        public final Object a() {
                                            int i62 = i52;
                                            iei ieiVar2 = iei.a;
                                            boolean z2 = zBooleanValue22;
                                            c9c c9cVar3 = c9cVar2;
                                            switch (i62) {
                                                case 0:
                                                    c9cVar3.P(g9c.L, z2);
                                                    break;
                                                case 1:
                                                    c9cVar3.P(g9c.G, z2);
                                                    break;
                                                case 2:
                                                    c9cVar3.P(g9c.H, z2);
                                                    break;
                                                case 3:
                                                    c9cVar3.P(g9c.J, z2);
                                                    break;
                                                case 4:
                                                    c9cVar3.P(g9c.K, z2);
                                                    break;
                                                default:
                                                    c9cVar3.P(g9c.I, z2);
                                                    break;
                                            }
                                            return ieiVar2;
                                        }
                                    });
                                    break;
                                case 1:
                                    final boolean zBooleanValue32 = bool.booleanValue();
                                    final int i6 = 5;
                                    pz7Var2.invoke(bool, new zy7() { // from class: e9c
                                        @Override // defpackage.zy7
                                        public final Object a() {
                                            int i62 = i6;
                                            iei ieiVar2 = iei.a;
                                            boolean z2 = zBooleanValue32;
                                            c9c c9cVar3 = c9cVar2;
                                            switch (i62) {
                                                case 0:
                                                    c9cVar3.P(g9c.L, z2);
                                                    break;
                                                case 1:
                                                    c9cVar3.P(g9c.G, z2);
                                                    break;
                                                case 2:
                                                    c9cVar3.P(g9c.H, z2);
                                                    break;
                                                case 3:
                                                    c9cVar3.P(g9c.J, z2);
                                                    break;
                                                case 4:
                                                    c9cVar3.P(g9c.K, z2);
                                                    break;
                                                default:
                                                    c9cVar3.P(g9c.I, z2);
                                                    break;
                                            }
                                            return ieiVar2;
                                        }
                                    });
                                    break;
                                case 2:
                                    final boolean zBooleanValue42 = bool.booleanValue();
                                    final int i7 = 3;
                                    pz7Var2.invoke(bool, new zy7() { // from class: e9c
                                        @Override // defpackage.zy7
                                        public final Object a() {
                                            int i62 = i7;
                                            iei ieiVar2 = iei.a;
                                            boolean z2 = zBooleanValue42;
                                            c9c c9cVar3 = c9cVar2;
                                            switch (i62) {
                                                case 0:
                                                    c9cVar3.P(g9c.L, z2);
                                                    break;
                                                case 1:
                                                    c9cVar3.P(g9c.G, z2);
                                                    break;
                                                case 2:
                                                    c9cVar3.P(g9c.H, z2);
                                                    break;
                                                case 3:
                                                    c9cVar3.P(g9c.J, z2);
                                                    break;
                                                case 4:
                                                    c9cVar3.P(g9c.K, z2);
                                                    break;
                                                default:
                                                    c9cVar3.P(g9c.I, z2);
                                                    break;
                                            }
                                            return ieiVar2;
                                        }
                                    });
                                    break;
                                case 3:
                                    final boolean zBooleanValue52 = bool.booleanValue();
                                    final int i8 = 4;
                                    pz7Var2.invoke(bool, new zy7() { // from class: e9c
                                        @Override // defpackage.zy7
                                        public final Object a() {
                                            int i62 = i8;
                                            iei ieiVar2 = iei.a;
                                            boolean z2 = zBooleanValue52;
                                            c9c c9cVar3 = c9cVar2;
                                            switch (i62) {
                                                case 0:
                                                    c9cVar3.P(g9c.L, z2);
                                                    break;
                                                case 1:
                                                    c9cVar3.P(g9c.G, z2);
                                                    break;
                                                case 2:
                                                    c9cVar3.P(g9c.H, z2);
                                                    break;
                                                case 3:
                                                    c9cVar3.P(g9c.J, z2);
                                                    break;
                                                case 4:
                                                    c9cVar3.P(g9c.K, z2);
                                                    break;
                                                default:
                                                    c9cVar3.P(g9c.I, z2);
                                                    break;
                                            }
                                            return ieiVar2;
                                        }
                                    });
                                    break;
                                case 4:
                                    final boolean zBooleanValue6 = bool.booleanValue();
                                    final int i9 = 0;
                                    pz7Var2.invoke(bool, new zy7() { // from class: e9c
                                        @Override // defpackage.zy7
                                        public final Object a() {
                                            int i62 = i9;
                                            iei ieiVar2 = iei.a;
                                            boolean z2 = zBooleanValue6;
                                            c9c c9cVar3 = c9cVar2;
                                            switch (i62) {
                                                case 0:
                                                    c9cVar3.P(g9c.L, z2);
                                                    break;
                                                case 1:
                                                    c9cVar3.P(g9c.G, z2);
                                                    break;
                                                case 2:
                                                    c9cVar3.P(g9c.H, z2);
                                                    break;
                                                case 3:
                                                    c9cVar3.P(g9c.J, z2);
                                                    break;
                                                case 4:
                                                    c9cVar3.P(g9c.K, z2);
                                                    break;
                                                default:
                                                    c9cVar3.P(g9c.I, z2);
                                                    break;
                                            }
                                            return ieiVar2;
                                        }
                                    });
                                    break;
                                default:
                                    final boolean zBooleanValue7 = bool.booleanValue();
                                    final int i10 = 2;
                                    pz7Var2.invoke(bool, new zy7() { // from class: e9c
                                        @Override // defpackage.zy7
                                        public final Object a() {
                                            int i62 = i10;
                                            iei ieiVar2 = iei.a;
                                            boolean z2 = zBooleanValue7;
                                            c9c c9cVar3 = c9cVar2;
                                            switch (i62) {
                                                case 0:
                                                    c9cVar3.P(g9c.L, z2);
                                                    break;
                                                case 1:
                                                    c9cVar3.P(g9c.G, z2);
                                                    break;
                                                case 2:
                                                    c9cVar3.P(g9c.H, z2);
                                                    break;
                                                case 3:
                                                    c9cVar3.P(g9c.J, z2);
                                                    break;
                                                case 4:
                                                    c9cVar3.P(g9c.K, z2);
                                                    break;
                                                default:
                                                    c9cVar3.P(g9c.I, z2);
                                                    break;
                                            }
                                            return ieiVar2;
                                        }
                                    });
                                    break;
                            }
                            return ieiVar;
                        }
                    };
                    e18Var.k0(objN5);
                }
                yhk.d(bpcVarA5, strJ05, zBooleanValue5, (bz7) objN5, iqbVarC4, zb0Var4, false, e18Var, 24584, 192);
                e18Var.p(false);
            } else {
                e18Var.a0(1271967646);
                e18Var.p(false);
            }
            if (((Boolean) i8cVar.e.getValue()).booleanValue()) {
                e18Var.a0(1272182569);
                bpc bpcVarA6 = com.anthropic.claude.design.icon.a.a(ud0.K0, e18Var);
                String strJ06 = d4c.j0(R.string.marketing_notification_settings_title, e18Var);
                zb0 zb0Var5 = new zb0(d4c.j0(R.string.marketing_notification_settings_description, e18Var));
                boolean zBooleanValue6 = ((Boolean) c9cVar.O(g9c.L).getValue()).booleanValue();
                iqb iqbVarC5 = b.c(fqbVar, 1.0f);
                boolean zF7 = e18Var.f(pz7Var) | e18Var.f(c9cVar);
                Object objN6 = e18Var.N();
                if (zF7 || objN6 == lz1Var) {
                    final int i6 = 4;
                    objN6 = new bz7() { // from class: d9c
                        @Override // defpackage.bz7
                        public final Object invoke(Object obj4) {
                            int i42 = i6;
                            iei ieiVar = iei.a;
                            final c9c c9cVar2 = c9cVar;
                            pz7 pz7Var2 = pz7Var;
                            Boolean bool = (Boolean) obj4;
                            switch (i42) {
                                case 0:
                                    final boolean zBooleanValue22 = bool.booleanValue();
                                    final int i52 = 1;
                                    pz7Var2.invoke(bool, new zy7() { // from class: e9c
                                        @Override // defpackage.zy7
                                        public final Object a() {
                                            int i62 = i52;
                                            iei ieiVar2 = iei.a;
                                            boolean z2 = zBooleanValue22;
                                            c9c c9cVar3 = c9cVar2;
                                            switch (i62) {
                                                case 0:
                                                    c9cVar3.P(g9c.L, z2);
                                                    break;
                                                case 1:
                                                    c9cVar3.P(g9c.G, z2);
                                                    break;
                                                case 2:
                                                    c9cVar3.P(g9c.H, z2);
                                                    break;
                                                case 3:
                                                    c9cVar3.P(g9c.J, z2);
                                                    break;
                                                case 4:
                                                    c9cVar3.P(g9c.K, z2);
                                                    break;
                                                default:
                                                    c9cVar3.P(g9c.I, z2);
                                                    break;
                                            }
                                            return ieiVar2;
                                        }
                                    });
                                    break;
                                case 1:
                                    final boolean zBooleanValue32 = bool.booleanValue();
                                    final int i62 = 5;
                                    pz7Var2.invoke(bool, new zy7() { // from class: e9c
                                        @Override // defpackage.zy7
                                        public final Object a() {
                                            int i622 = i62;
                                            iei ieiVar2 = iei.a;
                                            boolean z2 = zBooleanValue32;
                                            c9c c9cVar3 = c9cVar2;
                                            switch (i622) {
                                                case 0:
                                                    c9cVar3.P(g9c.L, z2);
                                                    break;
                                                case 1:
                                                    c9cVar3.P(g9c.G, z2);
                                                    break;
                                                case 2:
                                                    c9cVar3.P(g9c.H, z2);
                                                    break;
                                                case 3:
                                                    c9cVar3.P(g9c.J, z2);
                                                    break;
                                                case 4:
                                                    c9cVar3.P(g9c.K, z2);
                                                    break;
                                                default:
                                                    c9cVar3.P(g9c.I, z2);
                                                    break;
                                            }
                                            return ieiVar2;
                                        }
                                    });
                                    break;
                                case 2:
                                    final boolean zBooleanValue42 = bool.booleanValue();
                                    final int i7 = 3;
                                    pz7Var2.invoke(bool, new zy7() { // from class: e9c
                                        @Override // defpackage.zy7
                                        public final Object a() {
                                            int i622 = i7;
                                            iei ieiVar2 = iei.a;
                                            boolean z2 = zBooleanValue42;
                                            c9c c9cVar3 = c9cVar2;
                                            switch (i622) {
                                                case 0:
                                                    c9cVar3.P(g9c.L, z2);
                                                    break;
                                                case 1:
                                                    c9cVar3.P(g9c.G, z2);
                                                    break;
                                                case 2:
                                                    c9cVar3.P(g9c.H, z2);
                                                    break;
                                                case 3:
                                                    c9cVar3.P(g9c.J, z2);
                                                    break;
                                                case 4:
                                                    c9cVar3.P(g9c.K, z2);
                                                    break;
                                                default:
                                                    c9cVar3.P(g9c.I, z2);
                                                    break;
                                            }
                                            return ieiVar2;
                                        }
                                    });
                                    break;
                                case 3:
                                    final boolean zBooleanValue52 = bool.booleanValue();
                                    final int i8 = 4;
                                    pz7Var2.invoke(bool, new zy7() { // from class: e9c
                                        @Override // defpackage.zy7
                                        public final Object a() {
                                            int i622 = i8;
                                            iei ieiVar2 = iei.a;
                                            boolean z2 = zBooleanValue52;
                                            c9c c9cVar3 = c9cVar2;
                                            switch (i622) {
                                                case 0:
                                                    c9cVar3.P(g9c.L, z2);
                                                    break;
                                                case 1:
                                                    c9cVar3.P(g9c.G, z2);
                                                    break;
                                                case 2:
                                                    c9cVar3.P(g9c.H, z2);
                                                    break;
                                                case 3:
                                                    c9cVar3.P(g9c.J, z2);
                                                    break;
                                                case 4:
                                                    c9cVar3.P(g9c.K, z2);
                                                    break;
                                                default:
                                                    c9cVar3.P(g9c.I, z2);
                                                    break;
                                            }
                                            return ieiVar2;
                                        }
                                    });
                                    break;
                                case 4:
                                    final boolean zBooleanValue62 = bool.booleanValue();
                                    final int i9 = 0;
                                    pz7Var2.invoke(bool, new zy7() { // from class: e9c
                                        @Override // defpackage.zy7
                                        public final Object a() {
                                            int i622 = i9;
                                            iei ieiVar2 = iei.a;
                                            boolean z2 = zBooleanValue62;
                                            c9c c9cVar3 = c9cVar2;
                                            switch (i622) {
                                                case 0:
                                                    c9cVar3.P(g9c.L, z2);
                                                    break;
                                                case 1:
                                                    c9cVar3.P(g9c.G, z2);
                                                    break;
                                                case 2:
                                                    c9cVar3.P(g9c.H, z2);
                                                    break;
                                                case 3:
                                                    c9cVar3.P(g9c.J, z2);
                                                    break;
                                                case 4:
                                                    c9cVar3.P(g9c.K, z2);
                                                    break;
                                                default:
                                                    c9cVar3.P(g9c.I, z2);
                                                    break;
                                            }
                                            return ieiVar2;
                                        }
                                    });
                                    break;
                                default:
                                    final boolean zBooleanValue7 = bool.booleanValue();
                                    final int i10 = 2;
                                    pz7Var2.invoke(bool, new zy7() { // from class: e9c
                                        @Override // defpackage.zy7
                                        public final Object a() {
                                            int i622 = i10;
                                            iei ieiVar2 = iei.a;
                                            boolean z2 = zBooleanValue7;
                                            c9c c9cVar3 = c9cVar2;
                                            switch (i622) {
                                                case 0:
                                                    c9cVar3.P(g9c.L, z2);
                                                    break;
                                                case 1:
                                                    c9cVar3.P(g9c.G, z2);
                                                    break;
                                                case 2:
                                                    c9cVar3.P(g9c.H, z2);
                                                    break;
                                                case 3:
                                                    c9cVar3.P(g9c.J, z2);
                                                    break;
                                                case 4:
                                                    c9cVar3.P(g9c.K, z2);
                                                    break;
                                                default:
                                                    c9cVar3.P(g9c.I, z2);
                                                    break;
                                            }
                                            return ieiVar2;
                                        }
                                    });
                                    break;
                            }
                            return ieiVar;
                        }
                    };
                    e18Var.k0(objN6);
                }
                yhk.d(bpcVarA6, strJ06, zBooleanValue6, (bz7) objN6, iqbVarC5, zb0Var5, false, e18Var, 24584, 192);
                e18Var.p(false);
            } else {
                e18Var.a0(1273189790);
                e18Var.p(false);
            }
        } else {
            e18Var.T();
        }
        return iei.a;
    }

    private final Object v(Object obj, Object obj2, Object obj3) {
        tec tecVar = (tec) this.F;
        ybg ybgVar = (ybg) this.G;
        rwe rweVar = (rwe) this.H;
        com.anthropic.claude.app.onboarding.a aVar = (com.anthropic.claude.app.onboarding.a) this.I;
        zy7 zy7Var = (zy7) this.J;
        mnc mncVar = (mnc) obj;
        ld4 ld4Var = (ld4) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        mncVar.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= ((e18) ld4Var).f(mncVar) ? 4 : 2;
        }
        e18 e18Var = (e18) ld4Var;
        if (e18Var.Q(iIntValue & 1, (iIntValue & 19) != 18)) {
            zni.g(tecVar.m, ybgVar, e18Var, 48);
            boolean zF = e18Var.f(tecVar) | e18Var.f(rweVar) | e18Var.f(aVar);
            Object objN = e18Var.N();
            if (zF || objN == jd4.a) {
                objN = new ggc(tecVar, new hya(aVar, rweVar, zy7Var, 9), new av(rweVar, 23));
                e18Var.k0(objN);
            }
            fu5 fu5VarP = iv1.P(nai.x(), csg.r(rweVar, null, e18Var, 384, 2), 2);
            FillElement fillElement = b.c;
            long j = gm3.a(e18Var).o;
            long j2 = gm3.a(e18Var).d;
            fillElement.getClass();
            mwa.l(rweVar, gb9.I(zni.t(yfd.p(fillElement, j, zni.b), new j10(j2, 6)), mncVar), fu5VarP, fd9.q0(1882221129, new ci(7, (ggc) objN), e18Var), e18Var, 3072, 0);
        } else {
            e18Var.T();
        }
        return iei.a;
    }

    private final Object w(Object obj, Object obj2, Object obj3) {
        dyc dycVar = (dyc) this.F;
        ybg ybgVar = (ybg) this.G;
        zy7 zy7Var = (zy7) this.H;
        zy7 zy7Var2 = (zy7) this.I;
        zy7 zy7Var3 = (zy7) this.J;
        mnc mncVar = (mnc) obj;
        ld4 ld4Var = (ld4) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        mncVar.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= ((e18) ld4Var).f(mncVar) ? 4 : 2;
        }
        e18 e18Var = (e18) ld4Var;
        if (e18Var.Q(iIntValue & 1, (iIntValue & 19) != 18)) {
            zni.g(dycVar.f, ybgVar, e18Var, 48);
            fqb fqbVar = fqb.E;
            iqb iqbVarB0 = mpk.b0(gb9.I(fqbVar, mncVar), mpk.Y(e18Var), true);
            q64 q64VarA = p64.a(ko0.c, lja.S, e18Var, 0);
            int iHashCode = Long.hashCode(e18Var.T);
            hyc hycVarL = e18Var.l();
            iqb iqbVarE = kxk.E(e18Var, iqbVarB0);
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
            qnc qncVar = qf2.a;
            kxk.g(e18Var, b.e(fqbVar, 12.0f));
            boolean zH = e18Var.h(dycVar) | e18Var.f(zy7Var) | e18Var.f(zy7Var2) | e18Var.f(zy7Var3);
            Object objN = e18Var.N();
            if (zH || objN == jd4.a) {
                wvc wvcVar = new wvc(dycVar, zy7Var, zy7Var2, zy7Var3, 2);
                e18Var.k0(wvcVar);
                objN = wvcVar;
            }
            qwj.a(null, null, rrk.a, null, null, null, null, (bz7) objN, e18Var, 384, 123);
            grc.z(fqbVar, 12.0f, e18Var, true);
        } else {
            e18Var.T();
        }
        return iei.a;
    }

    private final Object x(Object obj, Object obj2, Object obj3) {
        Project project = (Project) this.F;
        zy7 zy7Var = (zy7) this.G;
        zy7 zy7Var2 = (zy7) this.H;
        rwe rweVar = (rwe) this.I;
        bz7 bz7Var = (bz7) this.J;
        ld4 ld4Var = (ld4) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((s64) obj).getClass();
        e18 e18Var = (e18) ld4Var;
        if (e18Var.Q(iIntValue & 1, (iIntValue & 17) != 16)) {
            lyk lykVar = lyk.U;
            boolean zIs_starred = project.is_starred();
            boolean zF = e18Var.f(zy7Var) | e18Var.f(zy7Var2);
            Object objN = e18Var.N();
            lz1 lz1Var = jd4.a;
            if (zF || objN == lz1Var) {
                objN = new kt0(zy7Var, zy7Var2, 25);
                e18Var.k0(objN);
            }
            lykVar.e(384, e18Var, (zy7) objN, zIs_starred);
            if (project.getCanEditSettings()) {
                e18Var.a0(-976373126);
                boolean zH = e18Var.h(rweVar) | e18Var.f(zy7Var2);
                Object objN2 = e18Var.N();
                if (zH || objN2 == lz1Var) {
                    objN2 = new lld(rweVar, zy7Var2, 3);
                    e18Var.k0(objN2);
                }
                lykVar.c((zy7) objN2, e18Var, 48);
                e18Var.p(false);
            } else {
                e18Var.a0(-976206873);
                e18Var.p(false);
            }
            if (bz7Var == null || !project.getCanEditSettings()) {
                e18Var.a0(-975967801);
                e18Var.p(false);
            } else {
                e18Var.a0(-976138859);
                boolean z = okk.z(project);
                boolean zF2 = e18Var.f(bz7Var) | e18Var.f(project) | e18Var.f(zy7Var2);
                Object objN3 = e18Var.N();
                if (zF2 || objN3 == lz1Var) {
                    objN3 = new hya(bz7Var, project, zy7Var2, 14);
                    e18Var.k0(objN3);
                }
                lykVar.a(384, e18Var, (zy7) objN3, z);
                e18Var.p(false);
            }
            if (project.getCanDelete()) {
                e18Var.a0(-975930694);
                boolean zH2 = e18Var.h(rweVar) | e18Var.f(zy7Var2);
                Object objN4 = e18Var.N();
                if (zH2 || objN4 == lz1Var) {
                    objN4 = new lld(rweVar, zy7Var2, 2);
                    e18Var.k0(objN4);
                }
                lykVar.b((zy7) objN4, e18Var, 48);
                e18Var.p(false);
            } else {
                e18Var.a0(-975764441);
                e18Var.p(false);
            }
        } else {
            e18Var.T();
        }
        return iei.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r26v18, types: [bpc] */
    @Override // defpackage.rz7
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Object dnVar;
        an anVar;
        nwb nwbVar;
        final boolean z;
        int i;
        McpServer mcpServerR;
        int i2;
        Object obj4;
        int i3 = this.E;
        tp4 tp4Var = null;
        fqb fqbVar = fqb.E;
        int i4 = 16;
        int i5 = 2;
        lz1 lz1Var = jd4.a;
        iei ieiVar = iei.a;
        Object obj5 = this.J;
        Object obj6 = this.I;
        Object obj7 = this.H;
        Object obj8 = this.G;
        Object obj9 = this.F;
        switch (i3) {
            case 0:
                List list = (List) obj9;
                mnc mncVar = (mnc) obj8;
                pl3 pl3Var = (pl3) obj7;
                oxf oxfVar = (oxf) obj6;
                nxf nxfVar = (nxf) obj5;
                ld4 ld4Var = (ld4) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((s64) obj).getClass();
                e18 e18Var = (e18) ld4Var;
                if (e18Var.Q(iIntValue & 1, (iIntValue & 17) != 16)) {
                    ArrayList<oe> arrayList = new ArrayList();
                    for (Object obj10 : list) {
                        if (((oe) obj10).d.a) {
                            arrayList.add(obj10);
                        }
                    }
                    for (oe oeVar : arrayList) {
                        e18Var.X(-1559321977, oeVar.b);
                        zmk.a(oeVar, mncVar, pl3Var, b.c(fqbVar, 1.0f), oxfVar, nxfVar, e18Var, 3072);
                        e18Var.p(false);
                    }
                } else {
                    e18Var.T();
                }
                return ieiVar;
            case 1:
                String str = (String) obj9;
                String str2 = (String) obj8;
                final qi3 qi3Var = (qi3) obj7;
                final nwb nwbVar2 = (nwb) obj6;
                zy7 zy7Var = (zy7) obj5;
                mnc mncVar2 = (mnc) obj;
                ld4 ld4Var2 = (ld4) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                mncVar2.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= ((e18) ld4Var2).f(mncVar2) ? 4 : 2;
                }
                e18 e18Var2 = (e18) ld4Var2;
                if (e18Var2.Q(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    iqb iqbVarB0 = mpk.b0(gb9.I(wp.e(b.c, e18Var2), mncVar2), mpk.Y(e18Var2), true);
                    q64 q64VarA = p64.a(ko0.c, lja.S, e18Var2, 0);
                    int iHashCode = Long.hashCode(e18Var2.T);
                    hyc hycVarL = e18Var2.l();
                    iqb iqbVarE = kxk.E(e18Var2, iqbVarB0);
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
                    il.e((pgc) nwbVar2.getValue(), str, null, e18Var2, 0);
                    kxk.g(e18Var2, new hw9(1.0f, true));
                    pgc pgcVar = (pgc) nwbVar2.getValue();
                    boolean zH = e18Var2.h(qi3Var) | e18Var2.f(nwbVar2);
                    Object objN = e18Var2.N();
                    if (zH || objN == lz1Var) {
                        final int i6 = z ? 1 : 0;
                        objN = new zy7() { // from class: cl
                            @Override // defpackage.zy7
                            public final Object a() {
                                int i7 = i6;
                                iei ieiVar2 = iei.a;
                                pgc pgcVar2 = pgc.F;
                                nwb nwbVar3 = nwbVar2;
                                qi3 qi3Var2 = qi3Var;
                                switch (i7) {
                                    case 0:
                                        if (((pgc) nwbVar3.getValue()) == pgcVar2) {
                                            qi3Var2.e(new DispatchEvents$OnboardingPairingStarted(), DispatchEvents$OnboardingPairingStarted.Companion.serializer());
                                        } else {
                                            qi3Var2.e(new DispatchEvents$OnboardingPairingRetried(), DispatchEvents$OnboardingPairingRetried.Companion.serializer());
                                        }
                                        nwbVar3.setValue(pgc.G);
                                        break;
                                    default:
                                        qi3Var2.e(new DispatchEvents$OnboardingSetupStarted(), DispatchEvents$OnboardingSetupStarted.Companion.serializer());
                                        nwbVar3.setValue(pgcVar2);
                                        break;
                                }
                                return ieiVar2;
                            }
                        };
                        e18Var2.k0(objN);
                    }
                    zy7 zy7Var2 = (zy7) objN;
                    boolean zF = e18Var2.f(nwbVar2) | e18Var2.h(qi3Var);
                    Object objN2 = e18Var2.N();
                    if (zF || objN2 == lz1Var) {
                        final int i7 = 0;
                        objN2 = new zy7() { // from class: cl
                            @Override // defpackage.zy7
                            public final Object a() {
                                int i72 = i7;
                                iei ieiVar2 = iei.a;
                                pgc pgcVar2 = pgc.F;
                                nwb nwbVar3 = nwbVar2;
                                qi3 qi3Var2 = qi3Var;
                                switch (i72) {
                                    case 0:
                                        if (((pgc) nwbVar3.getValue()) == pgcVar2) {
                                            qi3Var2.e(new DispatchEvents$OnboardingPairingStarted(), DispatchEvents$OnboardingPairingStarted.Companion.serializer());
                                        } else {
                                            qi3Var2.e(new DispatchEvents$OnboardingPairingRetried(), DispatchEvents$OnboardingPairingRetried.Companion.serializer());
                                        }
                                        nwbVar3.setValue(pgc.G);
                                        break;
                                    default:
                                        qi3Var2.e(new DispatchEvents$OnboardingSetupStarted(), DispatchEvents$OnboardingSetupStarted.Companion.serializer());
                                        nwbVar3.setValue(pgcVar2);
                                        break;
                                }
                                return ieiVar2;
                            }
                        };
                        e18Var2.k0(objN2);
                    }
                    zy7 zy7Var3 = (zy7) objN2;
                    boolean zH2 = e18Var2.h(qi3Var) | e18Var2.f(zy7Var);
                    Object objN3 = e18Var2.N();
                    if (zH2 || objN3 == lz1Var) {
                        objN3 = new dl(qi3Var, zy7Var, 0);
                        e18Var2.k0(objN3);
                    }
                    il.d(pgcVar, str2, zy7Var2, zy7Var3, (zy7) objN3, null, e18Var2, 0);
                    e18Var2.p(true);
                } else {
                    e18Var2.T();
                }
                return ieiVar;
            case 2:
                nwb nwbVar3 = (nwb) obj9;
                wxc wxcVar = (wxc) obj8;
                an anVar2 = (an) obj7;
                Context context = (Context) obj6;
                nwb nwbVar4 = (nwb) obj5;
                ld4 ld4Var3 = (ld4) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((ia0) obj).getClass();
                boolean z2 = (iIntValue3 & 17) != 16;
                int i8 = 1 & iIntValue3;
                e18 e18Var3 = (e18) ld4Var3;
                if (e18Var3.Q(i8, z2)) {
                    boolean zF2 = e18Var3.f(nwbVar3) | e18Var3.f(wxcVar) | e18Var3.f(anVar2) | e18Var3.h(context);
                    Object objN4 = e18Var3.N();
                    if (zF2 || objN4 == lz1Var) {
                        anVar = anVar2;
                        nwbVar = nwbVar3;
                        dnVar = new dn((Object) wxcVar, (Object) anVar, (Object) context, (Object) nwbVar, (Object) nwbVar4, 0);
                        e18Var3.k0(dnVar);
                    } else {
                        dnVar = objN4;
                        anVar = anVar2;
                        nwbVar = nwbVar3;
                    }
                    zy7 zy7Var4 = (zy7) dnVar;
                    boolean zF3 = e18Var3.f(nwbVar) | e18Var3.f(anVar);
                    Object objN5 = e18Var3.N();
                    if (zF3 || objN5 == lz1Var) {
                        objN5 = new ei(anVar, nwbVar, nwbVar4);
                        e18Var3.k0(objN5);
                    }
                    ysj.b(384, 0, e18Var3, zy7Var4, (zy7) objN5, gb9.K(fqbVar, 12.0f, 8.0f));
                } else {
                    e18Var3.T();
                }
                return ieiVar;
            case 3:
                xp0 xp0Var = (xp0) obj9;
                kg3 kg3Var = (kg3) obj8;
                zy7 zy7Var5 = (zy7) obj7;
                zy7 zy7Var6 = (zy7) obj6;
                zy7 zy7Var7 = (zy7) obj5;
                tp0 tp0Var = (tp0) obj;
                ld4 ld4Var4 = (ld4) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                tp0Var.getClass();
                if ((iIntValue4 & 6) == 0) {
                    iIntValue4 |= ((e18) ld4Var4).f(tp0Var) ? 4 : 2;
                }
                e18 e18Var4 = (e18) ld4Var4;
                if (e18Var4.Q(iIntValue4 & 1, (iIntValue4 & 19) != 18)) {
                    nq0.a(tp0Var, (yt0) xp0Var.s.getValue(), xp0Var.c, kg3Var, yfd.p(b.c, gm3.a(e18Var4).o, zni.b), zy7Var5, zy7Var6, zy7Var7, e18Var4, (iIntValue4 & 14) | FreeTypeConstants.FT_LOAD_MONOCHROME);
                } else {
                    e18Var4.T();
                }
                return ieiVar;
            case 4:
                ArtifactFullScreenParams artifactFullScreenParams = (ArtifactFullScreenParams) obj9;
                l45 l45Var = (l45) obj8;
                xq0 xq0Var = (xq0) obj7;
                t4f t4fVar = (t4f) obj6;
                wlg wlgVar = (wlg) obj5;
                ld4 ld4Var5 = (ld4) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                ((dxe) obj).getClass();
                e18 e18Var5 = (e18) ld4Var5;
                if (!e18Var5.Q(1 & iIntValue5, (iIntValue5 & 17) != 16)) {
                    e18Var5.T();
                } else if (artifactFullScreenParams instanceof ArtifactFullScreenParams.PublishedArtifactFullScreenParams) {
                    e18Var5.a0(920992381);
                    boolean zH3 = e18Var5.h(l45Var) | e18Var5.f(xq0Var) | e18Var5.h(t4fVar);
                    Object objN6 = e18Var5.N();
                    if (zH3 || objN6 == lz1Var) {
                        objN6 = new ei(l45Var, xq0Var, t4fVar, 6);
                        e18Var5.k0(objN6);
                    }
                    zy7 zy7Var8 = (zy7) objN6;
                    bpc bpcVarA = com.anthropic.claude.design.icon.a.a(ud0.q0, e18Var5);
                    String strJ0 = d4c.j0(R.string.artifact_button_report_button_content_description, e18Var5);
                    long j = d54.g;
                    long j2 = gm3.a(e18Var5).k;
                    long j3 = (493 & 2) != 0 ? gm3.a(e18Var5).m : j;
                    long jB = d54.b(0.1f, gm3.a(e18Var5).k);
                    long j4 = gm3.a(e18Var5).N;
                    if ((493 & 16) != 0) {
                        j = gm3.a(e18Var5).n;
                    }
                    long j5 = j;
                    long j6 = gm3.a(e18Var5).v;
                    ijk.a(zy7Var8, null, bpcVarA, false, strJ0, MTTypesetterKt.kLineSkipLimitMultiplier, null, new wz2(j2, j3, jB, j4, j5, j6, d54.b(d54.d(j4) * 0.5f, j4), j5, j6), e18Var5, 512);
                    kxk.g(e18Var5, b.t(fqbVar, q02.g));
                    String strJ02 = d4c.j0(R.string.artifact_button_customize, e18Var5);
                    boolean zBooleanValue = ((Boolean) wlgVar.getValue()).booleanValue();
                    ta4 ta4Var = cvj.b;
                    boolean zF4 = e18Var5.f(xq0Var) | e18Var5.f(artifactFullScreenParams);
                    Object objN7 = e18Var5.N();
                    if (zF4 || objN7 == lz1Var) {
                        objN7 = new k6(xq0Var, i4, artifactFullScreenParams);
                        e18Var5.k0(objN7);
                    }
                    dxj.a(strJ02, zBooleanValue, null, false, ta4Var, null, y02.a, 0L, (zy7) objN7, e18Var5, 1597440, 172);
                    e18Var5.p(false);
                } else {
                    e18Var5.a0(922445413);
                    e18Var5.p(false);
                }
                return ieiVar;
            case 5:
                lsc lscVar = (lsc) obj9;
                String str3 = (String) obj8;
                l45 l45Var2 = (l45) obj7;
                v4g v4gVar = (v4g) obj6;
                AssistantOverlayActivity assistantOverlayActivity = (AssistantOverlayActivity) obj5;
                ld4 ld4Var6 = (ld4) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                int i9 = AssistantOverlayActivity.d0;
                ((s64) obj).getClass();
                e18 e18Var6 = (e18) ld4Var6;
                if (e18Var6.Q(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                    iqb iqbVarE2 = b.e(b.c(fqbVar, 1.0f), ((Configuration) e18Var6.j(w00.a)).screenHeightDp / 2.0f);
                    o5b o5bVarD = dw1.d(lja.G, false);
                    int iHashCode2 = Long.hashCode(e18Var6.T);
                    hyc hycVarL2 = e18Var6.l();
                    iqb iqbVarE3 = kxk.E(e18Var6, iqbVarE2);
                    dd4.e.getClass();
                    re4 re4Var2 = cd4.b;
                    e18Var6.e0();
                    if (e18Var6.S) {
                        e18Var6.k(re4Var2);
                    } else {
                        e18Var6.n0();
                    }
                    z80 z80Var = cd4.f;
                    d4c.i0(e18Var6, z80Var, o5bVarD);
                    z80 z80Var2 = cd4.e;
                    d4c.i0(e18Var6, z80Var2, hycVarL2);
                    Integer numValueOf = Integer.valueOf(iHashCode2);
                    z80 z80Var3 = cd4.g;
                    d4c.i0(e18Var6, z80Var3, numValueOf);
                    bx bxVar = cd4.h;
                    d4c.h0(e18Var6, bxVar);
                    z80 z80Var4 = cd4.d;
                    d4c.i0(e18Var6, z80Var4, iqbVarE3);
                    iy0 iy0Var = (iy0) lscVar.getValue();
                    if (iy0Var instanceof gy0) {
                        e18Var6.a0(-1052734992);
                        vo1 vo1Var = lja.T;
                        FillElement fillElement = b.c;
                        q64 q64VarA2 = p64.a(ko0.e, vo1Var, e18Var6, 54);
                        int iHashCode3 = Long.hashCode(e18Var6.T);
                        hyc hycVarL3 = e18Var6.l();
                        iqb iqbVarE4 = kxk.E(e18Var6, fillElement);
                        e18Var6.e0();
                        if (e18Var6.S) {
                            e18Var6.k(re4Var2);
                        } else {
                            e18Var6.n0();
                        }
                        d4c.i0(e18Var6, z80Var, q64VarA2);
                        d4c.i0(e18Var6, z80Var2, hycVarL3);
                        ij0.t(iHashCode3, e18Var6, z80Var3, e18Var6, bxVar);
                        d4c.i0(e18Var6, z80Var4, iqbVarE4);
                        ez1.a(null, vf2.J, 0L, e18Var6, 48, 5);
                        tjh.b(gid.p(16.0f, R.string.assistant_overlay_loading, e18Var6, e18Var6, fqbVar), null, gm3.a(e18Var6).N, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var6).e.E).g, e18Var6, 0, 0, 131066);
                        e18Var6.p(true);
                        e18Var6.p(false);
                    } else if (iy0Var instanceof hy0) {
                        e18Var6.a0(-1051700274);
                        Object objN8 = e18Var6.N();
                        Object obj11 = objN8;
                        if (objN8 == lz1Var) {
                            jy0 jy0Var = new jy0();
                            e18Var6.k0(jy0Var);
                            obj11 = jy0Var;
                        }
                        jy0 jy0Var2 = (jy0) obj11;
                        boolean zH4 = e18Var6.h(jy0Var2);
                        Object objN9 = e18Var6.N();
                        Object obj12 = objN9;
                        if (zH4 || objN9 == lz1Var) {
                            zx0 zx0Var = new zx0(jy0Var2, 0);
                            e18Var6.k0(zx0Var);
                            obj12 = zx0Var;
                        }
                        fd9.d(ieiVar, (bz7) obj12, e18Var6);
                        j8.d(new hvd[]{gr9.b.a(((hy0) iy0Var).a), tda.a.a(jy0Var2)}, fd9.q0(-1715821175, new ay0(jy0Var2, str3, l45Var2, v4gVar, assistantOverlayActivity, 0), e18Var6), e18Var6, 48);
                        e18Var6.p(false);
                    } else {
                        if (!(iy0Var instanceof fy0)) {
                            throw ebh.u(e18Var6, -726697577, false);
                        }
                        e18Var6.a0(-1049646989);
                        e18Var6.p(false);
                    }
                    e18Var6.p(true);
                } else {
                    e18Var6.T();
                }
                return ieiVar;
            case 6:
                ModelOption modelOption = (ModelOption) obj8;
                List list2 = (List) obj9;
                pl3 pl3Var2 = (pl3) obj7;
                View view = (View) obj6;
                mj1 mj1Var = (mj1) obj5;
                ld4 ld4Var7 = (ld4) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                ((s64) obj).getClass();
                e18 e18Var7 = (e18) ld4Var7;
                if (e18Var7.Q(1 & iIntValue7, (iIntValue7 & 17) != 16)) {
                    String strJ03 = d4c.j0(R.string.settings_title_model, e18Var7);
                    p6 p6Var = new p6(7);
                    boolean zH5 = e18Var7.h(pl3Var2) | e18Var7.h(view) | e18Var7.f(mj1Var);
                    Object objN10 = e18Var7.N();
                    if (zH5 || objN10 == lz1Var) {
                        objN10 = new l6(pl3Var2, view, mj1Var, 9);
                        e18Var7.k0(objN10);
                    }
                    ikk.i(strJ03, modelOption, list2, p6Var, (bz7) objN10, null, null, e18Var7, 0, 96);
                } else {
                    e18Var7.T();
                }
                return ieiVar;
            case 7:
                gj1 gj1Var = (gj1) obj9;
                final pl3 pl3Var3 = (pl3) obj7;
                final View view2 = (View) obj8;
                final um1 um1Var = (um1) obj6;
                final fn1 fn1Var = (fn1) obj5;
                ld4 ld4Var8 = (ld4) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                ((s64) obj).getClass();
                e18 e18Var8 = (e18) ld4Var8;
                if (e18Var8.Q(1 & iIntValue8, (iIntValue8 & 17) != 16)) {
                    final boolean zC = gj1Var.c();
                    String strJ04 = d4c.j0(R.string.settings_activation_hands_free, e18Var8);
                    String strJ05 = d4c.j0(R.string.settings_activation_hands_free_description, e18Var8);
                    boolean z3 = !zC;
                    boolean zG = e18Var8.g(zC) | e18Var8.h(pl3Var3) | e18Var8.h(view2) | e18Var8.h(um1Var) | e18Var8.f(fn1Var);
                    Object objN11 = e18Var8.N();
                    if (zG || objN11 == lz1Var) {
                        final int i10 = 0;
                        objN11 = new zy7() { // from class: fl1
                            @Override // defpackage.zy7
                            public final Object a() {
                                int i11 = i10;
                                iei ieiVar2 = iei.a;
                                fn1 fn1Var2 = fn1Var;
                                um1 um1Var2 = um1Var;
                                View view3 = view2;
                                pl3 pl3Var4 = pl3Var3;
                                boolean z4 = zC;
                                switch (i11) {
                                    case 0:
                                        if (z4) {
                                            pl3Var4.c(view3);
                                            um1Var2.d(false);
                                            if (fn1Var2 != null) {
                                                tn1 tn1Var = (tn1) fn1Var2;
                                                xn1 xn1Var = tn1Var.p;
                                                VoiceEvents$VoiceActivationMode voiceEvents$VoiceActivationModeI = tn1Var.i();
                                                voiceEvents$VoiceActivationModeI.getClass();
                                                VoiceEvents$VoiceActivationMode voiceEvents$VoiceActivationMode = xn1Var.g;
                                                if (voiceEvents$VoiceActivationMode != null && voiceEvents$VoiceActivationModeI != voiceEvents$VoiceActivationMode) {
                                                    xn1Var.h.r(new wn1(VoiceEvents$VoiceSettingKind.ACTIVATION_MODE, ckk.h(voiceEvents$VoiceActivationMode), ckk.h(voiceEvents$VoiceActivationModeI)));
                                                }
                                                xn1Var.g = voiceEvents$VoiceActivationModeI;
                                            }
                                        }
                                        break;
                                    default:
                                        if (!z4) {
                                            pl3Var4.c(view3);
                                            um1Var2.d(true);
                                            if (fn1Var2 != null) {
                                                tn1 tn1Var2 = (tn1) fn1Var2;
                                                xn1 xn1Var2 = tn1Var2.p;
                                                VoiceEvents$VoiceActivationMode voiceEvents$VoiceActivationModeI2 = tn1Var2.i();
                                                voiceEvents$VoiceActivationModeI2.getClass();
                                                VoiceEvents$VoiceActivationMode voiceEvents$VoiceActivationMode2 = xn1Var2.g;
                                                if (voiceEvents$VoiceActivationMode2 != null && voiceEvents$VoiceActivationModeI2 != voiceEvents$VoiceActivationMode2) {
                                                    xn1Var2.h.r(new wn1(VoiceEvents$VoiceSettingKind.ACTIVATION_MODE, ckk.h(voiceEvents$VoiceActivationMode2), ckk.h(voiceEvents$VoiceActivationModeI2)));
                                                }
                                                xn1Var2.g = voiceEvents$VoiceActivationModeI2;
                                            }
                                        }
                                        break;
                                }
                                return ieiVar2;
                            }
                        };
                        e18Var8.k0(objN11);
                    }
                    ikk.h(strJ04, strJ05, z3, (zy7) objN11, null, e18Var8, 0);
                    m5j.a.b(6, e18Var8);
                    String strJ06 = d4c.j0(R.string.settings_activation_push_to_talk, e18Var8);
                    String strJ07 = d4c.j0(R.string.settings_activation_push_to_talk_description, e18Var8);
                    boolean zG2 = e18Var8.g(zC) | e18Var8.h(pl3Var3) | e18Var8.h(view2) | e18Var8.h(um1Var) | e18Var8.f(fn1Var);
                    Object objN12 = e18Var8.N();
                    if (zG2 || objN12 == lz1Var) {
                        final int i11 = 1;
                        z = zC;
                        objN12 = new zy7() { // from class: fl1
                            @Override // defpackage.zy7
                            public final Object a() {
                                int i112 = i11;
                                iei ieiVar2 = iei.a;
                                fn1 fn1Var2 = fn1Var;
                                um1 um1Var2 = um1Var;
                                View view3 = view2;
                                pl3 pl3Var4 = pl3Var3;
                                boolean z4 = z;
                                switch (i112) {
                                    case 0:
                                        if (z4) {
                                            pl3Var4.c(view3);
                                            um1Var2.d(false);
                                            if (fn1Var2 != null) {
                                                tn1 tn1Var = (tn1) fn1Var2;
                                                xn1 xn1Var = tn1Var.p;
                                                VoiceEvents$VoiceActivationMode voiceEvents$VoiceActivationModeI = tn1Var.i();
                                                voiceEvents$VoiceActivationModeI.getClass();
                                                VoiceEvents$VoiceActivationMode voiceEvents$VoiceActivationMode = xn1Var.g;
                                                if (voiceEvents$VoiceActivationMode != null && voiceEvents$VoiceActivationModeI != voiceEvents$VoiceActivationMode) {
                                                    xn1Var.h.r(new wn1(VoiceEvents$VoiceSettingKind.ACTIVATION_MODE, ckk.h(voiceEvents$VoiceActivationMode), ckk.h(voiceEvents$VoiceActivationModeI)));
                                                }
                                                xn1Var.g = voiceEvents$VoiceActivationModeI;
                                            }
                                        }
                                        break;
                                    default:
                                        if (!z4) {
                                            pl3Var4.c(view3);
                                            um1Var2.d(true);
                                            if (fn1Var2 != null) {
                                                tn1 tn1Var2 = (tn1) fn1Var2;
                                                xn1 xn1Var2 = tn1Var2.p;
                                                VoiceEvents$VoiceActivationMode voiceEvents$VoiceActivationModeI2 = tn1Var2.i();
                                                voiceEvents$VoiceActivationModeI2.getClass();
                                                VoiceEvents$VoiceActivationMode voiceEvents$VoiceActivationMode2 = xn1Var2.g;
                                                if (voiceEvents$VoiceActivationMode2 != null && voiceEvents$VoiceActivationModeI2 != voiceEvents$VoiceActivationMode2) {
                                                    xn1Var2.h.r(new wn1(VoiceEvents$VoiceSettingKind.ACTIVATION_MODE, ckk.h(voiceEvents$VoiceActivationMode2), ckk.h(voiceEvents$VoiceActivationModeI2)));
                                                }
                                                xn1Var2.g = voiceEvents$VoiceActivationModeI2;
                                            }
                                        }
                                        break;
                                }
                                return ieiVar2;
                            }
                        };
                        e18Var8.k0(objN12);
                    } else {
                        z = zC;
                    }
                    ikk.h(strJ06, strJ07, z, (zy7) objN12, null, e18Var8, 0);
                } else {
                    e18Var8.T();
                }
                return ieiVar;
            case 8:
                pvg pvgVar = (pvg) obj9;
                qi3 qi3Var2 = (qi3) obj8;
                zy7 zy7Var9 = (zy7) obj7;
                jp1 jp1Var = (jp1) obj6;
                RavenType ravenType = (RavenType) obj5;
                s64 s64Var = (s64) obj;
                ld4 ld4Var9 = (ld4) obj2;
                int iIntValue9 = ((Integer) obj3).intValue();
                s64Var.getClass();
                if ((iIntValue9 & 6) == 0) {
                    iIntValue9 |= ((e18) ld4Var9).f(s64Var) ? 4 : 2;
                }
                e18 e18Var9 = (e18) ld4Var9;
                if (!e18Var9.Q(iIntValue9 & 1, (iIntValue9 & 19) != 18)) {
                    e18Var9.T();
                } else if (pvgVar == pvg.FREE) {
                    e18Var9.a0(659945199);
                    boolean zH6 = e18Var9.h(qi3Var2) | e18Var9.f(zy7Var9);
                    Object objN13 = e18Var9.N();
                    if (zH6 || objN13 == lz1Var) {
                        objN13 = new dl(qi3Var2, zy7Var9, 1);
                        e18Var9.k0(objN13);
                    }
                    xzk.f(s64Var, (zy7) objN13, ((Boolean) jp1Var.g.getValue()).booleanValue(), (ovg) jp1Var.j.getValue(), (KycStatusResponse) jp1Var.k.getValue(), jp1Var.e, e18Var9, iIntValue9 & 14);
                    e18Var9.p(false);
                } else {
                    e18Var9.a0(660440052);
                    qvg qvgVar = (qvg) jp1Var.f.getValue();
                    String str4 = jp1Var.e;
                    boolean zBooleanValue2 = ((Boolean) jp1Var.i.getValue()).booleanValue();
                    ovg ovgVar = (ovg) jp1Var.j.getValue();
                    boolean zBooleanValue3 = ((Boolean) jp1Var.h.getValue()).booleanValue();
                    KycStatusResponse kycStatusResponse = (KycStatusResponse) jp1Var.k.getValue();
                    boolean zF5 = e18Var9.f(zy7Var9);
                    Object objN14 = e18Var9.N();
                    if (zF5 || objN14 == lz1Var) {
                        objN14 = new kl1(1, zy7Var9);
                        e18Var9.k0(objN14);
                    }
                    xzk.j(s64Var, pvgVar, ravenType, qvgVar, str4, zBooleanValue2, ovgVar, zBooleanValue3, kycStatusResponse, (zy7) objN14, e18Var9, iIntValue9 & 14);
                    e18Var9.p(false);
                }
                return ieiVar;
            case 9:
                o3f o3fVar = (o3f) obj9;
                x22 x22Var = (x22) obj8;
                nwb nwbVar5 = (nwb) obj7;
                nwb nwbVar6 = (nwb) obj6;
                isc iscVar = (isc) obj5;
                i4g i4gVar = (i4g) obj;
                ld4 ld4Var10 = (ld4) obj2;
                int iIntValue10 = ((Integer) obj3).intValue();
                i4gVar.getClass();
                if ((iIntValue10 & 6) == 0) {
                    iIntValue10 |= ((e18) ld4Var10).f(i4gVar) ? 4 : 2;
                }
                e18 e18Var10 = (e18) ld4Var10;
                if (e18Var10.Q(1 & iIntValue10, (iIntValue10 & 19) != 18)) {
                    if (x44.r((dq8) nwbVar5.getValue(), aq8.a)) {
                        e18Var10.a0(-320888904);
                        yuk.d(o3fVar, (Boolean) nwbVar6.getValue(), null, e18Var10, 0, 4);
                        i = 0;
                        e18Var10.p(false);
                    } else {
                        i = 0;
                        e18Var10.a0(-320787999);
                        e18Var10.p(false);
                    }
                    dq8 dq8Var = (dq8) nwbVar5.getValue();
                    Object objN15 = e18Var10.N();
                    if (objN15 == lz1Var) {
                        objN15 = new v22(iscVar, i);
                        e18Var10.k0(objN15);
                    }
                    iqb iqbVarN = gb9.N(b.c, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, i4gVar.b, 7);
                    int i12 = m3f.c;
                    stj.b(dq8Var, x22Var, (zy7) objN15, iqbVarN, e18Var10, 448);
                } else {
                    e18Var10.T();
                }
                return ieiVar;
            case 10:
                qb2 qb2Var = (qb2) obj9;
                ybg ybgVar = (ybg) obj8;
                ze0 ze0Var = (ze0) obj7;
                zy7 zy7Var10 = (zy7) obj6;
                pz7 pz7Var = (pz7) obj5;
                mnc mncVar3 = (mnc) obj;
                ld4 ld4Var11 = (ld4) obj2;
                int iIntValue11 = ((Integer) obj3).intValue();
                mncVar3.getClass();
                if ((iIntValue11 & 6) == 0) {
                    iIntValue11 |= ((e18) ld4Var11).f(mncVar3) ? 4 : 2;
                }
                e18 e18Var11 = (e18) ld4Var11;
                if (e18Var11.Q(iIntValue11 & 1, (iIntValue11 & 19) != 18)) {
                    zy1 zy1Var = qb2Var.l;
                    b1i b1iVar = qb2Var.i;
                    zni.g(zy1Var, ybgVar, e18Var11, 48);
                    iqb iqbVarB02 = mpk.b0(gb9.I(fqbVar, mncVar3), mpk.Y(e18Var11), true);
                    q64 q64VarA3 = p64.a(ko0.c, lja.S, e18Var11, 0);
                    int iHashCode4 = Long.hashCode(e18Var11.T);
                    hyc hycVarL4 = e18Var11.l();
                    iqb iqbVarE5 = kxk.E(e18Var11, iqbVarB02);
                    dd4.e.getClass();
                    re4 re4Var3 = cd4.b;
                    e18Var11.e0();
                    if (e18Var11.S) {
                        e18Var11.k(re4Var3);
                    } else {
                        e18Var11.n0();
                    }
                    d4c.i0(e18Var11, cd4.f, q64VarA3);
                    d4c.i0(e18Var11, cd4.e, hycVarL4);
                    d4c.i0(e18Var11, cd4.g, Integer.valueOf(iHashCode4));
                    d4c.h0(e18Var11, cd4.h);
                    d4c.i0(e18Var11, cd4.d, iqbVarE5);
                    qnc qncVar = qf2.a;
                    kxk.g(e18Var11, b.e(fqbVar, 12.0f));
                    boolean z4 = qb2Var.S().a || qb2Var.Q().a || qb2Var.P().a || ((mcpServerR = qb2Var.R()) != null && (qok.f(mcpServerR).isEmpty() ^ true)) || qb2Var.T().a || qb2Var.j.b();
                    boolean z5 = b1iVar.c() || b1iVar.d();
                    ta4 ta4Var2 = lwj.a;
                    boolean zG3 = e18Var11.g(z4) | e18Var11.h(qb2Var) | e18Var11.g(z5) | e18Var11.h(ze0Var) | e18Var11.f(zy7Var10) | e18Var11.f(pz7Var);
                    Object objN16 = e18Var11.N();
                    if (zG3 || objN16 == lz1Var) {
                        objN16 = new rb2(z4, z5, qb2Var, ze0Var, zy7Var10, pz7Var, 0);
                        e18Var11.k0(objN16);
                    }
                    qwj.a(null, null, ta4Var2, null, null, null, null, (bz7) objN16, e18Var11, 384, 123);
                    grc.z(fqbVar, 12.0f, e18Var11, true);
                } else {
                    e18Var11.T();
                }
                return ieiVar;
            case 11:
                nwb nwbVar7 = (nwb) obj9;
                hcb hcbVar = (hcb) obj8;
                pl3 pl3Var4 = (pl3) obj7;
                View view3 = (View) obj6;
                bz7 bz7Var = (bz7) obj5;
                zy7 zy7Var11 = (zy7) obj;
                ld4 ld4Var12 = (ld4) obj2;
                int iIntValue12 = ((Integer) obj3).intValue();
                zy7Var11.getClass();
                if ((iIntValue12 & 6) == 0) {
                    iIntValue12 |= ((e18) ld4Var12).h(zy7Var11) ? 4 : 2;
                }
                e18 e18Var12 = (e18) ld4Var12;
                if (e18Var12.Q(iIntValue12 & 1, (iIntValue12 & 19) != 18)) {
                    j8.b(((Boolean) nwbVar7.getValue()).booleanValue(), zy7Var11, null, 0L, null, null, null, 0L, MTTypesetterKt.kLineSkipLimitMultiplier, fd9.q0(1405039584, new xe((Object) hcbVar, pl3Var4, view3, (Object) zy7Var11, (Object) bz7Var, 12), e18Var12), e18Var12, (iIntValue12 << 3) & 112, 2044);
                } else {
                    e18Var12.T();
                }
                return ieiVar;
            case 12:
                hcb hcbVar2 = (hcb) obj9;
                pl3 pl3Var5 = (pl3) obj7;
                View view4 = (View) obj8;
                zy7 zy7Var12 = (zy7) obj6;
                bz7 bz7Var2 = (bz7) obj5;
                ld4 ld4Var13 = (ld4) obj2;
                int iIntValue13 = ((Integer) obj3).intValue();
                ((s64) obj).getClass();
                e18 e18Var13 = (e18) ld4Var13;
                if (e18Var13.Q(iIntValue13 & 1, (iIntValue13 & 17) != 16)) {
                    for (hcb hcbVar3 : hcb.J) {
                        int iOrdinal = hcbVar3.ordinal();
                        if (iOrdinal == 0) {
                            i2 = R.string.memory_style_files;
                        } else if (iOrdinal == 1) {
                            i2 = R.string.memory_style_classic;
                        } else {
                            if (iOrdinal != i5) {
                                wg6.i();
                                return tp4Var;
                            }
                            i2 = R.string.memory_style_off;
                        }
                        String strJ08 = d4c.j0(i2, e18Var13);
                        if (hcbVar3 == hcbVar2) {
                            e18Var13.a0(2092915744);
                            bpc bpcVarA2 = com.anthropic.claude.design.icon.a.a(ud0.L, e18Var13);
                            e18Var13.p(false);
                            obj4 = bpcVarA2;
                        } else {
                            e18Var13.a0(455891428);
                            e18Var13.p(false);
                            obj4 = tp4Var;
                        }
                        boolean z6 = hcbVar3 == hcbVar2;
                        int i13 = i5;
                        boolean zH7 = e18Var13.h(pl3Var5) | e18Var13.h(view4) | e18Var13.f(zy7Var12) | e18Var13.f(bz7Var2) | e18Var13.d(hcbVar3.ordinal());
                        Object objN17 = e18Var13.N();
                        if (zH7 || objN17 == lz1Var) {
                            objN17 = new dn(pl3Var5, view4, zy7Var12, bz7Var2, hcbVar3, 2);
                            e18Var13.k0(objN17);
                        }
                        uuj.a(strJ08, null, (zy7) objN17, null, obj4, false, Boolean.valueOf(z6), null, null, null, 0, 0, e18Var13, 32816, 4008);
                        i5 = i13;
                        tp4Var = null;
                    }
                } else {
                    e18Var13.T();
                }
                return ieiVar;
            case 13:
                return d(obj, obj2, obj3);
            case 14:
                return e(obj, obj2, obj3);
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                return f(obj, obj2, obj3);
            case 16:
                return g(obj, obj2, obj3);
            case g.MAX_FIELD_NUMBER /* 17 */:
                return h(obj, obj2, obj3);
            case g.AVG_FIELD_NUMBER /* 18 */:
                return n(obj, obj2, obj3);
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return o(obj, obj2, obj3);
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                return p(obj, obj2, obj3);
            case 21:
                return q(obj, obj2, obj3);
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return s(obj, obj2, obj3);
            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return t(obj, obj2, obj3);
            case 24:
                return r(obj, obj2, obj3);
            case BuildConfig.VERSION_CODE /* 25 */:
                return u(obj, obj2, obj3);
            case 26:
                return v(obj, obj2, obj3);
            case 27:
                return w(obj, obj2, obj3);
            case 28:
                return x(obj, obj2, obj3);
            default:
                TaskResponse taskResponse = (TaskResponse) obj9;
                bz7 bz7Var3 = (bz7) obj8;
                t4g t4gVar = (t4g) obj7;
                l5h l5hVar = (l5h) obj6;
                pz7 pz7Var2 = (pz7) obj5;
                i4g i4gVar2 = (i4g) obj;
                ld4 ld4Var14 = (ld4) obj2;
                int iIntValue14 = ((Integer) obj3).intValue();
                i4gVar2.getClass();
                if ((iIntValue14 & 6) == 0) {
                    iIntValue14 |= ((e18) ld4Var14).f(i4gVar2) ? 4 : 2;
                }
                e18 e18Var14 = (e18) ld4Var14;
                if (e18Var14.Q(iIntValue14 & 1, (iIntValue14 & 19) != 18)) {
                    boolean zH8 = e18Var14.h(t4gVar) | e18Var14.f(taskResponse);
                    Object objN18 = e18Var14.N();
                    if (zH8 || objN18 == lz1Var) {
                        objN18 = new nif(t4gVar, 14, taskResponse);
                        e18Var14.k0(objN18);
                    }
                    bz7 bz7Var4 = (bz7) objN18;
                    boolean zH9 = e18Var14.h(l5hVar) | e18Var14.f(taskResponse);
                    Object objN19 = e18Var14.N();
                    if (zH9 || objN19 == lz1Var) {
                        objN19 = new u9h(l5hVar, taskResponse, tp4Var, z ? 1 : 0);
                        e18Var14.k0(objN19);
                    }
                    pz7 pz7Var3 = (pz7) objN19;
                    boolean zF6 = e18Var14.f(pz7Var2) | e18Var14.f(taskResponse);
                    Object objN20 = e18Var14.N();
                    if (zF6 || objN20 == lz1Var) {
                        objN20 = new p9h(pz7Var2, taskResponse, 1);
                        e18Var14.k0(objN20);
                    }
                    bz7 bz7Var5 = (bz7) objN20;
                    boolean zH10 = e18Var14.h(t4gVar) | e18Var14.f(taskResponse);
                    Object objN21 = e18Var14.N();
                    if (zH10 || objN21 == lz1Var) {
                        objN21 = new o(t4gVar, taskResponse);
                        e18Var14.k0(objN21);
                    }
                    q.e(taskResponse, bz7Var3, bz7Var4, new e5h(pz7Var3, bz7Var5, (pz7) objN21), ttj.m(fqbVar, i4gVar2), e18Var14, FreeTypeConstants.FT_LOAD_MONOCHROME);
                } else {
                    e18Var14.T();
                }
                return ieiVar;
        }
    }

    public /* synthetic */ xe(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.E = i;
        this.F = obj;
        this.G = obj2;
        this.H = obj3;
        this.I = obj4;
        this.J = obj5;
    }

    public /* synthetic */ xe(Object obj, List list, Object obj2, Object obj3, Object obj4, int i) {
        this.E = i;
        this.G = obj;
        this.F = list;
        this.H = obj2;
        this.I = obj3;
        this.J = obj4;
    }
}
