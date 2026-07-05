package defpackage;

import com.pvporbit.freetype.FreeTypeConstants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/* JADX INFO: loaded from: classes3.dex */
public final class f4h {
    public static final f4h d;
    public final HashMap a = new HashMap();
    public final f4h b;
    public final ArrayList c;

    static {
        String[] strArr = xvj.b;
        f4h f4hVar = new f4h(null, null);
        final int i = 5;
        f4hVar.c("http://www.w3.org/1999/xhtml", new String[]{"html", "head", "body", "frameset", "script", "noscript", "style", "meta", "link", "title", "frame", "noframes", "section", "nav", "aside", "hgroup", "header", "footer", "p", "h1", "h2", "h3", "h4", "h5", "h6", "dialog", "search", "ul", "ol", "pre", "div", "blockquote", "hr", "address", "figure", "figcaption", "form", "fieldset", "dl", "dt", "dd", "li", "table", "caption", "thead", "tfoot", "tbody", "colgroup", "col", "tr", "th", "td", "details", "menu", "plaintext", "template", "article", "main", "center", "dir", "applet", "marquee", "listing", "#root"}, new Consumer() { // from class: e4h
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                z3h z3hVar = (z3h) obj;
                switch (i) {
                    case 0:
                        z3hVar.f(FreeTypeConstants.FT_LOAD_PEDANTIC);
                        break;
                    case 1:
                        z3hVar.f(FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING);
                        break;
                    case 2:
                        z3hVar.f(512);
                        break;
                    case 3:
                        z3hVar.f(FreeTypeConstants.FT_LOAD_NO_RECURSE);
                        break;
                    case 4:
                        z3hVar.f(4);
                        break;
                    case 5:
                        z3hVar.f(4);
                        break;
                    case 6:
                        z3hVar.f(0);
                        break;
                    case 7:
                        z3hVar.f(4);
                        break;
                    case 8:
                        z3hVar.f(0);
                        break;
                    case 9:
                        z3hVar.f(FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING);
                        break;
                    case 10:
                        z3hVar.f(0);
                        break;
                    case 11:
                        z3hVar.f(8);
                        break;
                    case 12:
                        z3hVar.f(2);
                        break;
                    default:
                        z3hVar.f(64);
                        break;
                }
            }
        });
        final int i2 = 10;
        f4hVar.c("http://www.w3.org/1999/xhtml", new String[]{"object", "base", "font", "tt", "i", "b", "u", "big", "small", "em", "strong", "dfn", "code", "samp", "kbd", "var", "cite", "abbr", "time", "acronym", "mark", "ruby", "rt", "rp", "rtc", "a", "img", "wbr", "map", "q", "sub", "sup", "bdo", "iframe", "embed", "span", "input", "select", "textarea", "label", "audio", "video", "canvas", "optgroup", "option", "legend", "datalist", "keygen", "output", "progress", "meter", "area", "param", "source", "track", "summary", "command", "device", "basefont", "bgsound", "menuitem", "data", "bdi", "s", "strike", "nobr", "ins", "del", "button", "picture", "slot", "rb"}, new Consumer() { // from class: e4h
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                z3h z3hVar = (z3h) obj;
                switch (i2) {
                    case 0:
                        z3hVar.f(FreeTypeConstants.FT_LOAD_PEDANTIC);
                        break;
                    case 1:
                        z3hVar.f(FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING);
                        break;
                    case 2:
                        z3hVar.f(512);
                        break;
                    case 3:
                        z3hVar.f(FreeTypeConstants.FT_LOAD_NO_RECURSE);
                        break;
                    case 4:
                        z3hVar.f(4);
                        break;
                    case 5:
                        z3hVar.f(4);
                        break;
                    case 6:
                        z3hVar.f(0);
                        break;
                    case 7:
                        z3hVar.f(4);
                        break;
                    case 8:
                        z3hVar.f(0);
                        break;
                    case 9:
                        z3hVar.f(FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING);
                        break;
                    case 10:
                        z3hVar.f(0);
                        break;
                    case 11:
                        z3hVar.f(8);
                        break;
                    case 12:
                        z3hVar.f(2);
                        break;
                    default:
                        z3hVar.f(64);
                        break;
                }
            }
        });
        final int i3 = 11;
        f4hVar.c("http://www.w3.org/1999/xhtml", new String[]{"title", "p", "h1", "h2", "h3", "h4", "h5", "h6", "pre", "address", "li", "th", "td", "script", "style"}, new Consumer() { // from class: e4h
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                z3h z3hVar = (z3h) obj;
                switch (i3) {
                    case 0:
                        z3hVar.f(FreeTypeConstants.FT_LOAD_PEDANTIC);
                        break;
                    case 1:
                        z3hVar.f(FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING);
                        break;
                    case 2:
                        z3hVar.f(512);
                        break;
                    case 3:
                        z3hVar.f(FreeTypeConstants.FT_LOAD_NO_RECURSE);
                        break;
                    case 4:
                        z3hVar.f(4);
                        break;
                    case 5:
                        z3hVar.f(4);
                        break;
                    case 6:
                        z3hVar.f(0);
                        break;
                    case 7:
                        z3hVar.f(4);
                        break;
                    case 8:
                        z3hVar.f(0);
                        break;
                    case 9:
                        z3hVar.f(FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING);
                        break;
                    case 10:
                        z3hVar.f(0);
                        break;
                    case 11:
                        z3hVar.f(8);
                        break;
                    case 12:
                        z3hVar.f(2);
                        break;
                    default:
                        z3hVar.f(64);
                        break;
                }
            }
        });
        final int i4 = 12;
        f4hVar.c("http://www.w3.org/1999/xhtml", new String[]{"meta", "link", "base", "frame", "img", "br", "wbr", "embed", "hr", "input", "keygen", "col", "command", "device", "area", "basefont", "bgsound", "menuitem", "param", "source", "track"}, new Consumer() { // from class: e4h
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                z3h z3hVar = (z3h) obj;
                switch (i4) {
                    case 0:
                        z3hVar.f(FreeTypeConstants.FT_LOAD_PEDANTIC);
                        break;
                    case 1:
                        z3hVar.f(FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING);
                        break;
                    case 2:
                        z3hVar.f(512);
                        break;
                    case 3:
                        z3hVar.f(FreeTypeConstants.FT_LOAD_NO_RECURSE);
                        break;
                    case 4:
                        z3hVar.f(4);
                        break;
                    case 5:
                        z3hVar.f(4);
                        break;
                    case 6:
                        z3hVar.f(0);
                        break;
                    case 7:
                        z3hVar.f(4);
                        break;
                    case 8:
                        z3hVar.f(0);
                        break;
                    case 9:
                        z3hVar.f(FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING);
                        break;
                    case 10:
                        z3hVar.f(0);
                        break;
                    case 11:
                        z3hVar.f(8);
                        break;
                    case 12:
                        z3hVar.f(2);
                        break;
                    default:
                        z3hVar.f(64);
                        break;
                }
            }
        });
        final int i5 = 13;
        f4hVar.c("http://www.w3.org/1999/xhtml", new String[]{"pre", "plaintext", "title", "textarea", "script"}, new Consumer() { // from class: e4h
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                z3h z3hVar = (z3h) obj;
                switch (i5) {
                    case 0:
                        z3hVar.f(FreeTypeConstants.FT_LOAD_PEDANTIC);
                        break;
                    case 1:
                        z3hVar.f(FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING);
                        break;
                    case 2:
                        z3hVar.f(512);
                        break;
                    case 3:
                        z3hVar.f(FreeTypeConstants.FT_LOAD_NO_RECURSE);
                        break;
                    case 4:
                        z3hVar.f(4);
                        break;
                    case 5:
                        z3hVar.f(4);
                        break;
                    case 6:
                        z3hVar.f(0);
                        break;
                    case 7:
                        z3hVar.f(4);
                        break;
                    case 8:
                        z3hVar.f(0);
                        break;
                    case 9:
                        z3hVar.f(FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING);
                        break;
                    case 10:
                        z3hVar.f(0);
                        break;
                    case 11:
                        z3hVar.f(8);
                        break;
                    case 12:
                        z3hVar.f(2);
                        break;
                    default:
                        z3hVar.f(64);
                        break;
                }
            }
        });
        final int i6 = 0;
        f4hVar.c("http://www.w3.org/1999/xhtml", new String[]{"title", "textarea"}, new Consumer() { // from class: e4h
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                z3h z3hVar = (z3h) obj;
                switch (i6) {
                    case 0:
                        z3hVar.f(FreeTypeConstants.FT_LOAD_PEDANTIC);
                        break;
                    case 1:
                        z3hVar.f(FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING);
                        break;
                    case 2:
                        z3hVar.f(512);
                        break;
                    case 3:
                        z3hVar.f(FreeTypeConstants.FT_LOAD_NO_RECURSE);
                        break;
                    case 4:
                        z3hVar.f(4);
                        break;
                    case 5:
                        z3hVar.f(4);
                        break;
                    case 6:
                        z3hVar.f(0);
                        break;
                    case 7:
                        z3hVar.f(4);
                        break;
                    case 8:
                        z3hVar.f(0);
                        break;
                    case 9:
                        z3hVar.f(FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING);
                        break;
                    case 10:
                        z3hVar.f(0);
                        break;
                    case 11:
                        z3hVar.f(8);
                        break;
                    case 12:
                        z3hVar.f(2);
                        break;
                    default:
                        z3hVar.f(64);
                        break;
                }
            }
        });
        final int i7 = 1;
        f4hVar.c("http://www.w3.org/1999/xhtml", new String[]{"iframe", "noembed", "noframes", "script", "style", "xmp"}, new Consumer() { // from class: e4h
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                z3h z3hVar = (z3h) obj;
                switch (i7) {
                    case 0:
                        z3hVar.f(FreeTypeConstants.FT_LOAD_PEDANTIC);
                        break;
                    case 1:
                        z3hVar.f(FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING);
                        break;
                    case 2:
                        z3hVar.f(512);
                        break;
                    case 3:
                        z3hVar.f(FreeTypeConstants.FT_LOAD_NO_RECURSE);
                        break;
                    case 4:
                        z3hVar.f(4);
                        break;
                    case 5:
                        z3hVar.f(4);
                        break;
                    case 6:
                        z3hVar.f(0);
                        break;
                    case 7:
                        z3hVar.f(4);
                        break;
                    case 8:
                        z3hVar.f(0);
                        break;
                    case 9:
                        z3hVar.f(FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING);
                        break;
                    case 10:
                        z3hVar.f(0);
                        break;
                    case 11:
                        z3hVar.f(8);
                        break;
                    case 12:
                        z3hVar.f(2);
                        break;
                    default:
                        z3hVar.f(64);
                        break;
                }
            }
        });
        final int i8 = 2;
        f4hVar.c("http://www.w3.org/1999/xhtml", strArr, new Consumer() { // from class: e4h
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                z3h z3hVar = (z3h) obj;
                switch (i8) {
                    case 0:
                        z3hVar.f(FreeTypeConstants.FT_LOAD_PEDANTIC);
                        break;
                    case 1:
                        z3hVar.f(FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING);
                        break;
                    case 2:
                        z3hVar.f(512);
                        break;
                    case 3:
                        z3hVar.f(FreeTypeConstants.FT_LOAD_NO_RECURSE);
                        break;
                    case 4:
                        z3hVar.f(4);
                        break;
                    case 5:
                        z3hVar.f(4);
                        break;
                    case 6:
                        z3hVar.f(0);
                        break;
                    case 7:
                        z3hVar.f(4);
                        break;
                    case 8:
                        z3hVar.f(0);
                        break;
                    case 9:
                        z3hVar.f(FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING);
                        break;
                    case 10:
                        z3hVar.f(0);
                        break;
                    case 11:
                        z3hVar.f(8);
                        break;
                    case 12:
                        z3hVar.f(2);
                        break;
                    default:
                        z3hVar.f(64);
                        break;
                }
            }
        });
        final int i9 = 3;
        f4hVar.c("http://www.w3.org/1999/xhtml", new String[]{"button", "input", "select", "textarea", "option", "output", "progress", "meter", "img", "picture", "audio", "video", "canvas", "object", "embed", "iframe"}, new Consumer() { // from class: e4h
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                z3h z3hVar = (z3h) obj;
                switch (i9) {
                    case 0:
                        z3hVar.f(FreeTypeConstants.FT_LOAD_PEDANTIC);
                        break;
                    case 1:
                        z3hVar.f(FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING);
                        break;
                    case 2:
                        z3hVar.f(512);
                        break;
                    case 3:
                        z3hVar.f(FreeTypeConstants.FT_LOAD_NO_RECURSE);
                        break;
                    case 4:
                        z3hVar.f(4);
                        break;
                    case 5:
                        z3hVar.f(4);
                        break;
                    case 6:
                        z3hVar.f(0);
                        break;
                    case 7:
                        z3hVar.f(4);
                        break;
                    case 8:
                        z3hVar.f(0);
                        break;
                    case 9:
                        z3hVar.f(FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING);
                        break;
                    case 10:
                        z3hVar.f(0);
                        break;
                    case 11:
                        z3hVar.f(8);
                        break;
                    case 12:
                        z3hVar.f(2);
                        break;
                    default:
                        z3hVar.f(64);
                        break;
                }
            }
        });
        final int i10 = 4;
        f4hVar.c("http://www.w3.org/1998/Math/MathML", new String[]{"math"}, new Consumer() { // from class: e4h
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                z3h z3hVar = (z3h) obj;
                switch (i10) {
                    case 0:
                        z3hVar.f(FreeTypeConstants.FT_LOAD_PEDANTIC);
                        break;
                    case 1:
                        z3hVar.f(FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING);
                        break;
                    case 2:
                        z3hVar.f(512);
                        break;
                    case 3:
                        z3hVar.f(FreeTypeConstants.FT_LOAD_NO_RECURSE);
                        break;
                    case 4:
                        z3hVar.f(4);
                        break;
                    case 5:
                        z3hVar.f(4);
                        break;
                    case 6:
                        z3hVar.f(0);
                        break;
                    case 7:
                        z3hVar.f(4);
                        break;
                    case 8:
                        z3hVar.f(0);
                        break;
                    case 9:
                        z3hVar.f(FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING);
                        break;
                    case 10:
                        z3hVar.f(0);
                        break;
                    case 11:
                        z3hVar.f(8);
                        break;
                    case 12:
                        z3hVar.f(2);
                        break;
                    default:
                        z3hVar.f(64);
                        break;
                }
            }
        });
        final int i11 = 6;
        f4hVar.c("http://www.w3.org/1998/Math/MathML", new String[]{"mi", "mo", "msup", "mn", "mtext"}, new Consumer() { // from class: e4h
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                z3h z3hVar = (z3h) obj;
                switch (i11) {
                    case 0:
                        z3hVar.f(FreeTypeConstants.FT_LOAD_PEDANTIC);
                        break;
                    case 1:
                        z3hVar.f(FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING);
                        break;
                    case 2:
                        z3hVar.f(512);
                        break;
                    case 3:
                        z3hVar.f(FreeTypeConstants.FT_LOAD_NO_RECURSE);
                        break;
                    case 4:
                        z3hVar.f(4);
                        break;
                    case 5:
                        z3hVar.f(4);
                        break;
                    case 6:
                        z3hVar.f(0);
                        break;
                    case 7:
                        z3hVar.f(4);
                        break;
                    case 8:
                        z3hVar.f(0);
                        break;
                    case 9:
                        z3hVar.f(FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING);
                        break;
                    case 10:
                        z3hVar.f(0);
                        break;
                    case 11:
                        z3hVar.f(8);
                        break;
                    case 12:
                        z3hVar.f(2);
                        break;
                    default:
                        z3hVar.f(64);
                        break;
                }
            }
        });
        final int i12 = 7;
        f4hVar.c("http://www.w3.org/2000/svg", new String[]{"svg", "femerge", "femergenode"}, new Consumer() { // from class: e4h
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                z3h z3hVar = (z3h) obj;
                switch (i12) {
                    case 0:
                        z3hVar.f(FreeTypeConstants.FT_LOAD_PEDANTIC);
                        break;
                    case 1:
                        z3hVar.f(FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING);
                        break;
                    case 2:
                        z3hVar.f(512);
                        break;
                    case 3:
                        z3hVar.f(FreeTypeConstants.FT_LOAD_NO_RECURSE);
                        break;
                    case 4:
                        z3hVar.f(4);
                        break;
                    case 5:
                        z3hVar.f(4);
                        break;
                    case 6:
                        z3hVar.f(0);
                        break;
                    case 7:
                        z3hVar.f(4);
                        break;
                    case 8:
                        z3hVar.f(0);
                        break;
                    case 9:
                        z3hVar.f(FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING);
                        break;
                    case 10:
                        z3hVar.f(0);
                        break;
                    case 11:
                        z3hVar.f(8);
                        break;
                    case 12:
                        z3hVar.f(2);
                        break;
                    default:
                        z3hVar.f(64);
                        break;
                }
            }
        });
        final int i13 = 8;
        f4hVar.c("http://www.w3.org/2000/svg", new String[]{"text"}, new Consumer() { // from class: e4h
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                z3h z3hVar = (z3h) obj;
                switch (i13) {
                    case 0:
                        z3hVar.f(FreeTypeConstants.FT_LOAD_PEDANTIC);
                        break;
                    case 1:
                        z3hVar.f(FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING);
                        break;
                    case 2:
                        z3hVar.f(512);
                        break;
                    case 3:
                        z3hVar.f(FreeTypeConstants.FT_LOAD_NO_RECURSE);
                        break;
                    case 4:
                        z3hVar.f(4);
                        break;
                    case 5:
                        z3hVar.f(4);
                        break;
                    case 6:
                        z3hVar.f(0);
                        break;
                    case 7:
                        z3hVar.f(4);
                        break;
                    case 8:
                        z3hVar.f(0);
                        break;
                    case 9:
                        z3hVar.f(FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING);
                        break;
                    case 10:
                        z3hVar.f(0);
                        break;
                    case 11:
                        z3hVar.f(8);
                        break;
                    case 12:
                        z3hVar.f(2);
                        break;
                    default:
                        z3hVar.f(64);
                        break;
                }
            }
        });
        final int i14 = 9;
        f4hVar.c("http://www.w3.org/2000/svg", new String[]{"script"}, new Consumer() { // from class: e4h
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                z3h z3hVar = (z3h) obj;
                switch (i14) {
                    case 0:
                        z3hVar.f(FreeTypeConstants.FT_LOAD_PEDANTIC);
                        break;
                    case 1:
                        z3hVar.f(FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING);
                        break;
                    case 2:
                        z3hVar.f(512);
                        break;
                    case 3:
                        z3hVar.f(FreeTypeConstants.FT_LOAD_NO_RECURSE);
                        break;
                    case 4:
                        z3hVar.f(4);
                        break;
                    case 5:
                        z3hVar.f(4);
                        break;
                    case 6:
                        z3hVar.f(0);
                        break;
                    case 7:
                        z3hVar.f(4);
                        break;
                    case 8:
                        z3hVar.f(0);
                        break;
                    case 9:
                        z3hVar.f(FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING);
                        break;
                    case 10:
                        z3hVar.f(0);
                        break;
                    case 11:
                        z3hVar.f(8);
                        break;
                    case 12:
                        z3hVar.f(2);
                        break;
                    default:
                        z3hVar.f(64);
                        break;
                }
            }
        });
        d = f4hVar;
    }

    public f4h(f4h f4hVar, ArrayList arrayList) {
        this.b = f4hVar;
        this.c = arrayList;
    }

    public final void a(z3h z3hVar) {
        ArrayList arrayList = this.c;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((Consumer) it.next()).accept(z3hVar);
            }
        }
        ((Map) this.a.computeIfAbsent(z3hVar.E, new a41(9))).put(z3hVar.F, z3hVar);
    }

    public final z3h b(String str, String str2) {
        z3h z3hVarB;
        z3h z3hVar;
        pqi.p(str);
        pqi.p(str2);
        Map map = (Map) this.a.get(str2);
        if (map != null && (z3hVar = (z3h) map.get(str)) != null) {
            return z3hVar;
        }
        f4h f4hVar = this.b;
        if (f4hVar == null || (z3hVarB = f4hVar.b(str, str2)) == null) {
            return null;
        }
        z3h z3hVarClone = z3hVarB.clone();
        a(z3hVarClone);
        return z3hVarClone;
    }

    public final void c(String str, String[] strArr, Consumer consumer) {
        for (String str2 : strArr) {
            z3h z3hVarB = b(str2, str);
            if (z3hVarB == null) {
                z3hVarB = new z3h(str2, str2, str);
                z3hVarB.H = 0;
                z3hVarB.f(1);
                a(z3hVarB);
            }
            consumer.accept(z3hVarB);
        }
    }

    public final z3h d(String str, String str2, String str3, boolean z) {
        pqi.p(str);
        pqi.p(str3);
        String strTrim = str.trim();
        pqi.n(strTrim);
        z3h z3hVarB = b(strTrim, str3);
        if (z3hVarB != null) {
            return z3hVarB;
        }
        if (str2 == null) {
            str2 = ouk.h(strTrim);
        }
        if (!z) {
            strTrim = str2;
        }
        z3h z3hVarB2 = b(str2, str3);
        if (z3hVarB2 == null) {
            z3h z3hVar = new z3h(strTrim, str2, str3);
            a(z3hVar);
            return z3hVar;
        }
        if (!z || strTrim.equals(str2)) {
            return z3hVarB2;
        }
        z3h z3hVarClone = z3hVarB2.clone();
        z3hVarClone.F = strTrim;
        a(z3hVarClone);
        return z3hVarClone;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof f4h) {
            return Objects.equals(this.a, ((f4h) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.a);
    }
}
