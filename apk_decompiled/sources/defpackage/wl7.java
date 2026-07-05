package defpackage;

import android.text.TextUtils;
import com.google.firebase.installations.FirebaseInstallationsException;
import java.io.IOException;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class wl7 implements Runnable {
    public final /* synthetic */ int E;
    public final /* synthetic */ xl7 F;

    public /* synthetic */ wl7(xl7 xl7Var, int i) {
        this.E = i;
        this.F = xl7Var;
    }

    /* JADX WARN: Finally extract failed */
    @Override // java.lang.Runnable
    public final void run() {
        a91 a91VarA;
        a91 a91VarF;
        int i = this.E;
        xl7 xl7Var = this.F;
        switch (i) {
            case 0:
                xl7Var.a();
                return;
            case 1:
                Object obj = xl7.m;
                synchronized (obj) {
                    try {
                        pl7 pl7Var = xl7Var.a;
                        pl7Var.a();
                        nyj nyjVarX = nyj.x(pl7Var.a);
                        try {
                            a91VarA = xl7Var.c.A();
                            if (nyjVarX != null) {
                                nyjVarX.b0();
                            }
                        } catch (Throwable th) {
                            if (nyjVarX != null) {
                                nyjVarX.b0();
                            }
                            throw th;
                        }
                    } finally {
                    }
                }
                try {
                    int i2 = a91VarA.b;
                    if (i2 == 5) {
                        a91VarF = xl7Var.f(a91VarA);
                    } else {
                        if (i2 == 3) {
                            a91VarF = xl7Var.f(a91VarA);
                        } else if (!xl7Var.d.a(a91VarA)) {
                            return;
                        } else {
                            a91VarF = xl7Var.b(a91VarA);
                        }
                    }
                    synchronized (obj) {
                        try {
                            pl7 pl7Var2 = xl7Var.a;
                            pl7Var2.a();
                            nyj nyjVarX2 = nyj.x(pl7Var2.a);
                            try {
                                xl7Var.c.v(a91VarF);
                                if (nyjVarX2 != null) {
                                    nyjVarX2.b0();
                                }
                            } catch (Throwable th2) {
                                if (nyjVarX2 != null) {
                                    nyjVarX2.b0();
                                }
                                throw th2;
                            }
                        } finally {
                        }
                    }
                    synchronized (xl7Var) {
                        if (xl7Var.k.size() != 0 && !TextUtils.equals(a91VarA.a, a91VarF.a)) {
                            Iterator it = xl7Var.k.iterator();
                            if (it.hasNext()) {
                                ij0.x(it.next());
                                throw null;
                            }
                        }
                    }
                    if (a91VarF.b == 4) {
                        String str = a91VarF.a;
                        synchronized (xl7Var) {
                            xl7Var.j = str;
                        }
                    }
                    int i3 = a91VarF.b;
                    if (i3 == 5) {
                        xl7Var.g(new FirebaseInstallationsException());
                        return;
                    } else if (i3 == 2 || i3 == 1) {
                        xl7Var.g(new IOException("Installation ID could not be validated with the Firebase servers (maybe it was deleted). Firebase Installations will need to create a new Installation ID and auth token. Please retry your last request."));
                        return;
                    } else {
                        xl7Var.h(a91VarF);
                        return;
                    }
                } catch (FirebaseInstallationsException e) {
                    xl7Var.g(e);
                    return;
                }
            default:
                xl7Var.a();
                return;
        }
    }
}
