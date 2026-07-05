package defpackage;

import androidx.media3.common.ParserException;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class v91 {
    public final ArrayList a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final float k;
    public final String l;

    public v91(ArrayList arrayList, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, float f, String str) {
        this.a = arrayList;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = i5;
        this.g = i6;
        this.h = i7;
        this.i = i8;
        this.j = i9;
        this.k = f;
        this.l = str;
    }

    public static v91 a(ssc sscVar) {
        String str;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        float f;
        int i7;
        int i8;
        try {
            sscVar.N(4);
            int iZ = (sscVar.z() & 3) + 1;
            if (iZ == 3) {
                throw new IllegalStateException();
            }
            ArrayList arrayList = new ArrayList();
            int iZ2 = sscVar.z() & 31;
            for (int i9 = 0; i9 < iZ2; i9++) {
                int iG = sscVar.G();
                int i10 = sscVar.b;
                sscVar.N(iG);
                byte[] bArr = sscVar.a;
                byte[] bArr2 = new byte[iG + 4];
                System.arraycopy(q34.a, 0, bArr2, 0, 4);
                System.arraycopy(bArr, i10, bArr2, 4, iG);
                arrayList.add(bArr2);
            }
            int iZ3 = sscVar.z();
            for (int i11 = 0; i11 < iZ3; i11++) {
                int iG2 = sscVar.G();
                int i12 = sscVar.b;
                sscVar.N(iG2);
                byte[] bArr3 = sscVar.a;
                byte[] bArr4 = new byte[iG2 + 4];
                System.arraycopy(q34.a, 0, bArr4, 0, 4);
                System.arraycopy(bArr3, i12, bArr4, 4, iG2);
                arrayList.add(bArr4);
            }
            if (iZ2 > 0) {
                rxb rxbVarB = stj.B((byte[]) arrayList.get(0), 4, ((byte[]) arrayList.get(0)).length);
                int i13 = rxbVarB.e;
                int i14 = rxbVarB.f;
                int i15 = rxbVarB.h + 8;
                int i16 = rxbVarB.i + 8;
                int i17 = rxbVarB.p;
                int i18 = rxbVarB.q;
                int i19 = rxbVarB.r;
                int i20 = rxbVarB.s;
                float f2 = rxbVarB.g;
                int i21 = rxbVarB.a;
                int i22 = rxbVarB.b;
                int i23 = rxbVarB.c;
                byte[] bArr5 = q34.a;
                str = String.format("avc1.%02X%02X%02X", Integer.valueOf(i21), Integer.valueOf(i22), Integer.valueOf(i23));
                i4 = i18;
                i5 = i19;
                i6 = i20;
                f = f2;
                i2 = i14;
                i3 = i15;
                i7 = i16;
                i8 = i17;
                i = i13;
            } else {
                str = null;
                i = -1;
                i2 = -1;
                i3 = -1;
                i4 = -1;
                i5 = -1;
                i6 = 16;
                f = 1.0f;
                i7 = -1;
                i8 = -1;
            }
            return new v91(arrayList, iZ, i, i2, i3, i7, i8, i4, i5, i6, f, str);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw ParserException.a(e, "Error parsing AVC config");
        }
    }
}
