package defpackage;

import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class n3a {
    public static final c88 b = new c88("LibraryVersion", "");
    public static final n3a c = new n3a();
    public final ConcurrentHashMap a = new ConcurrentHashMap();

    public final String a(String str) throws Throwable {
        IOException e;
        String str2;
        InputStream resourceAsStream;
        String str3;
        c88 c88Var = b;
        dgj.t(str, "Please provide a valid libraryName");
        ConcurrentHashMap concurrentHashMap = this.a;
        if (concurrentHashMap.containsKey(str)) {
            return (String) concurrentHashMap.get(str);
        }
        Properties properties = new Properties();
        InputStream inputStream = null;
        property = null;
        String property = null;
        inputStream = null;
        try {
            try {
                resourceAsStream = n3a.class.getResourceAsStream("/" + str + ".properties");
            } catch (IOException e2) {
                e = e2;
                str2 = null;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            if (resourceAsStream != null) {
                properties.load(resourceAsStream);
                property = properties.getProperty("version", null);
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 12 + String.valueOf(property).length());
                sb.append(str);
                sb.append(" version is ");
                sb.append(property);
                String string = sb.toString();
                if (Log.isLoggable(c88Var.b, 2)) {
                    String str4 = c88Var.c;
                    if (str4 != null) {
                        string = str4.concat(string);
                    }
                    Log.v("LibraryVersion", string);
                }
            } else {
                StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 43);
                sb2.append("Failed to get app version for libraryName: ");
                sb2.append(str);
                String string2 = sb2.toString();
                if (Log.isLoggable(c88Var.b, 5)) {
                    String str5 = c88Var.c;
                    if (str5 != null) {
                        string2 = str5.concat(string2);
                    }
                    Log.w("LibraryVersion", string2);
                }
            }
        } catch (IOException e3) {
            e = e3;
            inputStream = resourceAsStream;
            str2 = null;
            StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 43);
            sb3.append("Failed to get app version for libraryName: ");
            sb3.append(str);
            String string3 = sb3.toString();
            if (Log.isLoggable(c88Var.b, 6)) {
                String str6 = c88Var.c;
                if (str6 != null) {
                    string3 = str6.concat(string3);
                }
                Log.e("LibraryVersion", string3, e);
            }
            InputStream inputStream2 = inputStream;
            property = str2;
            resourceAsStream = inputStream2;
        } catch (Throwable th2) {
            th = th2;
            inputStream = resourceAsStream;
            if (inputStream != null) {
                htk.f(inputStream);
            }
            throw th;
        }
        if (resourceAsStream != null) {
            htk.f(resourceAsStream);
        }
        if (property == null) {
            if (Log.isLoggable(c88Var.b, 3) && (str3 = c88Var.c) != null) {
                str3.concat(".properties file is dropped during release process. Failure to read app version is expected during Google internal testing where locally-built libraries are used");
            }
            property = "UNKNOWN";
        }
        concurrentHashMap.put(str, property);
        return property;
    }
}
