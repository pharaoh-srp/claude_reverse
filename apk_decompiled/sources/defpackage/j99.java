package defpackage;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes3.dex */
public final class j99 extends rlj {
    public final /* synthetic */ int j;
    public final /* synthetic */ j5h k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j99(int i, j5h j5hVar) {
        super("com.google.android.gms.auth.blockstore.restorecredential.internal.IClearRestoreCredentialCallback", 10);
        this.j = i;
        switch (i) {
            case 1:
                this.k = j5hVar;
                super("com.google.android.gms.auth.blockstore.restorecredential.internal.IGetRestoreCredentialCallback", 10);
                break;
            default:
                this.k = j5hVar;
                break;
        }
    }

    @Override // defpackage.rlj
    public final boolean c(Parcel parcel, int i) {
        int i2 = this.j;
        j5h j5hVar = this.k;
        switch (i2) {
            case 0:
                if (i == 1) {
                    Status status = (Status) wyj.a(parcel, Status.CREATOR);
                    boolean z = parcel.readInt() != 0;
                    rlj.D(parcel);
                    status.getClass();
                    kkk.g(status, Boolean.valueOf(z), j5hVar);
                }
                break;
            default:
                if (i == 1) {
                    Status status2 = (Status) wyj.a(parcel, Status.CREATOR);
                    f48 f48Var = (f48) wyj.a(parcel, f48.CREATOR);
                    rlj.D(parcel);
                    status2.getClass();
                    f48Var.getClass();
                    kkk.g(status2, f48Var, j5hVar);
                }
                break;
        }
        return true;
    }
}
