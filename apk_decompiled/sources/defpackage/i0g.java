package defpackage;

import android.graphics.Path;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class i0g implements quc, ge1, ym4 {
    public final boolean b;
    public final pna c;
    public final r0g d;
    public boolean e;
    public final Path a = new Path();
    public final d80 f = new d80(3);

    public i0g(pna pnaVar, le1 le1Var, b1g b1gVar) {
        this.b = b1gVar.d;
        this.c = pnaVar;
        r0g r0gVar = new r0g((List) b1gVar.c.F);
        this.d = r0gVar;
        le1Var.d(r0gVar);
        r0gVar.a(this);
    }

    @Override // defpackage.ge1
    public final void a() {
        this.e = false;
        this.c.invalidateSelf();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    @Override // defpackage.ym4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(java.util.List r6, java.util.List r7) {
        /*
            r5 = this;
            r7 = 0
            r0 = 0
        L2:
            r1 = r6
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            int r2 = r1.size()
            if (r0 >= r2) goto L40
            java.lang.Object r1 = r1.get(r0)
            ym4 r1 = (defpackage.ym4) r1
            boolean r2 = r1 instanceof defpackage.p7i
            if (r2 == 0) goto L28
            r2 = r1
            p7i r2 = (defpackage.p7i) r2
            int r3 = r2.c
            r4 = 1
            if (r3 != r4) goto L28
            d80 r1 = r5.f
            java.util.ArrayList r1 = r1.F
            r1.add(r2)
            r2.d(r5)
            goto L3d
        L28:
            boolean r2 = r1 instanceof defpackage.bwe
            if (r2 == 0) goto L3d
            if (r7 != 0) goto L33
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
        L33:
            bwe r1 = (defpackage.bwe) r1
            ke1 r2 = r1.b
            r2.a(r5)
            r7.add(r1)
        L3d:
            int r0 = r0 + 1
            goto L2
        L40:
            r0g r5 = r5.d
            r5.j = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i0g.b(java.util.List, java.util.List):void");
    }

    @Override // defpackage.quc
    public final Path e() {
        boolean z = this.e;
        r0g r0gVar = this.d;
        Path path = this.a;
        if (z) {
            r0gVar.getClass();
            return path;
        }
        path.reset();
        if (this.b) {
            this.e = true;
            return path;
        }
        Path path2 = (Path) r0gVar.d();
        if (path2 == null) {
            return path;
        }
        path.set(path2);
        path.setFillType(Path.FillType.EVEN_ODD);
        this.f.f(path);
        this.e = true;
        return path;
    }
}
