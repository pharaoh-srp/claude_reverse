package defpackage;

import android.content.Context;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.b;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.R;
import com.anthropic.claude.api.chat.ChatFeedbackType;
import com.anthropic.claude.api.experience.ExperienceAsset;
import com.anthropic.claude.api.experience.ExperienceAssetImageVariants;
import com.anthropic.claude.api.experience.ExperienceAssetScaledImage;
import com.anthropic.claude.chat.parse.ParsedContentBlock$McpToolInvocation;
import com.pvporbit.freetype.FreeTypeConstants;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class wjk {
    public static final ta4 a = new ta4(653081593, false, new ob4(9));
    public static final ta4 b = new ta4(-1618259051, false, new ob4(12));
    public static final ta4 c = new ta4(-1295762556, false, new hb4(24));
    public static final ta4 d = new ta4(1430722507, false, new ob4(13));
    public static final ta4 e = new ta4(-1908429253, false, new hb4(25));
    public static final ta4 f = new ta4(-1686334270, false, new ob4(14));
    public static final ta4 g = new ta4(522321212, false, new hb4(26));
    public static final ta4 h = new ta4(744416195, false, new ob4(15));
    public static final ta4 i = new ta4(1578215450, false, new hb4(22));
    public static final ta4 j = new ta4(747561816, false, new hb4(23));
    public static final ta4 k = new ta4(-1096885517, false, new ob4(10));
    public static final ta4 l = new ta4(-1512212334, false, new ob4(11));

    public static final void a(String str, iqb iqbVar, Integer num, ld4 ld4Var, int i2) {
        e18 e18Var;
        iqb iqbVar2;
        fqb fqbVar;
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(-1766816274);
        int i3 = i2 | (e18Var2.f(str) ? 4 : 2) | 48 | (e18Var2.f(num) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC);
        if (e18Var2.Q(i3 & 1, (i3 & 147) != 146)) {
            vo1 vo1Var = lja.S;
            fqb fqbVar2 = fqb.E;
            iqb iqbVarC = b.c(fqbVar2, 1.0f);
            q64 q64VarA = p64.a(ko0.c, vo1Var, e18Var2, 48);
            int iHashCode = Long.hashCode(e18Var2.T);
            hyc hycVarL = e18Var2.l();
            iqb iqbVarE = kxk.E(e18Var2, iqbVarC);
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
            if (num == null) {
                e18Var2.a0(617788144);
                fqbVar = fqbVar2;
                tjh.b(str, gb9.L(fqbVar2, 4.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 2), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, (tkh) ((wk) gm3.c(e18Var2).e.F).f, e18Var2, (i3 & 14) | 48, 0, 131068);
                e18Var = e18Var2;
                e18Var.p(false);
            } else {
                e18Var2.a0(617990264);
                int iE0 = wd6.e0(num.intValue(), 0, str.length());
                e18Var2.a0(297032642);
                xb0 xb0Var = new xb0();
                int iM = xb0Var.m(new egg(gm3.a(e18Var2).M, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 65534));
                try {
                    xb0Var.d(0, iE0, str);
                    xb0Var.j(iM);
                    iM = xb0Var.m(new egg(gm3.a(e18Var2).O, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 65534));
                    try {
                        xb0Var.d(iE0, str.length(), str);
                        xb0Var.j(iM);
                        zb0 zb0VarN = xb0Var.n();
                        e18Var2.p(false);
                        fqbVar = fqbVar2;
                        tjh.c(zb0VarN, gb9.L(fqbVar2, 4.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 2), 0L, 0L, 0L, null, 0L, 0, false, 0, 0, null, null, (tkh) ((wk) gm3.c(e18Var2).e.F).f, e18Var2, 48, 0, 262140);
                        e18Var = e18Var2;
                        e18Var.p(false);
                    } finally {
                    }
                } finally {
                }
            }
            e18Var.p(true);
            iqbVar2 = fqbVar;
        } else {
            e18Var = e18Var2;
            e18Var.T();
            iqbVar2 = iqbVar;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new sx0(str, iqbVar2, num, i2, 1);
        }
    }

    public static final void b(String str, int i2, zy7 zy7Var, iqb iqbVar, db3 db3Var, ld4 ld4Var, int i3) {
        iqb iqbVar2;
        db3 db3Var2;
        db3 db3Var3;
        int i4;
        iqb iqbVar3;
        str.getClass();
        zy7Var.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(789941197);
        int i5 = i3 | (e18Var.f(str) ? 4 : 2) | (e18Var.d(i2) ? 32 : 16) | (e18Var.h(zy7Var) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC) | 11264;
        if (e18Var.Q(i5 & 1, (i5 & 9363) != 9362)) {
            e18Var.V();
            int i6 = i3 & 1;
            lz1 lz1Var = jd4.a;
            if (i6 == 0 || e18Var.A()) {
                m7f m7fVar = (m7f) e18Var.j(gr9.b);
                Context context = (Context) e18Var.j(w00.b);
                boolean zH = ((((i5 & 14) ^ 6) > 4 && e18Var.f(str)) || (i5 & 6) == 4) | e18Var.h(context) | ((((i5 & 112) ^ 48) > 32 && e18Var.d(i2)) || (i5 & 48) == 32) | e18Var.h(m7fVar);
                Object objN = e18Var.N();
                if (zH || objN == lz1Var) {
                    eb3 eb3Var = new eb3(context, str, i2, m7fVar, 0);
                    e18Var.k0(eb3Var);
                    objN = eb3Var;
                }
                kce kceVar = jce.a;
                db3Var3 = (db3) fd9.r0(kceVar.b(db3.class), oq5.B(kceVar.b(db3.class)), (bz7) objN, e18Var);
                i4 = i5 & (-57345);
                iqbVar3 = fqb.E;
            } else {
                e18Var.T();
                i4 = i5 & (-57345);
                iqbVar3 = iqbVar;
                db3Var3 = db3Var;
            }
            e18Var.q();
            int i7 = 3;
            r4g r4gVarS = gb9.S(u4g.F, null, null, zy7Var, e18Var, ((i4 << 3) & 7168) | 6, 6);
            Object objN2 = e18Var.N();
            if (objN2 == lz1Var) {
                objN2 = sq6.p(e18Var);
            }
            ybg ybgVar = (ybg) objN2;
            boolean zF = e18Var.f(db3Var3);
            Object objN3 = e18Var.N();
            if (zF || objN3 == lz1Var) {
                objN3 = new jp(db3Var3, null, i7);
                e18Var.k0(objN3);
            }
            csg.g((bz7) objN3, e18Var, 0, 1);
            db3 db3Var4 = db3Var3;
            iqb iqbVar4 = iqbVar3;
            vkc.a(r4gVarS, d4c.j0(R.string.chat_sharing_snapshot_title, e18Var), iqbVar4, null, false, false, null, null, null, null, null, ybgVar, fd9.q0(-772196814, new ci(i7, db3Var3), e18Var), e18Var, 392, 3456, 4088);
            zni.g(db3Var4.k, ybgVar, e18Var, 48);
            iqbVar2 = iqbVar4;
            db3Var2 = db3Var4;
        } else {
            e18Var.T();
            iqbVar2 = iqbVar;
            db3Var2 = db3Var;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new xd(str, i2, zy7Var, iqbVar2, db3Var2, i3);
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final void c(final ExperienceAsset experienceAsset, final iqb iqbVar, final yw8 yw8Var, ld4 ld4Var, final int i2) {
        iqb iqbVar2;
        r7e r7eVarS;
        pz7 pz7Var;
        jo4 jo4Var;
        d54 d54Var;
        experienceAsset.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-636513988);
        int i3 = (i2 & 6) == 0 ? (e18Var.f(experienceAsset) ? 4 : 2) | i2 : i2;
        if ((i2 & 48) == 0) {
            i3 |= e18Var.f(iqbVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= (i2 & 512) == 0 ? e18Var.f(yw8Var) : e18Var.h(yw8Var) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        if (e18Var.Q(i3 & 1, (i3 & 147) != 146)) {
            e18Var.V();
            if ((i2 & 1) != 0 && !e18Var.A()) {
                e18Var.T();
            }
            e18Var.q();
            String strR = r(experienceAsset, e18Var, i3 & 14);
            if (strR == null) {
                r7eVarS = e18Var.s();
                if (r7eVarS != null) {
                    final int i4 = 0;
                    pz7Var = new pz7() { // from class: s87
                        @Override // defpackage.pz7
                        public final Object invoke(Object obj, Object obj2) {
                            int i5 = i4;
                            iei ieiVar = iei.a;
                            int i6 = i2;
                            yw8 yw8Var2 = yw8Var;
                            iqb iqbVar3 = iqbVar;
                            ExperienceAsset experienceAsset2 = experienceAsset;
                            ld4 ld4Var2 = (ld4) obj;
                            ((Integer) obj2).getClass();
                            switch (i5) {
                                case 0:
                                    wjk.c(experienceAsset2, iqbVar3, yw8Var2, ld4Var2, x44.p0(i6 | 1));
                                    break;
                                default:
                                    wjk.c(experienceAsset2, iqbVar3, yw8Var2, ld4Var2, x44.p0(i6 | 1));
                                    break;
                            }
                            return ieiVar;
                        }
                    };
                    r7eVarS.d = pz7Var;
                }
                return;
            }
            iqbVar2 = iqbVar;
            int i5 = t87.a[experienceAsset.getResize_mode().ordinal()];
            if (i5 == 1 || i5 == 2 || i5 == 3) {
                jo4Var = ho4.b;
            } else {
                if (i5 != 4) {
                    wg6.i();
                    return;
                }
                jo4Var = ho4.c;
            }
            String background_color = experienceAsset.getBackground_color();
            d54 d54Var2 = null;
            if (background_color == null) {
                e18Var.a0(-107067251);
                e18Var.p(false);
            } else {
                e18Var.a0(-107067250);
                jl3 jl3VarA = gm3.a(e18Var);
                jl3VarA.getClass();
                switch (background_color.hashCode()) {
                    case -1606890035:
                        if (background_color.equals("accentPro000")) {
                            d54Var = new d54(jl3VarA.f);
                            d54Var2 = d54Var;
                        }
                        break;
                    case -1606889074:
                        if (background_color.equals("accentPro100")) {
                            d54Var = new d54(jl3VarA.g);
                            d54Var2 = d54Var;
                        }
                        break;
                    case -1606888113:
                        if (background_color.equals("accentPro200")) {
                            d54Var = new d54(jl3VarA.h);
                            d54Var2 = d54Var;
                        }
                        break;
                    case -1606881386:
                        if (background_color.equals("accentPro900")) {
                            d54Var = new d54(jl3VarA.i);
                            d54Var2 = d54Var;
                        }
                        break;
                    case -1426884179:
                        if (background_color.equals("accentMain000")) {
                            d54Var = new d54(jl3VarA.b);
                            d54Var2 = d54Var;
                        }
                        break;
                    case -1426883218:
                        if (background_color.equals("accentMain100")) {
                            d54Var = new d54(jl3VarA.c);
                            d54Var2 = d54Var;
                        }
                        break;
                    case -1426882257:
                        if (background_color.equals("accentMain200")) {
                            d54Var = new d54(jl3VarA.d);
                            d54Var2 = d54Var;
                        }
                        break;
                    case -1426875530:
                        if (background_color.equals("accentMain900")) {
                            d54Var = new d54(jl3VarA.e);
                            d54Var2 = d54Var;
                        }
                        break;
                    case -1417884252:
                        if (background_color.equals("text100")) {
                            d54Var = new d54(jl3VarA.M);
                            d54Var2 = d54Var;
                        }
                        break;
                    case -1417882330:
                        if (background_color.equals("text300")) {
                            d54Var = new d54(jl3VarA.N);
                            d54Var2 = d54Var;
                        }
                        break;
                    case -1417880408:
                        if (background_color.equals("text500")) {
                            d54Var = new d54(jl3VarA.O);
                            d54Var2 = d54Var;
                        }
                        break;
                    case -1216230099:
                        if (background_color.equals("danger000")) {
                            d54Var = new d54(jl3VarA.x);
                            d54Var2 = d54Var;
                        }
                        break;
                    case -1216229138:
                        if (background_color.equals("danger100")) {
                            d54Var = new d54(jl3VarA.y);
                            d54Var2 = d54Var;
                        }
                        break;
                    case -1216228177:
                        if (background_color.equals("danger200")) {
                            d54Var = new d54(jl3VarA.z);
                            d54Var2 = d54Var;
                        }
                        break;
                    case -1216221450:
                        if (background_color.equals("danger900")) {
                            d54Var = new d54(jl3VarA.A);
                            d54Var2 = d54Var;
                        }
                        break;
                    case -1173154595:
                        if (background_color.equals("accentBrand")) {
                            d54Var = new d54(jl3VarA.a);
                            d54Var2 = d54Var;
                        }
                        break;
                    case -733685939:
                        if (background_color.equals("success000")) {
                            d54Var = new d54(jl3VarA.B);
                            d54Var2 = d54Var;
                        }
                        break;
                    case -733684978:
                        if (background_color.equals("success100")) {
                            d54Var = new d54(jl3VarA.C);
                            d54Var2 = d54Var;
                        }
                        break;
                    case -733684017:
                        if (background_color.equals("success200")) {
                            d54Var = new d54(jl3VarA.D);
                            d54Var2 = d54Var;
                        }
                        break;
                    case -733677290:
                        if (background_color.equals("success900")) {
                            d54Var = new d54(jl3VarA.E);
                            d54Var2 = d54Var;
                        }
                        break;
                    case 93621195:
                        if (background_color.equals("bg000")) {
                            d54Var = new d54(jl3VarA.n);
                            d54Var2 = d54Var;
                        }
                        break;
                    case 93622156:
                        if (background_color.equals("bg100")) {
                            d54Var = new d54(jl3VarA.o);
                            d54Var2 = d54Var;
                        }
                        break;
                    case 93623117:
                        if (background_color.equals("bg200")) {
                            d54Var = new d54(jl3VarA.p);
                            d54Var2 = d54Var;
                        }
                        break;
                    case 93624078:
                        if (background_color.equals("bg300")) {
                            d54Var = new d54(jl3VarA.q);
                            d54Var2 = d54Var;
                        }
                        break;
                    case 93625039:
                        if (background_color.equals("bg400")) {
                            d54Var = new d54(jl3VarA.r);
                            d54Var2 = d54Var;
                        }
                        break;
                    case 93626000:
                        if (background_color.equals("bg500")) {
                            d54Var = new d54(jl3VarA.s);
                            d54Var2 = d54Var;
                        }
                        break;
                    case 197380677:
                        if (background_color.equals("border100")) {
                            d54Var = new d54(jl3VarA.t);
                            d54Var2 = d54Var;
                        }
                        break;
                    case 197381638:
                        if (background_color.equals("border200")) {
                            d54Var = new d54(jl3VarA.u);
                            d54Var2 = d54Var;
                        }
                        break;
                    case 197382599:
                        if (background_color.equals("border300")) {
                            d54Var = new d54(jl3VarA.v);
                            d54Var2 = d54Var;
                        }
                        break;
                    case 197383560:
                        if (background_color.equals("border400")) {
                            d54Var = new d54(jl3VarA.w);
                            d54Var2 = d54Var;
                        }
                        break;
                    case 843361045:
                        if (background_color.equals("pictogram100")) {
                            d54Var = new d54(jl3VarA.I);
                            d54Var2 = d54Var;
                        }
                        break;
                    case 843362006:
                        if (background_color.equals("pictogram200")) {
                            d54Var = new d54(jl3VarA.J);
                            d54Var2 = d54Var;
                        }
                        break;
                    case 843362967:
                        if (background_color.equals("pictogram300")) {
                            d54Var = new d54(jl3VarA.K);
                            d54Var2 = d54Var;
                        }
                        break;
                    case 843363928:
                        if (background_color.equals("pictogram400")) {
                            d54Var = new d54(jl3VarA.L);
                            d54Var2 = d54Var;
                        }
                        break;
                    case 1949797926:
                        if (background_color.equals("accentSecondary000")) {
                            d54Var = new d54(jl3VarA.j);
                            d54Var2 = d54Var;
                        }
                        break;
                    case 1949798887:
                        if (background_color.equals("accentSecondary100")) {
                            d54Var = new d54(jl3VarA.k);
                            d54Var2 = d54Var;
                        }
                        break;
                    case 1949799848:
                        if (background_color.equals("accentSecondary200")) {
                            d54Var = new d54(jl3VarA.l);
                            d54Var2 = d54Var;
                        }
                        break;
                    case 1949806575:
                        if (background_color.equals("accentSecondary900")) {
                            d54Var = new d54(jl3VarA.m);
                            d54Var2 = d54Var;
                        }
                        break;
                    case 2141082285:
                        if (background_color.equals("onColor100")) {
                            d54Var = new d54(jl3VarA.F);
                            d54Var2 = d54Var;
                        }
                        break;
                    case 2141083246:
                        if (background_color.equals("onColor200")) {
                            d54Var = new d54(jl3VarA.G);
                            d54Var2 = d54Var;
                        }
                        break;
                    case 2141084207:
                        if (background_color.equals("onColor300")) {
                            d54Var = new d54(jl3VarA.H);
                            d54Var2 = d54Var;
                        }
                        break;
                }
                e18Var.p(false);
            }
            fx8 fx8Var = new fx8((Context) e18Var.j(w00.b));
            fx8Var.c = strR;
            mx8.a(fx8Var);
            jx8 jx8VarA = fx8Var.a();
            xo1 xo1Var = lja.K;
            iqb iqbVarD = kud.d(b.c(iqbVar2, 1.0f), 1.4357142f, false);
            fqb fqbVar = fqb.E;
            iqb iqbVarB = iqbVarD.B(d54Var2 != null ? yfd.p(fqbVar, d54Var2.a, zni.b) : fqbVar);
            o5b o5bVarD = dw1.d(xo1Var, false);
            int iHashCode = Long.hashCode(e18Var.T);
            hyc hycVarL = e18Var.l();
            iqb iqbVarE = kxk.E(e18Var, iqbVarB);
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
            nuk.e(jx8VarA, null, b.c(fqbVar, 1.0f), yw8Var, null, null, jo4Var, MTTypesetterKt.kLineSkipLimitMultiplier, 0, false, e18Var, ((i3 << 3) & 7168) | 432, 3952);
            e18Var.p(true);
        } else {
            iqbVar2 = iqbVar;
            e18Var.T();
        }
        r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            final int i6 = 1;
            final iqb iqbVar3 = iqbVar2;
            pz7Var = new pz7() { // from class: s87
                @Override // defpackage.pz7
                public final Object invoke(Object obj, Object obj2) {
                    int i52 = i6;
                    iei ieiVar = iei.a;
                    int i62 = i2;
                    yw8 yw8Var2 = yw8Var;
                    iqb iqbVar32 = iqbVar3;
                    ExperienceAsset experienceAsset2 = experienceAsset;
                    ld4 ld4Var2 = (ld4) obj;
                    ((Integer) obj2).getClass();
                    switch (i52) {
                        case 0:
                            wjk.c(experienceAsset2, iqbVar32, yw8Var2, ld4Var2, x44.p0(i62 | 1));
                            break;
                        default:
                            wjk.c(experienceAsset2, iqbVar32, yw8Var2, ld4Var2, x44.p0(i62 | 1));
                            break;
                    }
                    return ieiVar;
                }
            };
            r7eVarS.d = pz7Var;
        }
    }

    public static final void d(String str, iqb iqbVar, ld4 ld4Var, int i2) {
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(537340378);
        int i3 = 16;
        int i4 = (e18Var.f(str) ? 4 : 2) | i2 | (e18Var.f(iqbVar) ? 32 : 16);
        if (e18Var.Q(i4 & 1, (i4 & 19) != 18)) {
            vo1 vo1Var = lja.U;
            iqb iqbVarC = b.c(iqbVar, 1.0f);
            q64 q64VarA = p64.a(ko0.c, vo1Var, e18Var, 48);
            int iHashCode = Long.hashCode(e18Var.T);
            hyc hycVarL = e18Var.l();
            iqb iqbVarE = kxk.E(e18Var, iqbVarC);
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
            pzg.a(null, gm3.b(e18Var).v, gm3.a(e18Var).q, gm3.a(e18Var).M, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, sf5.a(MTTypesetterKt.kLineSkipLimitMultiplier, gm3.a(e18Var).v), fd9.q0(-2049596565, new ngf(str, i3), e18Var), e18Var, 12582912, 49);
            e18Var.p(true);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new ip(str, iqbVar, i2, 23);
        }
    }

    public static final void e(ParsedContentBlock$McpToolInvocation parsedContentBlock$McpToolInvocation, iqb iqbVar, ld4 ld4Var, int i2) {
        e18 e18Var;
        tkh tkhVarB;
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(60348471);
        int i3 = 4;
        int i4 = i2 | (e18Var2.f(parsedContentBlock$McpToolInvocation) ? 4 : 2) | (e18Var2.f(iqbVar) ? 32 : 16);
        byte b2 = 0;
        if (e18Var2.Q(i4 & 1, (i4 & 19) != 18)) {
            String messageText = parsedContentBlock$McpToolInvocation.getMessageText();
            if (messageText == null) {
                messageText = parsedContentBlock$McpToolInvocation.getToolName();
            }
            String toolName = parsedContentBlock$McpToolInvocation.getToolName();
            if (x44.r(messageText, bsg.e1(toolName, ":", toolName))) {
                e18Var2.a0(-1749455767);
                tkhVarB = (tkh) ((wk) gm3.c(e18Var2).e.F).i;
                e18Var2.p(false);
            } else {
                e18Var2.a0(-1749384746);
                tkhVarB = ihd.b(e18Var2);
                e18Var2.p(false);
            }
            tkh tkhVar = tkhVarB;
            boolean z = !parsedContentBlock$McpToolInvocation.getIsComplete();
            e0g e0gVar = gm3.b(e18Var2).d;
            qu1 qu1VarA = sf5.a(0.5f, gm3.a(e18Var2).v);
            qnc qncVar = new qnc(12.0f, 12.0f, 12.0f, 12.0f);
            Object objN = e18Var2.N();
            if (objN == jd4.a) {
                objN = new oob(19);
                e18Var2.k0(objN);
            }
            e18Var = e18Var2;
            gjk.c(messageText, (zy7) objN, iqbVar, false, z, fd9.q0(-493011790, new s4b(parsedContentBlock$McpToolInvocation, i3, b2), e18Var2), false, null, false, e0gVar, qu1VarA, null, null, qncVar, MTTypesetterKt.kLineSkipLimitMultiplier, tkhVar, 0, true, null, e18Var, ((i4 << 3) & 896) | 199728, 12585984, 350656);
        } else {
            e18Var = e18Var2;
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new nwh(parsedContentBlock$McpToolInvocation, iqbVar, i2, 7);
        }
    }

    public static final void f(htc htcVar, boolean z, iqb iqbVar, ld4 ld4Var, int i2) {
        e18 e18Var;
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(1220175093);
        int i3 = i2 | (e18Var2.f(htcVar) ? 4 : 2) | (e18Var2.g(z) ? 32 : 16) | (e18Var2.f(iqbVar) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC);
        if (e18Var2.Q(i3 & 1, (i3 & 147) != 146)) {
            boolean z2 = !(htcVar.e || z);
            String strR = euk.r(htcVar.b, htcVar.c, z2, e18Var2);
            e0g e0gVar = gm3.b(e18Var2).d;
            qu1 qu1VarA = sf5.a(0.5f, gm3.a(e18Var2).v);
            qnc qncVar = new qnc(12.0f, 12.0f, 12.0f, 12.0f);
            Object objN = e18Var2.N();
            if (objN == jd4.a) {
                objN = new oob(19);
                e18Var2.k0(objN);
            }
            e18Var = e18Var2;
            gjk.c(strR, (zy7) objN, iqbVar, false, z2, fd9.q0(1923864112, new jsg(10, htcVar), e18Var2), false, null, false, e0gVar, qu1VarA, null, null, qncVar, MTTypesetterKt.kLineSkipLimitMultiplier, null, 0, true, null, e18Var, (i3 & 896) | 199728, 12585984, 383424);
        } else {
            e18Var = e18Var2;
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new wvg(htcVar, z, iqbVar, i2, 3);
        }
    }

    public static final void g(final ChatFeedbackType chatFeedbackType, zy7 zy7Var, zy7 zy7Var2, iqb iqbVar, ld4 ld4Var, int i2) {
        int i3;
        zy7 zy7Var3;
        iqb iqbVar2;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-338034292);
        if ((i2 & 6) == 0) {
            i3 = (e18Var.d(chatFeedbackType == null ? -1 : chatFeedbackType.ordinal()) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= e18Var.h(zy7Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            zy7Var3 = zy7Var2;
            i3 |= e18Var.h(zy7Var3) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        } else {
            zy7Var3 = zy7Var2;
        }
        int i4 = i3 | 3072;
        final int i5 = 0;
        int i6 = 1;
        if (e18Var.Q(i4 & 1, (i4 & 1171) != 1170)) {
            cxe cxeVarA = axe.a(ko0.a, lja.P, e18Var, 0);
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
            d4c.i0(e18Var, cd4.f, cxeVarA);
            d4c.i0(e18Var, cd4.e, hycVarL);
            d4c.i0(e18Var, cd4.g, Integer.valueOf(iHashCode));
            d4c.h0(e18Var, cd4.h);
            d4c.i0(e18Var, cd4.d, iqbVarE);
            int i7 = i4 & 14;
            boolean z = i7 == 4;
            Object objN = e18Var.N();
            lz1 lz1Var = jd4.a;
            if (z || objN == lz1Var) {
                objN = new bz7() { // from class: d1j
                    @Override // defpackage.bz7
                    public final Object invoke(Object obj) {
                        int i8 = i5;
                        iei ieiVar = iei.a;
                        ChatFeedbackType chatFeedbackType2 = chatFeedbackType;
                        ekf ekfVar = (ekf) obj;
                        switch (i8) {
                            case 0:
                                ekfVar.getClass();
                                ckf.t(ekfVar, chatFeedbackType2 == ChatFeedbackType.UPVOTE);
                                break;
                            default:
                                ekfVar.getClass();
                                if (chatFeedbackType2 != null && chatFeedbackType2 != ChatFeedbackType.UPVOTE) {
                                    z = true;
                                }
                                ckf.t(ekfVar, z);
                                break;
                        }
                        return ieiVar;
                    }
                };
                e18Var.k0(objN);
            }
            ez1.e(zy7Var, tjf.b(fqbVar, false, (bz7) objN), false, null, null, fd9.q0(-1978841202, new fs2(chatFeedbackType, i6), e18Var), e18Var, ((i4 >> 3) & 14) | 1572864, 60);
            boolean z2 = i7 == 4;
            Object objN2 = e18Var.N();
            if (z2 || objN2 == lz1Var) {
                final int i8 = 1;
                objN2 = new bz7() { // from class: d1j
                    @Override // defpackage.bz7
                    public final Object invoke(Object obj) {
                        int i82 = i8;
                        iei ieiVar = iei.a;
                        ChatFeedbackType chatFeedbackType2 = chatFeedbackType;
                        ekf ekfVar = (ekf) obj;
                        switch (i82) {
                            case 0:
                                ekfVar.getClass();
                                ckf.t(ekfVar, chatFeedbackType2 == ChatFeedbackType.UPVOTE);
                                break;
                            default:
                                ekfVar.getClass();
                                if (chatFeedbackType2 != null && chatFeedbackType2 != ChatFeedbackType.UPVOTE) {
                                    z = true;
                                }
                                ckf.t(ekfVar, z);
                                break;
                        }
                        return ieiVar;
                    }
                };
                e18Var.k0(objN2);
            }
            ez1.e(zy7Var3, tjf.b(fqbVar, false, (bz7) objN2), false, null, null, fd9.q0(89616261, new fs2(chatFeedbackType, 2), e18Var), e18Var, ((i4 >> 6) & 14) | 1572864, 60);
            e18Var.p(true);
            iqbVar2 = fqbVar;
        } else {
            e18Var.T();
            iqbVar2 = iqbVar;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new p3h(i2, 6, zy7Var2, iqbVar2, chatFeedbackType, zy7Var);
        }
    }

    public static final void h(final fn1 fn1Var, final float f2, final iqb iqbVar, final boolean z, ld4 ld4Var, final int i2) {
        x0a x0aVar;
        ybg ybgVar;
        kdg kdgVar;
        tn1 tn1Var;
        zy1 zy1Var;
        e18 e18Var;
        boolean z2;
        fn1 fn1Var2 = fn1Var;
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(424385606);
        int i3 = 2;
        int i4 = i2 | (e18Var2.f(fn1Var2) ? 4 : 2) | (e18Var2.c(f2) ? 32 : 16) | (e18Var2.f(iqbVar) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC) | (e18Var2.g(z) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE);
        if (e18Var2.Q(i4 & 1, (i4 & 1171) != 1170)) {
            x0a x0aVarA = a1a.a(0, 3, e18Var2);
            tn1 tn1Var2 = (tn1) fn1Var2;
            zy1 zy1Var2 = tn1Var2.b0;
            kdg kdgVar2 = tn1Var2.x.g;
            Object objN = e18Var2.N();
            lz1 lz1Var = jd4.a;
            if (objN == lz1Var) {
                objN = sq6.p(e18Var2);
            }
            ybg ybgVar2 = (ybg) objN;
            boolean zF = e18Var2.f(x0aVarA);
            Object objN2 = e18Var2.N();
            tp4 tp4Var = null;
            int i5 = 6;
            if (zF || objN2 == lz1Var) {
                objN2 = new nt4(x0aVarA, tp4Var, i5);
                e18Var2.k0(objN2);
            }
            fd9.i(e18Var2, (pz7) objN2, iei.a);
            boolean zF2 = e18Var2.f(tn1Var2.a) | e18Var2.f(zy1Var2);
            Object objN3 = e18Var2.N();
            if (zF2 || objN3 == lz1Var) {
                x0aVar = x0aVarA;
                ybgVar = ybgVar2;
                kdgVar = kdgVar2;
                tn1Var = tn1Var2;
                fn1Var2 = fn1Var;
                objN3 = new lvh(tn1Var2.a, zy1Var2, a2g.I, new mti(1), new r2i(22), new r2i(23), new b2g(1, fn1Var, fn1.class, "trackToolShown", "trackToolShown(Ljava/lang/String;)V", 0, 15), new r2i(24), new mti(i3), new r2i(25), new r2i(26), dah.J, 254208);
                zy1Var = zy1Var2;
                e18Var2.k0(objN3);
            } else {
                x0aVar = x0aVarA;
                tn1Var = tn1Var2;
                zy1Var = zy1Var2;
                kdgVar = kdgVar2;
                ybgVar = ybgVar2;
            }
            lvh lvhVar = (lvh) objN3;
            float f3 = (z ? 20.0f : 120.0f) + f2;
            FillElement fillElement = b.c;
            iqb iqbVarB = iqbVar.B(fillElement);
            o5b o5bVarD = dw1.d(lja.G, false);
            int iHashCode = Long.hashCode(e18Var2.T);
            hyc hycVarL = e18Var2.l();
            iqb iqbVarE = kxk.E(e18Var2, iqbVarB);
            dd4.e.getClass();
            re4 re4Var = cd4.b;
            e18Var2.e0();
            if (e18Var2.S) {
                e18Var2.k(re4Var);
            } else {
                e18Var2.n0();
            }
            z80 z80Var = cd4.f;
            d4c.i0(e18Var2, z80Var, o5bVarD);
            z80 z80Var2 = cd4.e;
            d4c.i0(e18Var2, z80Var2, hycVarL);
            Integer numValueOf = Integer.valueOf(iHashCode);
            z80 z80Var3 = cd4.g;
            d4c.i0(e18Var2, z80Var3, numValueOf);
            bx bxVar = cd4.h;
            d4c.h0(e18Var2, bxVar);
            z80 z80Var4 = cd4.d;
            d4c.i0(e18Var2, z80Var4, iqbVarE);
            zni.g(zy1Var, ybgVar, e18Var2, 48);
            iv1.c(ybgVar, null, e18Var2, 6, 2);
            float f4 = z ? 16.0f : 120.0f;
            qnc qncVarD = gb9.d(16.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 16.0f, f3, 2);
            ho0 ho0Var = new ho0(12.0f, true, new sz6(1));
            kdg kdgVar3 = kdgVar;
            boolean zC = e18Var2.c(f4) | e18Var2.h(kdgVar3) | ((i4 & 14) == 4) | e18Var2.h(lvhVar);
            Object objN4 = e18Var2.N();
            if (zC || objN4 == lz1Var) {
                objN4 = new zx(kdgVar3, f4, fn1Var2, lvhVar);
                e18Var2.k0(objN4);
            }
            knk.h(fillElement, x0aVar, qncVarD, false, ho0Var, null, null, false, null, (bz7) objN4, e18Var2, 24582, 488);
            xo1 xo1Var = lja.K;
            xo1 xo1Var2 = lja.H;
            nw1 nw1Var = nw1.a;
            fqb fqbVar = fqb.E;
            iqb iqbVarW = zni.w(b.e(b.c(nw1Var.a(fqbVar, xo1Var2), 1.0f), z ? 16.0f : 120.0f), gm3.a(e18Var2).p, null, 6);
            o5b o5bVarD2 = dw1.d(xo1Var, false);
            int iHashCode2 = Long.hashCode(e18Var2.T);
            hyc hycVarL2 = e18Var2.l();
            iqb iqbVarE2 = kxk.E(e18Var2, iqbVarW);
            e18Var2.e0();
            if (e18Var2.S) {
                e18Var2.k(re4Var);
            } else {
                e18Var2.n0();
            }
            d4c.i0(e18Var2, z80Var, o5bVarD2);
            d4c.i0(e18Var2, z80Var2, hycVarL2);
            ij0.t(iHashCode2, e18Var2, z80Var3, e18Var2, bxVar);
            d4c.i0(e18Var2, z80Var4, iqbVarE2);
            if (!tn1Var.y() || tn1Var.g.c()) {
                e18Var = e18Var2;
                z2 = false;
            } else {
                e18Var = e18Var2;
                z2 = true;
            }
            wp6 wp6VarA = gp6.g(null, MTTypesetterKt.kLineSkipLimitMultiplier, 7).a(gp6.e(null, 3));
            d77 d77VarA = gp6.h(null, MTTypesetterKt.kLineSkipLimitMultiplier, 7).a(gp6.f(null, 3));
            iqb iqbVarC = b.c(fqbVar, 1.0f);
            xo1 xo1Var3 = lja.N;
            wd6.M(z2, gb9.N(nw1Var.a(iqbVarC, xo1Var3), MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, z ? 0.0f : 24.0f, 7), wp6VarA, d77VarA, null, rvk.a, e18Var, 200064, 16);
            e18Var2 = e18Var;
            e18Var2.p(true);
            dw1.a(zni.w(b.e(b.c(nw1Var.a(fqbVar, xo1Var3), 1.0f), f3), gm3.a(e18Var2).p, null, 4), e18Var2, 0);
            e18Var2.p(true);
        } else {
            e18Var2.T();
        }
        r7e r7eVarS = e18Var2.s();
        if (r7eVarS != null) {
            r7eVarS.d = new pz7(f2, iqbVar, z, i2) { // from class: e1j
                public final /* synthetic */ float F;
                public final /* synthetic */ iqb G;
                public final /* synthetic */ boolean H;

                @Override // defpackage.pz7
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iP0 = x44.p0(1);
                    wjk.h(this.E, this.F, this.G, this.H, (ld4) obj, iP0);
                    return iei.a;
                }
            };
        }
    }

    public static final String i(Number number, Number number2) {
        return "Random range is empty: [" + number + ", " + number2 + ").";
    }

    public static final void j(double d2, double d3) {
        if (d3 > d2) {
            return;
        }
        mr9.q(i(Double.valueOf(d2), Double.valueOf(d3)));
    }

    public static final void k(int i2, int i3) {
        if (i3 > i2) {
            return;
        }
        mr9.q(i(Integer.valueOf(i2), Integer.valueOf(i3)));
    }

    public static final void l(long j2, long j3) {
        if (j3 > j2) {
            return;
        }
        mr9.q(i(Long.valueOf(j2), Long.valueOf(j3)));
    }

    public static final int m(int i2) {
        return 31 - Integer.numberOfLeadingZeros(i2);
    }

    public static sla n(qh9 qh9Var) {
        try {
            String strM = qh9Var.s("name").m();
            String strM2 = qh9Var.s("version").m();
            bh9 bh9VarS = qh9Var.s("build");
            String strM3 = bh9VarS != null ? bh9VarS.m() : null;
            String strM4 = qh9Var.s("version_major").m();
            strM.getClass();
            strM2.getClass();
            strM4.getClass();
            return new sla(strM, strM2, strM3, strM4);
        } catch (IllegalStateException e2) {
            pmf.j("Unable to parse json into type Os", e2);
            return null;
        } catch (NullPointerException e3) {
            pmf.j("Unable to parse json into type Os", e3);
            return null;
        } catch (NumberFormatException e4) {
            pmf.j("Unable to parse json into type Os", e4);
            return null;
        }
    }

    public static final int o(pkb pkbVar) {
        return System.identityHashCode(pkbVar);
    }

    public static final void p(String str) {
        List list = xah.a;
        xah.e(6, "Unsupported for voice mode : ".concat(str), null, null);
    }

    public static final int q(b79 b79Var) {
        g1e g1eVar = h1e.E;
        b79Var.getClass();
        if (b79Var.isEmpty()) {
            xh6.k("Cannot get random in empty range: ", b79Var);
            return 0;
        }
        int i2 = b79Var.F;
        int i3 = b79Var.E;
        if (i2 < Integer.MAX_VALUE) {
            return h1e.F.h(i3, i2 + 1);
        }
        if (i3 <= Integer.MIN_VALUE) {
            return h1e.F.f();
        }
        return h1e.F.h(i3 - 1, i2) + 1;
    }

    public static final String r(ExperienceAsset experienceAsset, ld4 ld4Var, int i2) {
        experienceAsset.getClass();
        boolean zF = v40.F(ld4Var);
        e18 e18Var = (e18) ld4Var;
        float density = ((cz5) e18Var.j(ve4.h)).getDensity();
        int i3 = 1;
        boolean zG = ((((i2 & 14) ^ 6) > 4 && e18Var.f(experienceAsset)) || (i2 & 6) == 4) | e18Var.g(zF) | e18Var.c(density);
        Object objN = e18Var.N();
        if (zG || objN == jd4.a) {
            ExperienceAssetImageVariants image = experienceAsset.getImage();
            Object url = null;
            if (image != null) {
                List<ExperienceAssetScaledImage> light = (!zF || image.getDark().isEmpty()) ? image.getLight() : image.getDark();
                if (!light.isEmpty()) {
                    List listI1 = w44.i1(light, new g67(i3));
                    Iterator it = listI1.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        Object next = it.next();
                        if (((ExperienceAssetScaledImage) next).getScale() >= density) {
                            url = next;
                            break;
                        }
                    }
                    ExperienceAssetScaledImage experienceAssetScaledImage = (ExperienceAssetScaledImage) url;
                    if (experienceAssetScaledImage == null) {
                        experienceAssetScaledImage = (ExperienceAssetScaledImage) w44.U0(listI1);
                    }
                    url = experienceAssetScaledImage.getUrl();
                }
            }
            objN = url;
            e18Var.k0(objN);
        }
        return (String) objN;
    }

    public static boolean s(wh3 wh3Var, l7g l7gVar, l7g l7gVar2) {
        if (wh3Var.a(l7gVar) == wh3Var.a(l7gVar2) && wh3Var.b0(l7gVar) == wh3Var.b0(l7gVar2)) {
            if ((wh3Var.u0(l7gVar) == null) == (wh3Var.u0(l7gVar2) == null) && wh3Var.X(wh3Var.Q(l7gVar), wh3Var.Q(l7gVar2))) {
                if (!wh3Var.Y(l7gVar, l7gVar2)) {
                    int iA = wh3Var.a(l7gVar);
                    for (int i2 = 0; i2 < iA; i2++) {
                        vai vaiVarN0 = wh3Var.n0(l7gVar, i2);
                        vai vaiVarN02 = wh3Var.n0(l7gVar2, i2);
                        if (wh3Var.d0(vaiVarN0) == wh3Var.d0(vaiVarN02) && (wh3Var.d0(vaiVarN0) || (wh3Var.G(vaiVarN0) == wh3Var.G(vaiVarN02) && t(wh3Var, wh3Var.M(vaiVarN0), wh3Var.M(vaiVarN02))))) {
                        }
                    }
                }
                return true;
            }
        }
        return false;
    }

    public static boolean t(wh3 wh3Var, cs9 cs9Var, cs9 cs9Var2) {
        if (cs9Var == cs9Var2) {
            return true;
        }
        j7g j7gVarN = wh3Var.n(cs9Var);
        j7g j7gVarN2 = wh3Var.n(cs9Var2);
        if (j7gVarN != null && j7gVarN2 != null) {
            return s(wh3Var, j7gVarN, j7gVarN2);
        }
        sn7 sn7VarE0 = wh3Var.e0(cs9Var);
        sn7 sn7VarE02 = wh3Var.e0(cs9Var2);
        return sn7VarE0 != null && sn7VarE02 != null && s(wh3Var, wh3Var.x(sn7VarE0), wh3Var.x(sn7VarE02)) && s(wh3Var, wh3Var.r(sn7VarE0), wh3Var.r(sn7VarE02));
    }

    public static final int u(int i2, int i3) {
        return (i2 >>> (32 - i3)) & ((-i3) >> 31);
    }
}
