package defpackage;

import android.webkit.MimeTypeMap;
import java.util.Locale;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ikb {
    public static final Set a = mp0.Z0(new String[]{"bash", "sh", "csharp", "cs", "css", "go", "graphql", "gql", "html", "htm", "java", "javascript", "js", "json", "kotlin", "kt", "less", "perl", "pl", "php", "python", "py", "r", "ruby", "rb", "rust", "rs", "scala", "scss", "sql", "swift", "typescript", "ts"});
    public static final Set b = mp0.Z0(new String[]{"pptx", "ppt", "docx", "doc", "xlsx", "xls", "pdf", "csv", "tsv", "html", "htm", "svg", "md", "markdown", "tsx", "jsx", "mermaid", "mmd", "py", "js", "ts", "java", "cs", "go", "rs", "rb", "php", "swift", "kt", "dart", "scala", "pl", "ex", "hs", "clj", "r", "groovy", "sh", "css", "scss", "less", "sql", "graphql", "json", "txt"});

    public static final String a(String str) {
        str.getClass();
        String lowerCase = bsg.d1('.', bsg.d1('/', str, str), "").toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        return lowerCase;
    }

    public static final String b(String str) {
        str.getClass();
        return a(bsg.g1(bsg.g1(str, '#'), '?'));
    }

    public static final String c(String str, String str2) {
        str.getClass();
        String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(a(str));
        return mimeTypeFromExtension == null ? str2 : mimeTypeFromExtension;
    }

    public static final Set e() {
        return a;
    }
}
