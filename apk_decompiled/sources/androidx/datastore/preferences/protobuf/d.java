package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.InvalidProtocolBufferException;
import defpackage.cfj;
import defpackage.g7f;
import defpackage.i22;
import defpackage.pc7;
import defpackage.s3;
import defpackage.sud;
import defpackage.sz6;
import defpackage.u34;
import defpackage.w89;
import defpackage.xud;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes.dex */
public final class d {
    public final u34 a;
    public int b;
    public int c;
    public int d = 0;

    public d(u34 u34Var) {
        Charset charset = w89.a;
        this.a = u34Var;
        u34Var.c = this;
    }

    public static void y(int i) throws InvalidProtocolBufferException {
        if ((i & 3) != 0) {
            throw new InvalidProtocolBufferException("Failed to parse the message.");
        }
    }

    public static void z(int i) throws InvalidProtocolBufferException {
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
            this.b = this.a.u();
        }
        int i2 = this.b;
        if (i2 == 0 || i2 == this.c) {
            return Integer.MAX_VALUE;
        }
        return i2 >>> 3;
    }

    public final void b(Object obj, g7f g7fVar, pc7 pc7Var) {
        int i = this.c;
        this.c = ((this.b >>> 3) << 3) | 4;
        try {
            g7fVar.e(obj, this, pc7Var);
            if (this.b == this.c) {
            } else {
                throw new InvalidProtocolBufferException("Failed to parse the message.");
            }
        } finally {
            this.c = i;
        }
    }

    public final void c(Object obj, g7f g7fVar, pc7 pc7Var) throws InvalidProtocolBufferException {
        u34 u34Var = this.a;
        int iV = u34Var.v();
        if (u34Var.a + u34Var.b >= 100) {
            throw new InvalidProtocolBufferException("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int iE = u34Var.e(iV);
        u34Var.a++;
        g7fVar.e(obj, this, pc7Var);
        u34Var.a(0);
        u34Var.a--;
        u34Var.d(iE);
    }

    public final void d(s3 s3Var) throws InvalidProtocolBufferException {
        int iU;
        int i = this.b & 7;
        u34 u34Var = this.a;
        if (i == 0) {
            do {
                ((xud) s3Var).add(Boolean.valueOf(u34Var.f()));
                if (u34Var.c()) {
                    return;
                } else {
                    iU = u34Var.u();
                }
            } while (iU == this.b);
            this.d = iU;
            return;
        }
        if (i != 2) {
            throw InvalidProtocolBufferException.b();
        }
        int iB = u34Var.b() + u34Var.v();
        do {
            ((xud) s3Var).add(Boolean.valueOf(u34Var.f()));
        } while (u34Var.b() < iB);
        v(iB);
    }

    public final i22 e() throws InvalidProtocolBufferException.InvalidWireTypeException {
        w(2);
        return this.a.g();
    }

    public final void f(s3 s3Var) throws InvalidProtocolBufferException.InvalidWireTypeException {
        int iU;
        if ((this.b & 7) != 2) {
            throw InvalidProtocolBufferException.b();
        }
        do {
            ((xud) s3Var).add(e());
            u34 u34Var = this.a;
            if (u34Var.c()) {
                return;
            } else {
                iU = u34Var.u();
            }
        } while (iU == this.b);
        this.d = iU;
    }

    public final void g(s3 s3Var) throws InvalidProtocolBufferException {
        int iU;
        int i = this.b & 7;
        u34 u34Var = this.a;
        if (i == 1) {
            do {
                ((xud) s3Var).add(Double.valueOf(u34Var.h()));
                if (u34Var.c()) {
                    return;
                } else {
                    iU = u34Var.u();
                }
            } while (iU == this.b);
            this.d = iU;
            return;
        }
        if (i != 2) {
            throw InvalidProtocolBufferException.b();
        }
        int iV = u34Var.v();
        z(iV);
        int iB = u34Var.b() + iV;
        do {
            ((xud) s3Var).add(Double.valueOf(u34Var.h()));
        } while (u34Var.b() < iB);
    }

    public final void h(s3 s3Var) throws InvalidProtocolBufferException {
        int iU;
        int i = this.b & 7;
        u34 u34Var = this.a;
        if (i == 0) {
            do {
                ((xud) s3Var).add(Integer.valueOf(u34Var.i()));
                if (u34Var.c()) {
                    return;
                } else {
                    iU = u34Var.u();
                }
            } while (iU == this.b);
            this.d = iU;
            return;
        }
        if (i != 2) {
            throw InvalidProtocolBufferException.b();
        }
        int iB = u34Var.b() + u34Var.v();
        do {
            ((xud) s3Var).add(Integer.valueOf(u34Var.i()));
        } while (u34Var.b() < iB);
        v(iB);
    }

    public final Object i(cfj cfjVar, Class cls, pc7 pc7Var) throws InvalidProtocolBufferException {
        int iOrdinal = cfjVar.ordinal();
        u34 u34Var = this.a;
        switch (iOrdinal) {
            case 0:
                w(1);
                return Double.valueOf(u34Var.h());
            case 1:
                w(5);
                return Float.valueOf(u34Var.l());
            case 2:
                w(0);
                return Long.valueOf(u34Var.n());
            case 3:
                w(0);
                return Long.valueOf(u34Var.w());
            case 4:
                w(0);
                return Integer.valueOf(u34Var.m());
            case 5:
                w(1);
                return Long.valueOf(u34Var.k());
            case 6:
                w(5);
                return Integer.valueOf(u34Var.j());
            case 7:
                w(0);
                return Boolean.valueOf(u34Var.f());
            case 8:
                w(2);
                return u34Var.t();
            case 9:
            default:
                sz6.p("unsupported field type.");
                return null;
            case 10:
                w(2);
                g7f g7fVarA = sud.c.a(cls);
                f fVarD = g7fVarA.d();
                c(fVarD, g7fVarA, pc7Var);
                g7fVarA.b(fVarD);
                return fVarD;
            case 11:
                return e();
            case 12:
                w(0);
                return Integer.valueOf(u34Var.v());
            case 13:
                w(0);
                return Integer.valueOf(u34Var.i());
            case 14:
                w(5);
                return Integer.valueOf(u34Var.o());
            case androidx.health.platform.client.proto.g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                w(1);
                return Long.valueOf(u34Var.p());
            case 16:
                w(0);
                return Integer.valueOf(u34Var.q());
            case androidx.health.platform.client.proto.g.MAX_FIELD_NUMBER /* 17 */:
                w(0);
                return Long.valueOf(u34Var.r());
        }
    }

    public final void j(s3 s3Var) throws InvalidProtocolBufferException {
        int iU;
        int i = this.b & 7;
        u34 u34Var = this.a;
        if (i == 2) {
            int iV = u34Var.v();
            y(iV);
            int iB = u34Var.b() + iV;
            do {
                ((xud) s3Var).add(Integer.valueOf(u34Var.j()));
            } while (u34Var.b() < iB);
            return;
        }
        if (i != 5) {
            throw InvalidProtocolBufferException.b();
        }
        do {
            ((xud) s3Var).add(Integer.valueOf(u34Var.j()));
            if (u34Var.c()) {
                return;
            } else {
                iU = u34Var.u();
            }
        } while (iU == this.b);
        this.d = iU;
    }

    public final void k(s3 s3Var) throws InvalidProtocolBufferException {
        int iU;
        int i = this.b & 7;
        u34 u34Var = this.a;
        if (i == 1) {
            do {
                ((xud) s3Var).add(Long.valueOf(u34Var.k()));
                if (u34Var.c()) {
                    return;
                } else {
                    iU = u34Var.u();
                }
            } while (iU == this.b);
            this.d = iU;
            return;
        }
        if (i != 2) {
            throw InvalidProtocolBufferException.b();
        }
        int iV = u34Var.v();
        z(iV);
        int iB = u34Var.b() + iV;
        do {
            ((xud) s3Var).add(Long.valueOf(u34Var.k()));
        } while (u34Var.b() < iB);
    }

    public final void l(s3 s3Var) throws InvalidProtocolBufferException {
        int iU;
        int i = this.b & 7;
        u34 u34Var = this.a;
        if (i == 2) {
            int iV = u34Var.v();
            y(iV);
            int iB = u34Var.b() + iV;
            do {
                ((xud) s3Var).add(Float.valueOf(u34Var.l()));
            } while (u34Var.b() < iB);
            return;
        }
        if (i != 5) {
            throw InvalidProtocolBufferException.b();
        }
        do {
            ((xud) s3Var).add(Float.valueOf(u34Var.l()));
            if (u34Var.c()) {
                return;
            } else {
                iU = u34Var.u();
            }
        } while (iU == this.b);
        this.d = iU;
    }

    public final void m(s3 s3Var) throws InvalidProtocolBufferException {
        int iU;
        int i = this.b & 7;
        u34 u34Var = this.a;
        if (i == 0) {
            do {
                ((xud) s3Var).add(Integer.valueOf(u34Var.m()));
                if (u34Var.c()) {
                    return;
                } else {
                    iU = u34Var.u();
                }
            } while (iU == this.b);
            this.d = iU;
            return;
        }
        if (i != 2) {
            throw InvalidProtocolBufferException.b();
        }
        int iB = u34Var.b() + u34Var.v();
        do {
            ((xud) s3Var).add(Integer.valueOf(u34Var.m()));
        } while (u34Var.b() < iB);
        v(iB);
    }

    public final void n(s3 s3Var) throws InvalidProtocolBufferException {
        int iU;
        int i = this.b & 7;
        u34 u34Var = this.a;
        if (i == 0) {
            do {
                ((xud) s3Var).add(Long.valueOf(u34Var.n()));
                if (u34Var.c()) {
                    return;
                } else {
                    iU = u34Var.u();
                }
            } while (iU == this.b);
            this.d = iU;
            return;
        }
        if (i != 2) {
            throw InvalidProtocolBufferException.b();
        }
        int iB = u34Var.b() + u34Var.v();
        do {
            ((xud) s3Var).add(Long.valueOf(u34Var.n()));
        } while (u34Var.b() < iB);
        v(iB);
    }

    public final void o(s3 s3Var) throws InvalidProtocolBufferException {
        int iU;
        int i = this.b & 7;
        u34 u34Var = this.a;
        if (i == 2) {
            int iV = u34Var.v();
            y(iV);
            int iB = u34Var.b() + iV;
            do {
                ((xud) s3Var).add(Integer.valueOf(u34Var.o()));
            } while (u34Var.b() < iB);
            return;
        }
        if (i != 5) {
            throw InvalidProtocolBufferException.b();
        }
        do {
            ((xud) s3Var).add(Integer.valueOf(u34Var.o()));
            if (u34Var.c()) {
                return;
            } else {
                iU = u34Var.u();
            }
        } while (iU == this.b);
        this.d = iU;
    }

    public final void p(s3 s3Var) throws InvalidProtocolBufferException {
        int iU;
        int i = this.b & 7;
        u34 u34Var = this.a;
        if (i == 1) {
            do {
                ((xud) s3Var).add(Long.valueOf(u34Var.p()));
                if (u34Var.c()) {
                    return;
                } else {
                    iU = u34Var.u();
                }
            } while (iU == this.b);
            this.d = iU;
            return;
        }
        if (i != 2) {
            throw InvalidProtocolBufferException.b();
        }
        int iV = u34Var.v();
        z(iV);
        int iB = u34Var.b() + iV;
        do {
            ((xud) s3Var).add(Long.valueOf(u34Var.p()));
        } while (u34Var.b() < iB);
    }

    public final void q(s3 s3Var) throws InvalidProtocolBufferException {
        int iU;
        int i = this.b & 7;
        u34 u34Var = this.a;
        if (i == 0) {
            do {
                ((xud) s3Var).add(Integer.valueOf(u34Var.q()));
                if (u34Var.c()) {
                    return;
                } else {
                    iU = u34Var.u();
                }
            } while (iU == this.b);
            this.d = iU;
            return;
        }
        if (i != 2) {
            throw InvalidProtocolBufferException.b();
        }
        int iB = u34Var.b() + u34Var.v();
        do {
            ((xud) s3Var).add(Integer.valueOf(u34Var.q()));
        } while (u34Var.b() < iB);
        v(iB);
    }

    public final void r(s3 s3Var) throws InvalidProtocolBufferException {
        int iU;
        int i = this.b & 7;
        u34 u34Var = this.a;
        if (i == 0) {
            do {
                ((xud) s3Var).add(Long.valueOf(u34Var.r()));
                if (u34Var.c()) {
                    return;
                } else {
                    iU = u34Var.u();
                }
            } while (iU == this.b);
            this.d = iU;
            return;
        }
        if (i != 2) {
            throw InvalidProtocolBufferException.b();
        }
        int iB = u34Var.b() + u34Var.v();
        do {
            ((xud) s3Var).add(Long.valueOf(u34Var.r()));
        } while (u34Var.b() < iB);
        v(iB);
    }

    public final void s(s3 s3Var, boolean z) throws InvalidProtocolBufferException.InvalidWireTypeException {
        String strS;
        int iU;
        if ((this.b & 7) != 2) {
            throw InvalidProtocolBufferException.b();
        }
        do {
            u34 u34Var = this.a;
            if (z) {
                w(2);
                strS = u34Var.t();
            } else {
                w(2);
                strS = u34Var.s();
            }
            ((xud) s3Var).add(strS);
            if (u34Var.c()) {
                return;
            } else {
                iU = u34Var.u();
            }
        } while (iU == this.b);
        this.d = iU;
    }

    public final void t(s3 s3Var) throws InvalidProtocolBufferException {
        int iU;
        int i = this.b & 7;
        u34 u34Var = this.a;
        if (i == 0) {
            do {
                ((xud) s3Var).add(Integer.valueOf(u34Var.v()));
                if (u34Var.c()) {
                    return;
                } else {
                    iU = u34Var.u();
                }
            } while (iU == this.b);
            this.d = iU;
            return;
        }
        if (i != 2) {
            throw InvalidProtocolBufferException.b();
        }
        int iB = u34Var.b() + u34Var.v();
        do {
            ((xud) s3Var).add(Integer.valueOf(u34Var.v()));
        } while (u34Var.b() < iB);
        v(iB);
    }

    public final void u(s3 s3Var) throws InvalidProtocolBufferException {
        int iU;
        int i = this.b & 7;
        u34 u34Var = this.a;
        if (i == 0) {
            do {
                ((xud) s3Var).add(Long.valueOf(u34Var.w()));
                if (u34Var.c()) {
                    return;
                } else {
                    iU = u34Var.u();
                }
            } while (iU == this.b);
            this.d = iU;
            return;
        }
        if (i != 2) {
            throw InvalidProtocolBufferException.b();
        }
        int iB = u34Var.b() + u34Var.v();
        do {
            ((xud) s3Var).add(Long.valueOf(u34Var.w()));
        } while (u34Var.b() < iB);
        v(iB);
    }

    public final void v(int i) throws InvalidProtocolBufferException {
        if (this.a.b() != i) {
            throw InvalidProtocolBufferException.e();
        }
    }

    public final void w(int i) throws InvalidProtocolBufferException.InvalidWireTypeException {
        if ((this.b & 7) != i) {
            throw InvalidProtocolBufferException.b();
        }
    }

    public final boolean x() {
        int i;
        u34 u34Var = this.a;
        if (u34Var.c() || (i = this.b) == this.c) {
            return false;
        }
        return u34Var.x(i);
    }
}
