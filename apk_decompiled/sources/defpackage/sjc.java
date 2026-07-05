package defpackage;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class sjc extends iqg {
    public static final byte[] o = {79, 112, 117, 115, 72, 101, 97, 100};
    public static final byte[] p = {79, 112, 117, 115, 84, 97, 103, 115};
    public boolean n;

    public static boolean e(ssc sscVar, byte[] bArr) {
        if (sscVar.a() < bArr.length) {
            return false;
        }
        int i = sscVar.b;
        byte[] bArr2 = new byte[bArr.length];
        sscVar.k(bArr2, 0, bArr.length);
        sscVar.M(i);
        return Arrays.equals(bArr2, bArr);
    }

    @Override // defpackage.iqg
    public final long b(ssc sscVar) {
        byte[] bArr = sscVar.a;
        return (((long) this.i) * xvk.g(bArr[0], bArr.length > 1 ? bArr[1] : (byte) 0)) / 1000000;
    }

    @Override // defpackage.iqg
    public final boolean c(ssc sscVar, long j, mvd mvdVar) {
        if (e(sscVar, o)) {
            byte[] bArrCopyOf = Arrays.copyOf(sscVar.a, sscVar.c);
            int i = bArrCopyOf[9] & 255;
            ArrayList arrayListE = xvk.e(bArrCopyOf);
            if (((jw7) mvdVar.F) == null) {
                iw7 iw7Var = new iw7();
                iw7Var.m = gkb.k("audio/ogg");
                iw7Var.n = gkb.k("audio/opus");
                iw7Var.F = i;
                iw7Var.G = 48000;
                iw7Var.q = arrayListE;
                mvdVar.F = new jw7(iw7Var);
                return true;
            }
        } else {
            if (!e(sscVar, p)) {
                ((jw7) mvdVar.F).getClass();
                return false;
            }
            ((jw7) mvdVar.F).getClass();
            if (!this.n) {
                this.n = true;
                sscVar.N(8);
                gjb gjbVarF = nkk.f(nz8.r((String[]) nkk.g(sscVar, false, false).F));
                if (gjbVarF != null) {
                    iw7 iw7VarA = ((jw7) mvdVar.F).a();
                    iw7VarA.k = gjbVarF.b(((jw7) mvdVar.F).l);
                    mvdVar.F = new jw7(iw7VarA);
                    return true;
                }
            }
        }
        return true;
    }

    @Override // defpackage.iqg
    public final void d(boolean z) {
        super.d(z);
        if (z) {
            this.n = false;
        }
    }
}
