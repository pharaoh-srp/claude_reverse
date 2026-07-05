package defpackage;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Stream;

/* JADX INFO: loaded from: classes3.dex */
public abstract class gx4 {
    public static final x3f a;
    public static final List b;
    public static final ide c;
    public static final ide d;
    public static final ide e;
    public static final ide f;
    public static final ide g;
    public static final ide h;

    static {
        x3f x3fVar = new x3f();
        x3fVar.c("a", "b", "blockquote", "br", "caption", "cite", "code", "col", "colgroup", "dd", "div", "dl", "dt", "em", "h1", "h2", "h3", "h4", "h5", "h6", "i", "img", "li", "ol", "p", "pre", "q", "small", "span", "strike", "strong", "sub", "sup", "table", "tbody", "td", "tfoot", "th", "thead", "tr", "u", "ul");
        x3fVar.a("a", "href", "title");
        x3fVar.a("blockquote", "cite");
        x3fVar.a("col", "span", "width");
        x3fVar.a("colgroup", "span", "width");
        x3fVar.a("img", "align", "alt", "height", "src", "title", "width");
        x3fVar.a("ol", "start", "type");
        x3fVar.a("q", "cite");
        x3fVar.a("table", "summary", "width");
        x3fVar.a("td", "abbr", "axis", "colspan", "rowspan", "width");
        x3fVar.a("th", "abbr", "axis", "colspan", "rowspan", "scope", "width");
        x3fVar.a("ul", "type");
        x3fVar.b("a", "href", "ftp", "http", "https", "mailto");
        x3fVar.b("blockquote", "cite", "http", "https");
        x3fVar.b("cite", "cite", "http", "https");
        x3fVar.b("img", "src", "http", "https");
        x3fVar.b("q", "cite", "http", "https");
        x3fVar.c("hr", "figure", "figcaption", "video", "source", "style");
        x3fVar.c("svg", "g", "defs", "clippath", "lineargradient", "radialgradient", "stop", "path", "rect", "circle", "ellipse", "line", "polyline", "polygon", "text", "tspan", "title", "desc", "image", "marker");
        x3fVar.a(":all", "id", "class", "style");
        x3fVar.a(":all", "viewbox", "preserveaspectratio", "xmlns", "d", "points", "transform", "x", "y", "x1", "y1", "x2", "y2", "cx", "cy", "r", "rx", "ry", "dx", "dy", "width", "height", "fill", "fill-opacity", "fill-rule", "stroke", "stroke-width", "stroke-opacity", "stroke-dasharray", "stroke-dashoffset", "stroke-linecap", "stroke-linejoin", "opacity", "font-size", "font-family", "font-weight", "font-style", "text-anchor", "dominant-baseline", "alignment-baseline", "letter-spacing", "vector-effect", "clip-path", "clip-rule", "rotate", "offset", "stop-color", "stop-opacity", "gradientunits", "gradienttransform", "spreadmethod", "marker-start", "marker-mid", "marker-end", "markerwidth", "markerheight", "markerunits", "refx", "refy", "orient");
        x3fVar.a("a", "target", "rel", "download", "xlink:href");
        x3fVar.a("img", "alt", "width", "height", "srcset");
        x3fVar.a("image", "href", "xlink:href");
        x3fVar.a("video", "controls", "poster", "width", "height");
        x3fVar.a("source", "src", "type", "srcset");
        x3fVar.b("img", "src", "http", "https", "data");
        x3fVar.b("image", "href", "http", "https", "data");
        x3fVar.b("image", "xlink:href", "http", "https", "data");
        x3fVar.b("video", "poster", "http", "https", "data");
        x3fVar.b("source", "src", "http", "https", "data");
        x3fVar.b("a", "href", "http", "https", "mailto");
        x3fVar.b("a", "xlink:href", "http", "https", "mailto");
        pqi.n("a");
        pqi.n("href");
        v3f v3fVarA = v3f.a("a");
        s3f s3fVar = new s3f(ouk.g("href"));
        HashMap map = x3fVar.d;
        pqi.l("Cannot remove a protocol that is not set.", map.containsKey(v3fVarA));
        Map map2 = (Map) map.get(v3fVarA);
        pqi.l("Cannot remove a protocol that is not set.", map2.containsKey(s3fVar));
        Set set = (Set) map2.get(s3fVar);
        String str = new String[]{"ftp"}[0];
        pqi.n(str);
        set.remove(new u3f(str));
        if (set.isEmpty()) {
            map2.remove(s3fVar);
            if (map2.isEmpty()) {
                map.remove(v3fVarA);
            }
        }
        x3fVar.e = true;
        a = x3fVar;
        b = x44.X("fill", "stroke", "clip-path");
        jde jdeVar = jde.IGNORE_CASE;
        c = new ide("url\\s*\\(\\s*+(?!['\"]?\\s*#)", jdeVar);
        d = new ide("(?:-webkit-)?(?:image-set|cross-fade|image)\\s*\\(", jdeVar);
        e = new ide("\\bvar\\s*\\(", jdeVar);
        f = new ide("(?:^|;)\\s*(?:fill|stroke|clip-path)\\s*:\\s*[^;]*url\\s*\\(\\s*+(?!['\"]?\\s*#)[^;]*;?", jdeVar);
        g = new ide("[^;{}]*?[A-Za-z-]+\\s*:[^;{}]*?\\burl\\s*\\(\\s*+(?!['\"]?\\s*#)[^;{}]*;?", jdeVar);
        h = new ide("@import(?![A-Za-z0-9_-])[^;{}]*;?", jdeVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static String a(String str) {
        ide ideVar;
        xj6 xj6Var;
        CharSequence charSequenceSubSequence;
        n31 n31VarK;
        int iR;
        n31 n31VarK2;
        int iR2;
        str.getClass();
        o96 o96VarA = xtc.a(str, "https://relative.invalid/");
        poj pojVar = new poj();
        x3f x3fVar = a;
        pqi.p(x3fVar);
        pojVar.E = x3fVar;
        o96 o96Var = new o96(o96VarA.l(), 0);
        yj6 yj6VarQ = o96Var.Q("html");
        yj6VarQ.Q("head");
        yj6VarQ.Q("body");
        yj6 yj6VarM0 = o96VarA.m0();
        yj6 yj6VarM02 = o96Var.m0();
        epk epkVar = new epk();
        epkVar.F = pojVar;
        epkVar.E = yj6VarM02;
        epkVar.j(yj6VarM0);
        n96 n96VarClone = o96VarA.N.clone();
        o96Var.N = n96VarClone;
        n96VarClone.G = false;
        Iterator<E> it = lok.g(new ru6(0), o96Var.m0()).iterator();
        it.getClass();
        while (it.hasNext()) {
            Object next = it.next();
            next.getClass();
            yj6 yj6Var = (yj6) next;
            Iterator it2 = b.iterator();
            while (true) {
                boolean zHasNext = it2.hasNext();
                ideVar = c;
                if (!zHasNext) {
                    break;
                }
                String str2 = (String) it2.next();
                String strG = yj6Var.g(str2);
                strG.getClass();
                if (strG.length() > 0 && (ideVar.a(strG) || e.a(strG))) {
                    if (yj6Var.v() && (iR2 = (n31VarK2 = yj6Var.k()).r(str2)) != -1) {
                        n31VarK2.u(iR2);
                    }
                }
            }
            String strG2 = yj6Var.g("style");
            strG2.getClass();
            boolean z = true;
            String str3 = "";
            if (strG2.length() > 0) {
                ide ideVar2 = f;
                if (ideVar2.a(strG2)) {
                    String string = bsg.k1(ideVar2.h(strG2, "")).toString();
                    char[] cArr = {';'};
                    string.getClass();
                    int length = string.length();
                    int i = 0;
                    while (true) {
                        if (i >= length) {
                            charSequenceSubSequence = "";
                            break;
                        }
                        char cCharAt = string.charAt(i);
                        int i2 = 0;
                        while (true) {
                            if (i2 >= 1) {
                                i2 = -1;
                                break;
                            }
                            if (cCharAt == cArr[i2]) {
                                break;
                            }
                            i2++;
                        }
                        if (i2 < 0) {
                            charSequenceSubSequence = string.subSequence(i, string.length());
                            break;
                        }
                        i++;
                    }
                    String string2 = bsg.k1(charSequenceSubSequence.toString()).toString();
                    if (string2.length() != 0) {
                        yj6Var.h("style", string2);
                    } else if (yj6Var.v() && (iR = (n31VarK = yj6Var.k()).r("style")) != -1) {
                        n31VarK.u(iR);
                    }
                }
            }
            if (x44.r(yj6Var.H.G, "style")) {
                Stream map = euk.s(yj6Var, c5c.class).map(new a41(2));
                String[] strArr = xrg.a;
                String str4 = (String) map.collect(Collector.of(new trg(""), new urg(), new vrg(), new a41(7), new Collector.Characteristics[0]));
                str4.getClass();
                StringBuilder sbB = xrg.b();
                new do0(17, sbB).j(yj6Var);
                String strConcat = xrg.k(sbB).concat(str4);
                boolean zV0 = bsg.v0(strConcat, '\\');
                boolean zIsEmpty = new ck6(yj6Var.W()).isEmpty();
                ide ideVar3 = h;
                ide ideVar4 = d;
                if (!zV0 && !bsg.v0(strConcat, '<') && !ideVar.a(strConcat) && !ideVar4.a(strConcat) && !ideVar3.a(strConcat)) {
                    z = false;
                }
                if (!zIsEmpty || (strConcat.length() > 0 && z)) {
                    String strH = ideVar3.h(g.h(strConcat, ""), "");
                    if (zIsEmpty && !zV0 && !bsg.v0(strH, '<') && !ideVar3.a(strH) && !ideVar.a(strH) && !ideVar4.a(strH)) {
                        str3 = strH;
                    }
                    int size = yj6Var.I.size();
                    int i3 = 0;
                    while (true) {
                        xj6Var = yj6Var.I;
                        if (i3 >= size) {
                            break;
                        }
                        ((c5c) xj6Var.get(i3)).E = null;
                        i3++;
                    }
                    xj6Var.clear();
                    yj6Var.O(str4.length() > 0 ? new ikh(str3) : new xf5(str3));
                }
            }
        }
        String strE0 = o96Var.m0().e0();
        strE0.getClass();
        return strE0;
    }
}
