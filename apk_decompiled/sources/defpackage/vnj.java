package defpackage;

import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes3.dex */
public final class vnj extends hmj implements IInterface {
    public final /* synthetic */ int j;
    public final /* synthetic */ j5h k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vnj(int i, j5h j5hVar) {
        super("com.google.android.gms.common.moduleinstall.internal.IModuleInstallCallbacks", 0);
        this.j = i;
        this.k = j5hVar;
    }

    @Override // defpackage.hmj
    public final boolean D(int i, Parcel parcel, Parcel parcel2) {
        j5h j5hVar = this.k;
        int i2 = this.j;
        if (i == 1) {
            Status status = (Status) rmj.a(parcel, Status.CREATOR);
            pqb pqbVar = (pqb) rmj.a(parcel, pqb.CREATOR);
            rmj.b(parcel);
            switch (i2) {
                case 0:
                    kkk.i(status, pqbVar, j5hVar);
                    return true;
                default:
                    throw new UnsupportedOperationException();
            }
        }
        if (i == 2) {
            Status status2 = (Status) rmj.a(parcel, Status.CREATOR);
            wqb wqbVar = (wqb) rmj.a(parcel, wqb.CREATOR);
            rmj.b(parcel);
            switch (i2) {
                case 1:
                    kkk.i(status2, wqbVar, j5hVar);
                    return true;
                default:
                    throw new UnsupportedOperationException();
            }
        }
        if (i == 3) {
            rmj.b(parcel);
            mr9.x();
            return false;
        }
        if (i != 4) {
            return false;
        }
        rmj.b(parcel);
        mr9.x();
        return false;
    }
}
