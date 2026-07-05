package defpackage;

import com.pvporbit.freetype.FreeTypeConstants;

/* JADX INFO: loaded from: classes2.dex */
public final class ref implements r8i {
    public final qef a;
    public final ssc b = new ssc(32);
    public int c;
    public int d;
    public boolean e;
    public boolean f;

    public ref(qef qefVar) {
        this.a = qefVar;
    }

    @Override // defpackage.r8i
    public final void a(frh frhVar, yd7 yd7Var, t6f t6fVar) {
        this.a.a(frhVar, yd7Var, t6fVar);
        this.f = true;
    }

    @Override // defpackage.r8i
    public final void b(int i, ssc sscVar) {
        boolean z = (i & 1) != 0;
        int iZ = z ? sscVar.b + sscVar.z() : -1;
        if (this.f) {
            if (!z) {
                return;
            }
            this.f = false;
            sscVar.M(iZ);
            this.d = 0;
        }
        while (sscVar.a() > 0) {
            int i2 = this.d;
            ssc sscVar2 = this.b;
            if (i2 < 3) {
                if (i2 == 0) {
                    int iZ2 = sscVar.z();
                    sscVar.M(sscVar.b - 1);
                    if (iZ2 == 255) {
                        this.f = true;
                        return;
                    }
                }
                int iMin = Math.min(sscVar.a(), 3 - this.d);
                sscVar.k(sscVar2.a, this.d, iMin);
                int i3 = this.d + iMin;
                this.d = i3;
                if (i3 == 3) {
                    sscVar2.M(0);
                    sscVar2.L(3);
                    sscVar2.N(1);
                    int iZ3 = sscVar2.z();
                    int iZ4 = sscVar2.z();
                    this.e = (iZ3 & FreeTypeConstants.FT_LOAD_PEDANTIC) != 0;
                    int i4 = (((iZ3 & 15) << 8) | iZ4) + 3;
                    this.c = i4;
                    byte[] bArr = sscVar2.a;
                    if (bArr.length < i4) {
                        sscVar2.c(Math.min(4098, Math.max(i4, bArr.length * 2)));
                    }
                }
            } else {
                int iMin2 = Math.min(sscVar.a(), this.c - this.d);
                sscVar.k(sscVar2.a, this.d, iMin2);
                int i5 = this.d + iMin2;
                this.d = i5;
                int i6 = this.c;
                if (i5 != i6) {
                    continue;
                } else {
                    if (!this.e) {
                        sscVar2.L(i6);
                    } else {
                        if (tpi.j(0, i6, -1, sscVar2.a) != 0) {
                            this.f = true;
                            return;
                        }
                        sscVar2.L(this.c - 4);
                    }
                    sscVar2.M(0);
                    this.a.c(sscVar2);
                    this.d = 0;
                }
            }
        }
    }

    @Override // defpackage.r8i
    public final void d() {
        this.f = true;
    }
}
