package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Handler;
import android.os.Process;
import android.text.TextUtils;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.pvporbit.freetype.FreeTypeConstants;
import java.io.DataInputStream;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import kotlin.UninitializedPropertyAccessException;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes.dex */
public abstract class x44 {
    public static final aci a = aci.I;
    public static final d9i b = new d9i(new f9c(12), new f9c(13));
    public static final Object c = new Object();
    public static Context d;

    public static int A(long j, long j2) {
        if (j < j2) {
            return -1;
        }
        return j == j2 ? 0 : 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00a6, code lost:
    
        r12 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlinx.serialization.KSerializer B(java.lang.Class r17, kotlinx.serialization.KSerializer... r18) throws java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instruction units count: 451
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x44.B(java.lang.Class, kotlinx.serialization.KSerializer[]):kotlinx.serialization.KSerializer");
    }

    public static ewb C() {
        long[] jArr = u6f.a;
        return new ewb();
    }

    public static p94 D(String str, String str2) {
        t81 t81Var = new t81(str, str2);
        o94 o94VarB = p94.b(t81.class);
        o94VarB.e = 1;
        o94VarB.f = new n94(0, t81Var);
        return o94VarB.b();
    }

    public static d8a E() {
        return new d8a(10);
    }

    public static final iqb F(iqb iqbVar, boolean z, bz7 bz7Var) {
        return iqbVar.B(new kw5(bz7Var, z));
    }

    public static ArrayList G(Iterable iterable) {
        iterable.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            b54.t0(arrayList, (Iterable) it.next());
        }
        return arrayList;
    }

    public static kcg H(q28 q28Var, bz7 bz7Var, mb0 mb0Var, ld4 ld4Var, int i) {
        z8i z8iVar = vx.a;
        ry ryVar = (ry) q28Var.F;
        int i2 = (i & 1008) | (vx.d << 9);
        e18 e18Var = (e18) ld4Var;
        cz5 cz5Var = (cz5) e18Var.j(ve4.h);
        int i3 = 1;
        boolean zF = ((((i2 & 112) ^ 48) > 32 && e18Var.f(bz7Var)) || (i2 & 48) == 32) | e18Var.f(cz5Var) | e18Var.f(ryVar) | e18Var.f(mb0Var);
        Object objN = e18Var.N();
        if (zF || objN == jd4.a) {
            objN = new kcg(new fj0(ryVar, bz7Var, new p7(i3, cz5Var)), fy.b, mb0Var);
            e18Var.k0(objN);
        }
        return (kcg) objN;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0067 -> B:17:0x0044). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I(defpackage.d6e r5, defpackage.mkf r6, defpackage.tp4 r7) {
        /*
            boolean r0 = r7 instanceof defpackage.r47
            if (r0 == 0) goto L13
            r0 = r7
            r47 r0 = (defpackage.r47) r0
            int r1 = r0.H
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.H = r1
            goto L18
        L13:
            r47 r0 = new r47
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.G
            int r1 = r0.H
            r2 = 2
            r3 = 1
            m45 r4 = defpackage.m45.E
            if (r1 == 0) goto L3d
            if (r1 == r3) goto L35
            if (r1 != r2) goto L2e
            sy1 r5 = r0.F
            mkf r6 = r0.E
            defpackage.sf5.h0(r7)
            goto L44
        L2e:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r5)
            r5 = 0
            return r5
        L35:
            sy1 r5 = r0.F
            mkf r6 = r0.E
            defpackage.sf5.h0(r7)
            goto L51
        L3d:
            defpackage.sf5.h0(r7)
            sy1 r5 = r5.iterator()
        L44:
            r0.E = r6
            r0.F = r5
            r0.H = r3
            java.lang.Object r7 = r5.b(r0)
            if (r7 != r4) goto L51
            goto L69
        L51:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L6a
            java.lang.Object r7 = r5.c()
            r0.E = r6
            r0.F = r5
            r0.H = r2
            java.lang.Object r7 = r6.b(r0, r7)
            if (r7 != r4) goto L44
        L69:
            return r4
        L6a:
            iei r5 = defpackage.iei.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x44.I(d6e, mkf, tp4):java.lang.Object");
    }

    public static p94 J(String str, xh6 xh6Var) {
        o94 o94VarB = p94.b(t81.class);
        o94VarB.e = 1;
        o94VarB.a(iz5.a(Context.class));
        o94VarB.f = new ja4(str, 2, xh6Var);
        return o94VarB.b();
    }

    public static ColorStateList K(Context context, int i) {
        return iqe.a(context.getResources(), i, context.getTheme());
    }

    public static b79 L(Collection collection) {
        collection.getClass();
        return new b79(0, collection.size() - 1, 1);
    }

    public static int M(List list) {
        list.getClass();
        return list.size() - 1;
    }

    public static Executor N(Context context) {
        return Build.VERSION.SDK_INT >= 28 ? ke0.f(context) : new o30(new Handler(context.getMainLooper()));
    }

    public static final mmg O(pdg pdgVar) {
        mmg mmgVar = pdgVar.E;
        mmgVar.getClass();
        return (mmg) ycg.t(mmgVar, pdgVar);
    }

    public static final int P(moh mohVar) {
        fqc fqcVar = null;
        for (int i = mohVar.h - 1; -1 < i; i--) {
            mohVar.c(i);
            fqc fqcVarA = mohVar.a(i);
            if (r(fqcVarA.a(), zp3.N) || r(fqcVarA.a(), zp3.P)) {
                return -(fqcVar != null ? (int) (fqcVar.e >> 32) : R(fqcVarA));
            }
            if (fqcVarA.a().b == 3 || fqcVarA.a().b == 2) {
                fqcVar = fqcVarA;
            }
        }
        return 0;
    }

    public static final int Q(moh mohVar) {
        int i = mohVar.h;
        fqc fqcVar = null;
        for (int i2 = 0; i2 < i; i2++) {
            mohVar.c(i2);
            fqc fqcVarA = mohVar.a(i2);
            if (r(fqcVarA.a(), zp3.O) || r(fqcVarA.a(), zp3.Q)) {
                return ((int) (mohVar.g >> 32)) - (fqcVar != null ? R(fqcVar) : (int) (fqcVarA.e >> 32));
            }
            if (fqcVarA.a().b == 3 || fqcVarA.a().b == 2) {
                fqcVar = fqcVarA;
            }
        }
        return 0;
    }

    public static final int R(fqc fqcVar) {
        return ((int) (fqcVar.e >> 32)) + ((int) (fqcVar.d >> 32));
    }

    public static final dv7 S() {
        dv7 dv7Var = dv7.F;
        return new dv7(650);
    }

    public static iqb T(iqb iqbVar, zub zubVar) {
        return iqbVar.B(new np8(zubVar));
    }

    public static final KSerializer U(Object obj, KSerializer... kSerializerArr) throws IllegalAccessException, InvocationTargetException {
        Class[] clsArr;
        try {
            if (kSerializerArr.length == 0) {
                clsArr = new Class[0];
            } else {
                int length = kSerializerArr.length;
                Class[] clsArr2 = new Class[length];
                for (int i = 0; i < length; i++) {
                    clsArr2[i] = KSerializer.class;
                }
                clsArr = clsArr2;
            }
            Object objInvoke = obj.getClass().getDeclaredMethod("serializer", (Class[]) Arrays.copyOf(clsArr, clsArr.length)).invoke(obj, Arrays.copyOf(kSerializerArr, kSerializerArr.length));
            if (objInvoke instanceof KSerializer) {
                return (KSerializer) objInvoke;
            }
            return null;
        } catch (NoSuchMethodException unused) {
            return null;
        } catch (InvocationTargetException e) {
            Throwable cause = e.getCause();
            if (cause == null) {
                throw e;
            }
            String message = cause.getMessage();
            if (message == null) {
                message = e.getMessage();
            }
            throw new InvocationTargetException(cause, message);
        }
    }

    public static final boolean V(ld4 ld4Var) {
        return ((Configuration) ((e18) ld4Var).j(w00.a)).screenHeightDp < 480;
    }

    public static List W(Object obj) {
        List listSingletonList = Collections.singletonList(obj);
        listSingletonList.getClass();
        return listSingletonList;
    }

    public static List X(Object... objArr) {
        objArr.getClass();
        if (objArr.length <= 0) {
            return lm6.E;
        }
        List listAsList = Arrays.asList(objArr);
        listAsList.getClass();
        return listAsList;
    }

    public static List Y(Object obj) {
        return obj != null ? W(obj) : lm6.E;
    }

    public static iqb Z(iqb iqbVar, q28 q28Var, ukc ukcVar, boolean z, boolean z2, eo7 eo7Var, ld4 ld4Var, int i) {
        if ((i & 8) != 0) {
            z2 = ((e18) ld4Var).j(ve4.n) == fu9.F;
        }
        return fy.e(iqbVar, (ry) q28Var.F, z2, ukcVar, z, eo7Var, 32);
    }

    public static final zy1 a() {
        return wd6.P(Integer.MAX_VALUE, 6, null);
    }

    public static ArrayList a0(Object... objArr) {
        return objArr.length == 0 ? new ArrayList() : new ArrayList(new lo0(objArr, true));
    }

    public static final void b(d6e d6eVar, pz7 pz7Var, ld4 ld4Var, int i) {
        int i2;
        d6eVar.getClass();
        pz7Var.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(1868971621);
        int i3 = 4;
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? e18Var.f(d6eVar) : e18Var.h(d6eVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? e18Var.f(pz7Var) : e18Var.h(pz7Var) ? 32 : 16;
        }
        boolean z = false;
        if (e18Var.Q(i2 & 1, (i2 & 19) != 18)) {
            boolean z2 = (i2 & 14) == 4 || ((i2 & 8) != 0 && e18Var.h(d6eVar));
            if ((i2 & 112) == 32 || ((i2 & 64) != 0 && e18Var.h(pz7Var))) {
                z = true;
            }
            boolean z3 = z2 | z;
            Object objN = e18Var.N();
            if (z3 || objN == jd4.a) {
                objN = new cx(d6eVar, pz7Var, (tp4) null, 15);
                e18Var.k0(objN);
            }
            fd9.i(e18Var, (pz7) objN, d6eVar);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new kb2(d6eVar, pz7Var, i, i3);
        }
    }

    public static final List b0(List list) {
        int size = list.size();
        return size != 0 ? size != 1 ? list : W(list.get(0)) : lm6.E;
    }

    public static final x29 c(String str, KSerializer kSerializer) {
        return new x29(str, new y29(kSerializer));
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void c0(defpackage.fb2 r10, defpackage.yjh r11) throws java.lang.Throwable {
        /*
            qtb r0 = r11.b
            boolean r1 = r11.d()
            xjh r2 = r11.a
            if (r1 == 0) goto L13
            int r1 = r2.f
            r3 = 3
            if (r1 != r3) goto L10
            goto L13
        L10:
            r1 = 1
        L11:
            r7 = r1
            goto L15
        L13:
            r1 = 0
            goto L11
        L15:
            if (r7 == 0) goto L40
            long r3 = r11.c
            r11 = 32
            long r5 = r3 >> r11
            int r1 = (int) r5
            float r1 = (float) r1
            r5 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r3 = r3 & r5
            int r3 = (int) r3
            float r3 = (float) r3
            int r1 = java.lang.Float.floatToRawIntBits(r1)
            long r8 = (long) r1
            int r1 = java.lang.Float.floatToRawIntBits(r3)
            long r3 = (long) r1
            long r8 = r8 << r11
            long r3 = r3 & r5
            long r3 = r3 | r8
            r5 = 0
            l9e r11 = defpackage.d4c.x(r5, r3)
            r10.g()
            defpackage.fb2.q(r10, r11)
        L40:
            tkh r11 = r2.b
            egg r11 = r11.a
            qeh r1 = r11.m
            ejh r2 = r11.a
            if (r1 != 0) goto L4c
            qeh r1 = defpackage.qeh.b
        L4c:
            r5 = r1
            uzf r1 = r11.n
            if (r1 != 0) goto L53
            uzf r1 = defpackage.uzf.d
        L53:
            r4 = r1
            yd6 r11 = r11.p
            if (r11 != 0) goto L5a
            qk7 r11 = defpackage.qk7.a
        L5a:
            r6 = r11
            r11 = r2
            jy1 r2 = r11.c()     // Catch: java.lang.Throwable -> L95
            djh r1 = defpackage.djh.a
            if (r2 == 0) goto L7e
            if (r11 == r1) goto L71
            float r11 = r11.a()     // Catch: java.lang.Throwable -> L6d
        L6a:
            r1 = r10
            r3 = r11
            goto L74
        L6d:
            r0 = move-exception
            r11 = r0
            r1 = r10
            goto L98
        L71:
            r11 = 1065353216(0x3f800000, float:1.0)
            goto L6a
        L74:
            defpackage.cqk.e(r0, r1, r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L7a
            r10 = r1
            r1 = r10
            goto L8d
        L7a:
            r0 = move-exception
            r10 = r1
        L7c:
            r11 = r0
            goto L98
        L7e:
            if (r11 == r1) goto L87
            long r1 = r11.b()     // Catch: java.lang.Throwable -> L6d
        L84:
            r2 = r1
            r1 = r10
            goto L8a
        L87:
            long r1 = defpackage.d54.b     // Catch: java.lang.Throwable -> L95
            goto L84
        L8a:
            r0.i(r1, r2, r4, r5, r6)     // Catch: java.lang.Throwable -> L93
        L8d:
            if (r7 == 0) goto L92
            r1.p()
        L92:
            return
        L93:
            r0 = move-exception
            goto L7c
        L95:
            r0 = move-exception
            r1 = r10
            goto L7c
        L98:
            if (r7 == 0) goto L9d
            r1.p()
        L9d:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x44.c0(fb2, yjh):void");
    }

    public static final void d(ta4 ta4Var, ld4 ld4Var) {
        m7f m7fVarB;
        q7f q7fVar = q7f.a;
        e18 e18Var = (e18) ld4Var;
        m7f m7fVarN = sq6.n(e18Var, -1168520582, e18Var, -1633490746);
        boolean zF = e18Var.f(null) | e18Var.f(m7fVarN);
        Object objN = e18Var.N();
        if (zF || objN == jd4.a) {
            objN = m7fVarN.a(jce.a.b(ql3.class), null, null);
            e18Var.k0(objN);
        }
        int i = 0;
        e18Var.p(false);
        e18Var.p(false);
        ql3 ql3Var = (ql3) objN;
        e18 e18Var2 = (e18) ld4Var;
        Object objN2 = e18Var2.N();
        lz1 lz1Var = jd4.a;
        if (objN2 == lz1Var) {
            synchronized (ql3Var) {
                er9 er9Var = ql3Var.a;
                String str = q7f.b;
                m7fVarB = er9Var.b(str);
                if (m7fVarB == null) {
                    er9 er9Var2 = ql3Var.a;
                    xai xaiVar = new xai(jce.a.b(lja.class));
                    dpf dpfVar = er9Var2.c;
                    dpfVar.getClass();
                    m7f m7fVar = (m7f) ((ConcurrentHashMap) dpfVar.H).get(str);
                    m7fVarB = m7fVar == null ? er9Var2.c.x(str, xaiVar, null) : m7fVar;
                    ql3Var.a.c(mja.a, true);
                    List list = xah.a;
                    xah.e(6, "ClaudeKoinScopeHolder: Created LoginScope " + m7fVarB.b, null, null);
                }
            }
            objN2 = new o7f(m7fVarB);
            e18Var2.k0(objN2);
        }
        m7f m7fVar2 = ((o7f) objN2).a;
        boolean zH = e18Var2.h(ql3Var);
        Object objN3 = e18Var2.N();
        if (zH || objN3 == lz1Var) {
            objN3 = new kr9(ql3Var, i);
            e18Var2.k0(objN3);
        }
        h(m7fVar2, (zy7) objN3, ta4Var, e18Var2, 384);
    }

    public static final void d0(int i, int i2) {
        if (i2 < 0) {
            sz6.p(grc.u("fromIndex (0) is greater than toIndex (", i2, ")."));
        } else {
            if (i2 <= i) {
                return;
            }
            xh6.j(vb7.q("toIndex (", ") is greater than size (", i2, i, ")."));
        }
    }

    public static final void e(final zqc zqcVar, ld4 ld4Var, final int i) {
        r7e r7eVarS;
        pz7 pz7Var;
        zqcVar.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-933352578);
        int i2 = (e18Var.f(zqcVar) ? 4 : 2) | i;
        final int i3 = 0;
        final int i4 = 1;
        if (!e18Var.Q(i2 & 1, (i2 & 3) != 2)) {
            e18Var.T();
        } else {
            if (((Boolean) e18Var.j(p59.a)).booleanValue()) {
                r7eVarS = e18Var.s();
                if (r7eVarS != null) {
                    pz7Var = new pz7(zqcVar, i, i3) { // from class: gbc
                        public final /* synthetic */ int E;
                        public final /* synthetic */ zqc F;

                        {
                            this.E = i3;
                        }

                        @Override // defpackage.pz7
                        public final Object invoke(Object obj, Object obj2) {
                            int i5 = this.E;
                            iei ieiVar = iei.a;
                            zqc zqcVar2 = this.F;
                            ld4 ld4Var2 = (ld4) obj;
                            ((Integer) obj2).getClass();
                            switch (i5) {
                                case 0:
                                    x44.e(zqcVar2, ld4Var2, x44.p0(1));
                                    break;
                                default:
                                    x44.e(zqcVar2, ld4Var2, x44.p0(1));
                                    break;
                            }
                            return ieiVar;
                        }
                    };
                    r7eVarS.d = pz7Var;
                }
                return;
            }
            f(zqcVar, null, e18Var, i2 & 14);
        }
        r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            pz7Var = new pz7(zqcVar, i, i4) { // from class: gbc
                public final /* synthetic */ int E;
                public final /* synthetic */ zqc F;

                {
                    this.E = i4;
                }

                @Override // defpackage.pz7
                public final Object invoke(Object obj, Object obj2) {
                    int i5 = this.E;
                    iei ieiVar = iei.a;
                    zqc zqcVar2 = this.F;
                    ld4 ld4Var2 = (ld4) obj;
                    ((Integer) obj2).getClass();
                    switch (i5) {
                        case 0:
                            x44.e(zqcVar2, ld4Var2, x44.p0(1));
                            break;
                        default:
                            x44.e(zqcVar2, ld4Var2, x44.p0(1));
                            break;
                    }
                    return ieiVar;
                }
            };
            r7eVarS.d = pz7Var;
        }
    }

    public static qz1 e0(InputStream inputStream) {
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        b79 b79Var = new b79(1, dataInputStream.readInt(), 1);
        ArrayList arrayList = new ArrayList(y(b79Var, 10));
        Iterator it = b79Var.iterator();
        while (true) {
            a79 a79Var = (a79) it;
            if (!a79Var.G) {
                int[] iArrO1 = w44.o1(arrayList);
                int[] iArrCopyOf = Arrays.copyOf(iArrO1, iArrO1.length);
                return new qz1(Arrays.copyOf(iArrCopyOf, iArrCopyOf.length));
            }
            a79Var.nextInt();
            arrayList.add(Integer.valueOf(dataInputStream.readInt()));
        }
    }

    public static final void f(zqc zqcVar, ec ecVar, ld4 ld4Var, int i) {
        ec ecVar2;
        ec ecVar3;
        int i2;
        Object lzaVar;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-1051306345);
        int i3 = (e18Var.f(zqcVar) ? 4 : 2) | i | 16;
        if (e18Var.Q(i3 & 1, (i3 & 19) != 18)) {
            e18Var.V();
            int i4 = i & 1;
            lz1 lz1Var = jd4.a;
            if (i4 == 0 || e18Var.A()) {
                m7f m7fVarN = sq6.n(e18Var, -1168520582, e18Var, -1633490746);
                boolean zF = e18Var.f(null) | e18Var.f(m7fVarN);
                Object objN = e18Var.N();
                if (zF || objN == lz1Var) {
                    objN = m7fVarN.a(jce.a.b(ec.class), null, null);
                    e18Var.k0(objN);
                }
                e18Var.p(false);
                e18Var.p(false);
                ecVar3 = (ec) objN;
                i2 = i3 & (-113);
            } else {
                e18Var.T();
                i2 = i3 & (-113);
                ecVar3 = ecVar;
            }
            e18Var.q();
            Object objN2 = e18Var.N();
            if (objN2 == lz1Var) {
                objN2 = new Object();
                e18Var.k0(objN2);
            }
            Object objN3 = e18Var.N();
            if (objN3 == lz1Var) {
                objN3 = new Object();
                e18Var.k0(objN3);
            }
            boolean zH = e18Var.h(ecVar3) | e18Var.h(objN2) | e18Var.h(objN3);
            Object objN4 = e18Var.N();
            if (zH || objN4 == lz1Var) {
                objN4 = new ny4(ecVar3, objN2, objN3, 28);
                e18Var.k0(objN4);
            }
            fd9.f(objN2, objN3, ecVar3, (bz7) objN4, e18Var);
            Object[] objArr = {zqcVar, objN2, objN3, ecVar3};
            boolean zH2 = e18Var.h(ecVar3) | ((i2 & 14) == 4) | e18Var.h(objN2) | e18Var.h(objN3);
            Object objN5 = e18Var.N();
            if (zH2 || objN5 == lz1Var) {
                ecVar2 = ecVar3;
                lzaVar = new lza(zqcVar, ecVar2, objN2, objN3, (tp4) null, 2);
                e18Var.k0(lzaVar);
            } else {
                lzaVar = objN5;
                ecVar2 = ecVar3;
            }
            fd9.l(objArr, (pz7) lzaVar, e18Var);
        } else {
            e18Var.T();
            ecVar2 = ecVar;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new lpa(zqcVar, ecVar2, i, 13);
        }
    }

    public static Intent f0(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        return Build.VERSION.SDK_INT >= 33 ? context.registerReceiver(broadcastReceiver, intentFilter, null, null, 2) : nrk.g(context, broadcastReceiver, intentFilter);
    }

    public static final void g(iqb iqbVar, ld4 ld4Var, int i) {
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-93309715);
        int i2 = 0;
        if ((((e18Var.f(iqbVar) ? 4 : 2) | i) & 3) == 2 && e18Var.C()) {
            e18Var.T();
        } else {
            e18Var.a0(-726979983);
            Object objN = e18Var.N();
            if (objN == jd4.a) {
                objN = kt5.G;
                e18Var.k0(objN);
            }
            e18Var.p(false);
            dw1.a(a0h.a(iqbVar, iei.a, (PointerInputEventHandler) objN), e18Var, 0);
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new gu5(i, i2, iqbVar);
        }
    }

    public static final um2 g0(final ng8 ng8Var, ld4 ld4Var) {
        final long j = gm3.a(ld4Var).n;
        final long j2 = gm3.a(ld4Var).o;
        long j3 = gm3.a(ld4Var).v;
        e18 e18Var = (e18) ld4Var;
        boolean zF = ((e18) ld4Var).f(ng8Var) | e18Var.e(j) | e18Var.e(j2) | e18Var.e(j3);
        Object objN = e18Var.N();
        if (zF || objN == jd4.a) {
            objN = new um2(sf5.a(0.5f, j3), new tzf(8.0f, d54.b(0.1f, d54.b), MTTypesetterKt.kLineSkipLimitMultiplier, (((long) Float.floatToRawIntBits(MTTypesetterKt.kLineSkipLimitMultiplier)) << 32) | (((long) Float.floatToRawIntBits(2.0f)) & 4294967295L), 48), new d54(d54.g), new bz7() { // from class: tm2
                @Override // defpackage.bz7
                public final Object invoke(Object obj) {
                    e0g e0gVar = (e0g) obj;
                    e0gVar.getClass();
                    long j4 = j;
                    return gb9.z(ng8Var, new og8(j2, new qg8(d54.b(0.78f, j4)), 22.0f, MTTypesetterKt.kLineSkipLimitMultiplier, new qg8(d54.b(0.96f, j4))), new a2(5, e0gVar));
                }
            });
            e18Var.k0(objN);
        }
        return (um2) objN;
    }

    public static final void h(m7f m7fVar, zy7 zy7Var, ta4 ta4Var, ld4 ld4Var, int i) {
        int i2;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(1798123788);
        if ((i & 6) == 0) {
            i2 = (e18Var.h(m7fVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= e18Var.h(zy7Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= e18Var.h(ta4Var) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        if (e18Var.Q(i2 & 1, (i2 & 147) != 146)) {
            boolean zF = e18Var.f(m7fVar);
            Object objN = e18Var.N();
            if (zF || objN == jd4.a) {
                objN = mpk.P(Boolean.FALSE);
                e18Var.k0(objN);
            }
            j8.c(gr9.b.a(m7fVar), fd9.q0(-199568308, new m63(ta4Var, (nwb) objN, zy7Var, 13), e18Var), e18Var, 48);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new fb0(m7fVar, i, zy7Var, ta4Var, 4);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final defpackage.nwb h0(defpackage.ld4 r6) {
        /*
            umg r0 = defpackage.w00.b
            e18 r6 = (defpackage.e18) r6
            java.lang.Object r0 = r6.j(r0)
            android.content.Context r0 = (android.content.Context) r0
            boolean r1 = r6.f(r0)
            java.lang.Object r2 = r6.N()
            lz1 r3 = defpackage.jd4.a
            if (r1 != 0) goto L18
            if (r2 != r3) goto L2b
        L18:
            java.lang.String r1 = "accessibility"
            java.lang.Object r0 = r0.getSystemService(r1)
            boolean r1 = r0 instanceof android.view.accessibility.AccessibilityManager
            if (r1 == 0) goto L26
            android.view.accessibility.AccessibilityManager r0 = (android.view.accessibility.AccessibilityManager) r0
        L24:
            r2 = r0
            goto L28
        L26:
            r0 = 0
            goto L24
        L28:
            r6.k0(r2)
        L2b:
            android.view.accessibility.AccessibilityManager r2 = (android.view.accessibility.AccessibilityManager) r2
            java.lang.Object r0 = r6.N()
            r1 = 0
            if (r0 != r3) goto L4a
            if (r2 == 0) goto L3e
            boolean r0 = r2.isTouchExplorationEnabled()
            r4 = 1
            if (r0 != r4) goto L3e
            goto L3f
        L3e:
            r4 = r1
        L3f:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)
            lsc r0 = defpackage.mpk.P(r0)
            r6.k0(r0)
        L4a:
            nwb r0 = (defpackage.nwb) r0
            boolean r4 = r6.h(r2)
            java.lang.Object r5 = r6.N()
            if (r4 != 0) goto L58
            if (r5 != r3) goto L60
        L58:
            o5 r5 = new o5
            r5.<init>(r2, r1, r0)
            r6.k0(r5)
        L60:
            bz7 r5 = (defpackage.bz7) r5
            defpackage.fd9.d(r2, r5, r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x44.h0(ld4):nwb");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r18v2, types: [ewe] */
    /* JADX WARN: Type inference failed for: r18v3, types: [ewe, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r18v4 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v20, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v38 */
    /* JADX WARN: Type inference failed for: r6v39 */
    public static final ewe i(float[] fArr, r35 r35Var, AbstractList abstractList, float f, float f2) {
        float f3;
        int i;
        ArrayList arrayList;
        ArrayList arrayList2;
        List listW;
        zc5 zc5VarC;
        r35 r35Var2;
        float f4 = 1.0f;
        Float fValueOf = Float.valueOf(1.0f);
        r35Var.getClass();
        ?? r6 = 0;
        if (fArr.length < 6) {
            sz6.p("Polygons must have at least 3 vertices");
            return null;
        }
        int i2 = 2;
        int i3 = 1;
        if (fArr.length % 2 == 1) {
            sz6.p("The vertices array should have even size");
            return null;
        }
        if (abstractList != null && abstractList.size() * 2 != fArr.length) {
            sz6.p("perVertexRounding list should be either null or the same size as the number of vertices (vertices.size / 2)");
            return null;
        }
        ArrayList arrayList3 = new ArrayList();
        int length = fArr.length / 2;
        ArrayList arrayList4 = new ArrayList();
        int i4 = 0;
        int i5 = 0;
        while (i5 < length) {
            r35 r35Var3 = (abstractList == null || (r35Var2 = (r35) abstractList.get(i5)) == null) ? r35Var : r35Var2;
            int i6 = (((i5 + length) - 1) % length) * 2;
            int i7 = i5 + 1;
            int i8 = (i7 % length) * 2;
            int i9 = i5 * 2;
            arrayList4.add(new tve(so7.a(fArr[i6], fArr[i6 + 1]), so7.a(fArr[i9], fArr[i9 + 1]), so7.a(fArr[i8], fArr[i8 + 1]), r35Var3));
            i5 = i7;
            f4 = f4;
        }
        float f5 = f4;
        b79 b79VarH0 = wd6.H0(0, length);
        ArrayList arrayList5 = new ArrayList(y(b79VarH0, 10));
        Iterator it = b79VarH0.iterator();
        while (true) {
            a79 a79Var = (a79) it;
            boolean z = a79Var.G;
            f3 = MTTypesetterKt.kLineSkipLimitMultiplier;
            if (!z) {
                break;
            }
            int iNextInt = a79Var.nextInt();
            int i10 = (iNextInt + 1) % length;
            float f6 = ((tve) arrayList4.get(iNextInt)).h + ((tve) arrayList4.get(i10)).h;
            float fC = ((tve) arrayList4.get(i10)).c() + ((tve) arrayList4.get(iNextInt)).c();
            int i11 = iNextInt * 2;
            float f7 = fArr[i11];
            float f8 = fArr[i11 + 1];
            int i12 = i10 * 2;
            float f9 = f7 - fArr[i12];
            float f10 = f8 - fArr[i12 + 1];
            float f11 = bqi.b;
            float fSqrt = (float) Math.sqrt((f10 * f10) + (f9 * f9));
            arrayList5.add(f6 > fSqrt ? new cpc(Float.valueOf(fSqrt / f6), Float.valueOf(MTTypesetterKt.kLineSkipLimitMultiplier)) : fC > fSqrt ? new cpc(fValueOf, Float.valueOf((fSqrt - f6) / (fC - f6))) : new cpc(fValueOf, fValueOf));
        }
        for (int i13 = 0; i13 < length; i13 = i + 1) {
            float[] fArrCopyOf = new float[i2];
            int i14 = i4;
            int i15 = i14;
            ?? r62 = r6;
            while (i14 < i2) {
                ?? r18 = r62;
                cpc cpcVar = (cpc) arrayList5.get((((i13 + length) - 1) + i14) % length);
                int i16 = i4;
                float f12 = f3;
                int i17 = i2;
                float fK = sq6.k(((tve) arrayList4.get(i13)).c(), ((tve) arrayList4.get(i13)).h, ((Number) cpcVar.F).floatValue(), ((tve) arrayList4.get(i13)).h * ((Number) cpcVar.E).floatValue());
                int i18 = i15 + 1;
                if (fArrCopyOf.length < i18) {
                    fArrCopyOf = Arrays.copyOf(fArrCopyOf, Math.max(i18, (fArrCopyOf.length * 3) / 2));
                }
                fArrCopyOf[i15] = fK;
                i14++;
                f3 = f12;
                i15 = i18;
                i4 = i16;
                r62 = r18;
                i2 = i17;
            }
            int i19 = i2;
            ?? r182 = r62;
            int i20 = i4;
            float f13 = f3;
            tve tveVar = (tve) arrayList4.get(i13);
            if (i15 <= 0) {
                gtk.h("Index must be between 0 and size");
                throw r182;
            }
            float f14 = fArrCopyOf[i20];
            if (i3 >= i15) {
                gtk.h("Index must be between 0 and size");
                throw r182;
            }
            float f15 = fArrCopyOf[i3];
            long j = tveVar.e;
            long j2 = tveVar.d;
            int i21 = i3;
            float f16 = tveVar.f;
            ArrayList arrayList6 = arrayList3;
            long j3 = tveVar.b;
            float fMin = Math.min(f14, f15);
            float f17 = tveVar.h;
            if (f17 < 1.0E-4f || fMin < 1.0E-4f || f16 < 1.0E-4f) {
                i = i13;
                arrayList = arrayList5;
                arrayList2 = arrayList4;
                tveVar.i = j3;
                float fE = yfd.E(j3);
                float F = yfd.F(j3);
                float fE2 = yfd.E(j3);
                float F2 = yfd.F(j3);
                listW = W(mpk.c(fE, F, bqi.b(fE, fE2, 0.33333334f), bqi.b(F, F2, 0.33333334f), bqi.b(fE, fE2, 0.6666667f), bqi.b(F, F2, 0.6666667f), fE2, F2));
            } else {
                float fMin2 = Math.min(fMin, f17);
                float fA = tveVar.a(f14);
                float fA2 = tveVar.a(f15);
                float f18 = (f16 * fMin2) / f17;
                float f19 = bqi.b;
                int i22 = i13;
                float fSqrt2 = (float) Math.sqrt((fMin2 * fMin2) + (f18 * f18));
                arrayList = arrayList5;
                long jW = yfd.w(2.0f, yfd.O(j2, j));
                float fB = yfd.B(jW);
                if (fB <= f13) {
                    sz6.p("Can't get the direction of a 0-length vector");
                    return r182;
                }
                tveVar.i = yfd.O(j3, yfd.i0(fSqrt2, yfd.w(fB, jW)));
                long jO = yfd.O(j3, yfd.i0(fMin2, j2));
                long jO2 = yfd.O(j3, yfd.i0(fMin2, j));
                zc5 zc5VarB = tve.b(fMin2, fA, tveVar.b, tveVar.a, jO, jO2, tveVar.i, f18);
                zc5 zc5VarB2 = tve.b(fMin2, fA2, tveVar.b, tveVar.c, jO2, jO, tveVar.i, f18);
                float fA3 = zc5VarB2.a();
                float fB2 = zc5VarB2.b();
                float[] fArr2 = zc5VarB2.a;
                zc5 zc5VarC2 = mpk.c(fA3, fB2, fArr2[4], fArr2[5], fArr2[i19], fArr2[3], fArr2[i20], fArr2[i21]);
                float fE3 = yfd.E(tveVar.i);
                float F3 = yfd.F(tveVar.i);
                float fA4 = zc5VarB.a();
                float fB3 = zc5VarB.b();
                float[] fArr3 = zc5VarC2.a;
                float f20 = fArr3[i20];
                float f21 = fArr3[i21];
                long jA = bqi.a(fA4 - fE3, fB3 - F3);
                float f22 = f20 - fE3;
                float f23 = f21 - F3;
                arrayList2 = arrayList4;
                i = i22;
                long jA2 = bqi.a(f22, f23);
                long jA3 = so7.a(-yfd.F(jA), yfd.E(jA));
                long jA4 = so7.a(-yfd.F(jA2), yfd.E(jA2));
                int i23 = (yfd.F(jA3) * f23) + (yfd.E(jA3) * f22) >= f13 ? i21 : i20;
                float fX = yfd.x(jA, jA2);
                if (fX > 0.999f) {
                    zc5VarC = mpk.c(fA4, fB3, bqi.b(fA4, f20, 0.33333334f), bqi.b(fB3, f21, 0.33333334f), bqi.b(fA4, f20, 0.6666667f), bqi.b(fB3, f21, 0.6666667f), f20, f21);
                } else {
                    float fSqrt3 = (((((float) Math.sqrt(2.0f * r6)) - ((float) Math.sqrt(f5 - (fX * fX)))) * ((((float) Math.sqrt((r13 * r13) + (r12 * r12))) * 4.0f) / 3.0f)) / (f5 - fX)) * (i23 != 0 ? f5 : -1.0f);
                    zc5VarC = mpk.c(fA4, fB3, (yfd.E(jA3) * fSqrt3) + fA4, (yfd.F(jA3) * fSqrt3) + fB3, f20 - (yfd.E(jA4) * fSqrt3), f21 - (yfd.F(jA4) * fSqrt3), f20, f21);
                }
                listW = X(zc5VarB, zc5VarC, zc5VarC2);
            }
            arrayList6.add(listW);
            f3 = f13;
            arrayList3 = arrayList6;
            arrayList5 = arrayList;
            arrayList4 = arrayList2;
            i4 = i20;
            r6 = r182;
            i3 = i21;
            i2 = i19;
        }
        ArrayList arrayList7 = arrayList3;
        int i24 = i2;
        ?? r183 = r6;
        int i25 = i3;
        int i26 = i4;
        float f24 = f3;
        ArrayList arrayList8 = new ArrayList();
        int i27 = i26;
        while (i27 < length) {
            int i28 = i27 + 1;
            int i29 = i28 % length;
            int i30 = i27 * 2;
            long jA5 = so7.a(fArr[i30], fArr[i30 + 1]);
            int i31 = (((i27 + length) - 1) % length) * 2;
            long jA6 = so7.a(fArr[i31], fArr[i31 + 1]);
            int i32 = i29 * 2;
            long jA7 = so7.a(fArr[i32], fArr[i32 + 1]);
            float f25 = bqi.b;
            long jL = yfd.L(jA5, jA6);
            long jL2 = yfd.L(jA7, jA5);
            arrayList8.add(new gf7((List) arrayList7.get(i27), (yfd.F(jL2) * yfd.E(jL)) - (yfd.E(jL2) * yfd.F(jL)) > f24 ? i25 : i26));
            float fA5 = ((zc5) w44.U0((List) arrayList7.get(i27))).a();
            float fB4 = ((zc5) w44.U0((List) arrayList7.get(i27))).b();
            float f26 = ((zc5) w44.L0((List) arrayList7.get(i29))).a[i26];
            float f27 = ((zc5) w44.L0((List) arrayList7.get(i29))).a[i25];
            arrayList8.add(new hf7(W(mpk.c(fA5, fB4, bqi.b(fA5, f26, 0.33333334f), bqi.b(fB4, f27, 0.33333334f), bqi.b(fA5, f26, 0.6666667f), bqi.b(fB4, f27, 0.6666667f), f26, f27))));
            i27 = i28;
        }
        long jW2 = (f == Float.MIN_VALUE || f2 == Float.MIN_VALUE) ? w(fArr) : so7.a(f, f2);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jW2 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jW2 & 4294967295L));
        if (arrayList8.size() < i24) {
            sz6.p("Polygons must have at least 2 features");
            return r183;
        }
        d8a d8aVarE = E();
        Iterator it2 = arrayList8.iterator();
        while (it2.hasNext()) {
            for (zc5 zc5Var : ((kf7) it2.next()).a) {
                d8aVarE.add(Float.valueOf(zc5Var.a[i26]));
                d8aVarE.add(Float.valueOf(zc5Var.a[i25]));
            }
        }
        float[] fArrN1 = w44.n1(v(d8aVarE));
        if (Float.isNaN(fIntBitsToFloat)) {
            fIntBitsToFloat = Float.intBitsToFloat((int) (w(fArrN1) >> 32));
        }
        if (Float.isNaN(fIntBitsToFloat2)) {
            fIntBitsToFloat2 = Float.intBitsToFloat((int) (w(fArrN1) & 4294967295L));
        }
        return new ewe(arrayList8, so7.a(fIntBitsToFloat, fIntBitsToFloat2));
    }

    public static final boolean i0(ewb ewbVar, Object obj, Object obj2) {
        Object objG = ewbVar.g(obj);
        if (objG == null) {
            return false;
        }
        if (!(objG instanceof fwb)) {
            if (!objG.equals(obj2)) {
                return false;
            }
            ewbVar.k(obj);
            return true;
        }
        fwb fwbVar = (fwb) objG;
        boolean zM = fwbVar.m(obj2);
        if (zM && fwbVar.h()) {
            ewbVar.k(obj);
        }
        return zM;
    }

    public static final irg j(bg9 bg9Var, String str) {
        bg9Var.getClass();
        str.getClass();
        return new irg(str, bg9Var.a);
    }

    public static final void j0(ewb ewbVar, Object obj) {
        boolean zH;
        long[] jArr = ewbVar.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        Object obj2 = ewbVar.b[i4];
                        Object obj3 = ewbVar.c[i4];
                        if (obj3 instanceof fwb) {
                            fwb fwbVar = (fwb) obj3;
                            fwbVar.m(obj);
                            zH = fwbVar.h();
                        } else {
                            zH = obj3 == obj;
                        }
                        if (zH) {
                            ewbVar.l(i4);
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    public static final LinkedHashMap k(ib0... ib0VarArr) {
        int iD0 = tta.d0(ib0VarArr.length);
        if (iD0 < 16) {
            iD0 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iD0);
        for (ib0 ib0Var : ib0VarArr) {
            linkedHashMap.put(ib0Var.a.c, ib0Var);
        }
        return linkedHashMap;
    }

    public static void k0(RuntimeException runtimeException, String str) {
        StackTraceElement[] stackTrace = runtimeException.getStackTrace();
        int length = stackTrace.length;
        int i = -1;
        for (int i2 = 0; i2 < length; i2++) {
            if (str.equals(stackTrace[i2].getClassName())) {
                i = i2;
            }
        }
        runtimeException.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i + 1, length));
    }

    public static final dc l(bga bgaVar) {
        bgaVar.getClass();
        String strD = jce.a.b(bgaVar.getClass()).d();
        if (strD == null) {
            strD = "unknown";
        }
        return new dc(strD + "@" + bgaVar.hashCode(), kxk.C(bgaVar), bgaVar.getActiveSurface());
    }

    public static final pqe l0(pqe pqeVar) {
        pqeVar.getClass();
        nqe nqeVarC = pqeVar.c();
        rqe rqeVar = pqeVar.K;
        nqeVarC.g = new ofi(rqeVar.e(), rqeVar.d());
        return nqeVarC.a();
    }

    public static final void m(ewb ewbVar, Object obj, Object obj2) {
        int iF = ewbVar.f(obj);
        boolean z = iF < 0;
        Object obj3 = z ? null : ewbVar.c[iF];
        if (obj3 != null) {
            if (obj3 instanceof fwb) {
                ((fwb) obj3).a(obj2);
            } else if (obj3 != obj2) {
                fwb fwbVar = new fwb();
                fwbVar.a(obj3);
                fwbVar.a(obj2);
                obj2 = fwbVar;
            }
            obj2 = obj3;
        }
        if (!z) {
            ewbVar.c[iF] = obj2;
            return;
        }
        int i = ~iF;
        ewbVar.b[i] = obj;
        ewbVar.c[i] = obj2;
    }

    public static void m0() {
        throw new ArithmeticException("Count overflow has happened.");
    }

    public static final void n(l45 l45Var, zy7 zy7Var, v4g v4gVar) {
        v4gVar.getClass();
        l45Var.getClass();
        zy7Var.getClass();
        gb9.D(l45Var, null, null, new my0(v4gVar, null, 14), 3).D0(new xu1(v4gVar, zy7Var, 3));
    }

    public static void n0() {
        throw new ArithmeticException("Index overflow has happened.");
    }

    public static boolean o(float f, Float f2) {
        return f2 != null && f == f2.floatValue();
    }

    public static void o0(String str) {
        UninitializedPropertyAccessException uninitializedPropertyAccessException = new UninitializedPropertyAccessException(ij0.j("lateinit property ", str, " has not been initialized"));
        k0(uninitializedPropertyAccessException, x44.class.getName());
        throw uninitializedPropertyAccessException;
    }

    public static boolean p(Float f, float f2) {
        return f != null && f.floatValue() == f2;
    }

    public static final int p0(int i) {
        int i2 = 306783378 & i;
        int i3 = 613566756 & i;
        return (i & (-920350135)) | (i3 >> 1) | i2 | ((i2 << 1) & i3);
    }

    public static boolean q(Float f, Float f2) {
        return f == null ? f2 == null : f2 != null && f.floatValue() == f2.floatValue();
    }

    public static final void q0(rwe rweVar, ld4 ld4Var) {
        rweVar.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.a0(-415363796);
        if (((Boolean) e18Var.j(p59.a)).booleanValue()) {
            e18Var.p(false);
            return;
        }
        m7f m7fVarN = sq6.n(e18Var, -1168520582, e18Var, -1633490746);
        boolean zF = e18Var.f(null) | e18Var.f(m7fVarN);
        Object objN = e18Var.N();
        lz1 lz1Var = jd4.a;
        if (zF || objN == lz1Var) {
            objN = m7fVarN.a(jce.a.b(ec.class), null, null);
            e18Var.k0(objN);
        }
        e18Var.p(false);
        e18Var.p(false);
        ec ecVar = (ec) objN;
        m7f m7fVarN2 = sq6.n(e18Var, -1168520582, e18Var, -1633490746);
        boolean zF2 = e18Var.f(null) | e18Var.f(m7fVarN2);
        Object objN2 = e18Var.N();
        if (zF2 || objN2 == lz1Var) {
            objN2 = m7fVarN2.a(jce.a.b(tmf.class), null, null);
            e18Var.k0(objN2);
        }
        e18Var.p(false);
        e18Var.p(false);
        tmf tmfVar = (tmf) objN2;
        e18Var.a0(1234124792);
        Object objN3 = e18Var.N();
        if (objN3 == lz1Var) {
            objN3 = new Object();
            e18Var.k0(objN3);
        }
        Object obj = objN3;
        boolean zH = e18Var.h(ecVar) | e18Var.h(obj);
        Object objN4 = e18Var.N();
        if (zH || objN4 == lz1Var) {
            objN4 = new b4b(ecVar, 9, obj);
            e18Var.k0(objN4);
        }
        fd9.e(obj, ecVar, (bz7) objN4, e18Var);
        Object[] objArr = {rweVar, obj, tmfVar, ecVar};
        boolean zH2 = e18Var.h(rweVar) | e18Var.h(ecVar) | e18Var.h(obj) | e18Var.h(tmfVar);
        Object objN5 = e18Var.N();
        if (zH2 || objN5 == lz1Var) {
            lza lzaVar = new lza(rweVar, ecVar, obj, tmfVar, (tp4) null, 3);
            e18Var.k0(lzaVar);
            objN5 = lzaVar;
        }
        fd9.l(objArr, (pz7) objN5, e18Var);
        e18Var.p(false);
        e18Var.p(false);
    }

    public static boolean r(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    public static ArrayList s(Object... objArr) {
        return objArr.length == 0 ? new ArrayList() : new ArrayList(new lo0(objArr, true));
    }

    public static final boolean t(mmg mmgVar, int i, gzc gzcVar) {
        boolean z;
        synchronized (c) {
            int i2 = mmgVar.d;
            if (i2 == i) {
                mmgVar.c = gzcVar;
                z = true;
                mmgVar.d = i2 + 1;
            } else {
                z = false;
            }
        }
        return z;
    }

    public static int u(ArrayList arrayList, Comparable comparable) {
        int size = arrayList.size();
        arrayList.getClass();
        d0(arrayList.size(), size);
        int i = size - 1;
        int i2 = 0;
        while (i2 <= i) {
            int i3 = (i2 + i) >>> 1;
            int iR = nai.r((Comparable) arrayList.get(i3), comparable);
            if (iR < 0) {
                i2 = i3 + 1;
            } else {
                if (iR <= 0) {
                    return i3;
                }
                i = i3 - 1;
            }
        }
        return -(i2 + 1);
    }

    public static d8a v(d8a d8aVar) {
        d8aVar.h();
        d8aVar.G = true;
        return d8aVar.F > 0 ? d8aVar : d8a.H;
    }

    public static final long w(float[] fArr) {
        float f = MTTypesetterKt.kLineSkipLimitMultiplier;
        int i = 0;
        float f2 = 0.0f;
        while (i < fArr.length) {
            int i2 = i + 1;
            f += fArr[i];
            i += 2;
            f2 += fArr[i2];
        }
        return so7.a(f / (fArr.length / 2), f2 / (fArr.length / 2));
    }

    public static int x(Context context, String str) {
        if (str != null) {
            return (Build.VERSION.SDK_INT >= 33 || !TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) ? context.checkPermission(str, Process.myPid(), Process.myUid()) : n8c.b(context).a() ? 0 : -1;
        }
        mr9.h("permission must be non-null");
        return 0;
    }

    public static int y(Iterable iterable, int i) {
        iterable.getClass();
        return iterable instanceof Collection ? ((Collection) iterable).size() : i;
    }

    public static int z(int i, int i2) {
        if (i < i2) {
            return -1;
        }
        return i == i2 ? 0 : 1;
    }
}
