package defpackage;

import android.net.Uri;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class ld {
    public final int a;
    public final int b;
    public final Uri[] c;
    public final j7b[] d;
    public final int[] e;
    public final long[] f;
    public final String[] g;
    public final md[] h;

    static {
        ebh.w(0, 1, 2, 3, 4);
        ebh.w(5, 6, 7, 8, 9);
        tpi.w(10);
        tpi.w(11);
    }

    public ld(int i, int i2, int[] iArr, j7b[] j7bVarArr, long[] jArr, String[] strArr, md[] mdVarArr) {
        Uri uri;
        int i3 = 0;
        fd9.E(iArr.length == j7bVarArr.length);
        fd9.E(iArr.length == mdVarArr.length);
        this.a = i;
        this.b = i2;
        this.e = iArr;
        this.d = j7bVarArr;
        this.f = jArr;
        this.c = new Uri[j7bVarArr.length];
        while (true) {
            Uri[] uriArr = this.c;
            if (i3 >= uriArr.length) {
                this.g = strArr;
                this.h = mdVarArr;
                return;
            }
            j7b j7bVar = j7bVarArr[i3];
            if (j7bVar == null) {
                uri = null;
            } else {
                g7b g7bVar = j7bVar.b;
                g7bVar.getClass();
                uri = g7bVar.a;
            }
            uriArr[i3] = uri;
            i3++;
        }
    }

    public final int a(int i) {
        int i2;
        int i3 = i + 1;
        while (true) {
            int[] iArr = this.e;
            if (i3 >= iArr.length || (i2 = iArr[i3]) == 0 || i2 == 1) {
                break;
            }
            i3++;
        }
        return i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ld.class != obj.getClass()) {
            return false;
        }
        ld ldVar = (ld) obj;
        return this.a == ldVar.a && this.b == ldVar.b && Arrays.equals(this.d, ldVar.d) && Arrays.equals(this.e, ldVar.e) && Arrays.equals(this.f, ldVar.f) && Arrays.equals(this.g, ldVar.g) && Arrays.equals(this.h, ldVar.h);
    }

    public final int hashCode() {
        return (Arrays.hashCode(this.h) + ((((Arrays.hashCode(this.f) + ((Arrays.hashCode(this.e) + ((Arrays.hashCode(this.d) + (((this.a * 31) + this.b) * 961)) * 31)) * 31)) * 29791) + Arrays.hashCode(this.g)) * 31)) * 31;
    }
}
