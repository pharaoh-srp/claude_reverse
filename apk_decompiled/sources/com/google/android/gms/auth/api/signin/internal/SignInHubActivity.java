package com.google.android.gms.auth.api.signin.internal;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import android.view.accessibility.AccessibilityEvent;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.SignInAccount;
import com.google.android.gms.common.api.Status;
import defpackage.aca;
import defpackage.fx7;
import defpackage.goj;
import defpackage.i49;
import defpackage.jgg;
import defpackage.jwj;
import defpackage.m4a;
import defpackage.mmj;
import defpackage.nog;
import defpackage.poj;
import defpackage.sz6;
import defpackage.xzd;
import defpackage.yba;
import defpackage.z5l;
import java.lang.reflect.Modifier;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public class SignInHubActivity extends fx7 {
    public static boolean j0 = false;
    public boolean e0 = false;
    public SignInConfiguration f0;
    public boolean g0;
    public int h0;
    public Intent i0;

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return true;
    }

    @Override // defpackage.fx7, defpackage.ba4, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        GoogleSignInAccount googleSignInAccount;
        if (this.e0) {
            return;
        }
        setResult(0);
        if (i != 40962) {
            return;
        }
        if (intent != null) {
            SignInAccount signInAccount = (SignInAccount) intent.getParcelableExtra("signInAccount");
            if (signInAccount != null && (googleSignInAccount = signInAccount.F) != null) {
                poj pojVarP = poj.P(this);
                GoogleSignInOptions googleSignInOptions = this.f0.F;
                synchronized (pojVarP) {
                    ((nog) pojVarP.E).c(googleSignInAccount, googleSignInOptions);
                }
                intent.removeExtra("signInAccount");
                intent.putExtra("googleSignInAccount", googleSignInAccount);
                this.g0 = true;
                this.h0 = i2;
                this.i0 = intent;
                p();
                return;
            }
            if (intent.hasExtra("errorCode")) {
                int intExtra = intent.getIntExtra("errorCode", 8);
                if (intExtra == 13) {
                    intExtra = 12501;
                }
                q(intExtra);
                return;
            }
        }
        q(8);
    }

    @Override // defpackage.fx7, defpackage.ba4, defpackage.aa4, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        String action = intent.getAction();
        if (action == null) {
            Log.e("AuthSignInClient", "Null action");
            q(12500);
            return;
        }
        if (action.equals("com.google.android.gms.auth.NO_IMPL")) {
            Log.e("AuthSignInClient", "Action not implemented");
            q(12500);
            return;
        }
        if (!action.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN") && !action.equals("com.google.android.gms.auth.APPAUTH_SIGN_IN")) {
            Log.e("AuthSignInClient", "Unknown action: ".concat(String.valueOf(intent.getAction())));
            finish();
            return;
        }
        Bundle bundleExtra = intent.getBundleExtra("config");
        if (bundleExtra == null) {
            Log.e("AuthSignInClient", "Activity started with no configuration.");
            setResult(0);
            finish();
            return;
        }
        SignInConfiguration signInConfiguration = (SignInConfiguration) bundleExtra.getParcelable("config");
        if (signInConfiguration == null) {
            Log.e("AuthSignInClient", "Activity started with invalid configuration.");
            setResult(0);
            finish();
            return;
        }
        this.f0 = signInConfiguration;
        if (bundle != null) {
            boolean z = bundle.getBoolean("signingInGoogleApiClients");
            this.g0 = z;
            if (z) {
                this.h0 = bundle.getInt("signInResultCode");
                Intent intent2 = (Intent) bundle.getParcelable("signInResultData");
                if (intent2 != null) {
                    this.i0 = intent2;
                    p();
                    return;
                } else {
                    Log.e("AuthSignInClient", "Sign in result data cannot be null");
                    setResult(0);
                    finish();
                    return;
                }
            }
            return;
        }
        if (j0) {
            setResult(0);
            q(12502);
            return;
        }
        j0 = true;
        Intent intent3 = new Intent(action);
        if (action.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN")) {
            intent3.setPackage("com.google.android.gms");
        } else {
            intent3.setPackage(getPackageName());
        }
        intent3.putExtra("config", this.f0);
        try {
            startActivityForResult(intent3, 40962);
        } catch (ActivityNotFoundException unused) {
            this.e0 = true;
            Log.w("AuthSignInClient", "Could not launch sign in Intent. Google Play Service is probably being updated...");
            q(17);
        }
    }

    @Override // defpackage.fx7, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        j0 = false;
    }

    @Override // defpackage.ba4, defpackage.aa4, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("signingInGoogleApiClients", this.g0);
        if (this.g0) {
            bundle.putInt("signInResultCode", this.h0);
            bundle.putParcelable("signInResultData", this.i0);
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void p() {
        i49 i49VarE0 = i49.E0(this);
        xzd xzdVar = new xzd(26, this);
        m4a m4aVar = (m4a) i49VarE0.F;
        aca acaVar = (aca) i49VarE0.G;
        boolean z = acaVar.c;
        jgg jggVar = acaVar.b;
        if (z) {
            sz6.j("Called while creating a loader");
            return;
        }
        if (Looper.getMainLooper() != Looper.myLooper()) {
            sz6.j("initLoader must be called on the main thread");
            return;
        }
        jggVar.getClass();
        yba ybaVar = (yba) jwj.f(jggVar, 0);
        if (ybaVar == null) {
            try {
                acaVar.c = true;
                Set set = mmj.b;
                synchronized (set) {
                }
                goj gojVar = new goj(this, set);
                if (goj.class.isMemberClass() && !Modifier.isStatic(goj.class.getModifiers())) {
                    throw new IllegalArgumentException("Object returned from onCreateLoader must not be a non-static inner member class: " + gojVar);
                }
                yba ybaVar2 = new yba(gojVar);
                jggVar.c(0, ybaVar2);
                acaVar.c = false;
                z5l z5lVar = new z5l(ybaVar2.l, xzdVar);
                ybaVar2.d(m4aVar, z5lVar);
                z5l z5lVar2 = ybaVar2.n;
                if (z5lVar2 != null) {
                    ybaVar2.h(z5lVar2);
                }
                ybaVar2.m = m4aVar;
                ybaVar2.n = z5lVar;
            } catch (Throwable th) {
                acaVar.c = false;
                throw th;
            }
        } else {
            z5l z5lVar3 = new z5l(ybaVar.l, xzdVar);
            ybaVar.d(m4aVar, z5lVar3);
            z5l z5lVar4 = ybaVar.n;
            if (z5lVar4 != null) {
                ybaVar.h(z5lVar4);
            }
            ybaVar.m = m4aVar;
            ybaVar.n = z5lVar3;
        }
        j0 = false;
    }

    public final void q(int i) {
        Status status = new Status(i, null, null, null);
        Intent intent = new Intent();
        intent.putExtra("googleSignInStatus", status);
        setResult(0, intent);
        finish();
        j0 = false;
    }
}
