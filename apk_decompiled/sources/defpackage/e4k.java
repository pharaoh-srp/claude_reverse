package defpackage;

import android.location.Location;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes3.dex */
public final class e4k extends rlj {
    public final /* synthetic */ int j;
    public final /* synthetic */ j5h k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e4k(int i, j5h j5hVar) {
        super("com.google.android.gms.location.internal.ISettingsCallbacks", 4);
        this.j = i;
        switch (i) {
            case 1:
                this.k = j5hVar;
                super("com.google.android.gms.location.internal.ILocationStatusCallback", 4);
                break;
            default:
                this.k = j5hVar;
                break;
        }
    }

    @Override // defpackage.rlj
    public final boolean G(Parcel parcel, int i) {
        int i2 = this.j;
        j5h j5hVar = this.k;
        switch (i2) {
            case 0:
                if (i == 1) {
                    uea ueaVar = (uea) zyj.a(parcel, uea.CREATOR);
                    zyj.c(parcel);
                    kkk.g(ueaVar.E, new tea(), j5hVar);
                }
                break;
            default:
                if (i == 1) {
                    Status status = (Status) zyj.a(parcel, Status.CREATOR);
                    Location location = (Location) zyj.a(parcel, Location.CREATOR);
                    zyj.c(parcel);
                    kkk.g(status, location, j5hVar);
                }
                break;
        }
        return true;
    }
}
