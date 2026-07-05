package defpackage;

import com.pvporbit.freetype.FreeTypeConstants;
import java.io.OutputStream;
import java.util.Arrays;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.JsonEncodingException;

/* JADX INFO: loaded from: classes.dex */
public final class zu2 implements lfh, uy8, e99 {
    public final /* synthetic */ int E;
    public int F;
    public final Object G;
    public Object H;
    public Object I;

    public zu2(OutputStream outputStream) {
        this.E = 3;
        outputStream.getClass();
        this.G = outputStream;
        this.H = o12.c.c(512);
        this.I = fi2.c.d(FreeTypeConstants.FT_LOAD_PEDANTIC);
    }

    @Override // defpackage.e99
    public void a(char c) {
        byte[] bArr = (byte[]) this.H;
        if (c < 128) {
            if (bArr.length - this.F < 1) {
                j();
            }
            int i = this.F;
            this.F = i + 1;
            bArr[i] = (byte) c;
            return;
        }
        if (c < 2048) {
            if (bArr.length - this.F < 2) {
                j();
            }
            int i2 = this.F;
            int i3 = i2 + 1;
            this.F = i3;
            bArr[i2] = (byte) ((c >> 6) | 192);
            int i4 = (c & '?') | FreeTypeConstants.FT_LOAD_PEDANTIC;
            this.F = i2 + 2;
            bArr[i3] = (byte) i4;
            return;
        }
        if (55296 <= c && c < 57344) {
            if (bArr.length - this.F < 1) {
                j();
            }
            int i5 = this.F;
            this.F = i5 + 1;
            bArr[i5] = 63;
            return;
        }
        if (c < 0) {
            if (bArr.length - this.F < 3) {
                j();
            }
            int i6 = this.F;
            int i7 = i6 + 1;
            this.F = i7;
            bArr[i6] = -32;
            int i8 = ((c >> 6) & 63) | FreeTypeConstants.FT_LOAD_PEDANTIC;
            int i9 = i6 + 2;
            this.F = i9;
            bArr[i7] = (byte) i8;
            int i10 = (c & '?') | FreeTypeConstants.FT_LOAD_PEDANTIC;
            this.F = i6 + 3;
            bArr[i9] = (byte) i10;
            return;
        }
        if (c > 65535) {
            throw new JsonEncodingException(grc.u("Unexpected code point: ", c, ". Check your strings for malformed UTF-8 sequences."), null, 6);
        }
        if (bArr.length - this.F < 4) {
            j();
        }
        int i11 = this.F;
        int i12 = i11 + 1;
        this.F = i12;
        bArr[i11] = -16;
        int i13 = i11 + 2;
        this.F = i13;
        bArr[i12] = -128;
        int i14 = ((c >> 6) & 63) | FreeTypeConstants.FT_LOAD_PEDANTIC;
        int i15 = i11 + 3;
        this.F = i15;
        bArr[i13] = (byte) i14;
        int i16 = (c & '?') | FreeTypeConstants.FT_LOAD_PEDANTIC;
        this.F = i11 + 4;
        bArr[i15] = (byte) i16;
    }

    @Override // defpackage.uy8
    public int b() {
        dfh dfhVar = (dfh) this.H;
        return dfhVar != null ? dfhVar.F.length() : ((i5i) this.G).d().G.length();
    }

    public boolean c() {
        i5i i5iVar = (i5i) this.G;
        wwb wwbVar = (wwb) this.I;
        int i = this.F - 1;
        this.F = i;
        if (i == 0 && wwbVar.G != 0) {
            yih yihVar = i5iVar.a;
            k6e k6eVar = i5iVar.b;
            yihVar.b.a().D();
            dfh dfhVar = yihVar.b;
            if (i5iVar.c == null) {
                this.H = dfhVar;
            }
            Object[] objArr = wwbVar.E;
            int i2 = wwbVar.G;
            for (int i3 = 0; i3 < i2; i3++) {
                ((bz7) objArr[i3]).invoke(dfhVar);
            }
            i5iVar.l(dfhVar);
            yih.a(yihVar, k6eVar, false, cgh.E);
            yihVar.f(true);
            wwbVar.h();
        }
        return this.F > 0;
    }

    @Override // defpackage.uy8
    public long d(long j) {
        i5i i5iVar = (i5i) this.G;
        return i5iVar.c != null ? i5iVar.e(j) : j;
    }

    @Override // defpackage.e99
    public void e(String str) {
        byte b;
        str.getClass();
        h(0, str.length() + 2);
        char[] cArr = (char[]) this.I;
        cArr[0] = '\"';
        int length = str.length();
        str.getChars(0, length, cArr, 1);
        int i = length + 1;
        int length2 = 1;
        while (length2 < i) {
            char c = cArr[length2];
            byte[] bArr = jrg.b;
            if (c < bArr.length && bArr[c] != 0) {
                int length3 = str.length();
                for (int i2 = length2 - 1; i2 < length3; i2++) {
                    h(length2, 2);
                    char cCharAt = str.charAt(i2);
                    byte[] bArr2 = jrg.b;
                    if (cCharAt >= bArr2.length || (b = bArr2[cCharAt]) == 0) {
                        int i3 = length2 + 1;
                        ((char[]) this.I)[length2] = cCharAt;
                        length2 = i3;
                    } else {
                        if (b == 1) {
                            String str2 = jrg.a[cCharAt];
                            str2.getClass();
                            h(length2, str2.length());
                            str2.getChars(0, str2.length(), (char[]) this.I, length2);
                            length2 = str2.length() + length2;
                        } else {
                            char[] cArr2 = (char[]) this.I;
                            cArr2[length2] = '\\';
                            cArr2[length2 + 1] = (char) b;
                            length2 += 2;
                        }
                    }
                }
                h(length2, 1);
                char[] cArr3 = (char[]) this.I;
                cArr3[length2] = '\"';
                n(cArr3, length2 + 1);
                j();
                return;
            }
            length2++;
        }
        cArr[i] = '\"';
        n(cArr, length + 2);
        j();
    }

    @Override // defpackage.uy8
    public void f(bz7 bz7Var) {
        this.F++;
        ((wwb) this.I).b(bz7Var);
        c();
    }

    @Override // defpackage.e99
    public void g(String str) {
        str.getClass();
        int length = str.length();
        h(0, length);
        str.getChars(0, length, (char[]) this.I, 0);
        n((char[]) this.I, length);
    }

    public void h(int i, int i2) {
        int i3 = i2 + i;
        char[] cArr = (char[]) this.I;
        if (cArr.length <= i3) {
            int i4 = i * 2;
            if (i3 < i4) {
                i3 = i4;
            }
            this.I = Arrays.copyOf(cArr, i3);
        }
    }

    @Override // defpackage.uy8
    public long i(long j) {
        i5i i5iVar = (i5i) this.G;
        return i5iVar.c != null ? i5iVar.f(j) : j;
    }

    public void j() {
        ((OutputStream) this.G).write((byte[]) this.H, 0, this.F);
        this.F = 0;
    }

    @Override // defpackage.lfh
    public void k(ta4 ta4Var, ld4 ld4Var, int i) {
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(1505456138);
        int i2 = (e18Var.f(this) ? 32 : 16) | i;
        if (e18Var.Q(i2 & 1, (i2 & 19) != 18)) {
            if (((yih) this.G).d().G.length() == 0) {
                e18Var.a0(995412967);
                tjh.b((String) this.I, null, ((ffh) this.H).B, 0L, null, null, null, 0L, null, null, 0L, 2, false, this.F, 0, null, null, e18Var, 0, 384, 241658);
                e18Var = e18Var;
                e18Var.p(false);
            } else {
                e18Var.a0(995697144);
                e18Var.p(false);
            }
            ta4Var.invoke(e18Var, 6);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new ow1(this, ta4Var, i, 4);
        }
    }

    public String l() {
        StringBuilder sb = new StringBuilder("$");
        int i = this.F + 1;
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = ((Object[]) this.H)[i2];
            if (obj instanceof SerialDescriptor) {
                SerialDescriptor serialDescriptor = (SerialDescriptor) obj;
                boolean zR = x44.r(serialDescriptor.getKind(), vsg.m);
                int[] iArr = (int[]) this.I;
                if (!zR) {
                    int i3 = iArr[i2];
                    if (i3 >= 0) {
                        sb.append(".");
                        sb.append(serialDescriptor.f(i3));
                    }
                } else if (iArr[i2] != -1) {
                    sb.append("[");
                    sb.append(((int[]) this.I)[i2]);
                    sb.append("]");
                }
            } else if (obj == pyk.M) {
                sb.append("[<debug info disabled>]");
            } else if (obj != ql8.I) {
                sb.append("['");
                sb.append(obj);
                sb.append("']");
            }
        }
        return sb.toString();
    }

    public void m() {
        int i = this.F * 2;
        this.H = Arrays.copyOf((Object[]) this.H, i);
        int[] iArr = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            iArr[i2] = -1;
        }
        mp0.u0(0, 0, 14, (int[]) this.I, iArr);
        this.I = iArr;
    }

    public void n(char[] cArr, int i) {
        byte[] bArr = (byte[]) this.H;
        if (i < 0) {
            sz6.p("count < 0");
            return;
        }
        if (i > cArr.length) {
            pmf.f(cArr.length, vb7.u("count > string.length: ", i, " > "));
            return;
        }
        int i2 = 0;
        while (i2 < i) {
            char c = cArr[i2];
            if (c < 128) {
                if (bArr.length - this.F < 1) {
                    j();
                }
                int i3 = this.F;
                int i4 = i3 + 1;
                this.F = i4;
                bArr[i3] = (byte) c;
                i2++;
                int iMin = Math.min(i, (bArr.length - i4) + i2);
                while (i2 < iMin) {
                    char c2 = cArr[i2];
                    if (c2 < 128) {
                        int i5 = this.F;
                        this.F = i5 + 1;
                        bArr[i5] = (byte) c2;
                        i2++;
                    }
                }
            } else {
                if (c < 2048) {
                    if (bArr.length - this.F < 2) {
                        j();
                    }
                    int i6 = this.F;
                    int i7 = i6 + 1;
                    this.F = i7;
                    bArr[i6] = (byte) ((c >> 6) | 192);
                    int i8 = (c & '?') | FreeTypeConstants.FT_LOAD_PEDANTIC;
                    this.F = i6 + 2;
                    bArr[i7] = (byte) i8;
                } else if (c < 55296 || c > 57343) {
                    if (bArr.length - this.F < 3) {
                        j();
                    }
                    int i9 = this.F;
                    int i10 = i9 + 1;
                    this.F = i10;
                    bArr[i9] = (byte) ((c >> '\f') | 224);
                    int i11 = ((c >> 6) & 63) | FreeTypeConstants.FT_LOAD_PEDANTIC;
                    int i12 = i9 + 2;
                    this.F = i12;
                    bArr[i10] = (byte) i11;
                    int i13 = (c & '?') | FreeTypeConstants.FT_LOAD_PEDANTIC;
                    this.F = i9 + 3;
                    bArr[i12] = (byte) i13;
                } else {
                    int i14 = i2 + 1;
                    char c3 = i14 < i ? cArr[i14] : (char) 0;
                    if (c > 56319 || 56320 > c3 || c3 >= 57344) {
                        if (bArr.length - this.F < 1) {
                            j();
                        }
                        int i15 = this.F;
                        this.F = i15 + 1;
                        bArr[i15] = 63;
                        i2 = i14;
                    } else {
                        int i16 = (((c & 1023) << 10) | (c3 & 1023)) + 65536;
                        if (bArr.length - this.F < 4) {
                            j();
                        }
                        int i17 = this.F;
                        int i18 = i17 + 1;
                        this.F = i18;
                        bArr[i17] = (byte) ((i16 >> 18) | 240);
                        int i19 = ((i16 >> 12) & 63) | FreeTypeConstants.FT_LOAD_PEDANTIC;
                        int i20 = i17 + 2;
                        this.F = i20;
                        bArr[i18] = (byte) i19;
                        int i21 = ((i16 >> 6) & 63) | FreeTypeConstants.FT_LOAD_PEDANTIC;
                        int i22 = i17 + 3;
                        this.F = i22;
                        bArr[i20] = (byte) i21;
                        int i23 = (i16 & 63) | FreeTypeConstants.FT_LOAD_PEDANTIC;
                        this.F = i17 + 4;
                        bArr[i22] = (byte) i23;
                        i2 += 2;
                    }
                }
                i2++;
            }
        }
    }

    public String toString() {
        switch (this.E) {
            case 2:
                return l();
            default:
                return super.toString();
        }
    }

    @Override // defpackage.e99
    public void writeLong(long j) {
        g(String.valueOf(j));
    }

    public zu2(yih yihVar, ffh ffhVar, String str, int i) {
        this.E = 0;
        this.G = yihVar;
        this.H = ffhVar;
        this.I = str;
        this.F = i;
    }

    public zu2(rg9 rg9Var) {
        this.E = 2;
        this.G = rg9Var;
        this.H = new Object[8];
        int[] iArr = new int[8];
        for (int i = 0; i < 8; i++) {
            iArr[i] = -1;
        }
        this.I = iArr;
        this.F = -1;
    }

    public zu2(i5i i5iVar) {
        this.E = 1;
        this.G = i5iVar;
        this.I = new wwb(0, new bz7[16]);
    }
}
