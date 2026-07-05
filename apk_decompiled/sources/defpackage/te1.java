package defpackage;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.RectF;
import com.agog.mathdisplay.render.MTTypesetterKt;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public abstract class te1 implements ge1, ym4, pg6 {
    public final pna e;
    public final le1 f;
    public final float[] h;
    public final ps9 i;
    public final g54 j;
    public final g54 k;
    public final ArrayList l;
    public final g54 m;
    public final g54 n;
    public float o;
    public final PathMeasure a = new PathMeasure();
    public final Path b = new Path();
    public final Path c = new Path();
    public final RectF d = new RectF();
    public final ArrayList g = new ArrayList();

    public te1(pna pnaVar, le1 le1Var, Paint.Cap cap, Paint.Join join, float f, b80 b80Var, c80 c80Var, ArrayList arrayList, c80 c80Var2) {
        ps9 ps9Var = new ps9(1, 0);
        this.i = ps9Var;
        this.o = MTTypesetterKt.kLineSkipLimitMultiplier;
        this.e = pnaVar;
        this.f = le1Var;
        ps9Var.setStyle(Paint.Style.STROKE);
        ps9Var.setStrokeCap(cap);
        ps9Var.setStrokeJoin(join);
        ps9Var.setStrokeMiter(f);
        this.k = (g54) b80Var.a();
        this.j = c80Var.a();
        if (c80Var2 == null) {
            this.m = null;
        } else {
            this.m = c80Var2.a();
        }
        this.l = new ArrayList(arrayList.size());
        this.h = new float[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            this.l.add(((c80) arrayList.get(i)).a());
        }
        le1Var.d(this.k);
        le1Var.d(this.j);
        for (int i2 = 0; i2 < this.l.size(); i2++) {
            le1Var.d((ke1) this.l.get(i2));
        }
        ke1 ke1Var = this.m;
        if (ke1Var != null) {
            le1Var.d(ke1Var);
        }
        this.k.a(this);
        this.j.a(this);
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            ((ke1) this.l.get(i3)).a(this);
        }
        g54 g54Var = this.m;
        if (g54Var != null) {
            g54Var.a(this);
        }
        if (le1Var.j() != null) {
            g54 g54VarA = ((c80) le1Var.j().F).a();
            this.n = g54VarA;
            g54VarA.a(this);
            le1Var.d(g54VarA);
        }
    }

    @Override // defpackage.ge1
    public final void a() {
        this.e.invalidateSelf();
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0050  */
    @Override // defpackage.ym4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(java.util.List r8, java.util.List r9) {
        /*
            r7 = this;
            java.util.ArrayList r8 = (java.util.ArrayList) r8
            int r0 = r8.size()
            int r0 = r0 + (-1)
            r1 = 0
            r2 = r1
        La:
            r3 = 2
            if (r0 < 0) goto L21
            java.lang.Object r4 = r8.get(r0)
            ym4 r4 = (defpackage.ym4) r4
            boolean r5 = r4 instanceof defpackage.p7i
            if (r5 == 0) goto L1e
            p7i r4 = (defpackage.p7i) r4
            int r5 = r4.c
            if (r5 != r3) goto L1e
            r2 = r4
        L1e:
            int r0 = r0 + (-1)
            goto La
        L21:
            if (r2 == 0) goto L26
            r2.d(r7)
        L26:
            int r8 = r9.size()
            int r8 = r8 + (-1)
        L2c:
            java.util.ArrayList r0 = r7.g
            if (r8 < 0) goto L65
            java.lang.Object r4 = r9.get(r8)
            ym4 r4 = (defpackage.ym4) r4
            boolean r5 = r4 instanceof defpackage.p7i
            if (r5 == 0) goto L50
            r5 = r4
            p7i r5 = (defpackage.p7i) r5
            int r6 = r5.c
            if (r6 != r3) goto L50
            if (r1 == 0) goto L46
            r0.add(r1)
        L46:
            se1 r0 = new se1
            r0.<init>(r5)
            r5.d(r7)
            r1 = r0
            goto L62
        L50:
            boolean r0 = r4 instanceof defpackage.quc
            if (r0 == 0) goto L62
            if (r1 != 0) goto L5b
            se1 r1 = new se1
            r1.<init>(r2)
        L5b:
            java.util.ArrayList r0 = r1.a
            quc r4 = (defpackage.quc) r4
            r0.add(r4)
        L62:
            int r8 = r8 + (-1)
            goto L2c
        L65:
            if (r1 == 0) goto L6a
            r0.add(r1)
        L6a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.te1.b(java.util.List, java.util.List):void");
    }

    @Override // defpackage.pg6
    public final void c(RectF rectF, Matrix matrix, boolean z) {
        Path path = this.b;
        path.reset();
        int i = 0;
        while (true) {
            ArrayList arrayList = this.g;
            if (i >= arrayList.size()) {
                RectF rectF2 = this.d;
                path.computeBounds(rectF2, false);
                float fI = this.j.i() / 2.0f;
                rectF2.set(rectF2.left - fI, rectF2.top - fI, rectF2.right + fI, rectF2.bottom + fI);
                rectF.set(rectF2);
                rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
                return;
            }
            se1 se1Var = (se1) arrayList.get(i);
            for (int i2 = 0; i2 < se1Var.a.size(); i2++) {
                path.addPath(((quc) se1Var.a.get(i2)).e(), matrix);
            }
            i++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:76:0x01e3  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
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
    public void f(android.graphics.Canvas r21, android.graphics.Matrix r22, int r23, defpackage.gh6 r24) {
        /*
            Method dump skipped, instruction units count: 588
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.te1.f(android.graphics.Canvas, android.graphics.Matrix, int, gh6):void");
    }
}
