package defpackage;

import com.pvporbit.freetype.FreeTypeConstants;
import java.io.IOException;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class esd extends r28 {
    public static final esd n0;
    public static final sk9 o0 = new sk9(8);
    public final l22 F;
    public int G;
    public int H;
    public int I;
    public int J;
    public List K;
    public List L;
    public List M;
    public int N;
    public List O;
    public int P;
    public List Q;
    public List R;
    public int S;
    public List T;
    public List U;
    public List V;
    public List W;
    public List X;
    public List Y;
    public int Z;
    public int a0;
    public ntd b0;
    public int c0;
    public List d0;
    public int e0;
    public List f0;
    public List g0;
    public int h0;
    public ttd i0;
    public List j0;
    public aud k0;
    public byte l0;
    public int m0;

    static {
        esd esdVar = new esd();
        n0 = esdVar;
        esdVar.p();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:9:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public esd(defpackage.t34 r22, defpackage.oc7 r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1756
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.esd.<init>(t34, oc7):void");
    }

    @Override // defpackage.aib
    public final b3 a() {
        return n0;
    }

    @Override // defpackage.aib
    public final boolean b() {
        byte b = this.l0;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        if ((this.G & 2) != 2) {
            this.l0 = (byte) 0;
            return false;
        }
        for (int i = 0; i < this.K.size(); i++) {
            if (!((std) this.K.get(i)).b()) {
                this.l0 = (byte) 0;
                return false;
            }
        }
        for (int i2 = 0; i2 < this.L.size(); i2++) {
            if (!((ntd) this.L.get(i2)).b()) {
                this.l0 = (byte) 0;
                return false;
            }
        }
        for (int i3 = 0; i3 < this.Q.size(); i3++) {
            if (!((ntd) this.Q.get(i3)).b()) {
                this.l0 = (byte) 0;
                return false;
            }
        }
        for (int i4 = 0; i4 < this.T.size(); i4++) {
            if (!((gsd) this.T.get(i4)).b()) {
                this.l0 = (byte) 0;
                return false;
            }
        }
        for (int i5 = 0; i5 < this.U.size(); i5++) {
            if (!((usd) this.U.get(i5)).b()) {
                this.l0 = (byte) 0;
                return false;
            }
        }
        for (int i6 = 0; i6 < this.V.size(); i6++) {
            if (!((ctd) this.V.get(i6)).b()) {
                this.l0 = (byte) 0;
                return false;
            }
        }
        for (int i7 = 0; i7 < this.W.size(); i7++) {
            if (!((ptd) this.W.get(i7)).b()) {
                this.l0 = (byte) 0;
                return false;
            }
        }
        for (int i8 = 0; i8 < this.X.size(); i8++) {
            if (!((psd) this.X.get(i8)).b()) {
                this.l0 = (byte) 0;
                return false;
            }
        }
        if ((this.G & 16) == 16 && !this.b0.b()) {
            this.l0 = (byte) 0;
            return false;
        }
        for (int i9 = 0; i9 < this.f0.size(); i9++) {
            if (!((ntd) this.f0.get(i9)).b()) {
                this.l0 = (byte) 0;
                return false;
            }
        }
        if ((this.G & 64) == 64 && !this.i0.b()) {
            this.l0 = (byte) 0;
            return false;
        }
        if (i()) {
            this.l0 = (byte) 1;
            return true;
        }
        this.l0 = (byte) 0;
        return false;
    }

    @Override // defpackage.b3
    public final int c() {
        List list;
        List list2;
        List list3;
        List list4;
        List list5;
        List list6;
        List list7;
        int i = this.m0;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        int iB = (this.G & 1) == 1 ? v34.b(1, this.H) : 0;
        int i3 = 0;
        int iC = 0;
        while (true) {
            int size = this.M.size();
            list = this.M;
            if (i3 >= size) {
                break;
            }
            iC += v34.c(((Integer) list.get(i3)).intValue());
            i3++;
        }
        int iD = iB + iC;
        if (!list.isEmpty()) {
            iD = iD + 1 + v34.c(iC);
        }
        this.N = iC;
        if ((this.G & 2) == 2) {
            iD += v34.b(3, this.I);
        }
        if ((this.G & 4) == 4) {
            iD += v34.b(4, this.J);
        }
        for (int i4 = 0; i4 < this.K.size(); i4++) {
            iD += v34.d(5, (b3) this.K.get(i4));
        }
        for (int i5 = 0; i5 < this.L.size(); i5++) {
            iD += v34.d(6, (b3) this.L.get(i5));
        }
        int i6 = 0;
        int iC2 = 0;
        while (true) {
            int size2 = this.O.size();
            list2 = this.O;
            if (i6 >= size2) {
                break;
            }
            iC2 += v34.c(((Integer) list2.get(i6)).intValue());
            i6++;
        }
        int iD2 = iD + iC2;
        if (!list2.isEmpty()) {
            iD2 = iD2 + 1 + v34.c(iC2);
        }
        this.P = iC2;
        for (int i7 = 0; i7 < this.T.size(); i7++) {
            iD2 += v34.d(8, (b3) this.T.get(i7));
        }
        for (int i8 = 0; i8 < this.U.size(); i8++) {
            iD2 += v34.d(9, (b3) this.U.get(i8));
        }
        for (int i9 = 0; i9 < this.V.size(); i9++) {
            iD2 += v34.d(10, (b3) this.V.get(i9));
        }
        for (int i10 = 0; i10 < this.W.size(); i10++) {
            iD2 += v34.d(11, (b3) this.W.get(i10));
        }
        for (int i11 = 0; i11 < this.X.size(); i11++) {
            iD2 += v34.d(13, (b3) this.X.get(i11));
        }
        int i12 = 0;
        int iC3 = 0;
        while (true) {
            int size3 = this.Y.size();
            list3 = this.Y;
            if (i12 >= size3) {
                break;
            }
            iC3 += v34.c(((Integer) list3.get(i12)).intValue());
            i12++;
        }
        int iD3 = iD2 + iC3;
        if (!list3.isEmpty()) {
            iD3 = iD3 + 2 + v34.c(iC3);
        }
        this.Z = iC3;
        if ((this.G & 8) == 8) {
            iD3 += v34.b(17, this.a0);
        }
        if ((this.G & 16) == 16) {
            iD3 += v34.d(18, this.b0);
        }
        if ((this.G & 32) == 32) {
            iD3 += v34.b(19, this.c0);
        }
        for (int i13 = 0; i13 < this.Q.size(); i13++) {
            iD3 += v34.d(20, (b3) this.Q.get(i13));
        }
        int i14 = 0;
        int iC4 = 0;
        while (true) {
            int size4 = this.R.size();
            list4 = this.R;
            if (i14 >= size4) {
                break;
            }
            iC4 += v34.c(((Integer) list4.get(i14)).intValue());
            i14++;
        }
        int iC5 = iD3 + iC4;
        if (!list4.isEmpty()) {
            iC5 = iC5 + 2 + v34.c(iC4);
        }
        this.S = iC4;
        int i15 = 0;
        int iC6 = 0;
        while (true) {
            int size5 = this.d0.size();
            list5 = this.d0;
            if (i15 >= size5) {
                break;
            }
            iC6 += v34.c(((Integer) list5.get(i15)).intValue());
            i15++;
        }
        int iD4 = iC5 + iC6;
        if (!list5.isEmpty()) {
            iD4 = iD4 + 2 + v34.c(iC6);
        }
        this.e0 = iC6;
        for (int i16 = 0; i16 < this.f0.size(); i16++) {
            iD4 += v34.d(23, (b3) this.f0.get(i16));
        }
        int i17 = 0;
        int iC7 = 0;
        while (true) {
            int size6 = this.g0.size();
            list6 = this.g0;
            if (i17 >= size6) {
                break;
            }
            iC7 += v34.c(((Integer) list6.get(i17)).intValue());
            i17++;
        }
        int iD5 = iD4 + iC7;
        if (!list6.isEmpty()) {
            iD5 = iD5 + 2 + v34.c(iC7);
        }
        this.h0 = iC7;
        if ((this.G & 64) == 64) {
            iD5 += v34.d(30, this.i0);
        }
        int iC8 = 0;
        while (true) {
            int size7 = this.j0.size();
            list7 = this.j0;
            if (i2 >= size7) {
                break;
            }
            iC8 += v34.c(((Integer) list7.get(i2)).intValue());
            i2++;
        }
        int size8 = (list7.size() * 2) + iD5 + iC8;
        if ((this.G & FreeTypeConstants.FT_LOAD_PEDANTIC) == 128) {
            size8 += v34.d(32, this.k0);
        }
        int size9 = this.F.size() + j() + size8;
        this.m0 = size9;
        return size9;
    }

    @Override // defpackage.b3
    public final i28 d() {
        return csd.j();
    }

    @Override // defpackage.b3
    public final i28 e() {
        csd csdVarJ = csd.j();
        csdVarJ.k(this);
        return csdVarJ;
    }

    @Override // defpackage.b3
    public final void f(v34 v34Var) throws IOException {
        c();
        q28 q28Var = new q28((r28) this);
        if ((this.G & 1) == 1) {
            v34Var.m(1, this.H);
        }
        if (this.M.size() > 0) {
            v34Var.v(18);
            v34Var.v(this.N);
        }
        for (int i = 0; i < this.M.size(); i++) {
            v34Var.n(((Integer) this.M.get(i)).intValue());
        }
        if ((this.G & 2) == 2) {
            v34Var.m(3, this.I);
        }
        if ((this.G & 4) == 4) {
            v34Var.m(4, this.J);
        }
        for (int i2 = 0; i2 < this.K.size(); i2++) {
            v34Var.o(5, (b3) this.K.get(i2));
        }
        for (int i3 = 0; i3 < this.L.size(); i3++) {
            v34Var.o(6, (b3) this.L.get(i3));
        }
        if (this.O.size() > 0) {
            v34Var.v(58);
            v34Var.v(this.P);
        }
        for (int i4 = 0; i4 < this.O.size(); i4++) {
            v34Var.n(((Integer) this.O.get(i4)).intValue());
        }
        for (int i5 = 0; i5 < this.T.size(); i5++) {
            v34Var.o(8, (b3) this.T.get(i5));
        }
        for (int i6 = 0; i6 < this.U.size(); i6++) {
            v34Var.o(9, (b3) this.U.get(i6));
        }
        for (int i7 = 0; i7 < this.V.size(); i7++) {
            v34Var.o(10, (b3) this.V.get(i7));
        }
        for (int i8 = 0; i8 < this.W.size(); i8++) {
            v34Var.o(11, (b3) this.W.get(i8));
        }
        for (int i9 = 0; i9 < this.X.size(); i9++) {
            v34Var.o(13, (b3) this.X.get(i9));
        }
        if (this.Y.size() > 0) {
            v34Var.v(130);
            v34Var.v(this.Z);
        }
        for (int i10 = 0; i10 < this.Y.size(); i10++) {
            v34Var.n(((Integer) this.Y.get(i10)).intValue());
        }
        if ((this.G & 8) == 8) {
            v34Var.m(17, this.a0);
        }
        if ((this.G & 16) == 16) {
            v34Var.o(18, this.b0);
        }
        if ((this.G & 32) == 32) {
            v34Var.m(19, this.c0);
        }
        for (int i11 = 0; i11 < this.Q.size(); i11++) {
            v34Var.o(20, (b3) this.Q.get(i11));
        }
        if (this.R.size() > 0) {
            v34Var.v(170);
            v34Var.v(this.S);
        }
        for (int i12 = 0; i12 < this.R.size(); i12++) {
            v34Var.n(((Integer) this.R.get(i12)).intValue());
        }
        if (this.d0.size() > 0) {
            v34Var.v(178);
            v34Var.v(this.e0);
        }
        for (int i13 = 0; i13 < this.d0.size(); i13++) {
            v34Var.n(((Integer) this.d0.get(i13)).intValue());
        }
        for (int i14 = 0; i14 < this.f0.size(); i14++) {
            v34Var.o(23, (b3) this.f0.get(i14));
        }
        if (this.g0.size() > 0) {
            v34Var.v(194);
            v34Var.v(this.h0);
        }
        for (int i15 = 0; i15 < this.g0.size(); i15++) {
            v34Var.n(((Integer) this.g0.get(i15)).intValue());
        }
        if ((this.G & 64) == 64) {
            v34Var.o(30, this.i0);
        }
        for (int i16 = 0; i16 < this.j0.size(); i16++) {
            v34Var.m(31, ((Integer) this.j0.get(i16)).intValue());
        }
        if ((this.G & FreeTypeConstants.FT_LOAD_PEDANTIC) == 128) {
            v34Var.o(32, this.k0);
        }
        q28Var.J(19000, v34Var);
        v34Var.r(this.F);
    }

    public final void p() {
        this.H = 6;
        this.I = 0;
        this.J = 0;
        List list = Collections.EMPTY_LIST;
        this.K = list;
        this.L = list;
        this.M = list;
        this.O = list;
        this.Q = list;
        this.R = list;
        this.T = list;
        this.U = list;
        this.V = list;
        this.W = list;
        this.X = list;
        this.Y = list;
        this.a0 = 0;
        this.b0 = ntd.X;
        this.c0 = 0;
        this.d0 = list;
        this.f0 = list;
        this.g0 = list;
        this.i0 = ttd.K;
        this.j0 = list;
        this.k0 = aud.I;
    }

    public esd() {
        this.N = -1;
        this.P = -1;
        this.S = -1;
        this.Z = -1;
        this.e0 = -1;
        this.h0 = -1;
        this.l0 = (byte) -1;
        this.m0 = -1;
        this.F = l22.E;
    }

    public esd(csd csdVar) {
        super(csdVar);
        this.N = -1;
        this.P = -1;
        this.S = -1;
        this.Z = -1;
        this.e0 = -1;
        this.h0 = -1;
        this.l0 = (byte) -1;
        this.m0 = -1;
        this.F = csdVar.E;
    }
}
