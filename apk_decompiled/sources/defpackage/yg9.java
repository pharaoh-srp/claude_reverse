package defpackage;

import com.squareup.wire.ProtoReader;
import java.io.IOException;
import java.util.TreeMap;
import java.util.Vector;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public final class yg9 {
    public static final Pattern e = Pattern.compile("true|false");
    public static final Pattern f = Pattern.compile("-?[0-9]+(\\.[0-9]+)?([eE][-+]?[0-9]+)?");
    public int a;
    public int b;
    public String c;
    public Object d;

    public static boolean a(char c) {
        return c == ' ' || c == '\n' || c == '\r' || c == '\t';
    }

    public final char b() throws IOException {
        int i = this.a;
        if (i >= this.b) {
            xh6.c("Unexpected EOF reached");
            return (char) 0;
        }
        String str = this.c;
        this.a = i + 1;
        return str.charAt(i);
    }

    public final Vector c() throws IOException {
        Vector vector = new Vector();
        boolean z = false;
        while (true) {
            int i = this.a;
            char cG = g();
            this.a = i;
            if (cG == ']') {
                g();
                return vector;
            }
            if (z) {
                h(',');
            } else {
                z = true;
            }
            vector.add(d());
        }
    }

    public final Object d() throws IOException {
        char cG = g();
        if (cG == '\"') {
            return f();
        }
        if (cG == '[') {
            return c();
        }
        if (cG == '{') {
            return e();
        }
        this.a--;
        StringBuilder sb = new StringBuilder();
        while (true) {
            int i = this.a;
            char cG2 = g();
            this.a = i;
            if (cG2 == ',' || cG2 == ']' || cG2 == '}') {
                break;
            }
            char cB = b();
            if (a(cB)) {
                break;
            }
            sb.append(cB);
        }
        String string = sb.toString();
        if (string.length() == 0) {
            xh6.c("Missing argument");
            return null;
        }
        if (f.matcher(string).matches()) {
            return Double.valueOf(string);
        }
        if (e.matcher(string).matches()) {
            return new Boolean(string);
        }
        if (string.equals("null")) {
            return null;
        }
        xh6.c("Unrecognized or malformed JSON token: ".concat(string));
        return null;
    }

    public final TreeMap e() throws IOException {
        TreeMap treeMap = new TreeMap();
        boolean z = false;
        while (true) {
            int i = this.a;
            char cG = g();
            this.a = i;
            if (cG == '}') {
                g();
                return treeMap;
            }
            if (z) {
                h(',');
            }
            h('\"');
            String strF = f();
            h(':');
            if (treeMap.put(strF, d()) != null) {
                xh6.c("Duplicate property: ".concat(strF));
                return null;
            }
            z = true;
        }
    }

    public final String f() throws IOException {
        int i;
        StringBuilder sb = new StringBuilder();
        while (true) {
            char cB = b();
            if (cB < ' ') {
                throw new IOException(cB == '\n' ? "Unterminated string literal" : "Unescaped control character: 0x" + Integer.toString(cB, 16));
            }
            if (cB == '\"') {
                return sb.toString();
            }
            if (cB == '\\' && (cB = b()) != '\"' && cB != '/' && cB != '\\') {
                if (cB == 'b') {
                    cB = '\b';
                } else if (cB == 'f') {
                    cB = '\f';
                } else if (cB == 'n') {
                    cB = '\n';
                } else if (cB == 'r') {
                    cB = '\r';
                } else if (cB == 't') {
                    cB = '\t';
                } else {
                    if (cB != 'u') {
                        throw new IOException("Unsupported escape:" + cB);
                    }
                    char c = 0;
                    for (int i2 = 0; i2 < 4; i2++) {
                        int i3 = c << 4;
                        char cB2 = b();
                        switch (cB2) {
                            case mdj.f /* 48 */:
                            case '1':
                            case '2':
                            case '3':
                            case '4':
                            case '5':
                            case '6':
                            case '7':
                            case '8':
                            case '9':
                                i = cB2 - '0';
                                break;
                            default:
                                switch (cB2) {
                                    case 'A':
                                    case 'B':
                                    case 'C':
                                    case 'D':
                                    case 'E':
                                    case 'F':
                                        i = cB2 - '7';
                                        break;
                                    default:
                                        switch (cB2) {
                                            case 'a':
                                            case 'b':
                                            case 'c':
                                            case ProtoReader.RECURSION_LIMIT /* 100 */:
                                            case 'e':
                                            case 'f':
                                                i = cB2 - 'W';
                                                break;
                                            default:
                                                throw new IOException("Bad hex in \\u escape: " + cB2);
                                        }
                                        break;
                                }
                                break;
                        }
                        c = (char) (i3 + ((char) i));
                    }
                    cB = c;
                }
            }
            sb.append(cB);
        }
    }

    public final char g() throws IOException {
        char cB;
        do {
            cB = b();
        } while (a(cB));
        return cB;
    }

    public final void h(char c) throws IOException {
        char cG = g();
        if (cG == c) {
            return;
        }
        throw new IOException("Expected '" + c + "' but got '" + cG + "'");
    }
}
