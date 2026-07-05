package defpackage;

import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Build;
import com.agog.mathdisplay.render.MTTypesetterKt;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class ja8 {
    public static final ut9 y;
    public final la8 a;
    public Outline f;
    public float j;
    public knk k;
    public c40 l;
    public c40 m;
    public boolean n;
    public ib2 o;
    public v30 p;
    public int q;
    public boolean s;
    public long t;
    public long u;
    public long v;
    public boolean w;
    public RectF x;
    public cz5 b = nai.f;
    public fu9 c = fu9.E;
    public bz7 d = j06.S;
    public final e0 e = new e0(17, this);
    public boolean g = true;
    public long h = 0;
    public long i = 9205357640488583168L;
    public final y50 r = new y50();

    static {
        String lowerCase = Build.FINGERPRINT.toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        y = lowerCase.equals("robolectric") ? tqh.N : Build.VERSION.SDK_INT >= 28 ? unb.J : lyk.Q;
    }

    public ja8(la8 la8Var) {
        this.a = la8Var;
        la8Var.E(false);
        this.t = 0L;
        this.u = 0L;
        this.v = 9205357640488583168L;
    }

    public final void a() {
        Outline outline;
        if (this.g) {
            boolean z = this.w;
            Outline outline2 = null;
            la8 la8Var = this.a;
            if (z || la8Var.L() > MTTypesetterKt.kLineSkipLimitMultiplier) {
                c40 c40Var = this.l;
                if (c40Var != null) {
                    RectF rectF = this.x;
                    if (rectF == null) {
                        rectF = new RectF();
                        this.x = rectF;
                    }
                    boolean z2 = c40Var instanceof c40;
                    if (!z2) {
                        pmf.n("Unable to obtain android.graphics.Path");
                        return;
                    }
                    Path path = c40Var.a;
                    path.computeBounds(rectF, false);
                    int i = Build.VERSION.SDK_INT;
                    if (i > 28 || path.isConvex()) {
                        outline = this.f;
                        if (outline == null) {
                            outline = new Outline();
                            this.f = outline;
                        }
                        if (i >= 30) {
                            if (!z2) {
                                pmf.n("Unable to obtain android.graphics.Path");
                                return;
                            }
                            outline.setPath(path);
                        } else {
                            if (!z2) {
                                pmf.n("Unable to obtain android.graphics.Path");
                                return;
                            }
                            outline.setConvexPath(path);
                        }
                        this.n = !outline.canClip();
                    } else {
                        Outline outline3 = this.f;
                        if (outline3 != null) {
                            outline3.setEmpty();
                        }
                        this.n = true;
                        outline = null;
                    }
                    this.l = c40Var;
                    if (outline != null) {
                        outline.setAlpha(la8Var.a());
                        outline2 = outline;
                    }
                    la8Var.h(outline2, (4294967295L & ((long) Math.round(rectF.height()))) | (((long) Math.round(rectF.width())) << 32));
                    if (this.n && this.w) {
                        la8Var.E(false);
                        la8Var.k();
                    } else {
                        la8Var.E(this.w);
                    }
                } else {
                    la8Var.E(this.w);
                    Outline outline4 = this.f;
                    if (outline4 == null) {
                        outline4 = new Outline();
                        this.f = outline4;
                    }
                    Outline outline5 = outline4;
                    long jT = csg.T(this.u);
                    long j = this.h;
                    long j2 = this.i;
                    long j3 = j2 == 9205357640488583168L ? jT : j2;
                    int i2 = (int) (j >> 32);
                    int i3 = (int) (j & 4294967295L);
                    outline5.setRoundRect(Math.round(Float.intBitsToFloat(i2)), Math.round(Float.intBitsToFloat(i3)), Math.round(Float.intBitsToFloat((int) (j3 >> 32)) + Float.intBitsToFloat(i2)), Math.round(Float.intBitsToFloat((int) (4294967295L & j3)) + Float.intBitsToFloat(i3)), this.j);
                    outline5.setAlpha(la8Var.a());
                    la8Var.h(outline5, csg.L(j3));
                }
            } else {
                la8Var.E(false);
                la8Var.h(null, 0L);
            }
        }
        this.g = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b() {
        /*
            r15 = this;
            boolean r0 = r15.s
            if (r0 == 0) goto L75
            int r0 = r15.q
            if (r0 != 0) goto L75
            y50 r0 = r15.r
            java.lang.Object r1 = r0.b
            ja8 r1 = (defpackage.ja8) r1
            if (r1 == 0) goto L1c
            int r2 = r1.q
            int r2 = r2 + (-1)
            r1.q = r2
            r1.b()
            r1 = 0
            r0.b = r1
        L1c:
            java.lang.Object r0 = r0.d
            fwb r0 = (defpackage.fwb) r0
            if (r0 == 0) goto L70
            java.lang.Object[] r1 = r0.b
            long[] r2 = r0.a
            int r3 = r2.length
            int r3 = r3 + (-2)
            if (r3 < 0) goto L6d
            r4 = 0
            r5 = r4
        L2d:
            r6 = r2[r5]
            long r8 = ~r6
            r10 = 7
            long r8 = r8 << r10
            long r8 = r8 & r6
            r10 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r8 = r8 & r10
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 == 0) goto L68
            int r8 = r5 - r3
            int r8 = ~r8
            int r8 = r8 >>> 31
            r9 = 8
            int r8 = 8 - r8
            r10 = r4
        L47:
            if (r10 >= r8) goto L66
            r11 = 255(0xff, double:1.26E-321)
            long r11 = r11 & r6
            r13 = 128(0x80, double:6.3E-322)
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 >= 0) goto L62
            int r11 = r5 << 3
            int r11 = r11 + r10
            r11 = r1[r11]
            ja8 r11 = (defpackage.ja8) r11
            int r12 = r11.q
            int r12 = r12 + (-1)
            r11.q = r12
            r11.b()
        L62:
            long r6 = r6 >> r9
            int r10 = r10 + 1
            goto L47
        L66:
            if (r8 != r9) goto L6d
        L68:
            if (r5 == r3) goto L6d
            int r5 = r5 + 1
            goto L2d
        L6d:
            r0.b()
        L70:
            la8 r15 = r15.a
            r15.k()
        L75:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ja8.b():void");
    }

    public final void c(fb2 fb2Var, ja8 ja8Var) {
        boolean z;
        boolean z2;
        Canvas canvas;
        boolean z3;
        float f;
        if (this.s) {
            return;
        }
        a();
        la8 la8Var = this.a;
        if (!la8Var.s()) {
            try {
                la8Var.p(this.b, this.c, this, this.e);
            } catch (Throwable unused) {
            }
        }
        boolean z4 = la8Var.L() > MTTypesetterKt.kLineSkipLimitMultiplier;
        if (z4) {
            fb2Var.s();
        }
        Canvas canvasB = jz.b(fb2Var);
        boolean zIsHardwareAccelerated = canvasB.isHardwareAccelerated();
        if (!zIsHardwareAccelerated) {
            long j = this.t;
            float f2 = (int) (j >> 32);
            float f3 = (int) (j & 4294967295L);
            long j2 = this.u;
            float f4 = ((int) (j2 >> 32)) + f2;
            float f5 = ((int) (j2 & 4294967295L)) + f3;
            float fA = la8Var.a();
            hr1 hr1VarN = la8Var.n();
            int iO = la8Var.O();
            if (fA < 1.0f || iO != 3 || hr1VarN != null || la8Var.m() == 1) {
                v30 v30VarJ = this.p;
                if (v30VarJ == null) {
                    v30VarJ = dch.j();
                    this.p = v30VarJ;
                }
                v30VarJ.c(fA);
                v30VarJ.d(iO);
                v30VarJ.f(hr1VarN);
                canvasB = canvasB;
                f = f2;
                canvasB.saveLayer(f, f3, f4, f5, v30VarJ.a);
            } else {
                canvasB.save();
                canvasB = canvasB;
                f = f2;
            }
            canvasB.translate(f, f3);
            canvasB.concat(la8Var.J());
        }
        boolean z5 = !zIsHardwareAccelerated && this.w;
        if (z5) {
            fb2Var.g();
            knk knkVarE = e();
            if (knkVarE instanceof flc) {
                fb2.q(fb2Var, ((flc) knkVarE).k);
            } else if (knkVarE instanceof glc) {
                c40 c40VarA = this.m;
                if (c40VarA != null) {
                    c40VarA.j();
                } else {
                    c40VarA = f40.a();
                    this.m = c40VarA;
                }
                c40.c(c40VarA, ((glc) knkVarE).k);
                fb2Var.l(c40VarA);
            } else {
                if (!(knkVarE instanceof elc)) {
                    mr9.b();
                    return;
                }
                fb2Var.l(((elc) knkVarE).k);
            }
        }
        if (ja8Var != null) {
            y50 y50Var = ja8Var.r;
            if (!y50Var.a) {
                a39.a("Only add dependencies during a tracking");
            }
            fwb fwbVar = (fwb) y50Var.d;
            if (fwbVar != null) {
                fwbVar.a(this);
            } else if (((ja8) y50Var.b) != null) {
                fwb fwbVar2 = v6f.a;
                fwb fwbVar3 = new fwb();
                ja8 ja8Var2 = (ja8) y50Var.b;
                ja8Var2.getClass();
                fwbVar3.a(ja8Var2);
                fwbVar3.a(this);
                y50Var.d = fwbVar3;
                y50Var.b = null;
            } else {
                y50Var.b = this;
            }
            fwb fwbVar4 = (fwb) y50Var.e;
            if (fwbVar4 != null) {
                z3 = !fwbVar4.m(this);
            } else if (((ja8) y50Var.c) != this) {
                z3 = true;
            } else {
                y50Var.c = null;
                z3 = false;
            }
            if (z3) {
                this.q++;
            }
        }
        if (((iz) fb2Var).a.isHardwareAccelerated()) {
            z = z4;
            z2 = z5;
            canvas = canvasB;
            la8Var.l(fb2Var);
        } else {
            ib2 ib2Var = this.o;
            if (ib2Var == null) {
                ib2Var = new ib2();
                this.o = ib2Var;
            }
            fj0 fj0Var = ib2Var.F;
            cz5 cz5Var = this.b;
            fu9 fu9Var = this.c;
            long jT = csg.T(this.u);
            cz5 cz5VarS = fj0Var.s();
            fu9 fu9VarU = fj0Var.u();
            fb2 fb2VarP = fj0Var.p();
            z2 = z5;
            canvas = canvasB;
            long jW = fj0Var.w();
            z = z4;
            ja8 ja8Var3 = (ja8) fj0Var.F;
            fj0Var.L(cz5Var);
            fj0Var.M(fu9Var);
            fj0Var.K(fb2Var);
            fj0Var.N(jT);
            fj0Var.F = this;
            fb2Var.g();
            try {
                d(ib2Var);
            } finally {
                fb2Var.p();
                fj0Var.L(cz5VarS);
                fj0Var.M(fu9VarU);
                fj0Var.K(fb2VarP);
                fj0Var.N(jW);
                fj0Var.F = ja8Var3;
            }
        }
        if (z2) {
            fb2Var.p();
        }
        if (z) {
            fb2Var.i();
        }
        if (zIsHardwareAccelerated) {
            return;
        }
        canvas.restore();
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0094  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(defpackage.xd6 r14) {
        /*
            r13 = this;
            y50 r0 = r13.r
            java.lang.Object r1 = r0.b
            ja8 r1 = (defpackage.ja8) r1
            r0.c = r1
            java.lang.Object r1 = r0.d
            fwb r1 = (defpackage.fwb) r1
            if (r1 == 0) goto L29
            boolean r2 = r1.i()
            if (r2 == 0) goto L29
            java.lang.Object r2 = r0.e
            fwb r2 = (defpackage.fwb) r2
            if (r2 != 0) goto L23
            fwb r2 = defpackage.v6f.a
            fwb r2 = new fwb
            r2.<init>()
            r0.e = r2
        L23:
            r2.k(r1)
            r1.b()
        L29:
            r1 = 1
            r0.a = r1
            bz7 r13 = r13.d
            r13.invoke(r14)
            r13 = 0
            r0.a = r13
            java.lang.Object r14 = r0.c
            ja8 r14 = (defpackage.ja8) r14
            if (r14 == 0) goto L43
            int r1 = r14.q
            int r1 = r1 + (-1)
            r14.q = r1
            r14.b()
        L43:
            java.lang.Object r14 = r0.e
            fwb r14 = (defpackage.fwb) r14
            if (r14 == 0) goto L9c
            boolean r0 = r14.i()
            if (r0 == 0) goto L9c
            java.lang.Object[] r0 = r14.b
            long[] r1 = r14.a
            int r2 = r1.length
            int r2 = r2 + (-2)
            if (r2 < 0) goto L99
            r3 = r13
        L59:
            r4 = r1[r3]
            long r6 = ~r4
            r8 = 7
            long r6 = r6 << r8
            long r6 = r6 & r4
            r8 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r6 = r6 & r8
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 == 0) goto L94
            int r6 = r3 - r2
            int r6 = ~r6
            int r6 = r6 >>> 31
            r7 = 8
            int r6 = 8 - r6
            r8 = r13
        L73:
            if (r8 >= r6) goto L92
            r9 = 255(0xff, double:1.26E-321)
            long r9 = r9 & r4
            r11 = 128(0x80, double:6.3E-322)
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 >= 0) goto L8e
            int r9 = r3 << 3
            int r9 = r9 + r8
            r9 = r0[r9]
            ja8 r9 = (defpackage.ja8) r9
            int r10 = r9.q
            int r10 = r10 + (-1)
            r9.q = r10
            r9.b()
        L8e:
            long r4 = r4 >> r7
            int r8 = r8 + 1
            goto L73
        L92:
            if (r6 != r7) goto L99
        L94:
            if (r3 == r2) goto L99
            int r3 = r3 + 1
            goto L59
        L99:
            r14.b()
        L9c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ja8.d(xd6):void");
    }

    public final knk e() {
        knk flcVar;
        knk knkVar = this.k;
        c40 c40Var = this.l;
        if (knkVar != null) {
            return knkVar;
        }
        if (c40Var != null) {
            elc elcVar = new elc(c40Var);
            this.k = elcVar;
            return elcVar;
        }
        long jT = csg.T(this.u);
        long j = this.h;
        long j2 = this.i;
        if (j2 != 9205357640488583168L) {
            jT = j2;
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (jT >> 32)) + fIntBitsToFloat;
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (jT & 4294967295L)) + fIntBitsToFloat2;
        float f = this.j;
        if (f > MTTypesetterKt.kLineSkipLimitMultiplier) {
            flcVar = new glc(gb9.f(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat3, fIntBitsToFloat4, (((long) Float.floatToRawIntBits(f)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(f)))));
        } else {
            flcVar = new flc(new l9e(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat3, fIntBitsToFloat4));
        }
        this.k = flcVar;
        return flcVar;
    }

    public final void f(cz5 cz5Var, fu9 fu9Var, long j, bz7 bz7Var) {
        boolean zB = g79.b(this.u, j);
        la8 la8Var = this.a;
        if (!zB) {
            this.u = j;
            long j2 = this.t;
            la8Var.q((int) (j2 >> 32), (int) (j2 & 4294967295L), j);
            if (this.i == 9205357640488583168L) {
                this.g = true;
                a();
            }
        }
        this.b = cz5Var;
        this.c = fu9Var;
        this.d = bz7Var;
        la8Var.p(cz5Var, fu9Var, this, this.e);
    }

    public final void g(float f) {
        la8 la8Var = this.a;
        if (la8Var.a() == f) {
            return;
        }
        la8Var.w(f);
    }

    public final void h(boolean z) {
        if (this.w != z) {
            this.w = z;
            this.g = true;
            a();
        }
    }

    public final void i(vfe vfeVar) {
        la8 la8Var = this.a;
        if (x44.r(la8Var.e(), vfeVar)) {
            return;
        }
        la8Var.i(vfeVar);
    }

    public final void j(float f, long j, long j2) {
        if (fcc.c(this.h, j) && k8g.b(this.i, j2) && this.j == f && this.l == null) {
            return;
        }
        this.k = null;
        this.l = null;
        this.g = true;
        this.n = false;
        this.h = j;
        this.i = j2;
        this.j = f;
        a();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(defpackage.vp4 r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.ia8
            if (r0 == 0) goto L13
            r0 = r5
            ia8 r0 = (defpackage.ia8) r0
            int r1 = r0.G
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.G = r1
            goto L18
        L13:
            ia8 r0 = new ia8
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.E
            int r1 = r0.G
            r2 = 1
            if (r1 == 0) goto L2c
            if (r1 != r2) goto L25
            defpackage.sf5.h0(r5)
            goto L3c
        L25:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r4)
            r4 = 0
            return r4
        L2c:
            defpackage.sf5.h0(r5)
            r0.G = r2
            ut9 r5 = defpackage.ja8.y
            java.lang.Object r5 = r5.o(r4, r0)
            m45 r4 = defpackage.m45.E
            if (r5 != r4) goto L3c
            return r4
        L3c:
            android.graphics.Bitmap r5 = (android.graphics.Bitmap) r5
            r20 r4 = new r20
            r4.<init>(r5)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ja8.k(vp4):java.lang.Object");
    }
}
