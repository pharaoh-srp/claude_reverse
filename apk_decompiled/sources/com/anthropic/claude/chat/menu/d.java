package com.anthropic.claude.chat.menu;

import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.R;
import com.anthropic.claude.api.chat.ChatConversationWithProjectReference;
import com.anthropic.claude.chat.menu.ChatItemMenuDialogDestination;
import com.anthropic.claude.chat.menu.d;
import com.anthropic.claude.types.strings.ChatId;
import com.pvporbit.freetype.FreeTypeConstants;
import defpackage.bz7;
import defpackage.csg;
import defpackage.d4c;
import defpackage.e18;
import defpackage.eve;
import defpackage.fd9;
import defpackage.fqb;
import defpackage.gik;
import defpackage.iqb;
import defpackage.iv1;
import defpackage.j8;
import defpackage.jce;
import defpackage.jd4;
import defpackage.kce;
import defpackage.kgh;
import defpackage.kx2;
import defpackage.kxk;
import defpackage.ld4;
import defpackage.lz1;
import defpackage.m7f;
import defpackage.mwa;
import defpackage.nfe;
import defpackage.o5;
import defpackage.oq5;
import defpackage.oy2;
import defpackage.px2;
import defpackage.pz7;
import defpackage.qd5;
import defpackage.qx2;
import defpackage.r7e;
import defpackage.rc1;
import defpackage.rwe;
import defpackage.sf5;
import defpackage.sq6;
import defpackage.va0;
import defpackage.vx5;
import defpackage.x44;
import defpackage.zy7;
import java.util.List;
import java.util.Set;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes.dex */
public abstract class d {
    public static final void a(final ChatConversationWithProjectReference chatConversationWithProjectReference, final boolean z, final zy7 zy7Var, final zy7 zy7Var2, final bz7 bz7Var, final zy7 zy7Var3, final zy7 zy7Var4, final zy7 zy7Var5, final zy7 zy7Var6, iqb iqbVar, b bVar, qx2 qx2Var, oy2 oy2Var, ld4 ld4Var, final int i, final int i2) {
        int i3;
        zy7 zy7Var7;
        zy7 zy7Var8;
        bz7 bz7Var2;
        zy7 zy7Var9;
        zy7 zy7Var10;
        int i4;
        e18 e18Var;
        final iqb iqbVar2;
        final b bVar2;
        final qx2 qx2Var2;
        final oy2 oy2Var2;
        b bVarD;
        iqb iqbVar3;
        int i5;
        qx2 qx2Var3;
        oy2 oy2Var3;
        b bVar3;
        chatConversationWithProjectReference.getClass();
        zy7Var.getClass();
        zy7Var2.getClass();
        bz7Var.getClass();
        zy7Var3.getClass();
        zy7Var4.getClass();
        zy7Var5.getClass();
        zy7Var6.getClass();
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(-1595148152);
        if ((i & 6) == 0) {
            i3 = (e18Var2.f(chatConversationWithProjectReference) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= e18Var2.g(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            zy7Var7 = zy7Var;
            i3 |= e18Var2.h(zy7Var7) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : 128;
        } else {
            zy7Var7 = zy7Var;
        }
        if ((i & 3072) == 0) {
            zy7Var8 = zy7Var2;
            i3 |= e18Var2.h(zy7Var8) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE;
        } else {
            zy7Var8 = zy7Var2;
        }
        if ((i & 24576) == 0) {
            bz7Var2 = bz7Var;
            i3 |= e18Var2.h(bz7Var2) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN;
        } else {
            bz7Var2 = bz7Var;
        }
        if ((196608 & i) == 0) {
            zy7Var9 = zy7Var3;
            i3 |= e18Var2.h(zy7Var9) ? 131072 : 65536;
        } else {
            zy7Var9 = zy7Var3;
        }
        if ((1572864 & i) == 0) {
            zy7Var10 = zy7Var4;
            i3 |= e18Var2.h(zy7Var10) ? FreeTypeConstants.FT_LOAD_COLOR : 524288;
        } else {
            zy7Var10 = zy7Var4;
        }
        if ((i & 12582912) == 0) {
            i3 |= e18Var2.h(zy7Var5) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i3 |= e18Var2.h(zy7Var6) ? 67108864 : 33554432;
        }
        int i6 = i3 | 805306368;
        char c = ((i2 & FreeTypeConstants.FT_LOAD_NO_RECURSE) == 0 && e18Var2.f(bVar)) ? (char) 4 : (char) 2;
        int i7 = i2 & FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM;
        if (i7 != 0) {
            i4 = c | '0';
        } else {
            i4 = c | (e18Var2.d(qx2Var == null ? -1 : qx2Var.ordinal()) ? ' ' : (char) 16);
        }
        int i8 = i4 | FreeTypeConstants.FT_LOAD_PEDANTIC;
        boolean z2 = true;
        if (e18Var2.Q(i6 & 1, ((i6 & 306783379) == 306783378 && (i8 & 147) == 146) ? false : true)) {
            e18Var2.V();
            int i9 = i & 1;
            lz1 lz1Var = jd4.a;
            if (i9 == 0 || e18Var2.A()) {
                if ((i2 & FreeTypeConstants.FT_LOAD_NO_RECURSE) != 0) {
                    bVarD = d(chatConversationWithProjectReference, e18Var2);
                    i8 &= -15;
                } else {
                    bVarD = bVar;
                }
                qx2 qx2Var4 = i7 != 0 ? null : qx2Var;
                b bVar4 = bVarD;
                m7f m7fVarN = sq6.n(e18Var2, -1168520582, e18Var2, -1633490746);
                boolean zF = e18Var2.f(null) | e18Var2.f(m7fVarN);
                Object objN = e18Var2.N();
                if (zF || objN == lz1Var) {
                    objN = m7fVarN.a(jce.a.b(oy2.class), null, null);
                    e18Var2.k0(objN);
                }
                e18Var2.p(false);
                e18Var2.p(false);
                iqbVar3 = fqb.E;
                i5 = i8 & (-897);
                qx2Var3 = qx2Var4;
                oy2Var3 = (oy2) objN;
                bVar3 = bVar4;
            } else {
                e18Var2.T();
                if ((i2 & FreeTypeConstants.FT_LOAD_NO_RECURSE) != 0) {
                    i8 &= -15;
                }
                iqbVar3 = iqbVar;
                bVar3 = bVar;
                qx2Var3 = qx2Var;
                oy2Var3 = oy2Var;
                i5 = i8 & (-897);
            }
            e18Var2.q();
            boolean z3 = (i5 & 112) == 32;
            if ((((i5 & 14) ^ 6) <= 4 || !e18Var2.f(bVar3)) && (i5 & 6) != 4) {
                z2 = false;
            }
            boolean z4 = z3 | z2;
            Object objN2 = e18Var2.N();
            if (z4 || objN2 == lz1Var) {
                objN2 = new c(qx2Var3, bVar3, null);
                e18Var2.k0(objN2);
            }
            fd9.i(e18Var2, (pz7) objN2, qx2Var3);
            b bVar5 = bVar3;
            int i10 = i6 >> 3;
            j8.b(z, zy7Var, iqbVar3, (((long) Float.floatToRawIntBits(-8.0f)) << 32) | (((long) Float.floatToRawIntBits(MTTypesetterKt.kLineSkipLimitMultiplier)) & 4294967295L), null, null, null, 0L, MTTypesetterKt.kLineSkipLimitMultiplier, fd9.q0(944009067, new kx2(bVar5, chatConversationWithProjectReference, zy7Var8, zy7Var7, oy2Var3, zy7Var6, bz7Var2), e18Var2), e18Var2, (i10 & 112) | (i10 & 14) | 3072 | ((i6 >> 21) & 896), 2032);
            e18Var = e18Var2;
            mwa.l(bVar5.a, null, null, fd9.q0(-2027846033, new va0(chatConversationWithProjectReference, zy7Var9, zy7Var10, bVar5, zy7Var, zy7Var5, 1), e18Var2), e18Var, 3072, 6);
            qx2Var2 = qx2Var3;
            oy2Var2 = oy2Var3;
            iqbVar2 = iqbVar3;
            bVar2 = bVar5;
        } else {
            e18Var = e18Var2;
            e18Var.T();
            iqbVar2 = iqbVar;
            bVar2 = bVar;
            qx2Var2 = qx2Var;
            oy2Var2 = oy2Var;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new pz7() { // from class: ox2
                @Override // defpackage.pz7
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iP0 = x44.p0(i | 1);
                    d.a(chatConversationWithProjectReference, z, zy7Var, zy7Var2, bz7Var, zy7Var3, zy7Var4, zy7Var5, zy7Var6, iqbVar2, bVar2, qx2Var2, oy2Var2, (ld4) obj, iP0, i2);
                    return iei.a;
                }
            };
        }
    }

    public static final void b(final String str, final ChatItemMenuDialogDestination chatItemMenuDialogDestination, final zy7 zy7Var, final zy7 zy7Var2, final zy7 zy7Var3, final zy7 zy7Var4, nfe nfeVar, vx5 vx5Var, ld4 ld4Var, final int i) {
        int i2;
        final nfe nfeVar2;
        final vx5 vx5Var2;
        int i3;
        vx5 vx5VarJ;
        nfe nfeVar3;
        vx5 vx5Var3;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-1343453711);
        if ((i & 6) == 0) {
            i2 = (e18Var.f(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? e18Var.f(chatItemMenuDialogDestination) : e18Var.h(chatItemMenuDialogDestination) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= e18Var.h(zy7Var) ? 256 : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        if ((i & 3072) == 0) {
            i2 |= e18Var.h(zy7Var2) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE;
        }
        if ((i & 24576) == 0) {
            i2 |= e18Var.h(zy7Var3) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN;
        }
        if ((196608 & i) == 0) {
            i2 |= e18Var.h(zy7Var4) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= 4194304;
        }
        final int i4 = 0;
        if (e18Var.Q(i2 & 1, (4793491 & i2) != 4793490)) {
            e18Var.V();
            if ((i & 1) == 0 || e18Var.A()) {
                nfe nfeVarH = kxk.H(str, e18Var, i2 & 14);
                i3 = i2 & (-33030145);
                vx5VarJ = csg.J(str, e18Var, i2 & 14);
                nfeVar3 = nfeVarH;
            } else {
                e18Var.T();
                nfeVar3 = nfeVar;
                i3 = i2 & (-33030145);
                vx5VarJ = vx5Var;
            }
            e18Var.q();
            if (x44.r(chatItemMenuDialogDestination, ChatItemMenuDialogDestination.Dismissed.INSTANCE)) {
                e18Var.a0(1971199279);
                e18Var.p(false);
            } else {
                boolean zR = x44.r(chatItemMenuDialogDestination, ChatItemMenuDialogDestination.Rename.INSTANCE);
                lz1 lz1Var = jd4.a;
                if (zR) {
                    e18Var.a0(1971258613);
                    boolean z = ((i3 & 896) == 256) | ((i3 & 57344) == 16384);
                    Object objN = e18Var.N();
                    if (z || objN == lz1Var) {
                        objN = new o5(zy7Var3, 10, zy7Var);
                        e18Var.k0(objN);
                    }
                    kxk.f(nfeVar3, (bz7) objN, zy7Var3, e18Var, (i3 >> 6) & 896);
                    e18Var.p(false);
                } else if (x44.r(chatItemMenuDialogDestination, ChatItemMenuDialogDestination.Delete.INSTANCE)) {
                    e18Var.a0(1971558197);
                    boolean z2 = ((i3 & 57344) == 16384) | ((i3 & 7168) == 2048);
                    Object objN2 = e18Var.N();
                    if (z2 || objN2 == lz1Var) {
                        objN2 = new zy7() { // from class: mx2
                            @Override // defpackage.zy7
                            public final Object a() {
                                int i5 = i4;
                                iei ieiVar = iei.a;
                                zy7 zy7Var5 = zy7Var2;
                                zy7 zy7Var6 = zy7Var3;
                                switch (i5) {
                                    case 0:
                                        zy7Var6.a();
                                        zy7Var5.a();
                                        break;
                                    default:
                                        zy7Var6.a();
                                        zy7Var5.a();
                                        break;
                                }
                                return ieiVar;
                            }
                        };
                        e18Var.k0(objN2);
                    }
                    csg.d(vx5VarJ, (zy7) objN2, zy7Var3, e18Var, (i3 >> 6) & 896);
                    e18Var.p(false);
                } else {
                    if (!x44.r(chatItemMenuDialogDestination, ChatItemMenuDialogDestination.ChangeProject.INSTANCE)) {
                        throw kgh.s(e18Var, 1726153758, false);
                    }
                    e18Var.a0(1971865097);
                    Set setF0 = sf5.f0(ChatId.m978boximpl(str));
                    boolean z3 = ((i3 & 57344) == 16384) | ((458752 & i3) == 131072);
                    Object objN3 = e18Var.N();
                    if (z3 || objN3 == lz1Var) {
                        final int i5 = 1;
                        objN3 = new zy7() { // from class: mx2
                            @Override // defpackage.zy7
                            public final Object a() {
                                int i52 = i5;
                                iei ieiVar = iei.a;
                                zy7 zy7Var5 = zy7Var4;
                                zy7 zy7Var6 = zy7Var3;
                                switch (i52) {
                                    case 0:
                                        zy7Var6.a();
                                        zy7Var5.a();
                                        break;
                                    default:
                                        zy7Var6.a();
                                        zy7Var5.a();
                                        break;
                                }
                                return ieiVar;
                            }
                        };
                        e18Var.k0(objN3);
                    }
                    vx5Var3 = vx5VarJ;
                    gik.a(setF0, (zy7) objN3, zy7Var3, null, e18Var, (i3 >> 6) & 896);
                    e18Var.p(false);
                    vx5Var2 = vx5Var3;
                    nfeVar2 = nfeVar3;
                }
            }
            vx5Var3 = vx5VarJ;
            vx5Var2 = vx5Var3;
            nfeVar2 = nfeVar3;
        } else {
            e18Var.T();
            nfeVar2 = nfeVar;
            vx5Var2 = vx5Var;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new pz7() { // from class: nx2
                @Override // defpackage.pz7
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    d.b(str, chatItemMenuDialogDestination, zy7Var, zy7Var2, zy7Var3, zy7Var4, nfeVar2, vx5Var2, (ld4) obj, x44.p0(i | 1));
                    return iei.a;
                }
            };
        }
    }

    public static final List c(boolean z, zy7 zy7Var, zy7 zy7Var2, zy7 zy7Var3, ld4 ld4Var, int i) {
        zy7Var.getClass();
        zy7Var2.getClass();
        zy7Var3.getClass();
        String strJ0 = d4c.j0(R.string.chat_rename, ld4Var);
        String strJ02 = d4c.j0(z ? R.string.chat_unstar : R.string.chat_star, ld4Var);
        String strJ03 = d4c.j0(R.string.chat_delete, ld4Var);
        e18 e18Var = (e18) ld4Var;
        boolean zF = ((((i & 7168) ^ 3072) > 2048 && e18Var.f(zy7Var3)) || (i & 3072) == 2048) | e18Var.f(strJ0) | e18Var.f(strJ02) | e18Var.f(strJ03) | ((((i & 112) ^ 48) > 32 && e18Var.f(zy7Var)) || (i & 48) == 32) | ((((i & 896) ^ 384) > 256 && e18Var.f(zy7Var2)) || (i & 384) == 256);
        Object objN = e18Var.N();
        if (zF || objN == jd4.a) {
            objN = x44.X(new qd5(new px2(0, zy7Var), strJ0), new qd5(new px2(1, zy7Var2), strJ02), new qd5(new px2(2, zy7Var3), strJ03));
            e18Var.k0(objN);
        }
        return (List) objN;
    }

    public static final b d(ChatConversationWithProjectReference chatConversationWithProjectReference, ld4 ld4Var) {
        chatConversationWithProjectReference.getClass();
        kce kceVar = jce.a;
        String strO = kgh.o(oq5.B(kceVar.b(ChatItemMenuDialogDestination.class)), chatConversationWithProjectReference.m209getUuidRjYBDck());
        e18 e18Var = (e18) ld4Var;
        Object objN = e18Var.N();
        lz1 lz1Var = jd4.a;
        if (objN == lz1Var) {
            objN = new rc1(19);
            e18Var.k0(objN);
        }
        KSerializer kSerializerM = iv1.M(kceVar.b(ChatItemMenuDialogDestination.class));
        rwe rweVarP = eve.P(kceVar.b(ChatItemMenuDialogDestination.class), strO, true, kSerializerM, (zy7) objN, e18Var);
        x44.q0(rweVarP, e18Var);
        boolean zF = e18Var.f(rweVarP);
        Object objN2 = e18Var.N();
        if (zF || objN2 == lz1Var) {
            objN2 = new b(rweVarP);
            e18Var.k0(objN2);
        }
        return (b) objN2;
    }
}
