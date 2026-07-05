package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Binder;
import android.os.Looper;
import android.os.Parcel;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.RevocationBoundService;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import org.json.JSONException;

/* JADX INFO: loaded from: classes3.dex */
public final class aoj extends rlj {
    public final /* synthetic */ int j;
    public final Object k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aoj(int i, j5h j5hVar) {
        super("com.google.android.gms.auth.api.identity.internal.IBeginSignInCallback", 1);
        this.j = i;
        switch (i) {
            case 1:
                this.k = j5hVar;
                super("com.google.android.gms.auth.api.identity.internal.IGetSignInIntentCallback", 1);
                break;
            default:
                this.k = j5hVar;
                break;
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
    @Override // defpackage.rlj
    public final boolean E(int i, Parcel parcel, Parcel parcel2) throws JSONException {
        BasePendingResult basePendingResult;
        BasePendingResult basePendingResult2;
        String strD;
        int i2 = this.j;
        Object obj = this.k;
        switch (i2) {
            case 0:
                if (i != 1) {
                    return false;
                }
                Status status = (Status) hoj.a(parcel, Status.CREATOR);
                wh1 wh1Var = (wh1) hoj.a(parcel, wh1.CREATOR);
                hoj.b(parcel);
                kkk.g(status, wh1Var, (j5h) obj);
                return true;
            case 1:
                if (i != 1) {
                    return false;
                }
                Status status2 = (Status) hoj.a(parcel, Status.CREATOR);
                PendingIntent pendingIntent = (PendingIntent) hoj.a(parcel, PendingIntent.CREATOR);
                hoj.b(parcel);
                kkk.g(status2, pendingIntent, (j5h) obj);
                return true;
            default:
                RevocationBoundService revocationBoundService = (RevocationBoundService) obj;
                if (i != 1) {
                    if (i != 2) {
                        return false;
                    }
                    H();
                    poj.P(revocationBoundService).Q();
                    return true;
                }
                H();
                nog nogVarA = nog.a(revocationBoundService);
                GoogleSignInAccount googleSignInAccountB = nogVarA.b();
                GoogleSignInOptions googleSignInOptionsL0 = GoogleSignInOptions.O;
                if (googleSignInAccountB != null) {
                    String strD2 = nogVarA.d("defaultGoogleSignInAccount");
                    if (TextUtils.isEmpty(strD2) || (strD = nogVarA.d(nog.f("googleSignInOptions", strD2))) == null) {
                        googleSignInOptionsL0 = null;
                    } else {
                        try {
                            googleSignInOptionsL0 = GoogleSignInOptions.l0(strD);
                        } catch (JSONException unused) {
                            googleSignInOptionsL0 = null;
                        }
                    }
                }
                dgj.v(googleSignInOptionsL0);
                b99 b99Var = new b99(revocationBoundService, idi.a, googleSignInOptionsL0, new d88(new lja(13), Looper.getMainLooper()));
                int i3 = 27;
                Context context = b99Var.a;
                mmj mmjVar = b99Var.h;
                if (googleSignInAccountB == null) {
                    boolean z = b99Var.f() == 3;
                    s20 s20Var = ooj.a;
                    if (s20Var.E <= 3) {
                        ((String) s20Var.G).concat("Signing out");
                    }
                    ooj.a(context);
                    if (z) {
                        zmg zmgVar = new zmg(mmjVar);
                        zmgVar.e(Status.I);
                        basePendingResult = zmgVar;
                    } else {
                        noj nojVar = new noj(mmjVar, 0);
                        mmjVar.a(nojVar);
                        basePendingResult = nojVar;
                    }
                    basePendingResult.a(new fmj(basePendingResult, new j5h(), new zl4(i3)));
                    return true;
                }
                boolean z2 = b99Var.f() == 3;
                s20 s20Var2 = ooj.a;
                if (s20Var2.E <= 3) {
                    ((String) s20Var2.G).concat("Revoking access");
                }
                String strD3 = nog.a(context).d("refreshToken");
                ooj.a(context);
                if (!z2) {
                    noj nojVar2 = new noj(mmjVar, 1);
                    mmjVar.a(nojVar2);
                    basePendingResult2 = nojVar2;
                } else if (strD3 == null) {
                    s20 s20Var3 = foj.G;
                    Status status3 = new Status(4, null, null, null);
                    dgj.n("Status code must not be SUCCESS", !status3.l0());
                    lnj lnjVar = new lnj(status3);
                    lnjVar.e(status3);
                    basePendingResult2 = lnjVar;
                } else {
                    foj fojVar = new foj(strD3);
                    new Thread(fojVar).start();
                    basePendingResult2 = fojVar.F;
                }
                basePendingResult2.a(new fmj(basePendingResult2, new j5h(), new zl4(i3)));
                return true;
        }
    }

    public void H() {
        if (!oq5.H((RevocationBoundService) this.k, Binder.getCallingUid())) {
            throw new SecurityException(grc.u("Calling UID ", Binder.getCallingUid(), " is not Google Play services."));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aoj(RevocationBoundService revocationBoundService) {
        super("com.google.android.gms.auth.api.signin.internal.IRevocationService", 1);
        this.j = 2;
        this.k = revocationBoundService;
    }
}
