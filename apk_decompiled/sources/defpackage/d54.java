package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;

/* JADX INFO: loaded from: classes.dex */
public final class d54 {
    public static final long b = d4c.o(4278190080L);
    public static final long c;
    public static final long d;
    public static final long e;
    public static final long f;
    public static final long g;
    public static final long h;
    public static final /* synthetic */ int i = 0;
    public final long a;

    static {
        d4c.o(4282664004L);
        d4c.o(4287137928L);
        c = d4c.o(4291611852L);
        d = d4c.o(4294967295L);
        e = d4c.o(4294901760L);
        d4c.o(4278255360L);
        f = d4c.o(4278190335L);
        d4c.o(4294967040L);
        d4c.o(4278255615L);
        d4c.o(4294902015L);
        g = d4c.m(0);
        h = d4c.l(MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, t54.u);
    }

    public /* synthetic */ d54(long j) {
        this.a = j;
    }

    public static final long a(long j, r54 r54Var) {
        ei4 ei4VarS;
        r54 r54VarF = f(j);
        int i2 = r54VarF.c;
        int i3 = r54Var.c;
        if ((i2 | i3) < 0) {
            ei4VarS = eve.s(r54VarF, r54Var);
        } else {
            xub xubVar = fk4.a;
            int i4 = i2 | (i3 << 6);
            Object objB = xubVar.b(i4);
            if (objB == null) {
                objB = eve.s(r54VarF, r54Var);
                xubVar.i(i4, objB);
            }
            ei4VarS = (ei4) objB;
        }
        return ei4VarS.a(j);
    }

    public static long b(float f2, long j) {
        return d4c.l(h(j), g(j), e(j), f2, f(j));
    }

    public static final boolean c(long j, long j2) {
        return j == j2;
    }

    public static final float d(long j) {
        float fW;
        float f2;
        if ((63 & j) == 0) {
            fW = (float) mwa.W((j >>> 56) & 255);
            f2 = 255.0f;
        } else {
            fW = (float) mwa.W((j >>> 6) & 1023);
            f2 = 1023.0f;
        }
        return fW / f2;
    }

    public static final float e(long j) {
        int i2;
        int i3;
        int i4;
        if ((63 & j) == 0) {
            return ((float) mwa.W((j >>> 32) & 255)) / 255.0f;
        }
        short s = (short) ((j >>> 16) & 65535);
        int i5 = Short.MIN_VALUE & s;
        int i6 = ((65535 & s) >>> 10) & 31;
        int i7 = s & 1023;
        if (i6 != 0) {
            int i8 = i7 << 13;
            if (i6 == 31) {
                i2 = 255;
                if (i8 != 0) {
                    i8 |= 4194304;
                }
            } else {
                i2 = i6 + 112;
            }
            int i9 = i2;
            i3 = i8;
            i4 = i9;
        } else {
            if (i7 != 0) {
                float fIntBitsToFloat = Float.intBitsToFloat(i7 + 1056964608) - io7.a;
                return i5 == 0 ? fIntBitsToFloat : -fIntBitsToFloat;
            }
            i4 = 0;
            i3 = 0;
        }
        return Float.intBitsToFloat((i4 << 23) | (i5 << 16) | i3);
    }

    public static final r54 f(long j) {
        float[] fArr = t54.a;
        return t54.y[(int) (j & 63)];
    }

    public static final float g(long j) {
        int i2;
        int i3;
        int i4;
        if ((63 & j) == 0) {
            return ((float) mwa.W((j >>> 40) & 255)) / 255.0f;
        }
        short s = (short) ((j >>> 32) & 65535);
        int i5 = Short.MIN_VALUE & s;
        int i6 = ((65535 & s) >>> 10) & 31;
        int i7 = s & 1023;
        if (i6 != 0) {
            int i8 = i7 << 13;
            if (i6 == 31) {
                i2 = 255;
                if (i8 != 0) {
                    i8 |= 4194304;
                }
            } else {
                i2 = i6 + 112;
            }
            int i9 = i2;
            i3 = i8;
            i4 = i9;
        } else {
            if (i7 != 0) {
                float fIntBitsToFloat = Float.intBitsToFloat(i7 + 1056964608) - io7.a;
                return i5 == 0 ? fIntBitsToFloat : -fIntBitsToFloat;
            }
            i4 = 0;
            i3 = 0;
        }
        return Float.intBitsToFloat((i4 << 23) | (i5 << 16) | i3);
    }

    public static final float h(long j) {
        int i2;
        int i3;
        int i4;
        if ((63 & j) == 0) {
            return ((float) mwa.W((j >>> 48) & 255)) / 255.0f;
        }
        short s = (short) ((j >>> 48) & 65535);
        int i5 = Short.MIN_VALUE & s;
        int i6 = ((65535 & s) >>> 10) & 31;
        int i7 = s & 1023;
        if (i6 != 0) {
            int i8 = i7 << 13;
            if (i6 == 31) {
                i2 = 255;
                if (i8 != 0) {
                    i8 |= 4194304;
                }
            } else {
                i2 = i6 + 112;
            }
            int i9 = i2;
            i3 = i8;
            i4 = i9;
        } else {
            if (i7 != 0) {
                float fIntBitsToFloat = Float.intBitsToFloat(i7 + 1056964608) - io7.a;
                return i5 == 0 ? fIntBitsToFloat : -fIntBitsToFloat;
            }
            i4 = 0;
            i3 = 0;
        }
        return Float.intBitsToFloat((i4 << 23) | (i5 << 16) | i3);
    }

    public static String i(long j) {
        StringBuilder sb = new StringBuilder("Color(");
        sb.append(h(j));
        sb.append(", ");
        sb.append(g(j));
        sb.append(", ");
        sb.append(e(j));
        sb.append(", ");
        sb.append(d(j));
        sb.append(", ");
        return vb7.s(sb, f(j).a, ')');
    }

    public final boolean equals(Object obj) {
        if (obj instanceof d54) {
            return this.a == ((d54) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return i(this.a);
    }
}
