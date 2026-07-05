package defpackage;

import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.widget.TextView;
import com.pvporbit.freetype.FreeTypeConstants;
import java.lang.Character;
import java.lang.ref.WeakReference;
import java.text.BreakIterator;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public class bi0 implements u0f {
    public final /* synthetic */ int a;
    public int b;
    public int c;
    public Object d;
    public Object e;

    public bi0(CharSequence charSequence, int i, Locale locale) {
        this.a = 8;
        this.d = charSequence;
        if (charSequence.length() < 0) {
            c39.a("input start index is outside the CharSequence");
        }
        if (i < 0 || i > charSequence.length()) {
            c39.a("input end index is outside the CharSequence");
        }
        BreakIterator wordInstance = BreakIterator.getWordInstance(locale);
        this.e = wordInstance;
        this.b = Math.max(0, -50);
        this.c = Math.min(charSequence.length(), i + 50);
        wordInstance.setText(new ri2(i, charSequence));
    }

    public static boolean z(int i) {
        return i == 32 || i == 10 || i == 13 || i == 9;
    }

    public int A(int i) {
        j(i);
        int iFollowing = ((BreakIterator) this.e).following(i);
        return (x(iFollowing + (-1)) && x(iFollowing) && !w(iFollowing)) ? A(iFollowing) : iFollowing;
    }

    public Integer B() {
        int i = this.b;
        if (i == this.c) {
            return null;
        }
        String str = (String) this.d;
        this.b = i + 1;
        return Integer.valueOf(str.charAt(i));
    }

    public float C() {
        x9c x9cVar = (x9c) this.e;
        float fH = x9cVar.h(this.b, this.c, (String) this.d);
        if (!Float.isNaN(fH)) {
            this.b = x9cVar.F;
        }
        return fH;
    }

    public n0f D() {
        float fC = C();
        if (Float.isNaN(fC)) {
            return null;
        }
        int iH = H();
        return iH == 0 ? new n0f(1, fC) : new n0f(iH, fC);
    }

    public String E() {
        String str = (String) this.d;
        if (q()) {
            return null;
        }
        int i = this.b;
        char cCharAt = str.charAt(i);
        if (cCharAt != '\'' && cCharAt != '\"') {
            return null;
        }
        int iH = h();
        while (iH != -1 && iH != cCharAt) {
            iH = h();
        }
        if (iH == -1) {
            this.b = i;
            return null;
        }
        int i2 = this.b;
        this.b = i2 + 1;
        return str.substring(i + 1, i2);
    }

    public String F() {
        return G(false, ' ');
    }

    public String G(boolean z, char c) {
        String str = (String) this.d;
        if (q()) {
            return null;
        }
        char cCharAt = str.charAt(this.b);
        if ((!z && z(cCharAt)) || cCharAt == c) {
            return null;
        }
        int i = this.b;
        int iH = h();
        while (iH != -1 && iH != c && (z || !z(iH))) {
            iH = h();
        }
        return str.substring(i, this.b);
    }

    public int H() {
        String str = (String) this.d;
        if (q()) {
            return 0;
        }
        char cCharAt = str.charAt(this.b);
        int i = this.b;
        if (cCharAt == '%') {
            this.b = i + 1;
            return 9;
        }
        if (i > this.c - 2) {
            return 0;
        }
        try {
            int iF = gid.F(str.substring(i, i + 2).toLowerCase(Locale.US));
            this.b += 2;
            return iF;
        } catch (IllegalArgumentException unused) {
            return 0;
        }
    }

    public void I(Typeface typeface) {
        int i;
        if (Build.VERSION.SDK_INT >= 28 && (i = this.b) != -1) {
            typeface = ei0.a(typeface, i, (this.c & 2) != 0);
        }
        fi0 fi0Var = (fi0) this.e;
        WeakReference weakReference = (WeakReference) this.d;
        if (fi0Var.m) {
            fi0Var.l = typeface;
            TextView textView = (TextView) weakReference.get();
            if (textView != null) {
                boolean zIsAttachedToWindow = textView.isAttachedToWindow();
                int i2 = fi0Var.j;
                if (zIsAttachedToWindow) {
                    textView.post(new yp1(textView, typeface, i2));
                } else {
                    textView.setTypeface(typeface, i2);
                }
            }
        }
    }

    public synchronized Object J() {
        return this.c == 0 ? null : L();
    }

    public synchronized Object K(long j) {
        Object objL;
        objL = null;
        while (this.c > 0 && j - ((long[]) this.d)[this.b] >= 0) {
            objL = L();
        }
        return objL;
    }

    public Object L() {
        fd9.M(this.c > 0);
        Object[] objArr = (Object[]) this.e;
        int i = this.b;
        Object obj = objArr[i];
        objArr[i] = null;
        this.b = (i + 1) % objArr.length;
        this.c--;
        return obj;
    }

    public float M() {
        R();
        x9c x9cVar = (x9c) this.e;
        float fH = x9cVar.h(this.b, this.c, (String) this.d);
        if (!Float.isNaN(fH)) {
            this.b = x9cVar.F;
        }
        return fH;
    }

    public int N(int i) {
        j(i);
        int iPreceding = ((BreakIterator) this.e).preceding(i);
        return (x(iPreceding) && t(iPreceding) && !w(iPreceding)) ? N(iPreceding) : iPreceding;
    }

    public void O(int i, int i2, String str) {
        if (i > i2) {
            c39.a("start index must be less than or equal to end index: " + i + " > " + i2);
        }
        if (i < 0) {
            c39.a("start must be non-negative, but was " + i);
        }
        z08 z08Var = (z08) this.e;
        if (z08Var != null) {
            int i3 = this.b;
            int i4 = i - i3;
            int i5 = i2 - i3;
            if (i4 >= 0 && i5 <= z08Var.d()) {
                z08Var.f(i4, i5, str);
                return;
            }
            this.d = toString();
            this.e = null;
            this.b = -1;
            this.c = -1;
            O(i, i2, str);
            return;
        }
        int iMax = Math.max(255, str.length() + FreeTypeConstants.FT_LOAD_PEDANTIC);
        char[] cArr = new char[iMax];
        int iMin = Math.min(i, 64);
        int iMin2 = Math.min(((String) this.d).length() - i2, 64);
        int i6 = i - iMin;
        jpk.k((String) this.d, cArr, 0, i6, i);
        int i7 = iMax - iMin2;
        int i8 = iMin2 + i2;
        jpk.k((String) this.d, cArr, i7, i2, i8);
        gpk.d(str, cArr, iMin);
        this.e = new z08(cArr, str.length() + iMin, i7, 0);
        this.b = i6;
        this.c = i8;
    }

    public synchronized void P(boolean z) {
        fkg fkgVar = (fkg) this.d;
        if (z == ((fkgVar == null && this.c == 0) ? false : true)) {
            return;
        }
        tp4 tp4Var = null;
        if (z) {
            meg megVar = (meg) this.e;
            this.d = gb9.D(megVar.b, null, null, new ba9(megVar, this, tp4Var, 24), 3);
        } else {
            if (fkgVar != null) {
                fkgVar.d(null);
            }
            this.d = null;
            int i = this.c;
            if (i != 0) {
                ((meg) this.e).e.stop(i);
                this.c = 0;
            }
        }
    }

    public synchronized int Q() {
        return this.c;
    }

    public boolean R() {
        S();
        int i = this.b;
        if (i == this.c || ((String) this.d).charAt(i) != ',') {
            return false;
        }
        this.b++;
        S();
        return true;
    }

    public void S() {
        while (true) {
            int i = this.b;
            if (i >= this.c || !z(((String) this.d).charAt(i))) {
                return;
            } else {
                this.b++;
            }
        }
    }

    @Override // defpackage.u0f
    public void a(float f, float f2, float f3, float f4) {
        g((byte) 3);
        o(4);
        float[] fArr = (float[]) this.e;
        int i = this.c;
        int i2 = i + 1;
        this.c = i2;
        fArr[i] = f;
        int i3 = i + 2;
        this.c = i3;
        fArr[i2] = f2;
        int i4 = i + 3;
        this.c = i4;
        fArr[i3] = f3;
        this.c = i + 4;
        fArr[i4] = f4;
    }

    @Override // defpackage.u0f
    public void b(float f, float f2) {
        g((byte) 0);
        o(2);
        float[] fArr = (float[]) this.e;
        int i = this.c;
        int i2 = i + 1;
        this.c = i2;
        fArr[i] = f;
        this.c = i + 2;
        fArr[i2] = f2;
    }

    @Override // defpackage.u0f
    public void c(float f, float f2, float f3, float f4, float f5, float f6) {
        g((byte) 2);
        o(6);
        float[] fArr = (float[]) this.e;
        int i = this.c;
        int i2 = i + 1;
        this.c = i2;
        fArr[i] = f;
        int i3 = i + 2;
        this.c = i3;
        fArr[i2] = f2;
        int i4 = i + 3;
        this.c = i4;
        fArr[i3] = f3;
        int i5 = i + 4;
        this.c = i5;
        fArr[i4] = f4;
        int i6 = i + 5;
        this.c = i6;
        fArr[i5] = f5;
        this.c = i + 6;
        fArr[i6] = f6;
    }

    @Override // defpackage.u0f
    public void close() {
        g((byte) 8);
    }

    @Override // defpackage.u0f
    public void d(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5) {
        g((byte) ((z ? 2 : 0) | 4 | (z2 ? 1 : 0)));
        o(5);
        float[] fArr = (float[]) this.e;
        int i = this.c;
        int i2 = i + 1;
        this.c = i2;
        fArr[i] = f;
        int i3 = i + 2;
        this.c = i3;
        fArr[i2] = f2;
        int i4 = i + 3;
        this.c = i4;
        fArr[i3] = f3;
        int i5 = i + 4;
        this.c = i5;
        fArr[i4] = f4;
        this.c = i + 5;
        fArr[i5] = f5;
    }

    @Override // defpackage.u0f
    public void e(float f, float f2) {
        g((byte) 1);
        o(2);
        float[] fArr = (float[]) this.e;
        int i = this.c;
        int i2 = i + 1;
        this.c = i2;
        fArr[i] = f;
        this.c = i + 2;
        fArr[i2] = f2;
    }

    public synchronized void f(long j, Object obj) {
        if (this.c > 0) {
            if (j <= ((long[]) this.d)[((this.b + r0) - 1) % ((Object[]) this.e).length]) {
                synchronized (this) {
                    this.b = 0;
                    this.c = 0;
                    Arrays.fill((Object[]) this.e, (Object) null);
                }
            }
        }
        p();
        int i = this.b;
        int i2 = this.c;
        Object[] objArr = (Object[]) this.e;
        int length = (i + i2) % objArr.length;
        ((long[]) this.d)[length] = j;
        objArr[length] = obj;
        this.c = i2 + 1;
    }

    public void g(byte b) {
        int i = this.b;
        byte[] bArr = (byte[]) this.d;
        if (i == bArr.length) {
            byte[] bArr2 = new byte[bArr.length * 2];
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            this.d = bArr2;
        }
        byte[] bArr3 = (byte[]) this.d;
        int i2 = this.b;
        this.b = i2 + 1;
        bArr3[i2] = b;
    }

    public int h() {
        int i = this.b;
        int i2 = this.c;
        if (i == i2) {
            return -1;
        }
        int i3 = i + 1;
        this.b = i3;
        if (i3 < i2) {
            return ((String) this.d).charAt(i3);
        }
        return -1;
    }

    public void i(int i) {
        new Handler(Looper.getMainLooper()).post(new us(this, i));
    }

    public void j(int i) {
        int i2 = this.b;
        int i3 = this.c;
        boolean z = false;
        if (i <= i3 && i2 <= i) {
            z = true;
        }
        if (z) {
            return;
        }
        StringBuilder sbV = vb7.v("Invalid offset: ", ". Valid range is [", i, i2, " , ");
        sbV.append(i3);
        sbV.append(']');
        c39.a(sbV.toString());
    }

    public Boolean k(Object obj) {
        if (obj == null) {
            return null;
        }
        R();
        int i = this.b;
        if (i == this.c) {
            return null;
        }
        char cCharAt = ((String) this.d).charAt(i);
        if (cCharAt != '0' && cCharAt != '1') {
            return null;
        }
        this.b++;
        return Boolean.valueOf(cCharAt == '1');
    }

    public float l(float f) {
        if (Float.isNaN(f)) {
            return Float.NaN;
        }
        R();
        return C();
    }

    public boolean m(char c) {
        int i = this.b;
        boolean z = i < this.c && ((String) this.d).charAt(i) == c;
        if (z) {
            this.b++;
        }
        return z;
    }

    public boolean n(String str) {
        int length = str.length();
        int i = this.b;
        boolean z = i <= this.c - length && ((String) this.d).substring(i, i + length).equals(str);
        if (z) {
            this.b += length;
        }
        return z;
    }

    public void o(int i) {
        float[] fArr = (float[]) this.e;
        if (fArr.length < this.c + i) {
            float[] fArr2 = new float[fArr.length * 2];
            System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
            this.e = fArr2;
        }
    }

    public void p() {
        int length = ((Object[]) this.e).length;
        if (this.c < length) {
            return;
        }
        int i = length * 2;
        long[] jArr = new long[i];
        Object[] objArr = new Object[i];
        int i2 = this.b;
        int i3 = length - i2;
        System.arraycopy((long[]) this.d, i2, jArr, 0, i3);
        System.arraycopy((Object[]) this.e, this.b, objArr, 0, i3);
        int i4 = this.b;
        if (i4 > 0) {
            System.arraycopy((long[]) this.d, 0, jArr, i3, i4);
            System.arraycopy((Object[]) this.e, 0, objArr, i3, this.b);
        }
        this.d = jArr;
        this.e = objArr;
        this.b = 0;
    }

    public boolean q() {
        return this.b == this.c;
    }

    public void r(u0f u0fVar) {
        int i = 0;
        for (int i2 = 0; i2 < this.b; i2++) {
            byte b = ((byte[]) this.d)[i2];
            if (b == 0) {
                float[] fArr = (float[]) this.e;
                int i3 = i + 1;
                float f = fArr[i];
                i += 2;
                u0fVar.b(f, fArr[i3]);
            } else if (b == 1) {
                float[] fArr2 = (float[]) this.e;
                int i4 = i + 1;
                float f2 = fArr2[i];
                i += 2;
                u0fVar.e(f2, fArr2[i4]);
            } else if (b == 2) {
                float[] fArr3 = (float[]) this.e;
                u0fVar.c(fArr3[i], fArr3[i + 1], fArr3[i + 2], fArr3[i + 3], fArr3[i + 4], fArr3[i + 5]);
                i += 6;
            } else if (b == 3) {
                float[] fArr4 = (float[]) this.e;
                float f3 = fArr4[i];
                float f4 = fArr4[i + 1];
                int i5 = i + 3;
                float f5 = fArr4[i + 2];
                i += 4;
                u0fVar.a(f3, f4, f5, fArr4[i5]);
            } else if (b != 8) {
                boolean z = (b & 2) != 0;
                boolean z2 = (b & 1) != 0;
                float[] fArr5 = (float[]) this.e;
                u0fVar.d(fArr5[i], fArr5[i + 1], fArr5[i + 2], z, z2, fArr5[i + 3], fArr5[i + 4]);
                i += 5;
            } else {
                u0fVar.close();
            }
        }
    }

    public int s() {
        z08 z08Var = (z08) this.e;
        String str = (String) this.d;
        if (z08Var == null) {
            return str.length();
        }
        return z08Var.d() + (str.length() - (this.c - this.b));
    }

    public boolean t(int i) {
        CharSequence charSequence = (CharSequence) this.d;
        int i2 = this.b + 1;
        if (i > this.c || i2 > i) {
            return false;
        }
        if (!Character.isLetterOrDigit(Character.codePointBefore(charSequence, i))) {
            int i3 = i - 1;
            if (!Character.isSurrogate(charSequence.charAt(i3))) {
                if (!gl6.d()) {
                    return false;
                }
                gl6 gl6VarA = gl6.a();
                if (gl6VarA.c() != 1 || gl6VarA.b(i3, charSequence) == -1) {
                    return false;
                }
            }
        }
        return true;
    }

    public String toString() {
        switch (this.a) {
            case 2:
                z08 z08Var = (z08) this.e;
                String str = (String) this.d;
                if (z08Var == null) {
                    return str;
                }
                StringBuilder sb = new StringBuilder();
                sb.append((CharSequence) str, 0, this.b);
                z08Var.a(sb);
                String str2 = (String) this.d;
                sb.append((CharSequence) str2, this.c, str2.length());
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public boolean u(int i) {
        int i2 = this.b + 1;
        if (i > this.c || i2 > i) {
            return false;
        }
        return ulk.h(Character.codePointBefore((CharSequence) this.d, i));
    }

    public boolean v(int i) {
        j(i);
        if (!((BreakIterator) this.e).isBoundary(i)) {
            return false;
        }
        if (x(i) && x(i - 1) && x(i + 1)) {
            return false;
        }
        return i <= 0 || i >= ((CharSequence) this.d).length() - 1 || !(w(i) || w(i + 1));
    }

    public boolean w(int i) {
        CharSequence charSequence = (CharSequence) this.d;
        int i2 = i - 1;
        Character.UnicodeBlock unicodeBlockOf = Character.UnicodeBlock.of(charSequence.charAt(i2));
        Character.UnicodeBlock unicodeBlock = Character.UnicodeBlock.HIRAGANA;
        if (x44.r(unicodeBlockOf, unicodeBlock) && x44.r(Character.UnicodeBlock.of(charSequence.charAt(i)), Character.UnicodeBlock.KATAKANA)) {
            return true;
        }
        return x44.r(Character.UnicodeBlock.of(charSequence.charAt(i)), unicodeBlock) && x44.r(Character.UnicodeBlock.of(charSequence.charAt(i2)), Character.UnicodeBlock.KATAKANA);
    }

    public boolean x(int i) {
        CharSequence charSequence = (CharSequence) this.d;
        int i2 = this.b;
        if (i >= this.c || i2 > i) {
            return false;
        }
        if (!Character.isLetterOrDigit(Character.codePointAt(charSequence, i)) && !Character.isSurrogate(charSequence.charAt(i))) {
            if (!gl6.d()) {
                return false;
            }
            gl6 gl6VarA = gl6.a();
            if (gl6VarA.c() != 1 || gl6VarA.b(i, charSequence) == -1) {
                return false;
            }
        }
        return true;
    }

    public boolean y(int i) {
        int i2 = this.b;
        if (i >= this.c || i2 > i) {
            return false;
        }
        return ulk.h(Character.codePointAt((CharSequence) this.d, i));
    }

    public /* synthetic */ bi0(byte b, int i) {
        this.a = i;
    }

    public bi0() {
        this.a = 7;
        this.d = new long[10];
        this.e = new Object[10];
    }

    public bi0(int i, int i2, String str, String str2) {
        this.a = 5;
        this.b = i;
        this.d = str;
        this.c = i2;
        this.e = str2;
    }

    public bi0(meg megVar, int i) {
        this.a = 6;
        this.e = megVar;
        this.b = i;
    }

    public bi0(fi0 fi0Var, int i, int i2, WeakReference weakReference) {
        this.a = 0;
        this.e = fi0Var;
        this.b = i;
        this.c = i2;
        this.d = weakReference;
    }

    public bi0(String str) {
        this.a = 4;
        this.b = 0;
        this.c = 0;
        this.e = new x9c(0);
        String strTrim = str.trim();
        this.d = strTrim;
        this.c = strTrim.length();
    }

    public bi0(int i) {
        this.a = 1;
        this.d = new t3i[i];
        this.c = 0;
    }
}
