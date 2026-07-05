package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.play.core.integrity.IntegrityServiceException;
import com.google.android.play.integrity.internal.af;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class jlj extends amj {
    public final /* synthetic */ byte[] F;
    public final /* synthetic */ Long G;
    public final /* synthetic */ j5h H;
    public final /* synthetic */ vlj I;
    public final /* synthetic */ llj J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jlj(llj lljVar, j5h j5hVar, byte[] bArr, Long l, j5h j5hVar2, vlj vljVar) {
        super(j5hVar);
        this.F = bArr;
        this.G = l;
        this.H = j5hVar2;
        this.I = vljVar;
        Objects.requireNonNull(lljVar);
        this.J = lljVar;
    }

    @Override // defpackage.amj
    public final void a(Exception exc) {
        if (exc instanceof af) {
            super.a(new IntegrityServiceException(-9, exc));
        } else {
            super.a(exc);
        }
    }

    @Override // defpackage.amj
    public final void b() {
        j5h j5hVar = this.H;
        llj lljVar = this.J;
        try {
            ylj yljVar = lljVar.e.n;
            Bundle bundleA = llj.a(lljVar, this.F, this.G);
            klj kljVar = new klj(lljVar, j5hVar);
            wlj wljVar = (wlj) yljVar;
            wljVar.getClass();
            Parcel parcelObtain = Parcel.obtain();
            parcelObtain.writeInterfaceToken("com.google.android.play.core.integrity.protocol.IIntegrityService");
            int i = slj.a;
            parcelObtain.writeInt(1);
            bundleA.writeToParcel(parcelObtain, 0);
            parcelObtain.writeStrongBinder(kljVar);
            try {
                wljVar.i.transact(2, parcelObtain, null, 1);
            } finally {
                parcelObtain.recycle();
            }
        } catch (RemoteException e) {
            zlj zljVar = lljVar.a;
            Object[] objArr = {this.I};
            zljVar.getClass();
            if (Log.isLoggable("PlayCore", 6)) {
                Log.e("PlayCore", zlj.c(zljVar.a, "requestIntegrityToken(%s)", objArr), e);
            }
            j5hVar.c(new IntegrityServiceException(-100, e));
        }
    }
}
