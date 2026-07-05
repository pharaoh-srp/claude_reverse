package defpackage;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class ej0 extends yuj {
    public final /* synthetic */ int h;

    public /* synthetic */ ej0(int i) {
        this.h = i;
    }

    @Override // defpackage.yuj
    public final gjb d(mjb mjbVar, ByteBuffer byteBuffer) {
        switch (this.h) {
            case 0:
                if (byteBuffer.get() != 116) {
                    return null;
                }
                dg2 dg2Var = new dg2(byteBuffer.array(), byteBuffer.limit());
                dg2Var.o(12);
                int iD = (dg2Var.d() + dg2Var.g(12)) - 4;
                dg2Var.o(44);
                dg2Var.p(dg2Var.g(12));
                dg2Var.o(16);
                ArrayList arrayList = new ArrayList();
                while (dg2Var.d() < iD) {
                    dg2Var.o(48);
                    int iG = dg2Var.g(8);
                    dg2Var.o(4);
                    int iD2 = dg2Var.d() + dg2Var.g(12);
                    String str = null;
                    String str2 = null;
                    while (dg2Var.d() < iD2) {
                        int iG2 = dg2Var.g(8);
                        int iG3 = dg2Var.g(8);
                        int iD3 = dg2Var.d() + iG3;
                        if (iG2 == 2) {
                            int iG4 = dg2Var.g(16);
                            dg2Var.o(8);
                            if (iG4 == 3) {
                                while (dg2Var.d() < iD3) {
                                    int iG5 = dg2Var.g(8);
                                    Charset charset = StandardCharsets.US_ASCII;
                                    byte[] bArr = new byte[iG5];
                                    dg2Var.j(bArr, iG5);
                                    String str3 = new String(bArr, charset);
                                    int iG6 = dg2Var.g(8);
                                    for (int i = 0; i < iG6; i++) {
                                        dg2Var.p(dg2Var.g(8));
                                    }
                                    str = str3;
                                }
                            }
                        } else if (iG2 == 21) {
                            Charset charset2 = StandardCharsets.US_ASCII;
                            byte[] bArr2 = new byte[iG3];
                            dg2Var.j(bArr2, iG3);
                            str2 = new String(bArr2, charset2);
                        }
                        dg2Var.m(iD3 * 8);
                    }
                    dg2Var.m(iD2 * 8);
                    if (str != null && str2 != null) {
                        arrayList.add(new dj0(iG, str.concat(str2)));
                    }
                }
                if (arrayList.isEmpty()) {
                    return null;
                }
                return new gjb(arrayList);
            default:
                ssc sscVar = new ssc(byteBuffer.array(), byteBuffer.limit());
                String strU = sscVar.u();
                strU.getClass();
                String strU2 = sscVar.u();
                strU2.getClass();
                return new gjb(new d07(strU, strU2, sscVar.t(), sscVar.t(), Arrays.copyOfRange(sscVar.a, sscVar.b, sscVar.c)));
        }
    }
}
