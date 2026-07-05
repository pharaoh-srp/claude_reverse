package defpackage;

import com.anthropic.claude.api.experience.ExperienceToggle;
import java.util.ArrayList;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;

/* JADX INFO: loaded from: classes.dex */
public abstract class c2 implements gh9, Encoder, vd4 {
    public final ArrayList a = new ArrayList();
    public final bg9 b;
    public final bz7 c;
    public final rg9 d;
    public String e;
    public String f;

    public c2(bg9 bg9Var, bz7 bz7Var) {
        this.b = bg9Var;
        this.c = bz7Var;
        this.d = bg9Var.a;
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final void A(long j) {
        String str = (String) M();
        str.getClass();
        N(str, ch9.b(Long.valueOf(j)));
    }

    @Override // defpackage.vd4
    public void B(SerialDescriptor serialDescriptor, int i, znf znfVar, Object obj) {
        serialDescriptor.getClass();
        znfVar.getClass();
        this.a.add(L(serialDescriptor, i));
        if (znfVar.getDescriptor().c()) {
            h(obj, znfVar);
        } else if (obj == null) {
            e();
        } else {
            h(obj, znfVar);
        }
    }

    @Override // defpackage.vd4
    public final Encoder C(gfd gfdVar, int i) {
        gfdVar.getClass();
        return J(L(gfdVar, i), gfdVar.h(i));
    }

    @Override // defpackage.vd4
    public final void D(SerialDescriptor serialDescriptor, int i, long j) {
        serialDescriptor.getClass();
        N(L(serialDescriptor, i), ch9.b(Long.valueOf(j)));
    }

    @Override // defpackage.vd4
    public final boolean E(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        return this.d.a;
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final void F(String str) {
        str.getClass();
        String str2 = (String) M();
        str2.getClass();
        N(str2, ch9.c(str));
    }

    public String G(SerialDescriptor serialDescriptor, int i) {
        serialDescriptor.getClass();
        bg9 bg9Var = this.b;
        bg9Var.getClass();
        nh9.d(bg9Var, serialDescriptor);
        return serialDescriptor.f(i);
    }

    public final void H(Object obj, double d) {
        String str = (String) obj;
        str.getClass();
        N(str, ch9.b(Double.valueOf(d)));
        this.d.getClass();
        if (Math.abs(d) > Double.MAX_VALUE) {
            throw j8.f(Double.valueOf(d), str);
        }
    }

    public final void I(Object obj, float f) {
        String str = (String) obj;
        str.getClass();
        N(str, ch9.b(Float.valueOf(f)));
        this.d.getClass();
        if (Math.abs(f) > Float.MAX_VALUE) {
            throw j8.f(Float.valueOf(f), str);
        }
    }

    public final Encoder J(Object obj, SerialDescriptor serialDescriptor) {
        String str = (String) obj;
        str.getClass();
        serialDescriptor.getClass();
        if (uqg.a(serialDescriptor)) {
            return new b2(this, str);
        }
        if (serialDescriptor.isInline() && serialDescriptor.equals(ch9.a)) {
            return new b2(this, str, serialDescriptor);
        }
        this.a.add(str);
        return this;
    }

    public abstract JsonElement K();

    public final String L(SerialDescriptor serialDescriptor, int i) {
        serialDescriptor.getClass();
        String strG = G(serialDescriptor, i);
        strG.getClass();
        return strG;
    }

    public final Object M() {
        ArrayList arrayList = this.a;
        if (arrayList.isEmpty()) {
            throw new SerializationException("No tag in stack for requested element");
        }
        return arrayList.remove(x44.M(arrayList));
    }

    public abstract void N(String str, JsonElement jsonElement);

    @Override // kotlinx.serialization.encoding.Encoder
    public final fof a() {
        return this.b.b;
    }

    @Override // defpackage.vd4
    public final void b(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        if (!this.a.isEmpty()) {
            M();
        }
        this.c.invoke(K());
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final vd4 c(SerialDescriptor serialDescriptor) {
        ui9 ui9Var;
        ui9 ui9Var2;
        serialDescriptor.getClass();
        bz7 a2Var = w44.V0(this.a) == null ? this.c : new a2(0, this);
        u00 kind = serialDescriptor.getKind();
        boolean zR = x44.r(kind, vsg.m);
        bg9 bg9Var = this.b;
        if (zR || (kind instanceof u8d)) {
            ui9Var = new ui9(bg9Var, a2Var, 1);
        } else {
            if (x44.r(kind, vsg.n)) {
                SerialDescriptor serialDescriptorA = rij.a(serialDescriptor.h(0), bg9Var.b);
                u00 kind2 = serialDescriptorA.getKind();
                if ((kind2 instanceof kfd) || x44.r(kind2, mnf.l)) {
                    a2Var.getClass();
                    xi9 xi9Var = new xi9(bg9Var, a2Var, 0);
                    xi9Var.j = true;
                    ui9Var2 = xi9Var;
                } else {
                    if (!bg9Var.a.d) {
                        throw j8.g(serialDescriptorA);
                    }
                    ui9Var = new ui9(bg9Var, a2Var, 1);
                }
            } else {
                ui9Var2 = new ui9(bg9Var, a2Var, 0);
            }
            ui9Var = ui9Var2;
        }
        String str = this.e;
        if (str != null) {
            if (ui9Var instanceof xi9) {
                xi9 xi9Var2 = (xi9) ui9Var;
                xi9Var2.N("key", ch9.c(str));
                String strA = this.f;
                if (strA == null) {
                    strA = serialDescriptor.a();
                }
                xi9Var2.N(ExperienceToggle.DEFAULT_PARAM_KEY, ch9.c(strA));
            } else {
                String strA2 = this.f;
                if (strA2 == null) {
                    strA2 = serialDescriptor.a();
                }
                ui9Var.N(str, ch9.c(strA2));
            }
            this.e = null;
            this.f = null;
        }
        return ui9Var;
    }

    @Override // defpackage.gh9
    public final bg9 d() {
        return this.b;
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final void e() {
        String str = (String) w44.V0(this.a);
        if (str == null) {
            this.c.invoke(JsonNull.INSTANCE);
        } else {
            N(str, JsonNull.INSTANCE);
        }
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final void f(double d) {
        H(M(), d);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final void g(short s) {
        String str = (String) M();
        str.getClass();
        N(str, ch9.b(Short.valueOf(s)));
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0068  */
    @Override // kotlinx.serialization.encoding.Encoder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h(java.lang.Object r5, defpackage.znf r6) {
        /*
            r4 = this;
            r6.getClass()
            java.util.ArrayList r0 = r4.a
            java.lang.Object r0 = defpackage.w44.V0(r0)
            bg9 r1 = r4.b
            if (r0 != 0) goto L32
            kotlinx.serialization.descriptors.SerialDescriptor r0 = r6.getDescriptor()
            fof r2 = r1.b
            kotlinx.serialization.descriptors.SerialDescriptor r0 = defpackage.rij.a(r0, r2)
            u00 r2 = r0.getKind()
            boolean r2 = r2 instanceof defpackage.kfd
            if (r2 != 0) goto L27
            u00 r0 = r0.getKind()
            mnf r2 = defpackage.mnf.l
            if (r0 != r2) goto L32
        L27:
            xh9 r0 = new xh9
            bz7 r4 = r4.c
            r0.<init>(r1, r4)
            r0.h(r5, r6)
            return
        L32:
            rg9 r0 = r1.a
            boolean r2 = r6 instanceof defpackage.n3
            ch3 r0 = r0.j
            if (r2 == 0) goto L3f
            ch3 r3 = defpackage.ch3.E
            if (r0 == r3) goto L71
            goto L68
        L3f:
            int r0 = r0.ordinal()
            if (r0 == 0) goto L71
            r3 = 1
            if (r0 == r3) goto L50
            r3 = 2
            if (r0 != r3) goto L4c
            goto L71
        L4c:
            defpackage.mr9.b()
            return
        L50:
            kotlinx.serialization.descriptors.SerialDescriptor r0 = r6.getDescriptor()
            u00 r0 = r0.getKind()
            vsg r3 = defpackage.vsg.l
            boolean r3 = defpackage.x44.r(r0, r3)
            if (r3 != 0) goto L68
            vsg r3 = defpackage.vsg.o
            boolean r0 = defpackage.x44.r(r0, r3)
            if (r0 == 0) goto L71
        L68:
            kotlinx.serialization.descriptors.SerialDescriptor r0 = r6.getDescriptor()
            java.lang.String r0 = defpackage.dch.p(r1, r0)
            goto L72
        L71:
            r0 = 0
        L72:
            if (r2 == 0) goto L8a
            r2 = r6
            n3 r2 = (defpackage.n3) r2
            if (r5 == 0) goto L7e
            znf r2 = defpackage.nai.z(r2, r4, r5)
            goto L8b
        L7e:
            kotlinx.serialization.descriptors.SerialDescriptor r4 = r2.getDescriptor()
            java.lang.String r5 = " should always be non-null. Please report issue to the kotlinx.serialization tracker."
            java.lang.String r6 = "Value for serializer "
            defpackage.xh6.l(r4, r5, r6)
            return
        L8a:
            r2 = r6
        L8b:
            if (r0 == 0) goto La7
            defpackage.dch.n(r1, r6, r2, r0)
            kotlinx.serialization.descriptors.SerialDescriptor r6 = r2.getDescriptor()
            u00 r6 = r6.getKind()
            defpackage.dch.o(r6)
            kotlinx.serialization.descriptors.SerialDescriptor r6 = r2.getDescriptor()
            java.lang.String r6 = r6.a()
            r4.e = r0
            r4.f = r6
        La7:
            r2.serialize(r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c2.h(java.lang.Object, znf):void");
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final void i(byte b) {
        String str = (String) M();
        str.getClass();
        N(str, ch9.b(Byte.valueOf(b)));
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final void j(boolean z) {
        String str = (String) M();
        str.getClass();
        N(str, ch9.a(Boolean.valueOf(z)));
    }

    @Override // defpackage.vd4
    public final void k(SerialDescriptor serialDescriptor, int i, float f) {
        serialDescriptor.getClass();
        I(L(serialDescriptor, i), f);
    }

    @Override // defpackage.vd4
    public final void l(int i, int i2, SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        N(L(serialDescriptor, i), ch9.b(Integer.valueOf(i2)));
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final void m(float f) {
        I(M(), f);
    }

    @Override // defpackage.vd4
    public final void n(gfd gfdVar, int i, byte b) {
        gfdVar.getClass();
        N(L(gfdVar, i), ch9.b(Byte.valueOf(b)));
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final void o(char c) {
        String str = (String) M();
        str.getClass();
        N(str, ch9.c(String.valueOf(c)));
    }

    @Override // defpackage.vd4
    public final void p(SerialDescriptor serialDescriptor, int i, boolean z) {
        serialDescriptor.getClass();
        N(L(serialDescriptor, i), ch9.a(Boolean.valueOf(z)));
    }

    @Override // defpackage.vd4
    public final void q(SerialDescriptor serialDescriptor, int i, String str) {
        serialDescriptor.getClass();
        str.getClass();
        N(L(serialDescriptor, i), ch9.c(str));
    }

    @Override // defpackage.vd4
    public final void r(SerialDescriptor serialDescriptor, int i, znf znfVar, Object obj) {
        serialDescriptor.getClass();
        znfVar.getClass();
        this.a.add(L(serialDescriptor, i));
        h(obj, znfVar);
    }

    @Override // defpackage.vd4
    public final void s(gfd gfdVar, int i, short s) {
        gfdVar.getClass();
        N(L(gfdVar, i), ch9.b(Short.valueOf(s)));
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final void t(SerialDescriptor serialDescriptor, int i) {
        serialDescriptor.getClass();
        String str = (String) M();
        str.getClass();
        N(str, ch9.c(serialDescriptor.f(i)));
    }

    @Override // defpackage.gh9
    public final void u(JsonElement jsonElement) {
        jsonElement.getClass();
        if (this.e == null || (jsonElement instanceof JsonObject)) {
            h(jsonElement, eh9.a);
        } else {
            dch.S(this.f, jsonElement);
            throw null;
        }
    }

    @Override // defpackage.vd4
    public final void v(gfd gfdVar, int i, char c) {
        gfdVar.getClass();
        N(L(gfdVar, i), ch9.c(String.valueOf(c)));
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final void w(int i) {
        String str = (String) M();
        str.getClass();
        N(str, ch9.b(Integer.valueOf(i)));
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final Encoder x(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        if (w44.V0(this.a) == null) {
            return new xh9(this.b, this.c).x(serialDescriptor);
        }
        if (this.e != null) {
            this.f = serialDescriptor.a();
        }
        return J(M(), serialDescriptor);
    }

    @Override // defpackage.vd4
    public final void z(SerialDescriptor serialDescriptor, int i, double d) {
        serialDescriptor.getClass();
        H(L(serialDescriptor, i), d);
    }
}
