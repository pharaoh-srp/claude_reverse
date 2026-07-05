package defpackage;

import com.anthropic.claude.R;
import com.pvporbit.freetype.FreeTypeConstants;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public abstract class tvj {
    public static final y5f d;
    public static final ta4 a = new ta4(-356302276, false, new xa4(16));
    public static final y5f b = new y5f(new f7d(28), new qte(0, 5));
    public static final y5f c = new y5f(new f7d(29), new qte(0, 6));
    public static final y5f e = new y5f(new d6f(1), new qte(0, 8));
    public static final y5f f = new y5f(new d6f(2), new qte(0, 9));

    static {
        byte b2 = 0;
        d = new y5f(new d6f(b2), new qte(b2, 7));
    }

    public static final void a(String str, String str2, zy7 zy7Var, ld4 ld4Var, int i) {
        e18 e18Var;
        String strN;
        String str3;
        str.getClass();
        zy7Var.getClass();
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(1112518746);
        int i2 = 4;
        int i3 = 16;
        int i4 = i | (e18Var2.f(str) ? 4 : 2) | (e18Var2.f(str2) ? 32 : 16) | (e18Var2.h(zy7Var) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC);
        if (e18Var2.Q(i4 & 1, (i4 & 147) != 146)) {
            r4g r4gVarS = gb9.S(u4g.F, null, null, zy7Var, e18Var2, ((i4 << 3) & 7168) | 6, 6);
            if (str2 != null) {
                e18Var2.a0(-1216384004);
                if (str2.length() > 0) {
                    str3 = ((Object) unk.j(str2.charAt(0))) + str2.substring(1);
                } else {
                    str3 = str2;
                }
                strN = d4c.k0(R.string.view_code_sheet_title, new Object[]{str3}, e18Var2);
                e18Var2.p(false);
            } else {
                strN = vb7.n(e18Var2, -1216272094, R.string.code_block_label_code, e18Var2, false);
            }
            String str4 = strN;
            k4g k4gVar = k4g.a;
            e18Var = e18Var2;
            auj.b(r4gVarS, str4, null, k4g.d(gm3.a(e18Var2).p, e18Var2, 14), false, null, a5g.E, null, null, fd9.q0(-1538001947, new u22(r4gVarS, i3), e18Var2), null, null, fd9.q0(-1483123436, new yr4(str2, str, i2), e18Var2), e18Var, 806879240, 384, 3508);
        } else {
            e18Var = e18Var2;
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new re2(str, str2, zy7Var, i, 1);
        }
    }

    public static void b(q92 q92Var, Object[] objArr) {
        objArr.getClass();
        q92Var.getClass();
        if (q92Var.a().size() == objArr.length) {
            return;
        }
        StringBuilder sb = new StringBuilder("Callable expects ");
        sb.append(q92Var.a().size());
        sb.append(" arguments, but ");
        sz6.p(vb7.l(objArr.length, " were provided.", sb));
    }

    public static final void c(int i, int i2) {
        if (i <= 0 || i2 <= 0) {
            mr9.q(i != i2 ? vb7.q("Both size ", " and step ", i, i2, " must be greater than zero.") : grc.u("size ", i, " must be greater than zero."));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x030e  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0318  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0361  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0365 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:173:0x036a  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x036d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0372  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0383  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0389  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x03bd A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:196:0x03cc  */
    /* JADX WARN: Removed duplicated region for block: B:242:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0173 A[PHI: r6 r20 r21 r22 r23 r24 r25 r26 r27 r28 r29
      0x0173: PHI (r6v12 b10) = (r6v11 b10), (r6v13 b10) binds: [B:10:0x004d, B:66:0x0171] A[DONT_GENERATE, DONT_INLINE]
      0x0173: PHI (r20v6 boolean) = (r20v5 boolean), (r20v7 boolean) binds: [B:10:0x004d, B:66:0x0171] A[DONT_GENERATE, DONT_INLINE]
      0x0173: PHI (r21v8 wrh) = (r21v7 wrh), (r21v9 wrh) binds: [B:10:0x004d, B:66:0x0171] A[DONT_GENERATE, DONT_INLINE]
      0x0173: PHI (r22v5 zb0) = (r22v4 zb0), (r22v6 zb0) binds: [B:10:0x004d, B:66:0x0171] A[DONT_GENERATE, DONT_INLINE]
      0x0173: PHI (r23v5 g20) = (r23v4 g20), (r23v6 g20) binds: [B:10:0x004d, B:66:0x0171] A[DONT_GENERATE, DONT_INLINE]
      0x0173: PHI (r24v6 ro4) = (r24v5 ro4), (r24v7 ro4) binds: [B:10:0x004d, B:66:0x0171] A[DONT_GENERATE, DONT_INLINE]
      0x0173: PHI (r25v6 java.lang.Boolean) = (r25v5 java.lang.Boolean), (r25v7 java.lang.Boolean) binds: [B:10:0x004d, B:66:0x0171] A[DONT_GENERATE, DONT_INLINE]
      0x0173: PHI (r26v8 vue) = (r26v7 vue), (r26v9 vue) binds: [B:10:0x004d, B:66:0x0171] A[DONT_GENERATE, DONT_INLINE]
      0x0173: PHI (r27v6 boolean) = (r27v5 boolean), (r27v7 boolean) binds: [B:10:0x004d, B:66:0x0171] A[DONT_GENERATE, DONT_INLINE]
      0x0173: PHI (r28v6 boolean) = (r28v5 boolean), (r28v7 boolean) binds: [B:10:0x004d, B:66:0x0171] A[DONT_GENERATE, DONT_INLINE]
      0x0173: PHI (r29v6 java.lang.Integer) = (r29v5 java.lang.Integer), (r29v7 java.lang.Integer) binds: [B:10:0x004d, B:66:0x0171] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void d(android.view.ViewStructure r38, defpackage.av9 r39, android.view.autofill.AutofillId r40, java.lang.String r41, defpackage.n9e r42) {
        /*
            Method dump skipped, instruction units count: 1000
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tvj.d(android.view.ViewStructure, av9, android.view.autofill.AutofillId, java.lang.String, n9e):void");
    }

    public static final zy7 e(zy7 zy7Var, ld4 ld4Var) {
        zy7Var.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.a0(-1299847059);
        if (l2a.a) {
            e18Var.p(false);
            return zy7Var;
        }
        nwb nwbVarZ = mpk.Z(zy7Var, e18Var);
        vc vcVar = new vc(1);
        boolean zF = e18Var.f(nwbVarZ);
        Object objN = e18Var.N();
        lz1 lz1Var = jd4.a;
        if (zF || objN == lz1Var) {
            objN = new ol5(13, nwbVarZ);
            e18Var.k0(objN);
        }
        xpa xpaVarD0 = sf5.d0(vcVar, (bz7) objN, e18Var, 0);
        Object objN2 = e18Var.N();
        if (objN2 == lz1Var) {
            objN2 = new uv4(xpaVarD0, 1);
            e18Var.k0(objN2);
        }
        zy7 zy7Var2 = (zy7) objN2;
        e18Var.p(false);
        return zy7Var2;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final defpackage.co6 f(defpackage.co6 r17, defpackage.jx8 r18, defpackage.qjc r19, defpackage.tqh r20, defpackage.vp4 r21) {
        /*
            Method dump skipped, instruction units count: 263
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tvj.f(co6, jx8, qjc, tqh, vp4):co6");
    }

    public static final Iterator g(Iterator it, int i, int i2) {
        it.getClass();
        return !it.hasNext() ? km6.E : yb5.v(new pag(i, i2, it, null));
    }
}
