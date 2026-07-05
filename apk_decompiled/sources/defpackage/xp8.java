package defpackage;

import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public final class xp8 extends f0 {
    public static final Pattern[][] e = {new Pattern[]{null, null}, new Pattern[]{Pattern.compile("^<(?:script|pre|style|textarea)(?:\\s|>|$)", 2), Pattern.compile("</(?:script|pre|style|textarea)>", 2)}, new Pattern[]{Pattern.compile("^<!--"), Pattern.compile("-->")}, new Pattern[]{Pattern.compile("^<[?]"), Pattern.compile("\\?>")}, new Pattern[]{Pattern.compile("^<![A-Z]"), Pattern.compile(">")}, new Pattern[]{Pattern.compile("^<!\\[CDATA\\["), Pattern.compile("\\]\\]>")}, new Pattern[]{Pattern.compile("^</?(?:address|article|aside|base|basefont|blockquote|body|caption|center|col|colgroup|dd|details|dialog|dir|div|dl|dt|fieldset|figcaption|figure|footer|form|frame|frameset|h1|h2|h3|h4|h5|h6|head|header|hr|html|iframe|legend|li|link|main|menu|menuitem|nav|noframes|ol|optgroup|option|p|param|section|source|summary|table|tbody|td|tfoot|th|thead|title|tr|track|ul)(?:\\s|[/]?[>]|$)", 2), null}, new Pattern[]{Pattern.compile("^(?:<[A-Za-z][A-Za-z0-9-]*(?:\\s+[a-zA-Z_:][a-zA-Z0-9:._-]*(?:\\s*=\\s*(?:[^\"'=<>`\\x00-\\x20]+|'[^']*'|\"[^\"]*\"))?)*\\s*/?>|</[A-Za-z][A-Za-z0-9-]*\\s*[>])\\s*$", 2), null}};
    public final Pattern b;
    public final wp8 a = new wp8();
    public boolean c = false;
    public at d = new at(1);

    public xp8(Pattern pattern) {
        this.b = pattern;
    }

    @Override // defpackage.f0
    public final void a(xeg xegVar) {
        at atVar = this.d;
        CharSequence charSequence = xegVar.a;
        StringBuilder sb = (StringBuilder) atVar.G;
        if (atVar.F != 0) {
            sb.append('\n');
        }
        sb.append(charSequence);
        atVar.F++;
        Pattern pattern = this.b;
        if (pattern == null || !pattern.matcher(charSequence).find()) {
            return;
        }
        this.c = true;
    }

    @Override // defpackage.f0
    public final void e() {
        this.a.g = ((StringBuilder) this.d.G).toString();
        this.d = null;
    }

    @Override // defpackage.f0
    public final jr1 f() {
        return this.a;
    }

    @Override // defpackage.f0
    public final kr1 i(z96 z96Var) {
        if (this.c) {
            return null;
        }
        if (z96Var.i && this.b == null) {
            return null;
        }
        return kr1.a(z96Var.c);
    }
}
