package defpackage;

import java.security.GeneralSecurityException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes3.dex */
public final class dfd extends ThreadLocal {
    public final /* synthetic */ o5l a;

    public dfd(o5l o5lVar) {
        this.a = o5lVar;
    }

    @Override // java.lang.ThreadLocal
    public final Object initialValue() {
        o5l o5lVar = this.a;
        try {
            bo6 bo6Var = bo6.c;
            Mac mac = (Mac) bo6Var.a.u((String) o5lVar.H);
            mac.init((SecretKeySpec) o5lVar.I);
            return mac;
        } catch (GeneralSecurityException e) {
            pmf.m(e);
            return null;
        }
    }
}
