package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes3.dex */
public abstract class dmj implements IInterface {
    public final /* synthetic */ int i;
    public final IBinder j;
    public final String k;

    public /* synthetic */ dmj(IBinder iBinder, String str, int i) {
        this.i = i;
        this.j = iBinder;
        this.k = str;
    }

    public void D(Parcel parcel, int i) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            this.j.transact(i, parcel, parcelObtain, 0);
            parcelObtain.readException();
        } finally {
            parcel.recycle();
            parcelObtain.recycle();
        }
    }

    public Parcel E(Parcel parcel, int i) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                this.j.transact(i, parcel, parcelObtain, 0);
                parcelObtain.readException();
                return parcelObtain;
            } catch (RuntimeException e) {
                parcelObtain.recycle();
                throw e;
            }
        } finally {
            parcel.recycle();
        }
    }

    public Parcel F(Parcel parcel, int i) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                this.j.transact(i, parcel, parcelObtain, 0);
                parcelObtain.readException();
                return parcelObtain;
            } catch (RuntimeException e) {
                parcelObtain.recycle();
                throw e;
            }
        } finally {
            parcel.recycle();
        }
    }

    public void G(Parcel parcel, int i) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            this.j.transact(i, parcel, parcelObtain, 0);
            parcelObtain.readException();
        } finally {
            parcel.recycle();
            parcelObtain.recycle();
        }
    }

    public Parcel H() {
        int i = this.i;
        String str = this.k;
        switch (i) {
            case 2:
                Parcel parcelObtain = Parcel.obtain();
                parcelObtain.writeInterfaceToken(str);
                return parcelObtain;
            case 3:
                Parcel parcelObtain2 = Parcel.obtain();
                parcelObtain2.writeInterfaceToken(str);
                return parcelObtain2;
            default:
                Parcel parcelObtain3 = Parcel.obtain();
                parcelObtain3.writeInterfaceToken(str);
                return parcelObtain3;
        }
    }

    public Parcel I(Parcel parcel, int i) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                this.j.transact(i, parcel, parcelObtain, 0);
                parcelObtain.readException();
                return parcelObtain;
            } catch (RuntimeException e) {
                parcelObtain.recycle();
                throw e;
            }
        } finally {
            parcel.recycle();
        }
    }

    public Parcel J(Parcel parcel, int i) {
        int i2 = this.i;
        IBinder iBinder = this.j;
        switch (i2) {
            case 2:
                Parcel parcelObtain = Parcel.obtain();
                try {
                    try {
                        iBinder.transact(i, parcel, parcelObtain, 0);
                        parcelObtain.readException();
                        return parcelObtain;
                    } catch (RuntimeException e) {
                        parcelObtain.recycle();
                        throw e;
                    }
                } finally {
                }
            default:
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    try {
                        iBinder.transact(i, parcel, parcelObtain2, 0);
                        parcelObtain2.readException();
                        return parcelObtain2;
                    } catch (RuntimeException e2) {
                        parcelObtain2.recycle();
                        throw e2;
                    }
                } finally {
                }
        }
    }

    public void K(Parcel parcel, int i) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            this.j.transact(i, parcel, parcelObtain, 0);
            parcelObtain.readException();
        } finally {
            parcel.recycle();
            parcelObtain.recycle();
        }
    }

    public void L(Parcel parcel, int i) {
        Parcel parcelObtain;
        int i2 = this.i;
        IBinder iBinder = this.j;
        switch (i2) {
            case 2:
                parcelObtain = Parcel.obtain();
                try {
                    iBinder.transact(i, parcel, parcelObtain, 0);
                    parcelObtain.readException();
                    return;
                } finally {
                }
            case 3:
                parcelObtain = Parcel.obtain();
                try {
                    iBinder.transact(i, parcel, parcelObtain, 0);
                    parcelObtain.readException();
                    return;
                } finally {
                }
            default:
                parcelObtain = Parcel.obtain();
                try {
                    iBinder.transact(i, parcel, parcelObtain, 0);
                    parcelObtain.readException();
                    return;
                } finally {
                }
        }
    }

    public Parcel M() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.k);
        return parcelObtain;
    }

    public Parcel N(Parcel parcel, int i) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                this.j.transact(i, parcel, parcelObtain, 0);
                parcelObtain.readException();
                return parcelObtain;
            } catch (RuntimeException e) {
                parcelObtain.recycle();
                throw e;
            }
        } finally {
            parcel.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        int i = this.i;
        return this.j;
    }

    public Parcel b() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.k);
        return parcelObtain;
    }

    public void c(Parcel parcel, int i) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            this.j.transact(i, parcel, parcelObtain, 0);
            parcelObtain.readException();
        } finally {
            parcel.recycle();
            parcelObtain.recycle();
        }
    }

    public Parcel d() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.k);
        return parcelObtain;
    }
}
