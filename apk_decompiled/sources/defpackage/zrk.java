package defpackage;

import android.content.res.Resources;
import android.graphics.PointF;
import android.text.Annotation;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.StyleSpan;
import android.text.style.URLSpan;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.pvporbit.freetype.FreeTypeConstants;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zrk {
    public static final ta4 a = new ta4(627309930, false, new wb4(5));

    public static final void a(ir4 ir4Var, String str, bz7 bz7Var, iqb iqbVar, ld4 ld4Var, int i) {
        int i2;
        iqb iqbVar2;
        long j;
        long j2;
        long j3;
        ir4Var.getClass();
        str.getClass();
        bz7Var.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-1293859955);
        if ((i & 6) == 0) {
            i2 = (e18Var.d(ir4Var.ordinal()) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= e18Var.f(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= e18Var.h(bz7Var) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        int i3 = i2 | 3072;
        if (e18Var.Q(i3 & 1, (i3 & 1171) != 1170)) {
            long j4 = gm3.a(e18Var).c;
            long j5 = gm3.a(e18Var).c;
            long j6 = gm3.a(e18Var).N;
            long j7 = gm3.a(e18Var).N;
            long j8 = gm3.a(e18Var).q;
            long j9 = d54.h;
            n54 n54Var = ((gwa) e18Var.j(jwa.a)).a;
            kyb kybVar = n54Var.j0;
            if (kybVar == null) {
                long jC = p54.c(n54Var, ttj.f);
                long jC2 = p54.c(n54Var, ttj.i);
                long jC3 = p54.c(n54Var, ttj.g);
                o54 o54Var = ttj.j;
                long jC4 = p54.c(n54Var, o54Var);
                o54 o54Var2 = ttj.k;
                j = j8;
                kybVar = new kyb(jC, jC2, jC3, jC4, p54.c(n54Var, o54Var2), d54.b(0.38f, p54.c(n54Var, o54Var)), d54.b(0.38f, p54.c(n54Var, o54Var2)));
                n54Var.j0 = kybVar;
            } else {
                j = j8;
            }
            if (j4 != 16) {
                j3 = j4;
                j2 = 16;
            } else {
                j2 = 16;
                j3 = kybVar.a;
            }
            if (j5 == j2) {
                j5 = kybVar.b;
            }
            long j10 = j5;
            long j11 = j != j2 ? j : kybVar.c;
            if (j6 == j2) {
                j6 = kybVar.d;
            }
            long j12 = j6;
            if (j7 == j2) {
                j7 = kybVar.e;
            }
            ryb.a(gm3.a(e18Var).n, gm3.a(e18Var).M, null, fd9.q0(724716038, new bn(ir4Var, bz7Var, new kyb(j3, j10, j11, j12, j7, j9 != j2 ? j9 : kybVar.f, j9 != j2 ? j9 : kybVar.g), str, 18), e18Var), e18Var, 196614);
            iqbVar2 = fqb.E;
        } else {
            e18Var.T();
            iqbVar2 = iqbVar;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new xd((Object) ir4Var, (Object) str, bz7Var, iqbVar2, i, 22);
        }
    }

    public static final long b(long j, CharSequence charSequence) {
        int i = kkh.c;
        int iCharCount = (int) (j >> 32);
        int iCharCount2 = (int) (4294967295L & j);
        int iCodePointBefore = iCharCount > 0 ? Character.codePointBefore(charSequence, iCharCount) : 10;
        int iCodePointAt = iCharCount2 < charSequence.length() ? Character.codePointAt(charSequence, iCharCount2) : 10;
        if (s(iCodePointBefore) && (r(iCodePointAt) || q(iCodePointAt))) {
            do {
                iCharCount -= Character.charCount(iCodePointBefore);
                if (iCharCount == 0) {
                    break;
                }
                iCodePointBefore = Character.codePointBefore(charSequence, iCharCount);
            } while (s(iCodePointBefore));
            return mwa.m(iCharCount, iCharCount2);
        }
        if (!s(iCodePointAt)) {
            return j;
        }
        if (!r(iCodePointBefore) && !q(iCodePointBefore)) {
            return j;
        }
        do {
            iCharCount2 += Character.charCount(iCodePointAt);
            if (iCharCount2 == charSequence.length()) {
                break;
            }
            iCodePointAt = Character.codePointAt(charSequence, iCharCount2);
        } while (s(iCodePointAt));
        return mwa.m(iCharCount, iCharCount2);
    }

    public static final long c(yjh yjhVar, long j, long j2, cu9 cu9Var, ovi oviVar) {
        if (yjhVar != null) {
            qtb qtbVar = yjhVar.b;
            if (cu9Var != null) {
                long jH = cu9Var.H(j);
                long jH2 = cu9Var.H(j2);
                int iM = m(qtbVar, jH, oviVar);
                int iM2 = m(qtbVar, jH2, oviVar);
                if (iM != -1) {
                    if (iM2 != -1) {
                        iM = Math.min(iM, iM2);
                    }
                    iM2 = iM;
                } else if (iM2 == -1) {
                    return kkh.b;
                }
                float fB = (qtbVar.b(iM2) + qtbVar.f(iM2)) / 2.0f;
                int i = (int) (jH >> 32);
                int i2 = (int) (jH2 >> 32);
                return qtbVar.h(new l9e(Math.min(Float.intBitsToFloat(i), Float.intBitsToFloat(i2)), fB - 0.1f, Math.max(Float.intBitsToFloat(i), Float.intBitsToFloat(i2)), fB + 0.1f), 0, hj6.T);
            }
        }
        return kkh.b;
    }

    public static final long d(m2a m2aVar, l9e l9eVar, l9e l9eVar2, int i) {
        long jO = o(m2aVar, l9eVar, i);
        if (kkh.d(jO)) {
            return kkh.b;
        }
        long jO2 = o(m2aVar, l9eVar2, i);
        if (kkh.d(jO2)) {
            return kkh.b;
        }
        int i2 = (int) (jO >> 32);
        int i3 = (int) (jO2 & 4294967295L);
        return mwa.m(Math.min(i2, i2), Math.max(i3, i3));
    }

    public static final long e(akh akhVar, l9e l9eVar, l9e l9eVar2, int i) {
        long jP = p(akhVar, l9eVar, i);
        if (kkh.d(jP)) {
            return kkh.b;
        }
        long jP2 = p(akhVar, l9eVar2, i);
        if (kkh.d(jP2)) {
            return kkh.b;
        }
        int i2 = (int) (jP >> 32);
        int i3 = (int) (jP2 & 4294967295L);
        return mwa.m(Math.min(i2, i2), Math.max(i3, i3));
    }

    public static final boolean f(yjh yjhVar, int i) {
        qtb qtbVar = yjhVar.b;
        int iD = qtbVar.d(i);
        return i == yjhVar.h(iD) || i == qtbVar.c(iD, false) ? yjhVar.i(i) != yjhVar.a(i) : yjhVar.a(i) != yjhVar.a(i - 1);
    }

    public static final long g(int i, CharSequence charSequence) {
        int iCharCount = i;
        while (iCharCount > 0) {
            int iCodePointBefore = Character.codePointBefore(charSequence, iCharCount);
            if (!r(iCodePointBefore)) {
                break;
            }
            iCharCount -= Character.charCount(iCodePointBefore);
        }
        while (i < charSequence.length()) {
            int iCodePointAt = Character.codePointAt(charSequence, i);
            if (!r(iCodePointAt)) {
                break;
            }
            i += Character.charCount(iCodePointAt);
        }
        return mwa.m(iCharCount, i);
    }

    public static final long h(PointF pointF) {
        float f = pointF.x;
        float f2 = pointF.y;
        return (((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(f2)) & 4294967295L);
    }

    public static final zb0 i(int i, ld4 ld4Var) {
        e18 e18Var = (e18) ld4Var;
        CharSequence text = ((Resources) e18Var.j(w00.c)).getText(i);
        text.getClass();
        if (!(text instanceof Spanned)) {
            e18Var.a0(1259010712);
            e18Var.p(false);
            return new zb0(text.toString());
        }
        e18Var.a0(1258964832);
        zb0 zb0VarU = u((Spanned) text, null, null, e18Var, 3);
        e18Var.p(false);
        return zb0VarU;
    }

    public static final zb0 j(int i, List list, ekh ekhVar, CharSequence[] charSequenceArr, ld4 ld4Var, int i2, int i3) {
        if ((i3 & 4) != 0) {
            ekhVar = null;
        }
        e18 e18Var = (e18) ld4Var;
        CharSequence text = ((Resources) e18Var.j(w00.c)).getText(i);
        text.getClass();
        CharSequence charSequenceExpandTemplate = TextUtils.expandTemplate(text, (CharSequence[]) Arrays.copyOf(charSequenceArr, charSequenceArr.length));
        if (!(charSequenceExpandTemplate instanceof Spanned)) {
            e18Var.a0(902464604);
            e18Var.p(false);
            return new zb0(charSequenceExpandTemplate.toString());
        }
        e18Var.a0(902375355);
        zb0 zb0VarU = u((Spanned) charSequenceExpandTemplate, ekhVar, (String[]) list.toArray(new String[0]), e18Var, 0);
        e18Var.p(false);
        return zb0VarU;
    }

    public static final zb0 k(int i, CharSequence[] charSequenceArr, ld4 ld4Var) {
        e18 e18Var = (e18) ld4Var;
        CharSequence text = ((Resources) e18Var.j(w00.c)).getText(i);
        text.getClass();
        CharSequence charSequenceExpandTemplate = TextUtils.expandTemplate(text, (CharSequence[]) Arrays.copyOf(charSequenceArr, charSequenceArr.length));
        if (!(charSequenceExpandTemplate instanceof Spanned)) {
            e18Var.a0(-1032902841);
            e18Var.p(false);
            return new zb0(charSequenceExpandTemplate.toString());
        }
        e18Var.a0(-1032952689);
        zb0 zb0VarU = u((Spanned) charSequenceExpandTemplate, null, null, e18Var, 3);
        e18Var.p(false);
        return zb0VarU;
    }

    public static npe l(qh9 qh9Var) {
        try {
            Number numberL = qh9Var.s("width").l();
            Number numberL2 = qh9Var.s("height").l();
            numberL.getClass();
            numberL2.getClass();
            return new npe(numberL, numberL2);
        } catch (IllegalStateException e) {
            pmf.j("Unable to parse json into type Viewport", e);
            return null;
        } catch (NullPointerException e2) {
            pmf.j("Unable to parse json into type Viewport", e2);
            return null;
        } catch (NumberFormatException e3) {
            pmf.j("Unable to parse json into type Viewport", e3);
            return null;
        }
    }

    public static final int m(qtb qtbVar, long j, ovi oviVar) {
        float fG = oviVar != null ? oviVar.g() : MTTypesetterKt.kLineSkipLimitMultiplier;
        int i = (int) (4294967295L & j);
        int iE = qtbVar.e(Float.intBitsToFloat(i));
        if (Float.intBitsToFloat(i) < qtbVar.f(iE) - fG || Float.intBitsToFloat(i) > qtbVar.b(iE) + fG) {
            return -1;
        }
        int i2 = (int) (j >> 32);
        if (Float.intBitsToFloat(i2) < (-fG) || Float.intBitsToFloat(i2) > qtbVar.d + fG) {
            return -1;
        }
        return iE;
    }

    public static final int n(qtb qtbVar, long j, cu9 cu9Var, ovi oviVar) {
        long jH;
        int iM;
        if (cu9Var == null || (iM = m(qtbVar, (jH = cu9Var.H(j)), oviVar)) == -1) {
            return -1;
        }
        return qtbVar.g(fcc.a(jH, (qtbVar.b(iM) + qtbVar.f(iM)) / 2.0f, 1));
    }

    public static final long o(m2a m2aVar, l9e l9eVar, int i) {
        zjh zjhVarD = m2aVar.d();
        qtb qtbVar = zjhVarD != null ? zjhVarD.a.b : null;
        cu9 cu9VarC = m2aVar.c();
        return (qtbVar == null || cu9VarC == null) ? kkh.b : qtbVar.h(l9eVar.m(cu9VarC.H(0L)), i, hj6.U);
    }

    public static final long p(akh akhVar, l9e l9eVar, int i) {
        yjh yjhVarC = akhVar.c();
        qtb qtbVar = yjhVarC != null ? yjhVarC.b : null;
        cu9 cu9VarE = akhVar.e();
        return (qtbVar == null || cu9VarE == null) ? kkh.b : qtbVar.h(l9eVar.m(cu9VarE.H(0L)), i, hj6.U);
    }

    public static final boolean q(int i) {
        int type = Character.getType(i);
        return type == 23 || type == 20 || type == 22 || type == 30 || type == 29 || type == 24 || type == 21;
    }

    public static final boolean r(int i) {
        return Character.isWhitespace(i) || i == 160;
    }

    public static final boolean s(int i) {
        int type;
        return (!r(i) || (type = Character.getType(i)) == 14 || type == 13 || i == 10) ? false : true;
    }

    public static ojb t(MappedByteBuffer mappedByteBuffer) throws IOException {
        long j;
        ByteBuffer byteBufferDuplicate = mappedByteBuffer.duplicate();
        byteBufferDuplicate.order(ByteOrder.BIG_ENDIAN);
        byteBufferDuplicate.position(byteBufferDuplicate.position() + 4);
        int i = byteBufferDuplicate.getShort() & 65535;
        if (i > 100) {
            xh6.c("Cannot read metadata.");
            return null;
        }
        byteBufferDuplicate.position(byteBufferDuplicate.position() + 6);
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                j = -1;
                break;
            }
            int i3 = byteBufferDuplicate.getInt();
            byteBufferDuplicate.position(byteBufferDuplicate.position() + 4);
            j = ((long) byteBufferDuplicate.getInt()) & 4294967295L;
            byteBufferDuplicate.position(byteBufferDuplicate.position() + 4);
            if (1835365473 == i3) {
                break;
            }
            i2++;
        }
        if (j != -1) {
            byteBufferDuplicate.position(byteBufferDuplicate.position() + ((int) (j - ((long) byteBufferDuplicate.position()))));
            byteBufferDuplicate.position(byteBufferDuplicate.position() + 12);
            long j2 = ((long) byteBufferDuplicate.getInt()) & 4294967295L;
            for (int i4 = 0; i4 < j2; i4++) {
                int i5 = byteBufferDuplicate.getInt();
                long j3 = ((long) byteBufferDuplicate.getInt()) & 4294967295L;
                byteBufferDuplicate.getInt();
                if (1164798569 == i5 || 1701669481 == i5) {
                    byteBufferDuplicate.position((int) (j3 + j));
                    ojb ojbVar = new ojb();
                    byteBufferDuplicate.order(ByteOrder.LITTLE_ENDIAN);
                    int iPosition = byteBufferDuplicate.position() + byteBufferDuplicate.getInt(byteBufferDuplicate.position());
                    ojbVar.d = byteBufferDuplicate;
                    ojbVar.a = iPosition;
                    int i6 = iPosition - byteBufferDuplicate.getInt(iPosition);
                    ojbVar.b = i6;
                    ojbVar.c = ((ByteBuffer) ojbVar.d).getShort(i6);
                    return ojbVar;
                }
            }
        }
        xh6.c("Cannot read metadata.");
        return null;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final zb0 u(Spanned spanned, ekh ekhVar, String[] strArr, ld4 ld4Var, int i) {
        long j;
        ekh ekhVar2 = (i & 1) != 0 ? null : ekhVar;
        String[] strArr2 = (i & 2) != 0 ? null : strArr;
        jl3 jl3VarA = gm3.a(ld4Var);
        xb0 xb0Var = new xb0(spanned.length());
        xb0Var.g(spanned);
        Object[] spans = spanned.getSpans(0, spanned.length(), Annotation.class);
        spans.getClass();
        for (Object obj : spans) {
            Annotation annotation = (Annotation) obj;
            annotation.getClass();
            int spanStart = spanned.getSpanStart(annotation);
            int spanEnd = spanned.getSpanEnd(annotation);
            if (x44.r(annotation.getKey(), "textColor")) {
                String value = annotation.getValue();
                value.getClass();
                switch (value.hashCode()) {
                    case -1216229138:
                        if (!value.equals("danger100")) {
                            sz6.p("Unknown color value: ".concat(value));
                            return null;
                        }
                        j = jl3VarA.y;
                        break;
                        break;
                    case 47664:
                        if (!value.equals("000")) {
                            sz6.p("Unknown color value: ".concat(value));
                            return null;
                        }
                        j = jl3VarA.M;
                        break;
                        break;
                    case 48625:
                        if (!value.equals("100")) {
                            sz6.p("Unknown color value: ".concat(value));
                            return null;
                        }
                        j = jl3VarA.M;
                        break;
                        break;
                    case 49586:
                        if (!value.equals("200")) {
                            sz6.p("Unknown color value: ".concat(value));
                            return null;
                        }
                        j = jl3VarA.N;
                        break;
                        break;
                    case 50547:
                        if (!value.equals("300")) {
                            sz6.p("Unknown color value: ".concat(value));
                            return null;
                        }
                        j = jl3VarA.N;
                        break;
                        break;
                    case 51508:
                        if (!value.equals("400")) {
                            sz6.p("Unknown color value: ".concat(value));
                            return null;
                        }
                        j = jl3VarA.O;
                        break;
                        break;
                    case 52469:
                        if (!value.equals("500")) {
                            sz6.p("Unknown color value: ".concat(value));
                            return null;
                        }
                        j = jl3VarA.O;
                        break;
                        break;
                    case 1059365663:
                        if (!value.equals("claudeClay")) {
                            sz6.p("Unknown color value: ".concat(value));
                            return null;
                        }
                        jl3VarA.P.getClass();
                        dx1.b.getClass();
                        j = cx1.b;
                        break;
                        break;
                    default:
                        sz6.p("Unknown color value: ".concat(value));
                        return null;
                }
                xb0Var.b(new egg(j, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 65534), spanStart, spanEnd);
            } else {
                String key = annotation.getKey();
                key.getClass();
                String value2 = annotation.getValue();
                value2.getClass();
                xb0Var.a(spanStart, spanEnd, key, value2);
            }
        }
        Object[] spans2 = spanned.getSpans(0, spanned.length(), URLSpan.class);
        spans2.getClass();
        for (Object obj2 : spans2) {
            URLSpan uRLSpan = (URLSpan) obj2;
            String url = strArr2 == null ? uRLSpan.getURL() : TextUtils.expandTemplate(uRLSpan.getURL(), (CharSequence[]) Arrays.copyOf(strArr2, strArr2.length)).toString();
            url.getClass();
            xb0Var.G.add(new wb0(new n6a(url, ekhVar2, 4), spanned.getSpanStart(uRLSpan), spanned.getSpanEnd(uRLSpan), null, 8));
            xb0Var.b(new egg(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, qeh.c, null, 61439), spanned.getSpanStart(uRLSpan), spanned.getSpanEnd(uRLSpan));
        }
        Object[] spans3 = spanned.getSpans(0, spanned.length(), StyleSpan.class);
        spans3.getClass();
        for (Object obj3 : spans3) {
            StyleSpan styleSpan = (StyleSpan) obj3;
            int style = styleSpan.getStyle();
            xb0Var.b(style != 1 ? style != 2 ? style != 3 ? new egg(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 65535) : new egg(0L, 0L, dv7.M, new wu7(1), null, null, null, 0L, null, null, null, 0L, null, null, 65523) : new egg(0L, 0L, null, new wu7(1), null, null, null, 0L, null, null, null, 0L, null, null, 65527) : new egg(0L, 0L, dv7.M, null, null, null, null, 0L, null, null, null, 0L, null, null, 65531), spanned.getSpanStart(styleSpan), spanned.getSpanEnd(styleSpan));
        }
        return xb0Var.n();
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x005d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005f A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean v(java.util.concurrent.ThreadPoolExecutor r16, defpackage.h99 r17, defpackage.iuj r18) {
        /*
            r17.getClass()
            r18.getClass()
            long r1 = java.lang.System.nanoTime()
            r5 = 0
            r7 = 10
            r3 = 100
            long r3 = defpackage.wd6.f0(r3, r5, r7)
        L14:
            long r5 = r16.getTaskCount()
            long r7 = r16.getCompletedTaskCount()
            long r5 = r5 - r7
            r7 = 0
            int r0 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            r5 = 1
            if (r0 > 0) goto L25
            return r5
        L25:
            g99 r11 = defpackage.g99.F
            r6 = 0
            java.lang.Thread.sleep(r3)     // Catch: java.lang.IllegalArgumentException -> L2d java.lang.InterruptedException -> L3b
        L2b:
            r0 = r6
            goto L51
        L2d:
            r0 = move-exception
            r13 = r0
            tnh r12 = defpackage.tnh.I
            r14 = 0
            r15 = 48
            r10 = 4
            r9 = r17
            defpackage.dch.H(r9, r10, r11, r12, r13, r14, r15)
            goto L2b
        L3b:
            java.lang.Thread r0 = java.lang.Thread.currentThread()     // Catch: java.lang.SecurityException -> L43
            r0.interrupt()     // Catch: java.lang.SecurityException -> L43
            goto L50
        L43:
            r0 = move-exception
            r13 = r0
            tnh r12 = defpackage.tnh.H
            r14 = 0
            r15 = 48
            r10 = 5
            r9 = r17
            defpackage.dch.H(r9, r10, r11, r12, r13, r14, r15)
        L50:
            r0 = r5
        L51:
            long r9 = java.lang.System.nanoTime()
            long r9 = r9 - r1
            r11 = 100000000(0x5f5e100, double:4.94065646E-316)
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 >= 0) goto L5f
            if (r0 == 0) goto L14
        L5f:
            long r0 = r16.getTaskCount()
            long r2 = r16.getCompletedTaskCount()
            long r0 = r0 - r2
            int r0 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r0 > 0) goto L6d
            goto L6e
        L6d:
            r5 = r6
        L6e:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zrk.v(java.util.concurrent.ThreadPoolExecutor, h99, iuj):boolean");
    }

    public static final int w(String str, byte[] bArr, int i, int i2) {
        byte[] bytes = str.getBytes(kfk.a);
        int length = bytes.length;
        if (length - i > i2) {
            throw new ArrayIndexOutOfBoundsException("Not enough space in output buffer to encode UTF-8 string");
        }
        System.arraycopy(bytes, 0, bArr, i, length);
        return i + length;
    }
}
