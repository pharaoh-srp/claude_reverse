package com.anthropic.claude.app;

import com.anthropic.claude.R;
import com.anthropic.claude.app.ClaudeAppDestination;
import com.anthropic.claude.app.i0;
import com.anthropic.claude.chat.ChatScreenParams;
import com.anthropic.claude.code.remote.CodeRemoteSessionScreenParams;
import com.anthropic.claude.code.remote.CodeSessionListScope;
import com.anthropic.claude.project.create.CreateTemplateProjectScreenParams;
import com.anthropic.claude.project.create.UploadMaterialsScreenParams;
import com.anthropic.claude.project.details.ProjectDetailsScreenParams;
import com.anthropic.claude.project.knowledge.ProjectKnowledgeScreenParams;
import com.anthropic.claude.settings.SettingsAppScreen;
import com.pvporbit.freetype.FreeTypeConstants;
import defpackage.a2;
import defpackage.a21;
import defpackage.b1i;
import defpackage.bz7;
import defpackage.cvk;
import defpackage.dm;
import defpackage.e18;
import defpackage.ek;
import defpackage.f13;
import defpackage.fd9;
import defpackage.fg1;
import defpackage.fj3;
import defpackage.fqb;
import defpackage.g13;
import defpackage.g34;
import defpackage.gj3;
import defpackage.gok;
import defpackage.gpk;
import defpackage.gr9;
import defpackage.gv;
import defpackage.gx2;
import defpackage.hj3;
import defpackage.hm3;
import defpackage.htk;
import defpackage.ie3;
import defpackage.iei;
import defpackage.ij0;
import defpackage.ij3;
import defpackage.im6;
import defpackage.iqb;
import defpackage.iuj;
import defpackage.jce;
import defpackage.jd4;
import defpackage.jgc;
import defpackage.jj3;
import defpackage.jm9;
import defpackage.ka1;
import defpackage.kac;
import defpackage.kf6;
import defpackage.kj3;
import defpackage.kk0;
import defpackage.l45;
import defpackage.l80;
import defpackage.ld4;
import defpackage.lsc;
import defpackage.lz1;
import defpackage.m7f;
import defpackage.ml3;
import defpackage.mpk;
import defpackage.mr9;
import defpackage.nai;
import defpackage.nwb;
import defpackage.o5;
import defpackage.of6;
import defpackage.oua;
import defpackage.ow1;
import defpackage.p7;
import defpackage.pmk;
import defpackage.ps7;
import defpackage.pt4;
import defpackage.pz7;
import defpackage.qi3;
import defpackage.qik;
import defpackage.qzb;
import defpackage.r7e;
import defpackage.rc8;
import defpackage.rt4;
import defpackage.rwe;
import defpackage.sq6;
import defpackage.ta4;
import defpackage.te3;
import defpackage.tp4;
import defpackage.uz7;
import defpackage.ve4;
import defpackage.vx3;
import defpackage.w44;
import defpackage.w53;
import defpackage.wlg;
import defpackage.wz5;
import defpackage.x13;
import defpackage.x2k;
import defpackage.x44;
import defpackage.xh6;
import defpackage.xk3;
import defpackage.xn5;
import defpackage.z93;
import defpackage.zqc;
import defpackage.zy7;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class i0 {
    public static final void a(ClaudeAppDestination claudeAppDestination, zqc zqcVar, final rwe rweVar, final xk3 xk3Var, final zy7 zy7Var, final of6 of6Var, iqb iqbVar, z93 z93Var, b1i b1iVar, qi3 qi3Var, ld4 ld4Var, final int i) {
        int i2;
        final iqb iqbVar2;
        final z93 z93Var2;
        final b1i b1iVar2;
        final qi3 qi3Var2;
        z93 z93Var3;
        qi3 qi3Var3;
        int i3;
        iqb iqbVar3;
        b1i b1iVar3;
        b1i b1iVar4;
        qi3 qi3Var4;
        z93 z93Var4;
        zqc zqcVar2;
        ClaudeAppDestination claudeAppDestination2;
        ProjectDetailsScreenParams params;
        iqb iqbVar4;
        iqb iqbVar5;
        zqc zqcVar3;
        iqb iqbVar6;
        int i4;
        int i5;
        ClaudeAppDestination.Detail.CodeRemoteSession codeRemoteSession;
        wlg wlgVar;
        int i6;
        CodeRemoteSessionScreenParams params2;
        int i7;
        String strM698getSessionIdUFAIyc8;
        zy7 zy7Var2;
        CodeRemoteSessionScreenParams params3;
        vx3 vx3Var;
        boolean z;
        CodeRemoteSessionScreenParams params4;
        CodeRemoteSessionScreenParams params5;
        int i8;
        ClaudeAppDestination claudeAppDestination3 = claudeAppDestination;
        final zqc zqcVar4 = zqcVar;
        claudeAppDestination3.getClass();
        zqcVar4.getClass();
        lsc lscVar = zqcVar4.F;
        rweVar.getClass();
        xk3Var.getClass();
        wz5 wz5Var = xk3Var.d;
        zy7Var.getClass();
        of6Var.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-1913897467);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? e18Var.f(claudeAppDestination3) : e18Var.h(claudeAppDestination3) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? e18Var.f(zqcVar4) : e18Var.h(zqcVar4) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? e18Var.f(rweVar) : e18Var.h(rweVar) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        if ((i & 3072) == 0) {
            i2 |= (i & FreeTypeConstants.FT_LOAD_MONOCHROME) == 0 ? e18Var.f(xk3Var) : e18Var.h(xk3Var) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE;
        }
        if ((i & 24576) == 0) {
            i2 |= e18Var.h(zy7Var) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN;
        }
        if ((i & 196608) == 0) {
            i2 |= e18Var.f(of6Var) ? 131072 : 65536;
        }
        int i9 = i2 | 1572864;
        if ((i & 12582912) == 0) {
            i9 = i2 | 5767168;
        }
        if ((100663296 & i) == 0) {
            i9 |= 33554432;
        }
        if ((805306368 & i) == 0) {
            i9 |= 268435456;
        }
        if (e18Var.Q(i9 & 1, (i9 & 306783379) != 306783378)) {
            e18Var.V();
            int i10 = i & 1;
            lz1 lz1Var = jd4.a;
            if (i10 == 0 || e18Var.A()) {
                m7f m7fVarN = sq6.n(e18Var, -1168520582, e18Var, -1633490746);
                boolean zF = e18Var.f(null) | e18Var.f(m7fVarN);
                Object objN = e18Var.N();
                if (zF || objN == lz1Var) {
                    objN = ij0.f(z93.class, m7fVarN, null, e18Var);
                }
                e18Var.r();
                e18Var.r();
                z93Var3 = (z93) objN;
                m7f m7fVarN2 = sq6.n(e18Var, -1168520582, e18Var, -1633490746);
                boolean zF2 = e18Var.f(null) | e18Var.f(m7fVarN2);
                Object objN2 = e18Var.N();
                if (zF2 || objN2 == lz1Var) {
                    objN2 = ij0.f(b1i.class, m7fVarN2, null, e18Var);
                }
                e18Var.r();
                e18Var.r();
                b1i b1iVar5 = (b1i) objN2;
                m7f m7fVarN3 = sq6.n(e18Var, -1168520582, e18Var, -1633490746);
                boolean zF3 = e18Var.f(null) | e18Var.f(m7fVarN3);
                Object objN3 = e18Var.N();
                if (zF3 || objN3 == lz1Var) {
                    objN3 = ij0.f(qi3.class, m7fVarN3, null, e18Var);
                }
                e18Var.r();
                e18Var.r();
                qi3Var3 = (qi3) objN3;
                i3 = i9 & (-2143289345);
                iqbVar3 = fqb.E;
                b1iVar3 = b1iVar5;
            } else {
                e18Var.T();
                z93Var3 = z93Var;
                b1iVar3 = b1iVar;
                qi3Var3 = qi3Var;
                i3 = i9 & (-2143289345);
                iqbVar3 = iqbVar;
            }
            e18Var.q();
            xn5.P(6, e18Var);
            boolean zH = e18Var.h(qi3Var3);
            Object objN4 = e18Var.N();
            if (zH || objN4 == lz1Var) {
                objN4 = new p7(10, qi3Var3);
                e18Var.k0(objN4);
            }
            zy7 zy7Var3 = (zy7) objN4;
            int i11 = 14;
            if (claudeAppDestination3 instanceof ClaudeAppDestination.List.AllChatsList) {
                e18Var.a0(-1227389852);
                int i12 = i3;
                ml3 ml3VarB = b(of6Var, zy7Var3, zqcVar4, claudeAppDestination3, null, e18Var, ((i3 >> 15) & 14) | ((i3 << 3) & 896) | ((i3 << 9) & 7168), 48);
                boolean zBooleanValue = ((Boolean) wz5Var.getValue()).booleanValue();
                int i13 = i12 & 112;
                boolean zH2 = (i13 == 32 || ((i12 & 64) != 0 && e18Var.h(zqcVar4))) | e18Var.h(z93Var3);
                Object objN5 = e18Var.N();
                if (zH2 || objN5 == lz1Var) {
                    objN5 = new w(zqcVar4, z93Var3);
                    e18Var.k0(objN5);
                }
                pz7 pz7Var = (pz7) objN5;
                boolean zH3 = (i13 == 32 || ((i12 & 64) != 0 && e18Var.h(zqcVar4))) | e18Var.h(z93Var3);
                Object objN6 = e18Var.N();
                if (zH3 || objN6 == lz1Var) {
                    objN6 = new fj3(zqcVar4, z93Var3, 0);
                    e18Var.k0(objN6);
                }
                zy7 zy7Var4 = (zy7) objN6;
                boolean z2 = i13 == 32 || ((i12 & 64) != 0 && e18Var.h(zqcVar4));
                Object objN7 = e18Var.N();
                if (z2 || objN7 == lz1Var) {
                    objN7 = new b0(zqcVar4);
                    e18Var.k0(objN7);
                }
                int i14 = ml3.f;
                iqb iqbVar7 = iqbVar3;
                gv.b(ml3VarB, zBooleanValue, pz7Var, zy7Var4, (bz7) objN7, iqbVar7, null, null, e18Var, (i12 >> 3) & 458752);
                iqbVar3 = iqbVar7;
                e18Var.r();
                b1iVar4 = b1iVar3;
                qi3Var4 = qi3Var3;
                z93Var4 = z93Var3;
            } else {
                b1i b1iVar6 = b1iVar3;
                qi3 qi3Var5 = qi3Var3;
                int i15 = 3;
                int i16 = i3;
                z93 z93Var5 = z93Var3;
                if (claudeAppDestination3 instanceof ClaudeAppDestination.Detail.Chat) {
                    e18Var.a0(-1225695733);
                    ps7 ps7Var = (ps7) e18Var.j(ve4.i);
                    ChatScreenParams params6 = ((ClaudeAppDestination.Detail.Chat) claudeAppDestination3).getParams();
                    int i17 = i16 & 112;
                    int i18 = i16 & 14;
                    boolean zH4 = (i18 == 4 || ((i16 & 8) != 0 && e18Var.h(claudeAppDestination3))) | e18Var.h(ps7Var) | (i17 == 32 || ((i16 & 64) != 0 && e18Var.h(zqcVar4)));
                    Object objN8 = e18Var.N();
                    if (zH4 || objN8 == lz1Var) {
                        objN8 = new ka1(ps7Var, zqcVar4, claudeAppDestination3, 6);
                        e18Var.k0(objN8);
                    }
                    b1iVar4 = b1iVar6;
                    qi3Var4 = qi3Var5;
                    z93Var4 = z93Var5;
                    ml3 ml3VarB2 = b(of6Var, zy7Var3, zqcVar4, claudeAppDestination3, (zy7) objN8, e18Var, ((i16 << 9) & 7168) | ((i16 << 3) & 896) | ((i16 >> 15) & 14), 32);
                    int i19 = i16 & 7168;
                    boolean z3 = i19 == 2048 || ((i16 & FreeTypeConstants.FT_LOAD_MONOCHROME) != 0 && e18Var.h(xk3Var));
                    Object objN9 = e18Var.N();
                    if (z3 || objN9 == lz1Var) {
                        objN9 = new dm(xk3Var, 7);
                        e18Var.k0(objN9);
                    }
                    jm9 jm9Var = (jm9) objN9;
                    boolean z4 = i19 == 2048 || ((i16 & FreeTypeConstants.FT_LOAD_MONOCHROME) != 0 && e18Var.h(xk3Var));
                    Object objN10 = e18Var.N();
                    if (z4 || objN10 == lz1Var) {
                        objN10 = new dm(xk3Var, 8);
                        e18Var.k0(objN10);
                    }
                    jm9 jm9Var2 = (jm9) objN10;
                    int i20 = i16 & 896;
                    boolean z5 = i20 == 256 || ((i16 & 512) != 0 && e18Var.h(rweVar));
                    Object objN11 = e18Var.N();
                    if (z5 || objN11 == lz1Var) {
                        objN11 = new kj3(rweVar, 0);
                        e18Var.k0(objN11);
                    }
                    zy7 zy7Var5 = (zy7) objN11;
                    boolean z6 = i20 == 256 || ((i16 & 512) != 0 && e18Var.h(rweVar));
                    Object objN12 = e18Var.N();
                    if (z6 || objN12 == lz1Var) {
                        objN12 = new f13(rweVar, 10);
                        e18Var.k0(objN12);
                    }
                    bz7 bz7Var = (bz7) objN12;
                    boolean z7 = i20 == 256 || ((i16 & 512) != 0 && e18Var.h(rweVar));
                    Object objN13 = e18Var.N();
                    if (z7 || objN13 == lz1Var) {
                        i8 = 6;
                        objN13 = new kj3(rweVar, i8);
                        e18Var.k0(objN13);
                    } else {
                        i8 = 6;
                    }
                    zy7 zy7Var6 = (zy7) objN13;
                    boolean zH5 = (i18 == 4 || ((i16 & 8) != 0 && e18Var.h(claudeAppDestination3))) | (i17 == 32 || ((i16 & 64) != 0 && e18Var.h(zqcVar4))) | e18Var.h(z93Var4);
                    Object objN14 = e18Var.N();
                    if (zH5 || objN14 == lz1Var) {
                        objN14 = new ka1(zqcVar4, z93Var4, claudeAppDestination3, 9);
                        e18Var.k0(objN14);
                    }
                    zy7 zy7Var7 = (zy7) objN14;
                    boolean z8 = i17 == 32 || ((i16 & 64) != 0 && e18Var.h(zqcVar4));
                    Object objN15 = e18Var.N();
                    if (z8 || objN15 == lz1Var) {
                        objN15 = new x(zqcVar4);
                        e18Var.k0(objN15);
                    }
                    bz7 bz7Var2 = (bz7) objN15;
                    boolean z9 = i20 == 256 || ((i16 & 512) != 0 && e18Var.h(rweVar));
                    Object objN16 = e18Var.N();
                    if (z9 || objN16 == lz1Var) {
                        objN16 = new y(rweVar);
                        e18Var.k0(objN16);
                    }
                    uz7 uz7Var = (uz7) objN16;
                    zy7 zy7Var8 = (zy7) jm9Var;
                    zy7 zy7Var9 = (zy7) jm9Var2;
                    boolean z10 = i20 == 256 || ((i16 & 512) != 0 && e18Var.h(rweVar));
                    Object objN17 = e18Var.N();
                    if (z10 || objN17 == lz1Var) {
                        objN17 = new z(rweVar);
                        e18Var.k0(objN17);
                    }
                    bz7 bz7Var3 = (bz7) objN17;
                    int i21 = ml3.f;
                    iqb iqbVar8 = iqbVar3;
                    com.anthropic.claude.chat.f.a(params6, ml3VarB2, zy7Var5, bz7Var, zy7Var6, zy7Var7, bz7Var2, uz7Var, iqbVar8, zy7Var8, zy7Var9, bz7Var3, null, null, null, null, null, null, e18Var, (i16 << 6) & 234881024);
                    iqbVar3 = iqbVar8;
                    e18Var.r();
                } else {
                    b1iVar4 = b1iVar6;
                    qi3Var4 = qi3Var5;
                    int i22 = 6;
                    z93Var4 = z93Var5;
                    if (claudeAppDestination3 instanceof ClaudeAppDestination.List.AllProjectsList) {
                        e18Var.a0(-1221071432);
                        ml3 ml3VarB3 = b(of6Var, zy7Var3, zqcVar4, claudeAppDestination3, null, e18Var, ((i16 >> 15) & 14) | ((i16 << 3) & 896) | ((i16 << 9) & 7168), 48);
                        int i23 = i16 & 112;
                        boolean z11 = i23 == 32 || ((i16 & 64) != 0 && e18Var.h(zqcVar4));
                        Object objN18 = e18Var.N();
                        if (z11 || objN18 == lz1Var) {
                            objN18 = new hj3(zqcVar4, 2);
                            e18Var.k0(objN18);
                        }
                        bz7 bz7Var4 = (bz7) objN18;
                        boolean z12 = i23 == 32 || ((i16 & 64) != 0 && e18Var.h(zqcVar4));
                        Object objN19 = e18Var.N();
                        if (z12 || objN19 == lz1Var) {
                            objN19 = new gj3(zqcVar4, i15);
                            e18Var.k0(objN19);
                        }
                        zy7 zy7Var10 = (zy7) objN19;
                        int i24 = i16 & 896;
                        boolean z13 = i24 == 256 || ((i16 & 512) != 0 && e18Var.h(rweVar));
                        Object objN20 = e18Var.N();
                        if (z13 || objN20 == lz1Var) {
                            objN20 = new kj3(rweVar, 7);
                            e18Var.k0(objN20);
                        }
                        zy7 zy7Var11 = (zy7) objN20;
                        boolean z14 = i24 == 256 || ((i16 & 512) != 0 && e18Var.h(rweVar));
                        Object objN21 = e18Var.N();
                        if (z14 || objN21 == lz1Var) {
                            objN21 = new g13(rweVar, 29);
                            e18Var.k0(objN21);
                        }
                        zy7 zy7Var12 = (zy7) objN21;
                        int i25 = ml3.f;
                        iqb iqbVar9 = iqbVar3;
                        gpk.a(ml3VarB3, bz7Var4, zy7Var10, iqbVar9, zy7Var11, zy7Var12, null, null, e18Var, (i16 >> 9) & 7168);
                        iqbVar3 = iqbVar9;
                        e18Var.r();
                    } else if (claudeAppDestination3 instanceof ClaudeAppDestination.List.ArtifactGallery) {
                        e18Var.a0(-1219553548);
                        ml3 ml3VarB4 = b(of6Var, zy7Var3, zqcVar4, claudeAppDestination3, null, e18Var, ((i16 >> 15) & 14) | ((i16 << 3) & 896) | ((i16 << 9) & 7168), 48);
                        boolean zH6 = ((i16 & 112) == 32 || ((i16 & 64) != 0 && e18Var.h(zqcVar4))) | e18Var.h(z93Var4);
                        Object objN22 = e18Var.N();
                        if (zH6 || objN22 == lz1Var) {
                            objN22 = new o5(zqcVar4, 21, z93Var4);
                            e18Var.k0(objN22);
                        }
                        int i26 = ml3.f;
                        iqb iqbVar10 = iqbVar3;
                        htk.a(ml3VarB4, (bz7) objN22, iqbVar10, null, null, e18Var, (i16 >> 12) & 896);
                        iqbVar3 = iqbVar10;
                        e18Var.r();
                    } else if (claudeAppDestination3 instanceof ClaudeAppDestination.List.CodeRemote) {
                        e18Var.a0(-1218431224);
                        ie3 ie3Var = (ie3) w44.V0(((te3) lscVar.getValue()).b);
                        ClaudeAppDestination.Detail detail = ie3Var != null ? (ClaudeAppDestination.Detail) ie3Var.a : null;
                        ClaudeAppDestination.Detail.CodeRemoteSession codeRemoteSession2 = detail instanceof ClaudeAppDestination.Detail.CodeRemoteSession ? (ClaudeAppDestination.Detail.CodeRemoteSession) detail : null;
                        ml3 ml3VarB5 = b(of6Var, zy7Var3, zqcVar4, claudeAppDestination3, null, e18Var, ((i16 >> 15) & 14) | ((i16 << 3) & 896) | ((i16 << 9) & 7168), 48);
                        boolean zBooleanValue2 = ((Boolean) wz5Var.getValue()).booleanValue();
                        String strM698getSessionIdUFAIyc82 = (codeRemoteSession2 == null || (params5 = codeRemoteSession2.getParams()) == null) ? null : params5.m698getSessionIdUFAIyc8();
                        boolean z15 = codeRemoteSession2 != null;
                        boolean z16 = ((Boolean) b1iVar4.x.getValue()).booleanValue() || b1iVar4.a();
                        int i27 = i16 & 112;
                        boolean z17 = i27 == 32 || ((i16 & 64) != 0 && e18Var.h(zqcVar4));
                        Object objN23 = e18Var.N();
                        if (z17 || objN23 == lz1Var) {
                            objN23 = new hj3(zqcVar4, 3);
                            e18Var.k0(objN23);
                        }
                        bz7 bz7Var5 = (bz7) objN23;
                        boolean z18 = i27 == 32 || ((i16 & 64) != 0 && e18Var.h(zqcVar4));
                        Object objN24 = e18Var.N();
                        if (z18 || objN24 == lz1Var) {
                            objN24 = new gj3(zqcVar4, 4);
                            e18Var.k0(objN24);
                        }
                        zy7 zy7Var13 = (zy7) objN24;
                        boolean z19 = i27 == 32 || ((i16 & 64) != 0 && e18Var.h(zqcVar4));
                        Object objN25 = e18Var.N();
                        if (z19 || objN25 == lz1Var) {
                            objN25 = new hj3(zqcVar4, 4);
                            e18Var.k0(objN25);
                        }
                        bz7 bz7Var6 = (bz7) objN25;
                        boolean z20 = i27 == 32 || ((i16 & 64) != 0 && e18Var.h(zqcVar4));
                        Object objN26 = e18Var.N();
                        if (z20 || objN26 == lz1Var) {
                            objN26 = new a0(zqcVar4);
                            e18Var.k0(objN26);
                        }
                        pz7 pz7Var2 = (pz7) objN26;
                        boolean z21 = (i16 & 896) == 256 || ((i16 & 512) != 0 && e18Var.h(rweVar));
                        Object objN27 = e18Var.N();
                        if (z21 || objN27 == lz1Var) {
                            objN27 = new kj3(rweVar, 8);
                            e18Var.k0(objN27);
                        }
                        zy7 zy7Var14 = (zy7) objN27;
                        boolean z22 = i27 == 32 || ((i16 & 64) != 0 && e18Var.h(zqcVar4));
                        Object objN28 = e18Var.N();
                        if (z22 || objN28 == lz1Var) {
                            objN28 = new hj3(zqcVar4, 5);
                            e18Var.k0(objN28);
                        }
                        bz7 bz7Var7 = (bz7) objN28;
                        int i28 = ml3.f;
                        pmk.a(ml3VarB5, zBooleanValue2, bz7Var5, zy7Var13, iqbVar3, z16, bz7Var6, pz7Var2, zy7Var14, strM698getSessionIdUFAIyc82, z15, false, bz7Var7, 0, null, null, null, null, null, false, e18Var, (i16 >> 6) & 57344, 0, 1042432);
                        e18Var.r();
                        b1iVar4 = b1iVar4;
                    } else if (claudeAppDestination3 instanceof ClaudeAppDestination.List.CodeProject) {
                        e18Var.a0(-1214958015);
                        String strM468getProjectIdiRFWGjk = ((ClaudeAppDestination.List.CodeProject) claudeAppDestination3).m468getProjectIdiRFWGjk();
                        CodeSessionListScope.Project project = new CodeSessionListScope.Project(strM468getProjectIdiRFWGjk, null);
                        m7f m7fVarB = gr9.b(e18Var);
                        ie3 ie3Var2 = (ie3) w44.V0(((te3) lscVar.getValue()).b);
                        ClaudeAppDestination.Detail detail2 = ie3Var2 != null ? (ClaudeAppDestination.Detail) ie3Var2.a : null;
                        ClaudeAppDestination.Detail.CodeRemoteSession codeRemoteSession3 = detail2 instanceof ClaudeAppDestination.Detail.CodeRemoteSession ? (ClaudeAppDestination.Detail.CodeRemoteSession) detail2 : null;
                        vx3 vx3Var2 = (vx3) m7fVarB.a(jce.a(vx3.class), null, null);
                        ml3 ml3VarB6 = b(of6Var, zy7Var3, zqcVar4, claudeAppDestination3, null, e18Var, ((i16 >> 15) & 14) | ((i16 << 3) & 896) | ((i16 << 9) & 7168), 48);
                        if (((Boolean) b1iVar4.x.getValue()).booleanValue() || b1iVar4.a()) {
                            vx3Var = vx3Var2;
                            z = true;
                        } else {
                            vx3Var = vx3Var2;
                            z = false;
                        }
                        String strM698getSessionIdUFAIyc83 = (codeRemoteSession3 == null || (params4 = codeRemoteSession3.getParams()) == null) ? null : params4.m698getSessionIdUFAIyc8();
                        boolean z23 = codeRemoteSession3 != null;
                        int i29 = i16 & 112;
                        boolean z24 = i29 == 32 || ((i16 & 64) != 0 && e18Var.h(zqcVar4));
                        vx3 vx3Var3 = vx3Var;
                        Object objN29 = e18Var.N();
                        if (z24 || objN29 == lz1Var) {
                            objN29 = new hj3(zqcVar4, i22);
                            e18Var.k0(objN29);
                        }
                        bz7 bz7Var8 = (bz7) objN29;
                        boolean zH7 = (i29 == 32 || ((i16 & 64) != 0 && e18Var.h(zqcVar4))) | e18Var.h(project);
                        Object objN30 = e18Var.N();
                        if (zH7 || objN30 == lz1Var) {
                            objN30 = new l80(zqcVar4, 19, project);
                            e18Var.k0(objN30);
                        }
                        zy7 zy7Var15 = (zy7) objN30;
                        boolean zH8 = (i29 == 32 || ((i16 & 64) != 0 && e18Var.h(zqcVar4))) | e18Var.h(project);
                        Object objN31 = e18Var.N();
                        if (zH8 || objN31 == lz1Var) {
                            objN31 = new o5(zqcVar4, 20, project);
                            e18Var.k0(objN31);
                        }
                        bz7 bz7Var9 = (bz7) objN31;
                        boolean z25 = (i16 & 896) == 256 || ((i16 & 512) != 0 && e18Var.h(rweVar));
                        Object objN32 = e18Var.N();
                        if (z25 || objN32 == lz1Var) {
                            objN32 = new g13(rweVar, 28);
                            e18Var.k0(objN32);
                        }
                        int i30 = ml3.f;
                        b1iVar4 = b1iVar4;
                        iqb iqbVar11 = iqbVar3;
                        com.anthropic.claude.code.remote.a.b(vx3Var3, strM468getProjectIdiRFWGjk, ml3VarB6, bz7Var8, zy7Var15, iqbVar11, z, bz7Var9, (zy7) objN32, strM698getSessionIdUFAIyc83, z23, null, e18Var, (i16 >> 3) & 458752);
                        iqbVar3 = iqbVar11;
                        e18Var.r();
                    } else {
                        b1iVar4 = b1iVar4;
                        if (claudeAppDestination3 instanceof ClaudeAppDestination.List.CoworkRemote) {
                            e18Var.a0(-1212114044);
                            e18Var.a0(-1168520582);
                            m7f m7fVarB2 = gr9.b(e18Var);
                            e18Var.a0(-1633490746);
                            boolean zF4 = e18Var.f(null) | e18Var.f(m7fVarB2);
                            Object objN33 = e18Var.N();
                            if (zF4 || objN33 == lz1Var) {
                                objN33 = ij0.f(kf6.class, m7fVarB2, null, e18Var);
                            }
                            e18Var.r();
                            e18Var.r();
                            kf6 kf6Var = (kf6) objN33;
                            boolean zH9 = e18Var.h(kf6Var);
                            Object objN34 = e18Var.N();
                            if (zH9 || objN34 == lz1Var) {
                                objN34 = new kk0(kf6Var, null, 13);
                                e18Var.k0(objN34);
                            }
                            iei ieiVar = iei.a;
                            fd9.i(e18Var, (pz7) objN34, ieiVar);
                            ie3 ie3Var3 = (ie3) w44.V0(((te3) lscVar.getValue()).b);
                            ClaudeAppDestination.Detail detail3 = ie3Var3 != null ? (ClaudeAppDestination.Detail) ie3Var3.a : null;
                            ClaudeAppDestination.Detail.CodeRemoteSession codeRemoteSession4 = detail3 instanceof ClaudeAppDestination.Detail.CodeRemoteSession ? (ClaudeAppDestination.Detail.CodeRemoteSession) detail3 : null;
                            if (codeRemoteSession4 == null || !x44.r(codeRemoteSession4.getParams().getNewSessionScope(), CodeSessionListScope.DramaticShrimp.INSTANCE)) {
                                i4 = -1633490746;
                                i5 = -1168520582;
                                codeRemoteSession = null;
                            } else {
                                codeRemoteSession = codeRemoteSession4;
                                i4 = -1633490746;
                                i5 = -1168520582;
                            }
                            m7f m7fVarN4 = sq6.n(e18Var, i5, e18Var, i4);
                            boolean zF5 = e18Var.f(null) | e18Var.f(m7fVarN4);
                            Object objN35 = e18Var.N();
                            if (zF5 || objN35 == lz1Var) {
                                objN35 = ij0.f(rc8.class, m7fVarN4, null, e18Var);
                            }
                            e18Var.r();
                            e18Var.r();
                            rc8 rc8Var = (rc8) objN35;
                            boolean zF6 = e18Var.f(rc8Var);
                            Object objN36 = e18Var.N();
                            if (zF6 || objN36 == lz1Var) {
                                objN36 = rc8Var.m("cowork_scheduled_runs");
                                e18Var.k0(objN36);
                            }
                            wlg wlgVar2 = (wlg) objN36;
                            com.anthropic.claude.code.remote.c cVarD = com.anthropic.claude.code.remote.d.d(CodeSessionListScope.DramaticShrimp.INSTANCE, wlgVar2, e18Var, 6, 0);
                            Object[] objArr = new Object[0];
                            Object objN37 = e18Var.N();
                            if (objN37 == lz1Var) {
                                objN37 = new w53(27);
                                e18Var.k0(objN37);
                            }
                            nwb nwbVar = (nwb) iuj.I(objArr, (zy7) objN37, e18Var, 48);
                            if (!((Boolean) wlgVar2.getValue()).booleanValue() && ((Boolean) nwbVar.getValue()).booleanValue()) {
                                nwbVar.setValue(Boolean.FALSE);
                            }
                            boolean z26 = ((Boolean) nwbVar.getValue()).booleanValue() && codeRemoteSession4 == null;
                            boolean zF7 = e18Var.f(nwbVar);
                            Object objN38 = e18Var.N();
                            if (zF7 || objN38 == lz1Var) {
                                wlgVar = wlgVar2;
                                objN38 = new fg1(3, nwbVar);
                                e18Var.k0(objN38);
                            } else {
                                wlgVar = wlgVar2;
                            }
                            nai.a(0, 0, e18Var, (zy7) objN38, z26);
                            Object objN39 = e18Var.N();
                            if (objN39 == lz1Var) {
                                objN39 = mpk.P(null);
                                e18Var.k0(objN39);
                            }
                            nwb nwbVar2 = (nwb) objN39;
                            ArrayList arrayList = ((te3) lscVar.getValue()).b;
                            int i31 = i16 & 112;
                            boolean z27 = i31 == 32 || ((i16 & 64) != 0 && e18Var.h(zqcVar4));
                            Object objN40 = e18Var.N();
                            if (z27 || objN40 == lz1Var) {
                                objN40 = new c0(zqcVar4, nwbVar2, null);
                                e18Var.k0(objN40);
                            }
                            fd9.i(e18Var, (pz7) objN40, arrayList);
                            boolean z28 = i31 == 32 || ((i16 & 64) != 0 && e18Var.h(zqcVar4));
                            Object objN41 = e18Var.N();
                            if (z28 || objN41 == lz1Var) {
                                i6 = 0;
                                objN41 = new gj3(zqcVar4, i6);
                                e18Var.k0(objN41);
                            } else {
                                i6 = 0;
                            }
                            zy7 zy7Var16 = (zy7) objN41;
                            pmk.c(x44.r(cVarD.Z(), jgc.a), e18Var, i6);
                            if (((Boolean) nwbVar.getValue()).booleanValue()) {
                                claudeAppDestination2 = claudeAppDestination;
                                ClaudeAppDestination.Detail.CodeRemoteSession codeRemoteSession5 = codeRemoteSession4;
                                e18Var.a0(-1203167444);
                                tp4 tp4Var = null;
                                com.anthropic.claude.code.remote.c cVarD2 = com.anthropic.claude.code.remote.d.d(CodeSessionListScope.Scheduled.INSTANCE, null, e18Var, 6, 2);
                                boolean zF8 = e18Var.f(cVarD2);
                                Object objN42 = e18Var.N();
                                if (zF8 || objN42 == lz1Var) {
                                    objN42 = new kk0(cVarD2, tp4Var, i11);
                                    e18Var.k0(objN42);
                                }
                                fd9.i(e18Var, (pz7) objN42, ieiVar);
                                boolean zF9 = e18Var.f(cVarD2);
                                Object objN43 = e18Var.N();
                                if (zF9 || objN43 == lz1Var) {
                                    objN43 = new a2(14, cVarD2);
                                    e18Var.k0(objN43);
                                }
                                fd9.d(ieiVar, (bz7) objN43, e18Var);
                                boolean zF10 = e18Var.f(nwbVar);
                                Object objN44 = e18Var.N();
                                if (zF10 || objN44 == lz1Var) {
                                    objN44 = new fg1(5, nwbVar);
                                    e18Var.k0(objN44);
                                }
                                zqcVar2 = zqcVar;
                                ml3 ml3Var = new ml3(hm3.G, of6Var, (zy7) objN44, zy7Var3, 16);
                                String strM698getSessionIdUFAIyc84 = (codeRemoteSession == null || (params2 = codeRemoteSession.getParams()) == null) ? null : params2.m698getSessionIdUFAIyc8();
                                boolean z29 = codeRemoteSession5 != null;
                                boolean z30 = false;
                                boolean z31 = codeRemoteSession != null;
                                if (i31 == 32 || ((i16 & 64) != 0 && e18Var.h(zqcVar2))) {
                                    z30 = true;
                                }
                                Object objN45 = e18Var.N();
                                if (z30 || objN45 == lz1Var) {
                                    objN45 = new hj3(zqcVar2, 1);
                                    e18Var.k0(objN45);
                                }
                                pmk.a(ml3Var, false, (bz7) objN45, zy7Var16, iqbVar3, false, null, null, null, strM698getSessionIdUFAIyc84, z29, z31, null, R.string.scheduled_runs_title, cVarD2, null, x2k.a, null, null, false, e18Var, 48 | ((i16 >> 6) & 57344), 806879232, 430560);
                                e18Var = e18Var;
                                e18Var.r();
                            } else {
                                e18Var.a0(-1207584789);
                                wlg wlgVar3 = wlgVar;
                                ClaudeAppDestination.Detail.CodeRemoteSession codeRemoteSession6 = codeRemoteSession4;
                                ml3 ml3VarB7 = b(of6Var, zy7Var3, zqcVar, claudeAppDestination, null, e18Var, ((i16 >> 15) & 14) | ((i16 << 3) & 896) | ((i16 << 9) & 7168), 48);
                                claudeAppDestination2 = claudeAppDestination;
                                if (codeRemoteSession == null || (params3 = codeRemoteSession.getParams()) == null) {
                                    i7 = 48;
                                    strM698getSessionIdUFAIyc8 = null;
                                } else {
                                    i7 = 48;
                                    strM698getSessionIdUFAIyc8 = params3.m698getSessionIdUFAIyc8();
                                }
                                boolean z32 = codeRemoteSession6 != null;
                                int i32 = 0;
                                boolean z33 = codeRemoteSession != null;
                                if (((Boolean) wlgVar3.getValue()).booleanValue()) {
                                    e18Var.a0(-1203544559);
                                    boolean zF11 = e18Var.f(nwbVar);
                                    Object objN46 = e18Var.N();
                                    if (zF11 || objN46 == lz1Var) {
                                        objN46 = new fg1(4, nwbVar);
                                        e18Var.k0(objN46);
                                    }
                                    e18Var.r();
                                    zy7Var2 = (zy7) objN46;
                                } else {
                                    e18Var.a0(-1203463959);
                                    e18Var.r();
                                    zy7Var2 = null;
                                }
                                boolean z34 = i31 == 32 || ((i16 & 64) != 0 && e18Var.h(zqcVar));
                                Object objN47 = e18Var.N();
                                if (z34 || objN47 == lz1Var) {
                                    objN47 = new hj3(zqcVar, i32);
                                    e18Var.k0(objN47);
                                }
                                ta4 ta4VarQ0 = fd9.q0(1395722625, new ij3(rc8Var, qi3Var4, zqcVar, nwbVar2, 0), e18Var);
                                ta4 ta4VarQ02 = fd9.q0(-172518933, new gx2(1, zy7Var16), e18Var);
                                int i33 = ml3.f;
                                pmk.a(ml3VarB7, true, (bz7) objN47, zy7Var16, iqbVar3, false, null, null, null, strM698getSessionIdUFAIyc8, z32, z33, null, R.string.dramatic_shrimp_screen_title, cVarD, null, ta4VarQ0, ta4VarQ02, zy7Var2, false, e18Var, i7 | ((i16 >> 6) & 57344), 819462144, 37344);
                                e18Var.r();
                                zqcVar2 = zqcVar;
                                e18Var = e18Var;
                            }
                            e18Var.r();
                        } else {
                            zqcVar2 = zqcVar4;
                            claudeAppDestination2 = claudeAppDestination3;
                            boolean z35 = false;
                            boolean z36 = claudeAppDestination2 instanceof ClaudeAppDestination.List.ProjectDetails;
                            if (z36 || (claudeAppDestination2 instanceof ClaudeAppDestination.Detail.ProjectDetails)) {
                                claudeAppDestination3 = claudeAppDestination2;
                                boolean z37 = true;
                                e18Var.a0(-1200648136);
                                if (z36) {
                                    params = ((ClaudeAppDestination.List.ProjectDetails) claudeAppDestination3).getParams();
                                } else {
                                    if (!(claudeAppDestination3 instanceof ClaudeAppDestination.Detail.ProjectDetails)) {
                                        xh6.d("Unexpected destination type ", claudeAppDestination3);
                                        return;
                                    }
                                    params = ((ClaudeAppDestination.Detail.ProjectDetails) claudeAppDestination3).getParams();
                                }
                                ProjectDetailsScreenParams projectDetailsScreenParams = params;
                                zqcVar4 = zqcVar2;
                                ml3 ml3VarB8 = b(of6Var, zy7Var3, zqcVar4, claudeAppDestination3, null, e18Var, ((i16 >> 15) & 14) | ((i16 << 3) & 896) | ((i16 << 9) & 7168), 48);
                                boolean zBooleanValue3 = ((Boolean) wz5Var.getValue()).booleanValue();
                                int i34 = i16 & 112;
                                boolean zH10 = (i34 == 32 || ((i16 & 64) != 0 && e18Var.h(zqcVar4))) | e18Var.h(z93Var4) | e18Var.f(projectDetailsScreenParams);
                                Object objN48 = e18Var.N();
                                if (zH10 || objN48 == lz1Var) {
                                    objN48 = new d0(zqcVar4, z93Var4, projectDetailsScreenParams);
                                    e18Var.k0(objN48);
                                }
                                pz7 pz7Var3 = (pz7) objN48;
                                boolean zF12 = (i34 == 32 || ((i16 & 64) != 0 && e18Var.h(zqcVar4))) | e18Var.f(projectDetailsScreenParams);
                                Object objN49 = e18Var.N();
                                if (zF12 || objN49 == lz1Var) {
                                    objN49 = new l80(zqcVar4, 20, projectDetailsScreenParams);
                                    e18Var.k0(objN49);
                                }
                                zy7 zy7Var17 = (zy7) objN49;
                                boolean zF13 = ((i16 & 896) == 256 || ((i16 & 512) != 0 && e18Var.h(rweVar))) | e18Var.f(projectDetailsScreenParams);
                                Object objN50 = e18Var.N();
                                if (zF13 || objN50 == lz1Var) {
                                    objN50 = new ow1(rweVar, 11, projectDetailsScreenParams);
                                    e18Var.k0(objN50);
                                }
                                pz7 pz7Var4 = (pz7) objN50;
                                boolean zH11 = (i34 == 32 || ((i16 & 64) != 0 && e18Var.h(zqcVar4))) | e18Var.h(z93Var4) | e18Var.f(projectDetailsScreenParams);
                                Object objN51 = e18Var.N();
                                if (zH11 || objN51 == lz1Var) {
                                    objN51 = new ka1(zqcVar4, z93Var4, projectDetailsScreenParams, 7);
                                    e18Var.k0(objN51);
                                }
                                zy7 zy7Var18 = (zy7) objN51;
                                boolean z38 = i34 == 32 || ((i16 & 64) != 0 && e18Var.h(zqcVar4));
                                if ((i16 & 14) != 4 && ((i16 & 8) == 0 || !e18Var.h(claudeAppDestination3))) {
                                    z37 = false;
                                }
                                boolean z39 = z38 | z37;
                                Object objN52 = e18Var.N();
                                if (z39 || objN52 == lz1Var) {
                                    objN52 = new jj3(zqcVar4, claudeAppDestination3, 0);
                                    e18Var.k0(objN52);
                                }
                                int i35 = ml3.f;
                                iqb iqbVar12 = iqbVar3;
                                com.anthropic.claude.project.details.g.b(projectDetailsScreenParams, ml3VarB8, zBooleanValue3, pz7Var3, zy7Var17, pz7Var4, zy7Var18, (zy7) objN52, iqbVar12, null, null, e18Var, (i16 << 6) & 234881024);
                                iqbVar3 = iqbVar12;
                                e18Var.r();
                            } else if (claudeAppDestination2 instanceof ClaudeAppDestination.Detail.ProjectKnowledge) {
                                e18Var.a0(-1197993110);
                                ProjectKnowledgeScreenParams params7 = ((ClaudeAppDestination.Detail.ProjectKnowledge) claudeAppDestination2).getParams();
                                boolean z40 = (i16 & 112) == 32 || ((i16 & 64) != 0 && e18Var.h(zqcVar2));
                                if ((i16 & 14) == 4 || ((i16 & 8) != 0 && e18Var.h(claudeAppDestination2))) {
                                    z35 = true;
                                }
                                boolean z41 = z40 | z35;
                                Object objN53 = e18Var.N();
                                if (z41 || objN53 == lz1Var) {
                                    objN53 = new jj3(zqcVar2, claudeAppDestination2, 1);
                                    e18Var.k0(objN53);
                                }
                                iqb iqbVar13 = iqbVar3;
                                com.anthropic.claude.project.knowledge.l.a(params7, (zy7) objN53, iqbVar13, null, null, e18Var, (i16 >> 12) & 896);
                                iqbVar3 = iqbVar13;
                                e18Var.r();
                            } else {
                                if (claudeAppDestination2 instanceof ClaudeAppDestination.Detail.CreateTemplateProject) {
                                    e18Var.a0(-1197703570);
                                    int i36 = i16 & 112;
                                    boolean z42 = i36 == 32 || ((i16 & 64) != 0 && e18Var.h(zqcVar2));
                                    Object objN54 = e18Var.N();
                                    if (z42 || objN54 == lz1Var) {
                                        objN54 = new a21(5, zqcVar2);
                                        e18Var.k0(objN54);
                                    }
                                    pz7 pz7Var5 = (pz7) objN54;
                                    boolean z43 = i36 == 32 || ((i16 & 64) != 0 && e18Var.h(zqcVar2));
                                    if ((i16 & 14) == 4 || ((i16 & 8) != 0 && e18Var.h(claudeAppDestination2))) {
                                        z35 = true;
                                    }
                                    boolean z44 = z43 | z35;
                                    Object objN55 = e18Var.N();
                                    if (z44 || objN55 == lz1Var) {
                                        objN55 = new jj3(zqcVar2, claudeAppDestination2, 2);
                                        e18Var.k0(objN55);
                                    }
                                    iqb iqbVar14 = iqbVar3;
                                    cvk.f(pz7Var5, (zy7) objN55, ((ClaudeAppDestination.Detail.CreateTemplateProject) claudeAppDestination2).getParams(), iqbVar14, null, null, null, e18Var, (CreateTemplateProjectScreenParams.$stable << 6) | ((i16 >> 9) & 7168));
                                    iqbVar4 = iqbVar14;
                                    e18Var.r();
                                } else {
                                    iqbVar4 = iqbVar3;
                                    if (claudeAppDestination2 instanceof ClaudeAppDestination.Detail.TemplateUploadMaterialScreen) {
                                        e18Var.a0(-1196952440);
                                        UploadMaterialsScreenParams params8 = ((ClaudeAppDestination.Detail.TemplateUploadMaterialScreen) claudeAppDestination2).getParams();
                                        int i37 = i16 & 112;
                                        int i38 = i16 & 14;
                                        boolean z45 = (i37 == 32 || ((i16 & 64) != 0 && e18Var.h(zqcVar2))) | (i38 == 4 || ((i16 & 8) != 0 && e18Var.h(claudeAppDestination2)));
                                        Object objN56 = e18Var.N();
                                        if (z45 || objN56 == lz1Var) {
                                            objN56 = new jj3(zqcVar2, claudeAppDestination2, 3);
                                            e18Var.k0(objN56);
                                        }
                                        zy7 zy7Var19 = (zy7) objN56;
                                        boolean z46 = i37 == 32 || ((i16 & 64) != 0 && e18Var.h(zqcVar2));
                                        if (i38 == 4 || ((i16 & 8) != 0 && e18Var.h(claudeAppDestination2))) {
                                            z35 = true;
                                        }
                                        boolean z47 = z46 | z35;
                                        Object objN57 = e18Var.N();
                                        if (z47 || objN57 == lz1Var) {
                                            objN57 = new e0(zqcVar2, claudeAppDestination2);
                                            e18Var.k0(objN57);
                                        }
                                        qik.j(params8, zy7Var19, (bz7) objN57, null, null, null, e18Var, 0);
                                        e18Var.r();
                                    } else {
                                        if (claudeAppDestination2 instanceof ClaudeAppDestination.Detail.CodeRemoteSession) {
                                            e18Var.a0(-1196301936);
                                            CodeRemoteSessionScreenParams params9 = ((ClaudeAppDestination.Detail.CodeRemoteSession) claudeAppDestination2).getParams();
                                            boolean z48 = ((i16 & 112) == 32 || ((i16 & 64) != 0 && e18Var.h(zqcVar2))) | ((i16 & 14) == 4 || ((i16 & 8) != 0 && e18Var.h(claudeAppDestination2)));
                                            Object objN58 = e18Var.N();
                                            if (z48 || objN58 == lz1Var) {
                                                objN58 = new jj3(zqcVar2, claudeAppDestination2, 4);
                                                e18Var.k0(objN58);
                                            }
                                            zy7 zy7Var20 = (zy7) objN58;
                                            int i39 = i16 & 896;
                                            boolean z49 = i39 == 256 || ((i16 & 512) != 0 && e18Var.h(rweVar));
                                            Object objN59 = e18Var.N();
                                            if (z49 || objN59 == lz1Var) {
                                                objN59 = new kj3(rweVar, 1);
                                                e18Var.k0(objN59);
                                            }
                                            zy7 zy7Var21 = (zy7) objN59;
                                            if (i39 == 256 || ((i16 & 512) != 0 && e18Var.h(rweVar))) {
                                                z35 = true;
                                            }
                                            Object objN60 = e18Var.N();
                                            if (z35 || objN60 == lz1Var) {
                                                objN60 = new kj3(rweVar, 2);
                                                e18Var.k0(objN60);
                                            }
                                            g34.a(params9, zy7Var20, zy7Var21, null, (zy7) objN60, iqbVar4, null, null, null, null, e18Var, CodeRemoteSessionScreenParams.$stable | ((i16 >> 3) & 458752));
                                            iqbVar5 = iqbVar4;
                                            e18Var.r();
                                            claudeAppDestination3 = claudeAppDestination2;
                                        } else {
                                            iqbVar5 = iqbVar4;
                                            if (claudeAppDestination2 instanceof ClaudeAppDestination.List.Settings) {
                                                e18Var.a0(-1195736403);
                                                List<SettingsAppScreen> initialScreens = ((ClaudeAppDestination.List.Settings) claudeAppDestination2).getParams().getInitialScreens();
                                                ml3 ml3VarB9 = b(of6Var, zy7Var3, zqcVar2, claudeAppDestination, null, e18Var, ((i16 >> 15) & 14) | ((i16 << 3) & 896) | ((i16 << 9) & 7168), 48);
                                                int i40 = i16 & 896;
                                                boolean z50 = i40 == 256 || ((i16 & 512) != 0 && e18Var.h(rweVar));
                                                Object objN61 = e18Var.N();
                                                if (z50 || objN61 == lz1Var) {
                                                    objN61 = new kj3(rweVar, 3);
                                                    e18Var.k0(objN61);
                                                }
                                                zy7 zy7Var22 = (zy7) objN61;
                                                boolean z51 = i40 == 256 || ((i16 & 512) != 0 && e18Var.h(rweVar));
                                                Object objN62 = e18Var.N();
                                                if (z51 || objN62 == lz1Var) {
                                                    objN62 = new f0(rweVar);
                                                    e18Var.k0(objN62);
                                                }
                                                bz7 bz7Var10 = (bz7) objN62;
                                                boolean z52 = i40 == 256 || ((i16 & 512) != 0 && e18Var.h(rweVar));
                                                Object objN63 = e18Var.N();
                                                if (z52 || objN63 == lz1Var) {
                                                    objN63 = new x13(rweVar, 6);
                                                    e18Var.k0(objN63);
                                                }
                                                pz7 pz7Var6 = (pz7) objN63;
                                                boolean z53 = i40 == 256 || ((i16 & 512) != 0 && e18Var.h(rweVar));
                                                Object objN64 = e18Var.N();
                                                if (z53 || objN64 == lz1Var) {
                                                    objN64 = new kj3(rweVar, 4);
                                                    e18Var.k0(objN64);
                                                }
                                                zy7 zy7Var23 = (zy7) objN64;
                                                if (i40 == 256 || ((i16 & 512) != 0 && e18Var.h(rweVar))) {
                                                    z35 = true;
                                                }
                                                Object objN65 = e18Var.N();
                                                if (z35 || objN65 == lz1Var) {
                                                    objN65 = new kj3(rweVar, 5);
                                                    e18Var.k0(objN65);
                                                }
                                                zy7 zy7Var24 = (zy7) objN65;
                                                int i41 = ml3.f;
                                                com.anthropic.claude.settings.b.a(initialScreens, ml3VarB9, zy7Var22, zy7Var, bz7Var10, pz7Var6, zy7Var23, zy7Var24, e18Var, (i16 >> 3) & 7168);
                                                e18Var.r();
                                                claudeAppDestination3 = claudeAppDestination;
                                            } else if ((claudeAppDestination2 instanceof ClaudeAppDestination.List.AgentChat) || (claudeAppDestination2 instanceof ClaudeAppDestination.List.AgentChatTasks)) {
                                                e18Var.a0(-1194295089);
                                                boolean zC = ((qzb) gr9.b(e18Var).a(jce.a(qzb.class), null, null)).c();
                                                int i42 = i16 & 112;
                                                boolean z54 = i42 == 32 || ((i16 & 64) != 0 && e18Var.h(zqcVar2));
                                                Object objN66 = e18Var.N();
                                                if (z54 || objN66 == lz1Var) {
                                                    objN66 = new h0(zqcVar2);
                                                    e18Var.k0(objN66);
                                                }
                                                bz7 bz7Var11 = (bz7) objN66;
                                                ml3 ml3VarB10 = b(of6Var, zy7Var3, zqcVar2, claudeAppDestination, null, e18Var, ((i16 >> 15) & 14) | ((i16 << 3) & 896) | ((i16 << 9) & 7168), 48);
                                                if (zC && (claudeAppDestination instanceof ClaudeAppDestination.List.AgentChatTasks)) {
                                                    e18Var.a0(-1193228410);
                                                    int i43 = ml3.f;
                                                    zqcVar3 = zqcVar;
                                                    gok.a(ml3VarB10, bz7Var11, iqbVar5, null, e18Var, (i16 >> 12) & 896);
                                                    iqbVar3 = iqbVar5;
                                                    e18Var = e18Var;
                                                    e18Var.r();
                                                } else {
                                                    zqcVar3 = zqcVar;
                                                    iqbVar3 = iqbVar5;
                                                    e18Var.a0(-1193005737);
                                                    if (i42 == 32 || ((i16 & 64) != 0 && e18Var.h(zqcVar3))) {
                                                        z35 = true;
                                                    }
                                                    Object objN67 = e18Var.N();
                                                    if (z35 || objN67 == lz1Var) {
                                                        objN67 = new gj3(zqcVar3, 1);
                                                        e18Var.k0(objN67);
                                                    }
                                                    zy7 zy7Var25 = (zy7) objN67;
                                                    if (!zC) {
                                                        zy7Var25 = null;
                                                    }
                                                    int i44 = ml3.f;
                                                    ek.a(ml3VarB10, zy7Var25, bz7Var11, null, e18Var, 0);
                                                    e18Var = e18Var;
                                                    e18Var.r();
                                                }
                                                e18Var.r();
                                                claudeAppDestination3 = claudeAppDestination;
                                                zqcVar4 = zqcVar3;
                                            } else {
                                                if (claudeAppDestination2 instanceof ClaudeAppDestination.List.Conway) {
                                                    e18Var.a0(-1192597684);
                                                    Object objN68 = e18Var.N();
                                                    if (objN68 == lz1Var) {
                                                        objN68 = fd9.O(im6.E, e18Var);
                                                        e18Var.k0(objN68);
                                                    }
                                                    l45 l45Var = (l45) objN68;
                                                    pt4 pt4Var = (pt4) gr9.b(e18Var).c(jce.a(pt4.class));
                                                    if (pt4Var == null) {
                                                        e18Var.a0(-1192207829);
                                                        e18Var.r();
                                                        iqbVar6 = iqbVar5;
                                                    } else {
                                                        e18Var.a0(-1008289642);
                                                        boolean zF14 = e18Var.f(zy7Var3) | e18Var.h(l45Var) | ((i16 & 458752) == 131072);
                                                        Object objN69 = e18Var.N();
                                                        if (zF14 || objN69 == lz1Var) {
                                                            objN69 = new ka1(zy7Var3, l45Var, of6Var, 8);
                                                            e18Var.k0(objN69);
                                                        }
                                                        zy7 zy7Var26 = (zy7) objN69;
                                                        boolean z55 = (i16 & 112) == 32 || ((i16 & 64) != 0 && e18Var.h(zqcVar2));
                                                        Object objN70 = e18Var.N();
                                                        if (z55 || objN70 == lz1Var) {
                                                            objN70 = new gj3(zqcVar2, 2);
                                                            e18Var.k0(objN70);
                                                        }
                                                        ((rt4) pt4Var).a((i16 >> 18) & 14, e18Var, zy7Var26, (zy7) objN70, iqbVar5);
                                                        e18Var = e18Var;
                                                        iqbVar6 = iqbVar5;
                                                        e18Var.r();
                                                    }
                                                    e18Var.r();
                                                    claudeAppDestination3 = claudeAppDestination2;
                                                    zqcVar4 = zqcVar2;
                                                } else {
                                                    iqbVar6 = iqbVar5;
                                                    if (!(claudeAppDestination2 instanceof ClaudeAppDestination.List.Tasks)) {
                                                        e18Var.a0(-1009391303);
                                                        e18Var.r();
                                                        mr9.b();
                                                        return;
                                                    }
                                                    e18Var.a0(-1191402169);
                                                    zqcVar4 = zqcVar2;
                                                    ml3 ml3VarB11 = b(of6Var, zy7Var3, zqcVar4, claudeAppDestination2, null, e18Var, ((i16 >> 15) & 14) | ((i16 << 3) & 896) | ((i16 << 9) & 7168), 48);
                                                    boolean zH12 = e18Var.h(z93Var4) | ((i16 & 112) == 32 || ((i16 & 64) != 0 && e18Var.h(zqcVar4)));
                                                    Object objN71 = e18Var.N();
                                                    if (zH12 || objN71 == lz1Var) {
                                                        objN71 = new g0(zqcVar4, z93Var4);
                                                        e18Var.k0(objN71);
                                                    }
                                                    int i45 = ml3.f;
                                                    com.anthropic.claude.tasks.ui.y.b(ml3VarB11, (pz7) objN71, iqbVar6, e18Var, (i16 >> 12) & 896);
                                                    e18Var.r();
                                                    claudeAppDestination3 = claudeAppDestination;
                                                }
                                                iqbVar3 = iqbVar6;
                                            }
                                        }
                                        zqcVar4 = zqcVar2;
                                        iqbVar3 = iqbVar5;
                                    }
                                }
                                iqbVar3 = iqbVar4;
                            }
                        }
                        claudeAppDestination3 = claudeAppDestination2;
                        zqcVar4 = zqcVar2;
                    }
                }
            }
            z93Var2 = z93Var4;
            iqbVar2 = iqbVar3;
            qi3Var2 = qi3Var4;
            b1iVar2 = b1iVar4;
        } else {
            e18Var.T();
            iqbVar2 = iqbVar;
            z93Var2 = z93Var;
            b1iVar2 = b1iVar;
            qi3Var2 = qi3Var;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            final ClaudeAppDestination claudeAppDestination4 = claudeAppDestination3;
            r7eVarS.e(new pz7() { // from class: lj3
                @Override // defpackage.pz7
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    i0.a(claudeAppDestination4, zqcVar4, rweVar, xk3Var, zy7Var, of6Var, iqbVar2, z93Var2, b1iVar2, qi3Var2, (ld4) obj, x44.p0(i | 1));
                    return iei.a;
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x006a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final defpackage.ml3 b(defpackage.of6 r15, defpackage.zy7 r16, defpackage.zqc r17, com.anthropic.claude.app.ClaudeAppDestination r18, defpackage.zy7 r19, defpackage.ld4 r20, int r21, int r22) {
        /*
            Method dump skipped, instruction units count: 305
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anthropic.claude.app.i0.b(of6, zy7, zqc, com.anthropic.claude.app.ClaudeAppDestination, zy7, ld4, int, int):ml3");
    }

    public static final void c(zqc zqcVar, ClaudeAppDestination claudeAppDestination) {
        if (claudeAppDestination instanceof ClaudeAppDestination.List) {
            oua ouaVar = new oua(12);
            zqcVar.getClass();
            zqcVar.E.m(new kac(20), ouaVar);
            return;
        }
        if (claudeAppDestination instanceof ClaudeAppDestination.Detail) {
            oua ouaVar2 = new oua(13);
            zqcVar.getClass();
            zqcVar.E.m(new kac(21), ouaVar2);
            return;
        }
        if (!(claudeAppDestination instanceof ClaudeAppDestination.Extra)) {
            mr9.b();
            return;
        }
        oua ouaVar3 = new oua(14);
        zqcVar.getClass();
        zqcVar.E.m(new kac(22), ouaVar3);
    }
}
