package defpackage;

import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.RenderNode;
import android.graphics.text.MeasuredText;
import androidx.compose.foundation.b;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.R;
import com.anthropic.claude.api.chat.MessageAttachment;
import com.anthropic.claude.design.icon.a;
import com.pvporbit.freetype.FreeTypeConstants;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes3.dex */
public abstract class bwj {
    public static final ta4 a = new ta4(-1972551301, false, new xa4(19));
    public static final ta4 b = new ta4(1434378458, false, new xa4(20));
    public static final ta4 c = new ta4(546340921, false, new xa4(21));
    public static final ta4 d = new ta4(-341696616, false, new xa4(22));
    public static final o54 e;
    public static final o54 f;
    public static final float g;
    public static final o54 h;
    public static final float i;
    public static final o54 j;
    public static final float k;
    public static final o54 l;
    public static final float m;
    public static final q0g n;
    public static final float o;
    public static final o54 p;
    public static final float q;
    public static final float r;

    static {
        o54 o54Var = o54.P;
        e = o54Var;
        o54 o54Var2 = o54.L;
        f = o54Var2;
        g = 0.38f;
        h = o54Var2;
        i = 0.38f;
        j = o54Var2;
        k = 0.12f;
        l = o54Var;
        m = 44.0f;
        n = q0g.I;
        o = 4.0f;
        p = o54.T;
        q = 16.0f;
        r = 4.0f;
    }

    public static final void a(int i2, ld4 ld4Var, zy7 zy7Var, iqb iqbVar, String str, boolean z) {
        String strN;
        zy7Var.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(972062588);
        int i3 = i2 | (e18Var.f(str) ? 4 : 2) | (e18Var.h(zy7Var) ? 32 : 16) | (e18Var.f(iqbVar) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC) | (e18Var.g(z) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE);
        if (e18Var.Q(i3 & 1, (i3 & 1171) != 1170)) {
            jl3 jl3VarA = gm3.a(e18Var);
            vve vveVarB = xve.b(20.0f);
            long j2 = z ? jl3VarA.y : jl3VarA.O;
            long j3 = z ? jl3VarA.y : jl3VarA.N;
            wo1 wo1Var = lja.Q;
            ho0 ho0Var = new ho0(6.0f, true, new sz6(1));
            iqb iqbVarK = gb9.K(b.c(yfd.p(xn5.V(ez1.t(xn5.a0(iqbVar, vveVarB, new tzf(12.0f, d54.b(0.08f, d54.b), 2.0f, 0L, 56)), MTTypesetterKt.kLineSkipLimitMultiplier, jl3VarA.u, vveVarB), vveVarB), jl3VarA.n, vveVarB), false, null, null, null, zy7Var, 15), 14.0f, 8.0f);
            cxe cxeVarA = axe.a(ho0Var, wo1Var, e18Var, 54);
            int iHashCode = Long.hashCode(e18Var.T);
            hyc hycVarL = e18Var.l();
            iqb iqbVarE = kxk.E(e18Var, iqbVarK);
            dd4.e.getClass();
            re4 re4Var = cd4.b;
            e18Var.e0();
            if (e18Var.S) {
                e18Var.k(re4Var);
            } else {
                e18Var.n0();
            }
            d4c.i0(e18Var, cd4.f, cxeVarA);
            d4c.i0(e18Var, cd4.e, hycVarL);
            d4c.i0(e18Var, cd4.g, Integer.valueOf(iHashCode));
            d4c.h0(e18Var, cd4.h);
            d4c.i0(e18Var, cd4.d, iqbVarE);
            cv8.b(a.a(ud0.R, e18Var), null, androidx.compose.foundation.layout.b.o(fqb.E, 18.0f), j2, e18Var, 440, 0);
            if (str == null) {
                strN = vb7.n(e18Var, 1988229359, R.string.ccr_select_environment, e18Var, false);
            } else {
                e18Var.a0(1988228770);
                e18Var.p(false);
                strN = str;
            }
            tjh.b(strN, null, j3, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, ((jm3) gm3.c(e18Var).e.E).g, e18Var, 0, 24960, 110586);
            e18Var = e18Var;
            e18Var.p(true);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new sw4(str, zy7Var, iqbVar, z, i2);
        }
    }

    public static final void b(MessageAttachment messageAttachment, cj7 cj7Var, zy7 zy7Var, e1a e1aVar, ld4 ld4Var, int i2) {
        e1a e1aVar2;
        int i3;
        e1a e1aVarN;
        zy7Var.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(664728658);
        int i4 = i2 | (e18Var.f(messageAttachment) ? 4 : 2) | (e18Var.f(cj7Var) ? 32 : 16) | (e18Var.h(zy7Var) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC) | FreeTypeConstants.FT_LOAD_NO_RECURSE;
        int i5 = 0;
        if (e18Var.Q(i4 & 1, (i4 & 1171) != 1170)) {
            e18Var.V();
            if ((i2 & 1) == 0 || e18Var.A()) {
                i3 = i4 & (-7169);
                e1aVarN = rwj.n(messageAttachment.getExtracted_content(), e18Var, 0);
            } else {
                e18Var.T();
                i3 = i4 & (-7169);
                e1aVarN = e1aVar;
            }
            int i6 = i3;
            e18Var.q();
            lwj.j(cj7Var, null, "text", null, e18Var, ((i6 >> 3) & 14) | 432);
            e18Var.a0(-1145875482);
            String file_name = messageAttachment.getFile_name();
            if (file_name.length() == 0) {
                file_name = d4c.j0(R.string.chat_pasted_attachment_display_name, e18Var);
            }
            e18Var.p(false);
            Object objN = e18Var.N();
            int i7 = 19;
            lz1 lz1Var = jd4.a;
            if (objN == lz1Var) {
                objN = new oob(i7);
                e18Var.k0(objN);
            }
            zy7 zy7Var2 = (zy7) objN;
            Object objN2 = e18Var.N();
            if (objN2 == lz1Var) {
                objN2 = new oob(i7);
                e18Var.k0(objN2);
            }
            otj.e(file_name, false, false, zy7Var2, zy7Var, (zy7) objN2, null, null, null, null, null, fd9.q0(-2128338310, new tdd(e1aVarN, i5), e18Var), e18Var, (57344 & (i6 << 6)) | 200112, 48, 1984);
            e1aVar2 = e1aVarN;
        } else {
            e18Var.T();
            e1aVar2 = e1aVar;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new mm5(messageAttachment, cj7Var, zy7Var, e1aVar2, i2, 25);
        }
    }

    public static void c(Canvas canvas) {
        canvas.disableZ();
    }

    public static void d(Canvas canvas, int i2, BlendMode blendMode) {
        canvas.drawColor(i2, blendMode);
    }

    public static void e(Canvas canvas, long j2) {
        canvas.drawColor(j2);
    }

    public static void f(Canvas canvas, long j2, BlendMode blendMode) {
        canvas.drawColor(j2, blendMode);
    }

    public static void g(Canvas canvas, RectF rectF, float f2, float f3, RectF rectF2, float f4, float f5, Paint paint) {
        canvas.drawDoubleRoundRect(rectF, f2, f3, rectF2, f4, f5, paint);
    }

    public static void h(Canvas canvas, RectF rectF, float[] fArr, RectF rectF2, float[] fArr2, Paint paint) {
        canvas.drawDoubleRoundRect(rectF, fArr, rectF2, fArr2, paint);
    }

    public static void i(Canvas canvas, RenderNode renderNode) {
        canvas.drawRenderNode(renderNode);
    }

    public static void j(Canvas canvas, MeasuredText measuredText, int i2, int i3, int i4, int i5, float f2, float f3, boolean z, Paint paint) {
        canvas.drawTextRun(measuredText, i2, i3, i4, i5, f2, f3, z, paint);
    }

    public static void k(Canvas canvas) {
        canvas.enableZ();
    }

    public static qvi l(qh9 qh9Var) {
        try {
            String strM = qh9Var.s("id").m();
            bh9 bh9VarS = qh9Var.s("name");
            String strM2 = bh9VarS != null ? bh9VarS.m() : null;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator it = ((m7a) qh9Var.E.entrySet()).iterator();
            while (((o7a) it).hasNext()) {
                p7a p7aVarA = ((l7a) it).a();
                if (!mp0.o0(p7aVarA.getKey(), qvi.d)) {
                    Object key = p7aVarA.getKey();
                    key.getClass();
                    linkedHashMap.put(key, p7aVarA.getValue());
                }
            }
            strM.getClass();
            return new qvi(strM, strM2, linkedHashMap);
        } catch (IllegalStateException e2) {
            pmf.j("Unable to parse json into type Account", e2);
            return null;
        } catch (NullPointerException e3) {
            pmf.j("Unable to parse json into type Account", e3);
            return null;
        } catch (NumberFormatException e4) {
            pmf.j("Unable to parse json into type Account", e4);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x0097 A[FALL_THROUGH] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean m(defpackage.t6f r8) {
        /*
            Method dump skipped, instruction units count: 320
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bwj.m(t6f):boolean");
    }

    public static boolean n(t6f t6fVar) {
        while (t6fVar.f()) {
            switch (t6fVar.n()) {
                case '[':
                    return false;
                case '\\':
                    t6fVar.j();
                    char cN = t6fVar.n();
                    switch (cN) {
                        case '!':
                        case '\"':
                        case '#':
                        case '$':
                        case '%':
                        case '&':
                        case '\'':
                        case '(':
                        case ')':
                        case '*':
                        case '+':
                        case ',':
                        case '-':
                        case '.':
                        case '/':
                            t6fVar.j();
                            break;
                        default:
                            switch (cN) {
                                case ':':
                                case ';':
                                case '<':
                                case '=':
                                case '>':
                                case '?':
                                case FreeTypeConstants.FT_LOAD_CROP_BITMAP /* 64 */:
                                    t6fVar.j();
                                    break;
                                default:
                                    switch (cN) {
                                        case '[':
                                        case '\\':
                                        case ']':
                                        case '^':
                                        case '_':
                                        case '`':
                                            t6fVar.j();
                                            break;
                                        default:
                                            switch (cN) {
                                                case '{':
                                                case '|':
                                                case '}':
                                                case '~':
                                                    t6fVar.j();
                                                    break;
                                            }
                                            break;
                                    }
                                    break;
                            }
                            break;
                    }
                    break;
                case ']':
                    return true;
                default:
                    t6fVar.j();
                    break;
            }
        }
        return true;
    }

    public static boolean o(t6f t6fVar) {
        if (!t6fVar.f()) {
            return false;
        }
        char cN = t6fVar.n();
        char c2 = '\"';
        if (cN != '\"') {
            c2 = '\'';
            if (cN != '\'') {
                if (cN != '(') {
                    return false;
                }
                c2 = ')';
            }
        }
        t6fVar.j();
        if (!p(t6fVar, c2) || !t6fVar.f()) {
            return false;
        }
        t6fVar.j();
        return true;
    }

    public static boolean p(t6f t6fVar, char c2) {
        while (t6fVar.f()) {
            char cN = t6fVar.n();
            if (cN == '\\') {
                t6fVar.j();
                char cN2 = t6fVar.n();
                switch (cN2) {
                    case '!':
                    case '\"':
                    case '#':
                    case '$':
                    case '%':
                    case '&':
                    case '\'':
                    case '(':
                    case ')':
                    case '*':
                    case '+':
                    case ',':
                    case '-':
                    case '.':
                    case '/':
                        t6fVar.j();
                        break;
                    default:
                        switch (cN2) {
                            case ':':
                            case ';':
                            case '<':
                            case '=':
                            case '>':
                            case '?':
                            case FreeTypeConstants.FT_LOAD_CROP_BITMAP /* 64 */:
                                t6fVar.j();
                                break;
                            default:
                                switch (cN2) {
                                    case '[':
                                    case '\\':
                                    case ']':
                                    case '^':
                                    case '_':
                                    case '`':
                                        t6fVar.j();
                                        break;
                                    default:
                                        switch (cN2) {
                                            case '{':
                                            case '|':
                                            case '}':
                                            case '~':
                                                t6fVar.j();
                                                break;
                                        }
                                        break;
                                }
                                break;
                        }
                        break;
                }
            } else {
                if (cN == c2) {
                    return true;
                }
                if (c2 == ')' && cN == '(') {
                    return false;
                }
                t6fVar.j();
            }
        }
        return true;
    }
}
