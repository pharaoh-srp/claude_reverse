package defpackage;

import com.pvporbit.freetype.FreeTypeConstants;

/* JADX INFO: loaded from: classes2.dex */
public final class cy7 {
    public final y3i a;
    public b4i d;
    public dt5 e;
    public int f;
    public int g;
    public int h;
    public int i;
    public final jw7 j;
    public boolean m;
    public final u3i b = new u3i();
    public final ssc c = new ssc();
    public final ssc k = new ssc(1);
    public final ssc l = new ssc();

    public cy7(y3i y3iVar, b4i b4iVar, dt5 dt5Var, jw7 jw7Var) {
        this.a = y3iVar;
        this.d = b4iVar;
        this.e = dt5Var;
        this.j = jw7Var;
        this.d = b4iVar;
        this.e = dt5Var;
        y3iVar.g(jw7Var);
        e();
    }

    public final int a() {
        int i = !this.m ? this.d.g[this.f] : this.b.j[this.f] ? 1 : 0;
        return b() != null ? 1073741824 | i : i;
    }

    public final t3i b() {
        if (!this.m) {
            return null;
        }
        u3i u3iVar = this.b;
        dt5 dt5Var = u3iVar.a;
        String str = tpi.a;
        int i = dt5Var.a;
        t3i t3iVar = u3iVar.m;
        if (t3iVar == null) {
            t3iVar = this.d.a.l[i];
        }
        if (t3iVar == null || !t3iVar.a) {
            return null;
        }
        return t3iVar;
    }

    public final boolean c() {
        this.f++;
        if (!this.m) {
            return false;
        }
        int i = this.g + 1;
        this.g = i;
        int[] iArr = this.b.g;
        int i2 = this.h;
        if (i != iArr[i2]) {
            return true;
        }
        this.h = i2 + 1;
        this.g = 0;
        return false;
    }

    public final int d(int i, int i2) {
        ssc sscVar;
        t3i t3iVarB = b();
        if (t3iVarB == null) {
            return 0;
        }
        int length = t3iVarB.d;
        u3i u3iVar = this.b;
        if (length != 0) {
            sscVar = u3iVar.n;
        } else {
            byte[] bArr = t3iVarB.e;
            String str = tpi.a;
            int length2 = bArr.length;
            ssc sscVar2 = this.l;
            sscVar2.K(bArr, length2);
            length = bArr.length;
            sscVar = sscVar2;
        }
        boolean z = u3iVar.k && u3iVar.l[this.f];
        boolean z2 = z || i2 != 0;
        ssc sscVar3 = this.k;
        sscVar3.a[0] = (byte) ((z2 ? FreeTypeConstants.FT_LOAD_PEDANTIC : 0) | length);
        sscVar3.M(0);
        y3i y3iVar = this.a;
        y3iVar.b(sscVar3, 1, 1);
        y3iVar.b(sscVar, length, 1);
        if (!z2) {
            return length + 1;
        }
        ssc sscVar4 = this.c;
        if (!z) {
            sscVar4.J(8);
            byte[] bArr2 = sscVar4.a;
            bArr2[0] = 0;
            bArr2[1] = 1;
            bArr2[2] = 0;
            bArr2[3] = (byte) (i2 & 255);
            bArr2[4] = (byte) ((i >> 24) & 255);
            bArr2[5] = (byte) ((i >> 16) & 255);
            bArr2[6] = (byte) ((i >> 8) & 255);
            bArr2[7] = (byte) (i & 255);
            y3iVar.b(sscVar4, 8, 1);
            return length + 9;
        }
        ssc sscVar5 = u3iVar.n;
        int iG = sscVar5.G();
        sscVar5.N(-2);
        int i3 = (iG * 6) + 2;
        if (i2 != 0) {
            sscVar4.J(i3);
            byte[] bArr3 = sscVar4.a;
            sscVar5.k(bArr3, 0, i3);
            int i4 = (((bArr3[2] & 255) << 8) | (bArr3[3] & 255)) + i2;
            bArr3[2] = (byte) ((i4 >> 8) & 255);
            bArr3[3] = (byte) (i4 & 255);
        } else {
            sscVar4 = sscVar5;
        }
        y3iVar.b(sscVar4, i3, 1);
        return length + 1 + i3;
    }

    public final void e() {
        u3i u3iVar = this.b;
        u3iVar.d = 0;
        u3iVar.p = 0L;
        u3iVar.q = false;
        u3iVar.k = false;
        u3iVar.o = false;
        u3iVar.m = null;
        this.f = 0;
        this.h = 0;
        this.g = 0;
        this.i = 0;
        this.m = false;
    }
}
