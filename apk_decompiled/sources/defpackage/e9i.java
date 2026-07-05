package defpackage;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import com.agog.mathdisplay.render.MTTypesetterKt;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class e9i implements dxg {
    public final ssc E = new ssc();
    public final boolean F;
    public final int G;
    public final int H;
    public final String I;
    public final float J;
    public final int K;

    public e9i(List list) {
        if (list.size() != 1 || (((byte[]) list.get(0)).length != 48 && ((byte[]) list.get(0)).length != 53)) {
            this.G = 0;
            this.H = -1;
            this.I = "sans-serif";
            this.F = false;
            this.J = 0.85f;
            this.K = -1;
            return;
        }
        byte[] bArr = (byte[]) list.get(0);
        this.G = bArr[24];
        this.H = ((bArr[26] & 255) << 24) | ((bArr[27] & 255) << 16) | ((bArr[28] & 255) << 8) | (bArr[29] & 255);
        this.I = "Serif".equals(new String(bArr, 43, bArr.length - 43, StandardCharsets.UTF_8)) ? "serif" : "sans-serif";
        int i = bArr[25] * 20;
        this.K = i;
        boolean z = (bArr[0] & 32) != 0;
        this.F = z;
        if (z) {
            this.J = tpi.f(((bArr[11] & 255) | ((bArr[10] & 255) << 8)) / i, MTTypesetterKt.kLineSkipLimitMultiplier, 0.95f);
        } else {
            this.J = 0.85f;
        }
    }

    public static void c(SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3, int i4, int i5) {
        if (i != i2) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan((i >>> 8) | ((i & 255) << 24)), i3, i4, i5 | 33);
        }
    }

    public static void d(SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3, int i4, int i5) {
        if (i != i2) {
            int i6 = i5 | 33;
            boolean z = (i & 1) != 0;
            boolean z2 = (i & 2) != 0;
            if (z) {
                if (z2) {
                    spannableStringBuilder.setSpan(new StyleSpan(3), i3, i4, i6);
                } else {
                    spannableStringBuilder.setSpan(new StyleSpan(1), i3, i4, i6);
                }
            } else if (z2) {
                spannableStringBuilder.setSpan(new StyleSpan(2), i3, i4, i6);
            }
            boolean z3 = (i & 4) != 0;
            if (z3) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i3, i4, i6);
            }
            if (z3 || z || z2) {
                return;
            }
            spannableStringBuilder.setSpan(new StyleSpan(0), i3, i4, i6);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.dxg
    public final void b(byte[] bArr, int i, int i2, cxg cxgVar, gm4 gm4Var) {
        String strX;
        int i3;
        int i4;
        ssc sscVar = this.E;
        sscVar.K(bArr, i + i2);
        sscVar.M(i);
        int i5 = 1;
        int i6 = 0;
        int i7 = 2;
        fd9.E(sscVar.a() >= 2);
        int iG = sscVar.G();
        if (iG == 0) {
            strX = "";
        } else {
            int i8 = sscVar.b;
            Charset charsetI = sscVar.I();
            int i9 = iG - (sscVar.b - i8);
            if (charsetI == null) {
                charsetI = StandardCharsets.UTF_8;
            }
            strX = sscVar.x(i9, charsetI);
        }
        if (strX.isEmpty()) {
            iz8 iz8Var = nz8.F;
            gm4Var.accept(new hd5(-9223372036854775807L, -9223372036854775807L, vde.I));
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(strX);
        d(spannableStringBuilder, this.G, 0, 0, spannableStringBuilder.length(), 16711680);
        c(spannableStringBuilder, this.H, -1, 0, spannableStringBuilder.length(), 16711680);
        int length = spannableStringBuilder.length();
        String str = this.I;
        if (str != "sans-serif") {
            spannableStringBuilder.setSpan(new TypefaceSpan(str), 0, length, 16711713);
        }
        float f = this.J;
        while (sscVar.a() >= 8) {
            int i10 = sscVar.b;
            int iM = sscVar.m();
            int iM2 = sscVar.m();
            if (iM2 == 1937013100) {
                fd9.E(sscVar.a() >= i7 ? i5 : i6);
                int iG2 = sscVar.G();
                int i11 = i6;
                while (i11 < iG2) {
                    fd9.E(sscVar.a() >= 12 ? i5 : i6);
                    int iG3 = sscVar.G();
                    int iG4 = sscVar.G();
                    sscVar.N(i7);
                    int i12 = i11;
                    int iZ = sscVar.z();
                    sscVar.N(i5);
                    int iM3 = sscVar.m();
                    if (iG4 > spannableStringBuilder.length()) {
                        StringBuilder sbU = vb7.u("Truncating styl end (", iG4, ") to cueText.length() (");
                        sbU.append(spannableStringBuilder.length());
                        sbU.append(").");
                        ysj.u("Tx3gParser", sbU.toString());
                        iG4 = spannableStringBuilder.length();
                    }
                    if (iG3 >= iG4) {
                        ysj.u("Tx3gParser", vb7.q("Ignoring styl with start (", ") >= end (", iG3, iG4, ")."));
                        i4 = i12;
                    } else {
                        i4 = i12;
                        int i13 = iG4;
                        d(spannableStringBuilder, iZ, this.G, iG3, i13, 0);
                        c(spannableStringBuilder, iM3, this.H, iG3, i13, 0);
                    }
                    i11 = i4 + 1;
                    i5 = 1;
                    i6 = 0;
                    i7 = 2;
                }
                i3 = i7;
            } else if (iM2 == 1952608120 && this.F) {
                i3 = 2;
                fd9.E(sscVar.a() >= 2);
                f = tpi.f(sscVar.G() / this.K, MTTypesetterKt.kLineSkipLimitMultiplier, 0.95f);
            } else {
                i3 = 2;
            }
            sscVar.M(i10 + iM);
            i7 = i3;
            i5 = 1;
            i6 = 0;
        }
        gm4Var.accept(new hd5(-9223372036854775807L, -9223372036854775807L, nz8.u(new dd5(spannableStringBuilder, null, null, null, f, 0, 0, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, MTTypesetterKt.kLineSkipLimitMultiplier, 0))));
    }
}
