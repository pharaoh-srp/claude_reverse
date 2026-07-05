package defpackage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public abstract class vp8 {
    public static final HashMap a;

    static {
        HashMap map = new HashMap();
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(vp8.class.getResourceAsStream("/org/commonmark/internal/util/entities.properties"), StandardCharsets.UTF_8));
            while (true) {
                try {
                    String line = bufferedReader.readLine();
                    if (line == null) {
                        bufferedReader.close();
                        map.put("NewLine", "\n");
                        a = map;
                        return;
                    } else if (line.length() != 0) {
                        int iIndexOf = line.indexOf("=");
                        map.put(line.substring(0, iIndexOf), line.substring(iIndexOf + 1));
                    }
                } finally {
                }
            }
        } catch (IOException e) {
            throw new IllegalStateException("Failed reading data for HTML named character references", e);
        }
    }

    public static String a(String str) {
        int i;
        if (str.startsWith("&") && str.endsWith(";")) {
            String strJ = vb7.j(1, 1, str);
            if (strJ.startsWith("#")) {
                String strSubstring = strJ.substring(1);
                if (strSubstring.startsWith("x") || strSubstring.startsWith("X")) {
                    strSubstring = strSubstring.substring(1);
                    i = 16;
                } else {
                    i = 10;
                }
                try {
                    int i2 = Integer.parseInt(strSubstring, i);
                    return i2 == 0 ? "�" : new String(Character.toChars(i2));
                } catch (IllegalArgumentException unused) {
                    return "�";
                }
            }
            String str2 = (String) a.get(strJ);
            if (str2 != null) {
                return str2;
            }
        }
        return str;
    }
}
