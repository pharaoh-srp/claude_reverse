package defpackage;

import android.view.View;
import android.view.WindowId;
import com.pvporbit.freetype.FreeTypeConstants;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class gg8 extends hqb implements oe4, r78, yt9, lbc, vd6, p6i {
    public ng8 S;
    public a2 T;
    public int U = 0;
    public final kg8 V;
    public og8 W;
    public og8 X;
    public long Y;
    public l9e Z;
    public final rvb a0;
    public long b0;
    public long c0;
    public long d0;
    public final float e0;
    public final float f0;
    public final long g0;
    public final lm6 h0;
    public final qg8 i0;
    public final float j0;
    public WindowId k0;
    public List l0;
    public zs1 m0;
    public e0g n0;
    public final kw9 o0;

    public gg8(ng8 ng8Var, og8 og8Var, a2 a2Var) {
        this.S = ng8Var;
        this.T = a2Var;
        ig8.b(this);
        this.V = kg8.a;
        this.W = og8.f;
        this.X = og8Var;
        this.Y = 9205357640488583168L;
        this.Z = l9e.e;
        rvb rvbVar = new rvb();
        rvbVar.a = u6f.a;
        rvbVar.b = sf5.d;
        rvbVar.c = yka.a;
        rvbVar.c(u6f.d(6));
        this.a0 = rvbVar;
        this.b0 = 9205357640488583168L;
        this.c0 = 9205357640488583168L;
        this.d0 = 0L;
        this.e0 = Float.NaN;
        this.f0 = -1.0f;
        this.g0 = d54.h;
        lm6 lm6Var = lm6.E;
        this.h0 = lm6Var;
        this.i0 = qg8.d;
        this.j0 = 1.0f;
        this.l0 = lm6Var;
        new u0h(new jd7(16));
        this.m0 = new n8f(this);
        this.n0 = cg8.a;
        this.o0 = yb5.w(w1a.G, new dg8(0, this));
    }

    @Override // defpackage.lbc
    public final void F0() {
        d4c.a0(this, new dm(0, this, gg8.class, "updateEffect", "updateEffect()V", 0, 13));
    }

    @Override // defpackage.vd6
    public final void I0(cv9 cv9Var) {
        try {
            if (!this.R) {
                this.U = 0;
                return;
            }
            if (cv9Var.E.g() != 9205357640488583168L && this.c0 != 9205357640488583168L && !this.l0.isEmpty()) {
                knk.L(this, cv9Var);
                this.m0.d(cv9Var);
            }
            u00.n(cv9Var);
            this.U = 0;
        } catch (Throwable th) {
            this.U = 0;
            throw th;
        }
    }

    @Override // defpackage.hqb
    public final boolean e1() {
        return false;
    }

    @Override // defpackage.hqb
    public final void h1() {
        F0();
    }

    @Override // defpackage.yt9
    public final void n(cu9 cu9Var) {
        cu9Var.getClass();
        rcg rcgVarZ = fd9.Z();
        bz7 bz7VarE = rcgVarZ != null ? rcgVarZ.e() : null;
        rcg rcgVarK0 = fd9.k0(rcgVarZ);
        try {
            if ((this.Y & 9223372034707292159L) == 9205357640488583168L) {
                p1(cu9Var);
            }
        } finally {
            fd9.s0(rcgVarZ, rcgVarK0, bz7VarE);
        }
    }

    @Override // defpackage.p6i
    public final Object o() {
        return rg8.E;
    }

    @Override // defpackage.r78
    public final void o0(m5c m5cVar) {
        p1(m5cVar);
    }

    public final void p1(cu9 cu9Var) {
        if (this.R) {
            cu9Var.getClass();
            long jQ = cu9Var.q(0L);
            if (!fcc.c(jQ, this.Y)) {
                this.U |= 4;
                this.Y = jQ;
            }
            long jT = csg.T(cu9Var.k());
            if (!k8g.b(jT, this.b0)) {
                this.U |= 16;
                this.b0 = jT;
            }
            this.k0 = ((View) yb5.o(this, w00.f)).getWindowId();
            cu9 cu9VarA = nai.A(cu9Var);
            l9e l9eVarX = d4c.x(cu9VarA.q(0L), csg.T(cu9VarA.k()));
            if (!l9eVarX.equals(this.Z)) {
                this.U |= 4;
                this.Z = l9eVarX;
            }
            w1();
        }
    }

    public final void q1(og8 og8Var, og8 og8Var2) {
        if (!x44.r(og8Var != null ? og8Var.b : null, og8Var2.b)) {
            this.U |= 512;
        }
        if (!x44.r(og8Var != null ? og8Var.e : null, og8Var2.e)) {
            this.U |= 512;
        }
        if (!x44.r(og8Var != null ? new d54(og8Var.a) : null, new d54(og8Var2.a))) {
            this.U |= FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING;
        }
        if (!x44.q(og8Var != null ? Float.valueOf(og8Var.d) : null, Float.valueOf(og8Var2.d))) {
            this.U |= 64;
        }
        if (x44.r(og8Var != null ? new va6(og8Var.c) : null, new va6(og8Var2.c))) {
            return;
        }
        this.U |= 32;
    }

    public final void r1(List list) {
        kw9 kw9Var;
        if (list.equals(this.l0)) {
            return;
        }
        this.U |= FreeTypeConstants.FT_LOAD_LINEAR_DESIGN;
        Iterator it = this.l0.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            kw9Var = this.o0;
            if (!zHasNext) {
                break;
            } else {
                ((bg8) it.next()).e.remove((fg8) kw9Var.getValue());
            }
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            ((bg8) it2.next()).e.add((fg8) kw9Var.getValue());
        }
        this.l0 = list;
    }

    public final void s1(zs1 zs1Var) {
        zs1Var.getClass();
        if (zs1Var.equals(this.m0)) {
            return;
        }
        this.m0.c();
        this.m0 = zs1Var;
    }

    public final void t1(long j) {
        if (fcc.c(j, this.d0)) {
            return;
        }
        this.U |= FreeTypeConstants.FT_LOAD_NO_AUTOHINT;
        this.d0 = j;
    }

    public final void u1(long j) {
        if (k8g.b(j, this.c0)) {
            return;
        }
        this.U |= 16384;
        this.c0 = j;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0148, code lost:
    
        r27 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0152, code lost:
    
        if (((((~r10) << 6) & r10) & r27) == 0) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0154, code lost:
    
        r5 = r1.a(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x015a, code lost:
    
        if (r1.f != 0) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x016d, code lost:
    
        if (((r1.a[r5 >> 3] >> ((r5 & 7) << 3)) & r17) != 254) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x016f, code lost:
    
        r35 = r2;
        r10 = r6;
        r33 = r7;
        r31 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0178, code lost:
    
        r5 = r1.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x017c, code lost:
    
        if (r5 <= 8) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x018e, code lost:
    
        if (java.lang.Long.compareUnsigned(((long) r1.e) * 32, ((long) r5) * 25) > 0) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0190, code lost:
    
        r5 = r1.a;
        r11 = r1.d;
        r13 = r1.b;
        r14 = r1.c;
        r4 = (r11 + 7) >> 3;
        r9 = r19;
        r31 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x01a0, code lost:
    
        if (r9 >= r4) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x01a2, code lost:
    
        r35 = r2;
        r2 = r5[r9] & r27;
        r5[r9] = (-72340172838076674L) & ((~r2) + (r2 >>> r2));
        r9 = r9 + 1;
        r6 = r6;
        r7 = r7;
        r2 = r35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x01bf, code lost:
    
        r35 = r2;
        r10 = r6;
        r33 = r7;
        r2 = defpackage.mp0.G0(r5);
        r3 = r2 - 1;
        r8 = 72057594037927935L;
        r5[r3] = (r5[r3] & 72057594037927935L) | (-72057594037927936L);
        r5[r2] = r5[r19];
        r2 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x01de, code lost:
    
        if (r2 == r11) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x01e0, code lost:
    
        r3 = r2 >> 3;
        r19 = (r2 & 7) << 3;
        r6 = (r5[r3] >> r19) & r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x01ee, code lost:
    
        if (r6 != 128) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x01f0, code lost:
    
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x01f5, code lost:
    
        if (r6 == 254) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x01f8, code lost:
    
        r4 = r13[r2];
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x01fa, code lost:
    
        if (r4 == null) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x01fc, code lost:
    
        r4 = r4.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0201, code lost:
    
        r4 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0203, code lost:
    
        r4 = r4 * r21;
        r6 = (r4 << 16) ^ r4;
        r4 = r6 >>> 7;
        r7 = r1.a(r4);
        r4 = r4 & r11;
        r38 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0220, code lost:
    
        if ((((r7 - r4) & r11) / 8) != (((r2 - r4) & r11) / 8)) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0222, code lost:
    
        r30 = r5;
        r30[r3] = ((~(r17 << r19)) & r5[r3]) | (((long) (r6 & 127)) << r19);
        r4 = r30;
        r4[r4.length - 1] = (r4[r19] & r38) | Long.MIN_VALUE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x023f, code lost:
    
        r2 = r2 + 1;
        r5 = r4;
        r8 = r38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0245, code lost:
    
        r4 = r5;
        r5 = r7 >> 3;
        r8 = r4[r5];
        r30 = (r7 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0254, code lost:
    
        if (((r8 >> r30) & r17) != 128) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0256, code lost:
    
        r43 = r2;
        r4[r5] = ((~(r17 << r30)) & r8) | (((long) (r6 & 127)) << r30);
        r4[r3] = (r4[r3] & (~(r17 << r19))) | (128 << r19);
        r13[r7] = r13[r43];
        r13[r43] = r23;
        r14[r7] = r14[r43];
        r14[r43] = 0;
        r2 = r43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0282, code lost:
    
        r43 = r2;
        r4[r5] = ((~(r17 << r30)) & r8) | (((long) (r6 & 127)) << r30);
        r2 = r13[r7];
        r13[r7] = r13[r43];
        r13[r43] = r2;
        r2 = r14[r7];
        r14[r7] = r14[r43];
        r14[r43] = r2;
        r2 = r43 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x02a4, code lost:
    
        r4[r4.length - 1] = (r4[r19] & r38) | Long.MIN_VALUE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x02b0, code lost:
    
        r1.f = defpackage.u6f.a(r1.d) - r1.e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x02bd, code lost:
    
        r35 = r2;
        r10 = r6;
        r33 = r7;
        r31 = 128;
        r2 = defpackage.u6f.b(r1.d);
        r3 = r1.a;
        r4 = r1.b;
        r5 = r1.c;
        r6 = r1.d;
        r1.c(r2);
        r2 = r1.a;
        r7 = r1.b;
        r8 = r1.c;
        r9 = r1.d;
        r11 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x02df, code lost:
    
        if (r11 >= r6) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x02ee, code lost:
    
        if (((r3[r11 >> 3] >> ((r11 & 7) << 3)) & r17) >= 128) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x02f0, code lost:
    
        r13 = r4[r11];
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x02f2, code lost:
    
        if (r13 == null) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x02f4, code lost:
    
        r14 = r13.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x02f9, code lost:
    
        r14 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x02fb, code lost:
    
        r14 = r14 * r21;
        r14 = r14 ^ (r14 << 16);
        r15 = r1.a(r14 >>> 7);
        r19 = r2;
        r16 = r3;
        r2 = r14 & 127;
        r14 = r15 >> 3;
        r25 = (r15 & 7) << 3;
        r2 = (r19[r14] & (~(r17 << r25))) | (r2 << r25);
        r19[r14] = r2;
        r19[(((r15 - 7) & r9) + (r9 & 7)) >> 3] = r2;
        r7[r15] = r13;
        r8[r15] = r5[r11];
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0334, code lost:
    
        r19 = r2;
        r16 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0338, code lost:
    
        r11 = r11 + 1;
        r3 = r16;
        r2 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x033f, code lost:
    
        r5 = r1.a(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0343, code lost:
    
        r1.e++;
        r2 = r1.f;
        r3 = r1.a;
        r4 = r5 >> 3;
        r6 = r3[r4];
        r8 = (r5 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x035b, code lost:
    
        if (((r6 >> r8) & r17) != r31) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x035e, code lost:
    
        r22 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0360, code lost:
    
        r1.f = r2 - r22;
        r2 = r1.d;
        r6 = (r6 & (~(r17 << r8))) | (r35 << r8);
        r3[r4] = r6;
        r3[(((r5 - 7) & r2) + (r2 & 7)) >> 3] = r6;
        r2 = ~r5;
     */
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
    public final void v1() {
        /*
            Method dump skipped, instruction units count: 939
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gg8.v1():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0275 A[Catch: all -> 0x0293, TryCatch #0 {all -> 0x0293, blocks: (B:3:0x0007, B:5:0x000b, B:7:0x001e, B:8:0x0025, B:9:0x0040, B:12:0x0048, B:13:0x005a, B:15:0x0064, B:18:0x006a, B:22:0x0076, B:24:0x007c, B:25:0x007e, B:26:0x0098, B:28:0x00a1, B:29:0x00a9, B:31:0x00b0, B:32:0x00b9, B:51:0x00fb, B:52:0x0101, B:54:0x0107, B:55:0x0119, B:59:0x0131, B:61:0x013e, B:63:0x0149, B:65:0x0155, B:69:0x0167, B:77:0x019b, B:79:0x01a6, B:80:0x01b3, B:82:0x01b9, B:84:0x01d1, B:86:0x01da, B:90:0x01fa, B:91:0x0213, B:93:0x0236, B:96:0x0246, B:100:0x0251, B:102:0x027f, B:107:0x028c, B:76:0x0197, B:72:0x018e, B:101:0x0275, B:35:0x00c5, B:38:0x00ca, B:40:0x00d2, B:43:0x00dc, B:44:0x00e0, B:46:0x00e6), top: B:113:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00fb A[Catch: all -> 0x0293, TryCatch #0 {all -> 0x0293, blocks: (B:3:0x0007, B:5:0x000b, B:7:0x001e, B:8:0x0025, B:9:0x0040, B:12:0x0048, B:13:0x005a, B:15:0x0064, B:18:0x006a, B:22:0x0076, B:24:0x007c, B:25:0x007e, B:26:0x0098, B:28:0x00a1, B:29:0x00a9, B:31:0x00b0, B:32:0x00b9, B:51:0x00fb, B:52:0x0101, B:54:0x0107, B:55:0x0119, B:59:0x0131, B:61:0x013e, B:63:0x0149, B:65:0x0155, B:69:0x0167, B:77:0x019b, B:79:0x01a6, B:80:0x01b3, B:82:0x01b9, B:84:0x01d1, B:86:0x01da, B:90:0x01fa, B:91:0x0213, B:93:0x0236, B:96:0x0246, B:100:0x0251, B:102:0x027f, B:107:0x028c, B:76:0x0197, B:72:0x018e, B:101:0x0275, B:35:0x00c5, B:38:0x00ca, B:40:0x00d2, B:43:0x00dc, B:44:0x00e0, B:46:0x00e6), top: B:113:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x013e A[Catch: all -> 0x0293, TryCatch #0 {all -> 0x0293, blocks: (B:3:0x0007, B:5:0x000b, B:7:0x001e, B:8:0x0025, B:9:0x0040, B:12:0x0048, B:13:0x005a, B:15:0x0064, B:18:0x006a, B:22:0x0076, B:24:0x007c, B:25:0x007e, B:26:0x0098, B:28:0x00a1, B:29:0x00a9, B:31:0x00b0, B:32:0x00b9, B:51:0x00fb, B:52:0x0101, B:54:0x0107, B:55:0x0119, B:59:0x0131, B:61:0x013e, B:63:0x0149, B:65:0x0155, B:69:0x0167, B:77:0x019b, B:79:0x01a6, B:80:0x01b3, B:82:0x01b9, B:84:0x01d1, B:86:0x01da, B:90:0x01fa, B:91:0x0213, B:93:0x0236, B:96:0x0246, B:100:0x0251, B:102:0x027f, B:107:0x028c, B:76:0x0197, B:72:0x018e, B:101:0x0275, B:35:0x00c5, B:38:0x00ca, B:40:0x00d2, B:43:0x00dc, B:44:0x00e0, B:46:0x00e6), top: B:113:0x0007 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void w1() {
        /*
            Method dump skipped, instruction units count: 664
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gg8.w1():void");
    }
}
