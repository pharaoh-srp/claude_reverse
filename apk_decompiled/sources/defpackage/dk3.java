package defpackage;

import androidx.compose.foundation.b;
import com.anthropic.claude.analytics.events.DrawerEvents$DrawerItem;
import com.anthropic.claude.analytics.events.DrawerEvents$DrawerItemSelected;
import com.anthropic.claude.api.chat.ChatConversationWithProjectReference;
import com.anthropic.claude.api.project.Project;
import com.anthropic.claude.app.ClaudeAppDestination;
import com.pvporbit.freetype.FreeTypeConstants;

/* JADX INFO: loaded from: classes.dex */
public abstract class dk3 {
    public static final void a(final un8 un8Var, final of6 of6Var, final zqc zqcVar, tg7 tg7Var, sl slVar, qi3 qi3Var, z93 z93Var, ld4 ld4Var, int i) {
        e18 e18Var;
        tg7 tg7Var2;
        sl slVar2;
        qi3 qi3Var2;
        z93 z93Var2;
        sl slVar3;
        int i2;
        z93 z93Var3;
        qi3 qi3Var3;
        tg7 tg7Var3;
        qi3 qi3Var4;
        l45 l45Var;
        Object uj3Var;
        int i3;
        Object uj3Var2;
        of6 of6Var2;
        zqc zqcVar2;
        Object uj3Var3;
        of6 of6Var3;
        zqc zqcVar3;
        tg7 tg7Var4;
        final int i4;
        boolean z;
        final l45 l45Var2;
        int i5;
        z93 z93Var4;
        z93 z93Var5;
        qi3 qi3Var5;
        un8Var.getClass();
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(-604069657);
        int i6 = 2;
        int i7 = i | (e18Var2.f(un8Var) ? 4 : 2) | (e18Var2.f(of6Var) ? 32 : 16) | (e18Var2.f(zqcVar) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC) | 599040;
        if (e18Var2.Q(i7 & 1, (599187 & i7) != 599186)) {
            e18Var2.V();
            int i8 = i & 1;
            tp4 tp4Var = null;
            lz1 lz1Var = jd4.a;
            if (i8 == 0 || e18Var2.A()) {
                m7f m7fVarN = sq6.n(e18Var2, -1168520582, e18Var2, -1633490746);
                boolean zF = e18Var2.f(null) | e18Var2.f(m7fVarN);
                Object objN = e18Var2.N();
                if (zF || objN == lz1Var) {
                    objN = m7fVarN.a(jce.a.b(tg7.class), null, null);
                    e18Var2.k0(objN);
                }
                e18Var2.p(false);
                e18Var2.p(false);
                tg7 tg7Var5 = (tg7) objN;
                m7f m7fVarN2 = sq6.n(e18Var2, -1168520582, e18Var2, -1633490746);
                boolean zF2 = e18Var2.f(null) | e18Var2.f(m7fVarN2);
                Object objN2 = e18Var2.N();
                if (zF2 || objN2 == lz1Var) {
                    objN2 = m7fVarN2.a(jce.a.b(sl.class), null, null);
                    e18Var2.k0(objN2);
                }
                e18Var2.p(false);
                e18Var2.p(false);
                slVar3 = (sl) objN2;
                m7f m7fVarN3 = sq6.n(e18Var2, -1168520582, e18Var2, -1633490746);
                boolean zF3 = e18Var2.f(null) | e18Var2.f(m7fVarN3);
                Object objN3 = e18Var2.N();
                if (zF3 || objN3 == lz1Var) {
                    objN3 = m7fVarN3.a(jce.a.b(qi3.class), null, null);
                    e18Var2.k0(objN3);
                }
                e18Var2.p(false);
                e18Var2.p(false);
                qi3 qi3Var6 = (qi3) objN3;
                m7f m7fVarN4 = sq6.n(e18Var2, -1168520582, e18Var2, -1633490746);
                boolean zF4 = e18Var2.f(null) | e18Var2.f(m7fVarN4);
                Object objN4 = e18Var2.N();
                if (zF4 || objN4 == lz1Var) {
                    objN4 = m7fVarN4.a(jce.a.b(z93.class), null, null);
                    e18Var2.k0(objN4);
                }
                e18Var2.p(false);
                e18Var2.p(false);
                i2 = i7 & (-4193281);
                z93Var3 = (z93) objN4;
                qi3Var3 = qi3Var6;
                tg7Var3 = tg7Var5;
            } else {
                e18Var2.T();
                i2 = i7 & (-4193281);
                tg7Var3 = tg7Var;
                slVar3 = slVar;
                qi3Var3 = qi3Var;
                z93Var3 = z93Var;
            }
            int i9 = i2;
            e18Var2.q();
            Object objN5 = e18Var2.N();
            if (objN5 == lz1Var) {
                objN5 = fd9.O(im6.E, e18Var2);
                e18Var2.k0(objN5);
            }
            l45 l45Var3 = (l45) objN5;
            boolean zH = e18Var2.h(slVar3);
            Object objN6 = e18Var2.N();
            if (zH || objN6 == lz1Var) {
                objN6 = new fj(slVar3, tp4Var, i6);
                e18Var2.k0(objN6);
            }
            fd9.i(e18Var2, (pz7) objN6, iei.a);
            pwf pwfVar = new pwf();
            lsc lscVar = zqcVar.F;
            ie3 ie3Var = (ie3) w44.V0(((te3) lscVar.getValue()).b);
            ClaudeAppDestination.Detail detail = ie3Var != null ? (ClaudeAppDestination.Detail) ie3Var.a : null;
            Object bhfVar = detail instanceof ClaudeAppDestination.Detail.Chat ? new bhf(((ClaudeAppDestination.Detail.Chat) detail).getParams().m591getChatIdRjYBDck()) : detail instanceof ClaudeAppDestination.Detail.ProjectDetails ? new fhf(((ClaudeAppDestination.Detail.ProjectDetails) detail).getParams().m789getProjectId5pmjbU()) : null;
            if (bhfVar != null) {
                pwfVar.add(bhfVar);
            }
            if (bhfVar == null || ((te3) lscVar.getValue()).d == ye3.F) {
                ie3 ie3Var2 = (ie3) w44.V0(((te3) lscVar.getValue()).a);
                ClaudeAppDestination.List list = ie3Var2 != null ? (ClaudeAppDestination.List) ie3Var2.a : null;
                Object fhfVar = list instanceof ClaudeAppDestination.List.AllChatsList ? zgf.a : list instanceof ClaudeAppDestination.List.AllProjectsList ? ahf.a : list instanceof ClaudeAppDestination.List.ArtifactGallery ? ygf.a : ((list instanceof ClaudeAppDestination.List.CodeRemote) || (list instanceof ClaudeAppDestination.List.CodeProject)) ? chf.a : list instanceof ClaudeAppDestination.List.CoworkRemote ? ehf.a : ((list instanceof ClaudeAppDestination.List.AgentChat) || (list instanceof ClaudeAppDestination.List.AgentChatTasks)) ? xgf.a : list instanceof ClaudeAppDestination.List.Conway ? dhf.a : list instanceof ClaudeAppDestination.List.Tasks ? ghf.a : list instanceof ClaudeAppDestination.List.ProjectDetails ? new fhf(((ClaudeAppDestination.List.ProjectDetails) list).getParams().m789getProjectId5pmjbU()) : null;
                if (fhfVar != null) {
                    pwfVar.add(fhfVar);
                }
            }
            pwf pwfVarK = sf5.k(pwfVar);
            boolean z2 = un8Var.p() && x44.r((Boolean) tg7Var3.c.getValue(), Boolean.FALSE);
            vm vmVar = (vm) slVar3;
            String str = (String) ((lsc) vmVar.w.b).getValue();
            Object objN7 = e18Var2.N();
            if (objN7 == lz1Var) {
                objN7 = vb7.f(e18Var2);
            }
            zub zubVar = (zub) objN7;
            Object objN8 = e18Var2.N();
            if (objN8 == lz1Var) {
                objN8 = new oob(19);
                e18Var2.k0(objN8);
            }
            iqb iqbVarB = b.b(fqb.E, zubVar, null, false, null, null, (zy7) objN8, 28);
            int i10 = i9 & 112;
            int i11 = i9 & 896;
            boolean zH2 = e18Var2.h(qi3Var3) | e18Var2.h(l45Var3) | (i10 == 32) | (i11 == 256);
            Object objN9 = e18Var2.N();
            if (zH2 || objN9 == lz1Var) {
                qi3Var4 = qi3Var3;
                l45Var = l45Var3;
                i3 = i11;
                uj3Var = new uj3(zqcVar, qi3Var4, l45Var, of6Var, 5);
                e18Var2.k0(uj3Var);
            } else {
                qi3Var4 = qi3Var3;
                l45Var = l45Var3;
                uj3Var = objN9;
                i3 = i11;
            }
            zy7 zy7Var = (zy7) uj3Var;
            boolean zH3 = e18Var2.h(qi3Var4) | e18Var2.h(l45Var) | (i10 == 32) | (i3 == 256);
            Object objN10 = e18Var2.N();
            if (zH3 || objN10 == lz1Var) {
                uj3 uj3Var4 = new uj3(zqcVar, qi3Var4, l45Var, of6Var, 6);
                e18Var2.k0(uj3Var4);
                objN10 = uj3Var4;
            }
            zy7 zy7Var2 = (zy7) objN10;
            boolean zH4 = e18Var2.h(qi3Var4) | e18Var2.h(l45Var) | (i10 == 32) | (i3 == 256);
            Object objN11 = e18Var2.N();
            if (zH4 || objN11 == lz1Var) {
                of6Var2 = of6Var;
                zqcVar2 = zqcVar;
                uj3Var2 = new uj3(zqcVar2, qi3Var4, l45Var, of6Var2, 7);
                e18Var2.k0(uj3Var2);
            } else {
                of6Var2 = of6Var;
                uj3Var2 = objN11;
                zqcVar2 = zqcVar;
            }
            zy7 zy7Var3 = (zy7) uj3Var2;
            boolean zH5 = e18Var2.h(l45Var) | (i10 == 32) | (i3 == 256);
            Object objN12 = e18Var2.N();
            if (zH5 || objN12 == lz1Var) {
                objN12 = new ka1(l45Var, zqcVar2, of6Var2, 10);
                e18Var2.k0(objN12);
            }
            zy7 zy7Var4 = (zy7) objN12;
            boolean zH6 = e18Var2.h(qi3Var4) | e18Var2.h(l45Var) | (i10 == 32) | (i3 == 256) | e18Var2.h(z93Var3);
            Object objN13 = e18Var2.N();
            if (zH6 || objN13 == lz1Var) {
                of6 of6Var4 = of6Var2;
                l45 l45Var4 = l45Var;
                qi3 qi3Var7 = qi3Var4;
                ak3 ak3Var = new ak3(zqcVar2, z93Var3, qi3Var7, l45Var4, of6Var4);
                qi3Var4 = qi3Var7;
                l45Var = l45Var4;
                of6Var2 = of6Var4;
                e18Var2.k0(ak3Var);
                objN13 = ak3Var;
            }
            pz7 pz7Var = (pz7) objN13;
            boolean zH7 = e18Var2.h(qi3Var4) | e18Var2.h(l45Var) | (i10 == 32) | (i3 == 256);
            Object objN14 = e18Var2.N();
            if (zH7 || objN14 == lz1Var) {
                objN14 = new bk3(qi3Var4, l45Var, of6Var2, zqcVar2);
                e18Var2.k0(objN14);
            }
            bz7 bz7Var = (bz7) objN14;
            boolean zH8 = e18Var2.h(qi3Var4) | e18Var2.h(l45Var) | (i10 == 32) | (i3 == 256);
            Object objN15 = e18Var2.N();
            if (zH8 || objN15 == lz1Var) {
                uj3 uj3Var5 = new uj3(zqcVar2, qi3Var4, l45Var, of6Var2, 1);
                e18Var2.k0(uj3Var5);
                objN15 = uj3Var5;
            }
            zy7 zy7Var5 = (zy7) objN15;
            boolean zH9 = e18Var2.h(qi3Var4) | e18Var2.h(l45Var) | (i10 == 32) | (i3 == 256);
            Object objN16 = e18Var2.N();
            if (zH9 || objN16 == lz1Var) {
                of6Var3 = of6Var;
                zqcVar3 = zqcVar;
                uj3Var3 = new uj3(zqcVar3, qi3Var4, l45Var, of6Var3, 2);
                e18Var2.k0(uj3Var3);
            } else {
                of6Var3 = of6Var;
                uj3Var3 = objN16;
                zqcVar3 = zqcVar;
            }
            zy7 zy7Var6 = (zy7) uj3Var3;
            int i12 = i9 & 14;
            boolean z3 = i12 == 4;
            Object objN17 = e18Var2.N();
            if (z3 || objN17 == lz1Var) {
                tg7Var4 = tg7Var3;
                i4 = 0;
                objN17 = new bz7() { // from class: vj3
                    @Override // defpackage.bz7
                    public final Object invoke(Object obj) {
                        int i13 = i4;
                        iei ieiVar = iei.a;
                        un8 un8Var2 = un8Var;
                        switch (i13) {
                            case 0:
                                ChatConversationWithProjectReference chatConversationWithProjectReference = (ChatConversationWithProjectReference) obj;
                                chatConversationWithProjectReference.getClass();
                                un8Var2.b(chatConversationWithProjectReference);
                                break;
                            default:
                                Project project = (Project) obj;
                                project.getClass();
                                un8Var2.l(project);
                                break;
                        }
                        return ieiVar;
                    }
                };
                e18Var2.k0(objN17);
            } else {
                tg7Var4 = tg7Var3;
                i4 = 0;
            }
            bz7 bz7Var2 = (bz7) objN17;
            int i13 = i12 != 4 ? i4 : 1;
            Object objN18 = e18Var2.N();
            if (i13 != 0 || objN18 == lz1Var) {
                final int i14 = 1;
                objN18 = new bz7() { // from class: vj3
                    @Override // defpackage.bz7
                    public final Object invoke(Object obj) {
                        int i132 = i14;
                        iei ieiVar = iei.a;
                        un8 un8Var2 = un8Var;
                        switch (i132) {
                            case 0:
                                ChatConversationWithProjectReference chatConversationWithProjectReference = (ChatConversationWithProjectReference) obj;
                                chatConversationWithProjectReference.getClass();
                                un8Var2.b(chatConversationWithProjectReference);
                                break;
                            default:
                                Project project = (Project) obj;
                                project.getClass();
                                un8Var2.l(project);
                                break;
                        }
                        return ieiVar;
                    }
                };
                e18Var2.k0(objN18);
            }
            bz7 bz7Var3 = (bz7) objN18;
            boolean zH10 = e18Var2.h(qi3Var4) | e18Var2.h(l45Var) | (i10 == 32) | (i3 == 256);
            Object objN19 = e18Var2.N();
            if (zH10 || objN19 == lz1Var) {
                objN19 = new yj3(qi3Var4, l45Var, of6Var3, zqcVar3);
                e18Var2.k0(objN19);
            }
            bz7 bz7Var4 = (bz7) objN19;
            boolean z4 = i12 == 4;
            Object objN20 = e18Var2.N();
            if (z4 || objN20 == lz1Var) {
                objN20 = new p7(11, un8Var);
                e18Var2.k0(objN20);
            }
            zy7 zy7Var7 = (zy7) objN20;
            boolean zH11 = e18Var2.h(qi3Var4) | e18Var2.h(l45Var) | (i10 == 32) | (i3 == 256);
            Object objN21 = e18Var2.N();
            if (zH11 || objN21 == lz1Var) {
                objN21 = new uj3(qi3Var4, l45Var, of6Var3, zqcVar3);
                e18Var2.k0(objN21);
            }
            zy7 zy7Var8 = (zy7) objN21;
            boolean zH12 = e18Var2.h(qi3Var4) | e18Var2.h(l45Var) | (i10 == 32) | (i3 == 256);
            Object objN22 = e18Var2.N();
            if (zH12 || objN22 == lz1Var) {
                z = true;
                uj3 uj3Var6 = new uj3(zqcVar3, qi3Var4, l45Var, of6Var3, 3);
                e18Var2.k0(uj3Var6);
                objN22 = uj3Var6;
            } else {
                z = true;
            }
            zy7 zy7Var9 = (zy7) objN22;
            boolean zH13 = e18Var2.h(qi3Var4) | e18Var2.h(l45Var) | (i10 == 32 ? z : false) | (i3 != 256 ? false : z);
            Object objN23 = e18Var2.N();
            if (zH13 || objN23 == lz1Var) {
                uj3 uj3Var7 = new uj3(zqcVar, qi3Var4, l45Var, of6Var, 4);
                e18Var2.k0(uj3Var7);
                objN23 = uj3Var7;
            }
            zy7 zy7Var10 = (zy7) objN23;
            boolean zH14 = e18Var2.h(qi3Var4) | e18Var2.h(l45Var) | (i10 == 32 ? z : false) | (i3 != 256 ? false : z) | e18Var2.h(z93Var3);
            Object objN24 = e18Var2.N();
            if (zH14 || objN24 == lz1Var) {
                final int i15 = 0;
                l45Var2 = l45Var;
                final qi3 qi3Var8 = qi3Var4;
                final z93 z93Var6 = z93Var3;
                i5 = i10;
                zy7 zy7Var11 = new zy7() { // from class: wj3
                    @Override // defpackage.zy7
                    public final Object a() {
                        int i16 = i15;
                        iei ieiVar = iei.a;
                        of6 of6Var5 = of6Var;
                        l45 l45Var5 = l45Var2;
                        qi3 qi3Var9 = qi3Var8;
                        z93 z93Var7 = z93Var6;
                        zqc zqcVar4 = zqcVar;
                        switch (i16) {
                            case 0:
                                dk3.b(qi3Var9, l45Var5, of6Var5, DrawerEvents$DrawerItem.NEW_CHAT);
                                ClaudeAppDestination.Detail.Chat chat = new ClaudeAppDestination.Detail.Chat(z93.b(z93Var7, null, null, null, 7));
                                pj3 pj3Var = pj3.N;
                                zqcVar4.E.m(new zj3(chat, zqcVar4, 1), pj3Var);
                                break;
                            default:
                                dk3.b(qi3Var9, l45Var5, of6Var5, DrawerEvents$DrawerItem.WORDMARK);
                                ClaudeAppDestination.Detail.Chat chat2 = new ClaudeAppDestination.Detail.Chat(z93.b(z93Var7, null, null, null, 7));
                                pj3 pj3Var2 = pj3.O;
                                zqcVar4.E.m(new zj3(chat2, zqcVar4, 2), pj3Var2);
                                break;
                        }
                        return ieiVar;
                    }
                };
                z93Var4 = z93Var6;
                qi3Var4 = qi3Var8;
                e18Var2.k0(zy7Var11);
                objN24 = zy7Var11;
            } else {
                l45Var2 = l45Var;
                z93Var4 = z93Var3;
                i5 = i10;
            }
            zy7 zy7Var12 = (zy7) objN24;
            boolean zH15 = e18Var2.h(qi3Var4) | e18Var2.h(l45Var2) | (i5 == 32 ? z : false);
            if (i3 != 256) {
                z = false;
            }
            boolean zH16 = zH15 | z | e18Var2.h(z93Var4);
            Object objN25 = e18Var2.N();
            if (zH16 || objN25 == lz1Var) {
                final int i16 = 1;
                final z93 z93Var7 = z93Var4;
                final qi3 qi3Var9 = qi3Var4;
                zy7 zy7Var13 = new zy7() { // from class: wj3
                    @Override // defpackage.zy7
                    public final Object a() {
                        int i162 = i16;
                        iei ieiVar = iei.a;
                        of6 of6Var5 = of6Var;
                        l45 l45Var5 = l45Var2;
                        qi3 qi3Var92 = qi3Var9;
                        z93 z93Var72 = z93Var7;
                        zqc zqcVar4 = zqcVar;
                        switch (i162) {
                            case 0:
                                dk3.b(qi3Var92, l45Var5, of6Var5, DrawerEvents$DrawerItem.NEW_CHAT);
                                ClaudeAppDestination.Detail.Chat chat = new ClaudeAppDestination.Detail.Chat(z93.b(z93Var72, null, null, null, 7));
                                pj3 pj3Var = pj3.N;
                                zqcVar4.E.m(new zj3(chat, zqcVar4, 1), pj3Var);
                                break;
                            default:
                                dk3.b(qi3Var92, l45Var5, of6Var5, DrawerEvents$DrawerItem.WORDMARK);
                                ClaudeAppDestination.Detail.Chat chat2 = new ClaudeAppDestination.Detail.Chat(z93.b(z93Var72, null, null, null, 7));
                                pj3 pj3Var2 = pj3.O;
                                zqcVar4.E.m(new zj3(chat2, zqcVar4, 2), pj3Var2);
                                break;
                        }
                        return ieiVar;
                    }
                };
                z93Var5 = z93Var7;
                qi3Var5 = qi3Var9;
                e18Var2.k0(zy7Var13);
                objN25 = zy7Var13;
            } else {
                qi3Var5 = qi3Var4;
                z93Var5 = z93Var4;
            }
            e18Var = e18Var2;
            ho8.b(un8Var, of6Var, pwfVarK, zy7Var, zy7Var2, zy7Var3, zy7Var4, pz7Var, bz7Var, zy7Var5, zy7Var6, bz7Var2, bz7Var3, bz7Var4, zy7Var7, zy7Var8, zy7Var9, zy7Var10, zy7Var12, (zy7) objN25, iqbVarB, null, z2, false, false, str, false, false, false, e18Var, i9 & 126);
            tg7Var2 = tg7Var4;
            slVar2 = vmVar;
            qi3Var2 = qi3Var5;
            z93Var2 = z93Var5;
        } else {
            e18Var = e18Var2;
            e18Var.T();
            tg7Var2 = tg7Var;
            slVar2 = slVar;
            qi3Var2 = qi3Var;
            z93Var2 = z93Var;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new hx2(un8Var, of6Var, zqcVar, tg7Var2, slVar2, qi3Var2, z93Var2, i);
        }
    }

    public static final void b(qi3 qi3Var, l45 l45Var, of6 of6Var, DrawerEvents$DrawerItem drawerEvents$DrawerItem) {
        qi3Var.e(new DrawerEvents$DrawerItemSelected(drawerEvents$DrawerItem), DrawerEvents$DrawerItemSelected.Companion.serializer());
        gb9.D(l45Var, null, null, new nj3(of6Var, null, 2), 3);
    }
}
