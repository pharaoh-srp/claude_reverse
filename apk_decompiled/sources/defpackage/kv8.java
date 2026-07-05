package defpackage;

import java.io.EOFException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public final class kv8 implements dxg {
    public final ssc E;

    public kv8(int i) {
        switch (i) {
            case 1:
                this.E = new ssc();
                break;
            default:
                this.E = new ssc(10);
                break;
        }
    }

    @Override // defpackage.dxg
    public void b(byte[] bArr, int i, int i2, cxg cxgVar, gm4 gm4Var) {
        dd5 dd5VarA;
        ssc sscVar = this.E;
        sscVar.K(bArr, i2 + i);
        sscVar.M(i);
        ArrayList arrayList = new ArrayList();
        while (sscVar.a() > 0) {
            fd9.C("Incomplete Mp4Webvtt Top Level box header found.", sscVar.a() >= 8);
            int iM = sscVar.m();
            if (sscVar.m() == 1987343459) {
                int i3 = iM - 8;
                CharSequence charSequenceF = null;
                cd5 cd5VarA = null;
                while (i3 > 0) {
                    fd9.C("Incomplete vtt cue box header found.", i3 >= 8);
                    int iM2 = sscVar.m();
                    int iM3 = sscVar.m();
                    int i4 = iM2 - 8;
                    byte[] bArr2 = sscVar.a;
                    int i5 = sscVar.b;
                    String str = tpi.a;
                    String str2 = new String(bArr2, i5, i4, StandardCharsets.UTF_8);
                    sscVar.N(i4);
                    i3 = (i3 - 8) - i4;
                    if (iM3 == 1937011815) {
                        z8j z8jVar = new z8j();
                        a9j.e(str2, z8jVar);
                        cd5VarA = z8jVar.a();
                    } else if (iM3 == 1885436268) {
                        charSequenceF = a9j.f(null, str2.trim(), Collections.EMPTY_LIST);
                    }
                }
                if (charSequenceF == null) {
                    charSequenceF = "";
                }
                if (cd5VarA != null) {
                    cd5VarA.a = charSequenceF;
                    cd5VarA.b = null;
                    dd5VarA = cd5VarA.a();
                } else {
                    Pattern pattern = a9j.a;
                    z8j z8jVar2 = new z8j();
                    z8jVar2.c = charSequenceF;
                    dd5VarA = z8jVar2.a().a();
                }
                arrayList.add(dd5VarA);
            } else {
                sscVar.N(iM - 8);
            }
        }
        gm4Var.accept(new hd5(-9223372036854775807L, -9223372036854775807L, arrayList));
    }

    public gjb c(xd7 xd7Var, rl7 rl7Var, int i) {
        int i2 = 0;
        gjb gjbVarL = null;
        loop0: while (true) {
            int i3 = 0;
            do {
                int i4 = i3 % 10;
                int i5 = i4 + 10;
                ssc sscVar = this.E;
                if (i4 == 0 && i3 != 0) {
                    byte[] bArr = sscVar.a;
                    System.arraycopy(bArr, 10, bArr, 0, 9);
                }
                int i6 = i3 == 0 ? 10 : 1;
                try {
                    xd7Var.p(sscVar.a, i5 - i6, i6);
                    sscVar.M(i4);
                    sscVar.L(i5);
                    if (sscVar.a() < 3) {
                        rl7.i(sscVar.b, sscVar.c);
                        return null;
                    }
                    int iC = sscVar.C();
                    int i7 = sscVar.b - 3;
                    sscVar.b = i7;
                    if (iC != 4801587) {
                        if (otj.h(sscVar.i()) != -1) {
                            break loop0;
                        }
                        if (i3 == 0) {
                            sscVar.c(20);
                        }
                        i3++;
                    } else {
                        sscVar.N(6);
                        int iY = sscVar.y();
                        int i8 = iY + 10;
                        if (gjbVarL == null) {
                            byte[] bArr2 = new byte[i8];
                            System.arraycopy(sscVar.a, i7, bArr2, 0, 10);
                            xd7Var.p(bArr2, 10, iY);
                            gjbVarL = new iv8(rl7Var).l(bArr2, i8);
                        } else {
                            xd7Var.f(iY);
                        }
                        i2 += i8;
                    }
                } catch (EOFException unused) {
                }
            } while (i3 <= i);
        }
        xd7Var.k();
        xd7Var.f(i2);
        return gjbVarL;
    }
}
