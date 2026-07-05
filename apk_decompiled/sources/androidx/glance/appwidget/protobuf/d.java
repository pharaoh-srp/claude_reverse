package androidx.glance.appwidget.protobuf;

import androidx.glance.appwidget.protobuf.InvalidProtocolBufferException;
import defpackage.c7f;
import defpackage.e22;
import defpackage.kc7;
import defpackage.n89;
import defpackage.r34;
import defpackage.r89;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes2.dex */
public final class d {
    public final r34 a;
    public int b;
    public int c;
    public int d = 0;

    public d(r34 r34Var) {
        Charset charset = r89.a;
        this.a = r34Var;
        r34Var.b = this;
    }

    public static void w(int i) throws InvalidProtocolBufferException {
        if ((i & 3) != 0) {
            throw new InvalidProtocolBufferException("Failed to parse the message.");
        }
    }

    public static void x(int i) throws InvalidProtocolBufferException {
        if ((i & 7) != 0) {
            throw new InvalidProtocolBufferException("Failed to parse the message.");
        }
    }

    public final int a() {
        int i = this.d;
        if (i != 0) {
            this.b = i;
            this.d = 0;
        } else {
            this.b = this.a.C();
        }
        int i2 = this.b;
        if (i2 == 0 || i2 == this.c) {
            return Integer.MAX_VALUE;
        }
        return i2 >>> 3;
    }

    public final void b(Object obj, c7f c7fVar, kc7 kc7Var) {
        int i = this.c;
        this.c = ((this.b >>> 3) << 3) | 4;
        try {
            c7fVar.f(obj, this, kc7Var);
            if (this.b == this.c) {
            } else {
                throw new InvalidProtocolBufferException("Failed to parse the message.");
            }
        } finally {
            this.c = i;
        }
    }

    public final void c(Object obj, c7f c7fVar, kc7 kc7Var) throws InvalidProtocolBufferException {
        r34 r34Var = this.a;
        int iD = r34Var.D();
        if (r34Var.a >= 100) {
            throw new InvalidProtocolBufferException("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int iL = r34Var.l(iD);
        r34Var.a++;
        c7fVar.f(obj, this, kc7Var);
        r34Var.b(0);
        r34Var.a--;
        r34Var.j(iL);
    }

    public final void d(n89 n89Var) throws InvalidProtocolBufferException {
        int iC;
        int i = this.b & 7;
        r34 r34Var = this.a;
        if (i == 0) {
            do {
                n89Var.add(Boolean.valueOf(r34Var.m()));
                if (r34Var.g()) {
                    return;
                } else {
                    iC = r34Var.C();
                }
            } while (iC == this.b);
            this.d = iC;
            return;
        }
        if (i != 2) {
            throw InvalidProtocolBufferException.b();
        }
        int iF = r34Var.f() + r34Var.D();
        do {
            n89Var.add(Boolean.valueOf(r34Var.m()));
        } while (r34Var.f() < iF);
        u(iF);
    }

    public final e22 e() throws InvalidProtocolBufferException.InvalidWireTypeException {
        v(2);
        return this.a.n();
    }

    public final void f(n89 n89Var) throws InvalidProtocolBufferException.InvalidWireTypeException {
        int iC;
        if ((this.b & 7) != 2) {
            throw InvalidProtocolBufferException.b();
        }
        do {
            n89Var.add(e());
            r34 r34Var = this.a;
            if (r34Var.g()) {
                return;
            } else {
                iC = r34Var.C();
            }
        } while (iC == this.b);
        this.d = iC;
    }

    public final void g(n89 n89Var) throws InvalidProtocolBufferException {
        int iC;
        int i = this.b & 7;
        r34 r34Var = this.a;
        if (i == 1) {
            do {
                n89Var.add(Double.valueOf(r34Var.p()));
                if (r34Var.g()) {
                    return;
                } else {
                    iC = r34Var.C();
                }
            } while (iC == this.b);
            this.d = iC;
            return;
        }
        if (i != 2) {
            throw InvalidProtocolBufferException.b();
        }
        int iD = r34Var.D();
        x(iD);
        int iF = r34Var.f() + iD;
        do {
            n89Var.add(Double.valueOf(r34Var.p()));
        } while (r34Var.f() < iF);
    }

    public final void h(n89 n89Var) throws InvalidProtocolBufferException {
        int iC;
        int i = this.b & 7;
        r34 r34Var = this.a;
        if (i == 0) {
            do {
                n89Var.add(Integer.valueOf(r34Var.q()));
                if (r34Var.g()) {
                    return;
                } else {
                    iC = r34Var.C();
                }
            } while (iC == this.b);
            this.d = iC;
            return;
        }
        if (i != 2) {
            throw InvalidProtocolBufferException.b();
        }
        int iF = r34Var.f() + r34Var.D();
        do {
            n89Var.add(Integer.valueOf(r34Var.q()));
        } while (r34Var.f() < iF);
        u(iF);
    }

    public final void i(n89 n89Var) throws InvalidProtocolBufferException {
        int iC;
        int i = this.b & 7;
        r34 r34Var = this.a;
        if (i == 2) {
            int iD = r34Var.D();
            w(iD);
            int iF = r34Var.f() + iD;
            do {
                n89Var.add(Integer.valueOf(r34Var.r()));
            } while (r34Var.f() < iF);
            return;
        }
        if (i != 5) {
            throw InvalidProtocolBufferException.b();
        }
        do {
            n89Var.add(Integer.valueOf(r34Var.r()));
            if (r34Var.g()) {
                return;
            } else {
                iC = r34Var.C();
            }
        } while (iC == this.b);
        this.d = iC;
    }

    public final void j(n89 n89Var) throws InvalidProtocolBufferException {
        int iC;
        int i = this.b & 7;
        r34 r34Var = this.a;
        if (i == 1) {
            do {
                n89Var.add(Long.valueOf(r34Var.s()));
                if (r34Var.g()) {
                    return;
                } else {
                    iC = r34Var.C();
                }
            } while (iC == this.b);
            this.d = iC;
            return;
        }
        if (i != 2) {
            throw InvalidProtocolBufferException.b();
        }
        int iD = r34Var.D();
        x(iD);
        int iF = r34Var.f() + iD;
        do {
            n89Var.add(Long.valueOf(r34Var.s()));
        } while (r34Var.f() < iF);
    }

    public final void k(n89 n89Var) throws InvalidProtocolBufferException {
        int iC;
        int i = this.b & 7;
        r34 r34Var = this.a;
        if (i == 2) {
            int iD = r34Var.D();
            w(iD);
            int iF = r34Var.f() + iD;
            do {
                n89Var.add(Float.valueOf(r34Var.t()));
            } while (r34Var.f() < iF);
            return;
        }
        if (i != 5) {
            throw InvalidProtocolBufferException.b();
        }
        do {
            n89Var.add(Float.valueOf(r34Var.t()));
            if (r34Var.g()) {
                return;
            } else {
                iC = r34Var.C();
            }
        } while (iC == this.b);
        this.d = iC;
    }

    public final void l(n89 n89Var) throws InvalidProtocolBufferException {
        int iC;
        int i = this.b & 7;
        r34 r34Var = this.a;
        if (i == 0) {
            do {
                n89Var.add(Integer.valueOf(r34Var.u()));
                if (r34Var.g()) {
                    return;
                } else {
                    iC = r34Var.C();
                }
            } while (iC == this.b);
            this.d = iC;
            return;
        }
        if (i != 2) {
            throw InvalidProtocolBufferException.b();
        }
        int iF = r34Var.f() + r34Var.D();
        do {
            n89Var.add(Integer.valueOf(r34Var.u()));
        } while (r34Var.f() < iF);
        u(iF);
    }

    public final void m(n89 n89Var) throws InvalidProtocolBufferException {
        int iC;
        int i = this.b & 7;
        r34 r34Var = this.a;
        if (i == 0) {
            do {
                n89Var.add(Long.valueOf(r34Var.v()));
                if (r34Var.g()) {
                    return;
                } else {
                    iC = r34Var.C();
                }
            } while (iC == this.b);
            this.d = iC;
            return;
        }
        if (i != 2) {
            throw InvalidProtocolBufferException.b();
        }
        int iF = r34Var.f() + r34Var.D();
        do {
            n89Var.add(Long.valueOf(r34Var.v()));
        } while (r34Var.f() < iF);
        u(iF);
    }

    public final void n(n89 n89Var) throws InvalidProtocolBufferException {
        int iC;
        int i = this.b & 7;
        r34 r34Var = this.a;
        if (i == 2) {
            int iD = r34Var.D();
            w(iD);
            int iF = r34Var.f() + iD;
            do {
                n89Var.add(Integer.valueOf(r34Var.w()));
            } while (r34Var.f() < iF);
            return;
        }
        if (i != 5) {
            throw InvalidProtocolBufferException.b();
        }
        do {
            n89Var.add(Integer.valueOf(r34Var.w()));
            if (r34Var.g()) {
                return;
            } else {
                iC = r34Var.C();
            }
        } while (iC == this.b);
        this.d = iC;
    }

    public final void o(n89 n89Var) throws InvalidProtocolBufferException {
        int iC;
        int i = this.b & 7;
        r34 r34Var = this.a;
        if (i == 1) {
            do {
                n89Var.add(Long.valueOf(r34Var.x()));
                if (r34Var.g()) {
                    return;
                } else {
                    iC = r34Var.C();
                }
            } while (iC == this.b);
            this.d = iC;
            return;
        }
        if (i != 2) {
            throw InvalidProtocolBufferException.b();
        }
        int iD = r34Var.D();
        x(iD);
        int iF = r34Var.f() + iD;
        do {
            n89Var.add(Long.valueOf(r34Var.x()));
        } while (r34Var.f() < iF);
    }

    public final void p(n89 n89Var) throws InvalidProtocolBufferException {
        int iC;
        int i = this.b & 7;
        r34 r34Var = this.a;
        if (i == 0) {
            do {
                n89Var.add(Integer.valueOf(r34Var.y()));
                if (r34Var.g()) {
                    return;
                } else {
                    iC = r34Var.C();
                }
            } while (iC == this.b);
            this.d = iC;
            return;
        }
        if (i != 2) {
            throw InvalidProtocolBufferException.b();
        }
        int iF = r34Var.f() + r34Var.D();
        do {
            n89Var.add(Integer.valueOf(r34Var.y()));
        } while (r34Var.f() < iF);
        u(iF);
    }

    public final void q(n89 n89Var) throws InvalidProtocolBufferException {
        int iC;
        int i = this.b & 7;
        r34 r34Var = this.a;
        if (i == 0) {
            do {
                n89Var.add(Long.valueOf(r34Var.z()));
                if (r34Var.g()) {
                    return;
                } else {
                    iC = r34Var.C();
                }
            } while (iC == this.b);
            this.d = iC;
            return;
        }
        if (i != 2) {
            throw InvalidProtocolBufferException.b();
        }
        int iF = r34Var.f() + r34Var.D();
        do {
            n89Var.add(Long.valueOf(r34Var.z()));
        } while (r34Var.f() < iF);
        u(iF);
    }

    public final void r(n89 n89Var, boolean z) throws InvalidProtocolBufferException.InvalidWireTypeException {
        String strA;
        int iC;
        if ((this.b & 7) != 2) {
            throw InvalidProtocolBufferException.b();
        }
        do {
            r34 r34Var = this.a;
            if (z) {
                v(2);
                strA = r34Var.B();
            } else {
                v(2);
                strA = r34Var.A();
            }
            n89Var.add(strA);
            if (r34Var.g()) {
                return;
            } else {
                iC = r34Var.C();
            }
        } while (iC == this.b);
        this.d = iC;
    }

    public final void s(n89 n89Var) throws InvalidProtocolBufferException {
        int iC;
        int i = this.b & 7;
        r34 r34Var = this.a;
        if (i == 0) {
            do {
                n89Var.add(Integer.valueOf(r34Var.D()));
                if (r34Var.g()) {
                    return;
                } else {
                    iC = r34Var.C();
                }
            } while (iC == this.b);
            this.d = iC;
            return;
        }
        if (i != 2) {
            throw InvalidProtocolBufferException.b();
        }
        int iF = r34Var.f() + r34Var.D();
        do {
            n89Var.add(Integer.valueOf(r34Var.D()));
        } while (r34Var.f() < iF);
        u(iF);
    }

    public final void t(n89 n89Var) throws InvalidProtocolBufferException {
        int iC;
        int i = this.b & 7;
        r34 r34Var = this.a;
        if (i == 0) {
            do {
                n89Var.add(Long.valueOf(r34Var.E()));
                if (r34Var.g()) {
                    return;
                } else {
                    iC = r34Var.C();
                }
            } while (iC == this.b);
            this.d = iC;
            return;
        }
        if (i != 2) {
            throw InvalidProtocolBufferException.b();
        }
        int iF = r34Var.f() + r34Var.D();
        do {
            n89Var.add(Long.valueOf(r34Var.E()));
        } while (r34Var.f() < iF);
        u(iF);
    }

    public final void u(int i) throws InvalidProtocolBufferException {
        if (this.a.f() != i) {
            throw InvalidProtocolBufferException.e();
        }
    }

    public final void v(int i) throws InvalidProtocolBufferException.InvalidWireTypeException {
        if ((this.b & 7) != i) {
            throw InvalidProtocolBufferException.b();
        }
    }
}
