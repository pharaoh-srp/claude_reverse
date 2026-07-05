package defpackage;

import java.util.List;
import java.util.regex.Matcher;

/* JADX INFO: loaded from: classes.dex */
public final class ova {
    public final Matcher a;
    public final CharSequence b;
    public final nva c;
    public mva d;

    public ova(Matcher matcher, CharSequence charSequence) {
        charSequence.getClass();
        this.a = matcher;
        this.b = charSequence;
        this.c = new nva(0, this);
    }

    public final List a() {
        if (this.d == null) {
            this.d = new mva(this);
        }
        mva mvaVar = this.d;
        mvaVar.getClass();
        return mvaVar;
    }

    public final b79 b() {
        Matcher matcher = this.a;
        return wd6.H0(matcher.start(), matcher.end());
    }

    public final String c() {
        String strGroup = this.a.group();
        strGroup.getClass();
        return strGroup;
    }

    public final ova d() {
        Matcher matcher = this.a;
        int iEnd = matcher.end() + (matcher.end() == matcher.start() ? 1 : 0);
        CharSequence charSequence = this.b;
        if (iEnd > charSequence.length()) {
            return null;
        }
        Matcher matcher2 = matcher.pattern().matcher(charSequence);
        matcher2.getClass();
        return dgj.l(matcher2, iEnd, charSequence);
    }
}
