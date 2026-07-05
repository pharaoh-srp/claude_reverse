package defpackage;

import android.text.Html;
import com.anthropic.claude.artifact.model.ArtifactMetadata;
import com.anthropic.claude.artifact.model.ArtifactType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class as0 {
    public static final qtc a;
    public static final gq8 b;
    public static final ide c;

    static {
        x3h x3hVar = new x3h();
        ez8 ez8Var = new ez8();
        ez8Var.E = false;
        List listX = x44.X(x3hVar, new yqg(ez8Var));
        qtc qtcVar = new qtc();
        List<bc7> list = listX;
        qtcVar.a(list);
        a = new qtc(qtcVar);
        gq8 gq8Var = new gq8();
        gq8Var.a = "\n";
        gq8Var.b = false;
        new HashSet(Arrays.asList("http", "https", "mailto"));
        gq8Var.c = new ArrayList();
        gq8Var.d = new ArrayList();
        for (bc7 bc7Var : list) {
            if (bc7Var instanceof hq8) {
                ((hq8) bc7Var).a(gq8Var);
            }
        }
        gq8Var.a = "<br>";
        gq8Var.b = true;
        gq8 gq8Var2 = new gq8();
        gq8Var2.a = gq8Var.a;
        gq8Var2.b = gq8Var.b;
        gq8Var2.c = new ArrayList(gq8Var.c);
        ArrayList arrayList = gq8Var.d;
        ArrayList arrayList2 = new ArrayList(arrayList.size() + 1);
        gq8Var2.d = arrayList2;
        arrayList2.addAll(arrayList);
        arrayList2.add(new fq8(0));
        b = gq8Var2;
        c = new ide("^\\s*(?:<!DOCTYPE|<html)\\b", jde.IGNORE_CASE);
    }

    public static String a(tp0 tp0Var) {
        String strJ;
        String strEscapeHtml;
        tp0Var.getClass();
        ctk ctkVar = tp0Var.a;
        ArtifactMetadata artifactMetadata = tp0Var.b;
        ArtifactType type = artifactMetadata.getType();
        ArtifactType.Html html = ArtifactType.Html.INSTANCE;
        if (x44.r(type, html) && c.a(ctkVar.g())) {
            return ctkVar.g();
        }
        ArtifactType type2 = artifactMetadata.getType();
        if (x44.r(type2, ArtifactType.Markdown.INSTANCE)) {
            String strG = ctkVar.g();
            strG.getClass();
            b5c b5cVarB = a.b(strG);
            gq8 gq8Var = b;
            gq8Var.getClass();
            StringBuilder sb = new StringBuilder();
            new c61(gq8Var, new ir8(sb)).F(b5cVarB);
            strJ = sb.toString();
        } else if (x44.r(type2, html) || x44.r(type2, ArtifactType.Svg.INSTANCE)) {
            strJ = ctkVar.g();
        } else if (x44.r(type2, ArtifactType.Code.INSTANCE) || x44.r(type2, ArtifactType.React.INSTANCE) || x44.r(type2, ArtifactType.Mermaid.INSTANCE) || x44.r(type2, ArtifactType.Repl.INSTANCE)) {
            String strG2 = ctkVar.g();
            String language = artifactMetadata.getLanguage();
            if (language == null) {
                language = "";
            }
            StringBuilder sb2 = new StringBuilder();
            int length = language.length();
            for (int i = 0; i < length; i++) {
                char cCharAt = language.charAt(i);
                if (Character.isLetterOrDigit(cCharAt) || cCharAt == '-' || cCharAt == '_' || cCharAt == '+') {
                    sb2.append(cCharAt);
                }
            }
            String string = sb2.toString();
            String strEscapeHtml2 = Html.escapeHtml(strG2);
            strEscapeHtml2.getClass();
            strJ = "<pre><code class=\"language-" + string + "\">" + strEscapeHtml2 + "</code></pre>";
        } else {
            if (x44.r(type2, ArtifactType.Text.INSTANCE) || type2 == null) {
                strEscapeHtml = Html.escapeHtml(ctkVar.g());
                strEscapeHtml.getClass();
            } else {
                if (!(type2 instanceof ArtifactType.BinaryDocument)) {
                    wg6.i();
                    return null;
                }
                strEscapeHtml = Html.escapeHtml(ctkVar.g());
                strEscapeHtml.getClass();
            }
            strJ = ij0.j("<pre class=\"plain-text\">", strEscapeHtml, "</pre>");
        }
        String title = artifactMetadata.getTitle();
        if (title == null) {
            title = "Document";
        }
        String strEscapeHtml3 = Html.escapeHtml(title);
        strEscapeHtml3.getClass();
        return csg.V("\n        <!DOCTYPE html>\n        <html>\n        <head>\n          <meta charset=\"UTF-8\">\n          <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n          <title>" + strEscapeHtml3 + "</title>\n          <style>\n            body {\n              font-family: -apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto, Helvetica, Arial, sans-serif;\n              font-size: 14px;\n              line-height: 1.6;\n              color: #000;\n              padding: 40px;\n              margin: 0;\n            }\n            h1 { font-size: 24px; margin-bottom: 16px; }\n            h2 { font-size: 20px; margin-top: 24px; margin-bottom: 12px; }\n            h3 { font-size: 16px; margin-top: 20px; margin-bottom: 8px; }\n            p { margin: 0 0 12px 0; }\n            pre {\n              background: #f5f5f5;\n              padding: 12px;\n              border-radius: 4px;\n              overflow-x: auto;\n              font-family: 'Roboto Mono', 'SF Mono', Monaco, 'Courier New', monospace;\n              font-size: 12px;\n              white-space: pre-wrap;\n              word-wrap: break-word;\n            }\n            pre.plain-text { background: none; padding: 0; }\n            code {\n              font-family: 'Roboto Mono', 'SF Mono', Monaco, 'Courier New', monospace;\n              font-size: 12px;\n              background: #f0f0f0;\n              padding: 2px 4px;\n              border-radius: 2px;\n            }\n            pre code { background: none; padding: 0; }\n            table { width: 100%; border-collapse: collapse; margin: 16px 0; font-size: 13px; }\n            th, td { border: 1px solid #ddd; padding: 8px 12px; text-align: left; }\n            th { background: #f5f5f5; font-weight: 600; }\n            tr:nth-child(even) { background: #fafafa; }\n            blockquote { border-left: 3px solid #ddd; margin: 12px 0; padding-left: 16px; color: #555; }\n            ul, ol { margin: 0 0 12px 0; padding-left: 24px; }\n            li { margin: 4px 0; }\n            hr { border: none; border-top: 1px solid #ddd; margin: 24px 0; }\n            a { color: #0066cc; }\n            /* Scoped to svg[viewBox]: only a viewBox lets the drawing rescale with the box —\n               constraining a viewBox-less svg clips its content instead of shrinking it. */\n            svg[viewBox] { max-width: 100%; height: auto; }\n            .citation {\n              display: inline-flex;\n              align-items: center;\n              height: 18px;\n              max-width: 180px;\n              padding: 0 6px;\n              font-size: 11px;\n              color: #666;\n              text-decoration: none;\n              white-space: nowrap;\n              text-overflow: ellipsis;\n              overflow: hidden;\n              background: #f5f5f5;\n              border: 0.5px solid #ddd;\n              border-radius: 9px;\n              margin: 0 2px;\n            }\n          </style>\n        </head>\n        <body>\n          " + strJ + "\n        </body>\n        </html>\n    ");
    }
}
