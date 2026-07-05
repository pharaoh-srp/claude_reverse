package defpackage;

import android.os.Parcel;
import android.os.RemoteException;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Map;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: loaded from: classes3.dex */
public final class c6k implements eba, pec, zdc, see, aik {
    public Object E;

    public /* synthetic */ c6k(Object obj) {
        this.E = obj;
    }

    @Override // defpackage.pec
    public void a() {
        try {
            a5l a5lVar = (a5l) ((kt8) this.E);
            Parcel parcelH = a5lVar.H();
            try {
                a5lVar.j.transact(2, parcelH, null, 1);
            } finally {
                parcelH.recycle();
            }
        } catch (RemoteException unused) {
        }
    }

    @Override // defpackage.see
    public void accept(Object obj, Object obj2) {
        yn3 yn3Var = (yn3) this.E;
        a99 a99Var = new a99(0, (j5h) obj2);
        vt8 vt8Var = (vt8) ((qv8) obj).t();
        hf0 hf0VarM = grk.m();
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken("com.google.android.gms.identitycredentials.internal.IIdentityCredentialService");
        int i = yyj.a;
        parcelObtain.writeStrongBinder(a99Var);
        yyj.b(parcelObtain, yn3Var);
        yyj.b(parcelObtain, hf0VarM);
        ((tt8) vt8Var).b(parcelObtain, 9);
    }

    public void b() {
        ArrayDeque arrayDeque = (ArrayDeque) this.E;
        if (arrayDeque.isEmpty()) {
            return;
        }
        throw new IOException("data item not completed, stackSize: " + arrayDeque.size() + " scope: " + f());
    }

    public void c(long j) {
        long jF = f();
        if (jF != j) {
            if (jF != -1) {
                if (jF != -2) {
                    return;
                } else {
                    jF = -2;
                }
            }
            StringBuilder sbW = grc.w(j, "expected non-string scope or scope ", " but found ");
            sbW.append(jF);
            throw new IOException(sbW.toString());
        }
    }

    @Override // defpackage.aik
    public void d(String str, int i, Throwable th, byte[] bArr, Map map) {
        ((o0l) this.E).E(str, i, th, bArr, map);
    }

    @Override // defpackage.eba
    public /* synthetic */ void e(Object obj) {
        ((i6k) this.E).j.l();
    }

    public long f() {
        ArrayDeque arrayDeque = (ArrayDeque) this.E;
        if (arrayDeque.isEmpty()) {
            return 0L;
        }
        return ((Long) arrayDeque.peek()).longValue();
    }

    @Override // defpackage.zdc
    public void onComplete(d5h d5hVar) {
        ((CountDownLatch) this.E).countDown();
    }
}
