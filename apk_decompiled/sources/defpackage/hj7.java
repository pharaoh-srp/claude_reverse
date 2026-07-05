package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import androidx.core.content.FileProvider;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class hj7 {
    public final String a;
    public final HashMap b = new HashMap();

    public hj7(String str) {
        this.a = str;
    }

    public final void a(File file, String str) {
        if (TextUtils.isEmpty(str)) {
            sz6.p("Name must not be empty");
            return;
        }
        try {
            this.b.put(str, file.getCanonicalFile());
        } catch (IOException e) {
            throw new IllegalArgumentException("Failed to resolve canonical path for " + file, e);
        }
    }

    public final File b(Uri uri) {
        String encodedPath = uri.getEncodedPath();
        int iIndexOf = encodedPath.indexOf(47, 1);
        if (iIndexOf == -1) {
            xh6.k("Unable to find path from root: ", uri);
            return null;
        }
        String strDecode = Uri.decode(encodedPath.substring(1, iIndexOf));
        String strDecode2 = Uri.decode(encodedPath.substring(iIndexOf + 1));
        File file = (File) this.b.get(strDecode);
        if (file == null) {
            xh6.k("Unable to find configured root for ", uri);
            return null;
        }
        File file2 = new File(file, strDecode2);
        try {
            File canonicalFile = file2.getCanonicalFile();
            if (FileProvider.a(canonicalFile.getPath()).startsWith(FileProvider.a(file.getPath()).concat("/"))) {
                return canonicalFile;
            }
            throw new SecurityException("Resolved path jumped beyond configured root");
        } catch (IOException unused) {
            xh6.k("Failed to resolve canonical path for ", file2);
            return null;
        }
    }

    public final Uri c(File file) {
        try {
            String canonicalPath = file.getCanonicalPath();
            Map.Entry entry = null;
            for (Map.Entry entry2 : this.b.entrySet()) {
                String path = ((File) entry2.getValue()).getPath();
                if (FileProvider.a(canonicalPath).startsWith(FileProvider.a(path).concat("/")) && (entry == null || path.length() > ((File) entry.getValue()).getPath().length())) {
                    entry = entry2;
                }
            }
            if (entry == null) {
                sz6.p(ij0.i("Failed to find configured root that contains ", canonicalPath));
                return null;
            }
            String path2 = ((File) entry.getValue()).getPath();
            return new Uri.Builder().scheme("content").authority(this.a).encodedPath(Uri.encode((String) entry.getKey()) + '/' + Uri.encode(path2.endsWith("/") ? canonicalPath.substring(path2.length()) : canonicalPath.substring(path2.length() + 1), "/")).build();
        } catch (IOException unused) {
            xh6.k("Failed to resolve canonical path for ", file);
            return null;
        }
    }
}
