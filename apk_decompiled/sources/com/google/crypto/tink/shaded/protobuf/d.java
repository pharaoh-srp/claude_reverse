package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import defpackage.cka;
import defpackage.e7f;
import defpackage.fa6;
import defpackage.k22;
import defpackage.mc7;
import defpackage.n69;
import defpackage.no7;
import defpackage.r1a;
import defpackage.r34;
import defpackage.st1;
import defpackage.t89;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class d {
    public final r34 a;
    public int b;
    public int c;
    public int d = 0;

    public d(r34 r34Var) {
        t89.a("input", r34Var);
        this.a = r34Var;
        r34Var.b = this;
    }

    public static void w(int i) throws InvalidProtocolBufferException {
        if ((i & 3) != 0) {
            throw InvalidProtocolBufferException.f();
        }
    }

    public static void x(int i) throws InvalidProtocolBufferException {
        if ((i & 7) != 0) {
            throw InvalidProtocolBufferException.f();
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

    public final void b(Object obj, e7f e7fVar, mc7 mc7Var) {
        int i = this.c;
        this.c = ((this.b >>> 3) << 3) | 4;
        try {
            e7fVar.e(obj, this, mc7Var);
            if (this.b == this.c) {
            } else {
                throw InvalidProtocolBufferException.f();
            }
        } finally {
            this.c = i;
        }
    }

    public final void c(Object obj, e7f e7fVar, mc7 mc7Var) throws InvalidProtocolBufferException {
        r34 r34Var = this.a;
        int iD = r34Var.D();
        if (r34Var.a >= 100) {
            throw new InvalidProtocolBufferException("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
        }
        int iL = r34Var.l(iD);
        r34Var.a++;
        e7fVar.e(obj, this, mc7Var);
        r34Var.b(0);
        r34Var.a--;
        r34Var.j(iL);
    }

    public final void d(List list) throws InvalidProtocolBufferException {
        int iC;
        int iC2;
        boolean z = list instanceof st1;
        int i = this.b;
        r34 r34Var = this.a;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 0) {
                do {
                    list.add(Boolean.valueOf(r34Var.m()));
                    if (r34Var.g()) {
                        return;
                    } else {
                        iC = r34Var.C();
                    }
                } while (iC == this.b);
                this.d = iC;
                return;
            }
            if (i2 != 2) {
                throw InvalidProtocolBufferException.c();
            }
            int iF = r34Var.f() + r34Var.D();
            do {
                list.add(Boolean.valueOf(r34Var.m()));
            } while (r34Var.f() < iF);
            u(iF);
            return;
        }
        st1 st1Var = (st1) list;
        int i3 = i & 7;
        if (i3 == 0) {
            do {
                st1Var.b(r34Var.m());
                if (r34Var.g()) {
                    return;
                } else {
                    iC2 = r34Var.C();
                }
            } while (iC2 == this.b);
            this.d = iC2;
            return;
        }
        if (i3 != 2) {
            throw InvalidProtocolBufferException.c();
        }
        int iF2 = r34Var.f() + r34Var.D();
        do {
            st1Var.b(r34Var.m());
        } while (r34Var.f() < iF2);
        u(iF2);
    }

    public final k22 e() throws InvalidProtocolBufferException.InvalidWireTypeException {
        v(2);
        return this.a.o();
    }

    public final void f(List list) throws InvalidProtocolBufferException.InvalidWireTypeException {
        int iC;
        if ((this.b & 7) != 2) {
            throw InvalidProtocolBufferException.c();
        }
        do {
            list.add(e());
            r34 r34Var = this.a;
            if (r34Var.g()) {
                return;
            } else {
                iC = r34Var.C();
            }
        } while (iC == this.b);
        this.d = iC;
    }

    public final void g(List list) throws InvalidProtocolBufferException {
        int iC;
        int iC2;
        boolean z = list instanceof fa6;
        int i = this.b;
        r34 r34Var = this.a;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 1) {
                do {
                    list.add(Double.valueOf(r34Var.p()));
                    if (r34Var.g()) {
                        return;
                    } else {
                        iC = r34Var.C();
                    }
                } while (iC == this.b);
                this.d = iC;
                return;
            }
            if (i2 != 2) {
                throw InvalidProtocolBufferException.c();
            }
            int iD = r34Var.D();
            x(iD);
            int iF = r34Var.f() + iD;
            do {
                list.add(Double.valueOf(r34Var.p()));
            } while (r34Var.f() < iF);
            return;
        }
        fa6 fa6Var = (fa6) list;
        int i3 = i & 7;
        if (i3 == 1) {
            do {
                fa6Var.b(r34Var.p());
                if (r34Var.g()) {
                    return;
                } else {
                    iC2 = r34Var.C();
                }
            } while (iC2 == this.b);
            this.d = iC2;
            return;
        }
        if (i3 != 2) {
            throw InvalidProtocolBufferException.c();
        }
        int iD2 = r34Var.D();
        x(iD2);
        int iF2 = r34Var.f() + iD2;
        do {
            fa6Var.b(r34Var.p());
        } while (r34Var.f() < iF2);
    }

    public final void h(List list) throws InvalidProtocolBufferException {
        int iC;
        int iC2;
        boolean z = list instanceof n69;
        int i = this.b;
        r34 r34Var = this.a;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 0) {
                do {
                    list.add(Integer.valueOf(r34Var.q()));
                    if (r34Var.g()) {
                        return;
                    } else {
                        iC = r34Var.C();
                    }
                } while (iC == this.b);
                this.d = iC;
                return;
            }
            if (i2 != 2) {
                throw InvalidProtocolBufferException.c();
            }
            int iF = r34Var.f() + r34Var.D();
            do {
                list.add(Integer.valueOf(r34Var.q()));
            } while (r34Var.f() < iF);
            u(iF);
            return;
        }
        n69 n69Var = (n69) list;
        int i3 = i & 7;
        if (i3 == 0) {
            do {
                n69Var.b(r34Var.q());
                if (r34Var.g()) {
                    return;
                } else {
                    iC2 = r34Var.C();
                }
            } while (iC2 == this.b);
            this.d = iC2;
            return;
        }
        if (i3 != 2) {
            throw InvalidProtocolBufferException.c();
        }
        int iF2 = r34Var.f() + r34Var.D();
        do {
            n69Var.b(r34Var.q());
        } while (r34Var.f() < iF2);
        u(iF2);
    }

    public final void i(List list) throws InvalidProtocolBufferException {
        int iC;
        int iC2;
        boolean z = list instanceof n69;
        int i = this.b;
        r34 r34Var = this.a;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 2) {
                int iD = r34Var.D();
                w(iD);
                int iF = r34Var.f() + iD;
                do {
                    list.add(Integer.valueOf(r34Var.r()));
                } while (r34Var.f() < iF);
                return;
            }
            if (i2 != 5) {
                throw InvalidProtocolBufferException.c();
            }
            do {
                list.add(Integer.valueOf(r34Var.r()));
                if (r34Var.g()) {
                    return;
                } else {
                    iC = r34Var.C();
                }
            } while (iC == this.b);
            this.d = iC;
            return;
        }
        n69 n69Var = (n69) list;
        int i3 = i & 7;
        if (i3 == 2) {
            int iD2 = r34Var.D();
            w(iD2);
            int iF2 = r34Var.f() + iD2;
            do {
                n69Var.b(r34Var.r());
            } while (r34Var.f() < iF2);
            return;
        }
        if (i3 != 5) {
            throw InvalidProtocolBufferException.c();
        }
        do {
            n69Var.b(r34Var.r());
            if (r34Var.g()) {
                return;
            } else {
                iC2 = r34Var.C();
            }
        } while (iC2 == this.b);
        this.d = iC2;
    }

    public final void j(List list) throws InvalidProtocolBufferException {
        int iC;
        int iC2;
        boolean z = list instanceof cka;
        int i = this.b;
        r34 r34Var = this.a;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 1) {
                do {
                    list.add(Long.valueOf(r34Var.s()));
                    if (r34Var.g()) {
                        return;
                    } else {
                        iC = r34Var.C();
                    }
                } while (iC == this.b);
                this.d = iC;
                return;
            }
            if (i2 != 2) {
                throw InvalidProtocolBufferException.c();
            }
            int iD = r34Var.D();
            x(iD);
            int iF = r34Var.f() + iD;
            do {
                list.add(Long.valueOf(r34Var.s()));
            } while (r34Var.f() < iF);
            return;
        }
        cka ckaVar = (cka) list;
        int i3 = i & 7;
        if (i3 == 1) {
            do {
                ckaVar.b(r34Var.s());
                if (r34Var.g()) {
                    return;
                } else {
                    iC2 = r34Var.C();
                }
            } while (iC2 == this.b);
            this.d = iC2;
            return;
        }
        if (i3 != 2) {
            throw InvalidProtocolBufferException.c();
        }
        int iD2 = r34Var.D();
        x(iD2);
        int iF2 = r34Var.f() + iD2;
        do {
            ckaVar.b(r34Var.s());
        } while (r34Var.f() < iF2);
    }

    public final void k(List list) throws InvalidProtocolBufferException {
        int iC;
        int iC2;
        boolean z = list instanceof no7;
        int i = this.b;
        r34 r34Var = this.a;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 2) {
                int iD = r34Var.D();
                w(iD);
                int iF = r34Var.f() + iD;
                do {
                    list.add(Float.valueOf(r34Var.t()));
                } while (r34Var.f() < iF);
                return;
            }
            if (i2 != 5) {
                throw InvalidProtocolBufferException.c();
            }
            do {
                list.add(Float.valueOf(r34Var.t()));
                if (r34Var.g()) {
                    return;
                } else {
                    iC = r34Var.C();
                }
            } while (iC == this.b);
            this.d = iC;
            return;
        }
        no7 no7Var = (no7) list;
        int i3 = i & 7;
        if (i3 == 2) {
            int iD2 = r34Var.D();
            w(iD2);
            int iF2 = r34Var.f() + iD2;
            do {
                no7Var.b(r34Var.t());
            } while (r34Var.f() < iF2);
            return;
        }
        if (i3 != 5) {
            throw InvalidProtocolBufferException.c();
        }
        do {
            no7Var.b(r34Var.t());
            if (r34Var.g()) {
                return;
            } else {
                iC2 = r34Var.C();
            }
        } while (iC2 == this.b);
        this.d = iC2;
    }

    public final void l(List list) throws InvalidProtocolBufferException {
        int iC;
        int iC2;
        boolean z = list instanceof n69;
        int i = this.b;
        r34 r34Var = this.a;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 0) {
                do {
                    list.add(Integer.valueOf(r34Var.u()));
                    if (r34Var.g()) {
                        return;
                    } else {
                        iC = r34Var.C();
                    }
                } while (iC == this.b);
                this.d = iC;
                return;
            }
            if (i2 != 2) {
                throw InvalidProtocolBufferException.c();
            }
            int iF = r34Var.f() + r34Var.D();
            do {
                list.add(Integer.valueOf(r34Var.u()));
            } while (r34Var.f() < iF);
            u(iF);
            return;
        }
        n69 n69Var = (n69) list;
        int i3 = i & 7;
        if (i3 == 0) {
            do {
                n69Var.b(r34Var.u());
                if (r34Var.g()) {
                    return;
                } else {
                    iC2 = r34Var.C();
                }
            } while (iC2 == this.b);
            this.d = iC2;
            return;
        }
        if (i3 != 2) {
            throw InvalidProtocolBufferException.c();
        }
        int iF2 = r34Var.f() + r34Var.D();
        do {
            n69Var.b(r34Var.u());
        } while (r34Var.f() < iF2);
        u(iF2);
    }

    public final void m(List list) throws InvalidProtocolBufferException {
        int iC;
        int iC2;
        boolean z = list instanceof cka;
        int i = this.b;
        r34 r34Var = this.a;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 0) {
                do {
                    list.add(Long.valueOf(r34Var.v()));
                    if (r34Var.g()) {
                        return;
                    } else {
                        iC = r34Var.C();
                    }
                } while (iC == this.b);
                this.d = iC;
                return;
            }
            if (i2 != 2) {
                throw InvalidProtocolBufferException.c();
            }
            int iF = r34Var.f() + r34Var.D();
            do {
                list.add(Long.valueOf(r34Var.v()));
            } while (r34Var.f() < iF);
            u(iF);
            return;
        }
        cka ckaVar = (cka) list;
        int i3 = i & 7;
        if (i3 == 0) {
            do {
                ckaVar.b(r34Var.v());
                if (r34Var.g()) {
                    return;
                } else {
                    iC2 = r34Var.C();
                }
            } while (iC2 == this.b);
            this.d = iC2;
            return;
        }
        if (i3 != 2) {
            throw InvalidProtocolBufferException.c();
        }
        int iF2 = r34Var.f() + r34Var.D();
        do {
            ckaVar.b(r34Var.v());
        } while (r34Var.f() < iF2);
        u(iF2);
    }

    public final void n(List list) throws InvalidProtocolBufferException {
        int iC;
        int iC2;
        boolean z = list instanceof n69;
        int i = this.b;
        r34 r34Var = this.a;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 2) {
                int iD = r34Var.D();
                w(iD);
                int iF = r34Var.f() + iD;
                do {
                    list.add(Integer.valueOf(r34Var.w()));
                } while (r34Var.f() < iF);
                return;
            }
            if (i2 != 5) {
                throw InvalidProtocolBufferException.c();
            }
            do {
                list.add(Integer.valueOf(r34Var.w()));
                if (r34Var.g()) {
                    return;
                } else {
                    iC = r34Var.C();
                }
            } while (iC == this.b);
            this.d = iC;
            return;
        }
        n69 n69Var = (n69) list;
        int i3 = i & 7;
        if (i3 == 2) {
            int iD2 = r34Var.D();
            w(iD2);
            int iF2 = r34Var.f() + iD2;
            do {
                n69Var.b(r34Var.w());
            } while (r34Var.f() < iF2);
            return;
        }
        if (i3 != 5) {
            throw InvalidProtocolBufferException.c();
        }
        do {
            n69Var.b(r34Var.w());
            if (r34Var.g()) {
                return;
            } else {
                iC2 = r34Var.C();
            }
        } while (iC2 == this.b);
        this.d = iC2;
    }

    public final void o(List list) throws InvalidProtocolBufferException {
        int iC;
        int iC2;
        boolean z = list instanceof cka;
        int i = this.b;
        r34 r34Var = this.a;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 1) {
                do {
                    list.add(Long.valueOf(r34Var.x()));
                    if (r34Var.g()) {
                        return;
                    } else {
                        iC = r34Var.C();
                    }
                } while (iC == this.b);
                this.d = iC;
                return;
            }
            if (i2 != 2) {
                throw InvalidProtocolBufferException.c();
            }
            int iD = r34Var.D();
            x(iD);
            int iF = r34Var.f() + iD;
            do {
                list.add(Long.valueOf(r34Var.x()));
            } while (r34Var.f() < iF);
            return;
        }
        cka ckaVar = (cka) list;
        int i3 = i & 7;
        if (i3 == 1) {
            do {
                ckaVar.b(r34Var.x());
                if (r34Var.g()) {
                    return;
                } else {
                    iC2 = r34Var.C();
                }
            } while (iC2 == this.b);
            this.d = iC2;
            return;
        }
        if (i3 != 2) {
            throw InvalidProtocolBufferException.c();
        }
        int iD2 = r34Var.D();
        x(iD2);
        int iF2 = r34Var.f() + iD2;
        do {
            ckaVar.b(r34Var.x());
        } while (r34Var.f() < iF2);
    }

    public final void p(List list) throws InvalidProtocolBufferException {
        int iC;
        int iC2;
        boolean z = list instanceof n69;
        int i = this.b;
        r34 r34Var = this.a;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 0) {
                do {
                    list.add(Integer.valueOf(r34Var.y()));
                    if (r34Var.g()) {
                        return;
                    } else {
                        iC = r34Var.C();
                    }
                } while (iC == this.b);
                this.d = iC;
                return;
            }
            if (i2 != 2) {
                throw InvalidProtocolBufferException.c();
            }
            int iF = r34Var.f() + r34Var.D();
            do {
                list.add(Integer.valueOf(r34Var.y()));
            } while (r34Var.f() < iF);
            u(iF);
            return;
        }
        n69 n69Var = (n69) list;
        int i3 = i & 7;
        if (i3 == 0) {
            do {
                n69Var.b(r34Var.y());
                if (r34Var.g()) {
                    return;
                } else {
                    iC2 = r34Var.C();
                }
            } while (iC2 == this.b);
            this.d = iC2;
            return;
        }
        if (i3 != 2) {
            throw InvalidProtocolBufferException.c();
        }
        int iF2 = r34Var.f() + r34Var.D();
        do {
            n69Var.b(r34Var.y());
        } while (r34Var.f() < iF2);
        u(iF2);
    }

    public final void q(List list) throws InvalidProtocolBufferException {
        int iC;
        int iC2;
        boolean z = list instanceof cka;
        int i = this.b;
        r34 r34Var = this.a;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 0) {
                do {
                    list.add(Long.valueOf(r34Var.z()));
                    if (r34Var.g()) {
                        return;
                    } else {
                        iC = r34Var.C();
                    }
                } while (iC == this.b);
                this.d = iC;
                return;
            }
            if (i2 != 2) {
                throw InvalidProtocolBufferException.c();
            }
            int iF = r34Var.f() + r34Var.D();
            do {
                list.add(Long.valueOf(r34Var.z()));
            } while (r34Var.f() < iF);
            u(iF);
            return;
        }
        cka ckaVar = (cka) list;
        int i3 = i & 7;
        if (i3 == 0) {
            do {
                ckaVar.b(r34Var.z());
                if (r34Var.g()) {
                    return;
                } else {
                    iC2 = r34Var.C();
                }
            } while (iC2 == this.b);
            this.d = iC2;
            return;
        }
        if (i3 != 2) {
            throw InvalidProtocolBufferException.c();
        }
        int iF2 = r34Var.f() + r34Var.D();
        do {
            ckaVar.b(r34Var.z());
        } while (r34Var.f() < iF2);
        u(iF2);
    }

    public final void r(List list, boolean z) throws InvalidProtocolBufferException.InvalidWireTypeException {
        String strA;
        int iC;
        int iC2;
        if ((this.b & 7) != 2) {
            throw InvalidProtocolBufferException.c();
        }
        boolean z2 = list instanceof r1a;
        r34 r34Var = this.a;
        if (z2 && !z) {
            r1a r1aVar = (r1a) list;
            do {
                r1aVar.T(e());
                if (r34Var.g()) {
                    return;
                } else {
                    iC2 = r34Var.C();
                }
            } while (iC2 == this.b);
            this.d = iC2;
            return;
        }
        do {
            if (z) {
                v(2);
                strA = r34Var.B();
            } else {
                v(2);
                strA = r34Var.A();
            }
            list.add(strA);
            if (r34Var.g()) {
                return;
            } else {
                iC = r34Var.C();
            }
        } while (iC == this.b);
        this.d = iC;
    }

    public final void s(List list) throws InvalidProtocolBufferException {
        int iC;
        int iC2;
        boolean z = list instanceof n69;
        int i = this.b;
        r34 r34Var = this.a;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 0) {
                do {
                    list.add(Integer.valueOf(r34Var.D()));
                    if (r34Var.g()) {
                        return;
                    } else {
                        iC = r34Var.C();
                    }
                } while (iC == this.b);
                this.d = iC;
                return;
            }
            if (i2 != 2) {
                throw InvalidProtocolBufferException.c();
            }
            int iF = r34Var.f() + r34Var.D();
            do {
                list.add(Integer.valueOf(r34Var.D()));
            } while (r34Var.f() < iF);
            u(iF);
            return;
        }
        n69 n69Var = (n69) list;
        int i3 = i & 7;
        if (i3 == 0) {
            do {
                n69Var.b(r34Var.D());
                if (r34Var.g()) {
                    return;
                } else {
                    iC2 = r34Var.C();
                }
            } while (iC2 == this.b);
            this.d = iC2;
            return;
        }
        if (i3 != 2) {
            throw InvalidProtocolBufferException.c();
        }
        int iF2 = r34Var.f() + r34Var.D();
        do {
            n69Var.b(r34Var.D());
        } while (r34Var.f() < iF2);
        u(iF2);
    }

    public final void t(List list) throws InvalidProtocolBufferException {
        int iC;
        int iC2;
        boolean z = list instanceof cka;
        int i = this.b;
        r34 r34Var = this.a;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 0) {
                do {
                    list.add(Long.valueOf(r34Var.E()));
                    if (r34Var.g()) {
                        return;
                    } else {
                        iC = r34Var.C();
                    }
                } while (iC == this.b);
                this.d = iC;
                return;
            }
            if (i2 != 2) {
                throw InvalidProtocolBufferException.c();
            }
            int iF = r34Var.f() + r34Var.D();
            do {
                list.add(Long.valueOf(r34Var.E()));
            } while (r34Var.f() < iF);
            u(iF);
            return;
        }
        cka ckaVar = (cka) list;
        int i3 = i & 7;
        if (i3 == 0) {
            do {
                ckaVar.b(r34Var.E());
                if (r34Var.g()) {
                    return;
                } else {
                    iC2 = r34Var.C();
                }
            } while (iC2 == this.b);
            this.d = iC2;
            return;
        }
        if (i3 != 2) {
            throw InvalidProtocolBufferException.c();
        }
        int iF2 = r34Var.f() + r34Var.D();
        do {
            ckaVar.b(r34Var.E());
        } while (r34Var.f() < iF2);
        u(iF2);
    }

    public final void u(int i) throws InvalidProtocolBufferException {
        if (this.a.f() != i) {
            throw InvalidProtocolBufferException.g();
        }
    }

    public final void v(int i) throws InvalidProtocolBufferException.InvalidWireTypeException {
        if ((this.b & 7) != i) {
            throw InvalidProtocolBufferException.c();
        }
    }
}
