package defpackage;

import android.os.IBinder;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class bmj implements IBinder.DeathRecipient {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ bmj(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.os.IBinder.DeathRecipient
    public final void binderDied() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                flj fljVar = (flj) obj;
                zlj zljVar = fljVar.b;
                zljVar.a("reportBinderDeath", new Object[0]);
                if (fljVar.j.get() != null) {
                    mr9.o();
                    return;
                }
                zljVar.a("%s : Binder has died.", fljVar.c);
                ArrayList arrayList = fljVar.d;
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((amj) it.next()).a(new RemoteException(String.valueOf(fljVar.c).concat(" : Binder has died.")));
                }
                arrayList.clear();
                synchronized (fljVar.f) {
                    HashSet hashSet = fljVar.e;
                    Iterator it2 = hashSet.iterator();
                    while (it2.hasNext()) {
                        ((j5h) it2.next()).c(new RemoteException(String.valueOf(fljVar.c).concat(" : Binder has died.")));
                    }
                    hashSet.clear();
                    break;
                }
                return;
            case 1:
                y0l y0lVar = (y0l) obj;
                bnh bnhVar = y0lVar.b;
                bnhVar.i("reportBinderDeath", new Object[0]);
                if (y0lVar.i.get() != null) {
                    mr9.o();
                    return;
                }
                bnhVar.i("%s : Binder has died.", y0lVar.c);
                ArrayList arrayList2 = y0lVar.d;
                Iterator it3 = arrayList2.iterator();
                while (it3.hasNext()) {
                    ((a7k) it3.next()).a(new RemoteException(String.valueOf(y0lVar.c).concat(" : Binder has died.")));
                }
                arrayList2.clear();
                synchronized (y0lVar.f) {
                    HashSet hashSet2 = y0lVar.e;
                    Iterator it4 = hashSet2.iterator();
                    while (it4.hasNext()) {
                        ((j5h) it4.next()).c(new RemoteException(String.valueOf(y0lVar.c).concat(" : Binder has died.")));
                    }
                    hashSet2.clear();
                    break;
                }
                return;
            case 2:
                s4l s4lVar = (s4l) obj;
                s4lVar.b.f("reportBinderDeath", new Object[0]);
                if (s4lVar.i.get() != null) {
                    mr9.o();
                    return;
                }
                s4lVar.b.f("%s : Binder has died.", s4lVar.c);
                for (brk brkVar : s4lVar.d) {
                    RemoteException remoteException = new RemoteException(String.valueOf(s4lVar.c).concat(" : Binder has died."));
                    j5h j5hVar = brkVar.E;
                    if (j5hVar != null) {
                        j5hVar.c(remoteException);
                    }
                }
                s4lVar.d.clear();
                synchronized (s4lVar.f) {
                    s4lVar.c();
                    break;
                }
                return;
            default:
                u5l u5lVar = (u5l) obj;
                u5lVar.b.c("reportBinderDeath", new Object[0]);
                if (u5lVar.i.get() != null) {
                    mr9.o();
                    return;
                }
                u5lVar.b.c("%s : Binder has died.", u5lVar.c);
                for (qzk qzkVar : u5lVar.d) {
                    RemoteException remoteException2 = new RemoteException(String.valueOf(u5lVar.c).concat(" : Binder has died."));
                    j5h j5hVar2 = qzkVar.E;
                    if (j5hVar2 != null) {
                        j5hVar2.c(remoteException2);
                    }
                }
                u5lVar.d.clear();
                synchronized (u5lVar.f) {
                    u5lVar.e();
                    break;
                }
                return;
        }
    }
}
