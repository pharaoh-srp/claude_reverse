package defpackage;

import android.content.Context;
import com.google.mlkit.nl.languageid.IdentifiedLanguage;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class ffk {
    public juj d;
    public vs9 e;
    public final Context f;
    public final xs9 g;
    public final AtomicInteger b = new AtomicInteger(0);
    public final AtomicBoolean c = new AtomicBoolean(false);
    public final s31 a = new s31();

    public ffk(Context context, xs9 xs9Var) {
        this.f = context;
        this.g = xs9Var;
        xs9Var.getClass();
    }

    public final String a(String str) {
        String strA;
        if (this.d == null) {
            this.a.c();
            if (this.d == null) {
                juj jujVarA = ((slh) this.g).a(this.f, this.e);
                this.d = jujVarA;
                jujVarA.b();
            }
        }
        if (str.isEmpty()) {
            return "und";
        }
        juj jujVar = this.d;
        dgj.v(jujVar);
        Iterator it = jujVar.a(str).iterator();
        while (true) {
            if (!it.hasNext()) {
                strA = "";
                break;
            }
            IdentifiedLanguage identifiedLanguage = (IdentifiedLanguage) it.next();
            if (!"unknown".equals(identifiedLanguage.a())) {
                strA = identifiedLanguage.a();
                break;
            }
        }
        return strA.isEmpty() ? "und" : "iw".equals(strA) ? "he" : strA;
    }
}
