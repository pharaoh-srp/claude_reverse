package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.view.View;
import androidx.compose.foundation.layout.b;
import androidx.health.platform.client.proto.g;
import coil3.compose.AsyncImagePainter;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.R;
import com.anthropic.claude.api.chat.tool.ImageGalleryItem;
import com.anthropic.claude.api.chat.tool.ImageGalleryItemId;
import com.anthropic.claude.api.conway.WebhookRecord;
import com.anthropic.claude.api.mcp.DirectoryServer;
import com.anthropic.claude.api.mcp.McpTool;
import com.anthropic.claude.api.notice.Cta;
import com.anthropic.claude.api.notice.Notice;
import com.anthropic.claude.artifact.details.ArtifactFullScreenParams;
import com.anthropic.claude.bell.BellModelSheetDestination;
import com.anthropic.claude.chat.bottomsheet.options.ChatOptionsBottomSheetDestination;
import com.anthropic.claude.code.remote.bottomsheet.CodeRemoteBottomSheetDestination;
import com.anthropic.claude.code.remote.i;
import com.anthropic.claude.conway.protocol.ConwayExtensionMeta;
import com.anthropic.claude.design.icon.a;
import com.anthropic.claude.mainactivity.AssistantOverlayActivity;
import com.anthropic.claude.sessions.types.PermissionMode;
import com.anthropic.claude.settings.internal.e;
import com.anthropic.claude.types.strings.ChatId;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import siftscience.android.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class bn implements rz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ Object F;
    public final /* synthetic */ Object G;
    public final /* synthetic */ Object H;
    public final /* synthetic */ Object I;

    public /* synthetic */ bn(pz7 pz7Var, cp4 cp4Var, rz7 rz7Var, zy7 zy7Var) {
        this.E = 17;
        this.F = pz7Var;
        this.H = cp4Var;
        this.I = rz7Var;
        this.G = zy7Var;
    }

    private final Object d(Object obj, Object obj2, Object obj3) {
        int i;
        boolean z;
        ir4 ir4Var = (ir4) this.F;
        bz7 bz7Var = (bz7) this.G;
        kyb kybVar = (kyb) this.H;
        String str = (String) this.I;
        dxe dxeVar = (dxe) obj;
        ld4 ld4Var = (ld4) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        dxeVar.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= ((e18) ld4Var).f(dxeVar) ? 4 : 2;
        }
        e18 e18Var = (e18) ld4Var;
        if (e18Var.Q(iIntValue & 1, (iIntValue & 19) != 18)) {
            if (ir4Var == ir4.E) {
                i = iIntValue;
                z = true;
            } else {
                i = iIntValue;
                z = false;
            }
            boolean zF = e18Var.f(bz7Var);
            Object objN = e18Var.N();
            lz1 lz1Var = jd4.a;
            if (zF || objN == lz1Var) {
                objN = new zb2(3, bz7Var);
                e18Var.k0(objN);
            }
            int i2 = (i & 14) | 1575936;
            ryb.b(dxeVar, z, (zy7) objN, ajk.a, null, false, fd9.q0(655092996, new rq(str, 16), e18Var), false, kybVar, e18Var, i2);
            boolean z2 = ir4Var == ir4.F;
            boolean zF2 = e18Var.f(bz7Var);
            Object objN2 = e18Var.N();
            if (zF2 || objN2 == lz1Var) {
                objN2 = new zb2(4, bz7Var);
                e18Var.k0(objN2);
            }
            ryb.b(dxeVar, z2, (zy7) objN2, ajk.b, null, false, ajk.c, false, kybVar, e18Var, i2);
        } else {
            e18Var.T();
        }
        return iei.a;
    }

    private final Object e(Object obj, Object obj2, Object obj3) {
        l45 l45Var;
        Object heVar;
        final dx4 dx4Var = (dx4) this.F;
        l45 l45Var2 = (l45) this.G;
        final bz7 bz7Var = (bz7) this.I;
        final nwb nwbVar = (nwb) this.H;
        ld4 ld4Var = (ld4) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((s64) obj).getClass();
        e18 e18Var = (e18) ld4Var;
        if (e18Var.Q(iIntValue & 1, (iIntValue & 17) != 16)) {
            bz7 bz7Var2 = dx4Var.b;
            lz1 lz1Var = jd4.a;
            if (bz7Var2 == null) {
                e18Var.a0(-398175827);
                e18Var.p(false);
                l45Var = l45Var2;
            } else {
                e18Var.a0(-398175826);
                boolean zH = e18Var.h(l45Var2) | e18Var.f(bz7Var) | e18Var.h(bz7Var2);
                Object objN = e18Var.N();
                if (zH || objN == lz1Var) {
                    l45Var = l45Var2;
                    heVar = new he(11, nwbVar, bz7Var2, l45Var, bz7Var);
                    nwbVar = nwbVar;
                    bz7Var = bz7Var;
                    e18Var.k0(heVar);
                } else {
                    l45Var = l45Var2;
                    heVar = objN;
                }
                t30.b(cjk.b, (zy7) heVar, null, cjk.c, null, false, null, null, e18Var, 3078, 500);
                e18Var.p(false);
            }
            boolean zH2 = e18Var.h(l45Var) | e18Var.f(bz7Var) | e18Var.h(dx4Var);
            Object objN2 = e18Var.N();
            if (zH2 || objN2 == lz1Var) {
                final int i = 0;
                final l45 l45Var3 = l45Var;
                zy7 zy7Var = new zy7() { // from class: xr4
                    @Override // defpackage.zy7
                    public final Object a() {
                        int i2 = i;
                        iei ieiVar = iei.a;
                        bz7 bz7Var3 = bz7Var;
                        nwb nwbVar2 = nwbVar;
                        l45 l45Var4 = l45Var3;
                        dx4 dx4Var2 = dx4Var;
                        switch (i2) {
                            case 0:
                                fs4.b(l45Var4, nwbVar2, bz7Var3, dx4Var2.a);
                                break;
                            default:
                                fs4.b(l45Var4, nwbVar2, bz7Var3, dx4Var2.c);
                                break;
                        }
                        return ieiVar;
                    }
                };
                e18Var.k0(zy7Var);
                objN2 = zy7Var;
            }
            t30.b(cjk.d, (zy7) objN2, null, cjk.e, null, false, null, null, e18Var, 3078, 500);
            boolean zH3 = e18Var.h(l45Var) | e18Var.f(bz7Var) | e18Var.h(dx4Var);
            Object objN3 = e18Var.N();
            if (zH3 || objN3 == lz1Var) {
                final int i2 = 1;
                final l45 l45Var4 = l45Var;
                zy7 zy7Var2 = new zy7() { // from class: xr4
                    @Override // defpackage.zy7
                    public final Object a() {
                        int i22 = i2;
                        iei ieiVar = iei.a;
                        bz7 bz7Var3 = bz7Var;
                        nwb nwbVar2 = nwbVar;
                        l45 l45Var42 = l45Var4;
                        dx4 dx4Var2 = dx4Var;
                        switch (i22) {
                            case 0:
                                fs4.b(l45Var42, nwbVar2, bz7Var3, dx4Var2.a);
                                break;
                            default:
                                fs4.b(l45Var42, nwbVar2, bz7Var3, dx4Var2.c);
                                break;
                        }
                        return ieiVar;
                    }
                };
                e18Var.k0(zy7Var2);
                objN3 = zy7Var2;
            }
            t30.b(cjk.f, (zy7) objN3, null, cjk.g, null, false, null, null, e18Var, 3078, 500);
        } else {
            e18Var.T();
        }
        return iei.a;
    }

    private final Object f(Object obj, Object obj2, Object obj3) throws Throwable {
        Object heVar;
        ConwayExtensionMeta conwayExtensionMeta;
        Throwable th;
        p05 p05Var = (p05) this.F;
        l45 l45Var = (l45) this.G;
        Context context = (Context) this.I;
        nwb nwbVar = (nwb) this.H;
        ld4 ld4Var = (ld4) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((s64) obj).getClass();
        e18 e18Var = (e18) ld4Var;
        if (e18Var.Q(iIntValue & 1, (iIntValue & 17) != 16)) {
            fz4 fz4Var = (fz4) p05Var.i.getValue();
            Throwable th2 = null;
            if (x44.r(fz4Var, ez4.a)) {
                e18Var.a0(-767407094);
                if (p05Var.R() == null) {
                    e18Var.a0(1980201348);
                    zsk.b(d4c.j0(R.string.conway_system_connecting, e18Var), null, e18Var, 0);
                    e18Var.p(false);
                } else {
                    e18Var.a0(1980322248);
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
                    e18Var = e18Var;
                    e18Var.p(true);
                    e18Var.p(false);
                }
                e18Var.p(false);
            } else if (fz4Var instanceof cz4) {
                e18Var.a0(-767393838);
                zsk.b(((cz4) fz4Var).a, null, e18Var, 0);
                e18Var.p(false);
            } else {
                if (!(fz4Var instanceof dz4)) {
                    throw ebh.u(e18Var, -767408313, false);
                }
                e18Var.a0(-767389165);
                Object obj4 = ((dz4) fz4Var).a;
                if (((List) obj4).isEmpty()) {
                    e18Var.a0(1980719916);
                    zsk.b(d4c.j0(R.string.conway_ext_empty, e18Var), null, e18Var, 0);
                    e18Var.p(false);
                } else {
                    e18Var.a0(1980870359);
                    int i = 0;
                    for (Object obj5 : (Iterable) obj4) {
                        int i2 = i + 1;
                        if (i < 0) {
                            Throwable th3 = th2;
                            x44.n0();
                            throw th3;
                        }
                        ConwayExtensionMeta conwayExtensionMeta2 = (ConwayExtensionMeta) obj5;
                        if (i > 0) {
                            e18Var.a0(-833746895);
                            iuj.e(null, MTTypesetterKt.kLineSkipLimitMultiplier, gm3.a(e18Var).v, e18Var, 0, 3);
                        } else {
                            e18Var.a0(-76297112);
                        }
                        e18Var.p(false);
                        boolean zH = e18Var.h(l45Var) | e18Var.f(p05Var) | e18Var.h(conwayExtensionMeta2) | e18Var.h(context);
                        Object objN = e18Var.N();
                        lz1 lz1Var = jd4.a;
                        if (zH || objN == lz1Var) {
                            conwayExtensionMeta = conwayExtensionMeta2;
                            th = th2;
                            heVar = new he(l45Var, p05Var, conwayExtensionMeta, context, 12);
                            e18Var.k0(heVar);
                        } else {
                            th = th2;
                            heVar = objN;
                            conwayExtensionMeta = conwayExtensionMeta2;
                        }
                        zy7 zy7Var = (zy7) heVar;
                        boolean zF = e18Var.f(nwbVar) | e18Var.h(conwayExtensionMeta);
                        Object objN2 = e18Var.N();
                        if (zF || objN2 == lz1Var) {
                            objN2 = new d44(conwayExtensionMeta, 11, nwbVar);
                            e18Var.k0(objN2);
                        }
                        gsk.a(conwayExtensionMeta, null, zy7Var, (zy7) objN2, e18Var, ConwayExtensionMeta.$stable, 2);
                        i = i2;
                        th2 = th;
                    }
                    e18Var.p(false);
                }
                e18Var.p(false);
            }
        } else {
            e18Var.T();
        }
        return iei.a;
    }

    private final Object g(Object obj, Object obj2, Object obj3) {
        long j;
        String str = (String) this.F;
        String str2 = (String) this.G;
        w05 w05Var = (w05) this.H;
        or4 or4Var = (or4) this.I;
        iqb iqbVar = (iqb) obj;
        ld4 ld4Var = (ld4) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        iqbVar.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= ((e18) ld4Var).f(iqbVar) ? 4 : 2;
        }
        e18 e18Var = (e18) ld4Var;
        if (e18Var.Q(iIntValue & 1, (iIntValue & 19) != 18)) {
            fx4 fx4Var = or4Var.e;
            d54 d54Var = fx4Var != null ? new d54(fx4Var.a()) : null;
            if (d54Var == null) {
                e18Var.a0(302358953);
                j = gm3.a(e18Var).M;
                e18Var.p(false);
            } else {
                e18Var.a0(302357434);
                e18Var.p(false);
                j = d54Var.a;
            }
            ctk.b(str, str2, w05Var, iqbVar, j, or4Var.g < 0.95f, e18Var, 512 | ((iIntValue << 9) & 7168), 0);
        } else {
            e18Var.T();
        }
        return iei.a;
    }

    private final Object h(Object obj, Object obj2, Object obj3) {
        WebhookRecord webhookRecord = (WebhookRecord) this.F;
        rz7 rz7Var = (rz7) this.I;
        zy7 zy7Var = (zy7) this.G;
        nwb nwbVar = (nwb) this.H;
        ld4 ld4Var = (ld4) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((s64) obj).getClass();
        e18 e18Var = (e18) ld4Var;
        if (e18Var.Q(iIntValue & 1, (iIntValue & 17) != 16)) {
            boolean zBooleanValue = ((Boolean) nwbVar.getValue()).booleanValue();
            Object objN = e18Var.N();
            lz1 lz1Var = jd4.a;
            if (objN == lz1Var) {
                objN = new fr4(20);
                e18Var.k0(objN);
            }
            nai.a(48, 0, e18Var, (zy7) objN, zBooleanValue);
            boolean zBooleanValue2 = ((Boolean) nwbVar.getValue()).booleanValue();
            Object objN2 = e18Var.N();
            if (objN2 == lz1Var) {
                objN2 = new x40(26, nwbVar);
                e18Var.k0(objN2);
            }
            d25.b(webhookRecord, zBooleanValue2, (bz7) objN2, rz7Var, zy7Var, e18Var, WebhookRecord.$stable | 384);
        } else {
            e18Var.T();
        }
        return iei.a;
    }

    private final Object n(Object obj, Object obj2, Object obj3) {
        e18 e18Var;
        Notice notice = (Notice) this.F;
        zy7 zy7Var = (zy7) this.G;
        zy7 zy7Var2 = (zy7) this.H;
        zb0 zb0Var = (zb0) this.I;
        dxe dxeVar = (dxe) obj;
        ld4 ld4Var = (ld4) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        dxeVar.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= ((e18) ld4Var).f(dxeVar) ? 4 : 2;
        }
        e18 e18Var2 = (e18) ld4Var;
        if (e18Var2.Q(iIntValue & 1, (iIntValue & 19) != 18)) {
            ho0 ho0Var = new ho0(2.0f, true, new sz6(1));
            fqb fqbVar = fqb.E;
            iqb iqbVarA = dxeVar.a(fqbVar, 1.0f, true);
            q64 q64VarA = p64.a(ho0Var, lja.S, e18Var2, 6);
            int iHashCode = Long.hashCode(e18Var2.T);
            hyc hycVarL = e18Var2.l();
            iqb iqbVarE = kxk.E(e18Var2, iqbVarA);
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
            String title = notice.getTitle();
            if (title == null) {
                e18Var2.a0(-1776220796);
                e18Var2.p(false);
            } else {
                e18Var2.a0(-1776220795);
                tjh.b(title, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var2).e.E).j, e18Var2, 0, 0, 131070);
                e18Var2.p(false);
            }
            if (zb0Var == null) {
                e18Var2.a0(-1776032688);
                e18Var2.p(false);
                e18Var = e18Var2;
            } else {
                e18Var2.a0(-1776032687);
                tjh.c(zb0Var, null, gm3.a(e18Var2).O, 0L, 0L, null, 0L, 0, false, 0, 0, null, null, ((jm3) gm3.c(e18Var2).e.E).i, e18Var2, 0, 0, 262138);
                e18Var = e18Var2;
                e18Var.p(false);
            }
            e18Var.p(true);
            kxk.g(e18Var, b.t(fqbVar, 16.0f));
            Cta cta = notice.getCta();
            if (cta == null || zy7Var == null) {
                e18Var.a0(1079639595);
                h66.f(zy7Var2, e18Var, 0);
                e18Var.p(false);
            } else {
                e18Var.a0(1079438994);
                dtj.a(cta.getCopy(), null, false, null, f12.a, y02.a, 0L, zy7Var, e18Var, 221184, 78);
                e18Var.p(false);
            }
        } else {
            e18Var2.T();
        }
        return iei.a;
    }

    private final Object o(Object obj, Object obj2, Object obj3) {
        List list = (List) this.F;
        String str = (String) this.G;
        ArrayList arrayList = (ArrayList) this.H;
        String str2 = (String) this.I;
        ld4 ld4Var = (ld4) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((mw1) obj).getClass();
        e18 e18Var = (e18) ld4Var;
        if (e18Var.Q(iIntValue & 1, (iIntValue & 17) != 16)) {
            Iterator it = list.iterator();
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                }
                if (str2 == null ? false : ImageGalleryItemId.m307equalsimpl0(((ImageGalleryItem) it.next()).m303getIdivCCbqw(), str2)) {
                    break;
                }
                i++;
            }
            if (i >= 0) {
                e18Var.a0(-1533083237);
                Iterator it2 = w44.j1(list, i).iterator();
                float fR = 0.0f;
                while (it2.hasNext()) {
                    fR = 4.0f + fuk.r((ImageGalleryItem) it2.next()) + fR;
                }
                fuk.e((ImageGalleryItem) list.get(i), str, (AsyncImagePainter) arrayList.get(i), sf5.N(fqb.E, fR, MTTypesetterKt.kLineSkipLimitMultiplier, 2), e18Var, 0);
                e18Var.p(false);
            } else {
                e18Var.a0(-1532673851);
                e18Var.p(false);
            }
        } else {
            e18Var.T();
        }
        return iei.a;
    }

    private final Object p(Object obj, Object obj2, Object obj3) {
        u2a u2aVar = (u2a) this.F;
        zy7 zy7Var = (zy7) this.G;
        zy7 zy7Var2 = (zy7) this.H;
        qi3 qi3Var = (qi3) this.I;
        ld4 ld4Var = (ld4) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((s64) obj).getClass();
        int i = 0;
        e18 e18Var = (e18) ld4Var;
        if (e18Var.Q(iIntValue & 1, (iIntValue & 17) != 16)) {
            eli eliVar = (eli) e18Var.j(ve4.t);
            Boolean bool = Boolean.TRUE;
            boolean zH = e18Var.h(u2aVar);
            Object objN = e18Var.N();
            lz1 lz1Var = jd4.a;
            if (zH || objN == lz1Var) {
                objN = new e29(u2aVar, null, i);
                e18Var.k0(objN);
            }
            fd9.i(e18Var, (pz7) objN, bool);
            String strA = u2aVar.a(t2a.J);
            String strA2 = u2aVar.a(t2a.H);
            String strA3 = u2aVar.a(t2a.I);
            String strJ0 = d4c.j0(R.string.learn_more_menu_consumer_terms, e18Var);
            ud0 ud0Var = ud0.l;
            bpc bpcVarA = a.a(ud0Var, e18Var);
            boolean zH2 = e18Var.h(eliVar) | e18Var.f(strA);
            Object objN2 = e18Var.N();
            if (zH2 || objN2 == lz1Var) {
                objN2 = new kp1(eliVar, strA, 10);
                e18Var.k0(objN2);
            }
            uuj.a(strJ0, bpcVarA, (zy7) objN2, null, null, false, null, null, null, null, 0, 0, e18Var, 64, 4088);
            String strJ02 = d4c.j0(R.string.learn_more_menu_acceptable_use_policy, e18Var);
            bpc bpcVarA2 = a.a(ud0Var, e18Var);
            boolean zH3 = e18Var.h(eliVar) | e18Var.f(strA2);
            Object objN3 = e18Var.N();
            if (zH3 || objN3 == lz1Var) {
                objN3 = new kp1(eliVar, strA2, 11);
                e18Var.k0(objN3);
            }
            uuj.a(strJ02, bpcVarA2, (zy7) objN3, null, null, false, null, null, null, null, 0, 0, e18Var, 64, 4088);
            String strJ03 = d4c.j0(R.string.learn_more_menu_privacy_policy, e18Var);
            bpc bpcVarA3 = a.a(ud0Var, e18Var);
            boolean zH4 = e18Var.h(eliVar) | e18Var.f(strA3);
            Object objN4 = e18Var.N();
            if (zH4 || objN4 == lz1Var) {
                objN4 = new kp1(eliVar, strA3, 12);
                e18Var.k0(objN4);
            }
            uuj.a(strJ03, bpcVarA3, (zy7) objN4, null, null, false, null, null, null, null, 0, 0, e18Var, 64, 4088);
            String strJ04 = d4c.j0(R.string.learn_more_menu_licenses, e18Var);
            bpc bpcVarA4 = a.a(ud0.l0, e18Var);
            boolean zF = e18Var.f(zy7Var) | e18Var.f(zy7Var2);
            Object objN5 = e18Var.N();
            if (zF || objN5 == lz1Var) {
                objN5 = new kt0(zy7Var, zy7Var2, 23);
                e18Var.k0(objN5);
            }
            uuj.a(strJ04, bpcVarA4, (zy7) objN5, null, null, false, null, null, null, null, 0, 0, e18Var, 64, 4088);
            e18Var.a0(-438936240);
            e18Var.p(false);
            iuj.e(null, 2.0f, gm3.a(e18Var).p, e18Var, 48, 1);
            String strJ05 = d4c.j0(R.string.learn_more_menu_help_and_support, e18Var);
            bpc bpcVarA5 = a.a(ud0Var, e18Var);
            boolean zH5 = e18Var.h(eliVar) | e18Var.h(qi3Var);
            Object objN6 = e18Var.N();
            if (zH5 || objN6 == lz1Var) {
                objN6 = new w95(eliVar, 27, qi3Var);
                e18Var.k0(objN6);
            }
            uuj.a(strJ05, bpcVarA5, (zy7) objN6, null, null, false, null, null, null, null, 0, 0, e18Var, 64, 4088);
            iuj.e(null, 2.0f, gm3.a(e18Var).p, e18Var, 48, 1);
            jvk.g(0, e18Var);
        } else {
            e18Var.T();
        }
        return iei.a;
    }

    private final Object q(Object obj, Object obj2, Object obj3) {
        fk0 fk0Var = (fk0) this.F;
        b4e b4eVar = (b4e) this.G;
        l45 l45Var = (l45) this.H;
        ybg ybgVar = (ybg) this.I;
        ld4 ld4Var = (ld4) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((s64) obj).getClass();
        int i = 0;
        e18 e18Var = (e18) ld4Var;
        if (e18Var.Q(iIntValue & 1, (iIntValue & 17) != 16)) {
            String str = (String) fk0Var.v.getValue();
            b4eVar.getClass();
            boolean zR = x44.r(str, "1.260618.10");
            boolean zH = e18Var.h(fk0Var) | e18Var.h(b4eVar) | e18Var.h(l45Var);
            Object objN = e18Var.N();
            lz1 lz1Var = jd4.a;
            if (zH || objN == lz1Var) {
                objN = new fe(fk0Var, b4eVar, l45Var, ybgVar, 22);
                e18Var.k0(objN);
            }
            e.f("Trigger force upgrade on this version", zR, (bz7) objN, null, null, null, null, e18Var, 6, 120);
            boolean zBooleanValue = ((Boolean) fk0Var.I.getValue()).booleanValue();
            boolean zH2 = e18Var.h(fk0Var) | e18Var.h(l45Var);
            Object objN2 = e18Var.N();
            if (zH2 || objN2 == lz1Var) {
                objN2 = new u99(fk0Var, l45Var, ybgVar, i);
                e18Var.k0(objN2);
            }
            e.f("Trigger flexible update on this version", zBooleanValue, (bz7) objN2, null, null, null, null, e18Var, 6, 120);
        } else {
            e18Var.T();
        }
        return iei.a;
    }

    private final Object r(Object obj, Object obj2, Object obj3) {
        fk0 fk0Var = (fk0) this.F;
        l45 l45Var = (l45) this.G;
        rwe rweVar = (rwe) this.H;
        ybg ybgVar = (ybg) this.I;
        ld4 ld4Var = (ld4) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((s64) obj).getClass();
        int i = 1;
        int i2 = 16;
        e18 e18Var = (e18) ld4Var;
        if (e18Var.Q(iIntValue & 1, (iIntValue & 17) != 16)) {
            String strJ0 = d4c.j0(R.string.internal_setting_http_logging_verbose, e18Var);
            boolean zBooleanValue = ((Boolean) fk0Var.f.getValue()).booleanValue();
            boolean zH = e18Var.h(fk0Var);
            Object objN = e18Var.N();
            lz1 lz1Var = jd4.a;
            if (zH || objN == lz1Var) {
                objN = new rn6(fk0Var, 4);
                e18Var.k0(objN);
            }
            e.f(strJ0, zBooleanValue, (bz7) objN, null, null, null, null, e18Var, 0, 120);
            boolean zBooleanValue2 = ((Boolean) fk0Var.B.getValue()).booleanValue();
            boolean zH2 = e18Var.h(fk0Var) | e18Var.h(l45Var);
            Object objN2 = e18Var.N();
            if (zH2 || objN2 == lz1Var) {
                objN2 = new u99(fk0Var, l45Var, ybgVar, i);
                e18Var.k0(objN2);
            }
            e.f("Force OkHTTP (disable Cronet)", zBooleanValue2, (bz7) objN2, null, "Cronet uses HTTP/3, but isn't visible to Android Studio Network Inspector", null, null, e18Var, 24582, 104);
            boolean zBooleanValue3 = ((Boolean) fk0Var.C.getValue()).booleanValue();
            boolean zH3 = e18Var.h(fk0Var);
            Object objN3 = e18Var.N();
            if (zH3 || objN3 == lz1Var) {
                objN3 = new rn6(fk0Var, 5);
                e18Var.k0(objN3);
            }
            e.f("Record SSE transcripts", zBooleanValue3, (bz7) objN3, null, "Writes raw completion SSE to filesDir/sse_transcripts. Pull with ./bin/moo android pull-sse-transcripts", null, null, e18Var, 6, 104);
            boolean zH4 = e18Var.h(rweVar);
            Object objN4 = e18Var.N();
            if (zH4 || objN4 == lz1Var) {
                objN4 = new av(rweVar, i2);
                e18Var.k0(objN4);
            }
            e.d((zy7) objN4, null, fd9.q0(1324881465, new s99(fk0Var, i), e18Var), e18Var, 384, 2);
        } else {
            e18Var.T();
        }
        return iei.a;
    }

    private final Object s(Object obj, Object obj2, Object obj3) {
        String str = (String) this.F;
        nwb nwbVar = (nwb) this.H;
        List list = (List) this.G;
        fk0 fk0Var = (fk0) this.I;
        dxe dxeVar = (dxe) obj;
        ld4 ld4Var = (ld4) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        dxeVar.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= ((e18) ld4Var).f(dxeVar) ? 4 : 2;
        }
        e18 e18Var = (e18) ld4Var;
        if (e18Var.Q(iIntValue & 1, (iIntValue & 19) != 18)) {
            tjh.b("Age signals override", dxeVar.a(fqb.E, 1.0f, true), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, e18Var, 6, 0, 262140);
            tjh.b(str, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, e18Var, 0, 0, 262142);
            boolean zBooleanValue = ((Boolean) nwbVar.getValue()).booleanValue();
            Object objN = e18Var.N();
            if (objN == jd4.a) {
                objN = new d29(5, nwbVar);
                e18Var.k0(objN);
            }
            j8.b(zBooleanValue, (zy7) objN, null, 0L, null, null, null, 0L, MTTypesetterKt.kLineSkipLimitMultiplier, fd9.q0(-1344566093, new xg4(list, fk0Var, nwbVar, 18), e18Var), e18Var, 48, 2044);
        } else {
            e18Var.T();
        }
        return iei.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r22v0 */
    /* JADX WARN: Type inference failed for: r22v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r22v2 */
    /* JADX WARN: Type inference failed for: r8v0, types: [tp4] */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v12, types: [java.lang.Object] */
    @Override // defpackage.rz7
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i;
        bpc bpcVar;
        boolean z;
        bz7 bz7Var;
        kwe kweVar;
        McpTool mcpTool;
        Object obj4;
        int i2 = this.E;
        int i3 = 8;
        fqb fqbVar = fqb.E;
        int i4 = 16;
        ?? r8 = 0;
        lz1 lz1Var = jd4.a;
        iei ieiVar = iei.a;
        Object obj5 = this.I;
        Object obj6 = this.H;
        Object obj7 = this.G;
        int i5 = 9;
        Object obj8 = this.F;
        int i6 = 12;
        switch (i2) {
            case 0:
                an anVar = (an) obj8;
                sl slVar = anVar.b;
                zy7 zy7Var = (zy7) obj7;
                nwb nwbVar = (nwb) obj6;
                wlg wlgVar = (wlg) obj5;
                ld4 ld4Var = (ld4) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((ia0) obj).getClass();
                e18 e18Var = (e18) ld4Var;
                if (e18Var.Q(iIntValue & 1, (iIntValue & 17) != 16)) {
                    String str = (String) anVar.e.getValue();
                    boolean zF = e18Var.f(anVar);
                    Object objN = e18Var.N();
                    if (zF || objN == lz1Var) {
                        i = 1;
                        objN = new en(anVar, i);
                        e18Var.k0(objN);
                    } else {
                        i = 1;
                    }
                    bz7 bz7Var2 = (bz7) objN;
                    vm vmVar = (vm) slVar;
                    ?? r22 = (vmVar.c() == rk.F && !((Boolean) vmVar.o.getValue()).booleanValue() && ((vm) slVar).I.isEmpty()) ? i : 0;
                    boolean zF2 = e18Var.f(anVar);
                    Object objN2 = e18Var.N();
                    if (zF2 || objN2 == lz1Var) {
                        xn xnVar = new xn(0, anVar, an.class, "sendMessage", "sendMessage()V", 0, 2);
                        e18Var.k0(xnVar);
                        objN2 = xnVar;
                    }
                    zy7 zy7Var2 = (zy7) ((jm9) objN2);
                    kdg kdgVar = ((vm) slVar).T;
                    Object objN3 = e18Var.N();
                    if (objN3 == lz1Var) {
                        objN3 = new ve(2, nwbVar);
                        e18Var.k0(objN3);
                    }
                    zy7 zy7Var3 = (zy7) objN3;
                    boolean zF3 = e18Var.f(anVar);
                    Object objN4 = e18Var.N();
                    if (zF3 || objN4 == lz1Var) {
                        yb ybVar = new yb(1, anVar, an.class, "removeUpload", "removeUpload(Ljava/util/UUID;)V", 0, 6);
                        e18Var.k0(ybVar);
                        objN4 = ybVar;
                    }
                    wp.a(str, bz7Var2, r22, zy7Var2, null, kdgVar, zy7Var3, (bz7) ((jm9) objN4), ((Boolean) wlgVar.getValue()).booleanValue() ? zy7Var : null, e18Var, 1572864, 16);
                } else {
                    e18Var.T();
                }
                return ieiVar;
            case 1:
                ep epVar = (ep) obj8;
                q2i q2iVar = (q2i) obj7;
                mxd mxdVar = (mxd) obj6;
                bz7 bz7Var3 = (bz7) obj5;
                mnc mncVar = (mnc) obj;
                ld4 ld4Var2 = (ld4) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                mncVar.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= ((e18) ld4Var2).f(mncVar) ? 4 : 2;
                }
                e18 e18Var2 = (e18) ld4Var2;
                if (e18Var2.Q(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    boolean z2 = ((Boolean) epVar.f.getValue()).booleanValue() && ((Boolean) epVar.g.getValue()).booleanValue();
                    boolean zF4 = e18Var2.f(epVar);
                    Object objN5 = e18Var2.N();
                    if (zF4 || objN5 == lz1Var) {
                        xn xnVar2 = new xn(0, epVar, ep.class, "refresh", "refresh()V", 0, 7);
                        e18Var2.k0(xnVar2);
                        objN5 = xnVar2;
                    }
                    iuj.c(z2, (zy7) ((jm9) objN5), ztj.i(b.c, ((g77) q2iVar).e, null), mxdVar, fd9.q0(-571927278, new ye(epVar, mncVar, mxdVar, 1), e18Var2), null, fd9.q0(974156624, new ye(epVar, mncVar, bz7Var3, 2), e18Var2), e18Var2, 1597440, 32);
                } else {
                    e18Var2.T();
                }
                return ieiVar;
            case 2:
                ArtifactFullScreenParams artifactFullScreenParams = (ArtifactFullScreenParams) obj8;
                t4f t4fVar = (t4f) obj6;
                xq0 xq0Var = (xq0) obj5;
                zy7 zy7Var4 = (zy7) obj7;
                mnc mncVar2 = (mnc) obj;
                ld4 ld4Var3 = (ld4) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                mncVar2.getClass();
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= ((e18) ld4Var3).f(mncVar2) ? 4 : 2;
                }
                e18 e18Var3 = (e18) ld4Var3;
                if (e18Var3.Q(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                    iqb iqbVarI = gb9.I(b.c, mncVar2);
                    int i7 = t4f.a0;
                    ar0.b(artifactFullScreenParams, t4fVar, xq0Var, zy7Var4, iqbVarI, e18Var3, 64);
                } else {
                    e18Var3.T();
                }
                return ieiVar;
            case 3:
                String str2 = (String) obj8;
                l45 l45Var = (l45) obj7;
                v4g v4gVar = (v4g) obj6;
                AssistantOverlayActivity assistantOverlayActivity = (AssistantOverlayActivity) obj5;
                ld4 ld4Var4 = (ld4) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                int i8 = AssistantOverlayActivity.d0;
                ((s64) obj).getClass();
                e18 e18Var4 = (e18) ld4Var4;
                if (e18Var4.Q(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    iqb iqbVarE = b.e(b.c(fqbVar, 1.0f), ((Configuration) e18Var4.j(w00.a)).screenHeightDp / 2.0f);
                    o5b o5bVarD = dw1.d(lja.G, false);
                    int iHashCode = Long.hashCode(e18Var4.T);
                    hyc hycVarL = e18Var4.l();
                    iqb iqbVarE2 = kxk.E(e18Var4, iqbVarE);
                    dd4.e.getClass();
                    re4 re4Var = cd4.b;
                    e18Var4.e0();
                    if (e18Var4.S) {
                        e18Var4.k(re4Var);
                    } else {
                        e18Var4.n0();
                    }
                    d4c.i0(e18Var4, cd4.f, o5bVarD);
                    d4c.i0(e18Var4, cd4.e, hycVarL);
                    d4c.i0(e18Var4, cd4.g, Integer.valueOf(iHashCode));
                    d4c.h0(e18Var4, cd4.h);
                    d4c.i0(e18Var4, cd4.d, iqbVarE2);
                    Object objN6 = e18Var4.N();
                    Object obj9 = objN6;
                    if (objN6 == lz1Var) {
                        jy0 jy0Var = new jy0();
                        e18Var4.k0(jy0Var);
                        obj9 = jy0Var;
                    }
                    jy0 jy0Var2 = (jy0) obj9;
                    boolean zH = e18Var4.h(jy0Var2);
                    Object objN7 = e18Var4.N();
                    Object obj10 = objN7;
                    if (zH || objN7 == lz1Var) {
                        zx0 zx0Var = new zx0(jy0Var2, 1);
                        e18Var4.k0(zx0Var);
                        obj10 = zx0Var;
                    }
                    fd9.d(ieiVar, (bz7) obj10, e18Var4);
                    j8.c(tda.a.a(jy0Var2), fd9.q0(1443535159, new ay0(jy0Var2, str2, l45Var, v4gVar, assistantOverlayActivity, 1), e18Var4), e18Var4, 48);
                    e18Var4.p(true);
                } else {
                    e18Var4.T();
                }
                return ieiVar;
            case 4:
                List<s51> list = (List) obj8;
                s51 s51Var = (s51) obj7;
                bz7 bz7Var4 = (bz7) obj5;
                nwb nwbVar2 = (nwb) obj6;
                ld4 ld4Var5 = (ld4) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                ((s64) obj).getClass();
                e18 e18Var5 = (e18) ld4Var5;
                if (e18Var5.Q(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    for (s51 s51Var2 : list) {
                        boolean zR = x44.r(s51Var2, s51Var);
                        String strJ = kvk.j(s51Var2, e18Var5);
                        ud0 ud0VarI = kvk.i(s51Var2);
                        ud0 ud0Var = ud0.d;
                        bpc bpcVarA = a.a(ud0VarI, e18Var5);
                        if (zR) {
                            e18Var5.a0(1864351981);
                            bpc bpcVarA2 = a.a(ud0.L, e18Var5);
                            e18Var5.p(false);
                            bpcVar = bpcVarA2;
                        } else {
                            e18Var5.a0(1960349367);
                            e18Var5.p(false);
                            bpcVar = null;
                        }
                        boolean zG = e18Var5.g(zR) | e18Var5.f(bz7Var4) | e18Var5.h(s51Var2);
                        Object objN8 = e18Var5.N();
                        if (zG || objN8 == lz1Var) {
                            z = zR;
                            bz7Var = bz7Var4;
                            objN8 = new gt0(z, bz7Var, s51Var2, nwbVar2, 1);
                            e18Var5.k0(objN8);
                        } else {
                            z = zR;
                            bz7Var = bz7Var4;
                        }
                        uuj.a(strJ, bpcVar, (zy7) objN8, null, bpcVarA, false, Boolean.valueOf(z), null, null, null, 0, 0, e18Var5, 32832, 4008);
                        bz7Var4 = bz7Var;
                    }
                } else {
                    e18Var5.T();
                }
                return ieiVar;
            case 5:
                pl3 pl3Var = (pl3) obj8;
                View view = (View) obj7;
                m1j m1jVar = (m1j) obj5;
                nwb nwbVar3 = (nwb) obj6;
                ld4 ld4Var6 = (ld4) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                ((s64) obj).getClass();
                e18 e18Var6 = (e18) ld4Var6;
                if (e18Var6.Q(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                    String strJ0 = d4c.j0(R.string.settings_voice_consent_per_chat_title, e18Var6);
                    uwc uwcVar = (uwc) nwbVar3.getValue();
                    gq6 gq6Var = uwc.J;
                    p6 p6Var = new p6(i3);
                    boolean zH2 = e18Var6.h(pl3Var) | e18Var6.h(view) | e18Var6.f(m1jVar);
                    Object objN9 = e18Var6.N();
                    if (zH2 || objN9 == lz1Var) {
                        objN9 = new gl1(1, pl3Var, m1jVar, view);
                        e18Var6.k0(objN9);
                    }
                    ikk.i(strJ0, uwcVar, gq6Var, p6Var, (bz7) objN9, null, null, e18Var6, 0, 96);
                } else {
                    e18Var6.T();
                }
                return ieiVar;
            case 6:
                mj1 mj1Var = (mj1) obj8;
                t4g t4gVar = (t4g) obj6;
                pl3 pl3Var2 = (pl3) obj5;
                zy7 zy7Var5 = (zy7) obj7;
                BellModelSheetDestination bellModelSheetDestination = (BellModelSheetDestination) obj;
                ((Integer) obj3).getClass();
                bellModelSheetDestination.getClass();
                e18 e18Var7 = (e18) ((ld4) obj2);
                e18Var7.a0(-2128478286);
                if (bellModelSheetDestination.equals(BellModelSheetDestination.Closed.INSTANCE)) {
                    e18Var7.a0(1400633291);
                    e18Var7.p(false);
                } else {
                    if (bellModelSheetDestination.equals(BellModelSheetDestination.SelectModel.INSTANCE)) {
                        e18Var7.a0(-1063193651);
                        kweVar = new kwe(d4c.j0(R.string.model_selector_sheet_title, e18Var7), null, null, null, null, false, fd9.q0(-1969133747, new ye(mj1Var, t4gVar, pl3Var2, 11), e18Var7), 254);
                        e18Var7.p(false);
                    } else if (bellModelSheetDestination.equals(BellModelSheetDestination.SelectEffort.INSTANCE)) {
                        e18Var7.a0(-1063147498);
                        kweVar = new kwe(d4c.j0(R.string.model_selector_effort_title, e18Var7), null, null, null, null, false, fd9.q0(1767849486, new ye(mj1Var, zy7Var5, pl3Var2, i6), e18Var7), 254);
                        e18Var7.p(false);
                    } else {
                        if (!bellModelSheetDestination.equals(BellModelSheetDestination.MoreModels.INSTANCE)) {
                            throw ebh.u(e18Var7, -1063196090, false);
                        }
                        e18Var7.a0(-1063118321);
                        kweVar = new kwe(d4c.j0(R.string.model_selector_more_models_title, e18Var7), null, null, null, null, false, fd9.q0(1209865423, new ii(mj1Var, i5, zy7Var5), e18Var7), 254);
                        e18Var7.p(false);
                    }
                    r8 = kweVar;
                }
                e18Var7.p(false);
                return r8;
            case 7:
                r1e r1eVar = (r1e) obj8;
                iwg iwgVar = (iwg) obj6;
                qi3 qi3Var = (qi3) obj5;
                zy7 zy7Var6 = (zy7) obj7;
                s64 s64Var = (s64) obj;
                ld4 ld4Var7 = (ld4) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                s64Var.getClass();
                if ((iIntValue7 & 6) == 0) {
                    iIntValue7 |= ((e18) ld4Var7).f(s64Var) ? 4 : 2;
                }
                e18 e18Var8 = (e18) ld4Var7;
                if (e18Var8.Q(iIntValue7 & 1, (iIntValue7 & 19) != 18)) {
                    es1.d(s64Var, r1eVar, iwgVar, qi3Var, zy7Var6, e18Var8, (iIntValue7 & 14) | 3072);
                } else {
                    e18Var8.T();
                }
                return ieiVar;
            case 8:
                t53 t53Var = (t53) obj8;
                f03 f03Var = (f03) obj7;
                t4g t4gVar2 = (t4g) obj6;
                hi4 hi4Var = (hi4) obj5;
                i4g i4gVar = (i4g) obj;
                ld4 ld4Var8 = (ld4) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                i4gVar.getClass();
                if ((iIntValue8 & 6) == 0) {
                    iIntValue8 |= ((e18) ld4Var8).f(i4gVar) ? 4 : 2;
                }
                e18 e18Var9 = (e18) ld4Var8;
                if (e18Var9.Q(iIntValue8 & 1, (iIntValue8 & 19) != 18)) {
                    qk4.a(t53Var, f03Var, t4gVar2, hi4Var, i4gVar, e18Var9, ((iIntValue8 << 12) & 57344) | 4160);
                } else {
                    e18Var9.T();
                }
                return ieiVar;
            case 9:
                hw2 hw2Var = (hw2) obj8;
                f03 f03Var2 = (f03) obj7;
                t4g t4gVar3 = (t4g) obj6;
                String str3 = (String) obj5;
                i4g i4gVar2 = (i4g) obj;
                ld4 ld4Var9 = (ld4) obj2;
                int iIntValue9 = ((Integer) obj3).intValue();
                i4gVar2.getClass();
                if ((iIntValue9 & 6) == 0) {
                    iIntValue9 |= ((e18) ld4Var9).f(i4gVar2) ? 4 : 2;
                }
                e18 e18Var10 = (e18) ld4Var9;
                if (e18Var10.Q(iIntValue9 & 1, (iIntValue9 & 19) != 18)) {
                    ae.b(hw2Var, f03Var2, t4gVar3, str3, i4gVar2, e18Var10, 72 | ((iIntValue9 << 12) & 57344));
                } else {
                    e18Var10.T();
                }
                return ieiVar;
            case 10:
                t53 t53Var2 = (t53) obj8;
                f03 f03Var3 = (f03) obj7;
                t4g t4gVar4 = (t4g) obj6;
                ChatOptionsBottomSheetDestination chatOptionsBottomSheetDestination = (ChatOptionsBottomSheetDestination) obj5;
                ld4 ld4Var10 = (ld4) obj2;
                int iIntValue10 = ((Integer) obj3).intValue();
                ((i4g) obj).getClass();
                e18 e18Var11 = (e18) ld4Var10;
                if (e18Var11.Q(iIntValue10 & 1, (iIntValue10 & 17) != 16)) {
                    c4b.b(t53Var2, f03Var3, t4gVar4, ((ChatOptionsBottomSheetDestination.McpServerTools) chatOptionsBottomSheetDestination).m641getServerIdowoRr7k(), e18Var11, 64);
                } else {
                    e18Var11.T();
                }
                return ieiVar;
            case 11:
                McpTool mcpTool2 = (McpTool) obj8;
                f03 f03Var4 = (f03) obj7;
                String str4 = (String) obj6;
                t4g t4gVar5 = (t4g) obj5;
                i4g i4gVar3 = (i4g) obj;
                ld4 ld4Var11 = (ld4) obj2;
                int iIntValue11 = ((Integer) obj3).intValue();
                i4gVar3.getClass();
                if ((iIntValue11 & 6) == 0) {
                    iIntValue11 |= ((e18) ld4Var11).f(i4gVar3) ? 4 : 2;
                }
                e18 e18Var12 = (e18) ld4Var11;
                if (e18Var12.Q(iIntValue11 & 1, (iIntValue11 & 19) != 18)) {
                    z4b z4bVarK = f03Var4.i.E.k(str4, mcpTool2);
                    boolean zH3 = e18Var12.h(f03Var4) | e18Var12.f(str4 != null ? ChatId.m978boximpl(str4) : null) | e18Var12.f(mcpTool2) | e18Var12.h(t4gVar5);
                    Object objN10 = e18Var12.N();
                    if (zH3 || objN10 == lz1Var) {
                        mcpTool = mcpTool2;
                        fe feVar = new fe(f03Var4, str4, mcpTool, t4gVar5, 6);
                        e18Var12.k0(feVar);
                        obj4 = feVar;
                    } else {
                        mcpTool = mcpTool2;
                        obj4 = objN10;
                    }
                    kpk.c(mcpTool, z4bVarK, (bz7) obj4, gb9.I(fqbVar, i4gVar3.a), e18Var12, 0);
                } else {
                    e18Var12.T();
                }
                return ieiVar;
            case 12:
                ukg ukgVar = (ukg) obj8;
                vm3 vm3Var = (vm3) obj7;
                ukg ukgVar2 = (ukg) obj6;
                ukg ukgVar3 = (ukg) obj5;
                r64 r64Var = (r64) obj;
                ld4 ld4Var12 = (ld4) obj2;
                int iIntValue12 = ((Integer) obj3).intValue();
                r64Var.getClass();
                if ((iIntValue12 & 6) == 0) {
                    iIntValue12 |= (iIntValue12 & 8) == 0 ? ((e18) ld4Var12).f(r64Var) : ((e18) ld4Var12).h(r64Var) ? 4 : 2;
                }
                e18 e18Var13 = (e18) ld4Var12;
                if (e18Var13.Q(iIntValue12 & 1, (iIntValue12 & 19) != 18)) {
                    o68 o68Var = o68.a;
                    q68 q68VarD = ovj.d(o68Var);
                    o46 o46Var = o46.a;
                    dlk.b(r64Var, ukgVar, vm3Var, q68VarD.d(new km8(o46Var)), e18Var13, iIntValue12 & 14);
                    gwj.c(new km8(new n46(vm3Var.c)), e18Var13, 0);
                    ctk.c(ovj.d(o68Var).d(new km8(o46Var)), 1, fd9.q0(-819433517, new ye(ukgVar2, vm3Var, ukgVar3, 20), e18Var13), e18Var13, 3072);
                } else {
                    e18Var13.T();
                }
                return ieiVar;
            case 13:
                CodeRemoteBottomSheetDestination codeRemoteBottomSheetDestination = (CodeRemoteBottomSheetDestination) obj8;
                i iVar = (i) obj7;
                bz7 bz7Var5 = (bz7) obj6;
                t4g t4gVar6 = (t4g) obj5;
                i4g i4gVar4 = (i4g) obj;
                ld4 ld4Var13 = (ld4) obj2;
                int iIntValue13 = ((Integer) obj3).intValue();
                i4gVar4.getClass();
                if ((iIntValue13 & 6) == 0) {
                    iIntValue13 |= ((e18) ld4Var13).f(i4gVar4) ? 4 : 2;
                }
                e18 e18Var14 = (e18) ld4Var13;
                if (e18Var14.Q(iIntValue13 & 1, (iIntValue13 & 19) != 18)) {
                    PermissionMode permissionMode = ((CodeRemoteBottomSheetDestination.PermissionModeSelection) codeRemoteBottomSheetDestination).a;
                    s71 s71VarN0 = iVar.n0();
                    boolean zF5 = e18Var14.f(bz7Var5) | e18Var14.h(t4gVar6);
                    Object objN11 = e18Var14.N();
                    if (zF5 || objN11 == lz1Var) {
                        objN11 = new ty3(bz7Var5, t4gVar6, 2);
                        e18Var14.k0(objN11);
                    }
                    bz7 bz7Var6 = (bz7) objN11;
                    boolean zH4 = e18Var14.h(t4gVar6) | e18Var14.f(iVar);
                    Object objN12 = e18Var14.N();
                    if (zH4 || objN12 == lz1Var) {
                        objN12 = new wy3(t4gVar6, iVar, false ? 1 : 0);
                        e18Var14.k0(objN12);
                    }
                    etj.g(permissionMode, s71VarN0, bz7Var6, (zy7) objN12, i4gVar4, e18Var14, (iIntValue13 << 12) & 57344);
                } else {
                    e18Var14.T();
                }
                return ieiVar;
            case 14:
                b55 b55Var = (b55) obj8;
                koi koiVar = b55Var.b;
                i iVar2 = (i) obj7;
                t4g t4gVar7 = (t4g) obj6;
                bz7 bz7Var7 = (bz7) obj5;
                i4g i4gVar5 = (i4g) obj;
                ld4 ld4Var14 = (ld4) obj2;
                int iIntValue14 = ((Integer) obj3).intValue();
                i4gVar5.getClass();
                if ((iIntValue14 & 6) == 0) {
                    iIntValue14 |= ((e18) ld4Var14).f(i4gVar5) ? 4 : 2;
                }
                e18 e18Var15 = (e18) ld4Var14;
                if (e18Var15.Q(iIntValue14 & 1, (iIntValue14 & 19) != 18)) {
                    boolean zF6 = e18Var15.f(b55Var);
                    Object objN13 = e18Var15.N();
                    if (zF6 || objN13 == lz1Var) {
                        objN13 = new kk0(b55Var, r8, i4);
                        e18Var15.k0(objN13);
                    }
                    fd9.i(e18Var15, (pz7) objN13, ieiVar);
                    int size = iVar2.W1.size();
                    int max_per_message_upload_count = amk.c(iVar2.r).getMax_per_message_upload_count();
                    boolean z3 = iVar2.f0;
                    List listF = koiVar.f();
                    boolean zJ = koiVar.j();
                    boolean zB = b55Var.d.b();
                    boolean zH5 = e18Var15.h(t4gVar7) | e18Var15.f(bz7Var7);
                    Object objN14 = e18Var15.N();
                    if (zH5 || objN14 == lz1Var) {
                        objN14 = new ty3(t4gVar7, bz7Var7, 1);
                        e18Var15.k0(objN14);
                    }
                    bz7 bz7Var8 = (bz7) objN14;
                    boolean zH6 = e18Var15.h(t4gVar7);
                    Object objN15 = e18Var15.N();
                    if (zH6 || objN15 == lz1Var) {
                        objN15 = new ue(t4gVar7, i3);
                        e18Var15.k0(objN15);
                    }
                    y45.a(size, max_per_message_upload_count, z3, listF, zJ, zB, bz7Var8, (zy7) objN15, i4gVar5, null, e18Var15, (iIntValue14 << 24) & 234881024);
                } else {
                    e18Var15.T();
                }
                return ieiVar;
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                leb lebVar = (leb) obj8;
                pz7 pz7Var = (pz7) obj7;
                i iVar3 = (i) obj6;
                iqb iqbVar = (iqb) obj5;
                px9 px9Var = (px9) obj;
                ld4 ld4Var15 = (ld4) obj2;
                int iIntValue15 = ((Integer) obj3).intValue();
                px9Var.getClass();
                if ((iIntValue15 & 6) == 0) {
                    iIntValue15 |= ((e18) ld4Var15).f(px9Var) ? 4 : 2;
                }
                e18 e18Var16 = (e18) ld4Var15;
                if (e18Var16.Q(iIntValue15 & 1, (iIntValue15 & 19) != 18)) {
                    Object objN16 = e18Var16.N();
                    if (objN16 == lz1Var) {
                        objN16 = new i04(11);
                        e18Var16.k0(objN16);
                    }
                    bz7 bz7Var9 = (bz7) objN16;
                    boolean zF7 = e18Var16.f(iVar3);
                    Object objN17 = e18Var16.N();
                    if (zF7 || objN17 == lz1Var) {
                        objN17 = new ub2(1, iVar3, i.class, "attachmentPreviewUrl", "attachmentPreviewUrl(Lcom/anthropic/claude/sessions/types/SessionFileAttachment;)Ljava/lang/String;", 0, 19);
                        e18Var16.k0(objN17);
                    }
                    ttj.c(lebVar, true, bz7Var9, pz7Var, (bz7) ((jm9) objN17), iqbVar.B(g34.j(px9Var, true, false)), null, e18Var16, 432, 64);
                } else {
                    e18Var16.T();
                }
                return ieiVar;
            case 16:
                uj4 uj4Var = (uj4) obj8;
                ybg ybgVar = (ybg) obj7;
                DirectoryServer directoryServer = (DirectoryServer) obj6;
                hi4 hi4Var2 = (hi4) obj5;
                mnc mncVar3 = (mnc) obj;
                ld4 ld4Var16 = (ld4) obj2;
                int iIntValue16 = ((Integer) obj3).intValue();
                mncVar3.getClass();
                if ((iIntValue16 & 6) == 0) {
                    iIntValue16 |= ((e18) ld4Var16).f(mncVar3) ? 4 : 2;
                }
                e18 e18Var17 = (e18) ld4Var16;
                if (e18Var17.Q(iIntValue16 & 1, (iIntValue16 & 19) != 18)) {
                    zni.g(uj4Var.f, ybgVar, e18Var17, 48);
                    wi4.b(directoryServer, uj4Var, hi4Var2, gb9.I(b.c, mncVar3), e18Var17, 576);
                } else {
                    e18Var17.T();
                }
                return ieiVar;
            case g.MAX_FIELD_NUMBER /* 17 */:
                pz7 pz7Var2 = (pz7) obj8;
                cp4 cp4Var = (cp4) obj6;
                rz7 rz7Var = (rz7) obj5;
                zy7 zy7Var7 = (zy7) obj7;
                yo4 yo4Var = (yo4) obj;
                ld4 ld4Var17 = (ld4) obj2;
                int iIntValue17 = ((Integer) obj3).intValue();
                if ((iIntValue17 & 6) == 0) {
                    iIntValue17 |= ((e18) ld4Var17).f(yo4Var) ? 4 : 2;
                }
                e18 e18Var18 = (e18) ld4Var17;
                if (e18Var18.Q(iIntValue17 & 1, (iIntValue17 & 19) != 18)) {
                    String str5 = (String) pz7Var2.invoke(e18Var18, 0);
                    if (bsg.I0(str5)) {
                        e39.c("Label must not be blank");
                    }
                    cp4Var.getClass();
                    xik.a.j(str5, Boolean.TRUE, yo4Var, rz7Var, zy7Var7, e18Var18, Integer.valueOf((iIntValue17 << 9) & 7168));
                } else {
                    e18Var18.T();
                }
                return ieiVar;
            case g.AVG_FIELD_NUMBER /* 18 */:
                return d(obj, obj2, obj3);
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return e(obj, obj2, obj3);
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                return f(obj, obj2, obj3);
            case 21:
                return g(obj, obj2, obj3);
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return h(obj, obj2, obj3);
            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return n(obj, obj2, obj3);
            case 24:
                return o(obj, obj2, obj3);
            case BuildConfig.VERSION_CODE /* 25 */:
                return p(obj, obj2, obj3);
            case 26:
                return q(obj, obj2, obj3);
            case 27:
                return s(obj, obj2, obj3);
            case 28:
                return r(obj, obj2, obj3);
            default:
                x0a x0aVar = (x0a) obj8;
                mnc mncVar4 = (mnc) obj7;
                pz7 pz7Var3 = (pz7) obj6;
                ybg ybgVar2 = (ybg) obj5;
                i4g i4gVar6 = (i4g) obj;
                ld4 ld4Var18 = (ld4) obj2;
                int iIntValue18 = ((Integer) obj3).intValue();
                i4gVar6.getClass();
                if ((iIntValue18 & 6) == 0) {
                    iIntValue18 |= ((e18) ld4Var18).f(i4gVar6) ? 4 : 2;
                }
                e18 e18Var19 = (e18) ld4Var18;
                if (e18Var19.Q(iIntValue18 & 1, (iIntValue18 & 19) != 18)) {
                    o5b o5bVarD2 = dw1.d(lja.G, false);
                    int iHashCode2 = Long.hashCode(e18Var19.T);
                    hyc hycVarL2 = e18Var19.l();
                    iqb iqbVarE3 = kxk.E(e18Var19, fqbVar);
                    dd4.e.getClass();
                    re4 re4Var2 = cd4.b;
                    e18Var19.e0();
                    if (e18Var19.S) {
                        e18Var19.k(re4Var2);
                    } else {
                        e18Var19.n0();
                    }
                    d4c.i0(e18Var19, cd4.f, o5bVarD2);
                    d4c.i0(e18Var19, cd4.e, hycVarL2);
                    d4c.i0(e18Var19, cd4.g, Integer.valueOf(iHashCode2));
                    d4c.h0(e18Var19, cd4.h);
                    d4c.i0(e18Var19, cd4.d, iqbVarE3);
                    boolean zF8 = ((iIntValue18 & 14) == 4) | e18Var19.f(pz7Var3);
                    Object objN18 = e18Var19.N();
                    if (zF8 || objN18 == lz1Var) {
                        objN18 = new f25(pz7Var3, 21, i4gVar6);
                        e18Var19.k0(objN18);
                    }
                    knk.h(null, x0aVar, mncVar4, false, null, null, null, false, null, (bz7) objN18, e18Var19, 0, 505);
                    if (ybgVar2 != null) {
                        e18Var19.a0(-116330256);
                        iv1.c(ybgVar2, nw1.a.a(fqbVar, lja.M), e18Var19, 0, 0);
                        e18Var19.p(false);
                    } else {
                        e18Var19.a0(-116148627);
                        e18Var19.p(false);
                    }
                    e18Var19.p(true);
                } else {
                    e18Var19.T();
                }
                return ieiVar;
        }
    }

    public /* synthetic */ bn(int i, nwb nwbVar, Object obj, Object obj2, Object obj3) {
        this.E = i;
        this.F = obj;
        this.G = obj2;
        this.I = obj3;
        this.H = nwbVar;
    }

    public /* synthetic */ bn(WebhookRecord webhookRecord, rz7 rz7Var, zy7 zy7Var, nwb nwbVar) {
        this.E = 22;
        this.F = webhookRecord;
        this.I = rz7Var;
        this.G = zy7Var;
        this.H = nwbVar;
    }

    public /* synthetic */ bn(Object obj, Object obj2, Object obj3, zy7 zy7Var, int i) {
        this.E = i;
        this.F = obj;
        this.H = obj2;
        this.I = obj3;
        this.G = zy7Var;
    }

    public /* synthetic */ bn(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.E = i;
        this.F = obj;
        this.G = obj2;
        this.H = obj3;
        this.I = obj4;
    }

    public /* synthetic */ bn(String str, nwb nwbVar, List list, fk0 fk0Var) {
        this.E = 27;
        this.F = str;
        this.H = nwbVar;
        this.G = list;
        this.I = fk0Var;
    }
}
