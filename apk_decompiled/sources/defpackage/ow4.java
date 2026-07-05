package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.api.tasks.TaskSessionEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ow4 {
    public static final Set a = mp0.Z0(new String[]{"table", "thead", "tbody", "tr", "th", "td", "img", "picture", "svg", "video", "audio", "canvas", "source", "pre", "iframe", "object", "embed", "details", "summary"});
    public static final Set b = mp0.Z0(new String[]{"div", "p", "section", "aside", "blockquote"});
    public static final ide c = new ide(mp0.Z0(new jde[]{jde.IGNORE_CASE, jde.DOT_MATCHES_ALL}));
    public static final ide d = new ide("\\d+(\\.\\d+)?px");
    public static final List e = x44.X("solid", "dashed", "dotted", "double", "none");

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:179:0x04e7  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0576  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x05bb A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01db  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final defpackage.lsk a(defpackage.yj6 r21) {
        /*
            Method dump skipped, instruction units count: 1584
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ow4.a(yj6):lsk");
    }

    public static final boolean b(yj6 yj6Var, boolean z) {
        Iterator<E> it = lok.g(new ru6(0), yj6Var).iterator();
        it.getClass();
        while (it.hasNext()) {
            Object next = it.next();
            next.getClass();
            yj6 yj6Var2 = (yj6) next;
            if (!z || yj6Var2 != yj6Var) {
                String strG = yj6Var2.g("style");
                strG.getClass();
                if (strG.length() == 0) {
                    continue;
                } else {
                    Iterator it2 = bsg.X0(strG, new char[]{';'}, 6).iterator();
                    while (it2.hasNext()) {
                        String lowerCase = bsg.k1(bsg.g1((String) it2.next(), ':')).toString().toLowerCase(Locale.ROOT);
                        lowerCase.getClass();
                        if (lowerCase.length() != 0 && !c(lowerCase) && !lowerCase.equals("color")) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final boolean c(String str) {
        switch (str.hashCode()) {
            case -1923578189:
                return str.equals("font-style");
            case -1215680224:
                return str.equals("line-height");
            case -1081309778:
                return str.equals("margin");
            case -887955139:
                return str.equals("margin-right");
            case -723749950:
                return str.equals("list-style");
            case 108532386:
                return str.equals("font-family");
            case 598800822:
                return str.equals("font-weight");
            case 746232421:
                return str.equals("text-align");
            case 941004998:
                return str.equals("margin-left");
            case 1018610388:
                return str.equals("list-style-position");
            case 1605387877:
                return str.equals("list-style-type");
            case 1970025654:
                return str.equals("margin-top");
            case 2086035242:
                return str.equals("margin-bottom");
            default:
                return false;
        }
    }

    public static final fx4 d(String str) {
        Float f;
        float fFloatValue;
        str.getClass();
        String lowerCase = bsg.k1(str).toString().toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        if (bsg.a1(lowerCase, '#')) {
            String strX0 = bsg.x0(1, lowerCase);
            int length = strX0.length();
            if (length == 3) {
                char cCharAt = strX0.charAt(0);
                char cCharAt2 = strX0.charAt(0);
                StringBuilder sb = new StringBuilder();
                sb.append(cCharAt);
                sb.append(cCharAt2);
                Float f2 = f(sb.toString());
                if (f2 != null) {
                    float fFloatValue2 = f2.floatValue();
                    char cCharAt3 = strX0.charAt(1);
                    char cCharAt4 = strX0.charAt(1);
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(cCharAt3);
                    sb2.append(cCharAt4);
                    Float f3 = f(sb2.toString());
                    if (f3 != null) {
                        float fFloatValue3 = f3.floatValue();
                        char cCharAt5 = strX0.charAt(2);
                        char cCharAt6 = strX0.charAt(2);
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(cCharAt5);
                        sb3.append(cCharAt6);
                        Float f4 = f(sb3.toString());
                        if (f4 != null) {
                            return new fx4(fFloatValue2, fFloatValue3, f4.floatValue(), 1.0f);
                        }
                    }
                }
            } else if ((length == 6 || length == 8) && (f = f(strX0.substring(0, 2))) != null) {
                float fFloatValue4 = f.floatValue();
                Float f5 = f(strX0.substring(2, 4));
                if (f5 != null) {
                    float fFloatValue5 = f5.floatValue();
                    Float f6 = f(strX0.substring(4, 6));
                    if (f6 != null) {
                        float fFloatValue6 = f6.floatValue();
                        if (strX0.length() == 8) {
                            Float f7 = f(strX0.substring(6, 8));
                            fFloatValue = f7 != null ? f7.floatValue() : 1.0f;
                        }
                        return new fx4(fFloatValue4, fFloatValue5, fFloatValue6, fFloatValue);
                    }
                }
            }
        } else if (isg.q0(lowerCase, "rgb", false)) {
            int iF0 = bsg.F0(lowerCase, '(', 0, 6);
            int iF02 = bsg.F0(lowerCase, ')', 0, 6);
            if (iF0 >= 0 && iF02 >= 0) {
                List listX0 = bsg.X0(lowerCase.substring(iF0 + 1, iF02), new char[]{',', ' '}, 6);
                ArrayList arrayList = new ArrayList();
                Iterator it = listX0.iterator();
                while (it.hasNext()) {
                    String string = bsg.k1((String) it.next()).toString();
                    if (string.length() <= 0) {
                        string = null;
                    }
                    Float fB0 = string != null ? hsg.b0(string) : null;
                    if (fB0 != null) {
                        arrayList.add(fB0);
                    }
                }
                if (arrayList.size() >= 3) {
                    return new fx4(((Number) arrayList.get(0)).floatValue() / 255.0f, ((Number) arrayList.get(1)).floatValue() / 255.0f, ((Number) arrayList.get(2)).floatValue() / 255.0f, arrayList.size() >= 4 ? ((Number) arrayList.get(3)).floatValue() : 1.0f);
                }
            }
        }
        return null;
    }

    public static final Float e(String str) {
        String lowerCase = bsg.k1(str).toString().toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        if (lowerCase.equals(TaskSessionEvent.REPLAY_FROM_START)) {
            return Float.valueOf(MTTypesetterKt.kLineSkipLimitMultiplier);
        }
        if (isg.h0(lowerCase, "px", false)) {
            return hsg.b0(bsg.y0(2, lowerCase));
        }
        return null;
    }

    public static final Float f(String str) {
        if (isg.r0(16, str) != null) {
            return Float.valueOf(r1.intValue() / 255.0f);
        }
        return null;
    }

    public static final void g(StringBuilder sb, ArrayList arrayList) {
        if (sb.length() > 0) {
            arrayList.add(new nw4(sb.toString(), lw4.b));
            sb.setLength(0);
        }
    }
}
