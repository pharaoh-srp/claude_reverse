package defpackage;

import com.pvporbit.freetype.FreeTypeConstants;

/* JADX INFO: loaded from: classes2.dex */
public final class ge8 implements bk6 {
    public static final double[] r = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};
    public String a;
    public y3i b;
    public final vff c;
    public final String d;
    public final ssc e;
    public final a87 f;
    public final boolean[] g = new boolean[4];
    public final fe8 h;
    public long i;
    public boolean j;
    public boolean k;
    public long l;
    public long m;
    public long n;
    public long o;
    public boolean p;
    public boolean q;

    public ge8(vff vffVar, String str) {
        this.c = vffVar;
        this.d = str;
        fe8 fe8Var = new fe8(0);
        fe8Var.e = new byte[FreeTypeConstants.FT_LOAD_PEDANTIC];
        this.h = fe8Var;
        if (vffVar != null) {
            this.f = new a87(178);
            this.e = new ssc();
        } else {
            this.f = null;
            this.e = null;
        }
        this.m = -9223372036854775807L;
        this.o = -9223372036854775807L;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0207  */
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
    @Override // defpackage.bk6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(defpackage.ssc r23) {
        /*
            Method dump skipped, instruction units count: 527
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ge8.c(ssc):void");
    }

    @Override // defpackage.bk6
    public final void d() {
        stj.k(this.g);
        fe8 fe8Var = this.h;
        fe8Var.d = false;
        fe8Var.b = 0;
        fe8Var.c = 0;
        a87 a87Var = this.f;
        if (a87Var != null) {
            a87Var.d();
        }
        this.i = 0L;
        this.j = false;
        this.m = -9223372036854775807L;
        this.o = -9223372036854775807L;
    }

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
    @Override // defpackage.bk6
    public final void e(boolean z) {
        this.b.getClass();
        if (z) {
            boolean z2 = this.p;
            this.b.a(this.o, z2 ? 1 : 0, (int) (this.i - this.n), 0, null);
        }
    }

    @Override // defpackage.bk6
    public final void f(yd7 yd7Var, t6f t6fVar) {
        t6fVar.d();
        t6fVar.i();
        this.a = (String) t6fVar.e;
        t6fVar.i();
        this.b = yd7Var.n(t6fVar.c, 2);
        vff vffVar = this.c;
        if (vffVar != null) {
            vffVar.b(yd7Var, t6fVar);
        }
    }

    @Override // defpackage.bk6
    public final void g(int i, long j) {
        this.m = j;
    }
}
