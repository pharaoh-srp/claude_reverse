package defpackage;

import android.R;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.arkivanov.essenty.statekeeper.SerializableContainer;
import com.arkivanov.essenty.statekeeper.b;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.MalformedJsonException;
import com.pvporbit.freetype.FreeTypeConstants;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlinx.coroutines.DispatchException;
import kotlinx.coroutines.TimeoutCancellationException;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
public abstract class gb9 {
    public static final z5d a = new z5d(null, new i5d());
    public static final Object b = new Object();

    public static final boolean A(sve sveVar) {
        long j = sveVar.e;
        return (j >>> 32) == (4294967295L & j) && j == sveVar.f && j == sveVar.g && j == sveVar.h;
    }

    public static boolean B(char c) {
        return Character.isWhitespace(c) || Character.isSpaceChar(c);
    }

    public static final fkg C(l45 l45Var, c45 c45Var, o45 o45Var, pz7 pz7Var) {
        c45 c45VarP = zni.P(l45Var, c45Var);
        o45Var.getClass();
        fkg l1aVar = o45Var == o45.F ? new l1a(c45VarP, pz7Var) : new fkg(c45VarP, true);
        l1aVar.w0(o45Var, l1aVar, pz7Var);
        return l1aVar;
    }

    public static /* synthetic */ fkg D(l45 l45Var, c45 c45Var, o45 o45Var, pz7 pz7Var, int i) {
        if ((i & 1) != 0) {
            c45Var = im6.E;
        }
        if ((i & 2) != 0) {
            o45Var = o45.E;
        }
        return C(l45Var, c45Var, o45Var, pz7Var);
    }

    public static final iqb I(iqb iqbVar, mnc mncVar) {
        return iqbVar.B(new pnc(mncVar));
    }

    public static final iqb J(iqb iqbVar, float f) {
        return iqbVar.B(new inc(f, f, f, f));
    }

    public static final iqb K(iqb iqbVar, float f, float f2) {
        return iqbVar.B(new inc(f, f2, f, f2));
    }

    public static iqb L(iqb iqbVar, float f, float f2, int i) {
        if ((i & 1) != 0) {
            f = 0.0f;
        }
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        return K(iqbVar, f, f2);
    }

    public static final iqb M(iqb iqbVar, float f, float f2, float f3, float f4) {
        return iqbVar.B(new inc(f, f2, f3, f4));
    }

    public static iqb N(iqb iqbVar, float f, float f2, float f3, float f4, int i) {
        if ((i & 1) != 0) {
            f = 0.0f;
        }
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        if ((i & 4) != 0) {
            f3 = 0.0f;
        }
        if ((i & 8) != 0) {
            f4 = 0.0f;
        }
        return M(iqbVar, f, f2, f3, f4);
    }

    public static bh9 O(JsonReader jsonReader) {
        boolean z;
        try {
            try {
                jsonReader.peek();
                z = false;
            } catch (EOFException e) {
                e = e;
                z = true;
            }
            try {
                return (bh9) n9i.z.a(jsonReader);
            } catch (EOFException e2) {
                e = e2;
                if (z) {
                    return oh9.E;
                }
                throw new JsonSyntaxException(e);
            }
        } catch (MalformedJsonException e3) {
            throw new JsonSyntaxException(e3);
        } catch (IOException e4) {
            throw new JsonIOException(e4);
        } catch (NumberFormatException e5) {
            throw new JsonSyntaxException(e5);
        }
    }

    public static final b29 R(String str, ld4 ld4Var, int i) {
        e18 e18Var = (e18) ld4Var;
        Object objN = e18Var.N();
        if (objN == jd4.a) {
            objN = new b29();
            e18Var.k0(objN);
        }
        b29 b29Var = (b29) objN;
        b29Var.a(0, e18Var);
        return b29Var;
    }

    public static final r4g S(u4g u4gVar, zy7 zy7Var, l45 l45Var, zy7 zy7Var2, ld4 ld4Var, int i, int i2) {
        l45 l45Var2;
        final cb9 cb9Var;
        boolean z;
        e18 e18Var;
        zy7Var2.getClass();
        u4g u4gVar2 = (i2 & 1) != 0 ? k4g.d : u4gVar;
        zy7 zy7Var3 = (i2 & 2) != 0 ? null : zy7Var;
        int i3 = i2 & 4;
        lz1 lz1Var = jd4.a;
        if (i3 != 0) {
            e18 e18Var2 = (e18) ld4Var;
            Object objN = e18Var2.N();
            if (objN == lz1Var) {
                objN = fd9.O(im6.E, e18Var2);
                e18Var2.k0(objN);
            }
            l45Var2 = (l45) objN;
        } else {
            l45Var2 = l45Var;
        }
        u4gVar2.getClass();
        if (u4gVar2 == u4g.H) {
            e18 e18Var3 = (e18) ld4Var;
            e18Var3.a0(-2028260728);
            Object objN2 = e18Var3.N();
            if (objN2 == lz1Var) {
                objN2 = new cb9();
                e18Var3.k0(objN2);
            }
            e18Var3.p(false);
            cb9Var = (cb9) objN2;
        } else {
            e18 e18Var4 = (e18) ld4Var;
            e18Var4.a0(-2028222940);
            e18Var4.p(false);
            cb9Var = null;
        }
        int i4 = (i & 14) | 64 | ((i << 3) & 896);
        boolean zV = x44.V(ld4Var);
        boolean z2 = !(u4gVar2 == u4g.E || u4gVar2 == u4g.F) || zV;
        e18 e18Var5 = (e18) ld4Var;
        cz5 cz5Var = (cz5) e18Var5.j(ve4.h);
        float f = u4gVar2 == u4g.G ? k4g.c : Float.NaN;
        boolean zF = e18Var5.f(cz5Var) | e18Var5.c(f);
        Object objN3 = e18Var5.N();
        if (zF || objN3 == lz1Var) {
            objN3 = Float.valueOf(va6.b(f, Float.NaN) ? MTTypesetterKt.kLineSkipLimitMultiplier : cz5Var.q0(f));
            e18Var5.k0(objN3);
        }
        final float fFloatValue = ((Number) objN3).floatValue();
        final dae daeVar = new dae();
        final nwb nwbVarZ = mpk.Z(zy7Var3, e18Var5);
        final nwb nwbVarZ2 = mpk.Z(Boolean.valueOf(zV), e18Var5);
        boolean z3 = (((i4 & 14) ^ 6) > 4 && e18Var5.d(u4gVar2.ordinal())) || (i4 & 6) == 4;
        Object objN4 = e18Var5.N();
        if (z3 || objN4 == lz1Var) {
            z = z2;
            final float f2 = f;
            e18Var = e18Var5;
            bz7 bz7Var = new bz7() { // from class: w4g
                @Override // defpackage.bz7
                public final Object invoke(Object obj) {
                    boolean z4;
                    float f3;
                    float f4;
                    b5g b5gVar = (b5g) obj;
                    b5gVar.getClass();
                    if (b5gVar == b5g.E) {
                        zy7 zy7Var4 = (zy7) nwbVarZ.getValue();
                        if (zy7Var4 == null || ((Boolean) zy7Var4.a()).booleanValue()) {
                            if (!((Boolean) nwbVarZ2.getValue()).booleanValue()) {
                                cb9 cb9Var2 = cb9Var;
                                dae daeVar2 = daeVar;
                                if (cb9Var2 != null) {
                                    Object obj2 = daeVar2.E;
                                    if (obj2 == null) {
                                        x44.o0("sheetState");
                                        throw null;
                                    }
                                    try {
                                        f4 = ((ry) ((v4g) obj2).d.F).f();
                                    } catch (IllegalStateException unused) {
                                        f4 = 0.0f;
                                    }
                                    bb9 bb9Var = cb9Var2.a;
                                    if (bb9Var != null && f4 != MTTypesetterKt.kLineSkipLimitMultiplier && f4 > bb9Var.a() && f4 <= bb9Var.b()) {
                                    }
                                } else if (!va6.b(f2, Float.NaN)) {
                                    Object obj3 = daeVar2.E;
                                    if (obj3 == null) {
                                        x44.o0("sheetState");
                                        throw null;
                                    }
                                    try {
                                        f3 = ((ry) ((v4g) obj3).d.F).f();
                                    } catch (IllegalStateException unused2) {
                                        f3 = 0.0f;
                                    }
                                    if (f3 != MTTypesetterKt.kLineSkipLimitMultiplier && f3 <= fFloatValue) {
                                    }
                                }
                            }
                            z4 = true;
                        }
                        z4 = false;
                    } else {
                        z4 = true;
                    }
                    return Boolean.valueOf(z4);
                }
            };
            e18Var.k0(bz7Var);
            objN4 = bz7Var;
        } else {
            z = z2;
            e18Var = e18Var5;
        }
        v4g v4gVarG = iuj.G(z, (bz7) objN4, e18Var, 0, 0);
        daeVar.E = v4gVarG;
        if (v4gVarG == null) {
            x44.o0("sheetState");
            throw null;
        }
        boolean z4 = zy7Var3 != null;
        nwb nwbVarZ3 = mpk.Z(zy7Var2, ld4Var);
        boolean zF2 = e18Var.f(v4gVarG) | e18Var.g(z4) | ((((i & 896) ^ 384) > 256 && e18Var.f(l45Var2)) || (i & 384) == 256);
        Object objN5 = e18Var.N();
        if (zF2 || objN5 == lz1Var) {
            objN5 = new r4g(v4gVarG, u4gVar2, z4, cb9Var, l45Var2, new fg1(21, nwbVarZ3));
            e18Var.k0(objN5);
        }
        return (r4g) objN5;
    }

    public static final iqb T(iqb iqbVar, bt7 bt7Var, ld4 ld4Var, int i) {
        iqbVar.getClass();
        bt7Var.getClass();
        h86.a.getClass();
        e18 e18Var = (e18) ld4Var;
        Configuration configuration = (Configuration) e18Var.j(w00.a);
        Object[] objArr = new Object[0];
        Object objN = e18Var.N();
        lz1 lz1Var = jd4.a;
        if (objN == lz1Var) {
            objN = new wof(22);
            e18Var.k0(objN);
        }
        nwb nwbVar = (nwb) iuj.I(objArr, (zy7) objN, e18Var, 48);
        Object objN2 = e18Var.N();
        if (objN2 == lz1Var) {
            objN2 = fd9.O(im6.E, e18Var);
            e18Var.k0(objN2);
        }
        l45 l45Var = (l45) objN2;
        boolean zF = e18Var.f(nwbVar) | e18Var.h(configuration) | e18Var.h(l45Var) | ((((i & 896) ^ 384) > 256 && e18Var.h(sq5.b)) || (i & 384) == 256) | ((((i & 112) ^ 48) > 32 && e18Var.f(bt7Var)) || (i & 48) == 32);
        Object objN3 = e18Var.N();
        if (zF || objN3 == lz1Var) {
            x70 x70Var = new x70(nwbVar, configuration, l45Var, bt7Var, 10);
            e18Var.k0(x70Var);
            objN3 = x70Var;
        }
        return u00.C(iqbVar, (bz7) objN3);
    }

    public static Object U(pz7 pz7Var) {
        return V(im6.E, pz7Var);
    }

    public static final Object V(c45 c45Var, pz7 pz7Var) throws Throwable {
        vz6 vz6VarA;
        c45 c45VarX;
        long jV0;
        b45 b45Var = a5.G;
        e45 e45Var = (e45) c45Var.x0(b45Var);
        im6 im6Var = im6.E;
        if (e45Var == null) {
            vz6VarA = vnh.a();
            c45VarX = zni.x(im6Var, c45Var.r0(vz6VarA), true);
            ft5 ft5Var = g86.a;
            if (c45VarX != ft5Var && c45VarX.x0(b45Var) == null) {
                c45VarX = c45VarX.r0(ft5Var);
            }
        } else {
            vz6VarA = (vz6) vnh.a.get();
            c45VarX = zni.x(im6Var, c45Var, true);
            ft5 ft5Var2 = g86.a;
            if (c45VarX != ft5Var2 && c45VarX.x0(b45Var) == null) {
                c45VarX = c45VarX.r0(ft5Var2);
            }
        }
        yr1 yr1Var = new yr1(c45VarX, Thread.currentThread(), vz6VarA);
        yr1Var.w0(o45.E, yr1Var, pz7Var);
        vz6 vz6Var = yr1Var.K;
        if (vz6Var != null) {
            int i = vz6.J;
            vz6Var.U0(false);
        }
        while (true) {
            if (vz6Var != null) {
                try {
                    jV0 = vz6Var.V0();
                } catch (Throwable th) {
                    if (vz6Var != null) {
                        int i2 = vz6.J;
                        vz6Var.S0(false);
                    }
                    throw th;
                }
            } else {
                jV0 = Long.MAX_VALUE;
            }
            if (yr1Var.Z()) {
                break;
            }
            LockSupport.parkNanos(yr1Var, jV0);
            if (Thread.interrupted()) {
                yr1Var.y(new InterruptedException());
            }
        }
        if (vz6Var != null) {
            int i3 = vz6.J;
            vz6Var.S0(false);
        }
        Object objA = wf9.a(yr1Var.U());
        e94 e94Var = objA instanceof e94 ? (e94) objA : null;
        if (e94Var == null) {
            return objA;
        }
        throw e94Var.a;
    }

    public static final Object W(n7f n7fVar, boolean z, n7f n7fVar2, pz7 pz7Var) throws Throwable {
        Object e94Var;
        Object objD0;
        try {
            if (pz7Var instanceof vd1) {
                nai.n(2, pz7Var);
                e94Var = pz7Var.invoke(n7fVar2, n7fVar);
            } else {
                e94Var = zni.f0(pz7Var, n7fVar2, n7fVar);
            }
        } catch (DispatchException e) {
            Throwable th = e.E;
            n7fVar.c0(new e94(th, false));
            throw th;
        } catch (Throwable th2) {
            e94Var = new e94(th2, false);
        }
        m45 m45Var = m45.E;
        if (e94Var == m45Var || (objD0 = n7fVar.d0(e94Var)) == wf9.b) {
            return m45Var;
        }
        n7fVar.y0();
        if (!(objD0 instanceof e94)) {
            return wf9.a(objD0);
        }
        if (!z) {
            Throwable th3 = ((e94) objD0).a;
            if ((th3 instanceof TimeoutCancellationException) && ((TimeoutCancellationException) th3).E == n7fVar) {
                if (e94Var instanceof e94) {
                    throw ((e94) e94Var).a;
                }
                return e94Var;
            }
        }
        throw ((e94) objD0).a;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object X(int r5, java.lang.Object r6, defpackage.k20 r7, defpackage.dv7 r8, int r9) {
        /*
            boolean r0 = r6 instanceof android.graphics.Typeface
            if (r0 != 0) goto L5
            return r6
        L5:
            r0 = r5 & 1
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L2d
            dv7 r0 = r7.b()
            boolean r0 = defpackage.x44.r(r0, r8)
            if (r0 != 0) goto L2d
            dv7 r0 = defpackage.dv7.H
            int r3 = r8.compareTo(r0)
            if (r3 < 0) goto L2d
            dv7 r3 = r7.b()
            int r3 = r3.E
            int r0 = r0.E
            int r0 = defpackage.x44.z(r3, r0)
            if (r0 >= 0) goto L2d
            r0 = r2
            goto L2e
        L2d:
            r0 = r1
        L2e:
            r5 = r5 & 2
            if (r5 == 0) goto L3b
            int r5 = r7.a()
            if (r9 != r5) goto L39
            goto L3b
        L39:
            r5 = r2
            goto L3c
        L3b:
            r5 = r1
        L3c:
            if (r5 != 0) goto L41
            if (r0 != 0) goto L41
            return r6
        L41:
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 28
            if (r3 >= r4) goto L57
            if (r5 == 0) goto L4c
            if (r9 != r2) goto L4c
            r1 = r2
        L4c:
            int r5 = defpackage.xpk.b(r0, r1)
            android.graphics.Typeface r6 = (android.graphics.Typeface) r6
            android.graphics.Typeface r5 = android.graphics.Typeface.create(r6, r5)
            return r5
        L57:
            if (r0 == 0) goto L5c
            int r8 = r8.E
            goto L62
        L5c:
            dv7 r8 = r7.b()
            int r8 = r8.E
        L62:
            if (r5 == 0) goto L68
            if (r9 != r2) goto L6f
        L66:
            r1 = r2
            goto L6f
        L68:
            int r5 = r7.a()
            if (r5 != r2) goto L6f
            goto L66
        L6f:
            android.graphics.Typeface r6 = (android.graphics.Typeface) r6
            android.graphics.Typeface r5 = defpackage.vwk.c(r6, r8, r1)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gb9.X(int, java.lang.Object, k20, dv7, int):java.lang.Object");
    }

    public static xzc Y(int i) {
        return (i < 0 || i >= 5) ? (5 > i || i >= 12) ? (12 > i || i >= 18) ? xzc.G : xzc.F : xzc.E : xzc.H;
    }

    public static final long Z(long j, long j2) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32)) * Float.intBitsToFloat((int) (j >> 32));
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j2 & 4294967295L)) * Float.intBitsToFloat((int) (j & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
    }

    public static final qnc a(float f, float f2) {
        return new qnc(f, f2, f, f2);
    }

    public static String a0(char c, Locale locale) {
        locale.getClass();
        String strValueOf = String.valueOf(c);
        strValueOf.getClass();
        String upperCase = strValueOf.toUpperCase(locale);
        upperCase.getClass();
        if (upperCase.length() <= 1) {
            String strValueOf2 = String.valueOf(c);
            strValueOf2.getClass();
            String upperCase2 = strValueOf2.toUpperCase(Locale.ROOT);
            upperCase2.getClass();
            if (upperCase.equals(upperCase2)) {
                return String.valueOf(Character.toTitleCase(c));
            }
        } else if (c != 329) {
            char cCharAt = upperCase.charAt(0);
            String lowerCase = upperCase.substring(1).toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            return cCharAt + lowerCase;
        }
        return upperCase;
    }

    public static qnc b(float f, float f2, int i) {
        if ((i & 1) != 0) {
            f = 0.0f;
        }
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        return new qnc(f, f2, f, f2);
    }

    public static final void b0() {
        throw new UnsupportedOperationException();
    }

    public static final qnc c(float f, float f2, float f3, float f4) {
        return new qnc(f, f2, f3, f4);
    }

    public static final Object c0(c45 c45Var, pz7 pz7Var, tp4 tp4Var) throws Throwable {
        c45 context = tp4Var.getContext();
        c45 c45VarR0 = !((Boolean) c45Var.K(new z35(1), Boolean.FALSE)).booleanValue() ? context.r0(c45Var) : zni.x(context, c45Var, false);
        knk.u(c45VarR0);
        if (c45VarR0 == context) {
            n7f n7fVar = new n7f(tp4Var, c45VarR0);
            return W(n7fVar, true, n7fVar, pz7Var);
        }
        a5 a5Var = a5.G;
        if (x44.r(c45VarR0.x0(a5Var), context.x0(a5Var))) {
            ydi ydiVar = new ydi(tp4Var, c45VarR0);
            c45 c45Var2 = ydiVar.I;
            Object objC = qnh.c(c45Var2, null);
            try {
                return W(ydiVar, true, ydiVar, pz7Var);
            } finally {
                qnh.a(c45Var2, objC);
            }
        }
        b86 b86Var = new b86(tp4Var, c45VarR0);
        try {
            a86.a(zni.I(zni.p(b86Var, b86Var, pz7Var)), iei.a);
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = b86.K;
            do {
                int i = atomicIntegerFieldUpdater.get(b86Var);
                if (i != 0) {
                    if (i != 2) {
                        sz6.j("Already suspended");
                        return null;
                    }
                    Object objA = wf9.a(b86Var.U());
                    if (objA instanceof e94) {
                        throw ((e94) objA).a;
                    }
                    return objA;
                }
            } while (!atomicIntegerFieldUpdater.compareAndSet(b86Var, 0, 1));
            return m45.E;
        } catch (Throwable th) {
            th = th;
            if (th instanceof DispatchException) {
                th = ((DispatchException) th).E;
            }
            b86Var.resumeWith(sf5.u(th));
            throw th;
        }
    }

    public static qnc d(float f, float f2, float f3, float f4, int i) {
        if ((i & 1) != 0) {
            f = 0.0f;
        }
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        if ((i & 4) != 0) {
            f3 = 0.0f;
        }
        if ((i & 8) != 0) {
            f4 = 0.0f;
        }
        return new qnc(f, f2, f3, f4);
    }

    public static final sve e(l9e l9eVar, long j, long j2, long j3, long j4) {
        return new sve(l9eVar.a, l9eVar.b, l9eVar.c, l9eVar.d, j, j2, j3, j4);
    }

    public static final sve f(float f, float f2, float f3, float f4, long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(fIntBitsToFloat2)));
        return new sve(f, f2, f3, f4, jFloatToRawIntBits, jFloatToRawIntBits, jFloatToRawIntBits, jFloatToRawIntBits);
    }

    public static final void g(i6 i6Var, wjf wjfVar) {
        if (mwa.n(wjfVar)) {
            qjf qjfVar = wjfVar.d;
            Object objG = qjfVar.E.g(ojf.i);
            if (objG == null) {
                objG = null;
            }
            e5 e5Var = (e5) objG;
            if (e5Var != null) {
                i6Var.a(new b6(R.id.accessibilityActionSetProgress, e5Var.a));
            }
        }
    }

    public static void h(vag vagVar, List list, le4 le4Var) {
        List list2 = list;
        if (list2.isEmpty()) {
            return;
        }
        int size = list2.size();
        for (int i = 0; i < size; i++) {
            int iC = vagVar.c((y08) list.get(i));
            int iN = vagVar.N(vagVar.r(iC), vagVar.b);
            Object obj = iN < vagVar.g(vagVar.r(iC + 1), vagVar.b) ? vagVar.c[vagVar.h(iN)] : jd4.a;
            r7e r7eVar = obj instanceof r7e ? (r7e) obj : null;
            if (r7eVar != null) {
                r7eVar.a = le4Var;
            }
        }
    }

    public static iqb i(iqb iqbVar, z8i z8iVar, int i) {
        kl7 kl7VarK = z8iVar;
        if ((i & 1) != 0) {
            l9e l9eVar = nzi.a;
            kl7VarK = kxk.K(MTTypesetterKt.kLineSkipLimitMultiplier, 400.0f, new g79(4294967297L), 1);
        }
        return xn5.W(iqbVar).B(new l8g(kl7VarK));
    }

    public static final z19 j(b29 b29Var, float f, float f2, y19 y19Var, String str, ld4 ld4Var, int i, int i2) {
        z19 z19Var;
        Float fValueOf = Float.valueOf(f);
        Float fValueOf2 = Float.valueOf(f2);
        int i3 = (i & 1022) | FreeTypeConstants.FT_LOAD_NO_AUTOHINT | ((i << 3) & 458752);
        e18 e18Var = (e18) ld4Var;
        Object objN = e18Var.N();
        lz1 lz1Var = jd4.a;
        if (objN == lz1Var) {
            objN = new z19(b29Var, fValueOf, fValueOf2, y19Var);
            e18Var.k0(objN);
        }
        z19 z19Var2 = (z19) objN;
        boolean z = true;
        boolean z2 = (((i3 & 112) ^ 48) > 32 && e18Var.h(fValueOf)) || (i3 & 48) == 32;
        if ((((i3 & 896) ^ 384) <= 256 || !e18Var.h(fValueOf2)) && (i3 & 384) != 256) {
            z = false;
        }
        boolean zH = z2 | z | e18Var.h(y19Var);
        Object objN2 = e18Var.N();
        if (zH || objN2 == lz1Var) {
            z19Var = z19Var2;
            r63 r63Var = new r63(fValueOf, z19Var, fValueOf2, y19Var, 4);
            e18Var.k0(r63Var);
            objN2 = r63Var;
        } else {
            z19Var = z19Var2;
        }
        fd9.s((zy7) objN2, e18Var);
        boolean zH2 = e18Var.h(b29Var);
        Object objN3 = e18Var.N();
        if (zH2 || objN3 == lz1Var) {
            objN3 = new vk3(b29Var, 8, z19Var);
            e18Var.k0(objN3);
        }
        fd9.d(z19Var, (bz7) objN3, e18Var);
        return z19Var;
    }

    public static zv5 k(l45 l45Var, c45 c45Var, pz7 pz7Var, int i) {
        if ((i & 1) != 0) {
            c45Var = im6.E;
        }
        int i2 = i & 2;
        o45 o45Var = o45.F;
        o45 o45Var2 = i2 != 0 ? o45.E : o45Var;
        c45 c45VarP = zni.P(l45Var, c45Var);
        zv5 nw9Var = o45Var2 == o45Var ? new nw9(c45VarP, pz7Var) : new zv5(c45VarP, true);
        nw9Var.w0(o45Var2, nw9Var, pz7Var);
        return nw9Var;
    }

    public static final float l(mnc mncVar, fu9 fu9Var) {
        return fu9Var == fu9.E ? mncVar.c(fu9Var) : mncVar.b(fu9Var);
    }

    public static final float m(mnc mncVar, fu9 fu9Var) {
        return fu9Var == fu9.E ? mncVar.b(fu9Var) : mncVar.c(fu9Var);
    }

    public static void q(int i) {
        if (2 > i || i >= 37) {
            StringBuilder sbU = vb7.u("radix ", i, " was not in valid range ");
            sbU.append(new b79(2, 36, 1));
            throw new IllegalArgumentException(sbU.toString());
        }
    }

    public static final List r(ArrayList arrayList) {
        arrayList.getClass();
        int size = arrayList.size();
        if (size == 0) {
            return lm6.E;
        }
        if (size == 1) {
            return x44.W(w44.L0(arrayList));
        }
        arrayList.trimToSize();
        return arrayList;
    }

    public static final boolean s(l9e l9eVar, float f, float f2) {
        float f3 = l9eVar.a;
        if (f > l9eVar.c || f3 > f) {
            return false;
        }
        return f2 <= l9eVar.d && l9eVar.b <= f2;
    }

    public static dfk t(Context context) {
        cbi cbiVar;
        synchronized (iuj.class) {
            try {
                if (iuj.a == null) {
                    Context applicationContext = context.getApplicationContext();
                    if (applicationContext != null) {
                        context = applicationContext;
                    }
                    iuj.a = new cbi(new kf5(context, 2));
                }
                cbiVar = iuj.a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return (dfk) ((lqj) cbiVar.E).zza();
    }

    public static final swe u(ba4 ba4Var) {
        SerializableContainer serializableContainerO;
        final zcd zcdVar = new zcd(15);
        vdc vdcVarC = ba4Var.c();
        vdcVarC.getClass();
        wp5 wp5Var = new wp5();
        db1 db1Var = new db1(wp5Var);
        pdc pdcVar = new pdc(db1Var, new rdc(null, db1Var));
        db1Var.a.add(pdcVar);
        dpf.t(vdcVarC.b().c, pdcVar);
        q28 q28Var = (q28) ba4Var.H.G;
        q28Var.getClass();
        Bundle bundleI = q28Var.i("STATE_KEEPER_STATE");
        if (bundleI == null || (serializableContainerO = vsj.o(bundleI)) == null) {
            serializableContainerO = null;
        }
        final b bVar = new b(serializableContainerO);
        q28Var.B("STATE_KEEPER_STATE", new s5f() { // from class: e20
            @Override // defpackage.s5f
            public final Bundle a() {
                Bundle bundle = new Bundle();
                if (((Boolean) zcdVar.a()).booleanValue()) {
                    vsj.r(bundle, bVar.c());
                }
                return bundle;
            }
        });
        srg srgVar = srg.a;
        String str = (String) bVar.a("DefaultComponentContext_state_marker", srgVar);
        bVar.b("DefaultComponentContext_state_marker", srgVar, new rk3(16));
        p4a p4aVar = ba4Var.E;
        p4aVar.getClass();
        nyj nyjVar = new nyj(p4aVar);
        int i = 0;
        boolean z = str == null;
        dyi dyiVarF = ba4Var.f();
        f20 f20Var = new f20(i);
        i95 i95Var = i95.b;
        i95Var.getClass();
        dpf dpfVar = new dpf(dyiVarF, f20Var, i95Var);
        pl9 pl9VarB = jce.a.b(b69.class);
        String strD = pl9VarB.d();
        if (strD == null) {
            sz6.p("Local and anonymous classes can not be ViewModels");
            return null;
        }
        b69 b69Var = (b69) dpfVar.L(pl9VarB, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strD));
        if (z) {
            b69Var.b.a();
            b69Var.b = new kd4();
        }
        return new swe(new lq5(nyjVar, bVar, b69Var.b, wp5Var));
    }

    public static boolean v(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static final boolean w(char c, char c2, boolean z) {
        if (c == c2) {
            return true;
        }
        if (!z) {
            return false;
        }
        char upperCase = Character.toUpperCase(c);
        char upperCase2 = Character.toUpperCase(c2);
        return upperCase == upperCase2 || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2);
    }

    public static final pl9 x(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        if (serialDescriptor instanceof vo4) {
            return ((vo4) serialDescriptor).b;
        }
        if (serialDescriptor instanceof inf) {
            return x(((inf) serialDescriptor).a);
        }
        return null;
    }

    public static er9 y() {
        er9 er9Var = zp3.J;
        if (er9Var != null) {
            return er9Var;
        }
        sz6.j("KoinApplication has not been started");
        return null;
    }

    public static final iqb z(ng8 ng8Var, og8 og8Var, a2 a2Var) {
        return new hg8(ng8Var, og8Var, a2Var);
    }

    public abstract void E(m4e m4eVar);

    public abstract void F(m4e m4eVar, String str, String str2);

    public abstract void G(m4e m4eVar, Exception exc, pqe pqeVar);

    public void H(m4e m4eVar, pqe pqeVar) {
    }

    public abstract void P(y3 y3Var, y3 y3Var2);

    public abstract void Q(y3 y3Var, Thread thread);

    public abstract boolean n(z3 z3Var, v3 v3Var, v3 v3Var2);

    public abstract boolean o(z3 z3Var, Object obj, Object obj2);

    public abstract boolean p(z3 z3Var, y3 y3Var, y3 y3Var2);
}
