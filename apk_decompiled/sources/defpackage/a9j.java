package defpackage;

import android.graphics.Color;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a9j {
    public static final Pattern a = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)((?:.|\\f)*+)?$");
    public static final Pattern b = Pattern.compile("(\\S+?):(\\S+)");
    public static final Map c;
    public static final Map d;

    static {
        HashMap map = new HashMap();
        map.put("white", Integer.valueOf(Color.rgb(255, 255, 255)));
        map.put("lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        map.put("cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        map.put("red", Integer.valueOf(Color.rgb(255, 0, 0)));
        map.put("yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        map.put("magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        map.put("blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        map.put("black", Integer.valueOf(Color.rgb(0, 0, 0)));
        c = Collections.unmodifiableMap(map);
        HashMap map2 = new HashMap();
        map2.put("bg_white", Integer.valueOf(Color.rgb(255, 255, 255)));
        map2.put("bg_lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        map2.put("bg_cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        map2.put("bg_red", Integer.valueOf(Color.rgb(255, 0, 0)));
        map2.put("bg_yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        map2.put("bg_magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        map2.put("bg_blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        map2.put("bg_black", Integer.valueOf(Color.rgb(0, 0, 0)));
        d = Collections.unmodifiableMap(map2);
    }

    public static void a(String str, x8j x8jVar, List list, SpannableStringBuilder spannableStringBuilder, List list2) {
        int i;
        int length;
        int i2;
        int i3;
        int i4;
        int i5;
        i = x8jVar.b;
        length = spannableStringBuilder.length();
        String str2 = x8jVar.a;
        str2.getClass();
        i2 = -1;
        switch (str2) {
            case "":
            case "lang":
                break;
            case "b":
                spannableStringBuilder.setSpan(new StyleSpan(1), i, length, 33);
                break;
            case "c":
                for (String str3 : x8jVar.d) {
                    Map map = c;
                    if (map.containsKey(str3)) {
                        spannableStringBuilder.setSpan(new ForegroundColorSpan(((Integer) map.get(str3)).intValue()), i, length, 33);
                    } else {
                        Map map2 = d;
                        if (map2.containsKey(str3)) {
                            spannableStringBuilder.setSpan(new BackgroundColorSpan(((Integer) map2.get(str3)).intValue()), i, length, 33);
                        }
                    }
                }
                break;
            case "i":
                spannableStringBuilder.setSpan(new StyleSpan(2), i, length, 33);
                break;
            case "u":
                spannableStringBuilder.setSpan(new UnderlineSpan(), i, length, 33);
                break;
            case "v":
                spannableStringBuilder.setSpan(new n5j(x8jVar.c), i, length, 33);
                break;
            case "ruby":
                int iC = c(list2, str, x8jVar);
                ArrayList arrayList = new ArrayList(list.size());
                arrayList.addAll(list);
                Collections.sort(arrayList, w8j.c);
                int i6 = x8jVar.b;
                int i7 = 0;
                int length2 = 0;
                while (i7 < arrayList.size()) {
                    if ("rt".equals(((w8j) arrayList.get(i7)).a.a)) {
                        w8j w8jVar = (w8j) arrayList.get(i7);
                        int iC2 = c(list2, str, w8jVar.a);
                        if (iC2 == i2) {
                            iC2 = iC != i2 ? iC : 1;
                        }
                        int i8 = w8jVar.a.b - length2;
                        int i9 = w8jVar.b - length2;
                        CharSequence charSequenceSubSequence = spannableStringBuilder.subSequence(i8, i9);
                        spannableStringBuilder.delete(i8, i9);
                        spannableStringBuilder.setSpan(new jxe(charSequenceSubSequence.toString(), iC2), i6, i8, 33);
                        length2 = charSequenceSubSequence.length() + length2;
                        i6 = i8;
                    }
                    i7++;
                    i2 = -1;
                }
                break;
            default:
                return;
        }
        ArrayList arrayListB = b(list2, str, x8jVar);
        for (int i10 = 0; i10 < arrayListB.size(); i10++) {
            u8j u8jVar = ((y8j) arrayListB.get(i10)).F;
            int i11 = u8jVar.l;
            if (i11 == -1 && u8jVar.m == -1) {
                i3 = -1;
            } else {
                i3 = (u8jVar.m == 1 ? (char) 2 : (char) 0) | (i11 == 1 ? (char) 1 : (char) 0);
            }
            if (i3 != -1) {
                int i12 = u8jVar.l;
                if (i12 == -1 && u8jVar.m == -1) {
                    i5 = -1;
                    i4 = 1;
                } else {
                    i4 = 1;
                    i5 = (i12 == 1 ? 1 : 0) | (u8jVar.m == 1 ? 2 : 0);
                }
                lwj.k(spannableStringBuilder, new StyleSpan(i5), i, length);
            } else {
                i4 = 1;
            }
            if (u8jVar.j == i4) {
                spannableStringBuilder.setSpan(new StrikethroughSpan(), i, length, 33);
            }
            if (u8jVar.k == i4) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i, length, 33);
            }
            if (u8jVar.g) {
                if (!u8jVar.g) {
                    sz6.j("Font color not defined");
                    return;
                }
                lwj.k(spannableStringBuilder, new ForegroundColorSpan(u8jVar.f), i, length);
            }
            if (u8jVar.i) {
                if (!u8jVar.i) {
                    sz6.j("Background color not defined.");
                    return;
                }
                lwj.k(spannableStringBuilder, new BackgroundColorSpan(u8jVar.h), i, length);
            }
            if (u8jVar.e != null) {
                lwj.k(spannableStringBuilder, new TypefaceSpan(u8jVar.e), i, length);
            }
            int i13 = u8jVar.n;
            if (i13 == 1) {
                lwj.k(spannableStringBuilder, new AbsoluteSizeSpan((int) u8jVar.o, true), i, length);
            } else if (i13 == 2) {
                lwj.k(spannableStringBuilder, new RelativeSizeSpan(u8jVar.o), i, length);
            } else if (i13 == 3) {
                lwj.k(spannableStringBuilder, new RelativeSizeSpan(u8jVar.o / 100.0f), i, length);
            }
            if (u8jVar.q) {
                spannableStringBuilder.setSpan(new xo8(), i, length, 33);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v5, types: [int] */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    public static ArrayList b(List list, String str, x8j x8jVar) {
        ?? size;
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            u8j u8jVar = (u8j) list.get(i);
            String str2 = x8jVar.a;
            Set set = x8jVar.d;
            String str3 = x8jVar.c;
            if (u8jVar.a.isEmpty() && u8jVar.b.isEmpty() && u8jVar.c.isEmpty() && u8jVar.d.isEmpty()) {
                size = TextUtils.isEmpty(str2);
            } else {
                int iA = u8j.a(u8j.a(u8j.a(0, 1073741824, u8jVar.a, str), 2, u8jVar.b, str2), 4, u8jVar.d, str3);
                size = (iA == -1 || !set.containsAll(u8jVar.c)) ? 0 : iA + (u8jVar.c.size() * 4);
            }
            if (size > 0) {
                arrayList.add(new y8j(size, u8jVar));
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    public static int c(List list, String str, x8j x8jVar) {
        ArrayList arrayListB = b(list, str, x8jVar);
        for (int i = 0; i < arrayListB.size(); i++) {
            int i2 = ((y8j) arrayListB.get(i)).F.p;
            if (i2 != -1) {
                return i2;
            }
        }
        return -1;
    }

    public static v8j d(String str, Matcher matcher, ssc sscVar, ArrayList arrayList) {
        z8j z8jVar = new z8j();
        try {
            String strGroup = matcher.group(1);
            strGroup.getClass();
            z8jVar.a = c9j.b(strGroup);
            String strGroup2 = matcher.group(2);
            strGroup2.getClass();
            z8jVar.b = c9j.b(strGroup2);
            String strGroup3 = matcher.group(3);
            strGroup3.getClass();
            e(strGroup3, z8jVar);
            StringBuilder sb = new StringBuilder();
            sscVar.getClass();
            String strN = sscVar.n(StandardCharsets.UTF_8);
            while (!TextUtils.isEmpty(strN)) {
                if (sb.length() > 0) {
                    sb.append("\n");
                }
                sb.append(strN.trim());
                strN = sscVar.n(StandardCharsets.UTF_8);
            }
            z8jVar.c = f(str, sb.toString(), arrayList);
            return new v8j(z8jVar.a().a(), z8jVar.a, z8jVar.b);
        } catch (IllegalArgumentException unused) {
            ysj.u("WebvttCueParser", "Skipping cue with bad header: " + matcher.group());
            return null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static void e(String str, z8j z8jVar) {
        int i;
        String strSubstring;
        int i2;
        int i3;
        Matcher matcher = b.matcher(str);
        while (matcher.find()) {
            String strGroup = matcher.group(1);
            strGroup.getClass();
            String strGroup2 = matcher.group(2);
            strGroup2.getClass();
            try {
                if ("line".equals(strGroup)) {
                    g(strGroup2, z8jVar);
                } else {
                    if ("align".equals(strGroup)) {
                        switch (strGroup2) {
                            case "center":
                            case "middle":
                                i = 2;
                                break;
                            case "end":
                                i = 3;
                                break;
                            case "left":
                                i = 4;
                                break;
                            case "right":
                                i = 5;
                                break;
                            case "start":
                                i = 1;
                                break;
                            default:
                                ysj.u("WebvttCueParser", "Invalid alignment value: ".concat(strGroup2));
                                i = 2;
                                break;
                        }
                        z8jVar.d = i;
                    } else if ("position".equals(strGroup)) {
                        int iIndexOf = strGroup2.indexOf(44);
                        if (iIndexOf != -1) {
                            strSubstring = strGroup2.substring(iIndexOf + 1);
                            switch (strSubstring) {
                                case "line-left":
                                case "start":
                                    i2 = 0;
                                    break;
                                case "center":
                                case "middle":
                                    i2 = 1;
                                    break;
                                case "line-right":
                                case "end":
                                    i2 = 2;
                                    break;
                                default:
                                    ysj.u("WebvttCueParser", "Invalid anchor value: ".concat(strSubstring));
                                    i2 = Integer.MIN_VALUE;
                                    break;
                            }
                            z8jVar.i = i2;
                            strGroup2 = strGroup2.substring(0, iIndexOf);
                        }
                        z8jVar.h = c9j.a(strGroup2);
                    } else if ("size".equals(strGroup)) {
                        z8jVar.j = c9j.a(strGroup2);
                    } else if ("vertical".equals(strGroup)) {
                        if (strGroup2.equals("lr")) {
                            i3 = 2;
                        } else if (strGroup2.equals("rl")) {
                            i3 = 1;
                        } else {
                            ysj.u("WebvttCueParser", "Invalid 'vertical' value: ".concat(strGroup2));
                            i3 = Integer.MIN_VALUE;
                        }
                        z8jVar.k = i3;
                    } else {
                        ysj.u("WebvttCueParser", "Unknown cue setting " + strGroup + ":" + strGroup2);
                    }
                }
            } catch (NumberFormatException unused) {
                ysj.u("WebvttCueParser", "Skipping bad cue setting: " + matcher.group());
            }
        }
    }

    public static SpannedString f(String str, String str2, List list) {
        String str3;
        char c2;
        String strSubstring;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ArrayDeque arrayDeque = new ArrayDeque();
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (true) {
            String strTrim = "";
            if (i >= str2.length()) {
                while (!arrayDeque.isEmpty()) {
                    a(str, (x8j) arrayDeque.pop(), arrayList, spannableStringBuilder, list);
                }
                a(str, new x8j("", 0, "", Collections.EMPTY_SET), Collections.EMPTY_LIST, spannableStringBuilder, list);
                return SpannedString.valueOf(spannableStringBuilder);
            }
            char cCharAt = str2.charAt(i);
            if (cCharAt == '&') {
                i++;
                int iIndexOf = str2.indexOf(59, i);
                int iIndexOf2 = str2.indexOf(32, i);
                if (iIndexOf == -1) {
                    iIndexOf = iIndexOf2;
                } else if (iIndexOf2 != -1) {
                    iIndexOf = Math.min(iIndexOf, iIndexOf2);
                }
                if (iIndexOf != -1) {
                    strSubstring = str2.substring(i, iIndexOf);
                    switch (strSubstring) {
                        case "gt":
                            spannableStringBuilder.append('>');
                            break;
                        case "lt":
                            spannableStringBuilder.append('<');
                            break;
                        case "amp":
                            spannableStringBuilder.append('&');
                            break;
                        case "nbsp":
                            spannableStringBuilder.append(' ');
                            break;
                        default:
                            ysj.u("WebvttCueParser", "ignoring unsupported entity: '&" + strSubstring + ";'");
                            break;
                    }
                    if (iIndexOf == iIndexOf2) {
                        spannableStringBuilder.append((CharSequence) " ");
                    }
                    i = iIndexOf + 1;
                } else {
                    spannableStringBuilder.append(cCharAt);
                }
            } else if (cCharAt != '<') {
                spannableStringBuilder.append(cCharAt);
                i++;
            } else {
                int length = i + 1;
                if (length < str2.length()) {
                    boolean z = str2.charAt(length) == '/';
                    int iIndexOf3 = str2.indexOf(62, length);
                    length = iIndexOf3 == -1 ? str2.length() : iIndexOf3 + 1;
                    int i2 = length - 2;
                    boolean z2 = str2.charAt(i2) == '/';
                    int i3 = i + (z ? 2 : 1);
                    if (!z2) {
                        i2 = length - 1;
                    }
                    String strSubstring2 = str2.substring(i3, i2);
                    if (!strSubstring2.trim().isEmpty()) {
                        String strTrim2 = strSubstring2.trim();
                        fd9.E(!strTrim2.isEmpty());
                        String str4 = tpi.a;
                        str3 = strTrim2.split("[ \\.]", 2)[0];
                        str3.getClass();
                        switch (str3) {
                            case "b":
                            case "c":
                            case "i":
                            case "u":
                            case "v":
                            case "rt":
                            case "lang":
                            case "ruby":
                                if (!z) {
                                    if (!z2) {
                                        int length2 = spannableStringBuilder.length();
                                        String strTrim3 = strSubstring2.trim();
                                        fd9.E(!strTrim3.isEmpty());
                                        int iIndexOf4 = strTrim3.indexOf(" ");
                                        if (iIndexOf4 == -1) {
                                            c2 = 0;
                                        } else {
                                            strTrim = strTrim3.substring(iIndexOf4).trim();
                                            c2 = 0;
                                            strTrim3 = strTrim3.substring(0, iIndexOf4);
                                        }
                                        String[] strArrSplit = strTrim3.split("\\.", -1);
                                        String str5 = strArrSplit[c2];
                                        HashSet hashSet = new HashSet();
                                        for (int i4 = 1; i4 < strArrSplit.length; i4++) {
                                            hashSet.add(strArrSplit[i4]);
                                        }
                                        arrayDeque.push(new x8j(str5, length2, strTrim, hashSet));
                                    }
                                    break;
                                } else {
                                    while (!arrayDeque.isEmpty()) {
                                        x8j x8jVar = (x8j) arrayDeque.pop();
                                        a(str, x8jVar, arrayList, spannableStringBuilder, list);
                                        if (arrayDeque.isEmpty()) {
                                            arrayList.clear();
                                        } else {
                                            arrayList.add(new w8j(x8jVar, spannableStringBuilder.length()));
                                        }
                                        if (x8jVar.a.equals(str3)) {
                                            break;
                                        }
                                    }
                                    break;
                                }
                                break;
                        }
                    }
                }
                i = length;
            }
        }
    }

    public static void g(String str, z8j z8jVar) {
        String strSubstring;
        int i;
        int iIndexOf = str.indexOf(44);
        if (iIndexOf != -1) {
            strSubstring = str.substring(iIndexOf + 1);
            i = 2;
            switch (strSubstring) {
                case "center":
                case "middle":
                    i = 1;
                    break;
                case "end":
                    break;
                case "start":
                    i = 0;
                    break;
                default:
                    ysj.u("WebvttCueParser", "Invalid anchor value: ".concat(strSubstring));
                    i = Integer.MIN_VALUE;
                    break;
            }
            z8jVar.g = i;
            str = str.substring(0, iIndexOf);
        }
        if (str.endsWith("%")) {
            z8jVar.e = c9j.a(str);
            z8jVar.f = 0;
        } else {
            z8jVar.e = Integer.parseInt(str);
            z8jVar.f = 1;
        }
    }
}
