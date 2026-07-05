package defpackage;

import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;

/* JADX INFO: loaded from: classes3.dex */
public final class noj extends BasePendingResult {
    public final /* synthetic */ int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public noj(mmj mmjVar, int i) {
        super(mmjVar);
        this.k = i;
        nyj nyjVar = idi.a;
        dgj.w("GoogleApiClient must not be null", mmjVar);
        dgj.w("Api must not be null", nyjVar);
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* bridge */ /* synthetic */ kre b(Status status) {
        int i = this.k;
        return status;
    }

    public final void h(ge0 ge0Var) {
        switch (this.k) {
            case 0:
                koj kojVar = (koj) ge0Var;
                qoj qojVar = (qoj) kojVar.t();
                moj mojVar = new moj(this, 0);
                GoogleSignInOptions googleSignInOptions = kojVar.d0;
                Parcel parcelD = qojVar.d();
                int i = hoj.a;
                parcelD.writeStrongBinder(mojVar);
                hoj.c(parcelD, googleSignInOptions);
                qojVar.D(parcelD, 102);
                break;
            default:
                koj kojVar2 = (koj) ge0Var;
                qoj qojVar2 = (qoj) kojVar2.t();
                moj mojVar2 = new moj(this, 1);
                GoogleSignInOptions googleSignInOptions2 = kojVar2.d0;
                Parcel parcelD2 = qojVar2.d();
                int i2 = hoj.a;
                parcelD2.writeStrongBinder(mojVar2);
                hoj.c(parcelD2, googleSignInOptions2);
                qojVar2.D(parcelD2, 103);
                break;
        }
    }

    public final void i(Status status) {
        dgj.n("Failed result must not be success", !status.l0());
        e(b(status));
    }
}
