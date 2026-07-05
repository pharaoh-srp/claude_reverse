package defpackage;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.Window;
import androidx.compose.foundation.layout.b;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.R;
import com.pvporbit.freetype.FreeTypeConstants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class nwk {
    public static final e16 a = new e16();

    public static final void a(String str, String str2, jz0 jz0Var, iqb iqbVar, ld4 ld4Var, int i, int i2) {
        int i3;
        iqb iqbVar2;
        int i4;
        iqb iqbVar3;
        String strN;
        boolean z;
        str.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(140415503);
        if ((i & 6) == 0) {
            i3 = (e18Var.f(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= e18Var.f(str2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= e18Var.f(jz0Var) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        int i5 = i2 & 8;
        if (i5 != 0) {
            i4 = i3 | 3072;
            iqbVar2 = iqbVar;
        } else {
            iqbVar2 = iqbVar;
            i4 = i3 | (e18Var.f(iqbVar2) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE);
        }
        if (e18Var.Q(i4 & 1, (i4 & 1171) != 1170)) {
            fqb fqbVar = fqb.E;
            iqb iqbVar4 = i5 != 0 ? fqbVar : iqbVar2;
            if (str2 == null) {
                strN = vb7.n(e18Var, 1795317227, R.string.chat_voice_untitled_bell_note_title, e18Var, false);
            } else {
                e18Var.a0(1795316948);
                e18Var.p(false);
                strN = str2;
            }
            iqb iqbVar5 = e93.a;
            iqb iqbVarT = ez1.t(gb9.L(iqbVar4, 12.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 2), MTTypesetterKt.kLineSkipLimitMultiplier, gm3.a(e18Var).v, gm3.b(e18Var).f);
            q64 q64VarA = p64.a(ko0.c, lja.S, e18Var, 0);
            int iHashCode = Long.hashCode(e18Var.T);
            hyc hycVarL = e18Var.l();
            iqb iqbVarE = kxk.E(e18Var, iqbVarT);
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
            iqb iqbVar6 = iqbVar4;
            cxe cxeVarA = axe.a(ko0.a, lja.Q, e18Var, 48);
            String str3 = strN;
            int iHashCode2 = Long.hashCode(e18Var.T);
            hyc hycVarL2 = e18Var.l();
            iqb iqbVarE2 = kxk.E(e18Var, fqbVar);
            e18Var.e0();
            int i6 = i4;
            if (e18Var.S) {
                e18Var.k(re4Var);
            } else {
                e18Var.n0();
            }
            d4c.i0(e18Var, z80Var, cxeVarA);
            d4c.i0(e18Var, z80Var2, hycVarL2);
            ij0.t(iHashCode2, e18Var, z80Var3, e18Var, bxVar);
            d4c.i0(e18Var, z80Var4, iqbVarE2);
            op3 op3Var = (op3) e18Var.j(ve4.f);
            Object objN = e18Var.N();
            lz1 lz1Var = jd4.a;
            if (objN == lz1Var) {
                objN = fd9.O(im6.E, e18Var);
                e18Var.k0(objN);
            }
            l45 l45Var = (l45) objN;
            tjh.b(str3, gb9.J(fqbVar, 12.0f).B(new hw9(1.0f, true)), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var).e.E).e, e18Var, 0, 0, 131068);
            int i7 = i6 & 14;
            boolean zH = e18Var.h(l45Var) | e18Var.f(str3) | (i7 == 4) | e18Var.h(op3Var);
            Object objN2 = e18Var.N();
            if (zH || objN2 == lz1Var) {
                objN2 = new sm1(l45Var, str3, str, op3Var);
                e18Var.k0(objN2);
            }
            ez1.e((zy7) objN2, b.o(gb9.L(fqbVar, 12.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 2), 20.0f), false, null, null, svj.a, e18Var, 1572912, 60);
            e18Var.p(true);
            kxk.g(e18Var, yfd.p(b.e(b.c(fqbVar, 1.0f), ((cz5) e18Var.j(ve4.h)).c0(1)), gm3.a(e18Var).v, zni.b));
            if (jz0Var != null) {
                e18Var.a0(-1967708664);
                jlk.f(jz0Var, gb9.J(fqbVar, 16.0f), ((jm3) gm3.c(e18Var).e.E).e, null, null, null, null, e18Var, ((i6 >> 6) & 14) | 48, 248);
                e18Var.p(false);
                z = true;
            } else {
                e18Var.a0(-1967499972);
                tjh.b(str, gb9.J(fqbVar, 16.0f), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var).e.E).e, e18Var, i7 | 48, 0, 131068);
                e18Var = e18Var;
                e18Var.p(false);
                z = true;
            }
            e18Var.p(z);
            iqbVar3 = iqbVar6;
        } else {
            e18Var.T();
            iqbVar3 = iqbVar2;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new et((Object) str, (Object) str2, (Object) jz0Var, iqbVar3, i, i2, 2);
        }
    }

    public static List b(int... iArr) {
        return iArr.length == 0 ? Collections.EMPTY_LIST : new rb9(0, iArr.length, iArr);
    }

    public static int c(long j) {
        int i = (int) j;
        fd9.D("Out of range: %s", ((long) i) == j, j);
        return i;
    }

    public static int e(byte b, byte b2, byte b3, byte b4) {
        return (b << 24) | ((b2 & 255) << 16) | ((b3 & 255) << 8) | (b4 & 255);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final yr9 f(yr9 yr9Var) {
        yr9Var.getClass();
        if (yr9Var instanceof gbi) {
            return ((gbi) yr9Var).j();
        }
        return null;
    }

    public static long g(View view) {
        if (fd9.o < 0) {
            Window window = null;
            if ((view != null ? view.getContext() : null) instanceof Activity) {
                Context context = view.getContext();
                context.getClass();
                window = ((Activity) context).getWindow();
            }
            float f = 60.0f;
            float refreshRate = window != null ? window.getWindowManager().getDefaultDisplay().getRefreshRate() : 60.0f;
            if (refreshRate >= 30.0f && refreshRate <= 200.0f) {
                f = refreshRate;
            }
            fd9.o = (long) ((1000.0f / f) * 1000000.0f);
        }
        return fd9.o;
    }

    public static final fhi h(fhi fhiVar, yr9 yr9Var) {
        fhiVar.getClass();
        yr9Var.getClass();
        return n(fhiVar, f(yr9Var));
    }

    public static final fhi i(fhi fhiVar, fhi fhiVar2, b16 b16Var) {
        fhiVar2.getClass();
        yr9 yr9VarF = f(fhiVar2);
        return n(fhiVar, yr9VarF != null ? (yr9) b16Var.invoke(yr9VarF) : null);
    }

    public static int j(long j) {
        if (j > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (j < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j;
    }

    public static final Collection k(Collection collection, bz7 bz7Var) {
        collection.getClass();
        if (collection.size() <= 1) {
            return collection;
        }
        LinkedList linkedList = new LinkedList(collection);
        qbg qbgVar = new qbg();
        while (!linkedList.isEmpty()) {
            Object objL0 = w44.L0(linkedList);
            qbg qbgVar2 = new qbg();
            ArrayList arrayListG = gmc.g(objL0, linkedList, bz7Var, new h4(22, qbgVar2));
            if (arrayListG.size() == 1 && qbgVar2.isEmpty()) {
                Object objD1 = w44.d1(arrayListG);
                objD1.getClass();
                qbgVar.add(objD1);
            } else {
                Object objS = gmc.s(arrayListG, bz7Var);
                c92 c92Var = (c92) bz7Var.invoke(objS);
                for (Object obj : arrayListG) {
                    obj.getClass();
                    if (!gmc.k(c92Var, (c92) bz7Var.invoke(obj))) {
                        qbgVar2.add(obj);
                    }
                }
                if (!qbgVar2.isEmpty()) {
                    qbgVar.addAll(qbgVar2);
                }
                qbgVar.add(objS);
            }
        }
        return qbgVar;
    }

    public static int[] l(Collection collection) {
        if (collection instanceof rb9) {
            rb9 rb9Var = (rb9) collection;
            return Arrays.copyOfRange(rb9Var.E, rb9Var.F, rb9Var.G);
        }
        Object[] array = collection.toArray();
        int length = array.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            Object obj = array[i];
            obj.getClass();
            iArr[i] = ((Number) obj).intValue();
        }
        return iArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x000a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Integer m(java.lang.String r13) {
        /*
            r13.getClass()
            boolean r0 = r13.isEmpty()
            r1 = 0
            if (r0 == 0) goto Ld
        La:
            r13 = r1
            goto L7e
        Ld:
            r0 = 0
            char r2 = r13.charAt(r0)
            r3 = 45
            if (r2 != r3) goto L17
            r0 = 1
        L17:
            int r2 = r13.length()
            if (r0 != r2) goto L1e
            goto La
        L1e:
            int r2 = r0 + 1
            char r3 = r13.charAt(r0)
            r4 = -1
            r5 = 128(0x80, float:1.8E-43)
            if (r3 >= r5) goto L2e
            byte[] r6 = defpackage.bma.a
            r3 = r6[r3]
            goto L31
        L2e:
            byte[] r3 = defpackage.bma.a
            r3 = r4
        L31:
            if (r3 < 0) goto La
            r6 = 10
            if (r3 < r6) goto L38
            goto La
        L38:
            int r3 = -r3
            long r7 = (long) r3
        L3a:
            int r3 = r13.length()
            r9 = -9223372036854775808
            if (r2 >= r3) goto L6d
            int r3 = r2 + 1
            char r2 = r13.charAt(r2)
            if (r2 >= r5) goto L4f
            byte[] r11 = defpackage.bma.a
            r2 = r11[r2]
            goto L52
        L4f:
            byte[] r2 = defpackage.bma.a
            r2 = r4
        L52:
            if (r2 < 0) goto La
            if (r2 >= r6) goto La
            r11 = -922337203685477580(0xf333333333333334, double:-8.390303882365713E246)
            int r11 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r11 >= 0) goto L60
            goto La
        L60:
            r11 = 10
            long r7 = r7 * r11
            long r11 = (long) r2
            long r9 = r9 + r11
            int r2 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r2 >= 0) goto L6a
            goto La
        L6a:
            long r7 = r7 - r11
            r2 = r3
            goto L3a
        L6d:
            if (r0 == 0) goto L74
            java.lang.Long r13 = java.lang.Long.valueOf(r7)
            goto L7e
        L74:
            int r13 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r13 != 0) goto L79
            goto La
        L79:
            long r2 = -r7
            java.lang.Long r13 = java.lang.Long.valueOf(r2)
        L7e:
            if (r13 == 0) goto L97
            long r2 = r13.longValue()
            int r0 = r13.intValue()
            long r4 = (long) r0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 == 0) goto L8e
            goto L97
        L8e:
            int r13 = r13.intValue()
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            return r13
        L97:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nwk.m(java.lang.String):java.lang.Integer");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final fhi n(fhi fhiVar, yr9 yr9Var) {
        fhiVar.getClass();
        if (fhiVar instanceof gbi) {
            return n(((gbi) fhiVar).o(), yr9Var);
        }
        if (yr9Var == null || yr9Var.equals(fhiVar)) {
            return fhiVar;
        }
        if (fhiVar instanceof j7g) {
            return new n7g((j7g) fhiVar, yr9Var);
        }
        if (fhiVar instanceof sn7) {
            return new vn7((sn7) fhiVar, yr9Var);
        }
        wg6.i();
        return null;
    }
}
