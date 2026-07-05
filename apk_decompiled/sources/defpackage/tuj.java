package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import com.anthropic.claude.R;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes3.dex */
public abstract class tuj {
    public static final ta4 a = new ta4(1221414247, false, new p6(25));
    public static final o54 b;
    public static final float c;
    public static final o54 d;

    static {
        o54 o54Var = o54.M;
        b = o54Var;
        c = 0.38f;
        d = o54Var;
    }

    public static final void a(final zv8 zv8Var, final zy7 zy7Var, ld4 ld4Var, final int i) {
        r7e r7eVarS;
        pz7 pz7Var;
        zy7Var.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(111394004);
        int i2 = (e18Var.f(zv8Var) ? 4 : 2) | i | (e18Var.h(zy7Var) ? 32 : 16);
        final int i3 = 0;
        final int i4 = 1;
        if (!e18Var.Q(i2 & 1, (i2 & 19) != 18)) {
            e18Var.T();
        } else {
            if (zv8Var == null) {
                r7eVarS = e18Var.s();
                if (r7eVarS != null) {
                    pz7Var = new pz7(zv8Var, zy7Var, i, i3) { // from class: f42
                        public final /* synthetic */ int E;
                        public final /* synthetic */ zv8 F;
                        public final /* synthetic */ zy7 G;

                        {
                            this.E = i3;
                        }

                        @Override // defpackage.pz7
                        public final Object invoke(Object obj, Object obj2) {
                            int i5 = this.E;
                            iei ieiVar = iei.a;
                            zy7 zy7Var2 = this.G;
                            zv8 zv8Var2 = this.F;
                            ld4 ld4Var2 = (ld4) obj;
                            ((Integer) obj2).getClass();
                            switch (i5) {
                                case 0:
                                    tuj.a(zv8Var2, zy7Var2, ld4Var2, x44.p0(1));
                                    break;
                                default:
                                    tuj.a(zv8Var2, zy7Var2, ld4Var2, x44.p0(1));
                                    break;
                            }
                            return ieiVar;
                        }
                    };
                    r7eVarS.d = pz7Var;
                }
                return;
            }
            c(zv8Var.a, zy7Var, fd9.q0(1481730328, new fp(13, zv8Var), e18Var), e18Var, (i2 & 112) | 384);
        }
        r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            pz7Var = new pz7(zv8Var, zy7Var, i, i4) { // from class: f42
                public final /* synthetic */ int E;
                public final /* synthetic */ zv8 F;
                public final /* synthetic */ zy7 G;

                {
                    this.E = i4;
                }

                @Override // defpackage.pz7
                public final Object invoke(Object obj, Object obj2) {
                    int i5 = this.E;
                    iei ieiVar = iei.a;
                    zy7 zy7Var2 = this.G;
                    zv8 zv8Var2 = this.F;
                    ld4 ld4Var2 = (ld4) obj;
                    ((Integer) obj2).getClass();
                    switch (i5) {
                        case 0:
                            tuj.a(zv8Var2, zy7Var2, ld4Var2, x44.p0(1));
                            break;
                        default:
                            tuj.a(zv8Var2, zy7Var2, ld4Var2, x44.p0(1));
                            break;
                    }
                    return ieiVar;
                }
            };
            r7eVarS.d = pz7Var;
        }
    }

    public static final void b(String str, zy7 zy7Var, ld4 ld4Var, int i) {
        r7e r7eVarS;
        e42 e42Var;
        zy7Var.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-1180425747);
        int i2 = (e18Var.f(str) ? 4 : 2) | i | (e18Var.h(zy7Var) ? 32 : 16);
        int i3 = 0;
        int i4 = 1;
        if (!e18Var.Q(i2 & 1, (i2 & 19) != 18)) {
            e18Var.T();
        } else {
            if (str == null) {
                r7eVarS = e18Var.s();
                if (r7eVarS != null) {
                    e42Var = new e42(str, zy7Var, i, i3);
                    r7eVarS.d = e42Var;
                }
                return;
            }
            c(d4c.j0(R.string.ccr_image_preview_content_description, e18Var), zy7Var, fd9.q0(-635775439, new rq(str, 6), e18Var), e18Var, (i2 & 112) | 384);
        }
        r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            e42Var = new e42(str, zy7Var, i, i4);
            r7eVarS.d = e42Var;
        }
    }

    public static final void c(String str, zy7 zy7Var, ta4 ta4Var, ld4 ld4Var, int i) {
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(1493483685);
        int i2 = i | (e18Var.f(str) ? 4 : 2) | (e18Var.h(zy7Var) ? 32 : 16);
        int i3 = 1;
        if (e18Var.Q(i2 & 1, (i2 & 147) != 146)) {
            r4g r4gVarS = gb9.S(u4g.G, null, null, zy7Var, e18Var, ((i2 << 6) & 7168) | 6, 6);
            auj.b(r4gVarS, str, null, null, false, null, a5g.F, null, null, fd9.q0(452621552, new u22(r4gVarS, i3), e18Var), null, null, fd9.q0(604674015, new ru(ta4Var, 3), e18Var), e18Var, 819462152 | ((i2 << 3) & 112), 384, 3388);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new m6(i, 21, str, zy7Var, ta4Var, false);
        }
    }

    public static final String d(String str) {
        return w44.S0(bsg.X0(str, new char[]{'_'}, 6), " ", null, null, new kac(29), 30);
    }

    public static final Bitmap e(yd2 yd2Var, hj6 hj6Var, Object... objArr) {
        yd2Var.getClass();
        hj6Var.getClass();
        ge2 ge2Var = yd2Var.a;
        int iL = mwa.L(ge2Var.h().width());
        int iL2 = mwa.L(ge2Var.h().height());
        i52 i52VarK = ge2Var.k();
        wig wigVar = new wig(3);
        wigVar.b(objArr);
        wigVar.a(Integer.valueOf(iL));
        wigVar.a(Integer.valueOf(iL2));
        ArrayList arrayList = wigVar.a;
        Bitmap bitmap = (Bitmap) i52VarK.a(hj6Var, arrayList.toArray(new Object[arrayList.size()]));
        if (bitmap != null) {
            bitmap.eraseColor(0);
            return bitmap;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iL, iL2, Bitmap.Config.ARGB_8888);
        bitmapCreateBitmap.getClass();
        i52 i52VarK2 = ge2Var.k();
        wig wigVar2 = new wig(3);
        wigVar2.b(objArr);
        wigVar2.a(Integer.valueOf(iL));
        wigVar2.a(Integer.valueOf(iL2));
        ArrayList arrayList2 = wigVar2.a;
        i52VarK2.b(hj6Var, arrayList2.toArray(new Object[arrayList2.size()]), bitmapCreateBitmap);
        return bitmapCreateBitmap;
    }

    public static o54 f() {
        return b;
    }

    public static float g() {
        return c;
    }

    public static a6g h(Context context) {
        context.getClass();
        if (a6g.c == null) {
            ReentrantLock reentrantLock = a6g.d;
            reentrantLock.lock();
            try {
                if (a6g.c == null) {
                    y5g y5gVar = null;
                    try {
                        oti otiVarB = x5g.b();
                        if (otiVarB != null) {
                            oti otiVar = oti.J;
                            otiVar.getClass();
                            Object value = otiVarB.I.getValue();
                            value.getClass();
                            Object value2 = otiVar.I.getValue();
                            value2.getClass();
                            if (((BigInteger) value).compareTo((BigInteger) value2) >= 0) {
                                y5g y5gVar2 = new y5g(context);
                                if (y5gVar2.e()) {
                                    y5gVar = y5gVar2;
                                }
                            }
                        }
                    } catch (Throwable unused) {
                    }
                    a6g.c = new a6g(y5gVar);
                }
            } finally {
                reentrantLock.unlock();
            }
        }
        a6g a6gVar = a6g.c;
        a6gVar.getClass();
        return a6gVar;
    }

    public static o54 i() {
        return d;
    }

    public static final Object j(h5b h5bVar) {
        Object objZ = h5bVar.z();
        ju9 ju9Var = objZ instanceof ju9 ? (ju9) objZ : null;
        if (ju9Var != null) {
            return ju9Var.S;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object k(defpackage.afg r4, defpackage.vp4 r5) throws java.lang.Exception {
        /*
            boolean r0 = r5 instanceof defpackage.dqi
            if (r0 == 0) goto L13
            r0 = r5
            dqi r0 = (defpackage.dqi) r0
            int r1 = r0.H
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.H = r1
            goto L18
        L13:
            dqi r0 = new dqi
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.G
            int r1 = r0.H
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L32
            if (r1 != r2) goto L2c
            okio.Buffer r4 = r0.F
            afg r0 = r0.E
            defpackage.sf5.h0(r5)     // Catch: java.lang.Throwable -> L2a
            goto L4e
        L2a:
            r4 = move-exception
            goto L57
        L2c:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r4)
            return r3
        L32:
            defpackage.sf5.h0(r5)
            okio.Buffer r5 = new okio.Buffer     // Catch: java.lang.Throwable -> L55
            r5.<init>()     // Catch: java.lang.Throwable -> L55
            r0.E = r4     // Catch: java.lang.Throwable -> L55
            r0.F = r5     // Catch: java.lang.Throwable -> L55
            r0.H = r2     // Catch: java.lang.Throwable -> L55
            okio.BufferedSource r0 = r4.E     // Catch: java.lang.Throwable -> L55
            r0.F0(r5)     // Catch: java.lang.Throwable -> L55
            iei r0 = defpackage.iei.a     // Catch: java.lang.Throwable -> L55
            m45 r1 = defpackage.m45.E
            if (r0 != r1) goto L4c
            return r1
        L4c:
            r0 = r4
            r4 = r5
        L4e:
            defpackage.csg.o(r0, r3)
            return r4
        L52:
            r0 = r4
            r4 = r5
            goto L57
        L55:
            r5 = move-exception
            goto L52
        L57:
            throw r4     // Catch: java.lang.Throwable -> L58
        L58:
            r5 = move-exception
            defpackage.csg.o(r0, r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tuj.k(afg, vp4):java.lang.Object");
    }

    public static final int l(int i, int i2) {
        if (i == Integer.MAX_VALUE) {
            return i;
        }
        int i3 = i - i2;
        if (i3 < 0) {
            return 0;
        }
        return i3;
    }
}
