package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class xnc {
    public final ax5 a;
    public final xub b;
    public final yub c;
    public final vub d;
    public final xub e;
    public float f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public boolean l;
    public int m;
    public final xz9 n;
    public final lrb o;

    public xnc(ax5 ax5Var, xz9 xz9Var, ow8 ow8Var) {
        this.a = ax5Var;
        xub xubVar = x69.a;
        this.b = new xub();
        this.c = new yub();
        int i = s69.a;
        this.d = new vub();
        this.e = new xub();
        this.g = -1;
        this.h = Integer.MAX_VALUE;
        this.i = Integer.MIN_VALUE;
        this.n = xz9Var;
        this.o = new lrb(ow8Var);
    }

    public final int a(lrb lrbVar, int i, boolean z) {
        List list;
        List list2;
        xub xubVar = this.e;
        if (xubVar.a(i)) {
            Object objB = xubVar.b(i);
            objB.getClass();
            return ((a62) objB).b;
        }
        xub xubVar2 = this.b;
        int i2 = 0;
        if (xubVar2.a(i)) {
            if (!z || (list2 = (List) xubVar2.b(i)) == null) {
                return -1;
            }
            int size = list2.size();
            while (i2 < size) {
                ((wz9) list2.get(i2)).a();
                i2++;
            }
            return -1;
        }
        r52 r52Var = new r52(this, lrbVar, i2);
        long j = lrbVar.F().u;
        xz9 xz9Var = (xz9) lrbVar.H;
        if (xz9Var == null) {
            x44.o0("state");
            throw null;
        }
        xubVar2.i(i, x44.W(xz9Var.a(i, j, true, new b4b(r52Var, 13, lrbVar))));
        if (!z || (list = (List) xubVar2.b(i)) == null) {
            return -1;
        }
        int size2 = list.size();
        while (i2 < size2) {
            ((wz9) list.get(i2)).a();
            i2++;
        }
        return -1;
    }

    public final int b() {
        return this.i;
    }

    public final int c() {
        return this.h;
    }

    public final boolean d() {
        return (this.h == Integer.MAX_VALUE || this.i == Integer.MIN_VALUE) ? false : true;
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
    public final void e(lrb lrbVar, int i, int i2) {
        int i3;
        int i4;
        xub xubVar = this.e;
        a62 a62Var = (a62) xubVar.b(i);
        tqh tqhVar = a62.c;
        if (a62Var != null) {
            a62Var.b = i2;
            a62Var.a = tqhVar;
        } else {
            a62Var = new a62();
            a62Var.a = tqhVar;
            a62Var.b = i2;
        }
        xubVar.i(i, a62Var);
        if (i > this.i) {
            this.i = i;
            this.k -= i2;
        } else if (i < this.h) {
            this.h = i;
            this.j -= i2;
        }
        int i5 = 1;
        if (Math.signum(this.f) <= MTTypesetterKt.kLineSkipLimitMultiplier) {
            if (this.k > 0) {
                i3 = this.i + 1;
                i4 = i3;
            }
            i4 = -1;
        } else {
            if (Math.signum(this.f) > MTTypesetterKt.kLineSkipLimitMultiplier && this.j > 0) {
                i3 = this.h - 1;
                i4 = i3;
            }
            i4 = -1;
        }
        if (i4 > 0) {
            lrbVar.getClass();
            if (i4 != -1 && i4 < this.m) {
                r52 r52Var = new r52(this, lrbVar, i5);
                long j = lrbVar.F().u;
                xz9 xz9Var = (xz9) lrbVar.H;
                if (xz9Var == null) {
                    x44.o0("state");
                    throw null;
                }
                this.b.i(i4, x44.W(xz9Var.a(i4, j, true, new b4b(r52Var, 13, lrbVar))));
            }
        }
        j();
    }

    public final void f(lrb lrbVar, int i, int i2, int i3, int i4, int i5, float f, boolean z) {
        int i6;
        int i7;
        boolean z2 = Math.signum(f) == Math.signum(this.f);
        if (!z) {
            if (!z2 || this.l) {
                this.j = i3 - i5;
                this.h = i;
            } else {
                int iL = mwa.L(Math.abs(f)) + this.j;
                int i8 = i3 - i5;
                if (iL > i8) {
                    iL = i8;
                }
                this.j = iL;
            }
            while (this.j > 0 && (i6 = this.h) > 0) {
                int iA = a(lrbVar, this.h - 1, i6 + (-1) == i + (-1) && ((f > MTTypesetterKt.kLineSkipLimitMultiplier ? 1 : (f == MTTypesetterKt.kLineSkipLimitMultiplier ? 0 : -1)) != 0) && Math.abs(f) >= ((float) i5));
                if (iA == -1) {
                    return;
                }
                this.h--;
                this.j -= iA;
            }
            return;
        }
        if (!z2 || this.l) {
            this.k = i3 - i4;
            this.i = i2;
        } else {
            int iL2 = mwa.L(Math.abs(f)) + this.k;
            int i9 = i3 - i4;
            if (iL2 > i9) {
                iL2 = i9;
            }
            this.k = iL2;
        }
        while (this.k > 0) {
            int i10 = this.i;
            lrbVar.getClass();
            if (i10 == -1 || (i7 = this.i) >= this.m - 1) {
                return;
            }
            int iA2 = a(lrbVar, this.i + 1, i7 + 1 == i2 + 1 && ((f > MTTypesetterKt.kLineSkipLimitMultiplier ? 1 : (f == MTTypesetterKt.kLineSkipLimitMultiplier ? 0 : -1)) != 0) && Math.abs(f) >= ((float) i4));
            if (iA2 == -1) {
                return;
            }
            this.i++;
            this.k -= iA2;
        }
    }

    public final void g(float f, coc cocVar) {
        xnc xncVar;
        boolean z;
        int i;
        int i2;
        int i3;
        lrb lrbVar = this.o;
        lrbVar.G = cocVar;
        lrbVar.H = this.n;
        float f2 = -f;
        j();
        if (lrbVar.D()) {
            kyk.g(lrbVar.F());
            lrbVar.F();
            this.m = lrbVar.L();
            int iB = lrbVar.B();
            int iE = lrbVar.E();
            int iL = lrbVar.L();
            int iH = lrbVar.H();
            int iG = lrbVar.G();
            xub xubVar = this.e;
            if (f2 <= MTTypesetterKt.kLineSkipLimitMultiplier) {
                this.j = 0 - iH;
                this.h = iB;
                while (this.j > 0 && (i3 = this.h) > 0 && xubVar.a(i3 - 1)) {
                    Object objB = xubVar.b(this.h - 1);
                    objB.getClass();
                    this.h--;
                    this.j -= ((a62) objB).b;
                }
                h(0, this.h - 1);
            } else {
                this.k = 0 - iG;
                this.i = iE;
                while (this.k > 0 && (i2 = this.i) < iL - 1 && xubVar.a(i2 + 1)) {
                    Object objB2 = xubVar.b(this.i + 1);
                    objB2.getClass();
                    int i4 = ((a62) objB2).b;
                    this.i++;
                    this.k -= i4;
                }
                h(this.i + 1, iL - 1);
            }
        }
        if (lrbVar.D()) {
            kyk.g(lrbVar.F());
            if (lrbVar.F().t != null) {
                i = ((koc) this.a.F).o;
                z = false;
            } else {
                z = false;
                i = 0;
            }
            xncVar = this;
            xncVar.f(lrbVar, lrbVar.B(), lrbVar.E(), i, lrbVar.G(), lrbVar.H(), f2, f2 <= MTTypesetterKt.kLineSkipLimitMultiplier ? true : z);
        } else {
            xncVar = this;
        }
        xncVar.f = f2;
        xncVar.j();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00f0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h(int r29, int r30) {
        /*
            Method dump skipped, instruction units count: 415
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xnc.h(int, int):void");
    }

    public final void i() {
        this.h = Integer.MAX_VALUE;
        this.i = Integer.MIN_VALUE;
        this.j = 0;
        this.k = 0;
        this.l = false;
        this.d.a();
        this.e.c();
        xub xubVar = this.b;
        long[] jArr = xubVar.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        int i5 = xubVar.b[i4];
                        List list = (List) xubVar.c[i4];
                        int size = list.size();
                        for (int i6 = 0; i6 < size; i6++) {
                            ((wz9) list.get(i6)).cancel();
                        }
                        xubVar.h(i4);
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    public final void j() {
        dgj.U(this.j, "prefetchWindowStartExtraSpace");
        dgj.U(this.k, "prefetchWindowEndExtraSpace");
        dgj.U(this.h, "prefetchWindowStartIndex");
        dgj.U(this.i, "prefetchWindowEndIndex");
    }
}
