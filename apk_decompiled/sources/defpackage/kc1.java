package defpackage;

import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class kc1 implements n39 {
    public static final Pattern a = Pattern.compile("^[!\"#$%&'()*+,./:;<=>?@\\[\\\\\\]^_`{|}~-]");

    @Override // defpackage.n39
    public final i49 a(s39 s39Var) {
        t6f t6fVar = s39Var.e;
        t6fVar.j();
        char cN = t6fVar.n();
        if (cN == '\n') {
            t6fVar.j();
            return i49.V0(new lf8(), t6fVar.q());
        }
        if (!a.matcher(String.valueOf(cN)).matches()) {
            return i49.V0(new edh("\\"), t6fVar.q());
        }
        t6fVar.j();
        return i49.V0(new edh(String.valueOf(cN)), t6fVar.q());
    }
}
