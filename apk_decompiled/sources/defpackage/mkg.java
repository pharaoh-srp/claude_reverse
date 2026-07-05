package defpackage;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class mkg extends gg9 {
    public final prb a;
    public final gg9 b;
    public final gg9 c;
    public final gg9 d;
    public final gg9 e;
    public final gg9 f;

    public mkg(prb prbVar) {
        this.a = prbVar;
        this.b = prbVar.a(List.class);
        this.c = prbVar.a(Map.class);
        this.d = prbVar.a(String.class);
        this.e = prbVar.a(Double.class);
        this.f = prbVar.a(Boolean.class);
    }

    @Override // defpackage.gg9
    public final Object fromJson(ci9 ci9Var) {
        int iOrdinal = ci9Var.j().ordinal();
        if (iOrdinal == 0) {
            return this.b.fromJson(ci9Var);
        }
        if (iOrdinal == 2) {
            return this.c.fromJson(ci9Var);
        }
        if (iOrdinal == 5) {
            return this.d.fromJson(ci9Var);
        }
        if (iOrdinal == 6) {
            return this.e.fromJson(ci9Var);
        }
        if (iOrdinal == 7) {
            return this.f.fromJson(ci9Var);
        }
        if (iOrdinal == 8) {
            ci9Var.f();
            return null;
        }
        StringBuilder sb = new StringBuilder("Expected a value but was ");
        sb.append(ci9Var.j());
        String strC = ci9Var.c();
        sb.append(" at path ");
        sb.append(strC);
        throw new IllegalStateException(sb.toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0017 A[PHI: r1
      0x0017: PHI (r1v4 java.lang.Class<?>) = (r1v1 java.lang.Class<?>), (r1v2 java.lang.Class<?>) binds: [B:7:0x0015, B:10:0x001f] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // defpackage.gg9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void toJson(defpackage.jj9 r4, java.lang.Object r5) {
        /*
            r3 = this;
            java.lang.Class r0 = r5.getClass()
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            if (r0 != r1) goto Lf
            r4.d()
            r4.i()
            return
        Lf:
            java.lang.Class<java.util.Map> r1 = java.util.Map.class
            boolean r2 = r1.isAssignableFrom(r0)
            if (r2 == 0) goto L19
        L17:
            r0 = r1
            goto L22
        L19:
            java.lang.Class<java.util.Collection> r1 = java.util.Collection.class
            boolean r2 = r1.isAssignableFrom(r0)
            if (r2 == 0) goto L22
            goto L17
        L22:
            java.util.Set r1 = defpackage.spi.a
            r2 = 0
            prb r3 = r3.a
            gg9 r3 = r3.b(r0, r1, r2)
            r3.toJson(r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mkg.toJson(jj9, java.lang.Object):void");
    }

    public final String toString() {
        return "JsonAdapter(Object)";
    }
}
