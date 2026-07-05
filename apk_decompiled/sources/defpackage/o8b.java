package defpackage;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.os.Handler;
import android.os.Looper;
import com.agog.mathdisplay.render.MTTypesetterKt;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class o8b {
    public boolean a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;
    public final Object i;
    public final Object j;
    public Object k;
    public Object l;

    public o8b() {
        this.b = new a1g[4];
        this.c = new Matrix[4];
        this.d = new Matrix[4];
        this.e = new PointF();
        this.f = new Path();
        this.g = new Path();
        this.h = new a1g();
        this.i = new float[2];
        this.j = new float[2];
        this.k = new Path();
        this.l = new Path();
        this.a = true;
        for (int i = 0; i < 4; i++) {
            ((a1g[]) this.b)[i] = new a1g();
            ((Matrix[]) this.c)[i] = new Matrix();
            ((Matrix[]) this.d)[i] = new Matrix();
        }
    }

    public mqh a(int i, ArrayList arrayList, m5g m5gVar) {
        ArrayList arrayList2 = (ArrayList) this.c;
        if (!arrayList.isEmpty()) {
            this.k = m5gVar;
            for (int i2 = i; i2 < arrayList.size() + i; i2++) {
                n8b n8bVar = (n8b) arrayList.get(i2 - i);
                if (i2 > 0) {
                    n8b n8bVar2 = (n8b) arrayList2.get(i2 - 1);
                    n8bVar.d = n8bVar2.a.o.b.o() + n8bVar2.d;
                    n8bVar.e = false;
                    n8bVar.c.clear();
                } else {
                    n8bVar.d = 0;
                    n8bVar.e = false;
                    n8bVar.c.clear();
                }
                int iO = n8bVar.a.o.b.o();
                for (int i3 = i2; i3 < arrayList2.size(); i3++) {
                    ((n8b) arrayList2.get(i3)).d += iO;
                }
                arrayList2.add(i2, n8bVar);
                ((HashMap) this.e).put(n8bVar.b, n8bVar);
                if (this.a) {
                    g(n8bVar);
                    if (((IdentityHashMap) this.d).isEmpty()) {
                        ((HashSet) this.h).add(n8bVar);
                    } else {
                        m8b m8bVar = (m8b) ((HashMap) this.f).get(n8bVar);
                        if (m8bVar != null) {
                            m8bVar.a.b(m8bVar.b);
                        }
                    }
                }
            }
        }
        return c();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void b(f0g f0gVar, float f, RectF rectF, ax5 ax5Var, Path path) {
        int i;
        char c;
        float f2;
        ax5 ax5Var2;
        char c2;
        ax5 ax5Var3 = ax5Var;
        Matrix[] matrixArr = (Matrix[]) this.d;
        float[] fArr = (float[]) this.i;
        a1g[] a1gVarArr = (a1g[]) this.b;
        Matrix[] matrixArr2 = (Matrix[]) this.c;
        path.rewind();
        Path path2 = (Path) this.f;
        path2.rewind();
        Path path3 = (Path) this.g;
        path3.rewind();
        path3.addRect(rectF, Path.Direction.CW);
        int i2 = 0;
        while (true) {
            c = 0;
            if (i2 >= 4) {
                break;
            }
            PointF pointF = (PointF) this.e;
            s35 s35Var = i2 != 1 ? i2 != 2 ? i2 != 3 ? f0gVar.f : f0gVar.e : f0gVar.h : f0gVar.g;
            rtk rtkVar = i2 != 1 ? i2 != 2 ? i2 != 3 ? f0gVar.b : f0gVar.a : f0gVar.d : f0gVar.c;
            a1g a1gVar = a1gVarArr[i2];
            rtkVar.getClass();
            Matrix[] matrixArr3 = matrixArr;
            rtkVar.f(a1gVar, f, s35Var.a(rectF));
            int i3 = i2 + 1;
            float f3 = (i3 % 4) * 90;
            matrixArr2[i2].reset();
            if (i2 == 1) {
                pointF.set(rectF.right, rectF.bottom);
            } else if (i2 == 2) {
                pointF.set(rectF.left, rectF.bottom);
            } else if (i2 != 3) {
                pointF.set(rectF.right, rectF.top);
            } else {
                pointF.set(rectF.left, rectF.top);
            }
            matrixArr2[i2].setTranslate(pointF.x, pointF.y);
            matrixArr2[i2].preRotate(f3);
            a1g a1gVar2 = a1gVarArr[i2];
            fArr[0] = a1gVar2.b;
            fArr[1] = a1gVar2.c;
            matrixArr2[i2].mapPoints(fArr);
            matrixArr3[i2].reset();
            matrixArr3[i2].setTranslate(fArr[0], fArr[1]);
            matrixArr3[i2].preRotate(f3);
            i2 = i3;
            matrixArr = matrixArr3;
        }
        Matrix[] matrixArr4 = matrixArr;
        int i4 = 0;
        for (i = 4; i4 < i; i = 4) {
            a1g a1gVar3 = a1gVarArr[i4];
            a1gVar3.getClass();
            fArr[c] = 0.0f;
            fArr[1] = a1gVar3.a;
            matrixArr2[i4].mapPoints(fArr);
            if (i4 == 0) {
                path.moveTo(fArr[c], fArr[1]);
            } else {
                path.lineTo(fArr[c], fArr[1]);
            }
            a1gVarArr[i4].b(matrixArr2[i4], path);
            if (ax5Var3 != null) {
                a1g a1gVar4 = a1gVarArr[i4];
                Matrix matrix = matrixArr2[i4];
                cwa cwaVar = (cwa) ax5Var3.F;
                BitSet bitSet = cwaVar.H;
                a1gVar4.getClass();
                f2 = 0.0f;
                bitSet.set(i4, (boolean) c);
                z0g[] z0gVarArr = cwaVar.F;
                a1gVar4.a(a1gVar4.e);
                z0gVarArr[i4] = new t0g(new ArrayList(a1gVar4.g), new Matrix(matrix));
            } else {
                f2 = 0.0f;
            }
            Path path4 = (Path) this.k;
            a1g a1gVar5 = (a1g) this.h;
            int i5 = i4 + 1;
            int i6 = i5 % 4;
            a1g a1gVar6 = a1gVarArr[i4];
            fArr[0] = a1gVar6.b;
            fArr[1] = a1gVar6.c;
            matrixArr2[i4].mapPoints(fArr);
            float[] fArr2 = (float[]) this.j;
            a1g a1gVar7 = a1gVarArr[i6];
            a1gVar7.getClass();
            fArr2[0] = f2;
            fArr2[1] = a1gVar7.a;
            matrixArr2[i6].mapPoints(fArr2);
            a1g[] a1gVarArr2 = a1gVarArr;
            Matrix[] matrixArr5 = matrixArr2;
            float fMax = Math.max(((float) Math.hypot(fArr[0] - fArr2[0], fArr[1] - fArr2[1])) - 0.001f, f2);
            a1g a1gVar8 = a1gVarArr2[i4];
            fArr[0] = a1gVar8.b;
            fArr[1] = a1gVar8.c;
            matrixArr5[i4].mapPoints(fArr);
            if (i4 == 1 || i4 == 3) {
                Math.abs(rectF.centerX() - fArr[0]);
            } else {
                Math.abs(rectF.centerY() - fArr[1]);
            }
            a1gVar5.d(MTTypesetterKt.kLineSkipLimitMultiplier, 270.0f, MTTypesetterKt.kLineSkipLimitMultiplier);
            (i4 != 1 ? i4 != 2 ? i4 != 3 ? f0gVar.j : f0gVar.i : f0gVar.l : f0gVar.k).getClass();
            a1gVar5.c(fMax, MTTypesetterKt.kLineSkipLimitMultiplier);
            path4.reset();
            a1gVar5.b(matrixArr4[i4], path4);
            if (this.a && (f(path4, i4) || f(path4, i6))) {
                path4.op(path4, path3, Path.Op.DIFFERENCE);
                fArr[0] = 0.0f;
                fArr[1] = a1gVar5.a;
                matrixArr4[i4].mapPoints(fArr);
                path2.moveTo(fArr[0], fArr[1]);
                a1gVar5.b(matrixArr4[i4], path2);
            } else {
                a1gVar5.b(matrixArr4[i4], path);
            }
            if (ax5Var != null) {
                Matrix matrix2 = matrixArr4[i4];
                ax5Var2 = ax5Var;
                cwa cwaVar2 = (cwa) ax5Var2.F;
                c2 = 0;
                cwaVar2.H.set(i4 + 4, false);
                z0g[] z0gVarArr2 = cwaVar2.G;
                a1gVar5.a(a1gVar5.e);
                z0gVarArr2[i4] = new t0g(new ArrayList(a1gVar5.g), new Matrix(matrix2));
            } else {
                ax5Var2 = ax5Var;
                c2 = 0;
            }
            c = c2;
            ax5Var3 = ax5Var2;
            i4 = i5;
            a1gVarArr = a1gVarArr2;
            matrixArr2 = matrixArr5;
        }
        path.close();
        path2.close();
        if (path2.isEmpty()) {
            return;
        }
        path.op(path2, Path.Op.UNION);
    }

    public mqh c() {
        ArrayList arrayList = (ArrayList) this.c;
        if (arrayList.isEmpty()) {
            return mqh.a;
        }
        int iO = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            n8b n8bVar = (n8b) arrayList.get(i);
            n8bVar.d = iO;
            iO += n8bVar.a.o.b.o();
        }
        return new l7d(arrayList, (m5g) this.k);
    }

    public void d() {
        Iterator it = ((HashSet) this.h).iterator();
        while (it.hasNext()) {
            n8b n8bVar = (n8b) it.next();
            if (n8bVar.c.isEmpty()) {
                m8b m8bVar = (m8b) ((HashMap) this.f).get(n8bVar);
                if (m8bVar != null) {
                    m8bVar.a.b(m8bVar.b);
                }
                it.remove();
            }
        }
    }

    public void e(n8b n8bVar) {
        if (n8bVar.e && n8bVar.c.isEmpty()) {
            m8b m8bVar = (m8b) ((HashMap) this.f).remove(n8bVar);
            m8bVar.getClass();
            l8b l8bVar = m8bVar.c;
            me1 me1Var = m8bVar.a;
            me1Var.n(m8bVar.b);
            me1Var.q(l8bVar);
            me1Var.p(l8bVar);
            ((HashSet) this.h).remove(n8bVar);
        }
    }

    public boolean f(Path path, int i) {
        Path path2 = (Path) this.l;
        path2.reset();
        ((a1g[]) this.b)[i].b(((Matrix[]) this.c)[i], path2);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        path2.computeBounds(rectF, true);
        path.op(path2, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        return !rectF.isEmpty() || (rectF.width() > 1.0f && rectF.height() > 1.0f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [a8b, h8b] */
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
    public void g(n8b n8bVar) {
        wua wuaVar = n8bVar.a;
        ?? r1 = new a8b() { // from class: h8b
            @Override // defpackage.a8b
            public final void a(me1 me1Var, mqh mqhVar) {
                k1h k1hVar = ((d87) this.a.g).L;
                k1hVar.e(2);
                k1hVar.f(22);
            }
        };
        l8b l8bVar = new l8b(this, n8bVar);
        ((HashMap) this.f).put(n8bVar, new m8b(wuaVar, r1, l8bVar));
        String str = tpi.a;
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper == null) {
            looperMyLooper = Looper.getMainLooper();
        }
        Handler handler = new Handler(looperMyLooper, null);
        wuaVar.getClass();
        tg6 tg6Var = wuaVar.c;
        tg6Var.getClass();
        CopyOnWriteArrayList copyOnWriteArrayList = tg6Var.c;
        e8b e8bVar = new e8b();
        e8bVar.a = handler;
        e8bVar.b = l8bVar;
        copyOnWriteArrayList.add(e8bVar);
        Looper looperMyLooper2 = Looper.myLooper();
        if (looperMyLooper2 == null) {
            looperMyLooper2 = Looper.getMainLooper();
        }
        new Handler(looperMyLooper2, null);
        tg6 tg6Var2 = wuaVar.d;
        tg6Var2.getClass();
        CopyOnWriteArrayList copyOnWriteArrayList2 = tg6Var2.c;
        sg6 sg6Var = new sg6();
        sg6Var.a = l8bVar;
        copyOnWriteArrayList2.add(sg6Var);
        wuaVar.j(r1, (yp5) this.l, (z6d) this.b);
    }

    public void h(s7b s7bVar) {
        IdentityHashMap identityHashMap = (IdentityHashMap) this.d;
        n8b n8bVar = (n8b) identityHashMap.remove(s7bVar);
        n8bVar.getClass();
        n8bVar.a.m(s7bVar);
        n8bVar.c.remove(((tua) s7bVar).E);
        if (!identityHashMap.isEmpty()) {
            d();
        }
        e(n8bVar);
    }

    public void i(int i, int i2) {
        ArrayList arrayList = (ArrayList) this.c;
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            n8b n8bVar = (n8b) arrayList.remove(i3);
            ((HashMap) this.e).remove(n8bVar.b);
            int i4 = -n8bVar.a.o.b.o();
            for (int i5 = i3; i5 < arrayList.size(); i5++) {
                ((n8b) arrayList.get(i5)).d += i4;
            }
            n8bVar.e = true;
            if (this.a) {
                e(n8bVar);
            }
        }
    }

    public o8b(d87 d87Var, hp5 hp5Var, k1h k1hVar, z6d z6dVar) {
        this.b = z6dVar;
        this.g = d87Var;
        this.k = new m5g();
        this.d = new IdentityHashMap();
        this.e = new HashMap();
        this.c = new ArrayList();
        this.i = hp5Var;
        this.j = k1hVar;
        this.f = new HashMap();
        this.h = new HashSet();
    }
}
