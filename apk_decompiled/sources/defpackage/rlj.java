package defpackage;

import android.app.PendingIntent;
import android.os.BadParcelableException;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import android.os.RemoteException;
import android.util.Log;
import androidx.health.platform.client.proto.g;
import com.google.android.gms.common.api.Status;
import com.google.android.play.agesignals.AgeSignalsException;
import com.google.android.play.core.integrity.IntegrityServiceException;
import java.util.Date;

/* JADX INFO: loaded from: classes3.dex */
public abstract class rlj extends Binder implements IInterface {
    public final /* synthetic */ int i;

    public rlj(String str, int i) {
        this.i = i;
        switch (i) {
            case 2:
                attachInterface(this, str);
                break;
            case 3:
            case 6:
            case 8:
            case 9:
            default:
                attachInterface(this, str);
                break;
            case 4:
                attachInterface(this, str);
                break;
            case 5:
                attachInterface(this, str);
                break;
            case 7:
                attachInterface(this, str);
                break;
            case 10:
                attachInterface(this, str);
                break;
        }
    }

    public static void D(Parcel parcel) {
        int i = wyj.a;
        int iDataAvail = parcel.dataAvail();
        if (iDataAvail > 0) {
            throw new BadParcelableException(grc.p(iDataAvail, "Parcel data not fully consumed, unread size: "));
        }
    }

    public static void d(Parcel parcel) {
        int i = yyj.a;
        int iDataAvail = parcel.dataAvail();
        if (iDataAvail > 0) {
            throw new BadParcelableException(ij0.g(iDataAvail, "Parcel data not fully consumed, unread size: ", new StringBuilder(String.valueOf(iDataAvail).length() + 45)));
        }
    }

    public abstract boolean E(int i, Parcel parcel, Parcel parcel2);

    public abstract boolean F(int i, Parcel parcel, Parcel parcel2);

    public abstract boolean G(Parcel parcel, int i);

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        int i = this.i;
        return this;
    }

    public abstract boolean b(int i, Parcel parcel, Parcel parcel2);

    public abstract boolean c(Parcel parcel, int i);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        IntegrityServiceException integrityServiceException;
        boolean zOnTransact;
        yqk yqkVar;
        boolean zOnTransact2 = false;
        boolean zOnTransact3 = false;
        switch (this.i) {
            case 0:
                if (i <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i, parcel, parcel2, i2)) {
                    return true;
                }
                klj kljVar = (klj) this;
                if (i != 2) {
                    return false;
                }
                Parcelable.Creator creator = Bundle.CREATOR;
                int i3 = slj.a;
                Bundle bundle = (Bundle) (parcel.readInt() == 0 ? null : (Parcelable) creator.createFromParcel(parcel));
                int iDataAvail = parcel.dataAvail();
                if (iDataAvail > 0) {
                    throw new BadParcelableException(grc.p(iDataAvail, "Parcel data not fully consumed, unread size: "));
                }
                llj lljVar = kljVar.l;
                flj fljVar = lljVar.e;
                j5h j5hVar = kljVar.k;
                synchronized (fljVar.f) {
                    fljVar.e.remove(j5hVar);
                    break;
                }
                fljVar.a().post(new elj(fljVar));
                kljVar.j.a("onRequestIntegrityToken", new Object[0]);
                lljVar.d.getClass();
                int i4 = bundle.getInt("error");
                if (i4 == 0) {
                    integrityServiceException = null;
                } else {
                    bundle.getBoolean("is.error.remediable");
                    integrityServiceException = new IntegrityServiceException(i4, null);
                }
                if (integrityServiceException != null) {
                    j5hVar.c(integrityServiceException);
                    return true;
                }
                String string = bundle.getString("token");
                if (string == null) {
                    j5hVar.c(new IntegrityServiceException(-100, null));
                    return true;
                }
                bundle.getLong("request.token.sid");
                vb7.q("UID: [", "]  PID: [", Process.myUid(), Process.myPid(), "] ").concat("IntegrityDialogWrapper");
                j5hVar.d(new olj(string));
                return true;
            case 1:
                if (i <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i, parcel, parcel2, i2)) {
                    return true;
                }
                return E(i, parcel, parcel2);
            case 2:
                if (i > 16777215) {
                    zOnTransact2 = super.onTransact(i, parcel, parcel2, i2);
                } else {
                    parcel.enforceInterface(getInterfaceDescriptor());
                }
                if (zOnTransact2) {
                    return true;
                }
                return b(i, parcel, parcel2);
            case 3:
                if (i > 16777215) {
                    zOnTransact = super.onTransact(i, parcel, parcel2, i2);
                } else {
                    parcel.enforceInterface(getInterfaceDescriptor());
                    zOnTransact = false;
                }
                if (zOnTransact) {
                    return true;
                }
                a99 a99Var = (a99) this;
                switch (i) {
                    case 1:
                        Status status = (Status) yyj.a(parcel, Status.CREATOR);
                        gwc gwcVar = (gwc) yyj.a(parcel, gwc.CREATOR);
                        d(parcel);
                        int i5 = a99Var.j;
                        status.getClass();
                        switch (i5) {
                            case 1:
                                kkk.g(status, gwcVar, a99Var.k);
                                return true;
                            default:
                                throw new UnsupportedOperationException();
                        }
                    case 2:
                        Status status2 = (Status) yyj.a(parcel, Status.CREATOR);
                        d(parcel);
                        status2.getClass();
                        mr9.x();
                        break;
                    case 3:
                        Status status3 = (Status) yyj.a(parcel, Status.CREATOR);
                        d(parcel);
                        status3.getClass();
                        mr9.x();
                        break;
                    case 4:
                        Status status4 = (Status) yyj.a(parcel, Status.CREATOR);
                        d(parcel);
                        status4.getClass();
                        mr9.x();
                        break;
                    case 5:
                        Status status5 = (Status) yyj.a(parcel, Status.CREATOR);
                        d(parcel);
                        status5.getClass();
                        mr9.x();
                        break;
                    case 6:
                        Status status6 = (Status) yyj.a(parcel, Status.CREATOR);
                        d(parcel);
                        status6.getClass();
                        mr9.x();
                        break;
                    case 7:
                        Status status7 = (Status) yyj.a(parcel, Status.CREATOR);
                        d(parcel);
                        status7.getClass();
                        throw new UnsupportedOperationException();
                    case 8:
                        Status status8 = (Status) yyj.a(parcel, Status.CREATOR);
                        d(parcel);
                        status8.getClass();
                        mr9.x();
                        break;
                    case 9:
                        Status status9 = (Status) yyj.a(parcel, Status.CREATOR);
                        ao3 ao3Var = (ao3) yyj.a(parcel, ao3.CREATOR);
                        d(parcel);
                        int i6 = a99Var.j;
                        status9.getClass();
                        switch (i6) {
                            case 0:
                                kkk.g(status9, ao3Var, a99Var.k);
                                return true;
                            default:
                                throw new UnsupportedOperationException();
                        }
                    case 10:
                        Status status10 = (Status) yyj.a(parcel, Status.CREATOR);
                        d(parcel);
                        status10.getClass();
                        throw new UnsupportedOperationException();
                    case 11:
                        Status status11 = (Status) yyj.a(parcel, Status.CREATOR);
                        d(parcel);
                        status11.getClass();
                        mr9.x();
                        break;
                    case 12:
                        Status status12 = (Status) yyj.a(parcel, Status.CREATOR);
                        d(parcel);
                        status12.getClass();
                        mr9.x();
                        break;
                    case 13:
                        Status status13 = (Status) yyj.a(parcel, Status.CREATOR);
                        d(parcel);
                        status13.getClass();
                        mr9.x();
                        break;
                    case 14:
                        Status status14 = (Status) yyj.a(parcel, Status.CREATOR);
                        d(parcel);
                        status14.getClass();
                        mr9.x();
                        break;
                    case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                        Status status15 = (Status) yyj.a(parcel, Status.CREATOR);
                        d(parcel);
                        status15.getClass();
                        mr9.x();
                        break;
                }
                return false;
            case 4:
                if (i <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i, parcel, parcel2, i2)) {
                    return true;
                }
                return G(parcel, i);
            case 5:
                if (i <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i, parcel, parcel2, i2)) {
                    return true;
                }
                return F(i, parcel, parcel2);
            case 6:
                if (i <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i, parcel, parcel2, i2)) {
                    return true;
                }
                zak zakVar = (zak) this;
                bnh bnhVar = zakVar.j;
                j5h j5hVar2 = zakVar.k;
                cfk cfkVar = zakVar.l;
                if (i == 1) {
                    Parcelable.Creator creator2 = Bundle.CREATOR;
                    int i7 = kyj.a;
                    Bundle bundle2 = (Bundle) (parcel.readInt() == 0 ? null : (Parcelable) creator2.createFromParcel(parcel));
                    int iDataAvail2 = parcel.dataAvail();
                    if (iDataAvail2 > 0) {
                        throw new BadParcelableException(grc.p(iDataAvail2, "Parcel data not fully consumed, unread size: "));
                    }
                    cfkVar.b.c(j5hVar2);
                    bnhVar.i("onCompleteCheckAgeSignals", new Object[0]);
                    if (bundle2.containsKey("user.status")) {
                        yqkVar = new yqk(bundle2.containsKey("user.status") ? Integer.valueOf(bundle2.getInt("user.status")) : null, bundle2.containsKey("age.range.lower") ? Integer.valueOf(bundle2.getInt("age.range.lower")) : null, bundle2.containsKey("age.range.upper") ? Integer.valueOf(bundle2.getInt("age.range.upper")) : null, bundle2.containsKey("most.recent.approval.date") ? new Date(bundle2.getLong("most.recent.approval.date")) : null, bundle2.containsKey("install.id") ? bundle2.getString("install.id") : null);
                    } else {
                        yqkVar = new yqk(null, null, null, null, null);
                    }
                    j5hVar2.d(yqkVar);
                    return true;
                }
                if (i != 3) {
                    return false;
                }
                Parcelable.Creator creator3 = Bundle.CREATOR;
                int i8 = kyj.a;
                Bundle bundle3 = (Bundle) (parcel.readInt() != 0 ? (Parcelable) creator3.createFromParcel(parcel) : null);
                int iDataAvail3 = parcel.dataAvail();
                if (iDataAvail3 > 0) {
                    throw new BadParcelableException(grc.p(iDataAvail3, "Parcel data not fully consumed, unread size: "));
                }
                cfkVar.b.c(j5hVar2);
                int i9 = bundle3.getInt("error.code");
                Object[] objArr = {Integer.valueOf(i9)};
                bnhVar.getClass();
                if (Log.isLoggable("PlayCore", 6)) {
                    Log.e("PlayCore", bnh.k((String) bnhVar.F, "onError(%d)", objArr));
                }
                j5hVar2.c(new AgeSignalsException(i9));
                return true;
            case 7:
                if (i <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i, parcel, parcel2, i2)) {
                    return true;
                }
                return F(i, parcel, parcel2);
            case 8:
                if (i <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i, parcel, parcel2, i2)) {
                    return true;
                }
                u0l u0lVar = (u0l) this;
                if (i == 2) {
                    Parcelable.Creator creator4 = Bundle.CREATOR;
                    int i10 = qyj.a;
                    Bundle bundle4 = (Bundle) (parcel.readInt() != 0 ? (Parcelable) creator4.createFromParcel(parcel) : null);
                    int iDataAvail4 = parcel.dataAvail();
                    if (iDataAvail4 > 0) {
                        throw new BadParcelableException(grc.p(iDataAvail4, "Parcel data not fully consumed, unread size: "));
                    }
                    u0lVar.I(bundle4);
                    return true;
                }
                if (i != 3) {
                    return false;
                }
                Parcelable.Creator creator5 = Bundle.CREATOR;
                int i11 = qyj.a;
                Bundle bundle5 = (Bundle) (parcel.readInt() != 0 ? (Parcelable) creator5.createFromParcel(parcel) : null);
                int iDataAvail5 = parcel.dataAvail();
                if (iDataAvail5 > 0) {
                    throw new BadParcelableException(grc.p(iDataAvail5, "Parcel data not fully consumed, unread size: "));
                }
                u0lVar.H(bundle5);
                return true;
            case 9:
                if (i <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i, parcel, parcel2, i2)) {
                    return true;
                }
                pjk pjkVar = (pjk) this;
                if (i != 2) {
                    return false;
                }
                Parcelable.Creator creator6 = Bundle.CREATOR;
                int i12 = syj.a;
                Bundle bundle6 = (Bundle) (parcel.readInt() != 0 ? (Parcelable) creator6.createFromParcel(parcel) : null);
                int iDataAvail6 = parcel.dataAvail();
                if (iDataAvail6 > 0) {
                    throw new BadParcelableException(grc.p(iDataAvail6, "Parcel data not fully consumed, unread size: "));
                }
                s4l s4lVar = pjkVar.l.a;
                if (s4lVar != null) {
                    j5h j5hVar3 = pjkVar.k;
                    synchronized (s4lVar.f) {
                        s4lVar.e.remove(j5hVar3);
                        break;
                    }
                    s4lVar.a().post(new rzk(zOnTransact2 ? 1 : 0, s4lVar));
                }
                pjkVar.j.f("onGetLaunchReviewFlowInfo", new Object[0]);
                pjkVar.k.d(new bpj((PendingIntent) bundle6.get("confirmation_intent"), bundle6.getBoolean("is_review_no_op")));
                return true;
            default:
                if (i > 16777215) {
                    zOnTransact3 = super.onTransact(i, parcel, parcel2, i2);
                } else {
                    parcel.enforceInterface(getInterfaceDescriptor());
                }
                if (zOnTransact3) {
                    return true;
                }
                return c(parcel, i);
        }
    }

    public /* synthetic */ rlj(int i) {
        this.i = i;
    }
}
