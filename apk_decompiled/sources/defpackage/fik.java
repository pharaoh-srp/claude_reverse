package defpackage;

import androidx.compose.foundation.b;
import com.anthropic.claude.R;
import com.anthropic.claude.api.chat.MessageImageAsset;
import com.anthropic.claude.api.chat.MessageImageFile;
import com.anthropic.claude.chat.input.images.a;
import com.pvporbit.freetype.FreeTypeConstants;
import java.text.BreakIterator;

/* JADX INFO: loaded from: classes3.dex */
public abstract class fik {
    public static final ta4 a = new ta4(1991282117, false, new gb4(20));
    public static final poc b = new poc(22);
    public static final poc c = new poc(23);

    public static final void a(fnd fndVar, iqb iqbVar, zy7 zy7Var, ld4 ld4Var, int i) {
        int i2;
        boolean z;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(132755676);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? e18Var.f(fndVar) : e18Var.h(fndVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= e18Var.f(iqbVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= e18Var.h(zy7Var) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        if (!e18Var.Q(i2 & 1, (i2 & 147) != 146)) {
            e18Var.T();
        } else if (fndVar instanceof end) {
            e18Var.a0(-740292145);
            end endVar = (end) fndVar;
            String str = endVar.b;
            MessageImageAsset messageImageAsset = endVar.f;
            if (!(endVar.e instanceof MessageImageFile) || messageImageAsset == null) {
                e18Var.a0(-739662473);
                str.getClass();
                String strI1 = bsg.i1('.', str, str);
                String strD1 = bsg.d1('.', str, "");
                if (strD1.length() == 0) {
                    strD1 = null;
                }
                int i3 = i2 << 3;
                String str2 = strD1;
                z = false;
                bj7.f(strI1, str2, iqbVar, zy7Var, messageImageAsset, null, null, null, e18Var, (i3 & 7168) | (i3 & 896) | 12582912, 96);
                e18Var.p(false);
            } else {
                e18Var.a0(-740189690);
                iqb iqbVarE = puk.e(iqbVar);
                iqb iqbVarC = fqb.E;
                if (zy7Var != null) {
                    iqbVarC = b.c(iqbVarC, false, null, null, null, zy7Var, 15);
                }
                iqb iqbVarP = yfd.p(iqbVarE.B(iqbVarC), gm3.a(e18Var).o, zni.b);
                o5b o5bVarD = dw1.d(lja.G, false);
                int iHashCode = Long.hashCode(e18Var.T);
                hyc hycVarL = e18Var.l();
                iqb iqbVarE2 = kxk.E(e18Var, iqbVarP);
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
                d4c.i0(e18Var, cd4.d, iqbVarE2);
                a.b(messageImageAsset, null, null, endVar.b, e18Var, 0, 6);
                e18Var.p(true);
                e18Var.p(false);
                z = false;
            }
            e18Var.p(z);
        } else {
            if (!(fndVar instanceof dnd)) {
                throw ebh.u(e18Var, -1270808256, false);
            }
            e18Var.a0(-739116842);
            int i4 = i2 << 3;
            bj7.f(((dnd) fndVar).b, null, iqbVar, zy7Var, null, null, null, null, e18Var, (i4 & 896) | 12582960 | (i4 & 7168), 112);
            e18Var.p(false);
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new v76(i, 24, iqbVar, fndVar, zy7Var);
        }
    }

    public static final void b(rja rjaVar, zy7 zy7Var, zy7 zy7Var2, ld4 ld4Var, int i) {
        e18 e18Var;
        rjaVar.getClass();
        zy7Var.getClass();
        zy7Var2.getClass();
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(-1753228018);
        int i2 = 2;
        int i3 = 4;
        int i4 = i | (e18Var2.f(rjaVar) ? 4 : 2) | (e18Var2.h(zy7Var) ? 32 : 16) | (e18Var2.h(zy7Var2) ? 256 : FreeTypeConstants.FT_LOAD_PEDANTIC);
        if (e18Var2.Q(i4 & 1, (i4 & 147) != 146)) {
            zy1 zy1Var = rjaVar.c;
            boolean z = (i4 & 112) == 32;
            Object objN = e18Var2.N();
            lz1 lz1Var = jd4.a;
            if (z || objN == lz1Var) {
                objN = new zg2(zy7Var, null, i2);
                e18Var2.k0(objN);
            }
            x44.b(zy1Var, (pz7) objN, e18Var2, 0);
            boolean z2 = ((i4 & 14) == 4) | ((i4 & 896) == 256);
            Object objN2 = e18Var2.N();
            if (z2 || objN2 == lz1Var) {
                objN2 = new ft9(rjaVar, i3, zy7Var2);
                e18Var2.k0(objN2);
            }
            int i5 = 29;
            e18Var = e18Var2;
            trk.b((zy7) objN2, fd9.q0(175144843, new mk4(i5, rjaVar), e18Var2), null, fd9.q0(-436124215, new um5(rjaVar, i5, zy7Var2), e18Var2), mok.a, mok.b, null, 0L, 0L, 0L, 0L, null, e18Var, 1772592, 0, 16276);
        } else {
            e18Var = e18Var2;
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new ra7(rjaVar, i, zy7Var, zy7Var2, 11);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:134:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:145:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(final boolean r25, final java.util.List r26, final java.util.List r27, final defpackage.ta4 r28, defpackage.iqb r29, defpackage.bz7 r30, boolean r31, defpackage.mnc r32, defpackage.ld4 r33, final int r34, final int r35) {
        /*
            Method dump skipped, instruction units count: 648
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fik.c(boolean, java.util.List, java.util.List, ta4, iqb, bz7, boolean, mnc, ld4, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x012a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void d(defpackage.fnd r16, defpackage.iqb r17, defpackage.zy7 r18, defpackage.ld4 r19, int r20) {
        /*
            Method dump skipped, instruction units count: 351
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fik.d(fnd, iqb, zy7, ld4, int):void");
    }

    public static final void e(zy7 zy7Var, iqb iqbVar, ld4 ld4Var, int i) {
        zy7 zy7Var2;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(520404036);
        int i2 = (e18Var.h(zy7Var) ? 4 : 2) | i | 48;
        if (e18Var.Q(i2 & 1, (i2 & 19) != 18)) {
            wu8 wu8VarE = vz8.E(gm3.a(e18Var).M, gm3.a(e18Var).n, e18Var, 24576);
            fqb fqbVar = fqb.E;
            zy7Var2 = zy7Var;
            ez1.d(zy7Var2, androidx.compose.foundation.layout.b.o(fqbVar, 24.0f), false, null, wu8VarE, fsk.b, e18Var, (i2 & 14) | 1572864, 44);
            e18Var = e18Var;
            iqbVar = fqbVar;
        } else {
            zy7Var2 = zy7Var;
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new xh(zy7Var2, iqbVar, i, 12);
        }
    }

    public static final void f(iqb iqbVar, ld4 ld4Var, int i) {
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(1857345609);
        int i2 = i | 6;
        if (e18Var.Q(i2 & 1, (i2 & 3) != 2)) {
            String strJ0 = d4c.j0(R.string.project_knowledge_uploading, e18Var);
            iqbVar = fqb.E;
            bj7.f(strJ0, null, kud.d(androidx.compose.foundation.layout.b.c(iqbVar, 1.0f), 1.0f, false), null, null, fj7.F, null, null, e18Var, 12779568, 88);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new fl(i, 24, iqbVar);
        }
    }

    public static void g(long j, ssc sscVar, y3i[] y3iVarArr) {
        int i;
        while (true) {
            if (sscVar.a() <= 1) {
                return;
            }
            int i2 = 0;
            while (true) {
                if (sscVar.a() == 0) {
                    i = -1;
                    break;
                }
                int iZ = sscVar.z();
                i2 += iZ;
                if (iZ != 255) {
                    i = i2;
                    break;
                }
            }
            int i3 = 0;
            while (true) {
                if (sscVar.a() == 0) {
                    i3 = -1;
                    break;
                }
                int iZ2 = sscVar.z();
                i3 += iZ2;
                if (iZ2 != 255) {
                    break;
                }
            }
            int i4 = sscVar.b + i3;
            if (i3 == -1 || i3 > sscVar.a()) {
                ysj.u("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                i4 = sscVar.c;
            } else if (i == 4 && i3 >= 8) {
                int iZ3 = sscVar.z();
                int iG = sscVar.G();
                int iM = iG == 49 ? sscVar.m() : 0;
                int iZ4 = sscVar.z();
                if (iG == 47) {
                    sscVar.N(1);
                }
                boolean z = iZ3 == 181 && (iG == 49 || iG == 47) && iZ4 == 3;
                if (iG == 49) {
                    z &= iM == 1195456820;
                }
                if (z) {
                    h(j, sscVar, y3iVarArr);
                }
            }
            sscVar.M(i4);
        }
    }

    public static void h(long j, ssc sscVar, y3i[] y3iVarArr) {
        int iZ = sscVar.z();
        if ((iZ & 64) != 0) {
            sscVar.N(1);
            int i = (iZ & 31) * 3;
            int i2 = sscVar.b;
            for (y3i y3iVar : y3iVarArr) {
                sscVar.M(i2);
                y3iVar.e(i, sscVar);
                fd9.M(j != -9223372036854775807L);
                y3iVar.a(j, 1, i, 0, null);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0046  */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.text.BreakIterator] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, xv8] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int i(int r11, java.lang.String r12) {
        /*
            gl6 r0 = m()
            r1 = 0
            if (r0 == 0) goto L79
            int r2 = r0.c()
            r3 = 0
            r4 = 1
            if (r2 != r4) goto L10
            goto L11
        L10:
            r4 = r3
        L11:
            if (r4 == 0) goto L73
            java.lang.String r2 = "charSequence cannot be null"
            defpackage.knk.q(r2, r12)
            bl6 r0 = r0.e
            xv8 r4 = r0.b
            r4.getClass()
            r0 = -1
            if (r11 < 0) goto L28
            int r2 = r12.length()
            if (r11 < r2) goto L2a
        L28:
            r5 = r12
            goto L69
        L2a:
            boolean r2 = r12 instanceof android.text.Spanned
            if (r2 == 0) goto L46
            r2 = r12
            android.text.Spanned r2 = (android.text.Spanned) r2
            int r5 = r11 + 1
            java.lang.Class<qbi> r6 = defpackage.qbi.class
            java.lang.Object[] r5 = r2.getSpans(r11, r5, r6)
            qbi[] r5 = (defpackage.qbi[]) r5
            int r6 = r5.length
            if (r6 <= 0) goto L46
            r3 = r5[r3]
            int r2 = r2.getSpanEnd(r3)
            r5 = r12
            goto L6a
        L46:
            int r2 = r11 + (-16)
            int r6 = java.lang.Math.max(r3, r2)
            int r2 = r12.length()
            int r3 = r11 + 16
            int r7 = java.lang.Math.min(r2, r3)
            tl6 r10 = new tl6
            r10.<init>(r11)
            r8 = 2147483647(0x7fffffff, float:NaN)
            r9 = 1
            r5 = r12
            java.lang.Object r12 = r4.v(r5, r6, r7, r8, r9, r10)
            tl6 r12 = (defpackage.tl6) r12
            int r2 = r12.G
            goto L6a
        L69:
            r2 = r0
        L6a:
            java.lang.Integer r12 = java.lang.Integer.valueOf(r2)
            if (r2 != r0) goto L71
            goto L7a
        L71:
            r1 = r12
            goto L7a
        L73:
            java.lang.String r11 = "Not initialized yet"
            defpackage.sz6.j(r11)
            return r3
        L79:
            r5 = r12
        L7a:
            if (r1 == 0) goto L81
            int r11 = r1.intValue()
            return r11
        L81:
            java.text.BreakIterator r12 = java.text.BreakIterator.getCharacterInstance()
            r12.setText(r5)
            int r11 = r12.following(r11)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fik.i(int, java.lang.String):int");
    }

    public static final int j(int i, String str) {
        gl6 gl6VarM = m();
        Integer num = null;
        if (gl6VarM != null) {
            Integer numValueOf = Integer.valueOf(gl6VarM.b(Math.max(0, i - 1), str));
            if (numValueOf.intValue() != -1) {
                num = numValueOf;
            }
        }
        if (num != null) {
            return num.intValue();
        }
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(str);
        return characterInstance.preceding(i);
    }

    public static bt6 k(qh9 qh9Var) {
        try {
            String strM = qh9Var.s("name").m();
            String strM2 = qh9Var.s("version").m();
            bh9 bh9VarS = qh9Var.s("build");
            String strM3 = bh9VarS != null ? bh9VarS.m() : null;
            String strM4 = qh9Var.s("version_major").m();
            strM.getClass();
            strM2.getClass();
            strM4.getClass();
            return new bt6(strM, strM2, strM3, strM4);
        } catch (IllegalStateException e) {
            pmf.j("Unable to parse json into type Os", e);
            return null;
        } catch (NullPointerException e2) {
            pmf.j("Unable to parse json into type Os", e2);
            return null;
        } catch (NumberFormatException e3) {
            pmf.j("Unable to parse json into type Os", e3);
            return null;
        }
    }

    public static fxi l(qh9 qh9Var) {
        try {
            Number numberL = qh9Var.s("max_depth").l();
            Number numberL2 = qh9Var.s("max_depth_scroll_top").l();
            Number numberL3 = qh9Var.s("max_scroll_height").l();
            Number numberL4 = qh9Var.s("max_scroll_height_time").l();
            numberL.getClass();
            numberL2.getClass();
            numberL3.getClass();
            numberL4.getClass();
            return new fxi(numberL, numberL2, numberL3, numberL4);
        } catch (IllegalStateException e) {
            pmf.j("Unable to parse json into type Scroll", e);
            return null;
        } catch (NullPointerException e2) {
            pmf.j("Unable to parse json into type Scroll", e2);
            return null;
        } catch (NumberFormatException e3) {
            pmf.j("Unable to parse json into type Scroll", e3);
            return null;
        }
    }

    public static final gl6 m() {
        if (!gl6.d()) {
            return null;
        }
        gl6 gl6VarA = gl6.a();
        if (gl6VarA.c() == 1) {
            return gl6VarA;
        }
        return null;
    }

    public static final iqb n(wbj wbjVar) {
        return new nz5(wbjVar, c);
    }

    public static final iqb o(iqb iqbVar, wbj wbjVar) {
        return iqbVar.B(new nz5(wbjVar, b));
    }
}
