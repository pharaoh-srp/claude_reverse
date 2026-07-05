package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class dg3 {
    public final /* synthetic */ int a;
    public int b;
    public int c;
    public int d;
    public Object e;

    public dg3() {
        this.a = 0;
        this.d = 7;
        this.e = new int[8];
    }

    public void a(i7a i7aVar) {
        i7aVar.G = null;
        i7aVar.E = null;
        i7aVar.F = null;
        i7aVar.M = 1;
        int i = this.b;
        if (i > 0) {
            int i2 = this.d;
            if ((i2 & 1) == 0) {
                this.d = i2 + 1;
                this.b = i - 1;
                this.c++;
            }
        }
        i7aVar.E = (i7a) this.e;
        this.e = i7aVar;
        int i3 = this.d;
        int i4 = i3 + 1;
        this.d = i4;
        int i5 = this.b;
        if (i5 > 0 && (i4 & 1) == 0) {
            this.d = i3 + 2;
            this.b = i5 - 1;
            this.c++;
        }
        int i6 = 4;
        while (true) {
            int i7 = i6 - 1;
            if ((this.d & i7) != i7) {
                return;
            }
            int i8 = this.c;
            if (i8 == 0) {
                i7a i7aVar2 = (i7a) this.e;
                i7a i7aVar3 = i7aVar2.E;
                i7a i7aVar4 = i7aVar3.E;
                i7aVar3.E = i7aVar4.E;
                this.e = i7aVar3;
                i7aVar3.F = i7aVar4;
                i7aVar3.G = i7aVar2;
                i7aVar3.M = i7aVar2.M + 1;
                i7aVar4.E = i7aVar3;
                i7aVar2.E = i7aVar3;
            } else if (i8 == 1) {
                i7a i7aVar5 = (i7a) this.e;
                i7a i7aVar6 = i7aVar5.E;
                this.e = i7aVar6;
                i7aVar6.G = i7aVar5;
                i7aVar6.M = i7aVar5.M + 1;
                i7aVar5.E = i7aVar6;
                this.c = 0;
            } else if (i8 == 2) {
                this.c = 0;
            }
            i6 *= 2;
        }
    }

    public void b(int i) {
        int[] iArr = (int[]) this.e;
        int i2 = this.c;
        iArr[i2] = i;
        int i3 = this.d & (i2 + 1);
        this.c = i3;
        int i4 = this.b;
        if (i3 == i4) {
            int length = iArr.length;
            int i5 = length - i4;
            int i6 = length << 1;
            int[] iArr2 = new int[i6];
            System.arraycopy(iArr, i4, iArr2, 0, i5);
            System.arraycopy((int[]) this.e, 0, iArr2, i5, this.b);
            this.e = iArr2;
            this.b = 0;
            this.c = length;
            this.d = i6 - 1;
        }
    }

    public int c(int i, int i2) {
        s59 s59Var;
        int i3;
        if (i == 0) {
            return i2;
        }
        if (i2 == 0) {
            return i;
        }
        int i4 = i;
        while (true) {
            s59Var = ((s59[]) this.e)[i4 >> 1];
            i3 = i4 & 1;
            int i5 = i3 == 0 ? s59Var.b : s59Var.c;
            if (i5 == 0) {
                break;
            }
            i4 = i5;
        }
        if (i3 == 0) {
            s59Var.b = i2;
            return i;
        }
        s59Var.c = i2;
        return i;
    }

    public void d(int i, int i2) {
        while (i != 0) {
            s59 s59Var = ((s59[]) this.e)[i >> 1];
            if ((i & 1) == 0) {
                i = s59Var.b;
                s59Var.b = i2;
            } else {
                i = s59Var.c;
                s59Var.c = i2;
            }
        }
    }

    public String toString() {
        switch (this.a) {
            case 2:
                StringBuilder sb = new StringBuilder();
                for (int i = 0; i < this.b; i++) {
                    int length = sb.length();
                    sb.append(i);
                    if (i == this.c) {
                        sb.append('*');
                    }
                    sb.append("        ".substring(sb.length() - length));
                    sb.append(((s59[]) this.e)[i]);
                    sb.append('\n');
                }
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ dg3(int i) {
        this.a = i;
    }
}
