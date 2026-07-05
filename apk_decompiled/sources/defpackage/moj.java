package defpackage;

import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes3.dex */
public final class moj extends rlj implements IInterface {
    public final /* synthetic */ int j;
    public final /* synthetic */ noj k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public moj(noj nojVar, int i) {
        super("com.google.android.gms.auth.api.signin.internal.ISignInCallbacks", 1);
        this.j = i;
        this.k = nojVar;
    }

    @Override // defpackage.rlj
    public final boolean E(int i, Parcel parcel, Parcel parcel2) {
        noj nojVar = this.k;
        int i2 = this.j;
        switch (i) {
            case 101:
                hoj.b(parcel);
                mr9.x();
                return false;
            case 102:
                Status status = (Status) hoj.a(parcel, Status.CREATOR);
                hoj.b(parcel);
                switch (i2) {
                    case 0:
                        nojVar.e(status);
                        break;
                    default:
                        throw new UnsupportedOperationException();
                }
                break;
            case 103:
                Status status2 = (Status) hoj.a(parcel, Status.CREATOR);
                hoj.b(parcel);
                switch (i2) {
                    case 1:
                        nojVar.e(status2);
                        break;
                    default:
                        throw new UnsupportedOperationException();
                }
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
