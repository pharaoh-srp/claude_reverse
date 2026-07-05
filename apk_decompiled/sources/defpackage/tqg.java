package defpackage;

import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;

/* JADX INFO: loaded from: classes.dex */
public final class tqg extends wd6 implements gh9 {
    public final kd4 e;
    public final bg9 f;
    public final qij g;
    public final gh9[] h;
    public final fof i;
    public final rg9 j;
    public boolean k;
    public String l;
    public String m;

    public tqg(kd4 kd4Var, bg9 bg9Var, qij qijVar, gh9[] gh9VarArr) {
        kd4Var.getClass();
        bg9Var.getClass();
        this.e = kd4Var;
        this.f = bg9Var;
        this.g = qijVar;
        this.h = gh9VarArr;
        this.i = bg9Var.b;
        this.j = bg9Var.a;
        int iOrdinal = qijVar.ordinal();
        if (gh9VarArr != null) {
            gh9 gh9Var = gh9VarArr[iOrdinal];
            if (gh9Var == null && gh9Var == this) {
                return;
            }
            gh9VarArr[iOrdinal] = this;
        }
    }

    @Override // defpackage.wd6, kotlinx.serialization.encoding.Encoder
    public final void A(long j) {
        if (this.k) {
            F(String.valueOf(j));
        } else {
            this.e.h(j);
        }
    }

    @Override // defpackage.wd6, defpackage.vd4
    public final void B(SerialDescriptor serialDescriptor, int i, znf znfVar, Object obj) {
        serialDescriptor.getClass();
        znfVar.getClass();
        if (obj != null || this.j.f) {
            super.B(serialDescriptor, i, znfVar, obj);
        }
    }

    @Override // defpackage.vd4
    public final boolean E(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        return this.j.a;
    }

    @Override // defpackage.wd6, kotlinx.serialization.encoding.Encoder
    public final void F(String str) {
        str.getClass();
        this.e.j(str);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final fof a() {
        return this.i;
    }

    @Override // defpackage.wd6, defpackage.vd4
    public final void b(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        kd4 kd4Var = this.e;
        kd4Var.m();
        kd4Var.d();
        kd4Var.f(this.g.F);
    }

    @Override // defpackage.wd6, kotlinx.serialization.encoding.Encoder
    public final vd4 c(SerialDescriptor serialDescriptor) {
        gh9 gh9Var;
        serialDescriptor.getClass();
        bg9 bg9Var = this.f;
        qij qijVarC = rij.c(bg9Var, serialDescriptor);
        char c = qijVarC.E;
        kd4 kd4Var = this.e;
        kd4Var.f(c);
        kd4Var.b();
        String str = this.l;
        if (str != null) {
            String strA = this.m;
            if (strA == null) {
                strA = serialDescriptor.a();
            }
            kd4Var.c();
            kd4Var.j(str);
            kd4Var.f(':');
            kd4Var.l();
            F(strA);
            this.l = null;
            this.m = null;
        }
        if (this.g == qijVarC) {
            return this;
        }
        gh9[] gh9VarArr = this.h;
        return (gh9VarArr == null || (gh9Var = gh9VarArr[qijVarC.ordinal()]) == null) ? new tqg(kd4Var, bg9Var, qijVarC, gh9VarArr) : gh9Var;
    }

    @Override // defpackage.gh9
    public final bg9 d() {
        return this.f;
    }

    @Override // defpackage.wd6, kotlinx.serialization.encoding.Encoder
    public final void e() {
        kd4 kd4Var = this.e;
        kd4Var.getClass();
        ((e99) kd4Var.b).g("null");
    }

    @Override // defpackage.wd6, kotlinx.serialization.encoding.Encoder
    public final void f(double d) {
        if (this.k) {
            F(String.valueOf(d));
        } else {
            ((e99) this.e.b).g(String.valueOf(d));
        }
        if (Math.abs(d) > Double.MAX_VALUE) {
            throw j8.f(Double.valueOf(d), null);
        }
    }

    @Override // defpackage.wd6, kotlinx.serialization.encoding.Encoder
    public final void g(short s) {
        if (this.k) {
            F(String.valueOf((int) s));
        } else {
            this.e.i(s);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x003b  */
    @Override // kotlinx.serialization.encoding.Encoder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h(java.lang.Object r5, defpackage.znf r6) {
        /*
            r4 = this;
            r6.getClass()
            bg9 r0 = r4.f
            rg9 r1 = r0.a
            boolean r2 = r6 instanceof defpackage.n3
            ch3 r1 = r1.j
            if (r2 == 0) goto L12
            ch3 r3 = defpackage.ch3.E
            if (r1 == r3) goto L44
            goto L3b
        L12:
            int r1 = r1.ordinal()
            if (r1 == 0) goto L44
            r3 = 1
            if (r1 == r3) goto L23
            r3 = 2
            if (r1 != r3) goto L1f
            goto L44
        L1f:
            defpackage.mr9.b()
            return
        L23:
            kotlinx.serialization.descriptors.SerialDescriptor r1 = r6.getDescriptor()
            u00 r1 = r1.getKind()
            vsg r3 = defpackage.vsg.l
            boolean r3 = defpackage.x44.r(r1, r3)
            if (r3 != 0) goto L3b
            vsg r3 = defpackage.vsg.o
            boolean r1 = defpackage.x44.r(r1, r3)
            if (r1 == 0) goto L44
        L3b:
            kotlinx.serialization.descriptors.SerialDescriptor r1 = r6.getDescriptor()
            java.lang.String r1 = defpackage.dch.p(r0, r1)
            goto L45
        L44:
            r1 = 0
        L45:
            if (r2 == 0) goto L5d
            r2 = r6
            n3 r2 = (defpackage.n3) r2
            if (r5 == 0) goto L51
            znf r2 = defpackage.nai.z(r2, r4, r5)
            goto L5e
        L51:
            kotlinx.serialization.descriptors.SerialDescriptor r4 = r2.getDescriptor()
            java.lang.String r5 = " should always be non-null. Please report issue to the kotlinx.serialization tracker."
            java.lang.String r6 = "Value for serializer "
            defpackage.xh6.l(r4, r5, r6)
            return
        L5d:
            r2 = r6
        L5e:
            if (r1 == 0) goto L7a
            defpackage.dch.n(r0, r6, r2, r1)
            kotlinx.serialization.descriptors.SerialDescriptor r6 = r2.getDescriptor()
            u00 r6 = r6.getKind()
            defpackage.dch.o(r6)
            kotlinx.serialization.descriptors.SerialDescriptor r6 = r2.getDescriptor()
            java.lang.String r6 = r6.a()
            r4.l = r1
            r4.m = r6
        L7a:
            r2.serialize(r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tqg.h(java.lang.Object, znf):void");
    }

    @Override // defpackage.wd6, kotlinx.serialization.encoding.Encoder
    public final void i(byte b) {
        if (this.k) {
            F(String.valueOf((int) b));
        } else {
            this.e.e(b);
        }
    }

    @Override // defpackage.wd6, kotlinx.serialization.encoding.Encoder
    public final void j(boolean z) {
        if (this.k) {
            F(String.valueOf(z));
        } else {
            ((e99) this.e.b).g(String.valueOf(z));
        }
    }

    @Override // defpackage.wd6
    public final void l0(SerialDescriptor serialDescriptor, int i) {
        serialDescriptor.getClass();
        int iOrdinal = this.g.ordinal();
        kd4 kd4Var = this.e;
        boolean z = true;
        if (iOrdinal == 1) {
            if (!kd4Var.a) {
                kd4Var.f(',');
            }
            kd4Var.c();
            return;
        }
        if (iOrdinal == 2) {
            if (kd4Var.a) {
                this.k = true;
                kd4Var.c();
                return;
            }
            if (i % 2 == 0) {
                kd4Var.f(',');
                kd4Var.c();
            } else {
                kd4Var.f(':');
                kd4Var.l();
                z = false;
            }
            this.k = z;
            return;
        }
        if (iOrdinal == 3) {
            if (i == 0) {
                this.k = true;
            }
            if (i == 1) {
                kd4Var.f(',');
                kd4Var.l();
                this.k = false;
                return;
            }
            return;
        }
        if (!kd4Var.a) {
            kd4Var.f(',');
        }
        kd4Var.c();
        bg9 bg9Var = this.f;
        bg9Var.getClass();
        nh9.d(bg9Var, serialDescriptor);
        F(serialDescriptor.f(i));
        kd4Var.f(':');
        kd4Var.l();
    }

    @Override // defpackage.wd6, kotlinx.serialization.encoding.Encoder
    public final void m(float f) {
        if (this.k) {
            F(String.valueOf(f));
        } else {
            ((e99) this.e.b).g(String.valueOf(f));
        }
        if (Math.abs(f) > Float.MAX_VALUE) {
            throw j8.f(Float.valueOf(f), null);
        }
    }

    @Override // defpackage.wd6, kotlinx.serialization.encoding.Encoder
    public final void o(char c) {
        F(String.valueOf(c));
    }

    @Override // defpackage.wd6, kotlinx.serialization.encoding.Encoder
    public final void t(SerialDescriptor serialDescriptor, int i) {
        serialDescriptor.getClass();
        F(serialDescriptor.f(i));
    }

    @Override // defpackage.gh9
    public final void u(JsonElement jsonElement) {
        jsonElement.getClass();
        if (this.l == null || (jsonElement instanceof JsonObject)) {
            h(jsonElement, eh9.a);
        } else {
            dch.S(this.m, jsonElement);
            throw null;
        }
    }

    @Override // defpackage.wd6, kotlinx.serialization.encoding.Encoder
    public final void w(int i) {
        if (this.k) {
            F(String.valueOf(i));
        } else {
            this.e.g(i);
        }
    }

    @Override // defpackage.wd6, kotlinx.serialization.encoding.Encoder
    public final Encoder x(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        boolean zA = uqg.a(serialDescriptor);
        qij qijVar = this.g;
        bg9 bg9Var = this.f;
        kd4 nd4Var = this.e;
        if (zA) {
            if (!(nd4Var instanceof od4)) {
                nd4Var = new od4((e99) nd4Var.b, this.k);
            }
            return new tqg(nd4Var, bg9Var, qijVar, null);
        }
        if (serialDescriptor.isInline() && serialDescriptor.equals(ch9.a)) {
            if (!(nd4Var instanceof nd4)) {
                nd4Var = new nd4((e99) nd4Var.b, this.k);
            }
            return new tqg(nd4Var, bg9Var, qijVar, null);
        }
        if (this.l != null) {
            this.m = serialDescriptor.a();
        }
        return this;
    }
}
