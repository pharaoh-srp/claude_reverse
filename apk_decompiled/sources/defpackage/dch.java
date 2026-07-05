package defpackage;

import android.content.res.Resources;
import android.graphics.Paint;
import android.text.Layout;
import android.util.Log;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.b;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.R;
import com.anthropic.claude.core.telemetry.SilentException;
import com.pvporbit.freetype.FreeTypeConstants;
import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonEncodingException;

/* JADX INFO: loaded from: classes.dex */
public abstract class dch {
    public static final Object[] a = new Object[0];
    public static final o54 b = o54.N;
    public static final o54 c;
    public static final float d;
    public static final q0g e;
    public static final float f;
    public static final float g;
    public static final o54 h;
    public static final float i;
    public static final q0g j;
    public static final float k;
    public static final q0g l;
    public static final float m;
    public static final mr9 n;
    public static final l40 o;

    static {
        o54 o54Var = o54.L;
        c = o54Var;
        d = 52.0f;
        q0g q0gVar = q0g.L;
        e = q0gVar;
        f = 12.0f;
        g = 48.0f;
        h = o54Var;
        i = 52.0f;
        j = q0gVar;
        k = 12.0f;
        l = q0g.I;
        m = 4.0f;
        n = new mr9();
        o = new l40(1022);
    }

    public static void A(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            it.next().getClass();
            mr9.o();
        }
    }

    public static final int B(Layout layout, int i2, boolean z) {
        if (i2 <= 0) {
            return 0;
        }
        if (i2 >= layout.getText().length()) {
            return layout.getLineCount() - 1;
        }
        int lineForOffset = layout.getLineForOffset(i2);
        int lineStart = layout.getLineStart(lineForOffset);
        int lineEnd = layout.getLineEnd(lineForOffset);
        if (lineStart == i2 || lineEnd == i2) {
            if (lineStart == i2) {
                if (z) {
                    return lineForOffset - 1;
                }
            } else if (!z) {
                return lineForOffset + 1;
            }
        }
        return lineForOffset;
    }

    public static final Paint C(v30 v30Var) {
        if (v30Var == null) {
            a39.a("Extracting native reference is only supported from androidx.compose.ui.graphics.AndroidPaint instances but received " + jce.a.b(v30Var.getClass()).d());
        }
        return v30Var.a;
    }

    public static final ywe D(h5b h5bVar) {
        Object objZ = h5bVar.z();
        if (objZ instanceof ywe) {
            return (ywe) objZ;
        }
        return null;
    }

    public static final String E(int i2, ld4 ld4Var) {
        e18 e18Var = (e18) ld4Var;
        e18Var.j(w00.a);
        return ((Resources) e18Var.j(w00.c)).getString(i2);
    }

    public static final float F(ywe yweVar) {
        return yweVar != null ? yweVar.a : MTTypesetterKt.kLineSkipLimitMultiplier;
    }

    public static final boolean G(av9 av9Var) {
        int iOrdinal = av9Var.w().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                if (iOrdinal != 2) {
                    if (iOrdinal != 3) {
                        if (iOrdinal != 4) {
                            mr9.b();
                            return false;
                        }
                        av9 av9VarG = av9Var.G();
                        if (av9VarG != null) {
                            return G(av9VarG);
                        }
                        sz6.p("no parent for idle node");
                        return false;
                    }
                }
            }
            return true;
        }
        return false;
    }

    public static /* synthetic */ void H(h99 h99Var, int i2, g99 g99Var, zy7 zy7Var, Throwable th, boolean z, int i3) {
        if ((i3 & 8) != 0) {
            th = null;
        }
        Throwable th2 = th;
        if ((i3 & 16) != 0) {
            z = false;
        }
        ((rl) h99Var).L(i2, g99Var, zy7Var, th2, z, null);
    }

    public static /* synthetic */ void I(h99 h99Var, int i2, List list, zy7 zy7Var, Throwable th, int i3) {
        if ((i3 & 8) != 0) {
            th = null;
        }
        ((rl) h99Var).M(i2, list, zy7Var, th, false, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void K(java.lang.Runnable r8, java.lang.Throwable r9, defpackage.h99 r10) {
        /*
            r10.getClass()
            r2 = 5
            if (r9 != 0) goto L20
            boolean r0 = r8 instanceof java.util.concurrent.Future
            if (r0 == 0) goto L20
            r0 = r8
            java.util.concurrent.Future r0 = (java.util.concurrent.Future) r0
            boolean r0 = r0.isDone()
            if (r0 == 0) goto L20
            java.util.concurrent.Future r8 = (java.util.concurrent.Future) r8     // Catch: java.lang.InterruptedException -> L22 java.util.concurrent.ExecutionException -> L39 java.util.concurrent.CancellationException -> L42
            r8.get()     // Catch: java.util.concurrent.ExecutionException -> L19 java.util.concurrent.CancellationException -> L1d java.lang.InterruptedException -> L22
            goto L20
        L19:
            r0 = move-exception
            r8 = r0
            r1 = r10
            goto L3c
        L1d:
            r0 = move-exception
            r8 = r0
            r9 = r8
        L20:
            r1 = r10
            goto L40
        L22:
            java.lang.Thread r8 = java.lang.Thread.currentThread()     // Catch: java.lang.SecurityException -> L2a
            r8.interrupt()     // Catch: java.lang.SecurityException -> L2a
            goto L20
        L2a:
            r0 = move-exception
            r8 = r0
            r5 = r8
            uxe r4 = defpackage.uxe.j0
            r6 = 0
            r7 = 48
            g99 r3 = defpackage.g99.F
            r1 = r10
            H(r1, r2, r3, r4, r5, r6, r7)
            goto L40
        L39:
            r0 = move-exception
            r1 = r10
            r8 = r0
        L3c:
            java.lang.Throwable r9 = r8.getCause()
        L40:
            r5 = r9
            goto L47
        L42:
            r0 = move-exception
            r1 = r10
            r8 = r0
            r9 = r8
            goto L40
        L47:
            if (r5 == 0) goto L5c
            g99 r8 = defpackage.g99.E
            g99 r9 = defpackage.g99.G
            g99[] r8 = new defpackage.g99[]{r8, r9}
            java.util.List r3 = defpackage.x44.X(r8)
            tnh r4 = defpackage.tnh.G
            r6 = 48
            I(r1, r2, r3, r4, r5, r6)
        L5c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dch.K(java.lang.Runnable, java.lang.Throwable, h99):void");
    }

    public static final void L(m2a m2aVar, cjh cjhVar, occ occVar) {
        rcg rcgVarZ = fd9.Z();
        bz7 bz7VarE = rcgVarZ != null ? rcgVarZ.e() : null;
        rcg rcgVarK0 = fd9.k0(rcgVarZ);
        try {
            zjh zjhVarD = m2aVar.d();
            if (zjhVarD == null) {
                return;
            }
            njh njhVar = m2aVar.e;
            if (njhVar == null) {
                return;
            }
            cu9 cu9VarC = m2aVar.c();
            if (cu9VarC == null) {
                return;
            }
            cok.r(cjhVar, m2aVar.a, zjhVarD.a, cu9VarC, njhVar, m2aVar.b(), occVar);
        } finally {
            fd9.s0(rcgVarZ, rcgVarK0, bz7VarE);
        }
    }

    public static final iqb M(iqb iqbVar, bz7 bz7Var) {
        return iqbVar.B(new vo9(bz7Var, null));
    }

    public static final iqb N(iqb iqbVar, bz7 bz7Var) {
        return iqbVar.B(new vo9(null, bz7Var));
    }

    public static final kg3 O(pz7 pz7Var, pz7 pz7Var2, pz7 pz7Var3, bz7 bz7Var, ld4 ld4Var) {
        pz7Var.getClass();
        pz7Var2.getClass();
        pz7Var3.getClass();
        bz7Var.getClass();
        Resources resources = (Resources) ((e18) ld4Var).j(w00.c);
        e18 e18Var = (e18) ld4Var;
        Object objN = e18Var.N();
        if (objN == jd4.a) {
            String string = resources.getString(R.string.visit_link);
            string.getClass();
            String string2 = resources.getString(R.string.chat_view_sources);
            string2.getClass();
            String string3 = resources.getString(R.string.preview_link);
            string3.getClass();
            kg3 kg3Var = new kg3(new o13(bz7Var, pz7Var2, resources, pz7Var, 0), new p13(0, bz7Var, string2, string), new o13(bz7Var, pz7Var2, resources, pz7Var3, 1), new p13(1, bz7Var, string2, string3));
            e18Var.k0(kg3Var);
            objN = kg3Var;
        }
        return (kg3) objN;
    }

    public static final void P(yw ywVar, String str, int i2) {
        ywVar.getClass();
        sq6.a(i2);
        ql8 ql8Var = gx.K;
        pfa pfaVar = new pfa(i2, str);
        if (tff.a[sq6.F(i2)] == 1) {
        }
        int i3 = ql8Var.E;
        String str2 = pfaVar.b;
        int i4 = pfaVar.a;
        switch (i3) {
            case 12:
                int iF = sq6.F(i4);
                if (iF == 0) {
                    Log.e("AndroidLog", "message=" + str2);
                    break;
                } else if (iF == 1) {
                    Log.w("AndroidLog", "message=" + str2);
                    break;
                }
                break;
            default:
                System.out.println((Object) ("[Segment " + y6a.w(i4) + ' ' + str2));
                break;
        }
    }

    public static hu5 Q(int i2) {
        int i3 = 0;
        return new hu5(kxk.N(0, 0, null, 7), i3, new u9g(i3, (i2 & 2) != 0 ? ukc.F : ukc.E));
    }

    public static final void R(jjh jjhVar, m2a m2aVar, cjh cjhVar, xy8 xy8Var, occ occVar) {
        epk epkVar = m2aVar.d;
        u25 u25Var = m2aVar.v;
        u25 u25Var2 = m2aVar.w;
        dae daeVar = new dae();
        f2d f2dVar = new f2d(epkVar, u25Var, daeVar, 19);
        x5d x5dVar = jjhVar.a;
        x5dVar.d(cjhVar, xy8Var, f2dVar, u25Var2);
        njh njhVar = new njh(jjhVar, x5dVar);
        jjhVar.b.set(njhVar);
        daeVar.E = njhVar;
        m2aVar.e = njhVar;
        L(m2aVar, cjhVar, occVar);
    }

    public static final void S(String str, JsonElement jsonElement) {
        jsonElement.getClass();
        throw new JsonEncodingException("Class with serial name " + str + " cannot be serialized polymorphically because it is represented as " + jce.a.b(jsonElement.getClass()).f() + '.', "Make sure that its JsonTransformingSerializer returns JsonObject, so class discriminator can be added to it.");
    }

    public static final Object[] T(Collection collection) {
        collection.getClass();
        int size = collection.size();
        Object[] objArr = a;
        if (size == 0) {
            return objArr;
        }
        Iterator it = collection.iterator();
        if (!it.hasNext()) {
            return objArr;
        }
        Object[] objArrCopyOf = new Object[size];
        int i2 = 0;
        while (true) {
            int i3 = i2 + 1;
            objArrCopyOf[i2] = it.next();
            if (i3 >= objArrCopyOf.length) {
                if (!it.hasNext()) {
                    return objArrCopyOf;
                }
                int i4 = ((i3 * 3) + 1) >>> 1;
                if (i4 <= i3) {
                    i4 = 2147483645;
                    if (i3 >= 2147483645) {
                        throw new OutOfMemoryError();
                    }
                }
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, i4);
            } else if (!it.hasNext()) {
                return Arrays.copyOf(objArrCopyOf, i3);
            }
            i2 = i3;
        }
    }

    public static final Object[] U(Collection collection, Object[] objArr) {
        Object[] objArrCopyOf;
        collection.getClass();
        objArr.getClass();
        int size = collection.size();
        int i2 = 0;
        if (size != 0) {
            Iterator it = collection.iterator();
            if (it.hasNext()) {
                if (size <= objArr.length) {
                    objArrCopyOf = objArr;
                } else {
                    Object objNewInstance = Array.newInstance(objArr.getClass().getComponentType(), size);
                    objNewInstance.getClass();
                    objArrCopyOf = (Object[]) objNewInstance;
                }
                while (true) {
                    int i3 = i2 + 1;
                    objArrCopyOf[i2] = it.next();
                    if (i3 >= objArrCopyOf.length) {
                        if (!it.hasNext()) {
                            return objArrCopyOf;
                        }
                        int i4 = ((i3 * 3) + 1) >>> 1;
                        if (i4 <= i3) {
                            i4 = 2147483645;
                            if (i3 >= 2147483645) {
                                throw new OutOfMemoryError();
                            }
                        }
                        objArrCopyOf = Arrays.copyOf(objArrCopyOf, i4);
                    } else if (!it.hasNext()) {
                        if (objArrCopyOf != objArr) {
                            return Arrays.copyOf(objArrCopyOf, i3);
                        }
                        objArr[i3] = null;
                        return objArr;
                    }
                    i2 = i3;
                }
            } else if (objArr.length > 0) {
                objArr[0] = null;
            }
        } else if (objArr.length > 0) {
            objArr[0] = null;
            return objArr;
        }
        return objArr;
    }

    public static final String V(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (byte b2 : bArr) {
            sb.append("0123456789abcdef".charAt((b2 & 255) >>> 4));
            sb.append("0123456789abcdef".charAt(b2 & 15));
        }
        return sb.toString();
    }

    public static final void a(te3 te3Var, ue3 ue3Var, qbd qbdVar, Object obj, ta4 ta4Var, ta4 ta4Var2, ta4 ta4Var3, ld4 ld4Var, int i2) {
        int i3;
        sz7 sz7Var;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-1735119644);
        int i4 = (i2 & 6) == 0 ? ((i2 & 8) == 0 ? e18Var.f(te3Var) : e18Var.h(te3Var) ? 4 : 2) | i2 : i2;
        if ((i2 & 48) == 0) {
            i4 |= (i2 & 64) == 0 ? e18Var.f(ue3Var) : e18Var.h(ue3Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= (i2 & 512) == 0 ? e18Var.f(qbdVar) : e18Var.h(qbdVar) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        if ((i2 & 3072) == 0) {
            i4 |= (i2 & FreeTypeConstants.FT_LOAD_MONOCHROME) == 0 ? e18Var.f(obj) : e18Var.h(obj) ? 2048 : FreeTypeConstants.FT_LOAD_NO_RECURSE;
        }
        if ((i2 & 24576) == 0) {
            i4 |= e18Var.h(ta4Var) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN;
        }
        if ((196608 & i2) == 0) {
            i4 |= e18Var.h(ta4Var2) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i4 |= e18Var.h(ta4Var3) ? FreeTypeConstants.FT_LOAD_COLOR : 524288;
        }
        boolean z = false;
        if (e18Var.Q(i4 & 1, (599187 & i4) != 599186)) {
            swe sweVar = (swe) e18Var.j(twe.a);
            boolean zF = ((i4 & 14) == 4 || ((i4 & 8) != 0 && e18Var.f(te3Var))) | ((i4 & 7168) == 2048 || ((i4 & FreeTypeConstants.FT_LOAD_MONOCHROME) != 0 && e18Var.f(obj))) | e18Var.f(sweVar);
            Object objN = e18Var.N();
            lz1 lz1Var = jd4.a;
            if (zF || objN == lz1Var) {
                d8a d8aVarE = x44.E();
                for (Iterator it = te3Var.a.iterator(); it.hasNext(); it = it) {
                    ie3 ie3Var = (ie3) it.next();
                    d8aVarE.add(new ie3(ie3Var.a, new f74(ie3Var)));
                }
                for (Iterator it2 = te3Var.b.iterator(); it2.hasNext(); it2 = it2) {
                    ie3 ie3Var2 = (ie3) it2.next();
                    d8aVarE.add(new ie3(ie3Var2.a, new d74(ie3Var2)));
                }
                for (Iterator it3 = te3Var.c.iterator(); it3.hasNext(); it3 = it3) {
                    ie3 ie3Var3 = (ie3) it3.next();
                    d8aVarE.add(new ie3(ie3Var3.a, new e74(ie3Var3)));
                }
                d8a d8aVarV = x44.v(d8aVarE);
                ie3 ie3Var4 = (ie3) w44.V0(d8aVarV);
                if (ie3Var4 == null) {
                    i3 = 1;
                    SilentException.a(new SilentException("All panes are empty. Using fallback"), null, true, 1);
                    ie3Var4 = new ie3(obj, new f74(new ie3(obj, sweVar)));
                } else {
                    i3 = 1;
                }
                objN = new bf3(ie3Var4, w44.J0(i3, d8aVarV));
                e18Var.k0(objN);
            } else {
                i3 = 1;
            }
            bf3 bf3Var = (bf3) objN;
            FillElement fillElement = b.c;
            int iOrdinal = te3Var.d.ordinal();
            if (iOrdinal == 0) {
                sz7Var = ue3Var.a;
            } else if (iOrdinal == i3) {
                sz7Var = (sz7) ue3Var.b.E;
            } else {
                if (iOrdinal != 2) {
                    mr9.b();
                    return;
                }
                sz7Var = (sz7) ue3Var.c.E;
            }
            if ((i4 & 896) == 256 || ((i4 & 512) != 0 && e18Var.h(qbdVar))) {
                z = true;
            }
            Object objN2 = e18Var.N();
            if (z || objN2 == lz1Var) {
                objN2 = new tz9(5, qbdVar);
                e18Var.k0(objN2);
            }
            yb5.b(bf3Var, fillElement, iv1.O(1, (bz7) objN2, sz7Var), fd9.q0(-1489837052, new m8a(ta4Var, ta4Var2, ta4Var3), e18Var), e18Var, 3120);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new n8a(te3Var, ue3Var, qbdVar, obj, ta4Var, ta4Var2, ta4Var3, i2);
        }
    }

    public static xa1 b(zy7 zy7Var, boolean z, int i2) {
        return new xa1((i2 & 1) != 0 ? true : z, 0, null, null, null, zy7Var);
    }

    public static final void c(mif mifVar, ta4 ta4Var, ld4 ld4Var, int i2) {
        ta4 ta4Var2;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-614342087);
        int i3 = (e18Var.h(mifVar) ? 4 : 2) | i2;
        int i4 = 0;
        if (!e18Var.Q(i3 & 1, (i3 & 19) != 18)) {
            ta4Var2 = ta4Var;
            e18Var.T();
        } else if (knk.j) {
            e18Var.a0(-1009319487);
            xuj.d(mifVar.f(), ta4Var, e18Var, 48);
            e18Var.p(false);
            ta4Var2 = ta4Var;
        } else {
            e18Var.a0(-1009204043);
            Object objN = e18Var.N();
            lz1 lz1Var = jd4.a;
            if (objN == lz1Var) {
                objN = new hp4();
                e18Var.k0(objN);
            }
            hp4 hp4Var = (hp4) objN;
            Object objN2 = e18Var.N();
            if (objN2 == lz1Var) {
                objN2 = new d7(27, hp4Var);
                e18Var.k0(objN2);
            }
            ta4Var2 = ta4Var;
            d4c.r(hp4Var, (zy7) objN2, new nif(mifVar, i4, hp4Var), null, false, null, ta4Var2, e18Var, 1572918, 56);
            e18Var.p(false);
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new s74(mifVar, ta4Var2, i2, i4);
        }
    }

    public static final void d(zhh zhhVar, ta4 ta4Var, ld4 ld4Var, int i2) {
        int i3;
        ta4 ta4Var2;
        iqb iqbVarG;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(1533506138);
        if ((i2 & 6) == 0) {
            i3 = (e18Var.h(zhhVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= e18Var.h(ta4Var) ? 32 : 16;
        }
        int i4 = 1;
        int i5 = 0;
        if (!e18Var.Q(i3 & 1, (i3 & 19) != 18)) {
            ta4Var2 = ta4Var;
            e18Var.T();
        } else if (knk.j) {
            e18Var.a0(-885604480);
            if (zhhVar.q()) {
                tp4 tp4Var = null;
                iqbVarG = xwj.g(rwj.o(new shh(zhhVar, tp4Var, i5)), zhhVar.z, new hm(zhhVar, tp4Var, 6), new thh(zhhVar, tp4Var, i5), new b35(zhhVar, i4));
            } else {
                iqbVarG = fqb.E;
            }
            xuj.d(iqbVarG, ta4Var, e18Var, i3 & 112);
            e18Var.p(false);
            ta4Var2 = ta4Var;
        } else {
            e18Var.a0(-885475365);
            Object objN = e18Var.N();
            lz1 lz1Var = jd4.a;
            if (objN == lz1Var) {
                objN = new hp4();
                e18Var.k0(objN);
            }
            hp4 hp4Var = (hp4) objN;
            Object objN2 = e18Var.N();
            if (objN2 == lz1Var) {
                objN2 = fd9.O(im6.E, e18Var);
                e18Var.k0(objN2);
            }
            l45 l45Var = (l45) objN2;
            Object objN3 = e18Var.N();
            if (objN3 == lz1Var) {
                objN3 = mpk.P(new hdb(i5));
                e18Var.k0(objN3);
            }
            nwb nwbVar = (nwb) objN3;
            Object objN4 = e18Var.N();
            if (objN4 == lz1Var) {
                objN4 = new p74(hp4Var, i5);
                e18Var.k0(objN4);
            }
            zy7 zy7Var = (zy7) objN4;
            nf1 nf1Var = new nf1(nwbVar, zhhVar, hp4Var, 24);
            boolean zQ = zhhVar.q();
            boolean zH = e18Var.h(l45Var) | e18Var.h(zhhVar);
            Object objN5 = e18Var.N();
            if (zH || objN5 == lz1Var) {
                objN5 = new ka1(l45Var, nwbVar, zhhVar, 12);
                e18Var.k0(objN5);
            }
            ta4Var2 = ta4Var;
            d4c.r(hp4Var, zy7Var, nf1Var, null, zQ, (zy7) objN5, ta4Var2, e18Var, ((i3 << 15) & 3670016) | 54, 8);
            e18Var.p(false);
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new q74(zhhVar, ta4Var2, i2, i5);
        }
    }

    public static final void e(sih sihVar, boolean z, ta4 ta4Var, ld4 ld4Var, int i2) {
        int i3;
        sih sihVar2;
        e18 e18Var;
        iqb iqbVarO;
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(-1442752422);
        if ((i2 & 6) == 0) {
            i3 = (e18Var2.h(sihVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= e18Var2.g(z) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= e18Var2.h(ta4Var) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        int i4 = i3;
        int i5 = 1;
        int i6 = 0;
        if (e18Var2.Q(i4 & 1, (i4 & 147) != 146)) {
            boolean z2 = knk.j;
            lz1 lz1Var = jd4.a;
            if (z2) {
                e18Var2.a0(-1299459355);
                int i7 = 3;
                if (z) {
                    e18Var2.a0(-1299415211);
                    boolean zH = e18Var2.h(sihVar);
                    Object objN = e18Var2.N();
                    if (zH || objN == lz1Var) {
                        objN = new vf1(sihVar, null, i7);
                        e18Var2.k0(objN);
                    }
                    iqbVarO = rwj.o((pz7) objN);
                    e18Var2.p(false);
                } else {
                    e18Var2.a0(-1298836224);
                    e18Var2.p(false);
                    iqbVarO = fqb.E;
                }
                xuj.d(iqbVarO, ta4Var, e18Var2, (i4 >> 3) & 112);
                e18Var2.p(false);
                sihVar2 = sihVar;
                e18Var = e18Var2;
            } else {
                e18Var2.a0(-1298667367);
                Object objN2 = e18Var2.N();
                if (objN2 == lz1Var) {
                    objN2 = new hp4();
                    e18Var2.k0(objN2);
                }
                hp4 hp4Var = (hp4) objN2;
                Object objN3 = e18Var2.N();
                if (objN3 == lz1Var) {
                    objN3 = fd9.O(im6.E, e18Var2);
                    e18Var2.k0(objN3);
                }
                l45 l45Var = (l45) objN3;
                Object objN4 = e18Var2.N();
                if (objN4 == lz1Var) {
                    objN4 = mpk.P(new hdb(i6));
                    e18Var2.k0(objN4);
                }
                nwb nwbVar = (nwb) objN4;
                boolean zH2 = e18Var2.h(l45Var);
                Object objN5 = e18Var2.N();
                if (zH2 || objN5 == lz1Var) {
                    objN5 = new a21(6, l45Var);
                    e18Var2.k0(objN5);
                }
                x70 x70Var = new x70(nwbVar, hp4Var, (pz7) objN5, sihVar, 9);
                sihVar2 = sihVar;
                Object objN6 = e18Var2.N();
                if (objN6 == lz1Var) {
                    objN6 = new p74(hp4Var, i5);
                    e18Var2.k0(objN6);
                }
                zy7 zy7Var = (zy7) objN6;
                boolean zH3 = e18Var2.h(l45Var) | e18Var2.h(sihVar2);
                Object objN7 = e18Var2.N();
                if (zH3 || objN7 == lz1Var) {
                    objN7 = new ka1(l45Var, nwbVar, sihVar2, 13);
                    e18Var2.k0(objN7);
                }
                e18Var = e18Var2;
                d4c.r(hp4Var, zy7Var, x70Var, null, z, (zy7) objN7, ta4Var, e18Var, ((i4 << 9) & 57344) | 54 | ((i4 << 12) & 3670016), 8);
                e18Var.p(false);
            }
        } else {
            sihVar2 = sihVar;
            e18Var = e18Var2;
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new r74(sihVar2, z, ta4Var, i2, 0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:241:0x049f  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x04ae  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x04c0  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x04d1  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0554  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0557  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0563  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0565  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0575  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0578  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x0586  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0594  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x05a0 A[PHI: r14 r20 r25
      0x05a0: PHI (r14v22 xy8) = (r14v12 xy8), (r14v23 xy8) binds: [B:271:0x059e, B:268:0x058f] A[DONT_GENERATE, DONT_INLINE]
      0x05a0: PHI (r20v4 boolean) = (r20v2 boolean), (r20v6 boolean) binds: [B:271:0x059e, B:268:0x058f] A[DONT_GENERATE, DONT_INLINE]
      0x05a0: PHI (r25v19 int) = (r25v3 int), (r25v20 int) binds: [B:271:0x059e, B:268:0x058f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:273:0x05a2  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x05bf A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:279:0x05de  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x0628  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x0659  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x0661  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x066a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:301:0x067d  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x06ce  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x06d8  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x0705  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x0707  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x071a  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x071c  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x072f  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x0794  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x0797  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x07ab  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x07b9  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x07d4  */
    /* JADX WARN: Removed duplicated region for block: B:342:0x07d6  */
    /* JADX WARN: Removed duplicated region for block: B:353:0x07f2 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:356:0x07f7  */
    /* JADX WARN: Removed duplicated region for block: B:359:0x0813  */
    /* JADX WARN: Removed duplicated region for block: B:361:0x0816  */
    /* JADX WARN: Removed duplicated region for block: B:366:0x0838  */
    /* JADX WARN: Removed duplicated region for block: B:371:0x0858  */
    /* JADX WARN: Removed duplicated region for block: B:374:0x088b  */
    /* JADX WARN: Removed duplicated region for block: B:375:0x0891  */
    /* JADX WARN: Removed duplicated region for block: B:379:0x08a4  */
    /* JADX WARN: Removed duplicated region for block: B:382:0x090d  */
    /* JADX WARN: Removed duplicated region for block: B:391:0x0934  */
    /* JADX WARN: Removed duplicated region for block: B:393:0x0937  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void f(final defpackage.cjh r64, defpackage.bz7 r65, defpackage.iqb r66, final defpackage.tkh r67, final defpackage.pzi r68, final defpackage.bz7 r69, defpackage.zub r70, defpackage.eeg r71, boolean r72, final int r73, final int r74, defpackage.xy8 r75, defpackage.kp9 r76, final boolean r77, final boolean r78, final defpackage.ta4 r79, defpackage.ld4 r80, int r81, int r82) {
        /*
            Method dump skipped, instruction units count: 2487
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dch.f(cjh, bz7, iqb, tkh, pzi, bz7, zub, eeg, boolean, int, int, xy8, kp9, boolean, boolean, ta4, ld4, int, int):void");
    }

    public static final void g(iqb iqbVar, zhh zhhVar, ta4 ta4Var, ld4 ld4Var, int i2) {
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(2036174316);
        int i3 = (e18Var.f(iqbVar) ? 4 : 2) | i2 | (e18Var.h(zhhVar) ? 32 : 16);
        if (e18Var.Q(i3 & 1, (i3 & 147) != 146)) {
            o5b o5bVarD = dw1.d(lja.G, true);
            int iHashCode = Long.hashCode(e18Var.T);
            hyc hycVarL = e18Var.l();
            iqb iqbVarE = kxk.E(e18Var, iqbVar);
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
            yfd.c(zhhVar, ta4Var, e18Var, (i3 >> 3) & 126);
            e18Var.p(true);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new m63(iqbVar, i2, zhhVar, ta4Var, 8);
        }
    }

    public static fz5 h() {
        return new fz5(1.0f, 1.0f);
    }

    public static final void i(te3 te3Var, zy7 zy7Var, ta4 ta4Var, ta4 ta4Var2, ta4 ta4Var3, ue3 ue3Var, Object obj, kqc kqcVar, qbd qbdVar, ld4 ld4Var, int i2) {
        e18 e18Var;
        te3Var.getClass();
        zy7Var.getClass();
        ue3Var.getClass();
        obj.getClass();
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(1612086086);
        int i3 = i2 | (e18Var2.f(te3Var) ? 4 : 2) | (e18Var2.h(zy7Var) ? 32 : 16) | (e18Var2.f(ue3Var) ? 131072 : 65536);
        if ((i2 & 100663296) == 0) {
            i3 |= e18Var2.f(kqcVar) ? 67108864 : 33554432;
        }
        int i4 = i3 | (e18Var2.h(qbdVar) ? 536870912 : 268435456);
        if (e18Var2.Q(i4 & 1, (306783379 & i4) != 306783378)) {
            e18Var2.V();
            if ((i2 & 1) != 0 && !e18Var2.A()) {
                e18Var2.T();
            }
            e18Var2.q();
            nwb nwbVarZ = mpk.Z(te3Var, e18Var2);
            Object objN = e18Var2.N();
            lz1 lz1Var = jd4.a;
            if (objN == lz1Var) {
                objN = new s8a(nwbVarZ);
                e18Var2.k0(objN);
            }
            s8a s8aVar = (s8a) objN;
            toh tohVarB = s8aVar.b();
            Object objN2 = e18Var2.N();
            if (objN2 == lz1Var) {
                objN2 = new fj(s8aVar, null, 18);
                e18Var2.k0(objN2);
            }
            fd9.i(e18Var2, (pz7) objN2, tohVarB);
            pbd.a(s8aVar, zy7Var, e18Var2, i4 & 112);
            e18Var = e18Var2;
            nai.f(kqcVar, s8aVar.c, fd9.q0(169561932, new j8a(te3Var, ue3Var, qbdVar, obj, i4, ta4Var, ta4Var2, ta4Var3, 0), e18Var2), fd9.q0(1846585259, new o8a(te3Var, ue3Var, qbdVar, ta4Var2, 0), e18Var2), fqb.E, fd9.q0(905664617, new o8a(te3Var, ue3Var, qbdVar, ta4Var3, 1), e18Var2), yb5.e, e18Var, ((i4 >> 24) & 14) | 1797504);
        } else {
            e18Var = e18Var2;
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new q8a(te3Var, zy7Var, ta4Var, ta4Var2, ta4Var3, ue3Var, obj, kqcVar, qbdVar, i2);
        }
    }

    public static final v30 j() {
        return new v30(new Paint(7));
    }

    public static final void k(zhh zhhVar, boolean z, ld4 ld4Var, int i2) {
        zjh zjhVarD;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(626339208);
        int i3 = 2;
        int i4 = (e18Var.h(zhhVar) ? 4 : 2) | i2 | (e18Var.g(z) ? 32 : 16);
        if (!e18Var.Q(i4 & 1, (i4 & 19) != 18)) {
            e18Var.T();
        } else if (z) {
            e18Var.a0(1530097388);
            m2a m2aVar = zhhVar.d;
            yjh yjhVar = null;
            if (m2aVar != null && (zjhVarD = m2aVar.d()) != null) {
                yjh yjhVar2 = zjhVarD.a;
                m2a m2aVar2 = zhhVar.d;
                if (!(m2aVar2 != null ? m2aVar2.p : true)) {
                    yjhVar = yjhVar2;
                }
            }
            if (yjhVar == null) {
                e18Var.a0(1530097387);
                e18Var.p(false);
            } else {
                e18Var.a0(1530097388);
                if (kkh.d(zhhVar.t().b)) {
                    e18Var.a0(2110860558);
                    e18Var.p(false);
                } else {
                    e18Var.a0(2109807302);
                    int iD = zhhVar.b.D((int) (zhhVar.t().b >> 32));
                    int iD2 = zhhVar.b.D((int) (zhhVar.t().b & 4294967295L));
                    lne lneVarA = yjhVar.a(iD);
                    lne lneVarA2 = yjhVar.a(Math.max(iD2 - 1, 0));
                    m2a m2aVar3 = zhhVar.d;
                    if (m2aVar3 == null || !((Boolean) m2aVar3.m.getValue()).booleanValue()) {
                        e18Var.a0(2110490542);
                        e18Var.p(false);
                    } else {
                        e18Var.a0(2110225306);
                        uok.f(true, lneVarA, zhhVar, e18Var, ((i4 << 6) & 896) | 6);
                        e18Var.p(false);
                    }
                    m2a m2aVar4 = zhhVar.d;
                    if (m2aVar4 == null || !((Boolean) m2aVar4.n.getValue()).booleanValue()) {
                        e18Var.a0(2110838734);
                        e18Var.p(false);
                    } else {
                        e18Var.a0(2110574459);
                        uok.f(false, lneVarA2, zhhVar, e18Var, ((i4 << 6) & 896) | 6);
                        e18Var.p(false);
                    }
                    e18Var.p(false);
                }
                m2a m2aVar5 = zhhVar.d;
                if (m2aVar5 != null) {
                    lsc lscVar = m2aVar5.l;
                    if (!x44.r(zhhVar.v.a.F, zhhVar.t().a.F)) {
                        lscVar.setValue(Boolean.FALSE);
                    }
                    if (m2aVar5.b()) {
                        if (((Boolean) lscVar.getValue()).booleanValue()) {
                            zhhVar.y();
                        } else {
                            zhhVar.u();
                        }
                    }
                }
                e18Var.p(false);
            }
            e18Var.p(false);
        } else {
            e18Var.a0(1989076778);
            e18Var.p(false);
            zhhVar.u();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new db0(i2, i3, zhhVar, z);
        }
    }

    public static final void l(List list, ye3 ye3Var, ue3 ue3Var, qbd qbdVar, Object obj, pz7 pz7Var, ta4 ta4Var, ld4 ld4Var, int i2, int i3) {
        int i4;
        Object obj2;
        sz7 sz7Var;
        Object obj3 = obj;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(1636032131);
        if ((i2 & 6) == 0) {
            i4 = ((i2 & 8) == 0 ? e18Var.f(list) : e18Var.h(list) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= e18Var.d(ye3Var.ordinal()) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= (i2 & 512) == 0 ? e18Var.f(ue3Var) : e18Var.h(ue3Var) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        if ((i2 & 3072) == 0) {
            i4 |= (i2 & FreeTypeConstants.FT_LOAD_MONOCHROME) == 0 ? e18Var.f(qbdVar) : e18Var.h(qbdVar) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE;
        }
        int i5 = i3 & 16;
        if (i5 != 0) {
            i4 |= 24576;
        } else if ((i2 & 24576) == 0) {
            i4 |= (i2 & FreeTypeConstants.FT_LOAD_NO_AUTOHINT) == 0 ? e18Var.f(obj3) : e18Var.h(obj3) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN;
        }
        int i6 = i4 | 196608;
        if ((1572864 & i2) == 0) {
            i6 |= e18Var.h(ta4Var) ? FreeTypeConstants.FT_LOAD_COLOR : 524288;
        }
        if (e18Var.Q(i6 & 1, (599187 & i6) != 599186)) {
            if (i5 != 0) {
                obj3 = null;
            }
            ta4 ta4Var2 = yb5.f;
            swe sweVar = (swe) e18Var.j(twe.a);
            if (list.isEmpty()) {
                e18Var.a0(-255227966);
                ta4Var2.invoke(e18Var, Integer.valueOf((i6 >> 15) & 14));
                e18Var.p(false);
            } else {
                e18Var.a0(-255159642);
                boolean zF = ((i6 & 57344) == 16384 || ((i6 & FreeTypeConstants.FT_LOAD_NO_AUTOHINT) != 0 && e18Var.f(obj3))) | ((i6 & 14) == 4 || ((i6 & 8) != 0 && e18Var.f(list))) | e18Var.f(sweVar);
                Object objN = e18Var.N();
                lz1 lz1Var = jd4.a;
                if (zF || objN == lz1Var) {
                    ie3 ie3Var = (ie3) w44.V0(list);
                    if (ie3Var == null) {
                        SilentException.a(new SilentException("StackPane is empty. Using fallback"), null, true, 1);
                        if (obj3 == null) {
                            sz6.j("Required value was null.");
                            return;
                        } else {
                            sweVar.getClass();
                            ie3Var = new ie3(obj3, sweVar);
                        }
                    }
                    objN = new bf3(ie3Var, w44.J0(1, list));
                    e18Var.k0(objN);
                }
                bf3 bf3Var = (bf3) objN;
                FillElement fillElement = b.c;
                int iOrdinal = ye3Var.ordinal();
                if (iOrdinal == 0) {
                    sz7Var = ue3Var.a;
                } else if (iOrdinal == 1) {
                    sz7Var = (sz7) ue3Var.b.E;
                } else {
                    if (iOrdinal != 2) {
                        mr9.b();
                        return;
                    }
                    sz7Var = (sz7) ue3Var.c.E;
                }
                sz7Var.getClass();
                nai.n(4, sz7Var);
                boolean z = (i6 & 7168) == 2048 || ((i6 & FreeTypeConstants.FT_LOAD_MONOCHROME) != 0 && e18Var.h(qbdVar));
                Object objN2 = e18Var.N();
                if (z || objN2 == lz1Var) {
                    objN2 = new tl8(9, qbdVar);
                    e18Var.k0(objN2);
                }
                yb5.b(bf3Var, fillElement, iv1.O(1, (bz7) objN2, sz7Var), fd9.q0(-534375041, new xw9(ta4Var, 4), e18Var), e18Var, 3120);
                e18Var.p(false);
            }
            obj2 = ta4Var2;
        } else {
            e18Var.T();
            obj2 = pz7Var;
        }
        Object obj4 = obj3;
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new ye1(list, ye3Var, ue3Var, qbdVar, obj4, obj2, ta4Var, i2, i3, 4);
        }
    }

    public static final void m(zhh zhhVar, ld4 ld4Var, int i2) {
        zb0 zb0VarS;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-1436003720);
        int i3 = (e18Var.h(zhhVar) ? 4 : 2) | i2;
        int i4 = 1;
        int i5 = 0;
        if (e18Var.Q(i3 & 1, (i3 & 3) != 2)) {
            m2a m2aVar = zhhVar.d;
            if (m2aVar == null || !((Boolean) m2aVar.o.getValue()).booleanValue() || (zb0VarS = zhhVar.s()) == null || zb0VarS.F.length() <= 0) {
                e18Var.a0(-2111042550);
                e18Var.p(false);
            } else {
                e18Var.a0(-2112351432);
                boolean zF = e18Var.f(zhhVar);
                Object objN = e18Var.N();
                lz1 lz1Var = jd4.a;
                if (zF || objN == lz1Var) {
                    objN = new uhh(zhhVar);
                    e18Var.k0(objN);
                }
                zeh zehVar = (zeh) objN;
                cz5 cz5Var = (cz5) e18Var.j(ve4.h);
                occ occVar = zhhVar.b;
                long j2 = zhhVar.t().b;
                int i6 = kkh.c;
                int iD = occVar.D((int) (j2 >> 32));
                m2a m2aVar2 = zhhVar.d;
                zjh zjhVarD = m2aVar2 != null ? m2aVar2.d() : null;
                zjhVarD.getClass();
                yjh yjhVar = zjhVarD.a;
                l9e l9eVarC = yjhVar.c(wd6.e0(iD, 0, yjhVar.a.a.F.length()));
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits((cz5Var.q0(2.0f) / 2.0f) + l9eVarC.a)) << 32) | (((long) Float.floatToRawIntBits(l9eVarC.d)) & 4294967295L);
                boolean zE = e18Var.e(jFloatToRawIntBits);
                Object objN2 = e18Var.N();
                if (zE || objN2 == lz1Var) {
                    objN2 = new z25(jFloatToRawIntBits);
                    e18Var.k0(objN2);
                }
                qcc qccVar = (qcc) objN2;
                boolean zH = e18Var.h(zehVar) | e18Var.h(zhhVar);
                Object objN3 = e18Var.N();
                if (zH || objN3 == lz1Var) {
                    objN3 = new c35(zehVar, i5, zhhVar);
                    e18Var.k0(objN3);
                }
                iqb iqbVarA = a0h.a(fqb.E, zehVar, (PointerInputEventHandler) objN3);
                boolean zE2 = e18Var.e(jFloatToRawIntBits);
                Object objN4 = e18Var.N();
                if (zE2 || objN4 == lz1Var) {
                    objN4 = new j10(jFloatToRawIntBits, i4);
                    e18Var.k0(objN4);
                }
                l10.a(qccVar, tjf.b(iqbVarA, false, (bz7) objN4), 0L, e18Var, 0, 4);
                e18Var.p(false);
            }
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new mk4(zhhVar, i2, 6);
        }
    }

    public static final void n(bg9 bg9Var, znf znfVar, znf znfVar2, String str) {
        SerialDescriptor descriptor = znfVar2.getDescriptor();
        descriptor.getClass();
        bg9Var.getClass();
        nh9.d(bg9Var, descriptor);
        if (yfd.q(descriptor).contains(str)) {
            String strA = znfVar.getDescriptor().a();
            String strA2 = znfVar2.getDescriptor().a();
            throw new JsonEncodingException(ij0.m(kgh.r("Class '", strA2, "' cannot be serialized ", (bg9Var.a.j == ch3.F && x44.r(strA, strA2)) ? "in ALL_JSON_OBJECTS class discriminator mode" : grc.n('\'', "as base class '", strA), " because it has property name that conflicts with JSON class discriminator '"), str, "'."), "You can either change class discriminator in JsonConfiguration, or rename property with @SerialName annotation.");
        }
    }

    public static final void o(u00 u00Var) {
        u00Var.getClass();
        if (u00Var instanceof mnf) {
            sz6.j("Enums cannot be serialized polymorphically with 'type' parameter. You can use 'JsonBuilder.useArrayPolymorphism' instead");
        } else if (u00Var instanceof kfd) {
            sz6.j("Primitives cannot be serialized polymorphically with 'type' parameter. You can use 'JsonBuilder.useArrayPolymorphism' instead");
        } else if (u00Var instanceof u8d) {
            sz6.j("Actual serializer for polymorphic cannot be polymorphic itself");
        }
    }

    public static final String p(bg9 bg9Var, SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        bg9Var.getClass();
        for (Annotation annotation : serialDescriptor.getAnnotations()) {
            if (annotation instanceof qg9) {
                return ((qg9) annotation).discriminator();
            }
        }
        return bg9Var.a.h;
    }

    public static Map r(fb8 fb8Var) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator itT0 = fb8Var.t0();
        while (itT0.hasNext()) {
            Object objC = fb8Var.c(itT0.next());
            Object baeVar = linkedHashMap.get(objC);
            if (baeVar == null && !linkedHashMap.containsKey(objC)) {
                baeVar = new bae();
            }
            bae baeVar2 = (bae) baeVar;
            baeVar2.E++;
            linkedHashMap.put(objC, baeVar2);
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            entry.getClass();
            if ((entry instanceof mm9) && !(entry instanceof pm9)) {
                nai.b0("kotlin.collections.MutableMap.MutableEntry", entry);
                throw null;
            }
            entry.setValue(Integer.valueOf(((bae) entry.getValue()).E));
        }
        return nai.l(linkedHashMap);
    }

    public static final void t(m2a m2aVar) {
        njh njhVar = m2aVar.e;
        if (njhVar != null) {
            m2aVar.v.invoke(cjh.a((cjh) m2aVar.d.E, null, 0L, 3));
            jjh jjhVar = njhVar.a;
            if (gid.u(jjhVar.b, njhVar)) {
                jjhVar.a.c();
            }
        }
        m2aVar.e = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static db u(qh9 qh9Var) {
        db dbVar;
        int i2;
        String strM;
        qh9Var.getClass();
        try {
            long jK = qh9Var.s("date").k();
            ca caVarX = csg.x(qh9Var.s("application").g());
            bh9 bh9VarS = qh9Var.s("service");
            String strM2 = bh9VarS != null ? bh9VarS.m() : null;
            bh9 bh9VarS2 = qh9Var.s("version");
            String strM3 = bh9VarS2 != null ? bh9VarS2.m() : null;
            bh9 bh9VarS3 = qh9Var.s("build_version");
            String strM4 = bh9VarS3 != null ? bh9VarS3.m() : null;
            bh9 bh9VarS4 = qh9Var.s("build_id");
            String strM5 = bh9VarS4 != null ? bh9VarS4.m() : null;
            bh9 bh9VarS5 = qh9Var.s("ddtags");
            String strM6 = bh9VarS5 != null ? bh9VarS5.m() : null;
            aa aaVarA = yfd.A(qh9Var.s("session").g());
            bh9 bh9VarS6 = qh9Var.s("source");
            int i3 = 0;
            if (bh9VarS6 != null && (strM = bh9VarS6.m()) != null) {
                int[] iArrH = sq6.H(11);
                dbVar = null;
                try {
                    int length = iArrH.length;
                    while (i3 < length) {
                        int i4 = iArrH[i3];
                        int i5 = length;
                        if (sq6.f(i4).equals(strM)) {
                            i2 = i4;
                        } else {
                            i3++;
                            length = i5;
                        }
                    }
                    throw new NoSuchElementException("Array contains no element matching the predicate.");
                } catch (IllegalStateException e2) {
                    e = e2;
                    pmf.j("Unable to parse json into type ActionEvent", e);
                    return dbVar;
                } catch (NullPointerException e3) {
                    e = e3;
                    pmf.j("Unable to parse json into type ActionEvent", e);
                    return dbVar;
                } catch (NumberFormatException e4) {
                    e = e4;
                    pmf.j("Unable to parse json into type ActionEvent", e);
                    return dbVar;
                }
            }
            dbVar = null;
            i2 = 0;
            ba baVarW = eve.w(qh9Var.s("view").g());
            bh9 bh9VarS7 = qh9Var.s("usr");
            bb bbVarV = bh9VarS7 != null ? v40.v(bh9VarS7.g()) : dbVar;
            bh9 bh9VarS8 = qh9Var.s("account");
            w9 w9VarE = bh9VarS8 != null ? rkk.e(bh9VarS8.g()) : dbVar;
            bh9 bh9VarS9 = qh9Var.s("connectivity");
            ga gaVarZ = bh9VarS9 != null ? zni.z(bh9VarS9.g()) : dbVar;
            bh9 bh9VarS10 = qh9Var.s("display");
            qa qaVarH = bh9VarS10 != null ? flk.h(bh9VarS10.g()) : dbVar;
            bh9 bh9VarS11 = qh9Var.s("synthetics");
            za zaVarF = bh9VarS11 != null ? vlk.f(bh9VarS11.g()) : dbVar;
            bh9 bh9VarS12 = qh9Var.s("ci_test");
            ea eaVarE = bh9VarS12 != null ? xkk.e(bh9VarS12.g()) : dbVar;
            bh9 bh9VarS13 = qh9Var.s("os");
            va vaVarM = bh9VarS13 != null ? j8.M(bh9VarS13.g()) : dbVar;
            bh9 bh9VarS14 = qh9Var.s("device");
            pa paVarG = bh9VarS14 != null ? mpk.G(bh9VarS14.g()) : dbVar;
            la laVarV = iuj.v(qh9Var.s("_dd").g());
            bh9 bh9VarS15 = qh9Var.s("context");
            ja jaVarF = bh9VarS15 != null ? dgj.F(bh9VarS15.g()) : dbVar;
            bh9 bh9VarS16 = qh9Var.s("container");
            ha haVarH = bh9VarS16 != null ? ykk.h(bh9VarS16.g()) : dbVar;
            String strM7 = qh9Var.s("type").m();
            x9 x9VarA = mwa.A(qh9Var.s("action").g());
            if (x44.r(strM7, "action")) {
                return new db(jK, caVarX, strM2, strM3, strM4, strM5, strM6, aaVarA, i2, baVarW, bbVarV, w9VarE, gaVarZ, qaVarH, zaVarF, eaVarE, vaVarM, paVarG, laVarV, jaVarF, haVarH, x9VarA);
            }
            throw new IllegalStateException("Check failed.");
        } catch (IllegalStateException e5) {
            e = e5;
            dbVar = null;
        } catch (NullPointerException e6) {
            e = e6;
            dbVar = null;
        } catch (NumberFormatException e7) {
            e = e7;
            dbVar = null;
        }
    }

    public static final ArrayList v(xa9 xa9Var) {
        xa9Var.getClass();
        av9 av9VarV0 = ((fma) xa9Var).v0();
        boolean zG = G(av9VarV0);
        List listR = av9VarV0.r();
        vwb vwbVar = (vwb) listR;
        ArrayList arrayList = new ArrayList(vwbVar.E.G);
        int size = listR.size();
        for (int i2 = 0; i2 < size; i2++) {
            av9 av9Var = (av9) vwbVar.get(i2);
            arrayList.add(zG ? av9Var.o() : av9Var.p());
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object w(defpackage.zhh r4, defpackage.vp4 r5) {
        /*
            boolean r0 = r5 instanceof defpackage.w74
            if (r0 == 0) goto L13
            r0 = r5
            w74 r0 = (defpackage.w74) r0
            int r1 = r0.G
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.G = r1
            goto L18
        L13:
            w74 r0 = new w74
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.F
            int r1 = r0.G
            r2 = 1
            if (r1 == 0) goto L2e
            if (r1 != r2) goto L27
            zhh r4 = r0.E
            defpackage.sf5.h0(r5)
            goto L3e
        L27:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r4)
            r4 = 0
            return r4
        L2e:
            defpackage.sf5.h0(r5)
            r0.E = r4
            r0.G = r2
            java.lang.Object r5 = r4.z(r0)
            m45 r0 = defpackage.m45.E
            if (r5 != r0) goto L3e
            return r0
        L3e:
            boolean r5 = r4.e()
            boolean r0 = r4.g()
            boolean r1 = r4.f()
            boolean r2 = r4.h()
            boolean r4 = r4.d()
            int r4 = defpackage.hdb.a(r5, r0, r1, r2, r4)
            hdb r5 = new hdb
            r5.<init>(r4)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dch.w(zhh, vp4):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object x(defpackage.sih r4, defpackage.vp4 r5) {
        /*
            boolean r0 = r5 instanceof defpackage.v74
            if (r0 == 0) goto L13
            r0 = r5
            v74 r0 = (defpackage.v74) r0
            int r1 = r0.G
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.G = r1
            goto L18
        L13:
            v74 r0 = new v74
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.F
            int r1 = r0.G
            r2 = 1
            if (r1 == 0) goto L2e
            if (r1 != r2) goto L27
            sih r4 = r0.E
            defpackage.sf5.h0(r5)
            goto L3f
        L27:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r4)
            r4 = 0
            return r4
        L2e:
            defpackage.sf5.h0(r5)
            r0.E = r4
            r0.G = r2
            r4.G()
            iei r5 = defpackage.iei.a
            m45 r0 = defpackage.m45.E
            if (r5 != r0) goto L3f
            return r0
        L3f:
            boolean r5 = r4.e()
            boolean r0 = r4.g()
            boolean r1 = r4.f()
            boolean r2 = r4.h()
            boolean r4 = r4.d()
            int r4 = defpackage.hdb.a(r5, r0, r1, r2, r4)
            hdb r5 = new hdb
            r5.<init>(r4)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dch.x(sih, vp4):java.lang.Object");
    }

    public static final Object y(jx8 jx8Var, efe efeVar) {
        Object obj = jx8Var.i().a.get(efeVar);
        if (obj != null) {
            return obj;
        }
        Object obj2 = jx8Var.f().n.a.get(efeVar);
        return obj2 == null ? efeVar.F : obj2;
    }

    public static final Object z(qjc qjcVar, efe efeVar) {
        Object obj = qjcVar.c().a.get(efeVar);
        return obj == null ? efeVar.F : obj;
    }

    public abstract String q(byte[] bArr, int i2, int i3);

    public abstract int s(String str, byte[] bArr, int i2, int i3);
}
