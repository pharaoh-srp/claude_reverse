package defpackage;

import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.b;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.R;
import com.anthropic.claude.sessions.types.GitHubRepo;
import com.anthropic.claude.tool.model.CalendarCreatePreviewData;
import com.anthropic.claude.tool.model.CalendarDeletePreviewData;
import com.anthropic.claude.tool.model.CalendarSearchPreviewData;
import com.anthropic.claude.tool.model.CalendarUpdatePreviewData;
import com.anthropic.claude.tool.model.LocationPreviewData;
import com.anthropic.claude.tool.model.MobileAppToolPreviewInfo;
import com.anthropic.claude.tool.model.PreviewData;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class lmb implements rz7 {
    public final /* synthetic */ int E = 0;
    public final /* synthetic */ boolean F;
    public final /* synthetic */ boolean G;
    public final /* synthetic */ boolean H;
    public final /* synthetic */ Object I;
    public final /* synthetic */ Object J;
    public final /* synthetic */ Object K;

    public /* synthetic */ lmb(u3c u3cVar, kdg kdgVar, bt7 bt7Var, boolean z, boolean z2, boolean z3) {
        this.I = u3cVar;
        this.J = kdgVar;
        this.K = bt7Var;
        this.F = z;
        this.G = z2;
        this.H = z3;
    }

    @Override // defpackage.rz7
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        i4g i4gVar;
        e18 e18Var;
        String strK0;
        Object ty4Var;
        int i = this.E;
        iei ieiVar = iei.a;
        lz1 lz1Var = jd4.a;
        fqb fqbVar = fqb.E;
        Object obj4 = this.K;
        Object obj5 = this.J;
        Object obj6 = this.I;
        switch (i) {
            case 0:
                final MobileAppToolPreviewInfo mobileAppToolPreviewInfo = (MobileAppToolPreviewInfo) obj6;
                final eed eedVar = (eed) obj5;
                final t4g t4gVar = (t4g) obj4;
                i4g i4gVar2 = (i4g) obj;
                ld4 ld4Var = (ld4) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                i4gVar2.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= ((e18) ld4Var).f(i4gVar2) ? 4 : 2;
                }
                e18 e18Var2 = (e18) ld4Var;
                if (!e18Var2.Q(iIntValue & 1, (iIntValue & 19) != 18)) {
                    e18Var2.T();
                } else {
                    qnc qncVarD = gb9.d(MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, i4gVar2.b, 7);
                    iqb iqbVarC = b.c(fqbVar, 1.0f);
                    boolean zF = e18Var2.f(mobileAppToolPreviewInfo);
                    final boolean z = this.F;
                    boolean zG = zF | e18Var2.g(z);
                    final boolean z2 = this.G;
                    boolean zG2 = zG | e18Var2.g(z2) | e18Var2.f(eedVar);
                    final boolean z3 = this.H;
                    boolean zG3 = e18Var2.g(z3) | zG2 | e18Var2.h(t4gVar);
                    Object objN = e18Var2.N();
                    if (zG3 || objN == lz1Var) {
                        bz7 bz7Var = new bz7() { // from class: mmb
                            @Override // defpackage.bz7
                            public final Object invoke(Object obj7) {
                                j0a j0aVar = (j0a) obj7;
                                j0aVar.getClass();
                                MobileAppToolPreviewInfo mobileAppToolPreviewInfo2 = mobileAppToolPreviewInfo;
                                j0aVar.U("tool_card", "tool_card", new ta4(-216702180, true, new lca(6, mobileAppToolPreviewInfo2)));
                                boolean z4 = z;
                                eed eedVar2 = eedVar;
                                if (z4 && z2) {
                                    j0aVar.U("calendar_selection_row", "calendar_selection_row", new ta4(664932407, true, new tw(eedVar2, z3, t4gVar, 8)));
                                }
                                j0aVar.getClass();
                                eedVar2.getClass();
                                mobileAppToolPreviewInfo2.getClass();
                                j0aVar.U("top_spacer", "top_spacer", qpk.a);
                                PreviewData previewData = mobileAppToolPreviewInfo2.getPreviewData();
                                if (previewData instanceof CalendarCreatePreviewData) {
                                    CalendarCreatePreviewData calendarCreatePreviewData = (CalendarCreatePreviewData) previewData;
                                    ud0 ud0Var = ud0.d;
                                    nvj.e(j0aVar, eedVar2, R.drawable.anthropicon_create, new fp(16, calendarCreatePreviewData), calendarCreatePreviewData.getInput().getNew_events(), new c32(13), 24.0f, jwj.a);
                                } else if (previewData instanceof CalendarDeletePreviewData) {
                                    CalendarDeletePreviewData calendarDeletePreviewData = (CalendarDeletePreviewData) previewData;
                                    ud0 ud0Var2 = ud0.d;
                                    nvj.e(j0aVar, eedVar2, R.drawable.anthropicon_trash, new fp(15, calendarDeletePreviewData), calendarDeletePreviewData.getEventsToDelete(), new c32(12), 24.0f, jwj.b);
                                } else if (previewData instanceof CalendarUpdatePreviewData) {
                                    CalendarUpdatePreviewData calendarUpdatePreviewData = (CalendarUpdatePreviewData) previewData;
                                    ud0 ud0Var3 = ud0.d;
                                    nvj.e(j0aVar, eedVar2, R.drawable.anthropicon_edit, new fp(14, calendarUpdatePreviewData), calendarUpdatePreviewData.getEventsToUpdate(), new c32(11), 24.0f, jwj.c);
                                } else if (x44.r(previewData, CalendarSearchPreviewData.INSTANCE)) {
                                    j0a.V(j0aVar, null, null, new ta4(2035180260, true, new q72(1, 24.0f)), 3);
                                } else if (x44.r(previewData, LocationPreviewData.INSTANCE)) {
                                    j0a.V(j0aVar, null, null, new ta4(-113220571, true, new q72(2, 24.0f)), 3);
                                }
                                return iei.a;
                            }
                        };
                        e18Var2.k0(bz7Var);
                        objN = bz7Var;
                    }
                    knk.h(iqbVarC, null, qncVarD, false, null, null, null, false, null, (bz7) objN, e18Var2, 6, 506);
                }
                break;
            default:
                u3c u3cVar = (u3c) obj6;
                kdg kdgVar = u3cVar.m;
                List list = (List) obj5;
                bt7 bt7Var = (bt7) obj4;
                i4g i4gVar3 = (i4g) obj;
                ld4 ld4Var2 = (ld4) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                i4gVar3.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= ((e18) ld4Var2).f(i4gVar3) ? 4 : 2;
                }
                int i2 = iIntValue2;
                e18 e18Var3 = (e18) ld4Var2;
                if (!e18Var3.Q(i2 & 1, (i2 & 19) != 18)) {
                    e18Var3.T();
                } else {
                    FillElement fillElement = b.c;
                    q64 q64VarA = p64.a(ko0.c, lja.S, e18Var3, 0);
                    int iHashCode = Long.hashCode(e18Var3.T);
                    hyc hycVarL = e18Var3.l();
                    iqb iqbVarE = kxk.E(e18Var3, fillElement);
                    dd4.e.getClass();
                    re4 re4Var = cd4.b;
                    e18Var3.e0();
                    if (e18Var3.S) {
                        e18Var3.k(re4Var);
                    } else {
                        e18Var3.n0();
                    }
                    d4c.i0(e18Var3, cd4.f, q64VarA);
                    d4c.i0(e18Var3, cd4.e, hycVarL);
                    d4c.i0(e18Var3, cd4.g, Integer.valueOf(iHashCode));
                    d4c.h0(e18Var3, cd4.h);
                    d4c.i0(e18Var3, cd4.d, iqbVarE);
                    if (kdgVar.isEmpty()) {
                        i4gVar = i4gVar3;
                        e18Var = e18Var3;
                        e18Var.a0(-2036520598);
                        e18Var.p(false);
                    } else {
                        e18Var3.a0(-2036747394);
                        boolean zF2 = e18Var3.f(u3cVar);
                        Object objN2 = e18Var3.N();
                        if (zF2 || objN2 == lz1Var) {
                            i4gVar = i4gVar3;
                            e18Var = e18Var3;
                            ty4Var = new ty4(1, u3cVar, u3c.class, "removeUpload", "removeUpload(Ljava/util/UUID;)V", 0, 26);
                            e18Var.k0(ty4Var);
                        } else {
                            i4gVar = i4gVar3;
                            ty4Var = objN2;
                            e18Var = e18Var3;
                        }
                        q22.a(0, e18Var, (bz7) ((jm9) ty4Var), ttj.m(fqbVar, i4gVar), kdgVar);
                        e18Var.p(false);
                    }
                    yih yihVar = u3cVar.a;
                    lhf lhfVar = (lhf) w44.N0(list);
                    String strC = null;
                    if (lhfVar != null) {
                        if (this.F || this.G || !this.H) {
                            lhfVar = null;
                        }
                        if (lhfVar != null) {
                            GitHubRepo gitHubRepo = lhfVar.a;
                            strC = ij0.C(gitHubRepo.getOwner().getLogin(), "/", gitHubRepo.getName());
                        }
                    }
                    int size = list.size();
                    if (strC == null) {
                        strK0 = vb7.n(e18Var, -1951756320, R.string.ccr_input_placeholder_new_session, e18Var, false);
                    } else if (size > 1) {
                        e18Var.a0(-1951753710);
                        int i3 = size - 1;
                        strK0 = d4c.f0(R.plurals.ccr_sheet_placeholder_repo_n_more, i3, new Object[]{strC, Integer.valueOf(i3)}, e18Var);
                        e18Var.p(false);
                    } else {
                        e18Var.a0(-1951749882);
                        strK0 = d4c.k0(R.string.ccr_sheet_placeholder_repo, new Object[]{strC}, e18Var);
                        e18Var.p(false);
                    }
                    t3c.e(yihVar, strK0, bt7Var, i4gVar, new hw9(1.0f, true), e18Var, ((i2 << 9) & 7168) | 384, 0);
                    e18Var.p(true);
                }
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ lmb(eed eedVar, t4g t4gVar, MobileAppToolPreviewInfo mobileAppToolPreviewInfo, boolean z, boolean z2, boolean z3) {
        this.I = mobileAppToolPreviewInfo;
        this.F = z;
        this.G = z2;
        this.J = eedVar;
        this.H = z3;
        this.K = t4gVar;
    }
}
