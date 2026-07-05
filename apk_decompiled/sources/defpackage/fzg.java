package defpackage;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class fzg extends hzg {
    public final /* synthetic */ int H = 0;
    public final Object I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fzg(oy7 oy7Var, String str) {
        super(oy7Var, str);
        oy7Var.getClass();
        str.getClass();
        this.I = oy7Var.e(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x005f  */
    @Override // defpackage.tze
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean H0() throws java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException {
        /*
            r6 = this;
            int r0 = r6.H
            java.lang.Object r1 = r6.I
            r2 = 0
            switch(r0) {
                case 0: goto L7a;
                default: goto L8;
            }
        L8:
            dzg r1 = (defpackage.dzg) r1
            int r0 = r1.ordinal()
            oy7 r6 = r6.E
            if (r0 == 0) goto L73
            r1 = 1
            if (r0 == r1) goto L6f
            r1 = 2
            if (r0 == r1) goto L6b
            r1 = 3
            if (r0 == r1) goto L67
            r1 = 4
            if (r0 != r1) goto L63
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            android.database.sqlite.SQLiteDatabase r1 = r6.E
            kw9 r3 = defpackage.oy7.I
            java.lang.Object r4 = r3.getValue()
            java.lang.reflect.Method r4 = (java.lang.reflect.Method) r4
            if (r4 == 0) goto L5f
            kw9 r4 = defpackage.oy7.H
            java.lang.Object r5 = r4.getValue()
            java.lang.reflect.Method r5 = (java.lang.reflect.Method) r5
            if (r5 == 0) goto L5f
            java.lang.Object r6 = r3.getValue()
            java.lang.reflect.Method r6 = (java.lang.reflect.Method) r6
            r6.getClass()
            java.lang.Object r3 = r4.getValue()
            java.lang.reflect.Method r3 = (java.lang.reflect.Method) r3
            r3.getClass()
            r4 = 0
            java.lang.Object r1 = r3.invoke(r1, r4)
            if (r1 == 0) goto L59
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r4, r0, r4}
            r6.invoke(r1, r0)
            goto L79
        L59:
            java.lang.String r6 = "Required value was null."
            defpackage.sz6.j(r6)
            goto L79
        L5f:
            r6.c()
            goto L79
        L63:
            defpackage.mr9.b()
            goto L79
        L67:
            r6.d()
            goto L79
        L6b:
            r6.c()
            goto L79
        L6f:
            r6.f()
            goto L79
        L73:
            r6.n()
            r6.f()
        L79:
            return r2
        L7a:
            r6.c()
            ty7 r1 = (defpackage.ty7) r1
            android.database.sqlite.SQLiteStatement r6 = r1.F
            r6.execute()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fzg.H0():boolean");
    }

    @Override // defpackage.tze
    public final void N(int i, String str) {
        int i2 = this.H;
        str.getClass();
        switch (i2) {
            case 0:
                c();
                ((ty7) this.I).u(i, str);
                return;
            default:
                c();
                u00.N(25, "column index out of range");
                throw null;
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws IOException {
        switch (this.H) {
            case 0:
                ((ty7) this.I).close();
                this.G = true;
                break;
            default:
                this.G = true;
                break;
        }
    }

    @Override // defpackage.tze
    public final String g0(int i) {
        switch (this.H) {
            case 0:
                c();
                u00.N(21, "no row");
                throw null;
            default:
                c();
                u00.N(21, "no row");
                throw null;
        }
    }

    @Override // defpackage.tze
    public final byte[] getBlob(int i) {
        switch (this.H) {
            case 0:
                c();
                u00.N(21, "no row");
                throw null;
            default:
                c();
                u00.N(21, "no row");
                throw null;
        }
    }

    @Override // defpackage.tze
    public final int getColumnCount() {
        switch (this.H) {
            case 0:
                c();
                break;
            default:
                c();
                break;
        }
        return 0;
    }

    @Override // defpackage.tze
    public final String getColumnName(int i) {
        switch (this.H) {
            case 0:
                c();
                u00.N(21, "no row");
                throw null;
            default:
                c();
                u00.N(21, "no row");
                throw null;
        }
    }

    @Override // defpackage.tze
    public final long getLong(int i) {
        switch (this.H) {
            case 0:
                c();
                u00.N(21, "no row");
                throw null;
            default:
                c();
                u00.N(21, "no row");
                throw null;
        }
    }

    @Override // defpackage.tze
    public final boolean isNull(int i) {
        switch (this.H) {
            case 0:
                c();
                u00.N(21, "no row");
                throw null;
            default:
                c();
                u00.N(21, "no row");
                throw null;
        }
    }

    @Override // defpackage.tze
    public final void o(int i, long j) {
        switch (this.H) {
            case 0:
                c();
                ((ty7) this.I).o(i, j);
                return;
            default:
                c();
                u00.N(25, "column index out of range");
                throw null;
        }
    }

    @Override // defpackage.tze
    public final void p(byte[] bArr, int i) {
        switch (this.H) {
            case 0:
                c();
                ((ty7) this.I).p(bArr, i);
                return;
            default:
                c();
                u00.N(25, "column index out of range");
                throw null;
        }
    }

    @Override // defpackage.tze
    public final void q(int i) {
        switch (this.H) {
            case 0:
                c();
                ((ty7) this.I).q(i);
                return;
            default:
                c();
                u00.N(25, "column index out of range");
                throw null;
        }
    }

    @Override // defpackage.hzg, defpackage.tze
    public void r() {
        switch (this.H) {
            case 0:
                c();
                ((ty7) this.I).r();
                break;
            default:
                super.r();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fzg(oy7 oy7Var, String str, dzg dzgVar) {
        super(oy7Var, str);
        oy7Var.getClass();
        str.getClass();
        this.I = dzgVar;
    }
}
