package defpackage;

import android.util.SparseBooleanArray;
import com.google.android.gms.auth.api.signin.internal.SignInHubActivity;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class z5l implements kbc {
    public static final z5l H = new z5l((String) null, true, (Exception) null);
    public final /* synthetic */ int E;
    public boolean F;
    public final Object G;

    public z5l() {
        this.E = 1;
        this.G = new SparseBooleanArray();
    }

    public static z5l c() {
        return new z5l((Object) null, true, 4);
    }

    public static z5l h(Object obj) {
        return new z5l(obj, false, 4);
    }

    public static z5l j(String str) {
        return new z5l(str, false, (Exception) null);
    }

    public static z5l k(String str, Exception exc) {
        return new z5l(str, false, exc);
    }

    @Override // defpackage.kbc
    public void G(Object obj) {
        this.F = true;
        SignInHubActivity signInHubActivity = (SignInHubActivity) ((xzd) this.G).F;
        signInHubActivity.setResult(signInHubActivity.h0, signInHubActivity.i0);
        signInHubActivity.finish();
    }

    public void a(int i) {
        fd9.M(!this.F);
        ((SparseBooleanArray) this.G).append(i, true);
    }

    public en7 b() {
        fd9.M(!this.F);
        this.F = true;
        return new en7((SparseBooleanArray) this.G);
    }

    public List d() {
        return (List) this.G;
    }

    public boolean e() {
        return this.F;
    }

    public Object f() {
        return this.G;
    }

    public boolean g() {
        return this.F;
    }

    public void i() {
    }

    public String toString() {
        int i = this.E;
        Object obj = this.G;
        switch (i) {
            case 3:
                return ((xzd) obj).toString();
            case 4:
                return this.F ? "FALL_THROUGH" : String.valueOf(obj);
            default:
                return super.toString();
        }
    }

    public z5l(String str, boolean z, Exception exc) {
        this.E = 0;
        this.F = z;
        this.G = exc;
    }

    public /* synthetic */ z5l(Object obj, boolean z, int i) {
        this.E = i;
        this.G = obj;
        this.F = z;
    }

    public z5l(goj gojVar, xzd xzdVar) {
        this.E = 3;
        this.F = false;
        this.G = xzdVar;
    }
}
