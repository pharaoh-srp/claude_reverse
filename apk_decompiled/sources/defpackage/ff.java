package defpackage;

import com.pvporbit.freetype.FreeTypeConstants;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class ff implements bk6 {
    public static final byte[] x = {73, 68, 51};
    public final boolean a;
    public final String d;
    public final int e;
    public final String f;
    public String g;
    public y3i h;
    public y3i i;
    public boolean m;
    public boolean n;
    public int q;
    public boolean r;
    public int t;
    public y3i v;
    public long w;
    public final dg2 b = new dg2(new byte[7], 7);
    public final ssc c = new ssc(Arrays.copyOf(x, 10));
    public int o = -1;
    public int p = -1;
    public long s = -9223372036854775807L;
    public long u = -9223372036854775807L;
    public int j = 0;
    public int k = 0;
    public int l = FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING;

    public ff(String str, String str2, int i, boolean z) {
        this.a = z;
        this.d = str;
        this.e = i;
        this.f = str2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0205  */
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
    public final void c(defpackage.ssc r24) {
        /*
            Method dump skipped, instruction units count: 810
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ff.c(ssc):void");
    }

    @Override // defpackage.bk6
    public final void d() {
        this.u = -9223372036854775807L;
        this.n = false;
        this.j = 0;
        this.k = 0;
        this.l = FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING;
    }

    @Override // defpackage.bk6
    public final void e(boolean z) {
    }

    @Override // defpackage.bk6
    public final void f(yd7 yd7Var, t6f t6fVar) {
        t6fVar.d();
        t6fVar.i();
        this.g = (String) t6fVar.e;
        t6fVar.i();
        y3i y3iVarN = yd7Var.n(t6fVar.c, 1);
        this.h = y3iVarN;
        this.v = y3iVarN;
        if (!this.a) {
            this.i = new r56();
            return;
        }
        t6fVar.d();
        t6fVar.i();
        y3i y3iVarN2 = yd7Var.n(t6fVar.c, 5);
        this.i = y3iVarN2;
        iw7 iw7Var = new iw7();
        t6fVar.i();
        iw7Var.a = (String) t6fVar.e;
        iw7Var.m = gkb.k(this.f);
        iw7Var.n = gkb.k("application/id3");
        qy1.n(iw7Var, y3iVarN2);
    }

    @Override // defpackage.bk6
    public final void g(int i, long j) {
        this.u = j;
    }
}
