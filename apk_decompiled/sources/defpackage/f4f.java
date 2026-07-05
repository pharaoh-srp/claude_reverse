package defpackage;

import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public final class f4f extends h4f {
    public final Pattern b;
    public final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f4f(String str, d26 d26Var, int i) {
        super(d26Var);
        this.c = i;
        this.b = Pattern.compile(str);
    }

    @Override // defpackage.h4f
    public final boolean a(cf5 cf5Var) {
        CharSequence charSequence;
        switch (this.c) {
            case 0:
                charSequence = cf5Var.c.Q;
                break;
            default:
                charSequence = cf5Var.c.N;
                break;
        }
        return charSequence != null && this.b.matcher(charSequence).matches();
    }
}
