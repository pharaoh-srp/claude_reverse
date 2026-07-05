package defpackage;

import android.os.Parcel;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationResult;

/* JADX INFO: loaded from: classes3.dex */
public final class i6k extends rlj implements q5l {
    public static final /* synthetic */ int k = 0;
    public final t5k j;

    public i6k(t5k t5kVar) {
        super("com.google.android.gms.location.ILocationCallback", 4);
        this.j = t5kVar;
    }

    @Override // defpackage.rlj
    public final boolean G(Parcel parcel, int i) {
        t5k t5kVar = this.j;
        if (i == 1) {
            LocationResult locationResult = (LocationResult) zyj.a(parcel, LocationResult.CREATOR);
            zyj.c(parcel);
            t5kVar.zza().b(new xzd(29, locationResult));
            return true;
        }
        if (i != 2) {
            if (i != 3) {
                return false;
            }
            I();
            return true;
        }
        LocationAvailability locationAvailability = (LocationAvailability) zyj.a(parcel, LocationAvailability.CREATOR);
        zyj.c(parcel);
        t5kVar.zza().b(new fnf(22, locationAvailability));
        return true;
    }

    public final void H(fba fbaVar) {
        this.j.e(fbaVar);
    }

    public final void I() {
        this.j.zza().b(new c6k(this));
    }

    public final void J() {
        fba fbaVarZza = this.j.zza();
        fbaVarZza.b = null;
        fbaVarZza.c = null;
    }
}
