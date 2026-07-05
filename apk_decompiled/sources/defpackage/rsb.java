package defpackage;

import java.io.EOFException;

/* JADX INFO: loaded from: classes2.dex */
public final class rsb implements wd7 {
    public final r56 e;
    public yd7 f;
    public y3i g;
    public y3i h;
    public int i;
    public gjb j;
    public gjb k;
    public long m;
    public long n;
    public long o;
    public int p;
    public iff q;
    public boolean r;
    public boolean s;
    public long t;
    public final ssc a = new ssc(10);
    public final om8 b = new om8();
    public final j18 c = new j18();
    public long l = -9223372036854775807L;
    public final kv8 d = new kv8(0);

    public rsb() {
        r56 r56Var = new r56();
        this.e = r56Var;
        this.h = r56Var;
        this.o = -1L;
    }

    @Override // defpackage.wd7
    public final void a() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x032f  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0353  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x038c  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x03ed  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x03fb  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x045f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x049e  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x04b7  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x04df  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0546  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0554  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /* JADX WARN: Type inference failed for: r4v44 */
    /* JADX WARN: Type inference failed for: r4v45 */
    /* JADX WARN: Type inference failed for: r4v46 */
    /* JADX WARN: Type inference failed for: r4v47 */
    /* JADX WARN: Type inference failed for: r4v5, types: [boolean, int] */
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
    @Override // defpackage.wd7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int b(defpackage.xd7 r53, defpackage.xm7 r54) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1441
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rsb.b(xd7, xm7):int");
    }

    @Override // defpackage.wd7
    public final boolean c(xd7 xd7Var) {
        return i(xd7Var, true);
    }

    @Override // defpackage.wd7
    public final void d(long j, long j2) {
        this.i = 0;
        this.l = -9223372036854775807L;
        this.m = 0L;
        this.p = 0;
        this.o = -1L;
        this.t = j2;
        if (this.q instanceof x09) {
            throw null;
        }
    }

    @Override // defpackage.wd7
    public final void f(yd7 yd7Var) {
        this.f = yd7Var;
        y3i y3iVarN = yd7Var.n(0, 1);
        this.g = y3iVarN;
        this.h = y3iVarN;
        this.f.j();
    }

    public final void g() {
        iff iffVar = this.q;
        if ((iffVar instanceof fl4) && ((fl4) iffVar).b()) {
            long j = this.o;
            if (j == -1 || j == this.q.a()) {
                return;
            }
            fl4 fl4Var = (fl4) this.q;
            this.q = new fl4(this.o, fl4Var.i, fl4Var.j, fl4Var.k, fl4Var.l, false);
            yd7 yd7Var = this.f;
            yd7Var.getClass();
            yd7Var.q(this.q);
            y3i y3iVar = this.g;
            y3iVar.getClass();
            y3iVar.d(this.q.g());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x001b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean h(defpackage.xd7 r9) {
        /*
            r8 = this;
            iff r0 = r8.q
            r1 = 1
            if (r0 == 0) goto L1b
            long r2 = r0.a()
            r4 = -1
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 == 0) goto L1b
            long r4 = r9.e()
            r6 = 4
            long r2 = r2 - r6
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 <= 0) goto L1b
            goto L27
        L1b:
            ssc r8 = r8.a     // Catch: java.io.EOFException -> L27
            byte[] r8 = r8.a     // Catch: java.io.EOFException -> L27
            r0 = 0
            r2 = 4
            boolean r8 = r9.d(r8, r0, r2, r1)     // Catch: java.io.EOFException -> L27
            r8 = r8 ^ r1
            return r8
        L27:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rsb.h(xd7):boolean");
    }

    public final boolean i(xd7 xd7Var, boolean z) throws EOFException {
        int iE;
        int i;
        int iH;
        xd7Var.k();
        if (xd7Var.getPosition() == 0) {
            gjb gjbVarC = this.d.c(xd7Var, null, 131072);
            this.j = gjbVarC;
            if (gjbVarC != null) {
                this.c.b(gjbVarC);
            }
            iE = (int) xd7Var.e();
            if (!z) {
                xd7Var.l(iE);
            }
            i = 0;
        } else {
            iE = 0;
            i = 0;
        }
        int i2 = i;
        int i3 = i2;
        while (true) {
            if (!h(xd7Var)) {
                ssc sscVar = this.a;
                sscVar.M(0);
                int iM = sscVar.m();
                if ((i == 0 || ((-128000) & iM) == (((long) i) & (-128000))) && (iH = otj.h(iM)) != -1) {
                    i2++;
                    if (i2 != 1) {
                        if (i2 == 4) {
                            break;
                        }
                    } else {
                        this.b.a(iM);
                        i = iM;
                    }
                    xd7Var.f(iH - 4);
                } else {
                    int i4 = i3 + 1;
                    if (i3 == 131072) {
                        if (z) {
                            return false;
                        }
                        g();
                        sz6.n();
                        return false;
                    }
                    if (z) {
                        xd7Var.k();
                        xd7Var.f(iE + i4);
                    } else {
                        xd7Var.l(1);
                    }
                    i2 = 0;
                    i3 = i4;
                    i = 0;
                }
            } else if (i2 <= 0) {
                g();
                sz6.n();
                return false;
            }
        }
        if (z) {
            xd7Var.l(iE + i3);
        } else {
            xd7Var.k();
        }
        this.i = i;
        return true;
    }
}
