package defpackage;

import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes3.dex */
public final class p3k implements Parcelable {
    public static final Parcelable.Creator<p3k> CREATOR = new gqj(23);
    public final Messenger E;

    public p3k(IBinder iBinder) {
        this.E = new Messenger(iBinder);
    }

    public final void a(Message message) throws RemoteException {
        Messenger messenger = this.E;
        messenger.getClass();
        messenger.send(message);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            Messenger messenger = this.E;
            messenger.getClass();
            IBinder binder = messenger.getBinder();
            Messenger messenger2 = ((p3k) obj).E;
            messenger2.getClass();
            return binder.equals(messenger2.getBinder());
        } catch (ClassCastException unused) {
            return false;
        }
    }

    public final int hashCode() {
        Messenger messenger = this.E;
        messenger.getClass();
        return messenger.getBinder().hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Messenger messenger = this.E;
        messenger.getClass();
        parcel.writeStrongBinder(messenger.getBinder());
    }
}
