package defpackage;

import com.anthropic.claude.api.tasks.TaskSessionEvent;
import com.google.i18n.phonenumbers.MissingMetadataException;
import com.google.i18n.phonenumbers.NumberParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class u1d {
    public static final Logger h = Logger.getLogger(u1d.class.getName());
    public static final Map i;
    public static final Map j;
    public static final Map k;
    public static final Pattern l;
    public static final Pattern m;
    public static final Pattern n;
    public static final Pattern o;
    public static final Pattern p;
    public static final Pattern q;
    public static final Pattern r;
    public static final Pattern s;
    public static final Pattern t;
    public static final Pattern u;
    public static final Pattern v;
    public static final Pattern w;
    public static final Pattern x;
    public static u1d y;
    public final i49 a;
    public final HashMap b;
    public final xzd c = xzd.v();
    public final HashSet d = new HashSet(35);
    public final ro6 e = new ro6(100);
    public final HashSet f = new HashSet(320);
    public final HashSet g = new HashSet();

    static {
        HashMap map = new HashMap();
        map.put(54, "9");
        Collections.unmodifiableMap(map);
        HashSet hashSet = new HashSet();
        hashSet.add(86);
        Collections.unmodifiableSet(hashSet);
        HashSet hashSet2 = new HashSet();
        hashSet2.add(52);
        Collections.unmodifiableSet(hashSet2);
        HashSet hashSet3 = new HashSet();
        hashSet3.add(52);
        hashSet3.add(54);
        hashSet3.add(55);
        hashSet3.add(62);
        hashSet3.addAll(hashSet);
        Collections.unmodifiableSet(hashSet3);
        HashMap map2 = new HashMap();
        map2.put('0', '0');
        map2.put('1', '1');
        map2.put('2', '2');
        map2.put('3', '3');
        map2.put('4', '4');
        map2.put('5', '5');
        map2.put('6', '6');
        map2.put('7', '7');
        map2.put('8', '8');
        map2.put('9', '9');
        HashMap map3 = new HashMap(40);
        map3.put('A', '2');
        map3.put('B', '2');
        map3.put('C', '2');
        map3.put('D', '3');
        map3.put('E', '3');
        map3.put('F', '3');
        map3.put('G', '4');
        map3.put('H', '4');
        map3.put('I', '4');
        map3.put('J', '5');
        map3.put('K', '5');
        map3.put('L', '5');
        map3.put('M', '6');
        map3.put('N', '6');
        map3.put('O', '6');
        map3.put('P', '7');
        map3.put('Q', '7');
        map3.put('R', '7');
        map3.put('S', '7');
        map3.put('T', '8');
        map3.put('U', '8');
        map3.put('V', '8');
        map3.put('W', '9');
        map3.put('X', '9');
        map3.put('Y', '9');
        map3.put('Z', '9');
        Map mapUnmodifiableMap = Collections.unmodifiableMap(map3);
        j = mapUnmodifiableMap;
        HashMap map4 = new HashMap(100);
        map4.putAll(mapUnmodifiableMap);
        map4.putAll(map2);
        k = Collections.unmodifiableMap(map4);
        HashMap map5 = new HashMap();
        map5.putAll(map2);
        map5.put('+', '+');
        map5.put('*', '*');
        map5.put('#', '#');
        i = Collections.unmodifiableMap(map5);
        HashMap map6 = new HashMap();
        for (Character ch : mapUnmodifiableMap.keySet()) {
            map6.put(Character.valueOf(Character.toLowerCase(ch.charValue())), ch);
            map6.put(ch, ch);
        }
        map6.putAll(map2);
        map6.put('-', '-');
        map6.put((char) 65293, '-');
        map6.put((char) 8208, '-');
        map6.put((char) 8209, '-');
        map6.put((char) 8210, '-');
        map6.put((char) 8211, '-');
        map6.put((char) 8212, '-');
        map6.put((char) 8213, '-');
        map6.put((char) 8722, '-');
        map6.put('/', '/');
        map6.put((char) 65295, '/');
        map6.put(' ', ' ');
        map6.put((char) 12288, ' ');
        map6.put((char) 8288, ' ');
        map6.put('.', '.');
        map6.put((char) 65294, '.');
        Collections.unmodifiableMap(map6);
        Pattern.compile("[\\d]+(?:[~⁓∼～][\\d]+)?");
        StringBuilder sb = new StringBuilder();
        Map map7 = j;
        sb.append(Arrays.toString(map7.keySet().toArray()).replaceAll("[, \\[\\]]", ""));
        sb.append(Arrays.toString(map7.keySet().toArray()).toLowerCase().replaceAll("[, \\[\\]]", ""));
        String string = sb.toString();
        l = Pattern.compile("[+＋]+");
        m = Pattern.compile("[-x‐-―−ー－-／  \u00ad\u200b\u2060\u3000()（）［］.\\[\\]/~⁓∼～]+");
        n = Pattern.compile("(\\p{Nd})");
        o = Pattern.compile("[+＋\\p{Nd}]");
        p = Pattern.compile("[\\\\/] *x");
        q = Pattern.compile("[[\\P{N}&&\\P{L}]&&[^#]]+$");
        r = Pattern.compile("(?:.*?[A-Za-z]){3}.*");
        String strJ = ij0.j("\\p{Nd}{2}|[+＋]*+(?:[-x‐-―−ー－-／  \u00ad\u200b\u2060\u3000()（）［］.\\[\\]/~⁓∼～*]*\\p{Nd}){3,}[-x‐-―−ー－-／  \u00ad\u200b\u2060\u3000()（）［］.\\[\\]/~⁓∼～*", string, "\\p{Nd}]*");
        String strA = a(true);
        a(false);
        s = Pattern.compile("^\\+(\\p{Nd}|[\\-\\.\\(\\)]?)*\\p{Nd}(\\p{Nd}|[\\-\\.\\(\\)]?)*$");
        String strConcat = string.concat("\\p{Nd}");
        t = Pattern.compile("^(" + ij0.l("[", strConcat, "]+((\\-)*[", strConcat, "])*") + "\\.)*" + ij0.l("[", string, "]+((\\-)*[", strConcat, "])*") + "\\.?$");
        StringBuilder sb2 = new StringBuilder("(?:");
        sb2.append(strA);
        sb2.append(")$");
        u = Pattern.compile(sb2.toString(), 66);
        v = Pattern.compile(strJ + "(?:" + strA + ")?", 66);
        Pattern.compile("(\\D+)");
        w = Pattern.compile("(\\$\\d)");
        x = Pattern.compile("\\(?\\$1\\)?");
        y = null;
    }

    public u1d(i49 i49Var, HashMap map) {
        this.a = i49Var;
        this.b = map;
        for (Map.Entry entry : map.entrySet()) {
            List list = (List) entry.getValue();
            if (list.size() == 1 && "001".equals(list.get(0))) {
                this.g.add((Integer) entry.getKey());
            } else {
                this.f.addAll(list);
            }
        }
        if (this.f.remove("001")) {
            h.log(Level.WARNING, "invalid metadata (country calling code was mapped to the non-geo entity as well as specific region(s))");
        }
        this.d.addAll((Collection) map.get(1));
    }

    public static String a(boolean z) {
        String strConcat = ";ext=".concat(c(20));
        String str = "[  \\t,]*(?:e?xt(?:ensi(?:ó?|ó))?n?|ｅ?ｘｔｎ?|доб|anexo)[:\\.．]?[  \\t,-]*" + c(20) + "#?";
        String str2 = "[  \\t,]*(?:[xｘ#＃~～]|int|ｉｎｔ)[:\\.．]?[  \\t,-]*" + c(9) + "#?";
        String str3 = "[- ]+" + c(6) + "#";
        StringBuilder sb = new StringBuilder();
        sb.append(strConcat);
        sb.append("|");
        sb.append(str);
        sb.append("|");
        sb.append(str2);
        String strM = ij0.m(sb, "|", str3);
        if (!z) {
            return strM;
        }
        return strM + "|" + ("[  \\t]*(?:,{2}|;)[:\\.．]?[  \\t,-]*" + c(15) + "#?") + "|" + ("[  \\t]*(?:,)+[:\\.．]?[  \\t,-]*" + c(9) + "#?");
    }

    public static u1d b(pjb pjbVar) {
        if (pjbVar != null) {
            return new u1d(new i49(ps5.a().c(), pjbVar, ps5.a().b()), auk.g());
        }
        sz6.p("metadataLoader could not be null.");
        return null;
    }

    public static String c(int i2) {
        return grc.u("(\\p{Nd}{1,", i2, "})");
    }

    public static String i(p2d p2dVar) {
        StringBuilder sb = new StringBuilder();
        if (p2dVar.h() && p2dVar.d() > 0) {
            char[] cArr = new char[p2dVar.d()];
            Arrays.fill(cArr, '0');
            sb.append(new String(cArr));
        }
        sb.append(p2dVar.c());
        return sb.toString();
    }

    public static o2d j(n2d n2dVar, int i2) {
        switch (sq6.F(i2)) {
            case 0:
            case 2:
                return n2dVar.b();
            case 1:
                return n2dVar.g();
            case 3:
                return n2dVar.q();
            case 4:
                return n2dVar.n();
            case 5:
                return n2dVar.p();
            case 6:
                return n2dVar.t();
            case 7:
                return n2dVar.l();
            case 8:
                return n2dVar.k();
            case 9:
                return n2dVar.r();
            case 10:
                return n2dVar.s();
            default:
                return n2dVar.c();
        }
    }

    public static void s(StringBuilder sb) {
        if (r.matcher(sb).matches()) {
            sb.replace(0, sb.length(), u(sb, k));
        } else {
            sb.replace(0, sb.length(), t(sb));
        }
    }

    public static String t(CharSequence charSequence) {
        StringBuilder sb = new StringBuilder(charSequence.length());
        for (int i2 = 0; i2 < charSequence.length(); i2++) {
            int iDigit = Character.digit(charSequence.charAt(i2), 10);
            if (iDigit != -1) {
                sb.append(iDigit);
            }
        }
        return sb.toString();
    }

    public static String u(CharSequence charSequence, Map map) {
        StringBuilder sb = new StringBuilder(charSequence.length());
        for (int i2 = 0; i2 < charSequence.length(); i2++) {
            Character ch = (Character) map.get(Character.valueOf(Character.toUpperCase(charSequence.charAt(i2))));
            if (ch != null) {
                sb.append(ch);
            }
        }
        return sb.toString();
    }

    public static void w(int i2, int i3, StringBuilder sb) {
        int iF = sq6.F(i3);
        if (iF == 0) {
            sb.insert(0, i2).insert(0, '+');
        } else if (iF == 1) {
            sb.insert(0, " ").insert(0, i2).insert(0, '+');
        } else {
            if (iF != 3) {
                return;
            }
            sb.insert(0, "-").insert(0, i2).insert(0, '+').insert(0, "tel:");
        }
    }

    public static int x(StringBuilder sb, n2d n2dVar, int i2) {
        o2d o2dVarJ = j(n2dVar, i2);
        ArrayList arrayListC = o2dVarJ.c().isEmpty() ? n2dVar.c().c() : o2dVarJ.c();
        ArrayList arrayListD = o2dVarJ.d();
        if (i2 == 3) {
            o2d o2dVarJ2 = j(n2dVar, 1);
            if (o2dVarJ2.b() == 1 && o2dVarJ2.a() == -1) {
                return x(sb, n2dVar, 2);
            }
            o2d o2dVarJ3 = j(n2dVar, 2);
            if (o2dVarJ3.b() != 1 || o2dVarJ3.a() != -1) {
                ArrayList arrayList = new ArrayList(arrayListC);
                arrayList.addAll(o2dVarJ3.b() == 0 ? n2dVar.c().c() : o2dVarJ3.c());
                Collections.sort(arrayList);
                if (arrayListD.isEmpty()) {
                    arrayListD = o2dVarJ3.d();
                } else {
                    ArrayList arrayList2 = new ArrayList(arrayListD);
                    arrayList2.addAll(o2dVarJ3.d());
                    Collections.sort(arrayList2);
                    arrayListD = arrayList2;
                }
                arrayListC = arrayList;
            }
        }
        if (((Integer) arrayListC.get(0)).intValue() == -1) {
            return 5;
        }
        int length = sb.length();
        if (arrayListD.contains(Integer.valueOf(length))) {
            return 2;
        }
        int iIntValue = ((Integer) arrayListC.get(0)).intValue();
        if (iIntValue != length) {
            if (iIntValue > length) {
                return 4;
            }
            if (((Integer) arrayListC.get(arrayListC.size() - 1)).intValue() < length) {
                return 6;
            }
            if (!arrayListC.subList(1, arrayListC.size()).contains(Integer.valueOf(length))) {
                return 5;
            }
        }
        return 1;
    }

    public final int d(StringBuilder sb, StringBuilder sb2) {
        if (sb.length() != 0 && sb.charAt(0) != '0') {
            int length = sb.length();
            for (int i2 = 1; i2 <= 3 && i2 <= length; i2++) {
                int i3 = Integer.parseInt(sb.substring(0, i2));
                if (this.b.containsKey(Integer.valueOf(i3))) {
                    sb2.append(sb.substring(i2));
                    return i3;
                }
            }
        }
        return 0;
    }

    public final String e(p2d p2dVar, int i2) {
        ro6 ro6Var;
        l2d l2dVar;
        if (p2dVar.c() == 0) {
            String strE = p2dVar.e();
            if (strE.length() > 0 || !p2dVar.f()) {
                return strE;
            }
        }
        StringBuilder sb = new StringBuilder(20);
        sb.setLength(0);
        int iA = p2dVar.a();
        String strI = i(p2dVar);
        if (i2 == 1) {
            sb.append(strI);
            w(iA, 1, sb);
        } else if (this.b.containsKey(Integer.valueOf(iA))) {
            String strL = l(iA);
            n2d n2dVarG = "001".equals(strL) ? g(iA) : h(strL);
            Iterator it = ((n2dVarG.e().size() == 0 || i2 == 3) ? n2dVarG.j() : n2dVarG.e()).iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                ro6Var = this.e;
                if (!zHasNext) {
                    l2dVar = null;
                    break;
                }
                l2dVar = (l2d) it.next();
                int iB = l2dVar.b();
                if (iB == 0 || ro6Var.N(l2dVar.a(iB - 1)).matcher(strI).lookingAt()) {
                    if (ro6Var.N(l2dVar.d()).matcher(strI).matches()) {
                        break;
                    }
                }
            }
            if (l2dVar != null) {
                String format = l2dVar.getFormat();
                Matcher matcher = ro6Var.N(l2dVar.d()).matcher(strI);
                String strC = l2dVar.c();
                strI = (i2 != 3 || strC == null || strC.length() <= 0) ? matcher.replaceAll(format) : matcher.replaceAll(w.matcher(format).replaceFirst(strC));
                if (i2 == 4) {
                    Matcher matcher2 = m.matcher(strI);
                    if (matcher2.lookingAt()) {
                        strI = matcher2.replaceFirst("");
                    }
                    strI = matcher2.reset(strI).replaceAll("-");
                }
            }
            sb.append(strI);
            if (p2dVar.g() && p2dVar.b().length() > 0) {
                if (i2 == 4) {
                    sb.append(";ext=");
                    sb.append(p2dVar.b());
                } else if (n2dVarG.v()) {
                    sb.append(n2dVarG.m());
                    sb.append(p2dVar.b());
                } else {
                    sb.append(" ext. ");
                    sb.append(p2dVar.b());
                }
            }
            w(iA, i2, sb);
        } else {
            sb.append(strI);
        }
        return sb.toString();
    }

    public final int f(String str) {
        if (p(str)) {
            n2d n2dVarH = h(str);
            if (n2dVarH != null) {
                return n2dVarH.a();
            }
            sz6.p(ij0.i("Invalid region code: ", str));
            return 0;
        }
        Level level = Level.WARNING;
        StringBuilder sb = new StringBuilder("Invalid or missing region code (");
        if (str == null) {
            str = "null";
        }
        sb.append(str);
        sb.append(") provided.");
        h.log(level, sb.toString());
        return 0;
    }

    public final n2d g(int i2) {
        if (!this.g.contains(Integer.valueOf(i2))) {
            return null;
        }
        n2d n2dVarG0 = this.a.G0(i2);
        String strP = grc.p(i2, "Missing metadata for country code ");
        if (n2dVarG0 != null) {
            return n2dVarG0;
        }
        throw new MissingMetadataException(strP);
    }

    public final n2d h(String str) {
        if (!p(str)) {
            return null;
        }
        n2d n2dVarH0 = this.a.H0(str);
        String strConcat = "Missing metadata for region code ".concat(str);
        if (n2dVarH0 != null) {
            return n2dVarH0;
        }
        throw new MissingMetadataException(strConcat);
    }

    public final int k(String str, n2d n2dVar) {
        if (!n(str, n2dVar.c())) {
            return 12;
        }
        if (n(str, n2dVar.n())) {
            return 5;
        }
        if (n(str, n2dVar.q())) {
            return 4;
        }
        if (n(str, n2dVar.p())) {
            return 6;
        }
        if (n(str, n2dVar.t())) {
            return 7;
        }
        if (n(str, n2dVar.l())) {
            return 8;
        }
        if (n(str, n2dVar.k())) {
            return 9;
        }
        if (n(str, n2dVar.r())) {
            return 10;
        }
        if (n(str, n2dVar.s())) {
            return 11;
        }
        return n(str, n2dVar.b()) ? (n2dVar.o() || n(str, n2dVar.g())) ? 3 : 1 : (n2dVar.o() || !n(str, n2dVar.g())) ? 12 : 2;
    }

    public final String l(int i2) {
        List list = (List) this.b.get(Integer.valueOf(i2));
        return list == null ? "ZZ" : (String) list.get(0);
    }

    public final String m(p2d p2dVar) {
        int iA = p2dVar.a();
        List<String> list = (List) this.b.get(Integer.valueOf(iA));
        if (list == null) {
            h.log(Level.INFO, "Missing/invalid country_code (" + iA + ")");
            return null;
        }
        if (list.size() == 1) {
            return (String) list.get(0);
        }
        String strI = i(p2dVar);
        for (String str : list) {
            n2d n2dVarH = h(str);
            if (n2dVarH.u()) {
                if (this.e.N(n2dVarH.f()).matcher(strI).lookingAt()) {
                    return str;
                }
            } else if (k(strI, n2dVarH) != 12) {
                return str;
            }
        }
        return null;
    }

    public final boolean n(String str, o2d o2dVar) {
        int length = str.length();
        ArrayList arrayListC = o2dVar.c();
        if (arrayListC.size() <= 0 || arrayListC.contains(Integer.valueOf(length))) {
            return this.c.y(str, o2dVar);
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean o(defpackage.p2d r6) {
        /*
            r5 = this;
            java.lang.String r0 = r5.m(r6)
            int r1 = r6.a()
            java.lang.String r2 = "001"
            boolean r3 = r2.equals(r0)
            if (r3 == 0) goto L15
            n2d r3 = r5.g(r1)
            goto L19
        L15:
            n2d r3 = r5.h(r0)
        L19:
            r4 = 0
            if (r3 == 0) goto L47
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L39
            n2d r2 = r5.h(r0)
            if (r2 == 0) goto L2f
            int r0 = r2.a()
            if (r1 == r0) goto L39
            goto L47
        L2f:
            java.lang.String r5 = "Invalid region code: "
            java.lang.String r5 = defpackage.ij0.i(r5, r0)
            defpackage.sz6.p(r5)
            return r4
        L39:
            java.lang.String r6 = i(r6)
            int r5 = r5.k(r6, r3)
            r6 = 12
            if (r5 == r6) goto L47
            r5 = 1
            return r5
        L47:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u1d.o(p2d):boolean");
    }

    public final boolean p(String str) {
        return str != null && this.f.contains(str);
    }

    public final int q(CharSequence charSequence, n2d n2dVar, StringBuilder sb, p2d p2dVar) throws NumberParseException {
        if (charSequence.length() == 0) {
            return 0;
        }
        StringBuilder sb2 = new StringBuilder(charSequence);
        String strD = n2dVar != null ? n2dVar.d() : "NonMatch";
        if (sb2.length() != 0) {
            Matcher matcher = l.matcher(sb2);
            if (matcher.lookingAt()) {
                sb2.delete(0, matcher.end());
                s(sb2);
            } else {
                Pattern patternN = this.e.N(strD);
                s(sb2);
                Matcher matcher2 = patternN.matcher(sb2);
                if (matcher2.lookingAt()) {
                    int iEnd = matcher2.end();
                    Matcher matcher3 = n.matcher(sb2.substring(iEnd));
                    if (!matcher3.find() || !t(matcher3.group(1)).equals(TaskSessionEvent.REPLAY_FROM_START)) {
                        sb2.delete(0, iEnd);
                    }
                }
            }
            if (sb2.length() <= 2) {
                throw new NumberParseException(3, "Phone number had an IDD, but after this was not long enough to be a viable phone number.");
            }
            int iD = d(sb2, sb);
            if (iD == 0) {
                throw new NumberParseException(1, "Country calling code supplied was not recognised.");
            }
            p2dVar.i(iD);
            return iD;
        }
        if (n2dVar != null) {
            int iA = n2dVar.a();
            String strValueOf = String.valueOf(iA);
            String string = sb2.toString();
            if (string.startsWith(strValueOf)) {
                StringBuilder sb3 = new StringBuilder(string.substring(strValueOf.length()));
                o2d o2dVarC = n2dVar.c();
                r(sb3, n2dVar, null);
                xzd xzdVar = this.c;
                if ((!xzdVar.y(sb2, o2dVarC) && xzdVar.y(sb3, o2dVarC)) || x(sb2, n2dVar, 12) == 6) {
                    sb.append((CharSequence) sb3);
                    p2dVar.i(iA);
                    return iA;
                }
            }
        }
        p2dVar.i(0);
        return 0;
    }

    public final void r(StringBuilder sb, n2d n2dVar, StringBuilder sb2) {
        int length = sb.length();
        String strH = n2dVar.h();
        if (length == 0 || strH.length() == 0) {
            return;
        }
        Matcher matcher = this.e.N(strH).matcher(sb);
        if (matcher.lookingAt()) {
            o2d o2dVarC = n2dVar.c();
            xzd xzdVar = this.c;
            boolean zY = xzdVar.y(sb, o2dVarC);
            int iGroupCount = matcher.groupCount();
            String strI = n2dVar.i();
            if (strI == null || strI.length() == 0 || matcher.group(iGroupCount) == null) {
                if (!zY || xzdVar.y(sb.substring(matcher.end()), o2dVarC)) {
                    if (sb2 != null && iGroupCount > 0 && matcher.group(iGroupCount) != null) {
                        sb2.append(matcher.group(1));
                    }
                    sb.delete(0, matcher.end());
                    return;
                }
                return;
            }
            StringBuilder sb3 = new StringBuilder(sb);
            sb3.replace(0, length, matcher.replaceFirst(strI));
            if (!zY || xzdVar.y(sb3.toString(), o2dVarC)) {
                if (sb2 != null && iGroupCount > 1) {
                    sb2.append(matcher.group(1));
                }
                sb.replace(0, sb.length(), sb3.toString());
            }
        }
    }

    public final p2d v(CharSequence charSequence, String str) throws NumberParseException {
        String strSubstring;
        CharSequence charSequenceSubSequence;
        int iQ;
        p2d p2dVar = new p2d();
        if (charSequence == null) {
            throw new NumberParseException(2, "The phone number supplied was null.");
        }
        if (charSequence.length() > 250) {
            throw new NumberParseException(5, "The string supplied was too long to parse.");
        }
        StringBuilder sb = new StringBuilder();
        String string = charSequence.toString();
        int iIndexOf = string.indexOf(";phone-context=");
        String strGroup = "";
        if (iIndexOf == -1) {
            strSubstring = null;
        } else {
            int i2 = iIndexOf + 15;
            if (i2 >= string.length()) {
                strSubstring = "";
            } else {
                int iIndexOf2 = string.indexOf(59, i2);
                strSubstring = iIndexOf2 != -1 ? string.substring(i2, iIndexOf2) : string.substring(i2);
            }
        }
        if (strSubstring != null && (strSubstring.length() == 0 || !(s.matcher(strSubstring).matches() || t.matcher(strSubstring).matches()))) {
            throw new NumberParseException(2, "The phone-context value is invalid.");
        }
        if (strSubstring != null) {
            if (strSubstring.charAt(0) == '+') {
                sb.append(strSubstring);
            }
            int iIndexOf3 = string.indexOf("tel:");
            sb.append(string.substring(iIndexOf3 >= 0 ? iIndexOf3 + 4 : 0, iIndexOf));
        } else {
            Matcher matcher = o.matcher(string);
            if (matcher.find()) {
                charSequenceSubSequence = string.subSequence(matcher.start(), string.length());
                Matcher matcher2 = q.matcher(charSequenceSubSequence);
                if (matcher2.find()) {
                    charSequenceSubSequence = charSequenceSubSequence.subSequence(0, matcher2.start());
                }
                Matcher matcher3 = p.matcher(charSequenceSubSequence);
                if (matcher3.find()) {
                    charSequenceSubSequence = charSequenceSubSequence.subSequence(0, matcher3.start());
                }
            } else {
                charSequenceSubSequence = "";
            }
            sb.append(charSequenceSubSequence);
        }
        int iIndexOf4 = sb.indexOf(";isub=");
        if (iIndexOf4 > 0) {
            sb.delete(iIndexOf4, sb.length());
        }
        int length = sb.length();
        Pattern pattern = v;
        if (!(length < 2 ? false : pattern.matcher(sb).matches())) {
            throw new NumberParseException(2, "The string supplied did not seem to be a phone number.");
        }
        boolean zP = p(str);
        Pattern pattern2 = l;
        if (!zP && (sb.length() == 0 || !pattern2.matcher(sb).lookingAt())) {
            throw new NumberParseException(1, "Missing or invalid default region.");
        }
        Matcher matcher4 = u.matcher(sb);
        if (matcher4.find()) {
            String strSubstring2 = sb.substring(0, matcher4.start());
            if (strSubstring2.length() < 2 ? false : pattern.matcher(strSubstring2).matches()) {
                int iGroupCount = matcher4.groupCount();
                int i3 = 1;
                while (true) {
                    if (i3 > iGroupCount) {
                        break;
                    }
                    if (matcher4.group(i3) != null) {
                        strGroup = matcher4.group(i3);
                        sb.delete(matcher4.start(), sb.length());
                        break;
                    }
                    i3++;
                }
            }
        }
        if (strGroup.length() > 0) {
            p2dVar.j(strGroup);
        }
        n2d n2dVarH = h(str);
        StringBuilder sb2 = new StringBuilder();
        try {
            iQ = q(sb, n2dVarH, sb2, p2dVar);
        } catch (NumberParseException e) {
            Matcher matcher5 = pattern2.matcher(sb);
            int i4 = e.E;
            if (i4 != 1 || !matcher5.lookingAt()) {
                throw new NumberParseException(i4, e.getMessage());
            }
            iQ = q(sb.substring(matcher5.end()), n2dVarH, sb2, p2dVar);
            if (iQ == 0) {
                throw new NumberParseException(1, "Could not interpret numbers after plus-sign.");
            }
        }
        if (iQ != 0) {
            String strL = l(iQ);
            if (!strL.equals(str)) {
                n2dVarH = "001".equals(strL) ? g(iQ) : h(strL);
            }
        } else {
            s(sb);
            sb2.append((CharSequence) sb);
            if (str != null) {
                p2dVar.i(n2dVarH.a());
            }
        }
        if (sb2.length() < 2) {
            throw new NumberParseException(4, "The string supplied is too short to be a phone number.");
        }
        if (n2dVarH != null) {
            StringBuilder sb3 = new StringBuilder();
            StringBuilder sb4 = new StringBuilder(sb2);
            r(sb4, n2dVarH, sb3);
            int iX = x(sb4, n2dVarH, 12);
            if (iX != 4 && iX != 2 && iX != 5) {
                sb2 = sb4;
            }
        }
        int length2 = sb2.length();
        if (length2 < 2) {
            throw new NumberParseException(4, "The string supplied is too short to be a phone number.");
        }
        if (length2 > 17) {
            throw new NumberParseException(5, "The string supplied is too long to be a phone number.");
        }
        if (sb2.length() > 1 && sb2.charAt(0) == '0') {
            p2dVar.k();
            int i5 = 1;
            while (i5 < sb2.length() - 1 && sb2.charAt(i5) == '0') {
                i5++;
            }
            if (i5 != 1) {
                p2dVar.m(i5);
            }
        }
        p2dVar.l(Long.parseLong(sb2.toString()));
        return p2dVar;
    }
}
