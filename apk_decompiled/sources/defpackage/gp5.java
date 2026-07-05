package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class gp5 implements hba, gm4 {
    public final /* synthetic */ long E;
    public final /* synthetic */ int F;
    public final /* synthetic */ Object G;

    public /* synthetic */ gp5(kx kxVar, int i, long j, long j2) {
        this.G = kxVar;
        this.F = i;
        this.E = j;
    }

    @Override // defpackage.gm4
    public void accept(Object obj) {
        exg exgVar = (exg) this.G;
        hd5 hd5Var = (hd5) obj;
        exgVar.h.getClass();
        nz8 nz8Var = hd5Var.a;
        long j = hd5Var.c;
        ed5 ed5Var = new ed5(1);
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>(nz8Var.size());
        Iterator<E> it = nz8Var.iterator();
        while (it.hasNext()) {
            arrayList.add((Bundle) ed5Var.apply(it.next()));
        }
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("c", arrayList);
        bundle.putLong("d", j);
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeBundle(bundle);
        byte[] bArrMarshall = parcelObtain.marshall();
        parcelObtain.recycle();
        ssc sscVar = exgVar.c;
        sscVar.getClass();
        sscVar.K(bArrMarshall, bArrMarshall.length);
        exgVar.a.e(bArrMarshall.length, sscVar);
        long j2 = hd5Var.b;
        jw7 jw7Var = exgVar.h;
        long j3 = this.E;
        if (j2 == -9223372036854775807L) {
            fd9.M(jw7Var.t == Long.MAX_VALUE);
        } else {
            long j4 = jw7Var.t;
            j3 = j4 == Long.MAX_VALUE ? j3 + j2 : j2 + j4;
        }
        exgVar.a.a(j3, this.F | 1, bArrMarshall.length, 0, null);
    }

    @Override // defpackage.hba
    public void invoke(Object obj) {
        kx kxVar = (kx) this.G;
        q7b q7bVar = (q7b) obj;
        HashMap map = q7bVar.h;
        HashMap map2 = q7bVar.i;
        z7b z7bVar = kxVar.d;
        if (z7bVar != null) {
            String strC = q7bVar.c.c(kxVar.b, z7bVar);
            Long l = (Long) map2.get(strC);
            Long l2 = (Long) map.get(strC);
            map2.put(strC, Long.valueOf((l == null ? 0L : l.longValue()) + this.E));
            map.put(strC, Long.valueOf((l2 != null ? l2.longValue() : 0L) + ((long) this.F)));
        }
    }

    public /* synthetic */ gp5(exg exgVar, long j, int i) {
        this.G = exgVar;
        this.E = j;
        this.F = i;
    }
}
