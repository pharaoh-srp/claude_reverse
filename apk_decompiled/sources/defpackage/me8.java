package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class me8 implements bk6 {
    public final vff a;
    public final boolean b;
    public final boolean c;
    public long g;
    public String i;
    public y3i j;
    public le8 k;
    public boolean l;
    public boolean n;
    public final boolean[] h = new boolean[3];
    public final a87 d = new a87(7);
    public final a87 e = new a87(8);
    public final a87 f = new a87(6);
    public long m = -9223372036854775807L;
    public final ssc o = new ssc();

    public me8(vff vffVar, boolean z, boolean z2) {
        this.a = vffVar;
        this.b = z;
        this.c = z2;
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x024d  */
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
    public final void a(int r23, int r24, long r25, long r27) {
        /*
            Method dump skipped, instruction units count: 604
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.me8.a(int, int, long, long):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x013b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(byte[] r17, int r18, int r19) {
        /*
            Method dump skipped, instruction units count: 396
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.me8.b(byte[], int, int):void");
    }

    @Override // defpackage.bk6
    public final void c(ssc sscVar) {
        int i;
        this.j.getClass();
        String str = tpi.a;
        int i2 = sscVar.b;
        int i3 = sscVar.c;
        byte[] bArr = sscVar.a;
        this.g += (long) sscVar.a();
        this.j.e(sscVar.a(), sscVar);
        while (true) {
            int iN = stj.n(bArr, i2, i3, this.h);
            if (iN == i3) {
                b(bArr, i2, i3);
                return;
            }
            int i4 = bArr[iN + 3] & 31;
            if (iN <= 0 || bArr[iN - 1] != 0) {
                i = 3;
            } else {
                iN--;
                i = 4;
            }
            int i5 = iN;
            int i6 = i;
            int i7 = i5 - i2;
            if (i7 > 0) {
                b(bArr, i2, i5);
            }
            int i8 = i3 - i5;
            long j = this.g - ((long) i8);
            a(i8, i7 < 0 ? -i7 : 0, j, this.m);
            h(j, i4, this.m);
            i2 = i5 + i6;
        }
    }

    @Override // defpackage.bk6
    public final void d() {
        this.g = 0L;
        this.n = false;
        this.m = -9223372036854775807L;
        stj.k(this.h);
        this.d.d();
        this.e.d();
        this.f.d();
        this.a.d.g(0);
        le8 le8Var = this.k;
        if (le8Var != null) {
            le8Var.k = false;
            le8Var.o = false;
            ke8 ke8Var = le8Var.n;
            ke8Var.b = false;
            ke8Var.a = false;
        }
    }

    @Override // defpackage.bk6
    public final void e(boolean z) {
        this.j.getClass();
        String str = tpi.a;
        if (z) {
            this.a.d.g(0);
            a(0, 0, this.g, this.m);
            h(this.g, 9, this.m);
            a(0, 0, this.g, this.m);
        }
    }

    @Override // defpackage.bk6
    public final void f(yd7 yd7Var, t6f t6fVar) {
        t6fVar.d();
        t6fVar.i();
        this.i = (String) t6fVar.e;
        t6fVar.i();
        y3i y3iVarN = yd7Var.n(t6fVar.c, 2);
        this.j = y3iVarN;
        this.k = new le8(y3iVarN, this.b, this.c);
        this.a.b(yd7Var, t6fVar);
    }

    @Override // defpackage.bk6
    public final void g(int i, long j) {
        this.m = j;
        this.n = ((i & 2) != 0) | this.n;
    }

    public final void h(long j, int i, long j2) {
        if (!this.l || this.k.c) {
            this.d.e(i);
            this.e.e(i);
        }
        this.f.e(i);
        le8 le8Var = this.k;
        boolean z = this.n;
        le8Var.i = i;
        le8Var.l = j2;
        le8Var.j = j;
        le8Var.s = z;
        if (!le8Var.b || i != 1) {
            if (!le8Var.c) {
                return;
            }
            if (i != 5 && i != 1 && i != 2) {
                return;
            }
        }
        ke8 ke8Var = le8Var.m;
        le8Var.m = le8Var.n;
        le8Var.n = ke8Var;
        ke8Var.b = false;
        ke8Var.a = false;
        le8Var.h = 0;
        le8Var.k = true;
    }
}
