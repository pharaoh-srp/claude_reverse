package defpackage;

import android.content.Context;
import android.os.LocaleList;
import android.view.textclassifier.TextClassifier;

/* JADX INFO: loaded from: classes.dex */
public final class p5d {
    public final c45 a;
    public final Context b;
    public final mhf c;
    public final gea d;
    public TextClassifier f;
    public final jxb e = new jxb();
    public final lsc g = mpk.P(null);
    public final Object h = new Object();

    public p5d(c45 c45Var, Context context, mhf mhfVar, gea geaVar) {
        this.a = c45Var;
        this.b = context;
        this.c = mhfVar;
        this.d = geaVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(defpackage.p5d r16, java.lang.CharSequence r17, long r18, android.view.textclassifier.TextClassifier r20, defpackage.vp4 r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 241
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p5d.a(p5d, java.lang.CharSequence, long, android.view.textclassifier.TextClassifier, vp4):java.lang.Object");
    }

    public final LocaleList b() {
        gea geaVar = this.d;
        return geaVar != null ? pnk.j(geaVar) : new LocaleList(b5d.a.r().a().a);
    }

    public final Object c(CharSequence charSequence, long j, xzg xzgVar) {
        if (charSequence.length() == 0 || kkh.d(j)) {
            return iei.a;
        }
        return gb9.c0(this.a, new lza(this, new p0(this, charSequence, j, (tp4) null, 5), (tp4) null), xzgVar);
    }

    public final Object d(CharSequence charSequence, long j, xzg xzgVar) {
        if (charSequence.length() == 0 || kkh.d(j)) {
            return null;
        }
        return gb9.c0(this.a, new lza(this, new o5d(charSequence, j, this, null), (tp4) null), xzgVar);
    }
}
