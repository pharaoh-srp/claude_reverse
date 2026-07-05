package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Configuration;
import android.graphics.Point;
import android.graphics.Rect;
import android.inputmethodservice.InputMethodService;
import android.os.Build;
import android.util.Log;
import android.view.Display;
import android.view.WindowManager;
import com.anthropic.claude.R;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.StringTokenizer;
import java.util.TreeSet;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class pyk implements vv1, hf5, ia4, v0i, w9c, fib, wh3, vdj, cec, sac {
    public static pyk F;
    public static ch4 S;
    public final /* synthetic */ int E;
    public static final String[] G = new String[0];
    public static final pyk H = new pyk(2);
    public static final wg6 I = new wg6(23);
    public static final pyk J = new pyk(6);
    public static final pyk K = new pyk(7);
    public static final pyk L = new pyk(8);
    public static final pyk M = new pyk(9);
    public static final pyk N = new pyk(10);
    public static final pyk O = new pyk(11);
    public static final pyk P = new pyk(12);
    public static final pyk Q = new pyk(13);
    public static final pyk R = new pyk(14);
    public static final pyk T = new pyk(15);
    public static final pyk U = new pyk(16);
    public static final pyk V = new pyk(17);
    public static final pyk W = new pyk(19);
    public static final pyk X = new pyk(20);
    public static final /* synthetic */ pyk Y = new pyk(21);

    public /* synthetic */ pyk(int i) {
        this.E = i;
    }

    public static qo1 A0(String str) {
        Object next;
        str.getClass();
        Iterator<E> it = qo1.M.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((qo1) next).E.equals(str)) {
                break;
            }
        }
        return (qo1) next;
    }

    /* JADX WARN: Code restructure failed: missing block: B:124:?, code lost:
    
        return r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:?, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:?, code lost:
    
        return r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0036, code lost:
    
        if (r7 <= r4) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0038, code lost:
    
        if (r5 > r2) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x003c, code lost:
    
        if (r0[r5] == '*') goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x003f, code lost:
    
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0042, code lost:
    
        r9 = r0[r2];
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0044, code lost:
    
        if (r9 == '*') goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0046, code lost:
    
        if (r7 > r4) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0048, code lost:
    
        if (r9 == '?') goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x004c, code lost:
    
        if (r9 == r1[r4]) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x004f, code lost:
    
        r2 = r2 - 1;
        r4 = r4 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0054, code lost:
    
        if (r7 <= r4) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0056, code lost:
    
        if (r5 > r2) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x005a, code lost:
    
        if (r0[r5] == '*') goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x005d, code lost:
    
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0060, code lost:
    
        if (r5 == r2) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0062, code lost:
    
        if (r7 > r4) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0064, code lost:
    
        r9 = r5 + 1;
        r11 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0068, code lost:
    
        if (r11 > r2) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x006c, code lost:
    
        if (r0[r11] != '*') goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x006f, code lost:
    
        r11 = r11 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0072, code lost:
    
        r11 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0073, code lost:
    
        if (r11 != r9) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0075, code lost:
    
        r5 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0077, code lost:
    
        r9 = (r11 - r5) - r3;
        r13 = (r4 - r7) + r3;
        r14 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0080, code lost:
    
        if (r14 > (r13 - r9)) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0082, code lost:
    
        r15 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0083, code lost:
    
        if (r15 >= r9) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0085, code lost:
    
        r17 = r3;
        r3 = r0[(r5 + r15) + 1];
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x008d, code lost:
    
        if (r3 == '?') goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0097, code lost:
    
        if (r3 == r1[(r7 + r14) + r15]) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0099, code lost:
    
        r14 = r14 + 1;
        r3 = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00a0, code lost:
    
        r15 = r15 + 1;
        r3 = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00a5, code lost:
    
        r17 = r3;
        r18 = false;
        r7 = r7 + r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00ab, code lost:
    
        r17 = r3;
        r18 = false;
        r7 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00b0, code lost:
    
        if (r7 != (-1)) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00b3, code lost:
    
        r7 = r7 + r9;
        r3 = r17;
        r5 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00b8, code lost:
    
        r17 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00bc, code lost:
    
        if (r5 > r2) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00c0, code lost:
    
        if (r0[r5] == '*') goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00c3, code lost:
    
        r5 = r5 + 1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean C0(java.lang.String r17, java.lang.String r18) {
        /*
            Method dump skipped, instruction units count: 230
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pyk.C0(java.lang.String, java.lang.String):boolean");
    }

    public static exh E0(Object obj) {
        return new exh(obj, true);
    }

    public static String[] F0(String str) {
        String[] strArr = G;
        if (str != null) {
            StringTokenizer stringTokenizer = new StringTokenizer(str, "/");
            ArrayList arrayList = new ArrayList();
            while (stringTokenizer.hasMoreTokens()) {
                String strNextToken = stringTokenizer.nextToken();
                if (strNextToken.length() > 0) {
                    arrayList.add(strNextToken);
                }
            }
            if (!arrayList.isEmpty()) {
                return (String[]) arrayList.toArray(strArr);
            }
        }
        return strArr;
    }

    public static synchronized void G0() {
        if (F == null) {
            F = new pyk(0);
        }
    }

    public static n95 v0(Context context) {
        return new n95(context, 0);
    }

    public static lp0 w0(List list, tqb tqbVar, vfd vfdVar) {
        List listP1 = w44.p1(list);
        ArrayList arrayList = new ArrayList();
        Iterator it = listP1.iterator();
        while (it.hasNext()) {
            il4 il4VarY0 = y0(null, it.next());
            if (il4VarY0 != null) {
                arrayList.add(il4VarY0);
            }
        }
        return tqbVar != null ? new hbi(arrayList, tqbVar.f().p(vfdVar)) : new lp0(new h4(11, vfdVar), arrayList);
    }

    public static hbi x0(yr9 yr9Var, ArrayList arrayList) {
        return new hbi(arrayList, yr9Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [lm6] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v12, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v13, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v14, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v15, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v16, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v17, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v18, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v19, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v20, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v21, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.util.ArrayList] */
    public static il4 y0(uqb uqbVar, Object obj) {
        if (obj instanceof Byte) {
            return new m22(((Number) obj).byteValue());
        }
        if (obj instanceof Short) {
            return new i5g(((Number) obj).shortValue());
        }
        if (obj instanceof Integer) {
            return new i79(((Number) obj).intValue());
        }
        if (obj instanceof Long) {
            return new ama(((Number) obj).longValue());
        }
        if (obj instanceof Character) {
            return new ti2((Character) obj);
        }
        if (obj instanceof Float) {
            return new au1(((Number) obj).floatValue());
        }
        if (obj instanceof Double) {
            return new au1(((Number) obj).doubleValue());
        }
        if (obj instanceof Boolean) {
            return new au1((Boolean) obj);
        }
        if (obj instanceof String) {
            return new yrg(obj);
        }
        boolean z = obj instanceof byte[];
        ?? W2 = lm6.E;
        int i = 0;
        if (z) {
            byte[] bArr = (byte[]) obj;
            int length = bArr.length;
            if (length != 0) {
                if (length != 1) {
                    W2 = new ArrayList(bArr.length);
                    int length2 = bArr.length;
                    while (i < length2) {
                        W2.add(Byte.valueOf(bArr[i]));
                        i++;
                    }
                } else {
                    W2 = x44.W(Byte.valueOf(bArr[0]));
                }
            }
            return w0(W2, uqbVar, vfd.BYTE);
        }
        if (obj instanceof short[]) {
            short[] sArr = (short[]) obj;
            int length3 = sArr.length;
            if (length3 != 0) {
                if (length3 != 1) {
                    W2 = new ArrayList(sArr.length);
                    int length4 = sArr.length;
                    while (i < length4) {
                        W2.add(Short.valueOf(sArr[i]));
                        i++;
                    }
                } else {
                    W2 = x44.W(Short.valueOf(sArr[0]));
                }
            }
            return w0(W2, uqbVar, vfd.SHORT);
        }
        if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            int length5 = iArr.length;
            if (length5 != 0) {
                if (length5 != 1) {
                    W2 = new ArrayList(iArr.length);
                    int length6 = iArr.length;
                    while (i < length6) {
                        W2.add(Integer.valueOf(iArr[i]));
                        i++;
                    }
                } else {
                    W2 = x44.W(Integer.valueOf(iArr[0]));
                }
            }
            return w0(W2, uqbVar, vfd.INT);
        }
        if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            int length7 = jArr.length;
            if (length7 != 0) {
                if (length7 != 1) {
                    W2 = new ArrayList(jArr.length);
                    int length8 = jArr.length;
                    while (i < length8) {
                        W2.add(Long.valueOf(jArr[i]));
                        i++;
                    }
                } else {
                    W2 = x44.W(Long.valueOf(jArr[0]));
                }
            }
            return w0(W2, uqbVar, vfd.LONG);
        }
        if (obj instanceof char[]) {
            char[] cArr = (char[]) obj;
            int length9 = cArr.length;
            if (length9 != 0) {
                if (length9 != 1) {
                    W2 = new ArrayList(cArr.length);
                    int length10 = cArr.length;
                    while (i < length10) {
                        W2.add(Character.valueOf(cArr[i]));
                        i++;
                    }
                } else {
                    W2 = x44.W(Character.valueOf(cArr[0]));
                }
            }
            return w0(W2, uqbVar, vfd.CHAR);
        }
        if (obj instanceof float[]) {
            return w0(mp0.X0((float[]) obj), uqbVar, vfd.FLOAT);
        }
        if (obj instanceof double[]) {
            double[] dArr = (double[]) obj;
            int length11 = dArr.length;
            if (length11 != 0) {
                if (length11 != 1) {
                    W2 = new ArrayList(dArr.length);
                    int length12 = dArr.length;
                    while (i < length12) {
                        W2.add(Double.valueOf(dArr[i]));
                        i++;
                    }
                } else {
                    W2 = x44.W(Double.valueOf(dArr[0]));
                }
            }
            return w0(W2, uqbVar, vfd.DOUBLE);
        }
        if (!(obj instanceof boolean[])) {
            if (obj == null) {
                return new m9c(null);
            }
            return null;
        }
        boolean[] zArr = (boolean[]) obj;
        int length13 = zArr.length;
        if (length13 != 0) {
            if (length13 != 1) {
                W2 = new ArrayList(zArr.length);
                int length14 = zArr.length;
                while (i < length14) {
                    W2.add(Boolean.valueOf(zArr[i]));
                    i++;
                }
            } else {
                W2 = x44.W(Boolean.valueOf(zArr[0]));
            }
        }
        return w0(W2, uqbVar, vfd.BOOLEAN);
    }

    public static exh z0(Object obj) {
        return new exh(obj, false);
    }

    @Override // defpackage.wh3
    public int A(lc2 lc2Var) {
        return okk.l(lc2Var);
    }

    @Override // defpackage.wh3
    public j7g B(fw5 fw5Var) {
        return fw5Var.F;
    }

    public cs9 B0(cs9 cs9Var) {
        j7g j7gVarC0;
        cs9Var.getClass();
        j7g j7gVarI = okk.i(cs9Var);
        return (j7gVarI == null || (j7gVarC0 = okk.c0(j7gVarI, true)) == null) ? cs9Var : j7gVarC0;
    }

    @Override // defpackage.wh3
    public boolean C(cs9 cs9Var) {
        cs9Var.getClass();
        j7g j7gVarI = okk.i(cs9Var);
        return (j7gVarI != null ? okk.g(j7gVarI) : null) != null;
    }

    @Override // defpackage.wh3
    public void D(l7g l7gVar) {
        okk.N(l7gVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object D0(defpackage.ql3 r7, java.lang.String r8, java.lang.String r9, defpackage.vp4 r10) {
        /*
            r6 = this;
            boolean r0 = r10 instanceof defpackage.jpf
            if (r0 == 0) goto L13
            r0 = r10
            jpf r0 = (defpackage.jpf) r0
            int r1 = r0.I
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.I = r1
            goto L18
        L13:
            jpf r0 = new jpf
            r0.<init>(r6, r10)
        L18:
            java.lang.Object r10 = r0.G
            int r1 = r0.I
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L30
            if (r1 != r2) goto L2a
            r7f r6 = r0.F
            ql3 r7 = r0.E
            defpackage.sf5.h0(r10)
            goto L65
        L2a:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r6)
            return r3
        L30:
            defpackage.sf5.h0(r10)
            r7f r10 = new r7f
            r10.<init>(r8, r9)
            r7.getClass()
            er9 r1 = r7.a
            java.lang.String r4 = r10.c
            m7f r1 = r1.b(r4)
            if (r1 == 0) goto L46
            goto L47
        L46:
            r1 = r3
        L47:
            if (r1 == 0) goto L4a
            return r1
        L4a:
            p7f r1 = new p7f
            r1.<init>(r8)
            m7f r8 = r7.c(r1)
            r0.E = r7
            r0.F = r10
            r0.I = r2
            java.lang.Object r6 = r6.p0(r8, r9, r0)
            m45 r8 = defpackage.m45.E
            if (r6 != r8) goto L62
            return r8
        L62:
            r5 = r10
            r10 = r6
            r6 = r5
        L65:
            koi r10 = (defpackage.koi) r10
            if (r10 != 0) goto L6a
            return r3
        L6a:
            m7f r6 = r7.b(r6, r10)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pyk.D0(ql3, java.lang.String, java.lang.String, vp4):java.lang.Object");
    }

    @Override // defpackage.wh3
    public vh3 E(l7g l7gVar) {
        return okk.W(this, l7gVar);
    }

    @Override // defpackage.wh3
    public j7g F(l7g l7gVar, boolean z) {
        return okk.c0(l7gVar, z);
    }

    @Override // defpackage.wh3
    public int G(vai vaiVar) {
        return okk.u(vaiVar);
    }

    @Override // defpackage.v0i
    public String H(Context context, boolean z, boolean z2) {
        int i = this.E;
        context.getClass();
        switch (i) {
            case 8:
                String string = context.getString(z2 ? R.string.health_connect_data_types_status_failed : z ? R.string.health_connect_data_types_status_success : R.string.health_connect_data_types_status_loading);
                string.getClass();
                return string;
            default:
                String string2 = context.getString(z2 ? R.string.suggested_connector_status_failed : z ? R.string.suggested_connector_status_complete : R.string.suggested_connector_status_loading);
                string2.getClass();
                return string2;
        }
    }

    @Override // defpackage.vdj
    public rdj I(Context context, dz5 dz5Var) {
        dz5Var.getClass();
        Context baseContext = context;
        while (true) {
            if (!(baseContext instanceof ContextWrapper)) {
                baseContext = context;
                break;
            }
            if ((baseContext instanceof Activity) || (baseContext instanceof InputMethodService)) {
                break;
            }
            ContextWrapper contextWrapper = (ContextWrapper) baseContext;
            if (contextWrapper.getBaseContext() == null) {
                break;
            }
            baseContext = contextWrapper.getBaseContext();
            baseContext.getClass();
        }
        if (baseContext instanceof Activity) {
            return c((Activity) baseContext, dz5Var);
        }
        if (!(baseContext instanceof InputMethodService) && !(baseContext instanceof Application)) {
            sz6.p("Must provide a UiContext or Application Context");
            return null;
        }
        Object systemService = context.getSystemService("window");
        systemService.getClass();
        Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
        defaultDisplay.getClass();
        Point point = new Point();
        defaultDisplay.getRealSize(point);
        return new rdj(new Rect(0, 0, point.x, point.y), dz5Var.p(context));
    }

    @Override // defpackage.wh3
    public boolean J(l7g l7gVar) {
        l7gVar.getClass();
        return okk.F(okk.Z(l7gVar));
    }

    @Override // defpackage.wh3
    public fhi K(cs9 cs9Var) {
        return okk.S(cs9Var);
    }

    @Override // defpackage.wh3
    public j7g L(l7g l7gVar) {
        return okk.k(l7gVar);
    }

    @Override // defpackage.wh3
    public fhi M(vai vaiVar) {
        return okk.s(vaiVar);
    }

    @Override // defpackage.wh3
    public int N(v9i v9iVar) {
        return okk.T(v9iVar);
    }

    @Override // defpackage.wh3
    public boolean O(qai qaiVar, v9i v9iVar) {
        return okk.w(qaiVar, v9iVar);
    }

    @Override // defpackage.wh3
    public j7g P(cs9 cs9Var) {
        j7g j7gVarA0;
        cs9Var.getClass();
        sn7 sn7VarH = okk.h(cs9Var);
        if (sn7VarH != null && (j7gVarA0 = okk.a0(sn7VarH)) != null) {
            return j7gVarA0;
        }
        j7g j7gVarI = okk.i(cs9Var);
        j7gVarI.getClass();
        return j7gVarI;
    }

    @Override // defpackage.wh3
    public u9i Q(l7g l7gVar) {
        return okk.Z(l7gVar);
    }

    @Override // defpackage.wh3
    public boolean R(l7g l7gVar) {
        l7gVar.getClass();
        j7g j7gVarI = okk.i(l7gVar);
        return (j7gVarI != null ? okk.f(this, j7gVarI) : null) != null;
    }

    @Override // defpackage.wh3
    public lc2 S(l7g l7gVar) {
        return okk.f(this, l7gVar);
    }

    @Override // defpackage.wh3
    public boolean T(l7g l7gVar) {
        l7gVar.getClass();
        return okk.I(f0(l7gVar)) && !okk.J(l7gVar);
    }

    @Override // defpackage.wh3
    public fhi U(ArrayList arrayList) {
        j7g j7gVar;
        int size = arrayList.size();
        if (size == 0) {
            sz6.j("Expected some types");
            return null;
        }
        if (size == 1) {
            return (fhi) w44.e1(arrayList);
        }
        ArrayList arrayList2 = new ArrayList(x44.y(arrayList, 10));
        Iterator it = arrayList.iterator();
        boolean z = false;
        boolean z2 = false;
        while (it.hasNext()) {
            fhi fhiVar = (fhi) it.next();
            z = z || ttj.j(fhiVar);
            if (fhiVar instanceof j7g) {
                j7gVar = (j7g) fhiVar;
            } else {
                if (!(fhiVar instanceof sn7)) {
                    wg6.i();
                    return null;
                }
                j7gVar = ((sn7) fhiVar).F;
                z2 = true;
            }
            arrayList2.add(j7gVar);
        }
        if (z) {
            return nu6.c(mu6.INTERSECTION_OF_ERROR_TYPES, arrayList.toString());
        }
        mai maiVar = mai.a;
        if (!z2) {
            return maiVar.b(arrayList2);
        }
        ArrayList arrayList3 = new ArrayList(x44.y(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList3.add(yb5.S((fhi) it2.next()));
        }
        return yfd.z(maiVar.b(arrayList2), maiVar.b(arrayList3));
    }

    @Override // defpackage.wh3
    public wai V(cs9 cs9Var) {
        return okk.j(cs9Var);
    }

    @Override // defpackage.wh3
    public qai W(v9i v9iVar, int i) {
        return okk.p(v9iVar, i);
    }

    @Override // defpackage.wh3
    public boolean X(v9i v9iVar, v9i v9iVar2) {
        return okk.c(v9iVar, v9iVar2);
    }

    @Override // defpackage.wh3
    public boolean Y(l7g l7gVar, l7g l7gVar2) {
        return okk.x(l7gVar, l7gVar2);
    }

    @Override // defpackage.w9c
    public String Z() {
        return "expected an Int value";
    }

    @Override // defpackage.wh3
    public int a(cs9 cs9Var) {
        return okk.d(cs9Var);
    }

    @Override // defpackage.wh3
    public boolean a0(cs9 cs9Var) {
        cs9Var.getClass();
        return cs9Var instanceof w6c;
    }

    @Override // defpackage.wh3
    public boolean b(lc2 lc2Var) {
        return lc2Var instanceof gc2;
    }

    @Override // defpackage.wh3
    public boolean b0(l7g l7gVar) {
        return okk.H(l7gVar);
    }

    @Override // defpackage.vdj
    public rdj c(Activity activity, dz5 dz5Var) {
        dz5Var.getClass();
        vv1.b.getClass();
        int i = Build.VERSION.SDK_INT;
        return new rdj(new pv1((i >= 30 ? wv1.E : i >= 29 ? H : i >= 28 ? lyk.H : tqh.G).m(activity)), dz5Var.p(activity));
    }

    @Override // defpackage.wh3
    public vai c0(l7g l7gVar, int i) {
        l7gVar.getClass();
        if (i < 0 || i >= okk.d(l7gVar)) {
            return null;
        }
        return okk.o(l7gVar, i);
    }

    @Override // defpackage.wh3
    public int d(q9i q9iVar) {
        q9iVar.getClass();
        if (q9iVar instanceof l7g) {
            return okk.d((cs9) q9iVar);
        }
        if (q9iVar instanceof co0) {
            return ((co0) q9iVar).size();
        }
        StringBuilder sb = new StringBuilder("unknown type argument list type: ");
        sb.append(q9iVar);
        wg6.k(sb, ", ", jce.a.b(q9iVar.getClass()));
        return 0;
    }

    @Override // defpackage.wh3
    public boolean d0(vai vaiVar) {
        return okk.M(vaiVar);
    }

    @Override // defpackage.hf5
    public Iterable e(Object obj) {
        switch (this.E) {
            case 6:
                int i = o06.a;
                Collection collectionI = ((eri) obj).i();
                ArrayList arrayList = new ArrayList(x44.y(collectionI, 10));
                Iterator it = ((ArrayList) collectionI).iterator();
                while (it.hasNext()) {
                    arrayList.add(((eri) it.next()).a());
                }
                return arrayList;
            default:
                int i2 = ny9.p;
                Collection collectionB = ((qqb) obj).p().b();
                collectionB.getClass();
                return new op0(1, bnf.c0(new c54(0, collectionB), f06.b0));
        }
    }

    @Override // defpackage.wh3
    public sn7 e0(cs9 cs9Var) {
        return okk.h(cs9Var);
    }

    @Override // defpackage.wh3
    public q9i f(l7g l7gVar) {
        return okk.e(l7gVar);
    }

    @Override // defpackage.wh3
    public u9i f0(cs9 cs9Var) {
        cs9Var.getClass();
        j7g j7gVarI = okk.i(cs9Var);
        if (j7gVarI == null) {
            j7gVarI = t(cs9Var);
        }
        return okk.Z(j7gVarI);
    }

    @Override // defpackage.wh3
    public void g(cs9 cs9Var) {
        cs9Var.getClass();
        okk.h(cs9Var);
    }

    @Override // defpackage.wh3
    public boolean g0(v9i v9iVar) {
        return okk.F(v9iVar);
    }

    @Override // defpackage.wh3
    public boolean h(v9i v9iVar) {
        return okk.G(v9iVar);
    }

    @Override // defpackage.wh3
    public boolean h0(v9i v9iVar) {
        return okk.y(v9iVar);
    }

    @Override // defpackage.wh3
    public void i(l7g l7gVar) {
        okk.O(l7gVar);
    }

    @Override // defpackage.wh3
    public boolean i0(lc2 lc2Var) {
        return okk.L(lc2Var);
    }

    @Override // defpackage.wh3
    public l2c j(lc2 lc2Var) {
        return okk.Y(lc2Var);
    }

    @Override // defpackage.wh3
    public boolean j0(v9i v9iVar) {
        return okk.I(v9iVar);
    }

    @Override // defpackage.wh3
    public int k(qai qaiVar) {
        qaiVar.getClass();
        int iZ = qaiVar.z();
        if (iZ != 0) {
            return gwk.n(iZ);
        }
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.wh3
    public vai k0(q9i q9iVar, int i) {
        q9iVar.getClass();
        if (q9iVar instanceof l7g) {
            return okk.o((cs9) q9iVar, i);
        }
        if (q9iVar instanceof co0) {
            E e = ((co0) q9iVar).get(i);
            e.getClass();
            return (vai) e;
        }
        StringBuilder sb = new StringBuilder("unknown type argument list type: ");
        sb.append(q9iVar);
        wg6.k(sb, ", ", jce.a.b(q9iVar.getClass()));
        return null;
    }

    @Override // defpackage.wh3
    public boolean l(l7g l7gVar) {
        l7gVar.getClass();
        return okk.A(okk.Z(l7gVar));
    }

    @Override // defpackage.wh3
    public boolean l0(v9i v9iVar) {
        return okk.B(v9iVar);
    }

    @Override // defpackage.vv1
    public Rect m(Activity activity) throws Exception {
        Configuration configuration = activity.getResources().getConfiguration();
        try {
            Field declaredField = Configuration.class.getDeclaredField("windowConfiguration");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(configuration);
            Object objInvoke = obj.getClass().getDeclaredMethod("getBounds", null).invoke(obj, null);
            objInvoke.getClass();
            return new Rect((Rect) objInvoke);
        } catch (Exception e) {
            if (!(e instanceof NoSuchFieldException) && !(e instanceof NoSuchMethodException) && !(e instanceof IllegalAccessException) && !(e instanceof InvocationTargetException)) {
                throw e;
            }
            vv1.b.getClass();
            Log.w(uv1.b, e);
            return lyk.H.m(activity);
        }
    }

    @Override // defpackage.wh3
    public l7g m0(l7g l7gVar) {
        j7g j7gVar;
        l7gVar.getClass();
        fw5 fw5VarG = okk.g(l7gVar);
        return (fw5VarG == null || (j7gVar = fw5VarG.F) == null) ? l7gVar : j7gVar;
    }

    @Override // defpackage.wh3
    public j7g n(cs9 cs9Var) {
        return okk.i(cs9Var);
    }

    @Override // defpackage.wh3
    public vai n0(cs9 cs9Var, int i) {
        return okk.o(cs9Var, i);
    }

    @Override // defpackage.wh3
    public vai o(ic2 ic2Var) {
        return okk.V(ic2Var);
    }

    @Override // defpackage.sac
    public Object o0() {
        return new TreeSet();
    }

    @Override // defpackage.cec
    public void onFailure(Exception exc) {
        Log.e("OptionalModuleUtils", "Failed to check feature availability", exc);
    }

    @Override // defpackage.wh3
    public boolean p(v9i v9iVar) {
        return okk.A(v9iVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object p0(defpackage.m7f r8, java.lang.String r9, defpackage.vp4 r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof defpackage.ipf
            if (r0 == 0) goto L13
            r0 = r10
            ipf r0 = (defpackage.ipf) r0
            int r1 = r0.J
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.J = r1
            goto L18
        L13:
            ipf r0 = new ipf
            r0.<init>(r7, r10)
        L18:
            java.lang.Object r7 = r0.H
            int r10 = r0.J
            r1 = 2
            r2 = 1
            r3 = 0
            m45 r4 = defpackage.m45.E
            if (r10 == 0) goto L40
            if (r10 == r2) goto L36
            if (r10 != r1) goto L30
            java.lang.String r8 = r0.F
            m7f r9 = r0.E
            defpackage.sf5.h0(r7)
            goto La5
        L30:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r7)
            return r3
        L36:
            tl0 r8 = r0.G
            java.lang.String r9 = r0.F
            m7f r10 = r0.E
            defpackage.sf5.h0(r7)
            goto L89
        L40:
            defpackage.sf5.h0(r7)
            kce r7 = defpackage.jce.a
            java.lang.Class<x4f> r10 = defpackage.x4f.class
            pl9 r10 = r7.b(r10)
            java.lang.Object r10 = r8.a(r10, r3, r3)
            x4f r10 = (defpackage.x4f) r10
            java.lang.Class<mn5> r5 = defpackage.mn5.class
            pl9 r5 = r7.b(r5)
            java.lang.Object r5 = r8.a(r5, r3, r3)
            mn5 r5 = (defpackage.mn5) r5
            java.lang.Boolean r10 = defpackage.k25.a(r10, r5)
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            boolean r10 = defpackage.x44.r(r10, r5)
            if (r10 != 0) goto L6a
            goto L93
        L6a:
            java.lang.Class<tl0> r10 = defpackage.tl0.class
            pl9 r7 = r7.b(r10)
            java.lang.Object r7 = r8.a(r7, r3, r3)
            tl0 r7 = (defpackage.tl0) r7
            r0.E = r8
            r0.F = r9
            r0.G = r7
            r0.J = r2
            java.lang.Object r10 = r7.c(r9, r0)
            if (r10 != r4) goto L85
            goto La2
        L85:
            r6 = r8
            r8 = r7
            r7 = r10
            r10 = r6
        L89:
            com.anthropic.claude.api.result.ApiResult r7 = (com.anthropic.claude.api.result.ApiResult) r7
            java.lang.Object r7 = defpackage.hsk.g(r7)
            com.anthropic.claude.api.account.AppStartResponse r7 = (com.anthropic.claude.api.account.AppStartResponse) r7
            if (r7 != 0) goto L94
        L93:
            return r3
        L94:
            r0.E = r10
            r0.F = r9
            r0.G = r3
            r0.J = r1
            java.lang.Object r7 = r8.f(r9, r7, r0)
            if (r7 != r4) goto La3
        La2:
            return r4
        La3:
            r8 = r9
            r9 = r10
        La5:
            java.lang.Class<moi> r7 = defpackage.moi.class
            kce r10 = defpackage.jce.a
            pl9 r7 = r10.b(r7)
            java.lang.Object r7 = r9.a(r7, r3, r3)
            moi r7 = (defpackage.moi) r7
            koi r7 = r7.a(r8)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pyk.p0(m7f, java.lang.String, vp4):java.lang.Object");
    }

    @Override // defpackage.wh3
    public boolean q(fhi fhiVar) {
        fhiVar.getClass();
        return okk.H(t(fhiVar)) != okk.H(P(fhiVar));
    }

    @Override // defpackage.wh3
    public void q0(l7g l7gVar, v9i v9iVar) {
    }

    @Override // defpackage.wh3
    public j7g r(sn7 sn7Var) {
        return okk.a0(sn7Var);
    }

    @Override // defpackage.wh3
    public fhi r0(l7g l7gVar, l7g l7gVar2) {
        return okk.m(this, l7gVar, l7gVar2);
    }

    @Override // defpackage.ia4
    public Object s(el5 el5Var) {
        Object objI = el5Var.i(new qzd(z4a.class, Executor.class));
        objI.getClass();
        return d4c.N((Executor) objI);
    }

    @Override // defpackage.wh3
    public cs9 s0(cs9 cs9Var) {
        return okk.b0(this, cs9Var);
    }

    @Override // defpackage.wh3
    public j7g t(cs9 cs9Var) {
        j7g j7gVarQ;
        cs9Var.getClass();
        sn7 sn7VarH = okk.h(cs9Var);
        if (sn7VarH != null && (j7gVarQ = okk.Q(sn7VarH)) != null) {
            return j7gVarQ;
        }
        j7g j7gVarI = okk.i(cs9Var);
        j7gVarI.getClass();
        return j7gVarI;
    }

    public void t0(dn6 dn6Var) {
        dn6Var.e(qnk.class, a8k.a);
        dn6Var.e(zuk.class, xfk.a);
        dn6Var.e(unk.class, d8k.a);
        dn6Var.e(gok.class, k8k.a);
        dn6Var.e(xnk.class, g8k.a);
        dn6Var.e(cok.class, o8k.a);
        dn6Var.e(kkk.class, g5k.a);
        dn6Var.e(ikk.class, c5k.a);
        dn6Var.e(slk.class, r6k.a);
        dn6Var.e(auk.class, cek.a);
        dn6Var.e(dkk.class, z4k.a);
        dn6Var.e(akk.class, w4k.a);
        dn6Var.e(qpk.class, y9k.a);
        dn6Var.e(wwk.class, a6k.a);
        dn6Var.e(flk.class, l6k.a);
        dn6Var.e(blk.class, w5k.a);
        dn6Var.e(tpk.class, cak.a);
        dn6Var.e(stk.class, sdk.a);
        dn6Var.e(wtk.class, vdk.a);
        dn6Var.e(rtk.class, odk.a);
        dn6Var.e(zok.class, i9k.a);
        dn6Var.e(vwk.class, l2k.a);
        dn6Var.e(dpk.class, l9k.a);
        dn6Var.e(xpk.class, fak.a);
        dn6Var.e(dqk.class, sak.a);
        dn6Var.e(aqk.class, oak.a);
        dn6Var.e(ypk.class, jak.a);
        dn6Var.e(yrk.class, qbk.a);
        dn6Var.e(ask.class, tbk.a);
        dn6Var.e(fsk.class, bck.a);
        dn6Var.e(csk.class, xbk.a);
        dn6Var.e(vok.class, f9k.a);
        dn6Var.e(hsk.class, dck.a);
        dn6Var.e(msk.class, ick.a);
        dn6Var.e(psk.class, kck.a);
        dn6Var.e(ssk.class, nck.a);
        dn6Var.e(ntk.class, hdk.a);
        dn6Var.e(ltk.class, ldk.a);
        dn6Var.e(vrk.class, wak.a);
        dn6Var.e(mmk.class, u7k.a);
        dn6Var.e(hrk.class, kbk.a);
        dn6Var.e(nqk.class, gbk.a);
        dn6Var.e(rrk.class, nbk.a);
        dn6Var.e(ytk.class, ydk.a);
        dn6Var.e(kvk.class, ngk.a);
        dn6Var.e(kik.class, d3k.a);
        dn6Var.e(bik.class, v2k.a);
        dn6Var.e(zhk.class, r2k.a);
        dn6Var.e(gik.class, z2k.a);
        dn6Var.e(qik.class, u3k.a);
        dn6Var.e(nik.class, r3k.a);
        dn6Var.e(uik.class, w3k.a);
        dn6Var.e(xik.class, a4k.a);
        dn6Var.e(ajk.class, d4k.a);
        dn6Var.e(djk.class, f4k.a);
        dn6Var.e(gjk.class, h4k.a);
        dn6Var.e(uwj.class, t1k.a);
        dn6Var.e(dxj.class, b2k.a);
        dn6Var.e(ywj.class, x1k.a);
        dn6Var.e(amk.class, n7k.a);
        dn6Var.e(okk.class, h5k.a);
        dn6Var.e(etj.class, jxj.a);
        dn6Var.e(zsj.class, nxj.a);
        dn6Var.e(skk.class, m5k.a);
        dn6Var.e(otj.class, sxj.a);
        dn6Var.e(itj.class, wxj.a);
        dn6Var.e(dvj.class, ozj.a);
        dn6Var.e(yuj.class, rzj.a);
        dn6Var.e(auj.class, byj.a);
        dn6Var.e(ttj.class, eyj.a);
        dn6Var.e(lvj.class, wzj.a);
        dn6Var.e(hvj.class, zzj.a);
        dn6Var.e(qvj.class, d0k.a);
        dn6Var.e(ovj.class, g0k.a);
        dn6Var.e(rwj.class, k1k.a);
        dn6Var.e(owj.class, p1k.a);
        dn6Var.e(xvj.class, k0k.a);
        dn6Var.e(tvj.class, q0k.a);
        dn6Var.e(gwj.class, t0k.a);
        dn6Var.e(bwj.class, v0k.a);
        dn6Var.e(gwk.class, sek.a);
        dn6Var.e(mvk.class, j5k.a);
        dn6Var.e(vkc.class, d9k.a);
        dn6Var.e(uvk.class, y8k.a);
        dn6Var.e(ovk.class, f6k.a);
        dn6Var.e(dwk.class, nek.a);
        dn6Var.e(bwk.class, hek.a);
        dn6Var.e(jwk.class, wek.a);
        dn6Var.e(rvk.class, t6k.a);
        dn6Var.e(rwk.class, tgk.a);
        dn6Var.e(qwk.class, xgk.a);
        dn6Var.e(nwk.class, pgk.a);
        dn6Var.e(fuk.class, jfk.a);
        dn6Var.e(vlk.class, y6k.a);
        dn6Var.e(pmk.class, w7k.a);
        dn6Var.e(uhk.class, n2k.a);
        dn6Var.e(jlk.class, o6k.a);
        dn6Var.e(dmk.class, r7k.a);
        dn6Var.e(ykk.class, r5k.a);
        dn6Var.e(qok.class, v8k.a);
        dn6Var.e(mok.class, t8k.a);
        dn6Var.e(vsj.class, gxj.a);
        dn6Var.e(cvk.class, dgk.a);
        dn6Var.e(hvk.class, kgk.a);
        dn6Var.e(gvk.class, fgk.a);
        dn6Var.e(ghk.class, h2k.a);
        dn6Var.e(xjk.class, s4k.a);
        dn6Var.e(wjk.class, p4k.a);
        dn6Var.e(ijk.class, k4k.a);
        dn6Var.e(gpk.class, p9k.a);
        dn6Var.e(opk.class, v9k.a);
        dn6Var.e(kpk.class, r9k.a);
        dn6Var.e(uuj.class, ezj.a);
        dn6Var.e(quj.class, jzj.a);
        dn6Var.e(wsk.class, qck.a);
        dn6Var.e(htk.class, edk.a);
        dn6Var.e(zsk.class, tck.a);
        dn6Var.e(dtk.class, adk.a);
        dn6Var.e(mwj.class, b1k.a);
        dn6Var.e(kwj.class, i1k.a);
        dn6Var.e(quk.class, tfk.a);
        dn6Var.e(nuk.class, ofk.a);
    }

    @Override // defpackage.wh3
    public fhi u(lc2 lc2Var) {
        return okk.R(lc2Var);
    }

    @Override // defpackage.wh3
    public fw5 u0(l7g l7gVar) {
        return okk.g(l7gVar);
    }

    @Override // defpackage.wh3
    public Collection v(v9i v9iVar) {
        return okk.X(v9iVar);
    }

    @Override // defpackage.wh3
    public boolean w(v9i v9iVar) {
        return okk.C(v9iVar);
    }

    @Override // defpackage.wh3
    public j7g x(sn7 sn7Var) {
        return okk.Q(sn7Var);
    }

    @Override // defpackage.wh3
    public Collection y(l7g l7gVar) {
        return okk.U(this, l7gVar);
    }

    @Override // defpackage.wh3
    public boolean z(l7g l7gVar) {
        return okk.D(l7gVar);
    }
}
