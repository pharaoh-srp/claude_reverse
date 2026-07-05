package com.google.protobuf;

import androidx.health.platform.client.proto.g;
import com.google.protobuf.InvalidProtocolBufferException;
import defpackage.afj;
import defpackage.dka;
import defpackage.f7f;
import defpackage.ga6;
import defpackage.h22;
import defpackage.mr9;
import defpackage.nc7;
import defpackage.o69;
import defpackage.oo7;
import defpackage.rud;
import defpackage.s1a;
import defpackage.sz6;
import defpackage.tt1;
import defpackage.u89;
import defpackage.v28;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class c {
    public final b a;
    public int b;
    public int c;
    public int d = 0;

    public c(b bVar) {
        Charset charset = u89.a;
        this.a = bVar;
        bVar.F = this;
    }

    public static void X(int i) throws InvalidProtocolBufferException {
        if ((i & 3) != 0) {
            throw new InvalidProtocolBufferException("Failed to parse the message.");
        }
    }

    public static void Y(int i) throws InvalidProtocolBufferException {
        if ((i & 7) != 0) {
            throw new InvalidProtocolBufferException("Failed to parse the message.");
        }
    }

    public static c a(b bVar) {
        c cVar = (c) bVar.F;
        return cVar != null ? cVar : new c(bVar);
    }

    public final void A(List list) throws InvalidProtocolBufferException {
        int iY;
        if (list instanceof dka) {
            mr9.o();
            return;
        }
        int i = this.b & 7;
        b bVar = this.a;
        if (i == 0) {
            do {
                list.add(Long.valueOf(bVar.u()));
                if (bVar.h()) {
                    return;
                } else {
                    iY = bVar.y();
                }
            } while (iY == this.b);
            this.d = iY;
            return;
        }
        if (i != 2) {
            throw InvalidProtocolBufferException.b();
        }
        int iG = bVar.g() + bVar.t();
        do {
            list.add(Long.valueOf(bVar.u()));
        } while (bVar.g() < iG);
        U(iG);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x005d, code lost:
    
        r10.put(r4, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0060, code lost:
    
        r1.i(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0063, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void B(defpackage.gsa r10, defpackage.fj0 r11, defpackage.nc7 r12) throws com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException {
        /*
            r9 = this;
            r0 = 2
            r9.V(r0)
            com.google.protobuf.b r1 = r9.a
            int r2 = r1.t()
            int r2 = r1.k(r2)
            java.lang.Object r3 = r11.G
            java.lang.String r4 = ""
            r5 = r3
        L13:
            int r6 = r9.b()     // Catch: java.lang.Throwable -> L37
            r7 = 2147483647(0x7fffffff, float:NaN)
            if (r6 == r7) goto L5d
            boolean r7 = r1.h()     // Catch: java.lang.Throwable -> L37
            if (r7 == 0) goto L23
            goto L5d
        L23:
            r7 = 1
            java.lang.String r8 = "Unable to parse map entry."
            if (r6 == r7) goto L46
            if (r6 == r0) goto L39
            boolean r6 = r9.W()     // Catch: java.lang.Throwable -> L37 com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L50
            if (r6 == 0) goto L31
            goto L13
        L31:
            com.google.protobuf.InvalidProtocolBufferException r6 = new com.google.protobuf.InvalidProtocolBufferException     // Catch: java.lang.Throwable -> L37 com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L50
            r6.<init>(r8)     // Catch: java.lang.Throwable -> L37 com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L50
            throw r6     // Catch: java.lang.Throwable -> L37 com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L50
        L37:
            r9 = move-exception
            goto L64
        L39:
            java.lang.Object r6 = r11.F     // Catch: java.lang.Throwable -> L37 com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L50
            afj r6 = (defpackage.afj) r6     // Catch: java.lang.Throwable -> L37 com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L50
            java.lang.Class r7 = r3.getClass()     // Catch: java.lang.Throwable -> L37 com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L50
            java.lang.Object r5 = r9.p(r6, r7, r12)     // Catch: java.lang.Throwable -> L37 com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L50
            goto L13
        L46:
            java.lang.Object r6 = r11.E     // Catch: java.lang.Throwable -> L37 com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L50
            afj r6 = (defpackage.afj) r6     // Catch: java.lang.Throwable -> L37 com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L50
            r7 = 0
            java.lang.Object r4 = r9.p(r6, r7, r7)     // Catch: java.lang.Throwable -> L37 com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L50
            goto L13
        L50:
            boolean r6 = r9.W()     // Catch: java.lang.Throwable -> L37
            if (r6 == 0) goto L57
            goto L13
        L57:
            com.google.protobuf.InvalidProtocolBufferException r9 = new com.google.protobuf.InvalidProtocolBufferException     // Catch: java.lang.Throwable -> L37
            r9.<init>(r8)     // Catch: java.lang.Throwable -> L37
            throw r9     // Catch: java.lang.Throwable -> L37
        L5d:
            r10.put(r4, r5)     // Catch: java.lang.Throwable -> L37
            r1.i(r2)
            return
        L64:
            r1.i(r2)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.c.B(gsa, fj0, nc7):void");
    }

    public final void C(List list, f7f f7fVar, nc7 nc7Var) throws InvalidProtocolBufferException {
        int iY;
        int i = this.b;
        if ((i & 7) != 2) {
            throw InvalidProtocolBufferException.b();
        }
        do {
            v28 v28VarD = f7fVar.d();
            g(v28VarD, f7fVar, nc7Var);
            f7fVar.b(v28VarD);
            list.add(v28VarD);
            b bVar = this.a;
            if (bVar.h() || this.d != 0) {
                return;
            } else {
                iY = bVar.y();
            }
        } while (iY == i);
        this.d = iY;
    }

    public final int D() throws InvalidProtocolBufferException.InvalidWireTypeException {
        V(5);
        return this.a.r();
    }

    public final void E(List list) throws InvalidProtocolBufferException {
        int iY;
        if (list instanceof o69) {
            mr9.o();
            return;
        }
        int i = this.b & 7;
        b bVar = this.a;
        if (i == 2) {
            int iT = bVar.t();
            X(iT);
            int iG = bVar.g() + iT;
            do {
                list.add(Integer.valueOf(bVar.r()));
            } while (bVar.g() < iG);
            return;
        }
        if (i != 5) {
            throw InvalidProtocolBufferException.b();
        }
        do {
            list.add(Integer.valueOf(bVar.r()));
            if (bVar.h()) {
                return;
            } else {
                iY = bVar.y();
            }
        } while (iY == this.b);
        this.d = iY;
    }

    public final long F() throws InvalidProtocolBufferException.InvalidWireTypeException {
        V(1);
        return this.a.s();
    }

    public final void G(List list) throws InvalidProtocolBufferException {
        int iY;
        if (list instanceof dka) {
            mr9.o();
            return;
        }
        int i = this.b & 7;
        b bVar = this.a;
        if (i == 1) {
            do {
                list.add(Long.valueOf(bVar.s()));
                if (bVar.h()) {
                    return;
                } else {
                    iY = bVar.y();
                }
            } while (iY == this.b);
            this.d = iY;
            return;
        }
        if (i != 2) {
            throw InvalidProtocolBufferException.b();
        }
        int iT = bVar.t();
        Y(iT);
        int iG = bVar.g() + iT;
        do {
            list.add(Long.valueOf(bVar.s()));
        } while (bVar.g() < iG);
    }

    public final int H() throws InvalidProtocolBufferException.InvalidWireTypeException {
        V(0);
        return this.a.w();
    }

    public final void I(List list) throws InvalidProtocolBufferException {
        int iY;
        if (list instanceof o69) {
            mr9.o();
            return;
        }
        int i = this.b & 7;
        b bVar = this.a;
        if (i == 0) {
            do {
                list.add(Integer.valueOf(bVar.w()));
                if (bVar.h()) {
                    return;
                } else {
                    iY = bVar.y();
                }
            } while (iY == this.b);
            this.d = iY;
            return;
        }
        if (i != 2) {
            throw InvalidProtocolBufferException.b();
        }
        int iG = bVar.g() + bVar.t();
        do {
            list.add(Integer.valueOf(bVar.w()));
        } while (bVar.g() < iG);
        U(iG);
    }

    public final long J() throws InvalidProtocolBufferException.InvalidWireTypeException {
        V(0);
        return this.a.x();
    }

    public final void K(List list) throws InvalidProtocolBufferException {
        int iY;
        if (list instanceof dka) {
            mr9.o();
            return;
        }
        int i = this.b & 7;
        b bVar = this.a;
        if (i == 0) {
            do {
                list.add(Long.valueOf(bVar.x()));
                if (bVar.h()) {
                    return;
                } else {
                    iY = bVar.y();
                }
            } while (iY == this.b);
            this.d = iY;
            return;
        }
        if (i != 2) {
            throw InvalidProtocolBufferException.b();
        }
        int iG = bVar.g() + bVar.t();
        do {
            list.add(Long.valueOf(bVar.x()));
        } while (bVar.g() < iG);
        U(iG);
    }

    public final String L() throws InvalidProtocolBufferException.InvalidWireTypeException {
        V(2);
        b bVar = this.a;
        byte[] bArr = bVar.H;
        int iT = bVar.t();
        if (iT > 0) {
            int i = bVar.I;
            int i2 = bVar.K;
            if (iT <= i - i2) {
                String str = new String(bArr, i2, iT, u89.a);
                bVar.K += iT;
                return str;
            }
        }
        if (iT == 0) {
            return "";
        }
        if (iT > bVar.I) {
            return new String(bVar.o(iT), u89.a);
        }
        bVar.A(iT);
        String str2 = new String(bArr, bVar.K, iT, u89.a);
        bVar.K += iT;
        return str2;
    }

    public final void M(List list) throws InvalidProtocolBufferException.InvalidWireTypeException {
        N(list, false);
    }

    public final void N(List list, boolean z) throws InvalidProtocolBufferException.InvalidWireTypeException {
        int iY;
        int iY2;
        if ((this.b & 7) != 2) {
            throw InvalidProtocolBufferException.b();
        }
        boolean z2 = list instanceof s1a;
        b bVar = this.a;
        if (!z2 || z) {
            do {
                list.add(z ? P() : L());
                if (bVar.h()) {
                    return;
                } else {
                    iY = bVar.y();
                }
            } while (iY == this.b);
            this.d = iY;
            return;
        }
        s1a s1aVar = (s1a) list;
        do {
            s1aVar.K(j());
            if (bVar.h()) {
                return;
            } else {
                iY2 = bVar.y();
            }
        } while (iY2 == this.b);
        this.d = iY2;
    }

    public final void O(List list) throws InvalidProtocolBufferException.InvalidWireTypeException {
        N(list, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x007b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String P() throws com.google.protobuf.InvalidProtocolBufferException {
        /*
            Method dump skipped, instruction units count: 396
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.c.P():java.lang.String");
    }

    public final int Q() throws InvalidProtocolBufferException.InvalidWireTypeException {
        V(0);
        return this.a.t();
    }

    public final void R(List list) throws InvalidProtocolBufferException {
        int iY;
        if (list instanceof o69) {
            mr9.o();
            return;
        }
        int i = this.b & 7;
        b bVar = this.a;
        if (i == 0) {
            do {
                list.add(Integer.valueOf(bVar.t()));
                if (bVar.h()) {
                    return;
                } else {
                    iY = bVar.y();
                }
            } while (iY == this.b);
            this.d = iY;
            return;
        }
        if (i != 2) {
            throw InvalidProtocolBufferException.b();
        }
        int iG = bVar.g() + bVar.t();
        do {
            list.add(Integer.valueOf(bVar.t()));
        } while (bVar.g() < iG);
        U(iG);
    }

    public final long S() throws InvalidProtocolBufferException.InvalidWireTypeException {
        V(0);
        return this.a.u();
    }

    public final void T(List list) throws InvalidProtocolBufferException {
        int iY;
        if (list instanceof dka) {
            mr9.o();
            return;
        }
        int i = this.b & 7;
        b bVar = this.a;
        if (i == 0) {
            do {
                list.add(Long.valueOf(bVar.u()));
                if (bVar.h()) {
                    return;
                } else {
                    iY = bVar.y();
                }
            } while (iY == this.b);
            this.d = iY;
            return;
        }
        if (i != 2) {
            throw InvalidProtocolBufferException.b();
        }
        int iG = bVar.g() + bVar.t();
        do {
            list.add(Long.valueOf(bVar.u()));
        } while (bVar.g() < iG);
        U(iG);
    }

    public final void U(int i) throws InvalidProtocolBufferException {
        if (this.a.g() != i) {
            throw InvalidProtocolBufferException.e();
        }
    }

    public final void V(int i) throws InvalidProtocolBufferException.InvalidWireTypeException {
        if ((this.b & 7) != i) {
            throw InvalidProtocolBufferException.b();
        }
    }

    public final boolean W() {
        int i;
        b bVar = this.a;
        if (bVar.h() || (i = this.b) == this.c) {
            return false;
        }
        return bVar.B(i);
    }

    public final int b() {
        int i = this.d;
        if (i != 0) {
            this.b = i;
            this.d = 0;
        } else {
            this.b = this.a.y();
        }
        int i2 = this.b;
        if (i2 == 0 || i2 == this.c) {
            return Integer.MAX_VALUE;
        }
        return i2 >>> 3;
    }

    public final int c() {
        return this.b;
    }

    public final void d(v28 v28Var, f7f f7fVar, nc7 nc7Var) throws InvalidProtocolBufferException.InvalidWireTypeException {
        V(3);
        e(v28Var, f7fVar, nc7Var);
    }

    public final void e(Object obj, f7f f7fVar, nc7 nc7Var) {
        int i = this.c;
        this.c = ((this.b >>> 3) << 3) | 4;
        try {
            f7fVar.g(obj, this, nc7Var);
            if (this.b == this.c) {
            } else {
                throw new InvalidProtocolBufferException("Failed to parse the message.");
            }
        } finally {
            this.c = i;
        }
    }

    public final void f(v28 v28Var, f7f f7fVar, nc7 nc7Var) throws InvalidProtocolBufferException {
        V(2);
        g(v28Var, f7fVar, nc7Var);
    }

    public final void g(Object obj, f7f f7fVar, nc7 nc7Var) throws InvalidProtocolBufferException {
        b bVar = this.a;
        int iT = bVar.t();
        if (bVar.E >= 100) {
            throw new InvalidProtocolBufferException("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
        }
        int iK = bVar.k(iT);
        bVar.E++;
        f7fVar.g(obj, this, nc7Var);
        bVar.f(0);
        bVar.E--;
        bVar.i(iK);
    }

    public final boolean h() throws InvalidProtocolBufferException.InvalidWireTypeException {
        V(0);
        return this.a.l();
    }

    public final void i(List list) throws InvalidProtocolBufferException {
        int iY;
        if (list instanceof tt1) {
            mr9.o();
            return;
        }
        int i = this.b & 7;
        b bVar = this.a;
        if (i == 0) {
            do {
                list.add(Boolean.valueOf(bVar.l()));
                if (bVar.h()) {
                    return;
                } else {
                    iY = bVar.y();
                }
            } while (iY == this.b);
            this.d = iY;
            return;
        }
        if (i != 2) {
            throw InvalidProtocolBufferException.b();
        }
        int iG = bVar.g() + bVar.t();
        do {
            list.add(Boolean.valueOf(bVar.l()));
        } while (bVar.g() < iG);
        U(iG);
    }

    public final h22 j() throws InvalidProtocolBufferException.InvalidWireTypeException {
        V(2);
        b bVar = this.a;
        byte[] bArr = bVar.H;
        int iT = bVar.t();
        int i = bVar.I;
        int i2 = bVar.K;
        if (iT <= i - i2 && iT > 0) {
            h22 h22VarE = h22.e(bArr, i2, iT);
            bVar.K += iT;
            return h22VarE;
        }
        if (iT == 0) {
            return h22.G;
        }
        byte[] bArrP = bVar.p(iT);
        if (bArrP != null) {
            return h22.e(bArrP, 0, bArrP.length);
        }
        int i3 = bVar.K;
        int i4 = bVar.I;
        int length = i4 - i3;
        bVar.M += i4;
        bVar.K = 0;
        bVar.I = 0;
        ArrayList<byte[]> arrayListQ = bVar.q(iT - length);
        byte[] bArr2 = new byte[iT];
        System.arraycopy(bArr, i3, bArr2, 0, length);
        for (byte[] bArr3 : arrayListQ) {
            System.arraycopy(bArr3, 0, bArr2, length, bArr3.length);
            length += bArr3.length;
        }
        h22 h22Var = h22.G;
        return new h22(bArr2);
    }

    public final void k(List list) throws InvalidProtocolBufferException.InvalidWireTypeException {
        int iY;
        if ((this.b & 7) != 2) {
            throw InvalidProtocolBufferException.b();
        }
        do {
            list.add(j());
            b bVar = this.a;
            if (bVar.h()) {
                return;
            } else {
                iY = bVar.y();
            }
        } while (iY == this.b);
        this.d = iY;
    }

    public final double l() throws InvalidProtocolBufferException.InvalidWireTypeException {
        V(1);
        return this.a.m();
    }

    public final void m(List list) throws InvalidProtocolBufferException {
        int iY;
        if (list instanceof ga6) {
            mr9.o();
            return;
        }
        int i = this.b & 7;
        b bVar = this.a;
        if (i == 1) {
            do {
                list.add(Double.valueOf(bVar.m()));
                if (bVar.h()) {
                    return;
                } else {
                    iY = bVar.y();
                }
            } while (iY == this.b);
            this.d = iY;
            return;
        }
        if (i != 2) {
            throw InvalidProtocolBufferException.b();
        }
        int iT = bVar.t();
        Y(iT);
        int iG = bVar.g() + iT;
        do {
            list.add(Double.valueOf(bVar.m()));
        } while (bVar.g() < iG);
    }

    public final int n() throws InvalidProtocolBufferException.InvalidWireTypeException {
        V(0);
        return this.a.t();
    }

    public final void o(List list) throws InvalidProtocolBufferException {
        int iY;
        if (list instanceof o69) {
            mr9.o();
            return;
        }
        int i = this.b & 7;
        b bVar = this.a;
        if (i == 0) {
            do {
                list.add(Integer.valueOf(bVar.t()));
                if (bVar.h()) {
                    return;
                } else {
                    iY = bVar.y();
                }
            } while (iY == this.b);
            this.d = iY;
            return;
        }
        if (i != 2) {
            throw InvalidProtocolBufferException.b();
        }
        int iG = bVar.g() + bVar.t();
        do {
            list.add(Integer.valueOf(bVar.t()));
        } while (bVar.g() < iG);
        U(iG);
    }

    public final Object p(afj afjVar, Class cls, nc7 nc7Var) throws InvalidProtocolBufferException {
        switch (afjVar.ordinal()) {
            case 0:
                return Double.valueOf(l());
            case 1:
                return Float.valueOf(u());
            case 2:
                return Long.valueOf(z());
            case 3:
                return Long.valueOf(S());
            case 4:
                return Integer.valueOf(x());
            case 5:
                return Long.valueOf(s());
            case 6:
                return Integer.valueOf(q());
            case 7:
                return Boolean.valueOf(h());
            case 8:
                return P();
            case 9:
            default:
                sz6.p("unsupported field type.");
                return null;
            case 10:
                V(2);
                f7f f7fVarA = rud.c.a(cls);
                v28 v28VarD = f7fVarA.d();
                g(v28VarD, f7fVarA, nc7Var);
                f7fVarA.b(v28VarD);
                return v28VarD;
            case 11:
                return j();
            case 12:
                return Integer.valueOf(Q());
            case 13:
                return Integer.valueOf(n());
            case 14:
                return Integer.valueOf(D());
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                return Long.valueOf(F());
            case 16:
                return Integer.valueOf(H());
            case g.MAX_FIELD_NUMBER /* 17 */:
                return Long.valueOf(J());
        }
    }

    public final int q() throws InvalidProtocolBufferException.InvalidWireTypeException {
        V(5);
        return this.a.r();
    }

    public final void r(List list) throws InvalidProtocolBufferException {
        int iY;
        if (list instanceof o69) {
            mr9.o();
            return;
        }
        int i = this.b & 7;
        b bVar = this.a;
        if (i == 2) {
            int iT = bVar.t();
            X(iT);
            int iG = bVar.g() + iT;
            do {
                list.add(Integer.valueOf(bVar.r()));
            } while (bVar.g() < iG);
            return;
        }
        if (i != 5) {
            throw InvalidProtocolBufferException.b();
        }
        do {
            list.add(Integer.valueOf(bVar.r()));
            if (bVar.h()) {
                return;
            } else {
                iY = bVar.y();
            }
        } while (iY == this.b);
        this.d = iY;
    }

    public final long s() throws InvalidProtocolBufferException.InvalidWireTypeException {
        V(1);
        return this.a.s();
    }

    public final void t(List list) throws InvalidProtocolBufferException {
        int iY;
        if (list instanceof dka) {
            mr9.o();
            return;
        }
        int i = this.b & 7;
        b bVar = this.a;
        if (i == 1) {
            do {
                list.add(Long.valueOf(bVar.s()));
                if (bVar.h()) {
                    return;
                } else {
                    iY = bVar.y();
                }
            } while (iY == this.b);
            this.d = iY;
            return;
        }
        if (i != 2) {
            throw InvalidProtocolBufferException.b();
        }
        int iT = bVar.t();
        Y(iT);
        int iG = bVar.g() + iT;
        do {
            list.add(Long.valueOf(bVar.s()));
        } while (bVar.g() < iG);
    }

    public final float u() throws InvalidProtocolBufferException.InvalidWireTypeException {
        V(5);
        return this.a.n();
    }

    public final void v(List list) throws InvalidProtocolBufferException {
        int iY;
        if (list instanceof oo7) {
            mr9.o();
            return;
        }
        int i = this.b & 7;
        b bVar = this.a;
        if (i == 2) {
            int iT = bVar.t();
            X(iT);
            int iG = bVar.g() + iT;
            do {
                list.add(Float.valueOf(bVar.n()));
            } while (bVar.g() < iG);
            return;
        }
        if (i != 5) {
            throw InvalidProtocolBufferException.b();
        }
        do {
            list.add(Float.valueOf(bVar.n()));
            if (bVar.h()) {
                return;
            } else {
                iY = bVar.y();
            }
        } while (iY == this.b);
        this.d = iY;
    }

    public final void w(List list, f7f f7fVar, nc7 nc7Var) throws InvalidProtocolBufferException.InvalidWireTypeException {
        int iY;
        int i = this.b;
        if ((i & 7) != 3) {
            throw InvalidProtocolBufferException.b();
        }
        do {
            v28 v28VarD = f7fVar.d();
            e(v28VarD, f7fVar, nc7Var);
            f7fVar.b(v28VarD);
            list.add(v28VarD);
            b bVar = this.a;
            if (bVar.h() || this.d != 0) {
                return;
            } else {
                iY = bVar.y();
            }
        } while (iY == i);
        this.d = iY;
    }

    public final int x() throws InvalidProtocolBufferException.InvalidWireTypeException {
        V(0);
        return this.a.t();
    }

    public final void y(List list) throws InvalidProtocolBufferException {
        int iY;
        if (list instanceof o69) {
            mr9.o();
            return;
        }
        int i = this.b & 7;
        b bVar = this.a;
        if (i == 0) {
            do {
                list.add(Integer.valueOf(bVar.t()));
                if (bVar.h()) {
                    return;
                } else {
                    iY = bVar.y();
                }
            } while (iY == this.b);
            this.d = iY;
            return;
        }
        if (i != 2) {
            throw InvalidProtocolBufferException.b();
        }
        int iG = bVar.g() + bVar.t();
        do {
            list.add(Integer.valueOf(bVar.t()));
        } while (bVar.g() < iG);
        U(iG);
    }

    public final long z() throws InvalidProtocolBufferException.InvalidWireTypeException {
        V(0);
        return this.a.u();
    }
}
