package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class bbk extends brk {
    public final /* synthetic */ int F = 0;
    public final /* synthetic */ Object G;
    public final /* synthetic */ Object H;

    public bbk(lj1 lj1Var, IBinder iBinder) {
        this.G = iBinder;
        this.H = lj1Var;
    }

    @Override // defpackage.brk
    public final void a() {
        HashMap map;
        cbk i3kVar = null;
        switch (this.F) {
            case 0:
                try {
                    enk enkVar = (enk) this.H;
                    cbk cbkVar = enkVar.a.m;
                    String str = enkVar.b;
                    Bundle bundle = new Bundle();
                    HashMap map2 = ark.a;
                    synchronized (ark.class) {
                        map = ark.a;
                        map.put("java", 20002);
                    }
                    bundle.putInt("playcore_version_code", ((Integer) map.get("java")).intValue());
                    if (map.containsKey("native")) {
                        bundle.putInt("playcore_native_version", ((Integer) map.get("native")).intValue());
                    }
                    if (map.containsKey("unity")) {
                        bundle.putInt("playcore_unity_version", ((Integer) map.get("unity")).intValue());
                    }
                    enk enkVar2 = (enk) this.H;
                    j5h j5hVar = (j5h) this.G;
                    String str2 = enkVar2.b;
                    pjk pjkVar = new pjk(enkVar2, j5hVar);
                    i3k i3kVar2 = (i3k) cbkVar;
                    i3kVar2.getClass();
                    Parcel parcelObtain = Parcel.obtain();
                    parcelObtain.writeInterfaceToken("com.google.android.play.core.inappreview.protocol.IInAppReviewService");
                    parcelObtain.writeString(str);
                    int i = syj.a;
                    parcelObtain.writeInt(1);
                    bundle.writeToParcel(parcelObtain, 0);
                    parcelObtain.writeStrongBinder(pjkVar);
                    try {
                        i3kVar2.i.transact(2, parcelObtain, null, 1);
                        parcelObtain.recycle();
                        return;
                    } catch (Throwable th) {
                        parcelObtain.recycle();
                        throw th;
                    }
                } catch (RemoteException e) {
                    enk enkVar3 = (enk) this.H;
                    zf zfVar = enk.c;
                    Object[] objArr = {enkVar3.b};
                    zfVar.getClass();
                    if (Log.isLoggable("PlayCore", 6)) {
                        Log.e("PlayCore", zf.h(zfVar.F, "error requesting in-app review for %s", objArr), e);
                    }
                    ((j5h) this.G).c(new RuntimeException(e));
                    return;
                }
            default:
                s4l s4lVar = (s4l) ((lj1) this.H).F;
                IBinder iBinder = (IBinder) this.G;
                int i2 = f7k.j;
                if (iBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.inappreview.protocol.IInAppReviewService");
                    i3kVar = iInterfaceQueryLocalInterface instanceof cbk ? (cbk) iInterfaceQueryLocalInterface : new i3k(iBinder);
                }
                s4lVar.m = i3kVar;
                zf zfVar2 = s4lVar.b;
                zfVar2.f("linkToDeath", new Object[0]);
                try {
                    s4lVar.m.asBinder().linkToDeath(s4lVar.j, 0);
                    break;
                } catch (RemoteException e2) {
                    Object[] objArr2 = new Object[0];
                    zfVar2.getClass();
                    if (Log.isLoggable("PlayCore", 6)) {
                        Log.e("PlayCore", zf.h(zfVar2.F, "linkToDeath failed", objArr2), e2);
                    }
                }
                s4lVar.g = false;
                Iterator it = s4lVar.d.iterator();
                while (it.hasNext()) {
                    ((Runnable) it.next()).run();
                }
                s4lVar.d.clear();
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bbk(enk enkVar, j5h j5hVar, j5h j5hVar2) {
        super(j5hVar);
        this.G = j5hVar2;
        this.H = enkVar;
    }
}
