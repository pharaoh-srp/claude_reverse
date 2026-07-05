package defpackage;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class ii6 implements bk6 {
    public final /* synthetic */ int a;
    public boolean b;
    public long c;
    public int d;
    public int e;
    public final Object f;
    public Object g;

    public ii6(List list) {
        this.a = 0;
        this.f = list;
        this.g = new y3i[list.size()];
        this.c = -9223372036854775807L;
    }

    @Override // defpackage.bk6
    public final void c(ssc sscVar) {
        boolean z;
        boolean z2;
        switch (this.a) {
            case 0:
                if (this.b) {
                    if (this.d == 2) {
                        if (sscVar.a() == 0) {
                            z2 = false;
                        } else {
                            if (sscVar.z() != 32) {
                                this.b = false;
                            }
                            this.d--;
                            z2 = this.b;
                        }
                        if (!z2) {
                        }
                    }
                    if (this.d == 1) {
                        if (sscVar.a() == 0) {
                            z = false;
                        } else {
                            if (sscVar.z() != 0) {
                                this.b = false;
                            }
                            this.d--;
                            z = this.b;
                        }
                        if (!z) {
                        }
                    }
                    int i = sscVar.b;
                    int iA = sscVar.a();
                    for (y3i y3iVar : (y3i[]) this.g) {
                        sscVar.M(i);
                        y3iVar.e(iA, sscVar);
                    }
                    this.e += iA;
                }
                break;
            default:
                ssc sscVar2 = (ssc) this.f;
                ((y3i) this.g).getClass();
                if (this.b) {
                    int iA2 = sscVar.a();
                    int i2 = this.e;
                    if (i2 < 10) {
                        int iMin = Math.min(iA2, 10 - i2);
                        System.arraycopy(sscVar.a, sscVar.b, sscVar2.a, this.e, iMin);
                        if (this.e + iMin == 10) {
                            sscVar2.M(0);
                            if (73 == sscVar2.z() && 68 == sscVar2.z() && 51 == sscVar2.z()) {
                                sscVar2.N(3);
                                this.d = sscVar2.y() + 10;
                            } else {
                                ysj.u("Id3Reader", "Discarding invalid ID3 tag");
                                this.b = false;
                            }
                        }
                    }
                    int iMin2 = Math.min(iA2, this.d - this.e);
                    ((y3i) this.g).e(iMin2, sscVar);
                    this.e += iMin2;
                    break;
                }
                break;
        }
    }

    @Override // defpackage.bk6
    public final void d() {
        switch (this.a) {
            case 0:
                this.b = false;
                this.c = -9223372036854775807L;
                break;
            default:
                this.b = false;
                this.c = -9223372036854775807L;
                break;
        }
    }

    @Override // defpackage.bk6
    public final void e(boolean z) {
        int i;
        switch (this.a) {
            case 0:
                if (this.b) {
                    fd9.M(this.c != -9223372036854775807L);
                    for (y3i y3iVar : (y3i[]) this.g) {
                        y3iVar.a(this.c, 1, this.e, 0, null);
                    }
                    this.b = false;
                }
                break;
            default:
                ((y3i) this.g).getClass();
                if (this.b && (i = this.d) != 0 && this.e == i) {
                    fd9.M(this.c != -9223372036854775807L);
                    ((y3i) this.g).a(this.c, 1, this.d, 0, null);
                    this.b = false;
                    break;
                }
                break;
        }
    }

    @Override // defpackage.bk6
    public final void f(yd7 yd7Var, t6f t6fVar) {
        switch (this.a) {
            case 0:
                y3i[] y3iVarArr = (y3i[]) this.g;
                for (int i = 0; i < y3iVarArr.length; i++) {
                    q8i q8iVar = (q8i) ((List) this.f).get(i);
                    t6fVar.d();
                    t6fVar.i();
                    y3i y3iVarN = yd7Var.n(t6fVar.c, 3);
                    iw7 iw7Var = new iw7();
                    t6fVar.i();
                    iw7Var.a = (String) t6fVar.e;
                    iw7Var.m = gkb.k("video/mp2t");
                    iw7Var.n = gkb.k("application/dvbsubs");
                    iw7Var.q = Collections.singletonList(q8iVar.b);
                    iw7Var.d = q8iVar.a;
                    qy1.n(iw7Var, y3iVarN);
                    y3iVarArr[i] = y3iVarN;
                }
                break;
            default:
                t6fVar.d();
                t6fVar.i();
                y3i y3iVarN2 = yd7Var.n(t6fVar.c, 5);
                this.g = y3iVarN2;
                iw7 iw7Var2 = new iw7();
                t6fVar.i();
                iw7Var2.a = (String) t6fVar.e;
                iw7Var2.m = gkb.k("video/mp2t");
                iw7Var2.n = gkb.k("application/id3");
                qy1.n(iw7Var2, y3iVarN2);
                break;
        }
    }

    @Override // defpackage.bk6
    public final void g(int i, long j) {
        switch (this.a) {
            case 0:
                if ((i & 4) != 0) {
                    this.b = true;
                    this.c = j;
                    this.e = 0;
                    this.d = 2;
                    break;
                }
                break;
            default:
                if ((i & 4) != 0) {
                    this.b = true;
                    this.c = j;
                    this.d = 0;
                    this.e = 0;
                    break;
                }
                break;
        }
    }

    public ii6() {
        this.a = 1;
        this.f = new ssc(10);
        this.c = -9223372036854775807L;
    }
}
