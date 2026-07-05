package defpackage;

import android.content.res.Configuration;
import androidx.compose.foundation.layout.b;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.R;
import com.anthropic.claude.api.errors.ClaudeApiError$AuthError;
import com.anthropic.claude.login.WelcomeNotice;
import com.pvporbit.freetype.FreeTypeConstants;
import java.io.File;
import java.io.IOException;
import java.nio.file.AtomicMoveNotSupportedException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlinx.coroutines.TimeoutCancellationException;

/* JADX INFO: loaded from: classes.dex */
public abstract class iuj {
    public static cbi a = null;
    public static final ta4 b = new ta4(961080247, false, new eb4(0));
    public static final ta4 c = new ta4(1540804775, false, new eb4(1));
    public static final ta4 d = new ta4(-2044598712, false, new eb4(2));
    public static final ta4 e = new ta4(1417469639, false, new eb4(3));
    public static final az8 f = new az8(false);
    public static final y5f g = new y5f(new u9e(14), new k8d(0, 16));
    public static final om7 h = new om7();
    public static final float i = 48.0f;
    public static final float j = 48.0f;

    public static final void A() {
        throw new IllegalStateException("Invalid applier");
    }

    public static boolean B(String str) {
        return ("Connection".equalsIgnoreCase(str) || "Keep-Alive".equalsIgnoreCase(str) || "Proxy-Authenticate".equalsIgnoreCase(str) || "Proxy-Authorization".equalsIgnoreCase(str) || "TE".equalsIgnoreCase(str) || "Trailers".equalsIgnoreCase(str) || "Transfer-Encoding".equalsIgnoreCase(str) || "Upgrade".equalsIgnoreCase(str)) ? false : true;
    }

    public static final iqb C(xy9 xy9Var, n78 n78Var, boolean z, ukc ukcVar) {
        return new ty9(xy9Var, n78Var, z, ukcVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0057, code lost:
    
        if (defpackage.o06.g(r0).equals(defpackage.o06.g(r2)) == false) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.jl9 D(defpackage.h08 r3, defpackage.eri r4) {
        /*
            boolean r0 = defpackage.csk.g(r3)
            if (r0 != 0) goto L66
            java.util.List r0 = r3.I()
            int r0 = r0.size()
            r1 = 1
            if (r0 == r1) goto L12
            goto L5a
        L12:
            bo5 r0 = r3.h()
            boolean r1 = r0 instanceof defpackage.qqb
            r2 = 0
            if (r1 == 0) goto L1e
            qqb r0 = (defpackage.qqb) r0
            goto L1f
        L1e:
            r0 = r2
        L1f:
            if (r0 != 0) goto L22
            goto L5a
        L22:
            java.util.List r3 = r3.I()
            r3.getClass()
            java.lang.Object r3 = defpackage.w44.e1(r3)
            eri r3 = (defpackage.eri) r3
            yr9 r3 = r3.getType()
            u9i r3 = r3.O()
            xh3 r3 = r3.a()
            boolean r1 = r3 instanceof defpackage.qqb
            if (r1 == 0) goto L42
            r2 = r3
            qqb r2 = (defpackage.qqb) r2
        L42:
            if (r2 != 0) goto L45
            goto L5a
        L45:
            vfd r3 = defpackage.or9.s(r0)
            if (r3 == 0) goto L5a
            ww7 r3 = defpackage.o06.g(r0)
            ww7 r0 = defpackage.o06.g(r2)
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L5a
            goto L66
        L5a:
            yr9 r3 = r4.getType()
            r3.getClass()
            jl9 r3 = defpackage.csk.i(r3)
            return r3
        L66:
            yr9 r3 = r4.getType()
            r3.getClass()
            yr9 r3 = defpackage.jwk.C(r3)
            jl9 r3 = defpackage.csk.i(r3)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iuj.D(h08, eri):jl9");
    }

    public static final String E(Object obj) {
        obj.getClass();
        String name = obj.getClass().getName();
        String strG1 = bsg.g1(name, '$');
        String strD1 = bsg.d1('.', strG1, strG1);
        return strD1.length() == 0 ? name : bsg.T0(strD1, "Kt");
    }

    public static final c18 F(ld4 ld4Var) {
        e18 e18Var = (e18) ld4Var;
        e18Var.W(206, pd4.f);
        if (e18Var.S) {
            vag.z(e18Var.I);
        }
        Object objF = e18Var.F();
        i18 wreVar = objF instanceof i18 ? (i18) objF : null;
        if (wreVar == null) {
            wreVar = new wre(new b18(new c18(e18Var, e18Var.T, e18Var.q, e18Var.C, e18Var.h.X)), -1);
            e18Var.l0(wreVar);
        }
        mee meeVar = wreVar.a;
        meeVar.getClass();
        c18 c18Var = ((b18) meeVar).E;
        c18Var.f.setValue(e18Var.l());
        e18Var.p(false);
        return c18Var;
    }

    public static final v4g G(boolean z, bz7 bz7Var, ld4 ld4Var, int i2, int i3) {
        final int i4 = 0;
        final boolean z2 = (i3 & 1) != 0 ? false : z;
        int i5 = i3 & 2;
        lz1 lz1Var = jd4.a;
        if (i5 != 0) {
            e18 e18Var = (e18) ld4Var;
            Object objN = e18Var.N();
            if (objN == lz1Var) {
                objN = new xga(13);
                e18Var.k0(objN);
            }
            bz7Var = (bz7) objN;
        }
        final bz7 bz7Var2 = bz7Var;
        int i6 = (i2 & 14) | 384 | (i2 & 112);
        float f2 = q4g.a;
        final float f3 = uu1.c;
        final float f4 = uu1.d;
        e18 e18Var2 = (e18) ld4Var;
        final cz5 cz5Var = (cz5) e18Var2.j(ve4.h);
        boolean zF = e18Var2.f(cz5Var) | e18Var2.c(f3);
        Object objN2 = e18Var2.N();
        Object obj = objN2;
        if (zF || objN2 == lz1Var) {
            zy7 zy7Var = new zy7() { // from class: l4g
                @Override // defpackage.zy7
                public final Object a() {
                    float fQ0;
                    int i7 = i4;
                    float f5 = f3;
                    cz5 cz5Var2 = cz5Var;
                    switch (i7) {
                        case 0:
                            fQ0 = cz5Var2.q0(f5);
                            break;
                        default:
                            fQ0 = cz5Var2.q0(f5);
                            break;
                    }
                    return Float.valueOf(fQ0);
                }
            };
            e18Var2.k0(zy7Var);
            obj = zy7Var;
        }
        final zy7 zy7Var2 = (zy7) obj;
        boolean zF2 = e18Var2.f(cz5Var) | e18Var2.c(f4);
        Object objN3 = e18Var2.N();
        final int i7 = 1;
        Object obj2 = objN3;
        if (zF2 || objN3 == lz1Var) {
            zy7 zy7Var3 = new zy7() { // from class: l4g
                @Override // defpackage.zy7
                public final Object a() {
                    float fQ0;
                    int i72 = i7;
                    float f5 = f4;
                    cz5 cz5Var2 = cz5Var;
                    switch (i72) {
                        case 0:
                            fQ0 = cz5Var2.q0(f5);
                            break;
                        default:
                            fQ0 = cz5Var2.q0(f5);
                            break;
                    }
                    return Float.valueOf(fQ0);
                }
            };
            e18Var2.k0(zy7Var3);
            obj2 = zy7Var3;
        }
        final zy7 zy7Var4 = (zy7) obj2;
        Object[] objArr = {Boolean.valueOf(z2), bz7Var2, Boolean.FALSE};
        y5f y5fVar = new y5f(new k73(z2, zy7Var2, zy7Var4, bz7Var2), new lwf(3));
        int i8 = (((((i6 & 14) ^ 6) <= 4 || !e18Var2.g(z2)) && (i6 & 6) != 4) ? 0 : 1) | (e18Var2.f(zy7Var2) ? 1 : 0) | (e18Var2.f(zy7Var4) ? 1 : 0);
        if ((((i6 & 112) ^ 48) <= 32 || !e18Var2.f(bz7Var2)) && (i6 & 48) != 32) {
            i7 = 0;
        }
        int i9 = i8 | i7 | (e18Var2.g(false) ? 1 : 0);
        Object objN4 = e18Var2.N();
        if (i9 != 0 || objN4 == lz1Var) {
            final b5g b5gVar = b5g.E;
            zy7 zy7Var5 = new zy7(z2, zy7Var2, zy7Var4, b5gVar, bz7Var2) { // from class: m4g
                public final /* synthetic */ boolean E;
                public final /* synthetic */ zy7 F;
                public final /* synthetic */ b5g G;
                public final /* synthetic */ bz7 H;

                {
                    this.G = b5gVar;
                    this.H = bz7Var2;
                }

                @Override // defpackage.zy7
                public final Object a() {
                    return new v4g(this.E, this.F, this.G, this.H);
                }
            };
            e18Var2.k0(zy7Var5);
            objN4 = zy7Var5;
        }
        return (v4g) K(objArr, y5fVar, (zy7) objN4, e18Var2, 0);
    }

    public static final nwb H(Object[] objArr, x5f x5fVar, zy7 zy7Var, ld4 ld4Var) {
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        x5fVar.getClass();
        return (nwb) J(objArrCopyOf, new y5f(new d6d(7, x5fVar), new ska(17, x5fVar)), zy7Var, ld4Var, 3456);
    }

    public static final Object I(Object[] objArr, zy7 zy7Var, ld4 ld4Var, int i2) {
        return J(Arrays.copyOf(objArr, objArr.length), g, zy7Var, ld4Var, ((i2 << 6) & 7168) | 384);
    }

    public static final Object J(Object[] objArr, x5f x5fVar, zy7 zy7Var, ld4 ld4Var, int i2) {
        Object[] objArr2;
        x5f x5fVar2;
        Object obj;
        Object objF;
        e18 e18Var = (e18) ld4Var;
        long j2 = e18Var.T;
        gb9.q(36);
        String string = Long.toString(j2, 36);
        string.getClass();
        x5fVar.getClass();
        c5f c5fVar = (c5f) e18Var.j(e5f.a);
        Object objN = e18Var.N();
        lz1 lz1Var = jd4.a;
        if (objN == lz1Var) {
            Object objA = (c5fVar == null || (objF = c5fVar.f(string)) == null) ? null : x5fVar.a(objF);
            if (objA == null) {
                objA = zy7Var.a();
            }
            objArr2 = objArr;
            x5fVar2 = x5fVar;
            y4f y4fVar = new y4f(x5fVar2, c5fVar, string, objA, objArr2);
            e18Var.k0(y4fVar);
            objN = y4fVar;
        } else {
            objArr2 = objArr;
            x5fVar2 = x5fVar;
        }
        y4f y4fVar2 = (y4f) objN;
        Object objA2 = Arrays.equals(objArr2, y4fVar2.I) ? y4fVar2.H : null;
        if (objA2 == null) {
            objA2 = zy7Var.a();
        }
        boolean zH = e18Var.h(y4fVar2) | ((((i2 & 112) ^ 48) > 32 && e18Var.h(x5fVar2)) || (i2 & 48) == 32) | e18Var.h(c5fVar) | e18Var.f(string) | e18Var.h(objA2) | e18Var.h(objArr2);
        Object objN2 = e18Var.N();
        if (zH || objN2 == lz1Var) {
            Object[] objArr3 = objArr2;
            obj = objA2;
            s63 s63Var = new s63(y4fVar2, x5fVar2, c5fVar, string, obj, objArr3, 3);
            e18Var.k0(s63Var);
            objN2 = s63Var;
        } else {
            obj = objA2;
        }
        fd9.s((zy7) objN2, e18Var);
        return obj;
    }

    public static final Object K(Object[] objArr, x5f x5fVar, zy7 zy7Var, ld4 ld4Var, int i2) {
        return J(Arrays.copyOf(objArr, objArr.length), x5fVar, zy7Var, ld4Var, ((i2 << 3) & 7168) | (i2 & 112) | 384);
    }

    public static final n70 L(s70 s70Var, int i2) {
        Object next;
        Iterator<T> it = s70Var.getLayoutNodeToHolder().entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((av9) ((Map.Entry) next).getKey()).F == i2) {
                break;
            }
        }
        Map.Entry entry = (Map.Entry) next;
        if (entry != null) {
            return (n70) entry.getValue();
        }
        return null;
    }

    public static final Object M(vqh vqhVar, pz7 pz7Var) {
        knk.A(vqhVar, new b96(d4c.R(vqhVar.J.getContext()).P(vqhVar.K, vqhVar, vqhVar.I)));
        return gb9.W(vqhVar, false, vqhVar, pz7Var);
    }

    public static final Object N(pz7 pz7Var, vp4 vp4Var) {
        lyg lygVar = new lyg(vp4Var, vp4Var.getContext());
        return gb9.W(lygVar, true, lygVar, pz7Var);
    }

    public static final String O(int i2) {
        if (i2 == 0) {
            return "android.widget.Button";
        }
        if (i2 == 1) {
            return "android.widget.CheckBox";
        }
        if (i2 == 3) {
            return "android.widget.RadioButton";
        }
        if (i2 == 5) {
            return "android.widget.ImageView";
        }
        if (i2 == 6) {
            return "android.widget.Spinner";
        }
        if (i2 == 7) {
            return "android.widget.NumberPicker";
        }
        return null;
    }

    public static final Object P(long j2, pz7 pz7Var, vp4 vp4Var) {
        if (j2 > 0) {
            return M(new vqh(j2, vp4Var), pz7Var);
        }
        throw new TimeoutCancellationException("Timed out immediately", null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object Q(long r6, defpackage.pz7 r8, defpackage.tp4 r9) {
        /*
            boolean r0 = r9 instanceof defpackage.wqh
            if (r0 == 0) goto L13
            r0 = r9
            wqh r0 = (defpackage.wqh) r0
            int r1 = r0.G
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.G = r1
            goto L18
        L13:
            wqh r0 = new wqh
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.F
            int r1 = r0.G
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L30
            if (r1 != r3) goto L2a
            dae r6 = r0.E
            defpackage.sf5.h0(r9)     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L28
            return r9
        L28:
            r7 = move-exception
            goto L56
        L2a:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r6)
            return r2
        L30:
            defpackage.sf5.h0(r9)
            r4 = 0
            int r9 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r9 > 0) goto L3a
            goto L5c
        L3a:
            dae r9 = new dae
            r9.<init>()
            r0.E = r9     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L54
            r0.G = r3     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L54
            vqh r1 = new vqh     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L54
            r1.<init>(r6, r0)     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L54
            r9.E = r1     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L54
            java.lang.Object r6 = M(r1, r8)     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L54
            m45 r7 = defpackage.m45.E
            if (r6 != r7) goto L53
            return r7
        L53:
            return r6
        L54:
            r7 = move-exception
            r6 = r9
        L56:
            lf9 r8 = r7.E
            java.lang.Object r6 = r6.E
            if (r8 != r6) goto L5d
        L5c:
            return r2
        L5d:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iuj.Q(long, pz7, tp4):java.lang.Object");
    }

    public static final Object R(long j2, pz7 pz7Var, vp4 vp4Var) {
        return Q(d4c.o0(j2), pz7Var, vp4Var);
    }

    public static final void a(iqb iqbVar, ld4 ld4Var, int i2) {
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(986503592);
        int i3 = i2 | 6;
        int i4 = 1;
        if (e18Var.Q(i3 & 1, (i3 & 3) != 2)) {
            tqh tqhVar = vi3.F;
            nt6 nt6Var = new nt6(new ClaudeApiError$AuthError());
            fqb fqbVar = fqb.E;
            uik.c(nt6Var, fqbVar, null, null, null, e18Var, 56, 28);
            iqbVar = fqbVar;
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new fl(i2, i4, iqbVar);
        }
    }

    public static final void b(final float f2, final int i2, ld4 ld4Var, iqb iqbVar) {
        e18 e18Var;
        final iqb iqbVar2;
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(1852513795);
        int i3 = i2 | 6;
        if ((i2 & 48) == 0) {
            i3 |= e18Var2.c(f2) ? 32 : 16;
        }
        if (e18Var2.Q(i3 & 1, (i3 & 19) != 18)) {
            tkh tkhVar = ((jm3) gm3.c(e18Var2).e.E).b;
            String strJ0 = d4c.j0(R.string.animated_login_welcome_title, e18Var2);
            long j2 = tkhVar.a.b;
            eve.n(j2);
            long jL = eve.L(clh.c(j2) * f2, j2 & 1095216660480L);
            long jL2 = tkhVar.b.c;
            long j3 = 1095216660480L & jL2;
            if (j3 != 0) {
                eve.n(jL2);
                jL2 = eve.L(clh.c(jL2) * f2, j3);
            }
            tkh tkhVarB = tkh.b(tkhVar, 0L, jL, dv7.I, null, null, 0L, null, 0, jL2, null, 0, 16646137);
            fdh fdhVar = new fdh(3);
            int i4 = (i3 << 3) & 112;
            iqbVar2 = fqb.E;
            e18Var = e18Var2;
            tjh.b(strJ0, iqbVar2, 0L, 0L, null, null, null, 0L, null, fdhVar, 0L, 0, false, 0, 0, null, tkhVarB, e18Var, i4, 0, 130044);
        } else {
            e18Var = e18Var2;
            e18Var.T();
            iqbVar2 = iqbVar;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new pz7() { // from class: qa0
                @Override // defpackage.pz7
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iP0 = x44.p0(i2 | 1);
                    iuj.b(f2, iP0, (ld4) obj, iqbVar2);
                    return iei.a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:110:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(boolean r18, defpackage.zy7 r19, defpackage.iqb r20, defpackage.mxd r21, defpackage.rz7 r22, defpackage.pl3 r23, defpackage.ta4 r24, defpackage.ld4 r25, int r26, int r27) {
        /*
            Method dump skipped, instruction units count: 500
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iuj.c(boolean, zy7, iqb, mxd, rz7, pl3, ta4, ld4, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:87:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void d(final defpackage.kja r22, final float r23, final com.anthropic.claude.login.WelcomeNotice r24, defpackage.iqb r25, boolean r26, defpackage.ld4 r27, final int r28, final int r29) {
        /*
            Method dump skipped, instruction units count: 403
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iuj.d(kja, float, com.anthropic.claude.login.WelcomeNotice, iqb, boolean, ld4, int, int):void");
    }

    public static final void e(iqb iqbVar, float f2, long j2, ld4 ld4Var, final int i2, final int i3) {
        int i4;
        final long jD;
        final float f3;
        final iqb iqbVar2;
        final long j3;
        final float f4;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(75144485);
        int i5 = i3 & 1;
        if (i5 != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (e18Var.f(iqbVar) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i6 = i3 & 2;
        if (i6 != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= e18Var.c(f2) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            jD = j2;
            i4 |= ((i3 & 4) == 0 && e18Var.e(jD)) ? 256 : FreeTypeConstants.FT_LOAD_PEDANTIC;
        } else {
            jD = j2;
        }
        boolean z = true;
        if (e18Var.Q(i4 & 1, (i4 & 147) != 146)) {
            e18Var.V();
            if ((i2 & 1) == 0 || e18Var.A()) {
                if (i5 != 0) {
                    iqbVar = fqb.E;
                }
                f4 = i6 != 0 ? h96.a : f2;
                if ((i3 & 4) != 0) {
                    float f5 = h96.a;
                    i4 &= -897;
                    jD = p54.d(yfd.b, e18Var);
                }
            } else {
                e18Var.T();
                if ((i3 & 4) != 0) {
                    i4 &= -897;
                }
                f4 = f2;
            }
            e18Var.q();
            iqb iqbVarE = b.e(b.c(iqbVar, 1.0f), f4);
            boolean z2 = (i4 & 112) == 32;
            if ((((i4 & 896) ^ 384) <= 256 || !e18Var.e(jD)) && (i4 & 384) != 256) {
                z = false;
            }
            boolean z3 = z2 | z;
            Object objN = e18Var.N();
            if (z3 || objN == jd4.a) {
                objN = new bz7() { // from class: k96
                    @Override // defpackage.bz7
                    public final Object invoke(Object obj) {
                        xd6 xd6Var = (xd6) obj;
                        float f6 = f4;
                        float fQ0 = xd6Var.q0(f6);
                        float fQ02 = xd6Var.q0(f6) / 2.0f;
                        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(MTTypesetterKt.kLineSkipLimitMultiplier)) << 32) | (((long) Float.floatToRawIntBits(fQ02)) & 4294967295L);
                        float fIntBitsToFloat = Float.intBitsToFloat((int) (xd6Var.g() >> 32));
                        float fQ03 = xd6Var.q0(f6) / 2.0f;
                        xd6Var.M(jD, jFloatToRawIntBits, (((long) Float.floatToRawIntBits(fQ03)) & 4294967295L) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32), (504 & 8) != 0 ? 0.0f : fQ0, (504 & 16) != 0 ? 0 : 0);
                        return iei.a;
                    }
                };
                e18Var.k0(objN);
            }
            v40.a(0, e18Var, (bz7) objN, iqbVarE);
            f3 = f4;
            j3 = jD;
            iqbVar2 = iqbVar;
        } else {
            e18Var.T();
            f3 = f2;
            iqbVar2 = iqbVar;
            j3 = jD;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new pz7() { // from class: l96
                @Override // defpackage.pz7
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    iuj.e(iqbVar2, f3, j3, (ld4) obj, x44.p0(i2 | 1), i3);
                    return iei.a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x028e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0344  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x035d  */
    /* JADX WARN: Removed duplicated region for block: B:209:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x012a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void f(final defpackage.zy7 r32, defpackage.iqb r33, defpackage.v4g r34, float r35, boolean r36, defpackage.e0g r37, final long r38, long r40, long r42, defpackage.pz7 r44, defpackage.pz7 r45, defpackage.gnb r46, final defpackage.ta4 r47, defpackage.ld4 r48, final int r49, final int r50, final int r51) {
        /*
            Method dump skipped, instruction units count: 886
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iuj.f(zy7, iqb, v4g, float, boolean, e0g, long, long, long, pz7, pz7, gnb, ta4, ld4, int, int, int):void");
    }

    public static myg g() {
        return new myg(null);
    }

    public static final void h(float f2, int i2, long j2, ld4 ld4Var, iqb iqbVar) {
        iqb iqbVar2;
        float f3;
        float f4;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-1534852205);
        int i3 = i2 | 48 | (e18Var.e(j2) ? 256 : FreeTypeConstants.FT_LOAD_PEDANTIC);
        boolean z = true;
        if (e18Var.Q(i3 & 1, (i3 & 147) != 146)) {
            e18Var.V();
            if ((i2 & 1) == 0 || e18Var.A()) {
                f4 = h96.a;
            } else {
                e18Var.T();
                f4 = f2;
            }
            e18Var.q();
            iqbVar2 = iqbVar;
            iqb iqbVarT = b.t(iqbVar2.B(b.b), f4);
            if ((((i3 & 896) ^ 384) <= 256 || !e18Var.e(j2)) && (i3 & 384) != 256) {
                z = false;
            }
            Object objN = e18Var.N();
            if (z || objN == jd4.a) {
                objN = new i96(f4, j2);
                e18Var.k0(objN);
            }
            v40.a(0, e18Var, (bz7) objN, iqbVarT);
            f3 = f4;
        } else {
            iqbVar2 = iqbVar;
            e18Var.T();
            f3 = f2;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new j96(f3, i2, j2, iqbVar2);
        }
    }

    public static final void i(m9j m9jVar, kja kjaVar, WelcomeNotice welcomeNotice, mnc mncVar, zy7 zy7Var, iqb iqbVar, ld4 ld4Var, int i2) {
        iqb iqbVar2;
        mncVar.getClass();
        zy7Var.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(970048775);
        int i3 = i2 | (e18Var.f(m9jVar) ? 4 : 2) | (e18Var.f(kjaVar) ? 32 : 16) | (e18Var.d(welcomeNotice == null ? -1 : welcomeNotice.ordinal()) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC) | (e18Var.f(mncVar) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE) | (e18Var.h(zy7Var) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN) | 196608;
        if (e18Var.Q(i3 & 1, (74899 & i3) != 74898)) {
            boolean z = va6.a((float) ((Configuration) e18Var.j(w00.a)).screenHeightDp, 480.0f) < 0;
            xo1 xo1Var = lja.H;
            iqb iqbVarS = knk.s(gb9.I(b.c, mncVar), mncVar);
            o5b o5bVarD = dw1.d(xo1Var, false);
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
            d4c.i0(e18Var, cd4.f, o5bVarD);
            d4c.i0(e18Var, cd4.e, hycVarL);
            d4c.i0(e18Var, cd4.g, Integer.valueOf(iHashCode));
            d4c.h0(e18Var, cd4.h);
            d4c.i0(e18Var, cd4.d, iqbVarE);
            iqb iqbVarC = b.c(b.v(b.b, MTTypesetterKt.kLineSkipLimitMultiplier, 600.0f, 1), 1.0f);
            if (z) {
                e18Var.a0(-1602182883);
                j(m9jVar, kjaVar, welcomeNotice, zy7Var, iqbVarC, e18Var, (i3 & 14) | 24576 | (i3 & 112) | (i3 & 896) | ((i3 >> 3) & 7168));
                e18Var.p(false);
            } else {
                e18Var.a0(-1601500108);
                k(m9jVar, kjaVar, welcomeNotice, zy7Var, iqbVarC, e18Var, (i3 & 14) | 24576 | (i3 & 112) | (i3 & 896) | ((i3 >> 3) & 7168));
                e18Var.p(false);
            }
            e18Var.p(true);
            iqbVar2 = fqb.E;
        } else {
            e18Var.T();
            iqbVar2 = iqbVar;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new ka0(m9jVar, kjaVar, welcomeNotice, mncVar, zy7Var, iqbVar2, i2, 0);
        }
    }

    public static final void j(m9j m9jVar, kja kjaVar, WelcomeNotice welcomeNotice, zy7 zy7Var, iqb iqbVar, ld4 ld4Var, int i2) {
        int i3;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(1513273695);
        if ((i2 & 6) == 0) {
            i3 = (e18Var.f(m9jVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= e18Var.f(kjaVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= e18Var.d(welcomeNotice == null ? -1 : welcomeNotice.ordinal()) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        if ((i2 & 3072) == 0) {
            i3 |= e18Var.h(zy7Var) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE;
        }
        if ((i2 & 24576) == 0) {
            i3 |= e18Var.f(iqbVar) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN;
        }
        if (e18Var.Q(i3 & 1, (i3 & 9363) != 9362)) {
            vo1 vo1Var = lja.T;
            iqb iqbVarL = gb9.L(mpk.b0(mpk.k0(iqbVar, mpk.n), mpk.Y(e18Var), true), 24.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 2);
            q64 q64VarA = p64.a(ko0.c, vo1Var, e18Var, 48);
            int iHashCode = Long.hashCode(e18Var.T);
            hyc hycVarL = e18Var.l();
            iqb iqbVarE = kxk.E(e18Var, iqbVarL);
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
            int i4 = i3 >> 3;
            d(kjaVar, 1.0f, welcomeNotice, null, false, e18Var, (i4 & 14) | 48 | (i3 & 896), 24);
            fqb fqbVar = fqb.E;
            kxk.g(e18Var, b.e(fqbVar, 24.0f));
            if (((Boolean) m9jVar.s.getValue()).booleanValue()) {
                e18Var.a0(-693437337);
                u00.b(i4 & 896, 8, e18Var, zy7Var, null, !((Boolean) m9jVar.r.getValue()).booleanValue(), ((Boolean) m9jVar.q.getValue()).booleanValue());
                e18Var.p(false);
            } else {
                e18Var.a0(-693235527);
                e18Var.p(false);
            }
            u00.e(m9jVar, b.c(fqbVar, 1.0f), e18Var, (i3 & 14) | 48);
            zh4.b(gb9.K(fqbVar, 8.0f, 16.0f), null, null, e18Var, 0, 6);
            e18Var = e18Var;
            e18Var.p(true);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new pk(m9jVar, kjaVar, welcomeNotice, zy7Var, iqbVar, i2, 1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x02a7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void k(defpackage.m9j r43, defpackage.kja r44, com.anthropic.claude.login.WelcomeNotice r45, defpackage.zy7 r46, defpackage.iqb r47, defpackage.ld4 r48, int r49) {
        /*
            Method dump skipped, instruction units count: 959
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iuj.k(m9j, kja, com.anthropic.claude.login.WelcomeNotice, zy7, iqb, ld4, int):void");
    }

    public static final void m(File file, File file2) throws IOException {
        Path path = file.toPath();
        Path path2 = file2.toPath();
        try {
            Files.move(path, path2, StandardCopyOption.ATOMIC_MOVE, StandardCopyOption.REPLACE_EXISTING);
        } catch (AtomicMoveNotSupportedException e2) {
            path.getClass();
            path2.getClass();
            try {
                Files.move(path, path2, StandardCopyOption.REPLACE_EXISTING);
            } catch (IOException e3) {
                mwa.p(e3, e2);
                throw e3;
            }
        } catch (FileAlreadyExistsException e4) {
            path.getClass();
            path2.getClass();
            try {
                Files.move(path, path2, StandardCopyOption.REPLACE_EXISTING);
            } catch (IOException e5) {
                mwa.p(e5, e4);
                throw e5;
            }
        }
    }

    public static final y73 n(bz7 bz7Var) {
        return new y73(new ConcurrentHashMap(), 5, bz7Var);
    }

    public static void q(String str, Object obj) {
        if (obj != null) {
            return;
        }
        mr9.h(str);
    }

    public static final void r(long j2, ukc ukcVar) {
        if (ukcVar == ukc.E) {
            if (rl4.g(j2) != Integer.MAX_VALUE) {
                return;
            }
            e39.c("Vertically scrollable component was measured with an infinity maximum height constraints, which is disallowed. One of the common reasons is nesting layouts like LazyColumn and Column(Modifier.verticalScroll()). If you want to add a header before the list of items please add a header as a separate item() before the main items() inside the LazyColumn scope. There could be other reasons for this to happen: your ComposeView was added into a LinearLayout with some weight, you applied Modifier.wrapContentSize(unbounded = true) or wrote a custom layout. Please try to remove the source of infinite constraints in the hierarchy above the scrolling container.");
        } else {
            if (rl4.h(j2) != Integer.MAX_VALUE) {
                return;
            }
            e39.c("Horizontally scrollable component was measured with an infinity maximum width constraints, which is disallowed. One of the common reasons is nesting layouts like LazyRow and Row(Modifier.horizontalScroll()). If you want to add a header before the list of items please add a header as a separate item() before the main items() inside the LazyRow scope. There could be other reasons for this to happen: your ComposeView was added into a LinearLayout with some weight, you applied Modifier.wrapContentSize(unbounded = true) or wrote a custom layout. Please try to remove the source of infinite constraints in the hierarchy above the scrolling container.");
        }
    }

    public static boolean s(c92 c92Var, c92 c92Var2) {
        c92Var.getClass();
        c92Var2.getClass();
        if (!(c92Var2 instanceof ge9) || !(c92Var instanceof h08)) {
            return false;
        }
        ge9 ge9Var = (ge9) c92Var2;
        ge9Var.I().size();
        h08 h08Var = (h08) c92Var;
        h08Var.I().size();
        List listI = ge9Var.M0().I();
        listI.getClass();
        List listI2 = h08Var.a().I();
        listI2.getClass();
        for (cpc cpcVar : w44.v1(listI, listI2)) {
            eri eriVar = (eri) cpcVar.E;
            eri eriVar2 = (eri) cpcVar.F;
            eriVar.getClass();
            boolean z = D((h08) c92Var2, eriVar) instanceof il9;
            eriVar2.getClass();
            if (z != (D(h08Var, eriVar2) instanceof il9)) {
                return true;
            }
        }
        return false;
    }

    public static final long t(long j2, boolean z, int i2, float f2) {
        int iH = ((z || i2 == 2 || i2 == 4 || i2 == 5) && rl4.d(j2)) ? rl4.h(j2) : Integer.MAX_VALUE;
        if (rl4.j(j2) != iH) {
            iH = wd6.e0(sf5.m(f2), rl4.j(j2), iH);
        }
        return sf5.G(0, iH, 0, rl4.g(j2));
    }

    public static final g9f u(int i2, ArrayList arrayList) {
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            if (((g9f) arrayList.get(i3)).a() == i2) {
                return (g9f) arrayList.get(i3);
            }
        }
        return null;
    }

    public static la v(qh9 qh9Var) {
        try {
            long jK = qh9Var.s("format_version").k();
            bh9 bh9VarS = qh9Var.s("session");
            oa oaVarV = bh9VarS != null ? knk.v(bh9VarS.g()) : null;
            bh9 bh9VarS2 = qh9Var.s("configuration");
            fa faVarB = bh9VarS2 != null ? nai.B(bh9VarS2.g()) : null;
            bh9 bh9VarS3 = qh9Var.s("browser_sdk_version");
            String strM = bh9VarS3 != null ? bh9VarS3.m() : null;
            bh9 bh9VarS4 = qh9Var.s("sdk_name");
            String strM2 = bh9VarS4 != null ? bh9VarS4.m() : null;
            bh9 bh9VarS5 = qh9Var.s("action");
            ma maVarL = bh9VarS5 != null ? dlk.l(bh9VarS5.g()) : null;
            if (jK == 2) {
                return new la(oaVarV, faVarB, strM, strM2, maVarL);
            }
            throw new IllegalStateException("Check failed.");
        } catch (IllegalStateException e2) {
            pmf.j("Unable to parse json into type Dd", e2);
            return null;
        } catch (NullPointerException e3) {
            pmf.j("Unable to parse json into type Dd", e3);
            return null;
        } catch (NumberFormatException e4) {
            pmf.j("Unable to parse json into type Dd", e4);
            return null;
        }
    }

    public static int w(String str) {
        String strG1 = bsg.g1(str, '/');
        Locale locale = Locale.US;
        String strN = ij0.n(locale, strG1, locale);
        int iF0 = bsg.F0(str, '/', 0, 6);
        if (iF0 != -1) {
            str = str.substring(iF0 + 1, str.length());
        }
        String lowerCase = bsg.g1(str, ';').toLowerCase(locale);
        lowerCase.getClass();
        if (strN.equals("image")) {
            return 7;
        }
        if (strN.equals("video") || strN.equals("audio")) {
            return 11;
        }
        if (strN.equals("font")) {
            return 9;
        }
        if (strN.equals("text") && lowerCase.equals("css")) {
            return 10;
        }
        return (strN.equals("text") && lowerCase.equals("javascript")) ? 8 : 5;
    }

    public static final String x(Object obj) {
        return obj + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it to rememberSaveable().";
    }

    public static final yjh z(qjf qjfVar) {
        bz7 bz7Var;
        ArrayList arrayList = new ArrayList();
        Object objG = qjfVar.E.g(ojf.a);
        if (objG == null) {
            objG = null;
        }
        e5 e5Var = (e5) objG;
        if (e5Var == null || (bz7Var = (bz7) e5Var.b) == null || !((Boolean) bz7Var.invoke(arrayList)).booleanValue()) {
            return null;
        }
        return (yjh) arrayList.get(0);
    }

    public abstract int l(int i2, int i3, fu9 fu9Var, c3d c3dVar, int i4);

    public Integer o(c3d c3dVar) {
        return null;
    }

    public abstract void p();

    public abstract long y();
}
